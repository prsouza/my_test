package rb;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import e6.e;
import fe.o;
import java.util.List;
import rb.b;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f10640a;

    public /* synthetic */ a(b bVar) {
        this.f10640a = bVar;
    }

    public final void onClick(View view) {
        b bVar = this.f10640a;
        b.a aVar = b.f10641c;
        e.D(bVar, "this$0");
        List y12 = o.y1(view.getTag().toString(), new String[]{"#"});
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) y12.get(0)));
            if (y12.size() >= 2) {
                if (((CharSequence) y12.get(1)).length() > 0) {
                    intent.setPackage((String) y12.get(1));
                }
            }
            bVar.startActivity(intent);
        } catch (Exception unused) {
            bVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) y12.get(0))));
        }
    }
}
