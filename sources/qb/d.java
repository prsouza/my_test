package qb;

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

public abstract class d extends Fragment implements b {

    /* renamed from: a  reason: collision with root package name */
    public ViewComponentManager$FragmentContextWrapper f10350a;

    /* renamed from: b  reason: collision with root package name */
    public volatile f f10351b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10352c = new Object();

    /* renamed from: s  reason: collision with root package name */
    public boolean f10353s = false;

    public final Object a() {
        if (this.f10351b == null) {
            synchronized (this.f10352c) {
                if (this.f10351b == null) {
                    this.f10351b = new f(this);
                }
            }
        }
        return this.f10351b.a();
    }

    public final void b() {
        if (this.f10350a == null) {
            this.f10350a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && this.f10350a == null) {
            return null;
        }
        b();
        return this.f10350a;
    }

    public final w0.b getDefaultViewModelProviderFactory() {
        return a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        b();
        if (!this.f10353s) {
            this.f10353s = true;
            ((p) a()).e((k) this);
        }
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(new ViewComponentManager$FragmentContextWrapper(super.onGetLayoutInflater(bundle), (Fragment) this));
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f10350a;
        aa.b.y(viewComponentManager$FragmentContextWrapper == null || f.c(viewComponentManager$FragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b();
        if (!this.f10353s) {
            this.f10353s = true;
            ((p) a()).e((k) this);
        }
    }
}
