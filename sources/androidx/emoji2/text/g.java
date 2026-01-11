package androidx.emoji2.text;

import java.nio.ByteBuffer;
import w0.a;
import w0.b;

public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<a> f1722d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f1723a;

    /* renamed from: b  reason: collision with root package name */
    public final o f1724b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1725c = 0;

    public g(o oVar, int i) {
        this.f1724b = oVar;
        this.f1723a = i;
    }

    public final int a(int i) {
        a e10 = e();
        int a10 = e10.a(16);
        if (a10 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = e10.f12539b;
        int i10 = a10 + e10.f12538a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final int b() {
        a e10 = e();
        int a10 = e10.a(16);
        if (a10 == 0) {
            return 0;
        }
        int i = a10 + e10.f12538a;
        return e10.f12539b.getInt(e10.f12539b.getInt(i) + i);
    }

    public final short c() {
        a e10 = e();
        int a10 = e10.a(14);
        if (a10 != 0) {
            return e10.f12539b.getShort(a10 + e10.f12538a);
        }
        return 0;
    }

    public final int d() {
        a e10 = e();
        int a10 = e10.a(4);
        if (a10 != 0) {
            return e10.f12539b.getInt(a10 + e10.f12538a);
        }
        return 0;
    }

    public final a e() {
        ThreadLocal<a> threadLocal = f1722d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = this.f1724b.f1754a;
        int i = this.f1723a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i10 = a10 + bVar.f12538a;
            int i11 = (i * 4) + bVar.f12539b.getInt(i10) + i10 + 4;
            aVar.b(bVar.f12539b.getInt(i11) + i11, bVar.f12539b);
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(d()));
        sb2.append(", codepoints:");
        int b10 = b();
        for (int i = 0; i < b10; i++) {
            sb2.append(Integer.toHexString(a(i)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
