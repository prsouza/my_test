package h1;

import a8.c;
import a9.f;
import android.content.Context;
import android.os.Build;
import android.util.JsonReader;
import com.github.mikephil.charting.BuildConfig;
import q.a;

public final /* synthetic */ class e implements a, f.a, c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ e f5672a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ e f5673b = new e();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ e f5674c = new e();

    public static void b(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public Object a(JsonReader jsonReader) {
        return c.d(jsonReader);
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((l1.a) obj).M());
    }

    public String c(Object obj) {
        Context context = (Context) obj;
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? BuildConfig.FLAVOR : "embedded";
    }
}
