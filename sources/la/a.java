package la;

import ag.n;
import java.util.Objects;
import lg.b;
import lg.d;
import nh.f;
import nh.w;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f8155a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8156b;

    public /* synthetic */ a(n nVar, int i) {
        Objects.requireNonNull(nVar, "digest == null");
        this.f8156b = f.a(nVar);
        this.f8155a = i;
    }

    public /* synthetic */ a(String str) {
        this.f8156b = str;
        this.f8155a = 0;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f8155a) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == 32) {
            return b(3, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong address length");
        }
    }

    public final byte[] b(int i, byte[] bArr, byte[] bArr2) {
        byte[] j10 = w.j((long) i, this.f8155a);
        ((b) this.f8156b).update(j10, 0, j10.length);
        ((b) this.f8156b).update(bArr, 0, bArr.length);
        ((b) this.f8156b).update(bArr2, 0, bArr2.length);
        int i10 = this.f8155a;
        byte[] bArr3 = new byte[i10];
        Object obj = this.f8156b;
        boolean z = ((b) obj) instanceof d;
        b bVar = (b) obj;
        if (z) {
            ((d) bVar).g(bArr3, 0, i10);
        } else {
            bVar.b(bArr3, 0);
        }
        return bArr3;
    }

    public final String c() {
        int i = this.f8155a;
        if (i == -1) {
            return null;
        }
        int indexOf = ((String) this.f8156b).indexOf(46, i);
        if (indexOf == -1) {
            String substring = ((String) this.f8156b).substring(this.f8155a);
            this.f8155a = -1;
            return substring;
        }
        String substring2 = ((String) this.f8156b).substring(this.f8155a, indexOf);
        this.f8155a = indexOf + 1;
        return substring2;
    }
}
