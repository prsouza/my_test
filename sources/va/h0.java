package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import gb.f;
import io.nodle.cash.R;
import u0.a;

public final class h0 extends g0 {
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public long N = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0(e eVar, View view) {
        super(eVar, view);
        Object[] l10 = ViewDataBinding.l(eVar, view, 4, (ViewDataBinding.d) null, (SparseIntArray) null);
        ((ScrollView) l10[0]).setTag((Object) null);
        TextView textView = (TextView) l10[1];
        this.K = textView;
        textView.setTag((Object) null);
        TextView textView2 = (TextView) l10[2];
        this.L = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = (TextView) l10[3];
        this.M = textView3;
        textView3.setTag((Object) null);
        view.setTag(R.id.dataBinding, this);
        i();
    }

    public final void c() {
        long j10;
        String str;
        String str2;
        synchronized (this) {
            j10 = this.N;
            this.N = 0;
        }
        f fVar = this.I;
        int i = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str3 = null;
        if (i == 0 || fVar == null) {
            str2 = null;
            str = null;
        } else {
            String str4 = fVar.f5323d;
            String str5 = fVar.f5321b;
            str = fVar.f5322c;
            String str6 = str5;
            str2 = str4;
            str3 = str6;
        }
        if (i != 0) {
            a.a(this.K, str3);
            a.a(this.L, str);
            a.a(this.M, str2);
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.N != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.N = 2;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        return false;
    }

    public final boolean s(int i, Object obj) {
        if (2 != i) {
            return false;
        }
        v((f) obj);
        return true;
    }

    public final void v(f fVar) {
        this.I = fVar;
        synchronized (this) {
            this.N |= 1;
        }
        b(2);
        o();
    }
}
