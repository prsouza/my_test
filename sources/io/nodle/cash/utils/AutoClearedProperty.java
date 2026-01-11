package io.nodle.cash.utils;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.a0;
import androidx.lifecycle.o;
import de.h;
import e6.e;
import md.m;
import s1.a;
import xd.l;

public final class AutoClearedProperty<T extends a> implements o {

    /* renamed from: a  reason: collision with root package name */
    public l<? super T, m> f6839a;

    /* renamed from: b  reason: collision with root package name */
    public T f6840b;

    public AutoClearedProperty() {
        this.f6839a = null;
    }

    public final void a(a0 a0Var) {
        l<? super T, m> lVar;
        T t10 = this.f6840b;
        if (!(t10 == null || (lVar = this.f6839a) == null)) {
            lVar.k(t10);
        }
        this.f6839a = null;
        this.f6840b = null;
    }

    public final /* synthetic */ void b() {
    }

    public final /* synthetic */ void d() {
    }

    public final /* synthetic */ void e() {
    }

    public final T f(Fragment fragment, h<?> hVar) {
        e.D(fragment, "thisRef");
        e.D(hVar, "property");
        T t10 = this.f6840b;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Can't access ViewBinding after it has already been cleared. Please take a look at AutoClearedProperty class to learn more.");
    }

    public final /* synthetic */ void g() {
    }

    public final void h(Fragment fragment, h<?> hVar, T t10) {
        e.D(fragment, "thisRef");
        e.D(hVar, "property");
        fragment.getViewLifecycleOwner().getLifecycle().a(this);
        this.f6840b = t10;
    }

    public final /* synthetic */ void onStop() {
    }

    public AutoClearedProperty(l<? super T, m> lVar) {
        this.f6839a = lVar;
    }
}
