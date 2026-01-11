package ag;

import java.io.IOException;
import java.util.Arrays;
import yh.c;

public abstract class a extends s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f366a;

    /* renamed from: b  reason: collision with root package name */
    public final int f367b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f368c;

    public a(boolean z, int i, byte[] bArr) {
        this.f366a = z;
        this.f367b = i;
        this.f368c = xh.a.a(bArr);
    }

    public final int hashCode() {
        return (this.f366a ^ this.f367b) ^ xh.a.e(this.f368c) ? 1 : 0;
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof a)) {
            return false;
        }
        a aVar = (a) sVar;
        return this.f366a == aVar.f366a && this.f367b == aVar.f367b && Arrays.equals(this.f368c, aVar.f368c);
    }

    public void k(q qVar, boolean z) throws IOException {
        qVar.g(z, this.f366a ? 96 : 64, this.f367b, this.f368c);
    }

    public final int l() throws IOException {
        return v1.a(this.f368c.length) + v1.b(this.f367b) + this.f368c.length;
    }

    public final boolean o() {
        return this.f366a;
    }

    public final String toString() {
        String str;
        StringBuffer c10 = a.a.c("[");
        if (this.f366a) {
            c10.append("CONSTRUCTED ");
        }
        c10.append("APPLICATION ");
        c10.append(Integer.toString(this.f367b));
        c10.append("]");
        if (this.f368c != null) {
            c10.append(" #");
            str = c.c(this.f368c);
        } else {
            str = " #null";
        }
        c10.append(str);
        c10.append(" ");
        return c10.toString();
    }
}
