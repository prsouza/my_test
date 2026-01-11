package androidx.lifecycle;

import e6.e;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f2125a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f2126b;

    public /* synthetic */ j(k kVar, Runnable runnable) {
        this.f2125a = kVar;
        this.f2126b = runnable;
    }

    public final void run() {
        k kVar = this.f2125a;
        Runnable runnable = this.f2126b;
        e.D(kVar, "this$0");
        e.D(runnable, "$runnable");
        kVar.c(runnable);
    }
}
