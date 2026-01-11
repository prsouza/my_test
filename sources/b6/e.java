package b6;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.media.b;
import android.text.TextPaint;

public final class e extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Context f2883v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TextPaint f2884w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ b f2885x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ d f2886y;

    public e(d dVar, Context context, TextPaint textPaint, b bVar) {
        this.f2886y = dVar;
        this.f2883v = context;
        this.f2884w = textPaint;
        this.f2885x = bVar;
    }

    public final void A1(Typeface typeface, boolean z) {
        this.f2886y.g(this.f2883v, this.f2884w, typeface);
        this.f2885x.A1(typeface, z);
    }

    public final void z1(int i) {
        this.f2885x.z1(i);
    }
}
