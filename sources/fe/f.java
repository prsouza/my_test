package fe;

import android.support.v4.media.a;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import xd.l;
import yd.h;

public final class f extends h implements l<String, String> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5103b = BuildConfig.FLAVOR;

    public f() {
        super(1);
    }

    public final Object k(Object obj) {
        String str = (String) obj;
        e.D(str, "line");
        return a.e(new StringBuilder(), this.f5103b, str);
    }
}
