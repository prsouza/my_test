package io.nodle.sdk.runner.coroutine;

import a9.c;
import android.content.Context;
import android.content.SharedPreferences;
import c3.k;
import ge.d0;
import ge.g;
import ge.g0;
import ge.g1;
import ge.o0;
import io.nodle.sdk.INodle;
import io.nodle.sdk.NodleContext;
import io.nodle.sdk.NodleResourceId;
import io.nodle.sdk.SdkMetricType;
import io.nodle.sdk.android.common.config.AndroidNodleResourceId;
import io.nodle.sdk.core.SdkFactory;
import io.sentry.Sentry;
import io.sentry.SentryOptions;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import je.h;
import l6.b1;
import md.m;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pd.d;
import rd.e;
import rd.i;
import xb.b;
import xd.p;
import ze.f;

public final class NodleCoroutine implements INodle {
    /* access modifiers changed from: private */
    public oi.a core;
    /* access modifiers changed from: private */
    public final NodleContext ctx;
    private h<b> eventChannel = g0.h(100, 4);
    private g1 job;
    /* access modifiers changed from: private */
    public final Logger log = LoggerFactory.getLogger("NodleCoroutine");
    private d0 nodleScope = k.j(o0.f5433a);
    private boolean scanning;
    /* access modifiers changed from: private */
    public final SdkFactory sdkFactory;

