package w5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.d;
import d6.b;
import java.util.ArrayList;

public final class c extends d {
    public c(FloatingActionButton floatingActionButton, b bVar) {
        super(floatingActionButton, bVar);
    }

    public final float e() {
        return this.f3957r.getElevation();
    }

    public final void f(Rect rect) {
        if (FloatingActionButton.this.z) {
            super.f(rect);
            return;
        }
        if (!(!this.f3943b || this.f3957r.getSizeDimension() >= 0)) {
            int sizeDimension = (0 - this.f3957r.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    public final void i() {
    }

    public final void j() {
        t();
        throw null;
    }

    public final void k(int[] iArr) {
    }

    public final void l(float f10, float f11, float f12) {
        int i = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.z, u(f10, f12));
        stateListAnimator.addState(d.A, u(f10, f11));
        stateListAnimator.addState(d.B, u(f10, f11));
        stateListAnimator.addState(d.C, u(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f3957r, "elevation", new float[]{f10}).setDuration(0));
        if (i <= 24) {
            FloatingActionButton floatingActionButton = this.f3957r;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f3957r, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.f3941y);
        stateListAnimator.addState(d.D, animatorSet);
        stateListAnimator.addState(d.E, u(0.0f, 0.0f));
        this.f3957r.setStateListAnimator(stateListAnimator);
        if (q()) {
            t();
            throw null;
        }
    }

    public final void p() {
    }

    public final boolean q() {
        if (!FloatingActionButton.this.z) {
            if (!this.f3943b || this.f3957r.getSizeDimension() >= 0) {
                return false;
            }
        }
        return true;
    }

    public final void s() {
    }

    public final Animator u(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f3957r, "elevation", new float[]{f10}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f3957r, View.TRANSLATION_Z, new float[]{f11}).setDuration(100));
        animatorSet.setInterpolator(d.f3941y);
        return animatorSet;
    }
}
