package z3;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import y3.c;

@Deprecated
public abstract class i<T extends View, Z> extends a<Z> {

    /* renamed from: a  reason: collision with root package name */
    public final T f13786a;

    /* renamed from: b  reason: collision with root package name */
    public final a f13787b;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static Integer f13788d;

        /* renamed from: a  reason: collision with root package name */
        public final View f13789a;

        /* renamed from: b  reason: collision with root package name */
        public final List<g> f13790b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public C0264a f13791c;

        /* renamed from: z3.i$a$a  reason: collision with other inner class name */
        public static final class C0264a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            public final WeakReference<a> f13792a;

            public C0264a(a aVar) {
                this.f13792a = new WeakReference<>(aVar);
            }

            /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<z3.g>, java.util.ArrayList] */
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f13792a.get();
                if (aVar == null || aVar.f13790b.isEmpty()) {
                    return true;
                }
                int d10 = aVar.d();
                int c10 = aVar.c();
                if (!aVar.e(d10, c10)) {
                    return true;
                }
                Iterator it = new ArrayList(aVar.f13790b).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).c(d10, c10);
                }
                aVar.a();
                return true;
            }
        }

        public a(View view) {
            this.f13789a = view;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<z3.g>, java.util.ArrayList] */
        public final void a() {
            ViewTreeObserver viewTreeObserver = this.f13789a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f13791c);
            }
            this.f13791c = null;
            this.f13790b.clear();
        }

        public final int b(int i, int i10, int i11) {
            int i12 = i10 - i11;
            if (i12 > 0) {
                return i12;
            }
            int i13 = i - i11;
            if (i13 > 0) {
                return i13;
            }
            if (this.f13789a.isLayoutRequested() || i10 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f13789a.getContext();
            if (f13788d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f13788d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f13788d.intValue();
        }

        public final int c() {
            int paddingBottom = this.f13789a.getPaddingBottom() + this.f13789a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f13789a.getLayoutParams();
            return b(this.f13789a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int d() {
            int paddingRight = this.f13789a.getPaddingRight() + this.f13789a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f13789a.getLayoutParams();
            return b(this.f13789a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final boolean e(int i, int i10) {
            if (!(i > 0 || i == Integer.MIN_VALUE)) {
                return false;
            }
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }
    }

    public i(T t10) {
        this.f13786a = t10;
        this.f13787b = new a(t10);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<z3.g>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List<z3.g>, java.util.ArrayList] */
    public final void a(g gVar) {
        a aVar = this.f13787b;
        int d10 = aVar.d();
        int c10 = aVar.c();
        if (aVar.e(d10, c10)) {
            gVar.c(d10, c10);
            return;
        }
        if (!aVar.f13790b.contains(gVar)) {
            aVar.f13790b.add(gVar);
        }
        if (aVar.f13791c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f13789a.getViewTreeObserver();
            a.C0264a aVar2 = new a.C0264a(aVar);
            aVar.f13791c = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<z3.g>, java.util.ArrayList] */
    public final void b(g gVar) {
        this.f13787b.f13790b.remove(gVar);
    }

    public final void e(c cVar) {
        this.f13786a.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    public final c getRequest() {
        Object tag = this.f13786a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof c) {
            return (c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Target for: ");
        d10.append(this.f13786a);
        return d10.toString();
    }
}
