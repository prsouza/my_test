package mb;

import android.view.View;
import e6.e;
import mb.c;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f8522a;

    public /* synthetic */ d(c cVar) {
        this.f8522a = cVar;
    }

    public final void onClick(View view) {
        c cVar = this.f8522a;
        e.D(cVar, "this$0");
        c.b bVar = cVar.f8520s;
        if (bVar != null) {
            bVar.c();
        }
    }
}
