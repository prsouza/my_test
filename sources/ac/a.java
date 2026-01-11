package ac;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import io.nodle.cash.R;
import io.nodle.sdk.NodleContext;
import pd.f;

public final class a implements NodleContext {

    /* renamed from: a  reason: collision with root package name */
    public final Context f289a;

    /* renamed from: b  reason: collision with root package name */
    public final m2.a f290b;

    /* renamed from: c  reason: collision with root package name */
    public final String f291c;

    /* renamed from: d  reason: collision with root package name */
    public final String f292d;

    /* renamed from: e  reason: collision with root package name */
    public final String f293e = Build.MODEL;

    /* renamed from: f  reason: collision with root package name */
    public final String f294f = "Android";
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final String f295h;
    public final String i;

    public a(Context context, m2.a aVar) {
        e.D(context, "context");
        this.f289a = context;
        this.f290b = aVar;
        String string = context.getString(R.string.gitSHA);
        e.C(string, "context.getString(R.string.gitSHA)");
        this.f291c = string;
        this.f292d = ye.a.a(context);
        ye.a.d(context);
        String str = Build.VERSION.RELEASE;
        e.C(str, "RELEASE");
        this.g = str;
        this.f295h = String.valueOf(Build.VERSION.SDK_INT);
        String str2 = Build.HARDWARE;
        e.C(str2, "HARDWARE");
        this.i = str2;
    }

    public final Integer batteryLevel() {
        return ye.a.c(this.f289a);
    }

    public final f coroutineName(String str) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new b(str, this);
    }

    public final String getApplicationName() {
        return this.f292d;
    }

    public final String getGitSHA() {
        return this.f291c;
    }

    public final String getHardware() {
        return this.i;
    }

    public final String getOsLevel() {
        return this.f295h;
    }

    public final String getOsRelease() {
        return this.g;
    }

    public final String getOsVersion() {
        return this.f294f;
    }

    public final String getPhoneModel() {
        return this.f293e;
    }

    public final m2.a getSdkConfig() {
        return this.f290b;
    }
}
