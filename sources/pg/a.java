package pg;

import java.util.Hashtable;
import lg.b;
import lg.c;
import qg.f;
import xh.d;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static Hashtable f10055h;

    /* renamed from: a  reason: collision with root package name */
    public b f10056a;

    /* renamed from: b  reason: collision with root package name */
    public int f10057b;

    /* renamed from: c  reason: collision with root package name */
    public int f10058c;

    /* renamed from: d  reason: collision with root package name */
    public d f10059d;

    /* renamed from: e  reason: collision with root package name */
    public d f10060e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f10061f;
    public byte[] g;

    static {
        Hashtable hashtable = new Hashtable();
        f10055h = hashtable;
        hashtable.put("GOST3411", 32);
        f10055h.put("MD2", 16);
        f10055h.put("MD4", 64);
        f10055h.put("MD5", 64);
        f10055h.put("RIPEMD128", 64);
        f10055h.put("RIPEMD160", 64);
        f10055h.put("SHA-1", 64);
        f10055h.put("SHA-224", 64);
        f10055h.put("SHA-256", 64);
        f10055h.put("SHA-384", 128);
        f10055h.put("SHA-512", 128);
        f10055h.put("Tiger", 64);
        f10055h.put("Whirlpool", 64);
    }

    public a(b bVar) {
        int i;
        if (bVar instanceof c) {
            i = ((c) bVar).h();
        } else {
            Integer num = (Integer) f10055h.get(bVar.c());
            if (num != null) {
                i = num.intValue();
            } else {
                StringBuilder d10 = a.a.d("unknown digest passed: ");
                d10.append(bVar.c());
                throw new IllegalArgumentException(d10.toString());
            }
        }
        this.f10056a = bVar;
        int d11 = bVar.d();
        this.f10057b = d11;
        this.f10058c = i;
        this.f10061f = new byte[i];
        this.g = new byte[(i + d11)];
    }

    public final int a(byte[] bArr) {
        this.f10056a.b(this.g, this.f10058c);
        d dVar = this.f10060e;
        if (dVar != null) {
            ((d) this.f10056a).e(dVar);
            b bVar = this.f10056a;
            bVar.update(this.g, this.f10058c, bVar.d());
        } else {
            b bVar2 = this.f10056a;
            byte[] bArr2 = this.g;
            bVar2.update(bArr2, 0, bArr2.length);
        }
        int b10 = this.f10056a.b(bArr, 0);
        int i = this.f10058c;
        while (true) {
            byte[] bArr3 = this.g;
            if (i >= bArr3.length) {
                break;
            }
            bArr3[i] = 0;
            i++;
        }
        d dVar2 = this.f10059d;
        if (dVar2 != null) {
            ((d) this.f10056a).e(dVar2);
        } else {
            b bVar3 = this.f10056a;
            byte[] bArr4 = this.f10061f;
            bVar3.update(bArr4, 0, bArr4.length);
        }
        return b10;
    }

    public final void b(lg.a aVar) {
        byte[] bArr;
        this.f10056a.reset();
        byte[] bArr2 = ((f) aVar).f10449a;
        int length = bArr2.length;
        if (length > this.f10058c) {
            this.f10056a.update(bArr2, 0, length);
            this.f10056a.b(this.f10061f, 0);
            length = this.f10057b;
        } else {
            System.arraycopy(bArr2, 0, this.f10061f, 0, length);
        }
        while (true) {
            bArr = this.f10061f;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.g, 0, this.f10058c);
        byte[] bArr3 = this.f10061f;
        int i = this.f10058c;
        for (int i10 = 0; i10 < i; i10++) {
            bArr3[i10] = (byte) (bArr3[i10] ^ 54);
        }
        byte[] bArr4 = this.g;
        int i11 = this.f10058c;
        for (int i12 = 0; i12 < i11; i12++) {
            bArr4[i12] = (byte) (bArr4[i12] ^ 92);
        }
        b bVar = this.f10056a;
        if (bVar instanceof d) {
            d a10 = ((d) bVar).a();
            this.f10060e = a10;
            ((b) a10).update(this.g, 0, this.f10058c);
        }
        b bVar2 = this.f10056a;
        byte[] bArr5 = this.f10061f;
        bVar2.update(bArr5, 0, bArr5.length);
        b bVar3 = this.f10056a;
        if (bVar3 instanceof d) {
            this.f10059d = ((d) bVar3).a();
        }
    }

    public final void c(byte b10) {
        this.f10056a.f(b10);
    }

    public final void d(byte[] bArr, int i) {
        this.f10056a.update(bArr, 0, i);
    }
}
