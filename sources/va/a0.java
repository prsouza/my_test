package va;

import android.util.SparseIntArray;
import android.webkit.WebView;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;

public final class a0 extends z {
    public static final SparseIntArray N;
    public final WebView L;
    public long M = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.socialLayout, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a0(androidx.databinding.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = N
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.l(r6, r7, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 3
            r3 = r0[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r5.<init>(r6, r7, r1)
            r3 = -1
            r5.M = r3
            android.widget.TextView r6 = r5.I
            r6.setTag(r2)
            r6 = 0
            r6 = r0[r6]
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r6.setTag(r2)
            r6 = 2
            r6 = r0[r6]
            android.webkit.WebView r6 = (android.webkit.WebView) r6
            r5.L = r6
            r6.setTag(r2)
            r6 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r7.setTag(r6, r5)
            r5.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.a0.<init>(androidx.databinding.e, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.M     // Catch:{ all -> 0x0094 }
            r2 = 0
            r9.M = r2     // Catch:{ all -> 0x0094 }
            monitor-exit(r9)     // Catch:{ all -> 0x0094 }
            io.nodle.cash.ui.viewmodel.OptionsViewModel r4 = r9.J
            r5 = 3
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0056
            if (r4 == 0) goto L_0x004a
            qa.a r3 = r4.A
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = r3.f10327c
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            r5 = 1
            if (r3 == 0) goto L_0x0029
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = r1
            goto L_0x002a
        L_0x0029:
            r3 = r5
        L_0x002a:
            r6 = 8
            if (r3 == 0) goto L_0x0030
            r3 = r6
            goto L_0x0031
        L_0x0030:
            r3 = r1
        L_0x0031:
            qa.a r4 = r4.A
            if (r4 == 0) goto L_0x0038
            java.lang.String r7 = r4.f10326b
            goto L_0x0039
        L_0x0038:
            r7 = r2
        L_0x0039:
            if (r7 == 0) goto L_0x0043
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r5 = r1
        L_0x0043:
            if (r5 == 0) goto L_0x0046
            r1 = r6
        L_0x0046:
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x004c
        L_0x004a:
            r3 = r1
            r4 = r2
        L_0x004c:
            if (r4 == 0) goto L_0x0057
            java.lang.String r2 = r4.f10326b
            java.lang.String r4 = r4.f10327c
            r8 = r4
            r4 = r2
            r2 = r8
            goto L_0x0058
        L_0x0056:
            r3 = r1
        L_0x0057:
            r4 = r2
        L_0x0058:
            if (r0 == 0) goto L_0x0093
            android.widget.TextView r0 = r9.I
            u0.a.a(r0, r2)
            android.widget.TextView r0 = r9.I
            r0.setVisibility(r1)
            android.webkit.WebView r0 = r9.L
            r0.setVisibility(r3)
            android.webkit.WebView r0 = r9.L
            java.lang.String r1 = "view"
            e6.e.D(r0, r1)
            if (r4 == 0) goto L_0x0093
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "URL "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "OptionsViewModel"
            android.util.Log.d(r2, r1)
            android.webkit.WebViewClient r1 = new android.webkit.WebViewClient
            r1.<init>()
            r0.setWebViewClient(r1)
            r0.loadUrl(r4)
        L_0x0093:
            return
        L_0x0094:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0094 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: va.a0.c():void");
    }

    public final boolean g() {
        synchronized (this) {
            if (this.M != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.M = 2;
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
        v((OptionsViewModel) obj);
        return true;
    }

    public final void v(OptionsViewModel optionsViewModel) {
        this.J = optionsViewModel;
        synchronized (this) {
            this.M |= 1;
        }
        b(3);
        o();
    }
}
