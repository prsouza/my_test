package h;

import ah.v;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.k1;
import androidx.appcompat.widget.t0;
import d0.a;
import h.u;
import io.nodle.cash.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import m.a;
import n0.a0;
import n0.b0;
import n0.e0;
import n0.x;

public final class g extends f implements e.a, LayoutInflater.Factory2 {

    /* renamed from: o0  reason: collision with root package name */
    public static final s.g<String, Integer> f5526o0 = new s.g<>();

    /* renamed from: p0  reason: collision with root package name */
    public static final int[] f5527p0 = {16842836};

    /* renamed from: q0  reason: collision with root package name */
    public static final boolean f5528q0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: r0  reason: collision with root package name */
    public static final boolean f5529r0 = true;
    public b A;
    public l B;
    public m.a C;
    public ActionBarContextView D;
    public PopupWindow E;
    public j F;
    public a0 G = null;
    public boolean H = true;
    public boolean I;
    public ViewGroup J;
    public TextView K;
    public View L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public k[] U;
    public k V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public Configuration f5530a0;
    public int b0 = -100;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5531c;

    /* renamed from: c0  reason: collision with root package name */
    public int f5532c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f5533d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f5534e0;

    /* renamed from: f0  reason: collision with root package name */
    public i f5535f0;

    /* renamed from: g0  reason: collision with root package name */
    public C0091g f5536g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f5537h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f5538i0;

    /* renamed from: j0  reason: collision with root package name */
    public final a f5539j0 = new a();

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5540k0;

    /* renamed from: l0  reason: collision with root package name */
    public Rect f5541l0;

    /* renamed from: m0  reason: collision with root package name */
    public Rect f5542m0;

    /* renamed from: n0  reason: collision with root package name */
    public n f5543n0;

    /* renamed from: s  reason: collision with root package name */
    public final Context f5544s;

    /* renamed from: t  reason: collision with root package name */
    public Window f5545t;

    /* renamed from: u  reason: collision with root package name */
    public f f5546u;

    /* renamed from: v  reason: collision with root package name */
    public final e f5547v;

    /* renamed from: w  reason: collision with root package name */
    public v f5548w;

