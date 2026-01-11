package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import io.nodle.cash.R;
import tb.c;

public final class h1 extends g1 {
    public static final SparseIntArray J;
    public long I = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.backButton, 1);
        sparseIntArray.put(R.id.tabLayout, 2);
        sparseIntArray.put(R.id.estimateTab1, 3);
        sparseIntArray.put(R.id.estimateTab2, 4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h1(e eVar, View view) {
        super(eVar, view);
        Object[] l10 = ViewDataBinding.l(eVar, view, 5, (ViewDataBinding.d) null, J);
        ImageButton imageButton = (ImageButton) l10[1];
        TabItem tabItem = (TabItem) l10[3];
        TabItem tabItem2 = (TabItem) l10[4];
        TabLayout tabLayout = (TabLayout) l10[2];
        ((Toolbar) l10[0]).setTag((Object) null);
        view.setTag(R.id.dataBinding, this);
        i();
    }

    public final void c() {
        synchronized (this) {
            this.I = 0;
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.I != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.I = 2;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        return false;
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        c cVar = (c) obj;
        return true;
    }
}
