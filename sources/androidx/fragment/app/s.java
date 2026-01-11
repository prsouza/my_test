package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import n0.q;

public final class s {
    public static int a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f2000a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f2001b;

        public a(Animation animation) {
            this.f2000a = animation;
            this.f2001b = null;
        }

        public a(Animator animator) {
            this.f2000a = null;
            this.f2001b = animator;
        }
    }

    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final ViewGroup f2002a;

        /* renamed from: b  reason: collision with root package name */
        public final View f2003b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2004c;

        /* renamed from: s  reason: collision with root package name */
        public boolean f2005s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f2006t = true;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2002a = viewGroup;
            this.f2003b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public final boolean getTransformation(long j10, Transformation transformation) {
            this.f2006t = true;
            if (this.f2004c) {
                return !this.f2005s;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2004c = true;
                q.a(this.f2002a, this);
            }
            return true;
        }

        public final void run() {
            if (this.f2004c || !this.f2006t) {
                this.f2002a.endViewTransition(this.f2003b);
                this.f2005s = true;
                return;
            }
            this.f2006t = false;
            this.f2002a.post(this);
        }

        public final boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f2006t = true;
            if (this.f2004c) {
                return !this.f2005s;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2004c = true;
                q.a(this.f2002a, this);
            }
            return true;
        }
    }
}
