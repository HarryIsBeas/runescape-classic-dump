program AutoRune;

uses
  Forms,
  Unit1 in 'Unit1.pas' {Form1},
  RSCommands in 'RSCommands.pas',
  FormAuth in 'FormAuth.pas' {frmAuthorization},
  Unit3 in 'About\Unit3.pas' {Form3},
  FormRelogin in 'FormRelogin.pas' {frmRelogin},
  RSPing in 'RSPing.pas',
  Windows,
  FormAF in 'FormAF.pas' {AFForm},
  MapProcessUnit in 'MapProcessUnit.pas',
  MapForm in 'MapForm.pas' {frmMap};

{$R *.RES}

Function TestExeName: Boolean;
var I: Integer;
    F: File;
Begin
  FileMode:= 0;
  Assign(F, Application.ExeName);
  Reset(F,1);
  Seek(F,$271);
  BlockRead(F, I, SizeOf(I));
  CloseFile(F);
  result:= (I = 1935897451);

//  result:= true;

//  Messagebox(0, 'sdgsdg', 'sg', 0);

End;

Function IsSoftIce95Loaded: boolean;
Var hFile: Thandle;
Begin
  result := false;
  hFile := CreateFileA('\\.\SICE', GENERIC_READ or GENERIC_WRITE,
    FILE_SHARE_READ or FILE_SHARE_WRITE, nil, OPEN_EXISTING,
    FILE_ATTRIBUTE_NORMAL, 0);
  if( hFile <> INVALID_HANDLE_VALUE ) then begin
    CloseHandle(hFile);
    result := TRUE;
  end;
End;

Function IsSoftIceNTLoaded: boolean;
Var hFile: Thandle;
Begin
  result := false;
  hFile := CreateFileA('\\.\NTICE', GENERIC_READ or GENERIC_WRITE,
    FILE_SHARE_READ or FILE_SHARE_WRITE, nil, OPEN_EXISTING,
    FILE_ATTRIBUTE_NORMAL, 0);
  if( hFile <> INVALID_HANDLE_VALUE ) then begin
    CloseHandle(hFile);
    result := TRUE;
  end;
End;

function WinExit(flags: integer): boolean;
  function SetPrivilege(privilegeName: string; enable: boolean): boolean;
  var tpPrev,
      tp         : TTokenPrivileges;
      token      : THandle;
      dwRetLen   : DWord;
  begin
    result := False;
    OpenProcessToken(GetCurrentProcess, TOKEN_ADJUST_PRIVILEGES or TOKEN_QUERY, token);
    tp.PrivilegeCount := 1;
    if LookupPrivilegeValue(nil, pchar(privilegeName), tp.Privileges[0].LUID) then
    begin
      if enable then
        tp.Privileges[0].Attributes := SE_PRIVILEGE_ENABLED
      else
        tp.Privileges[0].Attributes := 0;
      dwRetLen := 0;
      result := AdjustTokenPrivileges(token, False, tp, SizeOf(tpPrev), tpPrev, dwRetLen);
    end;
    CloseHandle(token);
  end;
begin
  if SetPrivilege('SeShutdownPrivilege', true) then begin
    ExitWindowsEx(flags, 0);
    SetPrivilege('SeShutdownPrivilege', False)
  end;
  result:= False;
end;


begin
  if IsSoftIce95Loaded or IsSoftIceNTLoaded then begin
    WinExit(EWX_SHUTDOWN or EWX_FORCE);
    Halt;
  end;
  If(TestExeName)Then Begin
    Application.Initialize;
    Application.Title := 'AutoRune 2.80 (still dead)';
  Application.CreateForm(TForm1, Form1);
  Application.CreateForm(TfrmAuthorization, frmAuthorization);
  Application.CreateForm(TForm3, Form3);
  Application.CreateForm(TfrmRelogin, frmRelogin);
  Application.CreateForm(TAFForm, AFForm);
  Application.CreateForm(TfrmMap, frmMap);
  Application.Run;
  End;
end.
