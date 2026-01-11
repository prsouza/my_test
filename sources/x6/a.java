package x6;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f12870a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: x6.a$a  reason: collision with other inner class name */
    public static final class C0252a {

        /* renamed from: a  reason: collision with root package name */
        public final String f12871a;

        /* renamed from: b  reason: collision with root package name */
        public final char[] f12872b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12873c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12874d;

        /* renamed from: e  reason: collision with root package name */
        public final int f12875e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12876f;
        public final byte[] g;

        public C0252a(String str, char[] cArr) {
            this.f12871a = str;
            Objects.requireNonNull(cArr);
            this.f12872b = cArr;
            try {
                int b10 = y6.a.b(cArr.length, RoundingMode.UNNECESSARY);
                this.f12874d = b10;
                int min = Math.min(8, Integer.lowestOneBit(b10));
                try {
                    this.f12875e = 8 / min;
                    this.f12876f = b10 / min;
                    this.f12873c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c10 = cArr[i];
                        aa.b.s(c10 < 128, "Non-ASCII character: %s", c10);
                        aa.b.s(bArr[c10] == -1, "Duplicate character: %s", c10);
                        bArr[c10] = (byte) i;
                    }
                    this.g = bArr;
                    boolean[] zArr = new boolean[this.f12875e];
                    for (int i10 = 0; i10 < this.f12876f; i10++) {
                        zArr[y6.a.a(i10 * 8, this.f12874d, RoundingMode.CEILING)] = true;
                    }
                } catch (ArithmeticException e10) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e10);
                }
            } catch (ArithmeticException e11) {
                throw new IllegalArgumentException(android.support.v4.media.a.b(35, "Illegal alphabet length ", cArr.length), e11);
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0252a) {
                return Arrays.equals(this.f12872b, ((C0252a) obj).f12872b);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f12872b);
        }

        public final String toString() {
            return this.f12871a;
        }
    }

    public static final class b extends d {

        /* renamed from: d  reason: collision with root package name */
        public final char[] f12877d = new char[512];

        public b(C0252a aVar) {
            super(aVar, (Character) null);
            aa.b.p(aVar.f12872b.length == 16);
            for (int i = 0; i < 256; i++) {
                char[] cArr = this.f12877d;
                char[] cArr2 = aVar.f12872b;
                cArr[i] = cArr2[i >>> 4];
                cArr[i | 256] = cArr2[i & 15];
            }
        }

        public final a a(C0252a aVar) {
            return new b(aVar);
        }
    }

    public static class d extends a {

        /* renamed from: b  reason: collision with root package name */
        public final C0252a f12878b;

        /* renamed from: c  reason: collision with root package name */
        public final Character f12879c;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(x6.a.C0252a r5, java.lang.Character r6) {
            /*
                r4 = this;
                r4.<init>()
                java.util.Objects.requireNonNull(r5)
                r4.f12878b = r5
                r0 = 0
                r1 = 1
                if (r6 == 0) goto L_0x0022
                char r2 = r6.charValue()
                byte[] r5 = r5.g
                int r3 = r5.length
                if (r2 >= r3) goto L_0x001c
                byte r5 = r5[r2]
                r2 = -1
                if (r5 == r2) goto L_0x001c
                r5 = r1
                goto L_0x001d
            L_0x001c:
                r5 = r0
            L_0x001d:
                if (r5 != 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r5 = r0
                goto L_0x0023
            L_0x0022:
                r5 = r1
            L_0x0023:
                if (r5 == 0) goto L_0x0028
                r4.f12879c = r6
                return
            L_0x0028:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r6
                java.lang.String r6 = "Padding character %s was already in alphabet"
                java.lang.String r6 = l6.b1.q(r6, r1)
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: x6.a.d.<init>(x6.a$a, java.lang.Character):void");
        }

        public a a(C0252a aVar) {
            return new d(aVar, (Character) null);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!this.f12878b.equals(dVar.f12878b) || !y.c.x(this.f12879c, dVar.f12879c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f12878b.hashCode() ^ Arrays.hashCode(new Object[]{this.f12879c});
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f12878b.f12871a);
            if (8 % this.f12878b.f12874d != 0) {
                if (this.f12879c == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f12879c);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }
    }

    static {
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new d(new C0252a("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
        new d(new C0252a("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
        new b(new C0252a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public static final class c extends d {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
            /*
                r1 = this;
                x6.a$a r0 = new x6.a$a
                char[] r3 = r3.toCharArray()
                r0.<init>(r2, r3)
                r1.<init>(r0, r4)
                char[] r2 = r0.f12872b
                int r2 = r2.length
                r3 = 64
                if (r2 != r3) goto L_0x0015
                r2 = 1
                goto L_0x0016
            L_0x0015:
                r2 = 0
            L_0x0016:
                aa.b.p(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x6.a.c.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
        }

        public final a a(C0252a aVar) {
            return new c(aVar);
        }

        public c(C0252a aVar) {
            super(aVar, (Character) null);
            aa.b.p(aVar.f12872b.length == 64);
        }
    }
}
