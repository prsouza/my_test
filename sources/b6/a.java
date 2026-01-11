package b6;

import android.graphics.Typeface;
import android.support.v4.media.b;
import x5.d;
import x5.e;

public final class a extends b {

    /* renamed from: v  reason: collision with root package name */
    public final Typeface f2866v;

    /* renamed from: w  reason: collision with root package name */
    public final C0029a f2867w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2868x;

    /* renamed from: b6.a$a  reason: collision with other inner class name */
    public interface C0029a {
    }

    public a(C0029a aVar, Typeface typeface) {
        this.f2866v = typeface;
        this.f2867w = aVar;
    }

    public final void A1(Typeface typeface, boolean z) {
        r2(typeface);
    }

    public final void r2(Typeface typeface) {
        if (!this.f2868x) {
            e eVar = ((d) this.f2867w).f12805a;
            if (eVar.n(typeface)) {
                eVar.k(false);
            }
        }
    }

    public final void z1(int i) {
        r2(this.f2866v);
    }
}
