package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.a0;
import androidx.lifecycle.r;
import androidx.lifecycle.y;
import java.util.Objects;

public final class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public LayoutInflater f4401a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f4402b;

    /* renamed from: c  reason: collision with root package name */
    public final y f4403c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewComponentManager$FragmentContextWrapper(Context context, Fragment fragment) {
        super(context);
        Objects.requireNonNull(context);
        AnonymousClass1 r22 = new y() {
            public final void c(a0 a0Var, r.b bVar) {
                if (bVar == r.b.ON_DESTROY) {
                    ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = ViewComponentManager$FragmentContextWrapper.this;
                    Objects.requireNonNull(viewComponentManager$FragmentContextWrapper);
                    viewComponentManager$FragmentContextWrapper.f4401a = null;
                    viewComponentManager$FragmentContextWrapper.f4402b = null;
                }
            }
        };
        this.f4403c = r22;
        this.f4401a = null;
        Objects.requireNonNull(fragment);
        fragment.getLifecycle().a(r22);
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4402b == null) {
            if (this.f4401a == null) {
                this.f4401a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f4402b = this.f4401a.cloneInContext(this);
        }
        return this.f4402b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ViewComponentManager$FragmentContextWrapper(android.view.LayoutInflater r2, androidx.fragment.app.Fragment r3) {
        /*
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            android.content.Context r0 = r2.getContext()
            java.util.Objects.requireNonNull(r0)
            r1.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r0 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r0.<init>()
            r1.f4403c = r0
            r1.f4401a = r2
            java.util.Objects.requireNonNull(r3)
            androidx.lifecycle.r r2 = r3.getLifecycle()
            r2.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper.<init>(android.view.LayoutInflater, androidx.fragment.app.Fragment):void");
    }
}
