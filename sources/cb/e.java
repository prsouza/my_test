package cb;

import android.app.Application;
import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import c0.l;
import c0.m;
import c3.k;
import com.github.mikephil.charting.BuildConfig;
import ge.g;
import ge.o0;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.LauncherActivity;
import io.nodle.cash.ui.view.activity.comm.NotificationsActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import pd.d;
import pd.f;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f3332a = new e();

    public final int a() {
        String format = new SimpleDateFormat("MMddHHmmss", Locale.US).format(new Date());
        e6.e.C(format, "SimpleDateFormat(\"MMddHH…Locale.US).format(Date())");
        return Integer.parseInt(format);
    }

    public final JSONObject b(Map<String, ? extends Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String next : map.keySet()) {
            Object obj = map.get(next);
            if (obj instanceof Map) {
                obj = b((Map) obj);
            }
            jSONObject.put(next, obj);
        }
        return jSONObject;
    }

    public final void c(Context context, Map<String, String> map) {
        e6.e.D(context, "cxt");
        int a10 = a();
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Log.d("e", "saveToLocalDB data: " + map);
        g.b(k.j(o0.f5433a), (f) null, new d(map, a10, (Application) applicationContext, (d<? super d>) null), 3);
        String str = map.get("nodle.v1.title");
        if (str == null || str.length() == 0) {
            str = context.getString(R.string.app_name);
        }
        m mVar = new m(context, a.GENERAL.getId());
        mVar.f3102t.icon = 2131165408;
        mVar.f(str);
        String str2 = BuildConfig.FLAVOR;
        String str3 = map.get("nodle.v1.body");
        if (str3 == null) {
            str3 = str2;
        }
        mVar.e(str3);
        l lVar = new l();
        String str4 = map.get("nodle.v1.body");
        if (str4 != null) {
            str2 = str4;
        }
        lVar.l(str2);
        mVar.i(lVar);
        mVar.f3092j = 0;
        Intent intent = new Intent(context, LauncherActivity.class);
        Intent intent2 = new Intent(context, NotificationsActivity.class);
        TaskStackBuilder create = TaskStackBuilder.create(context);
        create.addNextIntent(intent);
        create.addNextIntent(intent2);
        mVar.g = create.getPendingIntent(0, 134217728);
        mVar.d(true);
        Notification a11 = mVar.a();
        e6.e.C(a11, "Builder(cxt, Channel.GEN…\n                .build()");
        c.d(a11, context, a10);
    }
}
