package com.bumptech.glide.load.data;

import j3.b;
import java.io.IOException;
import java.io.OutputStream;

public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f3559a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f3560b;

    /* renamed from: c  reason: collision with root package name */
    public b f3561c;

    /* renamed from: s  reason: collision with root package name */
    public int f3562s;

    public c(OutputStream outputStream, b bVar) {
        this.f3559a = outputStream;
        this.f3561c = bVar;
        this.f3560b = (byte[]) bVar.d(LZ4Constants.MAX_DISTANCE, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public final void close() throws IOException {
        try {
            flush();
            this.f3559a.close();
            byte[] bArr = this.f3560b;
            if (bArr != null) {
                this.f3561c.c(bArr);
                this.f3560b = null;
            }
        } catch (Throwable th2) {
            this.f3559a.close();
            throw th2;
        }
    }

    public final void flush() throws IOException {
        int i = this.f3562s;
        if (i > 0) {
            this.f3559a.write(this.f3560b, 0, i);
            this.f3562s = 0;
        }
        this.f3559a.flush();
    }

    public final void write(int i) throws IOException {
        byte[] bArr = this.f3560b;
        int i10 = this.f3562s;
        int i11 = i10 + 1;
        this.f3562s = i11;
        bArr[i10] = (byte) i;
        if (i11 == bArr.length && i11 > 0) {
            this.f3559a.write(bArr, 0, i11);
            this.f3562s = 0;
        }
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        do {
            int i12 = i10 - i11;
            int i13 = i + i11;
            int i14 = this.f3562s;
            if (i14 != 0 || i12 < this.f3560b.length) {
                int min = Math.min(i12, this.f3560b.length - i14);
                System.arraycopy(bArr, i13, this.f3560b, this.f3562s, min);
                int i15 = this.f3562s + min;
                this.f3562s = i15;
                i11 += min;
                byte[] bArr2 = this.f3560b;
                if (i15 == bArr2.length && i15 > 0) {
                    this.f3559a.write(bArr2, 0, i15);
                    this.f3562s = 0;
                    continue;
                }
            } else {
                this.f3559a.write(bArr, i13, i12);
                return;
            }
        } while (i11 < i10);
    }
}
