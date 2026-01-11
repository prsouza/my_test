package p002if;

import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.api.Api;
import e6.e;
import fe.o;
import java.util.concurrent.TimeUnit;

/* renamed from: if.c  reason: invalid package */
public final class c {

    /* renamed from: n  reason: collision with root package name */
    public static final a f6478n = new a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6479a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6480b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6481c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6482d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6483e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6484f;
    public final boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6485h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6486j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6487k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6488l;

    /* renamed from: m  reason: collision with root package name */
    public String f6489m;

    /* renamed from: if.c$a */
    public static final class a {
        public final int a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                boolean z = false;
                if (o.l1(str2, str.charAt(i), 0, false, 2) >= 0) {
                    z = true;
                }
                if (z) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p002if.c b(p002if.q r27) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                java.lang.String r2 = "headers"
                e6.e.D(r1, r2)
                java.lang.String[] r2 = r1.f6560a
                int r2 = r2.length
                int r2 = r2 / 2
                r7 = 0
                r8 = 1
                r9 = 0
                r11 = 0
                r12 = 0
                r13 = -1
                r14 = -1
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = -1
                r19 = -1
                r20 = 0
                r21 = 0
                r22 = 0
            L_0x0024:
                if (r7 >= r2) goto L_0x018d
                java.lang.String r10 = r1.e(r7)
                java.lang.String r3 = r1.h(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = fe.k.Y0(r10, r4)
                if (r4 == 0) goto L_0x003b
                if (r9 == 0) goto L_0x0039
                goto L_0x0043
            L_0x0039:
                r9 = r3
                goto L_0x0044
            L_0x003b:
                java.lang.String r4 = "Pragma"
                boolean r4 = fe.k.Y0(r10, r4)
                if (r4 == 0) goto L_0x017f
            L_0x0043:
                r8 = 0
            L_0x0044:
                r4 = 0
            L_0x0045:
                int r10 = r3.length()
                if (r4 >= r10) goto L_0x017f
                java.lang.String r10 = "=,;"
                int r10 = r0.a(r3, r10, r4)
                java.lang.String r4 = r3.substring(r4, r10)
                java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                e6.e.C(r4, r5)
                java.lang.CharSequence r4 = fe.o.D1(r4)
                java.lang.String r4 = r4.toString()
                int r6 = r3.length()
                if (r10 == r6) goto L_0x00da
                char r6 = r3.charAt(r10)
                r1 = 44
                if (r6 == r1) goto L_0x00da
                char r1 = r3.charAt(r10)
                r6 = 59
                if (r1 != r6) goto L_0x0079
                goto L_0x00da
            L_0x0079:
                int r10 = r10 + 1
                byte[] r1 = jf.c.f7250a
                int r1 = r3.length()
            L_0x0081:
                if (r10 >= r1) goto L_0x0097
                char r6 = r3.charAt(r10)
                r25 = r1
                r1 = 32
                if (r6 == r1) goto L_0x0092
                r1 = 9
                if (r6 == r1) goto L_0x0092
                goto L_0x009b
            L_0x0092:
                int r10 = r10 + 1
                r1 = r25
                goto L_0x0081
            L_0x0097:
                int r10 = r3.length()
            L_0x009b:
                int r1 = r3.length()
                if (r10 >= r1) goto L_0x00bf
                char r1 = r3.charAt(r10)
                r6 = 34
                if (r1 != r6) goto L_0x00bf
                int r10 = r10 + 1
                r1 = 4
                r25 = r2
                r2 = 0
                int r1 = fe.o.l1(r3, r6, r10, r2, r1)
                java.lang.String r6 = r3.substring(r10, r1)
                e6.e.C(r6, r5)
                r24 = 1
                int r1 = r1 + 1
                goto L_0x00e3
            L_0x00bf:
                r25 = r2
                r2 = 0
                r24 = 1
                java.lang.String r1 = ",;"
                int r1 = r0.a(r3, r1, r10)
                java.lang.String r6 = r3.substring(r10, r1)
                e6.e.C(r6, r5)
                java.lang.CharSequence r5 = fe.o.D1(r6)
                java.lang.String r6 = r5.toString()
                goto L_0x00e3
            L_0x00da:
                r25 = r2
                r2 = 0
                r24 = 1
                int r10 = r10 + 1
                r1 = r10
                r6 = 0
            L_0x00e3:
                java.lang.String r5 = "no-cache"
                boolean r5 = fe.k.Y0(r5, r4)
                if (r5 == 0) goto L_0x00ee
                r11 = r24
                goto L_0x0147
            L_0x00ee:
                java.lang.String r5 = "no-store"
                boolean r5 = fe.k.Y0(r5, r4)
                if (r5 == 0) goto L_0x00f9
                r12 = r24
                goto L_0x0147
            L_0x00f9:
                java.lang.String r5 = "max-age"
                boolean r5 = fe.k.Y0(r5, r4)
                if (r5 == 0) goto L_0x0108
                r5 = -1
                int r13 = jf.c.y(r6, r5)
                goto L_0x0178
            L_0x0108:
                r5 = -1
                java.lang.String r10 = "s-maxage"
                boolean r10 = fe.k.Y0(r10, r4)
                if (r10 == 0) goto L_0x0117
                int r14 = jf.c.y(r6, r5)
                goto L_0x0178
            L_0x0117:
                java.lang.String r5 = "private"
                boolean r5 = fe.k.Y0(r5, r4)
                if (r5 == 0) goto L_0x0122
                r15 = r24
                goto L_0x0147
            L_0x0122:
                java.lang.String r5 = "public"
                boolean r5 = fe.k.Y0(r5, r4)
                if (r5 == 0) goto L_0x012d
                r16 = r24
                goto L_0x0147
            L_0x012d:
                java.lang.String r5 = "must-revalidate"
                boolean r5 = fe.k.Y0(r5, r4)
                if (r5 == 0) goto L_0x0138
                r17 = r24
                goto L_0x0147
            L_0x0138:
                java.lang.String r5 = "max-stale"
                boolean r5 = fe.k.Y0(r5, r4)
                if (r5 == 0) goto L_0x0149
                r4 = 2147483647(0x7fffffff, float:NaN)
                int r18 = jf.c.y(r6, r4)
            L_0x0147:
                r5 = -1
                goto L_0x0178
            L_0x0149:
                java.lang.String r5 = "min-fresh"
                boolean r5 = fe.k.Y0(r5, r4)
                if (r5 == 0) goto L_0x0157
                r5 = -1
                int r19 = jf.c.y(r6, r5)
                goto L_0x0178
            L_0x0157:
                r5 = -1
                java.lang.String r6 = "only-if-cached"
                boolean r6 = fe.k.Y0(r6, r4)
                if (r6 == 0) goto L_0x0163
                r20 = r24
                goto L_0x0178
            L_0x0163:
                java.lang.String r6 = "no-transform"
                boolean r6 = fe.k.Y0(r6, r4)
                if (r6 == 0) goto L_0x016e
                r21 = r24
                goto L_0x0178
            L_0x016e:
                java.lang.String r6 = "immutable"
                boolean r4 = fe.k.Y0(r6, r4)
                if (r4 == 0) goto L_0x0178
                r22 = r24
            L_0x0178:
                r4 = r1
                r2 = r25
                r1 = r27
                goto L_0x0045
            L_0x017f:
                r25 = r2
                r2 = 0
                r5 = -1
                r24 = 1
                int r7 = r7 + 1
                r1 = r27
                r2 = r25
                goto L_0x0024
            L_0x018d:
                if (r8 != 0) goto L_0x0192
                r23 = 0
                goto L_0x0194
            L_0x0192:
                r23 = r9
            L_0x0194:
                if.c r1 = new if.c
                r10 = r1
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p002if.c.a.b(if.q):if.c");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e.D(timeUnit, "timeUnit");
        timeUnit.toSeconds((long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public c(boolean z, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, String str) {
        this.f6479a = z;
        this.f6480b = z10;
        this.f6481c = i10;
        this.f6482d = i11;
        this.f6483e = z11;
        this.f6484f = z12;
        this.g = z13;
        this.f6485h = i12;
        this.i = i13;
        this.f6486j = z14;
        this.f6487k = z15;
        this.f6488l = z16;
        this.f6489m = str;
    }

    public final String toString() {
        String str = this.f6489m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6479a) {
            sb2.append("no-cache, ");
        }
        if (this.f6480b) {
            sb2.append("no-store, ");
        }
        if (this.f6481c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f6481c);
            sb2.append(", ");
        }
        if (this.f6482d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f6482d);
            sb2.append(", ");
        }
        if (this.f6483e) {
            sb2.append("private, ");
        }
        if (this.f6484f) {
            sb2.append("public, ");
        }
        if (this.g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f6485h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f6485h);
            sb2.append(", ");
        }
        if (this.i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.i);
            sb2.append(", ");
        }
        if (this.f6486j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f6487k) {
            sb2.append("no-transform, ");
        }
        if (this.f6488l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        e.C(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f6489m = sb3;
        return sb3;
    }
}
