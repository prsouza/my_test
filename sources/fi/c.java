package fi;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.a0;
import ei.g;

public abstract class c<T> extends d<T> {
    public c(T t10) {
        super(t10);
    }

    public final void d(String str, String str2, String str3, int i, int i10, String... strArr) {
        a0 e10 = e();
        if (e10.F("RationaleDialogFragmentCompat") instanceof g) {
            Log.d("BSPermissionsHelper", "Found existing fragment, not showing rationale.");
            return;
        }
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", str2);
        bundle.putString("negativeButton", str3);
        bundle.putString("rationaleMsg", str);
        bundle.putInt("theme", i);
        bundle.putInt("requestCode", i10);
        bundle.putStringArray("permissions", strArr);
        gVar.setArguments(bundle);
        if (!e10.O()) {
            gVar.show(e10, "RationaleDialogFragmentCompat");
        }
    }

    public abstract a0 e();
}
