package hc;

import fa.b;
import fa.c;
import java.nio.ByteBuffer;
import java.util.Objects;
import md.m;
import xd.l;
import yd.g;

public final /* synthetic */ class e extends g implements l<CharSequence, m> {
    public e(c cVar) {
        super(cVar, c.class, "append", "append(Ljava/lang/CharSequence;)V", 0);
    }

    public final Object k(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        c cVar = (c) this.f13605b;
        Objects.requireNonNull(cVar);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            b bVar = cVar.f5046a;
            ByteBuffer byteBuffer = bVar.f5044a;
            byteBuffer.put((byte) (((byte) (charAt >> 8)) ^ bVar.f5045b.get(byteBuffer.position())));
            b bVar2 = cVar.f5046a;
            ByteBuffer byteBuffer2 = bVar2.f5044a;
            byteBuffer2.put((byte) (((byte) (charAt & 255)) ^ bVar2.f5045b.get(byteBuffer2.position())));
        }
        return m.f8555a;
    }
}
