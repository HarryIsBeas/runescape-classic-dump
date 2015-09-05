/* deobfuscatorzed by saevion
 * 
 * <3 to:
 *  jakarta-BCEL    <http://jakarta.apache.org/bcel/index.html>
 *  jakarta-regexp  <http://jakarta.apache.org/regexp/index.html>
 *  jad             <http://kpdus.tripod.com/jad.html>
 */

import java.awt.*;
import java.awt.image.*;
import java.io.PrintStream;

public class j
    implements ImageProducer, ImageObserver
{

    public j(int arg0, int arg1, int arg2, Component arg3)
    {
        bnc = false;
        bnf = false;
        bma = arg3;
        bmn = arg1;
        bnb = arg0;
        blj = blg = arg0;
        blk = blh = arg1;
        bli = arg0 * arg1;
        blm = new int[arg0 * arg1];
        bmc = new int[arg2][];
        bml = new boolean[arg2];
        bmd = new byte[arg2][];
        bme = new int[arg2][];
        bmf = new int[arg2];
        bmg = new int[arg2];
        bmj = new int[arg2];
        bmk = new int[arg2];
        bmh = new int[arg2];
        bmi = new int[arg2];
        if(arg0 > 1 && arg1 > 1 && arg3 != null)
        {
            bll = new DirectColorModel(32, 0xff0000, 65280, 255);
            int i = blg * blh;
            for(int k = 0; k < i; k++)
                blm[k] = 0;

            bmb = arg3.createImage(this);
            cag();
            arg3.prepareImage(bmb, arg3);
            cag();
            arg3.prepareImage(bmb, arg3);
            cag();
            arg3.prepareImage(bmb, arg3);
        }
    }

    public synchronized void addConsumer(ImageConsumer imageconsumer)
    {
        bln = imageconsumer;
        imageconsumer.setDimensions(blg, blh);
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(bll);
        imageconsumer.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer imageconsumer)
    {
        return bln == imageconsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageconsumer)
    {
        if(bln == imageconsumer)
            bln = null;
    }

    public void startProduction(ImageConsumer imageconsumer)
    {
        addConsumer(imageconsumer);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer)
    {
        System.out.println("TDLR");
    }

    public synchronized void cag()
    {
        if(bln == null)
        {
            return;
        } else
        {
            bln.setPixels(0, 0, blg, blh, bll, blm, 0, blg);
            bln.imageComplete(2);
            return;
        }
    }

    public void cah(int i, int k, int l, int i1)
    {
        if(i < 0)
            i = 0;
        if(k < 0)
            k = 0;
        if(l > blg)
            l = blg;
        if(i1 > blh)
            i1 = blh;
        bna = i;
        bmm = k;
        bnb = l;
        bmn = i1;
    }

    public void cai()
    {
        bna = 0;
        bmm = 0;
        bnb = blg;
        bmn = blh;
    }

    public void caj(Graphics g, int i, int k)
    {
        cag();
        g.drawImage(bmb, i, k, this);
    }

    public void cak()
    {
        int i = blg * blh;
        if(!bnc)
        {
            for(int k = 0; k < i; k++)
                blm[k] = 0;

            return;
        }
        int l = 0;
        for(int i1 = -blh; i1 < 0; i1 += 2)
        {
            for(int j1 = -blg; j1 < 0; j1++)
                blm[l++] = 0;

            l += blg;
        }

    }

    public void cal(int arg0, int arg1, int arg2, int arg3, int arg4)
    {
        int i = 256 - arg4;
        int k = (arg3 >> 16 & 0xff) * arg4;
        int l = (arg3 >> 8 & 0xff) * arg4;
        int i1 = (arg3 & 0xff) * arg4;
        int i2 = arg1 - arg2;
        if(i2 < 0)
            i2 = 0;
        int j2 = arg1 + arg2;
        if(j2 >= blh)
            j2 = blh - 1;
        byte byte0 = 1;
        if(bnc)
        {
            byte0 = 2;
            if((i2 & 1) != 0)
                i2++;
        }
        for(int k2 = i2; k2 <= j2; k2 += byte0)
        {
            int l2 = k2 - arg1;
            int i3 = (int)Math.sqrt(arg2 * arg2 - l2 * l2);
            int j3 = arg0 - i3;
            if(j3 < 0)
                j3 = 0;
            int k3 = arg0 + i3;
            if(k3 >= blg)
                k3 = blg - 1;
            int l3 = j3 + k2 * blg;
            for(int i4 = j3; i4 <= k3; i4++)
            {
                int j1 = (blm[l3] >> 16 & 0xff) * i;
                int k1 = (blm[l3] >> 8 & 0xff) * i;
                int l1 = (blm[l3] & 0xff) * i;
                int j4 = ((k + j1 >> 8) << 16) + ((l + k1 >> 8) << 8) + (i1 + l1 >> 8);
                blm[l3++] = j4;
            }

        }

    }

    public void cam(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
    {
        if(arg0 < bna)
        {
            arg2 -= bna - arg0;
            arg0 = bna;
        }
        if(arg1 < bmm)
        {
            arg3 -= bmm - arg1;
            arg1 = bmm;
        }
        if(arg0 + arg2 > bnb)
            arg2 = bnb - arg0;
        if(arg1 + arg3 > bmn)
            arg3 = bmn - arg1;
        int i = 256 - arg5;
        int k = (arg4 >> 16 & 0xff) * arg5;
        int l = (arg4 >> 8 & 0xff) * arg5;
        int i1 = (arg4 & 0xff) * arg5;
        int i2 = blg - arg2;
        byte byte0 = 1;
        if(bnc)
        {
            byte0 = 2;
            i2 += blg;
            if((arg1 & 1) != 0)
            {
                arg1++;
                arg3--;
            }
        }
        int j2 = arg0 + arg1 * blg;
        for(int k2 = 0; k2 < arg3; k2 += byte0)
        {
            for(int l2 = -arg2; l2 < 0; l2++)
            {
                int j1 = (blm[j2] >> 16 & 0xff) * i;
                int k1 = (blm[j2] >> 8 & 0xff) * i;
                int l1 = (blm[j2] & 0xff) * i;
                int i3 = ((k + j1 >> 8) << 16) + ((l + k1 >> 8) << 8) + (i1 + l1 >> 8);
                blm[j2++] = i3;
            }

            j2 += i2;
        }

    }

    public void can(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
    {
        if(arg0 < bna)
        {
            arg2 -= bna - arg0;
            arg0 = bna;
        }
        if(arg0 + arg2 > bnb)
            arg2 = bnb - arg0;
        int i = arg5 >> 16 & 0xff;
        int k = arg5 >> 8 & 0xff;
        int l = arg5 & 0xff;
        int i1 = arg4 >> 16 & 0xff;
        int j1 = arg4 >> 8 & 0xff;
        int k1 = arg4 & 0xff;
        int l1 = blg - arg2;
        byte byte0 = 1;
        if(bnc)
        {
            byte0 = 2;
            l1 += blg;
            if((arg1 & 1) != 0)
            {
                arg1++;
                arg3--;
            }
        }
        int i2 = arg0 + arg1 * blg;
        for(int j2 = 0; j2 < arg3; j2 += byte0)
            if(j2 + arg1 >= bmm && j2 + arg1 < bmn)
            {
                int k2 = ((i * j2 + i1 * (arg3 - j2)) / arg3 << 16) + ((k * j2 + j1 * (arg3 - j2)) / arg3 << 8) + (l * j2 + k1 * (arg3 - j2)) / arg3;
                for(int l2 = -arg2; l2 < 0; l2++)
                    blm[i2++] = k2;

                i2 += l1;
            } else
            {
                i2 += blg;
            }

    }

    public void cba(int arg0, int arg1, int arg2, int arg3, int arg4)
    {
        if(arg0 < bna)
        {
            arg2 -= bna - arg0;
            arg0 = bna;
        }
        if(arg1 < bmm)
        {
            arg3 -= bmm - arg1;
            arg1 = bmm;
        }
        if(arg0 + arg2 > bnb)
            arg2 = bnb - arg0;
        if(arg1 + arg3 > bmn)
            arg3 = bmn - arg1;
        int i = blg - arg2;
        byte byte0 = 1;
        if(bnc)
        {
            byte0 = 2;
            i += blg;
            if((arg1 & 1) != 0)
            {
                arg1++;
                arg3--;
            }
        }
        int k = arg0 + arg1 * blg;
        for(int l = -arg3; l < 0; l += byte0)
        {
            for(int i1 = -arg2; i1 < 0; i1++)
                blm[k++] = arg4;

            k += i;
        }

    }

    public void cbb(int i, int k, int l, int i1, int j1)
    {
        cbc(i, k, l, j1);
        cbc(i, (k + i1) - 1, l, j1);
        cbd(i, k, i1, j1);
        cbd((i + l) - 1, k, i1, j1);
    }

    public void cbc(int arg0, int arg1, int arg2, int arg3)
    {
        if(arg1 < bmm || arg1 >= bmn)
            return;
        if(arg0 < bna)
        {
            arg2 -= bna - arg0;
            arg0 = bna;
        }
        if(arg0 + arg2 > bnb)
            arg2 = bnb - arg0;
        int i = arg0 + arg1 * blg;
        for(int k = 0; k < arg2; k++)
            blm[i + k] = arg3;

    }

    public void cbd(int arg0, int arg1, int arg2, int arg3)
    {
        if(arg0 < bna || arg0 >= bnb)
            return;
        if(arg1 < bmm)
        {
            arg2 -= bmm - arg1;
            arg1 = bmm;
        }
        if(arg1 + arg2 > bnb)
            arg2 = bmn - arg1;
        int i = arg0 + arg1 * blg;
        for(int k = 0; k < arg2; k++)
            blm[i + k * blg] = arg3;

    }

    public void cbe(int i, int k, int l)
    {
        if(i < bna || k < bmm || i >= bnb || k >= bmn)
        {
            return;
        } else
        {
            blm[i + k * blg] = l;
            return;
        }
    }

    public void cbf()
    {
        int l = blg * blh;
        for(int k = 0; k < l; k++)
        {
            int i = blm[k] & 0xffffff;
            blm[k] = (i >>> 1 & 0x7f7f7f) + (i >>> 2 & 0x3f3f3f) + (i >>> 3 & 0x1f1f1f) + (i >>> 4 & 0xf0f0f);
        }

    }

    public void cbg(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
    {
        for(int i = arg2; i < arg2 + arg4; i++)
        {
            for(int k = arg3; k < arg3 + arg5; k++)
            {
                int l = 0;
                int i1 = 0;
                int j1 = 0;
                int k1 = 0;
                for(int l1 = i - arg0; l1 <= i + arg0; l1++)
                    if(l1 >= 0 && l1 < blg)
                    {
                        for(int i2 = k - arg1; i2 <= k + arg1; i2++)
                            if(i2 >= 0 && i2 < blh)
                            {
                                int j2 = blm[l1 + blg * i2];
                                l += j2 >> 16 & 0xff;
                                i1 += j2 >> 8 & 0xff;
                                j1 += j2 & 0xff;
                                k1++;
                            }

                    }

                blm[i + blg * k] = (l / k1 << 16) + (i1 / k1 << 8) + j1 / k1;
            }

        }

    }

    public static int cbh(int i, int k, int l)
    {
        return (i << 16) + (k << 8) + l;
    }

    public void cbi()
    {
        for(int i = 0; i < bmc.length; i++)
        {
            bmc[i] = null;
            bmf[i] = 0;
            bmg[i] = 0;
            bmd[i] = null;
            bme[i] = null;
        }

    }

    public void cbj(int arg0, byte arg1[], byte arg2[], int arg3)
    {
        int i = t.fmi(arg1, 0);
        int k = t.fmi(arg2, i);
        i += 2;
        int l = t.fmi(arg2, i);
        i += 2;
        int i1 = arg2[i++] & 0xff;
        int ai[] = new int[i1];
        ai[0] = 0xff00ff;
        for(int j1 = 0; j1 < i1 - 1; j1++)
        {
            ai[j1 + 1] = ((arg2[i] & 0xff) << 16) + ((arg2[i + 1] & 0xff) << 8) + (arg2[i + 2] & 0xff);
            i += 3;
        }

        int k1 = 2;
        for(int l1 = arg0; l1 < arg0 + arg3; l1++)
        {
            bmh[l1] = arg2[i++] & 0xff;
            bmi[l1] = arg2[i++] & 0xff;
            bmf[l1] = t.fmi(arg2, i);
            i += 2;
            bmg[l1] = t.fmi(arg2, i);
            i += 2;
            int i2 = arg2[i++] & 0xff;
            int j2 = bmf[l1] * bmg[l1];
            bmd[l1] = new byte[j2];
            bme[l1] = ai;
            bmj[l1] = k;
            bmk[l1] = l;
            bmc[l1] = null;
            bml[l1] = false;
            if(bmh[l1] != 0 || bmi[l1] != 0)
                bml[l1] = true;
            if(i2 == 0)
            {
                for(int k2 = 0; k2 < j2; k2++)
                {
                    bmd[l1][k2] = arg1[k1++];
                    if(bmd[l1][k2] == 0)
                        bml[l1] = true;
                }

            } else
            if(i2 == 1)
            {
                for(int l2 = 0; l2 < bmf[l1]; l2++)
                {
                    for(int i3 = 0; i3 < bmg[l1]; i3++)
                    {
                        bmd[l1][l2 + i3 * bmf[l1]] = arg1[k1++];
                        if(bmd[l1][l2 + i3 * bmf[l1]] == 0)
                            bml[l1] = true;
                    }

                }

            }
        }

    }

    public void cbk(int arg0, byte arg1[])
    {
        int ai[] = bmc[arg0] = new int[10200];
        bmf[arg0] = 255;
        bmg[arg0] = 40;
        bmh[arg0] = 0;
        bmi[arg0] = 0;
        bmj[arg0] = 255;
        bmk[arg0] = 40;
        bml[arg0] = false;
        int i = 0;
        int k = 1;
        int l;
        for(l = 0; l < 255;)
        {
            int i1 = arg1[k++] & 0xff;
            for(int k1 = 0; k1 < i1; k1++)
                ai[l++] = i;

            i = 0xffffff - i;
        }

        for(int j1 = 1; j1 < 40; j1++)
        {
            for(int l1 = 0; l1 < 255;)
            {
                int i2 = arg1[k++] & 0xff;
                for(int j2 = 0; j2 < i2; j2++)
                {
                    ai[l] = ai[l - 255];
                    l++;
                    l1++;
                }

                if(l1 < 255)
                {
                    ai[l] = 0xffffff - ai[l - 255];
                    l++;
                    l1++;
                }
            }

        }

    }

    public void cbl(int arg0)
    {
        int i = bmf[arg0] * bmg[arg0];
        int ai[] = bmc[arg0];
        int ai1[] = new int[32768];
        for(int k = 0; k < i; k++)
        {
            int l = ai[k];
            ai1[((l & 0xf80000) >> 9) + ((l & 0xf800) >> 6) + ((l & 0xf8) >> 3)]++;
        }

        int ai2[] = new int[256];
        ai2[0] = 0xff00ff;
        int ai3[] = new int[256];
        for(int i1 = 0; i1 < 32768; i1++)
        {
            int j1 = ai1[i1];
            if(j1 > ai3[255])
            {
                for(int k1 = 1; k1 < 256; k1++)
                {
                    if(j1 <= ai3[k1])
                        continue;
                    for(int i2 = 255; i2 > k1; i2--)
                    {
                        ai2[i2] = ai2[i2 - 1];
                        ai3[i2] = ai3[i2 - 1];
                    }

                    ai2[k1] = ((i1 & 0x7c00) << 9) + ((i1 & 0x3e0) << 6) + ((i1 & 0x1f) << 3) + 0x40404;
                    ai3[k1] = j1;
                    break;
                }

            }
            ai1[i1] = -1;
        }

        byte abyte0[] = new byte[i];
        for(int l1 = 0; l1 < i; l1++)
        {
            int j2 = ai[l1];
            int k2 = ((j2 & 0xf80000) >> 9) + ((j2 & 0xf800) >> 6) + ((j2 & 0xf8) >> 3);
            int l2 = ai1[k2];
            if(l2 == -1)
            {
                int i3 = 0x3b9ac9ff;
                int j3 = j2 >> 16 & 0xff;
                int k3 = j2 >> 8 & 0xff;
                int l3 = j2 & 0xff;
                for(int i4 = 0; i4 < 256; i4++)
                {
                    int j4 = ai2[i4];
                    int k4 = j4 >> 16 & 0xff;
                    int l4 = j4 >> 8 & 0xff;
                    int i5 = j4 & 0xff;
                    int j5 = (j3 - k4) * (j3 - k4) + (k3 - l4) * (k3 - l4) + (l3 - i5) * (l3 - i5);
                    if(j5 < i3)
                    {
                        i3 = j5;
                        l2 = i4;
                    }
                }

                ai1[k2] = l2;
            }
            abyte0[l1] = (byte)l2;
        }

        bmd[arg0] = abyte0;
        bme[arg0] = ai2;
        bmc[arg0] = null;
    }

    public void cbm(int arg0)
    {
        if(bmd[arg0] == null)
            return;
        int i = bmf[arg0] * bmg[arg0];
        byte abyte0[] = bmd[arg0];
        int ai[] = bme[arg0];
        int ai1[] = new int[i];
        for(int k = 0; k < i; k++)
        {
            int l = ai[abyte0[k] & 0xff];
            if(l == 0)
                l = 1;
            else
            if(l == 0xff00ff)
                l = 0;
            ai1[k] = l;
        }

        bmc[arg0] = ai1;
        bmd[arg0] = null;
        bme[arg0] = null;
    }

    public void cbn(int arg0, int arg1, int arg2, int arg3, int arg4)
    {
        bmf[arg0] = arg3;
        bmg[arg0] = arg4;
        bml[arg0] = false;
        bmh[arg0] = 0;
        bmi[arg0] = 0;
        bmj[arg0] = arg3;
        bmk[arg0] = arg4;
        int i = arg3 * arg4;
        int k = 0;
        bmc[arg0] = new int[i];
        for(int l = arg1; l < arg1 + arg3; l++)
        {
            for(int i1 = arg2; i1 < arg2 + arg4; i1++)
                bmc[arg0][k++] = blm[l + i1 * blg];

        }

    }

    public void cca(int arg0, int arg1, int arg2, int arg3, int arg4)
    {
        bmf[arg0] = arg3;
        bmg[arg0] = arg4;
        bml[arg0] = false;
        bmh[arg0] = 0;
        bmi[arg0] = 0;
        bmj[arg0] = arg3;
        bmk[arg0] = arg4;
        int i = arg3 * arg4;
        int k = 0;
        bmc[arg0] = new int[i];
        for(int l = arg2; l < arg2 + arg4; l++)
        {
            for(int i1 = arg1; i1 < arg1 + arg3; i1++)
                bmc[arg0][k++] = blm[i1 + l * blg];

        }

    }

    public void ccb(int i, int k, int l)
    {
        if(bml[l])
        {
            i += bmh[l];
            k += bmi[l];
        }
        int i1 = i + k * blg;
        int j1 = 0;
        int k1 = bmg[l];
        int l1 = bmf[l];
        int i2 = blg - l1;
        int j2 = 0;
        if(k < bmm)
        {
            int k2 = bmm - k;
            k1 -= k2;
            k = bmm;
            j1 += k2 * l1;
            i1 += k2 * blg;
        }
        if(k + k1 >= bmn)
            k1 -= ((k + k1) - bmn) + 1;
        if(i < bna)
        {
            int l2 = bna - i;
            l1 -= l2;
            i = bna;
            j1 += l2;
            i1 += l2;
            j2 += l2;
            i2 += l2;
        }
        if(i + l1 >= bnb)
        {
            int i3 = ((i + l1) - bnb) + 1;
            l1 -= i3;
            j2 += i3;
            i2 += i3;
        }
        if(l1 <= 0 || k1 <= 0)
            return;
        byte byte0 = 1;
        if(bnc)
        {
            byte0 = 2;
            i2 += blg;
            j2 += bmf[l];
            if((k & 1) != 0)
            {
                i1 += blg;
                k1--;
            }
        }
        if(bmc[l] == null)
        {
            cch(blm, bmd[l], bme[l], j1, i1, l1, k1, i2, j2, byte0);
            return;
        } else
        {
            ccg(blm, bmc[l], 0, j1, i1, l1, k1, i2, j2, byte0);
            return;
        }
    }

    public void ccc(int i, int k, int l, int i1, int j1)
    {
        try
        {
            int k1 = bmf[j1];
            int l1 = bmg[j1];
            int i2 = 0;
            int j2 = 0;
            int k2 = (k1 << 16) / l;
            int l2 = (l1 << 16) / i1;
            if(bml[j1])
            {
                int i3 = bmj[j1];
                int k3 = bmk[j1];
                k2 = (i3 << 16) / l;
                l2 = (k3 << 16) / i1;
                i += ((bmh[j1] * l + i3) - 1) / i3;
                k += ((bmi[j1] * i1 + k3) - 1) / k3;
                if((bmh[j1] * l) % i3 != 0)
                    i2 = (i3 - (bmh[j1] * l) % i3 << 16) / l;
                if((bmi[j1] * i1) % k3 != 0)
                    j2 = (k3 - (bmi[j1] * i1) % k3 << 16) / i1;
                l = (l * (bmf[j1] - (i2 >> 16))) / i3;
                i1 = (i1 * (bmg[j1] - (j2 >> 16))) / k3;
            }
            int j3 = i + k * blg;
            int l3 = blg - l;
            if(k < bmm)
            {
                int i4 = bmm - k;
                i1 -= i4;
                k = 0;
                j3 += i4 * blg;
                j2 += l2 * i4;
            }
            if(k + i1 >= bmn)
                i1 -= ((k + i1) - bmn) + 1;
            if(i < bna)
            {
                int j4 = bna - i;
                l -= j4;
                i = 0;
                j3 += j4;
                i2 += k2 * j4;
                l3 += j4;
            }
            if(i + l >= bnb)
            {
                int k4 = ((i + l) - bnb) + 1;
                l -= k4;
                l3 += k4;
            }
            byte byte0 = 1;
            if(bnc)
            {
                byte0 = 2;
                l3 += blg;
                l2 += l2;
                if((k & 1) != 0)
                {
                    j3 += blg;
                    i1--;
                }
            }
            cci(blm, bmc[j1], 0, i2, j2, j3, l3, l, i1, k2, l2, k1, byte0);
            return;
        }
        catch(Exception _ex)
        {
            System.out.println("error in sprite clipping routine");
        }
    }

    public void ccd(int i, int k, int l, int i1)
    {
        if(bml[l])
        {
            i += bmh[l];
            k += bmi[l];
        }
        int j1 = i + k * blg;
        int k1 = 0;
        int l1 = bmg[l];
        int i2 = bmf[l];
        int j2 = blg - i2;
        int k2 = 0;
        if(k < bmm)
        {
            int l2 = bmm - k;
            l1 -= l2;
            k = bmm;
            k1 += l2 * i2;
            j1 += l2 * blg;
        }
        if(k + l1 >= bmn)
            l1 -= ((k + l1) - bmn) + 1;
        if(i < bna)
        {
            int i3 = bna - i;
            i2 -= i3;
            i = bna;
            k1 += i3;
            j1 += i3;
            k2 += i3;
            j2 += i3;
        }
        if(i + i2 >= bnb)
        {
            int j3 = ((i + i2) - bnb) + 1;
            i2 -= j3;
            k2 += j3;
            j2 += j3;
        }
        if(i2 <= 0 || l1 <= 0)
            return;
        byte byte0 = 1;
        if(bnc)
        {
            byte0 = 2;
            j2 += blg;
            k2 += bmf[l];
            if((k & 1) != 0)
            {
                j1 += blg;
                l1--;
            }
        }
        if(bmc[l] == null)
        {
            cck(blm, bmd[l], bme[l], k1, j1, i2, l1, j2, k2, byte0, i1);
            return;
        } else
        {
            ccj(blm, bmc[l], 0, k1, j1, i2, l1, j2, k2, byte0, i1);
            return;
        }
    }

    public void cce(int i, int k, int l, int i1, int j1, int k1)
    {
        try
        {
            int l1 = bmf[j1];
            int i2 = bmg[j1];
            int j2 = 0;
            int k2 = 0;
            int l2 = (l1 << 16) / l;
            int i3 = (i2 << 16) / i1;
            if(bml[j1])
            {
                int j3 = bmj[j1];
                int l3 = bmk[j1];
                l2 = (j3 << 16) / l;
                i3 = (l3 << 16) / i1;
                i += ((bmh[j1] * l + j3) - 1) / j3;
                k += ((bmi[j1] * i1 + l3) - 1) / l3;
                if((bmh[j1] * l) % j3 != 0)
                    j2 = (j3 - (bmh[j1] * l) % j3 << 16) / l;
                if((bmi[j1] * i1) % l3 != 0)
                    k2 = (l3 - (bmi[j1] * i1) % l3 << 16) / i1;
                l = (l * (bmf[j1] - (j2 >> 16))) / j3;
                i1 = (i1 * (bmg[j1] - (k2 >> 16))) / l3;
            }
            int k3 = i + k * blg;
            int i4 = blg - l;
            if(k < bmm)
            {
                int j4 = bmm - k;
                i1 -= j4;
                k = 0;
                k3 += j4 * blg;
                k2 += i3 * j4;
            }
            if(k + i1 >= bmn)
                i1 -= ((k + i1) - bmn) + 1;
            if(i < bna)
            {
                int k4 = bna - i;
                l -= k4;
                i = 0;
                k3 += k4;
                j2 += l2 * k4;
                i4 += k4;
            }
            if(i + l >= bnb)
            {
                int l4 = ((i + l) - bnb) + 1;
                l -= l4;
                i4 += l4;
            }
            byte byte0 = 1;
            if(bnc)
            {
                byte0 = 2;
                i4 += blg;
                i3 += i3;
                if((k & 1) != 0)
                {
                    k3 += blg;
                    i1--;
                }
            }
            ccl(blm, bmc[j1], 0, j2, k2, k3, i4, l, i1, l2, i3, l1, byte0, k1);
            return;
        }
        catch(Exception _ex)
        {
            System.out.println("error in sprite clipping routine");
        }
    }

    public void ccf(int i, int k, int l, int i1, int j1, int k1)
    {
        try
        {
            int l1 = bmf[j1];
            int i2 = bmg[j1];
            int j2 = 0;
            int k2 = 0;
            int l2 = (l1 << 16) / l;
            int i3 = (i2 << 16) / i1;
            if(bml[j1])
            {
                int j3 = bmj[j1];
                int l3 = bmk[j1];
                l2 = (j3 << 16) / l;
                i3 = (l3 << 16) / i1;
                i += ((bmh[j1] * l + j3) - 1) / j3;
                k += ((bmi[j1] * i1 + l3) - 1) / l3;
                if((bmh[j1] * l) % j3 != 0)
                    j2 = (j3 - (bmh[j1] * l) % j3 << 16) / l;
                if((bmi[j1] * i1) % l3 != 0)
                    k2 = (l3 - (bmi[j1] * i1) % l3 << 16) / i1;
                l = (l * (bmf[j1] - (j2 >> 16))) / j3;
                i1 = (i1 * (bmg[j1] - (k2 >> 16))) / l3;
            }
            int k3 = i + k * blg;
            int i4 = blg - l;
            if(k < bmm)
            {
                int j4 = bmm - k;
                i1 -= j4;
                k = 0;
                k3 += j4 * blg;
                k2 += i3 * j4;
            }
            if(k + i1 >= bmn)
                i1 -= ((k + i1) - bmn) + 1;
            if(i < bna)
            {
                int k4 = bna - i;
                l -= k4;
                i = 0;
                k3 += k4;
                j2 += l2 * k4;
                i4 += k4;
            }
            if(i + l >= bnb)
            {
                int l4 = ((i + l) - bnb) + 1;
                l -= l4;
                i4 += l4;
            }
            byte byte0 = 1;
            if(bnc)
            {
                byte0 = 2;
                i4 += blg;
                i3 += i3;
                if((k & 1) != 0)
                {
                    k3 += blg;
                    i1--;
                }
            }
            ccm(blm, bmc[j1], 0, j2, k2, k3, i4, l, i1, l2, i3, l1, byte0, k1);
            return;
        }
        catch(Exception _ex)
        {
            System.out.println("error in sprite clipping routine");
        }
    }

    private void ccg(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9)
    {
        int i = -(arg5 >> 2);
        arg5 = -(arg5 & 3);
        for(int k = -arg6; k < 0; k += arg9)
        {
            for(int l = i; l < 0; l++)
            {
                arg2 = arg1[arg3++];
                if(arg2 != 0)
                    arg0[arg4++] = arg2;
                else
                    arg4++;
                arg2 = arg1[arg3++];
                if(arg2 != 0)
                    arg0[arg4++] = arg2;
                else
                    arg4++;
                arg2 = arg1[arg3++];
                if(arg2 != 0)
                    arg0[arg4++] = arg2;
                else
                    arg4++;
                arg2 = arg1[arg3++];
                if(arg2 != 0)
                    arg0[arg4++] = arg2;
                else
                    arg4++;
            }

            for(int i1 = arg5; i1 < 0; i1++)
            {
                arg2 = arg1[arg3++];
                if(arg2 != 0)
                    arg0[arg4++] = arg2;
                else
                    arg4++;
            }

            arg4 += arg7;
            arg3 += arg8;
        }

    }

    private void cch(int arg0[], byte arg1[], int arg2[], int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9)
    {
        int i = -(arg5 >> 2);
        arg5 = -(arg5 & 3);
        for(int k = -arg6; k < 0; k += arg9)
        {
            for(int l = i; l < 0; l++)
            {
                byte byte0 = arg1[arg3++];
                if(byte0 != 0)
                    arg0[arg4++] = arg2[byte0 & 0xff];
                else
                    arg4++;
                byte0 = arg1[arg3++];
                if(byte0 != 0)
                    arg0[arg4++] = arg2[byte0 & 0xff];
                else
                    arg4++;
                byte0 = arg1[arg3++];
                if(byte0 != 0)
                    arg0[arg4++] = arg2[byte0 & 0xff];
                else
                    arg4++;
                byte0 = arg1[arg3++];
                if(byte0 != 0)
                    arg0[arg4++] = arg2[byte0 & 0xff];
                else
                    arg4++;
            }

            for(int i1 = arg5; i1 < 0; i1++)
            {
                byte byte1 = arg1[arg3++];
                if(byte1 != 0)
                    arg0[arg4++] = arg2[byte1 & 0xff];
                else
                    arg4++;
            }

            arg4 += arg7;
            arg3 += arg8;
        }

    }

    private void cci(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9, int arg10, int arg11, int arg12)
    {
        try
        {
            int i = arg3;
            for(int k = -arg8; k < 0; k += arg12)
            {
                int l = (arg4 >> 16) * arg11;
                for(int i1 = -arg7; i1 < 0; i1++)
                {
                    arg2 = arg1[(arg3 >> 16) + l];
                    if(arg2 != 0)
                        arg0[arg5++] = arg2;
                    else
                        arg5++;
                    arg3 += arg9;
                }

                arg4 += arg10;
                arg3 = i;
                arg5 += arg6;
            }

            return;
        }
        catch(Exception _ex)
        {
            System.out.println("error in plot_scale");
        }
    }

    private void ccj(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9, int arg10)
    {
        int i = 256 - arg10;
        for(int k = -arg6; k < 0; k += arg9)
        {
            for(int l = -arg5; l < 0; l++)
            {
                arg2 = arg1[arg3++];
                if(arg2 != 0)
                {
                    int i1 = arg0[arg4];
                    arg0[arg4++] = ((arg2 & 0xff00ff) * arg10 + (i1 & 0xff00ff) * i & 0xff00ff00) + ((arg2 & 0xff00) * arg10 + (i1 & 0xff00) * i & 0xff0000) >> 8;
                } else
                {
                    arg4++;
                }
            }

            arg4 += arg7;
            arg3 += arg8;
        }

    }

    private void cck(int arg0[], byte arg1[], int arg2[], int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9, int arg10)
    {
        int i = 256 - arg10;
        for(int k = -arg6; k < 0; k += arg9)
        {
            for(int l = -arg5; l < 0; l++)
            {
                int i1 = arg1[arg3++];
                if(i1 != 0)
                {
                    i1 = arg2[i1 & 0xff];
                    int j1 = arg0[arg4];
                    arg0[arg4++] = ((i1 & 0xff00ff) * arg10 + (j1 & 0xff00ff) * i & 0xff00ff00) + ((i1 & 0xff00) * arg10 + (j1 & 0xff00) * i & 0xff0000) >> 8;
                } else
                {
                    arg4++;
                }
            }

            arg4 += arg7;
            arg3 += arg8;
        }

    }

    private void ccl(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13)
    {
        int i = 256 - arg13;
        try
        {
            int k = arg3;
            for(int l = -arg8; l < 0; l += arg12)
            {
                int i1 = (arg4 >> 16) * arg11;
                for(int j1 = -arg7; j1 < 0; j1++)
                {
                    arg2 = arg1[(arg3 >> 16) + i1];
                    if(arg2 != 0)
                    {
                        int k1 = arg0[arg5];
                        arg0[arg5++] = ((arg2 & 0xff00ff) * arg13 + (k1 & 0xff00ff) * i & 0xff00ff00) + ((arg2 & 0xff00) * arg13 + (k1 & 0xff00) * i & 0xff0000) >> 8;
                    } else
                    {
                        arg5++;
                    }
                    arg3 += arg9;
                }

                arg4 += arg10;
                arg3 = k;
                arg5 += arg6;
            }

            return;
        }
        catch(Exception _ex)
        {
            System.out.println("error in tran_scale");
        }
    }

    private void ccm(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13)
    {
        int i = arg13 >> 16 & 0xff;
        int k = arg13 >> 8 & 0xff;
        int l = arg13 & 0xff;
        try
        {
            int i1 = arg3;
            for(int j1 = -arg8; j1 < 0; j1 += arg12)
            {
                int k1 = (arg4 >> 16) * arg11;
                for(int l1 = -arg7; l1 < 0; l1++)
                {
                    arg2 = arg1[(arg3 >> 16) + k1];
                    if(arg2 != 0)
                    {
                        int i2 = arg2 >> 16 & 0xff;
                        int j2 = arg2 >> 8 & 0xff;
                        int k2 = arg2 & 0xff;
                        if(i2 == j2 && j2 == k2)
                            arg0[arg5++] = ((i2 * i >> 8) << 16) + ((j2 * k >> 8) << 8) + (k2 * l >> 8);
                        else
                            arg0[arg5++] = arg2;
                    } else
                    {
                        arg5++;
                    }
                    arg3 += arg9;
                }

                arg4 += arg10;
                arg3 = i1;
                arg5 += arg6;
            }

            return;
        }
        catch(Exception _ex)
        {
            System.out.println("error in plot_scale");
        }
    }

    public void ccn(int arg0, int arg1, int arg2, int arg3, int arg4)
    {
        int i = blg;
        int k = blh;
        if(bng == null)
        {
            bng = new int[512];
            for(int l = 0; l < 256; l++)
            {
                bng[l] = (int)(Math.sin((double)l * 0.02454369D) * 32768D);
                bng[l + 256] = (int)(Math.cos((double)l * 0.02454369D) * 32768D);
            }

        }
        int i1 = -bmj[arg2] / 2;
        int j1 = -bmk[arg2] / 2;
        if(bml[arg2])
        {
            i1 += bmh[arg2];
            j1 += bmi[arg2];
        }
        int k1 = i1 + bmf[arg2];
        int l1 = j1 + bmg[arg2];
        int i2 = k1;
        int j2 = j1;
        int k2 = i1;
        int l2 = l1;
        arg3 &= 0xff;
        int i3 = bng[arg3] * arg4;
        int j3 = bng[arg3 + 256] * arg4;
        int k3 = arg0 + (j1 * i3 + i1 * j3 >> 22);
        int l3 = arg1 + (j1 * j3 - i1 * i3 >> 22);
        int i4 = arg0 + (j2 * i3 + i2 * j3 >> 22);
        int j4 = arg1 + (j2 * j3 - i2 * i3 >> 22);
        int k4 = arg0 + (l1 * i3 + k1 * j3 >> 22);
        int l4 = arg1 + (l1 * j3 - k1 * i3 >> 22);
        int i5 = arg0 + (l2 * i3 + k2 * j3 >> 22);
        int j5 = arg1 + (l2 * j3 - k2 * i3 >> 22);
        if(arg4 == 192 && (arg3 & 0x3f) == (cab & 0x3f))
            bnn++;
        else
        if(arg4 == 128)
            cab = arg3;
        else
            caa++;
        int k5 = l3;
        int l5 = l3;
        if(j4 < k5)
            k5 = j4;
        else
        if(j4 > l5)
            l5 = j4;
        if(l4 < k5)
            k5 = l4;
        else
        if(l4 > l5)
            l5 = l4;
        if(j5 < k5)
            k5 = j5;
        else
        if(j5 > l5)
            l5 = j5;
        if(k5 < bmm)
            k5 = bmm;
        if(l5 > bmn)
            l5 = bmn;
        if(bnh == null || bnh.length != k + 1)
        {
            bnh = new int[k + 1];
            bni = new int[k + 1];
            bnj = new int[k + 1];
            bnk = new int[k + 1];
            bnl = new int[k + 1];
            bnm = new int[k + 1];
        }
        for(int i6 = k5; i6 <= l5; i6++)
        {
            bnh[i6] = 0x5f5e0ff;
            bni[i6] = 0xfa0a1f01;
        }

        int i7 = 0;
        int k7 = 0;
        int i8 = 0;
        int j8 = bmf[arg2];
        int k8 = bmg[arg2];
        i1 = 0;
        j1 = 0;
        i2 = j8 - 1;
        j2 = 0;
        k1 = j8 - 1;
        l1 = k8 - 1;
        k2 = 0;
        l2 = k8 - 1;
        if(j5 != l3)
        {
            i7 = (i5 - k3 << 8) / (j5 - l3);
            i8 = (l2 - j1 << 8) / (j5 - l3);
        }
        int j6;
        int k6;
        int l6;
        int l7;
        if(l3 > j5)
        {
            l6 = i5 << 8;
            l7 = l2 << 8;
            j6 = j5;
            k6 = l3;
        } else
        {
            l6 = k3 << 8;
            l7 = j1 << 8;
            j6 = l3;
            k6 = j5;
        }
        if(j6 < 0)
        {
            l6 -= i7 * j6;
            l7 -= i8 * j6;
            j6 = 0;
        }
        if(k6 > k - 1)
            k6 = k - 1;
        for(int l8 = j6; l8 <= k6; l8++)
        {
            bnh[l8] = bni[l8] = l6;
            l6 += i7;
            bnj[l8] = bnk[l8] = 0;
            bnl[l8] = bnm[l8] = l7;
            l7 += i8;
        }

        if(j4 != l3)
        {
            i7 = (i4 - k3 << 8) / (j4 - l3);
            k7 = (i2 - i1 << 8) / (j4 - l3);
        }
        int j7;
        if(l3 > j4)
        {
            l6 = i4 << 8;
            j7 = i2 << 8;
            j6 = j4;
            k6 = l3;
        } else
        {
            l6 = k3 << 8;
            j7 = i1 << 8;
            j6 = l3;
            k6 = j4;
        }
        if(j6 < 0)
        {
            l6 -= i7 * j6;
            j7 -= k7 * j6;
            j6 = 0;
        }
        if(k6 > k - 1)
            k6 = k - 1;
        for(int i9 = j6; i9 <= k6; i9++)
        {
            if(l6 < bnh[i9])
            {
                bnh[i9] = l6;
                bnj[i9] = j7;
                bnl[i9] = 0;
            }
            if(l6 > bni[i9])
            {
                bni[i9] = l6;
                bnk[i9] = j7;
                bnm[i9] = 0;
            }
            l6 += i7;
            j7 += k7;
        }

        if(l4 != j4)
        {
            i7 = (k4 - i4 << 8) / (l4 - j4);
            i8 = (l1 - j2 << 8) / (l4 - j4);
        }
        if(j4 > l4)
        {
            l6 = k4 << 8;
            j7 = k1 << 8;
            l7 = l1 << 8;
            j6 = l4;
            k6 = j4;
        } else
        {
            l6 = i4 << 8;
            j7 = i2 << 8;
            l7 = j2 << 8;
            j6 = j4;
            k6 = l4;
        }
        if(j6 < 0)
        {
            l6 -= i7 * j6;
            l7 -= i8 * j6;
            j6 = 0;
        }
        if(k6 > k - 1)
            k6 = k - 1;
        for(int j9 = j6; j9 <= k6; j9++)
        {
            if(l6 < bnh[j9])
            {
                bnh[j9] = l6;
                bnj[j9] = j7;
                bnl[j9] = l7;
            }
            if(l6 > bni[j9])
            {
                bni[j9] = l6;
                bnk[j9] = j7;
                bnm[j9] = l7;
            }
            l6 += i7;
            l7 += i8;
        }

        if(j5 != l4)
        {
            i7 = (i5 - k4 << 8) / (j5 - l4);
            k7 = (k2 - k1 << 8) / (j5 - l4);
        }
        if(l4 > j5)
        {
            l6 = i5 << 8;
            j7 = k2 << 8;
            l7 = l2 << 8;
            j6 = j5;
            k6 = l4;
        } else
        {
            l6 = k4 << 8;
            j7 = k1 << 8;
            l7 = l1 << 8;
            j6 = l4;
            k6 = j5;
        }
        if(j6 < 0)
        {
            l6 -= i7 * j6;
            j7 -= k7 * j6;
            j6 = 0;
        }
        if(k6 > k - 1)
            k6 = k - 1;
        for(int k9 = j6; k9 <= k6; k9++)
        {
            if(l6 < bnh[k9])
            {
                bnh[k9] = l6;
                bnj[k9] = j7;
                bnl[k9] = l7;
            }
            if(l6 > bni[k9])
            {
                bni[k9] = l6;
                bnk[k9] = j7;
                bnm[k9] = l7;
            }
            l6 += i7;
            j7 += k7;
        }

        int l9 = k5 * i;
        int ai[] = bmc[arg2];
        for(int i10 = k5; i10 < l5; i10++)
        {
            int j10 = bnh[i10] >> 8;
            int k10 = bni[i10] >> 8;
            if(k10 - j10 <= 0)
            {
                l9 += i;
            } else
            {
                int l10 = bnj[i10] << 9;
                int i11 = ((bnk[i10] << 9) - l10) / (k10 - j10);
                int j11 = bnl[i10] << 9;
                int k11 = ((bnm[i10] << 9) - j11) / (k10 - j10);
                if(j10 < bna)
                {
                    l10 += (bna - j10) * i11;
                    j11 += (bna - j10) * k11;
                    j10 = bna;
                }
                if(k10 > bnb)
                    k10 = bnb;
                if(!bnc || (i10 & 1) == 0)
                    if(!bml[arg2])
                        cda(blm, ai, 0, l9 + j10, l10, j11, i11, k11, j10 - k10, j8);
                    else
                        cdb(blm, ai, 0, l9 + j10, l10, j11, i11, k11, j10 - k10, j8);
                l9 += i;
            }
        }

    }

    private void cda(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9)
    {
        for(arg2 = arg8; arg2 < 0; arg2++)
        {
            blm[arg3++] = arg1[(arg4 >> 17) + (arg5 >> 17) * arg9];
            arg4 += arg6;
            arg5 += arg7;
        }

    }

    private void cdb(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9)
    {
        for(int i = arg8; i < 0; i++)
        {
            arg2 = arg1[(arg4 >> 17) + (arg5 >> 17) * arg9];
            if(arg2 != 0)
                blm[arg3++] = arg2;
            else
                arg3++;
            arg4 += arg6;
            arg5 += arg7;
        }

    }

    public void cdc(int i, int k, int l, int i1, int j1, int k1, int l1)
    {
        ccc(i, k, l, i1, j1);
    }

    public void cdd(int i, int k, int l, int i1, int j1, int k1, int l1, 
            int i2, boolean flag)
    {
        try
        {
            if(k1 == 0)
                k1 = 0xffffff;
            if(l1 == 0)
                l1 = 0xffffff;
            int j2 = bmf[j1];
            int k2 = bmg[j1];
            int l2 = 0;
            int i3 = 0;
            int j3 = i2 << 16;
            int k3 = (j2 << 16) / l;
            int l3 = (k2 << 16) / i1;
            int i4 = -(i2 << 16) / i1;
            if(bml[j1])
            {
                int j4 = bmj[j1];
                int l4 = bmk[j1];
                k3 = (j4 << 16) / l;
                l3 = (l4 << 16) / i1;
                int k5 = bmh[j1];
                int l5 = bmi[j1];
                if(flag)
                    k5 = j4 - bmf[j1] - k5;
                i += ((k5 * l + j4) - 1) / j4;
                int i6 = ((l5 * i1 + l4) - 1) / l4;
                k += i6;
                j3 += i6 * i4;
                if((k5 * l) % j4 != 0)
                    l2 = (j4 - (k5 * l) % j4 << 16) / l;
                if((l5 * i1) % l4 != 0)
                    i3 = (l4 - (l5 * i1) % l4 << 16) / i1;
                l = ((((bmf[j1] << 16) - l2) + k3) - 1) / k3;
                i1 = ((((bmg[j1] << 16) - i3) + l3) - 1) / l3;
            }
            int k4 = k * blg;
            j3 += i << 16;
            if(k < bmm)
            {
                int i5 = bmm - k;
                i1 -= i5;
                k = bmm;
                k4 += i5 * blg;
                i3 += l3 * i5;
                j3 += i4 * i5;
            }
            if(k + i1 >= bmn)
                i1 -= ((k + i1) - bmn) + 1;
            int j5 = k4 / blg & 1;
            if(!bnc)
                j5 = 2;
            if(l1 == 0xffffff)
            {
                if(bmc[j1] != null)
                    if(!flag)
                    {
                        cde(blm, bmc[j1], 0, l2, i3, k4, l, i1, k3, l3, j2, k1, j3, i4, j5);
                        return;
                    } else
                    {
                        cde(blm, bmc[j1], 0, (bmf[j1] << 16) - l2 - 1, i3, k4, l, i1, -k3, l3, j2, k1, j3, i4, j5);
                        return;
                    }
                if(!flag)
                {
                    cdg(blm, bmd[j1], bme[j1], 0, l2, i3, k4, l, i1, k3, l3, j2, k1, j3, i4, j5);
                    return;
                } else
                {
                    cdg(blm, bmd[j1], bme[j1], 0, (bmf[j1] << 16) - l2 - 1, i3, k4, l, i1, -k3, l3, j2, k1, j3, i4, j5);
                    return;
                }
            }
            if(bmc[j1] != null)
                if(!flag)
                {
                    cdf(blm, bmc[j1], 0, l2, i3, k4, l, i1, k3, l3, j2, k1, l1, j3, i4, j5);
                    return;
                } else
                {
                    cdf(blm, bmc[j1], 0, (bmf[j1] << 16) - l2 - 1, i3, k4, l, i1, -k3, l3, j2, k1, l1, j3, i4, j5);
                    return;
                }
            if(!flag)
            {
                cdh(blm, bmd[j1], bme[j1], 0, l2, i3, k4, l, i1, k3, l3, j2, k1, l1, j3, i4, j5);
                return;
            } else
            {
                cdh(blm, bmd[j1], bme[j1], 0, (bmf[j1] << 16) - l2 - 1, i3, k4, l, i1, -k3, l3, j2, k1, l1, j3, i4, j5);
                return;
            }
        }
        catch(Exception _ex)
        {
            System.out.println("error in sprite clipping routine");
        }
    }

    private void cde(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, 
            int arg14)
    {
        int i1 = arg11 >> 16 & 0xff;
        int j1 = arg11 >> 8 & 0xff;
        int k1 = arg11 & 0xff;
        try
        {
            int l1 = arg3;
            for(int i2 = -arg7; i2 < 0; i2++)
            {
                int j2 = (arg4 >> 16) * arg10;
                int k2 = arg12 >> 16;
                int l2 = arg6;
                if(k2 < bna)
                {
                    int i3 = bna - k2;
                    l2 -= i3;
                    k2 = bna;
                    arg3 += arg8 * i3;
                }
                if(k2 + l2 >= bnb)
                {
                    int j3 = (k2 + l2) - bnb;
                    l2 -= j3;
                }
                arg14 = 1 - arg14;
                if(arg14 != 0)
                {
                    for(int k3 = k2; k3 < k2 + l2; k3++)
                    {
                        arg2 = arg1[(arg3 >> 16) + j2];
                        if(arg2 != 0)
                        {
                            int i = arg2 >> 16 & 0xff;
                            int k = arg2 >> 8 & 0xff;
                            int l = arg2 & 0xff;
                            if(i == k && k == l)
                                arg0[k3 + arg5] = ((i * i1 >> 8) << 16) + ((k * j1 >> 8) << 8) + (l * k1 >> 8);
                            else
                                arg0[k3 + arg5] = arg2;
                        }
                        arg3 += arg8;
                    }

                }
                arg4 += arg9;
                arg3 = l1;
                arg5 += blg;
                arg12 += arg13;
            }

            return;
        }
        catch(Exception _ex)
        {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    private void cdf(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, 
            int arg14, int arg15)
    {
        int i1 = arg11 >> 16 & 0xff;
        int j1 = arg11 >> 8 & 0xff;
        int k1 = arg11 & 0xff;
        int l1 = arg12 >> 16 & 0xff;
        int i2 = arg12 >> 8 & 0xff;
        int j2 = arg12 & 0xff;
        try
        {
            int k2 = arg3;
            for(int l2 = -arg7; l2 < 0; l2++)
            {
                int i3 = (arg4 >> 16) * arg10;
                int j3 = arg13 >> 16;
                int k3 = arg6;
                if(j3 < bna)
                {
                    int l3 = bna - j3;
                    k3 -= l3;
                    j3 = bna;
                    arg3 += arg8 * l3;
                }
                if(j3 + k3 >= bnb)
                {
                    int i4 = (j3 + k3) - bnb;
                    k3 -= i4;
                }
                arg15 = 1 - arg15;
                if(arg15 != 0)
                {
                    for(int j4 = j3; j4 < j3 + k3; j4++)
                    {
                        arg2 = arg1[(arg3 >> 16) + i3];
                        if(arg2 != 0)
                        {
                            int i = arg2 >> 16 & 0xff;
                            int k = arg2 >> 8 & 0xff;
                            int l = arg2 & 0xff;
                            if(i == k && k == l)
                                arg0[j4 + arg5] = ((i * i1 >> 8) << 16) + ((k * j1 >> 8) << 8) + (l * k1 >> 8);
                            else
                            if(i == 255 && k == l)
                                arg0[j4 + arg5] = ((i * l1 >> 8) << 16) + ((k * i2 >> 8) << 8) + (l * j2 >> 8);
                            else
                                arg0[j4 + arg5] = arg2;
                        }
                        arg3 += arg8;
                    }

                }
                arg4 += arg9;
                arg3 = k2;
                arg5 += blg;
                arg13 += arg14;
            }

            return;
        }
        catch(Exception _ex)
        {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    private void cdg(int arg0[], byte arg1[], int arg2[], int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, 
            int arg14, int arg15)
    {
        int i1 = arg12 >> 16 & 0xff;
        int j1 = arg12 >> 8 & 0xff;
        int k1 = arg12 & 0xff;
        try
        {
            int l1 = arg4;
            for(int i2 = -arg8; i2 < 0; i2++)
            {
                int j2 = (arg5 >> 16) * arg11;
                int k2 = arg13 >> 16;
                int l2 = arg7;
                if(k2 < bna)
                {
                    int i3 = bna - k2;
                    l2 -= i3;
                    k2 = bna;
                    arg4 += arg9 * i3;
                }
                if(k2 + l2 >= bnb)
                {
                    int j3 = (k2 + l2) - bnb;
                    l2 -= j3;
                }
                arg15 = 1 - arg15;
                if(arg15 != 0)
                {
                    for(int k3 = k2; k3 < k2 + l2; k3++)
                    {
                        arg3 = arg1[(arg4 >> 16) + j2] & 0xff;
                        if(arg3 != 0)
                        {
                            arg3 = arg2[arg3];
                            int i = arg3 >> 16 & 0xff;
                            int k = arg3 >> 8 & 0xff;
                            int l = arg3 & 0xff;
                            if(i == k && k == l)
                                arg0[k3 + arg6] = ((i * i1 >> 8) << 16) + ((k * j1 >> 8) << 8) + (l * k1 >> 8);
                            else
                                arg0[k3 + arg6] = arg3;
                        }
                        arg4 += arg9;
                    }

                }
                arg5 += arg10;
                arg4 = l1;
                arg6 += blg;
                arg13 += arg14;
            }

            return;
        }
        catch(Exception _ex)
        {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    private void cdh(int arg0[], byte arg1[], int arg2[], int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, 
            int arg14, int arg15, int arg16)
    {
        int i1 = arg12 >> 16 & 0xff;
        int j1 = arg12 >> 8 & 0xff;
        int k1 = arg12 & 0xff;
        int l1 = arg13 >> 16 & 0xff;
        int i2 = arg13 >> 8 & 0xff;
        int j2 = arg13 & 0xff;
        try
        {
            int k2 = arg4;
            for(int l2 = -arg8; l2 < 0; l2++)
            {
                int i3 = (arg5 >> 16) * arg11;
                int j3 = arg14 >> 16;
                int k3 = arg7;
                if(j3 < bna)
                {
                    int l3 = bna - j3;
                    k3 -= l3;
                    j3 = bna;
                    arg4 += arg9 * l3;
                }
                if(j3 + k3 >= bnb)
                {
                    int i4 = (j3 + k3) - bnb;
                    k3 -= i4;
                }
                arg16 = 1 - arg16;
                if(arg16 != 0)
                {
                    for(int j4 = j3; j4 < j3 + k3; j4++)
                    {
                        arg3 = arg1[(arg4 >> 16) + i3] & 0xff;
                        if(arg3 != 0)
                        {
                            arg3 = arg2[arg3];
                            int i = arg3 >> 16 & 0xff;
                            int k = arg3 >> 8 & 0xff;
                            int l = arg3 & 0xff;
                            if(i == k && k == l)
                                arg0[j4 + arg6] = ((i * i1 >> 8) << 16) + ((k * j1 >> 8) << 8) + (l * k1 >> 8);
                            else
                            if(i == 255 && k == l)
                                arg0[j4 + arg6] = ((i * l1 >> 8) << 16) + ((k * i2 >> 8) << 8) + (l * j2 >> 8);
                            else
                                arg0[j4 + arg6] = arg3;
                        }
                        arg4 += arg9;
                    }

                }
                arg5 += arg10;
                arg4 = k2;
                arg6 += blg;
                arg14 += arg15;
            }

            return;
        }
        catch(Exception _ex)
        {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    public static void cdi(String arg0, int arg1, a arg2)
    {
        boolean flag = false;
        boolean flag1 = false;
        arg0 = arg0.toLowerCase();
        if(arg0.startsWith("helvetica"))
            arg0 = arg0.substring(9);
        if(arg0.startsWith("h"))
            arg0 = arg0.substring(1);
        if(arg0.startsWith("f"))
        {
            arg0 = arg0.substring(1);
            flag = true;
        }
        if(arg0.startsWith("d"))
        {
            arg0 = arg0.substring(1);
            flag1 = true;
        }
        if(arg0.endsWith(".jf"))
            arg0 = arg0.substring(0, arg0.length() - 3);
        int i = 0;
        if(arg0.endsWith("b"))
        {
            i = 1;
            arg0 = arg0.substring(0, arg0.length() - 1);
        }
        if(arg0.endsWith("p"))
            arg0 = arg0.substring(0, arg0.length() - 1);
        int k = Integer.parseInt(arg0);
        Font font = new Font("Helvetica", i, k);
        FontMetrics fontmetrics = arg2.getFontMetrics(font);
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        cad = 855;
        for(int l = 0; l < 95; l++)
            cdj(font, fontmetrics, s.charAt(l), l, arg2, arg1, flag1);

        bnd[arg1] = new byte[cad];
        for(int i1 = 0; i1 < cad; i1++)
            bnd[arg1][i1] = cae[i1];

        if(i == 1 && cac[arg1])
        {
            cac[arg1] = false;
            cdi("f" + k + "p", arg1, arg2);
        }
        if(flag && !cac[arg1])
        {
            cac[arg1] = false;
            cdi("d" + k + "p", arg1, arg2);
        }
    }

    public static void cdj(Font arg0, FontMetrics arg1, char arg2, int arg3, a arg4, int arg5, boolean arg6)
    {
        int i = arg1.charWidth(arg2);
        int k = i;
        if(arg6)
            try
            {
                if(arg2 == '/')
                    arg6 = false;
                if(arg2 == 'f' || arg2 == 't' || arg2 == 'w' || arg2 == 'v' || arg2 == 'k' || arg2 == 'x' || arg2 == 'y' || arg2 == 'A' || arg2 == 'V' || arg2 == 'W')
                    i++;
            }
            catch(Exception _ex) { }
        int l = arg1.getMaxAscent();
        int i1 = arg1.getMaxAscent() + arg1.getMaxDescent();
        int j1 = arg1.getHeight();
        Image image = arg4.createImage(i, i1);
        Graphics g = image.getGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, i, i1);
        g.setColor(Color.white);
        g.setFont(arg0);
        g.drawString(String.valueOf(arg2), 0, l);
        if(arg6)
            g.drawString(String.valueOf(arg2), 1, l);
        int ai[] = new int[i * i1];
        PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i, i1, ai, 0, i);
        try
        {
            pixelgrabber.grabPixels();
        }
        catch(InterruptedException _ex)
        {
            return;
        }
        image.flush();
        image = null;
        int k1 = 0;
        int l1 = 0;
        int i2 = i;
        int j2 = i1;
label0:
        for(int k2 = 0; k2 < i1; k2++)
        {
            for(int l2 = 0; l2 < i; l2++)
            {
                int j3 = ai[l2 + k2 * i];
                if((j3 & 0xffffff) == 0)
                    continue;
                l1 = k2;
                break label0;
            }

        }

label1:
        for(int i3 = 0; i3 < i; i3++)
        {
            for(int k3 = 0; k3 < i1; k3++)
            {
                int i4 = ai[i3 + k3 * i];
                if((i4 & 0xffffff) == 0)
                    continue;
                k1 = i3;
                break label1;
            }

        }

label2:
        for(int l3 = i1 - 1; l3 >= 0; l3--)
        {
            for(int j4 = 0; j4 < i; j4++)
            {
                int l4 = ai[j4 + l3 * i];
                if((l4 & 0xffffff) == 0)
                    continue;
                j2 = l3 + 1;
                break label2;
            }

        }

label3:
        for(int k4 = i - 1; k4 >= 0; k4--)
        {
            for(int i5 = 0; i5 < i1; i5++)
            {
                int k5 = ai[k4 + i5 * i];
                if((k5 & 0xffffff) == 0)
                    continue;
                i2 = k4 + 1;
                break label3;
            }

        }

        cae[arg3 * 9] = (byte)(cad / 16384);
        cae[arg3 * 9 + 1] = (byte)(cad / 128 & 0x7f);
        cae[arg3 * 9 + 2] = (byte)(cad & 0x7f);
        cae[arg3 * 9 + 3] = (byte)(i2 - k1);
        cae[arg3 * 9 + 4] = (byte)(j2 - l1);
        cae[arg3 * 9 + 5] = (byte)k1;
        cae[arg3 * 9 + 6] = (byte)(l - l1);
        cae[arg3 * 9 + 7] = (byte)k;
        cae[arg3 * 9 + 8] = (byte)j1;
        for(int j5 = l1; j5 < j2; j5++)
        {
            for(int l5 = k1; l5 < i2; l5++)
            {
                int i6 = ai[l5 + j5 * i] & 0xff;
                if(i6 > 30 && i6 < 230)
                    cac[arg5] = true;
                cae[cad++] = (byte)i6;
            }

        }

    }

    public void cdk(String s, int i, int k, int l, int i1)
    {
        cdn(s, i - cef(s, l), k, l, i1);
    }

    public void cdl(String s, int i, int k, int l, int i1)
    {
        cdn(s, i - cef(s, l) / 2, k, l, i1);
    }

    public void cdm(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
    {
        try
        {
            int i = 0;
            byte abyte0[] = bnd[arg3];
            int k = 0;
            int l = 0;
            for(int i1 = 0; i1 < arg0.length(); i1++)
            {
                if(arg0.charAt(i1) == '@' && i1 + 4 < arg0.length() && arg0.charAt(i1 + 4) == '@')
                    i1 += 4;
                else
                if(arg0.charAt(i1) == '~' && i1 + 4 < arg0.length() && arg0.charAt(i1 + 4) == '~')
                    i1 += 4;
                else
                    i += abyte0[bne[arg0.charAt(i1)] + 7];
                if(arg0.charAt(i1) == ' ')
                    l = i1;
                if(arg0.charAt(i1) == '%')
                {
                    l = i1;
                    i = 1000;
                }
                if(i > arg5)
                {
                    if(l <= k)
                        l = i1;
                    cdl(arg0.substring(k, l), arg1, arg2, arg3, arg4);
                    i = 0;
                    k = i1 = l + 1;
                    arg2 += ced(arg3);
                }
            }

            if(i > 0)
            {
                cdl(arg0.substring(k), arg1, arg2, arg3, arg4);
                return;
            }
        }
        catch(Exception exception)
        {
            System.out.println("centrepara: " + exception);
            exception.printStackTrace();
        }
    }

    public void cdn(String arg0, int arg1, int arg2, int arg3, int arg4)
    {
        try
        {
            byte abyte0[] = bnd[arg3];
            for(int i = 0; i < arg0.length(); i++)
                if(arg0.charAt(i) == '@' && i + 4 < arg0.length() && arg0.charAt(i + 4) == '@')
                {
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("red"))
                        arg4 = 0xff0000;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("lre"))
                        arg4 = 0xff9040;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("yel"))
                        arg4 = 0xffff00;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("gre"))
                        arg4 = 65280;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("blu"))
                        arg4 = 255;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("cya"))
                        arg4 = 65535;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("mag"))
                        arg4 = 0xff00ff;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("whi"))
                        arg4 = 0xffffff;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("bla"))
                        arg4 = 0;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("dre"))
                        arg4 = 0xc00000;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("ora"))
                        arg4 = 0xff9040;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("ran"))
                        arg4 = (int)(Math.random() * 16777215D);
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("or1"))
                        arg4 = 0xffb000;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("or2"))
                        arg4 = 0xff7000;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("or3"))
                        arg4 = 0xff3000;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("gr1"))
                        arg4 = 0xc0ff00;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("gr2"))
                        arg4 = 0x80ff00;
                    else
                    if(arg0.substring(i + 1, i + 4).equalsIgnoreCase("gr3"))
                        arg4 = 0x40ff00;
                    i += 4;
                } else
                if(arg0.charAt(i) == '~' && i + 4 < arg0.length() && arg0.charAt(i + 4) == '~')
                {
                    char c = arg0.charAt(i + 1);
                    char c1 = arg0.charAt(i + 2);
                    char c2 = arg0.charAt(i + 3);
                    if(c >= '0' && c <= '9' && c1 >= '0' && c1 <= '9' && c2 >= '0' && c2 <= '9')
                        arg1 = Integer.parseInt(arg0.substring(i + 1, i + 4));
                    i += 4;
                } else
                {
                    int k = bne[arg0.charAt(i)];
                    if(bnf && !cac[arg3] && arg4 != 0)
                        cea(k, arg1 + 1, arg2, 0, abyte0, cac[arg3]);
                    if(bnf && !cac[arg3] && arg4 != 0)
                        cea(k, arg1, arg2 + 1, 0, abyte0, cac[arg3]);
                    cea(k, arg1, arg2, arg4, abyte0, cac[arg3]);
                    arg1 += abyte0[k + 7];
                }

            return;
        }
        catch(Exception exception)
        {
            System.out.println("drawstring: " + exception);
            exception.printStackTrace();
            return;
        }
    }

    private void cea(int i, int k, int l, int i1, byte abyte0[], boolean flag)
    {
        int j1 = k + abyte0[i + 5];
        int k1 = l - abyte0[i + 6];
        int l1 = abyte0[i + 3];
        int i2 = abyte0[i + 4];
        int j2 = abyte0[i] * 16384 + abyte0[i + 1] * 128 + abyte0[i + 2];
        int k2 = j1 + k1 * blg;
        int l2 = blg - l1;
        int i3 = 0;
        if(k1 < bmm)
        {
            int j3 = bmm - k1;
            i2 -= j3;
            k1 = bmm;
            j2 += j3 * l1;
            k2 += j3 * blg;
        }
        if(k1 + i2 >= bmn)
            i2 -= ((k1 + i2) - bmn) + 1;
        if(j1 < bna)
        {
            int k3 = bna - j1;
            l1 -= k3;
            j1 = bna;
            j2 += k3;
            k2 += k3;
            i3 += k3;
            l2 += k3;
        }
        if(j1 + l1 >= bnb)
        {
            int l3 = ((j1 + l1) - bnb) + 1;
            l1 -= l3;
            i3 += l3;
            l2 += l3;
        }
        if(l1 > 0 && i2 > 0)
        {
            if(flag)
            {
                cec(blm, abyte0, i1, j2, k2, l1, i2, l2, i3);
                return;
            }
            ceb(blm, abyte0, i1, j2, k2, l1, i2, l2, i3);
        }
    }

    private void ceb(int arg0[], byte arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8)
    {
        try
        {
            int i = -(arg5 >> 2);
            arg5 = -(arg5 & 3);
            for(int k = -arg6; k < 0; k++)
            {
                for(int l = i; l < 0; l++)
                {
                    if(arg1[arg3++] != 0)
                        arg0[arg4++] = arg2;
                    else
                        arg4++;
                    if(arg1[arg3++] != 0)
                        arg0[arg4++] = arg2;
                    else
                        arg4++;
                    if(arg1[arg3++] != 0)
                        arg0[arg4++] = arg2;
                    else
                        arg4++;
                    if(arg1[arg3++] != 0)
                        arg0[arg4++] = arg2;
                    else
                        arg4++;
                }

                for(int i1 = arg5; i1 < 0; i1++)
                    if(arg1[arg3++] != 0)
                        arg0[arg4++] = arg2;
                    else
                        arg4++;

                arg4 += arg7;
                arg3 += arg8;
            }

            return;
        }
        catch(Exception exception)
        {
            System.out.println("plotletter: " + exception);
            exception.printStackTrace();
            return;
        }
    }

    private void cec(int arg0[], byte arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, 
            int arg7, int arg8)
    {
        for(int i = -arg6; i < 0; i++)
        {
            for(int k = -arg5; k < 0; k++)
            {
                int l = arg1[arg3++] & 0xff;
                if(l > 30)
                {
                    if(l >= 230)
                    {
                        arg0[arg4++] = arg2;
                    } else
                    {
                        int i1 = arg0[arg4];
                        arg0[arg4++] = ((arg2 & 0xff00ff) * l + (i1 & 0xff00ff) * (256 - l) & 0xff00ff00) + ((arg2 & 0xff00) * l + (i1 & 0xff00) * (256 - l) & 0xff0000) >> 8;
                    }
                } else
                {
                    arg4++;
                }
            }

            arg4 += arg7;
            arg3 += arg8;
        }

    }

    public int ced(int i)
    {
        if(i == 0)
            return 12;
        if(i == 1)
            return 14;
        if(i == 2)
            return 14;
        if(i == 3)
            return 15;
        if(i == 4)
            return 15;
        if(i == 5)
            return 19;
        if(i == 6)
            return 24;
        if(i == 7)
            return 29;
        else
            return cee(i);
    }

    public int cee(int i)
    {
        if(i == 0)
            return bnd[i][8] - 2;
        else
            return bnd[i][8] - 1;
    }

    public int cef(String arg0, int arg1)
    {
        int i = 0;
        byte abyte0[] = bnd[arg1];
        for(int k = 0; k < arg0.length(); k++)
            if(arg0.charAt(k) == '@' && k + 4 < arg0.length() && arg0.charAt(k + 4) == '@')
                k += 4;
            else
            if(arg0.charAt(k) == '~' && k + 4 < arg0.length() && arg0.charAt(k + 4) == '~')
                k += 4;
            else
                i += abyte0[bne[arg0.charAt(k)] + 7];

        return i;
    }

    public boolean imageUpdate(Image image, int i, int k, int l, int i1, int j1)
    {
        return true;
    }

    public int blg;
    public int blh;
    public int bli;
    public int blj;
    public int blk;
    ColorModel bll;
    public int blm[];
    ImageConsumer bln;
    private Component bma;
    public Image bmb;
    public int bmc[][];
    public byte bmd[][];
    public int bme[][];
    public int bmf[];
    public int bmg[];
    public int bmh[];
    public int bmi[];
    public int bmj[];
    public int bmk[];
    public boolean bml[];
    private int bmm;
    private int bmn;
    private int bna;
    private int bnb;
    public boolean bnc;
    static byte bnd[][] = new byte[50][];
    static int bne[];
    public boolean bnf;
    int bng[];
    int bnh[];
    int bni[];
    int bnj[];
    int bnk[];
    int bnl[];
    int bnm[];
    public static int bnn;
    public static int caa;
    public static int cab;
    private static boolean cac[] = new boolean[12];
    private static int cad;
    private static byte cae[] = new byte[0x186a0];
    public static int caf;

    static 
    {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        bne = new int[256];
        for(int i = 0; i < 256; i++)
        {
            int k = s.indexOf(i);
            if(k == -1)
                k = 74;
            bne[i] = k * 9;
        }

    }
}
