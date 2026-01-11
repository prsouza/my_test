package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import x5.k;

public class d {
    public static final int[] A = {16843623, 16842908, 16842910};
    public static final int[] B = {16842908, 16842910};
    public static final int[] C = {16843623, 16842910};
    public static final int[] D = {16842910};
    public static final int[] E = new int[0];

    /* renamed from: y  reason: collision with root package name */
    public static final b1.a f3941y = f5.a.f4986c;
    public static final int[] z = {16842919, 16842910};

    /* renamed from: a  reason: collision with root package name */
    public e6.i f3942a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3943b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3944c = true;

    /* renamed from: d  reason: collision with root package name */
    public float f3945d;

    /* renamed from: e  reason: collision with root package name */
    public float f3946e;

    /* renamed from: f  reason: collision with root package name */
    public float f3947f;
    public final k g;

    /* renamed from: h  reason: collision with root package name */
    public Animator f3948h;
    public f5.g i;

    /* renamed from: j  reason: collision with root package name */
    public f5.g f3949j;

    /* renamed from: k  reason: collision with root package name */
    public float f3950k;

    /* renamed from: l  reason: collision with root package name */
    public float f3951l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public int f3952m;

    /* renamed from: n  reason: collision with root package name */
    public int f3953n = 0;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f3954o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f3955p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<f> f3956q;

    /* renamed from: r  reason: collision with root package name */
    public final FloatingActionButton f3957r;

    /* renamed from: s  reason: collision with root package name */
    public final d6.b f3958s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f3959t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public final RectF f3960u = new RectF();

    /* renamed from: v  reason: collision with root package name */
    public final RectF f3961v = new RectF();

    /* renamed from: w  reason: collision with root package name */
    public final Matrix f3962w = new Matrix();

    /* renamed from: x  reason: collision with root package name */
    public w5.b f3963x;

    public class a extends f5.f {
        public a() {
        }

        public final Object evaluate(float f10, Object obj, Object obj2) {
            d.this.f3951l = f10;
            ((Matrix) obj).getValues(this.f4993a);
            ((Matrix) obj2).getValues(this.f4994b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f4994b;
                float f11 = fArr[i];
                float[] fArr2 = this.f4993a;
                fArr[i] = ((f11 - fArr2[i]) * f10) + fArr2[i];
            }
            this.f4995c.setValues(this.f4994b);
            return this.f4995c;
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f3965a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f3966b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f3967c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ float f3968s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ float f3969t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ float f3970u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ float f3971v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Matrix f3972w;

        public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f3965a = f10;
            this.f3966b = f11;
            this.f3967c = f12;
            this.f3968s = f13;
            this.f3969t = f14;
            this.f3970u = f15;
            this.f3971v = f16;
            this.f3972w = matrix;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.f3957r.setAlpha(f5.a.a(this.f3965a, this.f3966b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = d.this.f3957r;
            float f10 = this.f3967c;
            floatingActionButton.setScaleX(((this.f3968s - f10) * floatValue) + f10);
            FloatingActionButton floatingActionButton2 = d.this.f3957r;
            float f11 = this.f3969t;
            floatingActionButton2.setScaleY(((this.f3968s - f11) * floatValue) + f11);
            d dVar = d.this;
            float f12 = this.f3970u;
            float f13 = this.f3971v;
            dVar.f3951l = a.a.a(f13, f12, floatValue, f12);
            dVar.a(a.a.a(f13, f12, floatValue, f12), this.f3972w);
            d.this.f3957r.setImageMatrix(this.f3972w);
        }
    }

    public class c extends i {
        public c(d dVar) {
            super();
        }

        public final float a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d  reason: collision with other inner class name */
    public class C0045d extends i {
        public C0045d() {
            super();
        }

        public final float a() {
            d dVar = d.this;
            return dVar.f3945d + dVar.f3946e;
        }
    }

    public class e extends i {
        public e() {
            super();
        }

        public final float a() {
            d dVar = d.this;
            return dVar.f3945d + dVar.f3947f;
        }
    }

    public interface f {
        void a();

        void b();
    }

    public interface g {
    }

    public class h extends i {
        public h() {
            super();
        }

        public final float a() {
            return d.this.f3945d;
        }
    }

    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3977a;

        public i() {
        }

        public abstract float a();

        public final void onAnimationEnd(Animator animator) {
            Objects.requireNonNull(d.this);
            this.f3977a = false;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f3977a) {
                Objects.requireNonNull(d.this);
                a();
                this.f3977a = true;
            }
            d dVar = d.this;
            valueAnimator.getAnimatedFraction();
            Objects.requireNonNull(dVar);
        }
    }

