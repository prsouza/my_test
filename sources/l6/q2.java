package l6;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class q2 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ q2 f7999a = new q2();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
