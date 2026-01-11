package androidx.appcompat.widget;

import a.b;
import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.c;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;

public class ActionBarContextView extends a {
    public View A;
    public View B;
    public LinearLayout C;
    public TextView D;
    public TextView E;
    public int F;
    public int G;
    public boolean H;
    public int I;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f1004x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f1005y;
    public View z;

    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m.a f1006a;

        public a(m.a aVar) {
            this.f1006a = aVar;
        }

        public final void onClick(View view) {
            this.f1006a.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f339x, R.attr.actionModeStyle, 0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = b.a0(context, resourceId);
        }
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.q(this, drawable);
        this.F = obtainStyledAttributes.getResourceId(5, 0);
        this.G = obtainStyledAttributes.getResourceId(4, 0);
        this.f1144t = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.I = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public final void f(m.a aVar) {
        View view = this.z;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.I, this, false);
            this.z = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.z);
        }
        View findViewById = this.z.findViewById(R.id.action_mode_close_button);
        this.A = findViewById;
        findViewById.setOnClickListener(new a(aVar));
        e eVar = (e) aVar.e();
        c cVar = this.f1143s;
        if (cVar != null) {
            cVar.b();
        }
        c cVar2 = new c(getContext());
        this.f1143s = cVar2;
        cVar2.A = true;
        cVar2.B = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f1143s, this.f1141b);
        c cVar3 = this.f1143s;
        j jVar = cVar3.f888w;
        if (jVar == null) {
            j jVar2 = (j) cVar3.f884s.inflate(cVar3.f886u, this, false);
            cVar3.f888w = jVar2;
            jVar2.b(cVar3.f883c);
            cVar3.f();
        }
        j jVar3 = cVar3.f888w;
        if (jVar != jVar3) {
            ((ActionMenuView) jVar3).setPresenter(cVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) jVar3;
        this.f1142c = actionMenuView;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.q(actionMenuView, (Drawable) null);
        addView(this.f1142c, layoutParams);
    }

    public final void g() {
        if (this.C == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.C = linearLayout;
            this.D = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.E = (TextView) this.C.findViewById(R.id.action_bar_subtitle);
            if (this.F != 0) {
                this.D.setTextAppearance(getContext(), this.F);
            }
            if (this.G != 0) {
                this.E.setTextAppearance(getContext(), this.G);
            }
        }
        this.D.setText(this.f1004x);
        this.E.setText(this.f1005y);
        boolean z10 = !TextUtils.isEmpty(this.f1004x);
        boolean z11 = !TextUtils.isEmpty(this.f1005y);
        int i = 0;
        this.E.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.C;
        if (!z10 && !z11) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.C.getParent() == null) {
            addView(this.C);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1005y;
    }

    public CharSequence getTitle() {
        return this.f1004x;
    }

    public final void h() {
        removeAllViews();
        this.B = null;
        this.f1142c = null;
        this.f1143s = null;
        View view = this.A;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1143s;
        if (cVar != null) {
            cVar.g();
            c.a aVar = this.f1143s.I;
            if (aVar != null && aVar.b()) {
                aVar.f979j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        boolean b10 = k1.b(this);
        int paddingRight = b10 ? (i11 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.z;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
            int i13 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = b10 ? paddingRight - i13 : paddingRight + i13;
            int d10 = i15 + d(this.z, i15, paddingTop, paddingTop2, b10);
            paddingRight = b10 ? d10 - i14 : d10 + i14;
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.C;
        if (!(linearLayout == null || this.B != null || linearLayout.getVisibility() == 8)) {
            i16 += d(this.C, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.B;
        if (view2 != null) {
            d(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i11 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1142c;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    public final void onMeasure(int i, int i10) {
        int i11 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i10) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i12 = this.f1144t;
            if (i12 <= 0) {
                i12 = View.MeasureSpec.getSize(i10);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i13 = i12 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
            View view = this.z;
            if (view != null) {
                int c10 = c(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1142c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f1142c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.C;
            if (linearLayout != null && this.B == null) {
                if (this.H) {
                    this.C.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.C.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.C.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.B;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i14 = layoutParams.width;
                int i15 = i14 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i14 >= 0) {
                    paddingLeft = Math.min(i14, paddingLeft);
                }
                int i16 = layoutParams.height;
                if (i16 == -2) {
                    i11 = Integer.MIN_VALUE;
                }
                if (i16 >= 0) {
                    i13 = Math.min(i16, i13);
                }
                this.B.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i11));
            }
            if (this.f1144t <= 0) {
                int childCount = getChildCount();
                int i17 = 0;
                for (int i18 = 0; i18 < childCount; i18++) {
                    int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i17) {
                        i17 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i17);
                return;
            }
            setMeasuredDimension(size, i12);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.f1144t = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.B;
        if (view2 != null) {
            removeView(view2);
        }
        this.B = view;
        if (!(view == null || (linearLayout = this.C) == null)) {
            removeView(linearLayout);
            this.C = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1005y = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1004x = charSequence;
        g();
        x.q(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.H) {
            requestLayout();
        }
        this.H = z10;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
