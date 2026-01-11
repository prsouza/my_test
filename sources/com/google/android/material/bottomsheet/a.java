package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.l;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.e0;
import n0.n;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;

public final class a extends l {
    public static final /* synthetic */ int B = 0;
    public e A;

    /* renamed from: c  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f3726c;

    /* renamed from: s  reason: collision with root package name */
    public FrameLayout f3727s;

    /* renamed from: t  reason: collision with root package name */
    public CoordinatorLayout f3728t;

    /* renamed from: u  reason: collision with root package name */
    public FrameLayout f3729u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3730v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3731w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3732x;

    /* renamed from: y  reason: collision with root package name */
    public BottomSheetBehavior.c f3733y;
    public boolean z;

    /* renamed from: com.google.android.material.bottomsheet.a$a  reason: collision with other inner class name */
    public class C0042a implements n {
        public C0042a() {
        }

        public final e0 a(View view, e0 e0Var) {
            a aVar = a.this;
            BottomSheetBehavior.c cVar = aVar.f3733y;
            if (cVar != null) {
                aVar.f3726c.T.remove(cVar);
            }
            a aVar2 = a.this;
            aVar2.f3733y = new f(aVar2.f3729u, e0Var);
            a aVar3 = a.this;
            aVar3.f3726c.s(aVar3.f3733y);
            return e0Var;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public final void onClick(View view) {
            a aVar = a.this;
            if (aVar.f3730v && aVar.isShowing()) {
                a aVar2 = a.this;
                if (!aVar2.f3732x) {
                    TypedArray obtainStyledAttributes = aVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                    aVar2.f3731w = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                    aVar2.f3732x = true;
                }
                if (aVar2.f3731w) {
                    a.this.cancel();
                }
            }
        }
    }

    public class c extends n0.a {
        public c() {
        }

        public final void d(View view, o0.b bVar) {
            this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
            if (a.this.f3730v) {
                bVar.a(1048576);
                bVar.f9173a.setDismissable(true);
                return;
            }
            bVar.f9173a.setDismissable(false);
        }

        public final boolean g(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                a aVar = a.this;
                if (aVar.f3730v) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.g(view, i, bundle);
        }
    }

    public class d implements View.OnTouchListener {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public class e extends BottomSheetBehavior.c {
        public e() {
        }

        public final void b(View view) {
        }

        public final void c(View view, int i) {
            if (i == 5) {
                a.this.cancel();
            }
        }
    }

    public static class f extends BottomSheetBehavior.c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3738a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3739b;

        /* renamed from: c  reason: collision with root package name */
        public final e0 f3740c;

        public f(View view, e0 e0Var) {
            ColorStateList colorStateList;
            this.f3740c = e0Var;
            boolean z = (view.getSystemUiVisibility() & LZ4Constants.HASH_TABLE_SIZE_64K) != 0;
            this.f3739b = z;
            e6.f fVar = BottomSheetBehavior.x(view).f3695h;
            if (fVar != null) {
                colorStateList = fVar.f4653a.f4666c;
            } else {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                colorStateList = x.i.g(view);
            }
            if (colorStateList != null) {
                this.f3738a = y.c.M(colorStateList.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f3738a = y.c.M(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f3738a = z;
            }
        }

        public final void a(View view) {
            d(view);
        }

        public final void b(View view) {
            d(view);
        }

        public final void c(View view, int i) {
            d(view);
        }

        public final void d(View view) {
            if (view.getTop() < this.f3740c.f()) {
                boolean z = this.f3738a;
                int i = a.B;
                int systemUiVisibility = view.getSystemUiVisibility();
                view.setSystemUiVisibility(z ? systemUiVisibility | LZ4Constants.HASH_TABLE_SIZE_64K : systemUiVisibility & -8193);
                view.setPadding(view.getPaddingLeft(), this.f3740c.f() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                boolean z10 = this.f3739b;
                int i10 = a.B;
                int systemUiVisibility2 = view.getSystemUiVisibility();
                view.setSystemUiVisibility(z10 ? systemUiVisibility2 | LZ4Constants.HASH_TABLE_SIZE_64K : systemUiVisibility2 & -8193);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x001b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130903152(0x7f030070, float:1.7413114E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0018
            int r5 = r5.resourceId
            goto L_0x001b
        L_0x0018:
            r5 = 2131821131(0x7f11024b, float:1.9274997E38)
        L_0x001b:
            r3.<init>(r4, r5)
            r3.f3730v = r0
            r3.f3731w = r0
            com.google.android.material.bottomsheet.a$e r4 = new com.google.android.material.bottomsheet.a$e
            r4.<init>()
            r3.A = r4
            r3.g()
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            r0 = 2130903436(0x7f03018c, float:1.741369E38)
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r1, r1)
            r3.z = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.a.<init>(android.content.Context, int):void");
    }

    public final void cancel() {
        i();
        super.cancel();
    }

    public final FrameLayout h() {
        if (this.f3727s == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f3727s = frameLayout;
            this.f3728t = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f3727s.findViewById(R.id.design_bottom_sheet);
            this.f3729u = frameLayout2;
            BottomSheetBehavior<FrameLayout> x10 = BottomSheetBehavior.x(frameLayout2);
            this.f3726c = x10;
            x10.s(this.A);
            this.f3726c.C(this.f3730v);
        }
        return this.f3727s;
    }

    public final BottomSheetBehavior<FrameLayout> i() {
        if (this.f3726c == null) {
            h();
        }
        return this.f3726c;
    }

    public final View j(int i, View view, ViewGroup.LayoutParams layoutParams) {
        h();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3727s.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        if (this.z) {
            FrameLayout frameLayout = this.f3729u;
            C0042a aVar = new C0042a();
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.i.u(frameLayout, aVar);
        }
        this.f3729u.removeAllViews();
        if (layoutParams == null) {
            this.f3729u.addView(view);
        } else {
            this.f3729u.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new b());
        x.p(this.f3729u, new c());
        this.f3729u.setOnTouchListener(new d());
        return this.f3727s;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.z && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f3727s;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f3728t;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            if (z10) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
            window.setLayout(-1, -1);
        }
    }

    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f3726c;
        if (bottomSheetBehavior != null && bottomSheetBehavior.J == 5) {
            bottomSheetBehavior.E(4);
        }
    }

    public final void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f3730v != z10) {
            this.f3730v = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f3726c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.C(z10);
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f3730v) {
            this.f3730v = true;
        }
        this.f3731w = z10;
        this.f3732x = true;
    }

    public final void setContentView(int i) {
        super.setContentView(j(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view) {
        super.setContentView(j(0, view, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(j(0, view, layoutParams));
    }
}
