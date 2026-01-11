package a3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<PathMeasure> f50a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<Path> f51b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<Path> f52c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<float[]> f53d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final float f54e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f  reason: collision with root package name */
    public static float f55f = -1.0f;

    public class a extends ThreadLocal<PathMeasure> {
        public final Object initialValue() {
            return new PathMeasure();
        }
    }

    public class b extends ThreadLocal<Path> {
        public final Object initialValue() {
            return new Path();
        }
    }

    public class c extends ThreadLocal<Path> {
        public final Object initialValue() {
            return new Path();
        }
    }

    public class d extends ThreadLocal<float[]> {
        public final Object initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f10, float f11, float f12) {
        PathMeasure pathMeasure = f50a.get();
        Path path2 = f51b.get();
        Path path3 = f52c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            ad.c.E();
        } else if (length < 1.0f || ((double) Math.abs((f11 - f10) - 1.0f)) < 0.01d) {
            ad.c.E();
        } else {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float min = Math.min(f13, f14) + f15;
            float max = Math.max(f13, f14) + f15;
            if (min >= length && max >= length) {
                min = (float) f.d(min, length);
                max = (float) f.d(max, length);
            }
            if (min < 0.0f) {
                min = (float) f.d(min, length);
            }
            if (max < 0.0f) {
                max = (float) f.d(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                ad.c.E();
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            ad.c.E();
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        if (f55f == -1.0f) {
            f55f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f55f;
    }

    public static float d(Matrix matrix) {
        float[] fArr = f53d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f54e;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    public static Bitmap e(Bitmap bitmap, int i, int i10) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i10, true);
        bitmap.recycle();
        return createScaledBitmap;
    }
}
