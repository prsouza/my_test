package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e6.e;
import f5.g;
import f5.h;
import java.util.Objects;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f4178c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f4179d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f4180e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f4181f = new int[2];
    public float g;

    /* renamed from: h  reason: collision with root package name */
    public float f4182h;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4183a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f4184b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f4185c;

        public a(boolean z, View view, View view2) {
            this.f4183a = z;
            this.f4184b = view;
            this.f4185c = view2;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f4183a) {
                this.f4184b.setVisibility(4);
                this.f4185c.setAlpha(1.0f);
                this.f4185c.setVisibility(0);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f4183a) {
                this.f4184b.setVisibility(0);
                this.f4185c.setAlpha(0.0f);
                this.f4185c.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f4186a;

        /* renamed from: b  reason: collision with root package name */
        public e f4187b;
    }

    public FabTransformationBehavior() {
    }

    public abstract b A(Context context, boolean z);

    public final ViewGroup B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public final boolean b(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.f1625h == 0) {
            fVar.f1625h = 80;
        }
    }

    /* JADX WARNING: type inference failed for: r7v9, types: [android.util.Property<android.view.ViewGroup, java.lang.Float>, f5.c] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x03d0 A[LOOP:1: B:108:0x03ce->B:109:0x03d0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0350  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet t(android.view.View r27, android.view.View r28, boolean r29, boolean r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            android.content.Context r4 = r28.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$b r4 = r0.A(r4, r3)
            if (r3 == 0) goto L_0x001e
            float r5 = r27.getTranslationX()
            r0.g = r5
            float r5 = r27.getTranslationY()
            r0.f4182h = r5
        L_0x001e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.WeakHashMap<android.view.View, n0.a0> r7 = n0.x.f8842a
            float r7 = n0.x.i.i(r28)
            float r8 = n0.x.i.i(r27)
            float r7 = r7 - r8
            r8 = 0
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0049
            if (r30 != 0) goto L_0x003e
            float r7 = -r7
            r2.setTranslationZ(r7)
        L_0x003e:
            android.util.Property r7 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r9]
            r11[r10] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
            goto L_0x0054
        L_0x0049:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r9]
            float r7 = -r7
            r12[r10] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L_0x0054:
            f5.g r11 = r4.f4186a
            java.lang.String r12 = "elevation"
            f5.h r11 = r11.c(r12)
            r11.a(r7)
            r5.add(r7)
            android.graphics.RectF r7 = r0.f4179d
            e6.e r11 = r4.f4187b
            float r11 = r0.w(r1, r2, r11)
            e6.e r12 = r4.f4187b
            float r12 = r0.x(r1, r2, r12)
            android.util.Pair r13 = r0.v(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            f5.h r14 = (f5.h) r14
            java.lang.Object r13 = r13.second
            f5.h r13 = (f5.h) r13
            if (r3 == 0) goto L_0x00c6
            if (r30 != 0) goto L_0x0088
            float r15 = -r11
            r2.setTranslationX(r15)
            float r15 = -r12
            r2.setTranslationY(r15)
        L_0x0088:
            android.util.Property r15 = android.view.View.TRANSLATION_X
            r16 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            android.util.Property r15 = android.view.View.TRANSLATION_Y
            r17 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            float r11 = -r11
            float r12 = -r12
            float r11 = r0.y(r4, r14, r11)
            float r12 = r0.y(r4, r13, r12)
            android.graphics.Rect r15 = r0.f4178c
            r2.getWindowVisibleDisplayFrame(r15)
            android.graphics.RectF r8 = r0.f4179d
            r8.set(r15)
            android.graphics.RectF r15 = r0.f4180e
            r0.z(r2, r15)
            r15.offset(r11, r12)
            r15.intersect(r8)
            r7.set(r15)
            r8 = r6
            r6 = r17
            goto L_0x00de
        L_0x00c6:
            r16 = r6
            android.util.Property r6 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r9]
            float r11 = -r11
            r8[r10] = r11
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r6, r8)
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r9]
            float r12 = -r12
            r11[r10] = r12
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r8, r11)
        L_0x00de:
            r14.a(r6)
            r13.a(r8)
            r5.add(r6)
            r5.add(r8)
            float r6 = r7.width()
            float r7 = r7.height()
            e6.e r8 = r4.f4187b
            float r8 = r0.w(r1, r2, r8)
            e6.e r11 = r4.f4187b
            float r11 = r0.x(r1, r2, r11)
            android.util.Pair r12 = r0.v(r8, r11, r3, r4)
            java.lang.Object r13 = r12.first
            f5.h r13 = (f5.h) r13
            java.lang.Object r12 = r12.second
            f5.h r12 = (f5.h) r12
            android.util.Property r14 = android.view.View.TRANSLATION_X
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            float r8 = r0.g
        L_0x0113:
            r15[r10] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            float r11 = r0.f4182h
        L_0x0122:
            r15[r10] = r11
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            r13.a(r8)
            r12.a(r11)
            r5.add(r8)
            r5.add(r11)
            boolean r8 = r2 instanceof q5.d
            if (r8 == 0) goto L_0x018c
            boolean r11 = r1 instanceof android.widget.ImageView
            if (r11 != 0) goto L_0x013d
            goto L_0x018c
        L_0x013d:
            r11 = r2
            q5.d r11 = (q5.d) r11
            r12 = r1
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.graphics.drawable.Drawable r12 = r12.getDrawable()
            if (r12 != 0) goto L_0x014a
            goto L_0x018c
        L_0x014a:
            r12.mutate()
            r13 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0161
            if (r30 != 0) goto L_0x0156
            r12.setAlpha(r13)
        L_0x0156:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r13 = f5.d.f4991a
            int[] r14 = new int[r9]
            r14[r10] = r10
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r13, r14)
            goto L_0x016b
        L_0x0161:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r14 = f5.d.f4991a
            int[] r15 = new int[r9]
            r15[r10] = r13
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r14, r15)
        L_0x016b:
            com.google.android.material.transformation.a r14 = new com.google.android.material.transformation.a
            r14.<init>(r2)
            r13.addUpdateListener(r14)
            f5.g r14 = r4.f4186a
            java.lang.String r15 = "iconFade"
            f5.h r14 = r14.c(r15)
            r14.a(r13)
            r5.add(r13)
            com.google.android.material.transformation.b r13 = new com.google.android.material.transformation.b
            r13.<init>(r11, r12)
            r11 = r16
            r11.add(r13)
            goto L_0x018e
        L_0x018c:
            r11 = r16
        L_0x018e:
            if (r8 != 0) goto L_0x0196
            r18 = r4
            r1 = r5
            r3 = r11
            goto L_0x02ee
        L_0x0196:
            r12 = r2
            q5.d r12 = (q5.d) r12
            e6.e r13 = r4.f4187b
            android.graphics.RectF r14 = r0.f4179d
            android.graphics.RectF r15 = r0.f4180e
            r0.u(r1, r14)
            r0.z(r2, r15)
            float r13 = r0.w(r1, r2, r13)
            float r13 = -r13
            r10 = 0
            r15.offset(r13, r10)
            float r13 = r14.centerX()
            float r14 = r15.left
            float r13 = r13 - r14
            e6.e r14 = r4.f4187b
            android.graphics.RectF r15 = r0.f4179d
            android.graphics.RectF r9 = r0.f4180e
            r0.u(r1, r15)
            r0.z(r2, r9)
            float r14 = r0.x(r1, r2, r14)
            float r14 = -r14
            r9.offset(r10, r14)
            float r10 = r15.centerY()
            float r9 = r9.top
            float r10 = r10 - r9
            r9 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r9
            android.graphics.Rect r14 = r0.f4178c
            r9.g(r14)
            android.graphics.Rect r9 = r0.f4178c
            int r9 = r9.width()
            float r9 = (float) r9
            r14 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r14
            f5.g r14 = r4.f4186a
            java.lang.String r15 = "expansion"
            f5.h r14 = r14.c(r15)
            if (r3 == 0) goto L_0x025d
            if (r30 != 0) goto L_0x01f6
            q5.d$d r15 = new q5.d$d
            r15.<init>(r13, r10, r9)
            r12.setRevealInfo(r15)
        L_0x01f6:
            if (r30 == 0) goto L_0x01fe
            q5.d$d r9 = r12.getRevealInfo()
            float r9 = r9.f10310c
        L_0x01fe:
            r15 = 0
            float r18 = e6.e.H(r13, r10, r15, r15)
            float r19 = e6.e.H(r13, r10, r6, r15)
            float r6 = e6.e.H(r13, r10, r6, r7)
            float r7 = e6.e.H(r13, r10, r15, r7)
            int r15 = (r18 > r19 ? 1 : (r18 == r19 ? 0 : -1))
            if (r15 <= 0) goto L_0x021e
            int r15 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x021e
            int r15 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r15 <= 0) goto L_0x021e
            r6 = r18
            goto L_0x022f
        L_0x021e:
            int r15 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x0229
            int r15 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r15 <= 0) goto L_0x0229
            r6 = r19
            goto L_0x022f
        L_0x0229:
            int r15 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r15 <= 0) goto L_0x022e
            goto L_0x022f
        L_0x022e:
            r6 = r7
        L_0x022f:
            android.animation.Animator r6 = q5.b.a(r12, r13, r10, r6)
            com.google.android.material.transformation.c r7 = new com.google.android.material.transformation.c
            r7.<init>(r12)
            r6.addListener(r7)
            long r0 = r14.f4998a
            int r7 = (int) r13
            int r10 = (int) r10
            r15 = r4
            r3 = 0
            int r13 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x0253
            android.animation.Animator r7 = android.view.ViewAnimationUtils.createCircularReveal(r2, r7, r10, r9, r9)
            r7.setStartDelay(r3)
            r7.setDuration(r0)
            r5.add(r7)
        L_0x0253:
            r1 = r5
            r22 = r11
            r21 = r12
            r0 = r14
            r18 = r15
            goto L_0x02dc
        L_0x025d:
            r15 = r4
            q5.d$d r0 = r12.getRevealInfo()
            float r0 = r0.f10310c
            android.animation.Animator r6 = q5.b.a(r12, r13, r10, r9)
            long r3 = r14.f4998a
            int r1 = (int) r13
            int r7 = (int) r10
            r13 = r11
            r10 = 0
            int r18 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r18 <= 0) goto L_0x0280
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r7, r0, r0)
            r0.setStartDelay(r10)
            r0.setDuration(r3)
            r5.add(r0)
        L_0x0280:
            long r3 = r14.f4998a
            long r10 = r14.f4999b
            r0 = r15
            f5.g r15 = r0.f4186a
            r20 = r6
            s.g<java.lang.String, f5.h> r6 = r15.f4996a
            int r6 = r6.f10843c
            r18 = r0
            r21 = r12
            r22 = r13
            r0 = 0
            r12 = 0
        L_0x0296:
            if (r0 >= r6) goto L_0x02bc
            r19 = r6
            s.g<java.lang.String, f5.h> r6 = r15.f4996a
            java.lang.Object r6 = r6.m(r0)
            f5.h r6 = (f5.h) r6
            r23 = r14
            r24 = r15
            long r14 = r6.f4998a
            r25 = r5
            long r5 = r6.f4999b
            long r14 = r14 + r5
            long r12 = java.lang.Math.max(r12, r14)
            int r0 = r0 + 1
            r6 = r19
            r14 = r23
            r15 = r24
            r5 = r25
            goto L_0x0296
        L_0x02bc:
            r25 = r5
            r23 = r14
            long r3 = r3 + r10
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x02d6
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r7, r9, r9)
            r0.setStartDelay(r3)
            long r12 = r12 - r3
            r0.setDuration(r12)
            r1 = r25
            r1.add(r0)
            goto L_0x02d8
        L_0x02d6:
            r1 = r25
        L_0x02d8:
            r6 = r20
            r0 = r23
        L_0x02dc:
            r0.a(r6)
            r1.add(r6)
            q5.a r0 = new q5.a
            r3 = r21
            r0.<init>(r3)
            r3 = r22
            r3.add(r0)
        L_0x02ee:
            if (r8 != 0) goto L_0x02f5
            r6 = r29
            r4 = r18
            goto L_0x0349
        L_0x02f5:
            r0 = r2
            q5.d r0 = (q5.d) r0
            java.util.WeakHashMap<android.view.View, n0.a0> r4 = n0.x.f8842a
            android.content.res.ColorStateList r4 = n0.x.i.g(r27)
            if (r4 == 0) goto L_0x030d
            int[] r5 = r27.getDrawableState()
            int r6 = r4.getDefaultColor()
            int r4 = r4.getColorForState(r5, r6)
            goto L_0x030e
        L_0x030d:
            r4 = 0
        L_0x030e:
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r6 = r29
            if (r6 == 0) goto L_0x0328
            if (r30 != 0) goto L_0x031b
            r0.setCircularRevealScrimColor(r4)
        L_0x031b:
            android.util.Property<q5.d, java.lang.Integer> r4 = q5.d.c.f10307a
            r7 = 1
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r4, r8)
            goto L_0x0334
        L_0x0328:
            r7 = 1
            r9 = 0
            android.util.Property<q5.d, java.lang.Integer> r5 = q5.d.c.f10307a
            int[] r8 = new int[r7]
            r8[r9] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r5, r8)
        L_0x0334:
            f5.b r4 = f5.b.f4989a
            r0.setEvaluator(r4)
            r4 = r18
            f5.g r5 = r4.f4186a
            java.lang.String r7 = "color"
            f5.h r5 = r5.c(r7)
            r5.a(r0)
            r1.add(r0)
        L_0x0349:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x0350
            r5 = r26
            goto L_0x037e
        L_0x0350:
            r0 = 2131231124(0x7f080194, float:1.807832E38)
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x0360
            r5 = r26
            android.view.ViewGroup r0 = r5.B(r0)
            goto L_0x037c
        L_0x0360:
            r5 = r26
            boolean r0 = r2 instanceof k6.c
            if (r0 != 0) goto L_0x0370
            boolean r0 = r2 instanceof k6.b
            if (r0 == 0) goto L_0x036b
            goto L_0x0370
        L_0x036b:
            android.view.ViewGroup r0 = r5.B(r2)
            goto L_0x037c
        L_0x0370:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7 = 0
            android.view.View r0 = r0.getChildAt(r7)
            android.view.ViewGroup r0 = r5.B(r0)
        L_0x037c:
            if (r0 != 0) goto L_0x0380
        L_0x037e:
            r10 = 0
            goto L_0x03b8
        L_0x0380:
            if (r6 == 0) goto L_0x039d
            if (r30 != 0) goto L_0x038e
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = f5.c.f4990a
            r8 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r7.set(r0, r8)
        L_0x038e:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = f5.c.f4990a
            r8 = 1
            float[] r8 = new float[r8]
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r8[r10] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r7, r8)
            goto L_0x03aa
        L_0x039d:
            r8 = 1
            r10 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = f5.c.f4990a
            float[] r8 = new float[r8]
            r9 = 0
            r8[r10] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r7, r8)
        L_0x03aa:
            f5.g r4 = r4.f4186a
            java.lang.String r7 = "contentFade"
            f5.h r4 = r4.c(r7)
            r4.a(r0)
            r1.add(r0)
        L_0x03b8:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            ad.c.h0(r0, r1)
            com.google.android.material.transformation.FabTransformationBehavior$a r1 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r27
            r1.<init>(r6, r2, r4)
            r0.addListener(r1)
            int r1 = r3.size()
        L_0x03ce:
            if (r10 >= r1) goto L_0x03dc
            java.lang.Object r2 = r3.get(r10)
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r0.addListener(r2)
            int r10 = r10 + 1
            goto L_0x03ce
        L_0x03dc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.t(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final void u(View view, RectF rectF) {
        z(view, rectF);
        rectF.offset(this.g, this.f4182h);
    }

    public final Pair<h, h> v(float f10, float f11, boolean z, b bVar) {
        h hVar;
        h hVar2;
        int i;
        if (f10 == 0.0f || f11 == 0.0f) {
            hVar2 = bVar.f4186a.c("translationXLinear");
            hVar = bVar.f4186a.c("translationYLinear");
        } else if ((!z || f11 >= 0.0f) && (z || i <= 0)) {
            hVar2 = bVar.f4186a.c("translationXCurveDownwards");
            hVar = bVar.f4186a.c("translationYCurveDownwards");
        } else {
            hVar2 = bVar.f4186a.c("translationXCurveUpwards");
            hVar = bVar.f4186a.c("translationYCurveUpwards");
        }
        return new Pair<>(hVar2, hVar);
    }

    public final float w(View view, View view2, e eVar) {
        RectF rectF = this.f4179d;
        RectF rectF2 = this.f4180e;
        u(view, rectF);
        z(view2, rectF2);
        Objects.requireNonNull(eVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float x(View view, View view2, e eVar) {
        RectF rectF = this.f4179d;
        RectF rectF2 = this.f4180e;
        u(view, rectF);
        z(view2, rectF2);
        Objects.requireNonNull(eVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float y(b bVar, h hVar, float f10) {
        long j10 = hVar.f4998a;
        long j11 = hVar.f4999b;
        h c10 = bVar.f4186a.c("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((c10.f4998a + c10.f4999b) + 17) - j10)) / ((float) j11));
        LinearInterpolator linearInterpolator = f5.a.f4984a;
        return a.a.a(0.0f, f10, interpolation, f10);
    }

    public final void z(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f4181f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
