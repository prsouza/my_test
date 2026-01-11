package p3;

import android.graphics.drawable.BitmapDrawable;
import g3.h;
import g3.k;
import i3.w;
import j3.c;
import java.io.File;
import l6.a0;
import l6.c2;
import o6.y;
import o6.z;

public final class b implements k, z {

    /* renamed from: a  reason: collision with root package name */
    public Object f9573a;

    /* renamed from: b  reason: collision with root package name */
    public Object f9574b;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f9573a = obj;
        this.f9574b = obj2;
    }

    public final boolean f(Object obj, File file, h hVar) {
        return ((k) this.f9574b).f(new e(((BitmapDrawable) ((w) obj).get()).getBitmap(), (c) this.f9573a), file, hVar);
    }

    public final g3.c h(h hVar) {
        return ((k) this.f9574b).h(hVar);
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        return new c2((a0) ((z) this.f9573a).zza(), y.a((z) this.f9574b));
    }
}
