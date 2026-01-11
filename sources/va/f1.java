package va;

import android.view.View;
import eb.a;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import pb.o;

public final class f1 extends e1 implements a.C0072a {
    public final a N;
    public long O = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f1(androidx.databinding.e r11, android.view.View r12) {
        /*
            r10 = this;
            r0 = 5
            r1 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r11, r12, r0, r1, r1)
            r2 = 4
            r2 = r0[r2]
            r6 = r2
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r2 = 2
            r2 = r0[r2]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 3
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = 1
            r3 = r0[r2]
            r9 = r3
            android.widget.TextView r9 = (android.widget.TextView) r9
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r10.O = r3
            android.widget.ImageButton r11 = r10.I
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r11.setTag(r1)
            android.widget.TextView r11 = r10.J
            r11.setTag(r1)
            android.widget.TextView r11 = r10.K
            r11.setTag(r1)
            android.widget.TextView r11 = r10.L
            r11.setTag(r1)
            r11 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r12.setTag(r11, r10)
            eb.a r11 = new eb.a
            r11.<init>(r10, r2)
            r10.N = r11
            r10.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.f1.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        o oVar = this.M;
        if (oVar != null) {
            oVar.dismiss();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.O     // Catch:{ all -> 0x0036 }
            r2 = 0
            r6.O = r2     // Catch:{ all -> 0x0036 }
            monitor-exit(r6)     // Catch:{ all -> 0x0036 }
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x001b
            ab.k r2 = ab.k.f279a
            ab.i r2 = ab.k.f282d
            if (r2 == 0) goto L_0x001b
            java.lang.String r3 = r2.f273b
            java.lang.String r2 = r2.f272a
            goto L_0x001d
        L_0x001b:
            r2 = r1
            r3 = r2
        L_0x001d:
            if (r0 == 0) goto L_0x0035
            android.widget.ImageButton r0 = r6.I
            eb.a r4 = r6.N
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r6.J
            u0.a.a(r0, r3)
            android.widget.TextView r0 = r6.K
            u0.a.a(r0, r1)
            android.widget.TextView r0 = r6.L
            u0.a.a(r0, r2)
        L_0x0035:
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: va.f1.c():void");
    }

    public final boolean g() {
        synchronized (this) {
            if (this.O != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.O = 4;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        return false;
    }

    public final boolean s(int i, Object obj) {
        if (1 == i) {
            this.M = (o) obj;
            synchronized (this) {
                this.O |= 1;
            }
            b(1);
            o();
            return true;
        } else if (3 != i) {
            return false;
        } else {
            HomeViewModelV2 homeViewModelV2 = (HomeViewModelV2) obj;
            return true;
        }
    }
}
