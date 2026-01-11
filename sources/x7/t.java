package x7;

import java.util.concurrent.Callable;

public final class t implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12982a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f12983b;

    public t(q qVar, String str) {
        this.f12983b = qVar;
        this.f12982a = str;
    }

    public final Object call() throws Exception {
        q.a(this.f12983b, this.f12982a);
        return null;
    }
}
