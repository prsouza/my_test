package p9;

import a.b;
import aa.c;
import i2.m;
import i2.p;
import i2.r;
import i2.s;
import i2.u;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class f extends c {
    public static final a D = new a();
    public static final u E = new u("closed");
    public final List<p> A = new ArrayList();
    public String B;
    public p C = r.f6004a;

    public class a extends Writer {
        public final void close() {
            throw new AssertionError();
        }

        public final void flush() {
            throw new AssertionError();
        }

        public final void write(char[] cArr, int i, int i10) {
            throw new AssertionError();
        }
    }

    public f() {
        super(D);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<i2.p>, java.util.ArrayList] */
    public final c B() {
        m mVar = new m();
        w0(mVar);
        this.A.add(mVar);
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<i2.p>, java.util.ArrayList] */
    public final c R() {
        s sVar = new s();
        w0(sVar);
        this.A.add(sVar);
        return this;
    }

    public final c S(String str) {
        if (str == null) {
            w0(r.f6004a);
            return this;
        }
        w0(new u(str));
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<i2.p>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.List, java.util.List<i2.p>, java.util.ArrayList] */
    public final c T() {
        if (this.A.isEmpty() || this.B != null) {
            throw new IllegalStateException();
        } else if (y0() instanceof m) {
            ? r02 = this.A;
            r02.remove(r02.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<i2.p>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.List, java.util.List<i2.p>, java.util.ArrayList] */
    public final c a0() {
        if (this.A.isEmpty() || this.B != null) {
            throw new IllegalStateException();
        } else if (y0() instanceof s) {
            ? r02 = this.A;
            r02.remove(r02.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final c c(long j10) {
        w0(new u((Number) Long.valueOf(j10)));
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<i2.p>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<i2.p>, java.util.ArrayList] */
    public final void close() {
        if (this.A.isEmpty()) {
            this.A.add(E);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final c e(Boolean bool) {
        if (bool == null) {
            w0(r.f6004a);
            return this;
        }
        w0(new u(bool));
        return this;
    }

    public final c f(Number number) {
        if (number == null) {
            w0(r.f6004a);
            return this;
        }
        if (!this.f205u) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w0(new u(number));
        return this;
    }

    public final c f0() {
        w0(r.f6004a);
        return this;
    }

    public final void flush() {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<i2.p>, java.util.ArrayList] */
    public final c s(String str) {
        if (this.A.isEmpty() || this.B != null) {
            throw new IllegalStateException();
        } else if (y0() instanceof s) {
            this.B = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final c t(boolean z) {
        w0(new u(Boolean.valueOf(z)));
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<i2.p>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<i2.p>, java.util.ArrayList] */
    public final void w0(p pVar) {
        if (this.B != null) {
            if (!(pVar instanceof r) || this.f208x) {
                ((s) y0()).g(this.B, pVar);
            }
            this.B = null;
        } else if (this.A.isEmpty()) {
            this.C = pVar;
        } else {
            p y02 = y0();
            if (y02 instanceof m) {
                ((m) y02).f6003a.add(pVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<i2.p>, java.util.ArrayList] */
    public final p x0() {
        if (this.A.isEmpty()) {
            return this.C;
        }
        StringBuilder q10 = b.q("Expected one JSON element but was ");
        q10.append(this.A);
        throw new IllegalStateException(q10.toString());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List, java.util.List<i2.p>, java.util.ArrayList] */
    public final p y0() {
        ? r02 = this.A;
        return (p) r02.get(r02.size() - 1);
    }
}
