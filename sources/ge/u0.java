package ge;

import java.util.Objects;
import le.a;
import nd.d;

public abstract class u0 extends z {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f5452t = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f5453b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5454c;

    /* renamed from: s  reason: collision with root package name */
    public a<m0<?>> f5455s;

    public final boolean A0() {
        return this.f5453b >= x0(true);
    }

    public long B0() {
        return !C0() ? Long.MAX_VALUE : 0;
    }

    public final boolean C0() {
        a<m0<?>> aVar = this.f5455s;
        if (aVar == null) {
            return false;
        }
        int i = aVar.f8231b;
        Object obj = null;
        if (i != aVar.f8232c) {
            Object[] objArr = aVar.f8230a;
            Object obj2 = objArr[i];
            objArr[i] = null;
            aVar.f8231b = (i + 1) & (objArr.length - 1);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            obj = obj2;
        }
        m0 m0Var = (m0) obj;
        if (m0Var == null) {
            return false;
        }
        m0Var.run();
        return true;
    }

    public void shutdown() {
    }

    public final void w0(boolean z) {
        long x02 = this.f5453b - x0(z);
        this.f5453b = x02;
        if (x02 <= 0 && this.f5454c) {
            shutdown();
        }
    }

    public final long x0(boolean z) {
        return z ? 4294967296L : 1;
    }

    public final void y0(m0<?> m0Var) {
        a<m0<?>> aVar = this.f5455s;
        if (aVar == null) {
            aVar = new a<>();
            this.f5455s = aVar;
        }
        Object[] objArr = aVar.f8230a;
        int i = aVar.f8232c;
        objArr[i] = m0Var;
        int length = (objArr.length - 1) & (i + 1);
        aVar.f8232c = length;
        int i10 = aVar.f8231b;
        if (length == i10) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            d.G(objArr, objArr2, 0, i10, 0, 10);
            Object[] objArr3 = aVar.f8230a;
            int length3 = objArr3.length;
            int i11 = aVar.f8231b;
            d.G(objArr3, objArr2, length3 - i11, 0, i11, 4);
            aVar.f8230a = objArr2;
            aVar.f8231b = 0;
            aVar.f8232c = length2;
        }
    }

    public final void z0(boolean z) {
        this.f5453b = x0(z) + this.f5453b;
        if (!z) {
            this.f5454c = true;
        }
    }
}
