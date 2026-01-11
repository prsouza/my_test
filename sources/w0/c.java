package w0;

import aa.b;
import java.nio.ByteBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f12538a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f12539b;

    /* renamed from: c  reason: collision with root package name */
    public int f12540c;

    /* renamed from: d  reason: collision with root package name */
    public int f12541d;

    public c() {
        if (b.H == null) {
            b.H = new b();
        }
    }

    public final int a(int i) {
        if (i < this.f12541d) {
            return this.f12539b.getShort(this.f12540c + i);
        }
        return 0;
    }

    public final void b(int i, ByteBuffer byteBuffer) {
        this.f12539b = byteBuffer;
        if (byteBuffer != null) {
            this.f12538a = i;
            int i10 = i - byteBuffer.getInt(i);
            this.f12540c = i10;
            this.f12541d = this.f12539b.getShort(i10);
            return;
        }
        this.f12538a = 0;
        this.f12540c = 0;
        this.f12541d = 0;
    }
}
