package p3;

import android.graphics.Bitmap;
import c4.a;
import g3.h;
import g3.j;
import i3.w;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p3.s;

public final class g implements j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f9590a;

    public g(m mVar) {
        this.f9590a = mVar;
    }

    public final boolean a(Object obj, h hVar) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        Objects.requireNonNull(this.f9590a);
        return true;
    }

    public final w b(Object obj, int i, int i10, h hVar) throws IOException {
        AtomicReference<byte[]> atomicReference = a.f3219a;
        a.C0034a aVar = new a.C0034a((ByteBuffer) obj);
        m mVar = this.f9590a;
        return mVar.a(new s.a(aVar, mVar.f9613d, mVar.f9612c), i, i10, hVar, m.f9608k);
    }
}
