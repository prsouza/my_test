package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

public final class p0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0 f1365a;

    public p0(q0 q0Var) {
        this.f1365a = q0Var;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j10) {
        l0 l0Var;
        if (i != -1 && (l0Var = this.f1365a.f1371c) != null) {
            l0Var.setListSelectionHidden(false);
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
