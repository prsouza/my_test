package com.airbnb.lottie;

import a3.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.r;
import io.nodle.cash.R;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import javax.net.ssl.SSLException;
import n0.a0;
import n0.x;
import o2.f;
import o2.h;
import o2.i;
import o2.j;
import o2.k;
import o2.l;
import o2.n;
import o2.o;
import o2.p;
import o2.s;
import o2.t;
import o2.u;
import o2.v;
import o2.w;

public class LottieAnimationView extends r {
    public static final n<Throwable> K = new a();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public u F;
    public final Set<o> G;
    public int H;
    public s<f> I;
    public f J;

    /* renamed from: s  reason: collision with root package name */
    public final n<f> f3474s = new b();

    /* renamed from: t  reason: collision with root package name */
    public final n<Throwable> f3475t = new c();

    /* renamed from: u  reason: collision with root package name */
    public n<Throwable> f3476u;

    /* renamed from: v  reason: collision with root package name */
    public int f3477v;

    /* renamed from: w  reason: collision with root package name */
    public final l f3478w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3479x;

    /* renamed from: y  reason: collision with root package name */
    public String f3480y;
    public int z;

    public class a implements n<Throwable> {
        public final void a(Object obj) {
            Throwable th2 = (Throwable) obj;
            ThreadLocal<PathMeasure> threadLocal = g.f50a;
            if ((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException)) {
                a3.c.c("Unable to load composition.", th2);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th2);
        }
    }

    public class b implements n<f> {
        public b() {
        }

        public final void a(Object obj) {
            LottieAnimationView.this.setComposition((f) obj);
        }
    }

    public class c implements n<Throwable> {
        public c() {
        }

        public final void a(Object obj) {
            Throwable th2 = (Throwable) obj;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i = lottieAnimationView.f3477v;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            n<Throwable> nVar = LottieAnimationView.this.f3476u;
            if (nVar == null) {
                n<Throwable> nVar2 = LottieAnimationView.K;
                nVar = LottieAnimationView.K;
            }
            nVar.a(th2);
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3483a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o2.u[] r0 = o2.u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3483a = r0
                o2.u r1 = o2.u.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3483a     // Catch:{ NoSuchFieldError -> 0x001d }
                o2.u r1 = o2.u.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3483a     // Catch:{ NoSuchFieldError -> 0x0028 }
                o2.u r1 = o2.u.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.d.<clinit>():void");
        }
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public String f3484a;

        /* renamed from: b  reason: collision with root package name */
        public int f3485b;

        /* renamed from: c  reason: collision with root package name */
        public float f3486c;

        /* renamed from: s  reason: collision with root package name */
        public boolean f3487s;

        /* renamed from: t  reason: collision with root package name */
        public String f3488t;

        /* renamed from: u  reason: collision with root package name */
        public int f3489u;

        /* renamed from: v  reason: collision with root package name */
        public int f3490v;

        public class a implements Parcelable.Creator<e> {
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public final Object[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3484a);
            parcel.writeFloat(this.f3486c);
            parcel.writeInt(this.f3487s ? 1 : 0);
            parcel.writeString(this.f3488t);
            parcel.writeInt(this.f3489u);
            parcel.writeInt(this.f3490v);
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f3484a = parcel.readString();
            this.f3486c = parcel.readFloat();
            this.f3487s = parcel.readInt() != 1 ? false : true;
            this.f3488t = parcel.readString();
            this.f3489u = parcel.readInt();
            this.f3490v = parcel.readInt();
        }
    }

