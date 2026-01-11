package o2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import w2.e;
import y2.s;
import z2.c;

public final class l extends Drawable implements Drawable.Callback, Animatable {
    public b A;
    public s2.a B;
    public boolean C;
    public w2.c D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f9227a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public f f9228b;

    /* renamed from: c  reason: collision with root package name */
    public final a3.d f9229c;

    /* renamed from: s  reason: collision with root package name */
    public float f9230s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9231t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9232u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<o> f9233v;

    /* renamed from: w  reason: collision with root package name */
    public final f f9234w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView.ScaleType f9235x;

    /* renamed from: y  reason: collision with root package name */
    public s2.b f9236y;
    public String z;

    public class a implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9237a;

        public a(String str) {
            this.f9237a = str;
        }

        public final void run() {
            l.this.q(this.f9237a);
        }
    }

    public class b implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9239a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f9240b;

        public b(int i, int i10) {
            this.f9239a = i;
            this.f9240b = i10;
        }

        public final void run() {
            l.this.p(this.f9239a, this.f9240b);
        }
    }

    public class c implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9242a;

        public c(int i) {
            this.f9242a = i;
        }

        public final void run() {
            l.this.l(this.f9242a);
        }
    }

    public class d implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f9244a;

        public d(float f10) {
            this.f9244a = f10;
        }

        public final void run() {
            l.this.u(this.f9244a);
        }
    }

    public class e implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t2.e f9246a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f9247b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b3.c f9248c;

        public e(t2.e eVar, Object obj, b3.c cVar) {
            this.f9246a = eVar;
            this.f9247b = obj;
            this.f9248c = cVar;
        }

        public final void run() {
            l.this.a(this.f9246a, this.f9247b, this.f9248c);
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l lVar = l.this;
            w2.c cVar = lVar.D;
            if (cVar != null) {
                cVar.q(lVar.f9229c.g());
            }
        }
    }

    public class g implements o {
        public g() {
        }

        public final void run() {
            l.this.j();
        }
    }

    public class h implements o {
        public h() {
        }

        public final void run() {
            l.this.k();
        }
    }

    public class i implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9253a;

        public i(int i) {
            this.f9253a = i;
        }

        public final void run() {
            l.this.r(this.f9253a);
        }
    }

    public class j implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f9255a;

        public j(float f10) {
            this.f9255a = f10;
        }

        public final void run() {
            l.this.t(this.f9255a);
        }
    }

    public class k implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9257a;

        public k(int i) {
            this.f9257a = i;
        }

        public final void run() {
            l.this.m(this.f9257a);
        }
    }

    /* renamed from: o2.l$l  reason: collision with other inner class name */
    public class C0178l implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f9259a;

        public C0178l(float f10) {
            this.f9259a = f10;
        }

        public final void run() {
            l.this.o(this.f9259a);
        }
    }

    public class m implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9261a;

        public m(String str) {
            this.f9261a = str;
        }

        public final void run() {
            l.this.s(this.f9261a);
        }
    }

    public class n implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9263a;

        public n(String str) {
            this.f9263a = str;
        }

        public final void run() {
            l.this.n(this.f9263a);
        }
    }

    public interface o {
        void run();
    }

    static {
        Class<l> cls = l.class;
    }

    public l() {
        a3.d dVar = new a3.d();
        this.f9229c = dVar;
        this.f9230s = 1.0f;
        this.f9231t = true;
        this.f9232u = false;
        new HashSet();
        this.f9233v = new ArrayList<>();
        f fVar = new f();
        this.f9234w = fVar;
        this.E = 255;
        this.I = true;
        this.J = false;
        dVar.addUpdateListener(fVar);
    }

    public final <T> void a(t2.e eVar, T t10, b3.c cVar) {
        List list;
        w2.c cVar2 = this.D;
        if (cVar2 == null) {
            this.f9233v.add(new e(eVar, t10, cVar));
            return;
        }
        boolean z10 = true;
        if (eVar == t2.e.f11272c) {
            cVar2.f(t10, cVar);
        } else {
            t2.f fVar = eVar.f11274b;
            if (fVar != null) {
                fVar.f(t10, cVar);
            } else {
                if (cVar2 == null) {
                    a3.c.b("Cannot resolve KeyPath. Composition is not set yet.");
                    list = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    this.D.g(eVar, 0, arrayList, new t2.e(new String[0]));
                    list = arrayList;
                }
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((t2.e) list.get(i10)).f11274b.f(t10, cVar);
                }
                z10 = true ^ list.isEmpty();
            }
        }
        if (z10) {
            invalidateSelf();
            if (t10 == p.A) {
                u(g());
            }
        }
    }

    public final void b() {
        f fVar = this.f9228b;
        c.a aVar = s.f13411a;
        Rect rect = fVar.f9204j;
        List emptyList = Collections.emptyList();
        e.a aVar2 = e.a.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        u2.l lVar = r14;
        u2.l lVar2 = new u2.l();
        w2.e eVar = r2;
        w2.e eVar2 = new w2.e(emptyList, fVar, "__container", -1, aVar2, -1, (String) null, emptyList2, lVar, 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), (u2.j) null, (u2.k) null, Collections.emptyList(), e.b.NONE, (u2.b) null, false);
        f fVar2 = this.f9228b;
        w2.c cVar = new w2.c(this, eVar, fVar2.i, fVar2);
        this.D = cVar;
        if (this.G) {
            cVar.p(true);
        }
    }

    public final void c() {
        a3.d dVar = this.f9229c;
        if (dVar.z) {
            dVar.cancel();
        }
        this.f9228b = null;
        this.D = null;
        this.f9236y = null;
        a3.d dVar2 = this.f9229c;
        dVar2.f47y = null;
        dVar2.f45w = -2.14748365E9f;
        dVar2.f46x = 2.14748365E9f;
        invalidateSelf();
    }

    public final void d(Canvas canvas) {
        float f10;
        float f11;
        int i10 = -1;
        if (ImageView.ScaleType.FIT_XY == this.f9235x) {
            if (this.D != null) {
                Rect bounds = getBounds();
                float width = ((float) bounds.width()) / ((float) this.f9228b.f9204j.width());
                float height = ((float) bounds.height()) / ((float) this.f9228b.f9204j.height());
                if (this.I) {
                    float min = Math.min(width, height);
                    if (min < 1.0f) {
                        f11 = 1.0f / min;
                        width /= f11;
                        height /= f11;
                    } else {
                        f11 = 1.0f;
                    }
                    if (f11 > 1.0f) {
                        i10 = canvas.save();
                        float width2 = ((float) bounds.width()) / 2.0f;
                        float height2 = ((float) bounds.height()) / 2.0f;
                        float f12 = width2 * min;
                        float f13 = min * height2;
                        canvas.translate(width2 - f12, height2 - f13);
                        canvas.scale(f11, f11, f12, f13);
                    }
                }
                this.f9227a.reset();
                this.f9227a.preScale(width, height);
                this.D.e(canvas, this.f9227a, this.E);
                if (i10 > 0) {
                    canvas.restoreToCount(i10);
                }
            }
        } else if (this.D != null) {
            float f14 = this.f9230s;
            float min2 = Math.min(((float) canvas.getWidth()) / ((float) this.f9228b.f9204j.width()), ((float) canvas.getHeight()) / ((float) this.f9228b.f9204j.height()));
            if (f14 > min2) {
                f10 = this.f9230s / min2;
            } else {
                min2 = f14;
                f10 = 1.0f;
            }
            if (f10 > 1.0f) {
                i10 = canvas.save();
                float width3 = ((float) this.f9228b.f9204j.width()) / 2.0f;
                float height3 = ((float) this.f9228b.f9204j.height()) / 2.0f;
                float f15 = width3 * min2;
                float f16 = height3 * min2;
                float f17 = this.f9230s;
                canvas.translate((width3 * f17) - f15, (f17 * height3) - f16);
                canvas.scale(f10, f10, f15, f16);
            }
            this.f9227a.reset();
            this.f9227a.preScale(min2, min2);
            this.D.e(canvas, this.f9227a, this.E);
            if (i10 > 0) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public final void draw(Canvas canvas) {
        this.J = false;
        if (this.f9232u) {
            try {
                d(canvas);
            } catch (Throwable unused) {
                Objects.requireNonNull(a3.c.f39a);
            }
        } else {
            d(canvas);
        }
        ad.c.E();
    }

    public final float e() {
        return this.f9229c.h();
    }

    public final float f() {
        return this.f9229c.i();
    }

    public final float g() {
        return this.f9229c.g();
    }

    public final int getAlpha() {
        return this.E;
    }

    public final int getIntrinsicHeight() {
        f fVar = this.f9228b;
        if (fVar == null) {
            return -1;
        }
        return (int) (((float) fVar.f9204j.height()) * this.f9230s);
    }

    public final int getIntrinsicWidth() {
        f fVar = this.f9228b;
        if (fVar == null) {
            return -1;
        }
        return (int) (((float) fVar.f9204j.width()) * this.f9230s);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int h() {
        return this.f9229c.getRepeatCount();
    }

    public final boolean i() {
        a3.d dVar = this.f9229c;
        if (dVar == null) {
            return false;
        }
        return dVar.z;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void invalidateSelf() {
        if (!this.J) {
            this.J = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public final boolean isRunning() {
        return i();
    }

    public final void j() {
        if (this.D == null) {
            this.f9233v.add(new g());
            return;
        }
        if (this.f9231t || h() == 0) {
            a3.d dVar = this.f9229c;
            dVar.z = true;
            dVar.b(dVar.j());
            dVar.m((float) ((int) (dVar.j() ? dVar.h() : dVar.i())));
            dVar.f42t = 0;
            dVar.f44v = 0;
            dVar.k();
        }
        if (!this.f9231t) {
            l((int) (this.f9229c.f40c < 0.0f ? f() : e()));
            this.f9229c.d();
        }
    }

    public final void k() {
        if (this.D == null) {
            this.f9233v.add(new h());
            return;
        }
        if (this.f9231t || h() == 0) {
            a3.d dVar = this.f9229c;
            dVar.z = true;
            dVar.k();
            dVar.f42t = 0;
            if (dVar.j() && dVar.f43u == dVar.i()) {
                dVar.f43u = dVar.h();
            } else if (!dVar.j() && dVar.f43u == dVar.h()) {
                dVar.f43u = dVar.i();
            }
        }
        if (!this.f9231t) {
            l((int) (this.f9229c.f40c < 0.0f ? f() : e()));
            this.f9229c.d();
        }
    }

    public final void l(int i10) {
        if (this.f9228b == null) {
            this.f9233v.add(new c(i10));
        } else {
            this.f9229c.m((float) i10);
        }
    }

    public final void m(int i10) {
        if (this.f9228b == null) {
            this.f9233v.add(new k(i10));
            return;
        }
        a3.d dVar = this.f9229c;
        dVar.n(dVar.f45w, ((float) i10) + 0.99f);
    }

    public final void n(String str) {
        f fVar = this.f9228b;
        if (fVar == null) {
            this.f9233v.add(new n(str));
            return;
        }
        t2.h c10 = fVar.c(str);
        if (c10 != null) {
            m((int) (c10.f11278b + c10.f11279c));
            return;
        }
        throw new IllegalArgumentException(androidx.fragment.app.o.c("Cannot find marker with name ", str, "."));
    }

    public final void o(float f10) {
        f fVar = this.f9228b;
        if (fVar == null) {
            this.f9233v.add(new C0178l(f10));
            return;
        }
        float f11 = fVar.f9205k;
        float f12 = fVar.f9206l;
        PointF pointF = a3.f.f49a;
        m((int) a.a.a(f12, f11, f10, f11));
    }

    public final void p(int i10, int i11) {
        if (this.f9228b == null) {
            this.f9233v.add(new b(i10, i11));
        } else {
            this.f9229c.n((float) i10, ((float) i11) + 0.99f);
        }
    }

    public final void q(String str) {
        f fVar = this.f9228b;
        if (fVar == null) {
            this.f9233v.add(new a(str));
            return;
        }
        t2.h c10 = fVar.c(str);
        if (c10 != null) {
            int i10 = (int) c10.f11278b;
            p(i10, ((int) c10.f11279c) + i10);
            return;
        }
        throw new IllegalArgumentException(androidx.fragment.app.o.c("Cannot find marker with name ", str, "."));
    }

    public final void r(int i10) {
        if (this.f9228b == null) {
            this.f9233v.add(new i(i10));
            return;
        }
        a3.d dVar = this.f9229c;
        dVar.n((float) i10, (float) ((int) dVar.f46x));
    }

    public final void s(String str) {
        f fVar = this.f9228b;
        if (fVar == null) {
            this.f9233v.add(new m(str));
            return;
        }
        t2.h c10 = fVar.c(str);
        if (c10 != null) {
            r((int) c10.f11278b);
            return;
        }
        throw new IllegalArgumentException(androidx.fragment.app.o.c("Cannot find marker with name ", str, "."));
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public final void setAlpha(int i10) {
        this.E = i10;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        a3.c.b("Use addColorFilter instead.");
    }

    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            j();
        }
    }

    public final void stop() {
        this.f9233v.clear();
        this.f9229c.d();
    }

    public final void t(float f10) {
        f fVar = this.f9228b;
        if (fVar == null) {
            this.f9233v.add(new j(f10));
            return;
        }
        float f11 = fVar.f9205k;
        float f12 = fVar.f9206l;
        PointF pointF = a3.f.f49a;
        r((int) a.a.a(f12, f11, f10, f11));
    }

    public final void u(float f10) {
        f fVar = this.f9228b;
        if (fVar == null) {
            this.f9233v.add(new d(f10));
            return;
        }
        a3.d dVar = this.f9229c;
        float f11 = fVar.f9205k;
        float f12 = fVar.f9206l;
        PointF pointF = a3.f.f49a;
        dVar.m(((f12 - f11) * f10) + f11);
        ad.c.E();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(float f10) {
        this.f9230s = f10;
        w();
    }

    public final void w() {
        f fVar = this.f9228b;
        if (fVar != null) {
            float f10 = this.f9230s;
            setBounds(0, 0, (int) (((float) fVar.f9204j.width()) * f10), (int) (((float) this.f9228b.f9204j.height()) * f10));
        }
    }
}
