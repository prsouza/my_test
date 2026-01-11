package y7;

import java.io.IOException;
import java.io.InputStream;
import y7.f;

public final class g implements f.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ byte[] f13515a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int[] f13516b;

    public g(byte[] bArr, int[] iArr) {
        this.f13515a = bArr;
        this.f13516b = iArr;
    }

    public final void a(InputStream inputStream, int i) throws IOException {
        try {
            inputStream.read(this.f13515a, this.f13516b[0], i);
            int[] iArr = this.f13516b;
            iArr[0] = iArr[0] + i;
        } finally {
            inputStream.close();
        }
    }
}
