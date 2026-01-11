package h1;

import com.google.firebase.messaging.FirebaseMessaging;
import h1.u;
import java.util.Arrays;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5763a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5764b;

    public /* synthetic */ t(Object obj, int i) {
        this.f5763a = i;
        this.f5764b = obj;
    }

    public final void run() {
        switch (this.f5763a) {
            case 0:
                u uVar = (u) this.f5764b;
                synchronized (uVar) {
                    uVar.f5771f = false;
                    u.b bVar = uVar.f5772h;
                    synchronized (bVar) {
                        Arrays.fill(bVar.f5777b, false);
                        bVar.f5779d = true;
                    }
                }
                return;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f5764b;
                if (firebaseMessaging.g.b()) {
                    firebaseMessaging.g();
                    return;
                }
                return;
        }
    }
}
