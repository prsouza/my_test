package e2;

import a8.a;
import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;
import u1.p;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4557a = p.e("WakeLocks");

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f4558b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        String c10 = a.c("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, c10);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f4558b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, c10);
        }
        return newWakeLock;
    }
}
