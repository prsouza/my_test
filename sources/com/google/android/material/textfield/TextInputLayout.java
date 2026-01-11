package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.k0;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.material.internal.CheckableImageButton;
import d0.a;
import e6.i;
import i6.j;
import i6.k;
import i6.l;
import i6.p;
import io.nodle.cash.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import p1.m;
import x5.t;

public class TextInputLayout extends LinearLayout {
    public boolean A;
    public View.OnLongClickListener A0;
    public int B;
    public View.OnLongClickListener B0;
    public boolean C;
    public final CheckableImageButton C0;
    public f0 D;
    public ColorStateList D0;
    public int E;
    public PorterDuff.Mode E0;
    public int F;
    public ColorStateList F0;
    public CharSequence G;
    public ColorStateList G0;
    public boolean H;
    public int H0;
    public f0 I;
    public int I0;
    public ColorStateList J;
    public int J0;
    public int K;
    public ColorStateList K0;
    public p1.c L;
    public int L0;
    public p1.c M;
    public int M0;
    public ColorStateList N;
    public int N0;
    public ColorStateList O;
    public int O0;
    public CharSequence P;
    public int P0;
    public final f0 Q;
    public boolean Q0;
    public boolean R;
    public final x5.e R0;
    public CharSequence S;
    public boolean S0;
    public boolean T;
    public boolean T0;
    public e6.f U;
    public ValueAnimator U0;
    public e6.f V;
    public boolean V0;
    public e6.f W;
    public boolean W0;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f4063a;

    /* renamed from: a0  reason: collision with root package name */
    public i f4064a0;

    /* renamed from: b  reason: collision with root package name */
    public final p f4065b;
    public boolean b0;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f4066c;

    /* renamed from: c0  reason: collision with root package name */
    public final int f4067c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f4068d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f4069e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f4070f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f4071g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f4072h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f4073i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f4074j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Rect f4075k0 = new Rect();

    /* renamed from: l0  reason: collision with root package name */
    public final Rect f4076l0 = new Rect();

    /* renamed from: m0  reason: collision with root package name */
    public final RectF f4077m0 = new RectF();

    /* renamed from: n0  reason: collision with root package name */
    public Typeface f4078n0;

    /* renamed from: o0  reason: collision with root package name */
    public ColorDrawable f4079o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f4080p0;

    /* renamed from: q0  reason: collision with root package name */
    public final LinkedHashSet<f> f4081q0 = new LinkedHashSet<>();

    /* renamed from: r0  reason: collision with root package name */
    public int f4082r0 = 0;

    /* renamed from: s  reason: collision with root package name */
    public final FrameLayout f4083s;

    /* renamed from: s0  reason: collision with root package name */
    public final SparseArray<i6.i> f4084s0;

    /* renamed from: t  reason: collision with root package name */
    public EditText f4085t;

    /* renamed from: t0  reason: collision with root package name */
    public final CheckableImageButton f4086t0;

    /* renamed from: u  reason: collision with root package name */
    public CharSequence f4087u;

    /* renamed from: u0  reason: collision with root package name */
    public final LinkedHashSet<g> f4088u0;

    /* renamed from: v  reason: collision with root package name */
    public int f4089v = -1;

    /* renamed from: v0  reason: collision with root package name */
    public ColorStateList f4090v0;

    /* renamed from: w  reason: collision with root package name */
    public int f4091w = -1;

    /* renamed from: w0  reason: collision with root package name */
    public PorterDuff.Mode f4092w0;

    /* renamed from: x  reason: collision with root package name */
    public int f4093x = -1;

    /* renamed from: x0  reason: collision with root package name */
    public ColorDrawable f4094x0;

    /* renamed from: y  reason: collision with root package name */
    public int f4095y = -1;

    /* renamed from: y0  reason: collision with root package name */
    public int f4096y0;
    public final k z = new k(this);
    public Drawable z0;

