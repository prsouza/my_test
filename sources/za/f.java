package za;

import ah.v;
import android.content.Context;
import fe.o;
import ge.d0;
import hb.a;
import io.nodle.sdk.android.Nodle;
import java.util.concurrent.ConcurrentLinkedQueue;
import je.k;
import l6.b1;
import md.m;
import org.json.JSONArray;
import org.json.JSONObject;
import pd.d;
import rd.e;
import rd.i;
import ri.a;
import xb.b;
import xb.c;
import xd.p;
import yd.t;

@e(c = "io.nodle.cash.domain.helper.NodleHelper$observeScan$2", f = "NodleHelper.kt", l = {244}, m = "invokeSuspend")
public final class f extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14207a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f14208b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ JSONObject f14209c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ t f14210s;

    public static final class a<T> implements je.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f14211a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ JSONObject f14212b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ t f14213c;

        /* renamed from: za.f$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0283a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f14214a;

            static {
                int[] iArr = new int[c.values().length];
                iArr[c.BleStartSearching.ordinal()] = 1;
                iArr[c.BleStopSearching.ordinal()] = 2;
                iArr[c.BlePayloadEvent.ordinal()] = 3;
                f14214a = iArr;
            }
        }

        public a(Context context, JSONObject jSONObject, t tVar) {
            this.f14211a = context;
            this.f14212b = jSONObject;
            this.f14213c = tVar;
        }

        public final Object a(Object obj, d dVar) {
            JSONArray jSONArray;
            b bVar = (b) obj;
            if (C0283a.f14214a[bVar.a().ordinal()] == 3) {
                a.C0097a aVar = hb.a.f5902s;
                if (hb.a.f5904u) {
                    String b10 = ((xb.a) bVar).b();
                    d dVar2 = d.f14195a;
                    Context context = this.f14211a;
                    JSONObject jSONObject = this.f14212b;
                    long j10 = this.f14213c.f13621a;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - jSONObject.optLong("windowTimestamp") < j10) {
                        jSONArray = jSONObject.optJSONArray("devices");
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                    } else {
                        jSONObject.put("devices", new JSONArray());
                        jSONObject.put("windowTimestamp", currentTimeMillis);
                        v.f0(context, qa.e.DEVICE_CACHE, jSONObject.toString());
                        jSONArray = new JSONArray();
                    }
                    String jSONArray2 = jSONArray.toString();
                    e6.e.C(jSONArray2, "jaDevices.toString()");
                    if (!o.g1(jSONArray2, b10)) {
                        jSONArray.put(b10);
                        this.f14212b.put("devices", jSONArray);
                        v.f0(this.f14211a, qa.e.DEVICE_CACHE, this.f14212b.toString());
                        ConcurrentLinkedQueue<String> concurrentLinkedQueue = d.f14199e;
                        concurrentLinkedQueue.add(b10);
                        a.C0210a aVar2 = ri.a.f10801a;
                        int size = concurrentLinkedQueue.size();
                        aVar2.a("NEW " + b10 + " " + size, new Object[0]);
                    }
                }
            }
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, JSONObject jSONObject, t tVar, d<? super f> dVar) {
        super(2, dVar);
        this.f14208b = context;
        this.f14209c = jSONObject;
        this.f14210s = tVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new f(this.f14208b, this.f14209c, this.f14210s, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f14207a;
        if (i == 0) {
            b1.w(obj);
            k<b> events = Nodle.Nodle().getEvents();
            a aVar2 = new a(this.f14208b, this.f14209c, this.f14210s);
            this.f14207a = 1;
            if (events.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            b1.w(obj);
        }
        throw new md.b();
    }
}