    /* renamed from: x  reason: collision with root package name */
    public m.f f5549x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f5550y;
    public i0 z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            g gVar = g.this;
            if ((gVar.f5538i0 & 1) != 0) {
                gVar.K(0);
            }
            g gVar2 = g.this;
            if ((gVar2.f5538i0 & LZ4Constants.HASH_TABLE_SIZE) != 0) {
                gVar2.K(108);
            }
            g gVar3 = g.this;
            gVar3.f5537h0 = false;
            gVar3.f5538i0 = 0;
        }
    }

    public final class b implements i.a {
        public b() {
        }

        public final void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            g.this.G(eVar);
        }

        public final boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback R = g.this.R();
            if (R == null) {
                return true;
            }
            R.onMenuOpened(108, eVar);
            return true;
        }
    }

    public class c implements a.C0149a {

        /* renamed from: a  reason: collision with root package name */
        public a.C0149a f5553a;

        public class a extends c3.k {
            public a() {
            }

            public final void c() {
                g.this.D.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.D.getParent() instanceof View) {
                    WeakHashMap<View, a0> weakHashMap = x.f8842a;
                    x.h.c((View) g.this.D.getParent());
                }
                g.this.D.h();
                g.this.G.d((b0) null);
                g gVar2 = g.this;
                gVar2.G = null;
                ViewGroup viewGroup = gVar2.J;
                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                x.h.c(viewGroup);
            }
        }

        public c(a.C0149a aVar) {
            this.f5553a = aVar;
        }

        public final boolean a(m.a aVar, Menu menu) {
            return this.f5553a.a(aVar, menu);
        }

        public final void b(m.a aVar) {
            this.f5553a.b(aVar);
            g gVar = g.this;
            if (gVar.E != null) {
                gVar.f5545t.getDecorView().removeCallbacks(g.this.F);
            }
            g gVar2 = g.this;
            if (gVar2.D != null) {
                gVar2.L();
                g gVar3 = g.this;
                a0 b10 = x.b(gVar3.D);
                b10.a(0.0f);
                gVar3.G = b10;
                g.this.G.d(new a());
            }
            e eVar = g.this.f5547v;
            if (eVar != null) {
                eVar.b();
            }
            g gVar4 = g.this;
            gVar4.C = null;
            ViewGroup viewGroup = gVar4.J;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.h.c(viewGroup);
        }

        public final boolean c(m.a aVar, Menu menu) {
            ViewGroup viewGroup = g.this.J;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.h.c(viewGroup);
            return this.f5553a.c(aVar, menu);
        }

        public final boolean d(m.a aVar, MenuItem menuItem) {
            return this.f5553a.d(aVar, menuItem);
        }
    }

    public static class d {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    public static class e {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i10 = configuration2.colorMode & 3;
            if (i != i10) {
                configuration3.colorMode |= i10;
            }
            int i11 = configuration.colorMode & 12;
            int i12 = configuration2.colorMode & 12;
            if (i11 != i12) {
                configuration3.colorMode |= i12;
            }
        }
    }

    public class f extends m.h {
        public f(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0182, code lost:
            if (n0.x.g.c(r1) != false) goto L_0x0186;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r10) {
            /*
                r9 = this;
                m.e$a r0 = new m.e$a
                h.g r1 = h.g.this
                android.content.Context r1 = r1.f5544s
                r0.<init>(r1, r10)
                h.g r10 = h.g.this
                java.util.Objects.requireNonNull(r10)
                m.a r1 = r10.C
                if (r1 == 0) goto L_0x0015
                r1.c()
            L_0x0015:
                h.g$c r1 = new h.g$c
                r1.<init>(r0)
                r10.S()
                h.v r2 = r10.f5548w
                r3 = 1
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x0076
                h.v$d r6 = r2.i
                if (r6 == 0) goto L_0x002b
                r6.c()
            L_0x002b:
                androidx.appcompat.widget.ActionBarOverlayLayout r6 = r2.f5623c
                r6.setHideOnContentScrollEnabled(r4)
                androidx.appcompat.widget.ActionBarContextView r6 = r2.f5626f
                r6.h()
                h.v$d r6 = new h.v$d
                androidx.appcompat.widget.ActionBarContextView r7 = r2.f5626f
                android.content.Context r7 = r7.getContext()
                r6.<init>(r7, r1)
                androidx.appcompat.view.menu.e r7 = r6.f5646s
                r7.B()
                m.a$a r7 = r6.f5647t     // Catch:{ all -> 0x006f }
                androidx.appcompat.view.menu.e r8 = r6.f5646s     // Catch:{ all -> 0x006f }
                boolean r7 = r7.a(r6, r8)     // Catch:{ all -> 0x006f }
                androidx.appcompat.view.menu.e r8 = r6.f5646s
                r8.A()
                if (r7 == 0) goto L_0x0062
                r2.i = r6
                r6.i()
                androidx.appcompat.widget.ActionBarContextView r7 = r2.f5626f
                r7.f(r6)
                r2.a(r3)
                goto L_0x0063
            L_0x0062:
                r6 = r5
            L_0x0063:
                r10.C = r6
                if (r6 == 0) goto L_0x0076
                h.e r2 = r10.f5547v
                if (r2 == 0) goto L_0x0076
                r2.d()
                goto L_0x0076
            L_0x006f:
                r10 = move-exception
                androidx.appcompat.view.menu.e r0 = r6.f5646s
                r0.A()
                throw r10
            L_0x0076:
                m.a r2 = r10.C
                if (r2 != 0) goto L_0x01e6
                r10.L()
                m.a r2 = r10.C
                if (r2 == 0) goto L_0x0084
                r2.c()
            L_0x0084:
                h.e r2 = r10.f5547v
                if (r2 == 0) goto L_0x008f
                boolean r6 = r10.Z
                if (r6 != 0) goto L_0x008f
                r2.e()     // Catch:{ AbstractMethodError -> 0x008f }
            L_0x008f:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.D
                if (r2 != 0) goto L_0x0149
                boolean r2 = r10.R
                if (r2 == 0) goto L_0x011c
                android.util.TypedValue r2 = new android.util.TypedValue
                r2.<init>()
                android.content.Context r6 = r10.f5544s
                android.content.res.Resources$Theme r6 = r6.getTheme()
                r7 = 2130903051(0x7f03000b, float:1.741291E38)
                r6.resolveAttribute(r7, r2, r3)
                int r7 = r2.resourceId
                if (r7 == 0) goto L_0x00cd
                android.content.Context r7 = r10.f5544s
                android.content.res.Resources r7 = r7.getResources()
                android.content.res.Resources$Theme r7 = r7.newTheme()
                r7.setTo(r6)
                int r6 = r2.resourceId
                r7.applyStyle(r6, r3)
                m.c r6 = new m.c
                android.content.Context r8 = r10.f5544s
                r6.<init>((android.content.Context) r8, (int) r4)
                android.content.res.Resources$Theme r8 = r6.getTheme()
                r8.setTo(r7)
                goto L_0x00cf
            L_0x00cd:
                android.content.Context r6 = r10.f5544s
            L_0x00cf:
                androidx.appcompat.widget.ActionBarContextView r7 = new androidx.appcompat.widget.ActionBarContextView
                r7.<init>(r6, r5)
                r10.D = r7
                android.widget.PopupWindow r7 = new android.widget.PopupWindow
                r8 = 2130903066(0x7f03001a, float:1.741294E38)
                r7.<init>(r6, r5, r8)
                r10.E = r7
                r8 = 2
                q0.f.d(r7, r8)
                android.widget.PopupWindow r7 = r10.E
                androidx.appcompat.widget.ActionBarContextView r8 = r10.D
                r7.setContentView(r8)
                android.widget.PopupWindow r7 = r10.E
                r8 = -1
                r7.setWidth(r8)
                android.content.res.Resources$Theme r7 = r6.getTheme()
                r8 = 2130903045(0x7f030005, float:1.7412897E38)
                r7.resolveAttribute(r8, r2, r3)
                int r2 = r2.data
                android.content.res.Resources r6 = r6.getResources()
                android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
                int r2 = android.util.TypedValue.complexToDimensionPixelSize(r2, r6)
                androidx.appcompat.widget.ActionBarContextView r6 = r10.D
                r6.setContentHeight(r2)
                android.widget.PopupWindow r2 = r10.E
                r6 = -2
                r2.setHeight(r6)
                h.j r2 = new h.j
                r2.<init>(r10)
                r10.F = r2
                goto L_0x0149
            L_0x011c:
                android.view.ViewGroup r2 = r10.J
                r6 = 2131230789(0x7f080045, float:1.807764E38)
                android.view.View r2 = r2.findViewById(r6)
                androidx.appcompat.widget.ViewStubCompat r2 = (androidx.appcompat.widget.ViewStubCompat) r2
                if (r2 == 0) goto L_0x0149
                r10.S()
                h.v r6 = r10.f5548w
                if (r6 == 0) goto L_0x0135
                android.content.Context r6 = r6.c()
                goto L_0x0136
            L_0x0135:
                r6 = r5
            L_0x0136:
                if (r6 != 0) goto L_0x013a
                android.content.Context r6 = r10.f5544s
            L_0x013a:
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                r2.setLayoutInflater(r6)
                android.view.View r2 = r2.a()
                androidx.appcompat.widget.ActionBarContextView r2 = (androidx.appcompat.widget.ActionBarContextView) r2
                r10.D = r2
            L_0x0149:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.D
                if (r2 == 0) goto L_0x01d7
                r10.L()
                androidx.appcompat.widget.ActionBarContextView r2 = r10.D
                r2.h()
                m.d r2 = new m.d
                androidx.appcompat.widget.ActionBarContextView r6 = r10.D
                android.content.Context r6 = r6.getContext()
                androidx.appcompat.widget.ActionBarContextView r7 = r10.D
                r2.<init>(r6, r7, r1)
                androidx.appcompat.view.menu.e r6 = r2.f8316w
                boolean r1 = r1.a(r2, r6)
                if (r1 == 0) goto L_0x01d5
                r2.i()
                androidx.appcompat.widget.ActionBarContextView r1 = r10.D
                r1.f(r2)
                r10.C = r2
                boolean r1 = r10.I
                if (r1 == 0) goto L_0x0185
                android.view.ViewGroup r1 = r10.J
                if (r1 == 0) goto L_0x0185
                java.util.WeakHashMap<android.view.View, n0.a0> r2 = n0.x.f8842a
                boolean r1 = n0.x.g.c(r1)
                if (r1 == 0) goto L_0x0185
                goto L_0x0186
            L_0x0185:
                r3 = r4
            L_0x0186:
                r1 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x01a4
                androidx.appcompat.widget.ActionBarContextView r2 = r10.D
                r3 = 0
                r2.setAlpha(r3)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.D
                n0.a0 r2 = n0.x.b(r2)
                r2.a(r1)
                r10.G = r2
                h.k r1 = new h.k
                r1.<init>(r10)
                r2.d(r1)
                goto L_0x01c5
            L_0x01a4:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.D
                r2.setAlpha(r1)
                androidx.appcompat.widget.ActionBarContextView r1 = r10.D
                r1.setVisibility(r4)
                androidx.appcompat.widget.ActionBarContextView r1 = r10.D
                android.view.ViewParent r1 = r1.getParent()
                boolean r1 = r1 instanceof android.view.View
                if (r1 == 0) goto L_0x01c5
                androidx.appcompat.widget.ActionBarContextView r1 = r10.D
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                java.util.WeakHashMap<android.view.View, n0.a0> r2 = n0.x.f8842a
                n0.x.h.c(r1)
            L_0x01c5:
                android.widget.PopupWindow r1 = r10.E
                if (r1 == 0) goto L_0x01d7
                android.view.Window r1 = r10.f5545t
                android.view.View r1 = r1.getDecorView()
                h.j r2 = r10.F
                r1.post(r2)
                goto L_0x01d7
            L_0x01d5:
                r10.C = r5
            L_0x01d7:
                m.a r1 = r10.C
                if (r1 == 0) goto L_0x01e2
                h.e r1 = r10.f5547v
                if (r1 == 0) goto L_0x01e2
                r1.d()
            L_0x01e2:
                m.a r1 = r10.C
                r10.C = r1
            L_0x01e6:
                m.a r10 = r10.C
                if (r10 == 0) goto L_0x01ef
                android.view.ActionMode r10 = r0.e(r10)
                return r10
            L_0x01ef:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: h.g.f.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.J(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
            if (r3 != false) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
            if (r7 != false) goto L_0x0067;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            /*
                r6 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r7)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x006c
                h.g r0 = h.g.this
                int r3 = r7.getKeyCode()
                r0.S()
                h.v r4 = r0.f5548w
                if (r4 == 0) goto L_0x003b
                h.v$d r4 = r4.i
                if (r4 != 0) goto L_0x001a
                goto L_0x0037
            L_0x001a:
                androidx.appcompat.view.menu.e r4 = r4.f5646s
                if (r4 == 0) goto L_0x0037
                int r5 = r7.getDeviceId()
                android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
                int r5 = r5.getKeyboardType()
                if (r5 == r2) goto L_0x002e
                r5 = r2
                goto L_0x002f
            L_0x002e:
                r5 = r1
            L_0x002f:
                r4.setQwertyMode(r5)
                boolean r3 = r4.performShortcut(r3, r7, r1)
                goto L_0x0038
            L_0x0037:
                r3 = r1
            L_0x0038:
                if (r3 == 0) goto L_0x003b
                goto L_0x0067
            L_0x003b:
                h.g$k r3 = r0.V
                if (r3 == 0) goto L_0x0050
                int r4 = r7.getKeyCode()
                boolean r3 = r0.W(r3, r4, r7)
                if (r3 == 0) goto L_0x0050
                h.g$k r7 = r0.V
                if (r7 == 0) goto L_0x0067
                r7.f5573l = r2
                goto L_0x0067
            L_0x0050:
                h.g$k r3 = r0.V
                if (r3 != 0) goto L_0x0069
                h.g$k r3 = r0.Q(r1)
                r0.X(r3, r7)
                int r4 = r7.getKeyCode()
                boolean r7 = r0.W(r3, r4, r7)
                r3.f5572k = r1
                if (r7 == 0) goto L_0x0069
            L_0x0067:
                r7 = r2
                goto L_0x006a
            L_0x0069:
                r7 = r1
            L_0x006a:
                if (r7 == 0) goto L_0x006d
            L_0x006c:
                r1 = r2
            L_0x006d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: h.g.f.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public final void onContentChanged() {
        }

        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public final View onCreatePanelView(int i) {
            return super.onCreatePanelView(i);
        }

        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            g gVar = g.this;
            Objects.requireNonNull(gVar);
            if (i == 108) {
                gVar.S();
                v vVar = gVar.f5548w;
                if (vVar != null) {
                    vVar.b(true);
                }
            }
            return true;
        }

        public final void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            g gVar = g.this;
            Objects.requireNonNull(gVar);
            if (i == 108) {
                gVar.S();
                v vVar = gVar.f5548w;
                if (vVar != null) {
                    vVar.b(false);
                }
            } else if (i == 0) {
                k Q = gVar.Q(i);
                if (Q.f5574m) {
                    gVar.H(Q, false);
                }
            }
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f944x = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (eVar != null) {
                eVar.f944x = false;
            }
            return onPreparePanel;
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.e eVar = g.this.Q(0).f5570h;
            if (eVar != null) {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!g.this.H || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return a(callback);
        }
    }

    /* renamed from: h.g$g  reason: collision with other inner class name */
    public class C0091g extends h {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f5556c;

        public C0091g(Context context) {
            super();
            this.f5556c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public final int c() {
            return this.f5556c.isPowerSaveMode() ? 2 : 1;
        }

        public final void d() {
            g.this.C();
        }
    }

    public abstract class h {

        /* renamed from: a  reason: collision with root package name */
        public a f5558a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            public final void onReceive(Context context, Intent intent) {
                h.this.d();
            }
        }

        public h() {
        }

        public final void a() {
            a aVar = this.f5558a;
            if (aVar != null) {
                try {
                    g.this.f5544s.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f5558a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f5558a == null) {
                    this.f5558a = new a();
                }
                g.this.f5544s.registerReceiver(this.f5558a, b10);
            }
        }
    }

    public class i extends h {

        /* renamed from: c  reason: collision with root package name */
        public final u f5561c;

        public i(u uVar) {
            super();
            this.f5561c = uVar;
        }

        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public final int c() {
            boolean z;
            long j10;
            u uVar = this.f5561c;
            u.a aVar = uVar.f5618c;
            if (aVar.f5620b > System.currentTimeMillis()) {
                z = aVar.f5619a;
            } else {
                Location location = null;
                Location a10 = v.C(uVar.f5616a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? uVar.a("network") : null;
                if (v.C(uVar.f5616a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    location = uVar.a("gps");
                }
                if (location == null || a10 == null ? location != null : location.getTime() > a10.getTime()) {
                    a10 = location;
                }
                if (a10 != null) {
                    u.a aVar2 = uVar.f5618c;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (t.f5611d == null) {
                        t.f5611d = new t();
                    }
                    t tVar = t.f5611d;
                    tVar.a(currentTimeMillis - 86400000, a10.getLatitude(), a10.getLongitude());
                    t tVar2 = tVar;
                    tVar.a(currentTimeMillis, a10.getLatitude(), a10.getLongitude());
                    boolean z10 = tVar2.f5614c == 1;
                    long j11 = tVar2.f5613b;
                    long j12 = tVar2.f5612a;
                    tVar2.a(currentTimeMillis + 86400000, a10.getLatitude(), a10.getLongitude());
                    long j13 = tVar2.f5613b;
                    if (j11 == -1 || j12 == -1) {
                        j10 = currentTimeMillis + 43200000;
                    } else {
                        j10 = (currentTimeMillis > j12 ? j13 + 0 : currentTimeMillis > j11 ? j12 + 0 : j11 + 0) + 60000;
                    }
                    aVar2.f5619a = z10;
                    aVar2.f5620b = j10;
                    z = aVar.f5619a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    z = i < 6 || i >= 22;
                }
            }
            if (z) {
                return 2;
            }
            return 1;
        }

        public final void d() {
            g.this.C();
        }
    }

    public class j extends ContentFrameLayout {
        public j(Context context) {
            super(context, (AttributeSet) null);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.J(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                    g gVar = g.this;
                    gVar.H(gVar.Q(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(a.b.a0(getContext(), i));
        }
    }

    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        public int f5564a;

        /* renamed from: b  reason: collision with root package name */
        public int f5565b;

        /* renamed from: c  reason: collision with root package name */
        public int f5566c;

        /* renamed from: d  reason: collision with root package name */
        public int f5567d;

        /* renamed from: e  reason: collision with root package name */
        public j f5568e;

        /* renamed from: f  reason: collision with root package name */
        public View f5569f;
        public View g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f5570h;
        public androidx.appcompat.view.menu.c i;

        /* renamed from: j  reason: collision with root package name */
        public m.c f5571j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5572k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5573l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f5574m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f5575n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f5576o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f5577p;

        public k(int i10) {
            this.f5564a = i10;
        }

        public final void a(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f5570h;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.v(this.i);
                }
                this.f5570h = eVar;
                if (eVar != null && (cVar = this.i) != null) {
                    eVar.b(cVar);
                }
            }
        }
    }

    public final class l implements i.a {
        public l() {
        }

        public final void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            androidx.appcompat.view.menu.e l10 = eVar.l();
            boolean z10 = l10 != eVar;
            g gVar = g.this;
            if (z10) {
                eVar = l10;
            }
            k O = gVar.O(eVar);
            if (O == null) {
                return;
            }
            if (z10) {
                g.this.F(O.f5564a, O, l10);
                g.this.H(O, true);
                return;
            }
            g.this.H(O, z);
        }

        public final boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback R;
            if (eVar != eVar.l()) {
                return true;
            }
            g gVar = g.this;
            if (!gVar.O || (R = gVar.R()) == null || g.this.Z) {
                return true;
            }
            R.onMenuOpened(108, eVar);
            return true;
        }
    }

    public g(Context context, Window window, e eVar, Object obj) {
        s.g<String, Integer> gVar;
        Integer orDefault;
        androidx.appcompat.app.c cVar;
        this.f5544s = context;
        this.f5547v = eVar;
        this.f5531c = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof androidx.appcompat.app.c)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        cVar = (androidx.appcompat.app.c) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            cVar = null;
            if (cVar != null) {
                this.b0 = cVar.h().h();
            }
        }
        if (this.b0 == -100 && (orDefault = gVar.getOrDefault(this.f5531c.getClass().getName(), null)) != null) {
            this.b0 = orDefault.intValue();
            (gVar = f5526o0).remove(this.f5531c.getClass().getName());
        }
        if (window != null) {
            E(window);
        }
        androidx.appcompat.widget.l.e();
    }

    public final void A(int i10) {
        this.f5532c0 = i10;
    }

    public final void B(CharSequence charSequence) {
        this.f5550y = charSequence;
        i0 i0Var = this.z;
        if (i0Var != null) {
            i0Var.setWindowTitle(charSequence);
            return;
        }
        v vVar = this.f5548w;
        if (vVar != null) {
            vVar.f5625e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.K;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean C() {
        return D(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.Z
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r11.b0
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            android.content.Context r2 = r11.f5544s
            int r2 = r11.U(r2, r0)
            android.content.Context r3 = r11.f5544s
            r4 = 0
            android.content.res.Configuration r2 = r11.I(r3, r2, r4)
            boolean r3 = r11.f5534e0
            r5 = 24
            r6 = 1
            if (r3 != 0) goto L_0x006a
            java.lang.Object r3 = r11.f5531c
            boolean r3 = r3 instanceof android.app.Activity
            if (r3 == 0) goto L_0x006a
            android.content.Context r3 = r11.f5544s
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            if (r3 != 0) goto L_0x0032
            r3 = r1
            goto L_0x006e
        L_0x0032:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0060 }
            r8 = 29
            if (r7 < r8) goto L_0x003b
            r7 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0041
        L_0x003b:
            if (r7 < r5) goto L_0x0040
            r7 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x0041
        L_0x0040:
            r7 = r1
        L_0x0041:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0060 }
            android.content.Context r9 = r11.f5544s     // Catch:{ NameNotFoundException -> 0x0060 }
            java.lang.Object r10 = r11.f5531c     // Catch:{ NameNotFoundException -> 0x0060 }
            java.lang.Class r10 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x0060 }
            r8.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x0060 }
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x0060 }
            if (r3 == 0) goto L_0x005c
            int r3 = r3.configChanges     // Catch:{ NameNotFoundException -> 0x0060 }
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x005c
            r3 = r6
            goto L_0x005d
        L_0x005c:
            r3 = r1
        L_0x005d:
            r11.f5533d0 = r3     // Catch:{ NameNotFoundException -> 0x0060 }
            goto L_0x006a
        L_0x0060:
            r3 = move-exception
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r8 = "Exception while getting ActivityInfo"
            android.util.Log.d(r7, r8, r3)
            r11.f5533d0 = r1
        L_0x006a:
            r11.f5534e0 = r6
            boolean r3 = r11.f5533d0
        L_0x006e:
            android.content.res.Configuration r7 = r11.f5530a0
            if (r7 != 0) goto L_0x007c
            android.content.Context r7 = r11.f5544s
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
        L_0x007c:
            int r7 = r7.uiMode
            r7 = r7 & 48
            int r2 = r2.uiMode
            r2 = r2 & 48
            r8 = 28
            if (r7 == r2) goto L_0x00d4
            if (r12 == 0) goto L_0x00d4
            if (r3 != 0) goto L_0x00d4
            boolean r12 = r11.X
            if (r12 == 0) goto L_0x00d4
            boolean r12 = f5528q0
            if (r12 != 0) goto L_0x0098
            boolean r12 = r11.Y
            if (r12 == 0) goto L_0x00d4
        L_0x0098:
            java.lang.Object r12 = r11.f5531c
            boolean r9 = r12 instanceof android.app.Activity
            if (r9 == 0) goto L_0x00d4
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L_0x00d4
            java.lang.Object r12 = r11.f5531c
            android.app.Activity r12 = (android.app.Activity) r12
            int r1 = c0.b.f3053c
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r8) goto L_0x00b4
            r12.recreate()
            goto L_0x00d3
        L_0x00b4:
            r9 = 23
            if (r1 > r9) goto L_0x00ca
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r9 = r12.getMainLooper()
            r1.<init>(r9)
            c0.a r9 = new c0.a
            r9.<init>(r12)
            r1.post(r9)
            goto L_0x00d3
        L_0x00ca:
            boolean r1 = c0.d.b(r12)
            if (r1 != 0) goto L_0x00d3
            r12.recreate()
        L_0x00d3:
            r1 = r6
        L_0x00d4:
            if (r1 != 0) goto L_0x01d5
            if (r7 == r2) goto L_0x01d5
            android.content.Context r12 = r11.f5544s
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.res.Configuration r7 = r12.getConfiguration()
            r1.<init>(r7)
            android.content.res.Configuration r7 = r12.getConfiguration()
            int r7 = r7.uiMode
            r7 = r7 & -49
            r2 = r2 | r7
            r1.uiMode = r2
            r12.updateConfiguration(r1, r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r2 >= r7) goto L_0x0190
            if (r2 < r8) goto L_0x00ff
            goto L_0x0190
        L_0x00ff:
            java.lang.String r7 = "mDrawableCache"
            java.lang.String r8 = "ResourcesFlusher"
            if (r2 < r5) goto L_0x0163
            boolean r2 = h.s.f5610h
            if (r2 != 0) goto L_0x011f
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r5 = "mResourcesImpl"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x0117 }
            h.s.g = r2     // Catch:{ NoSuchFieldException -> 0x0117 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0117 }
            goto L_0x011d
        L_0x0117:
            r2 = move-exception
            java.lang.String r5 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r8, r5, r2)
        L_0x011d:
            h.s.f5610h = r6
        L_0x011f:
            java.lang.reflect.Field r2 = h.s.g
            if (r2 != 0) goto L_0x0125
            goto L_0x0190
        L_0x0125:
            java.lang.Object r12 = r2.get(r12)     // Catch:{ IllegalAccessException -> 0x012a }
            goto L_0x0131
        L_0x012a:
            r12 = move-exception
            java.lang.String r2 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r8, r2, r12)
            r12 = r4
        L_0x0131:
            if (r12 != 0) goto L_0x0134
            goto L_0x0190
        L_0x0134:
            boolean r2 = h.s.f5605b
            if (r2 != 0) goto L_0x014e
            java.lang.Class r2 = r12.getClass()     // Catch:{ NoSuchFieldException -> 0x0146 }
            java.lang.reflect.Field r2 = r2.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x0146 }
            h.s.f5604a = r2     // Catch:{ NoSuchFieldException -> 0x0146 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0146 }
            goto L_0x014c
        L_0x0146:
            r2 = move-exception
            java.lang.String r5 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r8, r5, r2)
        L_0x014c:
            h.s.f5605b = r6
        L_0x014e:
            java.lang.reflect.Field r2 = h.s.f5604a
            if (r2 == 0) goto L_0x015d
            java.lang.Object r4 = r2.get(r12)     // Catch:{ IllegalAccessException -> 0x0157 }
            goto L_0x015d
        L_0x0157:
            r12 = move-exception
            java.lang.String r2 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r8, r2, r12)
        L_0x015d:
            if (r4 == 0) goto L_0x0190
            h.s.a(r4)
            goto L_0x0190
        L_0x0163:
            boolean r2 = h.s.f5605b
            if (r2 != 0) goto L_0x017b
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.reflect.Field r2 = r2.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x0173 }
            h.s.f5604a = r2     // Catch:{ NoSuchFieldException -> 0x0173 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0173 }
            goto L_0x0179
        L_0x0173:
            r2 = move-exception
            java.lang.String r5 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r8, r5, r2)
        L_0x0179:
            h.s.f5605b = r6
        L_0x017b:
            java.lang.reflect.Field r2 = h.s.f5604a
            if (r2 == 0) goto L_0x018a
            java.lang.Object r4 = r2.get(r12)     // Catch:{ IllegalAccessException -> 0x0184 }
            goto L_0x018a
        L_0x0184:
            r12 = move-exception
            java.lang.String r2 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r8, r2, r12)
        L_0x018a:
            if (r4 != 0) goto L_0x018d
            goto L_0x0190
        L_0x018d:
            h.s.a(r4)
        L_0x0190:
            int r12 = r11.f5532c0
            if (r12 == 0) goto L_0x01a4
            android.content.Context r2 = r11.f5544s
            r2.setTheme(r12)
            android.content.Context r12 = r11.f5544s
            android.content.res.Resources$Theme r12 = r12.getTheme()
            int r2 = r11.f5532c0
            r12.applyStyle(r2, r6)
        L_0x01a4:
            if (r3 == 0) goto L_0x01d6
            java.lang.Object r12 = r11.f5531c
            boolean r2 = r12 instanceof android.app.Activity
            if (r2 == 0) goto L_0x01d6
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r2 = r12 instanceof androidx.lifecycle.a0
            if (r2 == 0) goto L_0x01c9
            r2 = r12
            androidx.lifecycle.a0 r2 = (androidx.lifecycle.a0) r2
            androidx.lifecycle.r r2 = r2.getLifecycle()
            androidx.lifecycle.r$c r2 = r2.b()
            androidx.lifecycle.r$c r3 = androidx.lifecycle.r.c.CREATED
            boolean r2 = r2.isAtLeast(r3)
            if (r2 == 0) goto L_0x01d6
            r12.onConfigurationChanged(r1)
            goto L_0x01d6
        L_0x01c9:
            boolean r2 = r11.Y
            if (r2 == 0) goto L_0x01d6
            boolean r2 = r11.Z
            if (r2 != 0) goto L_0x01d6
            r12.onConfigurationChanged(r1)
            goto L_0x01d6
        L_0x01d5:
            r6 = r1
        L_0x01d6:
            if (r6 == 0) goto L_0x01e3
            java.lang.Object r12 = r11.f5531c
            boolean r1 = r12 instanceof androidx.appcompat.app.c
            if (r1 == 0) goto L_0x01e3
            androidx.appcompat.app.c r12 = (androidx.appcompat.app.c) r12
            java.util.Objects.requireNonNull(r12)
        L_0x01e3:
            if (r0 != 0) goto L_0x01ef
            android.content.Context r12 = r11.f5544s
            h.g$h r12 = r11.P(r12)
            r12.e()
            goto L_0x01f6
        L_0x01ef:
            h.g$i r12 = r11.f5535f0
            if (r12 == 0) goto L_0x01f6
            r12.a()
        L_0x01f6:
            r12 = 3
            if (r0 != r12) goto L_0x020c
            android.content.Context r12 = r11.f5544s
            h.g$g r0 = r11.f5536g0
            if (r0 != 0) goto L_0x0206
            h.g$g r0 = new h.g$g
            r0.<init>(r12)
            r11.f5536g0 = r0
        L_0x0206:
            h.g$g r12 = r11.f5536g0
            r12.e()
            goto L_0x0213
        L_0x020c:
            h.g$g r12 = r11.f5536g0
            if (r12 == 0) goto L_0x0213
            r12.a()
        L_0x0213:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g.D(boolean):boolean");
    }

    public final void E(Window window) {
        if (this.f5545t == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof f)) {
                f fVar = new f(callback);
                this.f5546u = fVar;
                window.setCallback(fVar);
                d1 p10 = d1.p(this.f5544s, (AttributeSet) null, f5527p0);
                Drawable h10 = p10.h(0);
                if (h10 != null) {
                    window.setBackgroundDrawable(h10);
                }
                p10.r();
                this.f5545t = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void F(int i10, k kVar, Menu menu) {
        if (menu == null) {
            if (kVar == null && i10 >= 0) {
                k[] kVarArr = this.U;
                if (i10 < kVarArr.length) {
                    kVar = kVarArr[i10];
                }
            }
            if (kVar != null) {
                menu = kVar.f5570h;
            }
        }
        if ((kVar == null || kVar.f5574m) && !this.Z) {
            this.f5546u.f8361a.onPanelClosed(i10, menu);
        }
    }

    public final void G(androidx.appcompat.view.menu.e eVar) {
        if (!this.T) {
            this.T = true;
            this.z.l();
            Window.Callback R2 = R();
            if (R2 != null && !this.Z) {
                R2.onPanelClosed(108, eVar);
            }
            this.T = false;
        }
    }

    public final void H(k kVar, boolean z10) {
        j jVar;
        i0 i0Var;
        if (!z10 || kVar.f5564a != 0 || (i0Var = this.z) == null || !i0Var.b()) {
            WindowManager windowManager = (WindowManager) this.f5544s.getSystemService("window");
            if (!(windowManager == null || !kVar.f5574m || (jVar = kVar.f5568e) == null)) {
                windowManager.removeView(jVar);
                if (z10) {
                    F(kVar.f5564a, kVar, (Menu) null);
                }
            }
            kVar.f5572k = false;
            kVar.f5573l = false;
            kVar.f5574m = false;
            kVar.f5569f = null;
            kVar.f5575n = true;
            if (this.V == kVar) {
                this.V = null;
                return;
            }
            return;
        }
        G(kVar.f5570h);
    }

    public final Configuration I(Context context, int i10, Configuration configuration) {
        int i11 = i10 != 1 ? i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0122, code lost:
        if (r7 != false) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f5531c
            boolean r1 = r0 instanceof n0.e.a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof h.l
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f5545t
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = n0.e.a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002d
            h.g$f r0 = r6.f5546u
            android.view.Window$Callback r0 = r0.f8361a
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r2
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = r2
            goto L_0x003b
        L_0x003a:
            r3 = r4
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0065
            if (r0 == r5) goto L_0x0057
            if (r0 == r1) goto L_0x0044
            goto L_0x012a
        L_0x0044:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x012b
            h.g$k r0 = r6.Q(r4)
            boolean r1 = r0.f5574m
            if (r1 != 0) goto L_0x012b
            r6.X(r0, r7)
            goto L_0x012b
        L_0x0057:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r2 = r4
        L_0x0061:
            r6.W = r2
            goto L_0x012a
        L_0x0065:
            if (r0 == r5) goto L_0x00ef
            if (r0 == r1) goto L_0x006b
            goto L_0x012a
        L_0x006b:
            m.a r0 = r6.C
            if (r0 == 0) goto L_0x0071
            goto L_0x012b
        L_0x0071:
            h.g$k r0 = r6.Q(r4)
            androidx.appcompat.widget.i0 r1 = r6.z
            if (r1 == 0) goto L_0x00ab
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x00ab
            android.content.Context r1 = r6.f5544s
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00ab
            androidx.appcompat.widget.i0 r1 = r6.z
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x00a4
            boolean r1 = r6.Z
            if (r1 != 0) goto L_0x00cb
            boolean r7 = r6.X(r0, r7)
            if (r7 == 0) goto L_0x00cb
            androidx.appcompat.widget.i0 r7 = r6.z
            boolean r7 = r7.f()
            goto L_0x00d1
        L_0x00a4:
            androidx.appcompat.widget.i0 r7 = r6.z
            boolean r7 = r7.e()
            goto L_0x00d1
        L_0x00ab:
            boolean r1 = r0.f5574m
            if (r1 != 0) goto L_0x00cd
            boolean r3 = r0.f5573l
            if (r3 == 0) goto L_0x00b4
            goto L_0x00cd
        L_0x00b4:
            boolean r1 = r0.f5572k
            if (r1 == 0) goto L_0x00cb
            boolean r1 = r0.f5576o
            if (r1 == 0) goto L_0x00c3
            r0.f5572k = r4
            boolean r1 = r6.X(r0, r7)
            goto L_0x00c4
        L_0x00c3:
            r1 = r2
        L_0x00c4:
            if (r1 == 0) goto L_0x00cb
            r6.V(r0, r7)
            r7 = r2
            goto L_0x00d1
        L_0x00cb:
            r7 = r4
            goto L_0x00d1
        L_0x00cd:
            r6.H(r0, r2)
            r7 = r1
        L_0x00d1:
            if (r7 == 0) goto L_0x012b
            android.content.Context r7 = r6.f5544s
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e7
            r7.playSoundEffect(r4)
            goto L_0x012b
        L_0x00e7:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x012b
        L_0x00ef:
            boolean r7 = r6.W
            r6.W = r4
            h.g$k r0 = r6.Q(r4)
            boolean r1 = r0.f5574m
            if (r1 == 0) goto L_0x0101
            if (r7 != 0) goto L_0x012b
            r6.H(r0, r2)
            goto L_0x012b
        L_0x0101:
            m.a r7 = r6.C
            if (r7 == 0) goto L_0x0109
            r7.c()
            goto L_0x0124
        L_0x0109:
            r6.S()
            h.v r7 = r6.f5548w
            if (r7 == 0) goto L_0x0126
            androidx.appcompat.widget.j0 r0 = r7.f5625e
            if (r0 == 0) goto L_0x0121
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x0121
            androidx.appcompat.widget.j0 r7 = r7.f5625e
            r7.collapseActionView()
            r7 = r2
            goto L_0x0122
        L_0x0121:
            r7 = r4
        L_0x0122:
            if (r7 == 0) goto L_0x0126
        L_0x0124:
            r7 = r2
            goto L_0x0127
        L_0x0126:
            r7 = r4
        L_0x0127:
            if (r7 == 0) goto L_0x012a
            goto L_0x012b
        L_0x012a:
            r2 = r4
        L_0x012b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g.J(android.view.KeyEvent):boolean");
    }

    public final void K(int i10) {
        k Q2 = Q(i10);
        if (Q2.f5570h != null) {
            Bundle bundle = new Bundle();
            Q2.f5570h.x(bundle);
            if (bundle.size() > 0) {
                Q2.f5577p = bundle;
            }
            Q2.f5570h.B();
            Q2.f5570h.clear();
        }
        Q2.f5576o = true;
        Q2.f5575n = true;
        if ((i10 == 108 || i10 == 0) && this.z != null) {
            k Q3 = Q(0);
            Q3.f5572k = false;
            X(Q3, (KeyEvent) null);
        }
    }

    public final void L() {
        a0 a0Var = this.G;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public final void M() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.I) {
            TypedArray obtainStyledAttributes = this.f5544s.obtainStyledAttributes(ad.c.D);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    w(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    w(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    w(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    w(10);
                }
                this.R = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                N();
                this.f5545t.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f5544s);
                if (this.S) {
                    viewGroup = this.Q ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.R) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.P = false;
                    this.O = false;
                } else if (this.O) {
                    TypedValue typedValue = new TypedValue();
                    this.f5544s.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new m.c(this.f5544s, typedValue.resourceId);
                    } else {
                        context = this.f5544s;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    i0 i0Var = (i0) viewGroup.findViewById(R.id.decor_content_parent);
                    this.z = i0Var;
                    i0Var.setWindowCallback(R());
                    if (this.P) {
                        this.z.k(109);
                    }
                    if (this.M) {
                        this.z.k(2);
                    }
                    if (this.N) {
                        this.z.k(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    h hVar = new h(this);
                    WeakHashMap<View, a0> weakHashMap = x.f8842a;
                    x.i.u(viewGroup, hVar);
                    if (this.z == null) {
                        this.K = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = k1.f1310a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    } catch (IllegalAccessException e11) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f5545t.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f5545t.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new i(this));
                    this.J = viewGroup;
                    Object obj = this.f5531c;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f5550y;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        i0 i0Var2 = this.z;
                        if (i0Var2 != null) {
                            i0Var2.setWindowTitle(charSequence);
                        } else {
                            v vVar = this.f5548w;
                            if (vVar != null) {
                                vVar.f5625e.setWindowTitle(charSequence);
                            } else {
                                TextView textView = this.K;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.J.findViewById(16908290);
                    View decorView = this.f5545t.getDecorView();
                    contentFrameLayout2.f1037v.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                    if (x.g.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f5544s.obtainStyledAttributes(ad.c.D);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.I = true;
                    k Q2 = Q(0);
                    if (!this.Z && Q2.f5570h == null) {
                        T(108);
                        return;
                    }
                    return;
                }
                StringBuilder d10 = a.a.d("AppCompat does not support the current theme features: { windowActionBar: ");
                d10.append(this.O);
                d10.append(", windowActionBarOverlay: ");
                d10.append(this.P);
                d10.append(", android:windowIsFloating: ");
                d10.append(this.R);
                d10.append(", windowActionModeOverlay: ");
                d10.append(this.Q);
                d10.append(", windowNoTitle: ");
                d10.append(this.S);
                d10.append(" }");
                throw new IllegalArgumentException(d10.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void N() {
        if (this.f5545t == null) {
            Object obj = this.f5531c;
            if (obj instanceof Activity) {
                E(((Activity) obj).getWindow());
            }
        }
        if (this.f5545t == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final k O(Menu menu) {
        k[] kVarArr = this.U;
        int length = kVarArr != null ? kVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            k kVar = kVarArr[i10];
            if (kVar != null && kVar.f5570h == menu) {
                return kVar;
            }
        }
        return null;
    }

    public final h P(Context context) {
        if (this.f5535f0 == null) {
            if (u.f5615d == null) {
                Context applicationContext = context.getApplicationContext();
                u.f5615d = new u(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f5535f0 = new i(u.f5615d);
        }
        return this.f5535f0;
    }

    public final k Q(int i10) {
        k[] kVarArr = this.U;
        if (kVarArr == null || kVarArr.length <= i10) {
            k[] kVarArr2 = new k[(i10 + 1)];
            if (kVarArr != null) {
                System.arraycopy(kVarArr, 0, kVarArr2, 0, kVarArr.length);
            }
            this.U = kVarArr2;
            kVarArr = kVarArr2;
        }
        k kVar = kVarArr[i10];
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(i10);
        kVarArr[i10] = kVar2;
        return kVar2;
    }

    public final Window.Callback R() {
        return this.f5545t.getCallback();
    }

    public final void S() {
        M();
        if (this.O && this.f5548w == null) {
            Object obj = this.f5531c;
            if (obj instanceof Activity) {
                this.f5548w = new v((Activity) this.f5531c, this.P);
            } else if (obj instanceof Dialog) {
                this.f5548w = new v((Dialog) this.f5531c);
            }
            v vVar = this.f5548w;
            if (vVar != null) {
                vVar.e(this.f5540k0);
            }
        }
    }

    public final void T(int i10) {
        this.f5538i0 = (1 << i10) | this.f5538i0;
        if (!this.f5537h0) {
            View decorView = this.f5545t.getDecorView();
            a aVar = this.f5539j0;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.d.m(decorView, aVar);
            this.f5537h0 = true;
        }
    }

    public final int U(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    if (i10 == 3) {
                        if (this.f5536g0 == null) {
                            this.f5536g0 = new C0091g(context);
                        }
                        if (this.f5536g0.f5556c.isPowerSaveMode()) {
                            return 2;
                        }
                        return 1;
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return P(context).c();
            }
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0152, code lost:
        if (r15 != null) goto L_0x0154;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V(h.g.k r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.f5574m
            if (r0 != 0) goto L_0x01d3
            boolean r0 = r13.Z
            if (r0 == 0) goto L_0x000a
            goto L_0x01d3
        L_0x000a:
            int r0 = r14.f5564a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r13.f5544s
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = r2
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r13.R()
            if (r0 == 0) goto L_0x003b
            int r3 = r14.f5564a
            androidx.appcompat.view.menu.e r4 = r14.f5570h
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r13.H(r14, r2)
            return
        L_0x003b:
            android.content.Context r0 = r13.f5544s
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r15 = r13.X(r14, r15)
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            h.g$j r15 = r14.f5568e
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L_0x006b
            boolean r5 = r14.f5575n
            if (r5 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r15 = r14.g
            if (r15 == 0) goto L_0x01b0
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x01b0
            int r15 = r15.width
            if (r15 != r3) goto L_0x01b0
            r6 = r3
            goto L_0x01b1
        L_0x006b:
            if (r15 != 0) goto L_0x00e6
            r13.S()
            h.v r15 = r13.f5548w
            if (r15 == 0) goto L_0x0079
            android.content.Context r15 = r15.c()
            goto L_0x007a
        L_0x0079:
            r15 = 0
        L_0x007a:
            if (r15 != 0) goto L_0x007e
            android.content.Context r15 = r13.f5544s
        L_0x007e:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources r5 = r15.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r15.getTheme()
            r5.setTo(r6)
            r6 = 2130903044(0x7f030004, float:1.7412895E38)
            r5.resolveAttribute(r6, r3, r2)
            int r6 = r3.resourceId
            if (r6 == 0) goto L_0x009f
            r5.applyStyle(r6, r2)
        L_0x009f:
            r6 = 2130903881(0x7f030349, float:1.7414592E38)
            r5.resolveAttribute(r6, r3, r2)
            int r3 = r3.resourceId
            if (r3 == 0) goto L_0x00ad
            r5.applyStyle(r3, r2)
            goto L_0x00b3
        L_0x00ad:
            r3 = 2131821107(0x7f110233, float:1.9274948E38)
            r5.applyStyle(r3, r2)
        L_0x00b3:
            m.c r3 = new m.c
            r3.<init>((android.content.Context) r15, (int) r1)
            android.content.res.Resources$Theme r15 = r3.getTheme()
            r15.setTo(r5)
            r14.f5571j = r3
            int[] r15 = ad.c.D
            android.content.res.TypedArray r15 = r3.obtainStyledAttributes(r15)
            r3 = 86
            int r3 = r15.getResourceId(r3, r1)
            r14.f5565b = r3
            int r3 = r15.getResourceId(r2, r1)
            r14.f5567d = r3
            r15.recycle()
            h.g$j r15 = new h.g$j
            m.c r3 = r14.f5571j
            r15.<init>(r3)
            r14.f5568e = r15
            r15 = 81
            r14.f5566c = r15
            goto L_0x00f5
        L_0x00e6:
            boolean r3 = r14.f5575n
            if (r3 == 0) goto L_0x00f5
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x00f5
            h.g$j r15 = r14.f5568e
            r15.removeAllViews()
        L_0x00f5:
            android.view.View r15 = r14.g
            if (r15 == 0) goto L_0x00fc
            r14.f5569f = r15
            goto L_0x0154
        L_0x00fc:
            androidx.appcompat.view.menu.e r15 = r14.f5570h
            if (r15 != 0) goto L_0x0101
            goto L_0x0156
        L_0x0101:
            h.g$l r15 = r13.B
            if (r15 != 0) goto L_0x010c
            h.g$l r15 = new h.g$l
            r15.<init>()
            r13.B = r15
        L_0x010c:
            h.g$l r15 = r13.B
            androidx.appcompat.view.menu.c r3 = r14.i
            if (r3 != 0) goto L_0x0122
            androidx.appcompat.view.menu.c r3 = new androidx.appcompat.view.menu.c
            m.c r5 = r14.f5571j
            r3.<init>(r5)
            r14.i = r3
            r3.f912t = r15
            androidx.appcompat.view.menu.e r15 = r14.f5570h
            r15.b(r3)
        L_0x0122:
            androidx.appcompat.view.menu.c r15 = r14.i
            h.g$j r3 = r14.f5568e
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r15.f911s
            if (r5 != 0) goto L_0x014e
            android.view.LayoutInflater r5 = r15.f909b
            r6 = 2131427341(0x7f0b000d, float:1.8476296E38)
            android.view.View r3 = r5.inflate(r6, r3, r1)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = (androidx.appcompat.view.menu.ExpandedMenuView) r3
            r15.f911s = r3
            androidx.appcompat.view.menu.c$a r3 = r15.f913u
            if (r3 != 0) goto L_0x0142
            androidx.appcompat.view.menu.c$a r3 = new androidx.appcompat.view.menu.c$a
            r3.<init>()
            r15.f913u = r3
        L_0x0142:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f911s
            androidx.appcompat.view.menu.c$a r5 = r15.f913u
            r3.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f911s
            r3.setOnItemClickListener(r15)
        L_0x014e:
            androidx.appcompat.view.menu.ExpandedMenuView r15 = r15.f911s
            r14.f5569f = r15
            if (r15 == 0) goto L_0x0156
        L_0x0154:
            r15 = r2
            goto L_0x0157
        L_0x0156:
            r15 = r1
        L_0x0157:
            if (r15 == 0) goto L_0x01d1
            android.view.View r15 = r14.f5569f
            if (r15 != 0) goto L_0x015e
            goto L_0x0173
        L_0x015e:
            android.view.View r15 = r14.g
            if (r15 == 0) goto L_0x0163
            goto L_0x0171
        L_0x0163:
            androidx.appcompat.view.menu.c r15 = r14.i
            android.widget.ListAdapter r15 = r15.b()
            androidx.appcompat.view.menu.c$a r15 = (androidx.appcompat.view.menu.c.a) r15
            int r15 = r15.getCount()
            if (r15 <= 0) goto L_0x0173
        L_0x0171:
            r15 = r2
            goto L_0x0174
        L_0x0173:
            r15 = r1
        L_0x0174:
            if (r15 != 0) goto L_0x0177
            goto L_0x01d1
        L_0x0177:
            android.view.View r15 = r14.f5569f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x0184
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x0184:
            int r3 = r14.f5565b
            h.g$j r5 = r14.f5568e
            r5.setBackgroundResource(r3)
            android.view.View r3 = r14.f5569f
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x019c
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r14.f5569f
            r3.removeView(r5)
        L_0x019c:
            h.g$j r3 = r14.f5568e
            android.view.View r5 = r14.f5569f
            r3.addView(r5, r15)
            android.view.View r15 = r14.f5569f
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x01b0
            android.view.View r15 = r14.f5569f
            r15.requestFocus()
        L_0x01b0:
            r6 = r4
        L_0x01b1:
            r14.f5573l = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            r8 = 0
            r9 = 0
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r14.f5566c
            r15.gravity = r1
            int r1 = r14.f5567d
            r15.windowAnimations = r1
            h.g$j r1 = r14.f5568e
            r0.addView(r1, r15)
            r14.f5574m = r2
            return
        L_0x01d1:
            r14.f5575n = r2
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g.V(h.g$k, android.view.KeyEvent):void");
    }

    public final boolean W(k kVar, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.e eVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((kVar.f5572k || X(kVar, keyEvent)) && (eVar = kVar.f5570h) != null) {
            return eVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    public final boolean X(k kVar, KeyEvent keyEvent) {
        i0 i0Var;
        i0 i0Var2;
        i0 i0Var3;
        Resources.Theme theme;
        i0 i0Var4;
        if (this.Z) {
            return false;
        }
        if (kVar.f5572k) {
            return true;
        }
        k kVar2 = this.V;
        if (!(kVar2 == null || kVar2 == kVar)) {
            H(kVar2, false);
        }
        Window.Callback R2 = R();
        if (R2 != null) {
            kVar.g = R2.onCreatePanelView(kVar.f5564a);
        }
        int i10 = kVar.f5564a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (i0Var4 = this.z) != null) {
            i0Var4.c();
        }
        if (kVar.g == null) {
            androidx.appcompat.view.menu.e eVar = kVar.f5570h;
            if (eVar == null || kVar.f5576o) {
                if (eVar == null) {
                    Context context = this.f5544s;
                    int i11 = kVar.f5564a;
                    if ((i11 == 0 || i11 == 108) && this.z != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            m.c cVar = new m.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.e eVar2 = new androidx.appcompat.view.menu.e(context);
                    eVar2.f927e = this;
                    kVar.a(eVar2);
                    if (kVar.f5570h == null) {
                        return false;
                    }
                }
                if (z10 && (i0Var3 = this.z) != null) {
                    if (this.A == null) {
                        this.A = new b();
                    }
                    i0Var3.a(kVar.f5570h, this.A);
                }
                kVar.f5570h.B();
                if (!R2.onCreatePanelMenu(kVar.f5564a, kVar.f5570h)) {
                    kVar.a((androidx.appcompat.view.menu.e) null);
                    if (z10 && (i0Var2 = this.z) != null) {
                        i0Var2.a((Menu) null, this.A);
                    }
                    return false;
                }
                kVar.f5576o = false;
            }
            kVar.f5570h.B();
            Bundle bundle = kVar.f5577p;
            if (bundle != null) {
                kVar.f5570h.w(bundle);
                kVar.f5577p = null;
            }
            if (!R2.onPreparePanel(0, kVar.g, kVar.f5570h)) {
                if (z10 && (i0Var = this.z) != null) {
                    i0Var.a((Menu) null, this.A);
                }
                kVar.f5570h.A();
                return false;
            }
            kVar.f5570h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            kVar.f5570h.A();
        }
        kVar.f5572k = true;
        kVar.f5573l = false;
        this.V = kVar;
        return true;
    }

    public final void Y() {
        if (this.I) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int Z(e0 e0Var) {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        int i12;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i13;
        int f10 = e0Var.f();
        ActionBarContextView actionBarContextView = this.D;
        int i14 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.D.getLayoutParams();
            boolean z12 = true;
            if (this.D.isShown()) {
                if (this.f5541l0 == null) {
                    this.f5541l0 = new Rect();
                    this.f5542m0 = new Rect();
                }
                Rect rect = this.f5541l0;
                Rect rect2 = this.f5542m0;
                rect.set(e0Var.d(), e0Var.f(), e0Var.e(), e0Var.c());
                k1.a(this.J, rect, rect2);
                int i15 = rect.top;
                int i16 = rect.left;
                int i17 = rect.right;
                ViewGroup viewGroup = this.J;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                e0 a10 = x.j.a(viewGroup);
                if (a10 == null) {
                    i10 = 0;
                } else {
                    i10 = a10.d();
                }
                if (a10 == null) {
                    i11 = 0;
                } else {
                    i11 = a10.e();
                }
                if (marginLayoutParams2.topMargin == i15 && marginLayoutParams2.leftMargin == i16 && marginLayoutParams2.rightMargin == i17) {
                    z11 = false;
                } else {
                    marginLayoutParams2.topMargin = i15;
                    marginLayoutParams2.leftMargin = i16;
                    marginLayoutParams2.rightMargin = i17;
                    z11 = true;
                }
                if (i15 <= 0 || this.L != null) {
                    View view = this.L;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i13 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11))) {
                        marginLayoutParams.height = i13;
                        marginLayoutParams.leftMargin = i10;
                        marginLayoutParams.rightMargin = i11;
                        this.L.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f5544s);
                    this.L = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i10;
                    layoutParams.rightMargin = i11;
                    this.J.addView(this.L, -1, layoutParams);
                }
                View view3 = this.L;
                z10 = view3 != null;
                if (z10 && view3.getVisibility() != 0) {
                    View view4 = this.L;
                    if ((x.d.g(view4) & LZ4Constants.HASH_TABLE_SIZE_64K) == 0) {
                        z12 = false;
                    }
                    if (z12) {
                        Context context = this.f5544s;
                        Object obj = d0.a.f4256a;
                        i12 = a.c.a(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        Context context2 = this.f5544s;
                        Object obj2 = d0.a.f4256a;
                        i12 = a.c.a(context2, R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(i12);
                }
                if (!this.Q && z10) {
                    f10 = 0;
                }
                z12 = z11;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z10 = false;
            } else {
                z12 = false;
                z10 = false;
            }
            if (z12) {
                this.D.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.L;
        if (view5 != null) {
            if (z10) {
                i14 = 0;
            }
            view5.setVisibility(i14);
        }
        return f10;
    }

    public final boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        k O2;
        Window.Callback R2 = R();
        if (R2 == null || this.Z || (O2 = O(eVar.l())) == null) {
            return false;
        }
        return R2.onMenuItemSelected(O2.f5564a, menuItem);
    }

    public final void b(androidx.appcompat.view.menu.e eVar) {
        i0 i0Var = this.z;
        if (i0Var == null || !i0Var.g() || (ViewConfiguration.get(this.f5544s).hasPermanentMenuKey() && !this.z.d())) {
            k Q2 = Q(0);
            Q2.f5575n = true;
            H(Q2, false);
            V(Q2, (KeyEvent) null);
            return;
        }
        Window.Callback R2 = R();
        if (this.z.b()) {
            this.z.e();
            if (!this.Z) {
                R2.onPanelClosed(108, Q(0).f5570h);
            }
        } else if (R2 != null && !this.Z) {
            if (this.f5537h0 && (1 & this.f5538i0) != 0) {
                this.f5545t.getDecorView().removeCallbacks(this.f5539j0);
                this.f5539j0.run();
            }
            k Q3 = Q(0);
            androidx.appcompat.view.menu.e eVar2 = Q3.f5570h;
            if (eVar2 != null && !Q3.f5576o && R2.onPreparePanel(0, Q3.g, eVar2)) {
                R2.onMenuOpened(108, Q3.f5570h);
                this.z.f();
            }
        }
    }

    public final void d(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ((ViewGroup) this.J.findViewById(16908290)).addView(view, layoutParams);
        this.f5546u.f8361a.onContentChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Context e(android.content.Context r10) {
        /*
            r9 = this;
            r0 = 1
            r9.X = r0
            int r1 = r9.b0
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r1 = r2
        L_0x000b:
            int r1 = r9.U(r10, r1)
            boolean r2 = f5529r0
            r3 = 0
            if (r2 == 0) goto L_0x0023
            boolean r2 = r10 instanceof android.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x0023
            android.content.res.Configuration r2 = r9.I(r10, r1, r3)
            r4 = r10
            android.view.ContextThemeWrapper r4 = (android.view.ContextThemeWrapper) r4     // Catch:{ IllegalStateException -> 0x0023 }
            r4.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x0023 }
            return r10
        L_0x0023:
            boolean r2 = r10 instanceof m.c
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r2 = r9.I(r10, r1, r3)
            r4 = r10
            m.c r4 = (m.c) r4     // Catch:{ IllegalStateException -> 0x0032 }
            r4.a(r2)     // Catch:{ IllegalStateException -> 0x0032 }
            return r10
        L_0x0032:
            boolean r2 = f5528q0
            if (r2 != 0) goto L_0x0037
            return r10
        L_0x0037:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.content.res.Configuration r4 = new android.content.res.Configuration
            r4.<init>()
            r5 = -1
            r4.uiMode = r5
            r5 = 0
            r4.fontScale = r5
            android.content.Context r4 = r10.createConfigurationContext(r4)
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            android.content.res.Resources r6 = r10.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r7 = r6.uiMode
            r4.uiMode = r7
            boolean r7 = r4.equals(r6)
            if (r7 != 0) goto L_0x0153
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>()
            r7.fontScale = r5
            int r5 = r4.diff(r6)
            if (r5 != 0) goto L_0x0071
            goto L_0x0154
        L_0x0071:
            float r5 = r4.fontScale
            float r8 = r6.fontScale
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x007b
            r7.fontScale = r8
        L_0x007b:
            int r5 = r4.mcc
            int r8 = r6.mcc
            if (r5 == r8) goto L_0x0083
            r7.mcc = r8
        L_0x0083:
            int r5 = r4.mnc
            int r8 = r6.mnc
            if (r5 == r8) goto L_0x008b
            r7.mnc = r8
        L_0x008b:
            r5 = 24
            if (r2 < r5) goto L_0x0093
            h.g.d.a(r4, r6, r7)
            goto L_0x00a1
        L_0x0093:
            java.util.Locale r5 = r4.locale
            java.util.Locale r8 = r6.locale
            boolean r5 = java.util.Objects.equals(r5, r8)
            if (r5 != 0) goto L_0x00a1
            java.util.Locale r5 = r6.locale
            r7.locale = r5
        L_0x00a1:
            int r5 = r4.touchscreen
            int r8 = r6.touchscreen
            if (r5 == r8) goto L_0x00a9
            r7.touchscreen = r8
        L_0x00a9:
            int r5 = r4.keyboard
            int r8 = r6.keyboard
            if (r5 == r8) goto L_0x00b1
            r7.keyboard = r8
        L_0x00b1:
            int r5 = r4.keyboardHidden
            int r8 = r6.keyboardHidden
            if (r5 == r8) goto L_0x00b9
            r7.keyboardHidden = r8
        L_0x00b9:
            int r5 = r4.navigation
            int r8 = r6.navigation
            if (r5 == r8) goto L_0x00c1
            r7.navigation = r8
        L_0x00c1:
            int r5 = r4.navigationHidden
            int r8 = r6.navigationHidden
            if (r5 == r8) goto L_0x00c9
            r7.navigationHidden = r8
        L_0x00c9:
            int r5 = r4.orientation
            int r8 = r6.orientation
            if (r5 == r8) goto L_0x00d1
            r7.orientation = r8
        L_0x00d1:
            int r5 = r4.screenLayout
            r5 = r5 & 15
            int r8 = r6.screenLayout
            r8 = r8 & 15
            if (r5 == r8) goto L_0x00e0
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00e0:
            int r5 = r4.screenLayout
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r8 = r6.screenLayout
            r8 = r8 & 192(0xc0, float:2.69E-43)
            if (r5 == r8) goto L_0x00ef
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00ef:
            int r5 = r4.screenLayout
            r5 = r5 & 48
            int r8 = r6.screenLayout
            r8 = r8 & 48
            if (r5 == r8) goto L_0x00fe
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00fe:
            int r5 = r4.screenLayout
            r5 = r5 & 768(0x300, float:1.076E-42)
            int r8 = r6.screenLayout
            r8 = r8 & 768(0x300, float:1.076E-42)
            if (r5 == r8) goto L_0x010d
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x010d:
            r5 = 26
            if (r2 < r5) goto L_0x0114
            h.g.e.a(r4, r6, r7)
        L_0x0114:
            int r2 = r4.uiMode
            r2 = r2 & 15
            int r5 = r6.uiMode
            r5 = r5 & 15
            if (r2 == r5) goto L_0x0123
            int r2 = r7.uiMode
            r2 = r2 | r5
            r7.uiMode = r2
        L_0x0123:
            int r2 = r4.uiMode
            r2 = r2 & 48
            int r5 = r6.uiMode
            r5 = r5 & 48
            if (r2 == r5) goto L_0x0132
            int r2 = r7.uiMode
            r2 = r2 | r5
            r7.uiMode = r2
        L_0x0132:
            int r2 = r4.screenWidthDp
            int r5 = r6.screenWidthDp
            if (r2 == r5) goto L_0x013a
            r7.screenWidthDp = r5
        L_0x013a:
            int r2 = r4.screenHeightDp
            int r5 = r6.screenHeightDp
            if (r2 == r5) goto L_0x0142
            r7.screenHeightDp = r5
        L_0x0142:
            int r2 = r4.smallestScreenWidthDp
            int r5 = r6.smallestScreenWidthDp
            if (r2 == r5) goto L_0x014a
            r7.smallestScreenWidthDp = r5
        L_0x014a:
            int r2 = r4.densityDpi
            int r4 = r6.densityDpi
            if (r2 == r4) goto L_0x0154
            r7.densityDpi = r4
            goto L_0x0154
        L_0x0153:
            r7 = r3
        L_0x0154:
            android.content.res.Configuration r1 = r9.I(r10, r1, r7)
            m.c r2 = new m.c
            r4 = 2131821119(0x7f11023f, float:1.9274972E38)
            r2.<init>((android.content.Context) r10, (int) r4)
            r2.a(r1)
            r1 = 0
            android.content.res.Resources$Theme r10 = r10.getTheme()     // Catch:{ NullPointerException -> 0x016c }
            if (r10 == 0) goto L_0x016c
            r10 = r0
            goto L_0x016d
        L_0x016c:
            r10 = r1
        L_0x016d:
            if (r10 == 0) goto L_0x01b9
            android.content.res.Resources$Theme r10 = r2.getTheme()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L_0x017d
            f0.j.a(r10)
            goto L_0x01b9
        L_0x017d:
            java.lang.Object r4 = f0.i.f4898a
            monitor-enter(r4)
            boolean r5 = f0.i.f4900c     // Catch:{ all -> 0x01b6 }
            if (r5 != 0) goto L_0x019e
            java.lang.Class<android.content.res.Resources$Theme> r5 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0194 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0194 }
            f0.i.f4899b = r5     // Catch:{ NoSuchMethodException -> 0x0194 }
            r5.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x0194 }
            goto L_0x019c
        L_0x0194:
            r5 = move-exception
            java.lang.String r6 = "ResourcesCompat"
            java.lang.String r7 = "Failed to retrieve rebase() method"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x01b6 }
        L_0x019c:
            f0.i.f4900c = r0     // Catch:{ all -> 0x01b6 }
        L_0x019e:
            java.lang.reflect.Method r0 = f0.i.f4899b     // Catch:{ all -> 0x01b6 }
            if (r0 == 0) goto L_0x01b4
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x01aa, InvocationTargetException -> 0x01a8 }
            r0.invoke(r10, r1)     // Catch:{ IllegalAccessException -> 0x01aa, InvocationTargetException -> 0x01a8 }
            goto L_0x01b4
        L_0x01a8:
            r10 = move-exception
            goto L_0x01ab
        L_0x01aa:
            r10 = move-exception
        L_0x01ab:
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r1 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r0, r1, r10)     // Catch:{ all -> 0x01b6 }
            f0.i.f4899b = r3     // Catch:{ all -> 0x01b6 }
        L_0x01b4:
            monitor-exit(r4)     // Catch:{ all -> 0x01b6 }
            goto L_0x01b9
        L_0x01b6:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01b6 }
            throw r10
        L_0x01b9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g.e(android.content.Context):android.content.Context");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v73, resolved type: androidx.appcompat.widget.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: androidx.appcompat.widget.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: androidx.appcompat.widget.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v76, resolved type: androidx.appcompat.widget.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: androidx.appcompat.widget.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v78, resolved type: androidx.appcompat.widget.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: androidx.appcompat.widget.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: androidx.appcompat.widget.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: androidx.appcompat.widget.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: androidx.appcompat.widget.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: androidx.appcompat.widget.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: androidx.appcompat.widget.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: androidx.appcompat.widget.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v86, resolved type: androidx.appcompat.widget.g} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r10v17, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v8, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0117, code lost:
        if (r10.equals("ImageButton") == false) goto L_0x0146;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View f(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r8 = this;
            h.n r9 = r8.f5543n0
            r0 = 0
            if (r9 != 0) goto L_0x005b
            android.content.Context r9 = r8.f5544s
            int[] r1 = ad.c.D
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r1)
            r1 = 116(0x74, float:1.63E-43)
            java.lang.String r9 = r9.getString(r1)
            if (r9 != 0) goto L_0x001d
            h.n r9 = new h.n
            r9.<init>()
            r8.f5543n0 = r9
            goto L_0x005b
        L_0x001d:
            android.content.Context r1 = r8.f5544s     // Catch:{ all -> 0x0038 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x0038 }
            java.lang.Class r1 = r1.loadClass(r9)     // Catch:{ all -> 0x0038 }
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x0038 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch:{ all -> 0x0038 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0038 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0038 }
            h.n r1 = (h.n) r1     // Catch:{ all -> 0x0038 }
            r8.f5543n0 = r1     // Catch:{ all -> 0x0038 }
            goto L_0x005b
        L_0x0038:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = ". Falling back to default."
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "AppCompatDelegate"
            android.util.Log.i(r2, r9, r1)
            h.n r9 = new h.n
            r9.<init>()
            r8.f5543n0 = r9
        L_0x005b:
            h.n r9 = r8.f5543n0
            int r1 = androidx.appcompat.widget.j1.f1294a
            java.util.Objects.requireNonNull(r9)
            r1 = 4
            int[] r2 = ad.c.T
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r12, r2, r0, r0)
            int r3 = r2.getResourceId(r1, r0)
            if (r3 == 0) goto L_0x0076
            java.lang.String r4 = "AppCompatViewInflater"
            java.lang.String r5 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r4, r5)
        L_0x0076:
            r2.recycle()
            if (r3 == 0) goto L_0x008c
            boolean r2 = r11 instanceof m.c
            if (r2 == 0) goto L_0x0086
            r2 = r11
            m.c r2 = (m.c) r2
            int r2 = r2.f8306a
            if (r2 == r3) goto L_0x008c
        L_0x0086:
            m.c r2 = new m.c
            r2.<init>((android.content.Context) r11, (int) r3)
            goto L_0x008d
        L_0x008c:
            r2 = r11
        L_0x008d:
            java.util.Objects.requireNonNull(r10)
            int r3 = r10.hashCode()
            r4 = 3
            r5 = -1
            r6 = 1
            switch(r3) {
                case -1946472170: goto L_0x013b;
                case -1455429095: goto L_0x0130;
                case -1346021293: goto L_0x0125;
                case -938935918: goto L_0x011a;
                case -937446323: goto L_0x0111;
                case -658531749: goto L_0x0106;
                case -339785223: goto L_0x00fb;
                case 776382189: goto L_0x00f0;
                case 799298502: goto L_0x00e2;
                case 1125864064: goto L_0x00d4;
                case 1413872058: goto L_0x00c6;
                case 1601505219: goto L_0x00b8;
                case 1666676343: goto L_0x00aa;
                case 2001146706: goto L_0x009c;
                default: goto L_0x009a;
            }
        L_0x009a:
            goto L_0x0146
        L_0x009c:
            java.lang.String r1 = "Button"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00a6
            goto L_0x0146
        L_0x00a6:
            r1 = 13
            goto L_0x0147
        L_0x00aa:
            java.lang.String r1 = "EditText"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00b4
            goto L_0x0146
        L_0x00b4:
            r1 = 12
            goto L_0x0147
        L_0x00b8:
            java.lang.String r1 = "CheckBox"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00c2
            goto L_0x0146
        L_0x00c2:
            r1 = 11
            goto L_0x0147
        L_0x00c6:
            java.lang.String r1 = "AutoCompleteTextView"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00d0
            goto L_0x0146
        L_0x00d0:
            r1 = 10
            goto L_0x0147
        L_0x00d4:
            java.lang.String r1 = "ImageView"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00de
            goto L_0x0146
        L_0x00de:
            r1 = 9
            goto L_0x0147
        L_0x00e2:
            java.lang.String r1 = "ToggleButton"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00ec
            goto L_0x0146
        L_0x00ec:
            r1 = 8
            goto L_0x0147
        L_0x00f0:
            java.lang.String r1 = "RadioButton"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00f9
            goto L_0x0146
        L_0x00f9:
            r1 = 7
            goto L_0x0147
        L_0x00fb:
            java.lang.String r1 = "Spinner"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0104
            goto L_0x0146
        L_0x0104:
            r1 = 6
            goto L_0x0147
        L_0x0106:
            java.lang.String r1 = "SeekBar"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x010f
            goto L_0x0146
        L_0x010f:
            r1 = 5
            goto L_0x0147
        L_0x0111:
            java.lang.String r3 = "ImageButton"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0147
            goto L_0x0146
        L_0x011a:
            java.lang.String r1 = "TextView"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0123
            goto L_0x0146
        L_0x0123:
            r1 = r4
            goto L_0x0147
        L_0x0125:
            java.lang.String r1 = "MultiAutoCompleteTextView"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x012e
            goto L_0x0146
        L_0x012e:
            r1 = 2
            goto L_0x0147
        L_0x0130:
            java.lang.String r1 = "CheckedTextView"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0139
            goto L_0x0146
        L_0x0139:
            r1 = r6
            goto L_0x0147
        L_0x013b:
            java.lang.String r1 = "RatingBar"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            r1 = r0
            goto L_0x0147
        L_0x0146:
            r1 = r5
        L_0x0147:
            r3 = 0
            switch(r1) {
                case 0: goto L_0x01a8;
                case 1: goto L_0x01a2;
                case 2: goto L_0x019c;
                case 3: goto L_0x0194;
                case 4: goto L_0x018e;
                case 5: goto L_0x0188;
                case 6: goto L_0x017f;
                case 7: goto L_0x0177;
                case 8: goto L_0x0171;
                case 9: goto L_0x016b;
                case 10: goto L_0x0163;
                case 11: goto L_0x015b;
                case 12: goto L_0x0155;
                case 13: goto L_0x014d;
                default: goto L_0x014b;
            }
        L_0x014b:
            r1 = r3
            goto L_0x01ad
        L_0x014d:
            androidx.appcompat.widget.g r1 = r9.b(r2, r12)
            r9.g(r1, r10)
            goto L_0x01ad
        L_0x0155:
            androidx.appcompat.widget.m r1 = new androidx.appcompat.widget.m
            r1.<init>(r2, r12)
            goto L_0x01ad
        L_0x015b:
            androidx.appcompat.widget.h r1 = r9.c(r2, r12)
            r9.g(r1, r10)
            goto L_0x01ad
        L_0x0163:
            androidx.appcompat.widget.e r1 = r9.a(r2, r12)
            r9.g(r1, r10)
            goto L_0x01ad
        L_0x016b:
            androidx.appcompat.widget.r r1 = new androidx.appcompat.widget.r
            r1.<init>(r2, r12)
            goto L_0x01ad
        L_0x0171:
            androidx.appcompat.widget.h0 r1 = new androidx.appcompat.widget.h0
            r1.<init>(r2, r12)
            goto L_0x01ad
        L_0x0177:
            androidx.appcompat.widget.v r1 = r9.d(r2, r12)
            r9.g(r1, r10)
            goto L_0x01ad
        L_0x017f:
            androidx.appcompat.widget.b0 r1 = new androidx.appcompat.widget.b0
            r7 = 2130904022(0x7f0303d6, float:1.7414878E38)
            r1.<init>(r2, r12, r7)
            goto L_0x01ad
        L_0x0188:
            androidx.appcompat.widget.y r1 = new androidx.appcompat.widget.y
            r1.<init>(r2, r12)
            goto L_0x01ad
        L_0x018e:
            androidx.appcompat.widget.p r1 = new androidx.appcompat.widget.p
            r1.<init>(r2, r12)
            goto L_0x01ad
        L_0x0194:
            androidx.appcompat.widget.f0 r1 = r9.e(r2, r12)
            r9.g(r1, r10)
            goto L_0x01ad
        L_0x019c:
            androidx.appcompat.widget.s r1 = new androidx.appcompat.widget.s
            r1.<init>(r2, r12)
            goto L_0x01ad
        L_0x01a2:
            androidx.appcompat.widget.i r1 = new androidx.appcompat.widget.i
            r1.<init>(r2, r12)
            goto L_0x01ad
        L_0x01a8:
            androidx.appcompat.widget.w r1 = new androidx.appcompat.widget.w
            r1.<init>(r2, r12)
        L_0x01ad:
            if (r1 != 0) goto L_0x0207
            if (r11 == r2) goto L_0x0207
            java.lang.String r11 = "view"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x01bf
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r3, r10)
        L_0x01bf:
            java.lang.Object[] r11 = r9.f5591a     // Catch:{ Exception -> 0x0200, all -> 0x01f8 }
            r11[r0] = r2     // Catch:{ Exception -> 0x0200, all -> 0x01f8 }
            r11[r6] = r12     // Catch:{ Exception -> 0x0200, all -> 0x01f8 }
            r11 = 46
            int r11 = r10.indexOf(r11)     // Catch:{ Exception -> 0x0200, all -> 0x01f8 }
            if (r5 != r11) goto L_0x01ec
            r11 = r0
        L_0x01ce:
            java.lang.String[] r1 = h.n.g     // Catch:{ Exception -> 0x0200, all -> 0x01f8 }
            if (r11 >= r4) goto L_0x01e5
            r1 = r1[r11]     // Catch:{ Exception -> 0x0200, all -> 0x01f8 }
            android.view.View r1 = r9.f(r2, r10, r1)     // Catch:{ Exception -> 0x0200, all -> 0x01f8 }
            if (r1 == 0) goto L_0x01e2
            java.lang.Object[] r9 = r9.f5591a
            r9[r0] = r3
            r9[r6] = r3
            r3 = r1
            goto L_0x0206
        L_0x01e2:
            int r11 = r11 + 1
            goto L_0x01ce
        L_0x01e5:
            java.lang.Object[] r9 = r9.f5591a
            r9[r0] = r3
            r9[r6] = r3
            goto L_0x0206
        L_0x01ec:
            android.view.View r10 = r9.f(r2, r10, r3)     // Catch:{ Exception -> 0x0200, all -> 0x01f8 }
            java.lang.Object[] r9 = r9.f5591a
            r9[r0] = r3
            r9[r6] = r3
            r3 = r10
            goto L_0x0206
        L_0x01f8:
            r10 = move-exception
            java.lang.Object[] r9 = r9.f5591a
            r9[r0] = r3
            r9[r6] = r3
            throw r10
        L_0x0200:
            java.lang.Object[] r9 = r9.f5591a
            r9[r0] = r3
            r9[r6] = r3
        L_0x0206:
            r1 = r3
        L_0x0207:
            if (r1 == 0) goto L_0x0290
            android.content.Context r9 = r1.getContext()
            boolean r10 = r9 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L_0x0231
            java.util.WeakHashMap<android.view.View, n0.a0> r10 = n0.x.f8842a
            boolean r10 = n0.x.c.a(r1)
            if (r10 != 0) goto L_0x021a
            goto L_0x0231
        L_0x021a:
            int[] r10 = h.n.f5586c
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r12, r10)
            java.lang.String r10 = r9.getString(r0)
            if (r10 == 0) goto L_0x022e
            h.n$a r11 = new h.n$a
            r11.<init>(r1, r10)
            r1.setOnClickListener(r11)
        L_0x022e:
            r9.recycle()
        L_0x0231:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 <= r10) goto L_0x0238
            goto L_0x0290
        L_0x0238:
            int[] r9 = h.n.f5587d
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x0256
            boolean r10 = r9.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, n0.a0> r11 = n0.x.f8842a
            n0.w r11 = new n0.w
            r11.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11.e(r1, r10)
        L_0x0256:
            r9.recycle()
            int[] r9 = h.n.f5588e
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x026c
            java.lang.String r10 = r9.getString(r0)
            n0.x.q(r1, r10)
        L_0x026c:
            r9.recycle()
            int[] r9 = h.n.f5589f
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x028d
            boolean r10 = r9.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, n0.a0> r11 = n0.x.f8842a
            n0.t r11 = new n0.t
            r11.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11.e(r1, r10)
        L_0x028d:
            r9.recycle()
        L_0x0290:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g.f(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final <T extends View> T g(int i10) {
        M();
        return this.f5545t.findViewById(i10);
    }

    public final int h() {
        return this.b0;
    }

    public final MenuInflater i() {
        if (this.f5549x == null) {
            S();
            v vVar = this.f5548w;
            this.f5549x = new m.f(vVar != null ? vVar.c() : this.f5544s);
        }
        return this.f5549x;
    }

    public final a j() {
        S();
        return this.f5548w;
    }

    public final void k() {
        LayoutInflater from = LayoutInflater.from(this.f5544s);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof g)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void l() {
        S();
        T(0);
    }

    public final void m(Configuration configuration) {
        if (this.O && this.I) {
            S();
            v vVar = this.f5548w;
            if (vVar != null) {
                vVar.f(vVar.f5621a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        androidx.appcompat.widget.l a10 = androidx.appcompat.widget.l.a();
        Context context = this.f5544s;
        synchronized (a10) {
            t0 t0Var = a10.f1313a;
            synchronized (t0Var) {
                s.d dVar = t0Var.f1396d.get(context);
                if (dVar != null) {
                    dVar.b();
                }
            }
        }
        this.f5530a0 = new Configuration(this.f5544s.getResources().getConfiguration());
        D(false);
    }

    public final void n(Bundle bundle) {
        this.X = true;
        D(false);
        N();
        Object obj = this.f5531c;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = c0.h.c(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException(e10);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                v vVar = this.f5548w;
                if (vVar == null) {
                    this.f5540k0 = true;
                } else {
                    vVar.e(true);
                }
            }
            f.c(this);
        }
        this.f5530a0 = new Configuration(this.f5544s.getResources().getConfiguration());
        this.Y = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5531c
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            h.f.u(r3)
        L_0x0009:
            boolean r0 = r3.f5537h0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f5545t
            android.view.View r0 = r0.getDecorView()
            h.g$a r1 = r3.f5539j0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.Z = r0
            int r0 = r3.b0
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f5531c
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            s.g<java.lang.String, java.lang.Integer> r0 = f5526o0
            java.lang.Object r1 = r3.f5531c
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.b0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            s.g<java.lang.String, java.lang.Integer> r0 = f5526o0
            java.lang.Object r1 = r3.f5531c
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            h.g$i r0 = r3.f5535f0
            if (r0 == 0) goto L_0x005b
            r0.a()
        L_0x005b:
            h.g$g r0 = r3.f5536g0
            if (r0 == 0) goto L_0x0062
            r0.a()
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g.o():void");
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return f(view, str, context, attributeSet);
    }

    public final void p(Bundle bundle) {
        M();
    }

    public final void q() {
        S();
        v vVar = this.f5548w;
        if (vVar != null) {
            vVar.f5639u = true;
        }
    }

    public final void r(Bundle bundle) {
    }

    public final void s() {
        C();
    }

    public final void t() {
        S();
        v vVar = this.f5548w;
        if (vVar != null) {
            vVar.f5639u = false;
            m.g gVar = vVar.f5638t;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    public final boolean w(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.S && i10 == 108) {
            return false;
        }
        if (this.O && i10 == 1) {
            this.O = false;
        }
        if (i10 == 1) {
            Y();
            this.S = true;
            return true;
        } else if (i10 == 2) {
            Y();
            this.M = true;
            return true;
        } else if (i10 == 5) {
            Y();
            this.N = true;
            return true;
        } else if (i10 == 10) {
            Y();
            this.Q = true;
            return true;
        } else if (i10 == 108) {
            Y();
            this.O = true;
            return true;
        } else if (i10 != 109) {
            return this.f5545t.requestFeature(i10);
        } else {
            Y();
            this.P = true;
            return true;
        }
    }

    public final void x(int i10) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f5544s).inflate(i10, viewGroup);
        this.f5546u.f8361a.onContentChanged();
    }

    public final void y(View view) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f5546u.f8361a.onContentChanged();
    }

    public final void z(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f5546u.f8361a.onContentChanged();
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return f((View) null, str, context, attributeSet);
    }
}
