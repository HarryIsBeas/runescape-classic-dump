// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 


public final class daj
{

    public daj(int ai[])
    {
        dam = new int[256];
        dal = new int[256];
        for(int i = 0; i < ai.length; i++)
            dal[i] = ai[i];

        dbe();
    }

    public final int dbc()
    {
        if(dak-- == 0)
        {
            dbd();
            dak = 255;
        }
        return dal[dak];
    }

    private final void dbd()
    {
        boolean flag = false;
        dba += ++dbb;
        for(int i = 0; i < 256; i++)
        {
            int j = dam[i];
            switch(i & 3)
            {
            case 0: // '\0'
                dan ^= dan << 13;
                break;

            case 1: // '\001'
                dan ^= dan >>> 6;
                break;

            case 2: // '\002'
                dan ^= dan << 2;
                break;

            case 3: // '\003'
                dan ^= dan >>> 16;
                break;
            }
            dan += dam[i + 128 & 0xff];
            int k;
            dam[i] = k = dam[(j & 0x3fc) >> 2] + dan + dba;
            dal[i] = dba = dam[(k >> 8 & 0x3fc) >> 2] + j;
        }

    }

    private final void dbe()
    {
        boolean flag = false;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l = i1 = j1 = k1 = l1 = i2 = j2 = k2 = 0x9e3779b9;
        for(int i = 0; i < 4; i++)
        {
            l ^= i1 << 11;
            k1 += l;
            i1 += j1;
            i1 ^= j1 >>> 2;
            l1 += i1;
            j1 += k1;
            j1 ^= k1 << 8;
            i2 += j1;
            k1 += l1;
            k1 ^= l1 >>> 16;
            j2 += k1;
            l1 += i2;
            l1 ^= i2 << 10;
            k2 += l1;
            i2 += j2;
            i2 ^= j2 >>> 4;
            l += i2;
            j2 += k2;
            j2 ^= k2 << 8;
            i1 += j2;
            k2 += l;
            k2 ^= l >>> 9;
            j1 += k2;
            l += i1;
        }

        for(int j = 0; j < 256; j += 8)
        {
            l += dal[j];
            i1 += dal[j + 1];
            j1 += dal[j + 2];
            k1 += dal[j + 3];
            l1 += dal[j + 4];
            i2 += dal[j + 5];
            j2 += dal[j + 6];
            k2 += dal[j + 7];
            l ^= i1 << 11;
            k1 += l;
            i1 += j1;
            i1 ^= j1 >>> 2;
            l1 += i1;
            j1 += k1;
            j1 ^= k1 << 8;
            i2 += j1;
            k1 += l1;
            k1 ^= l1 >>> 16;
            j2 += k1;
            l1 += i2;
            l1 ^= i2 << 10;
            k2 += l1;
            i2 += j2;
            i2 ^= j2 >>> 4;
            l += i2;
            j2 += k2;
            j2 ^= k2 << 8;
            i1 += j2;
            k2 += l;
            k2 ^= l >>> 9;
            j1 += k2;
            l += i1;
            dam[j] = l;
            dam[j + 1] = i1;
            dam[j + 2] = j1;
            dam[j + 3] = k1;
            dam[j + 4] = l1;
            dam[j + 5] = i2;
            dam[j + 6] = j2;
            dam[j + 7] = k2;
        }

        for(int k = 0; k < 256; k += 8)
        {
            l += dam[k];
            i1 += dam[k + 1];
            j1 += dam[k + 2];
            k1 += dam[k + 3];
            l1 += dam[k + 4];
            i2 += dam[k + 5];
            j2 += dam[k + 6];
            k2 += dam[k + 7];
            l ^= i1 << 11;
            k1 += l;
            i1 += j1;
            i1 ^= j1 >>> 2;
            l1 += i1;
            j1 += k1;
            j1 ^= k1 << 8;
            i2 += j1;
            k1 += l1;
            k1 ^= l1 >>> 16;
            j2 += k1;
            l1 += i2;
            l1 ^= i2 << 10;
            k2 += l1;
            i2 += j2;
            i2 ^= j2 >>> 4;
            l += i2;
            j2 += k2;
            j2 ^= k2 << 8;
            i1 += j2;
            k2 += l;
            k2 ^= l >>> 9;
            j1 += k2;
            l += i1;
            dam[k] = l;
            dam[k + 1] = i1;
            dam[k + 2] = j1;
            dam[k + 3] = k1;
            dam[k + 4] = l1;
            dam[k + 5] = i2;
            dam[k + 6] = j2;
            dam[k + 7] = k2;
        }

        dbd();
        dak = 256;
    }

    private int dak;
    private int dal[];
    private int dam[];
    private int dan;
    private int dba;
    private int dbb;
}
