package p3;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import g3.g;
import g3.j;
import i3.w;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Objects;

public final class b0<T> implements j<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final g3.g<Long> f9575d = new g3.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final g3.g<Integer> f9576e = new g3.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f9577f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f9578a;

    /* renamed from: b  reason: collision with root package name */
    public final j3.c f9579b;

    /* renamed from: c  reason: collision with root package name */
    public final e f9580c;

    public class a implements g.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f9581a = ByteBuffer.allocate(8);

        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l10 = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.f9581a) {
                this.f9581a.position(0);
                messageDigest.update(this.f9581a.putLong(l10.longValue()).array());
            }
        }
    }

    public class b implements g.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f9582a = ByteBuffer.allocate(4);

        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f9582a) {
                    this.f9582a.position(0);
                    messageDigest.update(this.f9582a.putInt(num.intValue()).array());
                }
            }
        }
    }

    public static final class c implements f<AssetFileDescriptor> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    public static final class d implements f<ByteBuffer> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new c0((ByteBuffer) obj));
        }
    }

    public static class e {
    }

    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    public static final class g implements f<ParcelFileDescriptor> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public b0(j3.c cVar, f<T> fVar) {
        e eVar = f9577f;
        this.f9579b = cVar;
        this.f9578a = fVar;
        this.f9580c = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, p3.l r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L_0x0060
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x0060
            if (r14 == r0) goto L_0x0060
            p3.l$d r0 = p3.l.f9602d
            if (r15 == r0) goto L_0x0060
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ all -> 0x0051 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0051 }
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch:{ all -> 0x0051 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0051 }
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch:{ all -> 0x0051 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0051 }
            r3 = 90
            if (r2 == r3) goto L_0x0036
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x0039
        L_0x0036:
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0039:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r0     // Catch:{ all -> 0x0051 }
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r1     // Catch:{ all -> 0x0051 }
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch:{ all -> 0x0051 }
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch:{ all -> 0x0051 }
            goto L_0x0061
        L_0x0051:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L_0x0060
            java.lang.String r14 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r15, r14, r13)
        L_0x0060:
            r13 = 0
        L_0x0061:
            if (r13 != 0) goto L_0x0067
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L_0x0067:
            if (r13 == 0) goto L_0x006a
            return r13
        L_0x006a:
            p3.b0$h r9 = new p3.b0$h
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.b0.c(android.media.MediaMetadataRetriever, long, int, int, int, p3.l):android.graphics.Bitmap");
    }

    public final boolean a(T t10, g3.h hVar) {
        return true;
    }

    /* JADX INFO: finally extract failed */
    public final w<Bitmap> b(T t10, int i, int i10, g3.h hVar) throws IOException {
        long longValue = ((Long) hVar.c(f9575d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) hVar.c(f9576e);
            if (num == null) {
                num = 2;
            }
            l lVar = (l) hVar.c(l.f9604f);
            if (lVar == null) {
                lVar = l.f9603e;
            }
            l lVar2 = lVar;
            Objects.requireNonNull(this.f9580c);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f9578a.a(mediaMetadataRetriever, t10);
                Bitmap c10 = c(mediaMetadataRetriever, longValue, num.intValue(), i, i10, lVar2);
                mediaMetadataRetriever.release();
                return e.e(c10, this.f9579b);
            } catch (Throwable th2) {
                mediaMetadataRetriever.release();
                throw th2;
            }
        } else {
            throw new IllegalArgumentException(android.support.v4.media.a.d("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
    }
}
