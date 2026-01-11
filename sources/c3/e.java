package c3;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.util.Pair;
import b9.m;
import com.github.mikephil.charting.BuildConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002if.v;

public final class e {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public AtomicBoolean E;
    public AtomicBoolean F;
    public String G;
    public u H;
    public u I;

    /* renamed from: a  reason: collision with root package name */
    public Context f3130a;

    /* renamed from: b  reason: collision with root package name */
    public v f3131b;

    /* renamed from: c  reason: collision with root package name */
    public m f3132c;

    /* renamed from: d  reason: collision with root package name */
    public String f3133d;

    /* renamed from: e  reason: collision with root package name */
    public String f3134e;

    /* renamed from: f  reason: collision with root package name */
    public String f3135f;
    public String g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3136h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public s f3137j;

    /* renamed from: k  reason: collision with root package name */
    public String f3138k;

    /* renamed from: l  reason: collision with root package name */
    public long f3139l;

    /* renamed from: m  reason: collision with root package name */
    public long f3140m;

    /* renamed from: n  reason: collision with root package name */
    public long f3141n;

    /* renamed from: o  reason: collision with root package name */
    public long f3142o;

    /* renamed from: p  reason: collision with root package name */
    public long f3143p;

    /* renamed from: q  reason: collision with root package name */
    public long f3144q;

    /* renamed from: r  reason: collision with root package name */
    public o f3145r;

    /* renamed from: s  reason: collision with root package name */
    public int f3146s;

    /* renamed from: t  reason: collision with root package name */
    public int f3147t;

    /* renamed from: u  reason: collision with root package name */
    public int f3148u;

    /* renamed from: v  reason: collision with root package name */
    public long f3149v;

    /* renamed from: w  reason: collision with root package name */
    public long f3150w;

    /* renamed from: x  reason: collision with root package name */
    public long f3151x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3152y;
    public int z;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3153a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f3154b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ long f3155c;

