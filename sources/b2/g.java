package b2;

import android.content.Context;
import g2.a;
import wh.b;
import wh.e;

public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static g f2839e;

    /* renamed from: a  reason: collision with root package name */
    public Object f2840a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2841b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2842c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2843d;

    public g(b bVar, e eVar) {
        int i;
        int d10;
        int[] iArr;
        this.f2840a = bVar;
        this.f2841b = eVar;
        int e10 = eVar.e();
        this.f2842c = new e[e10];
        int i10 = 0;
        while (true) {
            i = e10 >> 1;
            if (i10 >= i) {
                break;
            }
            int i11 = i10 << 1;
            int[] iArr2 = new int[(i11 + 1)];
            iArr2[i11] = 1;
            ((e[]) this.f2842c)[i10] = new e((b) this.f2840a, iArr2);
            i10++;
        }
        while (i < e10) {
            int i12 = i << 1;
            int[] iArr3 = new int[(i12 + 1)];
            iArr3[i12] = 1;
            e eVar2 = new e((b) this.f2840a, iArr3);
            e[] eVarArr = (e[]) this.f2842c;
            int[] iArr4 = eVar2.f12688c;
            int[] iArr5 = ((e) this.f2841b).f12688c;
            int b10 = e.b(iArr5);
            if (b10 != -1) {
                int length = iArr4.length;
                int[] iArr6 = new int[length];
                int b11 = e.b(iArr5);
                int b12 = eVar2.f12686a.b(b11 == -1 ? 0 : iArr5[b11]);
                System.arraycopy(iArr4, 0, iArr6, 0, length);
                while (b10 <= e.b(iArr6)) {
                    b bVar2 = eVar2.f12686a;
                    int b13 = e.b(iArr6);
                    int d11 = bVar2.d(b13 == -1 ? 0 : iArr6[b13], b12);
                    int b14 = e.b(iArr6) - b10;
                    int b15 = e.b(iArr5);
                    if (b15 == -1) {
                        iArr = new int[1];
                    } else {
                        int[] iArr7 = new int[(b15 + b14 + 1)];
                        System.arraycopy(iArr5, 0, iArr7, b14, b15 + 1);
                        iArr = iArr7;
                    }
                    iArr6 = eVar2.a(eVar2.i(iArr, d11), iArr6);
                }
                eVarArr[i] = new e(eVar2.f12686a, iArr6);
                i++;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        }
        int e11 = ((e) this.f2841b).e();
        e[] eVarArr2 = new e[e11];
        int i13 = e11 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            eVarArr2[i14] = new e(((e[]) this.f2842c)[i14]);
        }
        this.f2843d = new e[e11];
        while (i13 >= 0) {
            ((e[]) this.f2843d)[i13] = new e((b) this.f2840a, i13);
            i13--;
        }
        for (int i15 = 0; i15 < e11; i15++) {
            if (eVarArr2[i15].d(i15) == 0) {
                int i16 = i15 + 1;
                boolean z = false;
                while (i16 < e11) {
                    if (eVarArr2[i16].d(i15) != 0) {
                        e eVar3 = eVarArr2[i15];
                        eVarArr2[i15] = eVarArr2[i16];
                        eVarArr2[i16] = eVar3;
                        e[] eVarArr3 = (e[]) this.f2843d;
                        e eVar4 = eVarArr3[i15];
                        eVarArr3[i15] = eVarArr3[i16];
                        eVarArr3[i16] = eVar4;
                        i16 = e11;
                        z = true;
                    }
                    i16++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int b16 = ((b) this.f2840a).b(eVarArr2[i15].d(i15));
            eVarArr2[i15].g(b16);
            ((e[]) this.f2843d)[i15].g(b16);
            for (int i17 = 0; i17 < e11; i17++) {
                if (!(i17 == i15 || (d10 = eVarArr2[i17].d(i15)) == 0)) {
                    e h10 = eVarArr2[i15].h(d10);
                    e h11 = ((e[]) this.f2843d)[i15].h(d10);
                    e eVar5 = eVarArr2[i17];
                    eVar5.f12688c = eVar5.a(eVar5.f12688c, h10.f12688c);
                    eVar5.c();
                    e eVar6 = ((e[]) this.f2843d)[i17];
                    eVar6.f12688c = eVar6.a(eVar6.f12688c, h11.f12688c);
                    eVar6.c();
                }
            }
        }
    }

    public static synchronized g a(Context context, a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f2839e == null) {
                f2839e = new g(context, aVar);
            }
            gVar = f2839e;
        }
        return gVar;
    }

    public /* synthetic */ g(Context context, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2840a = new a(applicationContext, aVar);
        this.f2841b = new b(applicationContext, aVar);
        this.f2842c = new e(applicationContext, aVar);
        this.f2843d = new f(applicationContext, aVar);
    }
}
