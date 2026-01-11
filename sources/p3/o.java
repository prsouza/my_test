package p3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import g3.l;
import i3.w;
import j3.c;
import java.security.MessageDigest;

public final class o implements l<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f9616b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9617c;

    public o(l<Bitmap> lVar, boolean z) {
        this.f9616b = lVar;
        this.f9617c = z;
    }

    public final w<Drawable> a(Context context, w<Drawable> wVar, int i, int i10) {
        c cVar = b.b(context).f3493a;
        Drawable drawable = wVar.get();
        w<Bitmap> a10 = n.a(cVar, drawable, i, i10);
        if (a10 != null) {
            w<Bitmap> a11 = this.f9616b.a(context, a10, i, i10);
            if (!a11.equals(a10)) {
                return u.e(context.getResources(), a11);
            }
            a11.d();
            return wVar;
        } else if (!this.f9617c) {
            return wVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public final void b(MessageDigest messageDigest) {
        this.f9616b.b(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f9616b.equals(((o) obj).f9616b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9616b.hashCode();
    }
}
