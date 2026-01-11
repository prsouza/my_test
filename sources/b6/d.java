package b6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.media.b;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import f0.f;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f2869a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2870b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2871c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2872d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2873e;

    /* renamed from: f  reason: collision with root package name */
    public final float f2874f;
    public final float g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2875h;
    public final float i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f2876j;

    /* renamed from: k  reason: collision with root package name */
    public float f2877k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2878l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2879m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f2880n;

    public class a extends f.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f2881a;

        public a(b bVar) {
            this.f2881a = bVar;
        }

        public final void d(int i) {
            d.this.f2879m = true;
            this.f2881a.z1(i);
        }

        public final void e(Typeface typeface) {
            d dVar = d.this;
            dVar.f2880n = Typeface.create(typeface, dVar.f2871c);
            d dVar2 = d.this;
            dVar2.f2879m = true;
            this.f2881a.A1(dVar2.f2880n, false);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, e5.a.F);
        this.f2877k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f2876j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.f2871c = obtainStyledAttributes.getInt(2, 0);
        this.f2872d = obtainStyledAttributes.getInt(1, 1);
        int i11 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f2878l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f2870b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.f2869a = c.a(context, obtainStyledAttributes, 6);
        this.f2873e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f2874f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, e5.a.f4635u);
        this.f2875h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.f2880n == null && (str = this.f2870b) != null) {
            this.f2880n = Typeface.create(str, this.f2871c);
        }
        if (this.f2880n == null) {
            int i10 = this.f2872d;
            if (i10 == 1) {
                this.f2880n = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f2880n = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f2880n = Typeface.DEFAULT;
            } else {
                this.f2880n = Typeface.MONOSPACE;
            }
            this.f2880n = Typeface.create(this.f2880n, this.f2871c);
        }
    }

    public final Typeface b(Context context) {
        if (this.f2879m) {
            return this.f2880n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a10 = f.a(context, this.f2878l);
                this.f2880n = a10;
                if (a10 != null) {
                    this.f2880n = Typeface.create(a10, this.f2871c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                StringBuilder d10 = a.a.d("Error loading font ");
                d10.append(this.f2870b);
                Log.d("TextAppearance", d10.toString(), e10);
            }
        }
        a();
        this.f2879m = true;
        return this.f2880n;
    }

    public final void c(Context context, b bVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f2878l;
        if (i10 == 0) {
            this.f2879m = true;
        }
        if (this.f2879m) {
            bVar.A1(this.f2880n, true);
            return;
        }
        try {
            a aVar = new a(bVar);
            ThreadLocal<TypedValue> threadLocal = f.f4887a;
            if (context.isRestricted()) {
                aVar.a(-4);
                return;
            }
            f.b(context, i10, new TypedValue(), 0, aVar, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f2879m = true;
            bVar.z1(1);
        } catch (Exception e10) {
            StringBuilder d10 = a.a.d("Error loading font ");
            d10.append(this.f2870b);
            Log.d("TextAppearance", d10.toString(), e10);
            this.f2879m = true;
            bVar.z1(-3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f2878l
            if (r1 == 0) goto L_0x001c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = f0.f.f4887a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L_0x000d
            goto L_0x001c
        L_0x000d:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = f0.f.b(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            if (r8 == 0) goto L_0x0021
            r8 = 1
            goto L_0x0022
        L_0x0021:
            r8 = 0
        L_0x0022:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.d.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, b bVar) {
        f(context, textPaint, bVar);
        ColorStateList colorStateList = this.f2876j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.g;
        float f11 = this.f2873e;
        float f12 = this.f2874f;
        ColorStateList colorStateList2 = this.f2869a;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, b bVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f2880n);
        c(context, new e(this, context, textPaint, bVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a10 = f.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f2871c & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f2877k);
        if (this.f2875h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
