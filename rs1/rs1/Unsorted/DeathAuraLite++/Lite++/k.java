// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.Component;

public final class k extends j
{

    public k(int i, int l, int i1, Component component)
    {
        super(i, l, i1, component);
        boolean flag = false;
        if(flag)
            new j(i, l, i1, component);
    }

    public final void cdc(int i, int l, int i1, int j1, int k1, int l1, int i2)
    {
        if(k1 >= 50000)
        {
            dai.fba(i, l, i1, j1, k1 - 50000, l1, i2);
            return;
        }
        if(k1 >= 40000)
        {
            dai.fbi(i, l, i1, j1, k1 - 40000, l1, i2);
            return;
        }
        if(k1 >= 20000)
        {
            dai.fdd(i, l, i1, j1, k1 - 20000, l1, i2);
            return;
        }
        if(k1 >= 5000)
        {
            dai.emk(i, l, i1, j1, k1 - 5000, l1, i2);
            return;
        } else
        {
            super.ccc(i, l, i1, j1, k1);
            return;
        }
    }

    public mudclient dai;
}
