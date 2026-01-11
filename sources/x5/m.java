package x5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import b6.d;
import java.lang.ref.WeakReference;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f12853a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final a f12854b = new a();

    /* renamed from: c  reason: collision with root package name */
    public float f12855c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12856d = true;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f12857e = new WeakReference<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public d f12858f;

    public class a extends android.support.v4.media.b {
        public a() {
        }

        public final void A1(Typeface typeface, boolean z) {
            if (!z) {
                m mVar = m.this;
                mVar.f12856d = true;
                b bVar = mVar.f12857e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }

        public final void z1(int i) {
            m mVar = m.this;
            mVar.f12856d = true;
            b bVar = mVar.f12857e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public m(b bVar) {
        this.f12857e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        float f10;
        if (!this.f12856d) {
            return this.f12855c;
        }
        if (str == null) {
            f10 = 0.0f;
        } else {
            f10 = this.f12853a.measureText(str, 0, str.length());
        }
        this.f12855c = f10;
        this.f12856d = false;
        return f10;
    }

    public final void b(d dVar, Context context) {
        if (this.f12858f != dVar) {
            this.f12858f = dVar;
            if (dVar != null) {
                dVar.f(context, this.f12853a, this.f12854b);
                b bVar = this.f12857e.get();
                if (bVar != null) {
                    this.f12853a.drawableState = bVar.getState();
                }
                dVar.e(context, this.f12853a, this.f12854b);
                this.f12856d = true;
            }
            b bVar2 = this.f12857e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
