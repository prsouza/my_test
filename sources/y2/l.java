package y2;

import a3.f;
import android.graphics.Color;
import android.graphics.PointF;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.util.ArrayList;
import v2.c;
import z2.c;

public final class l implements h0<c> {

    /* renamed from: a  reason: collision with root package name */
    public int f13398a;

    public l(int i) {
        this.f13398a = i;
    }

    public final Object a(z2.c cVar, float f10) throws IOException {
        int i;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        int i12 = 1;
        int i13 = 0;
        boolean z = cVar.O() == c.b.BEGIN_ARRAY;
        if (z) {
            cVar.a();
        }
        while (cVar.s()) {
            arrayList.add(Float.valueOf((float) cVar.w()));
        }
        if (z) {
            cVar.e();
        }
        if (this.f13398a == -1) {
            this.f13398a = arrayList.size() / 4;
        }
        int i14 = this.f13398a;
        float[] fArr = new float[i14];
        int[] iArr = new int[i14];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i = this.f13398a * 4;
            if (i15 >= i) {
                break;
            }
            int i18 = i15 / 4;
            double floatValue = (double) ((Float) arrayList.get(i15)).floatValue();
            int i19 = i15 % 4;
            if (i19 == 0) {
                fArr[i18] = (float) floatValue;
            } else if (i19 == 1) {
                i16 = (int) (floatValue * 255.0d);
            } else if (i19 == 2) {
                i17 = (int) (floatValue * 255.0d);
            } else if (i19 == 3) {
                iArr[i18] = Color.argb(255, i16, i17, (int) (floatValue * 255.0d));
            }
            i15++;
        }
        v2.c cVar2 = new v2.c(fArr, iArr);
        if (arrayList.size() > i) {
            int size = (arrayList.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i20 = 0;
            while (i < arrayList.size()) {
                if (i % 2 == 0) {
                    dArr[i20] = (double) ((Float) arrayList.get(i)).floatValue();
                } else {
                    dArr2[i20] = (double) ((Float) arrayList.get(i)).floatValue();
                    i20++;
                }
                i++;
            }
            while (true) {
                int[] iArr2 = cVar2.f12183b;
                if (i13 >= iArr2.length) {
                    break;
                }
                int i21 = iArr2[i13];
                double d10 = (double) cVar2.f12182a[i13];
                int i22 = i12;
                while (true) {
                    if (i22 >= size) {
                        i10 = i13;
                        i11 = (int) (dArr2[size - 1] * 255.0d);
                        break;
                    }
                    int i23 = i22 - 1;
                    double d11 = dArr[i23];
                    double d12 = dArr[i22];
                    if (dArr[i22] >= d10) {
                        double d13 = (d10 - d11) / (d12 - d11);
                        i10 = i13;
                        PointF pointF = f.f49a;
                        double max = Math.max(Utils.DOUBLE_EPSILON, Math.min(1.0d, d13));
                        double d14 = dArr2[i23];
                        i11 = (int) ((((dArr2[i22] - d14) * max) + d14) * 255.0d);
                        break;
                    }
                    int i24 = i13;
                    i22++;
                }
                cVar2.f12183b[i10] = Color.argb(i11, Color.red(i21), Color.green(i21), Color.blue(i21));
                i13 = i10 + 1;
                i12 = 1;
            }
        }
        return cVar2;
    }
}
