package a1;

import androidx.fragment.app.Fragment;
import e6.e;

public abstract class i extends m {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Fragment fragment, String str, int i) {
        super(fragment, str);
        if (i != 1) {
            e.D(fragment, "fragment");
            return;
        }
        e.D(fragment, "fragment");
        super(fragment, str);
    }
}
