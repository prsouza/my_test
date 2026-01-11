package sb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.w0;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.managers.f;
import l9.a;
import n9.b;

public abstract class i extends Fragment implements b {

    /* renamed from: a  reason: collision with root package name */
    public ViewComponentManager$FragmentContextWrapper f11067a;

    /* renamed from: b  reason: collision with root package name */
    public volatile f f11068b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f11069c = new Object();

    /* renamed from: s  reason: collision with root package name */
    public boolean f11070s = false;

    public final Object a() {
        if (this.f11068b == null) {
            synchronized (this.f11069c) {
                if (this.f11068b == null) {
                    this.f11068b = new f(this);
                }
            }
        }
        return this.f11068b.a();
    }

    public final void b() {
        if (this.f11067a == null) {
            this.f11067a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && this.f11067a == null) {
            return null;
        }
        b();
        return this.f11067a;
    }

    public final w0.b getDefaultViewModelProviderFactory() {
        return a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        b();
        if (!this.f11070s) {
            this.f11070s = true;
            q qVar = (q) this;
            ((r) a()).b();
        }
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(new ViewComponentManager$FragmentContextWrapper(super.onGetLayoutInflater(bundle), (Fragment) this));
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f11067a;
        aa.b.y(viewComponentManager$FragmentContextWrapper == null || f.c(viewComponentManager$FragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b();
        if (!this.f11070s) {
            this.f11070s = true;
            q qVar = (q) this;
            ((r) a()).b();
        }
    }
}
