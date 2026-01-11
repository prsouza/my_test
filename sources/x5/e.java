package x5;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import b1.b;
import b6.a;
import b6.f;
import java.util.Objects;
import java.util.WeakHashMap;
import l0.e;
import n0.a0;
import n0.x;
import x5.l;

public final class e {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public int[] J;
    public boolean K;
    public final TextPaint L;
    public final TextPaint M;
    public TimeInterpolator N;
    public TimeInterpolator O;
    public float P;
    public float Q;
    public float R;
    public ColorStateList S;
    public float T;
    public float U;
    public float V;
    public StaticLayout W;
    public float X;
    public CharSequence Y;

    /* renamed from: a  reason: collision with root package name */
    public final View f12806a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12807b;

    /* renamed from: c  reason: collision with root package name */
    public float f12808c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f12809d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f12810e;

    /* renamed from: f  reason: collision with root package name */
    public final RectF f12811f;
    public int g = 16;

    /* renamed from: h  reason: collision with root package name */
    public int f12812h = 16;
    public float i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f12813j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f12814k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f12815l;

    /* renamed from: m  reason: collision with root package name */
    public float f12816m;

    /* renamed from: n  reason: collision with root package name */
    public float f12817n;

    /* renamed from: o  reason: collision with root package name */
    public float f12818o;

    /* renamed from: p  reason: collision with root package name */
    public float f12819p;

    /* renamed from: q  reason: collision with root package name */
    public float f12820q;

    /* renamed from: r  reason: collision with root package name */
    public float f12821r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f12822s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f12823t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f12824u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f12825v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f12826w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f12827x;

    /* renamed from: y  reason: collision with root package name */
    public Typeface f12828y;
    public a z;

    public e(View view) {
        this.f12806a = view;
        TextPaint textPaint = new TextPaint(129);
        this.L = textPaint;
        this.M = new TextPaint(textPaint);
        this.f12810e = new Rect();
        this.f12809d = new Rect();
        this.f12811f = new RectF();
        i(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((((float) Color.alpha(i11)) * f10) + (((float) Color.alpha(i10)) * f11)), Math.round((((float) Color.red(i11)) * f10) + (((float) Color.red(i10)) * f11)), Math.round((((float) Color.green(i11)) * f10) + (((float) Color.green(i10)) * f11)), Math.round((((float) Color.blue(i11)) * f10) + (((float) Color.blue(i10)) * f11)));
    }

    public static float h(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = f5.a.f4984a;
        return a.a.a(f11, f10, f12, f10);
    }

    public final boolean b(CharSequence charSequence) {
        e.d dVar;
        View view = this.f12806a;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        boolean z10 = true;
        if (x.e.d(view) != 1) {
            z10 = false;
        }
        if (z10) {
            dVar = l0.e.f7755d;
        } else {
            dVar = l0.e.f7754c;
        }
        return dVar.b(charSequence, charSequence.length());
    }

    public final void c(float f10) {
        this.f12811f.left = h((float) this.f12809d.left, (float) this.f12810e.left, f10, this.N);
        this.f12811f.top = h(this.f12816m, this.f12817n, f10, this.N);
        this.f12811f.right = h((float) this.f12809d.right, (float) this.f12810e.right, f10, this.N);
        this.f12811f.bottom = h((float) this.f12809d.bottom, (float) this.f12810e.bottom, f10, this.N);
        this.f12820q = h(this.f12818o, this.f12819p, f10, this.N);
        this.f12821r = h(this.f12816m, this.f12817n, f10, this.N);
        p(f10);
        b bVar = f5.a.f4985b;
        h(0.0f, 1.0f, 1.0f - f10, bVar);
        View view = this.f12806a;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.k(view);
        h(1.0f, 0.0f, f10, bVar);
        x.d.k(this.f12806a);
        ColorStateList colorStateList = this.f12815l;
        ColorStateList colorStateList2 = this.f12814k;
        if (colorStateList != colorStateList2) {
            this.L.setColor(a(g(colorStateList2), f(), f10));
        } else {
            this.L.setColor(f());
        }
        float f11 = this.T;
        float f12 = this.U;
        if (f11 != f12) {
            this.L.setLetterSpacing(h(f12, f11, f10, bVar));
        } else {
            this.L.setLetterSpacing(f11);
        }
        this.G = h(0.0f, this.P, f10, (TimeInterpolator) null);
        this.H = h(0.0f, this.Q, f10, (TimeInterpolator) null);
        this.I = h(0.0f, this.R, f10, (TimeInterpolator) null);
        this.L.setShadowLayer(this.G, this.H, this.I, a(g((ColorStateList) null), g(this.S), f10));
        x.d.k(this.f12806a);
    }

