package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import eb.a;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;

public final class a1 extends z0 implements a.C0072a {
    public static final SparseIntArray S;
    public final Button L;
    public final TextView M;
    public final Button N;
    public final TextView O;
    public final a P;
    public final a Q;
    public long R = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(R.id.transferTitle, 7);
        sparseIntArray.put(R.id.rewardTitle, 8);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a1(androidx.databinding.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = S
            r1 = 9
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r6, r7, r1, r2, r0)
            r1 = 6
            r1 = r0[r1]
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r3 = 8
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 3
            r3 = r0[r3]
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r4 = 7
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5.<init>(r6, r7, r1, r3)
            r3 = -1
            r5.R = r3
            r6 = 0
            r6 = r0[r6]
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r6.setTag(r2)
            r6 = 1
            r1 = r0[r6]
            android.widget.Button r1 = (android.widget.Button) r1
            r5.L = r1
            r1.setTag(r2)
            r1 = 2
            r3 = r0[r1]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5.M = r3
            r3.setTag(r2)
            r3 = 4
            r3 = r0[r3]
            android.widget.Button r3 = (android.widget.Button) r3
            r5.N = r3
            r3.setTag(r2)
            r3 = 5
            r0 = r0[r3]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.O = r0
            r0.setTag(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r5.I
            r0.setTag(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r5.J
            r0.setTag(r2)
            r0 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r7.setTag(r0, r5)
            eb.a r7 = new eb.a
            r7.<init>(r5, r6)
            r5.P = r7
            eb.a r6 = new eb.a
            r6.<init>(r5, r1)
            r5.Q = r6
            r5.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.a1.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            HomeViewModelV2 homeViewModelV2 = this.K;
            if (homeViewModelV2 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV2.m(HomeViewModelV2.a.SHOW_TRANSFERS);
            }
        } else if (i == 2) {
            HomeViewModelV2 homeViewModelV22 = this.K;
            if (homeViewModelV22 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV22.m(HomeViewModelV2.a.SHOW_REWARDS);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r28 = this;
            r1 = r28
            monitor-enter(r28)
            long r2 = r1.R     // Catch:{ all -> 0x01ac }
            r4 = 0
            r1.R = r4     // Catch:{ all -> 0x01ac }
            monitor-exit(r28)     // Catch:{ all -> 0x01ac }
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r0 = r1.K
            r6 = 63
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 50
            r9 = 49
            r11 = 52
            r15 = 0
            if (r6 == 0) goto L_0x0148
            long r17 = r2 & r9
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            r17 = 8
            r9 = 1
            if (r6 == 0) goto L_0x004f
            if (r0 == 0) goto L_0x0028
            androidx.lifecycle.LiveData<java.lang.String> r10 = r0.L
            goto L_0x0029
        L_0x0028:
            r10 = 0
        L_0x0029:
            r1.t(r15, r10)
            if (r10 == 0) goto L_0x0035
            java.lang.Object r10 = r10.d()
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0036
        L_0x0035:
            r10 = 0
        L_0x0036:
            if (r10 != 0) goto L_0x003b
            r19 = r9
            goto L_0x003d
        L_0x003b:
            r19 = r15
        L_0x003d:
            if (r6 == 0) goto L_0x0048
            if (r19 == 0) goto L_0x0044
            r20 = 128(0x80, double:6.32E-322)
            goto L_0x0046
        L_0x0044:
            r20 = 64
        L_0x0046:
            long r2 = r2 | r20
        L_0x0048:
            if (r19 == 0) goto L_0x004d
            r6 = r17
            goto L_0x0051
        L_0x004d:
            r6 = r15
            goto L_0x0051
        L_0x004f:
            r6 = r15
            r10 = 0
        L_0x0051:
            r19 = 58
            long r19 = r2 & r19
            int r19 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r19 == 0) goto L_0x005e
            if (r0 == 0) goto L_0x005e
            int r15 = r0.f6768v
            goto L_0x005f
        L_0x005e:
            r15 = 0
        L_0x005f:
            long r20 = r2 & r7
            int r20 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r20 == 0) goto L_0x00b3
            if (r0 == 0) goto L_0x006a
            androidx.lifecycle.LiveData<java.util.List<sa.b>> r13 = r0.K
            goto L_0x006b
        L_0x006a:
            r13 = 0
        L_0x006b:
            r1.t(r9, r13)
            if (r13 == 0) goto L_0x0077
            java.lang.Object r13 = r13.d()
            java.util.List r13 = (java.util.List) r13
            goto L_0x0078
        L_0x0077:
            r13 = 0
        L_0x0078:
            if (r13 == 0) goto L_0x007f
            int r13 = r13.size()
            goto L_0x0080
        L_0x007f:
            r13 = 0
        L_0x0080:
            if (r13 <= r15) goto L_0x0084
            r14 = r9
            goto L_0x0085
        L_0x0084:
            r14 = 0
        L_0x0085:
            if (r13 <= 0) goto L_0x0089
            r13 = r9
            goto L_0x008a
        L_0x0089:
            r13 = 0
        L_0x008a:
            if (r20 == 0) goto L_0x0095
            if (r14 == 0) goto L_0x0091
            r22 = 2048(0x800, double:1.0118E-320)
            goto L_0x0093
        L_0x0091:
            r22 = 1024(0x400, double:5.06E-321)
        L_0x0093:
            long r2 = r2 | r22
        L_0x0095:
            long r22 = r2 & r7
            int r20 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r20 == 0) goto L_0x00a6
            if (r13 == 0) goto L_0x00a1
            r22 = 131072(0x20000, double:6.47582E-319)
            goto L_0x00a4
        L_0x00a1:
            r22 = 65536(0x10000, double:3.2379E-319)
        L_0x00a4:
            long r2 = r2 | r22
        L_0x00a6:
            if (r14 == 0) goto L_0x00aa
            r14 = 0
            goto L_0x00ac
        L_0x00aa:
            r14 = r17
        L_0x00ac:
            if (r13 == 0) goto L_0x00b0
            r13 = 0
            goto L_0x00b5
        L_0x00b0:
            r13 = r17
            goto L_0x00b5
        L_0x00b3:
            r13 = 0
            r14 = 0
        L_0x00b5:
            long r22 = r2 & r11
            int r20 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r20 == 0) goto L_0x00e4
            if (r0 == 0) goto L_0x00c0
            androidx.lifecycle.LiveData<java.lang.String> r9 = r0.M
            goto L_0x00c1
        L_0x00c0:
            r9 = 0
        L_0x00c1:
            r11 = 2
            r1.t(r11, r9)
            if (r9 == 0) goto L_0x00ce
            java.lang.Object r9 = r9.d()
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x00cf
        L_0x00ce:
            r9 = 0
        L_0x00cf:
            if (r9 != 0) goto L_0x00d3
            r11 = 1
            goto L_0x00d4
        L_0x00d3:
            r11 = 0
        L_0x00d4:
            if (r20 == 0) goto L_0x00df
            if (r11 == 0) goto L_0x00db
            r24 = 8192(0x2000, double:4.0474E-320)
            goto L_0x00dd
        L_0x00db:
            r24 = 4096(0x1000, double:2.0237E-320)
        L_0x00dd:
            long r2 = r2 | r24
        L_0x00df:
            if (r11 == 0) goto L_0x00e5
            r11 = r17
            goto L_0x00e6
        L_0x00e4:
            r9 = 0
        L_0x00e5:
            r11 = 0
        L_0x00e6:
            r20 = 56
            long r24 = r2 & r20
            int r12 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x0144
            if (r0 == 0) goto L_0x00f3
            androidx.lifecycle.LiveData<java.util.List<sa.b>> r0 = r0.J
            goto L_0x00f4
        L_0x00f3:
            r0 = 0
        L_0x00f4:
            r7 = 3
            r1.t(r7, r0)
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r0.d()
            java.util.List r0 = (java.util.List) r0
            r16 = r0
            goto L_0x0105
        L_0x0103:
            r16 = 0
        L_0x0105:
            if (r16 == 0) goto L_0x010c
            int r0 = r16.size()
            goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            if (r0 <= 0) goto L_0x0111
            r7 = 1
            goto L_0x0112
        L_0x0111:
            r7 = 0
        L_0x0112:
            if (r0 <= r15) goto L_0x0117
            r22 = 1
            goto L_0x0119
        L_0x0117:
            r22 = 0
        L_0x0119:
            if (r12 == 0) goto L_0x0124
            if (r7 == 0) goto L_0x0121
            r15 = 32768(0x8000, double:1.61895E-319)
            goto L_0x0123
        L_0x0121:
            r15 = 16384(0x4000, double:8.0948E-320)
        L_0x0123:
            long r2 = r2 | r15
        L_0x0124:
            r15 = 56
            long r26 = r2 & r15
            int r0 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0134
            if (r22 == 0) goto L_0x0131
            r15 = 512(0x200, double:2.53E-321)
            goto L_0x0133
        L_0x0131:
            r15 = 256(0x100, double:1.265E-321)
        L_0x0133:
            long r2 = r2 | r15
        L_0x0134:
            if (r7 == 0) goto L_0x0138
            r0 = 0
            goto L_0x013a
        L_0x0138:
            r0 = r17
        L_0x013a:
            if (r22 == 0) goto L_0x013e
            r15 = 0
            goto L_0x0140
        L_0x013e:
            r15 = r17
        L_0x0140:
            r7 = r0
            r0 = r15
            r15 = r14
            goto L_0x0150
        L_0x0144:
            r15 = r14
            r0 = 0
            r7 = 0
            goto L_0x0150
        L_0x0148:
            r0 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
        L_0x0150:
            r16 = 32
            long r16 = r2 & r16
            int r8 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0166
            android.widget.Button r8 = r1.L
            eb.a r12 = r1.P
            r8.setOnClickListener(r12)
            android.widget.Button r8 = r1.N
            eb.a r12 = r1.Q
            r8.setOnClickListener(r12)
        L_0x0166:
            r16 = 50
            long r16 = r2 & r16
            int r8 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0178
            android.widget.Button r8 = r1.L
            r8.setVisibility(r15)
            androidx.recyclerview.widget.RecyclerView r8 = r1.J
            r8.setVisibility(r13)
        L_0x0178:
            r12 = 49
            long r12 = r12 & r2
            int r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0189
            android.widget.TextView r8 = r1.M
            u0.a.a(r8, r10)
            android.widget.TextView r8 = r1.M
            r8.setVisibility(r6)
        L_0x0189:
            r12 = 56
            long r12 = r12 & r2
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x019a
            android.widget.Button r6 = r1.N
            r6.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r1.I
            r0.setVisibility(r7)
        L_0x019a:
            r6 = 52
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01ab
            android.widget.TextView r0 = r1.O
            u0.a.a(r0, r9)
            android.widget.TextView r0 = r1.O
            r0.setVisibility(r11)
        L_0x01ab:
            return
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r28)     // Catch:{ all -> 0x01ac }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: va.a1.c():void");
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
            this.R = 32;
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
                this.R |= 1;
            }
            return true;
        } else if (i == 1) {
            LiveData liveData2 = (LiveData) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.R |= 2;
            }
            return true;
        } else if (i == 2) {
            LiveData liveData3 = (LiveData) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.R |= 4;
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            LiveData liveData4 = (LiveData) obj;
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.R |= 8;
            }
            return true;
        }
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        v((HomeViewModelV2) obj);
        return true;
    }

    public final void v(HomeViewModelV2 homeViewModelV2) {
        this.K = homeViewModelV2;
        synchronized (this) {
            this.R |= 16;
        }
        b(3);
        o();
    }
}
