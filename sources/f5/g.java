package f5;

import a.a;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.helpers.MessageFormatter;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final s.g<String, h> f4996a = new s.g<>();

    /* renamed from: b  reason: collision with root package name */
    public final s.g<String, PropertyValuesHolder[]> f4997b = new s.g<>();

    public static g a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e10) {
            StringBuilder d10 = a.d("Can't load animation resource ID #0x");
            d10.append(Integer.toHexString(i));
            Log.w("MotionSpec", d10.toString(), e10);
            return null;
        }
    }

    public static g b(List<Animator> list) {
        g gVar = new g();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f4997b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = a.f4985b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = a.f4986c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = a.f4987d;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.f5001d = objectAnimator.getRepeatCount();
                hVar.f5002e = objectAnimator.getRepeatMode();
                gVar.f4996a.put(propertyName, hVar);
                i++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public final h c(String str) {
        if (this.f4996a.getOrDefault(str, null) != null) {
            return this.f4996a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f4996a.equals(((g) obj).f4996a);
    }

    public final int hashCode() {
        return this.f4996a.hashCode();
    }

    public final String toString() {
        return 10 + g.class.getName() + MessageFormatter.DELIM_START + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4996a + "}\n";
    }
}
