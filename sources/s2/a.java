package s2;

import a3.c;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import t2.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final i f10850a = new i();

    /* renamed from: b  reason: collision with root package name */
    public final Map<i, Typeface> f10851b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Typeface> f10852c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final AssetManager f10853d;

    /* renamed from: e  reason: collision with root package name */
    public String f10854e = ".ttf";

    public a(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.f10853d = null;
            return;
        }
        this.f10853d = ((View) callback).getContext().getAssets();
    }
}
