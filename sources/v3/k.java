package v3;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.b;
import com.bumptech.glide.j;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Deprecated
public final class k extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final a f12268a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12269b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final Set<k> f12270c = new HashSet();

    /* renamed from: s  reason: collision with root package name */
    public j f12271s;

    /* renamed from: t  reason: collision with root package name */
    public k f12272t;

    /* renamed from: u  reason: collision with root package name */
    public Fragment f12273u;

    public class a implements m {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        a aVar = new a();
        this.f12268a = aVar;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.HashSet, java.util.Set<v3.k>] */
    public final void a(Activity activity) {
        b();
        l lVar = b.b(activity).f3498u;
        Objects.requireNonNull(lVar);
        k d10 = lVar.d(activity.getFragmentManager());
        this.f12272t = d10;
        if (!equals(d10)) {
            this.f12272t.f12270c.add(this);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.HashSet, java.util.Set<v3.k>] */
    public final void b() {
        k kVar = this.f12272t;
        if (kVar != null) {
            kVar.f12270c.remove(this);
            this.f12272t = null;
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f12268a.a();
        b();
    }

    public final void onDetach() {
        super.onDetach();
        b();
    }

    public final void onStart() {
        super.onStart();
        this.f12268a.c();
    }

    public final void onStop() {
        super.onStop();
        this.f12268a.e();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f12273u;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
