package x7;

import android.content.Context;
import f8.c;
import f8.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import z7.a0;
import z7.b0;
import z7.n;
import z7.o;
import z7.p;
import z7.q;
import z7.r;

public final class a0 {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, Integer> f12886e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f12887f = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.2.10"});

    /* renamed from: a  reason: collision with root package name */
    public final Context f12888a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f12889b;

    /* renamed from: c  reason: collision with root package name */
    public final a f12890c;

    /* renamed from: d  reason: collision with root package name */
    public final c f12891d;

    static {
        HashMap hashMap = new HashMap();
        f12886e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public a0(Context context, i0 i0Var, a aVar, c cVar) {
        this.f12888a = context;
        this.f12889b = i0Var;
        this.f12890c = aVar;
        this.f12891d = cVar;
    }

    public final b0<a0.e.d.a.b.C0272a> a() {
        n.a aVar = new n.a();
        aVar.f14095a = 0L;
        aVar.f14096b = 0L;
        String str = this.f12890c.f12883d;
        Objects.requireNonNull(str, "Null name");
        aVar.f14097c = str;
        aVar.f14098d = this.f12890c.f12881b;
        return new b0<>(Arrays.asList(new a0.e.d.a.b.C0272a[]{aVar.a()}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final z7.a0.e.d.c b(int r14) {
        /*
            r13 = this;
            android.content.Context r0 = r13.f12888a
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch:{ IllegalStateException -> 0x0044 }
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch:{ IllegalStateException -> 0x0044 }
            android.content.Intent r0 = r0.registerReceiver(r2, r5)     // Catch:{ IllegalStateException -> 0x0044 }
            if (r0 == 0) goto L_0x0041
            java.lang.String r5 = "status"
            r6 = -1
            int r5 = r0.getIntExtra(r5, r6)     // Catch:{ IllegalStateException -> 0x0044 }
            if (r5 != r6) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            if (r5 == r1) goto L_0x0025
            r7 = 5
            if (r5 != r7) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r5 = r3
            goto L_0x0026
        L_0x0025:
            r5 = r4
        L_0x0026:
            java.lang.String r7 = "level"
            int r7 = r0.getIntExtra(r7, r6)     // Catch:{ IllegalStateException -> 0x003f }
            java.lang.String r8 = "scale"
            int r0 = r0.getIntExtra(r8, r6)     // Catch:{ IllegalStateException -> 0x003f }
            if (r7 == r6) goto L_0x004d
            if (r0 != r6) goto L_0x0037
            goto L_0x004d
        L_0x0037:
            float r6 = (float) r7     // Catch:{ IllegalStateException -> 0x003f }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x003f }
            float r6 = r6 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r6)     // Catch:{ IllegalStateException -> 0x003f }
            goto L_0x004e
        L_0x003f:
            r0 = move-exception
            goto L_0x0046
        L_0x0041:
            r0 = r2
            r5 = r3
            goto L_0x004e
        L_0x0044:
            r0 = move-exception
            r5 = r3
        L_0x0046:
            java.lang.String r6 = "FirebaseCrashlytics"
            java.lang.String r7 = "An error occurred getting battery state."
            android.util.Log.e(r6, r7, r0)
        L_0x004d:
            r0 = r2
        L_0x004e:
            if (r0 == 0) goto L_0x0058
            double r6 = r0.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
        L_0x0058:
            if (r5 == 0) goto L_0x006e
            if (r0 != 0) goto L_0x005d
            goto L_0x006e
        L_0x005d:
            float r0 = r0.floatValue()
            double r5 = (double) r0
            r7 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r1 = 3
            goto L_0x006f
        L_0x006e:
            r1 = r4
        L_0x006f:
            android.content.Context r0 = r13.f12888a
            boolean r5 = x7.e.j(r0)
            if (r5 == 0) goto L_0x0078
            goto L_0x0089
        L_0x0078:
            java.lang.String r5 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r5)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r5 = 8
            android.hardware.Sensor r0 = r0.getDefaultSensor(r5)
            if (r0 == 0) goto L_0x0089
            r3 = r4
        L_0x0089:
            long r4 = x7.e.h()
            android.content.Context r0 = r13.f12888a
            android.app.ActivityManager$MemoryInfo r6 = new android.app.ActivityManager$MemoryInfo
            r6.<init>()
            java.lang.String r7 = "activity"
            java.lang.Object r0 = r0.getSystemService(r7)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r0.getMemoryInfo(r6)
            long r6 = r6.availMem
            long r4 = r4 - r6
            java.io.File r0 = android.os.Environment.getDataDirectory()
            java.lang.String r0 = r0.getPath()
            android.os.StatFs r6 = new android.os.StatFs
            r6.<init>(r0)
            int r0 = r6.getBlockSize()
            long r7 = (long) r0
            int r0 = r6.getBlockCount()
            long r9 = (long) r0
            long r9 = r9 * r7
            int r0 = r6.getAvailableBlocks()
            long r11 = (long) r0
            long r7 = r7 * r11
            long r9 = r9 - r7
            z7.s$a r0 = new z7.s$a
            r0.<init>()
            r0.f14137a = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f14138b = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.f14139c = r1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.f14140d = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r4)
            r0.f14141e = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            r0.f14142f = r14
            z7.a0$e$d$c r14 = r0.a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.a0.b(int):z7.a0$e$d$c");
    }

    public final a0.e.d.a.b.C0274b c(d dVar, int i) {
        String str = dVar.f5016b;
        String str2 = dVar.f5015a;
        StackTraceElement[] stackTraceElementArr = dVar.f5017c;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        d dVar2 = dVar.f5018d;
        if (i >= 8) {
            d dVar3 = dVar2;
            while (dVar3 != null) {
                dVar3 = dVar3.f5018d;
                i10++;
            }
        }
        o.b bVar = new o.b();
        Objects.requireNonNull(str, "Null type");
        bVar.f14104a = str;
        bVar.f14105b = str2;
        bVar.f14106c = new b0<>(d(stackTraceElementArr, 4));
        bVar.f14108e = Integer.valueOf(i10);
        if (dVar2 != null && i10 == 0) {
            bVar.f14107d = c(dVar2, i + 1);
        }
        return bVar.a();
    }

    public final b0<a0.e.d.a.b.C0277d.C0279b> d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            r.a aVar = new r.a();
            aVar.f14130e = Integer.valueOf(i);
            long j10 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = (long) stackTraceElement.getLineNumber();
            }
            aVar.f14126a = Long.valueOf(max);
            Objects.requireNonNull(str, "Null symbol");
            aVar.f14127b = str;
            aVar.f14128c = fileName;
            aVar.f14129d = Long.valueOf(j10);
            arrayList.add(aVar.a());
        }
        return new b0<>(arrayList);
    }

    public final a0.e.d.a.b.c e() {
        p.a aVar = new p.a();
        aVar.f14112a = "0";
        aVar.f14113b = "0";
        aVar.f14114c = 0L;
        return aVar.a();
    }

    public final a0.e.d.a.b.C0277d f(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        q.b bVar = new q.b();
        String name = thread.getName();
        Objects.requireNonNull(name, "Null name");
        bVar.f14118a = name;
        bVar.f14119b = Integer.valueOf(i);
        bVar.f14120c = new b0<>(d(stackTraceElementArr, i));
        return bVar.a();
    }
}
