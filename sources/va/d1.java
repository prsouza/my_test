package va;

import ab.i;
import ab.j;
import ab.k;
import android.view.View;
import eb.a;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import java.util.Map;
import java.util.Objects;
import pb.o;
import ya.f;
import ya.g;

public final class d1 extends b1 implements a.C0072a {
    public final a P;
    public final a Q;
    public long R = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d1(androidx.databinding.e r13, android.view.View r14) {
        /*
            r12 = this;
            r0 = 6
            r1 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r13, r14, r0, r1, r1)
            r2 = 4
            r2 = r0[r2]
            r6 = r2
            android.widget.Button r6 = (android.widget.Button) r6
            r2 = 5
            r2 = r0[r2]
            r7 = r2
            android.widget.ImageButton r7 = (android.widget.ImageButton) r7
            r2 = 1
            r3 = r0[r2]
            r8 = r3
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r3 = 3
            r3 = r0[r3]
            r9 = r3
            android.widget.TextView r9 = (android.widget.TextView) r9
            r11 = 2
            r3 = r0[r11]
            r10 = r3
            android.widget.TextView r10 = (android.widget.TextView) r10
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3 = -1
            r12.R = r3
            android.widget.Button r13 = r12.I
            r13.setTag(r1)
            android.widget.ImageButton r13 = r12.J
            r13.setTag(r1)
            android.widget.ImageView r13 = r12.K
            r13.setTag(r1)
            r13 = 0
            r13 = r0[r13]
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            r13.setTag(r1)
            android.widget.TextView r13 = r12.L
            r13.setTag(r1)
            android.widget.TextView r13 = r12.M
            r13.setTag(r1)
            r13 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r14.setTag(r13, r12)
            eb.a r13 = new eb.a
            r13.<init>(r12, r11)
            r12.P = r13
            eb.a r13 = new eb.a
            r13.<init>(r12, r2)
            r12.Q = r13
            r12.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.d1.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        int i10;
        boolean z = false;
        if (i == 1) {
            HomeViewModelV2 homeViewModelV2 = this.N;
            if (homeViewModelV2 != null) {
                z = true;
            }
            if (z) {
                Objects.requireNonNull(homeViewModelV2);
                k kVar = k.f279a;
                i iVar = k.f282d;
                j jVar = iVar != null ? iVar.f275d : null;
                if (jVar == null) {
                    i10 = -1;
                } else {
                    i10 = HomeViewModelV2.b.f6773b[jVar.ordinal()];
                }
                if (i10 == 1) {
                    homeViewModelV2.f6766t.b(new f.a(g.LOCATION_PERMISSION_REQUEST_DIALOG, (Map<String, ? extends Object>) null));
                } else if (i10 == 2) {
                    homeViewModelV2.f6766t.b(new f.a(g.BLE_PERMISSION_REQUEST_DIALOG, (Map<String, ? extends Object>) null));
                } else if (i10 == 3) {
                    homeViewModelV2.f6766t.b(new f.a(g.LOCATION_ENABLE_REQUEST_DIALOG, (Map<String, ? extends Object>) null));
                }
                homeViewModelV2.m(HomeViewModelV2.a.INIT_SHEET_ACTION);
            }
        } else if (i == 2) {
            o oVar = (o) this.O;
            if (oVar != null) {
                z = true;
            }
            if (z) {
                oVar.dismiss();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.R     // Catch:{ all -> 0x0053 }
            r2 = 0
            r8.R = r2     // Catch:{ all -> 0x0053 }
            monitor-exit(r8)     // Catch:{ all -> 0x0053 }
            r4 = 0
            r5 = 4
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x002b
            ab.k r2 = ab.k.f279a
            ab.i r2 = ab.k.f282d
            if (r2 == 0) goto L_0x0020
            java.lang.Integer r1 = r2.f277f
            java.lang.String r3 = r2.f274c
            java.lang.String r4 = r2.f273b
            java.lang.String r2 = r2.f272a
            goto L_0x0023
        L_0x0020:
            r2 = r1
            r3 = r2
            r4 = r3
        L_0x0023:
            int r1 = androidx.databinding.ViewDataBinding.p(r1)
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x002e
        L_0x002b:
            r2 = r1
            r3 = r4
            r4 = r2
        L_0x002e:
            if (r0 == 0) goto L_0x0052
            android.widget.Button r0 = r8.I
            eb.a r5 = r8.Q
            r0.setOnClickListener(r5)
            android.widget.Button r0 = r8.I
            u0.a.a(r0, r1)
            android.widget.ImageButton r0 = r8.J
            eb.a r1 = r8.P
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r8.K
            r0.setImageResource(r3)
            android.widget.TextView r0 = r8.L
            u0.a.a(r0, r4)
            android.widget.TextView r0 = r8.M
            u0.a.a(r0, r2)
        L_0x0052:
            return
        L_0x0053:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0053 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: va.d1.c():void");
    }

    public final boolean g() {
        synchronized (this) {
            if (this.R != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.R = 4;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        return false;
    }

    public final boolean s(int i, Object obj) {
        if (1 == i) {
            this.O = (o) obj;
            synchronized (this) {
                this.R |= 1;
            }
            b(1);
            o();
            return true;
        } else if (3 != i) {
            return false;
        } else {
            this.N = (HomeViewModelV2) obj;
            synchronized (this) {
                this.R |= 2;
            }
            b(3);
            o();
            return true;
        }
    }
}
