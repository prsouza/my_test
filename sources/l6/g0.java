package l6;

public final class g0 extends g2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f7859a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7860b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7861c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7862d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7863e;

    public g0(int i, String str, long j10, long j11, int i10) {
        this.f7859a = i;
        this.f7860b = str;
        this.f7861c = j10;
        this.f7862d = j11;
        this.f7863e = i10;
    }

    public final int a() {
        return this.f7859a;
    }

    public final int b() {
        return this.f7863e;
    }

    public final long c() {
        return this.f7861c;
    }

    public final long d() {
        return this.f7862d;
    }

    public final String e() {
        return this.f7860b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.f7860b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof l6.g2
            r2 = 0
            if (r1 == 0) goto L_0x0046
            l6.g2 r8 = (l6.g2) r8
            int r1 = r7.f7859a
            int r3 = r8.a()
            if (r1 != r3) goto L_0x0046
            java.lang.String r1 = r7.f7860b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r8.e()
            if (r1 != 0) goto L_0x0046
            goto L_0x0029
        L_0x001e:
            java.lang.String r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0046
        L_0x0029:
            long r3 = r7.f7861c
            long r5 = r8.c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            long r3 = r7.f7862d
            long r5 = r8.d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            int r1 = r7.f7863e
            int r8 = r8.b()
            if (r1 != r8) goto L_0x0046
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.g0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f7859a ^ 1000003) * 1000003;
        String str = this.f7860b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f7861c;
        long j11 = this.f7862d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f7863e;
    }

    public final String toString() {
        int i = this.f7859a;
        String str = this.f7860b;
        long j10 = this.f7861c;
        long j11 = this.f7862d;
        int i10 = this.f7863e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 157);
        sb2.append("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(i);
        sb2.append(", filePath=");
        sb2.append(str);
        sb2.append(", fileOffset=");
        sb2.append(j10);
        sb2.append(", remainingBytes=");
        sb2.append(j11);
        sb2.append(", previousChunk=");
        sb2.append(i10);
        sb2.append("}");
        return sb2.toString();
    }
}
