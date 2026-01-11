package rg;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import qg.d;
import qg.e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f10789a = new a();

    /* renamed from: b  reason: collision with root package name */
    public boolean f10790b;

    /* renamed from: c  reason: collision with root package name */
    public d f10791c;

    /* renamed from: d  reason: collision with root package name */
    public e f10792d;

    public static class a extends ByteArrayOutputStream {
        public final synchronized byte[] a(d dVar) {
            byte[] bArr;
            bArr = new byte[64];
            dVar.T0(this.buf, this.count, bArr);
            reset();
            return bArr;
        }

        public final synchronized boolean c(e eVar, byte[] bArr) {
            if (64 != bArr.length) {
                return false;
            }
            boolean t10 = dh.a.t(bArr, eVar.getEncoded(), this.buf, this.count);
            reset();
            return t10;
        }

        public final synchronized void reset() {
            Arrays.fill(this.buf, 0, this.count, (byte) 0);
            this.count = 0;
        }
    }

    public final byte[] a() {
        d dVar;
        if (this.f10790b && (dVar = this.f10791c) != null) {
            return this.f10789a.a(dVar);
        }
        throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
    }

    public final void b(boolean z, lg.a aVar) {
        this.f10790b = z;
        if (z) {
            this.f10791c = (d) aVar;
            this.f10792d = null;
        } else {
            this.f10791c = null;
            this.f10792d = (e) aVar;
        }
        this.f10789a.reset();
    }

    public final void c(byte[] bArr) {
        this.f10789a.write(bArr, 0, 1);
    }

    public final boolean d(byte[] bArr) {
        e eVar;
        if (!this.f10790b && (eVar = this.f10792d) != null) {
            return this.f10789a.c(eVar, bArr);
        }
        throw new IllegalStateException("Ed25519Signer not initialised for verification");
    }
}
