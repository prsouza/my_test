package i6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.q0;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.material.textfield.TextInputLayout;
import io.nodle.cash.R;
import j6.a;
import java.util.Locale;
import x5.o;

public final class n extends e {

    /* renamed from: t  reason: collision with root package name */
    public final q0 f6222t;

    /* renamed from: u  reason: collision with root package name */
    public final AccessibilityManager f6223u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f6224v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    public final int f6225w;

    public n(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        Context context2 = getContext();
        TypedArray d10 = o.d(context2, attributeSet, e5.a.f4627m, R.attr.autoCompleteTextViewStyle, 2131821319, new int[0]);
        if (d10.hasValue(0) && d10.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f6225w = d10.getResourceId(1, R.layout.mtrl_auto_complete_simple_item);
        this.f6223u = (AccessibilityManager) context2.getSystemService("accessibility");
        q0 q0Var = new q0(context2, (AttributeSet) null, R.attr.listPopupWindowStyle, 0);
        this.f6222t = q0Var;
        q0Var.t();
        q0Var.D = this;
        q0Var.s();
        q0Var.p(getAdapter());
        q0Var.E = new m(this);
        if (d10.hasValue(2)) {
            setSimpleItems(d10.getResourceId(2, 0));
        }
        d10.recycle();
    }

    public static void a(n nVar, Object obj) {
        nVar.setText(nVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 == null || !b10.T) {
            return super.getHint();
        }
        return b10.getHint();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.T && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    public final void onMeasure(int i, int i10) {
        int i11;
        super.onMeasure(i, i10);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i12 = 0;
            if (!(adapter == null || b10 == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                q0 q0Var = this.f6222t;
                if (!q0Var.b()) {
                    i11 = -1;
                } else {
                    i11 = q0Var.f1371c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i11) + 15);
                View view = null;
                int i13 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i12) {
                        view = null;
                        i12 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 = Math.max(i13, view.getMeasuredWidth());
                }
                Drawable f10 = this.f6222t.f();
                if (f10 != null) {
                    f10.getPadding(this.f6224v);
                    Rect rect = this.f6224v;
                    i13 += rect.left + rect.right;
                }
                i12 = b10.getEndIconView().getMeasuredWidth() + i13;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i12), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f6222t.p(getAdapter());
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f6223u;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f6222t.d();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f6225w, strArr));
    }
}
