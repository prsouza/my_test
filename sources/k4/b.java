package k4;

import n4.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7437a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7438b;

    /* renamed from: c  reason: collision with root package name */
    public final a f7439c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f7440d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f7441e;

    /* renamed from: f  reason: collision with root package name */
    public char[] f7442f;

    public b(a aVar, Object obj, boolean z) {
        this.f7439c = aVar;
        this.f7437a = obj;
        this.f7438b = z;
    }

    public final void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }
}
