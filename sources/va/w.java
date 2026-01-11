package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import io.nodle.cash.R;
import tb.c;

public final class w extends v {
    public long J = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(e eVar, View view) {
        super(eVar, view);
        Object[] l10 = ViewDataBinding.l(eVar, view, 1, (ViewDataBinding.d) null, (SparseIntArray) null);
        ((LinearLayout) l10[0]).setTag((Object) null);
        view.setTag(R.id.dataBinding, this);
        i();
    }

    public final void c() {
        synchronized (this) {
            this.J = 0;
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.J != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.J = 2;
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

    public final void v(c cVar) {
    }
}
