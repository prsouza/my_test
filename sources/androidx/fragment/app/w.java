package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import c3.k;

public abstract class w<E> extends t {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f2009a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2010b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f2011c;

    /* renamed from: s  reason: collision with root package name */
    public final b0 f2012s = new b0();

    public w(r rVar) {
        Handler handler = new Handler();
        this.f2009a = rVar;
        k.S(rVar, "context == null");
        this.f2010b = rVar;
        this.f2011c = handler;
    }

    public abstract E d();

    public abstract LayoutInflater e();

    public abstract boolean f(String str);

    public abstract void g();
}
