package x8;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.github.mikephil.charting.BuildConfig;
import h1.v;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f13050a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13051b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13052c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<String> f13053d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public final Executor f13054e;

    public h0(SharedPreferences sharedPreferences, Executor executor) {
        this.f13050a = sharedPreferences;
        this.f13051b = "topic_operation_queue";
        this.f13052c = ",";
        this.f13054e = executor;
    }

    public static h0 b(SharedPreferences sharedPreferences, Executor executor) {
        h0 h0Var = new h0(sharedPreferences, executor);
        synchronized (h0Var.f13053d) {
            h0Var.f13053d.clear();
            String string = h0Var.f13050a.getString(h0Var.f13051b, BuildConfig.FLAVOR);
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(h0Var.f13052c)) {
                    String[] split = string.split(h0Var.f13052c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            h0Var.f13053d.add(str);
                        }
                    }
                }
            }
        }
        return h0Var;
    }

    public final boolean a(String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.f13052c)) {
            return false;
        }
        synchronized (this.f13053d) {
            add = this.f13053d.add(str);
            if (add) {
                this.f13054e.execute(new v(this, 1));
            }
        }
        return add;
    }
}
