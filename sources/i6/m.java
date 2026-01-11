package i6;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.q0;

public final class m implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f6221a;

    public m(n nVar) {
        this.f6221a = nVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j10) {
        Object obj;
        int i10;
        n nVar = this.f6221a;
        if (i < 0) {
            q0 q0Var = nVar.f6222t;
            if (!q0Var.b()) {
                obj = null;
            } else {
                obj = q0Var.f1371c.getSelectedItem();
            }
        } else {
            obj = nVar.getAdapter().getItem(i);
        }
        n.a(this.f6221a, obj);
        AdapterView.OnItemClickListener onItemClickListener = this.f6221a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                q0 q0Var2 = this.f6221a.f6222t;
                if (!q0Var2.b()) {
                    view = null;
                } else {
                    view = q0Var2.f1371c.getSelectedView();
                }
                q0 q0Var3 = this.f6221a.f6222t;
                if (!q0Var3.b()) {
                    i10 = -1;
                } else {
                    i10 = q0Var3.f1371c.getSelectedItemPosition();
                }
                i = i10;
                q0 q0Var4 = this.f6221a.f6222t;
                if (!q0Var4.b()) {
                    j10 = Long.MIN_VALUE;
                } else {
                    j10 = q0Var4.f1371c.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(this.f6221a.f6222t.f1371c, view, i, j10);
        }
        this.f6221a.f6222t.dismiss();
    }
}
