package t3;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import g3.l;
import i3.w;
import java.security.MessageDigest;
import java.util.Objects;

public final class e implements l<c> {

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f11303b;

    public e(l<Bitmap> lVar) {
        Objects.requireNonNull(lVar, "Argument must not be null");
        this.f11303b = lVar;
    }

    public final w<c> a(Context context, w<c> wVar, int i, int i10) {
        c cVar = wVar.get();
        p3.e eVar = new p3.e(cVar.b(), b.b(context).f3493a);
        w<Bitmap> a10 = this.f11303b.a(context, eVar, i, i10);
        if (!eVar.equals(a10)) {
            eVar.d();
        }
        l<Bitmap> lVar = this.f11303b;
        cVar.f11292a.f11302a.c(lVar, a10.get());
        return wVar;
    }

    public final void b(MessageDigest messageDigest) {
        this.f11303b.b(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f11303b.equals(((e) obj).f11303b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11303b.hashCode();
    }
}
