package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;
import o0.b;
import o0.c;

public final class x extends n0.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f2593d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2594e;

    public static class a extends n0.a {

        /* renamed from: d  reason: collision with root package name */
        public final x f2595d;

        /* renamed from: e  reason: collision with root package name */
        public Map<View, n0.a> f2596e = new WeakHashMap();

        public a(x xVar) {
            this.f2595d = xVar;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<android.view.View, n0.a>, java.util.WeakHashMap] */
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f2596e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<android.view.View, n0.a>, java.util.WeakHashMap] */
        public final c b(View view) {
            n0.a aVar = (n0.a) this.f2596e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<android.view.View, n0.a>, java.util.WeakHashMap] */
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f2596e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        /* JADX WARNING: type inference failed for: r0v9, types: [java.util.Map<android.view.View, n0.a>, java.util.WeakHashMap] */
        public final void d(View view, b bVar) {
            if (this.f2595d.j() || this.f2595d.f2593d.getLayoutManager() == null) {
                this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
                return;
            }
            this.f2595d.f2593d.getLayoutManager().a0(view, bVar);
            n0.a aVar = (n0.a) this.f2596e.get(view);
            if (aVar != null) {
                aVar.d(view, bVar);
            } else {
                this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
            }
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<android.view.View, n0.a>, java.util.WeakHashMap] */
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f2596e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<android.view.View, n0.a>, java.util.WeakHashMap] */
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f2596e.get(viewGroup);
            if (aVar != null) {
                return aVar.f(viewGroup, view, accessibilityEvent);
            }
            return super.f(viewGroup, view, accessibilityEvent);
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [java.util.Map<android.view.View, n0.a>, java.util.WeakHashMap] */
        public final boolean g(View view, int i, Bundle bundle) {
            if (this.f2595d.j() || this.f2595d.f2593d.getLayoutManager() == null) {
                return super.g(view, i, bundle);
            }
            n0.a aVar = (n0.a) this.f2596e.get(view);
            if (aVar != null) {
                if (aVar.g(view, i, bundle)) {
                    return true;
                }
            } else if (super.g(view, i, bundle)) {
                return true;
            }
            RecyclerView.t tVar = this.f2595d.f2593d.getLayoutManager().f2343b.f2269b;
            return false;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<android.view.View, n0.a>, java.util.WeakHashMap] */
        public final void h(View view, int i) {
            n0.a aVar = (n0.a) this.f2596e.get(view);
            if (aVar != null) {
                aVar.h(view, i);
            } else {
                super.h(view, i);
            }
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<android.view.View, n0.a>, java.util.WeakHashMap] */
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = (n0.a) this.f2596e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public x(RecyclerView recyclerView) {
        this.f2593d = recyclerView;
        a aVar = this.f2594e;
        if (aVar != null) {
            this.f2594e = aVar;
        } else {
            this.f2594e = new a(this);
        }
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !j()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().Z(accessibilityEvent);
            }
        }
    }

    public final void d(View view, b bVar) {
        this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
        if (!j() && this.f2593d.getLayoutManager() != null) {
            RecyclerView.n layoutManager = this.f2593d.getLayoutManager();
            RecyclerView recyclerView = layoutManager.f2343b;
            RecyclerView.t tVar = recyclerView.f2269b;
            RecyclerView.y yVar = recyclerView.f2294v0;
            if (recyclerView.canScrollVertically(-1) || layoutManager.f2343b.canScrollHorizontally(-1)) {
                bVar.a(LZ4Constants.HASH_TABLE_SIZE_64K);
                bVar.w();
            }
            if (layoutManager.f2343b.canScrollVertically(1) || layoutManager.f2343b.canScrollHorizontally(1)) {
                bVar.a(LZ4Constants.HASH_TABLE_SIZE);
                bVar.w();
            }
            bVar.p(b.C0175b.a(layoutManager.P(tVar, yVar), layoutManager.z(tVar, yVar), 0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L_0x0008
            return r6
        L_0x0008:
            boolean r4 = r3.j()
            r0 = 0
            if (r4 != 0) goto L_0x008f
            androidx.recyclerview.widget.RecyclerView r4 = r3.f2593d
            androidx.recyclerview.widget.RecyclerView$n r4 = r4.getLayoutManager()
            if (r4 == 0) goto L_0x008f
            androidx.recyclerview.widget.RecyclerView r4 = r3.f2593d
            androidx.recyclerview.widget.RecyclerView$n r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r1 = r4.f2343b
            androidx.recyclerview.widget.RecyclerView$t r2 = r1.f2269b
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L_0x0058
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r2) goto L_0x002c
            r5 = r0
            r1 = r5
            goto L_0x0083
        L_0x002c:
            r5 = -1
            boolean r1 = r1.canScrollVertically(r5)
            if (r1 == 0) goto L_0x0041
            int r1 = r4.f2356q
            int r2 = r4.M()
            int r1 = r1 - r2
            int r2 = r4.J()
            int r1 = r1 - r2
            int r1 = -r1
            goto L_0x0042
        L_0x0041:
            r1 = r0
        L_0x0042:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f2343b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L_0x0082
            int r5 = r4.f2355p
            int r2 = r4.K()
            int r5 = r5 - r2
            int r2 = r4.L()
            int r5 = r5 - r2
            int r5 = -r5
            goto L_0x0083
        L_0x0058:
            boolean r5 = r1.canScrollVertically(r6)
            if (r5 == 0) goto L_0x006c
            int r5 = r4.f2356q
            int r1 = r4.M()
            int r5 = r5 - r1
            int r1 = r4.J()
            int r5 = r5 - r1
            r1 = r5
            goto L_0x006d
        L_0x006c:
            r1 = r0
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f2343b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L_0x0082
            int r5 = r4.f2355p
            int r2 = r4.K()
            int r5 = r5 - r2
            int r2 = r4.L()
            int r5 = r5 - r2
            goto L_0x0083
        L_0x0082:
            r5 = r0
        L_0x0083:
            if (r1 != 0) goto L_0x0089
            if (r5 != 0) goto L_0x0089
            r6 = r0
            goto L_0x008e
        L_0x0089:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f2343b
            r4.g0(r5, r1, r6)
        L_0x008e:
            return r6
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.x.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public final boolean j() {
        return this.f2593d.M();
    }
}
