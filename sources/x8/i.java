package x8;

import java.util.concurrent.Executor;

public final /* synthetic */ class i implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ i f13055b = new i(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ i f13056c = new i(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13057a;

    public /* synthetic */ i(int i) {
        this.f13057a = i;
    }

    public final void execute(Runnable runnable) {
        switch (this.f13057a) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
