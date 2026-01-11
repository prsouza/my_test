package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.common.api.Api;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import n0.z;

public final class h1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: y  reason: collision with root package name */
    public static h1 f1266y;
    public static h1 z;

    /* renamed from: a  reason: collision with root package name */
    public final View f1267a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f1268b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1269c;

    /* renamed from: s  reason: collision with root package name */
    public final a f1270s = new a();

    /* renamed from: t  reason: collision with root package name */
    public final b f1271t = new b();

    /* renamed from: u  reason: collision with root package name */
    public int f1272u;

    /* renamed from: v  reason: collision with root package name */
    public int f1273v;

    /* renamed from: w  reason: collision with root package name */
    public i1 f1274w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1275x;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            h1.this.d(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            h1.this.b();
        }
    }

    public h1(View view, CharSequence charSequence) {
        this.f1267a = view;
        this.f1268b = charSequence;
        this.f1269c = z.c(ViewConfiguration.get(view.getContext()));
        a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void c(h1 h1Var) {
        h1 h1Var2 = f1266y;
        if (h1Var2 != null) {
            h1Var2.f1267a.removeCallbacks(h1Var2.f1270s);
        }
        f1266y = h1Var;
        if (h1Var != null) {
            h1Var.f1267a.postDelayed(h1Var.f1270s, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.f1272u = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1273v = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final void b() {
        if (z == this) {
            z = null;
            i1 i1Var = this.f1274w;
            if (i1Var != null) {
                i1Var.a();
                this.f1274w = null;
                a();
                this.f1267a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1266y == this) {
            c((h1) null);
        }
        this.f1267a.removeCallbacks(this.f1271t);
    }

    public final void d(boolean z10) {
        int i;
        int i10;
        long j10;
        int i11;
        long j11;
        View view = this.f1267a;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.g.b(view)) {
            c((h1) null);
            h1 h1Var = z;
            if (h1Var != null) {
                h1Var.b();
            }
            z = this;
            this.f1275x = z10;
            i1 i1Var = new i1(this.f1267a.getContext());
            this.f1274w = i1Var;
            View view2 = this.f1267a;
            int i12 = this.f1272u;
            int i13 = this.f1273v;
            boolean z11 = this.f1275x;
            CharSequence charSequence = this.f1268b;
            if (i1Var.f1283b.getParent() != null) {
                i1Var.a();
            }
            i1Var.f1284c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = i1Var.f1285d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = i1Var.f1282a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i12 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = i1Var.f1282a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i = i13 + dimensionPixelOffset2;
                i10 = i13 - dimensionPixelOffset2;
            } else {
                i = view2.getHeight();
                i10 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = i1Var.f1282a.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(i1Var.f1286e);
                Rect rect = i1Var.f1286e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = i1Var.f1282a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i1Var.f1286e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(i1Var.g);
                view2.getLocationOnScreen(i1Var.f1287f);
                int[] iArr = i1Var.f1287f;
                int i14 = iArr[0];
                int[] iArr2 = i1Var.g;
                iArr[0] = i14 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i12) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                i1Var.f1283b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = i1Var.f1283b.getMeasuredHeight();
                int[] iArr3 = i1Var.f1287f;
                int i15 = ((iArr3[1] + i10) - dimensionPixelOffset3) - measuredHeight;
                int i16 = iArr3[1] + i + dimensionPixelOffset3;
                if (z11) {
                    if (i15 >= 0) {
                        layoutParams.y = i15;
                    } else {
                        layoutParams.y = i16;
                    }
                } else if (measuredHeight + i16 <= i1Var.f1286e.height()) {
                    layoutParams.y = i16;
                } else {
                    layoutParams.y = i15;
                }
            }
            ((WindowManager) i1Var.f1282a.getSystemService("window")).addView(i1Var.f1283b, i1Var.f1285d);
            this.f1267a.addOnAttachStateChangeListener(this);
            if (this.f1275x) {
                j10 = 2500;
            } else {
                if ((x.d.g(this.f1267a) & 1) == 1) {
                    j11 = 3000;
                    i11 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j11 = 15000;
                    i11 = ViewConfiguration.getLongPressTimeout();
                }
                j10 = j11 - ((long) i11);
            }
            this.f1267a.removeCallbacks(this.f1271t);
            this.f1267a.postDelayed(this.f1271t, j10);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        boolean z10;
        if (this.f1274w != null && this.f1275x) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1267a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                a();
                b();
            }
        } else if (this.f1267a.isEnabled() && this.f1274w == null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (Math.abs(x10 - this.f1272u) > this.f1269c || Math.abs(y10 - this.f1273v) > this.f1269c) {
                this.f1272u = x10;
                this.f1273v = y10;
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c(this);
            }
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.f1272u = view.getWidth() / 2;
        this.f1273v = view.getHeight() / 2;
        d(true);
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        b();
    }
}
