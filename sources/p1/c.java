package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class c extends a0 {

    public class a extends l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f9511a;

        public a(View view) {
            this.f9511a = view;
        }

        public final void a(i iVar) {
            t.c(this.f9511a, 1.0f);
            Objects.requireNonNull(t.f9564a);
            iVar.z(this);
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f9512a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9513b = false;

        public b(View view) {
            this.f9512a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            t.c(this.f9512a, 1.0f);
            if (this.f9513b) {
                this.f9512a.setLayerType(0, (Paint) null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            View view = this.f9512a;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            if (x.d.h(view) && this.f9512a.getLayerType() == 0) {
                this.f9513b = true;
                this.f9512a.setLayerType(2, (Paint) null);
            }
        }
    }

    public c(int i) {
        if ((i & -4) == 0) {
            this.M = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = (java.lang.Float) r3.f9555a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator N(android.view.View r2, p1.p r3) {
        /*
            r1 = this;
            p1.x r0 = p1.t.f9564a
            java.util.Objects.requireNonNull(r0)
            if (r3 == 0) goto L_0x0018
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f9555a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r3 = r3.get(r0)
            java.lang.Float r3 = (java.lang.Float) r3
            if (r3 == 0) goto L_0x0018
            float r3 = r3.floatValue()
            goto L_0x001a
        L_0x0018:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x001a:
            r0 = 0
            android.animation.Animator r2 = r1.O(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.c.N(android.view.View, p1.p):android.animation.Animator");
    }

    public final Animator O(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        t.c(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, t.f9565b, new float[]{f11});
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final void i(p pVar) {
        L(pVar);
        pVar.f9555a.put("android:fade:transitionAlpha", Float.valueOf(t.a(pVar.f9556b)));
    }

    public c() {
    }
}
