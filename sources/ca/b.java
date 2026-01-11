package ca;

import a.a;
import b9.m;
import ge.g0;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final g0 f3309c = new g0();

    /* renamed from: a  reason: collision with root package name */
    public byte[] f3310a;

    /* renamed from: b  reason: collision with root package name */
    public int f3311b = 0;

    public b(byte[] bArr) {
        this.f3310a = bArr;
    }

    public final boolean a() {
        Boolean bool;
        byte b10 = b();
        if (b10 == 0) {
            bool = Boolean.FALSE;
        } else if (b10 == 1) {
            bool = Boolean.TRUE;
        } else {
            throw new IllegalStateException(m.b("Not a boolean value: ", b10));
        }
        return bool.booleanValue();
    }

    public final byte b() {
        int i = this.f3311b;
        byte[] bArr = this.f3310a;
        if (i < bArr.length) {
            this.f3311b = i + 1;
            return bArr[i];
        }
        StringBuilder d10 = a.d("Cannot read ");
        d10.append(this.f3311b);
        d10.append(" of ");
        d10.append(this.f3310a.length);
        throw new IndexOutOfBoundsException(d10.toString());
    }

    public final byte[] c(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f3310a, this.f3311b, bArr, 0, i);
        this.f3311b += i;
        return bArr;
    }

    public final int d() {
        Integer num;
        byte b10 = b();
        if (b10 < 0) {
            num = Integer.valueOf(b10 + 256);
        } else {
            num = Integer.valueOf(b10);
        }
        return num.intValue();
    }
}
