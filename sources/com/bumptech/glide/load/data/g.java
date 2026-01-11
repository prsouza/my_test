package com.bumptech.glide.load.data;

import b9.m;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class g extends FilterInputStream {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f3566c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: s  reason: collision with root package name */
    public static final int f3567s = 31;

    /* renamed from: a  reason: collision with root package name */
    public final byte f3568a;

    /* renamed from: b  reason: collision with root package name */
    public int f3569b;

    public g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(m.b("Cannot add invalid orientation: ", i));
        }
        this.f3568a = (byte) i;
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() throws IOException {
        int i;
        int i10;
        int i11 = this.f3569b;
        if (i11 < 2 || i11 > (i10 = f3567s)) {
            i = super.read();
        } else if (i11 == i10) {
            i = this.f3568a;
        } else {
            i = f3566c[i11 - 2] & 255;
        }
        if (i != -1) {
            this.f3569b++;
        }
        return i;
    }

    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j10) throws IOException {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f3569b = (int) (((long) this.f3569b) + skip);
        }
        return skip;
    }

    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11;
        int i12 = this.f3569b;
        int i13 = f3567s;
        if (i12 > i13) {
            i11 = super.read(bArr, i, i10);
        } else if (i12 == i13) {
            bArr[i] = this.f3568a;
            i11 = 1;
        } else if (i12 < 2) {
            i11 = super.read(bArr, i, 2 - i12);
        } else {
            int min = Math.min(i13 - i12, i10);
            System.arraycopy(f3566c, this.f3569b - 2, bArr, i, min);
            i11 = min;
        }
        if (i11 > 0) {
            this.f3569b += i11;
        }
        return i11;
    }
}
