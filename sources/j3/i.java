package j3;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import c4.j;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class i implements c {

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config f7030j = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final j f7031a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f7032b;

    /* renamed from: c  reason: collision with root package name */
    public final a f7033c;

    /* renamed from: d  reason: collision with root package name */
    public long f7034d;

    /* renamed from: e  reason: collision with root package name */
    public long f7035e;

    /* renamed from: f  reason: collision with root package name */
    public int f7036f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public int f7037h;
    public int i;

    public static final class a {
    }

    public i(long j10) {
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f7034d = j10;
        this.f7031a = lVar;
        this.f7032b = unmodifiableSet;
        this.f7033c = new a();
    }

    public final void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            i(0);
        } else if (i10 >= 20 || i10 == 15) {
            i(this.f7034d / 2);
        }
    }

    public final void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        i(0);
    }

    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        Bitmap h10 = h(i10, i11, config);
        if (h10 != null) {
            return h10;
        }
        if (config == null) {
            config = f7030j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap h10 = h(i10, i11, config);
        if (h10 != null) {
            h10.eraseColor(0);
            return h10;
        }
        if (config == null) {
            config = f7030j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final synchronized void e(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (!bitmap.isRecycled()) {
            if (bitmap.isMutable()) {
                Objects.requireNonNull((l) this.f7031a);
                if (((long) j.d(bitmap)) <= this.f7034d) {
                    if (this.f7032b.contains(bitmap.getConfig())) {
                        Objects.requireNonNull((l) this.f7031a);
                        int d10 = j.d(bitmap);
                        ((l) this.f7031a).f(bitmap);
                        Objects.requireNonNull(this.f7033c);
                        this.f7037h++;
                        this.f7035e += (long) d10;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + ((l) this.f7031a).e(bitmap));
                        }
                        f();
                        i(this.f7034d);
                        return;
                    }
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((l) this.f7031a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f7032b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } else {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        }
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        StringBuilder d10 = a.a.d("Hits=");
        d10.append(this.f7036f);
        d10.append(", misses=");
        d10.append(this.g);
        d10.append(", puts=");
        d10.append(this.f7037h);
        d10.append(", evictions=");
        d10.append(this.i);
        d10.append(", currentSize=");
        d10.append(this.f7035e);
        d10.append(", maxSize=");
        d10.append(this.f7034d);
        d10.append("\nStrategy=");
        d10.append(this.f7031a);
        Log.v("LruBitmapPool", d10.toString());
    }

    public final synchronized Bitmap h(int i10, int i11, Bitmap.Config config) {
        Bitmap b10;
        if (Build.VERSION.SDK_INT >= 26) {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        }
        b10 = ((l) this.f7031a).b(i10, i11, config != null ? config : f7030j);
        if (b10 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Missing bitmap=");
                Objects.requireNonNull((l) this.f7031a);
                sb2.append(l.c(j.c(i10, i11, config), config));
                Log.d("LruBitmapPool", sb2.toString());
            }
            this.g++;
        } else {
            this.f7036f++;
            long j10 = this.f7035e;
            Objects.requireNonNull((l) this.f7031a);
            this.f7035e = j10 - ((long) j.d(b10));
            Objects.requireNonNull(this.f7033c);
            b10.setHasAlpha(true);
            b10.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Get bitmap=");
            Objects.requireNonNull((l) this.f7031a);
            sb3.append(l.c(j.c(i10, i11, config), config));
            Log.v("LruBitmapPool", sb3.toString());
        }
        f();
        return b10;
    }

    public final synchronized void i(long j10) {
        while (this.f7035e > j10) {
            l lVar = (l) this.f7031a;
            Bitmap d10 = lVar.f7043b.d();
            if (d10 != null) {
                lVar.a(Integer.valueOf(j.d(d10)), d10);
            }
            if (d10 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    g();
                }
                this.f7035e = 0;
                return;
            }
            Objects.requireNonNull(this.f7033c);
            long j11 = this.f7035e;
            Objects.requireNonNull((l) this.f7031a);
            this.f7035e = j11 - ((long) j.d(d10));
            this.i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((l) this.f7031a).e(d10));
            }
            f();
            d10.recycle();
        }
    }
}
