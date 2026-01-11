package pb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ge.d0;
import io.nodle.cash.R;
import io.nodle.map_marker.MarkerView;
import java.util.ArrayList;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import wb.b;
import xd.p;
import yd.r;

@e(c = "io.nodle.cash.ui.view.fragment.home.MapFragment$markDevice$2", f = "MapFragment.kt", l = {}, m = "invokeSuspend")
public final class n extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f9864a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f9865b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float f9866c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(j jVar, r rVar, float f10, d<? super n> dVar) {
        super(2, dVar);
        this.f9864a = jVar;
        this.f9865b = rVar;
        this.f9866c = f10;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new n(this.f9864a, this.f9865b, this.f9866c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        b1.w(obj);
        MarkerView markerView = (MarkerView) this.f9864a.b(R.id.markerView);
        if (markerView == null) {
            return null;
        }
        float f10 = this.f9865b.f13619a;
        float f11 = this.f9866c;
        j jVar = this.f9864a;
        int i = jVar.C;
        if (jVar.f9847s == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            jVar.f9847s = BitmapFactory.decodeResource(jVar.getResources(), R.drawable.ic_coin_marker, options);
        }
        Bitmap bitmap = jVar.f9847s;
        e6.e.B(bitmap);
        ArrayList<wb.a> arrayList = markerView.f6846c;
        Context context = markerView.getContext();
        e6.e.C(context, "context");
        Context context2 = markerView.getContext();
        arrayList.add(new b(context, f10, f11, ((float) i) * (context2 != null ? context2.getResources().getDisplayMetrics().density : 1.0f), bitmap));
        return m.f8555a;
    }
}
