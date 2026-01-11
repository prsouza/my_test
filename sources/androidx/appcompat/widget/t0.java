package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.widget.l;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import s.h;

public final class t0 {

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f1391h = PorterDuff.Mode.SRC_IN;
    public static t0 i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f1392j = new c();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, h<ColorStateList>> f1393a;

    /* renamed from: b  reason: collision with root package name */
    public s.g<String, e> f1394b;

    /* renamed from: c  reason: collision with root package name */
    public h<String> f1395c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, s.d<WeakReference<Drawable.ConstantState>>> f1396d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f1397e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1398f;
    public f g;

    public static class a implements e {
        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return j.a.g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    public static class b implements e {
        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                q1.b bVar = new q1.b(context);
                bVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return bVar;
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    public static class c extends s.e<Integer, PorterDuffColorFilter> {
        public c() {
            super(6);
        }
    }

    public static class d implements e {
        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                k.b.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                return drawable;
            } catch (Exception e10) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                return null;
            }
        }
    }

    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
    }

    public static class g implements e {
        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return q1.f.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    public static synchronized t0 d() {
        t0 t0Var;
        synchronized (t0.class) {
            if (i == null) {
                t0 t0Var2 = new t0();
                i = t0Var2;
                j(t0Var2);
            }
            t0Var = i;
        }
        return t0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (t0.class) {
            c cVar = f1392j;
            Objects.requireNonNull(cVar);
            int i11 = (i10 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) cVar.get(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                Objects.requireNonNull(cVar);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) cVar.put(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(t0 t0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            t0Var.a("vector", new g());
            t0Var.a("animated-vector", new b());
            t0Var.a("animated-selector", new a());
            t0Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f1394b == null) {
            this.f1394b = new s.g<>();
        }
        this.f1394b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        s.d dVar = this.f1396d.get(context);
        if (dVar == null) {
            dVar = new s.d();
            this.f1396d.put(context, dVar);
        }
        dVar.i(j10, new WeakReference(constantState));
        return true;
    }

    public final Drawable c(Context context, int i10) {
        if (this.f1397e == null) {
            this.f1397e = new TypedValue();
        }
        TypedValue typedValue = this.f1397e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        f fVar = this.g;
        LayerDrawable layerDrawable = null;
        if (fVar != null) {
            l.a aVar = (l.a) fVar;
            Objects.requireNonNull(aVar);
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, 2131165257)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.f10820c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable e(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, s.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1396d     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            s.d r0 = (s.d) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.g(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.f10819b     // Catch:{ all -> 0x0041 }
            int r2 = r0.f10821s     // Catch:{ all -> 0x0041 }
            int r4 = ge.g0.k(r4, r2, r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.f10820c     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = s.d.f10817t     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.f10818a = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.e(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable g(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f1398f     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0006
            goto L_0x002b
        L_0x0006:
            r0 = 1
            r4.f1398f = r0     // Catch:{ all -> 0x004a }
            r1 = 2131165318(0x7f070086, float:1.794485E38)
            android.graphics.drawable.Drawable r1 = r4.f(r5, r1)     // Catch:{ all -> 0x004a }
            r2 = 0
            if (r1 == 0) goto L_0x004c
            boolean r3 = r1 instanceof q1.f     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x004a }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x004a }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = r2
        L_0x0029:
            if (r0 == 0) goto L_0x004c
        L_0x002b:
            android.graphics.drawable.Drawable r0 = r4.k(r5, r6)     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r4.c(r5, r6)     // Catch:{ all -> 0x004a }
        L_0x0035:
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = d0.a.f4256a     // Catch:{ all -> 0x004a }
            android.graphics.drawable.Drawable r0 = d0.a.b.b(r5, r6)     // Catch:{ all -> 0x004a }
        L_0x003d:
            if (r0 == 0) goto L_0x0043
            android.graphics.drawable.Drawable r0 = r4.l(r5, r6, r7, r0)     // Catch:{ all -> 0x004a }
        L_0x0043:
            if (r0 == 0) goto L_0x0048
            androidx.appcompat.widget.k0.b(r0)     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r4)
            return r0
        L_0x004a:
            r5 = move-exception
            goto L_0x0056
        L_0x004c:
            r4.f1398f = r2     // Catch:{ all -> 0x004a }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004a }
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch:{ all -> 0x004a }
            throw r5     // Catch:{ all -> 0x004a }
        L_0x0056:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r0.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList i(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, s.h<android.content.res.ColorStateList>> r0 = r3.f1393a     // Catch:{ all -> 0x0049 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0049 }
            s.h r0 = (s.h) r0     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.c(r5, r1)     // Catch:{ all -> 0x0049 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0049 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x004b
            androidx.appcompat.widget.t0$f r0 = r3.g     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            androidx.appcompat.widget.l$a r0 = (androidx.appcompat.widget.l.a) r0     // Catch:{ all -> 0x0049 }
            android.content.res.ColorStateList r1 = r0.d(r4, r5)     // Catch:{ all -> 0x0049 }
        L_0x0023:
            if (r1 == 0) goto L_0x0047
            java.util.WeakHashMap<android.content.Context, s.h<android.content.res.ColorStateList>> r0 = r3.f1393a     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0030
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            r3.f1393a = r0     // Catch:{ all -> 0x0049 }
        L_0x0030:
            java.util.WeakHashMap<android.content.Context, s.h<android.content.res.ColorStateList>> r0 = r3.f1393a     // Catch:{ all -> 0x0049 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0049 }
            s.h r0 = (s.h) r0     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0044
            s.h r0 = new s.h     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            java.util.WeakHashMap<android.content.Context, s.h<android.content.res.ColorStateList>> r2 = r3.f1393a     // Catch:{ all -> 0x0049 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0049 }
        L_0x0044:
            r0.a(r5, r1)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            r0 = r1
            goto L_0x004b
        L_0x0049:
            r4 = move-exception
            goto L_0x004d
        L_0x004b:
            monitor-exit(r3)
            return r0
        L_0x004d:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.i(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ Exception -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[Catch:{ Exception -> 0x00a8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable k(android.content.Context r12, int r13) {
        /*
            r11 = this;
            s.g<java.lang.String, androidx.appcompat.widget.t0$e> r0 = r11.f1394b
            r1 = 0
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b8
            s.h<java.lang.String> r0 = r11.f1395c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.c(r13, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            s.g<java.lang.String, androidx.appcompat.widget.t0$e> r3 = r11.f1394b
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            s.h r0 = new s.h
            r0.<init>()
            r11.f1395c = r0
        L_0x002f:
            android.util.TypedValue r0 = r11.f1397e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r11.f1397e = r0
        L_0x003a:
            android.util.TypedValue r0 = r11.f1397e
            android.content.res.Resources r3 = r12.getResources()
            r4 = 1
            r3.getValue(r13, r0, r4)
            int r5 = r0.assetCookie
            long r5 = (long) r5
            r7 = 32
            long r5 = r5 << r7
            int r7 = r0.data
            long r7 = (long) r7
            long r5 = r5 | r7
            android.graphics.drawable.Drawable r7 = r11.e(r12, r5)
            if (r7 == 0) goto L_0x0055
            return r7
        L_0x0055:
            java.lang.CharSequence r8 = r0.string
            if (r8 == 0) goto L_0x00b0
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = ".xml"
            boolean r8 = r8.endsWith(r9)
            if (r8 == 0) goto L_0x00b0
            android.content.res.XmlResourceParser r3 = r3.getXml(r13)     // Catch:{ Exception -> 0x00a8 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r3)     // Catch:{ Exception -> 0x00a8 }
        L_0x006d:
            int r9 = r3.next()     // Catch:{ Exception -> 0x00a8 }
            r10 = 2
            if (r9 == r10) goto L_0x0077
            if (r9 == r4) goto L_0x0077
            goto L_0x006d
        L_0x0077:
            if (r9 != r10) goto L_0x00a0
            java.lang.String r4 = r3.getName()     // Catch:{ Exception -> 0x00a8 }
            s.h<java.lang.String> r9 = r11.f1395c     // Catch:{ Exception -> 0x00a8 }
            r9.a(r13, r4)     // Catch:{ Exception -> 0x00a8 }
            s.g<java.lang.String, androidx.appcompat.widget.t0$e> r9 = r11.f1394b     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r1 = r9.getOrDefault(r4, r1)     // Catch:{ Exception -> 0x00a8 }
            androidx.appcompat.widget.t0$e r1 = (androidx.appcompat.widget.t0.e) r1     // Catch:{ Exception -> 0x00a8 }
            if (r1 == 0) goto L_0x0095
            android.content.res.Resources$Theme r4 = r12.getTheme()     // Catch:{ Exception -> 0x00a8 }
            android.graphics.drawable.Drawable r1 = r1.a(r12, r3, r8, r4)     // Catch:{ Exception -> 0x00a8 }
            r7 = r1
        L_0x0095:
            if (r7 == 0) goto L_0x00b0
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a8 }
            r7.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a8 }
            r11.b(r12, r5, r7)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00b0
        L_0x00a0:
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r0 = "No start tag found"
            r12.<init>(r0)     // Catch:{ Exception -> 0x00a8 }
            throw r12     // Catch:{ Exception -> 0x00a8 }
        L_0x00a8:
            r12 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r12)
        L_0x00b0:
            if (r7 != 0) goto L_0x00b7
            s.h<java.lang.String> r12 = r11.f1395c
            r12.a(r13, r2)
        L_0x00b7:
            return r7
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.k(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final Drawable l(Context context, int i10, boolean z, Drawable drawable) {
        ColorStateList i11 = i(context, i10);
        PorterDuff.Mode mode = null;
        if (i11 != null) {
            if (k0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(i11);
            if (this.g != null && i10 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawable;
            }
            drawable.setTintMode(mode);
            return drawable;
        }
        f fVar = this.g;
        if (fVar != null) {
            l.a aVar = (l.a) fVar;
            boolean z10 = true;
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c10 = y0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = l.f1311b;
                aVar.e(findDrawableByLayerId, c10, mode2);
                aVar.e(layerDrawable.findDrawableByLayerId(16908303), y0.c(context, R.attr.colorControlNormal), mode2);
                aVar.e(layerDrawable.findDrawableByLayerId(16908301), y0.c(context, R.attr.colorControlActivated), mode2);
            } else if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b10 = y0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = l.f1311b;
                aVar.e(findDrawableByLayerId2, b10, mode3);
                aVar.e(layerDrawable2.findDrawableByLayerId(16908303), y0.c(context, R.attr.colorControlActivated), mode3);
                aVar.e(layerDrawable2.findDrawableByLayerId(16908301), y0.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z10 = false;
            }
            if (z10) {
                return drawable;
            }
        }
        if (m(context, i10, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.t0$f r0 = r7.g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006f
            androidx.appcompat.widget.l$a r0 = (androidx.appcompat.widget.l.a) r0
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.l.f1311b
            int[] r4 = r0.f1314a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x001a
            r5 = 2130903283(0x7f0300f3, float:1.741338E38)
            goto L_0x0046
        L_0x001a:
            int[] r4 = r0.f1316c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L_0x0026
            r5 = 2130903281(0x7f0300f1, float:1.7413376E38)
            goto L_0x0046
        L_0x0026:
            int[] r4 = r0.f1317d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L_0x0031
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0046
        L_0x0031:
            r0 = 2131165277(0x7f07005d, float:1.7944767E38)
            if (r9 != r0) goto L_0x0041
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x0048
        L_0x0041:
            r0 = 2131165259(0x7f07004b, float:1.794473E38)
            if (r9 != r0) goto L_0x004a
        L_0x0046:
            r9 = r5
            r0 = r6
        L_0x0048:
            r4 = r1
            goto L_0x004d
        L_0x004a:
            r9 = r2
            r4 = r9
            r0 = r6
        L_0x004d:
            if (r4 == 0) goto L_0x006b
            boolean r4 = androidx.appcompat.widget.k0.a(r10)
            if (r4 == 0) goto L_0x0059
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L_0x0059:
            int r8 = androidx.appcompat.widget.y0.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.l.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x0069
            r10.setAlpha(r0)
        L_0x0069:
            r8 = r1
            goto L_0x006c
        L_0x006b:
            r8 = r2
        L_0x006c:
            if (r8 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r1 = r2
        L_0x0070:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
