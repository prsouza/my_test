package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e6.f;
import e6.i;
import i6.i;
import io.nodle.cash.R;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import x5.n;

public final class b extends i {

    /* renamed from: e  reason: collision with root package name */
    public final a f4119e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final c f4120f = new c();
    public final d g = new d(this.f6192a);

    /* renamed from: h  reason: collision with root package name */
    public final e f4121h = new e();
    public final f i = new f();

    /* renamed from: j  reason: collision with root package name */
    public boolean f4122j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4123k = false;

    /* renamed from: l  reason: collision with root package name */
    public long f4124l = Long.MAX_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public StateListDrawable f4125m;

    /* renamed from: n  reason: collision with root package name */
    public e6.f f4126n;

    /* renamed from: o  reason: collision with root package name */
    public AccessibilityManager f4127o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f4128p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f4129q;

    public class a extends n {

        /* renamed from: com.google.android.material.textfield.b$a$a  reason: collision with other inner class name */
        public class C0049a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f4131a;

            public C0049a(AutoCompleteTextView autoCompleteTextView) {
                this.f4131a = autoCompleteTextView;
            }

            public final void run() {
                boolean isPopupShowing = this.f4131a.isPopupShowing();
                b.f(b.this, isPopupShowing);
                b.this.f4122j = isPopupShowing;
            }
        }

        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            AutoCompleteTextView d10 = b.d(b.this.f6192a.getEditText());
            if (b.this.f4127o.isTouchExplorationEnabled() && b.e(d10) && !b.this.f6194c.hasFocus()) {
                d10.dismissDropDown();
            }
            d10.post(new C0049a(d10));
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b  reason: collision with other inner class name */
    public class C0050b implements ValueAnimator.AnimatorUpdateListener {
        public C0050b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.f6194c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        public final void onFocusChange(View view, boolean z) {
            b.this.f6192a.setEndIconActivated(z);
            if (!z) {
                b.f(b.this, false);
                b.this.f4122j = false;
            }
        }
    }

