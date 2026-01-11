package t0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.api.Api;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;
import t0.b;

public abstract class a extends n0.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f11200n = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);

    /* renamed from: o  reason: collision with root package name */
    public static final b.a<o0.b> f11201o = new C0219a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f11202p = new b();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f11203d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f11204e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f11205f = new Rect();
    public final int[] g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f11206h;
    public final View i;

    /* renamed from: j  reason: collision with root package name */
    public c f11207j;

    /* renamed from: k  reason: collision with root package name */
    public int f11208k = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

    /* renamed from: l  reason: collision with root package name */
    public int f11209l = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

    /* renamed from: m  reason: collision with root package name */
    public int f11210m = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

    /* renamed from: t0.a$a  reason: collision with other inner class name */
    public class C0219a implements b.a<o0.b> {
        public final void a(Object obj, Rect rect) {
            ((o0.b) obj).e(rect);
        }
    }

    public class b {
    }

    public class c extends o0.c {
        public c() {
        }

        public final o0.b a(int i) {
            return new o0.b(AccessibilityNodeInfo.obtain(a.this.o(i).f9173a));
        }

        public final o0.b b(int i) {
            int i10 = i == 2 ? a.this.f11208k : a.this.f11209l;
            if (i10 == Integer.MIN_VALUE) {
                return null;
            }
            return new o0.b(AccessibilityNodeInfo.obtain(a.this.o(i10).f9173a));
        }

        public final boolean c(int i, int i10, Bundle bundle) {
            int i11;
            a aVar = a.this;
            if (i != -1) {
                boolean z = true;
                if (i10 == 1) {
                    return aVar.r(i);
                }
                if (i10 == 2) {
                    return aVar.k(i);
                }
                if (i10 == 64) {
                    if (!aVar.f11206h.isEnabled() || !aVar.f11206h.isTouchExplorationEnabled() || (i11 = aVar.f11208k) == i) {
                        z = false;
                    } else {
                        if (i11 != Integer.MIN_VALUE) {
                            aVar.j(i11);
                        }
                        aVar.f11208k = i;
                        aVar.i.invalidate();
                        aVar.s(i, LZ4Constants.HASH_TABLE_SIZE_HC);
                    }
                    return z;
                } else if (i10 != 128) {
                    return aVar.p(i, i10);
                } else {
                    return aVar.j(i);
                }
            } else {
                View view = aVar.i;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                return x.d.j(view, i10, bundle);
            }
        }
    }

    public a(View view) {
        if (view != null) {
            this.i = view;
            this.f11206h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            if (x.d.c(view) == 0) {
                x.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final o0.c b(View view) {
        if (this.f11207j == null) {
            this.f11207j = new c();
        }
        return this.f11207j;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    public final void d(View view, o0.b bVar) {
        this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
        Chip.b bVar2 = (Chip.b) this;
        bVar.m(Chip.this.f());
        bVar.o(Chip.this.isClickable());
        bVar.n(Chip.this.getAccessibilityClassName());
        bVar.z(Chip.this.getText());
    }

    public final boolean j(int i10) {
        if (this.f11208k != i10) {
            return false;
        }
        this.f11208k = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        this.i.invalidate();
        s(i10, LZ4Constants.MAX_DISTANCE);
        return true;
    }

    public final boolean k(int i10) {
        if (this.f11209l != i10) {
            return false;
        }
        this.f11209l = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip = Chip.this;
            chip.B = false;
            chip.refreshDrawableState();
        }
        s(i10, 8);
        return true;
    }

    public final o0.b l(int i10) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        o0.b bVar = new o0.b(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        bVar.n("android.view.View");
        Rect rect = f11200n;
        bVar.l(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.i;
        bVar.f9174b = -1;
        obtain.setParent(view);
        q(i10, bVar);
        if (bVar.i() == null && bVar.g() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        bVar.e(this.f11204e);
        if (!this.f11204e.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(this.i.getContext().getPackageName());
                View view2 = this.i;
                bVar.f9175c = i10;
                obtain.setSource(view2, i10);
                boolean z = false;
                if (this.f11208k == i10) {
                    obtain.setAccessibilityFocused(true);
                    bVar.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    bVar.a(64);
                }
                boolean z10 = this.f11209l == i10;
                if (z10) {
                    bVar.a(2);
                } else if (obtain.isFocusable()) {
                    bVar.a(1);
                }
                obtain.setFocused(z10);
                this.i.getLocationOnScreen(this.g);
                obtain.getBoundsInScreen(this.f11203d);
                if (this.f11203d.equals(rect)) {
                    bVar.e(this.f11203d);
                    if (bVar.f9174b != -1) {
                        o0.b bVar2 = new o0.b(AccessibilityNodeInfo.obtain());
                        for (int i11 = bVar.f9174b; i11 != -1; i11 = bVar2.f9174b) {
                            View view3 = this.i;
                            bVar2.f9174b = -1;
                            bVar2.f9173a.setParent(view3, -1);
                            bVar2.l(f11200n);
                            q(i11, bVar2);
                            bVar2.e(this.f11204e);
                            Rect rect2 = this.f11203d;
                            Rect rect3 = this.f11204e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        bVar2.f9173a.recycle();
                    }
                    this.f11203d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                }
                if (this.i.getLocalVisibleRect(this.f11205f)) {
                    this.f11205f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    if (this.f11203d.intersect(this.f11205f)) {
                        bVar.f9173a.setBoundsInScreen(this.f11203d);
                        Rect rect4 = this.f11203d;
                        if (rect4 != null && !rect4.isEmpty() && this.i.getWindowVisibility() == 0) {
                            ViewParent parent = this.i.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view4 = (View) parent;
                                    if (view4.getAlpha() <= 0.0f || view4.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view4.getParent();
                                } else if (parent != null) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            bVar.f9173a.setVisibleToUser(true);
                        }
                    }
                }
                return bVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void m(List<Integer> list);

    /* JADX WARNING: type inference failed for: r15v1, types: [t0.a$a, t0.b$a<o0.b>] */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013a, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x013c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0146 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.m(r3)
            s.h r4 = new s.h
            r4.<init>()
            r5 = 0
            r6 = r5
        L_0x0015:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0039
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            o0.b r7 = r0.l(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.g(r8, r7)
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0039:
            int r3 = r0.f11209l
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            if (r3 != r6) goto L_0x0042
            r3 = r7
            goto L_0x0048
        L_0x0042:
            java.lang.Object r3 = r4.c(r3, r7)
            o0.b r3 = (o0.b) r3
        L_0x0048:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L_0x014d
            if (r1 == r8) goto L_0x014d
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0068
            if (r1 == r12) goto L_0x0068
            if (r1 == r11) goto L_0x0068
            if (r1 != r8) goto L_0x0060
            goto L_0x0068
        L_0x0060:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0068:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.f11209l
            java.lang.String r7 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r6) goto L_0x007b
            o0.b r2 = r0.o(r15)
            r2.e(r14)
            goto L_0x00a8
        L_0x007b:
            if (r2 == 0) goto L_0x0081
            r14.set(r2)
            goto L_0x00a8
        L_0x0081:
            android.view.View r2 = r0.i
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x00a5
            if (r1 == r12) goto L_0x00a1
            if (r1 == r11) goto L_0x009d
            if (r1 != r8) goto L_0x0097
            r14.set(r5, r9, r15, r9)
            goto L_0x00a8
        L_0x0097:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x009d:
            r14.set(r9, r5, r9, r2)
            goto L_0x00a8
        L_0x00a1:
            r14.set(r5, r2, r15, r2)
            goto L_0x00a8
        L_0x00a5:
            r14.set(r15, r5, r15, r2)
        L_0x00a8:
            t0.a$b r2 = f11202p
            t0.b$a<o0.b> r15 = f11201o
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r14)
            if (r1 == r13) goto L_0x00dc
            if (r1 == r12) goto L_0x00d3
            if (r1 == r11) goto L_0x00c9
            if (r1 != r8) goto L_0x00c3
            int r7 = r14.height()
            int r7 = r7 + r10
            int r7 = -r7
            r6.offset(r5, r7)
            goto L_0x00e4
        L_0x00c3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x00c9:
            int r7 = r14.width()
            int r7 = r7 + r10
            int r7 = -r7
            r6.offset(r7, r5)
            goto L_0x00e4
        L_0x00d3:
            int r7 = r14.height()
            int r7 = r7 + r10
            r6.offset(r5, r7)
            goto L_0x00e4
        L_0x00dc:
            int r7 = r14.width()
            int r7 = r7 + r10
            r6.offset(r7, r5)
        L_0x00e4:
            java.util.Objects.requireNonNull(r2)
            int r2 = r4.f10847c
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r8 = r5
            r16 = 0
        L_0x00f1:
            if (r8 >= r2) goto L_0x0149
            java.lang.Object[] r11 = r4.f10846b
            r11 = r11[r8]
            o0.b r11 = (o0.b) r11
            if (r11 != r3) goto L_0x00fc
            goto L_0x0146
        L_0x00fc:
            r15.a(r11, r7)
            boolean r12 = t0.b.c(r14, r7, r1)
            if (r12 != 0) goto L_0x0106
            goto L_0x013e
        L_0x0106:
            boolean r12 = t0.b.c(r14, r6, r1)
            if (r12 != 0) goto L_0x010d
            goto L_0x013c
        L_0x010d:
            boolean r12 = t0.b.a(r1, r14, r7, r6)
            if (r12 == 0) goto L_0x0114
            goto L_0x013c
        L_0x0114:
            boolean r12 = t0.b.a(r1, r14, r6, r7)
            if (r12 == 0) goto L_0x011b
            goto L_0x013e
        L_0x011b:
            int r12 = t0.b.d(r1, r14, r7)
            int r13 = t0.b.e(r1, r14, r7)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = t0.b.d(r1, r14, r6)
            int r17 = t0.b.e(r1, r14, r6)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L_0x013e
        L_0x013c:
            r12 = r10
            goto L_0x013f
        L_0x013e:
            r12 = r5
        L_0x013f:
            if (r12 == 0) goto L_0x0146
            r6.set(r7)
            r16 = r11
        L_0x0146:
            int r8 = r8 + 1
            goto L_0x00f1
        L_0x0149:
            r1 = r16
            goto L_0x01b8
        L_0x014d:
            android.view.View r2 = r0.i
            java.util.WeakHashMap<android.view.View, n0.a0> r6 = n0.x.f8842a
            int r2 = n0.x.e.d(r2)
            if (r2 != r10) goto L_0x0159
            r2 = r10
            goto L_0x015a
        L_0x0159:
            r2 = r5
        L_0x015a:
            t0.a$b r6 = f11202p
            t0.b$a<o0.b> r7 = f11201o
            java.util.Objects.requireNonNull(r6)
            int r6 = r4.f10847c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r12 = r5
        L_0x0169:
            if (r12 >= r6) goto L_0x0177
            java.lang.Object[] r13 = r4.f10846b
            r13 = r13[r12]
            o0.b r13 = (o0.b) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x0169
        L_0x0177:
            t0.b$b r6 = new t0.b$b
            r6.<init>(r2, r7)
            java.util.Collections.sort(r11, r6)
            if (r1 == r10) goto L_0x019f
            if (r1 != r8) goto L_0x0197
            int r1 = r11.size()
            if (r3 != 0) goto L_0x018b
            r2 = r9
            goto L_0x018f
        L_0x018b:
            int r2 = r11.lastIndexOf(r3)
        L_0x018f:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x01b2
            java.lang.Object r7 = r11.get(r2)
            goto L_0x01b3
        L_0x0197:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x019f:
            int r1 = r11.size()
            if (r3 != 0) goto L_0x01a6
            goto L_0x01aa
        L_0x01a6:
            int r1 = r11.indexOf(r3)
        L_0x01aa:
            int r1 = r1 + r9
            if (r1 < 0) goto L_0x01b2
            java.lang.Object r7 = r11.get(r1)
            goto L_0x01b3
        L_0x01b2:
            r7 = 0
        L_0x01b3:
            r16 = r7
            o0.b r16 = (o0.b) r16
            goto L_0x0149
        L_0x01b8:
            if (r1 != 0) goto L_0x01bd
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01d0
        L_0x01bd:
            int r2 = r4.f10847c
            if (r5 >= r2) goto L_0x01cc
            java.lang.Object[] r2 = r4.f10846b
            r2 = r2[r5]
            if (r2 != r1) goto L_0x01c9
            r9 = r5
            goto L_0x01cc
        L_0x01c9:
            int r5 = r5 + 1
            goto L_0x01bd
        L_0x01cc:
            int[] r1 = r4.f10845a
            r6 = r1[r9]
        L_0x01d0:
            boolean r1 = r0.r(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.a.n(int, android.graphics.Rect):boolean");
    }

    public final o0.b o(int i10) {
        if (i10 != -1) {
            return l(i10);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.i);
        o0.b bVar = new o0.b(obtain);
        View view = this.i;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        m(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                bVar.f9173a.addChild(this.i, ((Integer) arrayList.get(i11)).intValue());
            }
            return bVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract boolean p(int i10, int i11);

    public abstract void q(int i10, o0.b bVar);

    public final boolean r(int i10) {
        int i11;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i11 = this.f11209l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            k(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f11209l = i10;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip = Chip.this;
            chip.B = true;
            chip.refreshDrawableState();
        }
        s(i10, 8);
        return true;
    }

    public final boolean s(int i10, int i11) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i10 == Integer.MIN_VALUE || !this.f11206h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        if (i10 != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i11);
            o0.b o4 = o(i10);
            accessibilityEvent.getText().add(o4.i());
            accessibilityEvent.setContentDescription(o4.g());
            accessibilityEvent.setScrollable(o4.f9173a.isScrollable());
            accessibilityEvent.setPassword(o4.f9173a.isPassword());
            accessibilityEvent.setEnabled(o4.f9173a.isEnabled());
            accessibilityEvent.setChecked(o4.f9173a.isChecked());
            if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                accessibilityEvent.setClassName(o4.f9173a.getClassName());
                accessibilityEvent.setSource(this.i, i10);
                accessibilityEvent.setPackageName(this.i.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i11);
            this.i.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return parent.requestSendAccessibilityEvent(this.i, accessibilityEvent);
    }
}
