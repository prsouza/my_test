package z4;

import t4.q;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f13825a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f13826b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13827c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Runnable f13828s;

    public /* synthetic */ n(o oVar, q qVar, int i, Runnable runnable) {
        this.f13825a = oVar;
        this.f13826b = qVar;
        this.f13827c = i;
        this.f13828s = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.f13832d.b(r1, r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            z4.o r0 = r8.f13825a
            t4.q r1 = r8.f13826b
            int r2 = r8.f13827c
            java.lang.Runnable r3 = r8.f13828s
            java.util.Objects.requireNonNull(r0)
            r4 = 1
            b5.b r5 = r0.f13834f     // Catch:{ a -> 0x0047 }
            a5.d r6 = r0.f13831c     // Catch:{ a -> 0x0047 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ a -> 0x0047 }
            h1.d0 r7 = new h1.d0     // Catch:{ a -> 0x0047 }
            r7.<init>(r6, r4)     // Catch:{ a -> 0x0047 }
            r5.a(r7)     // Catch:{ a -> 0x0047 }
            android.content.Context r5 = r0.f13829a     // Catch:{ a -> 0x0047 }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ a -> 0x0047 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ a -> 0x0047 }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ a -> 0x0047 }
            if (r5 == 0) goto L_0x0033
            boolean r5 = r5.isConnected()     // Catch:{ a -> 0x0047 }
            if (r5 == 0) goto L_0x0033
            r5 = r4
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r5 != 0) goto L_0x0041
            b5.b r5 = r0.f13834f     // Catch:{ a -> 0x0047 }
            z4.l r6 = new z4.l     // Catch:{ a -> 0x0047 }
            r6.<init>(r0, r1, r2)     // Catch:{ a -> 0x0047 }
            r5.a(r6)     // Catch:{ a -> 0x0047 }
            goto L_0x004d
        L_0x0041:
            r0.a(r1, r2)     // Catch:{ a -> 0x0047 }
            goto L_0x004d
        L_0x0045:
            r0 = move-exception
            goto L_0x0051
        L_0x0047:
            z4.u r0 = r0.f13832d     // Catch:{ all -> 0x0045 }
            int r2 = r2 + r4
            r0.b(r1, r2)     // Catch:{ all -> 0x0045 }
        L_0x004d:
            r3.run()
            return
        L_0x0051:
            r3.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.n.run():void");
    }
}
