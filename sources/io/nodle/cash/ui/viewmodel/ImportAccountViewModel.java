package io.nodle.cash.ui.viewmodel;

import android.util.Log;
import androidx.lifecycle.u0;
import c3.k;
import e6.e;
import gb.a;
import java.util.HashMap;
import je.i;
import je.n;
import je.o;
import ya.b;

public final class ImportAccountViewModel extends u0 {

    /* renamed from: c  reason: collision with root package name */
    public final b f6783c;

    /* renamed from: s  reason: collision with root package name */
    public final String f6784s = "ImportAccountViewModel";

    /* renamed from: t  reason: collision with root package name */
    public final int f6785t = 12;

    /* renamed from: u  reason: collision with root package name */
    public int f6786u;

    /* renamed from: v  reason: collision with root package name */
    public final HashMap<Integer, String> f6787v = new HashMap<>();

    /* renamed from: w  reason: collision with root package name */
    public final o f6788w;

    /* renamed from: x  reason: collision with root package name */
    public final n<a> f6789x;

    public ImportAccountViewModel(b bVar) {
        e.D(bVar, "analytics");
        this.f6783c = bVar;
        o oVar = new o(new a(false, 1, (k) null));
        this.f6788w = oVar;
        this.f6789x = new i(oVar);
    }

    public final void i(String str) {
        e.D(str, "currentWord");
        Log.d(this.f6784s, "position:" + this.f6786u + "    inputStr:" + fe.o.D1(str).toString());
        int i = this.f6785t;
        int i10 = this.f6786u;
        boolean z = false;
        if (1 <= i10 && i10 <= i) {
            z = true;
        }
        if (z) {
            this.f6787v.put(Integer.valueOf(i10), fe.o.D1(str).toString());
        }
    }
}
