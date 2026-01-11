package a1;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public final class n extends m {
    public n(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
    }
}
