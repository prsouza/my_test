package q1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class b extends e implements Animatable {

    /* renamed from: b  reason: collision with root package name */
    public C0195b f10110b;

    /* renamed from: c  reason: collision with root package name */
    public Context f10111c;

    /* renamed from: s  reason: collision with root package name */
    public ArgbEvaluator f10112s;

    /* renamed from: t  reason: collision with root package name */
    public final a f10113t;

    public class a implements Drawable.Callback {
        public a() {
        }

        public final void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            b.this.scheduleSelf(runnable, j10);
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: q1.b$b  reason: collision with other inner class name */
    public static class C0195b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f10115a;

        /* renamed from: b  reason: collision with root package name */
        public f f10116b;

        /* renamed from: c  reason: collision with root package name */
        public AnimatorSet f10117c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Animator> f10118d;

        /* renamed from: e  reason: collision with root package name */
        public s.a<Animator, String> f10119e;

        public C0195b(Drawable.Callback callback) {
        }

        public final int getChangingConfigurations() {
            return this.f10115a;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public b() {
        this((Context) null);
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f10110b.f10116b.draw(canvas);
        if (this.f10110b.f10117c.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f10110b.f10116b.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f10110b.f10115a;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f10110b.f10116b.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f10123a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f10123a.getConstantState());
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f10110b.f10116b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f10110b.f10116b.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f10110b.f10116b.getOpacity();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e A[Catch:{ XmlPullParserException -> 0x0090, IOException -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0083 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r23
            r4 = r24
            android.graphics.drawable.Drawable r0 = r1.f10123a
            if (r0 == 0) goto L_0x0012
            r5 = r22
            r0.inflate(r2, r5, r3, r4)
            return
        L_0x0012:
            r5 = r22
            int r0 = r22.getEventType()
            int r6 = r22.getDepth()
            r7 = 1
            int r6 = r6 + r7
        L_0x001e:
            if (r0 == r7) goto L_0x018a
            int r8 = r22.getDepth()
            if (r8 >= r6) goto L_0x0029
            r8 = 3
            if (r0 == r8) goto L_0x018a
        L_0x0029:
            r8 = 2
            if (r0 != r8) goto L_0x0184
            java.lang.String r0 = r22.getName()
            java.lang.String r9 = "animated-vector"
            boolean r9 = r9.equals(r0)
            r10 = 24
            r11 = 0
            r12 = 0
            if (r9 == 0) goto L_0x00ae
            int[] r0 = q1.a.f10104e
            android.content.res.TypedArray r9 = f0.k.l(r2, r4, r3, r0)
            int r0 = r9.getResourceId(r12, r12)
            if (r0 == 0) goto L_0x00a9
            android.graphics.PorterDuff$Mode r13 = q1.f.f10124y
            java.lang.String r13 = "parser error"
            java.lang.String r14 = "VectorDrawableCompat"
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 < r10) goto L_0x006b
            q1.f r8 = new q1.f
            r8.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r10 = f0.f.f4887a
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0, r4)
            r8.f10123a = r0
            q1.f$h r0 = new q1.f$h
            android.graphics.drawable.Drawable r10 = r8.f10123a
            android.graphics.drawable.Drawable$ConstantState r10 = r10.getConstantState()
            r0.<init>(r10)
            goto L_0x0095
        L_0x006b:
            android.content.res.XmlResourceParser r0 = r2.getXml(r0)     // Catch:{ XmlPullParserException -> 0x0090, IOException -> 0x008b }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x0090, IOException -> 0x008b }
        L_0x0073:
            int r15 = r0.next()     // Catch:{ XmlPullParserException -> 0x0090, IOException -> 0x008b }
            if (r15 == r8) goto L_0x007c
            if (r15 == r7) goto L_0x007c
            goto L_0x0073
        L_0x007c:
            if (r15 != r8) goto L_0x0083
            q1.f r8 = q1.f.a(r2, r0, r10, r4)     // Catch:{ XmlPullParserException -> 0x0090, IOException -> 0x008b }
            goto L_0x0095
        L_0x0083:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0090, IOException -> 0x008b }
            java.lang.String r8 = "No start tag found"
            r0.<init>(r8)     // Catch:{ XmlPullParserException -> 0x0090, IOException -> 0x008b }
            throw r0     // Catch:{ XmlPullParserException -> 0x0090, IOException -> 0x008b }
        L_0x008b:
            r0 = move-exception
            android.util.Log.e(r14, r13, r0)
            goto L_0x0094
        L_0x0090:
            r0 = move-exception
            android.util.Log.e(r14, r13, r0)
        L_0x0094:
            r8 = r11
        L_0x0095:
            r8.f10129u = r12
            q1.b$a r0 = r1.f10113t
            r8.setCallback(r0)
            q1.b$b r0 = r1.f10110b
            q1.f r0 = r0.f10116b
            if (r0 == 0) goto L_0x00a5
            r0.setCallback(r11)
        L_0x00a5:
            q1.b$b r0 = r1.f10110b
            r0.f10116b = r8
        L_0x00a9:
            r9.recycle()
            goto L_0x0184
        L_0x00ae:
            java.lang.String r8 = "target"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0184
            int[] r0 = q1.a.f10105f
            android.content.res.TypedArray r0 = r2.obtainAttributes(r3, r0)
            java.lang.String r8 = r0.getString(r12)
            int r9 = r0.getResourceId(r7, r12)
            if (r9 == 0) goto L_0x0181
            android.content.Context r12 = r1.f10111c
            if (r12 == 0) goto L_0x0176
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r10) goto L_0x00d3
            android.animation.Animator r9 = android.animation.AnimatorInflater.loadAnimator(r12, r9)
            goto L_0x00f2
        L_0x00d3:
            android.content.res.Resources r13 = r12.getResources()
            android.content.res.Resources$Theme r14 = r12.getTheme()
            java.lang.String r10 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r19 = r13.getAnimation(r9)     // Catch:{ XmlPullParserException -> 0x0151, IOException -> 0x0134 }
            android.util.AttributeSet r16 = android.util.Xml.asAttributeSet(r19)     // Catch:{ XmlPullParserException -> 0x012e, IOException -> 0x012a, all -> 0x0128 }
            r17 = 0
            r18 = 0
            r15 = r19
            android.animation.Animator r9 = q1.c.a(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ XmlPullParserException -> 0x012e, IOException -> 0x012a, all -> 0x0128 }
            r19.close()
        L_0x00f2:
            q1.b$b r10 = r1.f10110b
            q1.f r10 = r10.f10116b
            q1.f$g r10 = r10.f10125b
            q1.f$f r10 = r10.f10171b
            s.a<java.lang.String, java.lang.Object> r10 = r10.f10169o
            java.lang.Object r10 = r10.getOrDefault(r8, r11)
            r9.setTarget(r10)
            q1.b$b r10 = r1.f10110b
            java.util.ArrayList<android.animation.Animator> r11 = r10.f10118d
            if (r11 != 0) goto L_0x0119
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f10118d = r11
            q1.b$b r10 = r1.f10110b
            s.a r11 = new s.a
            r11.<init>()
            r10.f10119e = r11
        L_0x0119:
            q1.b$b r10 = r1.f10110b
            java.util.ArrayList<android.animation.Animator> r10 = r10.f10118d
            r10.add(r9)
            q1.b$b r10 = r1.f10110b
            s.a<android.animation.Animator, java.lang.String> r10 = r10.f10119e
            r10.put(r9, r8)
            goto L_0x0181
        L_0x0128:
            r0 = move-exception
            goto L_0x0170
        L_0x012a:
            r0 = move-exception
            r11 = r19
            goto L_0x0135
        L_0x012e:
            r0 = move-exception
            r11 = r19
            goto L_0x0152
        L_0x0132:
            r0 = move-exception
            goto L_0x016e
        L_0x0134:
            r0 = move-exception
        L_0x0135:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0132 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
            r3.<init>()     // Catch:{ all -> 0x0132 }
            r3.append(r10)     // Catch:{ all -> 0x0132 }
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x0132 }
            r3.append(r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0132 }
            r2.<init>(r3)     // Catch:{ all -> 0x0132 }
            r2.initCause(r0)     // Catch:{ all -> 0x0132 }
            throw r2     // Catch:{ all -> 0x0132 }
        L_0x0151:
            r0 = move-exception
        L_0x0152:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0132 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
            r3.<init>()     // Catch:{ all -> 0x0132 }
            r3.append(r10)     // Catch:{ all -> 0x0132 }
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x0132 }
            r3.append(r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0132 }
            r2.<init>(r3)     // Catch:{ all -> 0x0132 }
            r2.initCause(r0)     // Catch:{ all -> 0x0132 }
            throw r2     // Catch:{ all -> 0x0132 }
        L_0x016e:
            r19 = r11
        L_0x0170:
            if (r19 == 0) goto L_0x0175
            r19.close()
        L_0x0175:
            throw r0
        L_0x0176:
            r0.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x0181:
            r0.recycle()
        L_0x0184:
            int r0 = r22.next()
            goto L_0x001e
        L_0x018a:
            q1.b$b r0 = r1.f10110b
            android.animation.AnimatorSet r2 = r0.f10117c
            if (r2 != 0) goto L_0x0197
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.f10117c = r2
        L_0x0197:
            android.animation.AnimatorSet r2 = r0.f10117c
            java.util.ArrayList<android.animation.Animator> r0 = r0.f10118d
            r2.playTogether(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.b.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f10110b.f10116b.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f10110b.f10117c.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f10110b.f10116b.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f10110b.f10116b.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f10110b.f10116b.setLevel(i);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f10110b.f10116b.setState(iArr);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f10110b.f10116b.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f10110b.f10116b.setAutoMirrored(z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f10110b.f10116b.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.f10110b.f10116b.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f10110b.f10116b.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f10110b.f10116b.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z10) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.setVisible(z, z10);
        }
        this.f10110b.f10116b.setVisible(z, z10);
        return super.setVisible(z, z10);
    }

    public final void start() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f10110b.f10117c.isStarted()) {
            this.f10110b.f10117c.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f10110b.f10117c.end();
        }
    }

    public b(Context context) {
        this.f10112s = null;
        a aVar = new a();
        this.f10113t = aVar;
        this.f10111c = context;
        this.f10110b = new C0195b(aVar);
    }

    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f10120a;

        public c(Drawable.ConstantState constantState) {
            this.f10120a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f10120a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f10120a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            b bVar = new b((Context) null);
            Drawable newDrawable = this.f10120a.newDrawable();
            bVar.f10123a = newDrawable;
            newDrawable.setCallback(bVar.f10113t);
            return bVar;
        }

        public final Drawable newDrawable(Resources resources) {
            b bVar = new b((Context) null);
            Drawable newDrawable = this.f10120a.newDrawable(resources);
            bVar.f10123a = newDrawable;
            newDrawable.setCallback(bVar.f10113t);
            return bVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b((Context) null);
            Drawable newDrawable = this.f10120a.newDrawable(resources, theme);
            bVar.f10123a = newDrawable;
            newDrawable.setCallback(bVar.f10113t);
            return bVar;
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
