package a1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a0;
import e6.e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import nd.m;
import nd.q;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f23a = null;

    /* renamed from: b  reason: collision with root package name */
    public static c f24b = c.f25d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
        void a();
    }

    public static final class c {

        /* renamed from: d  reason: collision with root package name */
        public static final c f25d = new c();

        /* renamed from: a  reason: collision with root package name */
        public final Set<a> f26a = q.f8968a;

        /* renamed from: b  reason: collision with root package name */
        public final b f27b = null;

        /* renamed from: c  reason: collision with root package name */
        public final Map<Class<? extends Fragment>, Set<Class<? extends m>>> f28c = new LinkedHashMap();
    }

    public static final c a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                e.C(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f24b;
    }

    public static final void b(c cVar, m mVar) {
        Fragment fragment = mVar.f29a;
        String name = fragment.getClass().getName();
        if (cVar.f26a.contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", e.a0("Policy violation in ", name), mVar);
        }
        if (cVar.f27b != null) {
            e(fragment, new b(cVar, mVar, 0));
        }
        if (cVar.f26a.contains(a.PENALTY_DEATH)) {
            e(fragment, new c(name, mVar));
        }
    }

    public static final void c(m mVar) {
        if (a0.K(3)) {
            Log.d("FragmentManager", e.a0("StrictMode violation in ", mVar.f29a.getClass().getName()), mVar);
        }
    }

    public static final void d(Fragment fragment, String str) {
        e.D(fragment, "fragment");
        e.D(str, "previousFragmentId");
        a aVar = new a(fragment, str);
        c(aVar);
        c a10 = a(fragment);
        if (a10.f26a.contains(a.DETECT_FRAGMENT_REUSE) && f(a10, fragment.getClass(), aVar.getClass())) {
            b(a10, aVar);
        }
    }

    public static final void e(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler handler = fragment.getParentFragmentManager().f1815p.f2011c;
            e.C(handler, "fragment.parentFragmentManager.host.handler");
            if (e.r(handler.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Class<? extends androidx.fragment.app.Fragment>, java.util.Set<java.lang.Class<? extends a1.m>>>] */
    public static final boolean f(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.f28c.get(cls);
        if (set == null) {
            return true;
        }
        if (e.r(cls2.getSuperclass(), m.class) || !m.V0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
