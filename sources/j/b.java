package j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import j.d;
import java.util.Objects;

public class b extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int B = 0;
    public C0119b A;

    /* renamed from: a  reason: collision with root package name */
    public c f6941a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f6942b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f6943c;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f6944s;

    /* renamed from: t  reason: collision with root package name */
    public int f6945t = 255;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6946u;

    /* renamed from: v  reason: collision with root package name */
    public int f6947v = -1;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6948w;

    /* renamed from: x  reason: collision with root package name */
    public a f6949x;

    /* renamed from: y  reason: collision with root package name */
    public long f6950y;
    public long z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: j.b$b  reason: collision with other inner class name */
    public static class C0119b implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        public Drawable.Callback f6952a;

        public final void invalidateDrawable(Drawable drawable) {
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f6952a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f6952a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class c extends Drawable.ConstantState {
        public boolean A;
        public ColorFilter B;
        public boolean C;
        public ColorStateList D;
        public PorterDuff.Mode E;
        public boolean F;
        public boolean G;

        /* renamed from: a  reason: collision with root package name */
        public final b f6953a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f6954b;

        /* renamed from: c  reason: collision with root package name */
        public int f6955c;

        /* renamed from: d  reason: collision with root package name */
        public int f6956d;

        /* renamed from: e  reason: collision with root package name */
        public int f6957e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f6958f;
        public Drawable[] g;

        /* renamed from: h  reason: collision with root package name */
        public int f6959h;
        public boolean i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f6960j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f6961k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f6962l = false;

        /* renamed from: m  reason: collision with root package name */
        public boolean f6963m;

        /* renamed from: n  reason: collision with root package name */
        public int f6964n;

        /* renamed from: o  reason: collision with root package name */
        public int f6965o;

        /* renamed from: p  reason: collision with root package name */
        public int f6966p;

        /* renamed from: q  reason: collision with root package name */
        public int f6967q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f6968r;

        /* renamed from: s  reason: collision with root package name */
        public int f6969s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f6970t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f6971u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f6972v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f6973w = true;

        /* renamed from: x  reason: collision with root package name */
        public int f6974x;

        /* renamed from: y  reason: collision with root package name */
        public int f6975y = 0;
        public int z = 0;

        public c(c cVar, b bVar, Resources resources) {
            Resources resources2;
            this.f6953a = bVar;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = cVar != null ? cVar.f6954b : null;
            }
            this.f6954b = resources2;
            int i10 = cVar != null ? cVar.f6955c : 0;
            int i11 = b.B;
            i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
            i10 = i10 == 0 ? 160 : i10;
            this.f6955c = i10;
            if (cVar != null) {
                this.f6956d = cVar.f6956d;
                this.f6957e = cVar.f6957e;
                this.f6971u = true;
                this.f6972v = true;
                this.i = cVar.i;
                this.f6962l = cVar.f6962l;
                this.f6973w = cVar.f6973w;
                this.f6974x = cVar.f6974x;
                this.f6975y = cVar.f6975y;
                this.z = cVar.z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                if (cVar.f6955c == i10) {
                    if (cVar.f6960j) {
                        this.f6961k = cVar.f6961k != null ? new Rect(cVar.f6961k) : rect;
                        this.f6960j = true;
                    }
                    if (cVar.f6963m) {
                        this.f6964n = cVar.f6964n;
                        this.f6965o = cVar.f6965o;
                        this.f6966p = cVar.f6966p;
                        this.f6967q = cVar.f6967q;
                        this.f6963m = true;
                    }
                }
                if (cVar.f6968r) {
                    this.f6969s = cVar.f6969s;
                    this.f6968r = true;
                }
                if (cVar.f6970t) {
                    this.f6970t = true;
                }
                Drawable[] drawableArr = cVar.g;
                this.g = new Drawable[drawableArr.length];
                this.f6959h = cVar.f6959h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f6958f;
                if (sparseArray != null) {
                    this.f6958f = sparseArray.clone();
                } else {
                    this.f6958f = new SparseArray<>(this.f6959h);
                }
                int i12 = this.f6959h;
                for (int i13 = 0; i13 < i12; i13++) {
                    if (drawableArr[i13] != null) {
                        Drawable.ConstantState constantState = drawableArr[i13].getConstantState();
                        if (constantState != null) {
                            this.f6958f.put(i13, constantState);
                        } else {
                            this.g[i13] = drawableArr[i13];
                        }
                    }
                }
                return;
            }
            this.g = new Drawable[10];
            this.f6959h = 0;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f6959h;
            if (i10 >= this.g.length) {
                int i11 = i10 + 10;
                d.a aVar = (d.a) this;
                Drawable[] drawableArr = new Drawable[i11];
                Drawable[] drawableArr2 = aVar.g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
                }
                aVar.g = drawableArr;
                int[][] iArr = new int[i11][];
                System.arraycopy(aVar.H, 0, iArr, 0, i10);
                aVar.H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f6953a);
            this.g[i10] = drawable;
            this.f6959h++;
            this.f6957e = drawable.getChangingConfigurations() | this.f6957e;
            this.f6968r = false;
            this.f6970t = false;
            this.f6961k = null;
            this.f6960j = false;
            this.f6963m = false;
            this.f6971u = false;
            return i10;
        }

        public final void b() {
            this.f6963m = true;
            c();
            int i10 = this.f6959h;
            Drawable[] drawableArr = this.g;
            this.f6965o = -1;
            this.f6964n = -1;
            this.f6967q = 0;
            this.f6966p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f6964n) {
                    this.f6964n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f6965o) {
                    this.f6965o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f6966p) {
                    this.f6966p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f6967q) {
                    this.f6967q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f6958f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int keyAt = this.f6958f.keyAt(i10);
                    Drawable[] drawableArr = this.g;
                    Drawable newDrawable = this.f6958f.valueAt(i10).newDrawable(this.f6954b);
                    newDrawable.setLayoutDirection(this.f6974x);
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f6953a);
                    drawableArr[keyAt] = mutate;
                }
                this.f6958f = null;
            }
        }

        public final boolean canApplyTheme() {
            int i10 = this.f6959h;
            Drawable[] drawableArr = this.g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f6958f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable d(int i10) {
            int indexOfKey;
            Drawable drawable = this.g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f6958f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f6958f.valueAt(indexOfKey).newDrawable(this.f6954b);
            newDrawable.setLayoutDirection(this.f6974x);
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f6953a);
            this.g[i10] = mutate;
            this.f6958f.removeAt(indexOfKey);
            if (this.f6958f.size() == 0) {
                this.f6958f = null;
            }
            return mutate;
        }

        public abstract void e();

        public final void f(Resources resources) {
            if (resources != null) {
                this.f6954b = resources;
                int i10 = b.B;
                int i11 = resources.getDisplayMetrics().densityDpi;
                if (i11 == 0) {
                    i11 = 160;
                }
                int i12 = this.f6955c;
                this.f6955c = i11;
                if (i12 != i11) {
                    this.f6963m = false;
                    this.f6960j = false;
                }
            }
        }

        public final int getChangingConfigurations() {
            return this.f6956d | this.f6957e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f6946u = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f6943c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f6950y
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f6945t
            r3.setAlpha(r9)
            r13.f6950y = r7
            goto L_0x0038
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            j.b$c r10 = r13.f6941a
            int r10 = r10.f6975y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f6945t
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0039
        L_0x0036:
            r13.f6950y = r7
        L_0x0038:
            r3 = r6
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f6944s
            if (r9 == 0) goto L_0x0061
            long r10 = r13.z
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0050
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f6944s = r0
            r13.z = r7
            goto L_0x0063
        L_0x0050:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            j.b$c r4 = r13.f6941a
            int r4 = r4.z
            int r3 = r3 / r4
            int r4 = r13.f6945t
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.z = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            j.b$a r14 = r13.f6949x
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.b.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f6941a;
        Objects.requireNonNull(cVar);
        if (theme != null) {
            cVar.c();
            int i = cVar.f6959h;
            Drawable[] drawableArr = cVar.g;
            for (int i10 = 0; i10 < i; i10++) {
                if (drawableArr[i10] != null && drawableArr[i10].canApplyTheme()) {
                    drawableArr[i10].applyTheme(theme);
                    cVar.f6957e |= drawableArr[i10].getChangingConfigurations();
                }
            }
            cVar.f(theme.getResources());
        }
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.A == null) {
            this.A = new C0119b();
        }
        C0119b bVar = this.A;
        bVar.f6952a = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f6941a.f6975y <= 0 && this.f6946u) {
                drawable.setAlpha(this.f6945t);
            }
            c cVar = this.f6941a;
            if (cVar.C) {
                drawable.setColorFilter(cVar.B);
            } else {
                if (cVar.F) {
                    drawable.setTintList(cVar.D);
                }
                c cVar2 = this.f6941a;
                if (cVar2.G) {
                    drawable.setTintMode(cVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f6941a.f6973w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f6941a.A);
            Rect rect = this.f6942b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0119b bVar2 = this.A;
            Drawable.Callback callback = bVar2.f6952a;
            bVar2.f6952a = null;
            drawable.setCallback(callback);
        }
    }

    public final boolean canApplyTheme() {
        return this.f6941a.canApplyTheme();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f6947v
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            j.b$c r0 = r9.f6941a
            int r0 = r0.z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f6944s
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f6943c
            if (r0 == 0) goto L_0x0029
            r9.f6944s = r0
            j.b$c r0 = r9.f6941a
            int r0 = r0.z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.z = r0
            goto L_0x0035
        L_0x0029:
            r9.f6944s = r4
            r9.z = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f6943c
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            j.b$c r0 = r9.f6941a
            int r1 = r0.f6959h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f6943c = r0
            r9.f6947v = r10
            if (r0 == 0) goto L_0x005a
            j.b$c r10 = r9.f6941a
            int r10 = r10.f6975y
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f6950y = r2
        L_0x0051:
            r9.c(r0)
            goto L_0x005a
        L_0x0055:
            r9.f6943c = r4
            r10 = -1
            r9.f6947v = r10
        L_0x005a:
            long r0 = r9.f6950y
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.z
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0079
        L_0x0067:
            j.b$a r10 = r9.f6949x
            if (r10 != 0) goto L_0x0073
            j.b$a r10 = new j.b$a
            r10.<init>()
            r9.f6949x = r10
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r10)
        L_0x0076:
            r9.a(r0)
        L_0x0079:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.b.d(int):boolean");
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f6943c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f6944s;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    public final int getAlpha() {
        return this.f6945t;
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        c cVar = this.f6941a;
        return changingConfigurations | cVar.f6957e | cVar.f6956d;
    }

    public final Drawable.ConstantState getConstantState() {
        c cVar = this.f6941a;
        boolean z10 = true;
        if (!cVar.f6971u) {
            cVar.c();
            cVar.f6971u = true;
            int i = cVar.f6959h;
            Drawable[] drawableArr = cVar.g;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    cVar.f6972v = true;
                    break;
                } else if (drawableArr[i10].getConstantState() == null) {
                    cVar.f6972v = false;
                    z10 = false;
                    break;
                } else {
                    i10++;
                }
            }
        } else {
            z10 = cVar.f6972v;
        }
        if (!z10) {
            return null;
        }
        this.f6941a.f6956d = getChangingConfigurations();
        return this.f6941a;
    }

    public final Drawable getCurrent() {
        return this.f6943c;
    }

    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f6942b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public final int getIntrinsicHeight() {
        c cVar = this.f6941a;
        if (cVar.f6962l) {
            if (!cVar.f6963m) {
                cVar.b();
            }
            return cVar.f6965o;
        }
        Drawable drawable = this.f6943c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public final int getIntrinsicWidth() {
        c cVar = this.f6941a;
        if (cVar.f6962l) {
            if (!cVar.f6963m) {
                cVar.b();
            }
            return cVar.f6964n;
        }
        Drawable drawable = this.f6943c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public final int getMinimumHeight() {
        c cVar = this.f6941a;
        if (cVar.f6962l) {
            if (!cVar.f6963m) {
                cVar.b();
            }
            return cVar.f6967q;
        }
        Drawable drawable = this.f6943c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public final int getMinimumWidth() {
        c cVar = this.f6941a;
        if (cVar.f6962l) {
            if (!cVar.f6963m) {
                cVar.b();
            }
            return cVar.f6966p;
        }
        Drawable drawable = this.f6943c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public final int getOpacity() {
        Drawable drawable = this.f6943c;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f6941a;
        if (cVar.f6968r) {
            return cVar.f6969s;
        }
        cVar.c();
        int i10 = cVar.f6959h;
        Drawable[] drawableArr = cVar.g;
        if (i10 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i11 = 1; i11 < i10; i11++) {
            i = Drawable.resolveOpacity(i, drawableArr[i11].getOpacity());
        }
        cVar.f6969s = i;
        cVar.f6968r = true;
        return i;
    }

    public final void getOutline(Outline outline) {
        Drawable drawable = this.f6943c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public final boolean getPadding(Rect rect) {
        boolean z10;
        c cVar = this.f6941a;
        Rect rect2 = null;
        boolean z11 = false;
        if (!cVar.i) {
            Rect rect3 = cVar.f6961k;
            if (rect3 != null || cVar.f6960j) {
                rect2 = rect3;
            } else {
                cVar.c();
                Rect rect4 = new Rect();
                int i = cVar.f6959h;
                Drawable[] drawableArr = cVar.g;
                for (int i10 = 0; i10 < i; i10++) {
                    if (drawableArr[i10].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i11 = rect4.left;
                        if (i11 > rect2.left) {
                            rect2.left = i11;
                        }
                        int i12 = rect4.top;
                        if (i12 > rect2.top) {
                            rect2.top = i12;
                        }
                        int i13 = rect4.right;
                        if (i13 > rect2.right) {
                            rect2.right = i13;
                        }
                        int i14 = rect4.bottom;
                        if (i14 > rect2.bottom) {
                            rect2.bottom = i14;
                        }
                    }
                }
                cVar.f6960j = true;
                cVar.f6961k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z10 = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f6943c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (this.f6941a.A && getLayoutDirection() == 1) {
            z11 = true;
        }
        if (z11) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return z10;
    }

    public final void invalidateDrawable(Drawable drawable) {
        c cVar = this.f6941a;
        if (cVar != null) {
            cVar.f6968r = false;
            cVar.f6970t = false;
        }
        if (drawable == this.f6943c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final boolean isAutoMirrored() {
        return this.f6941a.A;
    }

    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f6944s;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f6944s = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f6943c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f6946u) {
                this.f6943c.setAlpha(this.f6945t);
            }
        }
        if (this.z != 0) {
            this.z = 0;
            z10 = true;
        }
        if (this.f6950y != 0) {
            this.f6950y = 0;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f6948w && super.mutate() == this) {
            c b10 = b();
            b10.e();
            e(b10);
            this.f6948w = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6944s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f6943c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int i) {
        c cVar = this.f6941a;
        int i10 = this.f6947v;
        int i11 = cVar.f6959h;
        Drawable[] drawableArr = cVar.g;
        boolean z10 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            if (drawableArr[i12] != null) {
                boolean layoutDirection = drawableArr[i12].setLayoutDirection(i);
                if (i12 == i10) {
                    z10 = layoutDirection;
                }
            }
        }
        cVar.f6974x = i;
        return z10;
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f6944s;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f6943c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6944s;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f6943c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f6943c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    public final void setAlpha(int i) {
        if (!this.f6946u || this.f6945t != i) {
            this.f6946u = true;
            this.f6945t = i;
            Drawable drawable = this.f6943c;
            if (drawable == null) {
                return;
            }
            if (this.f6950y == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    public final void setAutoMirrored(boolean z10) {
        c cVar = this.f6941a;
        if (cVar.A != z10) {
            cVar.A = z10;
            Drawable drawable = this.f6943c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f6941a;
        cVar.C = true;
        if (cVar.B != colorFilter) {
            cVar.B = colorFilter;
            Drawable drawable = this.f6943c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public final void setDither(boolean z10) {
        c cVar = this.f6941a;
        if (cVar.f6973w != z10) {
            cVar.f6973w = z10;
            Drawable drawable = this.f6943c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f6943c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    public final void setHotspotBounds(int i, int i10, int i11, int i12) {
        Rect rect = this.f6942b;
        if (rect == null) {
            this.f6942b = new Rect(i, i10, i11, i12);
        } else {
            rect.set(i, i10, i11, i12);
        }
        Drawable drawable = this.f6943c;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i10, i11, i12);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        c cVar = this.f6941a;
        cVar.F = true;
        if (cVar.D != colorStateList) {
            cVar.D = colorStateList;
            this.f6943c.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f6941a;
        cVar.G = true;
        if (cVar.E != mode) {
            cVar.E = mode;
            this.f6943c.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f6944s;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f6943c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f6943c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
