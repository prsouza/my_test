package d2;

import android.os.Build;
import u1.q;
import u1.t;
import u1.v;

public final class u {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4322a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f4323b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f4324c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f4325d;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|(2:19|20)|21|23|24|25|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|(2:19|20)|21|23|24|25|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ad */
        static {
            /*
                u1.t[] r0 = u1.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4325d = r0
                r1 = 1
                u1.t r2 = u1.t.RUN_AS_NON_EXPEDITED_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4325d     // Catch:{ NoSuchFieldError -> 0x001d }
                u1.t r3 = u1.t.DROP_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                u1.q[] r2 = u1.q.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f4324c = r2
                u1.q r3 = u1.q.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f4324c     // Catch:{ NoSuchFieldError -> 0x0038 }
                u1.q r3 = u1.q.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f4324c     // Catch:{ NoSuchFieldError -> 0x0043 }
                u1.q r4 = u1.q.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                r3 = 4
                int[] r4 = f4324c     // Catch:{ NoSuchFieldError -> 0x004e }
                u1.q r5 = u1.q.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                r4 = 5
                int[] r5 = f4324c     // Catch:{ NoSuchFieldError -> 0x0059 }
                u1.q r6 = u1.q.METERED     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                u1.a[] r5 = u1.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f4323b = r5
                u1.a r6 = u1.a.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x006a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r5 = f4323b     // Catch:{ NoSuchFieldError -> 0x0074 }
                u1.a r6 = u1.a.LINEAR     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                u1.v[] r5 = u1.v.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f4322a = r5
                u1.v r6 = u1.v.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r1 = f4322a     // Catch:{ NoSuchFieldError -> 0x008f }
                u1.v r5 = u1.v.RUNNING     // Catch:{ NoSuchFieldError -> 0x008f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f4322a     // Catch:{ NoSuchFieldError -> 0x0099 }
                u1.v r1 = u1.v.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = f4322a     // Catch:{ NoSuchFieldError -> 0x00a3 }
                u1.v r1 = u1.v.FAILED     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = f4322a     // Catch:{ NoSuchFieldError -> 0x00ad }
                u1.v r1 = u1.v.BLOCKED     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = f4322a     // Catch:{ NoSuchFieldError -> 0x00b8 }
                u1.v r1 = u1.v.CANCELLED     // Catch:{ NoSuchFieldError -> 0x00b8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b8 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b8 }
            L_0x00b8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d2.u.a.<clinit>():void");
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.HashSet, java.util.Set<u1.d$a>] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a A[SYNTHETIC, Splitter:B:23:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f A[SYNTHETIC, Splitter:B:34:0x005f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static u1.d a(byte[] r7) {
        /*
            u1.d r0 = new u1.d
            r0.<init>()
            if (r7 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0041, all -> 0x003f }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0041, all -> 0x003f }
            int r7 = r2.readInt()     // Catch:{ IOException -> 0x003d }
        L_0x0017:
            if (r7 <= 0) goto L_0x0032
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x003d }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x003d }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x003d }
            u1.d$a r5 = new u1.d$a     // Catch:{ IOException -> 0x003d }
            r5.<init>(r3, r4)     // Catch:{ IOException -> 0x003d }
            java.util.Set<u1.d$a> r3 = r0.f11637a     // Catch:{ IOException -> 0x003d }
            r3.add(r5)     // Catch:{ IOException -> 0x003d }
            int r7 = r7 + -1
            goto L_0x0017
        L_0x0032:
            r2.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x0052
        L_0x0036:
            r7 = move-exception
            r7.printStackTrace()
            goto L_0x0052
        L_0x003b:
            r7 = move-exception
            goto L_0x005b
        L_0x003d:
            r7 = move-exception
            goto L_0x0045
        L_0x003f:
            r0 = move-exception
            goto L_0x005d
        L_0x0041:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L_0x0045:
            r7.printStackTrace()     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0052:
            r1.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r7 = move-exception
            r7.printStackTrace()
        L_0x005a:
            return r0
        L_0x005b:
            r0 = r7
            r7 = r2
        L_0x005d:
            if (r7 == 0) goto L_0x0067
            r7.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0067:
            r1.close()     // Catch:{ IOException -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r7 = move-exception
            r7.printStackTrace()
        L_0x006f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.u.a(byte[]):u1.d");
    }

    public static u1.a b(int i) {
        if (i == 0) {
            return u1.a.EXPONENTIAL;
        }
        if (i == 1) {
            return u1.a.LINEAR;
        }
        throw new IllegalArgumentException(a8.a.b("Could not convert ", i, " to BackoffPolicy"));
    }

    public static q c(int i) {
        if (i == 0) {
            return q.NOT_REQUIRED;
        }
        if (i == 1) {
            return q.CONNECTED;
        }
        if (i == 2) {
            return q.UNMETERED;
        }
        if (i == 3) {
            return q.NOT_ROAMING;
        }
        if (i == 4) {
            return q.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return q.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException(a8.a.b("Could not convert ", i, " to NetworkType"));
    }

    public static t d(int i) {
        if (i == 0) {
            return t.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return t.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(a8.a.b("Could not convert ", i, " to OutOfQuotaPolicy"));
    }

    public static v e(int i) {
        if (i == 0) {
            return v.ENQUEUED;
        }
        if (i == 1) {
            return v.RUNNING;
        }
        if (i == 2) {
            return v.SUCCEEDED;
        }
        if (i == 3) {
            return v.FAILED;
        }
        if (i == 4) {
            return v.BLOCKED;
        }
        if (i == 5) {
            return v.CANCELLED;
        }
        throw new IllegalArgumentException(a8.a.b("Could not convert ", i, " to State"));
    }

    public static int f(v vVar) {
        switch (a.f4322a[vVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + vVar + " to int");
        }
    }
}
