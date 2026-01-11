package t3;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import c4.f;
import com.bumptech.glide.load.ImageHeaderParser;
import f3.d;
import f3.e;
import g3.h;
import g3.j;
import i3.w;
import j3.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public final class a implements j<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0223a f11283f = new C0223a();
    public static final b g = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f11284a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f11285b;

    /* renamed from: c  reason: collision with root package name */
    public final b f11286c;

    /* renamed from: d  reason: collision with root package name */
    public final C0223a f11287d;

    /* renamed from: e  reason: collision with root package name */
    public final b f11288e;

    /* renamed from: t3.a$a  reason: collision with other inner class name */
    public static class C0223a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<d> f11289a = new ArrayDeque(0);

        public b() {
            char[] cArr = c4.j.f3244a;
        }
    }

    public a(Context context, List<ImageHeaderParser> list, c cVar, j3.b bVar) {
        b bVar2 = g;
        C0223a aVar = f11283f;
        this.f11284a = context.getApplicationContext();
        this.f11285b = list;
        this.f11287d = aVar;
        this.f11288e = new b(cVar, bVar);
        this.f11286c = bVar2;
    }

    public static int d(f3.c cVar, int i, int i10) {
        int i11;
        int min = Math.min(cVar.g / i10, cVar.f4951f / i);
        if (min == 0) {
            i11 = 0;
        } else {
            i11 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i11);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i10 + "], actual dimens: [" + cVar.f4951f + "x" + cVar.g + "]");
        }
        return max;
    }

    public final boolean a(Object obj, h hVar) throws IOException {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) hVar.c(h.f11326b)).booleanValue()) {
            return false;
        }
        List<ImageHeaderParser> list = this.f11285b;
        if (byteBuffer == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
                ImageHeaderParser.ImageType a10 = list.get(i).a(byteBuffer);
                if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    imageType = a10;
                    break;
                }
                i++;
            }
        }
        if (imageType == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Queue<f3.d>, java.util.ArrayDeque] */
    /* JADX WARNING: type inference failed for: r11v1, types: [java.util.Queue<f3.d>, java.util.ArrayDeque] */
    /* JADX WARNING: type inference failed for: r11v2, types: [java.util.Queue<f3.d>, java.util.ArrayDeque] */
    public final w b(Object obj, int i, int i10, h hVar) throws IOException {
        d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        b bVar = this.f11286c;
        synchronized (bVar) {
            d dVar2 = (d) bVar.f11289a.poll();
            if (dVar2 == null) {
                dVar2 = new d();
            }
            dVar = dVar2;
            dVar.f4956b = null;
            Arrays.fill(dVar.f4955a, (byte) 0);
            dVar.f4957c = new f3.c();
            dVar.f4958d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f4956b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f4956b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            d c10 = c(byteBuffer, i, i10, dVar, hVar);
            b bVar2 = this.f11286c;
            synchronized (bVar2) {
                dVar.f4956b = null;
                dVar.f4957c = null;
                bVar2.f11289a.offer(dVar);
            }
            return c10;
        } catch (Throwable th2) {
            b bVar3 = this.f11286c;
            synchronized (bVar3) {
                dVar.f4956b = null;
                dVar.f4957c = null;
                bVar3.f11289a.offer(dVar);
                throw th2;
            }
        }
    }

    public final d c(ByteBuffer byteBuffer, int i, int i10, d dVar, h hVar) {
        Bitmap.Config config;
        int i11 = f.f3234b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            f3.c b10 = dVar.b();
            if (b10.f4948c > 0) {
                if (b10.f4947b == 0) {
                    if (hVar.c(h.f11325a) == g3.b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    int d10 = d(b10, i, i10);
                    C0223a aVar = this.f11287d;
                    b bVar = this.f11288e;
                    Objects.requireNonNull(aVar);
                    e eVar = new e(bVar, b10, byteBuffer, d10);
                    eVar.h(config);
                    eVar.f4967k = (eVar.f4967k + 1) % eVar.f4968l.f4948c;
                    Bitmap b11 = eVar.b();
                    if (b11 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder d11 = a.a.d("Decoded GIF from stream in ");
                            d11.append(f.a(elapsedRealtimeNanos));
                            Log.v("BufferGifDecoder", d11.toString());
                        }
                        return null;
                    }
                    d dVar2 = new d(new c(this.f11284a, eVar, o3.b.f9311b, i, i10, b11));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder d12 = a.a.d("Decoded GIF from stream in ");
                        d12.append(f.a(elapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", d12.toString());
                    }
                    return dVar2;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder d13 = a.a.d("Decoded GIF from stream in ");
                d13.append(f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", d13.toString());
            }
        }
    }
}
