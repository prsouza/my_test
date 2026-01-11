package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import eb.a;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HistoryDetailViewModel;
import java.util.Objects;

public final class o0 extends n0 implements a.C0072a {
    public static final SparseIntArray b0;
    public final RelativeLayout Q;
    public final TextView R;
    public final RelativeLayout S;
    public final Button T;
    public final TextView U;
    public final TextView V;
    public final Button W;
    public final a X;
    public final a Y;
    public final a Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f12426a0 = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b0 = sparseIntArray;
        sparseIntArray.put(R.id.primaryTextView, 14);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o0(androidx.databinding.e r14, android.view.View r15) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = b0
            r1 = 15
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r14, r15, r1, r2, r0)
            r1 = 3
            r3 = r0[r1]
            r7 = r3
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3 = 13
            r3 = r0[r3]
            r8 = r3
            android.widget.ImageButton r8 = (android.widget.ImageButton) r8
            r3 = 14
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 4
            r3 = r0[r3]
            r9 = r3
            android.widget.TextView r9 = (android.widget.TextView) r9
            r3 = 12
            r3 = r0[r3]
            r10 = r3
            android.widget.TextView r10 = (android.widget.TextView) r10
            r3 = 2
            r4 = r0[r3]
            r11 = r4
            android.widget.TextView r11 = (android.widget.TextView) r11
            r4 = 6
            r4 = r0[r4]
            r12 = r4
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r4 = r13
            r5 = r14
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r4 = -1
            r13.f12426a0 = r4
            android.widget.TextView r14 = r13.I
            r14.setTag(r2)
            android.widget.ImageButton r14 = r13.J
            r14.setTag(r2)
            r14 = 0
            r14 = r0[r14]
            android.widget.RelativeLayout r14 = (android.widget.RelativeLayout) r14
            r14.setTag(r2)
            r14 = 1
            r4 = r0[r14]
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r13.Q = r4
            r4.setTag(r2)
            r4 = 10
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r13.R = r4
            r4.setTag(r2)
            r4 = 11
            r4 = r0[r4]
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r13.S = r4
            r4.setTag(r2)
            r4 = 5
            r4 = r0[r4]
            android.widget.Button r4 = (android.widget.Button) r4
            r13.T = r4
            r4.setTag(r2)
            r4 = 7
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r13.U = r4
            r4.setTag(r2)
            r4 = 8
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r13.V = r4
            r4.setTag(r2)
            r4 = 9
            r0 = r0[r4]
            android.widget.Button r0 = (android.widget.Button) r0
            r13.W = r0
            r0.setTag(r2)
            android.widget.TextView r0 = r13.K
            r0.setTag(r2)
            android.widget.TextView r0 = r13.L
            r0.setTag(r2)
            android.widget.TextView r0 = r13.M
            r0.setTag(r2)
            android.widget.LinearLayout r0 = r13.N
            r0.setTag(r2)
            r0 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r15.setTag(r0, r13)
            eb.a r15 = new eb.a
            r15.<init>(r13, r3)
            r13.X = r15
            eb.a r15 = new eb.a
            r15.<init>(r13, r1)
            r13.Y = r15
            eb.a r15 = new eb.a
            r15.<init>(r13, r14)
            r13.Z = r15
            r13.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.o0.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            HistoryDetailViewModel historyDetailViewModel = this.O;
            if (historyDetailViewModel != null) {
                z = true;
            }
            if (z) {
                Objects.requireNonNull(historyDetailViewModel);
                historyDetailViewModel.i(HistoryDetailViewModel.a.SHOW_BLOCK_EXPLORER);
            }
        } else if (i == 2) {
            HistoryDetailViewModel historyDetailViewModel2 = this.O;
            if (historyDetailViewModel2 != null) {
                z = true;
            }
            if (z) {
                Objects.requireNonNull(historyDetailViewModel2);
                historyDetailViewModel2.i(HistoryDetailViewModel.a.SHOW_BLOCK_EXPLORER);
            }
        } else if (i == 3) {
            HistoryDetailViewModel historyDetailViewModel3 = this.O;
            if (historyDetailViewModel3 != null) {
                z = true;
            }
            if (z) {
                Objects.requireNonNull(historyDetailViewModel3);
                historyDetailViewModel3.i(HistoryDetailViewModel.a.HIDE_HISTORY_DETAIL);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r33 = this;
            r1 = r33
            monitor-enter(r33)
            long r2 = r1.f12426a0     // Catch:{ all -> 0x024c }
            r4 = 0
            r1.f12426a0 = r4     // Catch:{ all -> 0x024c }
            monitor-exit(r33)     // Catch:{ all -> 0x024c }
            io.nodle.cash.ui.viewmodel.HistoryDetailViewModel r0 = r1.O
            r6 = 16
            long r8 = r2 & r6
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r9 = 2
            if (r8 == 0) goto L_0x0100
            io.nodle.cash.ui.viewmodel.HistoryDetailViewModel$b r14 = io.nodle.cash.ui.viewmodel.HistoryDetailViewModel.C
            sa.b r14 = io.nodle.cash.ui.viewmodel.HistoryDetailViewModel.D
            if (r14 == 0) goto L_0x0074
            android.view.View r15 = r1.f1668t
            android.content.Context r15 = r15.getContext()
            java.lang.String r15 = r14.a(r15)
            bb.g r11 = r14.z
            bb.g r12 = bb.g.REWARD
            if (r11 != r12) goto L_0x0031
            boolean r11 = r14.A
            if (r11 == 0) goto L_0x0031
            r11 = 1
            goto L_0x0032
        L_0x0031:
            r11 = 0
        L_0x0032:
            java.lang.String r12 = r14.C
            java.lang.String r18 = r14.b()
            bb.g r13 = r14.z
            android.view.View r10 = r1.f1668t
            android.content.Context r10 = r10.getContext()
            boolean r10 = r14.c(r10)
            java.math.BigInteger r14 = r14.f11039s
            java.lang.String r4 = "0"
            if (r14 == 0) goto L_0x007c
            java.text.DecimalFormat r5 = new java.text.DecimalFormat
            r5.<init>(r4)
            r4 = 11
            r5.setMaximumFractionDigits(r4)
            r5.setMinimumFractionDigits(r9)
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r14)
            java.math.BigDecimal r14 = java.math.BigDecimal.TEN
            java.math.BigDecimal r4 = r14.pow(r4)
            java.math.BigDecimal r4 = r9.divide(r4)
            java.lang.String r9 = "rawNodle.toBigDecimal().…pow(AMOUNT_MAX_DECIMALS))"
            e6.e.C(r4, r9)
            java.lang.String r4 = r5.format(r4)
            if (r4 != 0) goto L_0x007c
            java.lang.String r4 = "0.00"
            goto L_0x007c
        L_0x0074:
            r4 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r18 = 0
        L_0x007c:
            if (r8 == 0) goto L_0x008c
            if (r11 == 0) goto L_0x0086
            r8 = 256(0x100, double:1.265E-321)
            long r2 = r2 | r8
            r8 = 16384(0x4000, double:8.0948E-320)
            goto L_0x008b
        L_0x0086:
            r8 = 128(0x80, double:6.32E-322)
            long r2 = r2 | r8
            r8 = 8192(0x2000, double:4.0474E-320)
        L_0x008b:
            long r2 = r2 | r8
        L_0x008c:
            long r8 = r2 & r6
            r21 = 0
            int r5 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r5 == 0) goto L_0x009e
            if (r10 == 0) goto L_0x009a
            r8 = 65536(0x10000, double:3.2379E-319)
            goto L_0x009d
        L_0x009a:
            r8 = 32768(0x8000, double:1.61895E-319)
        L_0x009d:
            long r2 = r2 | r8
        L_0x009e:
            if (r11 == 0) goto L_0x00a3
            r5 = 8
            goto L_0x00a4
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            if (r11 == 0) goto L_0x00a8
            r8 = 0
            goto L_0x00aa
        L_0x00a8:
            r8 = 8
        L_0x00aa:
            bb.g r9 = bb.g.REWARD
            if (r13 != r9) goto L_0x00b0
            r9 = 1
            goto L_0x00b1
        L_0x00b0:
            r9 = 0
        L_0x00b1:
            if (r10 == 0) goto L_0x00b6
            r10 = 8
            goto L_0x00b7
        L_0x00b6:
            r10 = 0
        L_0x00b7:
            android.widget.TextView r11 = r1.R
            android.content.res.Resources r11 = r11.getResources()
            r14 = 2131755474(0x7f1001d2, float:1.9141828E38)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r6 = 0
            r7[r6] = r4
            java.lang.String r4 = r11.getString(r14, r7)
            r6 = 16
            long r24 = r2 & r6
            r6 = 0
            int r11 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x00e4
            if (r9 == 0) goto L_0x00dd
            r6 = 4096(0x1000, double:2.0237E-320)
            long r2 = r2 | r6
            r6 = 262144(0x40000, double:1.295163E-318)
            goto L_0x00e3
        L_0x00dd:
            r6 = 2048(0x800, double:1.0118E-320)
            long r2 = r2 | r6
            r6 = 131072(0x20000, double:6.47582E-319)
        L_0x00e3:
            long r2 = r2 | r6
        L_0x00e4:
            if (r13 == 0) goto L_0x00eb
            int r6 = r13.getTitle()
            goto L_0x00ec
        L_0x00eb:
            r6 = 0
        L_0x00ec:
            if (r9 == 0) goto L_0x00f0
            r7 = 0
            goto L_0x00f2
        L_0x00f0:
            r7 = 8
        L_0x00f2:
            if (r9 == 0) goto L_0x00f7
            r9 = 8
            goto L_0x00f8
        L_0x00f7:
            r9 = 0
        L_0x00f8:
            r11 = r18
            r32 = r7
            r7 = r6
            r6 = r32
            goto L_0x010a
        L_0x0100:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
        L_0x010a:
            r13 = 31
            long r13 = r13 & r2
            r21 = 0
            int r13 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            r24 = 28
            r26 = 26
            r28 = 25
            if (r13 == 0) goto L_0x01b6
            long r13 = r2 & r28
            int r13 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r13 == 0) goto L_0x013a
            if (r0 == 0) goto L_0x0126
            androidx.lifecycle.LiveData<java.lang.Integer> r13 = r0.f6755y
            r14 = r13
            r13 = 0
            goto L_0x0128
        L_0x0126:
            r13 = 0
            r14 = 0
        L_0x0128:
            r1.t(r13, r14)
            if (r14 == 0) goto L_0x0134
            java.lang.Object r14 = r14.d()
            java.lang.Integer r14 = (java.lang.Integer) r14
            goto L_0x0135
        L_0x0134:
            r14 = 0
        L_0x0135:
            int r14 = androidx.databinding.ViewDataBinding.p(r14)
            goto L_0x013c
        L_0x013a:
            r13 = 0
            r14 = r13
        L_0x013c:
            long r18 = r2 & r26
            r21 = 0
            int r18 = (r18 > r21 ? 1 : (r18 == r21 ? 0 : -1))
            if (r18 == 0) goto L_0x0171
            if (r0 == 0) goto L_0x014b
            androidx.lifecycle.LiveData<java.lang.String> r13 = r0.z
            r20 = r14
            goto L_0x014e
        L_0x014b:
            r20 = r14
            r13 = 0
        L_0x014e:
            r14 = 1
            r1.t(r14, r13)
            if (r13 == 0) goto L_0x015b
            java.lang.Object r13 = r13.d()
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x015c
        L_0x015b:
            r13 = 0
        L_0x015c:
            if (r13 != 0) goto L_0x015f
            goto L_0x0160
        L_0x015f:
            r14 = 0
        L_0x0160:
            if (r18 == 0) goto L_0x016b
            if (r14 == 0) goto L_0x0167
            r30 = 1024(0x400, double:5.06E-321)
            goto L_0x0169
        L_0x0167:
            r30 = 512(0x200, double:2.53E-321)
        L_0x0169:
            long r2 = r2 | r30
        L_0x016b:
            if (r14 == 0) goto L_0x0174
            r14 = r13
            r13 = 8
            goto L_0x0176
        L_0x0171:
            r20 = r14
            r13 = 0
        L_0x0174:
            r14 = r13
            r13 = 0
        L_0x0176:
            long r30 = r2 & r24
            r21 = 0
            int r18 = (r30 > r21 ? 1 : (r30 == r21 ? 0 : -1))
            if (r18 == 0) goto L_0x01b1
            if (r0 == 0) goto L_0x0185
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.A
            r23 = r13
            goto L_0x0188
        L_0x0185:
            r23 = r13
            r0 = 0
        L_0x0188:
            r13 = 2
            r1.t(r13, r0)
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r0.d()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x0196
        L_0x0195:
            r0 = 0
        L_0x0196:
            boolean r0 = androidx.databinding.ViewDataBinding.q(r0)
            if (r18 == 0) goto L_0x01a5
            if (r0 == 0) goto L_0x01a1
            r17 = 64
            goto L_0x01a3
        L_0x01a1:
            r17 = 32
        L_0x01a3:
            long r2 = r2 | r17
        L_0x01a5:
            if (r0 == 0) goto L_0x01aa
            r16 = 8
            goto L_0x01ac
        L_0x01aa:
            r16 = 0
        L_0x01ac:
            r0 = r20
            r13 = r23
            goto L_0x01c4
        L_0x01b1:
            r23 = r13
            r17 = r14
            goto L_0x01bc
        L_0x01b6:
            r17 = 0
            r20 = 0
            r23 = 0
        L_0x01bc:
            r14 = r17
            r0 = r20
            r13 = r23
            r16 = 0
        L_0x01c4:
            r17 = 16
            long r17 = r2 & r17
            r19 = 0
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 == 0) goto L_0x0218
            r17 = r14
            android.widget.TextView r14 = r1.I
            u0.a.a(r14, r15)
            android.widget.ImageButton r14 = r1.J
            eb.a r15 = r1.Y
            r14.setOnClickListener(r15)
            android.widget.RelativeLayout r14 = r1.Q
            r14.setVisibility(r5)
            android.widget.TextView r5 = r1.R
            u0.a.a(r5, r4)
            android.widget.TextView r4 = r1.R
            r4.setVisibility(r10)
            android.widget.RelativeLayout r4 = r1.S
            r4.setVisibility(r8)
            android.widget.Button r4 = r1.T
            eb.a r5 = r1.Z
            r4.setOnClickListener(r5)
            android.widget.Button r4 = r1.T
            r4.setVisibility(r6)
            android.widget.Button r4 = r1.W
            eb.a r5 = r1.X
            r4.setOnClickListener(r5)
            android.widget.TextView r4 = r1.K
            u0.a.a(r4, r11)
            android.widget.TextView r4 = r1.L
            u0.a.a(r4, r12)
            android.widget.TextView r4 = r1.M
            r4.setText(r7)
            android.widget.LinearLayout r4 = r1.N
            r4.setVisibility(r9)
            goto L_0x021a
        L_0x0218:
            r17 = r14
        L_0x021a:
            long r4 = r2 & r28
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0227
            android.widget.TextView r4 = r1.U
            r4.setText(r0)
        L_0x0227:
            long r4 = r2 & r26
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x023e
            android.widget.TextView r0 = r1.U
            r0.setVisibility(r13)
            android.widget.TextView r0 = r1.V
            r14 = r17
            u0.a.a(r0, r14)
            android.widget.TextView r0 = r1.V
            r0.setVisibility(r13)
        L_0x023e:
            long r2 = r2 & r24
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x024b
            android.widget.Button r0 = r1.W
            r2 = r16
            r0.setVisibility(r2)
        L_0x024b:
            return
        L_0x024c:
            r0 = move-exception
            monitor-exit(r33)     // Catch:{ all -> 0x024c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: va.o0.c():void");
    }

    public final boolean g() {
        synchronized (this) {
            if (this.f12426a0 != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.f12426a0 = 16;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        if (i == 0) {
            LiveData liveData = (LiveData) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f12426a0 |= 1;
            }
            return true;
        } else if (i == 1) {
            LiveData liveData2 = (LiveData) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f12426a0 |= 2;
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            LiveData liveData3 = (LiveData) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f12426a0 |= 4;
            }
            return true;
        }
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((HistoryDetailViewModel) obj);
        return true;
    }

    public final void v(HistoryDetailViewModel historyDetailViewModel) {
        this.O = historyDetailViewModel;
        synchronized (this) {
            this.f12426a0 |= 8;
        }
        b(3);
        o();
    }
}
