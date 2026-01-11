package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.savedstate.a;
import java.util.Objects;

public final /* synthetic */ class z implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f2018a;

    public /* synthetic */ z(a0 a0Var) {
        this.f2018a = a0Var;
    }

    public final Bundle a() {
        a0 a0Var = this.f2018a;
        Objects.requireNonNull(a0Var);
        Bundle bundle = new Bundle();
        Parcelable X = a0Var.X();
        if (X != null) {
            bundle.putParcelable("android:support:fragments", X);
        }
        return bundle;
    }
}
