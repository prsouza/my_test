package pi;

import e6.e;
import java.nio.ByteBuffer;
import y.c;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public int f10066a = 65535;

    public final byte[] a() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) (~this.f10066a));
        byte[] array = allocate.array();
        e.C(array, "buf.array()");
        return array;
    }

    public final void write(int i) {
        int i10 = this.f10066a;
        this.f10066a = c.f13322v[(i ^ (i10 & 255)) & 255] ^ (i10 >>> 8);
    }
}
