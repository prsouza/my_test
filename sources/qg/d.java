package qg;

import a.b;
import dh.a;
import java.security.SecureRandom;
import mg.j;

public final class d extends b {
    public final byte[] F;
    public e G;

    public d(SecureRandom secureRandom) {
        byte[] bArr = new byte[32];
        this.F = bArr;
        byte[] bArr2 = a.f4493a;
        secureRandom.nextBytes(bArr);
    }

    public d(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.F = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 32);
    }

    public final e S0() {
        e eVar;
        synchronized (this.F) {
            if (this.G == null) {
                byte[] bArr = new byte[32];
                byte[] bArr2 = this.F;
                byte[] bArr3 = a.f4493a;
                j jVar = new j();
                byte[] bArr4 = new byte[64];
                jVar.update(bArr2, 0, 32);
                jVar.b(bArr4, 0);
                byte[] bArr5 = new byte[32];
                a.q(bArr4, bArr5);
                a.s(bArr5, bArr);
                this.G = new e(bArr);
            }
            eVar = this.G;
        }
        return eVar;
    }

    public final void T0(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        System.arraycopy(S0().F, 0, bArr3, 0, 32);
        a.i(this.F, bArr3, (byte) 0, bArr, i, bArr2);
    }
}
