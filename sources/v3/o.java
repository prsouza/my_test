package v3;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a0;
import com.bumptech.glide.b;
import com.bumptech.glide.j;
import java.util.HashSet;
import java.util.Set;

public class o extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final a f12284a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12285b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final Set<o> f12286c = new HashSet();

    /* renamed from: s  reason: collision with root package name */
    public o f12287s;

    /* renamed from: t  reason: collision with root package name */
    public j f12288t;

    /* renamed from: u  reason: collision with root package name */
    public Fragment f12289u;

    public class a implements m {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        a aVar = new a();
        this.f12284a = aVar;
    }

    public final Fragment b() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f12289u;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.util.HashSet, java.util.Set<v3.o>] */
    public final void c(Context context, a0 a0Var) {
        d();
        o e10 = b.b(context).f3498u.e(a0Var);
        this.f12287s = e10;
        if (!equals(e10)) {
            this.f12287s.f12286c.add(this);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.HashSet, java.util.Set<v3.o>] */
    public final void d() {
        o oVar = this.f12287s;
        if (oVar != null) {
            oVar.f12286c.remove(this);
            this.f12287s = null;
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        a0 fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            try {
                c(getContext(), fragmentManager);
            } catch (IllegalStateException e10) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f12284a.a();
        d();
    }

    public final void onDetach() {
        super.onDetach();
        this.f12289u = null;
        d();
    }

    public final void onStart() {
        super.onStart();
        this.f12284a.c();
    }

    public final void onStop() {
        super.onStop();
        this.f12284a.e();
    }

    public final String toString() {
        return super.toString() + "{parent=" + b() + "}";
    }
}
