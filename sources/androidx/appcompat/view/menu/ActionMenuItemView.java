package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.n0;
import n.f;

public class ActionMenuItemView extends f0 implements j.a, View.OnClickListener, ActionMenuView.a {
    public b A;
    public boolean B = e();
    public boolean C;
    public int D;
    public int E;
    public int F;

    /* renamed from: v  reason: collision with root package name */
    public g f864v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f865w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f866x;

    /* renamed from: y  reason: collision with root package name */
    public e.b f867y;
    public a z;

    public class a extends n0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public final f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.A;
            if (bVar == null || (aVar = c.this.I) == null) {
                return null;
            }
            return aVar.a();
        }

        public final boolean c() {
            f b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f867y;
            if (bVar == null || !bVar.a(actionMenuItemView.f864v) || (b10 = b()) == null || !b10.b()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ad.c.f338w, 0, 0);
        this.D = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.F = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.E = -1;
        setSaveEnabled(false);
    }

    public final boolean a() {
        return c();
    }

    public final boolean b() {
        return c() && this.f864v.getIcon() == null;
    }

    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    public final void d(g gVar) {
        this.f864v = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitleCondensed());
        setId(gVar.f948a);
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.z == null) {
            this.z = new a();
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        CharSequence charSequence;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f865w);
        if (this.f866x != null) {
            if (!((this.f864v.f970y & 4) == 4) || (!this.B && !this.C)) {
                z10 = false;
            }
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence2 = null;
        setText(z12 ? this.f865w : null);
        CharSequence charSequence3 = this.f864v.f962q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z12) {
                charSequence = null;
            } else {
                charSequence = this.f864v.f952e;
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(charSequence3);
        }
        CharSequence charSequence4 = this.f864v.f963r;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z12) {
                charSequence2 = this.f864v.f952e;
            }
            g1.a(this, charSequence2);
            return;
        }
        g1.a(this, charSequence4);
    }

    public g getItemData() {
        return this.f864v;
    }

    public final void onClick(View view) {
        e.b bVar = this.f867y;
        if (bVar != null) {
            bVar.a(this.f864v);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B = e();
        f();
    }

    public final void onMeasure(int i, int i10) {
        int i11;
        int i12;
        boolean c10 = c();
        if (c10 && (i12 = this.E) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i10);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(size, this.D);
        } else {
            i11 = this.D;
        }
        if (mode != 1073741824 && this.D > 0 && measuredWidth < i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
        }
        if (!c10 && this.f866x != null) {
            super.setPadding((getMeasuredWidth() - this.f866x.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.f864v.hasSubMenu() || (aVar = this.z) == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            g gVar = this.f864v;
            if (gVar != null) {
                gVar.f959n.q();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f866x = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.F;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        f();
    }

    public void setItemInvoker(e.b bVar) {
        this.f867y = bVar;
    }

    public final void setPadding(int i, int i10, int i11, int i12) {
        this.E = i;
        super.setPadding(i, i10, i11, i12);
    }

    public void setPopupCallback(b bVar) {
        this.A = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f865w = charSequence;
        f();
    }
}
