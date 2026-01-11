package pb;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.mikephil.charting.BuildConfig;
import ge.d0;
import io.nodle.cash.R;
import java.util.Objects;
import je.f;
import je.l;
import l6.b1;
import md.b;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.view.fragment.home.FlashFragment$managePendingDeviceFlash$1", f = "FlashFragment.kt", l = {166}, m = "invokeSuspend")
public final class h extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9836a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f9837b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f9838c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f9839s;

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f9840a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f9841b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AnimatorSet f9842c;

        public a(c cVar, ObjectAnimator objectAnimator, AnimatorSet animatorSet) {
            this.f9840a = cVar;
            this.f9841b = objectAnimator;
            this.f9842c = animatorSet;
        }

        public final Object a(Object obj, d dVar) {
            boolean z;
            String str = (String) obj;
            if (str == null) {
                z = true;
            } else {
                z = e6.e.r(str, BuildConfig.FLAVOR);
            }
            if (z) {
                LinearLayout linearLayout = (LinearLayout) this.f9840a.b(R.id.pendingRewardLayout);
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                TextView textView = (TextView) this.f9840a.b(R.id.pendingTextView);
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = (TextView) this.f9840a.b(R.id.pendingTextView);
                if (textView2 != null) {
                    textView2.setText(BuildConfig.FLAVOR);
                }
            } else {
                LinearLayout linearLayout2 = (LinearLayout) this.f9840a.b(R.id.pendingRewardLayout);
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                TextView textView3 = (TextView) this.f9840a.b(R.id.pendingTextView);
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                ObjectAnimator objectAnimator = this.f9841b;
                e6.e.C(objectAnimator, "alpha1Anim");
                objectAnimator.addListener(new g(this.f9840a, str));
                this.f9842c.start();
            }
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(c cVar, ObjectAnimator objectAnimator, AnimatorSet animatorSet, d<? super h> dVar) {
        super(2, dVar);
        this.f9837b = cVar;
        this.f9838c = objectAnimator;
        this.f9839s = animatorSet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new h(this.f9837b, this.f9838c, this.f9839s, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [je.l, java.lang.Object, je.h<java.lang.String>] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = qd.a.COROUTINE_SUSPENDED;
        int i = this.f9836a;
        if (i == 0) {
            b1.w(obj);
            ab.f fVar = ab.f.f215a;
            ? r72 = ab.f.f226n;
            a aVar = new a(this.f9837b, this.f9838c, this.f9839s);
            this.f9836a = 1;
            Objects.requireNonNull(r72);
            if (l.i(r72, aVar, this) == obj2) {
                return obj2;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            b1.w(obj);
        }
        throw new b();
    }
}
