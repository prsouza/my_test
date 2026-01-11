package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public final class v extends BaseAdapter {

    /* renamed from: u  reason: collision with root package name */
    public static final int f3901u = d0.e((Calendar) null).getMaximum(4);

    /* renamed from: a  reason: collision with root package name */
    public final u f3902a;

    /* renamed from: b  reason: collision with root package name */
    public final d<?> f3903b;

    /* renamed from: c  reason: collision with root package name */
    public Collection<Long> f3904c;

    /* renamed from: s  reason: collision with root package name */
    public c f3905s;

    /* renamed from: t  reason: collision with root package name */
    public final a f3906t;

    public v(u uVar, d<?> dVar, a aVar) {
        this.f3902a = uVar;
        this.f3903b = dVar;
        this.f3906t = aVar;
        this.f3904c = dVar.O();
    }

    public final int b(int i) {
        return c() + (i - 1);
    }

    public final int c() {
        return this.f3902a.k();
    }

    /* renamed from: d */
    public final Long getItem(int i) {
        if (i < this.f3902a.k() || i > e()) {
            return null;
        }
        u uVar = this.f3902a;
        Calendar b10 = d0.b(uVar.f3894a);
        b10.set(5, (i - uVar.k()) + 1);
        return Long.valueOf(b10.getTimeInMillis());
    }

    public final int e() {
        return (this.f3902a.k() + this.f3902a.f3898t) - 1;
    }

    public final void f(TextView textView, long j10) {
        b bVar;
        if (textView != null) {
            boolean z = false;
            if (this.f3906t.f3814c.y(j10)) {
                textView.setEnabled(true);
                Iterator<Long> it = this.f3903b.O().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (d0.a(j10) == d0.a(it.next().longValue())) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    bVar = this.f3905s.f3831b;
                } else if (d0.d().getTimeInMillis() == j10) {
                    bVar = this.f3905s.f3832c;
                } else {
                    bVar = this.f3905s.f3830a;
                }
            } else {
                textView.setEnabled(false);
                bVar = this.f3905s.g;
            }
            bVar.b(textView);
        }
    }

    public final void g(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (u.i(j10).equals(this.f3902a)) {
            Calendar b10 = d0.b(this.f3902a.f3894a);
            b10.setTimeInMillis(j10);
            f((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().b(b10.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    public final int getCount() {
        return c() + this.f3902a.f3898t;
    }

    public final long getItemId(int i) {
        return (long) (i / this.f3902a.f3897s);
    }

    /* JADX WARNING: type inference failed for: r10v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            android.content.Context r0 = r11.getContext()
            com.google.android.material.datepicker.c r1 = r8.f3905s
            if (r1 != 0) goto L_0x000f
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r8.f3905s = r1
        L_0x000f:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L_0x0027
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r0 = 2131427447(0x7f0b0077, float:1.847651E38)
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r10 = r8.c()
            int r10 = r9 - r10
            if (r10 < 0) goto L_0x009f
            com.google.android.material.datepicker.u r11 = r8.f3902a
            int r2 = r11.f3898t
            if (r10 < r2) goto L_0x0036
            goto L_0x009f
        L_0x0036:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r11 = r0.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r11 = java.lang.String.format(r11, r4, r3)
            r0.setText(r11)
            com.google.android.material.datepicker.u r11 = r8.f3902a
            java.util.Calendar r11 = r11.f3894a
            java.util.Calendar r11 = com.google.android.material.datepicker.d0.b(r11)
            r3 = 5
            r11.set(r3, r10)
            long r10 = r11.getTimeInMillis()
            com.google.android.material.datepicker.u r4 = r8.f3902a
            int r4 = r4.f3896c
            java.util.Calendar r5 = com.google.android.material.datepicker.d0.d()
            r5.set(r3, r2)
            java.util.Calendar r5 = com.google.android.material.datepicker.d0.b(r5)
            r6 = 2
            r5.get(r6)
            int r6 = r5.get(r2)
            r7 = 7
            r5.getMaximum(r7)
            r5.getActualMaximum(r3)
            r5.getTimeInMillis()
            if (r4 != r6) goto L_0x0091
            java.lang.String r10 = com.google.android.material.datepicker.e.a(r10)
            r0.setContentDescription(r10)
            goto L_0x0098
        L_0x0091:
            java.lang.String r10 = com.google.android.material.datepicker.e.b(r10)
            r0.setContentDescription(r10)
        L_0x0098:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x00a7
        L_0x009f:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        L_0x00a7:
            java.lang.Long r9 = r8.getItem(r9)
            if (r9 != 0) goto L_0x00ae
            goto L_0x00b5
        L_0x00ae:
            long r9 = r9.longValue()
            r8.f(r0, r9)
        L_0x00b5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.v.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}
