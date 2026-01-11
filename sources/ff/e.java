package ff;

import df.b;
import java.security.spec.KeySpec;

public final class e implements KeySpec {

    /* renamed from: a  reason: collision with root package name */
    public final df.e f5121a;

    /* renamed from: b  reason: collision with root package name */
    public final c f5122b;

    public e(byte[] bArr, c cVar) {
        int length = bArr.length;
        b bVar = cVar.f5112a;
        if (length == bVar.f4465a.f4479u / 8) {
            this.f5121a = new df.e(bVar, bArr, false);
            this.f5122b = cVar;
            return;
        }
        throw new IllegalArgumentException("public-key length is wrong");
    }

    public e(df.e eVar, c cVar) {
        this.f5121a = eVar;
        this.f5122b = cVar;
    }
}
