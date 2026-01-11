package dagger.hilt.android.internal.managers;

import fb.g;
import fb.h;
import m9.a;
import n9.b;

public final class d implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile g f4415a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4416b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final e f4417c;

    public d(e eVar) {
        this.f4417c = eVar;
    }

    public final Object a() {
        if (this.f4415a == null) {
            synchronized (this.f4416b) {
                if (this.f4415a == null) {
                    this.f4415a = new g(new a(h.this));
                }
            }
        }
        return this.f4415a;
    }
}
