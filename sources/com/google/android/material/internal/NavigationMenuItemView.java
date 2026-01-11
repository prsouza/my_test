package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.o0;
import f0.f;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import o0.b;
import x5.h;

public class NavigationMenuItemView extends h implements j.a {
    public static final int[] U = {16842912};
    public int K;
    public boolean L;
    public boolean M;
    public final CheckedTextView N;
    public FrameLayout O;
    public g P;
    public ColorStateList Q;
    public boolean R;
    public Drawable S;
    public final a T;

    public class a extends n0.a {
        public a() {
        }

        public final void d(View view, b bVar) {
            this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
            bVar.m(NavigationMenuItemView.this.M);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.O == null) {
                this.O = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.O.removeAllViews();
            this.O.addView(view);
        }
    }

    public final void d(g gVar) {
        StateListDrawable stateListDrawable;
        this.P = gVar;
        int i = gVar.f948a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(U, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.d.q(this, stateListDrawable);
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.f952e);
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.f962q);
        g1.a(this, gVar.f963r);
        g gVar2 = this.P;
        if (!(gVar2.f952e == null && gVar2.getIcon() == null && this.P.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.N.setVisibility(8);
            FrameLayout frameLayout = this.O;
            if (frameLayout != null) {
                o0.a aVar = (o0.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.O.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.N.setVisibility(0);
        FrameLayout frameLayout2 = this.O;
        if (frameLayout2 != null) {
            o0.a aVar2 = (o0.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.O.setLayoutParams(aVar2);
        }
    }

    public g getItemData() {
        return this.P;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        g gVar = this.P;
        if (gVar != null && gVar.isCheckable() && this.P.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, U);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.M != z) {
            this.M = z;
            this.T.h(this.N, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.N.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.R) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.Q);
            }
            int i = this.K;
            drawable.setBounds(0, 0, i, i);
        } else if (this.L) {
            if (this.S == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = f.f4887a;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.S = drawable2;
                if (drawable2 != null) {
                    int i10 = this.K;
                    drawable2.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.S;
        }
        this.N.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.N.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.K = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.Q = colorStateList;
        this.R = colorStateList != null;
        g gVar = this.P;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.N.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.L = z;
    }

    public void setTextAppearance(int i) {
        this.N.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.N.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.N.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.T = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.N = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        x.p(checkedTextView, aVar);
    }
}
