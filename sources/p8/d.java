package p8;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class d implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f9715a = new d();

    public final Thread newThread(Runnable runnable) {
        int i = g.f9719f;
        return new Thread(runnable, "heartbeat-information-executor");
    }
}
