package ub;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.o;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import java.util.List;

public final class f {
    public static final void a(View view) {
        e.D(view, "view");
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }

    public static final String b(List<String> list) {
        String str = BuildConfig.FLAVOR;
        if (list != null) {
            for (String c10 : list) {
                str = o.c(str, c10, " ");
            }
        }
        return fe.o.D1(str).toString();
    }

    public static final Spanned c(String str) {
        e.D(str, "text");
        if (Build.VERSION.SDK_INT >= 24) {
            Spanned fromHtml = Html.fromHtml(str, 0);
            e.C(fromHtml, "{\n        Html.fromHtml(…M_HTML_MODE_LEGACY)\n    }");
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(str);
        e.C(fromHtml2, "fromHtml(text)");
        return fromHtml2;
    }

    public static final List<String> d(String str) {
        return !(str == null || str.length() == 0) ? fe.o.y1(str, new String[]{" "}) : nd.o.f8966a;
    }
}
