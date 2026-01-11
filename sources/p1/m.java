package p1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static a f9543a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<s.a<ViewGroup, ArrayList<i>>>> f9544b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f9545c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public i f9546a;

        /* renamed from: b  reason: collision with root package name */
        public ViewGroup f9547b;

        /* renamed from: p1.m$a$a  reason: collision with other inner class name */
        public class C0187a extends l {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ s.a f9548a;

            public C0187a(s.a aVar) {
                this.f9548a = aVar;
            }

            public final void a(i iVar) {
                ((ArrayList) this.f9548a.getOrDefault(a.this.f9547b, null)).remove(iVar);
                iVar.z(this);
            }
        }

        public a(i iVar, ViewGroup viewGroup) {
            this.f9546a = iVar;
            this.f9547b = viewGroup;
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x023d  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01eb A[EDGE_INSN: B:139:0x01eb->B:87:0x01eb ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01f0  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0211  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreDraw() {
            /*
                r19 = this;
                r0 = r19
                android.view.ViewGroup r1 = r0.f9547b
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f9547b
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = p1.m.f9545c
                android.view.ViewGroup r2 = r0.f9547b
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                s.a r1 = p1.m.b()
                android.view.ViewGroup r3 = r0.f9547b
                r4 = 0
                java.lang.Object r3 = r1.getOrDefault(r3, r4)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f9547b
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                p1.i r6 = r0.f9546a
                r3.add(r6)
                p1.i r3 = r0.f9546a
                p1.m$a$a r6 = new p1.m$a$a
                r6.<init>(r1)
                r3.a(r6)
                p1.i r1 = r0.f9546a
                android.view.ViewGroup r3 = r0.f9547b
                r6 = 0
                r1.j(r3, r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                p1.i r3 = (p1.i) r3
                android.view.ViewGroup r5 = r0.f9547b
                r3.B(r5)
                goto L_0x0060
            L_0x0072:
                p1.i r1 = r0.f9546a
                android.view.ViewGroup r8 = r0.f9547b
                java.util.Objects.requireNonNull(r1)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.z = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.A = r3
                p1.q r3 = r1.f9531v
                p1.q r5 = r1.f9532w
                s.a r7 = new s.a
                s.a<android.view.View, p1.p> r9 = r3.f9558a
                r7.<init>((s.g) r9)
                s.a r9 = new s.a
                s.a<android.view.View, p1.p> r10 = r5.f9558a
                r9.<init>((s.g) r10)
                r10 = r6
            L_0x009a:
                int[] r11 = r1.f9534y
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01eb
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01ab
                r12 = 2
                if (r11 == r12) goto L_0x015d
                r12 = 3
                if (r11 == r12) goto L_0x0109
                r12 = 4
                if (r11 == r12) goto L_0x00af
            L_0x00ac:
                r2 = r3
                goto L_0x01e1
            L_0x00af:
                s.d<android.view.View> r11 = r3.f9560c
                s.d<android.view.View> r12 = r5.f9560c
                int r13 = r11.j()
                r14 = r6
            L_0x00b8:
                if (r14 >= r13) goto L_0x00ac
                java.lang.Object r15 = r11.k(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x00ff
                boolean r16 = r1.w(r15)
                if (r16 == 0) goto L_0x00ff
                r17 = r3
                long r2 = r11.h(r14)
                java.lang.Object r2 = r12.g(r2, r4)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x0101
                boolean r3 = r1.w(r2)
                if (r3 == 0) goto L_0x0101
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                p1.p r3 = (p1.p) r3
                java.lang.Object r18 = r9.getOrDefault(r2, r4)
                r6 = r18
                p1.p r6 = (p1.p) r6
                if (r3 == 0) goto L_0x0101
                if (r6 == 0) goto L_0x0101
                java.util.ArrayList<p1.p> r4 = r1.z
                r4.add(r3)
                java.util.ArrayList<p1.p> r3 = r1.A
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x0101
            L_0x00ff:
                r17 = r3
            L_0x0101:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00b8
            L_0x0109:
                r2 = r3
                android.util.SparseArray<android.view.View> r3 = r2.f9559b
                android.util.SparseArray<android.view.View> r4 = r5.f9559b
                int r6 = r3.size()
                r11 = 0
            L_0x0113:
                if (r11 >= r6) goto L_0x01e1
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x0158
                boolean r13 = r1.w(r12)
                if (r13 == 0) goto L_0x0158
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x0158
                boolean r14 = r1.w(r13)
                if (r14 == 0) goto L_0x0158
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                p1.p r15 = (p1.p) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                p1.p r14 = (p1.p) r14
                if (r15 == 0) goto L_0x0158
                if (r14 == 0) goto L_0x0158
                java.util.ArrayList<p1.p> r0 = r1.z
                r0.add(r15)
                java.util.ArrayList<p1.p> r0 = r1.A
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x0158:
                int r11 = r11 + 1
                r0 = r19
                goto L_0x0113
            L_0x015d:
                r2 = r3
                s.a<java.lang.String, android.view.View> r0 = r2.f9561d
                s.a<java.lang.String, android.view.View> r3 = r5.f9561d
                int r4 = r0.f10843c
                r6 = 0
            L_0x0165:
                if (r6 >= r4) goto L_0x01e1
                java.lang.Object r11 = r0.m(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01a8
                boolean r12 = r1.w(r11)
                if (r12 == 0) goto L_0x01a8
                java.lang.Object r12 = r0.i(r6)
                r13 = 0
                java.lang.Object r12 = r3.getOrDefault(r12, r13)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01a8
                boolean r14 = r1.w(r12)
                if (r14 == 0) goto L_0x01a8
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                p1.p r14 = (p1.p) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                p1.p r15 = (p1.p) r15
                if (r14 == 0) goto L_0x01a8
                if (r15 == 0) goto L_0x01a8
                java.util.ArrayList<p1.p> r13 = r1.z
                r13.add(r14)
                java.util.ArrayList<p1.p> r13 = r1.A
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01a8:
                int r6 = r6 + 1
                goto L_0x0165
            L_0x01ab:
                r2 = r3
                int r0 = r7.f10843c
            L_0x01ae:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01e1
                java.lang.Object r3 = r7.i(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01ae
                boolean r4 = r1.w(r3)
                if (r4 == 0) goto L_0x01ae
                java.lang.Object r3 = r9.remove(r3)
                p1.p r3 = (p1.p) r3
                if (r3 == 0) goto L_0x01ae
                android.view.View r4 = r3.f9556b
                boolean r4 = r1.w(r4)
                if (r4 == 0) goto L_0x01ae
                java.lang.Object r4 = r7.k(r0)
                p1.p r4 = (p1.p) r4
                java.util.ArrayList<p1.p> r6 = r1.z
                r6.add(r4)
                java.util.ArrayList<p1.p> r4 = r1.A
                r4.add(r3)
                goto L_0x01ae
            L_0x01e1:
                int r10 = r10 + 1
                r0 = r19
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x009a
            L_0x01eb:
                r0 = 0
            L_0x01ec:
                int r2 = r7.f10843c
                if (r0 >= r2) goto L_0x020c
                java.lang.Object r2 = r7.m(r0)
                p1.p r2 = (p1.p) r2
                android.view.View r3 = r2.f9556b
                boolean r3 = r1.w(r3)
                if (r3 == 0) goto L_0x0209
                java.util.ArrayList<p1.p> r3 = r1.z
                r3.add(r2)
                java.util.ArrayList<p1.p> r2 = r1.A
                r3 = 0
                r2.add(r3)
            L_0x0209:
                int r0 = r0 + 1
                goto L_0x01ec
            L_0x020c:
                r0 = 0
            L_0x020d:
                int r2 = r9.f10843c
                if (r0 >= r2) goto L_0x022d
                java.lang.Object r2 = r9.m(r0)
                p1.p r2 = (p1.p) r2
                android.view.View r3 = r2.f9556b
                boolean r3 = r1.w(r3)
                if (r3 == 0) goto L_0x022a
                java.util.ArrayList<p1.p> r3 = r1.A
                r3.add(r2)
                java.util.ArrayList<p1.p> r2 = r1.z
                r3 = 0
                r2.add(r3)
            L_0x022a:
                int r0 = r0 + 1
                goto L_0x020d
            L_0x022d:
                s.a r0 = p1.i.q()
                int r2 = r0.f10843c
                p1.x r3 = p1.t.f9564a
                android.view.WindowId r3 = r8.getWindowId()
                r4 = 1
                int r2 = r2 - r4
            L_0x023b:
                if (r2 < 0) goto L_0x02b0
                java.lang.Object r4 = r0.i(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                if (r4 == 0) goto L_0x02ac
                r5 = 0
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                p1.i$b r6 = (p1.i.b) r6
                if (r6 == 0) goto L_0x02ac
                android.view.View r5 = r6.f9535a
                if (r5 == 0) goto L_0x02ac
                p1.c0 r5 = r6.f9538d
                boolean r7 = r5 instanceof p1.b0
                if (r7 == 0) goto L_0x0264
                p1.b0 r5 = (p1.b0) r5
                android.view.WindowId r5 = r5.f9510a
                boolean r5 = r5.equals(r3)
                if (r5 == 0) goto L_0x0264
                r5 = 1
                goto L_0x0265
            L_0x0264:
                r5 = 0
            L_0x0265:
                if (r5 == 0) goto L_0x02ac
                p1.p r5 = r6.f9537c
                android.view.View r7 = r6.f9535a
                r9 = 1
                p1.p r10 = r1.u(r7, r9)
                p1.p r11 = r1.p(r7, r9)
                if (r10 != 0) goto L_0x0285
                if (r11 != 0) goto L_0x0285
                p1.q r9 = r1.f9532w
                s.a<android.view.View, p1.p> r9 = r9.f9558a
                r12 = 0
                java.lang.Object r7 = r9.getOrDefault(r7, r12)
                r11 = r7
                p1.p r11 = (p1.p) r11
                goto L_0x0286
            L_0x0285:
                r12 = 0
            L_0x0286:
                if (r10 != 0) goto L_0x028a
                if (r11 == 0) goto L_0x0294
            L_0x028a:
                p1.i r6 = r6.f9539e
                boolean r5 = r6.v(r5, r11)
                if (r5 == 0) goto L_0x0294
                r5 = 1
                goto L_0x0295
            L_0x0294:
                r5 = 0
            L_0x0295:
                if (r5 == 0) goto L_0x02ad
                boolean r5 = r4.isRunning()
                if (r5 != 0) goto L_0x02a8
                boolean r5 = r4.isStarted()
                if (r5 == 0) goto L_0x02a4
                goto L_0x02a8
            L_0x02a4:
                r0.remove(r4)
                goto L_0x02ad
            L_0x02a8:
                r4.cancel()
                goto L_0x02ad
            L_0x02ac:
                r12 = 0
            L_0x02ad:
                int r2 = r2 + -1
                goto L_0x023b
            L_0x02b0:
                p1.q r9 = r1.f9531v
                p1.q r10 = r1.f9532w
                java.util.ArrayList<p1.p> r11 = r1.z
                java.util.ArrayList<p1.p> r12 = r1.A
                r7 = r1
                r7.n(r8, r9, r10, r11, r12)
                r1.C()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.m.a.onPreDraw():boolean");
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f9547b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f9547b.removeOnAttachStateChangeListener(this);
            m.f9545c.remove(this.f9547b);
            ArrayList orDefault = m.b().getOrDefault(this.f9547b, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator it = orDefault.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).B(this.f9547b);
                }
            }
            this.f9546a.k(true);
        }
    }

    public static void a(ViewGroup viewGroup, i iVar) {
        if (!f9545c.contains(viewGroup)) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            if (x.g.c(viewGroup)) {
                f9545c.add(viewGroup);
                if (iVar == null) {
                    iVar = f9543a;
                }
                i l10 = iVar.clone();
                ArrayList orDefault = b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator it = orDefault.iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).y(viewGroup);
                    }
                }
                if (l10 != null) {
                    l10.j(viewGroup, true);
                }
                if (((h) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                    if (l10 != null) {
                        a aVar = new a(l10, viewGroup);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public static s.a<ViewGroup, ArrayList<i>> b() {
        s.a<ViewGroup, ArrayList<i>> aVar;
        WeakReference weakReference = f9544b.get();
        if (weakReference != null && (aVar = (s.a) weakReference.get()) != null) {
            return aVar;
        }
        s.a<ViewGroup, ArrayList<i>> aVar2 = new s.a<>();
        f9544b.set(new WeakReference(aVar2));
        return aVar2;
    }
}
