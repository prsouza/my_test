package mg;

import lg.c;
import xh.d;

public abstract class b implements c, d {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f8687a;

    /* renamed from: b  reason: collision with root package name */
    public int f8688b;

    /* renamed from: c  reason: collision with root package name */
    public long f8689c;

    public b() {
        this.f8687a = new byte[4];
        this.f8688b = 0;
    }

    public b(b bVar) {
        this.f8687a = new byte[4];
        i(bVar);
    }

    public final void f(byte b10) {
        byte[] bArr = this.f8687a;
        int i = this.f8688b;
        int i10 = i + 1;
        this.f8688b = i10;
        bArr[i] = b10;
        if (i10 == bArr.length) {
            m(bArr, 0);
            this.f8688b = 0;
        }
        this.f8689c++;
    }

    public final int h() {
        return 64;
    }

    public final void i(b bVar) {
        byte[] bArr = bVar.f8687a;
        System.arraycopy(bArr, 0, this.f8687a, 0, bArr.length);
        this.f8688b = bVar.f8688b;
        this.f8689c = bVar.f8689c;
    }

    public final void j() {
        long j10 = this.f8689c << 3;
        byte b10 = Byte.MIN_VALUE;
        while (true) {
            f(b10);
            if (this.f8688b != 0) {
                b10 = 0;
            } else {
                l(j10);
                k();
                return;
            }
        }
    }

    public abstract void k();

    public abstract void l(long j10);

    public abstract void m(byte[] bArr, int i);

    public void reset() {
        this.f8689c = 0;
        this.f8688b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f8687a;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public final void update(byte[] bArr, int i, int i10) {
        int i11 = 0;
        int max = Math.max(0, i10);
        if (this.f8688b != 0) {
            int i12 = 0;
            while (true) {
                if (i12 >= max) {
                    i11 = i12;
                    break;
                }
                byte[] bArr2 = this.f8687a;
                int i13 = this.f8688b;
                int i14 = i13 + 1;
                this.f8688b = i14;
                int i15 = i12 + 1;
                bArr2[i13] = bArr[i12 + i];
                if (i14 == 4) {
                    m(bArr2, 0);
                    this.f8688b = 0;
                    i11 = i15;
                    break;
                }
                i12 = i15;
            }
        }
        int i16 = ((max - i11) & -4) + i11;
        while (i11 < i16) {
            m(bArr, i + i11);
            i11 += 4;
        }
        while (i11 < max) {
            byte[] bArr3 = this.f8687a;
            int i17 = this.f8688b;
            this.f8688b = i17 + 1;
            bArr3[i17] = bArr[i11 + i];
            i11++;
        }
        this.f8689c += (long) max;
    }
}
