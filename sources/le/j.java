package le;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class j<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8252e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8253f;
    public static final r g = new r("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f8254a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8255b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8256c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f8257d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8258a;

        public a(int i) {
            this.f8258a = i;
        }
    }

    static {
        Class<j> cls = j.class;
        f8252e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f8253f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public j(int i, boolean z) {
        this.f8254a = i;
        this.f8255b = z;
        int i10 = i - 1;
        this.f8256c = i10;
        this.f8257d = new AtomicReferenceArray(i);
        boolean z10 = false;
        if (i10 <= 1073741823) {
            if (!((i & i10) == 0 ? true : z10)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(E e10) {
        while (true) {
            long j10 = this._state;
            if ((3458764513820540928L & j10) != 0) {
                return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = (int) ((1073741823 & j10) >> 0);
            int i10 = (int) ((1152921503533105152L & j10) >> 30);
            int i11 = this.f8256c;
            if (((i10 + 2) & i11) == (i & i11)) {
                return 1;
            }
            if (this.f8255b || this.f8257d.get(i10 & i11) == null) {
                if (f8253f.compareAndSet(this, j10, (-1152921503533105153L & j10) | (((long) ((i10 + 1) & 1073741823)) << 30))) {
                    this.f8257d.set(i10 & i11, e10);
                    j jVar = this;
                    while ((jVar._state & 1152921504606846976L) != 0) {
                        jVar = jVar.e();
                        Object obj = jVar.f8257d.get(jVar.f8256c & i10);
                        if (!(obj instanceof a) || ((a) obj).f8258a != i10) {
                            jVar = null;
                            continue;
                        } else {
                            jVar.f8257d.set(jVar.f8256c & i10, e10);
                            continue;
                        }
                        if (jVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i12 = this.f8254a;
                if (i12 < 1024 || ((i10 - i) & 1073741823) > (i12 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    public final boolean b() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!f8253f.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j10 = this._state;
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j10 = this._state;
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067 A[LOOP:3: B:16:0x0067->B:19:0x0072, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final le.j<E> e() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f8253f
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r10._next
            le.j r0 = (le.j) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f8252e
            r1 = 0
            le.j r4 = new le.j
            int r5 = r10.f8254a
            int r5 = r5 * 2
            boolean r6 = r10.f8255b
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r5 = (int) r5
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r2
            r8 = 30
            long r6 = r6 >> r8
            int r6 = (int) r6
        L_0x0040:
            int r7 = r10.f8256c
            r8 = r5 & r7
            r7 = r7 & r6
            if (r8 == r7) goto L_0x005f
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f8257d
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L_0x0054
            le.j$a r7 = new le.j$a
            r7.<init>(r5)
        L_0x0054:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.f8257d
            int r9 = r4.f8256c
            r9 = r9 & r5
            r8.set(r9, r7)
            int r5 = r5 + 1
            goto L_0x0040
        L_0x005f:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state = r5
        L_0x0067:
            boolean r5 = r0.compareAndSet(r10, r1, r4)
            if (r5 == 0) goto L_0x006e
            goto L_0x001a
        L_0x006e:
            java.lang.Object r5 = r0.get(r10)
            if (r5 == 0) goto L_0x0067
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: le.j.e():le.j");
    }

    public final Object f() {
        while (true) {
            long j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) ((j10 & 1073741823) >> 0);
            int i10 = this.f8256c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i10) == (i & i10)) {
                return null;
            }
            Object obj = this.f8257d.get(i10 & i);
            if (obj == null) {
                if (this.f8255b) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j11 = ((long) ((i + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f8253f.compareAndSet(this, j10, (j10 & -1073741824) | j11)) {
                    this.f8257d.set(this.f8256c & i, (Object) null);
                    return obj2;
                } else if (this.f8255b) {
                    j jVar = this;
                    while (true) {
                        long j12 = jVar._state;
                        int i11 = (int) ((j12 & 1073741823) >> 0);
                        if ((j12 & 1152921504606846976L) != 0) {
                            jVar = jVar.e();
                        } else {
                            if (f8253f.compareAndSet(jVar, j12, (j12 & -1073741824) | j11)) {
                                jVar.f8257d.set(jVar.f8256c & i11, (Object) null);
                                jVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (jVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
