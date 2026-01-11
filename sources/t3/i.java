package t3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.c;
import g3.h;
import g3.j;
import i3.w;
import j3.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class i implements j<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f11327a;

    /* renamed from: b  reason: collision with root package name */
    public final j<ByteBuffer, c> f11328b;

    /* renamed from: c  reason: collision with root package name */
    public final b f11329c;

    public i(List<ImageHeaderParser> list, j<ByteBuffer, c> jVar, b bVar) {
        this.f11327a = list;
        this.f11328b = jVar;
        this.f11329c = bVar;
    }

    public final boolean a(Object obj, h hVar) throws IOException {
        return !((Boolean) hVar.c(h.f11326b)).booleanValue() && c.c(this.f11327a, (InputStream) obj, this.f11329c) == ImageHeaderParser.ImageType.GIF;
    }

    public final w b(Object obj, int i, int i10, h hVar) throws IOException {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f11328b.b(ByteBuffer.wrap(bArr), i, i10, hVar);
    }
}