    @e(c = "io.nodle.sdk.runner.coroutine.NodleCoroutine$startNodle$1", f = "NodleCoroutine.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f6855a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ NodleCoroutine f6856b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f6857c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ String[] f6858s;

        @e(c = "io.nodle.sdk.runner.coroutine.NodleCoroutine$startNodle$1$1", f = "NodleCoroutine.kt", l = {95, 100}, m = "invokeSuspend")
        /* renamed from: io.nodle.sdk.runner.coroutine.NodleCoroutine$a$a  reason: collision with other inner class name */
        public static final class C0117a extends i implements p<d0, pd.d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public Long f6859a;

            /* renamed from: b  reason: collision with root package name */
            public int f6860b;

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ Object f6861c;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ NodleCoroutine f6862s;

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ oi.a f6863t;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0117a(NodleCoroutine nodleCoroutine, oi.a aVar, pd.d<? super C0117a> dVar) {
                super(2, dVar);
                this.f6862s = nodleCoroutine;
                this.f6863t = aVar;
            }

            public final pd.d<m> create(Object obj, pd.d<?> dVar) {
                C0117a aVar = new C0117a(this.f6862s, this.f6863t, dVar);
                aVar.f6861c = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                C0117a aVar = new C0117a(this.f6862s, this.f6863t, (pd.d) obj2);
                aVar.f6861c = (d0) obj;
                return aVar.invokeSuspend(m.f8555a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ge.d0} */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x005a A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x00c0 A[RETURN] */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    qd.a r0 = qd.a.COROUTINE_SUSPENDED
                    int r1 = r11.f6860b
                    r2 = 1
                    r3 = 2
                    if (r1 == 0) goto L_0x0025
                    if (r1 == r2) goto L_0x001c
                    if (r1 != r3) goto L_0x0014
                    java.lang.Object r1 = r11.f6861c
                    ge.d0 r1 = (ge.d0) r1
                    l6.b1.w(r12)
                    goto L_0x002d
                L_0x0014:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L_0x001c:
                    java.lang.Object r1 = r11.f6861c
                    ge.d0 r1 = (ge.d0) r1
                    l6.b1.w(r12)
                    r12 = r11
                    goto L_0x005b
                L_0x0025:
                    l6.b1.w(r12)
                    java.lang.Object r12 = r11.f6861c
                    r1 = r12
                    ge.d0 r1 = (ge.d0) r1
                L_0x002d:
                    r12 = r11
                L_0x002e:
                    pd.f r4 = r1.f()
                    ad.c.G(r4)
                    io.nodle.sdk.runner.coroutine.NodleCoroutine r4 = r12.f6862s
                    org.slf4j.Logger r4 = r4.log
                    java.lang.String r5 = "ble-scan-looper: performing a pass"
                    r4.debug(r5)
                    io.nodle.sdk.runner.coroutine.NodleCoroutine r4 = r12.f6862s
                    r4.setScanning(r2)
                    oi.a r4 = r12.f6863t
                    io.nodle.sdk.runner.coroutine.NodleCoroutine r5 = r12.f6862s
                    ge.d0 r5 = r5.getNodleScope()
                    r12.f6861c = r1
                    r6 = 0
                    r12.f6859a = r6
                    r12.f6860b = r2
                    java.lang.Object r4 = qi.a.b(r4, r5, r12)
                    if (r4 != r0) goto L_0x005b
                    return r0
                L_0x005b:
                    io.nodle.sdk.runner.coroutine.NodleCoroutine r4 = r12.f6862s
                    r5 = 0
                    r4.setScanning(r5)
                    oi.a r4 = r12.f6863t
                    org.slf4j.Logger r5 = qi.a.f10453a
                    java.lang.String r5 = "<this>"
                    e6.e.D(r4, r5)
                    long r5 = qi.a.f(r4)
                    float r5 = (float) r5
                    io.nodle.sdk.NodleContext r4 = r4.f9450a
                    m2.a r4 = r4.getSdkConfig()
                    r6 = 1065353216(0x3f800000, float:1.0)
                    java.lang.Float r6 = java.lang.Float.valueOf(r6)
                    a9.c r4 = (a9.c) r4
                    java.lang.String r7 = "ble.scan.interval-x-factor"
                    java.lang.Object r4 = r4.a(r7, r6)
                    java.lang.Number r4 = (java.lang.Number) r4
                    float r4 = r4.floatValue()
                    float r4 = r4 * r5
                    long r4 = (long) r4
                    java.lang.Long r6 = new java.lang.Long
                    r6.<init>(r4)
                    io.nodle.sdk.runner.coroutine.NodleCoroutine r4 = r12.f6862s
                    long r7 = r6.longValue()
                    org.slf4j.Logger r4 = r4.log
                    java.lang.String r5 = "ble-scan-looper: next pass in "
                    java.lang.StringBuilder r5 = a.b.q(r5)
                    r9 = 1000(0x3e8, float:1.401E-42)
                    long r9 = (long) r9
                    long r9 = r7 / r9
                    r5.append(r9)
                    java.lang.String r9 = " seconds"
                    r5.append(r9)
                    java.lang.String r5 = r5.toString()
                    r4.debug(r5)
                    r12.f6861c = r1
                    r12.f6859a = r6
                    r12.f6860b = r3
                    java.lang.Object r4 = c3.k.f0(r7, r12)
                    if (r4 != r0) goto L_0x002e
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.nodle.sdk.runner.coroutine.NodleCoroutine.a.C0117a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @e(c = "io.nodle.sdk.runner.coroutine.NodleCoroutine$startNodle$1$2", f = "NodleCoroutine.kt", l = {111, 115}, m = "invokeSuspend")
        public static final class b extends i implements p<d0, pd.d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public Long f6864a;

            /* renamed from: b  reason: collision with root package name */
            public int f6865b;

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ Object f6866c;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ NodleCoroutine f6867s;

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ oi.a f6868t;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(NodleCoroutine nodleCoroutine, oi.a aVar, pd.d<? super b> dVar) {
                super(2, dVar);
                this.f6867s = nodleCoroutine;
                this.f6868t = aVar;
            }

            public final pd.d<m> create(Object obj, pd.d<?> dVar) {
                b bVar = new b(this.f6867s, this.f6868t, dVar);
                bVar.f6866c = obj;
                return bVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                b bVar = new b(this.f6867s, this.f6868t, (pd.d) obj2);
                bVar.f6866c = (d0) obj;
                return bVar.invokeSuspend(m.f8555a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ge.d0} */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0055 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x00ae A[RETURN] */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    qd.a r0 = qd.a.COROUTINE_SUSPENDED
                    int r1 = r11.f6865b
                    r2 = 1
                    r3 = 2
                    if (r1 == 0) goto L_0x0025
                    if (r1 == r2) goto L_0x001c
                    if (r1 != r3) goto L_0x0014
                    java.lang.Object r1 = r11.f6866c
                    ge.d0 r1 = (ge.d0) r1
                    l6.b1.w(r12)
                    goto L_0x002d
                L_0x0014:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L_0x001c:
                    java.lang.Object r1 = r11.f6866c
                    ge.d0 r1 = (ge.d0) r1
                    l6.b1.w(r12)
                    r12 = r11
                    goto L_0x0056
                L_0x0025:
                    l6.b1.w(r12)
                    java.lang.Object r12 = r11.f6866c
                    r1 = r12
                    ge.d0 r1 = (ge.d0) r1
                L_0x002d:
                    r12 = r11
                L_0x002e:
                    pd.f r4 = r1.f()
                    ad.c.G(r4)
                    io.nodle.sdk.runner.coroutine.NodleCoroutine r4 = r12.f6867s
                    org.slf4j.Logger r4 = r4.log
                    java.lang.String r5 = "cell-scan-looper: performing a pass"
                    r4.debug(r5)
                    oi.a r4 = r12.f6868t
                    io.nodle.sdk.runner.coroutine.NodleCoroutine r5 = r12.f6867s
                    ge.d0 r5 = r5.getNodleScope()
                    r12.f6866c = r1
                    r6 = 0
                    r12.f6864a = r6
                    r12.f6865b = r2
                    java.lang.Object r4 = ti.a.a(r4, r5, r12)
                    if (r4 != r0) goto L_0x0056
                    return r0
                L_0x0056:
                    oi.a r4 = r12.f6868t
                    java.lang.String r5 = "<this>"
                    e6.e.D(r4, r5)
                    io.nodle.sdk.NodleContext r4 = r4.f9450a
                    m2.a r4 = r4.getSdkConfig()
                    r5 = 1195593728(0x47435000, float:50000.0)
                    java.lang.Float r5 = java.lang.Float.valueOf(r5)
                    a9.c r4 = (a9.c) r4
                    java.lang.String r6 = "cell.scan.interval-msec"
                    java.lang.Object r4 = r4.a(r6, r5)
                    java.lang.Number r4 = (java.lang.Number) r4
                    float r4 = r4.floatValue()
                    long r4 = (long) r4
                    java.lang.Long r6 = new java.lang.Long
                    r6.<init>(r4)
                    io.nodle.sdk.runner.coroutine.NodleCoroutine r4 = r12.f6867s
                    long r7 = r6.longValue()
                    org.slf4j.Logger r4 = r4.log
                    java.lang.String r5 = "cell-scan-looper: next pass in "
                    java.lang.StringBuilder r5 = a.b.q(r5)
                    r9 = 1000(0x3e8, float:1.401E-42)
                    long r9 = (long) r9
                    long r9 = r7 / r9
                    r5.append(r9)
                    java.lang.String r9 = " seconds"
                    r5.append(r9)
                    java.lang.String r5 = r5.toString()
                    r4.debug(r5)
                    r12.f6866c = r1
                    r12.f6864a = r6
                    r12.f6865b = r3
                    java.lang.Object r4 = c3.k.f0(r7, r12)
                    if (r4 != r0) goto L_0x002e
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.nodle.sdk.runner.coroutine.NodleCoroutine.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @e(c = "io.nodle.sdk.runner.coroutine.NodleCoroutine$startNodle$1$3", f = "NodleCoroutine.kt", l = {127}, m = "invokeSuspend")
        public static final class c extends i implements p<d0, pd.d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f6869a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ Object f6870b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ NodleCoroutine f6871c;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ oi.a f6872s;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(NodleCoroutine nodleCoroutine, oi.a aVar, pd.d<? super c> dVar) {
                super(2, dVar);
                this.f6871c = nodleCoroutine;
                this.f6872s = aVar;
            }

            public final pd.d<m> create(Object obj, pd.d<?> dVar) {
                c cVar = new c(this.f6871c, this.f6872s, dVar);
                cVar.f6870b = obj;
                return cVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                c cVar = new c(this.f6871c, this.f6872s, (pd.d) obj2);
                cVar.f6870b = (d0) obj;
                return cVar.invokeSuspend(m.f8555a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ge.d0} */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bf, code lost:
                r4 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
                ad.c.z(r5, r9);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c3, code lost:
                throw r4;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    qd.a r0 = qd.a.COROUTINE_SUSPENDED
                    int r1 = r8.f6869a
                    r2 = 1
                    if (r1 == 0) goto L_0x0019
                    if (r1 != r2) goto L_0x0011
                    java.lang.Object r1 = r8.f6870b
                    ge.d0 r1 = (ge.d0) r1
                    l6.b1.w(r9)
                    goto L_0x0021
                L_0x0011:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L_0x0019:
                    l6.b1.w(r9)
                    java.lang.Object r9 = r8.f6870b
                    r1 = r9
                    ge.d0 r1 = (ge.d0) r1
                L_0x0021:
                    pd.f r9 = r1.f()
                    ad.c.G(r9)
                    io.nodle.sdk.runner.coroutine.NodleCoroutine r9 = r8.f6871c
                    org.slf4j.Logger r9 = r9.log
                    java.lang.String r3 = "config-looper: pulling remote config"
                    r9.debug(r3)
                    oi.a r9 = r8.f6872s
                    java.lang.String r3 = "<this>"
                    e6.e.D(r9, r3)
                    io.nodle.sdk.NodleContext r4 = r9.f9450a
                    m2.a r4 = r4.getSdkConfig()
                    java.lang.String r5 = r9.f9451b
                    c.c r9 = r9.f9454e
                    java.net.URI r9 = r9.g()
                    java.lang.String r9 = r9.toASCIIString()
                    java.lang.String r6 = "dtnAgent.nodeId().toASCIIString()"
                    e6.e.C(r9, r6)
                    a9.c r4 = (a9.c) r4
                    java.util.Objects.requireNonNull(r4)
                    java.lang.String r6 = "devkey"
                    e6.e.D(r5, r6)
                    java.lang.String r7 = "https://dtn.nodle.io/config/v4"
                    android.net.Uri r7 = android.net.Uri.parse(r7)
                    android.net.Uri$Builder r7 = r7.buildUpon()
                    android.net.Uri$Builder r5 = r7.appendQueryParameter(r6, r5)
                    java.lang.String r6 = "dtnid"
                    android.net.Uri$Builder r9 = r5.appendQueryParameter(r6, r9)
                    java.lang.Object r5 = r4.f176b
                    android.content.Context r5 = (android.content.Context) r5
                    java.lang.String r5 = r5.getPackageName()
                    java.lang.String r6 = "hostapp"
                    android.net.Uri$Builder r9 = r9.appendQueryParameter(r6, r5)
                    java.lang.Object r5 = r4.f176b
                    android.content.Context r5 = (android.content.Context) r5
                    r6 = 2131755171(0x7f1000a3, float:1.9141214E38)
                    java.lang.String r5 = r5.getString(r6)
                    java.lang.String r6 = "version"
                    android.net.Uri$Builder r9 = r9.appendQueryParameter(r6, r5)
                    android.net.Uri r9 = r9.build()
                    java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x00c4 }
                    java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00c4 }
                    r5.<init>(r9)     // Catch:{ Exception -> 0x00c4 }
                    java.nio.charset.Charset r9 = fe.a.f5086b     // Catch:{ Exception -> 0x00c4 }
                    java.io.InputStream r5 = r5.openStream()     // Catch:{ Exception -> 0x00c4 }
                    java.lang.String r6 = "it"
                    e6.e.C(r5, r6)     // Catch:{ all -> 0x00bd }
                    byte[] r6 = y.c.Y(r5)     // Catch:{ all -> 0x00bd }
                    r7 = 0
                    ad.c.z(r5, r7)     // Catch:{ Exception -> 0x00c4 }
                    java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x00c4 }
                    r5.<init>(r6, r9)     // Catch:{ Exception -> 0x00c4 }
                    java.lang.Object r9 = r4.f176b     // Catch:{ Exception -> 0x00c4 }
                    android.content.Context r9 = (android.content.Context) r9     // Catch:{ Exception -> 0x00c4 }
                    java.lang.String r4 = "remote"
                    kd.a.a(r9, r5, r4)     // Catch:{ Exception -> 0x00c4 }
                    goto L_0x00c4
                L_0x00bd:
                    r9 = move-exception
                    throw r9     // Catch:{ all -> 0x00bf }
                L_0x00bf:
                    r4 = move-exception
                    ad.c.z(r5, r9)     // Catch:{ Exception -> 0x00c4 }
                    throw r4     // Catch:{ Exception -> 0x00c4 }
                L_0x00c4:
                    oi.a r9 = r8.f6872s
                    e6.e.D(r9, r3)
                    io.nodle.sdk.NodleContext r9 = r9.f9450a
                    m2.a r9 = r9.getSdkConfig()
                    r3 = 1217559552(0x48927c00, float:300000.0)
                    java.lang.Float r3 = java.lang.Float.valueOf(r3)
                    a9.c r9 = (a9.c) r9
                    java.lang.String r4 = "core.pull-config-interval-msec"
                    java.lang.Object r9 = r9.a(r4, r3)
                    java.lang.Number r9 = (java.lang.Number) r9
                    float r9 = r9.floatValue()
                    long r3 = (long) r9
                    r8.f6870b = r1
                    r8.f6869a = r2
                    java.lang.Object r9 = c3.k.f0(r3, r8)
                    if (r9 != r0) goto L_0x0021
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.nodle.sdk.runner.coroutine.NodleCoroutine.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @e(c = "io.nodle.sdk.runner.coroutine.NodleCoroutine$startNodle$1$4", f = "NodleCoroutine.kt", l = {137, 139}, m = "invokeSuspend")
        public static final class d extends i implements p<d0, pd.d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f6873a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ Object f6874b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ NodleCoroutine f6875c;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ oi.a f6876s;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(NodleCoroutine nodleCoroutine, oi.a aVar, pd.d<? super d> dVar) {
                super(2, dVar);
                this.f6875c = nodleCoroutine;
                this.f6876s = aVar;
            }

            public final pd.d<m> create(Object obj, pd.d<?> dVar) {
                d dVar2 = new d(this.f6875c, this.f6876s, dVar);
                dVar2.f6874b = obj;
                return dVar2;
            }

            public final Object invoke(Object obj, Object obj2) {
                d dVar = new d(this.f6875c, this.f6876s, (pd.d) obj2);
                dVar.f6874b = (d0) obj;
                return dVar.invokeSuspend(m.f8555a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ge.d0} */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x008c A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x00d5 A[RETURN] */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    qd.a r0 = qd.a.COROUTINE_SUSPENDED
                    int r1 = r9.f6873a
                    java.lang.String r2 = "<this>"
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L_0x0027
                    if (r1 == r4) goto L_0x001e
                    if (r1 != r3) goto L_0x0016
                    java.lang.Object r1 = r9.f6874b
                    ge.d0 r1 = (ge.d0) r1
                    l6.b1.w(r10)
                    goto L_0x002f
                L_0x0016:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L_0x001e:
                    java.lang.Object r1 = r9.f6874b
                    ge.d0 r1 = (ge.d0) r1
                    l6.b1.w(r10)
                    r10 = r9
                    goto L_0x008d
                L_0x0027:
                    l6.b1.w(r10)
                    java.lang.Object r10 = r9.f6874b
                    r1 = r10
                    ge.d0 r1 = (ge.d0) r1
                L_0x002f:
                    r10 = r9
                L_0x0030:
                    pd.f r5 = r1.f()
                    ad.c.G(r5)
                    io.nodle.sdk.runner.coroutine.NodleCoroutine r5 = r10.f6875c
                    org.slf4j.Logger r5 = r5.log
                    java.lang.String r6 = "network-monitoring-looper: checking network"
                    r5.debug(r6)
                    oi.a r5 = r10.f6876s
                    r10.f6874b = r1
                    r10.f6873a = r4
                    aa.b r6 = r5.i
                    io.nodle.sdk.NodleContext r7 = r5.f9450a
                    int r6 = r6.e(r7)
                    int r6 = aa.b.d(r6)
                    if (r6 == r4) goto L_0x0062
                    if (r6 == r3) goto L_0x0059
                    goto L_0x0088
                L_0x0059:
                    java.lang.Object r5 = zi.c.a(r5, r10)
                    qd.a r6 = qd.a.COROUTINE_SUSPENDED
                    if (r5 != r6) goto L_0x0088
                    goto L_0x008a
                L_0x0062:
                    c.c r6 = r5.f9454e
                    e6.e.D(r6, r2)
                    io.nodle.sdk.NodleContext r6 = r6.f3046a
                    m2.a r6 = r6.getSdkConfig()
                    java.lang.Boolean r7 = java.lang.Boolean.TRUE
                    a9.c r6 = (a9.c) r6
                    java.lang.String r8 = "dtn.use-cellular"
                    java.lang.Object r6 = r6.a(r8, r7)
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L_0x0088
                    java.lang.Object r5 = zi.c.a(r5, r10)
                    qd.a r6 = qd.a.COROUTINE_SUSPENDED
                    if (r5 != r6) goto L_0x0088
                    goto L_0x008a
                L_0x0088:
                    md.m r5 = md.m.f8555a
                L_0x008a:
                    if (r5 != r0) goto L_0x008d
                    return r0
                L_0x008d:
                    oi.a r5 = r10.f6876s
                    org.slf4j.Logger r6 = vi.b.f12483a
                    e6.e.D(r5, r2)
                    java.lang.String r7 = "iotee: cleaning sx store"
                    r6.debug(r7)
                    ze.f r5 = r5.f9452c
                    hf.f r5 = (hf.f) r5
                    ze.g r5 = r5.a()
                    long r6 = java.lang.System.currentTimeMillis()
                    r5.d(r6)
                    io.nodle.sdk.runner.coroutine.NodleCoroutine r5 = r10.f6875c
                    io.nodle.sdk.NodleContext r5 = r5.ctx
                    e6.e.D(r5, r2)
                    m2.a r5 = r5.getSdkConfig()
                    r6 = 1189765120(0x46ea6000, float:30000.0)
                    java.lang.Float r6 = java.lang.Float.valueOf(r6)
                    a9.c r5 = (a9.c) r5
                    java.lang.String r7 = "core.check-network-interval-msec"
                    java.lang.Object r5 = r5.a(r7, r6)
                    java.lang.Number r5 = (java.lang.Number) r5
                    float r5 = r5.floatValue()
                    long r5 = (long) r5
                    r10.f6874b = r1
                    r10.f6873a = r3
                    java.lang.Object r5 = c3.k.f0(r5, r10)
                    if (r5 != r0) goto L_0x0030
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.nodle.sdk.runner.coroutine.NodleCoroutine.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(NodleCoroutine nodleCoroutine, String str, String[] strArr, pd.d<? super a> dVar) {
            super(2, dVar);
            this.f6856b = nodleCoroutine;
            this.f6857c = str;
            this.f6858s = strArr;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            a aVar = new a(this.f6856b, this.f6857c, this.f6858s, dVar);
            aVar.f6855a = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = new a(this.f6856b, this.f6857c, this.f6858s, (pd.d) obj2);
            aVar.f6855a = (d0) obj;
            m mVar = m.f8555a;
            aVar.invokeSuspend(mVar);
            return mVar;
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            b1.w(obj);
            d0 d0Var = (d0) this.f6855a;
            SdkFactory access$getSdkFactory$p = this.f6856b.sdkFactory;
            NodleContext access$getCtx$p = this.f6856b.ctx;
            String str = this.f6857c;
            h<xb.b> eventChannel = this.f6856b.getEventChannel();
            String[] strArr = this.f6858s;
            oi.a persistentSdkCore = access$getSdkFactory$p.persistentSdkCore(access$getCtx$p, str, eventChannel, (String[]) Arrays.copyOf(strArr, strArr.length));
            this.f6856b.core = persistentSdkCore;
            g.b(d0Var, this.f6856b.ctx.coroutineName("ble-scan-looper"), new C0117a(this.f6856b, persistentSdkCore, (pd.d<? super C0117a>) null), 2);
            g.b(d0Var, this.f6856b.ctx.coroutineName("cell-scan-looper"), new b(this.f6856b, persistentSdkCore, (pd.d<? super b>) null), 2);
            g.b(d0Var, this.f6856b.ctx.coroutineName("config-looper"), new c(this.f6856b, persistentSdkCore, (pd.d<? super c>) null), 2);
            g.b(d0Var, this.f6856b.ctx.coroutineName("network-monitoring-looper"), new d(this.f6856b, persistentSdkCore, (pd.d<? super d>) null), 2);
            return m.f8555a;
        }
    }

    public NodleCoroutine(NodleContext nodleContext, SdkFactory sdkFactory2) {
        e6.e.D(nodleContext, "ctx");
        e6.e.D(sdkFactory2, "sdkFactory");
        this.ctx = nodleContext;
        this.sdkFactory = sdkFactory2;
    }

    private final g1 startNodle(String str, String... strArr) {
        return g.b(this.nodleScope, this.ctx.coroutineName("nodle-main"), new a(this, str, strArr, (d<? super a>) null), 2);
    }

    public void clear() {
        f fVar;
        oi.a aVar = this.core;
        if (!(aVar == null || (fVar = aVar.f9452c) == null)) {
            ((hf.f) fVar).f5949a.d();
        }
        SharedPreferences sharedPreferences = ((Context) ((c) this.ctx.getSdkConfig()).f176b).getSharedPreferences("nodle-prefs", 0);
        e6.e.C(sharedPreferences, "context.getSharedPrefere…EF_NAME, NODLE_PREF_MODE)");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        e6.e.C(edit, "prefs.edit()");
        edit.clear();
        edit.apply();
    }

    public void config(NodleResourceId nodleResourceId) {
        e6.e.D(nodleResourceId, "resourceId");
        c cVar = (c) this.ctx.getSdkConfig();
        Objects.requireNonNull(cVar);
        Context context = (Context) cVar.f176b;
        kd.a.a(context, ye.a.b(context, ((AndroidNodleResourceId) nodleResourceId).getResourceId()), "static");
    }

    public <T> void config(String str, T t10) {
        e6.e.D(str, "key");
        ((c) this.ctx.getSdkConfig()).h(str, t10);
    }

    public final h<b> getEventChannel() {
        return this.eventChannel;
    }

    public je.k<b> getEvents() {
        return this.eventChannel;
    }

    public long getMetric(SdkMetricType sdkMetricType) {
        f fVar;
        ze.e e10;
        e6.e.D(sdkMetricType, "which");
        oi.a aVar = this.core;
        if (aVar == null || (fVar = aVar.f9452c) == null || (e10 = ((hf.f) fVar).e()) == null) {
            return 0;
        }
        return e10.c(sdkMetricType.getId());
    }

    public final d0 getNodleScope() {
        return this.nodleScope;
    }

    public final boolean getScanning() {
        return this.scanning;
    }

    public String getVersion() {
        return this.ctx.getGitSHA();
    }

    public boolean isScanning() {
        return this.scanning;
    }

    public boolean isStarted() {
        return this.job != null;
    }

    public final void setEventChannel(h<b> hVar) {
        e6.e.D(hVar, "<set-?>");
        this.eventChannel = hVar;
    }

    public final void setNodleScope(d0 d0Var) {
        e6.e.D(d0Var, "<set-?>");
        this.nodleScope = d0Var;
    }

    public final void setScanning(boolean z) {
        this.scanning = z;
    }

    public String showConfig() {
        return ((c) this.ctx.getSdkConfig()).f();
    }

    public void start(String str, String... strArr) {
        e6.e.D(str, "devKey");
        e6.e.D(strArr, "tags");
        c cVar = (c) this.ctx.getSdkConfig();
        Objects.requireNonNull(cVar);
        if (((Boolean) cVar.a("sentry.enabled", Boolean.TRUE)).booleanValue()) {
            Sentry.init((Sentry.OptionsConfiguration<SentryOptions>) new h1.f(cVar));
            Sentry.configureScope(new x8.k(str, cVar));
        }
        g1 g1Var = this.job;
        if (g1Var == null) {
            g1Var = startNodle(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        this.job = g1Var;
    }

    public void stop() {
        this.log.debug("stopping the runner");
        g1 g1Var = this.job;
        if (g1Var != null) {
            g1Var.c((CancellationException) null);
        }
        this.job = null;
        this.core = null;
    }
}
