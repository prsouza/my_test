package z2;

import b9.m;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import uf.e;
import uf.i;
import uf.r;

public abstract class c implements Closeable {

    /* renamed from: t  reason: collision with root package name */
    public static final String[] f13770t = new String[128];

    /* renamed from: a  reason: collision with root package name */
    public int f13771a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f13772b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    public String[] f13773c = new String[32];

    /* renamed from: s  reason: collision with root package name */
    public int[] f13774s = new int[32];

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f13775a;

        /* renamed from: b  reason: collision with root package name */
        public final r f13776b;

        public a(String[] strArr, r rVar) {
            this.f13775a = strArr;
            this.f13776b = rVar;
        }

        public static a a(String... strArr) {
            String str;
            try {
                i[] iVarArr = new i[strArr.length];
                e eVar = new e();
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    String[] strArr2 = c.f13770t;
                    eVar.y0(34);
                    int length = str2.length();
                    int i10 = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        char charAt = str2.charAt(i11);
                        if (charAt < 128) {
                            str = strArr2[charAt];
                            if (str == null) {
                            }
                        } else if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i10 < i11) {
                            eVar.E0(str2, i10, i11);
                        }
                        eVar.D0(str);
                        i10 = i11 + 1;
                    }
                    if (i10 < length) {
                        eVar.E0(str2, i10, length);
                    }
                    eVar.y0(34);
                    eVar.readByte();
                    iVarArr[i] = eVar.O();
                }
                return new a((String[]) strArr.clone(), r.f11975c.b(iVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f13770t[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f13770t;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract String B() throws IOException;

    public abstract String E() throws IOException;

    public abstract b O() throws IOException;

    public final void R(int i) {
        int i10 = this.f13771a;
        int[] iArr = this.f13772b;
        if (i10 == iArr.length) {
            if (i10 != 256) {
                this.f13772b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f13773c;
                this.f13773c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f13774s;
                this.f13774s = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder d10 = a.a.d("Nesting too deep at ");
                d10.append(getPath());
                throw new a(d10.toString());
            }
        }
        int[] iArr3 = this.f13772b;
        int i11 = this.f13771a;
        this.f13771a = i11 + 1;
        iArr3[i11] = i;
    }

    public abstract int S(a aVar) throws IOException;

    public abstract void T() throws IOException;

    public abstract void a() throws IOException;

    public abstract void a0() throws IOException;

    public final b b0(String str) throws b {
        StringBuilder c10 = m.c(str, " at path ");
        c10.append(getPath());
        throw new b(c10.toString());
    }

    public abstract void c() throws IOException;

    public abstract void e() throws IOException;

    public abstract void f() throws IOException;

    public final String getPath() {
        int i = this.f13771a;
        int[] iArr = this.f13772b;
        String[] strArr = this.f13773c;
        int[] iArr2 = this.f13774s;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = iArr[i10];
            if (i11 == 1 || i11 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i10]);
                sb2.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb2.append('.');
                if (strArr[i10] != null) {
                    sb2.append(strArr[i10]);
                }
            }
        }
        return sb2.toString();
    }

    public abstract boolean s() throws IOException;

    public abstract boolean t() throws IOException;

    public abstract double w() throws IOException;

    public abstract int y() throws IOException;
}
