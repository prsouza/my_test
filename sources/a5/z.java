package a5;

import a5.a0;
import a9.f;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import com.github.mikephil.charting.BuildConfig;

public final /* synthetic */ class z implements a0.a, f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ z f132a = new z();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ z f133b = new z();

    public final Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }

    public final String c(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : BuildConfig.FLAVOR;
    }
}
