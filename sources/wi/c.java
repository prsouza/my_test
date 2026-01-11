package wi;

import e6.e;

public final class c extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final a f12706a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(a aVar, String str) {
        super(str);
        e.D(aVar, "err");
        e.D(str, "msg");
        this.f12706a = aVar;
    }
}
