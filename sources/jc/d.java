package jc;

import ce.b;
import ce.c;
import e6.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import nd.g;
import nd.u;
import net.jpountz.xxhash.XXHash64;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f7150a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7151b;

    /* renamed from: c  reason: collision with root package name */
    public final XXHash64 f7152c;

    public d(int i, XXHash64 xXHash64) {
        this.f7152c = xXHash64;
        if (i % 64 == 0) {
            this.f7150a = i / 8;
            this.f7151b = i / 64;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final byte[] a(byte[] bArr) {
        e.D(bArr, "byteArray");
        ByteBuffer allocate = ByteBuffer.allocate(this.f7150a);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        c C0 = ad.c.C0(0, this.f7151b);
        ArrayList arrayList = new ArrayList(g.S0(C0));
        Iterator it = C0.iterator();
        while (((b) it).f3435c) {
            int a10 = ((u) it).a();
            XXHash64 xXHash64 = this.f7152c;
            e.D(xXHash64, "$this$hash");
            byte[] bArr2 = bArr;
            arrayList.add(Long.valueOf(xXHash64.hash(bArr2, 0, bArr.length, (long) a10)));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            allocate.putLong(((Number) it2.next()).longValue());
        }
        byte[] array = allocate.array();
        e.C(array, "buffer.array()");
        return array;
    }
}
