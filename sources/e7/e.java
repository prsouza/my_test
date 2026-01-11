package e7;

import android.content.Context;
import android.content.SharedPreferences;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences.Editor f4753a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4754b;

    public e(Context context, String str) {
        this.f4754b = str;
        this.f4753a = context.getApplicationContext().getSharedPreferences("APP_PREFS", 0).edit();
    }
}
