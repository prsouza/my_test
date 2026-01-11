package a1;

import androidx.fragment.app.Fragment;
import e6.e;

public final class a extends m {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        e.D(fragment, "fragment");
        e.D(str, "previousFragmentId");
    }
}