    public class a implements TextWatcher {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.A(!textInputLayout.W0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.A) {
                textInputLayout2.t(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.H) {
                textInputLayout3.B(editable.length());
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            TextInputLayout.this.f4086t0.performClick();
            TextInputLayout.this.f4086t0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            TextInputLayout.this.f4085t.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.R0.o(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends n0.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f4101d;

        public e(TextInputLayout textInputLayout) {
            this.f4101d = textInputLayout;
        }

        public void d(View view, o0.b bVar) {
            this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
            EditText editText = this.f4101d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f4101d.getHint();
            CharSequence error = this.f4101d.getError();
            CharSequence placeholderText = this.f4101d.getPlaceholderText();
            int counterMaxLength = this.f4101d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f4101d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z10 = !TextUtils.isEmpty(hint);
            boolean z11 = !this.f4101d.Q0;
            boolean z12 = !TextUtils.isEmpty(error);
            boolean z13 = z12 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z10 ? hint.toString() : BuildConfig.FLAVOR;
            p pVar = this.f4101d.f4065b;
            if (pVar.f6227b.getVisibility() == 0) {
                bVar.f9173a.setLabelFor(pVar.f6227b);
                bVar.A(pVar.f6227b);
            } else {
                bVar.A(pVar.f6229s);
            }
            if (z) {
                bVar.z(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                bVar.z(charSequence);
                if (z11 && placeholderText != null) {
                    bVar.z(charSequence + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                bVar.z(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    bVar.t(charSequence);
                } else {
                    if (z) {
                        charSequence = text + ", " + charSequence;
                    }
                    bVar.z(charSequence);
                }
                bVar.x(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            bVar.f9173a.setMaxTextLength(counterMaxLength);
            if (z13) {
                if (!z12) {
                    error = counterOverflowDescription;
                }
                bVar.f9173a.setError(error);
            }
            f0 f0Var = this.f4101d.z.f6211r;
            if (f0Var != null) {
                bVar.f9173a.setLabelFor(f0Var);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    public static class h extends s0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f4102c;

        /* renamed from: s  reason: collision with root package name */
        public boolean f4103s;

        /* renamed from: t  reason: collision with root package name */
        public CharSequence f4104t;

        /* renamed from: u  reason: collision with root package name */
        public CharSequence f4105u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence f4106v;

        public class a implements Parcelable.ClassLoaderCreator<h> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new h[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("TextInputLayout.SavedState{");
            d10.append(Integer.toHexString(System.identityHashCode(this)));
            d10.append(" error=");
            d10.append(this.f4102c);
            d10.append(" hint=");
            d10.append(this.f4104t);
            d10.append(" helperText=");
            d10.append(this.f4105u);
            d10.append(" placeholderText=");
            d10.append(this.f4106v);
            d10.append("}");
            return d10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            TextUtils.writeToParcel(this.f4102c, parcel, i);
            parcel.writeInt(this.f4103s ? 1 : 0);
            TextUtils.writeToParcel(this.f4104t, parcel, i);
            TextUtils.writeToParcel(this.f4105u, parcel, i);
            TextUtils.writeToParcel(this.f4106v, parcel, i);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4102c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4103s = parcel.readInt() != 1 ? false : true;
            this.f4104t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4105u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4106v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r29, android.util.AttributeSet r30) {
        /*
            r28 = this;
            r0 = r28
            r7 = r30
            r8 = 2130904165(0x7f030465, float:1.7415169E38)
            r9 = 2131821394(0x7f110352, float:1.927553E38)
            r1 = r29
            android.content.Context r1 = j6.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f4089v = r10
            r0.f4091w = r10
            r0.f4093x = r10
            r0.f4095y = r10
            i6.k r1 = new i6.k
            r1.<init>(r0)
            r0.z = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f4075k0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f4076l0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f4077m0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f4081q0 = r1
            r11 = 0
            r0.f4082r0 = r11
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r0.f4084s0 = r12
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f4088u0 = r1
            x5.e r1 = new x5.e
            r1.<init>(r0)
            r0.R0 = r1
            android.content.Context r13 = r28.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r15 = new android.widget.FrameLayout
            r15.<init>(r13)
            r0.f4063a = r15
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r13)
            r0.f4083s = r6
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r0.f4066c = r5
            androidx.appcompat.widget.f0 r4 = new androidx.appcompat.widget.f0
            r3 = 0
            r4.<init>(r13, r3)
            r0.Q = r4
            r2 = 8
            r5.setVisibility(r2)
            r6.setVisibility(r2)
            r4.setVisibility(r2)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r13)
            r3 = 2131427384(0x7f0b0038, float:1.8476383E38)
            android.view.View r16 = r2.inflate(r3, r5, r11)
            r17 = r4
            r4 = r16
            com.google.android.material.internal.CheckableImageButton r4 = (com.google.android.material.internal.CheckableImageButton) r4
            r0.C0 = r4
            android.view.View r2 = r2.inflate(r3, r6, r11)
            r3 = r2
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r0.f4086t0 = r3
            r15.setAddStatesFromChildren(r14)
            r5.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r14 = 8388613(0x800005, float:1.175495E-38)
            r18 = r4
            r4 = -2
            r2.<init>(r4, r10, r14)
            r5.setLayoutParams(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r4, r10)
            r6.setLayoutParams(r2)
            android.view.animation.LinearInterpolator r2 = f5.a.f4984a
            r1.O = r2
            r1.k(r11)
            r1.N = r2
            r1.k(r11)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.m(r2)
            int[] r14 = e5.a.H
            r2 = 5
            int[] r1 = new int[r2]
            r1 = {22, 20, 35, 40, 44} // fill-array
            x5.o.a(r13, r7, r8, r9)
            r19 = 2131821394(0x7f110352, float:1.927553E38)
            r20 = 2130904165(0x7f030465, float:1.7415169E38)
            r21 = r1
            r1 = r13
            r11 = r2
            r2 = r30
            r29 = r3
            r3 = r14
            r23 = r17
            r24 = r18
            r4 = r20
            r25 = r5
            r5 = r19
            r26 = r6
            r6 = r21
            x5.o.b(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.d1 r1 = new androidx.appcompat.widget.d1
            android.content.res.TypedArray r2 = r13.obtainStyledAttributes(r7, r14, r8, r9)
            r1.<init>(r13, r2)
            i6.p r2 = new i6.p
            r2.<init>(r0, r1)
            r0.f4065b = r2
            r3 = 43
            r4 = 1
            boolean r3 = r1.a(r3, r4)
            r0.R = r3
            r3 = 4
            java.lang.CharSequence r3 = r1.n(r3)
            r0.setHint((java.lang.CharSequence) r3)
            r3 = 42
            boolean r3 = r1.a(r3, r4)
            r0.T0 = r3
            r3 = 37
            boolean r3 = r1.a(r3, r4)
            r0.S0 = r3
            r3 = 6
            boolean r4 = r1.o(r3)
            r5 = 3
            if (r4 == 0) goto L_0x0143
            int r3 = r1.j(r3, r10)
            r0.setMinEms(r3)
            goto L_0x0150
        L_0x0143:
            boolean r3 = r1.o(r5)
            if (r3 == 0) goto L_0x0150
            int r3 = r1.f(r5, r10)
            r0.setMinWidth(r3)
        L_0x0150:
            boolean r3 = r1.o(r11)
            r4 = 2
            if (r3 == 0) goto L_0x015f
            int r3 = r1.j(r11, r10)
            r0.setMaxEms(r3)
            goto L_0x016c
        L_0x015f:
            boolean r3 = r1.o(r4)
            if (r3 == 0) goto L_0x016c
            int r3 = r1.f(r4, r10)
            r0.setMaxWidth(r3)
        L_0x016c:
            e6.i$a r3 = e6.i.b(r13, r7, r8, r9)
            e6.i r6 = new e6.i
            r6.<init>(r3)
            r0.f4064a0 = r6
            android.content.res.Resources r3 = r13.getResources()
            r6 = 2131100210(0x7f060232, float:1.7812795E38)
            int r3 = r3.getDimensionPixelOffset(r6)
            r0.f4067c0 = r3
            r3 = 9
            r6 = 0
            int r3 = r1.e(r3, r6)
            r0.f4069e0 = r3
            r3 = 16
            android.content.res.Resources r6 = r13.getResources()
            r7 = 2131100211(0x7f060233, float:1.7812797E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r3 = r1.f(r3, r6)
            r0.f4071g0 = r3
            r3 = 17
            android.content.res.Resources r6 = r13.getResources()
            r7 = 2131100212(0x7f060234, float:1.78128E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r3 = r1.f(r3, r6)
            r0.f4072h0 = r3
            int r3 = r0.f4071g0
            r0.f4070f0 = r3
            r3 = 13
            float r3 = r1.d(r3)
            r6 = 12
            float r6 = r1.d(r6)
            r7 = 10
            float r7 = r1.d(r7)
            r8 = 11
            float r8 = r1.d(r8)
            e6.i r9 = r0.f4064a0
            java.util.Objects.requireNonNull(r9)
            e6.i$a r11 = new e6.i$a
            r11.<init>(r9)
            r9 = 0
            int r14 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r14 < 0) goto L_0x01e1
            r11.e(r3)
        L_0x01e1:
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x01e8
            r11.f(r6)
        L_0x01e8:
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x01ef
            r11.d(r7)
        L_0x01ef:
            int r3 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x01f6
            r11.c(r8)
        L_0x01f6:
            e6.i r3 = new e6.i
            r3.<init>(r11)
            r0.f4064a0 = r3
            r3 = 7
            android.content.res.ColorStateList r3 = b6.c.b(r13, r1, r3)
            if (r3 == 0) goto L_0x025d
            int r6 = r3.getDefaultColor()
            r0.L0 = r6
            r0.f4074j0 = r6
            boolean r6 = r3.isStateful()
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r6 == 0) goto L_0x0238
            r6 = 1
            int[] r8 = new int[r6]
            r6 = 0
            r8[r6] = r7
            int r6 = r3.getColorForState(r8, r10)
            r0.M0 = r6
            int[] r6 = new int[r4]
            r6 = {16842908, 16842910} // fill-array
            int r6 = r3.getColorForState(r6, r10)
            r0.N0 = r6
            int[] r6 = new int[r4]
            r6 = {16843623, 16842910} // fill-array
            int r3 = r3.getColorForState(r6, r10)
            r0.O0 = r3
            goto L_0x0268
        L_0x0238:
            int r3 = r0.L0
            r0.N0 = r3
            r3 = 2131034693(0x7f050245, float:1.767991E38)
            android.content.res.ColorStateList r3 = a.b.Z(r13, r3)
            r6 = 1
            int[] r8 = new int[r6]
            r9 = 0
            r8[r9] = r7
            int r7 = r3.getColorForState(r8, r10)
            r0.M0 = r7
            int[] r7 = new int[r6]
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r7[r9] = r6
            int r3 = r3.getColorForState(r7, r10)
            r0.O0 = r3
            goto L_0x0268
        L_0x025d:
            r9 = 0
            r0.f4074j0 = r9
            r0.L0 = r9
            r0.M0 = r9
            r0.N0 = r9
            r0.O0 = r9
        L_0x0268:
            r3 = 1
            boolean r6 = r1.o(r3)
            if (r6 == 0) goto L_0x0277
            android.content.res.ColorStateList r6 = r1.c(r3)
            r0.G0 = r6
            r0.F0 = r6
        L_0x0277:
            r3 = 14
            android.content.res.ColorStateList r3 = b6.c.b(r13, r1, r3)
            int r6 = r1.b()
            r0.J0 = r6
            r6 = 2131034716(0x7f05025c, float:1.7679957E38)
            java.lang.Object r7 = d0.a.f4256a
            int r6 = d0.a.c.a(r13, r6)
            r0.H0 = r6
            r6 = 2131034717(0x7f05025d, float:1.767996E38)
            int r6 = d0.a.c.a(r13, r6)
            r0.P0 = r6
            r6 = 2131034720(0x7f050260, float:1.7679966E38)
            int r6 = d0.a.c.a(r13, r6)
            r0.I0 = r6
            if (r3 == 0) goto L_0x02a5
            r0.setBoxStrokeColorStateList(r3)
        L_0x02a5:
            r3 = 15
            boolean r6 = r1.o(r3)
            if (r6 == 0) goto L_0x02b4
            android.content.res.ColorStateList r3 = b6.c.b(r13, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x02b4:
            r3 = 44
            int r6 = r1.l(r3, r10)
            if (r6 == r10) goto L_0x02c5
            r6 = 0
            int r3 = r1.l(r3, r6)
            r0.setHintTextAppearance(r3)
            goto L_0x02c6
        L_0x02c5:
            r6 = 0
        L_0x02c6:
            r3 = 35
            int r3 = r1.l(r3, r6)
            r7 = 30
            java.lang.CharSequence r7 = r1.n(r7)
            r8 = 31
            boolean r8 = r1.a(r8, r6)
            r9 = 2131231349(0x7f080275, float:1.8078777E38)
            r11 = r24
            r11.setId(r9)
            boolean r9 = b6.c.d(r13)
            if (r9 == 0) goto L_0x02ef
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            r9.setMarginStart(r6)
        L_0x02ef:
            r6 = 33
            boolean r9 = r1.o(r6)
            if (r9 == 0) goto L_0x02fd
            android.content.res.ColorStateList r6 = b6.c.b(r13, r1, r6)
            r0.D0 = r6
        L_0x02fd:
            r6 = 34
            boolean r9 = r1.o(r6)
            if (r9 == 0) goto L_0x0311
            int r6 = r1.j(r6, r10)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = x5.t.d(r6, r9)
            r0.E0 = r6
            goto L_0x0312
        L_0x0311:
            r9 = 0
        L_0x0312:
            r6 = 32
            boolean r14 = r1.o(r6)
            if (r14 == 0) goto L_0x0321
            android.graphics.drawable.Drawable r6 = r1.g(r6)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r6)
        L_0x0321:
            android.content.res.Resources r6 = r28.getResources()
            r14 = 2131755139(0x7f100083, float:1.9141149E38)
            java.lang.CharSequence r6 = r6.getText(r14)
            r11.setContentDescription(r6)
            java.util.WeakHashMap<android.view.View, n0.a0> r6 = n0.x.f8842a
            n0.x.d.s(r11, r4)
            r6 = 0
            r11.setClickable(r6)
            r11.setPressable(r6)
            r11.setFocusable(r6)
            r14 = 40
            int r14 = r1.l(r14, r6)
            r9 = 39
            boolean r9 = r1.a(r9, r6)
            r5 = 38
            java.lang.CharSequence r5 = r1.n(r5)
            r4 = 52
            int r4 = r1.l(r4, r6)
            r10 = 51
            java.lang.CharSequence r10 = r1.n(r10)
            r30 = r5
            r5 = 65
            int r5 = r1.l(r5, r6)
            r6 = 64
            java.lang.CharSequence r6 = r1.n(r6)
            r19 = r6
            r6 = 18
            r20 = r8
            r8 = 0
            boolean r6 = r1.a(r6, r8)
            r8 = 19
            r21 = r6
            r6 = -1
            int r8 = r1.j(r8, r6)
            r0.setCounterMaxLength(r8)
            r6 = 22
            r8 = 0
            int r6 = r1.l(r6, r8)
            r0.F = r6
            r6 = 20
            int r6 = r1.l(r6, r8)
            r0.E = r6
            r6 = 8
            int r6 = r1.j(r6, r8)
            r0.setBoxBackgroundMode(r6)
            boolean r6 = b6.c.d(r13)
            if (r6 == 0) goto L_0x03aa
            android.view.ViewGroup$LayoutParams r6 = r29.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            r6.setMarginStart(r8)
        L_0x03aa:
            r6 = 26
            r22 = r9
            int r9 = r1.l(r6, r8)
            i6.d r6 = new i6.d
            r6.<init>(r0, r9)
            r8 = -1
            r12.append(r8, r6)
            i6.o r6 = new i6.o
            r6.<init>(r0)
            r8 = 0
            r12.append(r8, r6)
            com.google.android.material.textfield.c r6 = new com.google.android.material.textfield.c
            if (r9 != 0) goto L_0x03d1
            r27 = r2
            r2 = 47
            int r2 = r1.l(r2, r8)
            goto L_0x03d4
        L_0x03d1:
            r27 = r2
            r2 = r9
        L_0x03d4:
            r6.<init>(r0, r2)
            r2 = 1
            r12.append(r2, r6)
            com.google.android.material.textfield.a r2 = new com.google.android.material.textfield.a
            r2.<init>(r0, r9)
            r6 = 2
            r12.append(r6, r2)
            com.google.android.material.textfield.b r2 = new com.google.android.material.textfield.b
            r2.<init>(r0, r9)
            r6 = 3
            r12.append(r6, r2)
            r2 = 48
            boolean r6 = r1.o(r2)
            if (r6 != 0) goto L_0x0417
            r6 = 28
            boolean r8 = r1.o(r6)
            if (r8 == 0) goto L_0x0403
            android.content.res.ColorStateList r6 = b6.c.b(r13, r1, r6)
            r0.f4090v0 = r6
        L_0x0403:
            r6 = 29
            boolean r8 = r1.o(r6)
            if (r8 == 0) goto L_0x0417
            r8 = -1
            int r6 = r1.j(r6, r8)
            r8 = 0
            android.graphics.PorterDuff$Mode r6 = x5.t.d(r6, r8)
            r0.f4092w0 = r6
        L_0x0417:
            r6 = 27
            boolean r8 = r1.o(r6)
            if (r8 == 0) goto L_0x0441
            r8 = 0
            int r2 = r1.j(r6, r8)
            r0.setEndIconMode(r2)
            r2 = 25
            boolean r6 = r1.o(r2)
            if (r6 == 0) goto L_0x0436
            java.lang.CharSequence r2 = r1.n(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x0436:
            r2 = 24
            r6 = 1
            boolean r2 = r1.a(r2, r6)
            r0.setEndIconCheckable(r2)
            goto L_0x047a
        L_0x0441:
            boolean r6 = r1.o(r2)
            if (r6 == 0) goto L_0x047a
            r6 = 49
            boolean r8 = r1.o(r6)
            if (r8 == 0) goto L_0x0455
            android.content.res.ColorStateList r6 = b6.c.b(r13, r1, r6)
            r0.f4090v0 = r6
        L_0x0455:
            r6 = 50
            boolean r8 = r1.o(r6)
            if (r8 == 0) goto L_0x0469
            r8 = -1
            int r6 = r1.j(r6, r8)
            r8 = 0
            android.graphics.PorterDuff$Mode r6 = x5.t.d(r6, r8)
            r0.f4092w0 = r6
        L_0x0469:
            r6 = 0
            boolean r2 = r1.a(r2, r6)
            r0.setEndIconMode(r2)
            r2 = 46
            java.lang.CharSequence r2 = r1.n(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x047a:
            r2 = 2131231356(0x7f08027c, float:1.807879E38)
            r6 = r23
            r6.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r8 = 80
            r9 = -2
            r2.<init>(r9, r9, r8)
            r6.setLayoutParams(r2)
            r2 = 1
            n0.x.g.f(r6, r2)
            r0.setErrorContentDescription(r7)
            int r2 = r0.E
            r0.setCounterOverflowTextAppearance(r2)
            r0.setHelperTextTextAppearance(r14)
            r0.setErrorTextAppearance(r3)
            int r2 = r0.F
            r0.setCounterTextAppearance(r2)
            r0.setPlaceholderText(r10)
            r0.setPlaceholderTextAppearance(r4)
            r0.setSuffixTextAppearance(r5)
            r2 = 36
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x04bc
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setErrorTextColor(r2)
        L_0x04bc:
            r2 = 41
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x04cb
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHelperTextColor(r2)
        L_0x04cb:
            r2 = 45
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x04da
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHintTextColor(r2)
        L_0x04da:
            r2 = 23
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x04e9
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterTextColor(r2)
        L_0x04e9:
            r2 = 21
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x04f8
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x04f8:
            r2 = 53
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x0507
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x0507:
            r2 = 66
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x0516
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setSuffixTextColor(r2)
        L_0x0516:
            r2 = 1
            r3 = 0
            boolean r3 = r1.a(r3, r2)
            r0.setEnabled(r3)
            r1.r()
            r1 = 2
            n0.x.d.s(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 < r3) goto L_0x0531
            if (r1 < r3) goto L_0x0531
            n0.x.l.l(r0, r2)
        L_0x0531:
            r2 = r29
            r1 = r26
            r1.addView(r2)
            r2 = r25
            r2.addView(r6)
            r2.addView(r11)
            r2.addView(r1)
            r1 = r27
            r15.addView(r1)
            r15.addView(r2)
            r0.addView(r15)
            r1 = r22
            r0.setHelperTextEnabled(r1)
            r1 = r20
            r0.setErrorEnabled(r1)
            r1 = r21
            r0.setCounterEnabled(r1)
            r1 = r30
            r0.setHelperText(r1)
            r1 = r19
            r0.setSuffixText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private i6.i getEndIconDelegate() {
        i6.i iVar = this.f4084s0.get(this.f4082r0);
        return iVar != null ? iVar : this.f4084s0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.C0.getVisibility() == 0) {
            return this.C0;
        }
        if (!i() || !k()) {
            return null;
        }
        return this.f4086t0;
    }

    public static void o(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                o((ViewGroup) childAt, z10);
            }
        }
    }

    public static void q(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        boolean a10 = x.c.a(checkableImageButton);
        boolean z10 = false;
        int i = 1;
        boolean z11 = onLongClickListener != null;
        if (a10 || z11) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(a10);
        checkableImageButton.setPressable(a10);
        checkableImageButton.setLongClickable(z11);
        if (!z10) {
            i = 2;
        }
        x.d.s(checkableImageButton, i);
    }

    private void setEditText(EditText editText) {
        if (this.f4085t == null) {
            if (this.f4082r0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f4085t = editText;
            int i = this.f4089v;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.f4093x);
            }
            int i10 = this.f4091w;
            if (i10 != -1) {
                setMaxEms(i10);
            } else {
                setMaxWidth(this.f4095y);
            }
            m();
            setTextInputAccessibilityDelegate(new e(this));
            this.R0.q(this.f4085t.getTypeface());
            x5.e eVar = this.R0;
            float textSize = this.f4085t.getTextSize();
            if (eVar.i != textSize) {
                eVar.i = textSize;
                eVar.k(false);
            }
            x5.e eVar2 = this.R0;
            float letterSpacing = this.f4085t.getLetterSpacing();
            if (eVar2.U != letterSpacing) {
                eVar2.U = letterSpacing;
                eVar2.k(false);
            }
            int gravity = this.f4085t.getGravity();
            this.R0.m((gravity & -113) | 48);
            x5.e eVar3 = this.R0;
            if (eVar3.g != gravity) {
                eVar3.g = gravity;
                eVar3.k(false);
            }
            this.f4085t.addTextChangedListener(new a());
            if (this.F0 == null) {
                this.F0 = this.f4085t.getHintTextColors();
            }
            if (this.R) {
                if (TextUtils.isEmpty(this.S)) {
                    CharSequence hint = this.f4085t.getHint();
                    this.f4087u = hint;
                    setHint(hint);
                    this.f4085t.setHint((CharSequence) null);
                }
                this.T = true;
            }
            if (this.D != null) {
                t(this.f4085t.getText().length());
            }
            w();
            this.z.b();
            this.f4065b.bringToFront();
            this.f4066c.bringToFront();
            this.f4083s.bringToFront();
            this.C0.bringToFront();
            Iterator<f> it = this.f4081q0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            D();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            A(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.S)) {
            this.S = charSequence;
            x5.e eVar = this.R0;
            if (charSequence == null || !TextUtils.equals(eVar.A, charSequence)) {
                eVar.A = charSequence;
                eVar.B = null;
                Bitmap bitmap = eVar.D;
                if (bitmap != null) {
                    bitmap.recycle();
                    eVar.D = null;
                }
                eVar.k(false);
            }
            if (!this.Q0) {
                n();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.H != z10) {
            if (z10) {
                f0 f0Var = this.I;
                if (f0Var != null) {
                    this.f4063a.addView(f0Var);
                    this.I.setVisibility(0);
                }
            } else {
                f0 f0Var2 = this.I;
                if (f0Var2 != null) {
                    f0Var2.setVisibility(8);
                }
                this.I = null;
            }
            this.H = z10;
        }
    }

    public final void A(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        f0 f0Var;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.f4085t;
        boolean z12 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f4085t;
        boolean z13 = editText2 != null && editText2.hasFocus();
        boolean e10 = this.z.e();
        ColorStateList colorStateList2 = this.F0;
        if (colorStateList2 != null) {
            this.R0.l(colorStateList2);
            x5.e eVar = this.R0;
            ColorStateList colorStateList3 = this.F0;
            if (eVar.f12814k != colorStateList3) {
                eVar.f12814k = colorStateList3;
                eVar.k(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.F0;
            if (colorStateList4 != null) {
                i = colorStateList4.getColorForState(new int[]{-16842910}, this.P0);
            } else {
                i = this.P0;
            }
            this.R0.l(ColorStateList.valueOf(i));
            x5.e eVar2 = this.R0;
            ColorStateList valueOf = ColorStateList.valueOf(i);
            if (eVar2.f12814k != valueOf) {
                eVar2.f12814k = valueOf;
                eVar2.k(false);
            }
        } else if (e10) {
            x5.e eVar3 = this.R0;
            f0 f0Var2 = this.z.f6205l;
            eVar3.l(f0Var2 != null ? f0Var2.getTextColors() : null);
        } else if (this.C && (f0Var = this.D) != null) {
            this.R0.l(f0Var.getTextColors());
        } else if (z13 && (colorStateList = this.G0) != null) {
            this.R0.l(colorStateList);
        }
        if (z12 || !this.S0 || (isEnabled() && z13)) {
            if (z11 || this.Q0) {
                ValueAnimator valueAnimator = this.U0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.U0.cancel();
                }
                if (!z10 || !this.T0) {
                    this.R0.o(1.0f);
                } else {
                    c(1.0f);
                }
                this.Q0 = false;
                if (f()) {
                    n();
                }
                EditText editText3 = this.f4085t;
                B(editText3 == null ? 0 : editText3.getText().length());
                p pVar = this.f4065b;
                pVar.f6233w = false;
                pVar.g();
                E();
            }
        } else if (z11 || !this.Q0) {
            ValueAnimator valueAnimator2 = this.U0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.U0.cancel();
            }
            if (!z10 || !this.T0) {
                this.R0.o(0.0f);
            } else {
                c(0.0f);
            }
            if (f() && (!((i6.e) this.U).N.isEmpty()) && f()) {
                ((i6.e) this.U).x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.Q0 = true;
            j();
            p pVar2 = this.f4065b;
            pVar2.f6233w = true;
            pVar2.g();
            E();
        }
    }

    public final void B(int i) {
        if (i != 0 || this.Q0) {
            j();
        } else if (this.I != null && this.H && !TextUtils.isEmpty(this.G)) {
            this.I.setText(this.G);
            m.a(this.f4063a, this.L);
            this.I.setVisibility(0);
            this.I.bringToFront();
            announceForAccessibility(this.G);
        }
    }

    public final void C(boolean z10, boolean z11) {
        int defaultColor = this.K0.getDefaultColor();
        int colorForState = this.K0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.K0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f4073i0 = colorForState2;
        } else if (z11) {
            this.f4073i0 = colorForState;
        } else {
            this.f4073i0 = defaultColor;
        }
    }

    public final void D() {
        int i;
        if (this.f4085t != null) {
            if (k() || l()) {
                i = 0;
            } else {
                EditText editText = this.f4085t;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                i = x.e.e(editText);
            }
            f0 f0Var = this.Q;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.f4085t.getPaddingTop();
            int paddingBottom = this.f4085t.getPaddingBottom();
            WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
            x.e.k(f0Var, dimensionPixelSize, paddingTop, i, paddingBottom);
        }
    }

    public final void E() {
        int visibility = this.Q.getVisibility();
        boolean z10 = false;
        int i = (this.P == null || this.Q0) ? 8 : 0;
        if (visibility != i) {
            i6.i endIconDelegate = getEndIconDelegate();
            if (i == 0) {
                z10 = true;
            }
            endIconDelegate.c(z10);
        }
        x();
        this.Q.setVisibility(i);
        v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.f4085t;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F() {
        /*
            r6 = this;
            e6.f r0 = r6.U
            if (r0 == 0) goto L_0x012c
            int r0 = r6.f4068d0
            if (r0 != 0) goto L_0x000a
            goto L_0x012c
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f4085t
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0030
            android.widget.EditText r3 = r6.f4085t
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = r2
        L_0x0031:
            boolean r3 = r6.isEnabled()
            if (r3 != 0) goto L_0x003c
            int r3 = r6.P0
            r6.f4073i0 = r3
            goto L_0x007e
        L_0x003c:
            i6.k r3 = r6.z
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x0055
            android.content.res.ColorStateList r3 = r6.K0
            if (r3 == 0) goto L_0x004c
            r6.C(r0, r1)
            goto L_0x007e
        L_0x004c:
            i6.k r3 = r6.z
            int r3 = r3.g()
            r6.f4073i0 = r3
            goto L_0x007e
        L_0x0055:
            boolean r3 = r6.C
            if (r3 == 0) goto L_0x006c
            androidx.appcompat.widget.f0 r3 = r6.D
            if (r3 == 0) goto L_0x006c
            android.content.res.ColorStateList r4 = r6.K0
            if (r4 == 0) goto L_0x0065
            r6.C(r0, r1)
            goto L_0x007e
        L_0x0065:
            int r3 = r3.getCurrentTextColor()
            r6.f4073i0 = r3
            goto L_0x007e
        L_0x006c:
            if (r0 == 0) goto L_0x0073
            int r3 = r6.J0
            r6.f4073i0 = r3
            goto L_0x007e
        L_0x0073:
            if (r1 == 0) goto L_0x007a
            int r3 = r6.I0
            r6.f4073i0 = r3
            goto L_0x007e
        L_0x007a:
            int r3 = r6.H0
            r6.f4073i0 = r3
        L_0x007e:
            r6.y()
            com.google.android.material.internal.CheckableImageButton r3 = r6.C0
            android.content.res.ColorStateList r4 = r6.D0
            i6.j.c(r6, r3, r4)
            i6.p r3 = r6.f4065b
            com.google.android.material.textfield.TextInputLayout r4 = r3.f6226a
            com.google.android.material.internal.CheckableImageButton r5 = r3.f6229s
            android.content.res.ColorStateList r3 = r3.f6230t
            i6.j.c(r4, r5, r3)
            r6.p()
            i6.i r3 = r6.getEndIconDelegate()
            java.util.Objects.requireNonNull(r3)
            boolean r3 = r3 instanceof com.google.android.material.textfield.b
            if (r3 == 0) goto L_0x00cf
            i6.k r3 = r6.z
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x00c6
            android.graphics.drawable.Drawable r3 = r6.getEndIconDrawable()
            if (r3 == 0) goto L_0x00c6
            android.graphics.drawable.Drawable r3 = r6.getEndIconDrawable()
            android.graphics.drawable.Drawable r3 = r3.mutate()
            i6.k r4 = r6.z
            int r4 = r4.g()
            r3.setTint(r4)
            com.google.android.material.internal.CheckableImageButton r4 = r6.f4086t0
            r4.setImageDrawable(r3)
            goto L_0x00cf
        L_0x00c6:
            com.google.android.material.internal.CheckableImageButton r3 = r6.f4086t0
            android.content.res.ColorStateList r4 = r6.f4090v0
            android.graphics.PorterDuff$Mode r5 = r6.f4092w0
            i6.j.a(r6, r3, r4, r5)
        L_0x00cf:
            int r3 = r6.f4068d0
            r4 = 2
            if (r3 != r4) goto L_0x0106
            int r3 = r6.f4070f0
            if (r0 == 0) goto L_0x00e3
            boolean r4 = r6.isEnabled()
            if (r4 == 0) goto L_0x00e3
            int r4 = r6.f4072h0
            r6.f4070f0 = r4
            goto L_0x00e7
        L_0x00e3:
            int r4 = r6.f4071g0
            r6.f4070f0 = r4
        L_0x00e7:
            int r4 = r6.f4070f0
            if (r4 == r3) goto L_0x0106
            boolean r3 = r6.f()
            if (r3 == 0) goto L_0x0106
            boolean r3 = r6.Q0
            if (r3 != 0) goto L_0x0106
            boolean r3 = r6.f()
            if (r3 == 0) goto L_0x0103
            e6.f r3 = r6.U
            i6.e r3 = (i6.e) r3
            r4 = 0
            r3.x(r4, r4, r4, r4)
        L_0x0103:
            r6.n()
        L_0x0106:
            int r3 = r6.f4068d0
            if (r3 != r2) goto L_0x0129
            boolean r2 = r6.isEnabled()
            if (r2 != 0) goto L_0x0115
            int r0 = r6.M0
            r6.f4074j0 = r0
            goto L_0x0129
        L_0x0115:
            if (r1 == 0) goto L_0x011e
            if (r0 != 0) goto L_0x011e
            int r0 = r6.O0
            r6.f4074j0 = r0
            goto L_0x0129
        L_0x011e:
            if (r0 == 0) goto L_0x0125
            int r0 = r6.N0
            r6.f4074j0 = r0
            goto L_0x0129
        L_0x0125:
            int r0 = r6.L0
            r6.f4074j0 = r0
        L_0x0129:
            r6.d()
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.F():void");
    }

    public final void a(f fVar) {
        this.f4081q0.add(fVar);
        if (this.f4085t != null) {
            fVar.a(this);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f4063a.addView(view, layoutParams2);
            this.f4063a.setLayoutParams(layoutParams);
            z();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(g gVar) {
        this.f4088u0.add(gVar);
    }

    public final void c(float f10) {
        if (this.R0.f12808c != f10) {
            if (this.U0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.U0 = valueAnimator;
                valueAnimator.setInterpolator(f5.a.f4985b);
                this.U0.setDuration(167);
                this.U0.addUpdateListener(new d());
            }
            this.U0.setFloatValues(new float[]{this.R0.f12808c, f10});
            this.U0.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r7 = this;
            e6.f r0 = r7.U
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            e6.f$b r1 = r0.f4653a
            e6.i r1 = r1.f4664a
            e6.i r2 = r7.f4064a0
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == r2) goto L_0x004a
            r0.setShapeAppearanceModel(r2)
            int r0 = r7.f4082r0
            if (r0 != r3) goto L_0x004a
            int r0 = r7.f4068d0
            if (r0 != r4) goto L_0x004a
            android.util.SparseArray<i6.i> r0 = r7.f4084s0
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.textfield.b r0 = (com.google.android.material.textfield.b) r0
            android.widget.EditText r1 = r7.f4085t
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            java.util.Objects.requireNonNull(r0)
            android.text.method.KeyListener r2 = r1.getKeyListener()
            if (r2 == 0) goto L_0x0033
            r2 = r6
            goto L_0x0034
        L_0x0033:
            r2 = r5
        L_0x0034:
            if (r2 != 0) goto L_0x004a
            com.google.android.material.textfield.TextInputLayout r2 = r0.f6192a
            int r2 = r2.getBoxBackgroundMode()
            if (r2 != r4) goto L_0x004a
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.LayerDrawable
            if (r2 != 0) goto L_0x0047
            goto L_0x004a
        L_0x0047:
            r0.i(r1)
        L_0x004a:
            int r0 = r7.f4068d0
            r1 = -1
            if (r0 != r4) goto L_0x005e
            int r0 = r7.f4070f0
            if (r0 <= r1) goto L_0x0059
            int r0 = r7.f4073i0
            if (r0 == 0) goto L_0x0059
            r0 = r6
            goto L_0x005a
        L_0x0059:
            r0 = r5
        L_0x005a:
            if (r0 == 0) goto L_0x005e
            r0 = r6
            goto L_0x005f
        L_0x005e:
            r0 = r5
        L_0x005f:
            if (r0 == 0) goto L_0x006b
            e6.f r0 = r7.U
            int r2 = r7.f4070f0
            float r2 = (float) r2
            int r4 = r7.f4073i0
            r0.q(r2, r4)
        L_0x006b:
            int r0 = r7.f4074j0
            int r2 = r7.f4068d0
            if (r2 != r6) goto L_0x0082
            r0 = 2130903311(0x7f03010f, float:1.7413436E38)
            android.content.Context r2 = r7.getContext()
            int r0 = y.c.A(r2, r0, r5)
            int r2 = r7.f4074j0
            int r0 = g0.a.b(r2, r0)
        L_0x0082:
            r7.f4074j0 = r0
            e6.f r2 = r7.U
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.o(r0)
            int r0 = r7.f4082r0
            if (r0 != r3) goto L_0x009a
            android.widget.EditText r0 = r7.f4085t
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x009a:
            e6.f r0 = r7.V
            if (r0 == 0) goto L_0x00d4
            e6.f r2 = r7.W
            if (r2 != 0) goto L_0x00a3
            goto L_0x00d4
        L_0x00a3:
            int r2 = r7.f4070f0
            if (r2 <= r1) goto L_0x00ac
            int r1 = r7.f4073i0
            if (r1 == 0) goto L_0x00ac
            r5 = r6
        L_0x00ac:
            if (r5 == 0) goto L_0x00d1
            android.widget.EditText r1 = r7.f4085t
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L_0x00bd
            int r1 = r7.H0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L_0x00c3
        L_0x00bd:
            int r1 = r7.f4073i0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L_0x00c3:
            r0.o(r1)
            e6.f r0 = r7.W
            int r1 = r7.f4073i0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.o(r1)
        L_0x00d1:
            r7.invalidate()
        L_0x00d4:
            r7.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.d():void");
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f4085t;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f4087u != null) {
            boolean z10 = this.T;
            this.T = false;
            CharSequence hint = editText.getHint();
            this.f4085t.setHint(this.f4087u);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f4085t.setHint(hint);
                this.T = z10;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f4063a.getChildCount());
            for (int i10 = 0; i10 < this.f4063a.getChildCount(); i10++) {
                View childAt = this.f4063a.getChildAt(i10);
                ViewStructure newChild = viewStructure.newChild(i10);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f4085t) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.W0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.W0 = false;
    }

    public final void draw(Canvas canvas) {
        e6.f fVar;
        super.draw(canvas);
        if (this.R) {
            x5.e eVar = this.R0;
            Objects.requireNonNull(eVar);
            int save = canvas.save();
            if (eVar.B != null && eVar.f12807b) {
                eVar.L.setTextSize(eVar.F);
                float f10 = eVar.f12820q;
                float f11 = eVar.f12821r;
                float f12 = eVar.E;
                if (f12 != 1.0f) {
                    canvas.scale(f12, f12, f10, f11);
                }
                canvas.translate(f10, f11);
                eVar.W.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.W != null && (fVar = this.V) != null) {
            fVar.draw(canvas);
            if (this.f4085t.isFocused()) {
                Rect bounds = this.W.getBounds();
                Rect bounds2 = this.V.getBounds();
                float f13 = this.R0.f12808c;
                int centerX = bounds2.centerX();
                bounds.left = f5.a.b(centerX, bounds2.left, f13);
                bounds.right = f5.a.b(centerX, bounds2.right, f13);
                this.W.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = r2.f12814k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.V0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.V0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            x5.e r2 = r4.R0
            r3 = 0
            if (r2 == 0) goto L_0x0037
            r2.J = r1
            android.content.res.ColorStateList r1 = r2.f12815l
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r2.f12814k
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r1 = r3
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            r2.k(r3)
            r1 = r0
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            r1 = r1 | r3
            goto L_0x0038
        L_0x0037:
            r1 = r3
        L_0x0038:
            android.widget.EditText r2 = r4.f4085t
            if (r2 == 0) goto L_0x004f
            java.util.WeakHashMap<android.view.View, n0.a0> r2 = n0.x.f8842a
            boolean r2 = n0.x.g.c(r4)
            if (r2 == 0) goto L_0x004b
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = r3
        L_0x004c:
            r4.A(r0, r3)
        L_0x004f:
            r4.w()
            r4.F()
            if (r1 == 0) goto L_0x005a
            r4.invalidate()
        L_0x005a:
            r4.V0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        float e10;
        if (!this.R) {
            return 0;
        }
        int i = this.f4068d0;
        if (i == 0) {
            e10 = this.R0.e();
        } else if (i != 2) {
            return 0;
        } else {
            e10 = this.R0.e() / 2.0f;
        }
        return (int) e10;
    }

    public final boolean f() {
        return this.R && !TextUtils.isEmpty(this.S) && (this.U instanceof i6.e);
    }

    public final int g(int i, boolean z10) {
        int compoundPaddingLeft = this.f4085t.getCompoundPaddingLeft() + i;
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public int getBaseline() {
        EditText editText = this.f4085t;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public e6.f getBoxBackground() {
        int i = this.f4068d0;
        if (i == 1 || i == 2) {
            return this.U;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f4074j0;
    }

    public int getBoxBackgroundMode() {
        return this.f4068d0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f4069e0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (t.c(this)) {
            return this.f4064a0.f4690h.a(this.f4077m0);
        }
        return this.f4064a0.g.a(this.f4077m0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (t.c(this)) {
            return this.f4064a0.g.a(this.f4077m0);
        }
        return this.f4064a0.f4690h.a(this.f4077m0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (t.c(this)) {
            return this.f4064a0.f4688e.a(this.f4077m0);
        }
        return this.f4064a0.f4689f.a(this.f4077m0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (t.c(this)) {
            return this.f4064a0.f4689f.a(this.f4077m0);
        }
        return this.f4064a0.f4688e.a(this.f4077m0);
    }

    public int getBoxStrokeColor() {
        return this.J0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.K0;
    }

    public int getBoxStrokeWidth() {
        return this.f4071g0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f4072h0;
    }

    public int getCounterMaxLength() {
        return this.B;
    }

    public CharSequence getCounterOverflowDescription() {
        f0 f0Var;
        if (!this.A || !this.C || (f0Var = this.D) == null) {
            return null;
        }
        return f0Var.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.N;
    }

    public ColorStateList getCounterTextColor() {
        return this.N;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.F0;
    }

    public EditText getEditText() {
        return this.f4085t;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f4086t0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f4086t0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f4082r0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f4086t0;
    }

    public CharSequence getError() {
        k kVar = this.z;
        if (kVar.f6204k) {
            return kVar.f6203j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.z.f6206m;
    }

    public int getErrorCurrentTextColors() {
        return this.z.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.C0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.z.g();
    }

    public CharSequence getHelperText() {
        k kVar = this.z;
        if (kVar.f6210q) {
            return kVar.f6209p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        f0 f0Var = this.z.f6211r;
        if (f0Var != null) {
            return f0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.R) {
            return this.S;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.R0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.R0.f();
    }

    public ColorStateList getHintTextColor() {
        return this.G0;
    }

    public int getMaxEms() {
        return this.f4091w;
    }

    public int getMaxWidth() {
        return this.f4095y;
    }

    public int getMinEms() {
        return this.f4089v;
    }

    public int getMinWidth() {
        return this.f4093x;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f4086t0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f4086t0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.H) {
            return this.G;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.K;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.J;
    }

    public CharSequence getPrefixText() {
        return this.f4065b.f6228c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f4065b.f6227b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f4065b.f6227b;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f4065b.f6229s.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f4065b.f6229s.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.P;
    }

    public ColorStateList getSuffixTextColor() {
        return this.Q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.Q;
    }

    public Typeface getTypeface() {
        return this.f4078n0;
    }

    public final int h(int i, boolean z10) {
        int compoundPaddingRight = i - this.f4085t.getCompoundPaddingRight();
        return (getPrefixText() == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public final boolean i() {
        return this.f4082r0 != 0;
    }

    public final void j() {
        f0 f0Var = this.I;
        if (f0Var != null && this.H) {
            f0Var.setText((CharSequence) null);
            m.a(this.f4063a, this.M);
            this.I.setVisibility(4);
        }
    }

    public final boolean k() {
        return this.f4083s.getVisibility() == 0 && this.f4086t0.getVisibility() == 0;
    }

    public final boolean l() {
        return this.C0.getVisibility() == 0;
    }

    public final void m() {
        int i = this.f4068d0;
        boolean z10 = true;
        if (i == 0) {
            this.U = null;
            this.V = null;
            this.W = null;
        } else if (i == 1) {
            this.U = new e6.f(this.f4064a0);
            this.V = new e6.f();
            this.W = new e6.f();
        } else if (i == 2) {
            if (!this.R || (this.U instanceof i6.e)) {
                this.U = new e6.f(this.f4064a0);
            } else {
                this.U = new i6.e(this.f4064a0);
            }
            this.V = null;
            this.W = null;
        } else {
            throw new IllegalArgumentException(androidx.activity.result.d.c(new StringBuilder(), this.f4068d0, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        EditText editText = this.f4085t;
        if ((editText == null || this.U == null || editText.getBackground() != null || this.f4068d0 == 0) ? false : true) {
            EditText editText2 = this.f4085t;
            e6.f fVar = this.U;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.d.q(editText2, fVar);
        }
        F();
        if (this.f4068d0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f4069e0 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (b6.c.d(getContext())) {
                this.f4069e0 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f4085t != null && this.f4068d0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale < 2.0f) {
                z10 = false;
            }
            if (z10) {
                EditText editText3 = this.f4085t;
                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                x.e.k(editText3, x.e.f(editText3), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), x.e.e(this.f4085t), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (b6.c.d(getContext())) {
                EditText editText4 = this.f4085t;
                WeakHashMap<View, a0> weakHashMap3 = x.f8842a;
                x.e.k(editText4, x.e.f(editText4), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), x.e.e(this.f4085t), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f4068d0 != 0) {
            z();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r13 = this;
            boolean r0 = r13.f()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r13.f4077m0
            x5.e r1 = r13.R0
            android.widget.EditText r2 = r13.f4085t
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r13.f4085t
            int r3 = r3.getGravity()
            java.lang.CharSequence r4 = r1.A
            boolean r4 = r1.b(r4)
            r1.C = r4
            r5 = 8388613(0x800005, float:1.175495E-38)
            r6 = 1
            r7 = 17
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 5
            if (r3 == r7) goto L_0x0053
            r10 = r3 & 7
            if (r10 != r6) goto L_0x002f
            goto L_0x0053
        L_0x002f:
            r10 = r3 & r5
            if (r10 == r5) goto L_0x0045
            r10 = r3 & 5
            if (r10 != r9) goto L_0x0038
            goto L_0x0045
        L_0x0038:
            android.graphics.Rect r10 = r1.f12810e
            if (r4 == 0) goto L_0x0042
            int r10 = r10.right
            float r10 = (float) r10
            float r11 = r1.X
            goto L_0x0058
        L_0x0042:
            int r10 = r10.left
            goto L_0x004b
        L_0x0045:
            android.graphics.Rect r10 = r1.f12810e
            if (r4 == 0) goto L_0x004d
            int r10 = r10.left
        L_0x004b:
            float r10 = (float) r10
            goto L_0x0059
        L_0x004d:
            int r10 = r10.right
            float r10 = (float) r10
            float r11 = r1.X
            goto L_0x0058
        L_0x0053:
            float r10 = (float) r2
            float r10 = r10 / r8
            float r11 = r1.X
            float r11 = r11 / r8
        L_0x0058:
            float r10 = r10 - r11
        L_0x0059:
            r0.left = r10
            android.graphics.Rect r11 = r1.f12810e
            int r12 = r11.top
            float r12 = (float) r12
            r0.top = r12
            if (r3 == r7) goto L_0x0085
            r7 = r3 & 7
            if (r7 != r6) goto L_0x0069
            goto L_0x0085
        L_0x0069:
            r2 = r3 & r5
            if (r2 == r5) goto L_0x007b
            r2 = r3 & 5
            if (r2 != r9) goto L_0x0072
            goto L_0x007b
        L_0x0072:
            if (r4 == 0) goto L_0x0077
            int r2 = r11.right
            goto L_0x0083
        L_0x0077:
            float r2 = r1.X
            float r2 = r2 + r10
            goto L_0x008b
        L_0x007b:
            if (r4 == 0) goto L_0x0081
            float r2 = r1.X
            float r2 = r2 + r10
            goto L_0x008b
        L_0x0081:
            int r2 = r11.right
        L_0x0083:
            float r2 = (float) r2
            goto L_0x008b
        L_0x0085:
            float r2 = (float) r2
            float r2 = r2 / r8
            float r3 = r1.X
            float r3 = r3 / r8
            float r2 = r2 + r3
        L_0x008b:
            r0.right = r2
            float r1 = r1.e()
            float r1 = r1 + r12
            r0.bottom = r1
            float r1 = r0.left
            int r2 = r13.f4067c0
            float r2 = (float) r2
            float r1 = r1 - r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 + r2
            r0.right = r1
            int r1 = r13.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r13.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            float r3 = r0.height()
            float r3 = r3 / r8
            float r2 = r2 - r3
            int r3 = r13.f4070f0
            float r3 = (float) r3
            float r2 = r2 + r3
            r0.offset(r1, r2)
            e6.f r1 = r13.U
            i6.e r1 = (i6.e) r1
            java.util.Objects.requireNonNull(r1)
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.x(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.n():void");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.R0.i(configuration);
    }

    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        int i13;
        int i14;
        super.onLayout(z10, i, i10, i11, i12);
        EditText editText = this.f4085t;
        if (editText != null) {
            Rect rect = this.f4075k0;
            x5.f.a(this, editText, rect);
            e6.f fVar = this.V;
            if (fVar != null) {
                int i15 = rect.bottom;
                fVar.setBounds(rect.left, i15 - this.f4071g0, rect.right, i15);
            }
            e6.f fVar2 = this.W;
            if (fVar2 != null) {
                int i16 = rect.bottom;
                fVar2.setBounds(rect.left, i16 - this.f4072h0, rect.right, i16);
            }
            if (this.R) {
                x5.e eVar = this.R0;
                float textSize = this.f4085t.getTextSize();
                if (eVar.i != textSize) {
                    eVar.i = textSize;
                    eVar.k(false);
                }
                int gravity = this.f4085t.getGravity();
                this.R0.m((gravity & -113) | 48);
                x5.e eVar2 = this.R0;
                if (eVar2.g != gravity) {
                    eVar2.g = gravity;
                    eVar2.k(false);
                }
                x5.e eVar3 = this.R0;
                if (this.f4085t != null) {
                    Rect rect2 = this.f4076l0;
                    boolean c10 = t.c(this);
                    rect2.bottom = rect.bottom;
                    int i17 = this.f4068d0;
                    if (i17 == 1) {
                        rect2.left = g(rect.left, c10);
                        rect2.top = rect.top + this.f4069e0;
                        rect2.right = h(rect.right, c10);
                    } else if (i17 != 2) {
                        rect2.left = g(rect.left, c10);
                        rect2.top = getPaddingTop();
                        rect2.right = h(rect.right, c10);
                    } else {
                        rect2.left = this.f4085t.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - e();
                        rect2.right = rect.right - this.f4085t.getPaddingRight();
                    }
                    Objects.requireNonNull(eVar3);
                    int i18 = rect2.left;
                    int i19 = rect2.top;
                    int i20 = rect2.right;
                    int i21 = rect2.bottom;
                    Rect rect3 = eVar3.f12810e;
                    if (!(rect3.left == i18 && rect3.top == i19 && rect3.right == i20 && rect3.bottom == i21)) {
                        rect3.set(i18, i19, i20, i21);
                        eVar3.K = true;
                        eVar3.j();
                    }
                    x5.e eVar4 = this.R0;
                    if (this.f4085t != null) {
                        Rect rect4 = this.f4076l0;
                        TextPaint textPaint = eVar4.M;
                        textPaint.setTextSize(eVar4.i);
                        textPaint.setTypeface(eVar4.f12825v);
                        textPaint.setLetterSpacing(eVar4.U);
                        float f10 = -eVar4.M.ascent();
                        rect4.left = this.f4085t.getCompoundPaddingLeft() + rect.left;
                        if (this.f4068d0 == 1 && this.f4085t.getMinLines() <= 1) {
                            i13 = (int) (((float) rect.centerY()) - (f10 / 2.0f));
                        } else {
                            i13 = rect.top + this.f4085t.getCompoundPaddingTop();
                        }
                        rect4.top = i13;
                        rect4.right = rect.right - this.f4085t.getCompoundPaddingRight();
                        if (this.f4068d0 == 1 && this.f4085t.getMinLines() <= 1) {
                            i14 = (int) (((float) rect4.top) + f10);
                        } else {
                            i14 = rect.bottom - this.f4085t.getCompoundPaddingBottom();
                        }
                        rect4.bottom = i14;
                        Objects.requireNonNull(eVar4);
                        int i22 = rect4.left;
                        int i23 = rect4.top;
                        int i24 = rect4.right;
                        int i25 = rect4.bottom;
                        Rect rect5 = eVar4.f12809d;
                        if (!(rect5.left == i22 && rect5.top == i23 && rect5.right == i24 && rect5.bottom == i25)) {
                            rect5.set(i22, i23, i24, i25);
                            eVar4.K = true;
                            eVar4.j();
                        }
                        this.R0.k(false);
                        if (f() && !this.Q0) {
                            n();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void onMeasure(int i, int i10) {
        boolean z10;
        EditText editText;
        int max;
        super.onMeasure(i, i10);
        if (this.f4085t != null && this.f4085t.getMeasuredHeight() < (max = Math.max(this.f4066c.getMeasuredHeight(), this.f4065b.getMeasuredHeight()))) {
            this.f4085t.setMinimumHeight(max);
            z10 = true;
        } else {
            z10 = false;
        }
        boolean v10 = v();
        if (z10 || v10) {
            this.f4085t.post(new c());
        }
        if (!(this.I == null || (editText = this.f4085t) == null)) {
            this.I.setGravity(editText.getGravity());
            this.I.setPadding(this.f4085t.getCompoundPaddingLeft(), this.f4085t.getCompoundPaddingTop(), this.f4085t.getCompoundPaddingRight(), this.f4085t.getCompoundPaddingBottom());
        }
        D();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f10849a);
        setError(hVar.f4102c);
        if (hVar.f4103s) {
            this.f4086t0.post(new b());
        }
        setHint(hVar.f4104t);
        setHelperText(hVar.f4105u);
        setPlaceholderText(hVar.f4106v);
        requestLayout();
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z10 = false;
        boolean z11 = i == 1;
        boolean z12 = this.b0;
        if (z11 != z12) {
            if (z11 && !z12) {
                z10 = true;
            }
            float a10 = this.f4064a0.f4688e.a(this.f4077m0);
            float a11 = this.f4064a0.f4689f.a(this.f4077m0);
            float a12 = this.f4064a0.f4690h.a(this.f4077m0);
            float a13 = this.f4064a0.g.a(this.f4077m0);
            float f10 = z10 ? a10 : a11;
            if (z10) {
                a10 = a11;
            }
            float f11 = z10 ? a12 : a13;
            if (z10) {
                a12 = a13;
            }
            boolean c10 = t.c(this);
            this.b0 = c10;
            float f12 = c10 ? a10 : f10;
            if (!c10) {
                f10 = a10;
            }
            float f13 = c10 ? a12 : f11;
            if (!c10) {
                f11 = a12;
            }
            e6.f fVar = this.U;
            if (fVar != null && fVar.k() == f12) {
                e6.f fVar2 = this.U;
                if (fVar2.f4653a.f4664a.f4689f.a(fVar2.h()) == f10) {
                    e6.f fVar3 = this.U;
                    if (fVar3.f4653a.f4664a.f4690h.a(fVar3.h()) == f13) {
                        e6.f fVar4 = this.U;
                        if (fVar4.f4653a.f4664a.g.a(fVar4.h()) == f11) {
                            return;
                        }
                    }
                }
            }
            i iVar = this.f4064a0;
            Objects.requireNonNull(iVar);
            i.a aVar = new i.a(iVar);
            aVar.e(f12);
            aVar.f(f10);
            aVar.c(f13);
            aVar.d(f11);
            this.f4064a0 = aVar.a();
            d();
        }
    }

    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.z.e()) {
            hVar.f4102c = getError();
        }
        hVar.f4103s = i() && this.f4086t0.isChecked();
        hVar.f4104t = getHint();
        hVar.f4105u = getHelperText();
        hVar.f4106v = getPlaceholderText();
        return hVar;
    }

    public final void p() {
        j.c(this, this.f4086t0, this.f4090v0);
    }

    public final void r(TextView textView, int i) {
        boolean z10 = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            textView.setTextAppearance(2131820985);
            Context context = getContext();
            Object obj = d0.a.f4256a;
            textView.setTextColor(a.c.a(context, R.color.design_error));
        }
    }

    public final void s() {
        if (this.D != null) {
            EditText editText = this.f4085t;
            t(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f4074j0 != i) {
            this.f4074j0 = i;
            this.L0 = i;
            this.N0 = i;
            this.O0 = i;
            d();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        Context context = getContext();
        Object obj = d0.a.f4256a;
        setBoxBackgroundColor(a.c.a(context, i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.L0 = defaultColor;
        this.f4074j0 = defaultColor;
        this.M0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.N0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.O0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        d();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f4068d0) {
            this.f4068d0 = i;
            if (this.f4085t != null) {
                m();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f4069e0 = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.J0 != i) {
            this.J0 = i;
            F();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.H0 = colorStateList.getDefaultColor();
            this.P0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.I0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.J0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.J0 != colorStateList.getDefaultColor()) {
            this.J0 = colorStateList.getDefaultColor();
        }
        F();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            F();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f4071g0 = i;
        F();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f4072h0 = i;
        F();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.A != z10) {
            if (z10) {
                f0 f0Var = new f0(getContext(), (AttributeSet) null);
                this.D = f0Var;
                f0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.f4078n0;
                if (typeface != null) {
                    this.D.setTypeface(typeface);
                }
                this.D.setMaxLines(1);
                this.z.a(this.D, 2);
                ((ViewGroup.MarginLayoutParams) this.D.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                u();
                s();
            } else {
                this.z.j(this.D, 2);
                this.D = null;
            }
            this.A = z10;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.B != i) {
            if (i > 0) {
                this.B = i;
            } else {
                this.B = -1;
            }
            if (this.A) {
                s();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.E != i) {
            this.E = i;
            u();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            u();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.F != i) {
            this.F = i;
            u();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            u();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.F0 = colorStateList;
        this.G0 = colorStateList;
        if (this.f4085t != null) {
            A(false, false);
        }
    }

    public void setEnabled(boolean z10) {
        o(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f4086t0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f4086t0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? a.b.a0(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i10 = this.f4082r0;
        if (i10 != i) {
            this.f4082r0 = i;
            Iterator<g> it = this.f4088u0.iterator();
            while (it.hasNext()) {
                it.next().a(this, i10);
            }
            setEndIconVisible(i != 0);
            if (getEndIconDelegate().b(this.f4068d0)) {
                getEndIconDelegate().a();
                j.a(this, this.f4086t0, this.f4090v0, this.f4092w0);
                return;
            }
            StringBuilder d10 = a.a.d("The current box background mode ");
            d10.append(this.f4068d0);
            d10.append(" is not supported by the end icon mode ");
            d10.append(i);
            throw new IllegalStateException(d10.toString());
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f4086t0;
        View.OnLongClickListener onLongClickListener = this.A0;
        checkableImageButton.setOnClickListener(onClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f4086t0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f4090v0 != colorStateList) {
            this.f4090v0 = colorStateList;
            j.a(this, this.f4086t0, colorStateList, this.f4092w0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f4092w0 != mode) {
            this.f4092w0 = mode;
            j.a(this, this.f4086t0, this.f4090v0, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (k() != z10) {
            this.f4086t0.setVisibility(z10 ? 0 : 8);
            x();
            D();
            v();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.z.f6204k) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            k kVar = this.z;
            kVar.c();
            kVar.f6203j = charSequence;
            kVar.f6205l.setText(charSequence);
            int i = kVar.f6202h;
            if (i != 1) {
                kVar.i = 1;
            }
            kVar.l(i, kVar.i, kVar.k(kVar.f6205l, charSequence));
            return;
        }
        this.z.i();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        k kVar = this.z;
        kVar.f6206m = charSequence;
        f0 f0Var = kVar.f6205l;
        if (f0Var != null) {
            f0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        k kVar = this.z;
        if (kVar.f6204k != z10) {
            kVar.c();
            if (z10) {
                f0 f0Var = new f0(kVar.f6196a, (AttributeSet) null);
                kVar.f6205l = f0Var;
                f0Var.setId(R.id.textinput_error);
                kVar.f6205l.setTextAlignment(5);
                Typeface typeface = kVar.f6214u;
                if (typeface != null) {
                    kVar.f6205l.setTypeface(typeface);
                }
                int i = kVar.f6207n;
                kVar.f6207n = i;
                f0 f0Var2 = kVar.f6205l;
                if (f0Var2 != null) {
                    kVar.f6197b.r(f0Var2, i);
                }
                ColorStateList colorStateList = kVar.f6208o;
                kVar.f6208o = colorStateList;
                f0 f0Var3 = kVar.f6205l;
                if (!(f0Var3 == null || colorStateList == null)) {
                    f0Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = kVar.f6206m;
                kVar.f6206m = charSequence;
                f0 f0Var4 = kVar.f6205l;
                if (f0Var4 != null) {
                    f0Var4.setContentDescription(charSequence);
                }
                kVar.f6205l.setVisibility(4);
                f0 f0Var5 = kVar.f6205l;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.g.f(f0Var5, 1);
                kVar.a(kVar.f6205l, 0);
            } else {
                kVar.i();
                kVar.j(kVar.f6205l, 0);
                kVar.f6205l = null;
                kVar.f6197b.w();
                kVar.f6197b.F();
            }
            kVar.f6204k = z10;
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? a.b.a0(getContext(), i) : null);
        j.c(this, this.C0, this.D0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.C0;
        View.OnLongClickListener onLongClickListener = this.B0;
        checkableImageButton.setOnClickListener(onClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.B0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.C0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            j.a(this, this.C0, colorStateList, this.E0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.E0 != mode) {
            this.E0 = mode;
            j.a(this, this.C0, this.D0, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        k kVar = this.z;
        kVar.f6207n = i;
        f0 f0Var = kVar.f6205l;
        if (f0Var != null) {
            kVar.f6197b.r(f0Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        k kVar = this.z;
        kVar.f6208o = colorStateList;
        f0 f0Var = kVar.f6205l;
        if (f0Var != null && colorStateList != null) {
            f0Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.S0 != z10) {
            this.S0 = z10;
            A(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.z.f6210q) {
                setHelperTextEnabled(true);
            }
            k kVar = this.z;
            kVar.c();
            kVar.f6209p = charSequence;
            kVar.f6211r.setText(charSequence);
            int i = kVar.f6202h;
            if (i != 2) {
                kVar.i = 2;
            }
            kVar.l(i, kVar.i, kVar.k(kVar.f6211r, charSequence));
        } else if (this.z.f6210q) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        k kVar = this.z;
        kVar.f6213t = colorStateList;
        f0 f0Var = kVar.f6211r;
        if (f0Var != null && colorStateList != null) {
            f0Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        k kVar = this.z;
        if (kVar.f6210q != z10) {
            kVar.c();
            if (z10) {
                f0 f0Var = new f0(kVar.f6196a, (AttributeSet) null);
                kVar.f6211r = f0Var;
                f0Var.setId(R.id.textinput_helper_text);
                kVar.f6211r.setTextAlignment(5);
                Typeface typeface = kVar.f6214u;
                if (typeface != null) {
                    kVar.f6211r.setTypeface(typeface);
                }
                kVar.f6211r.setVisibility(4);
                f0 f0Var2 = kVar.f6211r;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.g.f(f0Var2, 1);
                int i = kVar.f6212s;
                kVar.f6212s = i;
                f0 f0Var3 = kVar.f6211r;
                if (f0Var3 != null) {
                    f0Var3.setTextAppearance(i);
                }
                ColorStateList colorStateList = kVar.f6213t;
                kVar.f6213t = colorStateList;
                f0 f0Var4 = kVar.f6211r;
                if (!(f0Var4 == null || colorStateList == null)) {
                    f0Var4.setTextColor(colorStateList);
                }
                kVar.a(kVar.f6211r, 1);
                kVar.f6211r.setAccessibilityDelegate(new l(kVar));
            } else {
                kVar.c();
                int i10 = kVar.f6202h;
                if (i10 == 2) {
                    kVar.i = 0;
                }
                kVar.l(i10, kVar.i, kVar.k(kVar.f6211r, BuildConfig.FLAVOR));
                kVar.j(kVar.f6211r, 1);
                kVar.f6211r = null;
                kVar.f6197b.w();
                kVar.f6197b.F();
            }
            kVar.f6210q = z10;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        k kVar = this.z;
        kVar.f6212s = i;
        f0 f0Var = kVar.f6211r;
        if (f0Var != null) {
            f0Var.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.R) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.T0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.R) {
            this.R = z10;
            if (!z10) {
                this.T = false;
                if (!TextUtils.isEmpty(this.S) && TextUtils.isEmpty(this.f4085t.getHint())) {
                    this.f4085t.setHint(this.S);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f4085t.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.S)) {
                        setHint(hint);
                    }
                    this.f4085t.setHint((CharSequence) null);
                }
                this.T = true;
            }
            if (this.f4085t != null) {
                z();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        x5.e eVar = this.R0;
        b6.d dVar = new b6.d(eVar.f12806a.getContext(), i);
        ColorStateList colorStateList = dVar.f2876j;
        if (colorStateList != null) {
            eVar.f12815l = colorStateList;
        }
        float f10 = dVar.f2877k;
        if (f10 != 0.0f) {
            eVar.f12813j = f10;
        }
        ColorStateList colorStateList2 = dVar.f2869a;
        if (colorStateList2 != null) {
            eVar.S = colorStateList2;
        }
        eVar.Q = dVar.f2873e;
        eVar.R = dVar.f2874f;
        eVar.P = dVar.g;
        eVar.T = dVar.i;
        b6.a aVar = eVar.z;
        if (aVar != null) {
            aVar.f2868x = true;
        }
        x5.d dVar2 = new x5.d(eVar);
        dVar.a();
        eVar.z = new b6.a(dVar2, dVar.f2880n);
        dVar.c(eVar.f12806a.getContext(), eVar.z);
        eVar.k(false);
        this.G0 = this.R0.f12815l;
        if (this.f4085t != null) {
            A(false, false);
            z();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            if (this.F0 == null) {
                this.R0.l(colorStateList);
            }
            this.G0 = colorStateList;
            if (this.f4085t != null) {
                A(false, false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.f4091w = i;
        EditText editText = this.f4085t;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.f4095y = i;
        EditText editText = this.f4085t;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f4089v = i;
        EditText editText = this.f4085t;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.f4093x = i;
        EditText editText = this.f4085t;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? a.b.a0(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.f4082r0 != 1) {
            setEndIconMode(1);
        } else if (!z10) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f4090v0 = colorStateList;
        j.a(this, this.f4086t0, colorStateList, this.f4092w0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f4092w0 = mode;
        j.a(this, this.f4086t0, this.f4090v0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.I == null) {
            f0 f0Var = new f0(getContext(), (AttributeSet) null);
            this.I = f0Var;
            f0Var.setId(R.id.textinput_placeholder);
            f0 f0Var2 = this.I;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.d.s(f0Var2, 2);
            p1.c cVar = new p1.c();
            cVar.f9527c = 87;
            LinearInterpolator linearInterpolator = f5.a.f4984a;
            cVar.f9528s = linearInterpolator;
            this.L = cVar;
            cVar.f9526b = 67;
            p1.c cVar2 = new p1.c();
            cVar2.f9527c = 87;
            cVar2.f9528s = linearInterpolator;
            this.M = cVar2;
            setPlaceholderTextAppearance(this.K);
            setPlaceholderTextColor(this.J);
        }
        int i = 0;
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.H) {
                setPlaceholderTextEnabled(true);
            }
            this.G = charSequence;
        }
        EditText editText = this.f4085t;
        if (editText != null) {
            i = editText.getText().length();
        }
        B(i);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.K = i;
        f0 f0Var = this.I;
        if (f0Var != null) {
            f0Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            f0 f0Var = this.I;
            if (f0Var != null && colorStateList != null) {
                f0Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        p pVar = this.f4065b;
        Objects.requireNonNull(pVar);
        pVar.f6228c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f6227b.setText(charSequence);
        pVar.g();
    }

    public void setPrefixTextAppearance(int i) {
        this.f4065b.f6227b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f4065b.f6227b.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f4065b.f6229s.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? a.b.a0(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f4065b.c(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f4065b.d(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        p pVar = this.f4065b;
        if (pVar.f6230t != colorStateList) {
            pVar.f6230t = colorStateList;
            j.a(pVar.f6226a, pVar.f6229s, colorStateList, pVar.f6231u);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f4065b;
        if (pVar.f6231u != mode) {
            pVar.f6231u = mode;
            j.a(pVar.f6226a, pVar.f6229s, pVar.f6230t, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f4065b.e(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.P = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.Q.setText(charSequence);
        E();
    }

    public void setSuffixTextAppearance(int i) {
        this.Q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.Q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f4085t;
        if (editText != null) {
            x.p(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f4078n0) {
            this.f4078n0 = typeface;
            this.R0.q(typeface);
            k kVar = this.z;
            if (typeface != kVar.f6214u) {
                kVar.f6214u = typeface;
                f0 f0Var = kVar.f6205l;
                if (f0Var != null) {
                    f0Var.setTypeface(typeface);
                }
                f0 f0Var2 = kVar.f6211r;
                if (f0Var2 != null) {
                    f0Var2.setTypeface(typeface);
                }
            }
            f0 f0Var3 = this.D;
            if (f0Var3 != null) {
                f0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t(int i) {
        boolean z10 = this.C;
        int i10 = this.B;
        String str = null;
        if (i10 == -1) {
            this.D.setText(String.valueOf(i));
            this.D.setContentDescription((CharSequence) null);
            this.C = false;
        } else {
            this.C = i > i10;
            Context context = getContext();
            this.D.setContentDescription(context.getString(this.C ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(this.B)}));
            if (z10 != this.C) {
                u();
            }
            l0.a c10 = l0.a.c();
            f0 f0Var = this.D;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.B)});
            l0.d dVar = c10.f7742c;
            if (string != null) {
                str = ((SpannableStringBuilder) c10.d(string, dVar)).toString();
            }
            f0Var.setText(str);
        }
        if (this.f4085t != null && z10 != this.C) {
            A(false, false);
            F();
            w();
        }
    }

    public final void u() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f0 f0Var = this.D;
        if (f0Var != null) {
            r(f0Var, this.C ? this.E : this.F);
            if (!this.C && (colorStateList2 = this.N) != null) {
                this.D.setTextColor(colorStateList2);
            }
            if (this.C && (colorStateList = this.O) != null) {
                this.D.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f4085t
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 1
            if (r0 != 0) goto L_0x001d
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x0027
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0027
        L_0x001d:
            i6.p r0 = r10.f4065b
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0027
            r0 = r2
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            r3 = 0
            r4 = 3
            r5 = 2
            if (r0 == 0) goto L_0x0066
            i6.p r0 = r10.f4065b
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f4085t
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.f4079o0
            if (r6 == 0) goto L_0x0042
            int r6 = r10.f4080p0
            if (r6 == r0) goto L_0x004e
        L_0x0042:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f4079o0 = r6
            r10.f4080p0 = r0
            r6.setBounds(r1, r1, r0, r2)
        L_0x004e:
            android.widget.EditText r0 = r10.f4085t
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.f4079o0
            if (r6 == r7) goto L_0x007f
            android.widget.EditText r6 = r10.f4085t
            r8 = r0[r2]
            r9 = r0[r5]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L_0x007d
        L_0x0066:
            android.graphics.drawable.ColorDrawable r0 = r10.f4079o0
            if (r0 == 0) goto L_0x007f
            android.widget.EditText r0 = r10.f4085t
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.f4085t
            r7 = r0[r2]
            r8 = r0[r5]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r3, r7, r8, r0)
            r10.f4079o0 = r3
        L_0x007d:
            r0 = r2
            goto L_0x0080
        L_0x007f:
            r0 = r1
        L_0x0080:
            com.google.android.material.internal.CheckableImageButton r6 = r10.C0
            int r6 = r6.getVisibility()
            if (r6 == 0) goto L_0x0098
            boolean r6 = r10.i()
            if (r6 == 0) goto L_0x0094
            boolean r6 = r10.k()
            if (r6 != 0) goto L_0x0098
        L_0x0094:
            java.lang.CharSequence r6 = r10.P
            if (r6 == 0) goto L_0x00a2
        L_0x0098:
            android.widget.LinearLayout r6 = r10.f4066c
            int r6 = r6.getMeasuredWidth()
            if (r6 <= 0) goto L_0x00a2
            r6 = r2
            goto L_0x00a3
        L_0x00a2:
            r6 = r1
        L_0x00a3:
            if (r6 == 0) goto L_0x010f
            androidx.appcompat.widget.f0 r3 = r10.Q
            int r3 = r3.getMeasuredWidth()
            android.widget.EditText r6 = r10.f4085t
            int r6 = r6.getPaddingRight()
            int r3 = r3 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00c8
            int r7 = r6.getMeasuredWidth()
            int r7 = r7 + r3
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r3 = r3.getMarginStart()
            int r3 = r3 + r7
        L_0x00c8:
            android.widget.EditText r6 = r10.f4085t
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            android.graphics.drawable.ColorDrawable r7 = r10.f4094x0
            if (r7 == 0) goto L_0x00e9
            int r8 = r10.f4096y0
            if (r8 == r3) goto L_0x00e9
            r10.f4096y0 = r3
            r7.setBounds(r1, r1, r3, r2)
            android.widget.EditText r0 = r10.f4085t
            r1 = r6[r1]
            r3 = r6[r2]
            android.graphics.drawable.ColorDrawable r5 = r10.f4094x0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r5, r4)
            goto L_0x0130
        L_0x00e9:
            if (r7 != 0) goto L_0x00f7
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f4094x0 = r7
            r10.f4096y0 = r3
            r7.setBounds(r1, r1, r3, r2)
        L_0x00f7:
            r3 = r6[r5]
            android.graphics.drawable.ColorDrawable r7 = r10.f4094x0
            if (r3 == r7) goto L_0x010d
            r0 = r6[r5]
            r10.z0 = r0
            android.widget.EditText r0 = r10.f4085t
            r1 = r6[r1]
            r3 = r6[r2]
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L_0x0130
        L_0x010d:
            r2 = r0
            goto L_0x0130
        L_0x010f:
            android.graphics.drawable.ColorDrawable r6 = r10.f4094x0
            if (r6 == 0) goto L_0x0131
            android.widget.EditText r6 = r10.f4085t
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r5 = r6[r5]
            android.graphics.drawable.ColorDrawable r7 = r10.f4094x0
            if (r5 != r7) goto L_0x012d
            android.widget.EditText r0 = r10.f4085t
            r1 = r6[r1]
            r5 = r6[r2]
            android.graphics.drawable.Drawable r7 = r10.z0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r5, r7, r4)
            goto L_0x012e
        L_0x012d:
            r2 = r0
        L_0x012e:
            r10.f4094x0 = r3
        L_0x0130:
            r0 = r2
        L_0x0131:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.v():boolean");
    }

    public final void w() {
        Drawable background;
        f0 f0Var;
        EditText editText = this.f4085t;
        if (editText != null && this.f4068d0 == 0 && (background = editText.getBackground()) != null) {
            if (k0.a(background)) {
                background = background.mutate();
            }
            if (this.z.e()) {
                background.setColorFilter(androidx.appcompat.widget.l.c(this.z.g(), PorterDuff.Mode.SRC_IN));
            } else if (!this.C || (f0Var = this.D) == null) {
                background.clearColorFilter();
                this.f4085t.refreshDrawableState();
            } else {
                background.setColorFilter(androidx.appcompat.widget.l.c(f0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void x() {
        int i = 8;
        this.f4083s.setVisibility((this.f4086t0.getVisibility() != 0 || l()) ? 8 : 0);
        boolean z10 = k() || l() || !((this.P == null || this.Q0) ? true : false);
        LinearLayout linearLayout = this.f4066c;
        if (z10) {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getErrorIconDrawable()
            r1 = 0
            if (r0 == 0) goto L_0x0015
            i6.k r0 = r3.z
            boolean r2 = r0.f6204k
            if (r2 == 0) goto L_0x0015
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            com.google.android.material.internal.CheckableImageButton r2 = r3.C0
            if (r0 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r1 = 8
        L_0x001d:
            r2.setVisibility(r1)
            r3.x()
            r3.D()
            boolean r0 = r3.i()
            if (r0 != 0) goto L_0x002f
            r3.v()
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.y():void");
    }

    public final void z() {
        if (this.f4068d0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4063a.getLayoutParams();
            int e10 = e();
            if (e10 != layoutParams.topMargin) {
                layoutParams.topMargin = e10;
                this.f4063a.requestLayout();
            }
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f4086t0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f4086t0.setImageDrawable(drawable);
        if (drawable != null) {
            j.a(this, this.f4086t0, this.f4090v0, this.f4092w0);
            p();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f4065b.a(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f4065b.b(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.C0.setImageDrawable(drawable);
        y();
        j.a(this, this.C0, this.D0, this.E0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f4086t0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f4086t0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
