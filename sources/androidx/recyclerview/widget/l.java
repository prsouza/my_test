package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class l extends RecyclerView.m implements RecyclerView.q {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A;
    public final a B;
    public final b C;

    /* renamed from: a  reason: collision with root package name */
    public final int f2527a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2528b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f2529c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f2530d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2531e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2532f;
    public final StateListDrawable g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f2533h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2534j;

    /* renamed from: k  reason: collision with root package name */
    public int f2535k;

    /* renamed from: l  reason: collision with root package name */
    public int f2536l;

    /* renamed from: m  reason: collision with root package name */
    public float f2537m;

    /* renamed from: n  reason: collision with root package name */
    public int f2538n;

    /* renamed from: o  reason: collision with root package name */
    public int f2539o;

    /* renamed from: p  reason: collision with root package name */
    public float f2540p;

    /* renamed from: q  reason: collision with root package name */
    public int f2541q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f2542r = 0;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f2543s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2544t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2545u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f2546v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f2547w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f2548x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f2549y = new int[2];
    public final ValueAnimator z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            l lVar = l.this;
            int i = lVar.A;
            if (i == 1) {
                lVar.z.cancel();
            } else if (i != 2) {
                return;
            }
            lVar.A = 3;
            ValueAnimator valueAnimator = lVar.z;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            lVar.z.setDuration((long) 500);
            lVar.z.start();
        }
    }

    public class b extends RecyclerView.r {
        public b() {
        }

        public final void b(RecyclerView recyclerView, int i, int i10) {
            l lVar = l.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = lVar.f2543s.computeVerticalScrollRange();
            int i11 = lVar.f2542r;
            lVar.f2544t = computeVerticalScrollRange - i11 > 0 && i11 >= lVar.f2527a;
            int computeHorizontalScrollRange = lVar.f2543s.computeHorizontalScrollRange();
            int i12 = lVar.f2541q;
            boolean z = computeHorizontalScrollRange - i12 > 0 && i12 >= lVar.f2527a;
            lVar.f2545u = z;
            boolean z10 = lVar.f2544t;
            if (z10 || z) {
                if (z10) {
                    float f10 = (float) i11;
                    lVar.f2536l = (int) ((((f10 / 2.0f) + ((float) computeVerticalScrollOffset)) * f10) / ((float) computeVerticalScrollRange));
                    lVar.f2535k = Math.min(i11, (i11 * i11) / computeVerticalScrollRange);
                }
                if (lVar.f2545u) {
                    float f11 = (float) computeHorizontalScrollOffset;
                    float f12 = (float) i12;
                    lVar.f2539o = (int) ((((f12 / 2.0f) + f11) * f12) / ((float) computeHorizontalScrollRange));
                    lVar.f2538n = Math.min(i12, (i12 * i12) / computeHorizontalScrollRange);
                }
                int i13 = lVar.f2546v;
                if (i13 == 0 || i13 == 1) {
                    lVar.k(1);
                }
            } else if (lVar.f2546v != 0) {
                lVar.k(0);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2552a = false;

        public c() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f2552a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f2552a) {
                this.f2552a = false;
            } else if (((Float) l.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                l lVar = l.this;
                lVar.A = 0;
                lVar.k(0);
            } else {
                l lVar2 = l.this;
                lVar2.A = 2;
                lVar2.i();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l.this.f2529c.setAlpha(floatValue);
            l.this.f2530d.setAlpha(floatValue);
            l.this.i();
        }
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$r>, java.util.ArrayList] */
    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        boolean z10 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.z = ofFloat;
        this.A = 0;
        this.B = new a();
        b bVar = new b();
        this.C = bVar;
        this.f2529c = stateListDrawable;
        this.f2530d = drawable;
        this.g = stateListDrawable2;
        this.f2533h = drawable2;
        this.f2531e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f2532f = Math.max(i10, drawable.getIntrinsicWidth());
        this.i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f2534j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f2527a = i11;
        this.f2528b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f2543s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.n nVar = recyclerView2.B;
                if (nVar != null) {
                    nVar.d("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.E.remove(this);
                if (recyclerView2.E.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z10);
                }
                recyclerView2.Q();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f2543s;
                recyclerView3.F.remove(this);
                if (recyclerView3.G == this) {
                    recyclerView3.G = null;
                }
                ? r72 = this.f2543s.f2298x0;
                if (r72 != 0) {
                    r72.remove(bVar);
                }
                f();
            }
            this.f2543s = recyclerView;
            if (recyclerView != null) {
                recyclerView.g(this);
                this.f2543s.F.add(this);
                this.f2543s.h(bVar);
            }
        }
    }

    public final void a(MotionEvent motionEvent) {
        if (this.f2546v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean h10 = h(motionEvent.getX(), motionEvent.getY());
                boolean g8 = g(motionEvent.getX(), motionEvent.getY());
                if (h10 || g8) {
                    if (g8) {
                        this.f2547w = 1;
                        this.f2540p = (float) ((int) motionEvent.getX());
                    } else if (h10) {
                        this.f2547w = 2;
                        this.f2537m = (float) ((int) motionEvent.getY());
                    }
                    k(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f2546v == 2) {
                this.f2537m = 0.0f;
                this.f2540p = 0.0f;
                k(1);
                this.f2547w = 0;
            } else if (motionEvent.getAction() == 2 && this.f2546v == 2) {
                l();
                if (this.f2547w == 1) {
                    float x10 = motionEvent.getX();
                    int[] iArr = this.f2549y;
                    int i10 = this.f2528b;
                    iArr[0] = i10;
                    iArr[1] = this.f2541q - i10;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x10));
                    if (Math.abs(((float) this.f2539o) - max) >= 2.0f) {
                        int j10 = j(this.f2540p, max, iArr, this.f2543s.computeHorizontalScrollRange(), this.f2543s.computeHorizontalScrollOffset(), this.f2541q);
                        if (j10 != 0) {
                            this.f2543s.scrollBy(j10, 0);
                        }
                        this.f2540p = max;
                    }
                }
                if (this.f2547w == 2) {
                    float y10 = motionEvent.getY();
                    int[] iArr2 = this.f2548x;
                    int i11 = this.f2528b;
                    iArr2[0] = i11;
                    iArr2[1] = this.f2542r - i11;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y10));
                    if (Math.abs(((float) this.f2536l) - max2) >= 2.0f) {
                        int j11 = j(this.f2537m, max2, iArr2, this.f2543s.computeVerticalScrollRange(), this.f2543s.computeVerticalScrollOffset(), this.f2542r);
                        if (j11 != 0) {
                            this.f2543s.scrollBy(0, j11);
                        }
                        this.f2537m = max2;
                    }
                }
            }
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        int i10 = this.f2546v;
        if (i10 == 1) {
            boolean h10 = h(motionEvent.getX(), motionEvent.getY());
            boolean g8 = g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (h10 || g8)) {
                if (g8) {
                    this.f2547w = 1;
                    this.f2540p = (float) ((int) motionEvent.getX());
                } else if (h10) {
                    this.f2547w = 2;
                    this.f2537m = (float) ((int) motionEvent.getY());
                }
                k(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    public final void c() {
    }

    public final void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        if (this.f2541q != this.f2543s.getWidth() || this.f2542r != this.f2543s.getHeight()) {
            this.f2541q = this.f2543s.getWidth();
            this.f2542r = this.f2543s.getHeight();
            k(0);
        } else if (this.A != 0) {
            if (this.f2544t) {
                int i10 = this.f2541q;
                int i11 = this.f2531e;
                int i12 = i10 - i11;
                int i13 = this.f2536l;
                int i14 = this.f2535k;
                int i15 = i13 - (i14 / 2);
                this.f2529c.setBounds(0, 0, i11, i14);
                this.f2530d.setBounds(0, 0, this.f2532f, this.f2542r);
                RecyclerView recyclerView2 = this.f2543s;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                boolean z10 = true;
                if (x.e.d(recyclerView2) != 1) {
                    z10 = false;
                }
                if (z10) {
                    this.f2530d.draw(canvas);
                    canvas.translate((float) this.f2531e, (float) i15);
                    canvas.scale(-1.0f, 1.0f);
                    this.f2529c.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.f2531e), (float) (-i15));
                } else {
                    canvas.translate((float) i12, 0.0f);
                    this.f2530d.draw(canvas);
                    canvas.translate(0.0f, (float) i15);
                    this.f2529c.draw(canvas);
                    canvas.translate((float) (-i12), (float) (-i15));
                }
            }
            if (this.f2545u) {
                int i16 = this.f2542r;
                int i17 = this.i;
                int i18 = i16 - i17;
                int i19 = this.f2539o;
                int i20 = this.f2538n;
                int i21 = i19 - (i20 / 2);
                this.g.setBounds(0, 0, i20, i17);
                this.f2533h.setBounds(0, 0, this.f2541q, this.f2534j);
                canvas.translate(0.0f, (float) i18);
                this.f2533h.draw(canvas);
                canvas.translate((float) i21, 0.0f);
                this.g.draw(canvas);
                canvas.translate((float) (-i21), (float) (-i18));
            }
        }
    }

    public final void f() {
        this.f2543s.removeCallbacks(this.B);
    }

    public final boolean g(float f10, float f11) {
        if (f11 >= ((float) (this.f2542r - this.i))) {
            int i10 = this.f2539o;
            int i11 = this.f2538n;
            return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) ((i11 / 2) + i10));
        }
    }

    public final boolean h(float f10, float f11) {
        RecyclerView recyclerView = this.f2543s;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.e.d(recyclerView) == 1) {
            if (f10 > ((float) this.f2531e)) {
                return false;
            }
        } else if (f10 < ((float) (this.f2541q - this.f2531e))) {
            return false;
        }
        int i10 = this.f2536l;
        int i11 = this.f2535k;
        if (f11 < ((float) (i10 - (i11 / 2))) || f11 > ((float) ((i11 / 2) + i10))) {
            return false;
        }
        return true;
    }

    public final void i() {
        this.f2543s.invalidate();
    }

    public final int j(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / ((float) i13)) * ((float) i14));
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    public final void k(int i10) {
        if (i10 == 2 && this.f2546v != 2) {
            this.f2529c.setState(D);
            f();
        }
        if (i10 == 0) {
            i();
        } else {
            l();
        }
        if (this.f2546v == 2 && i10 != 2) {
            this.f2529c.setState(E);
            f();
            this.f2543s.postDelayed(this.B, (long) 1200);
        } else if (i10 == 1) {
            f();
            this.f2543s.postDelayed(this.B, (long) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f2546v = i10;
    }

    public final void l() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.z.setDuration(500);
        this.z.setStartDelay(0);
        this.z.start();
    }
}
