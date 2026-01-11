package h4;

import java.io.Serializable;

public final class f implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public static final f f5826u = new f((Object) null, -1, -1);

    /* renamed from: a  reason: collision with root package name */
    public final long f5827a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5828b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final int f5829c = -1;

    /* renamed from: s  reason: collision with root package name */
    public final int f5830s;

    /* renamed from: t  reason: collision with root package name */
    public final transient Object f5831t;

    public f(Object obj, long j10, int i) {
        this.f5831t = obj;
        this.f5827a = j10;
        this.f5830s = i;
    }

    public final int a(StringBuilder sb2, String str) {
        sb2.append('\"');
        sb2.append(str);
        sb2.append('\"');
        return str.length();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        Object obj2 = this.f5831t;
        if (obj2 == null) {
            if (fVar.f5831t != null) {
                return false;
            }
        } else if (!obj2.equals(fVar.f5831t)) {
            return false;
        }
        if (this.f5829c == fVar.f5829c && this.f5830s == fVar.f5830s && this.f5828b == fVar.f5828b && this.f5827a == fVar.f5827a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f5831t;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this.f5829c) + this.f5830s) ^ ((int) this.f5828b)) + ((int) this.f5827a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 80
            r0.<init>(r1)
            java.lang.String r1 = "[Source: "
            r0.append(r1)
            java.lang.Object r1 = r8.f5831t
            r2 = 93
            if (r1 != 0) goto L_0x0019
            java.lang.String r1 = "UNKNOWN"
            r0.append(r1)
            goto L_0x00b5
        L_0x0019:
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L_0x0021
            r3 = r1
            java.lang.Class r3 = (java.lang.Class) r3
            goto L_0x0025
        L_0x0021:
            java.lang.Class r3 = r1.getClass()
        L_0x0025:
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "java."
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0036
            java.lang.String r4 = r3.getSimpleName()
            goto L_0x0043
        L_0x0036:
            boolean r3 = r1 instanceof byte[]
            if (r3 == 0) goto L_0x003d
            java.lang.String r4 = "byte[]"
            goto L_0x0043
        L_0x003d:
            boolean r3 = r1 instanceof char[]
            if (r3 == 0) goto L_0x0043
            java.lang.String r4 = "char[]"
        L_0x0043:
            r3 = 40
            r0.append(r3)
            r0.append(r4)
            r3 = 41
            r0.append(r3)
            boolean r3 = r1 instanceof java.lang.CharSequence
            r4 = 500(0x1f4, float:7.0E-43)
            r5 = 0
            java.lang.String r6 = " chars"
            if (r3 == 0) goto L_0x0070
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r3 = r1.length()
            int r4 = java.lang.Math.min(r3, r4)
            java.lang.CharSequence r1 = r1.subSequence(r5, r4)
            java.lang.String r1 = r1.toString()
            int r1 = r8.a(r0, r1)
            goto L_0x0084
        L_0x0070:
            boolean r3 = r1 instanceof char[]
            if (r3 == 0) goto L_0x0087
            char[] r1 = (char[]) r1
            int r3 = r1.length
            java.lang.String r7 = new java.lang.String
            int r4 = java.lang.Math.min(r3, r4)
            r7.<init>(r1, r5, r4)
            int r1 = r8.a(r0, r7)
        L_0x0084:
            int r5 = r3 - r1
            goto L_0x00a5
        L_0x0087:
            boolean r3 = r1 instanceof byte[]
            if (r3 == 0) goto L_0x00a5
            byte[] r1 = (byte[]) r1
            int r3 = r1.length
            int r3 = java.lang.Math.min(r3, r4)
            java.lang.String r4 = new java.lang.String
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)
            r4.<init>(r1, r5, r3, r6)
            r8.a(r0, r4)
            int r1 = r1.length
            int r5 = r1 - r3
            java.lang.String r6 = " bytes"
        L_0x00a5:
            if (r5 <= 0) goto L_0x00b5
            java.lang.String r1 = "[truncated "
            r0.append(r1)
            r0.append(r5)
            r0.append(r6)
            r0.append(r2)
        L_0x00b5:
            java.lang.String r1 = "; line: "
            r0.append(r1)
            int r1 = r8.f5829c
            r0.append(r1)
            java.lang.String r1 = ", column: "
            r0.append(r1)
            int r1 = r8.f5830s
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.f.toString():java.lang.String");
    }
}
