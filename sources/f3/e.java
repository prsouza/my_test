package f3;

import android.graphics.Bitmap;
import f3.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import t3.b;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f4959a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f4960b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    public final a.C0077a f4961c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f4962d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f4963e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f4964f;
    public byte[] g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f4965h;
    public byte[] i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f4966j;

    /* renamed from: k  reason: collision with root package name */
    public int f4967k;

    /* renamed from: l  reason: collision with root package name */
    public c f4968l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f4969m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4970n;

    /* renamed from: o  reason: collision with root package name */
    public int f4971o;

    /* renamed from: p  reason: collision with root package name */
    public int f4972p;

    /* renamed from: q  reason: collision with root package name */
    public int f4973q;

    /* renamed from: r  reason: collision with root package name */
    public int f4974r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f4975s;

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f4976t = Bitmap.Config.ARGB_8888;

    /* JADX WARNING: type inference failed for: r4v4, types: [java.util.List<f3.b>, java.util.ArrayList] */
    public e(a.C0077a aVar, c cVar, ByteBuffer byteBuffer, int i10) {
        int[] iArr;
        this.f4961c = aVar;
        this.f4968l = new c();
        synchronized (this) {
            if (i10 > 0) {
                int highestOneBit = Integer.highestOneBit(i10);
                this.f4971o = 0;
                this.f4968l = cVar;
                this.f4967k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f4962d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f4962d.order(ByteOrder.LITTLE_ENDIAN);
                this.f4970n = false;
                Iterator it = cVar.f4950e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((b) it.next()).g == 3) {
                            this.f4970n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f4972p = highestOneBit;
                int i11 = cVar.f4951f;
                this.f4974r = i11 / highestOneBit;
                int i12 = cVar.g;
                this.f4973q = i12 / highestOneBit;
                this.i = ((b) this.f4961c).a(i11 * i12);
                a.C0077a aVar2 = this.f4961c;
                int i13 = this.f4974r * this.f4973q;
                j3.b bVar = ((b) aVar2).f11291b;
                if (bVar == null) {
                    iArr = new int[i13];
                } else {
                    iArr = (int[]) bVar.d(i13, int[].class);
                }
                this.f4966j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
        }
    }

    public final int a() {
        return this.f4967k;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.List<f3.b>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v5, types: [java.util.List<f3.b>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00eb, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap b() {
        /*
            r8 = this;
            monitor-enter(r8)
            f3.c r0 = r8.f4968l     // Catch:{ all -> 0x00ec }
            int r0 = r0.f4948c     // Catch:{ all -> 0x00ec }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f4967k     // Catch:{ all -> 0x00ec }
            if (r0 >= 0) goto L_0x003b
        L_0x000d:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "e"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r3.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00ec }
            f3.c r4 = r8.f4968l     // Catch:{ all -> 0x00ec }
            int r4 = r4.f4948c     // Catch:{ all -> 0x00ec }
            r3.append(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00ec }
            int r4 = r8.f4967k     // Catch:{ all -> 0x00ec }
            r3.append(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ec }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00ec }
        L_0x0039:
            r8.f4971o = r2     // Catch:{ all -> 0x00ec }
        L_0x003b:
            int r0 = r8.f4971o     // Catch:{ all -> 0x00ec }
            r3 = 0
            if (r0 == r2) goto L_0x00ca
            r4 = 2
            if (r0 != r4) goto L_0x0045
            goto L_0x00ca
        L_0x0045:
            r0 = 0
            r8.f4971o = r0     // Catch:{ all -> 0x00ec }
            byte[] r5 = r8.f4963e     // Catch:{ all -> 0x00ec }
            if (r5 != 0) goto L_0x0058
            f3.a$a r5 = r8.f4961c     // Catch:{ all -> 0x00ec }
            r6 = 255(0xff, float:3.57E-43)
            t3.b r5 = (t3.b) r5     // Catch:{ all -> 0x00ec }
            byte[] r5 = r5.a(r6)     // Catch:{ all -> 0x00ec }
            r8.f4963e = r5     // Catch:{ all -> 0x00ec }
        L_0x0058:
            f3.c r5 = r8.f4968l     // Catch:{ all -> 0x00ec }
            java.util.List<f3.b> r5 = r5.f4950e     // Catch:{ all -> 0x00ec }
            int r6 = r8.f4967k     // Catch:{ all -> 0x00ec }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00ec }
            f3.b r5 = (f3.b) r5     // Catch:{ all -> 0x00ec }
            int r6 = r8.f4967k     // Catch:{ all -> 0x00ec }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0074
            f3.c r7 = r8.f4968l     // Catch:{ all -> 0x00ec }
            java.util.List<f3.b> r7 = r7.f4950e     // Catch:{ all -> 0x00ec }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00ec }
            f3.b r6 = (f3.b) r6     // Catch:{ all -> 0x00ec }
            goto L_0x0075
        L_0x0074:
            r6 = r3
        L_0x0075:
            int[] r7 = r5.f4945k     // Catch:{ all -> 0x00ec }
            if (r7 == 0) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            f3.c r7 = r8.f4968l     // Catch:{ all -> 0x00ec }
            int[] r7 = r7.f4946a     // Catch:{ all -> 0x00ec }
        L_0x007e:
            r8.f4959a = r7     // Catch:{ all -> 0x00ec }
            if (r7 != 0) goto L_0x00a6
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = "e"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r1.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00ec }
            int r4 = r8.f4967k     // Catch:{ all -> 0x00ec }
            r1.append(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ec }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00ec }
        L_0x00a2:
            r8.f4971o = r2     // Catch:{ all -> 0x00ec }
            monitor-exit(r8)
            return r3
        L_0x00a6:
            boolean r1 = r5.f4942f     // Catch:{ all -> 0x00ec }
            if (r1 == 0) goto L_0x00c4
            int[] r1 = r8.f4960b     // Catch:{ all -> 0x00ec }
            int r2 = r7.length     // Catch:{ all -> 0x00ec }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00ec }
            int[] r1 = r8.f4960b     // Catch:{ all -> 0x00ec }
            r8.f4959a = r1     // Catch:{ all -> 0x00ec }
            int r2 = r5.f4943h     // Catch:{ all -> 0x00ec }
            r1[r2] = r0     // Catch:{ all -> 0x00ec }
            int r0 = r5.g     // Catch:{ all -> 0x00ec }
            if (r0 != r4) goto L_0x00c4
            int r0 = r8.f4967k     // Catch:{ all -> 0x00ec }
            if (r0 != 0) goto L_0x00c4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00ec }
            r8.f4975s = r0     // Catch:{ all -> 0x00ec }
        L_0x00c4:
            android.graphics.Bitmap r0 = r8.i(r5, r6)     // Catch:{ all -> 0x00ec }
            monitor-exit(r8)
            return r0
        L_0x00ca:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = "e"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r1.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00ec }
            int r2 = r8.f4971o     // Catch:{ all -> 0x00ec }
            r1.append(r2)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ec }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00ec }
        L_0x00ea:
            monitor-exit(r8)
            return r3
        L_0x00ec:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.e.b():android.graphics.Bitmap");
    }

    public final void c() {
        this.f4967k = (this.f4967k + 1) % this.f4968l.f4948c;
    }

    public final void clear() {
        j3.b bVar;
        j3.b bVar2;
        j3.b bVar3;
        this.f4968l = null;
        byte[] bArr = this.i;
        if (!(bArr == null || (bVar3 = ((b) this.f4961c).f11291b) == null)) {
            bVar3.c(bArr);
        }
        int[] iArr = this.f4966j;
        if (!(iArr == null || (bVar2 = ((b) this.f4961c).f11291b) == null)) {
            bVar2.c(iArr);
        }
        Bitmap bitmap = this.f4969m;
        if (bitmap != null) {
            ((b) this.f4961c).f11290a.e(bitmap);
        }
        this.f4969m = null;
        this.f4962d = null;
        this.f4975s = null;
        byte[] bArr2 = this.f4963e;
        if (bArr2 != null && (bVar = ((b) this.f4961c).f11291b) != null) {
            bVar.c(bArr2);
        }
    }

    public final int d() {
        return this.f4968l.f4948c;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<f3.b>, java.util.ArrayList] */
    public final int e() {
        int i10;
        c cVar = this.f4968l;
        int i11 = cVar.f4948c;
        if (i11 <= 0 || (i10 = this.f4967k) < 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= i11) {
            return -1;
        }
        return ((b) cVar.f4950e.get(i10)).i;
    }

    public final int f() {
        return (this.f4966j.length * 4) + this.f4962d.limit() + this.i.length;
    }

    public final Bitmap g() {
        Boolean bool = this.f4975s;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f4976t;
        Bitmap c10 = ((b) this.f4961c).f11290a.c(this.f4974r, this.f4973q, config);
        c10.setHasAlpha(true);
        return c10;
    }

    public final ByteBuffer getData() {
        return this.f4962d;
    }

    public final void h(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f4976t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f4953j == r1.f4943h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v31, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap i(f3.b r36, f3.b r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            int[] r10 = r0.f4966j
            r11 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f4969m
            if (r3 == 0) goto L_0x0018
            f3.a$a r4 = r0.f4961c
            t3.b r4 = (t3.b) r4
            j3.c r4 = r4.f11290a
            r4.e(r3)
        L_0x0018:
            r3 = 0
            r0.f4969m = r3
            java.util.Arrays.fill(r10, r11)
        L_0x001e:
            r12 = 3
            if (r2 == 0) goto L_0x002c
            int r3 = r2.g
            if (r3 != r12) goto L_0x002c
            android.graphics.Bitmap r3 = r0.f4969m
            if (r3 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r11)
        L_0x002c:
            r13 = 2
            if (r2 == 0) goto L_0x007e
            int r3 = r2.g
            if (r3 <= 0) goto L_0x007e
            if (r3 != r13) goto L_0x006c
            boolean r3 = r1.f4942f
            if (r3 != 0) goto L_0x0047
            f3.c r3 = r0.f4968l
            int r4 = r3.f4954k
            int[] r5 = r1.f4945k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f4953j
            int r5 = r1.f4943h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = r11
        L_0x0048:
            int r3 = r2.f4940d
            int r5 = r0.f4972p
            int r3 = r3 / r5
            int r6 = r2.f4938b
            int r6 = r6 / r5
            int r7 = r2.f4939c
            int r7 = r7 / r5
            int r2 = r2.f4937a
            int r2 = r2 / r5
            int r5 = r0.f4974r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005c:
            if (r6 >= r3) goto L_0x007e
            int r2 = r6 + r7
            r5 = r6
        L_0x0061:
            if (r5 >= r2) goto L_0x0068
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0061
        L_0x0068:
            int r2 = r0.f4974r
            int r6 = r6 + r2
            goto L_0x005c
        L_0x006c:
            if (r3 != r12) goto L_0x007e
            android.graphics.Bitmap r2 = r0.f4969m
            if (r2 == 0) goto L_0x007e
            r4 = 0
            int r8 = r0.f4974r
            r6 = 0
            r7 = 0
            int r9 = r0.f4973q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x007e:
            java.nio.ByteBuffer r2 = r0.f4962d
            int r3 = r1.f4944j
            r2.position(r3)
            int r2 = r1.f4939c
            int r3 = r1.f4940d
            int r2 = r2 * r3
            byte[] r3 = r0.i
            if (r3 == 0) goto L_0x0091
            int r3 = r3.length
            if (r3 >= r2) goto L_0x009b
        L_0x0091:
            f3.a$a r3 = r0.f4961c
            t3.b r3 = (t3.b) r3
            byte[] r3 = r3.a(r2)
            r0.i = r3
        L_0x009b:
            byte[] r3 = r0.i
            short[] r4 = r0.f4964f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00a7
            short[] r4 = new short[r5]
            r0.f4964f = r4
        L_0x00a7:
            short[] r4 = r0.f4964f
            byte[] r6 = r0.g
            if (r6 != 0) goto L_0x00b1
            byte[] r6 = new byte[r5]
            r0.g = r6
        L_0x00b1:
            byte[] r6 = r0.g
            byte[] r7 = r0.f4965h
            if (r7 != 0) goto L_0x00bd
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f4965h = r7
        L_0x00bd:
            byte[] r7 = r0.f4965h
            java.nio.ByteBuffer r8 = r0.f4962d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r14 = r9 << r8
            int r15 = r14 + 1
            int r16 = r14 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            r13 = -1
            int r17 = r17 + -1
            r5 = r11
        L_0x00d5:
            if (r5 >= r14) goto L_0x00e0
            r4[r5] = r11
            byte r13 = (byte) r5
            r6[r5] = r13
            int r5 = r5 + 1
            r13 = -1
            goto L_0x00d5
        L_0x00e0:
            byte[] r5 = r0.f4963e
            r12 = r0
            r26 = r8
            r9 = r11
            r20 = r9
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r27 = r24
            r29 = r27
            r25 = r16
            r28 = r17
            r13 = -1
        L_0x00f9:
            r30 = 8
            if (r9 >= r2) goto L_0x01f6
            if (r21 != 0) goto L_0x0139
            java.nio.ByteBuffer r11 = r12.f4962d
            byte r11 = r11.get()
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 > 0) goto L_0x0112
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
            goto L_0x012a
        L_0x0112:
            r31 = r8
            java.nio.ByteBuffer r8 = r12.f4962d
            r32 = r9
            byte[] r9 = r12.f4963e
            r33 = r13
            int r13 = r8.remaining()
            int r13 = java.lang.Math.min(r11, r13)
            r34 = r10
            r10 = 0
            r8.get(r9, r10, r13)
        L_0x012a:
            if (r11 > 0) goto L_0x0134
            r8 = 3
            r12.f4971o = r8
            r11 = r20
            r10 = 0
            goto L_0x01fb
        L_0x0134:
            r21 = r11
            r22 = 0
            goto L_0x0141
        L_0x0139:
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
        L_0x0141:
            byte r8 = r5[r22]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r23
            int r24 = r24 + r8
            int r23 = r23 + 8
            r8 = 1
            int r22 = r22 + 1
            r8 = -1
            int r21 = r21 + -1
            r10 = r23
            r11 = r25
            r8 = r26
            r9 = r32
            r13 = r33
            r23 = r5
            r5 = r27
        L_0x015f:
            if (r10 < r8) goto L_0x01e2
            r25 = r12
            r12 = r24 & r28
            int r24 = r24 >> r8
            int r10 = r10 - r8
            if (r12 != r14) goto L_0x017b
            r26 = r10
            r11 = r16
            r28 = r17
            r12 = r25
            r8 = r31
            r13 = -1
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01dc
        L_0x017b:
            if (r12 != r15) goto L_0x0185
            r27 = r5
            r12 = r25
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01e7
        L_0x0185:
            r26 = r10
            r10 = -1
            if (r13 != r10) goto L_0x0198
            byte r5 = r6[r12]
            r3[r20] = r5
            int r20 = r20 + 1
            int r9 = r9 + 1
            r5 = r12
            r13 = r5
            r10 = r26
            r12 = r0
            goto L_0x015f
        L_0x0198:
            if (r12 < r11) goto L_0x01a1
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r13
            goto L_0x01a2
        L_0x01a1:
            r5 = r12
        L_0x01a2:
            if (r5 < r14) goto L_0x01ad
            byte r10 = r6[r5]
            r7[r29] = r10
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01a2
        L_0x01ad:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r5
            r3[r20] = r10
        L_0x01b4:
            r19 = 1
            int r20 = r20 + 1
            int r9 = r9 + 1
            if (r29 <= 0) goto L_0x01c3
            int r29 = r29 + -1
            byte r25 = r7[r29]
            r3[r20] = r25
            goto L_0x01b4
        L_0x01c3:
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r11 >= r5) goto L_0x01da
            short r13 = (short) r13
            r4[r11] = r13
            r6[r11] = r10
            int r11 = r11 + 1
            r10 = r11 & r28
            if (r10 != 0) goto L_0x01da
            if (r11 >= r5) goto L_0x01da
            int r8 = r8 + 1
            int r28 = r28 + r11
        L_0x01da:
            r13 = r12
            r12 = r0
        L_0x01dc:
            r5 = r25
            r10 = r26
            goto L_0x015f
        L_0x01e2:
            r27 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r12 = r0
        L_0x01e7:
            r26 = r8
            r25 = r11
            r5 = r23
            r8 = r31
            r11 = 0
            r23 = r10
            r10 = r34
            goto L_0x00f9
        L_0x01f6:
            r34 = r10
            r10 = r11
            r11 = r20
        L_0x01fb:
            java.util.Arrays.fill(r3, r11, r2, r10)
            boolean r2 = r1.f4941e
            if (r2 != 0) goto L_0x0275
            int r2 = r0.f4972p
            r3 = 1
            if (r2 == r3) goto L_0x0209
            goto L_0x0275
        L_0x0209:
            int[] r2 = r0.f4966j
            int r3 = r1.f4940d
            int r4 = r1.f4938b
            int r5 = r1.f4939c
            int r6 = r1.f4937a
            int r7 = r0.f4967k
            if (r7 != 0) goto L_0x0219
            r7 = 1
            goto L_0x021a
        L_0x0219:
            r7 = r10
        L_0x021a:
            int r8 = r0.f4974r
            byte[] r9 = r0.i
            int[] r11 = r0.f4959a
            r13 = r10
            r12 = -1
        L_0x0222:
            if (r13 >= r3) goto L_0x0257
            int r14 = r13 + r4
            int r14 = r14 * r8
            int r15 = r14 + r6
            int r10 = r15 + r5
            int r14 = r14 + r8
            if (r14 >= r10) goto L_0x022f
            r10 = r14
        L_0x022f:
            int r14 = r1.f4939c
            int r14 = r14 * r13
        L_0x0232:
            if (r15 >= r10) goto L_0x024f
            r16 = r3
            byte r3 = r9[r14]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L_0x0246
            r4 = r11[r4]
            if (r4 == 0) goto L_0x0245
            r2[r15] = r4
            goto L_0x0246
        L_0x0245:
            r12 = r3
        L_0x0246:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x0232
        L_0x024f:
            r16 = r3
            r17 = r4
            int r13 = r13 + 1
            r10 = 0
            goto L_0x0222
        L_0x0257:
            java.lang.Boolean r2 = r0.f4975s
            if (r2 == 0) goto L_0x0261
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x026a
        L_0x0261:
            java.lang.Boolean r2 = r0.f4975s
            if (r2 != 0) goto L_0x026c
            if (r7 == 0) goto L_0x026c
            r2 = -1
            if (r12 == r2) goto L_0x026c
        L_0x026a:
            r11 = 1
            goto L_0x026d
        L_0x026c:
            r11 = 0
        L_0x026d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.f4975s = r2
            goto L_0x0400
        L_0x0275:
            int[] r2 = r0.f4966j
            int r3 = r1.f4940d
            int r4 = r0.f4972p
            int r3 = r3 / r4
            int r5 = r1.f4938b
            int r5 = r5 / r4
            int r6 = r1.f4939c
            int r6 = r6 / r4
            int r7 = r1.f4937a
            int r7 = r7 / r4
            int r8 = r0.f4967k
            if (r8 != 0) goto L_0x028b
            r10 = 1
            goto L_0x028c
        L_0x028b:
            r10 = 0
        L_0x028c:
            int r8 = r0.f4974r
            int r9 = r0.f4973q
            byte[] r11 = r0.i
            int[] r12 = r0.f4959a
            java.lang.Boolean r13 = r0.f4975s
            r14 = r13
            r17 = r30
            r13 = 0
            r15 = 0
            r16 = 1
        L_0x029d:
            if (r13 >= r3) goto L_0x03ec
            r37 = r14
            boolean r14 = r1.f4941e
            if (r14 == 0) goto L_0x02cc
            if (r15 < r3) goto L_0x02c7
            int r14 = r16 + 1
            r20 = r3
            r3 = 2
            if (r14 == r3) goto L_0x02c2
            r3 = 3
            if (r14 == r3) goto L_0x02bb
            r3 = 4
            r16 = r14
            if (r14 == r3) goto L_0x02b7
            goto L_0x02c9
        L_0x02b7:
            r15 = 1
            r17 = 2
            goto L_0x02c9
        L_0x02bb:
            r3 = 4
            r17 = r3
            r16 = r14
            r15 = 2
            goto L_0x02c9
        L_0x02c2:
            r3 = 4
            r15 = r3
            r16 = r14
            goto L_0x02c9
        L_0x02c7:
            r20 = r3
        L_0x02c9:
            int r3 = r15 + r17
            goto L_0x02d0
        L_0x02cc:
            r20 = r3
            r3 = r15
            r15 = r13
        L_0x02d0:
            int r15 = r15 + r5
            r14 = 1
            if (r4 != r14) goto L_0x02d6
            r14 = 1
            goto L_0x02d7
        L_0x02d6:
            r14 = 0
        L_0x02d7:
            if (r15 >= r9) goto L_0x03cc
            int r15 = r15 * r8
            int r18 = r15 + r7
            r21 = r3
            int r3 = r18 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L_0x02e4
            r3 = r15
        L_0x02e4:
            int r15 = r13 * r4
            r22 = r5
            int r5 = r1.f4939c
            int r15 = r15 * r5
            if (r14 == 0) goto L_0x030d
            r14 = r37
            r5 = r18
        L_0x02f1:
            r23 = r6
            if (r5 >= r3) goto L_0x03c5
            byte r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L_0x0300
            r2[r5] = r6
            goto L_0x0307
        L_0x0300:
            if (r10 == 0) goto L_0x0307
            if (r14 != 0) goto L_0x0307
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r14 = r6
        L_0x0307:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L_0x02f1
        L_0x030d:
            r23 = r6
            int r5 = r3 - r18
            int r5 = r5 * r4
            int r5 = r5 + r15
            r14 = r37
            r6 = r18
        L_0x0317:
            if (r6 >= r3) goto L_0x03c5
            r18 = r3
            int r3 = r1.f4939c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x032c:
            int r8 = r0.f4972p
            int r8 = r8 + r15
            if (r7 >= r8) goto L_0x0361
            byte[] r8 = r0.i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L_0x0363
            if (r7 >= r5) goto L_0x0363
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f4959a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x035c
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x035c:
            int r7 = r7 + 1
            r9 = r32
            goto L_0x032c
        L_0x0361:
            r32 = r9
        L_0x0363:
            int r3 = r3 + r15
            r7 = r3
        L_0x0365:
            int r8 = r0.f4972p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x0396
            byte[] r8 = r0.i
            int r9 = r8.length
            if (r7 >= r9) goto L_0x0396
            if (r7 >= r5) goto L_0x0396
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f4959a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0393
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0393:
            int r7 = r7 + 1
            goto L_0x0365
        L_0x0396:
            if (r28 != 0) goto L_0x039a
            r3 = 0
            goto L_0x03ac
        L_0x039a:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03ac:
            if (r3 == 0) goto L_0x03b1
            r2[r6] = r3
            goto L_0x03b8
        L_0x03b1:
            if (r10 == 0) goto L_0x03b8
            if (r14 != 0) goto L_0x03b8
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r14 = r3
        L_0x03b8:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r18
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x0317
        L_0x03c5:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L_0x03da
        L_0x03cc:
            r21 = r3
            r22 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r14 = r37
        L_0x03da:
            int r13 = r13 + 1
            r3 = r20
            r15 = r21
            r5 = r22
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x029d
        L_0x03ec:
            r37 = r14
            java.lang.Boolean r2 = r0.f4975s
            if (r2 != 0) goto L_0x0400
            if (r37 != 0) goto L_0x03f6
            r11 = 0
            goto L_0x03fa
        L_0x03f6:
            boolean r11 = r37.booleanValue()
        L_0x03fa:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.f4975s = r2
        L_0x0400:
            boolean r2 = r0.f4970n
            if (r2 == 0) goto L_0x0424
            int r1 = r1.g
            if (r1 == 0) goto L_0x040b
            r2 = 1
            if (r1 != r2) goto L_0x0424
        L_0x040b:
            android.graphics.Bitmap r1 = r0.f4969m
            if (r1 != 0) goto L_0x0415
            android.graphics.Bitmap r1 = r35.g()
            r0.f4969m = r1
        L_0x0415:
            android.graphics.Bitmap r1 = r0.f4969m
            r3 = 0
            int r7 = r0.f4974r
            r5 = 0
            r6 = 0
            int r8 = r0.f4973q
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x0424:
            android.graphics.Bitmap r9 = r35.g()
            r3 = 0
            int r7 = r0.f4974r
            r5 = 0
            r6 = 0
            int r8 = r0.f4973q
            r1 = r9
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.e.i(f3.b, f3.b):android.graphics.Bitmap");
    }
}
