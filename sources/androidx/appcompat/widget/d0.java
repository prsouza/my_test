package androidx.appcompat.widget;

import ad.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b9.m;
import f0.f;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import p0.a;
import q0.b;
import q0.g;
import q0.i;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1191a;

    /* renamed from: b  reason: collision with root package name */
    public b1 f1192b;

    /* renamed from: c  reason: collision with root package name */
    public b1 f1193c;

    /* renamed from: d  reason: collision with root package name */
    public b1 f1194d;

    /* renamed from: e  reason: collision with root package name */
    public b1 f1195e;

    /* renamed from: f  reason: collision with root package name */
    public b1 f1196f;
    public b1 g;

    /* renamed from: h  reason: collision with root package name */
    public b1 f1197h;
    public final g0 i;

    /* renamed from: j  reason: collision with root package name */
    public int f1198j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1199k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f1200l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1201m;

    public class a extends f.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1202a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1203b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f1204c;

        public a(int i, int i10, WeakReference weakReference) {
            this.f1202a = i;
            this.f1203b = i10;
            this.f1204c = weakReference;
        }

        public final void d(int i) {
        }

        public final void e(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1202a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f1203b & 2) != 0);
            }
            d0 d0Var = d0.this;
            WeakReference weakReference = this.f1204c;
            if (d0Var.f1201m) {
                d0Var.f1200l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, a0> weakHashMap = x.f8842a;
                    if (x.g.b(textView)) {
                        textView.post(new e0(textView, typeface, d0Var.f1198j));
                    } else {
                        textView.setTypeface(typeface, d0Var.f1198j);
                    }
                }
            }
        }
    }

    public d0(TextView textView) {
        this.f1191a = textView;
        this.i = new g0(textView);
    }

    public static b1 d(Context context, l lVar, int i10) {
        ColorStateList d10 = lVar.d(context, i10);
        if (d10 == null) {
            return null;
        }
        b1 b1Var = new b1();
        b1Var.f1178d = true;
        b1Var.f1175a = d10;
        return b1Var;
    }

    public final void a(Drawable drawable, b1 b1Var) {
        if (drawable != null && b1Var != null) {
            l.f(drawable, b1Var, this.f1191a.getDrawableState());
        }
    }

    public final void b() {
        if (!(this.f1192b == null && this.f1193c == null && this.f1194d == null && this.f1195e == null)) {
            Drawable[] compoundDrawables = this.f1191a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1192b);
            a(compoundDrawables[1], this.f1193c);
            a(compoundDrawables[2], this.f1194d);
            a(compoundDrawables[3], this.f1195e);
        }
        if (this.f1196f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = this.f1191a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1196f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    public final void c() {
        this.i.a();
    }

    public final boolean e() {
        g0 g0Var = this.i;
        return g0Var.i() && g0Var.f1250a != 0;
    }

    public final void f(AttributeSet attributeSet, int i10) {
        String str;
        String str2;
        boolean z;
        boolean z10;
        int i11;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        int i12 = i10;
        Context context = this.f1191a.getContext();
        l a10 = l.a();
        int[] iArr = c.B;
        d1 q10 = d1.q(context, attributeSet2, iArr, i12);
        TextView textView = this.f1191a;
        x.o(textView, textView.getContext(), iArr, attributeSet, q10.f1207b, i10);
        int l10 = q10.l(0, -1);
        if (q10.o(3)) {
            this.f1192b = d(context, a10, q10.l(3, 0));
        }
        if (q10.o(1)) {
            this.f1193c = d(context, a10, q10.l(1, 0));
        }
        if (q10.o(4)) {
            this.f1194d = d(context, a10, q10.l(4, 0));
        }
        if (q10.o(2)) {
            this.f1195e = d(context, a10, q10.l(2, 0));
        }
        int i13 = Build.VERSION.SDK_INT;
        if (q10.o(5)) {
            this.f1196f = d(context, a10, q10.l(5, 0));
        }
        if (q10.o(6)) {
            this.g = d(context, a10, q10.l(6, 0));
        }
        q10.r();
        boolean z11 = this.f1191a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (l10 != -1) {
            d1 d1Var = new d1(context, context.obtainStyledAttributes(l10, c.R));
            if (z11 || !d1Var.o(14)) {
                z10 = false;
                z = false;
            } else {
                z10 = d1Var.a(14, false);
                z = true;
            }
            o(context, d1Var);
            str2 = d1Var.o(15) ? d1Var.m(15) : null;
            str = (i13 < 26 || !d1Var.o(13)) ? null : d1Var.m(13);
            d1Var.r();
        } else {
            z10 = false;
            z = false;
            str2 = null;
            str = null;
        }
        d1 d1Var2 = new d1(context, context.obtainStyledAttributes(attributeSet2, c.R, i12, 0));
        if (!z11 && d1Var2.o(14)) {
            z10 = d1Var2.a(14, false);
            z = true;
        }
        if (d1Var2.o(15)) {
            str2 = d1Var2.m(15);
        }
        String str3 = str2;
        if (i13 >= 26 && d1Var2.o(13)) {
            str = d1Var2.m(13);
        }
        String str4 = str;
        if (i13 >= 28 && d1Var2.o(0) && d1Var2.f(0, -1) == 0) {
            this.f1191a.setTextSize(0, 0.0f);
        }
        o(context, d1Var2);
        d1Var2.r();
        if (!z11 && z) {
            i(z10);
        }
        Typeface typeface = this.f1200l;
        if (typeface != null) {
            if (this.f1199k == -1) {
                this.f1191a.setTypeface(typeface, this.f1198j);
            } else {
                this.f1191a.setTypeface(typeface);
            }
        }
        if (str4 != null) {
            this.f1191a.setFontVariationSettings(str4);
        }
        if (str3 != null) {
            if (i13 >= 24) {
                this.f1191a.setTextLocales(LocaleList.forLanguageTags(str3));
            } else {
                this.f1191a.setTextLocale(Locale.forLanguageTag(str3.substring(0, str3.indexOf(44))));
            }
        }
        g0 g0Var = this.i;
        Context context2 = g0Var.f1257j;
        int[] iArr2 = c.C;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr2, i12, 0);
        TextView textView2 = g0Var.i;
        x.o(textView2, textView2.getContext(), iArr2, attributeSet, obtainStyledAttributes, i10);
        if (obtainStyledAttributes.hasValue(5)) {
            g0Var.f1250a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i14 = 0; i14 < length; i14++) {
                    iArr3[i14] = obtainTypedArray.getDimensionPixelSize(i14, -1);
                }
                g0Var.f1255f = g0Var.b(iArr3);
                g0Var.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!g0Var.i()) {
            g0Var.f1250a = 0;
        } else if (g0Var.f1250a == 1) {
            if (!g0Var.g) {
                DisplayMetrics displayMetrics = g0Var.f1257j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i11 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i11 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i11, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                g0Var.j(dimension2, dimension3, dimension);
            }
            g0Var.g();
        }
        if (b.f10093r) {
            g0 g0Var2 = this.i;
            if (g0Var2.f1250a != 0) {
                int[] iArr4 = g0Var2.f1255f;
                if (iArr4.length > 0) {
                    if (((float) this.f1191a.getAutoSizeStepGranularity()) != -1.0f) {
                        this.f1191a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.i.f1253d), Math.round(this.i.f1254e), Math.round(this.i.f1252c), 0);
                    } else {
                        this.f1191a.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                    }
                }
            }
        }
        d1 d1Var3 = new d1(context, context.obtainStyledAttributes(attributeSet2, c.C));
        int l11 = d1Var3.l(8, -1);
        Drawable b10 = l11 != -1 ? a10.b(context, l11) : null;
        int l12 = d1Var3.l(13, -1);
        Drawable b11 = l12 != -1 ? a10.b(context, l12) : null;
        int l13 = d1Var3.l(9, -1);
        Drawable b12 = l13 != -1 ? a10.b(context, l13) : null;
        int l14 = d1Var3.l(6, -1);
        Drawable b13 = l14 != -1 ? a10.b(context, l14) : null;
        int l15 = d1Var3.l(10, -1);
        Drawable b14 = l15 != -1 ? a10.b(context, l15) : null;
        int l16 = d1Var3.l(7, -1);
        Drawable b15 = l16 != -1 ? a10.b(context, l16) : null;
        if (b14 != null || b15 != null) {
            Drawable[] compoundDrawablesRelative = this.f1191a.getCompoundDrawablesRelative();
            TextView textView3 = this.f1191a;
            if (b14 == null) {
                b14 = compoundDrawablesRelative[0];
            }
            if (b11 == null) {
                b11 = compoundDrawablesRelative[1];
            }
            if (b15 == null) {
                b15 = compoundDrawablesRelative[2];
            }
            if (b13 == null) {
                b13 = compoundDrawablesRelative[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(b14, b11, b15, b13);
        } else if (!(b10 == null && b11 == null && b12 == null && b13 == null)) {
            Drawable[] compoundDrawablesRelative2 = this.f1191a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f1191a.getCompoundDrawables();
                TextView textView4 = this.f1191a;
                if (b10 == null) {
                    b10 = compoundDrawables[0];
                }
                if (b11 == null) {
                    b11 = compoundDrawables[1];
                }
                if (b12 == null) {
                    b12 = compoundDrawables[2];
                }
                if (b13 == null) {
                    b13 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, b13);
            } else {
                TextView textView5 = this.f1191a;
                Drawable drawable = compoundDrawablesRelative2[0];
                if (b11 == null) {
                    b11 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (b13 == null) {
                    b13 = compoundDrawablesRelative2[3];
                }
                textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b11, drawable2, b13);
            }
        }
        if (d1Var3.o(11)) {
            ColorStateList c10 = d1Var3.c(11);
            TextView textView6 = this.f1191a;
            Objects.requireNonNull(textView6);
            if (Build.VERSION.SDK_INT >= 24) {
                textView6.setCompoundDrawableTintList(c10);
            } else if (textView6 instanceof i) {
                ((i) textView6).setSupportCompoundDrawablesTintList(c10);
            }
        }
        if (d1Var3.o(12)) {
            PorterDuff.Mode e10 = k0.e(d1Var3.j(12, -1), (PorterDuff.Mode) null);
            TextView textView7 = this.f1191a;
            Objects.requireNonNull(textView7);
            if (Build.VERSION.SDK_INT >= 24) {
                textView7.setCompoundDrawableTintMode(e10);
            } else if (textView7 instanceof i) {
                ((i) textView7).setSupportCompoundDrawablesTintMode(e10);
            }
        }
        int f10 = d1Var3.f(15, -1);
        int f11 = d1Var3.f(18, -1);
        int f12 = d1Var3.f(19, -1);
        d1Var3.r();
        if (f10 != -1) {
            g.b(this.f1191a, f10);
        }
        if (f11 != -1) {
            g.c(this.f1191a, f11);
        }
        if (f12 != -1) {
            g.d(this.f1191a, f12);
        }
    }

    public final void g(Context context, int i10) {
        String m10;
        d1 d1Var = new d1(context, context.obtainStyledAttributes(i10, c.R));
        if (d1Var.o(14)) {
            i(d1Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (d1Var.o(0) && d1Var.f(0, -1) == 0) {
            this.f1191a.setTextSize(0, 0.0f);
        }
        o(context, d1Var);
        if (i11 >= 26 && d1Var.o(13) && (m10 = d1Var.m(13)) != null) {
            this.f1191a.setFontVariationSettings(m10);
        }
        d1Var.r();
        Typeface typeface = this.f1200l;
        if (typeface != null) {
            this.f1191a.setTypeface(typeface, this.f1198j);
        }
    }

    public final void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        CharSequence charSequence;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i10 >= 30) {
                a.C0185a.a(editorInfo, text);
                return;
            }
            Objects.requireNonNull(text);
            if (i10 >= 30) {
                a.C0185a.a(editorInfo, text);
                return;
            }
            int i11 = editorInfo.initialSelStart;
            int i12 = editorInfo.initialSelEnd;
            int i13 = i11 > i12 ? i12 + 0 : i11 + 0;
            int i14 = i11 > i12 ? i11 - 0 : i12 + 0;
            int length = text.length();
            if (i13 < 0 || i14 > length) {
                p0.a.d(editorInfo, (CharSequence) null, 0, 0);
                return;
            }
            int i15 = editorInfo.inputType & 4095;
            if (i15 == 129 || i15 == 225 || i15 == 18) {
                p0.a.d(editorInfo, (CharSequence) null, 0, 0);
            } else if (length <= 2048) {
                p0.a.d(editorInfo, text, i13, i14);
            } else {
                int i16 = i14 - i13;
                int i17 = i16 > 1024 ? 0 : i16;
                int i18 = 2048 - i17;
                int min = Math.min(text.length() - i14, i18 - Math.min(i13, (int) (((double) i18) * 0.8d)));
                int min2 = Math.min(i13, i18 - min);
                int i19 = i13 - min2;
                if (p0.a.b(text, i19, 0)) {
                    i19++;
                    min2--;
                }
                if (p0.a.b(text, (i14 + min) - 1, 1)) {
                    min--;
                }
                int i20 = min2 + i17 + min;
                if (i17 != i16) {
                    charSequence = TextUtils.concat(new CharSequence[]{text.subSequence(i19, i19 + min2), text.subSequence(i14, min + i14)});
                } else {
                    charSequence = text.subSequence(i19, i20 + i19);
                }
                int i21 = min2 + 0;
                p0.a.d(editorInfo, charSequence, i21, i17 + i21);
            }
        }
    }

    public final void i(boolean z) {
        this.f1191a.setAllCaps(z);
    }

    public final void j(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        g0 g0Var = this.i;
        if (g0Var.i()) {
            DisplayMetrics displayMetrics = g0Var.f1257j.getResources().getDisplayMetrics();
            g0Var.j(TypedValue.applyDimension(i13, (float) i10, displayMetrics), TypedValue.applyDimension(i13, (float) i11, displayMetrics), TypedValue.applyDimension(i13, (float) i12, displayMetrics));
            if (g0Var.g()) {
                g0Var.a();
            }
        }
    }

    public final void k(int[] iArr, int i10) throws IllegalArgumentException {
        g0 g0Var = this.i;
        if (g0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = g0Var.f1257j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, (float) iArr[i11], displayMetrics));
                    }
                }
                g0Var.f1255f = g0Var.b(iArr2);
                if (!g0Var.h()) {
                    StringBuilder d10 = a.a.d("None of the preset sizes is valid: ");
                    d10.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(d10.toString());
                }
            } else {
                g0Var.g = false;
            }
            if (g0Var.g()) {
                g0Var.a();
            }
        }
    }

    public final void l(int i10) {
        g0 g0Var = this.i;
        if (!g0Var.i()) {
            return;
        }
        if (i10 == 0) {
            g0Var.f1250a = 0;
            g0Var.f1253d = -1.0f;
            g0Var.f1254e = -1.0f;
            g0Var.f1252c = -1.0f;
            g0Var.f1255f = new int[0];
            g0Var.f1251b = false;
        } else if (i10 == 1) {
            DisplayMetrics displayMetrics = g0Var.f1257j.getResources().getDisplayMetrics();
            g0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (g0Var.g()) {
                g0Var.a();
            }
        } else {
            throw new IllegalArgumentException(m.b("Unknown auto-size text type: ", i10));
        }
    }

    public final void m(ColorStateList colorStateList) {
        if (this.f1197h == null) {
            this.f1197h = new b1();
        }
        b1 b1Var = this.f1197h;
        b1Var.f1175a = colorStateList;
        b1Var.f1178d = colorStateList != null;
        this.f1192b = b1Var;
        this.f1193c = b1Var;
        this.f1194d = b1Var;
        this.f1195e = b1Var;
        this.f1196f = b1Var;
        this.g = b1Var;
    }

    public final void n(PorterDuff.Mode mode) {
        if (this.f1197h == null) {
            this.f1197h = new b1();
        }
        b1 b1Var = this.f1197h;
        b1Var.f1176b = mode;
        b1Var.f1177c = mode != null;
        this.f1192b = b1Var;
        this.f1193c = b1Var;
        this.f1194d = b1Var;
        this.f1195e = b1Var;
        this.f1196f = b1Var;
        this.g = b1Var;
    }

    public final void o(Context context, d1 d1Var) {
        String m10;
        this.f1198j = d1Var.j(2, this.f1198j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i10 >= 28) {
            int j10 = d1Var.j(11, -1);
            this.f1199k = j10;
            if (j10 != -1) {
                this.f1198j = (this.f1198j & 2) | 0;
            }
        }
        int i11 = 10;
        if (d1Var.o(10) || d1Var.o(12)) {
            this.f1200l = null;
            if (d1Var.o(12)) {
                i11 = 12;
            }
            int i12 = this.f1199k;
            int i13 = this.f1198j;
            if (!context.isRestricted()) {
                try {
                    Typeface i14 = d1Var.i(i11, this.f1198j, new a(i12, i13, new WeakReference(this.f1191a)));
                    if (i14 != null) {
                        if (i10 < 28 || this.f1199k == -1) {
                            this.f1200l = i14;
                        } else {
                            this.f1200l = Typeface.create(Typeface.create(i14, 0), this.f1199k, (this.f1198j & 2) != 0);
                        }
                    }
                    this.f1201m = this.f1200l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1200l == null && (m10 = d1Var.m(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1199k == -1) {
                    this.f1200l = Typeface.create(m10, this.f1198j);
                    return;
                }
                Typeface create = Typeface.create(m10, 0);
                int i15 = this.f1199k;
                if ((this.f1198j & 2) != 0) {
                    z = true;
                }
                this.f1200l = Typeface.create(create, i15, z);
            }
        } else if (d1Var.o(1)) {
            this.f1201m = false;
            int j11 = d1Var.j(1, 1);
            if (j11 == 1) {
                this.f1200l = Typeface.SANS_SERIF;
            } else if (j11 == 2) {
                this.f1200l = Typeface.SERIF;
            } else if (j11 == 3) {
                this.f1200l = Typeface.MONOSPACE;
            }
        }
    }
}
