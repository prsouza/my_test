package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import net.jpountz.lz4.LZ4FrameOutputStream;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.n f2585a;

    /* renamed from: b  reason: collision with root package name */
    public int f2586b = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f2587c = new Rect();

    public s(RecyclerView.n nVar) {
        this.f2585a = nVar;
    }

    public static s a(RecyclerView.n nVar, int i) {
        if (i == 0) {
            return new q(nVar);
        }
        if (i == 1) {
            return new r(nVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f2586b) {
            return 0;
        }
        return l() - this.f2586b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);
}
