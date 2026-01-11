package androidx.appcompat.widget;

import ad.c;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.e;
import io.nodle.cash.R;
import n0.a0;
import n0.b0;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;

public abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final C0006a f1140a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1141b;

    /* renamed from: c  reason: collision with root package name */
    public ActionMenuView f1142c;

    /* renamed from: s  reason: collision with root package name */
    public c f1143s;

    /* renamed from: t  reason: collision with root package name */
    public int f1144t;

    /* renamed from: u  reason: collision with root package name */
    public a0 f1145u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1146v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1147w;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    public class C0006a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1148a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1149b;

        public C0006a() {
        }

        public final void c() {
            if (!this.f1148a) {
                a aVar = a.this;
                aVar.f1145u = null;
                a.super.setVisibility(this.f1149b);
            }
        }

        public final void e(View view) {
            this.f1148a = true;
        }

        public final void i() {
            a.super.setVisibility(0);
            this.f1148a = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int c(View view, int i, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK), i10);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    public final int d(View view, int i, int i10, int i11, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z) {
            view.layout(i - measuredWidth, i12, i, measuredHeight + i12);
        } else {
            view.layout(i, i12, i + measuredWidth, measuredHeight + i12);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final a0 e(int i, long j10) {
        a0 a0Var = this.f1145u;
        if (a0Var != null) {
            a0Var.b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            a0 b10 = x.b(this);
            b10.a(1.0f);
            b10.c(j10);
            C0006a aVar = this.f1140a;
            a.this.f1145u = b10;
            aVar.f1149b = i;
            b10.d(aVar);
            return b10;
        }
        a0 b11 = x.b(this);
        b11.a(0.0f);
        b11.c(j10);
        C0006a aVar2 = this.f1140a;
        a.this.f1145u = b11;
        aVar2.f1149b = i;
        b11.d(aVar2);
        return b11;
    }

    public int getAnimatedVisibility() {
        if (this.f1145u != null) {
            return this.f1140a.f1149b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1144t;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, c.f336u, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1143s;
        if (cVar != null) {
            Configuration configuration2 = cVar.f882b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            cVar.E = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i10 > 720) || (i > 720 && i10 > 960)) ? 5 : (i >= 500 || (i > 640 && i10 > 480) || (i > 480 && i10 > 640)) ? 4 : i >= 360 ? 3 : 2;
            e eVar = cVar.f883c;
            if (eVar != null) {
                eVar.r(true);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1147w = false;
        }
        if (!this.f1147w) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1147w = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1147w = false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1146v = false;
        }
        if (!this.f1146v) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1146v = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1146v = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1144t = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            a0 a0Var = this.f1145u;
            if (a0Var != null) {
                a0Var.b();
            }
            super.setVisibility(i);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1140a = new C0006a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1141b = context;
        } else {
            this.f1141b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
