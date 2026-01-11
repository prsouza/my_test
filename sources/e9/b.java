package e9;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import d9.f;
import e6.e;
import md.h;

public final class b extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final h f4785a = new h(new a(this));

    public static final class a extends yd.h implements xd.a<e> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f4786b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            super(0);
            this.f4786b = bVar;
        }

        public final Object c() {
            Resources a10 = b.super.getResources();
            if (a10 instanceof e) {
                return (e) a10;
            }
            e.C(a10, "s");
            f fVar = f.f4380d;
            return new e(a10, f.f4379c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        e.D(context, "base");
    }

    public final Resources getResources() {
        return (Resources) this.f4785a.a();
    }
}
