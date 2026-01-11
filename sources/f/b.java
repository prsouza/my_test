package f;

import android.content.Context;
import android.content.Intent;
import f.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b extends a<String[], Map<String, Boolean>> {
    public final Intent a(Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
    }

    public final a.C0073a b(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || strArr.length == 0) {
            return new a.C0073a(Collections.emptyMap());
        }
        s.a aVar = new s.a();
        boolean z = true;
        for (String str : strArr) {
            boolean z10 = d0.a.a(context, str) == 0;
            aVar.put(str, Boolean.valueOf(z10));
            if (!z10) {
                z = false;
            }
        }
        if (z) {
            return new a.C0073a(aVar);
        }
        return null;
    }

    public final Object c(int i, Intent intent) {
        if (i != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int length = stringArrayExtra.length;
        for (int i10 = 0; i10 < length; i10++) {
            hashMap.put(stringArrayExtra[i10], Boolean.valueOf(intArrayExtra[i10] == 0));
        }
        return hashMap;
    }
}
