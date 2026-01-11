package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n.f;
import n0.a0;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;

public class q0 implements f {
    public static Method O;
    public static Method P;
    public static Method Q;
    public int A = 0;
    public int B = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public b C;
    public View D;
    public AdapterView.OnItemClickListener E;
    public final e F = new e();
    public final d G = new d();
    public final c H = new c();
    public final a I = new a();
    public final Handler J;
    public final Rect K = new Rect();
    public Rect L;
    public boolean M;
    public t N;

    /* renamed from: a  reason: collision with root package name */
    public Context f1369a;

    /* renamed from: b  reason: collision with root package name */
    public ListAdapter f1370b;

    /* renamed from: c  reason: collision with root package name */
    public l0 f1371c;

    /* renamed from: s  reason: collision with root package name */
    public int f1372s = -2;

    /* renamed from: t  reason: collision with root package name */
    public int f1373t = -2;

    /* renamed from: u  reason: collision with root package name */
    public int f1374u;

    /* renamed from: v  reason: collision with root package name */
    public int f1375v;

    /* renamed from: w  reason: collision with root package name */
    public int f1376w = 1002;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1377x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1378y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            l0 l0Var = q0.this.f1371c;
            if (l0Var != null) {
                l0Var.setListSelectionHidden(true);
                l0Var.requestLayout();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public final void onChanged() {
            if (q0.this.b()) {
                q0.this.d();
            }
        }

        public final void onInvalidated() {
            q0.this.dismiss();
        }
    }

    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        public final void onScroll(AbsListView absListView, int i, int i10, int i11) {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (q0.this.N.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && q0.this.N.getContentView() != null) {
                    q0 q0Var = q0.this;
                    q0Var.J.removeCallbacks(q0Var.F);
                    q0.this.F.run();
                }
            }
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            t tVar;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (tVar = q0.this.N) != null && tVar.isShowing() && x10 >= 0 && x10 < q0.this.N.getWidth() && y10 >= 0 && y10 < q0.this.N.getHeight()) {
                q0 q0Var = q0.this;
                q0Var.J.postDelayed(q0Var.F, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                q0 q0Var2 = q0.this;
                q0Var2.J.removeCallbacks(q0Var2.F);
                return false;
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public final void run() {
            l0 l0Var = q0.this.f1371c;
            if (l0Var != null) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                if (x.g.b(l0Var) && q0.this.f1371c.getCount() > q0.this.f1371c.getChildCount()) {
                    int childCount = q0.this.f1371c.getChildCount();
                    q0 q0Var = q0.this;
                    if (childCount <= q0Var.B) {
                        q0Var.N.setInputMethodMode(2);
                        q0.this.d();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                O = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                Q = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                P = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public q0(Context context, AttributeSet attributeSet, int i, int i10) {
        this.f1369a = context;
        this.J = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ad.c.I, i, i10);
        this.f1374u = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1375v = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1377x = true;
        }
        obtainStyledAttributes.recycle();
        t tVar = new t(context, attributeSet, i, i10);
        this.N = tVar;
        tVar.setInputMethodMode(1);
    }

    public final boolean b() {
        return this.N.isShowing();
    }

    public final int c() {
        return this.f1374u;
    }

    public final void d() {
        int i;
        int i10;
        int i11;
        l0 l0Var;
        int i12;
        if (this.f1371c == null) {
            l0 q10 = q(this.f1369a, !this.M);
            this.f1371c = q10;
            q10.setAdapter(this.f1370b);
            this.f1371c.setOnItemClickListener(this.E);
            this.f1371c.setFocusable(true);
            this.f1371c.setFocusableInTouchMode(true);
            this.f1371c.setOnItemSelectedListener(new p0(this));
            this.f1371c.setOnScrollListener(this.H);
            this.N.setContentView(this.f1371c);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.N.getContentView();
        }
        Drawable background = this.N.getBackground();
        int i13 = 0;
        if (background != null) {
            background.getPadding(this.K);
            Rect rect = this.K;
            int i14 = rect.top;
            i = rect.bottom + i14;
            if (!this.f1377x) {
                this.f1375v = -i14;
            }
        } else {
            this.K.setEmpty();
            i = 0;
        }
        boolean z10 = this.N.getInputMethodMode() == 2;
        View view = this.D;
        int i15 = this.f1375v;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = P;
            if (method != null) {
                try {
                    i10 = ((Integer) method.invoke(this.N, new Object[]{view, Integer.valueOf(i15), Boolean.valueOf(z10)})).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            i10 = this.N.getMaxAvailableHeight(view, i15);
        } else {
            i10 = this.N.getMaxAvailableHeight(view, i15, z10);
        }
        if (this.f1372s == -1) {
            i11 = i10 + i;
        } else {
            int i16 = this.f1373t;
            if (i16 == -2) {
                int i17 = this.f1369a.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.K;
                i12 = View.MeasureSpec.makeMeasureSpec(i17 - (rect2.left + rect2.right), LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
            } else if (i16 != -1) {
                i12 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
            } else {
                int i18 = this.f1369a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.K;
                i12 = View.MeasureSpec.makeMeasureSpec(i18 - (rect3.left + rect3.right), 1073741824);
            }
            int a10 = this.f1371c.a(i12, i10 + 0);
            i11 = a10 + (a10 > 0 ? this.f1371c.getPaddingBottom() + this.f1371c.getPaddingTop() + i + 0 : 0);
        }
        boolean z11 = this.N.getInputMethodMode() == 2;
        q0.f.d(this.N, this.f1376w);
        if (this.N.isShowing()) {
            View view2 = this.D;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            if (x.g.b(view2)) {
                int i19 = this.f1373t;
                if (i19 == -1) {
                    i19 = -1;
                } else if (i19 == -2) {
                    i19 = this.D.getWidth();
                }
                int i20 = this.f1372s;
                if (i20 == -1) {
                    if (!z11) {
                        i11 = -1;
                    }
                    if (z11) {
                        this.N.setWidth(this.f1373t == -1 ? -1 : 0);
                        this.N.setHeight(0);
                    } else {
                        t tVar = this.N;
                        if (this.f1373t == -1) {
                            i13 = -1;
                        }
                        tVar.setWidth(i13);
                        this.N.setHeight(-1);
                    }
                } else if (i20 != -2) {
                    i11 = i20;
                }
                this.N.setOutsideTouchable(true);
                this.N.update(this.D, this.f1374u, this.f1375v, i19 < 0 ? -1 : i19, i11 < 0 ? -1 : i11);
                return;
            }
            return;
        }
        int i21 = this.f1373t;
        if (i21 == -1) {
            i21 = -1;
        } else if (i21 == -2) {
            i21 = this.D.getWidth();
        }
        int i22 = this.f1372s;
        if (i22 == -1) {
            i11 = -1;
        } else if (i22 != -2) {
            i11 = i22;
        }
        this.N.setWidth(i21);
        this.N.setHeight(i11);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = O;
            if (method2 != null) {
                try {
                    method2.invoke(this.N, new Object[]{Boolean.TRUE});
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.N.setIsClippedToScreen(true);
        }
        this.N.setOutsideTouchable(true);
        this.N.setTouchInterceptor(this.G);
        if (this.z) {
            q0.f.c(this.N, this.f1378y);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = Q;
            if (method3 != null) {
                try {
                    method3.invoke(this.N, new Object[]{this.L});
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            this.N.setEpicenterBounds(this.L);
        }
        q0.e.a(this.N, this.D, this.f1374u, this.f1375v, this.A);
        this.f1371c.setSelection(-1);
        if ((!this.M || this.f1371c.isInTouchMode()) && (l0Var = this.f1371c) != null) {
            l0Var.setListSelectionHidden(true);
            l0Var.requestLayout();
        }
        if (!this.M) {
            this.J.post(this.I);
        }
    }

    public final void dismiss() {
        this.N.dismiss();
        this.N.setContentView((View) null);
        this.f1371c = null;
        this.J.removeCallbacks(this.F);
    }

    public final Drawable f() {
        return this.N.getBackground();
    }

    public final ListView g() {
        return this.f1371c;
    }

    public final void i(Drawable drawable) {
        this.N.setBackgroundDrawable(drawable);
    }

    public final void j(int i) {
        this.f1375v = i;
        this.f1377x = true;
    }

    public final void l(int i) {
        this.f1374u = i;
    }

    public final int n() {
        if (!this.f1377x) {
            return 0;
        }
        return this.f1375v;
    }

    public void p(ListAdapter listAdapter) {
        b bVar = this.C;
        if (bVar == null) {
            this.C = new b();
        } else {
            ListAdapter listAdapter2 = this.f1370b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f1370b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.C);
        }
        l0 l0Var = this.f1371c;
        if (l0Var != null) {
            l0Var.setAdapter(this.f1370b);
        }
    }

    public l0 q(Context context, boolean z10) {
        return new l0(context, z10);
    }

    public final void r(int i) {
        Drawable background = this.N.getBackground();
        if (background != null) {
            background.getPadding(this.K);
            Rect rect = this.K;
            this.f1373t = rect.left + rect.right + i;
            return;
        }
        this.f1373t = i;
    }

    public final void s() {
        this.N.setInputMethodMode(2);
    }

    public final void t() {
        this.M = true;
        this.N.setFocusable(true);
    }

    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.N.setOnDismissListener(onDismissListener);
    }
}
