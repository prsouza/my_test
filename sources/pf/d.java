package pf;

import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.c;
import pf.s;
import uf.b0;
import uf.i;
import uf.v;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c[] f9929a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<i, Integer> f9930b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f9931c = new d();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f9932a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final v f9933b;

        /* renamed from: c  reason: collision with root package name */
        public c[] f9934c;

        /* renamed from: d  reason: collision with root package name */
        public int f9935d;

        /* renamed from: e  reason: collision with root package name */
        public int f9936e;

        /* renamed from: f  reason: collision with root package name */
        public int f9937f;
        public final int g = LZ4Constants.HASH_TABLE_SIZE;

        /* renamed from: h  reason: collision with root package name */
        public int f9938h = LZ4Constants.HASH_TABLE_SIZE;

        public a(b0 b0Var) {
            this.f9933b = new v(b0Var);
            this.f9934c = new c[8];
            this.f9935d = 7;
        }

        public final void a() {
            nd.d.I(this.f9934c, (Object) null);
            this.f9935d = this.f9934c.length - 1;
            this.f9936e = 0;
            this.f9937f = 0;
        }

        public final int b(int i) {
            int i10;
            int i11 = 0;
            if (i > 0) {
                int length = this.f9934c.length;
                while (true) {
                    length--;
                    i10 = this.f9935d;
                    if (length < i10 || i <= 0) {
                        c[] cVarArr = this.f9934c;
                        System.arraycopy(cVarArr, i10 + 1, cVarArr, i10 + 1 + i11, this.f9936e);
                        this.f9935d += i11;
                    } else {
                        c cVar = this.f9934c[length];
                        e.B(cVar);
                        int i12 = cVar.f9926a;
                        i -= i12;
                        this.f9937f -= i12;
                        this.f9936e--;
                        i11++;
                    }
                }
                c[] cVarArr2 = this.f9934c;
                System.arraycopy(cVarArr2, i10 + 1, cVarArr2, i10 + 1 + i11, this.f9936e);
                this.f9935d += i11;
            }
            return i11;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final uf.i c(int r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 1
                if (r5 < 0) goto L_0x000d
                pf.d r1 = pf.d.f9931c
                pf.c[] r1 = pf.d.f9929a
                int r1 = r1.length
                int r1 = r1 - r0
                if (r5 > r1) goto L_0x000d
                r1 = r0
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                if (r1 == 0) goto L_0x0019
                pf.d r0 = pf.d.f9931c
                pf.c[] r0 = pf.d.f9929a
                r5 = r0[r5]
                uf.i r5 = r5.f9927b
                goto L_0x0032
            L_0x0019:
                pf.d r1 = pf.d.f9931c
                pf.c[] r1 = pf.d.f9929a
                int r1 = r1.length
                int r1 = r5 - r1
                int r2 = r4.f9935d
                int r2 = r2 + r0
                int r2 = r2 + r1
                if (r2 < 0) goto L_0x0033
                pf.c[] r1 = r4.f9934c
                int r3 = r1.length
                if (r2 >= r3) goto L_0x0033
                r5 = r1[r2]
                e6.e.B(r5)
                uf.i r5 = r5.f9927b
            L_0x0032:
                return r5
            L_0x0033:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Header index too large "
                java.lang.StringBuilder r2 = a.a.d(r2)
                int r5 = r5 + r0
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.d.a.c(int):uf.i");
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<pf.c>, java.util.ArrayList] */
        public final void d(c cVar) {
            this.f9932a.add(cVar);
            int i = cVar.f9926a;
            int i10 = this.f9938h;
            if (i > i10) {
                a();
                return;
            }
            b((this.f9937f + i) - i10);
            int i11 = this.f9936e + 1;
            c[] cVarArr = this.f9934c;
            if (i11 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f9935d = this.f9934c.length - 1;
                this.f9934c = cVarArr2;
            }
            int i12 = this.f9935d;
            this.f9935d = i12 - 1;
            this.f9934c[i12] = cVar;
            this.f9936e++;
            this.f9937f += i;
        }

        public final i e() throws IOException {
            byte readByte = this.f9933b.readByte();
            byte[] bArr = c.f7250a;
            byte b10 = readByte & 255;
            byte b11 = 0;
            boolean z = (b10 & 128) == 128;
            long f10 = (long) f(b10, 127);
            if (!z) {
                return this.f9933b.p(f10);
            }
            uf.e eVar = new uf.e();
            s sVar = s.f10047d;
            v vVar = this.f9933b;
            e.D(vVar, "source");
            s.a aVar = s.f10046c;
            int i = 0;
            for (long j10 = 0; j10 < f10; j10++) {
                byte readByte2 = vVar.readByte();
                byte[] bArr2 = c.f7250a;
                b11 = (b11 << 8) | (readByte2 & 255);
                i += 8;
                while (i >= 8) {
                    int i10 = i - 8;
                    s.a[] aVarArr = aVar.f10048a;
                    e.B(aVarArr);
                    aVar = aVarArr[(b11 >>> i10) & 255];
                    e.B(aVar);
                    if (aVar.f10048a == null) {
                        eVar.y0(aVar.f10049b);
                        i -= aVar.f10050c;
                        aVar = s.f10046c;
                    } else {
                        i = i10;
                    }
                }
            }
            while (i > 0) {
                s.a[] aVarArr2 = aVar.f10048a;
                e.B(aVarArr2);
                s.a aVar2 = aVarArr2[(b11 << (8 - i)) & 255];
                e.B(aVar2);
                if (aVar2.f10048a != null || aVar2.f10050c > i) {
                    break;
                }
                eVar.y0(aVar2.f10049b);
                i -= aVar2.f10050c;
                aVar = s.f10046c;
            }
            return eVar.O();
        }

        public final int f(int i, int i10) throws IOException {
            int i11 = i & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                byte readByte = this.f9933b.readByte();
                byte[] bArr = c.f7250a;
                byte b10 = readByte & 255;
                if ((b10 & 128) == 0) {
                    return i10 + (b10 << i12);
                }
                i10 += (b10 & Byte.MAX_VALUE) << i12;
                i12 += 7;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f9939a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9940b;

        /* renamed from: c  reason: collision with root package name */
        public int f9941c;

        /* renamed from: d  reason: collision with root package name */
        public c[] f9942d;

        /* renamed from: e  reason: collision with root package name */
        public int f9943e;

        /* renamed from: f  reason: collision with root package name */
        public int f9944f;
        public int g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f9945h = true;
        public final uf.e i;

        public b(uf.e eVar) {
            this.i = eVar;
            this.f9939a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f9941c = LZ4Constants.HASH_TABLE_SIZE;
            this.f9942d = new c[8];
            this.f9943e = 7;
        }

        public final void a() {
            nd.d.I(this.f9942d, (Object) null);
            this.f9943e = this.f9942d.length - 1;
            this.f9944f = 0;
            this.g = 0;
        }

        public final int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f9942d.length;
                while (true) {
                    length--;
                    i11 = this.f9943e;
                    if (length < i11 || i10 <= 0) {
                        c[] cVarArr = this.f9942d;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f9944f);
                        c[] cVarArr2 = this.f9942d;
                        int i13 = this.f9943e;
                        Arrays.fill(cVarArr2, i13 + 1, i13 + 1 + i12, (Object) null);
                        this.f9943e += i12;
                    } else {
                        c cVar = this.f9942d[length];
                        e.B(cVar);
                        i10 -= cVar.f9926a;
                        int i14 = this.g;
                        c cVar2 = this.f9942d[length];
                        e.B(cVar2);
                        this.g = i14 - cVar2.f9926a;
                        this.f9944f--;
                        i12++;
                    }
                }
                c[] cVarArr3 = this.f9942d;
                System.arraycopy(cVarArr3, i11 + 1, cVarArr3, i11 + 1 + i12, this.f9944f);
                c[] cVarArr22 = this.f9942d;
                int i132 = this.f9943e;
                Arrays.fill(cVarArr22, i132 + 1, i132 + 1 + i12, (Object) null);
                this.f9943e += i12;
            }
            return i12;
        }

        public final void c(c cVar) {
            int i10 = cVar.f9926a;
            int i11 = this.f9941c;
            if (i10 > i11) {
                a();
                return;
            }
            b((this.g + i10) - i11);
            int i12 = this.f9944f + 1;
            c[] cVarArr = this.f9942d;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f9943e = this.f9942d.length - 1;
                this.f9942d = cVarArr2;
            }
            int i13 = this.f9943e;
            this.f9943e = i13 - 1;
            this.f9942d[i13] = cVar;
            this.f9944f++;
            this.g += i10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(uf.i r11) throws java.io.IOException {
            /*
                r10 = this;
                java.lang.String r0 = "data"
                e6.e.D(r11, r0)
                boolean r0 = r10.f9945h
                r1 = 127(0x7f, float:1.78E-43)
                r2 = 0
                if (r0 == 0) goto L_0x008b
                pf.s r0 = pf.s.f10047d
                int r0 = r11.h()
                r3 = 0
                r5 = r2
                r6 = r3
            L_0x0016:
                if (r5 >= r0) goto L_0x0029
                byte r8 = r11.l(r5)
                byte[] r9 = jf.c.f7250a
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte[] r9 = pf.s.f10045b
                byte r8 = r9[r8]
                long r8 = (long) r8
                long r6 = r6 + r8
                int r5 = r5 + 1
                goto L_0x0016
            L_0x0029:
                r0 = 7
                long r8 = (long) r0
                long r6 = r6 + r8
                r0 = 3
                long r5 = r6 >> r0
                int r0 = (int) r5
                int r5 = r11.h()
                if (r0 >= r5) goto L_0x008b
                uf.e r0 = new uf.e
                r0.<init>()
                pf.s r5 = pf.s.f10047d
                int r5 = r11.h()
                r6 = r3
                r3 = r2
            L_0x0043:
                if (r2 >= r5) goto L_0x0069
                byte r4 = r11.l(r2)
                byte[] r8 = jf.c.f7250a
                r4 = r4 & 255(0xff, float:3.57E-43)
                int[] r8 = pf.s.f10044a
                r8 = r8[r4]
                byte[] r9 = pf.s.f10045b
                byte r4 = r9[r4]
                long r6 = r6 << r4
                long r8 = (long) r8
                long r6 = r6 | r8
                int r3 = r3 + r4
            L_0x0059:
                r4 = 8
                if (r3 < r4) goto L_0x0066
                int r3 = r3 + -8
                long r8 = r6 >> r3
                int r4 = (int) r8
                r0.K(r4)
                goto L_0x0059
            L_0x0066:
                int r2 = r2 + 1
                goto L_0x0043
            L_0x0069:
                if (r3 <= 0) goto L_0x0078
                int r11 = 8 - r3
                long r4 = r6 << r11
                r6 = 255(0xff, double:1.26E-321)
                long r2 = r6 >>> r3
                long r2 = r2 | r4
                int r11 = (int) r2
                r0.K(r11)
            L_0x0078:
                uf.i r11 = r0.O()
                int r0 = r11.h()
                r2 = 128(0x80, float:1.794E-43)
                r10.f(r0, r1, r2)
                uf.e r0 = r10.i
                r0.p0(r11)
                goto L_0x0097
            L_0x008b:
                int r0 = r11.h()
                r10.f(r0, r1, r2)
                uf.e r0 = r10.i
                r0.p0(r11)
            L_0x0097:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.d.b.d(uf.i):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(java.util.List<pf.c> r13) throws java.io.IOException {
            /*
                r12 = this;
                boolean r0 = r12.f9940b
                r1 = 0
                if (r0 == 0) goto L_0x001e
                int r0 = r12.f9939a
                int r2 = r12.f9941c
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0012
                r12.f(r0, r4, r3)
            L_0x0012:
                r12.f9940b = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r12.f9939a = r0
                int r0 = r12.f9941c
                r12.f(r0, r4, r3)
            L_0x001e:
                int r0 = r13.size()
                r2 = r1
            L_0x0023:
                if (r2 >= r0) goto L_0x0101
                java.lang.Object r3 = r13.get(r2)
                pf.c r3 = (pf.c) r3
                uf.i r4 = r3.f9927b
                uf.i r4 = r4.q()
                uf.i r5 = r3.f9928c
                pf.d r6 = pf.d.f9931c
                java.util.Map<uf.i, java.lang.Integer> r6 = pf.d.f9930b
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                if (r6 == 0) goto L_0x006b
                int r6 = r6.intValue()
                int r6 = r6 + 1
                r8 = 7
                r9 = 2
                if (r9 <= r6) goto L_0x004b
                goto L_0x0069
            L_0x004b:
                if (r8 < r6) goto L_0x0069
                pf.c[] r8 = pf.d.f9929a
                int r9 = r6 + -1
                r9 = r8[r9]
                uf.i r9 = r9.f9928c
                boolean r9 = e6.e.r(r9, r5)
                if (r9 == 0) goto L_0x005c
                goto L_0x006c
            L_0x005c:
                r8 = r8[r6]
                uf.i r8 = r8.f9928c
                boolean r8 = e6.e.r(r8, r5)
                if (r8 == 0) goto L_0x0069
                int r8 = r6 + 1
                goto L_0x006d
            L_0x0069:
                r8 = r7
                goto L_0x006d
            L_0x006b:
                r6 = r7
            L_0x006c:
                r8 = r6
            L_0x006d:
                if (r8 != r7) goto L_0x00af
                int r9 = r12.f9943e
                int r9 = r9 + 1
                pf.c[] r10 = r12.f9942d
                int r10 = r10.length
            L_0x0076:
                if (r9 >= r10) goto L_0x00af
                pf.c[] r11 = r12.f9942d
                r11 = r11[r9]
                e6.e.B(r11)
                uf.i r11 = r11.f9927b
                boolean r11 = e6.e.r(r11, r4)
                if (r11 == 0) goto L_0x00ac
                pf.c[] r11 = r12.f9942d
                r11 = r11[r9]
                e6.e.B(r11)
                uf.i r11 = r11.f9928c
                boolean r11 = e6.e.r(r11, r5)
                if (r11 == 0) goto L_0x00a0
                int r8 = r12.f9943e
                int r9 = r9 - r8
                pf.d r8 = pf.d.f9931c
                pf.c[] r8 = pf.d.f9929a
                int r8 = r8.length
                int r8 = r8 + r9
                goto L_0x00af
            L_0x00a0:
                if (r6 != r7) goto L_0x00ac
                int r6 = r12.f9943e
                int r6 = r9 - r6
                pf.d r11 = pf.d.f9931c
                pf.c[] r11 = pf.d.f9929a
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x00ac:
                int r9 = r9 + 1
                goto L_0x0076
            L_0x00af:
                if (r8 == r7) goto L_0x00b9
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r12.f(r8, r3, r4)
                goto L_0x00fd
            L_0x00b9:
                r8 = 64
                if (r6 != r7) goto L_0x00cc
                uf.e r6 = r12.i
                r6.y0(r8)
                r12.d(r4)
                r12.d(r5)
                r12.c(r3)
                goto L_0x00fd
            L_0x00cc:
                uf.i r7 = pf.c.f9922d
                java.util.Objects.requireNonNull(r4)
                java.lang.String r9 = "prefix"
                e6.e.D(r7, r9)
                byte[] r9 = r7.f11959c
                int r9 = r9.length
                boolean r7 = r4.p(r7, r9)
                if (r7 == 0) goto L_0x00f2
                uf.i r7 = pf.c.i
                boolean r4 = e6.e.r(r7, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x00f2
                r3 = 15
                r12.f(r6, r3, r1)
                r12.d(r5)
                goto L_0x00fd
            L_0x00f2:
                r4 = 63
                r12.f(r6, r4, r8)
                r12.d(r5)
                r12.c(r3)
            L_0x00fd:
                int r2 = r2 + 1
                goto L_0x0023
            L_0x0101:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.d.b.e(java.util.List):void");
        }

        public final void f(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.i.y0(i10 | i12);
                return;
            }
            this.i.y0(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.i.y0(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.i.y0(i13);
        }
    }

    static {
        c cVar = new c(c.i, BuildConfig.FLAVOR);
        i iVar = c.f9924f;
        i iVar2 = c.g;
        i iVar3 = c.f9925h;
        i iVar4 = c.f9923e;
        c[] cVarArr = {cVar, new c(iVar, "GET"), new c(iVar, "POST"), new c(iVar2, "/"), new c(iVar2, "/index.html"), new c(iVar3, "http"), new c(iVar3, "https"), new c(iVar4, "200"), new c(iVar4, "204"), new c(iVar4, "206"), new c(iVar4, "304"), new c(iVar4, "400"), new c(iVar4, "404"), new c(iVar4, "500"), new c("accept-charset", (String) BuildConfig.FLAVOR), new c("accept-encoding", "gzip, deflate"), new c("accept-language", (String) BuildConfig.FLAVOR), new c("accept-ranges", (String) BuildConfig.FLAVOR), new c("accept", (String) BuildConfig.FLAVOR), new c("access-control-allow-origin", (String) BuildConfig.FLAVOR), new c("age", (String) BuildConfig.FLAVOR), new c("allow", (String) BuildConfig.FLAVOR), new c("authorization", (String) BuildConfig.FLAVOR), new c("cache-control", (String) BuildConfig.FLAVOR), new c("content-disposition", (String) BuildConfig.FLAVOR), new c("content-encoding", (String) BuildConfig.FLAVOR), new c("content-language", (String) BuildConfig.FLAVOR), new c("content-length", (String) BuildConfig.FLAVOR), new c("content-location", (String) BuildConfig.FLAVOR), new c("content-range", (String) BuildConfig.FLAVOR), new c("content-type", (String) BuildConfig.FLAVOR), new c("cookie", (String) BuildConfig.FLAVOR), new c("date", (String) BuildConfig.FLAVOR), new c("etag", (String) BuildConfig.FLAVOR), new c("expect", (String) BuildConfig.FLAVOR), new c("expires", (String) BuildConfig.FLAVOR), new c("from", (String) BuildConfig.FLAVOR), new c("host", (String) BuildConfig.FLAVOR), new c("if-match", (String) BuildConfig.FLAVOR), new c("if-modified-since", (String) BuildConfig.FLAVOR), new c("if-none-match", (String) BuildConfig.FLAVOR), new c("if-range", (String) BuildConfig.FLAVOR), new c("if-unmodified-since", (String) BuildConfig.FLAVOR), new c("last-modified", (String) BuildConfig.FLAVOR), new c("link", (String) BuildConfig.FLAVOR), new c("location", (String) BuildConfig.FLAVOR), new c("max-forwards", (String) BuildConfig.FLAVOR), new c("proxy-authenticate", (String) BuildConfig.FLAVOR), new c("proxy-authorization", (String) BuildConfig.FLAVOR), new c("range", (String) BuildConfig.FLAVOR), new c("referer", (String) BuildConfig.FLAVOR), new c("refresh", (String) BuildConfig.FLAVOR), new c("retry-after", (String) BuildConfig.FLAVOR), new c("server", (String) BuildConfig.FLAVOR), new c("set-cookie", (String) BuildConfig.FLAVOR), new c("strict-transport-security", (String) BuildConfig.FLAVOR), new c("transfer-encoding", (String) BuildConfig.FLAVOR), new c("user-agent", (String) BuildConfig.FLAVOR), new c("vary", (String) BuildConfig.FLAVOR), new c("via", (String) BuildConfig.FLAVOR), new c("www-authenticate", (String) BuildConfig.FLAVOR)};
        f9929a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i = 0; i < length; i++) {
            c[] cVarArr2 = f9929a;
            if (!linkedHashMap.containsKey(cVarArr2[i].f9927b)) {
                linkedHashMap.put(cVarArr2[i].f9927b, Integer.valueOf(i));
            }
        }
        Map<i, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        e.C(unmodifiableMap, "Collections.unmodifiableMap(result)");
        f9930b = unmodifiableMap;
    }

    public final i a(i iVar) throws IOException {
        e.D(iVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        int h10 = iVar.h();
        for (int i = 0; i < h10; i++) {
            byte b10 = (byte) 65;
            byte b11 = (byte) 90;
            byte l10 = iVar.l(i);
            if (b10 <= l10 && b11 >= l10) {
                StringBuilder d10 = a.a.d("PROTOCOL_ERROR response malformed: mixed case name: ");
                d10.append(iVar.r());
                throw new IOException(d10.toString());
            }
        }
        return iVar;
    }
}
