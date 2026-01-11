package y2;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import z2.c;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f13405a = c.a.a("x", "y");

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13406a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                z2.c$b[] r0 = z2.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13406a = r0
                z2.c$b r1 = z2.c.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13406a     // Catch:{ NoSuchFieldError -> 0x001d }
                z2.c$b r1 = z2.c.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13406a     // Catch:{ NoSuchFieldError -> 0x0028 }
                z2.c$b r1 = z2.c.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y2.p.a.<clinit>():void");
        }
    }

    public static int a(c cVar) throws IOException {
        cVar.a();
        int w6 = (int) (cVar.w() * 255.0d);
        int w10 = (int) (cVar.w() * 255.0d);
        int w11 = (int) (cVar.w() * 255.0d);
        while (cVar.s()) {
            cVar.a0();
        }
        cVar.e();
        return Color.argb(255, w6, w10, w11);
    }

    public static PointF b(c cVar, float f10) throws IOException {
        int i = a.f13406a[cVar.O().ordinal()];
        if (i == 1) {
            float w6 = (float) cVar.w();
            float w10 = (float) cVar.w();
            while (cVar.s()) {
                cVar.a0();
            }
            return new PointF(w6 * f10, w10 * f10);
        } else if (i == 2) {
            cVar.a();
            float w11 = (float) cVar.w();
            float w12 = (float) cVar.w();
            while (cVar.O() != c.b.END_ARRAY) {
                cVar.a0();
            }
            cVar.e();
            return new PointF(w11 * f10, w12 * f10);
        } else if (i == 3) {
            cVar.c();
            float f11 = 0.0f;
            float f12 = 0.0f;
            while (cVar.s()) {
                int S = cVar.S(f13405a);
                if (S == 0) {
                    f11 = d(cVar);
                } else if (S != 1) {
                    cVar.T();
                    cVar.a0();
                } else {
                    f12 = d(cVar);
                }
            }
            cVar.f();
            return new PointF(f11 * f10, f12 * f10);
        } else {
            StringBuilder d10 = a.a.d("Unknown point starts with ");
            d10.append(cVar.O());
            throw new IllegalArgumentException(d10.toString());
        }
    }

    public static List<PointF> c(c cVar, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.a();
        while (cVar.O() == c.b.BEGIN_ARRAY) {
            cVar.a();
            arrayList.add(b(cVar, f10));
            cVar.e();
        }
        cVar.e();
        return arrayList;
    }

    public static float d(c cVar) throws IOException {
        c.b O = cVar.O();
        int i = a.f13406a[O.ordinal()];
        if (i == 1) {
            return (float) cVar.w();
        }
        if (i == 2) {
            cVar.a();
            float w6 = (float) cVar.w();
            while (cVar.s()) {
                cVar.a0();
            }
            cVar.e();
            return w6;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + O);
    }
}