    public final void d(float f10, boolean z10) {
        float f11;
        float f12;
        boolean z11;
        StaticLayout staticLayout;
        if (this.A != null) {
            float width = (float) this.f12810e.width();
            float width2 = (float) this.f12809d.width();
            if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
                f12 = this.f12813j;
                f11 = this.T;
                this.E = 1.0f;
                Typeface typeface = this.f12828y;
                Typeface typeface2 = this.f12822s;
                if (typeface != typeface2) {
                    this.f12828y = typeface2;
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                float f13 = this.i;
                float f14 = this.U;
                Typeface typeface3 = this.f12828y;
                Typeface typeface4 = this.f12825v;
                if (typeface3 != typeface4) {
                    this.f12828y = typeface4;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                    this.E = 1.0f;
                } else {
                    this.E = h(this.i, this.f12813j, f10, this.O) / this.i;
                }
                float f15 = this.f12813j / this.i;
                width = (!z10 && width2 * f15 > width) ? Math.min(width / f15, width2) : width2;
                f12 = f13;
                f11 = f14;
            }
            if (width > 0.0f) {
                z11 = ((this.F > f12 ? 1 : (this.F == f12 ? 0 : -1)) != 0) || ((this.V > f11 ? 1 : (this.V == f11 ? 0 : -1)) != 0) || this.K || z11;
                this.F = f12;
                this.V = f11;
                this.K = false;
            }
            if (this.B == null || z11) {
                this.L.setTextSize(this.F);
                this.L.setTypeface(this.f12828y);
                this.L.setLetterSpacing(this.V);
                this.L.setLinearText(this.E != 1.0f);
                boolean b10 = b(this.A);
                this.C = b10;
                try {
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    l lVar = new l(this.A, this.L, (int) width);
                    lVar.f12852l = TextUtils.TruncateAt.END;
                    lVar.f12851k = b10;
                    lVar.f12847e = alignment;
                    lVar.f12850j = false;
                    lVar.f12848f = 1;
                    lVar.g = 0.0f;
                    lVar.f12849h = 1.0f;
                    lVar.i = 1;
                    staticLayout = lVar.a();
                } catch (l.a e10) {
                    Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
                    staticLayout = null;
                }
                Objects.requireNonNull(staticLayout);
                this.W = staticLayout;
                this.B = staticLayout.getText();
            }
        }
    }

    public final float e() {
        TextPaint textPaint = this.M;
        textPaint.setTextSize(this.f12813j);
        textPaint.setTypeface(this.f12822s);
        textPaint.setLetterSpacing(this.T);
        return -this.M.ascent();
    }

    public final int f() {
        return g(this.f12815l);
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.J;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f12824u;
            if (typeface != null) {
                this.f12823t = f.a(configuration, typeface);
            }
            Typeface typeface2 = this.f12827x;
            if (typeface2 != null) {
                this.f12826w = f.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f12823t;
            if (typeface3 == null) {
                typeface3 = this.f12824u;
            }
            this.f12822s = typeface3;
            Typeface typeface4 = this.f12826w;
            if (typeface4 == null) {
                typeface4 = this.f12827x;
            }
            this.f12825v = typeface4;
            k(true);
        }
    }

    public final void j() {
        this.f12807b = this.f12810e.width() > 0 && this.f12810e.height() > 0 && this.f12809d.width() > 0 && this.f12809d.height() > 0;
    }

