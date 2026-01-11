package l6;

import androidx.appcompat.widget.d;

public final class e0 extends b {

    /* renamed from: a  reason: collision with root package name */
    public final String f7826a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7827b;

    public e0(String str, String str2) {
        this.f7826a = str;
        this.f7827b = str2;
    }

    public final String a() {
        return this.f7827b;
    }

    public final int b() {
        return 0;
    }

    public final String c() {
        return this.f7826a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r1 = r4.f7827b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r1 = r4.f7826a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof l6.b
            r2 = 0
            if (r1 == 0) goto L_0x003d
            l6.b r5 = (l6.b) r5
            int r1 = r5.b()
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = r4.f7826a
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = r5.c()
            if (r1 != 0) goto L_0x003d
            goto L_0x0026
        L_0x001c:
            java.lang.String r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003d
        L_0x0026:
            java.lang.String r1 = r4.f7827b
            if (r1 != 0) goto L_0x0031
            java.lang.String r5 = r5.a()
            if (r5 != 0) goto L_0x003d
            goto L_0x003c
        L_0x0031:
            java.lang.String r5 = r5.a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            return r0
        L_0x003d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.e0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        String str = this.f7826a;
        int i10 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i11 = (i ^ -721379959) * 1000003;
        String str2 = this.f7827b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        String str = this.f7826a;
        String str2 = this.f7827b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb2.append("AssetPackLocation{packStorageMethod=");
        sb2.append(0);
        sb2.append(", path=");
        sb2.append(str);
        return d.b(sb2, ", assetsPath=", str2, "}");
    }
}
