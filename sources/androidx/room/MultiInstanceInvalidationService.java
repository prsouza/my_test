package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import h1.p;
import h1.q;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public int f2597a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<Integer, String> f2598b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final RemoteCallbackList<p> f2599c = new a();

    /* renamed from: s  reason: collision with root package name */
    public final b f2600s = new b();

    public class a extends RemoteCallbackList<p> {
        public a() {
        }

        public final void onCallbackDied(IInterface iInterface, Object obj) {
            p pVar = (p) iInterface;
            MultiInstanceInvalidationService.this.f2598b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    public class b extends q {
        public b() {
        }

        public final void m(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f2599c) {
                String str = MultiInstanceInvalidationService.this.f2598b.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f2599c.beginBroadcast();
                for (int i10 = 0; i10 < beginBroadcast; i10++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f2599c.getBroadcastCookie(i10)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f2598b.get(Integer.valueOf(intValue));
                        if (i != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.f2599c.getBroadcastItem(i10).g(strArr);
                        }
                    } catch (RemoteException e10) {
                        Log.w("ROOM", "Error invoking a remote callback", e10);
                    } catch (Throwable th2) {
                        MultiInstanceInvalidationService.this.f2599c.finishBroadcast();
                        throw th2;
                    }
                }
                MultiInstanceInvalidationService.this.f2599c.finishBroadcast();
            }
        }

        public final int n(p pVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f2599c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f2597a + 1;
                multiInstanceInvalidationService.f2597a = i;
                if (multiInstanceInvalidationService.f2599c.register(pVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f2598b.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f2597a--;
                return 0;
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f2600s;
    }
}
