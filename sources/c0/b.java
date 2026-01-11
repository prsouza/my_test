package c0;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Arrays;

public final class b extends d0.a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f3053c = 0;

    public interface a {
        void validateRequestPermissionsRequestCode(int i);
    }

    public static void b(Activity activity, String[] strArr, int i) {
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (!TextUtils.isEmpty(strArr[i10])) {
                i10++;
            } else {
                throw new IllegalArgumentException(android.support.v4.media.a.e(a.a.d("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        if (activity instanceof a) {
            ((a) activity).validateRequestPermissionsRequestCode(i);
        }
        activity.requestPermissions(strArr, i);
    }
}
