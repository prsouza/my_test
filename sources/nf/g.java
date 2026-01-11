package nf;

import p002if.b0;
import p002if.t;
import uf.h;

public final class g extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f9018b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9019c;

    /* renamed from: s  reason: collision with root package name */
    public final h f9020s;

    public g(String str, long j10, h hVar) {
        this.f9018b = str;
        this.f9019c = j10;
        this.f9020s = hVar;
    }

    public final long a() {
        return this.f9019c;
    }

    public final t c() {
        String str = this.f9018b;
        if (str != null) {
            return t.f6581f.b(str);
        }
        return null;
    }

    public final h e() {
        return this.f9020s;
    }
}
