package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o0 f1939a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1940b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Rect f1941c;

    public j(o0 o0Var, View view, Rect rect) {
        this.f1939a = o0Var;
        this.f1940b = view;
        this.f1941c = rect;
    }

    public final void run() {
        this.f1939a.g(this.f1940b, this.f1941c);
    }
}
