package p3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import c4.a;
import g3.h;
import g3.j;
import i3.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class t implements j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final d f9634a = new d();

    public final /* bridge */ /* synthetic */ boolean a(Object obj, h hVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        return true;
    }

    public final w b(Object obj, int i, int i10, h hVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        AtomicReference<byte[]> atomicReference = a.f3219a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = a.f3219a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                a.f3219a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.f9634a.b(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i, i10, hVar);
            }
        }
    }
}