    static {
        Class<LottieAnimationView> cls = LottieAnimationView.class;
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        boolean z10 = false;
        this.f3477v = 0;
        l lVar = new l();
        this.f3478w = lVar;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        u uVar = u.AUTOMATIC;
        this.F = uVar;
        this.G = new HashSet();
        this.H = 0;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ad.c.b0, R.attr.lottieAnimationViewStyle, 0);
        this.E = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(9);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(15);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(9, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(5);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(15)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(4, 0));
            if (obtainStyledAttributes.getBoolean(0, false)) {
                this.C = true;
                this.D = true;
            }
            if (obtainStyledAttributes.getBoolean(7, false)) {
                lVar.f9229c.setRepeatCount(-1);
            }
            if (obtainStyledAttributes.hasValue(12)) {
                setRepeatMode(obtainStyledAttributes.getInt(12, 1));
            }
            if (obtainStyledAttributes.hasValue(11)) {
                setRepeatCount(obtainStyledAttributes.getInt(11, -1));
            }
            if (obtainStyledAttributes.hasValue(14)) {
                setSpeed(obtainStyledAttributes.getFloat(14, 1.0f));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(6));
            setProgress(obtainStyledAttributes.getFloat(8, 0.0f));
            boolean z11 = obtainStyledAttributes.getBoolean(3, false);
            if (lVar.C != z11) {
                lVar.C = z11;
                if (lVar.f9228b != null) {
                    lVar.b();
                }
            }
            if (obtainStyledAttributes.hasValue(2)) {
                lVar.a(new t2.e("**"), p.C, new b3.c(new v(obtainStyledAttributes.getColor(2, 0))));
            }
            if (obtainStyledAttributes.hasValue(13)) {
                lVar.v(obtainStyledAttributes.getFloat(13, 1.0f));
            }
            if (obtainStyledAttributes.hasValue(10)) {
                int i = obtainStyledAttributes.getInt(10, uVar.ordinal());
                setRenderMode(u.values()[i >= u.values().length ? uVar.ordinal() : i]);
            }
            if (getScaleType() != null) {
                lVar.f9235x = getScaleType();
            }
            obtainStyledAttributes.recycle();
            Context context2 = getContext();
            ThreadLocal<PathMeasure> threadLocal = g.f50a;
            lVar.f9231t = Boolean.valueOf(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f ? true : z10).booleanValue();
            d();
            this.f3479x = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    private void setCompositionTask(s<f> sVar) {
        this.J = null;
        this.f3478w.c();
        c();
        sVar.b(this.f3474s);
        sVar.a(this.f3475t);
        this.I = sVar;
    }

