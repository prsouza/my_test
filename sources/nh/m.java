package nh;

import java.util.Objects;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final byte[][] f9099a;

    public m(l lVar, byte[][] bArr) {
        boolean z;
        Objects.requireNonNull(lVar, "params == null");
        int i = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= bArr.length) {
                z = false;
                break;
            } else if (bArr[i10] == null) {
                z = true;
                break;
            } else {
                i10++;
            }
        }
        if (z) {
            throw new NullPointerException("publicKey byte array == null");
        } else if (bArr.length == lVar.f9097d) {
            while (i < bArr.length) {
                if (bArr[i].length == lVar.f9095b) {
                    i++;
                } else {
                    throw new IllegalArgumentException("wrong publicKey format");
                }
            }
            this.f9099a = w.c(bArr);
        } else {
            throw new IllegalArgumentException("wrong publicKey size");
        }
    }
}
