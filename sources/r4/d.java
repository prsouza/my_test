package r4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import io.sentry.protocol.Device;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import k8.e;
import s4.j;
import s4.o;
import t4.m;
import u4.m;

public final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    public final k8.d f10572a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f10573b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f10574c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f10575d = c(a.f10565c);

    /* renamed from: e  reason: collision with root package name */
    public final c5.a f10576e;

    /* renamed from: f  reason: collision with root package name */
    public final c5.a f10577f;
    public final int g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final URL f10578a;

        /* renamed from: b  reason: collision with root package name */
        public final j f10579b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10580c;

        public a(URL url, j jVar, String str) {
            this.f10578a = url;
            this.f10579b = jVar;
            this.f10580c = str;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f10581a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f10582b;

        /* renamed from: c  reason: collision with root package name */
        public final long f10583c;

        public b(int i, URL url, long j10) {
            this.f10581a = i;
            this.f10582b = url;
            this.f10583c = j10;
        }
    }

    public d(Context context, c5.a aVar, c5.a aVar2) {
        e eVar = new e();
        s4.b.f10861a.a(eVar);
        eVar.f7479d = true;
        this.f10572a = new k8.d(eVar);
        this.f10574c = context;
        this.f10573b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f10576e = aVar2;
        this.f10577f = aVar;
        this.g = 40000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(a8.a.c("Invalid url: ", str), e10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x02a5 A[Catch:{ IOException -> 0x02f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02b7 A[Catch:{ IOException -> 0x02f3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final u4.g a(u4.f r32) {
        /*
            r31 = this;
            r1 = r31
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2 = r32
            u4.a r2 = (u4.a) r2
            java.lang.Iterable<t4.m> r3 = r2.f11689a
            java.util.Iterator r3 = r3.iterator()
        L_0x0011:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r3.next()
            t4.m r4 = (t4.m) r4
            java.lang.String r5 = r4.h()
            boolean r6 = r0.containsKey(r5)
            if (r6 != 0) goto L_0x0033
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r4)
            r0.put(r5, r6)
            goto L_0x0011
        L_0x0033:
            java.lang.Object r5 = r0.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r4)
            goto L_0x0011
        L_0x003d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x004a:
            boolean r4 = r0.hasNext()
            java.lang.String r5 = "CctTransportBackend"
            r6 = 0
            if (r4 == 0) goto L_0x0263
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r7 = r4.getValue()
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            t4.m r7 = (t4.m) r7
            s4.p r17 = s4.p.DEFAULT
            c5.a r8 = r1.f10577f
            long r8 = r8.a()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            c5.a r9 = r1.f10576e
            long r9 = r9.a()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            s4.k$a r10 = s4.k.a.ANDROID_FIREBASE
            java.lang.String r11 = "sdk-version"
            int r11 = r7.g(r11)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r11)
            java.lang.String r11 = "model"
            java.lang.String r20 = r7.b(r11)
            java.lang.String r11 = "hardware"
            java.lang.String r21 = r7.b(r11)
            java.lang.String r11 = "device"
            java.lang.String r22 = r7.b(r11)
            java.lang.String r11 = "product"
            java.lang.String r23 = r7.b(r11)
            java.lang.String r11 = "os-uild"
            java.lang.String r24 = r7.b(r11)
            java.lang.String r11 = "manufacturer"
            java.lang.String r25 = r7.b(r11)
            java.lang.String r11 = "fingerprint"
            java.lang.String r26 = r7.b(r11)
            java.lang.String r11 = "country"
            java.lang.String r28 = r7.b(r11)
            java.lang.String r11 = "locale"
            java.lang.String r27 = r7.b(r11)
            java.lang.String r11 = "mcc_mnc"
            java.lang.String r29 = r7.b(r11)
            java.lang.String r11 = "application_build"
            java.lang.String r30 = r7.b(r11)
            s4.c r7 = new s4.c
            r18 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            s4.e r13 = new s4.e
            r13.<init>(r10, r7)
            java.lang.Object r7 = r4.getKey()     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x00e7 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x00e7 }
            r15 = r6
            r14 = r7
            goto L_0x00ef
        L_0x00e7:
            java.lang.Object r7 = r4.getKey()
            java.lang.String r7 = (java.lang.String) r7
            r14 = r6
            r15 = r7
        L_0x00ef:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00fe:
            boolean r7 = r4.hasNext()
            java.lang.String r10 = "Missing required properties:"
            java.lang.String r11 = ""
            if (r7 == 0) goto L_0x0226
            java.lang.Object r7 = r4.next()
            t4.m r7 = (t4.m) r7
            t4.l r12 = r7.e()
            r19 = r0
            q4.b r0 = r12.f11379a
            r16 = r4
            q4.b r4 = new q4.b
            r18 = r11
            java.lang.String r11 = "proto"
            r4.<init>(r11)
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0131
            byte[] r0 = r12.f11380b
            s4.f$a r4 = new s4.f$a
            r4.<init>()
            r4.f10917d = r0
            goto L_0x0152
        L_0x0131:
            q4.b r4 = new q4.b
            java.lang.String r11 = "json"
            r4.<init>(r11)
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0206
            java.lang.String r0 = new java.lang.String
            byte[] r4 = r12.f11380b
            java.lang.String r11 = "UTF-8"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            r0.<init>(r4, r11)
            s4.f$a r4 = new s4.f$a
            r4.<init>()
            r4.f10918e = r0
        L_0x0152:
            long r11 = r7.f()
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r4.f10914a = r0
            long r11 = r7.i()
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r4.f10916c = r0
            java.util.Map r0 = r7.c()
            java.lang.String r11 = "tz-offset"
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0177
            r11 = 0
            goto L_0x017f
        L_0x0177:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r11 = r0.longValue()
        L_0x017f:
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r4.f10919f = r0
            java.lang.String r0 = "net-type"
            int r0 = r7.g(r0)
            s4.o$b r0 = s4.o.b.forNumber(r0)
            java.lang.String r11 = "mobile-subtype"
            int r11 = r7.g(r11)
            s4.o$a r11 = s4.o.a.forNumber(r11)
            s4.i r12 = new s4.i
            r12.<init>(r0, r11)
            r4.g = r12
            java.lang.Integer r0 = r7.d()
            if (r0 == 0) goto L_0x01ac
            java.lang.Integer r0 = r7.d()
            r4.f10915b = r0
        L_0x01ac:
            java.lang.Long r0 = r4.f10914a
            if (r0 != 0) goto L_0x01b3
            java.lang.String r11 = " eventTimeMs"
            goto L_0x01b5
        L_0x01b3:
            r11 = r18
        L_0x01b5:
            java.lang.Long r0 = r4.f10916c
            if (r0 != 0) goto L_0x01bf
            java.lang.String r0 = " eventUptimeMs"
            java.lang.String r11 = a8.a.c(r11, r0)
        L_0x01bf:
            java.lang.Long r0 = r4.f10919f
            if (r0 != 0) goto L_0x01c9
            java.lang.String r0 = " timezoneOffsetSeconds"
            java.lang.String r11 = a8.a.c(r11, r0)
        L_0x01c9:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x01fc
            s4.f r0 = new s4.f
            java.lang.Long r7 = r4.f10914a
            long r21 = r7.longValue()
            java.lang.Integer r7 = r4.f10915b
            java.lang.Long r10 = r4.f10916c
            long r24 = r10.longValue()
            byte[] r10 = r4.f10917d
            java.lang.String r11 = r4.f10918e
            java.lang.Long r12 = r4.f10919f
            long r28 = r12.longValue()
            s4.o r4 = r4.g
            r20 = r0
            r23 = r7
            r26 = r10
            r27 = r11
            r30 = r4
            r20.<init>(r21, r23, r24, r26, r27, r28, r30)
            r6.add(r0)
            goto L_0x0220
        L_0x01fc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = a8.a.c(r10, r11)
            r0.<init>(r2)
            throw r0
        L_0x0206:
            java.lang.String r4 = aa.b.K(r5)
            r7 = 5
            boolean r7 = android.util.Log.isLoggable(r4, r7)
            if (r7 == 0) goto L_0x0220
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r10 = 0
            r7[r10] = r0
            java.lang.String r0 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String r0 = java.lang.String.format(r0, r7)
            android.util.Log.w(r4, r0)
        L_0x0220:
            r4 = r16
            r0 = r19
            goto L_0x00fe
        L_0x0226:
            r19 = r0
            r18 = r11
            if (r8 != 0) goto L_0x022f
            java.lang.String r11 = " requestTimeMs"
            goto L_0x0231
        L_0x022f:
            r11 = r18
        L_0x0231:
            if (r9 != 0) goto L_0x0239
            java.lang.String r0 = " requestUptimeMs"
            java.lang.String r11 = a8.a.c(r11, r0)
        L_0x0239:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0259
            s4.g r0 = new s4.g
            long r4 = r8.longValue()
            long r11 = r9.longValue()
            r18 = 0
            r8 = r0
            r9 = r4
            r16 = r6
            r8.<init>(r9, r11, r13, r14, r15, r16, r17, r18)
            r3.add(r0)
            r0 = r19
            goto L_0x004a
        L_0x0259:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = a8.a.c(r10, r11)
            r0.<init>(r2)
            throw r0
        L_0x0263:
            r0 = 5
            s4.d r4 = new s4.d
            r4.<init>(r3)
            java.net.URL r3 = r1.f10575d
            byte[] r2 = r2.f11690b
            if (r2 == 0) goto L_0x028d
            r2 = r32
            u4.a r2 = (u4.a) r2     // Catch:{ IllegalArgumentException -> 0x0288 }
            byte[] r2 = r2.f11690b     // Catch:{ IllegalArgumentException -> 0x0288 }
            r4.a r2 = r4.a.a(r2)     // Catch:{ IllegalArgumentException -> 0x0288 }
            java.lang.String r7 = r2.f10569b     // Catch:{ IllegalArgumentException -> 0x0288 }
            if (r7 == 0) goto L_0x027e
            goto L_0x027f
        L_0x027e:
            r7 = r6
        L_0x027f:
            java.lang.String r2 = r2.f10568a     // Catch:{ IllegalArgumentException -> 0x0288 }
            if (r2 == 0) goto L_0x028e
            java.net.URL r3 = c(r2)     // Catch:{ IllegalArgumentException -> 0x0288 }
            goto L_0x028e
        L_0x0288:
            u4.g r0 = u4.g.a()
            return r0
        L_0x028d:
            r7 = r6
        L_0x028e:
            r8 = -1
            r4.d$a r2 = new r4.d$a     // Catch:{ IOException -> 0x02f3 }
            r2.<init>(r3, r4, r7)     // Catch:{ IOException -> 0x02f3 }
            r4.c r3 = new r4.c     // Catch:{ IOException -> 0x02f3 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x02f3 }
        L_0x029a:
            java.lang.Object r4 = r3.a(r2)     // Catch:{ IOException -> 0x02f3 }
            r7 = r4
            r4.d$b r7 = (r4.d.b) r7     // Catch:{ IOException -> 0x02f3 }
            java.net.URL r10 = r7.f10582b     // Catch:{ IOException -> 0x02f3 }
            if (r10 == 0) goto L_0x02b7
            java.lang.String r11 = "Following redirect to: %s"
            aa.b.A(r5, r11, r10)     // Catch:{ IOException -> 0x02f3 }
            java.net.URL r7 = r7.f10582b     // Catch:{ IOException -> 0x02f3 }
            r4.d$a r10 = new r4.d$a     // Catch:{ IOException -> 0x02f3 }
            s4.j r11 = r2.f10579b     // Catch:{ IOException -> 0x02f3 }
            java.lang.String r2 = r2.f10580c     // Catch:{ IOException -> 0x02f3 }
            r10.<init>(r7, r11, r2)     // Catch:{ IOException -> 0x02f3 }
            r2 = r10
            goto L_0x02b8
        L_0x02b7:
            r2 = r6
        L_0x02b8:
            if (r2 == 0) goto L_0x02bf
            int r0 = r0 + -1
            r7 = 1
            if (r0 >= r7) goto L_0x029a
        L_0x02bf:
            r4.d$b r4 = (r4.d.b) r4     // Catch:{ IOException -> 0x02f3 }
            int r0 = r4.f10581a     // Catch:{ IOException -> 0x02f3 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x02d1
            long r2 = r4.f10583c     // Catch:{ IOException -> 0x02f3 }
            u4.b r0 = new u4.b     // Catch:{ IOException -> 0x02f3 }
            u4.g$a r4 = u4.g.a.OK     // Catch:{ IOException -> 0x02f3 }
            r0.<init>(r4, r2)     // Catch:{ IOException -> 0x02f3 }
            return r0
        L_0x02d1:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r2) goto L_0x02eb
            r2 = 404(0x194, float:5.66E-43)
            if (r0 != r2) goto L_0x02da
            goto L_0x02eb
        L_0x02da:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 != r2) goto L_0x02e6
            u4.b r0 = new u4.b     // Catch:{ IOException -> 0x02f3 }
            u4.g$a r2 = u4.g.a.INVALID_PAYLOAD     // Catch:{ IOException -> 0x02f3 }
            r0.<init>(r2, r8)     // Catch:{ IOException -> 0x02f3 }
            return r0
        L_0x02e6:
            u4.g r0 = u4.g.a()     // Catch:{ IOException -> 0x02f3 }
            return r0
        L_0x02eb:
            u4.b r0 = new u4.b     // Catch:{ IOException -> 0x02f3 }
            u4.g$a r2 = u4.g.a.TRANSIENT_ERROR     // Catch:{ IOException -> 0x02f3 }
            r0.<init>(r2, r8)     // Catch:{ IOException -> 0x02f3 }
            return r0
        L_0x02f3:
            r0 = move-exception
            java.lang.String r2 = "Could not make request to the backend"
            aa.b.E(r5, r2, r0)
            u4.b r0 = new u4.b
            u4.g$a r2 = u4.g.a.TRANSIENT_ERROR
            r0.<init>(r2, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.d.a(u4.f):u4.g");
    }

    public final t4.m b(t4.m mVar) {
        int i;
        int i10;
        NetworkInfo activeNetworkInfo = this.f10573b.getActiveNetworkInfo();
        m.a j10 = mVar.j();
        j10.a("sdk-version", Build.VERSION.SDK_INT);
        j10.b("model", Build.MODEL);
        j10.b("hardware", Build.HARDWARE);
        j10.b(Device.TYPE, Build.DEVICE);
        j10.b("product", Build.PRODUCT);
        j10.b("os-uild", Build.ID);
        j10.b("manufacturer", Build.MANUFACTURER);
        j10.b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        j10.d().put("tz-offset", String.valueOf((long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000)));
        if (activeNetworkInfo == null) {
            i = o.b.NONE.getValue();
        } else {
            i = activeNetworkInfo.getType();
        }
        j10.a("net-type", i);
        int i11 = -1;
        if (activeNetworkInfo == null) {
            i10 = o.a.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            i10 = activeNetworkInfo.getSubtype();
            if (i10 == -1) {
                i10 = o.a.COMBINED.getValue();
            } else if (o.a.forNumber(i10) == null) {
                i10 = 0;
            }
        }
        j10.a("mobile-subtype", i10);
        j10.b("country", Locale.getDefault().getCountry());
        j10.b("locale", Locale.getDefault().getLanguage());
        j10.b("mcc_mnc", ((TelephonyManager) this.f10574c.getSystemService("phone")).getSimOperator());
        Context context = this.f10574c;
        try {
            i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            aa.b.E("CctTransportBackend", "Unable to find version code for package", e10);
        }
        j10.b("application_build", Integer.toString(i11));
        return j10.c();
    }
}
