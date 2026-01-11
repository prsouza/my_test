package i3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6176a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6177b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((w) message.obj).d();
            return true;
        }
    }

    public final synchronized void a(w<?> wVar, boolean z) {
        if (!this.f6176a) {
            if (!z) {
                this.f6176a = true;
                wVar.d();
                this.f6176a = false;
            }
        }
        this.f6177b.obtainMessage(1, wVar).sendToTarget();
    }
}
