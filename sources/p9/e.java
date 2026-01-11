package p9;

import a.b;
import ah.v;
import g9.g;
import i2.m;
import i2.p;
import i2.r;
import i2.s;
import i2.u;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class e extends aa.a {
    public static final a J = new a();
    public static final Object K = new Object();
    public Object[] F = new Object[32];
    public int G = 0;
    public String[] H = new String[32];
    public int[] I = new int[32];

    public class a extends Reader {
        public final void close() {
            throw new AssertionError();
        }

        public final int read(char[] cArr, int i, int i10) {
            throw new AssertionError();
        }
    }

    public e(p pVar) {
        super(J);
        E0(pVar);
    }

    private String G0() {
        StringBuilder q10 = b.q(" at path ");
        q10.append(T());
        return q10.toString();
    }

    public final int A0() {
        if (this.G == 0) {
            return 10;
        }
        Object H0 = H0();
        if (H0 instanceof Iterator) {
            boolean z = this.F[this.G - 2] instanceof s;
            Iterator it = (Iterator) H0;
            if (!it.hasNext()) {
                return z ? 4 : 2;
            }
            if (z) {
                return 5;
            }
            E0(it.next());
            return A0();
        } else if (H0 instanceof s) {
            return 3;
        } else {
            if (H0 instanceof m) {
                return 1;
            }
            if (H0 instanceof u) {
                Serializable serializable = ((u) H0).f6006a;
                if (serializable instanceof String) {
                    return 6;
                }
                if (serializable instanceof Boolean) {
                    return 8;
                }
                if (serializable instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (H0 instanceof r) {
                return 9;
            } else {
                if (H0 == K) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public final void D0() {
        if (A0() == 5) {
            w0();
            this.H[this.G - 2] = "null";
        } else {
            I0();
            int i = this.G;
            if (i > 0) {
                this.H[i - 1] = "null";
            }
        }
        int i10 = this.G;
        if (i10 > 0) {
            int[] iArr = this.I;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final void E0(Object obj) {
        int i = this.G;
        Object[] objArr = this.F;
        if (i == objArr.length) {
            int i10 = i * 2;
            this.F = Arrays.copyOf(objArr, i10);
            this.I = Arrays.copyOf(this.I, i10);
            this.H = (String[]) Arrays.copyOf(this.H, i10);
        }
        Object[] objArr2 = this.F;
        int i11 = this.G;
        this.G = i11 + 1;
        objArr2[i11] = obj;
    }

    public final void F0(int i) {
        if (A0() != i) {
            StringBuilder d10 = a.a.d("Expected ");
            d10.append(v.h(i));
            d10.append(" but was ");
            d10.append(v.h(A0()));
            d10.append(G0());
            throw new IllegalStateException(d10.toString());
        }
    }

    public final Object H0() {
        return this.F[this.G - 1];
    }

    public final Object I0() {
        Object[] objArr = this.F;
        int i = this.G - 1;
        this.G = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void R() {
        F0(2);
        I0();
        I0();
        int i = this.G;
        if (i > 0) {
            int[] iArr = this.I;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    public final void S() {
        F0(4);
        I0();
        I0();
        int i = this.G;
        if (i > 0) {
            int[] iArr = this.I;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    public final String T() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i = 0;
        while (i < this.G) {
            Object[] objArr = this.F;
            if (objArr[i] instanceof m) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb2.append('[');
                    sb2.append(this.I[i]);
                    sb2.append(']');
                }
            } else if (objArr[i] instanceof s) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb2.append('.');
                    String[] strArr = this.H;
                    if (strArr[i] != null) {
                        sb2.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb2.toString();
    }

    public final boolean a0() {
        int A0 = A0();
        return (A0 == 4 || A0 == 2) ? false : true;
    }

    public final boolean b0() {
        F0(8);
        boolean h10 = ((u) I0()).h();
        int i = this.G;
        if (i > 0) {
            int[] iArr = this.I;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return h10;
    }

    public final void close() {
        this.F = new Object[]{K};
        this.G = 1;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<i2.p>, java.util.ArrayList] */
    public final void e() {
        F0(1);
        E0(((m) H0()).f6003a.iterator());
        this.I[this.G - 1] = 0;
    }

    public final double f0() {
        int A0 = A0();
        if (A0 == 7 || A0 == 6) {
            u uVar = (u) H0();
            double doubleValue = uVar.f6006a instanceof Number ? uVar.i().doubleValue() : Double.parseDouble(uVar.e());
            if (this.f180b || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                I0();
                int i = this.G;
                if (i > 0) {
                    int[] iArr = this.I;
                    int i10 = i - 1;
                    iArr[i10] = iArr[i10] + 1;
                }
                return doubleValue;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        StringBuilder d10 = a.a.d("Expected ");
        d10.append(v.h(7));
        d10.append(" but was ");
        d10.append(v.h(A0));
        d10.append(G0());
        throw new IllegalStateException(d10.toString());
    }

    public final int p0() {
        int A0 = A0();
        if (A0 == 7 || A0 == 6) {
            u uVar = (u) H0();
            int intValue = uVar.f6006a instanceof Number ? uVar.i().intValue() : Integer.parseInt(uVar.e());
            I0();
            int i = this.G;
            if (i > 0) {
                int[] iArr = this.I;
                int i10 = i - 1;
                iArr[i10] = iArr[i10] + 1;
            }
            return intValue;
        }
        StringBuilder d10 = a.a.d("Expected ");
        d10.append(v.h(7));
        d10.append(" but was ");
        d10.append(v.h(A0));
        d10.append(G0());
        throw new IllegalStateException(d10.toString());
    }

    public final String toString() {
        return e.class.getSimpleName();
    }

    public final long v0() {
        int A0 = A0();
        if (A0 == 7 || A0 == 6) {
            u uVar = (u) H0();
            long longValue = uVar.f6006a instanceof Number ? uVar.i().longValue() : Long.parseLong(uVar.e());
            I0();
            int i = this.G;
            if (i > 0) {
                int[] iArr = this.I;
                int i10 = i - 1;
                iArr[i10] = iArr[i10] + 1;
            }
            return longValue;
        }
        StringBuilder d10 = a.a.d("Expected ");
        d10.append(v.h(7));
        d10.append(" but was ");
        d10.append(v.h(A0));
        d10.append(G0());
        throw new IllegalStateException(d10.toString());
    }

    public final void w() {
        F0(3);
        E0(new g.b.a((g.b) ((s) H0()).f6005a.entrySet()));
    }

    public final String w0() {
        F0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) H0()).next();
        String str = (String) entry.getKey();
        this.H[this.G - 1] = str;
        E0(entry.getValue());
        return str;
    }

    public final void x0() {
        F0(9);
        I0();
        int i = this.G;
        if (i > 0) {
            int[] iArr = this.I;
            int i10 = i - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    public final String y0() {
        int A0 = A0();
        if (A0 == 6 || A0 == 7) {
            String e10 = ((u) I0()).e();
            int i = this.G;
            if (i > 0) {
                int[] iArr = this.I;
                int i10 = i - 1;
                iArr[i10] = iArr[i10] + 1;
            }
            return e10;
        }
        StringBuilder d10 = a.a.d("Expected ");
        d10.append(v.h(6));
        d10.append(" but was ");
        d10.append(v.h(A0));
        d10.append(G0());
        throw new IllegalStateException(d10.toString());
    }
}
