package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class h<S> extends z<S> {
    public static final /* synthetic */ int A = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f3850b;

    /* renamed from: c  reason: collision with root package name */
    public d<S> f3851c;

    /* renamed from: s  reason: collision with root package name */
    public a f3852s;

    /* renamed from: t  reason: collision with root package name */
    public u f3853t;

    /* renamed from: u  reason: collision with root package name */
    public e f3854u;

    /* renamed from: v  reason: collision with root package name */
    public c f3855v;

    /* renamed from: w  reason: collision with root package name */
    public RecyclerView f3856w;

    /* renamed from: x  reason: collision with root package name */
    public RecyclerView f3857x;

    /* renamed from: y  reason: collision with root package name */
    public View f3858y;
    public View z;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3859a;

        public a(int i) {
            this.f3859a = i;
        }

        public final void run() {
            RecyclerView recyclerView = h.this.f3857x;
            int i = this.f3859a;
            if (!recyclerView.M) {
                RecyclerView.n nVar = recyclerView.B;
                if (nVar == null) {
                    Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else {
                    nVar.G0(recyclerView, i);
                }
            }
        }
    }

    public class b extends n0.a {
        public final void d(View view, o0.b bVar) {
            this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
            bVar.p((Object) null);
        }
    }

    public class c extends b0 {
        public final /* synthetic */ int G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, int i10) {
            super(context, i);
            this.G = i10;
        }

        public final void J0(RecyclerView.y yVar, int[] iArr) {
            if (this.G == 0) {
                iArr[0] = h.this.f3857x.getWidth();
                iArr[1] = h.this.f3857x.getWidth();
                return;
            }
            iArr[0] = h.this.f3857x.getHeight();
            iArr[1] = h.this.f3857x.getHeight();
        }
    }

    public class d implements f {
        public d() {
        }
    }

    public enum e {
        DAY,
        YEAR
    }

    public interface f {
    }

    public final boolean b(y<S> yVar) {
        return this.f3914a.add(yVar);
    }

    public final LinearLayoutManager c() {
        return (LinearLayoutManager) this.f3857x.getLayoutManager();
    }

    public final void d(int i) {
        this.f3857x.post(new a(i));
    }

    public final void e(u uVar) {
        x xVar = (x) this.f3857x.getAdapter();
        int j10 = xVar.j(uVar);
        int j11 = j10 - xVar.j(this.f3853t);
        boolean z10 = true;
        boolean z11 = Math.abs(j11) > 3;
        if (j11 <= 0) {
            z10 = false;
        }
        this.f3853t = uVar;
        if (z11 && z10) {
            this.f3857x.e0(j10 - 3);
            d(j10);
        } else if (z11) {
            this.f3857x.e0(j10 + 3);
            d(j10);
        } else {
            d(j10);
        }
    }

    public final void f(e eVar) {
        this.f3854u = eVar;
        if (eVar == e.YEAR) {
            this.f3856w.getLayoutManager().v0(((f0) this.f3856w.getAdapter()).i(this.f3853t.f3896c));
            this.f3858y.setVisibility(0);
            this.z.setVisibility(8);
        } else if (eVar == e.DAY) {
            this.f3858y.setVisibility(8);
            this.z.setVisibility(0);
            e(this.f3853t);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f3850b = bundle.getInt("THEME_RES_ID_KEY");
        this.f3851c = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f3852s = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f3853t = (u) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARNING: type inference failed for: r1v20, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$r>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0181, code lost:
        r12 = new androidx.recyclerview.widget.u();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            android.view.ContextThemeWrapper r12 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r9.getContext()
            int r1 = r9.f3850b
            r12.<init>(r0, r1)
            com.google.android.material.datepicker.c r0 = new com.google.android.material.datepicker.c
            r0.<init>(r12)
            r9.f3855v = r0
            android.view.LayoutInflater r10 = r10.cloneInContext(r12)
            com.google.android.material.datepicker.a r0 = r9.f3852s
            com.google.android.material.datepicker.u r0 = r0.f3812a
            boolean r1 = com.google.android.material.datepicker.p.d(r12)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0027
            r1 = 2131427455(0x7f0b007f, float:1.8476527E38)
            r4 = r2
            goto L_0x002b
        L_0x0027:
            r1 = 2131427450(0x7f0b007a, float:1.8476517E38)
            r4 = r3
        L_0x002b:
            android.view.View r10 = r10.inflate(r1, r11, r3)
            android.content.Context r11 = r9.requireContext()
            android.content.res.Resources r11 = r11.getResources()
            r1 = 2131100100(0x7f0601c4, float:1.7812572E38)
            int r1 = r11.getDimensionPixelSize(r1)
            r5 = 2131100101(0x7f0601c5, float:1.7812574E38)
            int r5 = r11.getDimensionPixelOffset(r5)
            int r5 = r5 + r1
            r1 = 2131100099(0x7f0601c3, float:1.781257E38)
            int r1 = r11.getDimensionPixelOffset(r1)
            int r1 = r1 + r5
            r5 = 2131100084(0x7f0601b4, float:1.781254E38)
            int r5 = r11.getDimensionPixelSize(r5)
            int r6 = com.google.android.material.datepicker.v.f3901u
            r7 = 2131100079(0x7f0601af, float:1.781253E38)
            int r7 = r11.getDimensionPixelSize(r7)
            int r7 = r7 * r6
            int r6 = r6 + -1
            r8 = 2131100098(0x7f0601c2, float:1.7812568E38)
            int r8 = r11.getDimensionPixelOffset(r8)
            int r8 = r8 * r6
            int r8 = r8 + r7
            r6 = 2131100076(0x7f0601ac, float:1.7812523E38)
            int r11 = r11.getDimensionPixelOffset(r6)
            int r1 = r1 + r5
            int r1 = r1 + r8
            int r1 = r1 + r11
            r10.setMinimumHeight(r1)
            r11 = 2131231116(0x7f08018c, float:1.8078304E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.GridView r11 = (android.widget.GridView) r11
            com.google.android.material.datepicker.h$b r1 = new com.google.android.material.datepicker.h$b
            r1.<init>()
            n0.x.p(r11, r1)
            com.google.android.material.datepicker.g r1 = new com.google.android.material.datepicker.g
            r1.<init>()
            r11.setAdapter(r1)
            int r0 = r0.f3897s
            r11.setNumColumns(r0)
            r11.setEnabled(r3)
            r11 = 2131231119(0x7f08018f, float:1.807831E38)
            android.view.View r11 = r10.findViewById(r11)
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            r9.f3857x = r11
            com.google.android.material.datepicker.h$c r11 = new com.google.android.material.datepicker.h$c
            android.content.Context r0 = r9.getContext()
            r11.<init>(r0, r4, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r9.f3857x
            r0.setLayoutManager(r11)
            androidx.recyclerview.widget.RecyclerView r11 = r9.f3857x
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            r11.setTag(r0)
            com.google.android.material.datepicker.x r11 = new com.google.android.material.datepicker.x
            com.google.android.material.datepicker.d<S> r0 = r9.f3851c
            com.google.android.material.datepicker.a r1 = r9.f3852s
            com.google.android.material.datepicker.h$d r4 = new com.google.android.material.datepicker.h$d
            r4.<init>()
            r11.<init>(r12, r0, r1, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r9.f3857x
            r0.setAdapter(r11)
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131296300(0x7f09002c, float:1.8210513E38)
            int r0 = r0.getInteger(r1)
            r1 = 2131231122(0x7f080192, float:1.8078316E38)
            android.view.View r4 = r10.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r9.f3856w = r4
            if (r4 == 0) goto L_0x0104
            r4.setHasFixedSize(r2)
            androidx.recyclerview.widget.RecyclerView r4 = r9.f3856w
            androidx.recyclerview.widget.GridLayoutManager r5 = new androidx.recyclerview.widget.GridLayoutManager
            r5.<init>((android.content.Context) r12, (int) r0, (int) r2, (boolean) r3)
            r4.setLayoutManager(r5)
            androidx.recyclerview.widget.RecyclerView r0 = r9.f3856w
            com.google.android.material.datepicker.f0 r2 = new com.google.android.material.datepicker.f0
            r2.<init>(r9)
            r0.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r9.f3856w
            com.google.android.material.datepicker.i r2 = new com.google.android.material.datepicker.i
            r2.<init>(r9)
            r0.g(r2)
        L_0x0104:
            r0 = 2131231109(0x7f080185, float:1.807829E38)
            android.view.View r2 = r10.findViewById(r0)
            if (r2 == 0) goto L_0x017b
            android.view.View r0 = r10.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.String r2 = "SELECTOR_TOGGLE_TAG"
            r0.setTag(r2)
            com.google.android.material.datepicker.j r2 = new com.google.android.material.datepicker.j
            r2.<init>(r9)
            n0.x.p(r0, r2)
            r2 = 2131231111(0x7f080187, float:1.8078294E38)
            android.view.View r2 = r10.findViewById(r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            java.lang.String r3 = "NAVIGATION_PREV_TAG"
            r2.setTag(r3)
            r3 = 2131231110(0x7f080186, float:1.8078292E38)
            android.view.View r3 = r10.findViewById(r3)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            java.lang.String r4 = "NAVIGATION_NEXT_TAG"
            r3.setTag(r4)
            android.view.View r1 = r10.findViewById(r1)
            r9.f3858y = r1
            r1 = 2131231115(0x7f08018b, float:1.8078302E38)
            android.view.View r1 = r10.findViewById(r1)
            r9.z = r1
            com.google.android.material.datepicker.h$e r1 = com.google.android.material.datepicker.h.e.DAY
            r9.f(r1)
            com.google.android.material.datepicker.u r1 = r9.f3853t
            java.lang.String r1 = r1.l()
            r0.setText(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r9.f3857x
            com.google.android.material.datepicker.k r4 = new com.google.android.material.datepicker.k
            r4.<init>(r9, r11, r0)
            r1.h(r4)
            com.google.android.material.datepicker.l r1 = new com.google.android.material.datepicker.l
            r1.<init>(r9)
            r0.setOnClickListener(r1)
            com.google.android.material.datepicker.m r0 = new com.google.android.material.datepicker.m
            r0.<init>(r9, r11)
            r3.setOnClickListener(r0)
            com.google.android.material.datepicker.n r0 = new com.google.android.material.datepicker.n
            r0.<init>(r9, r11)
            r2.setOnClickListener(r0)
        L_0x017b:
            boolean r12 = com.google.android.material.datepicker.p.d(r12)
            if (r12 != 0) goto L_0x01d0
            androidx.recyclerview.widget.u r12 = new androidx.recyclerview.widget.u
            r12.<init>()
            androidx.recyclerview.widget.RecyclerView r0 = r9.f3857x
            androidx.recyclerview.widget.RecyclerView r1 = r12.f2455a
            if (r1 != r0) goto L_0x018d
            goto L_0x01d0
        L_0x018d:
            if (r1 == 0) goto L_0x019e
            androidx.recyclerview.widget.a0$a r2 = r12.f2456b
            java.util.List<androidx.recyclerview.widget.RecyclerView$r> r1 = r1.f2298x0
            if (r1 == 0) goto L_0x0198
            r1.remove(r2)
        L_0x0198:
            androidx.recyclerview.widget.RecyclerView r1 = r12.f2455a
            r2 = 0
            r1.setOnFlingListener(r2)
        L_0x019e:
            r12.f2455a = r0
            if (r0 == 0) goto L_0x01d0
            androidx.recyclerview.widget.RecyclerView$p r0 = r0.getOnFlingListener()
            if (r0 != 0) goto L_0x01c8
            androidx.recyclerview.widget.RecyclerView r0 = r12.f2455a
            androidx.recyclerview.widget.a0$a r1 = r12.f2456b
            r0.h(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r12.f2455a
            r0.setOnFlingListener(r12)
            android.widget.Scroller r0 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r1 = r12.f2455a
            android.content.Context r1 = r1.getContext()
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            r0.<init>(r1, r2)
            r12.b()
            goto L_0x01d0
        L_0x01c8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "An instance of OnFlingListener already set."
            r10.<init>(r11)
            throw r10
        L_0x01d0:
            androidx.recyclerview.widget.RecyclerView r12 = r9.f3857x
            com.google.android.material.datepicker.u r0 = r9.f3853t
            int r11 = r11.j(r0)
            r12.e0(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.h.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f3850b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f3851c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3852s);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f3853t);
    }
}
