package v9;

import ah.v;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.os.Build;
import c3.k;
import ge.d0;
import ge.v1;
import io.nodle.sdk.NodleContext;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import l6.b1;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import org.slf4j.Logger;
import rd.i;
import v9.a;
import xd.l;

public final class b implements di.b {

    /* renamed from: a  reason: collision with root package name */
    public NodleContext f12368a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f12369b;

    /* renamed from: c  reason: collision with root package name */
    public final di.a f12370c;

    /* renamed from: d  reason: collision with root package name */
    public a f12371d = a.f.f12364a;

    /* renamed from: e  reason: collision with root package name */
    public BluetoothGatt f12372e;

    /* renamed from: f  reason: collision with root package name */
    public int f12373f = 20;
    public byte[] g;

    /* renamed from: h  reason: collision with root package name */
    public final ne.c f12374h = new ne.c(false);
    public v1 i;

    /* renamed from: j  reason: collision with root package name */
    public final a f12375j = new a(this);

    public static final class a extends BluetoothGattCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f12376a;

        public a(b bVar) {
            this.f12376a = bVar;
        }

        public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            Logger logger = f.f12409a;
            StringBuilder q10 = a.b.q("device: ");
            q10.append(this.f12376a.f12370c.a());
            q10.append(" < characteristic read (");
            q10.append(i);
            q10.append(')');
            logger.debug(q10.toString());
            b bVar = this.f12376a;
            b.j(bVar, a.g.f12365a);
            b bVar2 = this.f12376a;
            a aVar = bVar.f12371d;
            a aVar2 = a.e.f12363a;
            if (!e6.e.r(aVar, aVar2)) {
                bVar2.f12372e = bluetoothGatt;
                if (!(bluetoothGatt == null || bluetoothGattCharacteristic == null || i != 0)) {
                    bVar2.g = bluetoothGattCharacteristic.getValue();
                    aVar2 = a.C0238a.f12359a;
                }
                bVar.f12371d = aVar2;
            }
            v1 v1Var = this.f12376a.i;
            if (v1Var != null) {
                v1Var.c((CancellationException) null);
            }
        }

        public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            Logger logger = f.f12409a;
            StringBuilder q10 = a.b.q("device: ");
            q10.append(this.f12376a.f12370c.a());
            q10.append(" < characteristic written (");
            q10.append(i);
            q10.append(')');
            logger.debug(q10.toString());
            b bVar = this.f12376a;
            b.j(bVar, a.i.f12367a);
            b bVar2 = this.f12376a;
            a aVar = bVar.f12371d;
            a aVar2 = a.e.f12363a;
            if (!e6.e.r(aVar, aVar2)) {
                bVar2.f12372e = bluetoothGatt;
                if (!(bluetoothGatt == null || bluetoothGattCharacteristic == null || i != 0)) {
                    aVar2 = a.C0238a.f12359a;
                }
                bVar.f12371d = aVar2;
            }
            v1 v1Var = this.f12376a.i;
            if (v1Var != null) {
                v1Var.c((CancellationException) null);
            }
        }

        public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i10) {
            e6.e.D(bluetoothGatt, "gatt");
            Logger logger = f.f12409a;
            StringBuilder q10 = a.b.q("device: ");
            q10.append(this.f12376a.f12370c.a());
            q10.append(" < connection changed ");
            q10.append(i10);
            logger.debug(q10.toString());
            b bVar = this.f12376a;
            b.j(bVar, a.b.f12360a);
            b bVar2 = this.f12376a;
            a aVar = bVar.f12371d;
            a aVar2 = a.e.f12363a;
            if (!e6.e.r(aVar, aVar2)) {
                if (i == 0 && i10 == 2) {
                    bVar2.f12372e = bluetoothGatt;
                    aVar2 = a.C0238a.f12359a;
                }
                bVar.f12371d = aVar2;
            }
            v1 v1Var = this.f12376a.i;
            if (v1Var != null) {
                v1Var.c((CancellationException) null);
            }
        }

        public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i10) {
            Logger logger = f.f12409a;
            StringBuilder q10 = a.b.q("device: ");
            q10.append(this.f12376a.f12370c.a());
            q10.append(" < mtu changed (");
            q10.append(i);
            q10.append(')');
            logger.debug(q10.toString());
            b bVar = this.f12376a;
            b.j(bVar, a.h.f12366a);
            b bVar2 = this.f12376a;
            a aVar = bVar.f12371d;
            a aVar2 = a.e.f12363a;
            if (!e6.e.r(aVar, aVar2)) {
                bVar2.f12373f = i - 3;
                bVar2.f12372e = bluetoothGatt;
                if (bluetoothGatt != null) {
                    aVar2 = a.C0238a.f12359a;
                }
                bVar.f12371d = aVar2;
            }
            v1 v1Var = this.f12376a.i;
            if (v1Var != null) {
                v1Var.c((CancellationException) null);
            }
        }

        public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            e6.e.D(bluetoothGatt, "gatt");
            Logger logger = f.f12409a;
            StringBuilder q10 = a.b.q("device: ");
            q10.append(this.f12376a.f12370c.a());
            q10.append(" < service discovered (");
            q10.append(i);
            q10.append(')');
            logger.debug(q10.toString());
            b bVar = this.f12376a;
            b.j(bVar, a.d.f12362a);
            b bVar2 = this.f12376a;
            a aVar = bVar.f12371d;
            a aVar2 = a.e.f12363a;
            if (!e6.e.r(aVar, aVar2)) {
                bVar2.f12372e = bluetoothGatt;
                if (i == 0) {
                    aVar2 = a.C0238a.f12359a;
                }
                bVar.f12371d = aVar2;
            }
            v1 v1Var = this.f12376a.i;
            if (v1Var != null) {
                v1Var.c((CancellationException) null);
            }
        }
    }

    @rd.e(c = "io.nodle.sdk.android.bluetooth.connect.BleGATTDevice$disconnect$2", f = "BleGATTDevice.kt", l = {}, m = "invokeSuspend")
    /* renamed from: v9.b$b  reason: collision with other inner class name */
    public static final class C0239b extends i implements l<pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f12377a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0239b(b bVar, pd.d<? super C0239b> dVar) {
            super(1, dVar);
            this.f12377a = bVar;
        }

        public final pd.d<m> create(pd.d<?> dVar) {
            return new C0239b(this.f12377a, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            b1.w(obj);
            b bVar = this.f12377a;
            b.h(bVar, a.C0238a.f12359a);
            a.c cVar = a.c.f12361a;
            if (!e6.e.r(bVar.f12371d, a.e.f12363a)) {
                bVar.f12371d = cVar;
            }
            this.f12377a.i();
            return m.f8555a;
        }

        public final Object k(Object obj) {
            C0239b bVar = new C0239b(this.f12377a, (pd.d) obj);
            m mVar = m.f8555a;
            bVar.invokeSuspend(mVar);
            return mVar;
        }
    }

    @rd.e(c = "io.nodle.sdk.android.bluetooth.connect.BleGATTDevice$discover$2", f = "BleGATTDevice.kt", l = {203}, m = "invokeSuspend")
    public static final class c extends i implements l<pd.d<? super List<? extends g4.a>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f12378a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f12379b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, pd.d<? super c> dVar) {
            super(1, dVar);
            this.f12379b = bVar;
        }

        public final pd.d<m> create(pd.d<?> dVar) {
            return new c(this.f12379b, dVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x009c, code lost:
            if (e6.e.r(r11.f12371d, r8) == false) goto L_0x00dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00db, code lost:
            if (e6.e.r(r11.f12371d, r8) == false) goto L_0x00dd;
         */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00eb A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                qd.a r0 = qd.a.COROUTINE_SUSPENDED
                int r1 = r10.f12378a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0017
                if (r1 != r3) goto L_0x000f
                l6.b1.w(r11)
                goto L_0x00ec
            L_0x000f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0017:
                l6.b1.w(r11)
                org.slf4j.Logger r11 = v9.f.f12409a
                java.lang.String r1 = "device: "
                java.lang.StringBuilder r4 = a.b.q(r1)
                v9.b r5 = r10.f12379b
                di.a r5 = r5.f12370c
                java.lang.String r5 = r5.a()
                r4.append(r5)
                java.lang.String r5 = " > request discover services ..."
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r11.debug(r4)
                v9.b r4 = r10.f12379b
                v9.a$a r5 = v9.a.C0238a.f12359a
                v9.b.h(r4, r5)
                v9.a$d r6 = v9.a.d.f12362a
                v9.a r7 = r4.f12371d
                v9.a$e r8 = v9.a.e.f12363a
                boolean r7 = e6.e.r(r7, r8)
                if (r7 != 0) goto L_0x004e
                r4.f12371d = r6
            L_0x004e:
                int r4 = android.os.Build.VERSION.SDK_INT
                r7 = 31
                java.lang.String r9 = " < request discovery failed"
                if (r4 < r7) goto L_0x00a5
                v9.b r4 = r10.f12379b
                io.nodle.sdk.NodleContext r4 = r4.f12368a
                android.content.Context r4 = c3.k.n(r4)
                java.lang.String r7 = "android.permission.BLUETOOTH_CONNECT"
                int r4 = ah.v.C(r4, r7)
                if (r4 != 0) goto L_0x009f
                v9.b r4 = r10.f12379b
                android.bluetooth.BluetoothGatt r4 = r4.f12372e
                if (r4 != 0) goto L_0x006d
                goto L_0x0075
            L_0x006d:
                boolean r4 = r4.discoverServices()
                if (r4 != r3) goto L_0x0075
                r4 = r3
                goto L_0x0076
            L_0x0075:
                r4 = r2
            L_0x0076:
                if (r4 != 0) goto L_0x00df
                java.lang.StringBuilder r1 = a.b.q(r1)
                v9.b r4 = r10.f12379b
                di.a r4 = r4.f12370c
                java.lang.String r4 = r4.a()
                r1.append(r4)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r11.debug(r1)
                v9.b r11 = r10.f12379b
                v9.b.h(r11, r6)
                v9.a r1 = r11.f12371d
                boolean r1 = e6.e.r(r1, r8)
                if (r1 != 0) goto L_0x00df
                goto L_0x00dd
            L_0x009f:
                java.lang.String r1 = "failed to discover BLUETOOTH_CONNECT permission"
                r11.debug(r1)
                goto L_0x00df
            L_0x00a5:
                v9.b r4 = r10.f12379b
                android.bluetooth.BluetoothGatt r4 = r4.f12372e
                if (r4 != 0) goto L_0x00ac
                goto L_0x00b4
            L_0x00ac:
                boolean r4 = r4.discoverServices()
                if (r4 != r3) goto L_0x00b4
                r4 = r3
                goto L_0x00b5
            L_0x00b4:
                r4 = r2
            L_0x00b5:
                if (r4 != 0) goto L_0x00df
                java.lang.StringBuilder r1 = a.b.q(r1)
                v9.b r4 = r10.f12379b
                di.a r4 = r4.f12370c
                java.lang.String r4 = r4.a()
                r1.append(r4)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r11.debug(r1)
                v9.b r11 = r10.f12379b
                v9.b.h(r11, r6)
                v9.a r1 = r11.f12371d
                boolean r1 = e6.e.r(r1, r8)
                if (r1 != 0) goto L_0x00df
            L_0x00dd:
                r11.f12371d = r5
            L_0x00df:
                v9.b r11 = r10.f12379b
                r10.f12378a = r3
                r3 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r11 = v9.b.f(r11, r3, r10)
                if (r11 != r0) goto L_0x00ec
                return r0
            L_0x00ec:
                v9.b r11 = r10.f12379b
                android.bluetooth.BluetoothGatt r11 = r11.f12372e
                r0 = 0
                if (r11 != 0) goto L_0x00f5
                r11 = r0
                goto L_0x00f9
            L_0x00f5:
                java.util.List r11 = r11.getServices()
            L_0x00f9:
                if (r11 != 0) goto L_0x00fc
                goto L_0x0118
            L_0x00fc:
                int r0 = r11.size()
                g4.a[] r1 = new g4.a[r0]
            L_0x0102:
                if (r2 >= r0) goto L_0x0114
                g4.a r3 = new g4.a
                java.lang.Object r4 = r11.get(r2)
                android.bluetooth.BluetoothGattService r4 = (android.bluetooth.BluetoothGattService) r4
                r3.<init>((android.bluetooth.BluetoothGattService) r4)
                r1[r2] = r3
                int r2 = r2 + 1
                goto L_0x0102
            L_0x0114:
                java.util.List r0 = nd.f.S(r1)
            L_0x0118:
                if (r0 != 0) goto L_0x011c
                nd.o r0 = nd.o.f8966a
            L_0x011c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: v9.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object k(Object obj) {
            return new c(this.f12379b, (pd.d) obj).invokeSuspend(m.f8555a);
        }
    }

    @rd.e(c = "io.nodle.sdk.android.bluetooth.connect.BleGATTDevice$mtu$2", f = "BleGATTDevice.kt", l = {164}, m = "invokeSuspend")
    public static final class d extends i implements l<pd.d<? super Integer>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f12380a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f12381b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f12382c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(b bVar, int i, pd.d<? super d> dVar) {
            super(1, dVar);
            this.f12381b = bVar;
            this.f12382c = i;
        }

        public final pd.d<m> create(pd.d<?> dVar) {
            return new d(this.f12381b, this.f12382c, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f12380a;
            if (i == 0) {
                b1.w(obj);
                Logger logger = f.f12409a;
                StringBuilder q10 = a.b.q("device: ");
                q10.append(this.f12381b.f12370c.a());
                q10.append(" > request set mtu ");
                q10.append(this.f12382c);
                q10.append(" ...");
                logger.debug(q10.toString());
                b bVar = this.f12381b;
                a.C0238a aVar2 = a.C0238a.f12359a;
                b.h(bVar, aVar2);
                a.h hVar = a.h.f12366a;
                a aVar3 = bVar.f12371d;
                a.e eVar = a.e.f12363a;
                if (!e6.e.r(aVar3, eVar)) {
                    bVar.f12371d = hVar;
                }
                boolean z = false;
                if (Build.VERSION.SDK_INT < 31) {
                    BluetoothGatt bluetoothGatt = this.f12381b.f12372e;
                    if (bluetoothGatt != null && bluetoothGatt.requestMtu(this.f12382c)) {
                        z = true;
                    }
                    if (!z) {
                        StringBuilder q11 = a.b.q("device: ");
                        q11.append(this.f12381b.f12370c.a());
                        q11.append(" < request MTU failed (ignored)");
                        logger.debug(q11.toString());
                        b bVar2 = this.f12381b;
                        b.h(bVar2, hVar);
                        if (!e6.e.r(bVar2.f12371d, eVar)) {
                            bVar2.f12371d = aVar2;
                        }
                        return new Integer(this.f12381b.f12373f);
                    }
                } else if (v.C(k.n(this.f12381b.f12368a), "android.permission.BLUETOOTH_CONNECT") == 0) {
                    BluetoothGatt bluetoothGatt2 = this.f12381b.f12372e;
                    if (bluetoothGatt2 != null && bluetoothGatt2.requestMtu(this.f12382c)) {
                        z = true;
                    }
                    if (!z) {
                        StringBuilder q12 = a.b.q("device: ");
                        q12.append(this.f12381b.f12370c.a());
                        q12.append(" < request MTU failed (ignored)");
                        logger.debug(q12.toString());
                        b bVar3 = this.f12381b;
                        b.h(bVar3, hVar);
                        if (!e6.e.r(bVar3.f12371d, eVar)) {
                            bVar3.f12371d = aVar2;
                        }
                        return new Integer(this.f12381b.f12373f);
                    }
                } else {
                    logger.debug("failed to get mtu BLUETOOTH_CONNECT permission");
                }
                b bVar4 = this.f12381b;
                this.f12380a = 1;
                if (b.f(bVar4, 5000, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return new Integer(this.f12381b.f12373f);
        }

        public final Object k(Object obj) {
            return new d(this.f12381b, this.f12382c, (pd.d) obj).invokeSuspend(m.f8555a);
        }
    }

    @rd.e(c = "io.nodle.sdk.android.bluetooth.connect.BleGATTDevice$read$2", f = "BleGATTDevice.kt", l = {237}, m = "invokeSuspend")
    public static final class e extends i implements l<pd.d<? super byte[]>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public b f12383a;

        /* renamed from: b  reason: collision with root package name */
        public int f12384b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f12385c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ UUID f12386s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ UUID f12387t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(b bVar, UUID uuid, UUID uuid2, pd.d<? super e> dVar) {
            super(1, dVar);
            this.f12385c = bVar;
            this.f12386s = uuid;
            this.f12387t = uuid2;
        }

        public final pd.d<m> create(pd.d<?> dVar) {
            return new e(this.f12385c, this.f12386s, this.f12387t, dVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:58:0x0138  */
        /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                qd.a r0 = qd.a.COROUTINE_SUSPENDED
                int r1 = r12.f12384b
                r2 = 0
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x001a
                if (r1 != r4) goto L_0x0012
                v9.b r0 = r12.f12383a
                l6.b1.w(r13)
                goto L_0x0134
            L_0x0012:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001a:
                l6.b1.w(r13)
                v9.b r13 = r12.f12385c
                android.bluetooth.BluetoothGatt r13 = r13.f12372e
                if (r13 != 0) goto L_0x0025
                goto L_0x0136
            L_0x0025:
                java.util.List r13 = r13.getServices()
                if (r13 != 0) goto L_0x002d
                goto L_0x0136
            L_0x002d:
                java.util.UUID r1 = r12.f12387t
                int r5 = r13.size()
                java.util.ListIterator r13 = r13.listIterator(r5)
            L_0x0037:
                boolean r5 = r13.hasPrevious()
                if (r5 == 0) goto L_0x004f
                java.lang.Object r5 = r13.previous()
                r6 = r5
                android.bluetooth.BluetoothGattService r6 = (android.bluetooth.BluetoothGattService) r6
                java.util.UUID r6 = r6.getUuid()
                boolean r6 = e6.e.r(r6, r1)
                if (r6 == 0) goto L_0x0037
                goto L_0x0050
            L_0x004f:
                r5 = r2
            L_0x0050:
                android.bluetooth.BluetoothGattService r5 = (android.bluetooth.BluetoothGattService) r5
                if (r5 != 0) goto L_0x0056
                goto L_0x0136
            L_0x0056:
                java.util.UUID r13 = r12.f12386s
                android.bluetooth.BluetoothGattCharacteristic r13 = r5.getCharacteristic(r13)
                if (r13 != 0) goto L_0x0060
                goto L_0x0136
            L_0x0060:
                v9.b r1 = r12.f12385c
                java.util.UUID r2 = r12.f12386s
                org.slf4j.Logger r5 = v9.f.f12409a
                java.lang.String r6 = "device: "
                java.lang.StringBuilder r7 = a.b.q(r6)
                di.a r8 = r1.f12370c
                java.lang.String r8 = r8.a()
                r7.append(r8)
                java.lang.String r8 = " > request read characteristic "
                r7.append(r8)
                r7.append(r2)
                java.lang.String r2 = " ..."
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                r5.debug(r2)
                v9.a$a r2 = v9.a.C0238a.f12359a
                v9.b.h(r1, r2)
                v9.a$g r7 = v9.a.g.f12365a
                v9.a r8 = r1.f12371d
                v9.a$e r9 = v9.a.e.f12363a
                boolean r8 = e6.e.r(r8, r9)
                if (r8 != 0) goto L_0x009c
                r1.f12371d = r7
            L_0x009c:
                int r8 = android.os.Build.VERSION.SDK_INT
                r10 = 31
                java.lang.String r11 = " < request read failed!"
                if (r8 < r10) goto L_0x00ef
                io.nodle.sdk.NodleContext r8 = r1.f12368a
                android.content.Context r8 = c3.k.n(r8)
                java.lang.String r10 = "android.permission.BLUETOOTH_CONNECT"
                int r8 = ah.v.C(r8, r10)
                if (r8 != 0) goto L_0x00e9
                android.bluetooth.BluetoothGatt r8 = r1.f12372e
                if (r8 != 0) goto L_0x00b7
                goto L_0x00bf
            L_0x00b7:
                boolean r13 = r8.readCharacteristic(r13)
                if (r13 != r4) goto L_0x00bf
                r13 = r4
                goto L_0x00c0
            L_0x00bf:
                r13 = r3
            L_0x00c0:
                if (r13 != 0) goto L_0x0126
                java.lang.StringBuilder r13 = a.b.q(r6)
                di.a r0 = r1.f12370c
                java.lang.String r0 = r0.a()
                r13.append(r0)
                r13.append(r11)
                java.lang.String r13 = r13.toString()
                r5.debug(r13)
                v9.b.h(r1, r7)
                v9.a r13 = r1.f12371d
                boolean r13 = e6.e.r(r13, r9)
                if (r13 != 0) goto L_0x00e6
                r1.f12371d = r2
            L_0x00e6:
                byte[] r13 = new byte[r3]
                return r13
            L_0x00e9:
                java.lang.String r13 = "failed to read BLUETOOTH_CONNECT permission"
                r5.debug(r13)
                goto L_0x0126
            L_0x00ef:
                android.bluetooth.BluetoothGatt r8 = r1.f12372e
                if (r8 != 0) goto L_0x00f4
                goto L_0x00fc
            L_0x00f4:
                boolean r13 = r8.readCharacteristic(r13)
                if (r13 != r4) goto L_0x00fc
                r13 = r4
                goto L_0x00fd
            L_0x00fc:
                r13 = r3
            L_0x00fd:
                if (r13 != 0) goto L_0x0126
                java.lang.StringBuilder r13 = a.b.q(r6)
                di.a r0 = r1.f12370c
                java.lang.String r0 = r0.a()
                r13.append(r0)
                r13.append(r11)
                java.lang.String r13 = r13.toString()
                r5.debug(r13)
                v9.b.h(r1, r7)
                v9.a r13 = r1.f12371d
                boolean r13 = e6.e.r(r13, r9)
                if (r13 != 0) goto L_0x0123
                r1.f12371d = r2
            L_0x0123:
                byte[] r13 = new byte[r3]
                return r13
            L_0x0126:
                r12.f12383a = r1
                r12.f12384b = r4
                r4 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r13 = v9.b.f(r1, r4, r12)
                if (r13 != r0) goto L_0x0133
                return r0
            L_0x0133:
                r0 = r1
            L_0x0134:
                byte[] r2 = r0.g
            L_0x0136:
                if (r2 != 0) goto L_0x013a
                byte[] r2 = new byte[r3]
            L_0x013a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: v9.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object k(Object obj) {
            return new e(this.f12385c, this.f12386s, this.f12387t, (pd.d) obj).invokeSuspend(m.f8555a);
        }
    }

    @rd.e(c = "io.nodle.sdk.android.bluetooth.connect.BleGATTDevice", f = "BleGATTDevice.kt", l = {78, 79}, m = "synchronized")
    public static final class f<T> extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public b f12388a;

        /* renamed from: b  reason: collision with root package name */
        public l f12389b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f12390c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ b f12391s;

        /* renamed from: t  reason: collision with root package name */
        public int f12392t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(b bVar, pd.d<? super f> dVar) {
            super(dVar);
            this.f12391s = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12390c = obj;
            this.f12392t |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f12391s.g((l) null, this);
        }
    }

    @rd.e(c = "io.nodle.sdk.android.bluetooth.connect.BleGATTDevice$write$2", f = "BleGATTDevice.kt", l = {275}, m = "invokeSuspend")
    public static final class g extends i implements l<pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f12393a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f12394b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ UUID f12395c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ UUID f12396s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ byte[] f12397t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(b bVar, UUID uuid, UUID uuid2, byte[] bArr, pd.d<? super g> dVar) {
            super(1, dVar);
            this.f12394b = bVar;
            this.f12395c = uuid;
            this.f12396s = uuid2;
            this.f12397t = bArr;
        }

        public final pd.d<m> create(pd.d<?> dVar) {
            return new g(this.f12394b, this.f12395c, this.f12396s, this.f12397t, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            List<BluetoothGattService> services;
            BluetoothGattService bluetoothGattService;
            BluetoothGattCharacteristic characteristic;
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f12393a;
            if (i == 0) {
                b1.w(obj);
                BluetoothGatt bluetoothGatt = this.f12394b.f12372e;
                if (!(bluetoothGatt == null || (services = bluetoothGatt.getServices()) == null)) {
                    UUID uuid = this.f12396s;
                    ListIterator<BluetoothGattService> listIterator = services.listIterator(services.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            bluetoothGattService = null;
                            break;
                        }
                        bluetoothGattService = listIterator.previous();
                        if (e6.e.r(bluetoothGattService.getUuid(), uuid)) {
                            break;
                        }
                    }
                    BluetoothGattService bluetoothGattService2 = bluetoothGattService;
                    if (!(bluetoothGattService2 == null || (characteristic = bluetoothGattService2.getCharacteristic(this.f12395c)) == null)) {
                        b bVar = this.f12394b;
                        UUID uuid2 = this.f12395c;
                        byte[] bArr = this.f12397t;
                        Logger logger = f.f12409a;
                        StringBuilder q10 = a.b.q("device: ");
                        q10.append(bVar.f12370c.a());
                        q10.append(" > request write characteristic ");
                        q10.append(uuid2);
                        q10.append(" ...");
                        logger.debug(q10.toString());
                        a.C0238a aVar2 = a.C0238a.f12359a;
                        b.h(bVar, aVar2);
                        a.i iVar = a.i.f12367a;
                        a aVar3 = bVar.f12371d;
                        a.e eVar = a.e.f12363a;
                        if (!e6.e.r(aVar3, eVar)) {
                            bVar.f12371d = iVar;
                        }
                        characteristic.setValue(bArr);
                        boolean z = false;
                        if (Build.VERSION.SDK_INT < 31) {
                            BluetoothGatt bluetoothGatt2 = bVar.f12372e;
                            if (bluetoothGatt2 != null && bluetoothGatt2.writeCharacteristic(characteristic)) {
                                z = true;
                            }
                            if (!z) {
                                StringBuilder q11 = a.b.q("device: ");
                                q11.append(bVar.f12370c.a());
                                q11.append(" < request write failed!");
                                logger.debug(q11.toString());
                                b.h(bVar, iVar);
                                if (!e6.e.r(bVar.f12371d, eVar)) {
                                    bVar.f12371d = aVar2;
                                }
                                return m.f8555a;
                            }
                        } else if (v.C(k.n(bVar.f12368a), "android.permission.BLUETOOTH_CONNECT") == 0) {
                            BluetoothGatt bluetoothGatt3 = bVar.f12372e;
                            if (bluetoothGatt3 != null && bluetoothGatt3.writeCharacteristic(characteristic)) {
                                z = true;
                            }
                            if (!z) {
                                StringBuilder q12 = a.b.q("device: ");
                                q12.append(bVar.f12370c.a());
                                q12.append(" < request write failed!");
                                logger.debug(q12.toString());
                                b.h(bVar, iVar);
                                if (!e6.e.r(bVar.f12371d, eVar)) {
                                    bVar.f12371d = aVar2;
                                }
                                return m.f8555a;
                            }
                        } else {
                            logger.debug("failed to write BLUETOOTH_CONNECT permission");
                        }
                        this.f12393a = 1;
                        if (b.f(bVar, 5000, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8555a;
        }

        public final Object k(Object obj) {
            return new g(this.f12394b, this.f12395c, this.f12396s, this.f12397t, (pd.d) obj).invokeSuspend(m.f8555a);
        }
    }

    public b(NodleContext nodleContext, d0 d0Var, di.a aVar) {
        this.f12368a = nodleContext;
        this.f12369b = d0Var;
        this.f12370c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(v9.b r5, long r6, pd.d r8) {
        /*
            java.util.Objects.requireNonNull(r5)
            boolean r0 = r8 instanceof v9.d
            if (r0 == 0) goto L_0x0016
            r0 = r8
            v9.d r0 = (v9.d) r0
            int r1 = r0.f12404s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f12404s = r1
            goto L_0x001b
        L_0x0016:
            v9.d r0 = new v9.d
            r0.<init>(r5, r8)
        L_0x001b:
            java.lang.Object r8 = r0.f12402b
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f12404s
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            v9.b r5 = r0.f12401a
            l6.b1.w(r8)     // Catch:{ CancellationException -> 0x0056 }
            goto L_0x0056
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            l6.b1.w(r8)
            ge.d0 r8 = r5.f12369b
            v9.e r2 = new v9.e
            r4 = 0
            r2.<init>(r6, r5, r4)
            r6 = 3
            ge.g1 r6 = ge.g.b(r8, r4, r2, r6)
            r7 = r6
            ge.v1 r7 = (ge.v1) r7
            r5.i = r7
            r0.f12401a = r5     // Catch:{ CancellationException -> 0x0056 }
            r0.f12404s = r3     // Catch:{ CancellationException -> 0x0056 }
            ge.l1 r6 = (ge.l1) r6     // Catch:{ CancellationException -> 0x0056 }
            java.lang.Object r6 = r6.t(r0)     // Catch:{ CancellationException -> 0x0056 }
            if (r6 != r1) goto L_0x0056
            goto L_0x0062
        L_0x0056:
            v9.a$e r6 = v9.a.e.f12363a
            v9.a r7 = r5.f12371d
            boolean r6 = e6.e.r(r7, r6)
            if (r6 != 0) goto L_0x0063
            md.m r1 = md.m.f8555a
        L_0x0062:
            return r1
        L_0x0063:
            r5.i()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.b.f(v9.b, long, pd.d):java.lang.Object");
    }

    public static final b h(b bVar, a aVar) {
        if (e6.e.r(bVar.f12371d, aVar)) {
            return bVar;
        }
        bVar.i();
        throw new IllegalStateException();
    }

    public static final b j(b bVar, a aVar) {
        Objects.requireNonNull(bVar);
        try {
            if (e6.e.r(bVar.f12371d, aVar)) {
                return bVar;
            }
            bVar.i();
            throw new IllegalStateException();
        } catch (IllegalStateException unused) {
            bVar.f12371d = a.e.f12363a;
        }
    }

    public final Object a(int i10, pd.d<? super Integer> dVar) {
        return g(new d(this, i10, (pd.d<? super d>) null), dVar);
    }

    public final Object b(pd.d<? super m> dVar) {
        Object g8 = g(new C0239b(this, (pd.d<? super C0239b>) null), dVar);
        if (g8 == qd.a.COROUTINE_SUSPENDED) {
            return g8;
        }
        return m.f8555a;
    }

    public final Object c(UUID uuid, UUID uuid2, byte[] bArr, pd.d<? super m> dVar) {
        Object g8 = g(new g(this, uuid2, uuid, bArr, (pd.d<? super g>) null), dVar);
        if (g8 == qd.a.COROUTINE_SUSPENDED) {
            return g8;
        }
        return m.f8555a;
    }

    public final Object d(UUID uuid, UUID uuid2, pd.d<? super byte[]> dVar) {
        return g(new e(this, uuid2, uuid, (pd.d<? super e>) null), dVar);
    }

    public final Object e(pd.d<? super List<? extends g4.a>> dVar) {
        return g(new c(this, (pd.d<? super c>) null), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object g(xd.l<? super pd.d<? super T>, ? extends java.lang.Object> r7, pd.d<? super T> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof v9.b.f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            v9.b$f r0 = (v9.b.f) r0
            int r1 = r0.f12392t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12392t = r1
            goto L_0x0018
        L_0x0013:
            v9.b$f r0 = new v9.b$f
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f12390c
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f12392t
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            v9.b r7 = r0.f12388a
            l6.b1.w(r8)     // Catch:{ all -> 0x002d }
            goto L_0x0066
        L_0x002d:
            r8 = move-exception
            goto L_0x006f
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            xd.l r7 = r0.f12389b
            v9.b r2 = r0.f12388a
            l6.b1.w(r8)     // Catch:{ all -> 0x0041 }
            r8 = r7
            r7 = r2
            goto L_0x0059
        L_0x0041:
            r7 = move-exception
            r8 = r7
            r7 = r2
            goto L_0x006f
        L_0x0045:
            l6.b1.w(r8)
            ne.c r8 = r6.f12374h     // Catch:{ all -> 0x006c }
            r0.f12388a = r6     // Catch:{ all -> 0x006c }
            r0.f12389b = r7     // Catch:{ all -> 0x006c }
            r0.f12392t = r4     // Catch:{ all -> 0x006c }
            java.lang.Object r8 = ((ne.c) r8).b((java.lang.Object) null, r0)     // Catch:{ all -> 0x006c }
            if (r8 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r8 = r7
            r7 = r6
        L_0x0059:
            r0.f12388a = r7     // Catch:{ all -> 0x002d }
            r0.f12389b = r5     // Catch:{ all -> 0x002d }
            r0.f12392t = r3     // Catch:{ all -> 0x002d }
            java.lang.Object r8 = r8.k(r0)     // Catch:{ all -> 0x002d }
            if (r8 != r1) goto L_0x0066
            return r1
        L_0x0066:
            ne.c r7 = r7.f12374h
            r7.a(r5)
            return r8
        L_0x006c:
            r7 = move-exception
            r8 = r7
            r7 = r6
        L_0x006f:
            ne.c r7 = r7.f12374h
            r7.a(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.b.g(xd.l, pd.d):java.lang.Object");
    }

    public final void i() {
        BluetoothGatt bluetoothGatt = this.f12372e;
        if (bluetoothGatt != null) {
            Logger logger = f.f12409a;
            StringBuilder q10 = a.b.q("device: ");
            q10.append(this.f12370c.a());
            q10.append(" > disconnecting ...");
            logger.debug(q10.toString());
            if (Build.VERSION.SDK_INT < 31 || v.C(k.n(this.f12368a), "android.permission.BLUETOOTH_CONNECT") == 0) {
                bluetoothGatt.disconnect();
            } else {
                logger.debug("failed to disconnect BLUETOOTH_CONNECT permission");
            }
        }
    }
}
