package ua;

import android.app.Application;
import android.util.Log;
import ge.d0;
import io.nodle.cash.data.remote.api.CryptoExchangeApi;
import io.sentry.protocol.App;
import java.math.BigDecimal;
import ki.z;
import l6.b1;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import org.json.JSONObject;
import p002if.b0;
import pd.d;
import rd.c;
import rd.e;
import rd.i;
import ta.f;
import ta.h;
import xd.l;
import xd.p;
import yd.u;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Application f11750a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11751b = a.class.getSimpleName();

    @e(c = "io.nodle.cash.data.repository.CryptoExchangeRepository", f = "CryptoExchageRepository.kt", l = {26}, m = "getNodleDollarPrice")
    /* renamed from: ua.a$a  reason: collision with other inner class name */
    public static final class C0230a extends c {

        /* renamed from: a  reason: collision with root package name */
        public u f11752a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f11753b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f11754c;

        /* renamed from: s  reason: collision with root package name */
        public int f11755s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0230a(a aVar, d<? super C0230a> dVar) {
            super(dVar);
            this.f11754c = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f11753b = obj;
            this.f11755s |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f11754c.a(this);
        }
    }

    @e(c = "io.nodle.cash.data.repository.CryptoExchangeRepository$getNodleDollarPrice$2", f = "CryptoExchageRepository.kt", l = {27}, m = "invokeSuspend")
    public static final class b extends i implements p<d0, d<? super Object>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f11756a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f11757b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ u<BigDecimal> f11758c;

        @e(c = "io.nodle.cash.data.repository.CryptoExchangeRepository$getNodleDollarPrice$2$result$1", f = "CryptoExchageRepository.kt", l = {30}, m = "invokeSuspend")
        /* renamed from: ua.a$b$a  reason: collision with other inner class name */
        public static final class C0231a extends i implements l<d<? super z<b0>>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f11759a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a f11760b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0231a(a aVar, d<? super C0231a> dVar) {
                super(1, dVar);
                this.f11760b = aVar;
            }

            public final d<m> create(d<?> dVar) {
                return new C0231a(this.f11760b, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                qd.a aVar = qd.a.COROUTINE_SUSPENDED;
                int i = this.f11759a;
                if (i == 0) {
                    b1.w(obj);
                    Object b10 = f.f11451a.a(this.f11760b.f11750a).b(CryptoExchangeApi.class);
                    e6.e.C(b10, "buildRetrofit(context).c…oExchangeApi::class.java)");
                    this.f11759a = 1;
                    obj = CryptoExchangeApi.DefaultImpls.getPrice$default((CryptoExchangeApi) b10, "https://pro-api.coinmarketcap.com/v2/cryptocurrency/quotes/latest", 0, this, 2, (Object) null);
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
                return ((C0231a) create((d) obj)).invokeSuspend(m.f8555a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, u<BigDecimal> uVar, d<? super b> dVar) {
            super(2, dVar);
            this.f11757b = aVar;
            this.f11758c = uVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new b(this.f11757b, this.f11758c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            Integer num;
            T t10;
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            JSONObject optJSONObject3;
            String optString;
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f11756a;
            boolean z = true;
            if (i == 0) {
                b1.w(obj);
                f fVar = f.f11451a;
                C0231a aVar2 = new C0231a(this.f11757b, (d<? super C0231a>) null);
                this.f11756a = 1;
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
                Log.d(this.f11757b.f11751b, "getNodleDollarPrice Success");
                T t11 = ((h) eVar).f11461b;
                if (t11 != null) {
                    String f10 = ((b0) t11).f();
                    if (f10.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        u<BigDecimal> uVar = this.f11758c;
                        JSONObject optJSONObject4 = new JSONObject(f10).optJSONObject("data");
                        if (optJSONObject4 == null || (optJSONObject = optJSONObject4.optJSONObject(String.valueOf(CryptoExchangeApi.Companion.getNODLE_ID()))) == null || (optJSONObject2 = optJSONObject.optJSONObject("quote")) == null || (optJSONObject3 = optJSONObject2.optJSONObject("USD")) == null || (optString = optJSONObject3.optString("price")) == null) {
                            t10 = BigDecimal.ZERO;
                        } else {
                            t10 = new BigDecimal(optString);
                        }
                        uVar.f13622a = t10;
                    }
                }
                return m.f8555a;
            }
            if (eVar instanceof ta.b) {
                String str = this.f11757b.f11751b;
                String str2 = ((ta.b) eVar).f11449c;
                num = new Integer(Log.d(str, "Failure in CryptoExchange getNodlePriceDollar: " + str2));
            } else if (!(eVar instanceof Error)) {
                return m.f8555a;
            } else {
                String str3 = this.f11757b.f11751b;
                String message = ((Error) eVar).getMessage();
                num = new Integer(Log.d(str3, "Error in CryptoExchange getNodlePriceDollar: " + message));
            }
            return num;
        }
    }

    public a(Application application) {
        e6.e.D(application, App.TYPE);
        this.f11750a = application;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(pd.d<? super java.math.BigDecimal> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ua.a.C0230a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ua.a$a r0 = (ua.a.C0230a) r0
            int r1 = r0.f11755s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f11755s = r1
            goto L_0x0018
        L_0x0013:
            ua.a$a r0 = new ua.a$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f11753b
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f11755s
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            yd.u r0 = r0.f11752a
            l6.b1.w(r7)
            goto L_0x0051
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0031:
            l6.b1.w(r7)
            yd.u r7 = new yd.u
            r7.<init>()
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            r7.f13622a = r2
            me.b r2 = ge.o0.f5434b
            ua.a$b r4 = new ua.a$b
            r5 = 0
            r4.<init>(r6, r7, r5)
            r0.f11752a = r7
            r0.f11755s = r3
            java.lang.Object r0 = ge.g.d(r2, r4, r0)
            if (r0 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r0 = r7
        L_0x0051:
            T r7 = r0.f13622a
            java.lang.String r0 = "price"
            e6.e.C(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.a.a(pd.d):java.lang.Object");
    }
}
