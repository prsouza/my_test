package l0;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

public final class b {
    public static Spanned a(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }
}
