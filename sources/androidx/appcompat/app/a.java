package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AlertController f858a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f859b;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f859b = bVar;
        this.f858a = alertController;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j10) {
        this.f859b.f854n.onClick(this.f858a.f818b, i);
        if (!this.f859b.f855o) {
            this.f858a.f818b.dismiss();
        }
    }
}
