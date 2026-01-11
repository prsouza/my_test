package s2;

import a3.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import o2.m;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f10855e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f10856a;

    /* renamed from: b  reason: collision with root package name */
    public String f10857b;

    /* renamed from: c  reason: collision with root package name */
    public o2.b f10858c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, m> f10859d;

    public b(Drawable.Callback callback, String str, o2.b bVar, Map<String, m> map) {
        this.f10857b = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f10857b;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f10857b += '/';
            }
        }
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.f10859d = new HashMap();
            this.f10856a = null;
            return;
        }
        this.f10856a = ((View) callback).getContext();
        this.f10859d = map;
        this.f10858c = bVar;
    }

    public final Bitmap a(String str, Bitmap bitmap) {
        synchronized (f10855e) {
            this.f10859d.get(str).f9268d = bitmap;
        }
        return bitmap;
    }
}