        public a(String str, long j10, long j11) {
            this.f3153a = str;
            this.f3154b = j10;
            this.f3155c = j11;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x00ed A[SYNTHETIC, Splitter:B:21:0x00ed] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0112  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01ef  */
        /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r20 = this;
                r1 = r20
                c3.e r8 = c3.e.this
                if.v r2 = r8.f3131b
                java.lang.String r3 = r1.f3153a
                long r4 = r1.f3154b
                long r6 = r1.f3155c
                java.util.Objects.requireNonNull(r8)
                java.lang.String r9 = "Exception:"
                java.lang.String r10 = "Failed to post upload request"
                java.lang.String r11 = "com.amplitude.api.AmplitudeClient"
                java.lang.String r12 = "2"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r13 = ""
                r0.append(r13)
                long r14 = java.lang.System.currentTimeMillis()
                r0.append(r14)
                java.lang.String r14 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                r0.append(r12)     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                java.lang.String r15 = r8.f3133d     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                r0.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                r0.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                r0.append(r14)     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                d3.a r15 = new d3.a     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                r15.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                java.lang.String r1 = "UTF-8"
                byte[] r0 = r0.getBytes(r1)     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                byte[] r0 = r15.digest(r0)     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                r1 = 16
                char[] r1 = new char[r1]     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                r1 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                int r15 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                int r15 = r15 * 2
                char[] r15 = new char[r15]     // Catch:{ UnsupportedEncodingException -> 0x0086 }
                r17 = r10
                r16 = r13
                r13 = 0
            L_0x0063:
                int r10 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x0084 }
                if (r13 >= r10) goto L_0x007d
                byte r10 = r0[r13]     // Catch:{ UnsupportedEncodingException -> 0x0084 }
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r18 = r13 * 2
                int r19 = r10 >>> 4
                char r19 = r1[r19]     // Catch:{ UnsupportedEncodingException -> 0x0084 }
                r15[r18] = r19     // Catch:{ UnsupportedEncodingException -> 0x0084 }
                int r18 = r18 + 1
                r10 = r10 & 15
                char r10 = r1[r10]     // Catch:{ UnsupportedEncodingException -> 0x0084 }
                r15[r18] = r10     // Catch:{ UnsupportedEncodingException -> 0x0084 }
                int r13 = r13 + 1
                goto L_0x0063
            L_0x007d:
                java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0084 }
                r0.<init>(r15)     // Catch:{ UnsupportedEncodingException -> 0x0084 }
                r13 = r0
                goto L_0x009d
            L_0x0084:
                r0 = move-exception
                goto L_0x008b
            L_0x0086:
                r0 = move-exception
                r17 = r10
                r16 = r13
            L_0x008b:
                java.lang.String r1 = r0.toString()
                android.util.Log.e(r11, r1)
                c3.p r1 = c3.p.a()
                java.lang.String r10 = "Failed to compute checksum for upload request"
                r1.b(r10, r0)
                r13 = r16
            L_0x009d:
                if.o$a r0 = new if.o$a
                r0.<init>()
                java.lang.String r1 = "v"
                r0.a(r1, r12)
                java.lang.String r1 = r8.f3133d
                java.lang.String r10 = "client"
                r0.a(r10, r1)
                java.lang.String r1 = "e"
                r0.a(r1, r3)
                java.lang.String r1 = "upload_time"
                r0.a(r1, r14)
                java.lang.String r1 = "checksum"
                r0.a(r1, r13)
                if.o r0 = r0.b()
                if.x$a r1 = new if.x$a     // Catch:{ IllegalArgumentException -> 0x01f6 }
                r1.<init>()     // Catch:{ IllegalArgumentException -> 0x01f6 }
                java.lang.String r3 = r8.G     // Catch:{ IllegalArgumentException -> 0x01f6 }
                r1.f(r3)     // Catch:{ IllegalArgumentException -> 0x01f6 }
                java.lang.String r3 = "POST"
                r1.c(r3, r0)     // Catch:{ IllegalArgumentException -> 0x01f6 }
                if.x r0 = r1.a()     // Catch:{ IllegalArgumentException -> 0x01f6 }
                r1 = 1
                if.d r0 = r2.a(r0)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                mf.e r0 = (mf.e) r0     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                if.a0 r0 = r0.d()     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                if.b0 r2 = r0.f6458v     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                java.lang.String r2 = r2.f()     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                java.lang.String r3 = "success"
                boolean r3 = r2.equals(r3)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                if (r3 == 0) goto L_0x0112
                c3.u r0 = r8.H     // Catch:{ ConnectException -> 0x010d, UnknownHostException -> 0x0108, IOException -> 0x0103, AssertionError -> 0x00fe, Exception -> 0x00fb }
                c3.f r10 = new c3.f     // Catch:{ ConnectException -> 0x010d, UnknownHostException -> 0x0108, IOException -> 0x0103, AssertionError -> 0x00fe, Exception -> 0x00fb }
                r2 = r10
                r3 = r8
                r2.<init>(r3, r4, r6)     // Catch:{ ConnectException -> 0x010d, UnknownHostException -> 0x0108, IOException -> 0x0103, AssertionError -> 0x00fe, Exception -> 0x00fb }
                r0.a(r10)     // Catch:{ ConnectException -> 0x010d, UnknownHostException -> 0x0108, IOException -> 0x0103, AssertionError -> 0x00fe, Exception -> 0x00fb }
                goto L_0x01ed
            L_0x00fb:
                r0 = move-exception
                goto L_0x01a7
            L_0x00fe:
                r0 = move-exception
                r3 = r17
                goto L_0x01b8
            L_0x0103:
                r0 = move-exception
                r3 = r17
                goto L_0x01c7
            L_0x0108:
                r0 = move-exception
                r3 = r17
                goto L_0x01da
            L_0x010d:
                r0 = move-exception
                r3 = r17
                goto L_0x01e6
            L_0x0112:
                java.lang.String r3 = "invalid_api_key"
                boolean r3 = r2.equals(r3)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                if (r3 == 0) goto L_0x0121
                java.lang.String r0 = "Invalid API key, make sure your API key is correct in initialize()"
                android.util.Log.e(r11, r0)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                goto L_0x01a3
            L_0x0121:
                java.lang.String r3 = "bad_checksum"
                boolean r3 = r2.equals(r3)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                if (r3 == 0) goto L_0x0130
                java.lang.String r0 = "Bad checksum, post request was mangled in transit, will attempt to reupload later"
                android.util.Log.w(r11, r0)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                goto L_0x01a3
            L_0x0130:
                java.lang.String r3 = "request_db_write_failed"
                boolean r3 = r2.equals(r3)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                if (r3 == 0) goto L_0x013e
                java.lang.String r0 = "Couldn't write to request database on server, will attempt to reupload later"
                android.util.Log.w(r11, r0)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                goto L_0x01a3
            L_0x013e:
                int r0 = r0.f6455s     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                r3 = 413(0x19d, float:5.79E-43)
                if (r0 != r3) goto L_0x018a
                boolean r0 = r8.f3152y     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                if (r0 == 0) goto L_0x0160
                int r0 = r8.z     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                if (r0 != r1) goto L_0x0160
                r2 = 0
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 < 0) goto L_0x0157
                c3.m r0 = r8.f3132c     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                r0.y0(r4)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
            L_0x0157:
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 < 0) goto L_0x0160
                c3.m r0 = r8.f3132c     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                r0.C0(r6)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
            L_0x0160:
                r8.f3152y = r1     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                c3.m r0 = r8.f3132c     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                long r0 = r0.w()     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                int r0 = (int) r0     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                int r1 = r8.z     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                int r0 = java.lang.Math.min(r0, r1)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                double r0 = (double) r0     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                r2 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r0 = r0 / r2
                double r0 = java.lang.Math.ceil(r0)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                int r0 = (int) r0     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                r8.z = r0     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                java.lang.String r0 = "Request too large, will decrease size and attempt to reupload"
                android.util.Log.w(r11, r0)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                c3.u r0 = r8.H     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                c3.g r1 = new c3.g     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                r1.<init>(r8)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                r0.a(r1)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                goto L_0x01a3
            L_0x018a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                r0.<init>()     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                java.lang.String r1 = "Upload failed, "
                r0.append(r1)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                r0.append(r2)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                java.lang.String r1 = ", will attempt to reupload later"
                r0.append(r1)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                java.lang.String r0 = r0.toString()     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
                android.util.Log.w(r11, r0)     // Catch:{ ConnectException -> 0x01e2, UnknownHostException -> 0x01d6, IOException -> 0x01c3, AssertionError -> 0x01b4, Exception -> 0x01a5 }
            L_0x01a3:
                r1 = 0
                goto L_0x01ed
            L_0x01a5:
                r0 = move-exception
                r1 = 0
            L_0x01a7:
                android.util.Log.e(r11, r9, r0)
                c3.p r2 = c3.p.a()
                r3 = r17
                r2.b(r3, r0)
                goto L_0x01ed
            L_0x01b4:
                r0 = move-exception
                r3 = r17
                r1 = 0
            L_0x01b8:
                android.util.Log.e(r11, r9, r0)
                c3.p r2 = c3.p.a()
                r2.b(r3, r0)
                goto L_0x01ed
            L_0x01c3:
                r0 = move-exception
                r3 = r17
                r1 = 0
            L_0x01c7:
                java.lang.String r2 = r0.toString()
                android.util.Log.e(r11, r2)
                c3.p r2 = c3.p.a()
                r2.b(r3, r0)
                goto L_0x01ed
            L_0x01d6:
                r0 = move-exception
                r3 = r17
                r1 = 0
            L_0x01da:
                c3.p r2 = c3.p.a()
                r2.b(r3, r0)
                goto L_0x01ed
            L_0x01e2:
                r0 = move-exception
                r3 = r17
                r1 = 0
            L_0x01e6:
                c3.p r2 = c3.p.a()
                r2.b(r3, r0)
            L_0x01ed:
                if (r1 != 0) goto L_0x020d
                java.util.concurrent.atomic.AtomicBoolean r0 = r8.F
                r1 = 0
                r0.set(r1)
                goto L_0x020d
            L_0x01f6:
                r0 = move-exception
                java.lang.String r1 = r0.toString()
                android.util.Log.e(r11, r1)
                java.util.concurrent.atomic.AtomicBoolean r1 = r8.F
                r2 = 0
                r1.set(r2)
                c3.p r1 = c3.p.a()
                java.lang.String r2 = "Failed to build upload request"
                r1.b(r2, r0)
            L_0x020d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c3.e.a.run():void");
        }
    }

    public e() {
        this((String) null);
    }

    public static String a(e eVar) {
        Objects.requireNonNull(eVar);
        HashSet hashSet = new HashSet();
        hashSet.add(BuildConfig.FLAVOR);
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        String T = eVar.f3132c.T("device_id");
        String string = t.b(eVar.f3130a, eVar.f3134e).getString("device_id", (String) null);
        if (t.c(T) || hashSet.contains(T)) {
            if (t.c(string) || hashSet.contains(string)) {
                String str = UUID.randomUUID().toString() + "R";
                eVar.l(str);
                return str;
            }
            eVar.l(string);
            return string;
        } else if (T.equals(string)) {
            return T;
        } else {
            eVar.l(T);
            return T;
        }
    }

    public static long b(e eVar, String str, long j10) {
        Long E2 = eVar.f3132c.E(str);
        return E2 == null ? j10 : E2.longValue();
    }

    public static void h(SharedPreferences sharedPreferences, String str, m mVar, String str2) {
        if (mVar.E(str2) == null) {
            mVar.p0(str2, Long.valueOf(sharedPreferences.getLong(str, -1)));
            sharedPreferences.edit().remove(str).apply();
        }
    }

    public static void i(SharedPreferences sharedPreferences, String str, m mVar, String str2) {
        if (t.c(mVar.T(str2))) {
            String string = sharedPreferences.getString(str, (String) null);
            if (!t.c(string)) {
                mVar.v0(str2, string);
                sharedPreferences.edit().remove(str).apply();
            }
        }
    }

    public static String q(String str) {
        return str.length() <= 1024 ? str : str.substring(0, 1024);
    }

    public static boolean v(Context context) {
        String str;
        try {
            str = k.class.getPackage().getName();
        } catch (Exception unused) {
            str = "com.amplitude.api";
        }
        try {
            if ("com.amplitude.api".equals(str)) {
                return false;
            }
            String str2 = str + "." + context.getPackageName();
            SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
            if (sharedPreferences.getAll().size() == 0) {
                return false;
            }
            String str3 = "com.amplitude.api" + "." + context.getPackageName();
            SharedPreferences.Editor edit = context.getSharedPreferences(str3, 0).edit();
            if (sharedPreferences.contains(str + ".previousSessionId")) {
                edit.putLong("com.amplitude.api.previousSessionId", sharedPreferences.getLong(str + ".previousSessionId", -1));
            }
            if (sharedPreferences.contains(str + ".deviceId")) {
                edit.putString("com.amplitude.api.deviceId", sharedPreferences.getString(str + ".deviceId", (String) null));
            }
            if (sharedPreferences.contains(str + ".userId")) {
                edit.putString("com.amplitude.api.userId", sharedPreferences.getString(str + ".userId", (String) null));
            }
            if (sharedPreferences.contains(str + ".optOut")) {
                edit.putBoolean("com.amplitude.api.optOut", sharedPreferences.getBoolean(str + ".optOut", false));
            }
            edit.apply();
            sharedPreferences.edit().clear().apply();
            Log.i("com.amplitude.api.AmplitudeClient", "Upgraded shared preferences from " + str2 + " to " + str3);
            return true;
        } catch (Exception e10) {
            Log.e("com.amplitude.api.AmplitudeClient", "Error upgrading shared preferences", e10);
            p.a().b("Failed to upgrade shared prefs", e10);
            return false;
        }
    }

    public static void w(Context context) {
        m s10 = m.s(context, (String) null);
        String T = s10.T("device_id");
        Long E2 = s10.E("previous_session_id");
        Long E3 = s10.E("last_event_time");
        if (t.c(T) || E2 == null || E3 == null) {
            StringBuilder c10 = m.c("com.amplitude.api", ".");
            c10.append(context.getPackageName());
            SharedPreferences sharedPreferences = context.getSharedPreferences(c10.toString(), 0);
            i(sharedPreferences, "com.amplitude.api.deviceId", s10, "device_id");
            h(sharedPreferences, "com.amplitude.api.lastEventTime", s10, "last_event_time");
            h(sharedPreferences, "com.amplitude.api.lastEventId", s10, "last_event_id");
            h(sharedPreferences, "com.amplitude.api.lastIdentifyId", s10, "last_identify_id");
            h(sharedPreferences, "com.amplitude.api.previousSessionId", s10, "previous_session_id");
            i(sharedPreferences, "com.amplitude.api.userId", s10, "user_id");
            if (s10.E("opt_out") == null) {
                s10.p0("opt_out", Long.valueOf(sharedPreferences.getBoolean("com.amplitude.api.optOut", false) ? 1 : 0));
                sharedPreferences.edit().remove("com.amplitude.api.optOut").apply();
            }
        }
    }

    public final synchronized boolean c(String str) {
        if (this.f3130a == null) {
            Log.e("com.amplitude.api.AmplitudeClient", "context cannot be null, set context with initialize() before calling " + str);
            return false;
        } else if (!t.c(this.f3133d)) {
            return true;
        } else {
            Log.e("com.amplitude.api.AmplitudeClient", "apiKey cannot be null or empty, set apiKey with initialize() before calling " + str);
            return false;
        }
    }

    public final boolean d() {
        return this.f3139l >= 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v88, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long e(java.lang.String r23, org.json.JSONObject r24, org.json.JSONObject r25, org.json.JSONObject r26, org.json.JSONObject r27, org.json.JSONObject r28, long r29, boolean r31) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            r0 = r24
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            java.lang.String r8 = "platform"
            java.lang.String r9 = "language"
            java.lang.String r10 = "country"
            java.lang.String r11 = "carrier"
            java.lang.String r12 = "device_model"
            java.lang.String r13 = "device_manufacturer"
            java.lang.String r14 = "device_brand"
            java.lang.String r15 = "os_version"
            java.lang.String r5 = "os_name"
            java.lang.String r4 = "version_name"
            java.lang.String r3 = "sequence_number"
            boolean r0 = r1.i
            r16 = -1
            if (r0 == 0) goto L_0x002b
            return r16
        L_0x002b:
            boolean r0 = r1.B
            r18 = r8
            r19 = 0
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "session_start"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "session_end"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
        L_0x0043:
            r0 = 1
            goto L_0x0047
        L_0x0045:
            r0 = r19
        L_0x0047:
            if (r0 != 0) goto L_0x0056
            if (r31 != 0) goto L_0x0056
            boolean r0 = r1.C
            if (r0 != 0) goto L_0x0053
            r1.p(r6)
            goto L_0x0056
        L_0x0053:
            r1.j(r6)
        L_0x0056:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r8 = "event_type"
            if (r2 != 0) goto L_0x0063
            java.lang.Object r20 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x0271 }
            r2 = r20
        L_0x0063:
            r0.put(r8, r2)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = "timestamp"
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = "user_id"
            java.lang.String r6 = r1.f3135f     // Catch:{ JSONException -> 0x026d }
            if (r6 != 0) goto L_0x0073
            java.lang.Object r6 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x026d }
        L_0x0073:
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = "device_id"
            java.lang.String r6 = r1.g     // Catch:{ JSONException -> 0x026d }
            if (r6 != 0) goto L_0x007e
            java.lang.Object r6 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x026d }
        L_0x007e:
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = "session_id"
            if (r31 == 0) goto L_0x0088
            r6 = r16
            goto L_0x008a
        L_0x0088:
            long r6 = r1.f3139l     // Catch:{ JSONException -> 0x026d }
        L_0x008a:
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = "uuid"
            java.util.UUID r6 = java.util.UUID.randomUUID()     // Catch:{ JSONException -> 0x026d }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x026d }
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x026d }
            long r6 = r1.f3140m     // Catch:{ JSONException -> 0x026d }
            r20 = 1
            long r6 = r6 + r20
            r1.f3140m = r6     // Catch:{ JSONException -> 0x026d }
            c3.m r2 = r1.f3132c     // Catch:{ JSONException -> 0x026d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ JSONException -> 0x026d }
            r2.p0(r3, r6)     // Catch:{ JSONException -> 0x026d }
            long r6 = r1.f3140m     // Catch:{ JSONException -> 0x026d }
            r0.put(r3, r6)     // Catch:{ JSONException -> 0x026d }
            c3.s r2 = r1.f3137j     // Catch:{ JSONException -> 0x026d }
            boolean r2 = r2.a(r4)     // Catch:{ JSONException -> 0x026d }
            if (r2 == 0) goto L_0x00c7
            c3.o r2 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            c3.o$a r2 = r2.b()     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = r2.f3194c     // Catch:{ JSONException -> 0x026d }
            if (r2 != 0) goto L_0x00c4
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x026d }
        L_0x00c4:
            r0.put(r4, r2)     // Catch:{ JSONException -> 0x026d }
        L_0x00c7:
            c3.s r2 = r1.f3137j     // Catch:{ JSONException -> 0x026d }
            boolean r2 = r2.a(r5)     // Catch:{ JSONException -> 0x026d }
            if (r2 == 0) goto L_0x00de
            c3.o r2 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            c3.o$a r2 = r2.b()     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = r2.f3195d     // Catch:{ JSONException -> 0x026d }
            if (r2 != 0) goto L_0x00db
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x026d }
        L_0x00db:
            r0.put(r5, r2)     // Catch:{ JSONException -> 0x026d }
        L_0x00de:
            c3.s r2 = r1.f3137j     // Catch:{ JSONException -> 0x026d }
            boolean r2 = r2.a(r15)     // Catch:{ JSONException -> 0x026d }
            if (r2 == 0) goto L_0x00f5
            c3.o r2 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            c3.o$a r2 = r2.b()     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = r2.f3196e     // Catch:{ JSONException -> 0x026d }
            if (r2 != 0) goto L_0x00f2
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x026d }
        L_0x00f2:
            r0.put(r15, r2)     // Catch:{ JSONException -> 0x026d }
        L_0x00f5:
            c3.s r2 = r1.f3137j     // Catch:{ JSONException -> 0x026d }
            boolean r2 = r2.a(r14)     // Catch:{ JSONException -> 0x026d }
            if (r2 == 0) goto L_0x010c
            c3.o r2 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            c3.o$a r2 = r2.b()     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = r2.f3197f     // Catch:{ JSONException -> 0x026d }
            if (r2 != 0) goto L_0x0109
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x026d }
        L_0x0109:
            r0.put(r14, r2)     // Catch:{ JSONException -> 0x026d }
        L_0x010c:
            c3.s r2 = r1.f3137j     // Catch:{ JSONException -> 0x026d }
            boolean r2 = r2.a(r13)     // Catch:{ JSONException -> 0x026d }
            if (r2 == 0) goto L_0x0123
            c3.o r2 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            c3.o$a r2 = r2.b()     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = r2.g     // Catch:{ JSONException -> 0x026d }
            if (r2 != 0) goto L_0x0120
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x026d }
        L_0x0120:
            r0.put(r13, r2)     // Catch:{ JSONException -> 0x026d }
        L_0x0123:
            c3.s r2 = r1.f3137j     // Catch:{ JSONException -> 0x026d }
            boolean r2 = r2.a(r12)     // Catch:{ JSONException -> 0x026d }
            if (r2 == 0) goto L_0x013a
            c3.o r2 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            c3.o$a r2 = r2.b()     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = r2.f3198h     // Catch:{ JSONException -> 0x026d }
            if (r2 != 0) goto L_0x0137
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x026d }
        L_0x0137:
            r0.put(r12, r2)     // Catch:{ JSONException -> 0x026d }
        L_0x013a:
            c3.s r2 = r1.f3137j     // Catch:{ JSONException -> 0x026d }
            boolean r2 = r2.a(r11)     // Catch:{ JSONException -> 0x026d }
            if (r2 == 0) goto L_0x0151
            c3.o r2 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            c3.o$a r2 = r2.b()     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = r2.i     // Catch:{ JSONException -> 0x026d }
            if (r2 != 0) goto L_0x014e
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x026d }
        L_0x014e:
            r0.put(r11, r2)     // Catch:{ JSONException -> 0x026d }
        L_0x0151:
            c3.s r2 = r1.f3137j     // Catch:{ JSONException -> 0x026d }
            boolean r2 = r2.a(r10)     // Catch:{ JSONException -> 0x026d }
            if (r2 == 0) goto L_0x0168
            c3.o r2 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            c3.o$a r2 = r2.b()     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = r2.f3193b     // Catch:{ JSONException -> 0x026d }
            if (r2 != 0) goto L_0x0165
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x026d }
        L_0x0165:
            r0.put(r10, r2)     // Catch:{ JSONException -> 0x026d }
        L_0x0168:
            c3.s r2 = r1.f3137j     // Catch:{ JSONException -> 0x026d }
            boolean r2 = r2.a(r9)     // Catch:{ JSONException -> 0x026d }
            if (r2 == 0) goto L_0x017f
            c3.o r2 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            c3.o$a r2 = r2.b()     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = r2.f3199j     // Catch:{ JSONException -> 0x026d }
            if (r2 != 0) goto L_0x017c
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x026d }
        L_0x017c:
            r0.put(r9, r2)     // Catch:{ JSONException -> 0x026d }
        L_0x017f:
            c3.s r2 = r1.f3137j     // Catch:{ JSONException -> 0x026d }
            r3 = r18
            boolean r2 = r2.a(r3)     // Catch:{ JSONException -> 0x026d }
            if (r2 == 0) goto L_0x018e
            java.lang.String r2 = r1.f3138k     // Catch:{ JSONException -> 0x026d }
            r0.put(r3, r2)     // Catch:{ JSONException -> 0x026d }
        L_0x018e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x026d }
            r2.<init>()     // Catch:{ JSONException -> 0x026d }
            java.lang.String r3 = "name"
            java.lang.String r4 = "amplitude-android"
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r3 = "version"
            java.lang.String r4 = "2.23.2"
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r3 = "library"
            r0.put(r3, r2)     // Catch:{ JSONException -> 0x026d }
            if (r25 != 0) goto L_0x01ae
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x026d }
            r2.<init>()     // Catch:{ JSONException -> 0x026d }
            goto L_0x01b0
        L_0x01ae:
            r2 = r25
        L_0x01b0:
            c3.s r3 = r1.f3137j     // Catch:{ JSONException -> 0x026d }
            java.lang.String r4 = "lat_lng"
            boolean r3 = r3.a(r4)     // Catch:{ JSONException -> 0x026d }
            if (r3 == 0) goto L_0x01de
            c3.o r3 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            android.location.Location r3 = r3.d()     // Catch:{ JSONException -> 0x026d }
            if (r3 == 0) goto L_0x01de
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x026d }
            r4.<init>()     // Catch:{ JSONException -> 0x026d }
            java.lang.String r5 = "lat"
            double r6 = r3.getLatitude()     // Catch:{ JSONException -> 0x026d }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r5 = "lng"
            double r6 = r3.getLongitude()     // Catch:{ JSONException -> 0x026d }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r3 = "location"
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x026d }
        L_0x01de:
            c3.s r3 = r1.f3137j     // Catch:{ JSONException -> 0x026d }
            java.lang.String r4 = "adid"
            boolean r3 = r3.a(r4)     // Catch:{ JSONException -> 0x026d }
            if (r3 == 0) goto L_0x01fb
            c3.o r3 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            java.lang.String r3 = r3.a()     // Catch:{ JSONException -> 0x026d }
            if (r3 == 0) goto L_0x01fb
            java.lang.String r3 = "androidADID"
            c3.o r4 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            java.lang.String r4 = r4.a()     // Catch:{ JSONException -> 0x026d }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x026d }
        L_0x01fb:
            java.lang.String r3 = "limit_ad_tracking"
            c3.o r4 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            c3.o$a r4 = r4.b()     // Catch:{ JSONException -> 0x026d }
            boolean r4 = r4.f3200k     // Catch:{ JSONException -> 0x026d }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r3 = "gps_enabled"
            c3.o r4 = r1.f3145r     // Catch:{ JSONException -> 0x026d }
            c3.o$a r4 = r4.b()     // Catch:{ JSONException -> 0x026d }
            boolean r4 = r4.f3201l     // Catch:{ JSONException -> 0x026d }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r3 = "api_properties"
            r0.put(r3, r2)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = "event_properties"
            r3 = r24
            if (r3 != 0) goto L_0x0226
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x026d }
            r3.<init>()     // Catch:{ JSONException -> 0x026d }
            goto L_0x022a
        L_0x0226:
            org.json.JSONObject r3 = r1.s(r3)     // Catch:{ JSONException -> 0x026d }
        L_0x022a:
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = "user_properties"
            r3 = r26
            if (r3 != 0) goto L_0x0239
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x026d }
            r3.<init>()     // Catch:{ JSONException -> 0x026d }
            goto L_0x023d
        L_0x0239:
            org.json.JSONObject r3 = r1.s(r3)     // Catch:{ JSONException -> 0x026d }
        L_0x023d:
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = "groups"
            r3 = r27
            if (r3 != 0) goto L_0x024c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x026d }
            r3.<init>()     // Catch:{ JSONException -> 0x026d }
            goto L_0x0250
        L_0x024c:
            org.json.JSONObject r3 = r1.s(r3)     // Catch:{ JSONException -> 0x026d }
        L_0x0250:
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x026d }
            java.lang.String r2 = "group_properties"
            r3 = r28
            if (r3 != 0) goto L_0x025f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x026d }
            r3.<init>()     // Catch:{ JSONException -> 0x026d }
            goto L_0x0263
        L_0x025f:
            org.json.JSONObject r3 = r1.s(r3)     // Catch:{ JSONException -> 0x026d }
        L_0x0263:
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x026d }
            r2 = r23
            long r16 = r1.m(r2, r0)     // Catch:{ JSONException -> 0x0271 }
            goto L_0x029a
        L_0x026d:
            r0 = move-exception
            r2 = r23
            goto L_0x0272
        L_0x0271:
            r0 = move-exception
        L_0x0272:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r19] = r2
            java.lang.String r4 = r0.toString()
            r5 = 1
            r3[r5] = r4
            java.lang.String r4 = "JSON Serialization of event type %s failed, skipping: %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.String r4 = "com.amplitude.api.AmplitudeClient"
            android.util.Log.e(r4, r3)
            c3.p r3 = c3.p.a()
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r19] = r2
            java.lang.String r2 = "Failed to JSON serialize event type %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r3.b(r2, r0)
        L_0x029a:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.e.e(java.lang.String, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, long, boolean):long");
    }

    public final void f(String str, JSONObject jSONObject, JSONObject jSONObject2, long j10) {
        if (jSONObject != null) {
            jSONObject = t.a(jSONObject);
        }
        JSONObject jSONObject3 = jSONObject;
        if (jSONObject2 != null) {
            jSONObject2 = t.a(jSONObject2);
        }
        k(new h(this, str, jSONObject3, (JSONObject) null, jSONObject2, (JSONObject) null, (JSONObject) null, j10));
    }

    public final Pair<Pair<Long, Long>, JSONArray> g(List<JSONObject> list, List<JSONObject> list2, long j10) throws JSONException {
        long j11;
        long j12;
        JSONArray jSONArray = new JSONArray();
        long j13 = -1;
        long j14 = -1;
        while (true) {
            if (((long) jSONArray.length()) >= j10) {
                break;
            }
            boolean isEmpty = list.isEmpty();
            boolean isEmpty2 = list2.isEmpty();
            if (isEmpty && isEmpty2) {
                Log.w("com.amplitude.api.AmplitudeClient", String.format("mergeEventsAndIdentifys: number of events and identifys less than expected by %d", new Object[]{Long.valueOf(j10 - ((long) jSONArray.length()))}));
                break;
            }
            if (isEmpty2) {
                JSONObject remove = list.remove(0);
                j11 = remove.getLong("event_id");
                jSONArray.put(remove);
            } else {
                if (isEmpty) {
                    JSONObject remove2 = list2.remove(0);
                    j12 = remove2.getLong("event_id");
                    jSONArray.put(remove2);
                } else if (!list.get(0).has("sequence_number") || list.get(0).getLong("sequence_number") < list2.get(0).getLong("sequence_number")) {
                    JSONObject remove3 = list.remove(0);
                    j11 = remove3.getLong("event_id");
                    jSONArray.put(remove3);
                } else {
                    JSONObject remove4 = list2.remove(0);
                    j12 = remove4.getLong("event_id");
                    jSONArray.put(remove4);
                }
                j14 = j12;
            }
            j13 = j11;
        }
        return new Pair<>(new Pair(Long.valueOf(j13), Long.valueOf(j14)), jSONArray);
    }

    public final void j(long j10) {
        if (d()) {
            this.f3143p = j10;
            this.f3132c.p0("last_event_time", Long.valueOf(j10));
        }
    }

    public final void k(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        u uVar = this.H;
        if (currentThread != uVar) {
            uVar.a(runnable);
        } else {
            runnable.run();
        }
    }

    public final void l(String str) {
        this.f3132c.v0("device_id", str);
        SharedPreferences.Editor edit = t.b(this.f3130a, this.f3134e).edit();
        edit.putString("device_id", str);
        edit.apply();
    }

    public final long m(String str, JSONObject jSONObject) {
        long y10;
        long O;
        long a10;
        long a11;
        String jSONObject2 = jSONObject.toString();
        if (t.c(jSONObject2)) {
            Log.e("com.amplitude.api.AmplitudeClient", String.format("Detected empty event string for event type %s, skipping", new Object[]{str}));
            return -1;
        }
        if (str.equals("$identify") || str.equals("$groupidentify")) {
            m mVar = this.f3132c;
            synchronized (mVar) {
                a10 = mVar.a("identifys", jSONObject2);
            }
            this.f3142o = a10;
            this.f3132c.p0("last_identify_id", Long.valueOf(a10));
        } else {
            m mVar2 = this.f3132c;
            synchronized (mVar2) {
                a11 = mVar2.a("events", jSONObject2);
            }
            this.f3141n = a11;
            this.f3132c.p0("last_event_id", Long.valueOf(a11));
        }
        int min = Math.min(Math.max(1, this.f3148u / 10), 20);
        if (this.f3132c.w() > ((long) this.f3148u)) {
            m mVar3 = this.f3132c;
            long j10 = (long) min;
            synchronized (mVar3) {
                O = mVar3.O("events", j10);
            }
            mVar3.A0(O);
        }
        m mVar4 = this.f3132c;
        synchronized (mVar4) {
            y10 = mVar4.y("identifys");
        }
        if (y10 > ((long) this.f3148u)) {
            m mVar5 = this.f3132c;
            mVar5.D0(mVar5.R((long) min));
        }
        long S = this.f3132c.S();
        long j11 = (long) this.f3146s;
        if (S % j11 != 0 || S < j11) {
            long j12 = this.f3149v;
            if (!this.E.getAndSet(true)) {
                u uVar = this.H;
                d dVar = new d(this);
                uVar.b();
                uVar.f3218a.postDelayed(dVar, j12);
            }
        } else {
            t();
        }
        return (str.equals("$identify") || str.equals("$groupidentify")) ? this.f3142o : this.f3141n;
    }

    public final void n(String str) {
        if (c(String.format("sendSessionEvent('%s')", new Object[]{str})) && d()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("special", str);
                e(str, (JSONObject) null, jSONObject, (JSONObject) null, (JSONObject) null, (JSONObject) null, this.f3143p, false);
            } catch (JSONException e10) {
                p.a().b(String.format("Failed to generate API Properties JSON for session event %s", new Object[]{str}), e10);
            }
        }
    }

    public final void o(long j10) {
        if (this.B) {
            n("session_end");
        }
        this.f3139l = j10;
        this.f3144q = j10;
        this.f3132c.p0("previous_session_id", Long.valueOf(j10));
        j(j10);
        if (this.B) {
            n("session_start");
        }
    }

    public final boolean p(long j10) {
        if (d()) {
            if (j10 - this.f3143p < (this.A ? this.f3150w : this.f3151x)) {
                j(j10);
                return false;
            }
            o(j10);
            return true;
        }
        if (j10 - this.f3143p < (this.A ? this.f3150w : this.f3151x)) {
            long j11 = this.f3144q;
            if (j11 == -1) {
                o(j10);
                return true;
            }
            this.f3139l = j11;
            this.f3144q = j11;
            this.f3132c.p0("previous_session_id", Long.valueOf(j11));
            j(j10);
            return false;
        }
        o(j10);
        return true;
    }

    public final JSONArray r(JSONArray jSONArray) throws JSONException {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj.getClass().equals(String.class)) {
                jSONArray.put(i10, q((String) obj));
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i10, s((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                jSONArray.put(i10, r((JSONArray) obj));
            }
        }
        return jSONArray;
    }

    public final JSONObject s(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1000) {
            Log.w("com.amplitude.api.AmplitudeClient", "Warning: too many properties (more than 1000), ignoring");
            return new JSONObject();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (!next.equals("$receipt")) {
                    if (!next.equals("$receiptSig")) {
                        if (obj.getClass().equals(String.class)) {
                            jSONObject.put(next, q((String) obj));
                        } else if (obj.getClass().equals(JSONObject.class)) {
                            jSONObject.put(next, s((JSONObject) obj));
                        } else if (obj.getClass().equals(JSONArray.class)) {
                            jSONObject.put(next, r((JSONArray) obj));
                        }
                    }
                }
                jSONObject.put(next, obj);
            } catch (JSONException e10) {
                Log.e("com.amplitude.api.AmplitudeClient", e10.toString());
            }
        }
        return jSONObject;
    }

    public final void t() {
        u(false);
        p a10 = p.a();
        if (a10.f3204a && !t.c(a10.f3205b) && a10.f3206c != null && !t.c(a10.f3207d)) {
            q qVar = new q(a10);
            Thread currentThread = Thread.currentThread();
            u uVar = a10.g;
            if (currentThread != uVar) {
                uVar.a(qVar);
            } else {
                qVar.run();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r12.F.set(false);
        android.util.Log.e("com.amplitude.api.AmplitudeClient", java.lang.String.format("Caught Cursor window exception during event upload, deferring upload: %s", new java.lang.Object[]{r13.getMessage()}));
        c3.p.a().b("Failed to update server", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b2, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        r12.F.set(false);
        android.util.Log.e("com.amplitude.api.AmplitudeClient", r13.toString());
        c3.p.a().b("Failed to update server", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(boolean r13) {
        /*
            r12 = this;
            boolean r0 = r12.i
            if (r0 != 0) goto L_0x00ca
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.F
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L_0x00ca
            c3.m r0 = r12.f3132c
            long r2 = r0.S()
            if (r13 == 0) goto L_0x0018
            int r13 = r12.z
            goto L_0x001a
        L_0x0018:
            int r13 = r12.f3147t
        L_0x001a:
            long r4 = (long) r13
            long r2 = java.lang.Math.min(r4, r2)
            r4 = 0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 0
            if (r13 > 0) goto L_0x002c
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.F
            r13.set(r0)
            return
        L_0x002c:
            c3.m r13 = r12.f3132c     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            long r8 = r12.f3141n     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            monitor-enter(r13)     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            java.lang.String r7 = "events"
            r6 = r13
            r10 = r2
            java.util.List r4 = r6.B(r7, r8, r10)     // Catch:{ all -> 0x008c }
            monitor-exit(r13)     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            c3.m r13 = r12.f3132c     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            long r8 = r12.f3142o     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            monitor-enter(r13)     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            java.lang.String r7 = "identifys"
            r6 = r13
            r10 = r2
            java.util.List r5 = r6.B(r7, r8, r10)     // Catch:{ all -> 0x0089 }
            monitor-exit(r13)     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            android.util.Pair r13 = r12.g(r4, r5, r2)     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            java.lang.Object r2 = r13.second     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            org.json.JSONArray r2 = (org.json.JSONArray) r2     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            int r2 = r2.length()     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            if (r2 != 0) goto L_0x005c
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.F     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            r13.set(r0)     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            return
        L_0x005c:
            java.lang.Object r2 = r13.first     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            java.lang.Object r2 = r2.first     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            long r6 = r2.longValue()     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            java.lang.Object r2 = r13.first     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            java.lang.Object r2 = r2.second     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            long r8 = r2.longValue()     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            java.lang.Object r13 = r13.second     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            org.json.JSONArray r13 = (org.json.JSONArray) r13     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            java.lang.String r5 = r13.toString()     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            c3.u r13 = r12.I     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            c3.e$a r2 = new c3.e$a     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            r3 = r2
            r4 = r12
            r3.<init>(r5, r6, r8)     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            r13.a(r2)     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            goto L_0x00ca
        L_0x0089:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            throw r2     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
        L_0x008c:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
            throw r2     // Catch:{ JSONException -> 0x00b2, l -> 0x008f }
        L_0x008f:
            r13 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.F
            r2.set(r0)
            java.lang.String r2 = "com.amplitude.api.AmplitudeClient"
            java.lang.String r3 = "Caught Cursor window exception during event upload, deferring upload: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r13.getMessage()
            r1[r0] = r4
            java.lang.String r0 = java.lang.String.format(r3, r1)
            android.util.Log.e(r2, r0)
            c3.p r0 = c3.p.a()
            java.lang.String r1 = "Failed to update server"
            r0.b(r1, r13)
            goto L_0x00ca
        L_0x00b2:
            r13 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.F
            r1.set(r0)
            java.lang.String r0 = "com.amplitude.api.AmplitudeClient"
            java.lang.String r1 = r13.toString()
            android.util.Log.e(r0, r1)
            c3.p r0 = c3.p.a()
            java.lang.String r1 = "Failed to update server"
            r0.b(r1, r13)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.e.u(boolean):void");
    }

    public e(String str) {
        this.f3136h = false;
        this.i = false;
        this.f3137j = new s();
        this.f3139l = -1;
        this.f3140m = 0;
        this.f3141n = -1;
        this.f3142o = -1;
        this.f3143p = -1;
        this.f3144q = -1;
        this.f3146s = 30;
        this.f3147t = 50;
        this.f3148u = 1000;
        this.f3149v = 30000;
        this.f3150w = 300000;
        this.f3151x = 1800000;
        this.f3152y = false;
        this.z = 50;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = true;
        this.E = new AtomicBoolean(false);
        this.F = new AtomicBoolean(false);
        this.G = "https://api.amplitude.com/";
        this.H = new u("logThread");
        this.I = new u("httpThread");
        this.f3134e = t.d(str);
        this.H.start();
        this.I.start();
    }
}