    public final void k(boolean z10) {
        StaticLayout staticLayout;
        if ((this.f12806a.getHeight() > 0 && this.f12806a.getWidth() > 0) || z10) {
            d(1.0f, z10);
            CharSequence charSequence = this.B;
            if (!(charSequence == null || (staticLayout = this.W) == null)) {
                this.Y = TextUtils.ellipsize(charSequence, this.L, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
            }
            CharSequence charSequence2 = this.Y;
            float f10 = 0.0f;
            if (charSequence2 != null) {
                this.X = this.L.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.X = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f12812h, this.C ? 1 : 0);
            int i10 = absoluteGravity & 112;
            if (i10 == 48) {
                this.f12817n = (float) this.f12810e.top;
            } else if (i10 != 80) {
                this.f12817n = ((float) this.f12810e.centerY()) - ((this.L.descent() - this.L.ascent()) / 2.0f);
            } else {
                this.f12817n = this.L.ascent() + ((float) this.f12810e.bottom);
            }
            int i11 = absoluteGravity & 8388615;
            if (i11 == 1) {
                this.f12819p = ((float) this.f12810e.centerX()) - (this.X / 2.0f);
            } else if (i11 != 5) {
                this.f12819p = (float) this.f12810e.left;
            } else {
                this.f12819p = ((float) this.f12810e.right) - this.X;
            }
            d(0.0f, z10);
            StaticLayout staticLayout2 = this.W;
            float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
            StaticLayout staticLayout3 = this.W;
            CharSequence charSequence3 = this.B;
            if (charSequence3 != null) {
                f10 = this.L.measureText(charSequence3, 0, charSequence3.length());
            }
            StaticLayout staticLayout4 = this.W;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.g, this.C ? 1 : 0);
            int i12 = absoluteGravity2 & 112;
            if (i12 == 48) {
                this.f12816m = (float) this.f12809d.top;
            } else if (i12 != 80) {
                this.f12816m = ((float) this.f12809d.centerY()) - (height / 2.0f);
            } else {
                this.f12816m = this.L.descent() + (((float) this.f12809d.bottom) - height);
            }
            int i13 = absoluteGravity2 & 8388615;
            if (i13 == 1) {
                this.f12818o = ((float) this.f12809d.centerX()) - (f10 / 2.0f);
            } else if (i13 != 5) {
                this.f12818o = (float) this.f12809d.left;
            } else {
                this.f12818o = ((float) this.f12809d.right) - f10;
            }
            Bitmap bitmap = this.D;
            if (bitmap != null) {
                bitmap.recycle();
                this.D = null;
            }
            p(this.f12808c);
            c(this.f12808c);
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f12815l != colorStateList) {
            this.f12815l = colorStateList;
            k(false);
        }
    }

    public final void m(int i10) {
        if (this.f12812h != i10) {
            this.f12812h = i10;
            k(false);
        }
    }

    public final boolean n(Typeface typeface) {
        a aVar = this.z;
        if (aVar != null) {
            aVar.f2868x = true;
        }
        if (this.f12824u == typeface) {
            return false;
        }
        this.f12824u = typeface;
        Typeface a10 = f.a(this.f12806a.getContext().getResources().getConfiguration(), typeface);
        this.f12823t = a10;
        if (a10 == null) {
            a10 = this.f12824u;
        }
        this.f12822s = a10;
        return true;
    }

    public final void o(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f12808c) {
            this.f12808c = f10;
            c(f10);
        }
    }

    public final void p(float f10) {
        d(f10, false);
        View view = this.f12806a;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.k(view);
    }

    public final void q(Typeface typeface) {
        boolean z10;
        boolean n10 = n(typeface);
        if (this.f12827x != typeface) {
            this.f12827x = typeface;
            Typeface a10 = f.a(this.f12806a.getContext().getResources().getConfiguration(), typeface);
            this.f12826w = a10;
            if (a10 == null) {
                a10 = this.f12827x;
            }
            this.f12825v = a10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (n10 || z10) {
            k(false);
        }
    }
}
