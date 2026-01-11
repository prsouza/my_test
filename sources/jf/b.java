package jf;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f7248a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f7249b;

    public b(String str, boolean z) {
        this.f7248a = str;
        this.f7249b = z;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f7248a);
        thread.setDaemon(this.f7249b);
        return thread;
    }
}
