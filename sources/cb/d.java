package cb;

import android.app.Application;
import ge.d0;
import io.nodle.cash.data.local.CashDatabase;
import io.sentry.protocol.App;
import java.util.Map;
import l6.b1;
import md.m;
import org.json.JSONObject;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.domain.notification.NotifDataHandler$saveToLocalDB$1", f = "NotifDataHandler.kt", l = {120}, m = "invokeSuspend")
public final class d extends i implements p<d0, pd.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f3328a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f3329b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3330c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Application f3331s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Map<String, String> map, int i, Application application, pd.d<? super d> dVar) {
        super(2, dVar);
        this.f3329b = map;
        this.f3330c = i;
        this.f3331s = application;
    }

    public final pd.d<m> create(Object obj, pd.d<?> dVar) {
        return new d(this.f3329b, this.f3330c, this.f3331s, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f3328a;
        if (i == 0) {
            b1.w(obj);
            Map<String, String> map = this.f3329b;
            if (map != null) {
                int i10 = this.f3330c;
                Application application = this.f3331s;
                JSONObject b10 = e.f3332a.b(map);
                String str = map.get("nodle.v1.time");
                long parseLong = str != null ? Long.parseLong(str) : System.currentTimeMillis();
                String jSONObject = b10.toString();
                e6.e.C(jSONObject, "joData.toString()");
                e6.e.D(application, App.TYPE);
                ra.a r10 = CashDatabase.f6682n.a(application).r();
                this.f3328a = 1;
                Object b11 = r10.b(new sa.a(i10, jSONObject, parseLong, 0, false), this);
                if (b11 != aVar) {
                    b11 = m.f8555a;
                }
                if (b11 == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8555a;
    }
}
