package fi;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import c0.b;
import ei.f;

public final class a extends d<Activity> {
    public a(Activity activity) {
        super(activity);
    }

    public final void a(int i, String... strArr) {
        b.b((Activity) this.f5200a, strArr, i);
    }

    public final Context b() {
        return (Context) this.f5200a;
    }

    public final boolean c(String str) {
        int i = b.f3053c;
        return ((Activity) this.f5200a).shouldShowRequestPermissionRationale(str);
    }

    public final void d(String str, String str2, String str3, int i, int i10, String... strArr) {
        FragmentManager fragmentManager = ((Activity) this.f5200a).getFragmentManager();
        if (fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof f) {
            Log.d("ActPermissionHelper", "Found existing fragment, not showing rationale.");
            return;
        }
        f fVar = new f();
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", str2);
        bundle.putString("negativeButton", str3);
        bundle.putString("rationaleMsg", str);
        bundle.putInt("theme", i);
        bundle.putInt("requestCode", i10);
        bundle.putStringArray("permissions", strArr);
        fVar.setArguments(bundle);
        fVar.a(fragmentManager);
    }
}
