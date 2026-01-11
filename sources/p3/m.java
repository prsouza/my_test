package p3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import c4.j;
import com.bumptech.glide.load.ImageHeaderParser;
import g3.g;
import g3.h;
import g3.i;
import i3.w;
import j3.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final g<g3.b> f9605f = g.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", g3.b.DEFAULT);
    public static final g<i> g = g.a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", i.SRGB);

    /* renamed from: h  reason: collision with root package name */
    public static final g<Boolean> f9606h;
    public static final g<Boolean> i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f9607j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k  reason: collision with root package name */
    public static final a f9608k = new a();

    /* renamed from: l  reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f9609l = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public final c f9610a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f9611b;

    /* renamed from: c  reason: collision with root package name */
    public final j3.b f9612c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f9613d;

    /* renamed from: e  reason: collision with root package name */
    public final r f9614e = r.a();

    public class a implements b {
        public final void a(c cVar, Bitmap bitmap) {
        }

        public final void b() {
        }
    }

    public interface b {
        void a(c cVar, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        g<l> gVar = l.f9604f;
        Boolean bool = Boolean.FALSE;
        f9606h = g.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        i = g.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = j.f3244a;
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, c cVar, j3.b bVar) {
        this.f9613d = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.f9611b = displayMetrics;
        Objects.requireNonNull(cVar, "Argument must not be null");
        this.f9610a = cVar;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.f9612c = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(p3.s r5, android.graphics.BitmapFactory.Options r6, p3.m.b r7, j3.c r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.b()
            r5.b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = p3.z.f9652c
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch:{ IllegalArgumentException -> 0x0021 }
            r4.unlock()
            return r5
        L_0x001f:
            r5 = move-exception
            goto L_0x0048
        L_0x0021:
            r4 = move-exception
            java.io.IOException r1 = h(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x001f }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x001f }
        L_0x0032:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0047
            r8.e(r0)     // Catch:{ IOException -> 0x0046 }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x0046 }
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch:{ IOException -> 0x0046 }
            java.util.concurrent.locks.Lock r6 = p3.z.f9652c
            r6.unlock()
            return r5
        L_0x0046:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0047:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0048:
            java.util.concurrent.locks.Lock r6 = p3.z.f9652c
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.m.c(p3.s, android.graphics.BitmapFactory$Options, p3.m$b, j3.c):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder d10 = a.a.d(" (");
        d10.append(bitmap.getAllocationByteCount());
        d10.append(")");
        String sb2 = d10.toString();
        StringBuilder d11 = a.a.d("[");
        d11.append(bitmap.getWidth());
        d11.append("x");
        d11.append(bitmap.getHeight());
        d11.append("] ");
        d11.append(bitmap.getConfig());
        d11.append(sb2);
        return d11.toString();
    }

    public static int e(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    public static int[] f(s sVar, BitmapFactory.Options options, b bVar, c cVar) throws IOException {
        options.inJustDecodeBounds = true;
        c(sVar, options, bVar, cVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static boolean g(int i10) {
        return i10 == 90 || i10 == 270;
    }

    public static IOException h(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void i(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [java.util.Queue<android.graphics.BitmapFactory$Options>, java.util.ArrayDeque] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.util.Queue<android.graphics.BitmapFactory$Options>, java.util.ArrayDeque] */
    public final w<Bitmap> a(s sVar, int i10, int i11, h hVar, b bVar) throws IOException {
        ? r14;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        h hVar2 = hVar;
        byte[] bArr = (byte[]) this.f9612c.d(LZ4Constants.MAX_DISTANCE, byte[].class);
        synchronized (m.class) {
            r14 = f9609l;
            synchronized (r14) {
                options = (BitmapFactory.Options) r14.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                i(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        g3.b bVar2 = (g3.b) hVar2.c(f9605f);
        i iVar = (i) hVar2.c(g);
        l lVar = (l) hVar2.c(l.f9604f);
        boolean booleanValue = ((Boolean) hVar2.c(f9606h)).booleanValue();
        g gVar = i;
        try {
            e e10 = e.e(b(sVar, options2, lVar, bVar2, iVar, hVar2.c(gVar) != null && ((Boolean) hVar2.c(gVar)).booleanValue(), i10, i11, booleanValue, bVar), this.f9610a);
            i(options2);
            synchronized (r14) {
                r14.offer(options2);
            }
            this.f9612c.c(bArr);
            return e10;
        } catch (Throwable th2) {
            i(options2);
            ? r22 = f9609l;
            synchronized (r22) {
                r22.offer(options2);
                this.f9612c.c(bArr);
                throw th2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0335 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03cd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01af A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x023f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(p3.s r33, android.graphics.BitmapFactory.Options r34, p3.l r35, g3.b r36, g3.i r37, boolean r38, int r39, int r40, boolean r41, p3.m.b r42) throws java.io.IOException {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            r9 = r34
            r0 = r35
            r10 = r36
            r11 = r39
            r12 = r40
            r13 = r42
            int r3 = c4.f.f3234b
            long r14 = android.os.SystemClock.elapsedRealtimeNanos()
            j3.c r3 = r1.f9610a
            int[] r3 = f(r2, r9, r13, r3)
            r4 = 0
            r8 = r3[r4]
            r5 = 1
            r7 = r3[r5]
            java.lang.String r6 = r9.outMimeType
            r3 = -1
            if (r8 == r3) goto L_0x002d
            if (r7 != r3) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            r16 = r38
            goto L_0x002f
        L_0x002d:
            r16 = r4
        L_0x002f:
            int r17 = r33.c()
            switch(r17) {
                case 3: goto L_0x003d;
                case 4: goto L_0x003d;
                case 5: goto L_0x003a;
                case 6: goto L_0x003a;
                case 7: goto L_0x0037;
                case 8: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x003f
        L_0x0037:
            r4 = 270(0x10e, float:3.78E-43)
            goto L_0x003f
        L_0x003a:
            r4 = 90
            goto L_0x003f
        L_0x003d:
            r4 = 180(0xb4, float:2.52E-43)
        L_0x003f:
            boolean r18 = p3.z.d(r17)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 != r3) goto L_0x0051
            boolean r5 = g(r4)
            if (r5 == 0) goto L_0x004f
            r5 = r7
            goto L_0x0052
        L_0x004f:
            r5 = r8
            goto L_0x0052
        L_0x0051:
            r5 = r11
        L_0x0052:
            if (r12 != r3) goto L_0x0060
            boolean r3 = g(r4)
            r19 = r6
            if (r3 == 0) goto L_0x005e
            r3 = r8
            goto L_0x0063
        L_0x005e:
            r3 = r7
            goto L_0x0063
        L_0x0060:
            r19 = r6
            r3 = r12
        L_0x0063:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = r33.d()
            r20 = r14
            j3.c r14 = r1.f9610a
            java.lang.String r15 = "]"
            java.lang.String r12 = ", target density: "
            java.lang.String r11 = ", density: "
            java.lang.String r10 = "x"
            java.lang.String r1 = "Downsampler"
            if (r8 <= 0) goto L_0x0299
            if (r7 > 0) goto L_0x0084
            r0 = 3
            r4 = r1
            r13 = r11
            r1 = r12
            r2 = r15
            r12 = r7
            r11 = r10
            r7 = r3
            r10 = r8
            goto L_0x02a2
        L_0x0084:
            boolean r22 = g(r4)
            if (r22 == 0) goto L_0x0093
            r22 = r11
            r23 = r12
            r38 = r15
            r15 = r7
            r11 = r8
            goto L_0x009b
        L_0x0093:
            r22 = r11
            r23 = r12
            r38 = r15
            r11 = r7
            r15 = r8
        L_0x009b:
            float r12 = r0.b(r15, r11, r5, r3)
            r24 = 0
            int r24 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x0253
            r24 = r4
            p3.l$e r4 = r0.a(r15, r11, r5, r3)
            if (r4 == 0) goto L_0x024b
            r25 = r7
            float r7 = (float) r15
            r26 = r10
            float r10 = r12 * r7
            r27 = r1
            double r0 = (double) r10
            r28 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 + r28
            int r0 = (int) r0
            float r1 = (float) r11
            float r10 = r12 * r1
            r30 = r3
            double r2 = (double) r10
            double r2 = r2 + r28
            int r2 = (int) r2
            int r0 = r15 / r0
            int r2 = r11 / r2
            p3.l$e r3 = p3.l.e.MEMORY
            if (r4 != r3) goto L_0x00d2
            int r0 = java.lang.Math.max(r0, r2)
            goto L_0x00d6
        L_0x00d2:
            int r0 = java.lang.Math.min(r0, r2)
        L_0x00d6:
            int r2 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r2 > r10) goto L_0x00ea
            java.util.Set<java.lang.String> r10 = f9607j
            r31 = r8
            java.lang.String r8 = r9.outMimeType
            boolean r8 = r10.contains(r8)
            if (r8 == 0) goto L_0x00ec
            r0 = 1
            goto L_0x0101
        L_0x00ea:
            r31 = r8
        L_0x00ec:
            int r0 = java.lang.Integer.highestOneBit(r0)
            r8 = 1
            int r0 = java.lang.Math.max(r8, r0)
            if (r4 != r3) goto L_0x0101
            float r3 = (float) r0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 / r12
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0101
            int r0 = r0 << 1
        L_0x0101:
            r9.inSampleSize = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r6 != r3) goto L_0x0129
            r2 = 8
            int r2 = java.lang.Math.min(r0, r2)
            float r2 = (float) r2
            float r7 = r7 / r2
            double r3 = (double) r7
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            float r1 = r1 / r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            int r2 = r0 / 8
            if (r2 <= 0) goto L_0x0122
            int r3 = r3 / r2
            int r1 = r1 / r2
        L_0x0122:
            r10 = r33
        L_0x0124:
            r2 = r35
            r7 = r30
            goto L_0x0189
        L_0x0129:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r6 == r3) goto L_0x0177
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r6 != r3) goto L_0x0132
            goto L_0x0177
        L_0x0132:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
            if (r6 == r3) goto L_0x0156
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
            if (r6 != r3) goto L_0x013b
            goto L_0x0156
        L_0x013b:
            int r1 = r15 % r0
            if (r1 != 0) goto L_0x0149
            int r1 = r11 % r0
            if (r1 == 0) goto L_0x0144
            goto L_0x0149
        L_0x0144:
            int r3 = r15 / r0
            int r1 = r11 / r0
            goto L_0x0122
        L_0x0149:
            r10 = r33
            int[] r1 = f(r10, r9, r13, r14)
            r2 = 0
            r3 = r1[r2]
            r2 = 1
            r1 = r1[r2]
            goto L_0x0124
        L_0x0156:
            r10 = r33
            r3 = 24
            if (r2 < r3) goto L_0x0168
            float r2 = (float) r0
            float r7 = r7 / r2
            int r3 = java.lang.Math.round(r7)
            float r1 = r1 / r2
            int r1 = java.lang.Math.round(r1)
            goto L_0x0124
        L_0x0168:
            float r2 = (float) r0
            float r7 = r7 / r2
            double r3 = (double) r7
            double r3 = java.lang.Math.floor(r3)
            int r3 = (int) r3
            float r1 = r1 / r2
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
            goto L_0x0187
        L_0x0177:
            r10 = r33
            float r2 = (float) r0
            float r7 = r7 / r2
            double r3 = (double) r7
            double r3 = java.lang.Math.floor(r3)
            int r3 = (int) r3
            float r1 = r1 / r2
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
        L_0x0187:
            int r1 = (int) r1
            goto L_0x0124
        L_0x0189:
            float r2 = r2.b(r3, r1, r5, r7)
            double r14 = (double) r2
            int r2 = e(r14)
            double r10 = (double) r2
            double r10 = r10 * r14
            double r10 = r10 + r28
            int r4 = (int) r10
            float r6 = (float) r4
            float r2 = (float) r2
            float r6 = r6 / r2
            double r10 = (double) r6
            double r10 = r14 / r10
            r8 = r12
            double r12 = (double) r4
            double r10 = r10 * r12
            double r10 = r10 + r28
            int r2 = (int) r10
            r9.inTargetDensity = r2
            int r2 = e(r14)
            r9.inDensity = r2
            int r4 = r9.inTargetDensity
            if (r4 <= 0) goto L_0x01b5
            if (r2 <= 0) goto L_0x01b5
            if (r4 == r2) goto L_0x01b5
            r2 = 1
            goto L_0x01b6
        L_0x01b5:
            r2 = 0
        L_0x01b6:
            if (r2 == 0) goto L_0x01bc
            r2 = 1
            r9.inScaled = r2
            goto L_0x01c1
        L_0x01bc:
            r2 = 0
            r9.inTargetDensity = r2
            r9.inDensity = r2
        L_0x01c1:
            r2 = 2
            r4 = r27
            boolean r2 = android.util.Log.isLoggable(r4, r2)
            if (r2 == 0) goto L_0x023f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Calculate scaling, source: ["
            r2.append(r6)
            r10 = r31
            r2.append(r10)
            r11 = r26
            r2.append(r11)
            r12 = r25
            r2.append(r12)
            java.lang.String r6 = "], degreesToRotate: "
            r2.append(r6)
            r6 = r24
            r2.append(r6)
            java.lang.String r6 = ", target: ["
            r2.append(r6)
            r2.append(r5)
            r2.append(r11)
            r2.append(r7)
            java.lang.String r6 = "], power of two scaled: ["
            r2.append(r6)
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            java.lang.String r1 = "], exact scale factor: "
            r2.append(r1)
            r1 = r8
            r2.append(r1)
            java.lang.String r1 = ", power of 2 sample size: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", adjusted scale factor: "
            r2.append(r0)
            r2.append(r14)
            r1 = r23
            r2.append(r1)
            int r0 = r9.inTargetDensity
            r2.append(r0)
            r13 = r22
            r2.append(r13)
            int r0 = r9.inDensity
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.v(r4, r0)
            goto L_0x02cd
        L_0x023f:
            r13 = r22
            r1 = r23
            r12 = r25
            r11 = r26
            r10 = r31
            goto L_0x02cd
        L_0x024b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x0253:
            r2 = r0
            r11 = r10
            r1 = r12
            r12 = r7
            r10 = r8
            r7 = r3
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot scale with factor: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " from: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = ", source: ["
            r3.append(r1)
            r3.append(r10)
            r3.append(r11)
            r3.append(r12)
            java.lang.String r1 = "], target: ["
            r3.append(r1)
            r3.append(r5)
            r3.append(r11)
            r3.append(r7)
            r2 = r38
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0299:
            r4 = r1
            r13 = r11
            r1 = r12
            r2 = r15
            r12 = r7
            r11 = r10
            r7 = r3
            r10 = r8
            r0 = 3
        L_0x02a2:
            boolean r0 = android.util.Log.isLoggable(r4, r0)
            if (r0 == 0) goto L_0x02cd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unable to determine dimensions for: "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r3 = " with target ["
            r0.append(r3)
            r0.append(r5)
            r0.append(r11)
            r0.append(r7)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
        L_0x02cd:
            r2 = r32
            r14 = r4
            p3.r r3 = r2.f9614e
            r22 = r7
            r4 = r5
            r23 = r5
            r5 = r22
            r8 = r19
            r6 = r34
            r7 = r16
            r15 = r8
            r8 = r18
            boolean r0 = r3.c(r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x02ea
            r4 = r11
            goto L_0x0328
        L_0x02ea:
            g3.b r0 = g3.b.PREFER_ARGB_8888
            r3 = r36
            r4 = r11
            if (r3 == r0) goto L_0x032a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r33.d()     // Catch:{ IOException -> 0x02fa }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x02fa }
            goto L_0x0317
        L_0x02fa:
            r0 = move-exception
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r14, r5)
            if (r5 == 0) goto L_0x0316
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Cannot determine whether the image has alpha or not from header, format "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.d(r14, r3, r0)
        L_0x0316:
            r0 = 0
        L_0x0317:
            if (r0 == 0) goto L_0x031c
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x031e
        L_0x031c:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x031e:
            r9.inPreferredConfig = r0
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r3) goto L_0x0328
            r0 = 1
            r9.inDither = r0
            goto L_0x032f
        L_0x0328:
            r0 = 1
            goto L_0x032f
        L_0x032a:
            r0 = 1
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            r9.inPreferredConfig = r3
        L_0x032f:
            int r3 = android.os.Build.VERSION.SDK_INT
            int r5 = r9.inSampleSize
            if (r10 < 0) goto L_0x0341
            if (r12 < 0) goto L_0x0341
            if (r41 == 0) goto L_0x0341
            r2 = r22
            r5 = r23
            r23 = r1
            goto L_0x03c8
        L_0x0341:
            int r6 = r9.inTargetDensity
            if (r6 <= 0) goto L_0x034c
            int r7 = r9.inDensity
            if (r7 <= 0) goto L_0x034c
            if (r6 == r7) goto L_0x034c
            goto L_0x034d
        L_0x034c:
            r0 = 0
        L_0x034d:
            if (r0 == 0) goto L_0x0355
            float r0 = (float) r6
            int r6 = r9.inDensity
            float r6 = (float) r6
            float r0 = r0 / r6
            goto L_0x0357
        L_0x0355:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0357:
            float r6 = (float) r10
            float r7 = (float) r5
            float r6 = r6 / r7
            r23 = r1
            double r1 = (double) r6
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            float r2 = (float) r12
            float r2 = r2 / r7
            double r6 = (double) r2
            double r6 = java.lang.Math.ceil(r6)
            int r2 = (int) r6
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            float r2 = (float) r2
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r14, r6)
            if (r6 == 0) goto L_0x03c7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Calculated target ["
            r6.append(r7)
            r6.append(r1)
            r6.append(r4)
            r6.append(r2)
            java.lang.String r7 = "] for source ["
            r6.append(r7)
            r6.append(r10)
            r6.append(r4)
            r6.append(r12)
            java.lang.String r7 = "], sampleSize: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = ", targetDensity: "
            r6.append(r5)
            int r5 = r9.inTargetDensity
            r6.append(r5)
            r6.append(r13)
            int r5 = r9.inDensity
            r6.append(r5)
            java.lang.String r5 = ", density multiplier: "
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.v(r14, r0)
        L_0x03c7:
            r5 = r1
        L_0x03c8:
            r0 = 0
            r1 = 26
            if (r5 <= 0) goto L_0x03eb
            if (r2 <= 0) goto L_0x03eb
            r6 = r32
            j3.c r7 = r6.f9610a
            if (r3 < r1) goto L_0x03df
            android.graphics.Bitmap$Config r8 = r9.inPreferredConfig
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.HARDWARE
            if (r8 != r11) goto L_0x03dc
            goto L_0x03ed
        L_0x03dc:
            android.graphics.Bitmap$Config r8 = r9.outConfig
            goto L_0x03e0
        L_0x03df:
            r8 = r0
        L_0x03e0:
            if (r8 != 0) goto L_0x03e4
            android.graphics.Bitmap$Config r8 = r9.inPreferredConfig
        L_0x03e4:
            android.graphics.Bitmap r2 = r7.c(r5, r2, r8)
            r9.inBitmap = r2
            goto L_0x03ed
        L_0x03eb:
            r6 = r32
        L_0x03ed:
            r2 = 28
            if (r3 < r2) goto L_0x0412
            g3.i r1 = g3.i.DISPLAY_P3
            r2 = r37
            if (r2 != r1) goto L_0x0403
            android.graphics.ColorSpace r1 = r9.outColorSpace
            if (r1 == 0) goto L_0x0403
            boolean r1 = r1.isWideGamut()
            if (r1 == 0) goto L_0x0403
            r1 = 1
            goto L_0x0404
        L_0x0403:
            r1 = 0
        L_0x0404:
            if (r1 == 0) goto L_0x0409
            android.graphics.ColorSpace$Named r1 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x040b
        L_0x0409:
            android.graphics.ColorSpace$Named r1 = android.graphics.ColorSpace.Named.SRGB
        L_0x040b:
            android.graphics.ColorSpace r1 = android.graphics.ColorSpace.get(r1)
            r9.inPreferredColorSpace = r1
            goto L_0x041c
        L_0x0412:
            if (r3 < r1) goto L_0x041c
            android.graphics.ColorSpace$Named r1 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r1 = android.graphics.ColorSpace.get(r1)
            r9.inPreferredColorSpace = r1
        L_0x041c:
            j3.c r1 = r6.f9610a
            r2 = r33
            r3 = r42
            android.graphics.Bitmap r1 = c(r2, r9, r3, r1)
            j3.c r2 = r6.f9610a
            r3.a(r2, r1)
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r14, r2)
            if (r2 == 0) goto L_0x04b5
            java.lang.String r2 = "Decoded "
            java.lang.StringBuilder r2 = a.a.d(r2)
            java.lang.String r3 = d(r1)
            r2.append(r3)
            java.lang.String r3 = " from ["
            r2.append(r3)
            r2.append(r10)
            r2.append(r4)
            r2.append(r12)
            java.lang.String r3 = "] "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = " with inBitmap "
            r2.append(r3)
            android.graphics.Bitmap r3 = r9.inBitmap
            java.lang.String r3 = d(r3)
            r2.append(r3)
            java.lang.String r3 = " for ["
            r2.append(r3)
            r3 = r39
            r5 = r13
            r2.append(r3)
            r2.append(r4)
            r3 = r40
            r4 = r23
            r2.append(r3)
            java.lang.String r3 = "], sample size: "
            r2.append(r3)
            int r3 = r9.inSampleSize
            r2.append(r3)
            r2.append(r5)
            int r3 = r9.inDensity
            r2.append(r3)
            r2.append(r4)
            int r3 = r9.inTargetDensity
            r2.append(r3)
            java.lang.String r3 = ", thread: "
            r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ", duration: "
            r2.append(r3)
            double r3 = c4.f.a(r20)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r14, r2)
        L_0x04b5:
            if (r1 == 0) goto L_0x054f
            android.util.DisplayMetrics r0 = r6.f9611b
            int r0 = r0.densityDpi
            r1.setDensity(r0)
            j3.c r0 = r6.f9610a
            boolean r2 = p3.z.d(r17)
            if (r2 != 0) goto L_0x04c9
            r0 = r1
            goto L_0x0544
        L_0x04c9:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4 = 1119092736(0x42b40000, float:90.0)
            r5 = 1127481344(0x43340000, float:180.0)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r17) {
                case 2: goto L_0x0501;
                case 3: goto L_0x04fd;
                case 4: goto L_0x04f4;
                case 5: goto L_0x04eb;
                case 6: goto L_0x04e7;
                case 7: goto L_0x04de;
                case 8: goto L_0x04da;
                default: goto L_0x04d9;
            }
        L_0x04d9:
            goto L_0x0506
        L_0x04da:
            r2.setRotate(r3)
            goto L_0x0506
        L_0x04de:
            r2.setRotate(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r7, r3)
            goto L_0x0506
        L_0x04e7:
            r2.setRotate(r4)
            goto L_0x0506
        L_0x04eb:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setRotate(r4)
            r2.postScale(r7, r3)
            goto L_0x0506
        L_0x04f4:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setRotate(r5)
            r2.postScale(r7, r3)
            goto L_0x0506
        L_0x04fd:
            r2.setRotate(r5)
            goto L_0x0506
        L_0x0501:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r7, r3)
        L_0x0506:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r4 = r1.getWidth()
            float r4 = (float) r4
            int r5 = r1.getHeight()
            float r5 = (float) r5
            r7 = 0
            r3.<init>(r7, r7, r4, r5)
            r2.mapRect(r3)
            float r4 = r3.width()
            int r4 = java.lang.Math.round(r4)
            float r5 = r3.height()
            int r5 = java.lang.Math.round(r5)
            android.graphics.Bitmap$Config r7 = p3.z.c(r1)
            android.graphics.Bitmap r0 = r0.d(r4, r5, r7)
            float r4 = r3.left
            float r4 = -r4
            float r3 = r3.top
            float r3 = -r3
            r2.postTranslate(r4, r3)
            boolean r3 = r1.hasAlpha()
            r0.setHasAlpha(r3)
            p3.z.a(r1, r0, r2)
        L_0x0544:
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L_0x054f
            j3.c r2 = r6.f9610a
            r2.e(r1)
        L_0x054f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.m.b(p3.s, android.graphics.BitmapFactory$Options, p3.l, g3.b, g3.i, boolean, int, int, boolean, p3.m$b):android.graphics.Bitmap");
    }
}
