package y9;

import ah.v;
import android.bluetooth.le.BluetoothLeScanner;
import android.os.Build;
import bf.b;
import c3.k;
import io.nodle.sdk.NodleContext;
import md.m;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yd.h;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Logger f13557a = LoggerFactory.getLogger((Class<?>) d.class);

    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NodleContext f13558a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f13559b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ BluetoothLeScanner f13560c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f13561d;

        /* renamed from: y9.d$a$a  reason: collision with other inner class name */
        public static final class C0261a extends h implements xd.a<m> {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ NodleContext f13562b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ d f13563c;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ BluetoothLeScanner f13564s;

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ a f13565t;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0261a(NodleContext nodleContext, d dVar, BluetoothLeScanner bluetoothLeScanner, a aVar) {
                super(0);
                this.f13562b = nodleContext;
                this.f13563c = dVar;
                this.f13564s = bluetoothLeScanner;
                this.f13565t = aVar;
            }

            public final Object c() {
                if (Build.VERSION.SDK_INT < 31 || v.C(k.n(this.f13562b), "android.permission.BLUETOOTH_SCAN") == 0) {
                    this.f13563c.f13557a.debug("stopping BluetoothLE");
                    this.f13564s.stopScan(this.f13565t);
                } else {
                    this.f13563c.f13557a.debug("failed to stop scan BLUETOOTH_SCAN permissions");
                }
                return m.f8555a;
            }
        }

        public a(NodleContext nodleContext, d dVar, BluetoothLeScanner bluetoothLeScanner, a aVar) {
            this.f13558a = nodleContext;
            this.f13559b = dVar;
            this.f13560c = bluetoothLeScanner;
            this.f13561d = aVar;
        }

        public final void stop() {
            b.b(new C0261a(this.f13558a, this.f13559b, this.f13560c, this.f13561d));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final y9.e a(io.nodle.sdk.NodleContext r9, xd.q<? super di.a, ? super java.lang.Integer, ? super di.c, md.m> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "ctx"
            e6.e.D(r9, r0)
            java.lang.String r0 = "upstream"
            e6.e.D(r10, r0)
            org.slf4j.Logger r0 = r8.f13557a
            java.lang.String r1 = "starting BluetoothLE"
            r0.debug(r1)
            m2.a r0 = r9.getSdkConfig()
            a9.c r0 = (a9.c) r0
            java.lang.String r1 = "BLEScanner"
            r0.g(r1)
            r0 = r9
            ac.a r0 = (ac.a) r0
            android.content.Context r1 = r0.f289a
            java.lang.String r2 = "bluetooth"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.bluetooth.BluetoothManager"
            java.util.Objects.requireNonNull(r1, r2)
            android.bluetooth.BluetoothManager r1 = (android.bluetooth.BluetoothManager) r1
            android.bluetooth.BluetoothAdapter r1 = r1.getAdapter()
            android.content.Context r2 = r0.f289a
            boolean r3 = a.b.H(r2)
            r4 = 0
            if (r3 != 0) goto L_0x003c
            goto L_0x0056
        L_0x003c:
            boolean r2 = a.b.y(r2)
            if (r2 != 0) goto L_0x0043
            goto L_0x0056
        L_0x0043:
            boolean r2 = a.b.x()
            if (r2 != 0) goto L_0x004a
            goto L_0x0056
        L_0x004a:
            if (r1 != 0) goto L_0x004e
            r1 = r4
            goto L_0x0052
        L_0x004e:
            android.bluetooth.le.BluetoothLeScanner r1 = r1.getBluetoothLeScanner()     // Catch:{ Exception -> 0x0056 }
        L_0x0052:
            e6.e.B(r1)     // Catch:{ Exception -> 0x0056 }
            goto L_0x0057
        L_0x0056:
            r1 = r4
        L_0x0057:
            if (r1 == 0) goto L_0x00d1
            android.bluetooth.le.ScanSettings$Builder r2 = new android.bluetooth.le.ScanSettings$Builder
            r2.<init>()
            r3 = 1
            r2.setCallbackType(r3)
            r2.setMatchMode(r3)
            r2.setNumOfMatches(r3)
            r5 = 0
            r2.setReportDelay(r5)
            r5 = 2
            r2.setScanMode(r5)
            android.bluetooth.le.ScanSettings r2 = r2.build()
            java.lang.String r5 = "builder.build()"
            e6.e.C(r2, r5)
            y9.a r5 = new y9.a
            r5.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            android.content.Context r6 = r0.f289a
            java.lang.String r7 = "power"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.os.PowerManager r6 = (android.os.PowerManager) r6
            if (r6 != 0) goto L_0x0091
            goto L_0x0098
        L_0x0091:
            boolean r6 = r6.isInteractive()
            if (r6 != r3) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r3 = 0
        L_0x0099:
            if (r3 != 0) goto L_0x00af
            android.bluetooth.le.ScanFilter$Builder r3 = new android.bluetooth.le.ScanFilter$Builder
            r3.<init>()
            r3.setDeviceName(r4)
            android.bluetooth.le.ScanFilter r3 = r3.build()
            java.lang.String r4 = "filter.build()"
            e6.e.C(r3, r4)
            r10.add(r3)
        L_0x00af:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L_0x00c8
            android.content.Context r0 = r0.f289a
            java.lang.String r3 = "android.permission.BLUETOOTH_SCAN"
            int r0 = ah.v.C(r0, r3)
            if (r0 != 0) goto L_0x00c0
            goto L_0x00c8
        L_0x00c0:
            org.slf4j.Logger r10 = r8.f13557a
            java.lang.String r0 = "failed to scan BLUETOOTH_SCAN permission"
            r10.debug(r0)
            goto L_0x00cb
        L_0x00c8:
            r1.startScan(r10, r2, r5)
        L_0x00cb:
            y9.d$a r10 = new y9.d$a
            r10.<init>(r9, r8, r1, r5)
            return r10
        L_0x00d1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.d.a(io.nodle.sdk.NodleContext, xd.q):y9.e");
    }
}
