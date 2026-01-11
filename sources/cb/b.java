package cb;

import ah.v;
import android.content.Context;
import android.location.Location;
import android.util.Log;
import ge.d0;
import io.nodle.cash.data.remote.api.NotificationApi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import ki.z;
import l6.b1;
import md.m;
import org.json.JSONObject;
import p002if.b0;
import pd.d;
import rd.e;
import rd.i;
import ta.f;
import ta.h;
import xd.l;
import xd.p;

@e(c = "io.nodle.cash.domain.notification.NotifBuilder$buildCustomNotification$1$1", f = "NotifBuilder.kt", l = {206}, m = "invokeSuspend")
public final class b extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f3319a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f3320b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f3321c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Location f3322s;

    @e(c = "io.nodle.cash.domain.notification.NotifBuilder$buildCustomNotification$1$1$result$1", f = "NotifBuilder.kt", l = {209}, m = "invokeSuspend")
    public static final class a extends i implements l<d<? super z<b0>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f3323a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f3324b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f3325c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ Location f3326s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, Location location, d<? super a> dVar) {
            super(1, dVar);
            this.f3324b = context;
            this.f3325c = str;
            this.f3326s = location;
        }

        public final d<m> create(d<?> dVar) {
            return new a(this.f3324b, this.f3325c, this.f3326s, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f3323a;
            if (i == 0) {
                b1.w(obj);
                Object b10 = f.f11451a.a(this.f3324b).b(NotificationApi.class);
                e6.e.C(b10, "buildRetrofit(context).c…ificationApi::class.java)");
                String str = this.f3325c;
                String J = v.J(this.f3324b, qa.e.NODLE_SDK_DEVKEY);
                String language = Locale.getDefault().getLanguage();
                e6.e.C(language, "getDefault().language");
                double latitude = this.f3326s.getLatitude();
                double longitude = this.f3326s.getLongitude();
                this.f3323a = 1;
                obj = ((NotificationApi) b10).getCustomNotification(str, J, language, latitude, longitude, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object k(Object obj) {
            return ((a) create((d) obj)).invokeSuspend(m.f8555a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, Location location, d<? super b> dVar) {
        super(2, dVar);
        this.f3320b = context;
        this.f3321c = str;
        this.f3322s = location;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f3320b, this.f3321c, this.f3322s, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f3319a;
        if (i == 0) {
            b1.w(obj);
            f fVar = f.f11451a;
            a aVar2 = new a(this.f3320b, this.f3321c, this.f3322s, (d<? super a>) null);
            this.f3319a = 1;
            obj = fVar.c(aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ta.e eVar = (ta.e) obj;
        if (eVar instanceof h) {
            int i10 = c.f3327a;
            h hVar = (h) eVar;
            T t10 = hVar.f11461b;
            Log.d("c", "Success in custom notification: " + t10);
            b0 b0Var = (b0) hVar.f11461b;
            if (b0Var != null) {
                Context context = this.f3320b;
                e eVar2 = e.f3332a;
                JSONObject jSONObject = new JSONObject(b0Var.f());
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                e6.e.C(keys, "jsonObj.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    e6.e.C(next, "key");
                    String string = jSONObject.getString(next);
                    e6.e.C(string, "jsonObj.getString(key)");
                    hashMap.put(next, string);
                }
                eVar2.c(context, hashMap);
            }
        } else if (eVar instanceof ta.b) {
            int i11 = c.f3327a;
            androidx.fragment.app.m.g("Failure in custom notification: ", ((ta.b) eVar).f11449c, "c");
        } else if (eVar instanceof ta.a) {
            int i12 = c.f3327a;
            androidx.fragment.app.m.g("Error in custom notification: ", ((ta.a) eVar).f11446b, "c");
        }
        return m.f8555a;
    }
}
