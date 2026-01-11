package f6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f5003c;

    /* renamed from: a  reason: collision with root package name */
    public final Object f5004a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5005b = new Handler(Looper.getMainLooper(), new C0079a());

    /* renamed from: f6.a$a  reason: collision with other inner class name */
    public class C0079a implements Handler.Callback {
        public C0079a() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            b bVar = (b) message.obj;
            synchronized (aVar.f5004a) {
                if (bVar == null || bVar == null) {
                    Objects.requireNonNull(bVar);
                    throw null;
                }
            }
            return true;
        }
    }

    public static class b {
    }

    public static a a() {
        if (f5003c == null) {
            f5003c = new a();
        }
        return f5003c;
    }
}
