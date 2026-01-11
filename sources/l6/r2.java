package l6;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class r2 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ r2 f8010a = new r2();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
