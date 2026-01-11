package ke;

import e6.e;
import java.util.Arrays;
import ke.b;
import md.m;
import pd.d;

public abstract class a<S extends b<?>> {

    /* renamed from: a  reason: collision with root package name */
    public S[] f7502a;

    /* renamed from: b  reason: collision with root package name */
    public int f7503b;

    /* renamed from: c  reason: collision with root package name */
    public int f7504c;

    public final S c() {
        S s10;
        synchronized (this) {
            S[] sArr = this.f7502a;
            if (sArr == null) {
                sArr = e();
                this.f7502a = sArr;
            } else if (this.f7503b >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                e.C(copyOf, "copyOf(this, newSize)");
                this.f7502a = (b[]) copyOf;
                sArr = (b[]) copyOf;
            }
            int i = this.f7504c;
            do {
                s10 = sArr[i];
                if (s10 == null) {
                    s10 = d();
                    sArr[i] = s10;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s10.a(this));
            this.f7504c = i;
            this.f7503b++;
        }
        return s10;
    }

    public abstract S d();

    public abstract b[] e();

    public final void f(S s10) {
        int i;
        d[] b10;
        synchronized (this) {
            int i10 = this.f7503b - 1;
            this.f7503b = i10;
            i = 0;
            if (i10 == 0) {
                this.f7504c = 0;
            }
            b10 = s10.b(this);
        }
        int length = b10.length;
        while (i < length) {
            d dVar = b10[i];
            i++;
            if (dVar != null) {
                dVar.resumeWith(m.f8555a);
            }
        }
    }
}
