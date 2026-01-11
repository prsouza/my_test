package l6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

public final class s2 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8022a;

    public s2(Context context) {
        this.f8022a = context;
    }

    public static String a(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
