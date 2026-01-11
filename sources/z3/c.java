package z3;

import android.graphics.drawable.Drawable;
import c4.j;
import net.jpountz.lz4.LZ4FrameOutputStream;

public abstract class c<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f13782a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13783b;

    /* renamed from: c  reason: collision with root package name */
    public y3.c f13784c;

    public c() {
        if (j.j(LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK)) {
            this.f13782a = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            this.f13783b = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    public final void a(g gVar) {
        gVar.c(this.f13782a, this.f13783b);
    }

    public final void b(g gVar) {
    }

    public final void c(Drawable drawable) {
    }

    public final void d(Drawable drawable) {
    }

    public final void e(y3.c cVar) {
        this.f13784c = cVar;
    }

    public final y3.c getRequest() {
        return this.f13784c;
    }

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }
}
