package x7;

import java.util.concurrent.Callable;
import y7.c;

public final class r implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f12975a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12976b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f12977c;

    public r(q qVar, long j10, String str) {
        this.f12977c = qVar;
        this.f12975a = j10;
        this.f12976b = str;
    }

    public final Object call() throws Exception {
        if (this.f12977c.g()) {
            return null;
        }
        c cVar = this.f12977c.i;
        cVar.f13499b.c(this.f12975a, this.f12976b);
        return null;
    }
}
