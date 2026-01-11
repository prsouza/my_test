package ei;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import ei.c;
import h.m;

public class g extends m {

    /* renamed from: a  reason: collision with root package name */
    public c.a f4861a;

    /* renamed from: b  reason: collision with root package name */
    public c.b f4862b;

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof c.a) {
                this.f4861a = (c.a) getParentFragment();
            }
            if (getParentFragment() instanceof c.b) {
                this.f4862b = (c.b) getParentFragment();
            }
        }
        if (context instanceof c.a) {
            this.f4861a = (c.a) context;
        }
        if (context instanceof c.b) {
            this.f4862b = (c.b) context;
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        b.a aVar;
        setCancelable(false);
        e eVar = new e(getArguments());
        d dVar = new d(this, eVar, this.f4861a, this.f4862b);
        Context context = getContext();
        int i = eVar.f4854c;
        if (i > 0) {
            aVar = new b.a(context, i);
        } else {
            aVar = new b.a(context);
        }
        AlertController.b bVar = aVar.f861a;
        bVar.f851k = false;
        bVar.g = eVar.f4852a;
        bVar.f849h = dVar;
        bVar.i = eVar.f4853b;
        bVar.f850j = dVar;
        bVar.f848f = eVar.f4856e;
        return aVar.a();
    }

    public final void onDetach() {
        super.onDetach();
        this.f4861a = null;
        this.f4862b = null;
    }
}
