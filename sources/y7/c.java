package y7;

import c8.f;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f13497c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final f f13498a;

    /* renamed from: b  reason: collision with root package name */
    public a f13499b = f13497c;

    public static final class a implements a {
        public final void a() {
        }

        public final String b() {
            return null;
        }

        public final void c(long j10, String str) {
        }
    }

    public c(f fVar) {
        this.f13498a = fVar;
    }

    public final void a(String str) {
        this.f13499b.a();
        this.f13499b = f13497c;
        if (str != null) {
            this.f13499b = new h(this.f13498a.f(str, "userlog"));
        }
    }

    public c(f fVar, String str) {
        this.f13498a = fVar;
        a(str);
    }
}
