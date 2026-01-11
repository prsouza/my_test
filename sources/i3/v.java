package i3;

import d4.a;
import d4.d;
import java.util.Objects;
import m0.c;

public final class v<Z> implements w<Z>, a.d {

    /* renamed from: t  reason: collision with root package name */
    public static final c<v<?>> f6154t = ((a.c) d4.a.a(20, new a()));

    /* renamed from: a  reason: collision with root package name */
    public final d.a f6155a = new d.a();

    /* renamed from: b  reason: collision with root package name */
    public w<Z> f6156b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6157c;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6158s;

    public class a implements a.b<v<?>> {
        public final Object a() {
            return new v();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [d4.a$c, m0.c<i3.v<?>>] */
    public static <Z> v<Z> a(w<Z> wVar) {
        v<Z> vVar = (v) f6154t.b();
        Objects.requireNonNull(vVar, "Argument must not be null");
        vVar.f6158s = false;
        vVar.f6157c = true;
        vVar.f6156b = wVar;
        return vVar;
    }

    public final int b() {
        return this.f6156b.b();
    }

    public final Class<Z> c() {
        return this.f6156b.c();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [d4.a$c, m0.c<i3.v<?>>] */
    public final synchronized void d() {
        this.f6155a.a();
        this.f6158s = true;
        if (!this.f6157c) {
            this.f6156b.d();
            this.f6156b = null;
            f6154t.a(this);
        }
    }

    public final synchronized void e() {
        this.f6155a.a();
        if (this.f6157c) {
            this.f6157c = false;
            if (this.f6158s) {
                d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public final Z get() {
        return this.f6156b.get();
    }

    public final d h() {
        return this.f6155a;
    }
}
