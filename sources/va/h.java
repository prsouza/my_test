package va;

import android.util.SparseIntArray;
import io.nodle.cash.R;
import je.n;
import tb.r;

public final class h extends g {
    public static final SparseIntArray M;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.titleTextView, 4);
        sparseIntArray.put(R.id.fragmentContainerLayout, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(androidx.databinding.e r7, android.view.View r8) {
        /*
            r6 = this;
            android.util.SparseIntArray r0 = M
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r7, r8, r1, r2, r0)
            r1 = 5
            r1 = r0[r1]
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1 = 2
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 1
            r3 = r0[r3]
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r4 = 4
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4 = 3
            r5 = r0[r4]
            if (r5 == 0) goto L_0x0028
            r4 = r0[r4]
            android.view.View r4 = (android.view.View) r4
            c3.k.K(r4)
        L_0x0028:
            r6.<init>(r7, r8, r1, r3)
            r3 = -1
            r6.L = r3
            r7 = 0
            r7 = r0[r7]
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r7.setTag(r2)
            android.widget.TextView r7 = r6.I
            r7.setTag(r2)
            androidx.recyclerview.widget.RecyclerView r7 = r6.J
            r7.setTag(r2)
            r7 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r8.setTag(r7, r6)
            r6.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.h.<init>(androidx.databinding.e, android.view.View):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: gb.g} */
    /* JADX WARNING: type inference failed for: r4v7, types: [je.n<gb.g>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r11 = this;
            monitor-enter(r11)
            long r0 = r11.L     // Catch:{ all -> 0x0063 }
            r2 = 0
            r11.L = r2     // Catch:{ all -> 0x0063 }
            monitor-exit(r11)     // Catch:{ all -> 0x0063 }
            tb.r r4 = r11.K
            r5 = 7
            long r7 = r0 & r5
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L_0x0052
            r9 = 0
            if (r4 == 0) goto L_0x0019
            je.n<gb.g> r4 = r4.f11518v
            goto L_0x001a
        L_0x0019:
            r4 = r9
        L_0x001a:
            r10 = 1
            r11.D = r10
            ge.g0 r10 = ge.g0.f5390a     // Catch:{ all -> 0x004e }
            r11.u(r8, r4, r10)     // Catch:{ all -> 0x004e }
            r11.D = r8
            if (r4 == 0) goto L_0x002d
            java.lang.Object r4 = r4.getValue()
            r9 = r4
            gb.g r9 = (gb.g) r9
        L_0x002d:
            if (r9 == 0) goto L_0x0032
            boolean r4 = r9.f5328b
            goto L_0x0033
        L_0x0032:
            r4 = r8
        L_0x0033:
            if (r7 == 0) goto L_0x0043
            if (r4 == 0) goto L_0x003d
            r9 = 16
            long r0 = r0 | r9
            r9 = 64
            goto L_0x0042
        L_0x003d:
            r9 = 8
            long r0 = r0 | r9
            r9 = 32
        L_0x0042:
            long r0 = r0 | r9
        L_0x0043:
            r7 = 8
            if (r4 == 0) goto L_0x0049
            r9 = r8
            goto L_0x004a
        L_0x0049:
            r9 = r7
        L_0x004a:
            if (r4 == 0) goto L_0x0053
            r8 = r7
            goto L_0x0053
        L_0x004e:
            r0 = move-exception
            r11.D = r8
            throw r0
        L_0x0052:
            r9 = r8
        L_0x0053:
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
            android.widget.TextView r0 = r11.I
            r0.setVisibility(r8)
            androidx.recyclerview.widget.RecyclerView r0 = r11.J
            r0.setVisibility(r9)
        L_0x0062:
            return
        L_0x0063:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0063 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: va.h.c():void");
    }

    public final boolean g() {
        synchronized (this) {
            if (this.L != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.L = 4;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        if (i != 0) {
            return false;
        }
        n nVar = (n) obj;
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((r) obj);
        return true;
    }

    public final void v(r rVar) {
        this.K = rVar;
        synchronized (this) {
            this.L |= 2;
        }
        b(3);
        o();
    }
}
