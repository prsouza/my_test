package aa;

import a.b;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public class c implements Closeable, Flushable {

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f199y = new String[128];
    public static final String[] z;

    /* renamed from: a  reason: collision with root package name */
    public final Writer f200a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f201b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    public int f202c = 0;

    /* renamed from: s  reason: collision with root package name */
    public String f203s;

    /* renamed from: t  reason: collision with root package name */
    public String f204t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f205u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f206v;

    /* renamed from: w  reason: collision with root package name */
    public String f207w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f208x;

    static {
        for (int i = 0; i <= 31; i++) {
            f199y[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f199y;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        z = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        y(6);
        this.f204t = ":";
        this.f208x = true;
        Objects.requireNonNull(writer, "out == null");
        this.f200a = writer;
    }

    public c B() {
        v0();
        w();
        y(1);
        this.f200a.write(91);
        return this;
    }

    public final void E(int i) {
        this.f201b[this.f202c - 1] = i;
    }

    public final void O(String str) {
        String str2;
        String[] strArr = this.f206v ? z : f199y;
        this.f200a.write(34);
        int length = str.length();
        int i = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i10) {
                this.f200a.write(str, i, i10 - i);
            }
            this.f200a.write(str2);
            i = i10 + 1;
        }
        if (i < length) {
            this.f200a.write(str, i, length - i);
        }
        this.f200a.write(34);
    }

    public c R() {
        v0();
        w();
        y(3);
        this.f200a.write(123);
        return this;
    }

    public c S(String str) {
        if (str == null) {
            return f0();
        }
        v0();
        w();
        O(str);
        return this;
    }

    public c T() {
        a(1, 2, ']');
        return this;
    }

    public final c a(int i, int i10, char c10) {
        int p02 = p0();
        if (p02 != i10 && p02 != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f207w == null) {
            this.f202c--;
            if (p02 == i10) {
                b0();
            }
            this.f200a.write(c10);
            return this;
        } else {
            StringBuilder q10 = b.q("Dangling name: ");
            q10.append(this.f207w);
            throw new IllegalStateException(q10.toString());
        }
    }

    public c a0() {
        a(3, 5, MessageFormatter.DELIM_STOP);
        return this;
    }

    public final void b0() {
        if (this.f203s != null) {
            this.f200a.write(10);
            int i = this.f202c;
            for (int i10 = 1; i10 < i; i10++) {
                this.f200a.write(this.f203s);
            }
        }
    }

    public c c(long j10) {
        v0();
        w();
        this.f200a.write(Long.toString(j10));
        return this;
    }

    public void close() {
        this.f200a.close();
        int i = this.f202c;
        if (i > 1 || (i == 1 && this.f201b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f202c = 0;
    }

    public c e(Boolean bool) {
        if (bool == null) {
            return f0();
        }
        v0();
        w();
        this.f200a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c f(Number number) {
        if (number == null) {
            return f0();
        }
        v0();
        String obj = number.toString();
        if (this.f205u || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            w();
            this.f200a.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c f0() {
        if (this.f207w != null) {
            if (this.f208x) {
                v0();
            } else {
                this.f207w = null;
                return this;
            }
        }
        w();
        this.f200a.write("null");
        return this;
    }

    public void flush() {
        if (this.f202c != 0) {
            this.f200a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final int p0() {
        int i = this.f202c;
        if (i != 0) {
            return this.f201b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c s(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f207w != null) {
            throw new IllegalStateException();
        } else if (this.f202c != 0) {
            this.f207w = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public c t(boolean z10) {
        v0();
        w();
        this.f200a.write(z10 ? "true" : "false");
        return this;
    }

    public final void v0() {
        if (this.f207w != null) {
            int p02 = p0();
            if (p02 == 5) {
                this.f200a.write(44);
            } else if (p02 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            b0();
            E(4);
            O(this.f207w);
            this.f207w = null;
        }
    }

    public final void w() {
        int p02 = p0();
        if (p02 == 1) {
            E(2);
        } else if (p02 == 2) {
            this.f200a.append(',');
        } else if (p02 != 4) {
            if (p02 != 6) {
                if (p02 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f205u) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            E(7);
            return;
        } else {
            this.f200a.append(this.f204t);
            E(5);
            return;
        }
        b0();
    }

    public final void y(int i) {
        int i10 = this.f202c;
        int[] iArr = this.f201b;
        if (i10 == iArr.length) {
            this.f201b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f201b;
        int i11 = this.f202c;
        this.f202c = i11 + 1;
        iArr2[i11] = i;
    }
}
