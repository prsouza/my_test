package a1;

import androidx.fragment.app.Fragment;
import e6.e;

public abstract class m extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f29a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Fragment fragment, String str) {
        super(str);
        e.D(fragment, "fragment");
        this.f29a = fragment;
    }
}