    public d(FloatingActionButton floatingActionButton, d6.b bVar) {
        this.f3957r = floatingActionButton;
        this.f3958s = bVar;
        k kVar = new k();
        this.g = kVar;
        kVar.a(z, d(new e()));
        kVar.a(A, d(new C0045d()));
        kVar.a(B, d(new C0045d()));
        kVar.a(C, d(new C0045d()));
        kVar.a(D, d(new h()));
        kVar.a(E, d(new c(this)));
        this.f3950k = floatingActionButton.getRotation();
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f3957r.getDrawable();
        if (drawable != null && this.f3952m != 0) {
            RectF rectF = this.f3960u;
            RectF rectF2 = this.f3961v;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i10 = this.f3952m;
            rectF2.set(0.0f, 0.0f, (float) i10, (float) i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f3952m;
            matrix.postScale(f10, f10, ((float) i11) / 2.0f, ((float) i11) / 2.0f);
        }
    }

    public final AnimatorSet b(f5.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f3957r, View.ALPHA, new float[]{f10});
        gVar.c("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f3957r, View.SCALE_X, new float[]{f11});
        gVar.c("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ofFloat2.setEvaluator(new w5.a());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f3957r, View.SCALE_Y, new float[]{f11});
        gVar.c("scale").a(ofFloat3);
        if (i10 == 26) {
            ofFloat3.setEvaluator(new w5.a());
        }
        arrayList.add(ofFloat3);
        a(f12, this.f3962w);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f3957r, new f5.e(), new a(), new Matrix[]{new Matrix(this.f3962w)});
        gVar.c("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        ad.c.h0(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new b(this.f3957r.getAlpha(), f10, this.f3957r.getScaleX(), f11, this.f3957r.getScaleY(), this.f3951l, f12, new Matrix(this.f3962w)));
        arrayList.add(ofFloat);
        ad.c.h0(animatorSet, arrayList);
        Context context = this.f3957r.getContext();
        int integer = this.f3957r.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1);
        TypedValue a10 = b6.b.a(context, R.attr.motionDurationLong1);
        if (a10 != null && a10.type == 16) {
            integer = a10.data;
        }
        animatorSet.setDuration((long) integer);
        animatorSet.setInterpolator(y5.a.c(this.f3957r.getContext(), f5.a.f4985b));
        return animatorSet;
    }

    public final ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f3941y);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int i10 = 0;
        if (this.f3943b) {
            i10 = (0 - this.f3957r.getSizeDimension()) / 2;
        }
        float e10 = this.f3944c ? e() + this.f3947f : 0.0f;
        int max = Math.max(i10, (int) Math.ceil((double) e10));
        int max2 = Math.max(i10, (int) Math.ceil((double) (e10 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public final boolean g() {
        if (this.f3957r.getVisibility() == 0) {
            if (this.f3953n == 1) {
                return true;
            }
            return false;
        } else if (this.f3953n != 2) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean h() {
        if (this.f3957r.getVisibility() != 0) {
            if (this.f3953n == 2) {
                return true;
            }
            return false;
        } else if (this.f3953n != 1) {
            return true;
        } else {
            return false;
        }
    }

    public void i() {
        throw null;
    }

    public void j() {
        throw null;
    }

    public void k(int[] iArr) {
        throw null;
    }

    public void l(float f10, float f11, float f12) {
        throw null;
    }

    public final void m() {
        ArrayList<f> arrayList = this.f3956q;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public final void n() {
        ArrayList<f> arrayList = this.f3956q;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public final void o(float f10) {
        this.f3951l = f10;
        Matrix matrix = this.f3962w;
        a(f10, matrix);
        this.f3957r.setImageMatrix(matrix);
    }

    public void p() {
        throw null;
    }

    public boolean q() {
        throw null;
    }

    public final boolean r() {
        FloatingActionButton floatingActionButton = this.f3957r;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        return x.g.c(floatingActionButton) && !this.f3957r.isInEditMode();
    }

    public void s() {
        throw null;
    }

    public final void t() {
        Rect rect = this.f3959t;
        f(rect);
        c3.k.S((Object) null, "Didn't initialize content background");
        if (q()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.f3958s;
            Objects.requireNonNull(bVar);
            d.super.setBackgroundDrawable(insetDrawable);
        } else {
            Objects.requireNonNull(this.f3958s);
        }
        d6.b bVar2 = this.f3958s;
        int i10 = rect.left;
        Objects.requireNonNull(FloatingActionButton.this);
        throw null;
    }
}
