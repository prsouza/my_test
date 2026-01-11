package h1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import e6.e;
import h1.e0;
import io.nodle.cash.R;
import io.nodle.map_marker.MarkerView;
import java.util.Collections;
import pb.j;
import wb.c;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5788a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5789b;

    public /* synthetic */ x(Object obj, int i) {
        this.f5788a = i;
        this.f5789b = obj;
    }

    public final void run() {
        switch (this.f5788a) {
            case 0:
                e0.e eVar = ((y) this.f5789b).f5790a;
                Collections.emptyList();
                eVar.a();
                return;
            default:
                j jVar = (j) this.f5789b;
                j.a aVar = j.F;
                e.D(jVar, "this$0");
                MarkerView markerView = (MarkerView) jVar.b(R.id.markerView);
                jVar.f9851w = markerView != null ? markerView.getX() + ((float) (markerView.getWidth() / 2)) : jVar.f9851w;
                MarkerView markerView2 = (MarkerView) jVar.b(R.id.markerView);
                jVar.f9852x = markerView2 != null ? markerView2.getY() + ((float) (markerView2.getHeight() / 2)) : jVar.f9852x;
                if (jVar.getContext() != null) {
                    Context context = jVar.getContext();
                    float f10 = 1.0f;
                    jVar.f9853y = (int) ((context != null ? context.getResources().getDisplayMetrics().density : 1.0f) * 15.0f);
                    Context context2 = jVar.getContext();
                    if (context2 != null) {
                        f10 = context2.getResources().getDisplayMetrics().density;
                    }
                    jVar.z = (int) (50.0f * f10);
                }
                MarkerView markerView3 = (MarkerView) jVar.b(R.id.markerView);
                if (markerView3 != null) {
                    float f11 = jVar.f9851w;
                    float f12 = jVar.f9852x;
                    if (jVar.f9846c == null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        jVar.f9846c = BitmapFactory.decodeResource(jVar.getResources(), R.drawable.ic_location1, options);
                    }
                    Bitmap bitmap = jVar.f9846c;
                    e.B(bitmap);
                    if (markerView3.f6847s == null) {
                        Context context3 = markerView3.getContext();
                        e.C(context3, "context");
                        c cVar = new c(context3, f11, f12, bitmap);
                        markerView3.f6847s = cVar;
                        markerView3.f6846c.add(cVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
