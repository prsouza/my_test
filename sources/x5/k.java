package x5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f12836a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public b f12837b = null;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f12838c = null;

    /* renamed from: d  reason: collision with root package name */
    public final a f12839d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationEnd(Animator animator) {
            k kVar = k.this;
            if (kVar.f12838c == animator) {
                kVar.f12838c = null;
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f12841a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f12842b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f12841a = iArr;
            this.f12842b = valueAnimator;
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f12839d);
        this.f12836a.add(bVar);
    }
}
