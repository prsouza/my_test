package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import w0.b;

public final class n {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f1753a;

        public a(ByteBuffer byteBuffer) {
            this.f1753a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final long a() throws IOException {
            return ((long) this.f1753a.getInt()) & 4294967295L;
        }

        public final void b(int i) throws IOException {
            ByteBuffer byteBuffer = this.f1753a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    public static b a(ByteBuffer byteBuffer) throws IOException {
        long j10;
        ByteBuffer duplicate = byteBuffer.duplicate();
        a aVar = new a(duplicate);
        aVar.b(4);
        short s10 = duplicate.getShort() & 65535;
        if (s10 <= 100) {
            aVar.b(6);
            int i = 0;
            while (true) {
                if (i >= s10) {
                    j10 = -1;
                    break;
                }
                int i10 = aVar.f1753a.getInt();
                aVar.b(4);
                j10 = aVar.a();
                aVar.b(4);
                if (1835365473 == i10) {
                    break;
                }
                i++;
            }
            if (j10 != -1) {
                aVar.b((int) (j10 - ((long) aVar.f1753a.position())));
                aVar.b(12);
                long a10 = aVar.a();
                for (int i11 = 0; ((long) i11) < a10; i11++) {
                    int i12 = aVar.f1753a.getInt();
                    long a11 = aVar.a();
                    aVar.a();
                    if (1164798569 == i12 || 1701669481 == i12) {
                        duplicate.position((int) (a11 + j10));
                        b bVar = new b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