    public class d extends TextInputLayout.e {
        public d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public final void d(View view, o0.b bVar) {
            super.d(view, bVar);
            if (!b.e(b.this.f6192a.getEditText())) {
                bVar.n(Spinner.class.getName());
            }
            if (bVar.j()) {
                bVar.t((CharSequence) null);
            }
        }

        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            AutoCompleteTextView d10 = b.d(b.this.f6192a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && b.this.f4127o.isEnabled() && !b.e(b.this.f6192a.getEditText())) {
                b.g(b.this, d10);
                b.h(b.this);
            }
        }
    }

    public class e implements TextInputLayout.f {
        public e() {
        }

        public final void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView d10 = b.d(textInputLayout.getEditText());
            b bVar = b.this;
            int boxBackgroundMode = bVar.f6192a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                d10.setDropDownBackgroundDrawable(bVar.f4126n);
            } else if (boxBackgroundMode == 1) {
                d10.setDropDownBackgroundDrawable(bVar.f4125m);
            }
            b.this.i(d10);
            b bVar2 = b.this;
            Objects.requireNonNull(bVar2);
            d10.setOnTouchListener(new i6.g(bVar2, d10));
            d10.setOnFocusChangeListener(bVar2.f4120f);
            d10.setOnDismissListener(new i6.h(bVar2));
            boolean z = false;
            d10.setThreshold(0);
            d10.removeTextChangedListener(b.this.f4119e);
            d10.addTextChangedListener(b.this.f4119e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (d10.getKeyListener() != null) {
                z = true;
            }
            if (!z && b.this.f4127o.isTouchExplorationEnabled()) {
                CheckableImageButton checkableImageButton = b.this.f6194c;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.d.s(checkableImageButton, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(b.this.g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    public class f implements TextInputLayout.g {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f4138a;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f4138a = autoCompleteTextView;
            }

            public final void run() {
                this.f4138a.removeTextChangedListener(b.this.f4119e);
            }
        }

        public f() {
        }

        public final void a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f4120f) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        public final void onClick(View view) {
            b.g(b.this, (AutoCompleteTextView) b.this.f6192a.getEditText());
        }
    }

    public class h implements AccessibilityManager.TouchExplorationStateChangeListener {
        public h() {
        }

        public final void onTouchExplorationStateChanged(boolean z) {
            if (b.this.f6192a.getEditText() != null && !b.e(b.this.f6192a.getEditText())) {
                CheckableImageButton checkableImageButton = b.this.f6194c;
                int i = z ? 2 : 1;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.d.s(checkableImageButton, i);
            }
        }
    }

    public b(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    public static AutoCompleteTextView d(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static boolean e(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static void f(b bVar, boolean z) {
        if (bVar.f4123k != z) {
            bVar.f4123k = z;
            bVar.f4129q.cancel();
            bVar.f4128p.start();
        }
    }

    public static void g(b bVar, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(bVar);
        if (autoCompleteTextView != null) {
            if (bVar.l()) {
                bVar.f4122j = false;
            }
            if (!bVar.f4122j) {
                boolean z = bVar.f4123k;
                boolean z10 = !z;
                if (z != z10) {
                    bVar.f4123k = z10;
                    bVar.f4129q.cancel();
                    bVar.f4128p.start();
                }
                if (bVar.f4123k) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            bVar.f4122j = false;
        }
    }

    public static void h(b bVar) {
        bVar.f4122j = true;
        bVar.f4124l = System.currentTimeMillis();
    }

    public final void a() {
        float dimensionPixelOffset = (float) this.f6193b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f6193b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f6193b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        e6.f k10 = k(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        e6.f k11 = k(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f4126n = k10;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f4125m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, k10);
        this.f4125m.addState(new int[0], k11);
        int i10 = this.f6195d;
        if (i10 == 0) {
            i10 = R.drawable.mtrl_dropdown_arrow;
        }
        this.f6192a.setEndIconDrawable(i10);
        TextInputLayout textInputLayout = this.f6192a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f6192a.setEndIconOnClickListener(new g());
        this.f6192a.a(this.f4121h);
        this.f6192a.b(this.i);
        this.f4129q = j(67, 0.0f, 1.0f);
        ValueAnimator j10 = j(50, 1.0f, 0.0f);
        this.f4128p = j10;
        j10.addListener(new i6.f(this));
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f6193b.getSystemService("accessibility");
        this.f4127o = accessibilityManager;
        accessibilityManager.addTouchExplorationStateChangeListener(new h());
    }

    public final boolean b(int i10) {
        return i10 != 0;
    }

    public final void i(AutoCompleteTextView autoCompleteTextView) {
        if (!(autoCompleteTextView.getKeyListener() != null)) {
            int boxBackgroundMode = this.f6192a.getBoxBackgroundMode();
            e6.f boxBackground = this.f6192a.getBoxBackground();
            int B = y.c.B(autoCompleteTextView, R.attr.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                int B2 = y.c.B(autoCompleteTextView, R.attr.colorSurface);
                e6.f fVar = new e6.f(boxBackground.f4653a.f4664a);
                int N = y.c.N(B, B2, 0.1f);
                fVar.o(new ColorStateList(iArr, new int[]{N, 0}));
                fVar.setTint(B2);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{N, B2});
                e6.f fVar2 = new e6.f(boxBackground.f4653a.f4664a);
                fVar2.setTint(-1);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fVar, fVar2), boxBackground});
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.d.q(autoCompleteTextView, layerDrawable);
            } else if (boxBackgroundMode == 1) {
                int boxBackgroundColor = this.f6192a.getBoxBackgroundColor();
                RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{y.c.N(B, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                x.d.q(autoCompleteTextView, rippleDrawable);
            }
        }
    }

    public final ValueAnimator j(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(f5.a.f4984a);
        ofFloat.setDuration((long) i10);
        ofFloat.addUpdateListener(new C0050b());
        return ofFloat;
    }

    public final e6.f k(float f10, float f11, float f12, int i10) {
        i.a aVar = new i.a();
        aVar.e(f10);
        aVar.f(f10);
        aVar.c(f11);
        aVar.d(f11);
        e6.i a10 = aVar.a();
        Context context = this.f6193b;
        String str = e6.f.L;
        int b10 = b6.b.b(context, R.attr.colorSurface, e6.f.class.getSimpleName());
        e6.f fVar = new e6.f();
        fVar.m(context);
        fVar.o(ColorStateList.valueOf(b10));
        fVar.n(f12);
        fVar.setShapeAppearanceModel(a10);
        f.b bVar = fVar.f4653a;
        if (bVar.f4670h == null) {
            bVar.f4670h = new Rect();
        }
        fVar.f4653a.f4670h.set(0, i10, 0, i10);
        fVar.invalidateSelf();
        return fVar;
    }

    public final boolean l() {
        long currentTimeMillis = System.currentTimeMillis() - this.f4124l;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}
