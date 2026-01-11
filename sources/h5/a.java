package h5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b6.d;
import com.github.mikephil.charting.BuildConfig;
import e6.f;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import org.slf4j.Marker;
import x5.m;
import x5.o;

public final class a extends Drawable implements m.b {
    public WeakReference<View> A;
    public WeakReference<FrameLayout> B;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f5836a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5837b;

    /* renamed from: c  reason: collision with root package name */
    public final m f5838c;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f5839s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    public final b f5840t;

    /* renamed from: u  reason: collision with root package name */
    public float f5841u;

    /* renamed from: v  reason: collision with root package name */
    public float f5842v;

    /* renamed from: w  reason: collision with root package name */
    public int f5843w;

    /* renamed from: x  reason: collision with root package name */
    public float f5844x;

    /* renamed from: y  reason: collision with root package name */
    public float f5845y;
    public float z;

    public a(Context context) {
        d dVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f5836a = weakReference;
        o.c(context, o.f12861b, "Theme.MaterialComponents");
        f fVar = new f();
        this.f5837b = fVar;
        m mVar = new m(this);
        this.f5838c = mVar;
        mVar.f12853a.setTextAlign(Paint.Align.CENTER);
        Context context3 = weakReference.get();
        if (!(context3 == null || mVar.f12858f == (dVar = new d(context3, 2131821083)) || (context2 = weakReference.get()) == null)) {
            mVar.b(dVar, context2);
            h();
        }
        b bVar = new b(context);
        this.f5840t = bVar;
        this.f5843w = ((int) Math.pow(10.0d, ((double) bVar.f5847b.f5856u) - 1.0d)) - 1;
        mVar.f12856d = true;
        h();
        invalidateSelf();
        mVar.f12856d = true;
        h();
        invalidateSelf();
        mVar.f12853a.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(bVar.f5847b.f5852b.intValue());
        if (fVar.f4653a.f4666c != valueOf) {
            fVar.o(valueOf);
            invalidateSelf();
        }
        mVar.f12853a.setColor(bVar.f5847b.f5853c.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.A;
        if (!(weakReference2 == null || weakReference2.get() == null)) {
            View view = this.A.get();
            WeakReference<FrameLayout> weakReference3 = this.B;
            g(view, weakReference3 != null ? weakReference3.get() : null);
        }
        h();
        setVisible(bVar.f5847b.A.booleanValue(), false);
    }

    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        if (e() <= this.f5843w) {
            return NumberFormat.getInstance(this.f5840t.f5847b.f5857v).format((long) e());
        }
        Context context = this.f5836a.get();
        if (context == null) {
            return BuildConfig.FLAVOR;
        }
        return String.format(this.f5840t.f5847b.f5857v, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), new Object[]{Integer.valueOf(this.f5843w), Marker.ANY_NON_NULL_MARKER});
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!f()) {
            return this.f5840t.f5847b.f5858w;
        }
        if (this.f5840t.f5847b.f5859x == 0 || (context = this.f5836a.get()) == null) {
            return null;
        }
        int e10 = e();
        int i = this.f5843w;
        if (e10 <= i) {
            return context.getResources().getQuantityString(this.f5840t.f5847b.f5859x, e(), new Object[]{Integer.valueOf(e())});
        }
        return context.getString(this.f5840t.f5847b.f5860y, new Object[]{Integer.valueOf(i)});
    }

    public final FrameLayout d() {
        WeakReference<FrameLayout> weakReference = this.B;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f5837b.draw(canvas);
            if (f()) {
                Rect rect = new Rect();
                String b10 = b();
                this.f5838c.f12853a.getTextBounds(b10, 0, b10.length(), rect);
                canvas.drawText(b10, this.f5841u, this.f5842v + ((float) (rect.height() / 2)), this.f5838c.f12853a);
            }
        }
    }

    public final int e() {
        if (f()) {
            return this.f5840t.f5847b.f5855t;
        }
        return 0;
    }

    public final boolean f() {
        return this.f5840t.f5847b.f5855t != -1;
    }

    public final void g(View view, FrameLayout frameLayout) {
        this.A = new WeakReference<>(view);
        this.B = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        h();
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.f5840t.f5847b.f5854s;
    }

    public final int getIntrinsicHeight() {
        return this.f5839s.height();
    }

    public final int getIntrinsicWidth() {
        return this.f5839s.width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        int i;
        int i10;
        float f10;
        float f11;
        Context context = this.f5836a.get();
        WeakReference<View> weakReference = this.A;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f5839s);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.B;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            if (f()) {
                i = this.f5840t.f5847b.E.intValue();
            } else {
                i = this.f5840t.f5847b.C.intValue();
            }
            int intValue = this.f5840t.f5847b.G.intValue() + i;
            int intValue2 = this.f5840t.f5847b.z.intValue();
            if (intValue2 == 8388691 || intValue2 == 8388693) {
                this.f5842v = (float) (rect2.bottom - intValue);
            } else {
                this.f5842v = (float) (rect2.top + intValue);
            }
            if (e() <= 9) {
                float f12 = !f() ? this.f5840t.f5848c : this.f5840t.f5849d;
                this.f5844x = f12;
                this.z = f12;
                this.f5845y = f12;
            } else {
                float f13 = this.f5840t.f5849d;
                this.f5844x = f13;
                this.z = f13;
                this.f5845y = (this.f5838c.a(b()) / 2.0f) + this.f5840t.f5850e;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(f() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
            if (f()) {
                i10 = this.f5840t.f5847b.D.intValue();
            } else {
                i10 = this.f5840t.f5847b.B.intValue();
            }
            int intValue3 = this.f5840t.f5847b.F.intValue() + i10;
            int intValue4 = this.f5840t.f5847b.z.intValue();
            if (intValue4 == 8388659 || intValue4 == 8388691) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                if (x.e.d(view) == 0) {
                    f10 = (((float) rect2.left) - this.f5845y) + ((float) dimensionPixelSize) + ((float) intValue3);
                } else {
                    f10 = ((((float) rect2.right) + this.f5845y) - ((float) dimensionPixelSize)) - ((float) intValue3);
                }
                this.f5841u = f10;
            } else {
                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                if (x.e.d(view) == 0) {
                    f11 = ((((float) rect2.right) + this.f5845y) - ((float) dimensionPixelSize)) - ((float) intValue3);
                } else {
                    f11 = (((float) rect2.left) - this.f5845y) + ((float) dimensionPixelSize) + ((float) intValue3);
                }
                this.f5841u = f11;
            }
            Rect rect3 = this.f5839s;
            float f14 = this.f5841u;
            float f15 = this.f5842v;
            float f16 = this.f5845y;
            float f17 = this.z;
            rect3.set((int) (f14 - f16), (int) (f15 - f17), (int) (f14 + f16), (int) (f15 + f17));
            f fVar = this.f5837b;
            fVar.setShapeAppearanceModel(fVar.f4653a.f4664a.e(this.f5844x));
            if (!rect.equals(this.f5839s)) {
                this.f5837b.setBounds(this.f5839s);
            }
        }
    }

    public final boolean isStateful() {
        return false;
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void setAlpha(int i) {
        b bVar = this.f5840t;
        bVar.f5846a.f5854s = i;
        bVar.f5847b.f5854s = i;
        this.f5838c.f12853a.setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
