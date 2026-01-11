package i6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.f0;
import b6.c;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.material.textfield.TextInputLayout;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6196a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f6197b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f6198c;

    /* renamed from: d  reason: collision with root package name */
    public int f6199d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f6200e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f6201f;
    public final float g;

    /* renamed from: h  reason: collision with root package name */
    public int f6202h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f6203j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6204k;

    /* renamed from: l  reason: collision with root package name */
    public f0 f6205l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f6206m;

    /* renamed from: n  reason: collision with root package name */
    public int f6207n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f6208o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f6209p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6210q;

    /* renamed from: r  reason: collision with root package name */
    public f0 f6211r;

    /* renamed from: s  reason: collision with root package name */
    public int f6212s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f6213t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f6214u;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6215a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f6216b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f6217c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ TextView f6218s;

        public a(int i, TextView textView, int i10, TextView textView2) {
            this.f6215a = i;
            this.f6216b = textView;
            this.f6217c = i10;
            this.f6218s = textView2;
        }

        public final void onAnimationEnd(Animator animator) {
            f0 f0Var;
            k kVar = k.this;
            kVar.f6202h = this.f6215a;
            kVar.f6201f = null;
            TextView textView = this.f6216b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f6217c == 1 && (f0Var = k.this.f6205l) != null) {
                    f0Var.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f6218s;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f6218s.setAlpha(1.0f);
            }
        }

        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f6218s;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public k(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f6196a = context;
        this.f6197b = textInputLayout;
        this.g = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(TextView textView, int i10) {
        if (this.f6198c == null && this.f6200e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f6196a);
            this.f6198c = linearLayout;
            linearLayout.setOrientation(0);
            this.f6197b.addView(this.f6198c, -1, -2);
            this.f6200e = new FrameLayout(this.f6196a);
            this.f6198c.addView(this.f6200e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f6197b.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f6200e.setVisibility(0);
            this.f6200e.addView(textView);
        } else {
            this.f6198c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f6198c.setVisibility(0);
        this.f6199d++;
    }

    public final void b() {
        if ((this.f6198c == null || this.f6197b.getEditText() == null) ? false : true) {
            EditText editText = this.f6197b.getEditText();
            boolean d10 = c.d(this.f6196a);
            LinearLayout linearLayout = this.f6198c;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.e.k(linearLayout, h(d10, R.dimen.material_helper_text_font_1_3_padding_horizontal, x.e.f(editText)), h(d10, R.dimen.material_helper_text_font_1_3_padding_top, this.f6196a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), h(d10, R.dimen.material_helper_text_font_1_3_padding_horizontal, x.e.e(editText)), 0);
        }
    }

    public final void c() {
        Animator animator = this.f6201f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(List<Animator> list, boolean z, TextView textView, int i10, int i11, int i12) {
        if (textView != null && z) {
            if (i10 == i12 || i10 == i11) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{i12 == i10 ? 1.0f : 0.0f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(f5.a.f4984a);
                list.add(ofFloat);
                if (i12 == i10) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.g, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(f5.a.f4987d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public final boolean e() {
        if (this.i != 1 || this.f6205l == null || TextUtils.isEmpty(this.f6203j)) {
            return false;
        }
        return true;
    }

    public final TextView f(int i10) {
        if (i10 == 1) {
            return this.f6205l;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f6211r;
    }

    public final int g() {
        f0 f0Var = this.f6205l;
        if (f0Var != null) {
            return f0Var.getCurrentTextColor();
        }
        return -1;
    }

    public final int h(boolean z, int i10, int i11) {
        return z ? this.f6196a.getResources().getDimensionPixelSize(i10) : i11;
    }

    public final void i() {
        this.f6203j = null;
        c();
        if (this.f6202h == 1) {
            if (!this.f6210q || TextUtils.isEmpty(this.f6209p)) {
                this.i = 0;
            } else {
                this.i = 2;
            }
        }
        l(this.f6202h, this.i, k(this.f6205l, BuildConfig.FLAVOR));
    }

    public final void j(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f6198c;
        if (linearLayout != null) {
            if (!(i10 == 0 || i10 == 1) || (frameLayout = this.f6200e) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i11 = this.f6199d - 1;
            this.f6199d = i11;
            LinearLayout linearLayout2 = this.f6198c;
            if (i11 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean k(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f6197b;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        return x.g.c(textInputLayout) && this.f6197b.isEnabled() && (this.i != this.f6202h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void l(int i10, int i11, boolean z) {
        TextView f10;
        TextView f11;
        int i12 = i10;
        int i13 = i11;
        boolean z10 = z;
        if (i12 != i13) {
            if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f6201f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i14 = i10;
                int i15 = i11;
                d(arrayList2, this.f6210q, this.f6211r, 2, i14, i15);
                d(arrayList2, this.f6204k, this.f6205l, 1, i14, i15);
                ad.c.h0(animatorSet, arrayList);
                animatorSet.addListener(new a(i11, f(i10), i10, f(i13)));
                animatorSet.start();
            } else if (i12 != i13) {
                if (!(i13 == 0 || (f11 = f(i13)) == null)) {
                    f11.setVisibility(0);
                    f11.setAlpha(1.0f);
                }
                if (!(i12 == 0 || (f10 = f(i10)) == null)) {
                    f10.setVisibility(4);
                    if (i12 == 1) {
                        f10.setText((CharSequence) null);
                    }
                }
                this.f6202h = i13;
            }
            this.f6197b.w();
            this.f6197b.A(z10, false);
            this.f6197b.F();
        }
    }
}
