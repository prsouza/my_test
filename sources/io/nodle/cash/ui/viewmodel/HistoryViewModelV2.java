package io.nodle.cash.ui.viewmodel;

import ah.v;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.u0;
import bb.g;
import e6.e;
import ge.v1;
import java.util.List;
import je.i;
import je.n;
import je.o;
import sa.b;
import ua.f;

public final class HistoryViewModelV2 extends u0 {
    public final LiveData<String> A;
    public v1 B;

    /* renamed from: c  reason: collision with root package name */
    public final Context f6757c;

    /* renamed from: s  reason: collision with root package name */
    public final f f6758s;

    /* renamed from: t  reason: collision with root package name */
    public final int f6759t = 100;

    /* renamed from: u  reason: collision with root package name */
    public final String f6760u;

    /* renamed from: v  reason: collision with root package name */
    public g f6761v;

    /* renamed from: w  reason: collision with root package name */
    public final o f6762w;

    /* renamed from: x  reason: collision with root package name */
    public final n<List<b>> f6763x;

    /* renamed from: y  reason: collision with root package name */
    public final j0<Boolean> f6764y;
    public final LiveData<Boolean> z;

    public enum a {
        NONE
    }

    public HistoryViewModelV2(Context context, f fVar) {
        e.D(fVar, "transactionRepository");
        this.f6757c = context;
        this.f6758s = fVar;
        this.f6760u = v.J(context, qa.e.NODLE_PUBLIC_KEY_4);
        v.J(context, qa.e.NODLE_PUBLIC_KEY_5);
        this.f6761v = g.NONE;
        o oVar = new o(nd.o.f8966a);
        this.f6762w = oVar;
        this.f6763x = new i(oVar);
        j0<Boolean> j0Var = new j0<>(Boolean.FALSE);
        this.f6764y = j0Var;
        j0 j0Var2 = new j0(null);
        new j0(a.NONE);
        this.z = j0Var;
        this.A = j0Var2;
    }
}
