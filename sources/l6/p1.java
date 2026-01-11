package l6;

import ad.c;
import java.util.Arrays;

public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f7974a = new byte[LZ4Constants.HASH_TABLE_SIZE];

    /* renamed from: b  reason: collision with root package name */
    public int f7975b;

    /* renamed from: c  reason: collision with root package name */
    public long f7976c;

    /* renamed from: d  reason: collision with root package name */
    public long f7977d;

    /* renamed from: e  reason: collision with root package name */
    public int f7978e;

    /* renamed from: f  reason: collision with root package name */
    public int f7979f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7980h;
    public String i;

    public p1() {
        c();
    }

    public final int a(byte[] bArr, int i10, int i11) {
        int d10 = d(30, bArr, i10, i11);
        if (d10 == -1) {
            return -1;
        }
        if (this.f7976c == -1) {
            long F0 = c.F0(this.f7974a, 0);
            this.f7976c = F0;
            if (F0 == 67324752) {
                this.f7980h = false;
                this.f7977d = c.F0(this.f7974a, 18);
                this.g = c.E0(this.f7974a, 8);
                this.f7978e = c.E0(this.f7974a, 26);
                int E0 = this.f7978e + 30 + c.E0(this.f7974a, 28);
                this.f7979f = E0;
                int length = this.f7974a.length;
                if (length < E0) {
                    do {
                        length += length;
                    } while (length < E0);
                    this.f7974a = Arrays.copyOf(this.f7974a, length);
                }
            } else {
                this.f7980h = true;
            }
        }
        int d11 = d(this.f7979f, bArr, i10 + d10, i11 - d10);
        if (d11 == -1) {
            return -1;
        }
        int i12 = d10 + d11;
        if (!this.f7980h && this.i == null) {
            this.i = new String(this.f7974a, 30, this.f7978e);
        }
        return i12;
    }

    public final m2 b() {
        int i10 = this.f7975b;
        int i11 = this.f7979f;
        if (i10 < i11) {
            return new h0(this.i, this.f7977d, this.g, true, this.f7980h, Arrays.copyOf(this.f7974a, i10));
        }
        h0 h0Var = new h0(this.i, this.f7977d, this.g, false, this.f7980h, Arrays.copyOf(this.f7974a, i11));
        c();
        return h0Var;
    }

    public final void c() {
        this.f7975b = 0;
        this.f7978e = -1;
        this.f7976c = -1;
        this.f7980h = false;
        this.f7979f = 30;
        this.f7977d = -1;
        this.g = -1;
        this.i = null;
    }

    public final int d(int i10, byte[] bArr, int i11, int i12) {
        int i13 = this.f7975b;
        if (i13 >= i10) {
            return 0;
        }
        int min = Math.min(i12, i10 - i13);
        System.arraycopy(bArr, i11, this.f7974a, this.f7975b, min);
        int i14 = this.f7975b + min;
        this.f7975b = i14;
        if (i14 < i10) {
            return -1;
        }
        return min;
    }
}
