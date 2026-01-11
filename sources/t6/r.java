package t6;

import java.util.concurrent.CountDownLatch;

public final class r implements c, b {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f11427a = new CountDownLatch(1);

    public final void onFailure(Exception exc) {
        this.f11427a.countDown();
    }

    public final void onSuccess(Object obj) {
        this.f11427a.countDown();
    }
}
