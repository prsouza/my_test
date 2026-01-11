package ga;

import aa.b;
import hc.f;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f5315a;

    /* renamed from: ga.a$a  reason: collision with other inner class name */
    public interface C0088a {
    }

    public a(b bVar) {
        this.f5315a = bVar;
    }

    public final void a(byte[] bArr, C0088a aVar) {
        int length = bArr.length * 8;
        if (length < 128) {
            throw new RuntimeException("Entropy too low, 128-256 bits allowed");
        } else if (length > 256) {
            throw new RuntimeException("Entropy too high, 128-256 bits allowed");
        } else if (length % 32 <= 0) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length + 1);
            int length2 = bArr.length;
            byte[] f02 = b.f0(bArr);
            byte b10 = f02[0];
            Arrays.fill(f02, (byte) 0);
            copyOf[length2] = b10;
            int i = ((length / 32) + length) / 11;
            int[] iArr = new int[i];
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                int i12 = i10 / 8;
                int i13 = 13 - (i10 % 8);
                iArr[i11] = (((i13 < 8 ? copyOf[i12 + 2] & 255 : 0) | (((copyOf[i12] & 255) << 16) | ((copyOf[i12 + 1] & 255) << 8))) >> i13) & 2047;
                i10 += 11;
            }
            try {
                String valueOf = String.valueOf(this.f5315a.getSpace());
                for (int i14 = 0; i14 < i; i14++) {
                    if (i14 > 0) {
                        ((f) aVar).a(valueOf);
                    }
                    ((f) aVar).a(this.f5315a.getWord(iArr[i14]));
                }
                Arrays.fill(iArr, 0);
            } catch (Throwable th2) {
                Arrays.fill(iArr, 0);
                throw th2;
            }
        } else {
            throw new RuntimeException("Number of entropy bits must be divisible by 32");
        }
    }
}
