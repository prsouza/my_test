package pi;

import com.github.mikephil.charting.BuildConfig;
import e6.e;
import java.nio.ByteBuffer;
import ui.c;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public long f10067a = 4294967295L;

    /* renamed from: b  reason: collision with root package name */
    public String f10068b = BuildConfig.FLAVOR;

    public final byte[] a() {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (~this.f10067a));
        byte[] array = allocate.array();
        e.C(array, "buf.array()");
        return array;
    }

    public final void write(int i) {
        StringBuilder q10 = a.b.q(this.f10068b);
        q10.append(c.a(new byte[]{(byte) (i & 255)}));
        this.f10068b = q10.toString();
        long j10 = this.f10067a;
        this.f10067a = (j10 >>> 8) ^ y.c.f13323w[(int) (255 & ((j10 & 255) ^ ((long) i)))];
    }
}
