package ba;

public final class a implements hi.a {
    public final int a(xd.a<Integer> aVar) {
        try {
            return aVar.c().intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b3, code lost:
        if (r5 == null) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03d9, code lost:
        if (r3 == null) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04d6, code lost:
        if (r3 == null) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
        if (r3 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0421 A[Catch:{ Exception -> 0x042f }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0426 A[Catch:{ Exception -> 0x042f }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0042 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012d A[Catch:{ Exception -> 0x013b }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0132 A[Catch:{ Exception -> 0x013b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<ji.j> b(io.nodle.sdk.NodleContext r15) {
        /*
            r14 = this;
            java.lang.String r0 = "ctx"
            e6.e.D(r15, r0)
            m2.a r0 = r15.getSdkConfig()
            a9.c r0 = (a9.c) r0
            java.util.Objects.requireNonNull(r0)
            a5.n r1 = new a5.n
            java.lang.String r2 = "CellScanner"
            r1.<init>(r2, r0)
            io.sentry.Sentry.configureScope(r1)
            ac.a r15 = (ac.a) r15
            android.content.Context r0 = r15.f289a
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 == 0) goto L_0x057d
            android.content.Context r15 = r15.f289a
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            int r15 = d0.a.a(r15, r1)
            if (r15 != 0) goto L_0x057d
            java.util.List r15 = r0.getAllCellInfo()
            java.lang.String r0 = "manager.allCellInfo"
            e6.e.C(r15, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r15 = r15.iterator()
        L_0x0042:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x057c
            java.lang.Object r1 = r15.next()
            android.telephony.CellInfo r1 = (android.telephony.CellInfo) r1
            boolean r2 = r1 instanceof android.telephony.CellInfoGsm
            r3 = 2
            java.lang.String r4 = "cell.cellIdentity"
            java.lang.String r5 = "cell.cellSignalStrength"
            java.lang.String r6 = "it"
            r7 = 1
            r8 = 29
            r9 = 24
            r10 = 28
            java.lang.String r11 = ""
            r12 = 0
            if (r2 == 0) goto L_0x0160
            e6.e.C(r1, r6)
            android.telephony.CellInfoGsm r1 = (android.telephony.CellInfoGsm) r1
            android.telephony.CellSignalStrengthGsm r2 = r1.getCellSignalStrength()
            e6.e.C(r2, r5)
            android.telephony.CellIdentityGsm r1 = r1.getCellIdentity()
            e6.e.C(r1, r4)
            ji.j$a r4 = ji.j.r()
            ji.f r5 = ji.f.A
            zb.r$a r5 = r5.c()
            ji.f$a r5 = (ji.f.a) r5
            int r6 = r1.getLac()     // Catch:{ Exception -> 0x008f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x008f }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x008f }
            goto L_0x0090
        L_0x008f:
            r6 = r12
        L_0x0090:
            r5.k()
            MessageType r13 = r5.f14359b
            ji.f r13 = (ji.f) r13
            r13.f7291s = r6
            int r6 = r1.getCid()     // Catch:{ Exception -> 0x00a6 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00a6 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00a7
        L_0x00a6:
            r6 = r12
        L_0x00a7:
            r5.k()
            MessageType r13 = r5.f14359b
            ji.f r13 = (ji.f) r13
            r13.f7292t = r6
            s9.d r6 = new s9.d
            r6.<init>(r1, r3)
            int r3 = r14.a(r6)
            r5.k()
            MessageType r6 = r5.f14359b
            ji.f r6 = (ji.f) r6
            r6.f7293u = r3
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00d5 }
            if (r3 <= r9) goto L_0x00cb
            int r3 = r1.getBsic()     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00cc
        L_0x00cb:
            r3 = r12
        L_0x00cc:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00d5 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00d6
        L_0x00d5:
            r3 = r12
        L_0x00d6:
            r5.k()
            MessageType r6 = r5.f14359b
            ji.f r6 = (ji.f) r6
            r6.f7294v = r3
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00eb }
            if (r3 <= r10) goto L_0x00e8
            java.lang.String r3 = r1.getMccString()     // Catch:{ Exception -> 0x00eb }
            goto L_0x00e9
        L_0x00e8:
            r3 = r11
        L_0x00e9:
            if (r3 != 0) goto L_0x00ec
        L_0x00eb:
            r3 = r11
        L_0x00ec:
            r5.k()
            MessageType r6 = r5.f14359b
            ji.f r6 = (ji.f) r6
            java.util.Objects.requireNonNull(r6)
            r6.f7295w = r3
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0106 }
            if (r3 <= r10) goto L_0x0101
            java.lang.String r1 = r1.getMncString()     // Catch:{ Exception -> 0x0106 }
            goto L_0x0102
        L_0x0101:
            r1 = r11
        L_0x0102:
            if (r1 != 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r11 = r1
        L_0x0106:
            r5.k()
            MessageType r1 = r5.f14359b
            ji.f r1 = (ji.f) r1
            java.util.Objects.requireNonNull(r1)
            r1.f7296x = r11
            int r1 = r2.getDbm()     // Catch:{ Exception -> 0x011f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x011f }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x011f }
            goto L_0x0120
        L_0x011f:
            r1 = r12
        L_0x0120:
            r5.k()
            MessageType r3 = r5.f14359b
            ji.f r3 = (ji.f) r3
            r3.f7297y = r1
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x013b }
            if (r1 <= r8) goto L_0x0132
            int r1 = r2.getBitErrorRate()     // Catch:{ Exception -> 0x013b }
            goto L_0x0133
        L_0x0132:
            r1 = r12
        L_0x0133:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x013b }
            int r12 = r1.intValue()     // Catch:{ Exception -> 0x013b }
        L_0x013b:
            r5.k()
            MessageType r1 = r5.f14359b
            ji.f r1 = (ji.f) r1
            r1.z = r12
            zb.r r1 = r5.i()
            ji.f r1 = (ji.f) r1
            r4.k()
            MessageType r2 = r4.f14359b
            ji.j r2 = (ji.j) r2
            java.util.Objects.requireNonNull(r2)
            r2.f7322t = r1
            r2.f7321s = r7
            zb.r r1 = r4.i()
            ji.j r1 = (ji.j) r1
            goto L_0x0573
        L_0x0160:
            boolean r2 = r1 instanceof android.telephony.CellInfoCdma
            if (r2 == 0) goto L_0x0224
            e6.e.C(r1, r6)
            android.telephony.CellInfoCdma r1 = (android.telephony.CellInfoCdma) r1
            android.telephony.CellSignalStrengthCdma r2 = r1.getCellSignalStrength()
            e6.e.C(r2, r5)
            android.telephony.CellIdentityCdma r1 = r1.getCellIdentity()
            e6.e.C(r1, r4)
            ji.j$a r4 = ji.j.r()
            ji.e r5 = ji.e.f7284y
            zb.r$a r5 = r5.c()
            ji.e$a r5 = (ji.e.a) r5
            s9.d r6 = new s9.d
            r6.<init>(r1, r7)
            int r6 = r14.a(r6)
            r5.k()
            MessageType r7 = r5.f14359b
            ji.e r7 = (ji.e) r7
            r7.f7285s = r6
            int r6 = r1.getNetworkId()     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ Exception -> 0x01a4 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01a5
        L_0x01a4:
            r6 = r12
        L_0x01a5:
            r5.k()
            MessageType r7 = r5.f14359b
            ji.e r7 = (ji.e) r7
            r7.f7286t = r6
            int r1 = r1.getBasestationId()     // Catch:{ Exception -> 0x01bb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01bb }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01bb }
            goto L_0x01bc
        L_0x01bb:
            r1 = r12
        L_0x01bc:
            r5.k()
            MessageType r6 = r5.f14359b
            ji.e r6 = (ji.e) r6
            r6.f7287u = r1
            int r1 = r2.getCdmaEcio()     // Catch:{ Exception -> 0x01d2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01d2 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01d2 }
            goto L_0x01d3
        L_0x01d2:
            r1 = r12
        L_0x01d3:
            r5.k()
            MessageType r6 = r5.f14359b
            ji.e r6 = (ji.e) r6
            r6.f7288v = r1
            int r1 = r2.getDbm()     // Catch:{ Exception -> 0x01e9 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01e9 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01e9 }
            goto L_0x01ea
        L_0x01e9:
            r1 = r12
        L_0x01ea:
            r5.k()
            MessageType r6 = r5.f14359b
            ji.e r6 = (ji.e) r6
            r6.f7289w = r1
            int r1 = r2.getEvdoSnr()     // Catch:{ Exception -> 0x01ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01ff }
            int r12 = r1.intValue()     // Catch:{ Exception -> 0x01ff }
        L_0x01ff:
            r5.k()
            MessageType r1 = r5.f14359b
            ji.e r1 = (ji.e) r1
            r1.f7290x = r12
            zb.r r1 = r5.i()
            ji.e r1 = (ji.e) r1
            r4.k()
            MessageType r2 = r4.f14359b
            ji.j r2 = (ji.j) r2
            java.util.Objects.requireNonNull(r2)
            r2.f7322t = r1
            r2.f7321s = r3
            zb.r r1 = r4.i()
            ji.j r1 = (ji.j) r1
            goto L_0x0573
        L_0x0224:
            boolean r2 = r1 instanceof android.telephony.CellInfoWcdma
            if (r2 == 0) goto L_0x0319
            e6.e.C(r1, r6)
            android.telephony.CellInfoWcdma r1 = (android.telephony.CellInfoWcdma) r1
            android.telephony.CellSignalStrengthWcdma r2 = r1.getCellSignalStrength()
            e6.e.C(r2, r5)
            android.telephony.CellIdentityWcdma r1 = r1.getCellIdentity()
            e6.e.C(r1, r4)
            ji.j$a r3 = ji.j.r()
            ji.i r4 = ji.i.A
            zb.r$a r4 = r4.c()
            ji.i$a r4 = (ji.i.a) r4
            int r5 = r1.getLac()     // Catch:{ Exception -> 0x0254 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0254 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0254 }
            goto L_0x0255
        L_0x0254:
            r5 = r12
        L_0x0255:
            r4.k()
            MessageType r6 = r4.f14359b
            ji.i r6 = (ji.i) r6
            r6.f7312s = r5
            int r5 = r1.getCid()     // Catch:{ Exception -> 0x026b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x026b }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x026b }
            goto L_0x026c
        L_0x026b:
            r5 = r12
        L_0x026c:
            r4.k()
            MessageType r6 = r4.f14359b
            ji.i r6 = (ji.i) r6
            r6.f7313t = r5
            int r5 = r1.getPsc()     // Catch:{ Exception -> 0x0282 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0282 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0282 }
            goto L_0x0283
        L_0x0282:
            r5 = r12
        L_0x0283:
            r4.k()
            MessageType r6 = r4.f14359b
            ji.i r6 = (ji.i) r6
            r6.f7314u = r5
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x029f }
            if (r5 <= r9) goto L_0x0295
            int r5 = r1.getUarfcn()     // Catch:{ Exception -> 0x029f }
            goto L_0x0296
        L_0x0295:
            r5 = r12
        L_0x0296:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x029f }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x029f }
            goto L_0x02a0
        L_0x029f:
            r5 = r12
        L_0x02a0:
            r4.k()
            MessageType r6 = r4.f14359b
            ji.i r6 = (ji.i) r6
            r6.f7315v = r5
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02b5 }
            if (r5 <= r10) goto L_0x02b2
            java.lang.String r5 = r1.getMccString()     // Catch:{ Exception -> 0x02b5 }
            goto L_0x02b3
        L_0x02b2:
            r5 = r11
        L_0x02b3:
            if (r5 != 0) goto L_0x02b6
        L_0x02b5:
            r5 = r11
        L_0x02b6:
            r4.k()
            MessageType r6 = r4.f14359b
            ji.i r6 = (ji.i) r6
            java.util.Objects.requireNonNull(r6)
            r6.f7316w = r5
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02d0 }
            if (r5 <= r10) goto L_0x02cb
            java.lang.String r1 = r1.getMncString()     // Catch:{ Exception -> 0x02d0 }
            goto L_0x02cc
        L_0x02cb:
            r1 = r11
        L_0x02cc:
            if (r1 != 0) goto L_0x02cf
            goto L_0x02d0
        L_0x02cf:
            r11 = r1
        L_0x02d0:
            r4.k()
            MessageType r1 = r4.f14359b
            ji.i r1 = (ji.i) r1
            java.util.Objects.requireNonNull(r1)
            r1.f7317x = r11
            int r1 = r2.getDbm()     // Catch:{ Exception -> 0x02e9 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x02e9 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x02e9 }
            goto L_0x02ea
        L_0x02e9:
            r1 = r12
        L_0x02ea:
            r4.k()
            MessageType r2 = r4.f14359b
            ji.i r2 = (ji.i) r2
            r2.f7318y = r1
            r4.k()
            MessageType r1 = r4.f14359b
            ji.i r1 = (ji.i) r1
            r1.z = r12
            zb.r r1 = r4.i()
            ji.i r1 = (ji.i) r1
            r3.k()
            MessageType r2 = r3.f14359b
            ji.j r2 = (ji.j) r2
            java.util.Objects.requireNonNull(r2)
            r2.f7322t = r1
            r1 = 3
            r2.f7321s = r1
            zb.r r1 = r3.i()
            ji.j r1 = (ji.j) r1
            goto L_0x0573
        L_0x0319:
            boolean r2 = r1 instanceof android.telephony.CellInfoLte
            java.lang.String r3 = "info.bands"
            if (r2 == 0) goto L_0x0455
            e6.e.C(r1, r6)
            android.telephony.CellInfoLte r1 = (android.telephony.CellInfoLte) r1
            android.telephony.CellSignalStrengthLte r2 = r1.getCellSignalStrength()
            e6.e.C(r2, r5)
            android.telephony.CellIdentityLte r1 = r1.getCellIdentity()
            e6.e.C(r1, r4)
            ji.j$a r4 = ji.j.r()
            ji.g r5 = ji.g.B
            zb.r$a r5 = r5.c()
            ji.g$a r5 = (ji.g.a) r5
            int r6 = r1.getCi()     // Catch:{ Exception -> 0x034b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x034b }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x034b }
            goto L_0x034c
        L_0x034b:
            r6 = r12
        L_0x034c:
            r5.k()
            MessageType r7 = r5.f14359b
            ji.g r7 = (ji.g) r7
            r7.f7298s = r6
            int r6 = r1.getPci()     // Catch:{ Exception -> 0x0362 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0362 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0362 }
            goto L_0x0363
        L_0x0362:
            r6 = r12
        L_0x0363:
            r5.k()
            MessageType r7 = r5.f14359b
            ji.g r7 = (ji.g) r7
            r7.f7299t = r6
            int r6 = r1.getTac()     // Catch:{ Exception -> 0x0379 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0379 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0379 }
            goto L_0x037a
        L_0x0379:
            r6 = r12
        L_0x037a:
            r5.k()
            MessageType r7 = r5.f14359b
            ji.g r7 = (ji.g) r7
            r7.f7300u = r6
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0396 }
            if (r6 <= r9) goto L_0x038c
            int r6 = r1.getEarfcn()     // Catch:{ Exception -> 0x0396 }
            goto L_0x038d
        L_0x038c:
            r6 = r12
        L_0x038d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0396 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0396 }
            goto L_0x0397
        L_0x0396:
            r6 = r12
        L_0x0397:
            r5.k()
            MessageType r7 = r5.f14359b
            ji.g r7 = (ji.g) r7
            r7.f7301v = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r6 <= r7) goto L_0x03b2
            int[] r6 = r1.getBands()
            e6.e.C(r6, r3)
            java.util.List r3 = nd.f.R(r6)
            goto L_0x03b4
        L_0x03b2:
            nd.o r3 = nd.o.f8966a
        L_0x03b4:
            r5.k()
            MessageType r6 = r5.f14359b
            ji.g r6 = (ji.g) r6
            zb.t$b r7 = r6.f7302w
            r8 = r7
            zb.d r8 = (zb.d) r8
            boolean r8 = r8.f14277a
            if (r8 != 0) goto L_0x03ca
            zb.t$b r7 = zb.r.j(r7)
            r6.f7302w = r7
        L_0x03ca:
            zb.t$b r6 = r6.f7302w
            zb.a.d(r3, r6)
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x03db }
            if (r3 <= r10) goto L_0x03d8
            java.lang.String r3 = r1.getMccString()     // Catch:{ Exception -> 0x03db }
            goto L_0x03d9
        L_0x03d8:
            r3 = r11
        L_0x03d9:
            if (r3 != 0) goto L_0x03dc
        L_0x03db:
            r3 = r11
        L_0x03dc:
            r5.k()
            MessageType r6 = r5.f14359b
            ji.g r6 = (ji.g) r6
            java.util.Objects.requireNonNull(r6)
            r6.f7303x = r3
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x03f6 }
            if (r3 <= r10) goto L_0x03f1
            java.lang.String r1 = r1.getMncString()     // Catch:{ Exception -> 0x03f6 }
            goto L_0x03f2
        L_0x03f1:
            r1 = r11
        L_0x03f2:
            if (r1 != 0) goto L_0x03f5
            goto L_0x03f6
        L_0x03f5:
            r11 = r1
        L_0x03f6:
            r5.k()
            MessageType r1 = r5.f14359b
            ji.g r1 = (ji.g) r1
            java.util.Objects.requireNonNull(r1)
            r1.f7304y = r11
            int r1 = r2.getDbm()     // Catch:{ Exception -> 0x0411 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0411 }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ Exception -> 0x0411 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0411 }
            goto L_0x0412
        L_0x0411:
            r1 = r12
        L_0x0412:
            r5.k()
            MessageType r3 = r5.f14359b
            ji.g r3 = (ji.g) r3
            r3.z = r1
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x042f }
            r3 = 26
            if (r1 <= r3) goto L_0x0426
            int r1 = r2.getRssnr()     // Catch:{ Exception -> 0x042f }
            goto L_0x0427
        L_0x0426:
            r1 = r12
        L_0x0427:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x042f }
            int r12 = r1.intValue()     // Catch:{ Exception -> 0x042f }
        L_0x042f:
            r5.k()
            MessageType r1 = r5.f14359b
            ji.g r1 = (ji.g) r1
            r1.A = r12
            zb.r r1 = r5.i()
            ji.g r1 = (ji.g) r1
            r4.k()
            MessageType r2 = r4.f14359b
            ji.j r2 = (ji.j) r2
            java.util.Objects.requireNonNull(r2)
            r2.f7322t = r1
            r1 = 4
            r2.f7321s = r1
            zb.r r1 = r4.i()
            ji.j r1 = (ji.j) r1
            goto L_0x0573
        L_0x0455:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 <= r8) goto L_0x0572
            boolean r4 = r1 instanceof android.telephony.CellInfoNr
            if (r4 == 0) goto L_0x0572
            android.telephony.CellInfoNr r1 = (android.telephony.CellInfoNr) r1
            java.lang.String r4 = "cell"
            e6.e.D(r1, r4)
            if (r2 <= r8) goto L_0x0572
            android.telephony.CellSignalStrength r2 = r1.getCellSignalStrength()
            android.telephony.CellSignalStrengthNr r2 = (android.telephony.CellSignalStrengthNr) r2
            android.telephony.CellIdentity r1 = r1.getCellIdentity()
            android.telephony.CellIdentityNr r1 = (android.telephony.CellIdentityNr) r1
            ji.j$a r4 = ji.j.r()
            ji.h r5 = ji.h.B
            zb.r$a r5 = r5.c()
            ji.h$a r5 = (ji.h.a) r5
            int r6 = r1.getTac()     // Catch:{ Exception -> 0x048b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x048b }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x048b }
            goto L_0x048c
        L_0x048b:
            r6 = r12
        L_0x048c:
            r5.k()
            MessageType r7 = r5.f14359b
            ji.h r7 = (ji.h) r7
            r7.f7305s = r6
            int r6 = r1.getNrarfcn()     // Catch:{ Exception -> 0x04a2 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x04a2 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x04a2 }
            goto L_0x04a3
        L_0x04a2:
            r6 = r12
        L_0x04a3:
            r5.k()
            MessageType r7 = r5.f14359b
            ji.h r7 = (ji.h) r7
            r7.f7306t = r6
            int[] r6 = r1.getBands()
            e6.e.C(r6, r3)
            java.util.List r3 = nd.f.R(r6)
            r5.k()
            MessageType r6 = r5.f14359b
            ji.h r6 = (ji.h) r6
            zb.t$b r7 = r6.f7307u
            r8 = r7
            zb.d r8 = (zb.d) r8
            boolean r8 = r8.f14277a
            if (r8 != 0) goto L_0x04cd
            zb.t$b r7 = zb.r.j(r7)
            r6.f7307u = r7
        L_0x04cd:
            zb.t$b r6 = r6.f7307u
            zb.a.d(r3, r6)
            java.lang.String r3 = r1.getMccString()     // Catch:{ Exception -> 0x04d8 }
            if (r3 != 0) goto L_0x04d9
        L_0x04d8:
            r3 = r11
        L_0x04d9:
            r5.k()
            MessageType r6 = r5.f14359b
            ji.h r6 = (ji.h) r6
            java.util.Objects.requireNonNull(r6)
            r6.f7308v = r3
            java.lang.String r3 = r1.getMncString()     // Catch:{ Exception -> 0x04ed }
            if (r3 != 0) goto L_0x04ec
            goto L_0x04ed
        L_0x04ec:
            r11 = r3
        L_0x04ed:
            r5.k()
            MessageType r3 = r5.f14359b
            ji.h r3 = (ji.h) r3
            java.util.Objects.requireNonNull(r3)
            r3.f7309w = r11
            int r3 = r1.getPci()     // Catch:{ Exception -> 0x0506 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0506 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0506 }
            goto L_0x0507
        L_0x0506:
            r3 = r12
        L_0x0507:
            r5.k()
            MessageType r6 = r5.f14359b
            ji.h r6 = (ji.h) r6
            r6.f7310x = r3
            long r6 = r1.getNci()     // Catch:{ Exception -> 0x051d }
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x051d }
            long r6 = r1.longValue()     // Catch:{ Exception -> 0x051d }
            goto L_0x051f
        L_0x051d:
            r6 = 0
        L_0x051f:
            r5.k()
            MessageType r1 = r5.f14359b
            ji.h r1 = (ji.h) r1
            r1.f7311y = r6
            int r1 = r2.getDbm()     // Catch:{ Exception -> 0x0537 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0537 }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ Exception -> 0x0537 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0537 }
            goto L_0x0538
        L_0x0537:
            r1 = r12
        L_0x0538:
            r5.k()
            MessageType r3 = r5.f14359b
            ji.h r3 = (ji.h) r3
            r3.z = r1
            int r1 = r2.getSsSinr()     // Catch:{ Exception -> 0x054d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x054d }
            int r12 = r1.intValue()     // Catch:{ Exception -> 0x054d }
        L_0x054d:
            r5.k()
            MessageType r1 = r5.f14359b
            ji.h r1 = (ji.h) r1
            r1.A = r12
            zb.r r1 = r5.i()
            ji.h r1 = (ji.h) r1
            r4.k()
            MessageType r2 = r4.f14359b
            ji.j r2 = (ji.j) r2
            java.util.Objects.requireNonNull(r2)
            r2.f7322t = r1
            r1 = 5
            r2.f7321s = r1
            zb.r r1 = r4.i()
            ji.j r1 = (ji.j) r1
            goto L_0x0573
        L_0x0572:
            r1 = 0
        L_0x0573:
            if (r1 != 0) goto L_0x0577
            goto L_0x0042
        L_0x0577:
            r0.add(r1)
            goto L_0x0042
        L_0x057c:
            return r0
        L_0x057d:
            nd.o r15 = nd.o.f8966a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.a.b(io.nodle.sdk.NodleContext):java.util.List");
    }
}
