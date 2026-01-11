package ff;

import df.e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.Arrays;

public final class d implements KeySpec {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f5116a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5117b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f5118c;

    /* renamed from: s  reason: collision with root package name */
    public final e f5119s;

    /* renamed from: t  reason: collision with root package name */
    public final c f5120t;

    public d(byte[] bArr, c cVar) {
        if (bArr.length == cVar.f5112a.f4465a.f4479u / 8) {
            this.f5120t = cVar;
            this.f5116a = bArr;
            try {
                MessageDigest instance = MessageDigest.getInstance(cVar.f5113b);
                int i = cVar.f5112a.f4465a.f4479u;
                byte[] digest = instance.digest(bArr);
                this.f5117b = digest;
                digest[0] = (byte) (digest[0] & 248);
                int i10 = (i / 8) - 1;
                digest[i10] = (byte) (digest[i10] & 63);
                int i11 = (i / 8) - 1;
                digest[i11] = (byte) (digest[i11] | 64);
                byte[] copyOfRange = Arrays.copyOfRange(digest, 0, i / 8);
                this.f5118c = copyOfRange;
                this.f5119s = cVar.f5115s.k(copyOfRange);
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalArgumentException("Unsupported hash algorithm");
            }
        } else {
            throw new IllegalArgumentException("seed length is wrong");
        }
    }

    public d(byte[] bArr, byte[] bArr2, byte[] bArr3, e eVar, c cVar) {
        this.f5116a = bArr;
        this.f5117b = bArr2;
        this.f5118c = bArr3;
        this.f5119s = eVar;
        this.f5120t = cVar;
    }
}