    public final void buildDrawingCache(boolean z10) {
        this.H++;
        super.buildDrawingCache(z10);
        if (this.H == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z10) == null) {
            setRenderMode(u.HARDWARE);
        }
        this.H--;
        ad.c.E();
    }

    public final void c() {
        s<f> sVar = this.I;
        if (sVar != null) {
            n<f> nVar = this.f3474s;
            synchronized (sVar) {
                sVar.f9296a.remove(nVar);
            }
            s<f> sVar2 = this.I;
            n<Throwable> nVar2 = this.f3475t;
            synchronized (sVar2) {
                sVar2.f9297b.remove(nVar2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r3 != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r6 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.d.f3483a
            o2.u r1 = r6.F
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x003b
            if (r0 == r1) goto L_0x0013
            r3 = 3
            if (r0 == r3) goto L_0x0015
        L_0x0013:
            r1 = r2
            goto L_0x003b
        L_0x0015:
            o2.f r0 = r6.J
            r3 = 0
            if (r0 == 0) goto L_0x0025
            boolean r4 = r0.f9208n
            if (r4 == 0) goto L_0x0025
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L_0x0025
            goto L_0x0039
        L_0x0025:
            if (r0 == 0) goto L_0x002d
            int r0 = r0.f9209o
            r4 = 4
            if (r0 <= r4) goto L_0x002d
            goto L_0x0039
        L_0x002d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r0 == r4) goto L_0x0039
            r4 = 25
            if (r0 != r4) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r3 = r2
        L_0x0039:
            if (r3 == 0) goto L_0x0013
        L_0x003b:
            int r0 = r6.getLayerType()
            if (r1 == r0) goto L_0x0045
            r0 = 0
            r6.setLayerType(r1, r0)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.d():void");
    }

    public final void e() {
        if (isShown()) {
            this.f3478w.j();
            d();
            return;
        }
        this.A = true;
    }

    public f getComposition() {
        return this.J;
    }

    public long getDuration() {
        f fVar = this.J;
        if (fVar != null) {
            return (long) fVar.b();
        }
        return 0;
    }

    public int getFrame() {
        return (int) this.f3478w.f9229c.f43u;
    }

    public String getImageAssetsFolder() {
        return this.f3478w.z;
    }

    public float getMaxFrame() {
        return this.f3478w.e();
    }

    public float getMinFrame() {
        return this.f3478w.f();
    }

    public t getPerformanceTracker() {
        f fVar = this.f3478w.f9228b;
        if (fVar != null) {
            return fVar.f9197a;
        }
        return null;
    }

    public float getProgress() {
        return this.f3478w.g();
    }

    public int getRepeatCount() {
        return this.f3478w.h();
    }

    public int getRepeatMode() {
        return this.f3478w.f9229c.getRepeatMode();
    }

    public float getScale() {
        return this.f3478w.f9230s;
    }

    public float getSpeed() {
        return this.f3478w.f9229c.f40c;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        l lVar = this.f3478w;
        if (drawable2 == lVar) {
            super.invalidateDrawable(lVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.D || this.C) {
            e();
            this.D = false;
            this.C = false;
        }
    }

    public final void onDetachedFromWindow() {
        if (this.f3478w.i()) {
            this.C = false;
            this.B = false;
            this.A = false;
            l lVar = this.f3478w;
            lVar.f9233v.clear();
            lVar.f9229c.cancel();
            d();
            this.C = true;
        }
        super.onDetachedFromWindow();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        String str = eVar.f3484a;
        this.f3480y = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f3480y);
        }
        int i = eVar.f3485b;
        this.z = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(eVar.f3486c);
        if (eVar.f3487s) {
            e();
        }
        this.f3478w.z = eVar.f3488t;
        setRepeatMode(eVar.f3489u);
        setRepeatCount(eVar.f3490v);
    }

    public final Parcelable onSaveInstanceState() {
        boolean z10;
        e eVar = new e(super.onSaveInstanceState());
        eVar.f3484a = this.f3480y;
        eVar.f3485b = this.z;
        eVar.f3486c = this.f3478w.g();
        if (!this.f3478w.i()) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            if (x.g.b(this) || !this.C) {
                z10 = false;
                eVar.f3487s = z10;
                l lVar = this.f3478w;
                eVar.f3488t = lVar.z;
                eVar.f3489u = lVar.f9229c.getRepeatMode();
                eVar.f3490v = this.f3478w.h();
                return eVar;
            }
        }
        z10 = true;
        eVar.f3487s = z10;
        l lVar2 = this.f3478w;
        eVar.f3488t = lVar2.z;
        eVar.f3489u = lVar2.f9229c.getRepeatMode();
        eVar.f3490v = this.f3478w.h();
        return eVar;
    }

    public final void onVisibilityChanged(View view, int i) {
        if (this.f3479x) {
            if (isShown()) {
                if (this.B) {
                    if (isShown()) {
                        this.f3478w.k();
                        d();
                    } else {
                        this.A = false;
                        this.B = true;
                    }
                } else if (this.A) {
                    e();
                }
                this.B = false;
                this.A = false;
            } else if (this.f3478w.i()) {
                this.D = false;
                this.C = false;
                this.B = false;
                this.A = false;
                l lVar = this.f3478w;
                lVar.f9233v.clear();
                lVar.f9229c.l();
                d();
                this.B = true;
            }
        }
    }

    public void setAnimation(int i) {
        s<f> sVar;
        s<f> sVar2;
        this.z = i;
        this.f3480y = null;
        if (isInEditMode()) {
            sVar = new s<>(new o2.d(this, i), true);
        } else {
            if (this.E) {
                Context context = getContext();
                String h10 = o2.g.h(context, i);
                sVar2 = o2.g.a(h10, new j(new WeakReference(context), context.getApplicationContext(), i, h10));
            } else {
                Context context2 = getContext();
                Map<String, s<f>> map = o2.g.f9210a;
                sVar2 = o2.g.a((String) null, new j(new WeakReference(context2), context2.getApplicationContext(), i, (String) null));
            }
            sVar = sVar2;
        }
        setCompositionTask(sVar);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        Map<String, s<f>> map = o2.g.f9210a;
        setCompositionTask(o2.g.a((String) null, new k(byteArrayInputStream)));
    }

    public void setAnimationFromUrl(String str) {
        s<f> sVar;
        if (this.E) {
            Context context = getContext();
            Map<String, s<f>> map = o2.g.f9210a;
            String c10 = a8.a.c("url_", str);
            sVar = o2.g.a(c10, new h(context, str, c10));
        } else {
            Context context2 = getContext();
            Map<String, s<f>> map2 = o2.g.f9210a;
            sVar = o2.g.a((String) null, new h(context2, str, (String) null));
        }
        setCompositionTask(sVar);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f3478w.H = z10;
    }

    public void setCacheComposition(boolean z10) {
        this.E = z10;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.Set<o2.o>, java.util.HashSet] */
    public void setComposition(f fVar) {
        this.f3478w.setCallback(this);
        this.J = fVar;
        l lVar = this.f3478w;
        boolean z10 = false;
        if (lVar.f9228b != fVar) {
            lVar.J = false;
            lVar.c();
            lVar.f9228b = fVar;
            lVar.b();
            a3.d dVar = lVar.f9229c;
            if (dVar.f47y == null) {
                z10 = true;
            }
            dVar.f47y = fVar;
            if (z10) {
                dVar.n((float) ((int) Math.max(dVar.f45w, fVar.f9205k)), (float) ((int) Math.min(dVar.f46x, fVar.f9206l)));
            } else {
                dVar.n((float) ((int) fVar.f9205k), (float) ((int) fVar.f9206l));
            }
            float f10 = dVar.f43u;
            dVar.f43u = 0.0f;
            dVar.m((float) ((int) f10));
            dVar.c();
            lVar.u(lVar.f9229c.getAnimatedFraction());
            lVar.v(lVar.f9230s);
            lVar.w();
            Iterator it = new ArrayList(lVar.f9233v).iterator();
            while (it.hasNext()) {
                ((l.o) it.next()).run();
                it.remove();
            }
            lVar.f9233v.clear();
            fVar.f9197a.f9301a = lVar.F;
            Drawable.Callback callback = lVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable((Drawable) null);
                imageView.setImageDrawable(lVar);
            }
            z10 = true;
        }
        d();
        if (getDrawable() != this.f3478w || z10) {
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.G.iterator();
            while (it2.hasNext()) {
                ((o) it2.next()).a();
            }
        }
    }

    public void setFailureListener(n<Throwable> nVar) {
        this.f3476u = nVar;
    }

    public void setFallbackResource(int i) {
        this.f3477v = i;
    }

    public void setFontAssetDelegate(o2.a aVar) {
        s2.a aVar2 = this.f3478w.B;
    }

    public void setFrame(int i) {
        this.f3478w.l(i);
    }

    public void setImageAssetDelegate(o2.b bVar) {
        l lVar = this.f3478w;
        lVar.A = bVar;
        s2.b bVar2 = lVar.f9236y;
        if (bVar2 != null) {
            bVar2.f10858c = bVar;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.f3478w.z = str;
    }

    public void setImageBitmap(Bitmap bitmap) {
        c();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        c();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        c();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f3478w.m(i);
    }

    public void setMaxProgress(float f10) {
        this.f3478w.o(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f3478w.q(str);
    }

    public void setMinFrame(int i) {
        this.f3478w.r(i);
    }

    public void setMinProgress(float f10) {
        this.f3478w.t(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        l lVar = this.f3478w;
        if (lVar.G != z10) {
            lVar.G = z10;
            w2.c cVar = lVar.D;
            if (cVar != null) {
                cVar.p(z10);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        l lVar = this.f3478w;
        lVar.F = z10;
        f fVar = lVar.f9228b;
        if (fVar != null) {
            fVar.f9197a.f9301a = z10;
        }
    }

    public void setProgress(float f10) {
        this.f3478w.u(f10);
    }

    public void setRenderMode(u uVar) {
        this.F = uVar;
        d();
    }

    public void setRepeatCount(int i) {
        this.f3478w.f9229c.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f3478w.f9229c.setRepeatMode(i);
    }

    public void setSafeMode(boolean z10) {
        this.f3478w.f9232u = z10;
    }

    public void setScale(float f10) {
        this.f3478w.v(f10);
        if (getDrawable() == this.f3478w) {
            setImageDrawable((Drawable) null);
            setImageDrawable(this.f3478w);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        l lVar = this.f3478w;
        if (lVar != null) {
            lVar.f9235x = scaleType;
        }
    }

    public void setSpeed(float f10) {
        this.f3478w.f9229c.f40c = f10;
    }

    public void setTextDelegate(w wVar) {
        Objects.requireNonNull(this.f3478w);
    }

    public void setMaxFrame(String str) {
        this.f3478w.n(str);
    }

    public void setMinFrame(String str) {
        this.f3478w.s(str);
    }

    public void setAnimation(String str) {
        s<f> sVar;
        s<f> sVar2;
        this.f3480y = str;
        this.z = 0;
        if (isInEditMode()) {
            sVar = new s<>(new o2.e(this, str), true);
        } else {
            if (this.E) {
                Context context = getContext();
                Map<String, s<f>> map = o2.g.f9210a;
                String c10 = a8.a.c("asset_", str);
                sVar2 = o2.g.a(c10, new i(context.getApplicationContext(), str, c10));
            } else {
                Context context2 = getContext();
                Map<String, s<f>> map2 = o2.g.f9210a;
                sVar2 = o2.g.a((String) null, new i(context2.getApplicationContext(), str, (String) null));
            }
            sVar = sVar2;
        }
        setCompositionTask(sVar);
    }
}
