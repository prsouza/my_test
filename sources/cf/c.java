package cf;

import df.e;
import ff.b;
import java.security.PublicKey;
import java.util.Arrays;

public final class c implements a, PublicKey {

    /* renamed from: a  reason: collision with root package name */
    public final e f3452a;

    /* renamed from: b  reason: collision with root package name */
    public e f3453b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f3454c;

    /* renamed from: s  reason: collision with root package name */
    public final ff.c f3455s;

    public c(ff.e eVar) {
        this.f3453b = null;
        e eVar2 = eVar.f5121a;
        this.f3452a = eVar2;
        this.f3454c = eVar2.n();
        this.f3455s = eVar.f5122b;
    }

    public final ff.c a() {
        return this.f3455s;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!Arrays.equals(this.f3454c, cVar.f3454c) || !this.f3455s.equals(cVar.f3455s)) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return "EdDSA";
    }

    public final byte[] getEncoded() {
        if (!this.f3455s.equals(b.f5110a)) {
            return null;
        }
        byte[] bArr = this.f3454c;
        int length = bArr.length + 12;
        byte[] bArr2 = new byte[length];
        bArr2[0] = 48;
        bArr2[1] = (byte) (length - 2);
        bArr2[2] = 48;
        bArr2[3] = 5;
        bArr2[4] = 6;
        bArr2[5] = 3;
        bArr2[6] = 43;
        bArr2[7] = 101;
        bArr2[8] = 112;
        bArr2[9] = 3;
        bArr2[10] = (byte) (bArr.length + 1);
        bArr2[11] = 0;
        System.arraycopy(bArr, 0, bArr2, 12, bArr.length);
        return bArr2;
    }

    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3454c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.security.spec.X509EncodedKeySpec r15) throws java.security.spec.InvalidKeySpecException {
        /*
            r14 = this;
            ff.e r0 = new ff.e
            byte[] r15 = r15.getEncoded()
            r1 = 44
            r2 = 8
            byte r3 = r15[r2]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            r4 = 100
            r5 = 5
            r6 = 7
            r7 = 3
            java.lang.String r8 = "unsupported key spec"
            if (r3 != r4) goto L_0x0018
            r1 = 47
            goto L_0x0025
        L_0x0018:
            r2 = 112(0x70, float:1.57E-43)
            if (r3 != r2) goto L_0x00bb
            byte r2 = r15[r7]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            if (r2 != r6) goto L_0x0024
            r1 = 46
            r2 = r6
            goto L_0x0025
        L_0x0024:
            r2 = r5
        L_0x0025:
            int r9 = r15.length     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            if (r9 != r1) goto L_0x00b3
            r9 = 0
            byte r10 = r15[r9]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            r11 = 48
            if (r10 != r11) goto L_0x00ad
            r10 = 1
            byte r12 = r15[r10]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            r13 = 2
            int r1 = r1 - r13
            if (r12 != r1) goto L_0x00ad
            byte r1 = r15[r13]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            if (r1 != r11) goto L_0x00ad
            r1 = 4
            byte r11 = r15[r7]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            if (r11 != r2) goto L_0x00ad
            byte r1 = r15[r1]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            r11 = 6
            if (r1 != r11) goto L_0x00ad
            byte r1 = r15[r5]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            if (r1 != r7) goto L_0x00ad
            byte r1 = r15[r11]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            r11 = 43
            if (r1 != r11) goto L_0x00ad
            byte r1 = r15[r6]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            r11 = 101(0x65, float:1.42E-43)
            if (r1 != r11) goto L_0x00ad
            r1 = 9
            r11 = 11
            r12 = 10
            if (r3 != r4) goto L_0x0071
            byte r1 = r15[r1]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            if (r1 != r12) goto L_0x006b
            byte r1 = r15[r12]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            if (r1 != r10) goto L_0x006b
            r1 = 12
            byte r2 = r15[r11]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            if (r2 != r10) goto L_0x006b
            goto L_0x0083
        L_0x006b:
            java.security.spec.InvalidKeySpecException r15 = new java.security.spec.InvalidKeySpecException     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            r15.<init>(r8)     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            throw r15     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
        L_0x0071:
            if (r2 != r6) goto L_0x0083
            byte r1 = r15[r1]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            if (r1 != r5) goto L_0x007d
            byte r1 = r15[r12]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            if (r1 != 0) goto L_0x007d
            r1 = r11
            goto L_0x0083
        L_0x007d:
            java.security.spec.InvalidKeySpecException r15 = new java.security.spec.InvalidKeySpecException     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            r15.<init>(r8)     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            throw r15     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
        L_0x0083:
            int r2 = r1 + 1
            byte r1 = r15[r1]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            if (r1 != r7) goto L_0x00a7
            int r1 = r2 + 1
            byte r2 = r15[r2]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            r3 = 33
            if (r2 != r3) goto L_0x00a7
            int r2 = r1 + 1
            byte r1 = r15[r1]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            if (r1 != 0) goto L_0x00a7
            r1 = 32
            byte[] r3 = new byte[r1]     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            java.lang.System.arraycopy(r15, r2, r3, r9, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            ff.a r15 = ff.b.f5110a
            r0.<init>((byte[]) r3, (ff.c) r15)
            r14.<init>((ff.e) r0)
            return
        L_0x00a7:
            java.security.spec.InvalidKeySpecException r15 = new java.security.spec.InvalidKeySpecException     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            r15.<init>(r8)     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            throw r15     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
        L_0x00ad:
            java.security.spec.InvalidKeySpecException r15 = new java.security.spec.InvalidKeySpecException     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            r15.<init>(r8)     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            throw r15     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
        L_0x00b3:
            java.security.spec.InvalidKeySpecException r15 = new java.security.spec.InvalidKeySpecException     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            java.lang.String r0 = "invalid key spec length"
            r15.<init>(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            throw r15     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
        L_0x00bb:
            java.security.spec.InvalidKeySpecException r15 = new java.security.spec.InvalidKeySpecException     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            r15.<init>(r8)     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
            throw r15     // Catch:{ IndexOutOfBoundsException -> 0x00c1 }
        L_0x00c1:
            r15 = move-exception
            java.security.spec.InvalidKeySpecException r0 = new java.security.spec.InvalidKeySpecException
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.c.<init>(java.security.spec.X509EncodedKeySpec):void");
    }
}
