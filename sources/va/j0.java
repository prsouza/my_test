package va;

import android.view.View;
import eb.a;
import io.nodle.cash.ui.viewmodel.OnboardViewModel;
import java.util.List;
import java.util.Map;
import ya.b;
import ya.f;
import ya.g;

public final class j0 extends i0 implements a.C0072a {
    public final a P;
    public final a Q;
    public long R = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j0(androidx.databinding.e r13, android.view.View r14) {
        /*
            r12 = this;
            r0 = 6
            r1 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r13, r14, r0, r1, r1)
            r2 = 3
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 4
            r2 = r0[r2]
            r7 = r2
            android.widget.Button r7 = (android.widget.Button) r7
            r2 = 5
            r2 = r0[r2]
            r8 = r2
            android.widget.Button r8 = (android.widget.Button) r8
            r2 = 1
            r3 = r0[r2]
            r9 = r3
            android.widget.ImageView r9 = (android.widget.ImageView) r9
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
            android.widget.TextView r13 = r12.I
            r13.setTag(r1)
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r13.setTag(r1)
            android.widget.Button r13 = r12.J
            r13.setTag(r1)
            android.widget.Button r13 = r12.K
            r13.setTag(r1)
            android.widget.ImageView r13 = r12.L
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
        throw new UnsupportedOperationException("Method not decompiled: va.j0.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        ub.a aVar = null;
        boolean z = false;
        if (i == 1) {
            OnboardViewModel onboardViewModel = this.N;
            if (onboardViewModel != null) {
                int i10 = OnboardViewModel.c.f6805a[onboardViewModel.f6802w.ordinal()];
                if (i10 == 1) {
                    onboardViewModel.f6799t.b(new f.a(g.NODLE_ACKNOWLEDGE, (Map<String, ? extends Object>) null));
                    onboardViewModel.k();
                } else if (i10 == 2) {
                    onboardViewModel.f6799t.b(new f.a(g.WALLET_CREATE, (Map<String, ? extends Object>) null));
                    onboardViewModel.i((List<String>) null);
                } else if (i10 == 3) {
                    onboardViewModel.k();
                } else if (i10 == 4) {
                    ub.a metadata = onboardViewModel.f6799t.getMetadata();
                    if (metadata != null && metadata.f11924k) {
                        z = true;
                    }
                    if (!z) {
                        onboardViewModel.f6799t.b(new f.a(g.WALLET_SETUP_DONE, (Map<String, ? extends Object>) null));
                        b bVar = onboardViewModel.f6799t;
                        ub.a metadata2 = bVar.getMetadata();
                        if (metadata2 != null) {
                            aVar = ub.a.a(metadata2, false, false, false, false, false, true, 1023);
                        }
                        bVar.d(aVar);
                    }
                    onboardViewModel.j(OnboardViewModel.a.ONBOARD_COMPLETE);
                }
            }
        } else if (i == 2) {
            OnboardViewModel onboardViewModel2 = this.N;
            if (onboardViewModel2 != null) {
                z = true;
            }
            if (z) {
                if (OnboardViewModel.c.f6805a[onboardViewModel2.f6802w.ordinal()] == 2) {
                    onboardViewModel2.f6799t.b(new f.a(g.WALLET_IMPORT, (Map<String, ? extends Object>) null));
                    onboardViewModel2.f6804y.j(Boolean.TRUE);
                    onboardViewModel2.j(OnboardViewModel.a.LOAD_IMPORT);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: io.nodle.cash.ui.viewmodel.OnboardViewModel$b} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            long r2 = r1.R     // Catch:{ all -> 0x0107 }
            r4 = 0
            r1.R = r4     // Catch:{ all -> 0x0107 }
            monitor-exit(r20)     // Catch:{ all -> 0x0107 }
            io.nodle.cash.ui.viewmodel.OnboardViewModel r0 = r1.N
            r6 = 3
            long r8 = r2 & r6
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r9 = 0
            r10 = 0
            if (r8 == 0) goto L_0x00c4
            r11 = 1
            if (r0 == 0) goto L_0x0072
            io.nodle.cash.ui.viewmodel.OnboardViewModel$b r9 = r0.f6802w
            int[] r12 = io.nodle.cash.ui.viewmodel.OnboardViewModel.c.f6805a
            int r9 = r9.ordinal()
            r9 = r12[r9]
            r12 = 3
            if (r9 != r12) goto L_0x0059
            qa.f r9 = r0.f6798s
            qa.e r12 = qa.e.REFERRER_NAME
            java.lang.String r9 = r9.c(r12)
            if (r9 == 0) goto L_0x0039
            int r12 = r9.length()
            if (r12 != 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r12 = r10
            goto L_0x003a
        L_0x0039:
            r12 = r11
        L_0x003a:
            if (r12 != 0) goto L_0x004a
            android.content.Context r12 = r0.f6797c
            r13 = 2131755327(0x7f10013f, float:1.914153E38)
            java.lang.Object[] r14 = new java.lang.Object[r11]
            r14[r10] = r9
            java.lang.String r9 = r12.getString(r13, r14)
            goto L_0x0053
        L_0x004a:
            android.content.Context r9 = r0.f6797c
            r12 = 2131755326(0x7f10013e, float:1.9141528E38)
            java.lang.String r9 = r9.getString(r12)
        L_0x0053:
            java.lang.String r12 = "if (!it.isNullOrEmpty())…g(R.string.onboard3Title)"
            e6.e.C(r9, r12)
            goto L_0x006a
        L_0x0059:
            android.content.Context r9 = r0.f6797c
            io.nodle.cash.ui.viewmodel.OnboardViewModel$b r12 = r0.f6802w
            int r12 = r12.getTitle()
            java.lang.String r9 = r9.getString(r12)
            java.lang.String r12 = "context.getString(step.title)"
            e6.e.C(r9, r12)
        L_0x006a:
            io.nodle.cash.ui.viewmodel.OnboardViewModel$b r0 = r0.f6802w
            r19 = r9
            r9 = r0
            r0 = r19
            goto L_0x0073
        L_0x0072:
            r0 = r9
        L_0x0073:
            if (r9 == 0) goto L_0x0086
            int r12 = r9.getDetails()
            int r13 = r9.getImage()
            int r14 = r9.getButton2Label()
            int r9 = r9.getButton1Label()
            goto L_0x008a
        L_0x0086:
            r9 = r10
            r12 = r9
            r13 = r12
            r14 = r13
        L_0x008a:
            r15 = 2131755062(0x7f100036, float:1.9140993E38)
            if (r14 != r15) goto L_0x0092
            r16 = r11
            goto L_0x0094
        L_0x0092:
            r16 = r10
        L_0x0094:
            if (r9 != r15) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r11 = r10
        L_0x0098:
            if (r8 == 0) goto L_0x00a3
            if (r16 == 0) goto L_0x009f
            r17 = 8
            goto L_0x00a1
        L_0x009f:
            r17 = 4
        L_0x00a1:
            long r2 = r2 | r17
        L_0x00a3:
            long r17 = r2 & r6
            int r8 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00b2
            if (r11 == 0) goto L_0x00ae
            r17 = 32
            goto L_0x00b0
        L_0x00ae:
            r17 = 16
        L_0x00b0:
            long r2 = r2 | r17
        L_0x00b2:
            r8 = 8
            if (r16 == 0) goto L_0x00b8
            r15 = r8
            goto L_0x00b9
        L_0x00b8:
            r15 = r10
        L_0x00b9:
            if (r11 == 0) goto L_0x00bc
            r10 = r8
        L_0x00bc:
            r8 = r10
            r10 = r12
            r19 = r9
            r9 = r0
            r0 = r19
            goto L_0x00c9
        L_0x00c4:
            r0 = r10
            r8 = r0
            r13 = r8
            r14 = r13
            r15 = r14
        L_0x00c9:
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00f1
            android.widget.TextView r6 = r1.I
            r6.setText(r10)
            android.widget.Button r6 = r1.J
            r6.setText(r0)
            android.widget.Button r0 = r1.J
            r0.setVisibility(r8)
            android.widget.Button r0 = r1.K
            r0.setText(r14)
            android.widget.Button r0 = r1.K
            r0.setVisibility(r15)
            android.widget.ImageView r0 = r1.L
            r0.setImageResource(r13)
            android.widget.TextView r0 = r1.M
            u0.a.a(r0, r9)
        L_0x00f1:
            r6 = 2
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0106
            android.widget.Button r0 = r1.J
            eb.a r2 = r1.Q
            r0.setOnClickListener(r2)
            android.widget.Button r0 = r1.K
            eb.a r2 = r1.P
            r0.setOnClickListener(r2)
        L_0x0106:
            return
        L_0x0107:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x0107 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: va.j0.c():void");
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
            this.R = 2;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        return false;
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((OnboardViewModel) obj);
        return true;
    }

    public final void v(OnboardViewModel onboardViewModel) {
        this.N = onboardViewModel;
        synchronized (this) {
            this.R |= 1;
        }
        b(3);
        o();
    }
}
