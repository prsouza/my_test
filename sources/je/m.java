package je;

import ke.b;
import pd.d;

public final class m extends b<l<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f7230a = -1;

    /* renamed from: b  reason: collision with root package name */
    public d<? super md.m> f7231b;

    public final boolean a(Object obj) {
        l lVar = (l) obj;
        if (this.f7230a >= 0) {
            return false;
        }
        long j10 = lVar.f7215w;
        if (j10 < lVar.f7216x) {
            lVar.f7216x = j10;
        }
        this.f7230a = j10;
        return true;
    }

    public final d[] b(Object obj) {
        long j10 = this.f7230a;
        this.f7230a = -1;
        this.f7231b = null;
        return ((l) obj).t(j10);
    }
}
