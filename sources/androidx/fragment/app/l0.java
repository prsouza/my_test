package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

public final class l0 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f1951a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1952b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1953c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1954d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1955e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1956f;
    public final /* synthetic */ k0 g;

    public l0(k0 k0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.g = k0Var;
        this.f1951a = obj;
        this.f1952b = arrayList;
        this.f1955e = obj2;
        this.f1956f = arrayList2;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        Object obj = this.f1951a;
        if (obj != null) {
            this.g.t(obj, this.f1952b, (ArrayList<View>) null);
        }
        Object obj2 = this.f1953c;
        if (obj2 != null) {
            this.g.t(obj2, this.f1954d, (ArrayList<View>) null);
        }
        Object obj3 = this.f1955e;
        if (obj3 != null) {
            this.g.t(obj3, this.f1956f, (ArrayList<View>) null);
        }
    }
}
