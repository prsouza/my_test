package io.nodle.cash.ui.viewmodel;

import androidx.lifecycle.u0;
import c3.k;
import e6.e;
import gb.c;
import je.i;
import je.n;
import je.o;
import qa.f;
import ya.b;

public final class LauncherViewModel extends u0 {

    /* renamed from: c  reason: collision with root package name */
    public final f f6790c;

    /* renamed from: s  reason: collision with root package name */
    public final b f6791s;

    /* renamed from: t  reason: collision with root package name */
    public final String f6792t = "LauncherViewModel";

    /* renamed from: u  reason: collision with root package name */
    public String f6793u;

    /* renamed from: v  reason: collision with root package name */
    public final String f6794v;

    /* renamed from: w  reason: collision with root package name */
    public final o f6795w;

    /* renamed from: x  reason: collision with root package name */
    public final n<c> f6796x;

    public LauncherViewModel(f fVar, b bVar) {
        e.D(bVar, "analytics");
        this.f6790c = fVar;
        this.f6791s = bVar;
        this.f6793u = fVar.c(qa.e.NODLE_PUBLIC_KEY_4);
        this.f6794v = fVar.c(qa.e.NODLE_PUBLIC_KEY_5);
        o oVar = new o(new c((gb.b) null, 1, (k) null));
        this.f6795w = oVar;
        this.f6796x = new i(oVar);
    }
}
