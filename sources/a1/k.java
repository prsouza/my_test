package a1;

import androidx.fragment.app.Fragment;
import e6.e;

public final class k extends i {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Fragment fragment, Fragment fragment2, int i) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i + " for fragment " + fragment, 1);
        e.D(fragment, "fragment");
        e.D(fragment2, "targetFragment");
    }
}
