package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.r0;
import androidx.fragment.app.s;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import s.f;

public final class d extends r0 {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1859a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.r0$e$c[] r0 = androidx.fragment.app.r0.e.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1859a = r0
                androidx.fragment.app.r0$e$c r1 = androidx.fragment.app.r0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1859a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.r0$e$c r1 = androidx.fragment.app.r0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1859a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.r0$e$c r1 = androidx.fragment.app.r0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1859a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.r0$e$c r1 = androidx.fragment.app.r0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.a.<clinit>():void");
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f1860a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ r0.e f1861b;

        public b(List list, r0.e eVar) {
            this.f1860a = list;
            this.f1861b = eVar;
        }

        public final void run() {
            if (this.f1860a.contains(this.f1861b)) {
                this.f1860a.remove(this.f1861b);
                d dVar = d.this;
                r0.e eVar = this.f1861b;
                Objects.requireNonNull(dVar);
                eVar.f1993a.applyState(eVar.f1995c.mView);
            }
        }
    }

    public static class c extends C0015d {

        /* renamed from: c  reason: collision with root package name */
        public boolean f1863c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1864d = false;

        /* renamed from: e  reason: collision with root package name */
        public s.a f1865e;

        public c(r0.e eVar, j0.b bVar, boolean z) {
            super(eVar, bVar);
            this.f1863c = z;
        }

        public final s.a c(Context context) {
            int i;
            int i10;
            if (this.f1864d) {
                return this.f1865e;
            }
            r0.e eVar = this.f1866a;
            Fragment fragment = eVar.f1995c;
            boolean z = false;
            boolean z10 = eVar.f1993a == r0.e.c.VISIBLE;
            boolean z11 = this.f1863c;
            int nextTransition = fragment.getNextTransition();
            if (z11) {
                if (z10) {
                    i = fragment.getPopEnterAnim();
                } else {
                    i = fragment.getPopExitAnim();
                }
            } else if (z10) {
                i = fragment.getEnterAnim();
            } else {
                i = fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            s.a aVar = null;
            if (!(viewGroup == null || viewGroup.getTag(R.id.visible_removing_fragment_view_tag) == null)) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, (Object) null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, i);
                if (onCreateAnimation != null) {
                    aVar = new s.a(onCreateAnimation);
                } else {
                    Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, i);
                    if (onCreateAnimator != null) {
                        aVar = new s.a(onCreateAnimator);
                    } else {
                        if (i == 0 && nextTransition != 0) {
                            if (nextTransition != 4097) {
                                i10 = nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z10 ? s.a(context, 16842936) : s.a(context, 16842937) : z10 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z10 ? s.a(context, 16842938) : s.a(context, 16842939) : z10 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                            } else {
                                i10 = z10 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                            }
                            i = i10;
                        }
                        if (i != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
                            if (equals) {
                                try {
                                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
                                    if (loadAnimation != null) {
                                        aVar = new s.a(loadAnimation);
                                    } else {
                                        z = true;
                                    }
                                } catch (Resources.NotFoundException e10) {
                                    throw e10;
                                } catch (RuntimeException unused) {
                                }
                            }
                            if (!z) {
                                try {
                                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                                    if (loadAnimator != null) {
                                        aVar = new s.a(loadAnimator);
                                    }
                                } catch (RuntimeException e11) {
                                    if (!equals) {
                                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                                        if (loadAnimation2 != null) {
                                            aVar = new s.a(loadAnimation2);
                                        }
                                    } else {
                                        throw e11;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.f1865e = aVar;
            this.f1864d = true;
            return aVar;
        }
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    public static class C0015d {

        /* renamed from: a  reason: collision with root package name */
        public final r0.e f1866a;

        /* renamed from: b  reason: collision with root package name */
        public final j0.b f1867b;

        public C0015d(r0.e eVar, j0.b bVar) {
            this.f1866a = eVar;
            this.f1867b = bVar;
        }

        public final void a() {
            r0.e eVar = this.f1866a;
            if (eVar.f1997e.remove(this.f1867b) && eVar.f1997e.isEmpty()) {
                eVar.c();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r2 = androidx.fragment.app.r0.e.c.VISIBLE;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b() {
            /*
                r3 = this;
                androidx.fragment.app.r0$e r0 = r3.f1866a
                androidx.fragment.app.Fragment r0 = r0.f1995c
                android.view.View r0 = r0.mView
                androidx.fragment.app.r0$e$c r0 = androidx.fragment.app.r0.e.c.from((android.view.View) r0)
                androidx.fragment.app.r0$e r1 = r3.f1866a
                androidx.fragment.app.r0$e$c r1 = r1.f1993a
                if (r0 == r1) goto L_0x0019
                androidx.fragment.app.r0$e$c r2 = androidx.fragment.app.r0.e.c.VISIBLE
                if (r0 == r2) goto L_0x0017
                if (r1 == r2) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r0 = 0
                goto L_0x001a
            L_0x0019:
                r0 = 1
            L_0x001a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.C0015d.b():boolean");
        }
    }

    public static class e extends C0015d {

        /* renamed from: c  reason: collision with root package name */
        public final Object f1868c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1869d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f1870e;

        public e(r0.e eVar, j0.b bVar, boolean z, boolean z10) {
            super(eVar, bVar);
            Object obj;
            Object obj2;
            boolean z11;
            if (eVar.f1993a == r0.e.c.VISIBLE) {
                if (z) {
                    obj2 = eVar.f1995c.getReenterTransition();
                } else {
                    obj2 = eVar.f1995c.getEnterTransition();
                }
                this.f1868c = obj2;
                if (z) {
                    z11 = eVar.f1995c.getAllowReturnTransitionOverlap();
                } else {
                    z11 = eVar.f1995c.getAllowEnterTransitionOverlap();
                }
                this.f1869d = z11;
            } else {
                if (z) {
                    obj = eVar.f1995c.getReturnTransition();
                } else {
                    obj = eVar.f1995c.getExitTransition();
                }
                this.f1868c = obj;
                this.f1869d = true;
            }
            if (!z10) {
                this.f1870e = null;
            } else if (z) {
                this.f1870e = eVar.f1995c.getSharedElementReturnTransition();
            } else {
                this.f1870e = eVar.f1995c.getSharedElementEnterTransition();
            }
        }

        public final o0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            k0 k0Var = j0.f1942a;
            if (obj instanceof Transition) {
                return k0Var;
            }
            o0 o0Var = j0.f1943b;
            if (o0Var != null && o0Var.e(obj)) {
                return o0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1866a.f1995c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x06e9  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x07c0  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0876 A[LOOP:19: B:264:0x0870->B:266:0x0876, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0890  */
    /* JADX WARNING: Removed duplicated region for block: B:331:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.List<androidx.fragment.app.r0.e> r34, boolean r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r4 = r3.iterator()
            r5 = 0
            r6 = 0
        L_0x000f:
            boolean r7 = r4.hasNext()
            r8 = 4
            r9 = 2
            r10 = 1
            if (r7 == 0) goto L_0x0048
            java.lang.Object r7 = r4.next()
            androidx.fragment.app.r0$e r7 = (androidx.fragment.app.r0.e) r7
            androidx.fragment.app.Fragment r11 = r7.f1995c
            android.view.View r11 = r11.mView
            androidx.fragment.app.r0$e$c r11 = androidx.fragment.app.r0.e.c.from((android.view.View) r11)
            int[] r12 = androidx.fragment.app.d.a.f1859a
            androidx.fragment.app.r0$e$c r13 = r7.f1993a
            int r13 = r13.ordinal()
            r12 = r12[r13]
            if (r12 == r10) goto L_0x0040
            if (r12 == r9) goto L_0x0040
            r9 = 3
            if (r12 == r9) goto L_0x0040
            if (r12 == r8) goto L_0x003a
            goto L_0x000f
        L_0x003a:
            androidx.fragment.app.r0$e$c r8 = androidx.fragment.app.r0.e.c.VISIBLE
            if (r11 == r8) goto L_0x000f
            r6 = r7
            goto L_0x000f
        L_0x0040:
            androidx.fragment.app.r0$e$c r8 = androidx.fragment.app.r0.e.c.VISIBLE
            if (r11 != r8) goto L_0x000f
            if (r5 != 0) goto L_0x000f
            r5 = r7
            goto L_0x000f
        L_0x0048:
            boolean r4 = androidx.fragment.app.a0.K(r9)
            java.lang.String r7 = " to "
            java.lang.String r8 = "FragmentManager"
            if (r4 == 0) goto L_0x006c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "Executing operations from "
            r4.append(r9)
            r4.append(r5)
            r4.append(r7)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r8, r4)
        L_0x006c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L_0x007f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00c8
            java.lang.Object r3 = r1.next()
            androidx.fragment.app.r0$e r3 = (androidx.fragment.app.r0.e) r3
            j0.b r11 = new j0.b
            r11.<init>()
            r3.e()
            java.util.HashSet<j0.b> r12 = r3.f1997e
            r12.add(r11)
            androidx.fragment.app.d$c r12 = new androidx.fragment.app.d$c
            r12.<init>(r3, r11, r2)
            r4.add(r12)
            j0.b r11 = new j0.b
            r11.<init>()
            r3.e()
            java.util.HashSet<j0.b> r12 = r3.f1997e
            r12.add(r11)
            androidx.fragment.app.d$e r12 = new androidx.fragment.app.d$e
            if (r2 == 0) goto L_0x00b4
            if (r3 != r5) goto L_0x00b8
            goto L_0x00b6
        L_0x00b4:
            if (r3 != r6) goto L_0x00b8
        L_0x00b6:
            r13 = 1
            goto L_0x00b9
        L_0x00b8:
            r13 = 0
        L_0x00b9:
            r12.<init>(r3, r11, r2, r13)
            r9.add(r12)
            androidx.fragment.app.d$b r11 = new androidx.fragment.app.d$b
            r11.<init>(r10, r3)
            r3.a(r11)
            goto L_0x007f
        L_0x00c8:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r3 = r9.iterator()
            r11 = 0
        L_0x00d2:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L_0x0152
            java.lang.Object r12 = r3.next()
            androidx.fragment.app.d$e r12 = (androidx.fragment.app.d.e) r12
            boolean r13 = r12.b()
            if (r13 == 0) goto L_0x00e5
            goto L_0x00d2
        L_0x00e5:
            java.lang.Object r13 = r12.f1868c
            androidx.fragment.app.o0 r13 = r12.c(r13)
            java.lang.Object r14 = r12.f1870e
            androidx.fragment.app.o0 r14 = r12.c(r14)
            java.lang.String r15 = " returned Transition "
            java.lang.String r16 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            if (r13 == 0) goto L_0x0123
            if (r14 == 0) goto L_0x0123
            if (r13 != r14) goto L_0x00fc
            goto L_0x0123
        L_0x00fc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = a.a.d(r16)
            androidx.fragment.app.r0$e r3 = r12.f1866a
            androidx.fragment.app.Fragment r3 = r3.f1995c
            r2.append(r3)
            r2.append(r15)
            java.lang.Object r3 = r12.f1868c
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than its shared element transition "
            r2.append(r3)
            java.lang.Object r3 = r12.f1870e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0123:
            if (r13 == 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            r13 = r14
        L_0x0127:
            if (r11 != 0) goto L_0x012b
            r11 = r13
            goto L_0x00d2
        L_0x012b:
            if (r13 == 0) goto L_0x00d2
            if (r11 != r13) goto L_0x0130
            goto L_0x00d2
        L_0x0130:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = a.a.d(r16)
            androidx.fragment.app.r0$e r3 = r12.f1866a
            androidx.fragment.app.Fragment r3 = r3.f1995c
            r2.append(r3)
            r2.append(r15)
            java.lang.Object r3 = r12.f1868c
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than other Fragments."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0152:
            if (r11 != 0) goto L_0x0176
            java.util.Iterator r2 = r9.iterator()
        L_0x0158:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x016f
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.d$e r3 = (androidx.fragment.app.d.e) r3
            androidx.fragment.app.r0$e r9 = r3.f1866a
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r1.put(r9, r11)
            r3.a()
            goto L_0x0158
        L_0x016f:
            r23 = r4
            r22 = r7
            r12 = r10
            goto L_0x058f
        L_0x0176:
            android.view.View r3 = new android.view.View
            android.view.ViewGroup r12 = r0.f1981a
            android.content.Context r12 = r12.getContext()
            r3.<init>(r12)
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            s.a r12 = new s.a
            r12.<init>()
            java.util.Iterator r18 = r9.iterator()
            r16 = 0
            r17 = 0
            r19 = 0
            r23 = r4
            r4 = r5
            r22 = r7
            r24 = r10
            r7 = r16
            r20 = r17
            r10 = r6
        L_0x01ab:
            boolean r16 = r18.hasNext()
            if (r16 == 0) goto L_0x03c5
            java.lang.Object r16 = r18.next()
            r34 = r7
            r7 = r16
            androidx.fragment.app.d$e r7 = (androidx.fragment.app.d.e) r7
            java.lang.Object r7 = r7.f1870e
            if (r7 == 0) goto L_0x01c2
            r16 = 1
            goto L_0x01c4
        L_0x01c2:
            r16 = 0
        L_0x01c4:
            if (r16 == 0) goto L_0x03a6
            if (r4 == 0) goto L_0x03a6
            if (r10 == 0) goto L_0x03a6
            java.lang.Object r7 = r11.f(r7)
            java.lang.Object r7 = r11.r(r7)
            r21 = r9
            androidx.fragment.app.Fragment r9 = r10.f1995c
            java.util.ArrayList r9 = r9.getSharedElementSourceNames()
            r25 = r1
            androidx.fragment.app.Fragment r1 = r4.f1995c
            java.util.ArrayList r1 = r1.getSharedElementSourceNames()
            r26 = r3
            androidx.fragment.app.Fragment r3 = r4.f1995c
            java.util.ArrayList r3 = r3.getSharedElementTargetNames()
            r16 = 0
            r34 = r7
            r17 = r15
            r15 = r16
        L_0x01f2:
            int r7 = r3.size()
            r27 = r11
            r11 = -1
            if (r15 >= r7) goto L_0x0213
            java.lang.Object r7 = r3.get(r15)
            int r7 = r9.indexOf(r7)
            if (r7 == r11) goto L_0x020e
            java.lang.Object r11 = r1.get(r15)
            java.lang.String r11 = (java.lang.String) r11
            r9.set(r7, r11)
        L_0x020e:
            int r15 = r15 + 1
            r11 = r27
            goto L_0x01f2
        L_0x0213:
            androidx.fragment.app.Fragment r1 = r10.f1995c
            java.util.ArrayList r1 = r1.getSharedElementTargetNames()
            if (r2 != 0) goto L_0x0226
            androidx.fragment.app.Fragment r3 = r4.f1995c
            r3.getExitTransitionCallback()
            androidx.fragment.app.Fragment r3 = r10.f1995c
            r3.getEnterTransitionCallback()
            goto L_0x0230
        L_0x0226:
            androidx.fragment.app.Fragment r3 = r4.f1995c
            r3.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r3 = r10.f1995c
            r3.getExitTransitionCallback()
        L_0x0230:
            int r3 = r9.size()
            r7 = 0
        L_0x0235:
            if (r7 >= r3) goto L_0x0249
            java.lang.Object r11 = r9.get(r7)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r15 = r1.get(r7)
            java.lang.String r15 = (java.lang.String) r15
            r12.put(r11, r15)
            int r7 = r7 + 1
            goto L_0x0235
        L_0x0249:
            r3 = 2
            boolean r3 = androidx.fragment.app.a0.K(r3)
            if (r3 == 0) goto L_0x02a2
            java.lang.String r3 = ">>> entering view names <<<"
            android.util.Log.v(r8, r3)
            java.util.Iterator r3 = r1.iterator()
        L_0x0259:
            boolean r7 = r3.hasNext()
            java.lang.String r11 = "Name: "
            if (r7 == 0) goto L_0x027a
            java.lang.Object r7 = r3.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            r15.append(r7)
            java.lang.String r7 = r15.toString()
            android.util.Log.v(r8, r7)
            goto L_0x0259
        L_0x027a:
            java.lang.String r3 = ">>> exiting view names <<<"
            android.util.Log.v(r8, r3)
            java.util.Iterator r3 = r9.iterator()
        L_0x0283:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x02a2
            java.lang.Object r7 = r3.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            r15.append(r7)
            java.lang.String r7 = r15.toString()
            android.util.Log.v(r8, r7)
            goto L_0x0283
        L_0x02a2:
            s.a r3 = new s.a
            r3.<init>()
            androidx.fragment.app.Fragment r7 = r4.f1995c
            android.view.View r7 = r7.mView
            r0.k(r3, r7)
            s.f.k(r3, r9)
            java.util.Set r7 = r3.keySet()
            s.f.k(r12, r7)
            s.a r7 = new s.a
            r7.<init>()
            androidx.fragment.app.Fragment r11 = r10.f1995c
            android.view.View r11 = r11.mView
            r0.k(r7, r11)
            s.f.k(r7, r1)
            java.util.Collection r11 = r12.values()
            s.f.k(r7, r11)
            androidx.fragment.app.k0 r11 = androidx.fragment.app.j0.f1942a
            int r11 = r12.f10843c
        L_0x02d2:
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x02e6
            java.lang.Object r15 = r12.m(r11)
            java.lang.String r15 = (java.lang.String) r15
            boolean r15 = r7.containsKey(r15)
            if (r15 != 0) goto L_0x02d2
            r12.k(r11)
            goto L_0x02d2
        L_0x02e6:
            java.util.Set r11 = r12.keySet()
            r0.l(r3, r11)
            java.util.Collection r11 = r12.values()
            r0.l(r7, r11)
            boolean r11 = r12.isEmpty()
            if (r11 == 0) goto L_0x0310
            r14.clear()
            r13.clear()
            r1 = 0
            r9 = r1
            r7 = r12
            r2 = r14
            r3 = r17
            r15 = r25
            r1 = r26
            r11 = r27
            r26 = r13
            goto L_0x03b4
        L_0x0310:
            androidx.fragment.app.Fragment r10 = r10.f1995c
            androidx.fragment.app.Fragment r4 = r4.f1995c
            androidx.fragment.app.k0 r11 = androidx.fragment.app.j0.f1942a
            if (r2 == 0) goto L_0x031c
            r4.getEnterTransitionCallback()
            goto L_0x031f
        L_0x031c:
            r10.getEnterTransitionCallback()
        L_0x031f:
            android.view.ViewGroup r4 = r0.f1981a
            androidx.fragment.app.i r10 = new androidx.fragment.app.i
            r10.<init>(r6, r5, r2, r7)
            n0.q.a(r4, r10)
            java.util.Collection r4 = r3.values()
            r14.addAll(r4)
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L_0x034c
            r4 = 0
            java.lang.Object r9 = r9.get(r4)
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            java.lang.Object r3 = r3.getOrDefault(r9, r10)
            android.view.View r3 = (android.view.View) r3
            r9 = r34
            r11 = r27
            r11.n(r9, r3)
            goto L_0x0354
        L_0x034c:
            r9 = r34
            r11 = r27
            r4 = 0
            r10 = 0
            r3 = r20
        L_0x0354:
            java.util.Collection r15 = r7.values()
            r13.addAll(r15)
            boolean r15 = r1.isEmpty()
            if (r15 != 0) goto L_0x037e
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r7.getOrDefault(r1, r10)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x037e
            android.view.ViewGroup r4 = r0.f1981a
            androidx.fragment.app.j r7 = new androidx.fragment.app.j
            r10 = r17
            r7.<init>(r11, r1, r10)
            n0.q.a(r4, r7)
            r19 = 1
            goto L_0x0380
        L_0x037e:
            r10 = r17
        L_0x0380:
            r1 = r26
            r11.p(r9, r1, r14)
            r4 = 0
            r15 = 0
            r7 = r12
            r12 = r11
            r26 = r13
            r13 = r9
            r2 = r14
            r14 = r4
            r4 = r10
            r16 = r9
            r17 = r26
            r12.l(r13, r14, r15, r16, r17)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r15 = r25
            r15.put(r5, r10)
            r15.put(r6, r10)
            r20 = r3
            r3 = r4
            r4 = r5
            r10 = r6
            goto L_0x03b4
        L_0x03a6:
            r21 = r9
            r7 = r12
            r26 = r13
            r2 = r14
            r32 = r15
            r15 = r1
            r1 = r3
            r3 = r32
            r9 = r34
        L_0x03b4:
            r14 = r2
            r12 = r7
            r7 = r9
            r9 = r21
            r13 = r26
            r2 = r35
            r32 = r3
            r3 = r1
            r1 = r15
            r15 = r32
            goto L_0x01ab
        L_0x03c5:
            r34 = r7
            r21 = r9
            r7 = r12
            r26 = r13
            r2 = r14
            r32 = r15
            r15 = r1
            r1 = r3
            r3 = r32
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r18 = r21.iterator()
            r12 = 0
            r13 = 0
            r14 = r12
        L_0x03df:
            boolean r12 = r18.hasNext()
            if (r12 == 0) goto L_0x04fe
            java.lang.Object r12 = r18.next()
            androidx.fragment.app.d$e r12 = (androidx.fragment.app.d.e) r12
            boolean r16 = r12.b()
            if (r16 == 0) goto L_0x0404
            r35 = r13
            androidx.fragment.app.r0$e r13 = r12.f1866a
            r16 = r14
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r15.put(r13, r14)
            r12.a()
            r13 = r35
            r14 = r16
            goto L_0x03df
        L_0x0404:
            r35 = r13
            r16 = r14
            java.lang.Object r13 = r12.f1868c
            java.lang.Object r14 = r11.f(r13)
            androidx.fragment.app.r0$e r13 = r12.f1866a
            if (r34 == 0) goto L_0x0418
            if (r13 == r4) goto L_0x0416
            if (r13 != r10) goto L_0x0418
        L_0x0416:
            r10 = 1
            goto L_0x0419
        L_0x0418:
            r10 = 0
        L_0x0419:
            if (r14 != 0) goto L_0x0436
            if (r10 != 0) goto L_0x0425
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r15.put(r13, r4)
            r12.a()
        L_0x0425:
            r13 = r35
            r27 = r1
            r25 = r7
            r1 = r15
            r14 = r16
            r7 = r20
            r12 = r24
            r4 = r26
            goto L_0x04ef
        L_0x0436:
            r25 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r17 = r12
            androidx.fragment.app.Fragment r12 = r13.f1995c
            android.view.View r12 = r12.mView
            r0.j(r7, r12)
            if (r10 == 0) goto L_0x0454
            if (r13 != r4) goto L_0x044e
            r7.removeAll(r2)
            goto L_0x0454
        L_0x044e:
            r4 = r26
            r7.removeAll(r4)
            goto L_0x0456
        L_0x0454:
            r4 = r26
        L_0x0456:
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L_0x046d
            r11.a(r14, r1)
            r29 = r35
            r27 = r1
            r10 = r13
            r1 = r15
            r31 = r16
            r28 = r17
            r12 = r24
            r15 = r14
            goto L_0x04bb
        L_0x046d:
            r11.b(r14, r7)
            r10 = 0
            r26 = 0
            r28 = r17
            r12 = r11
            r29 = r35
            r30 = r13
            r13 = r14
            r35 = r14
            r31 = r16
            r27 = r1
            r1 = r15
            r15 = r7
            r16 = r10
            r17 = r26
            r12.l(r13, r14, r15, r16, r17)
            r10 = r30
            androidx.fragment.app.r0$e$c r12 = r10.f1993a
            androidx.fragment.app.r0$e$c r13 = androidx.fragment.app.r0.e.c.GONE
            if (r12 != r13) goto L_0x04b7
            r12 = r24
            r12.remove(r10)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r7)
            androidx.fragment.app.Fragment r14 = r10.f1995c
            android.view.View r14 = r14.mView
            r13.remove(r14)
            androidx.fragment.app.Fragment r14 = r10.f1995c
            android.view.View r14 = r14.mView
            r15 = r35
            r11.k(r15, r14, r13)
            android.view.ViewGroup r13 = r0.f1981a
            androidx.fragment.app.k r14 = new androidx.fragment.app.k
            r14.<init>(r7)
            n0.q.a(r13, r14)
            goto L_0x04bb
        L_0x04b7:
            r15 = r35
            r12 = r24
        L_0x04bb:
            androidx.fragment.app.r0$e$c r13 = r10.f1993a
            androidx.fragment.app.r0$e$c r14 = androidx.fragment.app.r0.e.c.VISIBLE
            if (r13 != r14) goto L_0x04cc
            r9.addAll(r7)
            if (r19 == 0) goto L_0x04c9
            r11.m(r15, r3)
        L_0x04c9:
            r7 = r20
            goto L_0x04d1
        L_0x04cc:
            r7 = r20
            r11.n(r15, r7)
        L_0x04d1:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r1.put(r10, r13)
            r10 = r28
            boolean r10 = r10.f1869d
            if (r10 == 0) goto L_0x04e6
            r13 = r29
            java.lang.Object r10 = r11.j(r13, r15)
            r13 = r10
            r14 = r31
            goto L_0x04ef
        L_0x04e6:
            r13 = r29
            r10 = r31
            java.lang.Object r10 = r11.j(r10, r15)
            r14 = r10
        L_0x04ef:
            r15 = r1
            r26 = r4
            r4 = r5
            r10 = r6
            r20 = r7
            r24 = r12
            r7 = r25
            r1 = r27
            goto L_0x03df
        L_0x04fe:
            r25 = r7
            r10 = r14
            r1 = r15
            r12 = r24
            r4 = r26
            r14 = r34
            java.lang.Object r3 = r11.i(r13, r10, r14)
            if (r3 != 0) goto L_0x0510
            goto L_0x058f
        L_0x0510:
            java.util.Iterator r7 = r21.iterator()
        L_0x0514:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0585
            java.lang.Object r10 = r7.next()
            androidx.fragment.app.d$e r10 = (androidx.fragment.app.d.e) r10
            boolean r13 = r10.b()
            if (r13 == 0) goto L_0x0527
            goto L_0x0514
        L_0x0527:
            java.lang.Object r13 = r10.f1868c
            androidx.fragment.app.r0$e r15 = r10.f1866a
            if (r14 == 0) goto L_0x0534
            if (r15 == r5) goto L_0x0531
            if (r15 != r6) goto L_0x0534
        L_0x0531:
            r16 = 1
            goto L_0x0536
        L_0x0534:
            r16 = 0
        L_0x0536:
            if (r13 != 0) goto L_0x053e
            if (r16 == 0) goto L_0x053b
            goto L_0x053e
        L_0x053b:
            r34 = r7
            goto L_0x0582
        L_0x053e:
            android.view.ViewGroup r13 = r0.f1981a
            java.util.WeakHashMap<android.view.View, n0.a0> r16 = n0.x.f8842a
            boolean r13 = n0.x.g.c(r13)
            if (r13 != 0) goto L_0x0572
            r13 = 2
            boolean r13 = androidx.fragment.app.a0.K(r13)
            if (r13 == 0) goto L_0x056c
            java.lang.String r13 = "SpecialEffectsController: Container "
            java.lang.StringBuilder r13 = a.a.d(r13)
            r34 = r7
            android.view.ViewGroup r7 = r0.f1981a
            r13.append(r7)
            java.lang.String r7 = " has not been laid out. Completing operation "
            r13.append(r7)
            r13.append(r15)
            java.lang.String r7 = r13.toString()
            android.util.Log.v(r8, r7)
            goto L_0x056e
        L_0x056c:
            r34 = r7
        L_0x056e:
            r10.a()
            goto L_0x0582
        L_0x0572:
            r34 = r7
            androidx.fragment.app.r0$e r7 = r10.f1866a
            androidx.fragment.app.Fragment r7 = r7.f1995c
            j0.b r7 = r10.f1867b
            androidx.fragment.app.l r13 = new androidx.fragment.app.l
            r13.<init>(r10, r15)
            r11.o(r3, r7, r13)
        L_0x0582:
            r7 = r34
            goto L_0x0514
        L_0x0585:
            android.view.ViewGroup r7 = r0.f1981a
            java.util.WeakHashMap<android.view.View, n0.a0> r10 = n0.x.f8842a
            boolean r7 = n0.x.g.c(r7)
            if (r7 != 0) goto L_0x059a
        L_0x058f:
            r2 = 0
            r26 = r5
            r24 = r6
            r28 = r8
            r27 = r12
            goto L_0x06cb
        L_0x059a:
            r7 = 4
            androidx.fragment.app.j0.a(r9, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r10 = r4.size()
            r13 = 0
        L_0x05a8:
            if (r13 >= r10) goto L_0x05c4
            java.lang.Object r15 = r4.get(r13)
            android.view.View r15 = (android.view.View) r15
            java.util.WeakHashMap<android.view.View, n0.a0> r16 = n0.x.f8842a
            r34 = r10
            java.lang.String r10 = n0.x.i.k(r15)
            r7.add(r10)
            r10 = 0
            n0.x.i.v(r15, r10)
            int r13 = r13 + 1
            r10 = r34
            goto L_0x05a8
        L_0x05c4:
            r10 = 2
            boolean r10 = androidx.fragment.app.a0.K(r10)
            if (r10 == 0) goto L_0x0644
            java.lang.String r10 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r8, r10)
            java.lang.String r10 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r8, r10)
            java.util.Iterator r10 = r2.iterator()
        L_0x05d9:
            boolean r13 = r10.hasNext()
            java.lang.String r15 = " Name: "
            r24 = r6
            java.lang.String r6 = "View: "
            if (r13 == 0) goto L_0x060e
            java.lang.Object r13 = r10.next()
            android.view.View r13 = (android.view.View) r13
            r34 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r13)
            r10.append(r15)
            java.lang.String r6 = n0.x.i.k(r13)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            android.util.Log.v(r8, r6)
            r10 = r34
            r6 = r24
            goto L_0x05d9
        L_0x060e:
            java.lang.String r10 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r8, r10)
            java.util.Iterator r10 = r4.iterator()
        L_0x0617:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0646
            java.lang.Object r13 = r10.next()
            android.view.View r13 = (android.view.View) r13
            r34 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r13)
            r10.append(r15)
            java.lang.String r13 = n0.x.i.k(r13)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r8, r10)
            r10 = r34
            goto L_0x0617
        L_0x0644:
            r24 = r6
        L_0x0646:
            android.view.ViewGroup r6 = r0.f1981a
            r11.c(r6, r3)
            android.view.ViewGroup r3 = r0.f1981a
            int r6 = r4.size()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r13 = 0
        L_0x0657:
            if (r13 >= r6) goto L_0x06a9
            java.lang.Object r15 = r2.get(r13)
            android.view.View r15 = (android.view.View) r15
            java.util.WeakHashMap<android.view.View, n0.a0> r16 = n0.x.f8842a
            r26 = r5
            java.lang.String r5 = n0.x.i.k(r15)
            r10.add(r5)
            if (r5 != 0) goto L_0x0671
            r28 = r8
            r27 = r12
            goto L_0x06a0
        L_0x0671:
            r27 = r12
            r12 = 0
            n0.x.i.v(r15, r12)
            r15 = r25
            java.lang.Object r12 = r15.getOrDefault(r5, r12)
            java.lang.String r12 = (java.lang.String) r12
            r16 = 0
            r15 = r16
        L_0x0683:
            r28 = r8
            if (r15 >= r6) goto L_0x06a0
            java.lang.Object r8 = r7.get(r15)
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x069b
            java.lang.Object r8 = r4.get(r15)
            android.view.View r8 = (android.view.View) r8
            n0.x.i.v(r8, r5)
            goto L_0x06a0
        L_0x069b:
            int r15 = r15 + 1
            r8 = r28
            goto L_0x0683
        L_0x06a0:
            int r13 = r13 + 1
            r5 = r26
            r12 = r27
            r8 = r28
            goto L_0x0657
        L_0x06a9:
            r26 = r5
            r28 = r8
            r27 = r12
            androidx.fragment.app.n0 r5 = new androidx.fragment.app.n0
            r16 = r5
            r17 = r6
            r18 = r4
            r19 = r7
            r20 = r2
            r21 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            n0.q.a(r3, r5)
            r3 = 0
            androidx.fragment.app.j0.a(r9, r3)
            r11.q(r14, r2, r4)
            r2 = r3
        L_0x06cb:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = r1.containsValue(r3)
            android.view.ViewGroup r10 = r0.f1981a
            android.content.Context r11 = r10.getContext()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r23.iterator()
            r4 = r2
        L_0x06e1:
            boolean r5 = r13.hasNext()
            java.lang.String r14 = " has started."
            if (r5 == 0) goto L_0x07b2
            java.lang.Object r5 = r13.next()
            r15 = r5
            androidx.fragment.app.d$c r15 = (androidx.fragment.app.d.c) r15
            boolean r5 = r15.b()
            if (r5 == 0) goto L_0x06fa
            r15.a()
            goto L_0x070b
        L_0x06fa:
            androidx.fragment.app.s$a r5 = r15.c(r11)
            if (r5 != 0) goto L_0x0704
            r15.a()
            goto L_0x070b
        L_0x0704:
            android.animation.Animator r9 = r5.f2001b
            if (r9 != 0) goto L_0x070e
            r12.add(r15)
        L_0x070b:
            r7 = r28
            goto L_0x0746
        L_0x070e:
            androidx.fragment.app.r0$e r8 = r15.f1866a
            androidx.fragment.app.Fragment r5 = r8.f1995c
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Object r7 = r1.get(r8)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0749
            r6 = 2
            boolean r6 = androidx.fragment.app.a0.K(r6)
            if (r6 == 0) goto L_0x0741
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Ignoring Animator set on "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = " as this Fragment was involved in a Transition."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r7 = r28
            android.util.Log.v(r7, r5)
            goto L_0x0743
        L_0x0741:
            r7 = r28
        L_0x0743:
            r15.a()
        L_0x0746:
            r28 = r7
            goto L_0x06e1
        L_0x0749:
            r7 = r28
            androidx.fragment.app.r0$e$c r4 = r8.f1993a
            androidx.fragment.app.r0$e$c r6 = androidx.fragment.app.r0.e.c.GONE
            if (r4 != r6) goto L_0x0752
            r2 = 1
        L_0x0752:
            r6 = r27
            if (r2 == 0) goto L_0x0759
            r6.remove(r8)
        L_0x0759:
            android.view.View r5 = r5.mView
            r10.startViewTransition(r5)
            androidx.fragment.app.e r4 = new androidx.fragment.app.e
            r34 = r4
            r35 = r5
            r5 = r10
            r16 = r6
            r6 = r35
            r0 = r7
            r7 = r2
            r2 = r8
            r25 = r1
            r1 = r9
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            r1.addListener(r4)
            r4 = r35
            r1.setTarget(r4)
            r1.start()
            r4 = 2
            boolean r4 = androidx.fragment.app.a0.K(r4)
            if (r4 == 0) goto L_0x079c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Animator from operation "
            r4.append(r5)
            r4.append(r2)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r0, r4)
        L_0x079c:
            j0.b r4 = r15.f1867b
            androidx.fragment.app.f r5 = new androidx.fragment.app.f
            r5.<init>(r1, r2)
            r4.b(r5)
            r2 = 0
            r4 = 1
            r28 = r0
            r27 = r16
            r1 = r25
            r0 = r33
            goto L_0x06e1
        L_0x07b2:
            r16 = r27
            r0 = r28
            java.util.Iterator r1 = r12.iterator()
        L_0x07ba:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x086c
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.d$c r2 = (androidx.fragment.app.d.c) r2
            androidx.fragment.app.r0$e r5 = r2.f1866a
            androidx.fragment.app.Fragment r6 = r5.f1995c
            java.lang.String r7 = "Ignoring Animation set on "
            if (r3 == 0) goto L_0x07f0
            r5 = 2
            boolean r5 = androidx.fragment.app.a0.K(r5)
            if (r5 == 0) goto L_0x07ec
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r6)
            java.lang.String r6 = " as Animations cannot run alongside Transitions."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r0, r5)
        L_0x07ec:
            r2.a()
            goto L_0x07ba
        L_0x07f0:
            if (r4 == 0) goto L_0x0814
            r5 = 2
            boolean r5 = androidx.fragment.app.a0.K(r5)
            if (r5 == 0) goto L_0x0810
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r6)
            java.lang.String r6 = " as Animations cannot run alongside Animators."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r0, r5)
        L_0x0810:
            r2.a()
            goto L_0x07ba
        L_0x0814:
            android.view.View r6 = r6.mView
            androidx.fragment.app.s$a r7 = r2.c(r11)
            java.util.Objects.requireNonNull(r7)
            android.view.animation.Animation r7 = r7.f2000a
            java.util.Objects.requireNonNull(r7)
            androidx.fragment.app.r0$e$c r8 = r5.f1993a
            androidx.fragment.app.r0$e$c r9 = androidx.fragment.app.r0.e.c.REMOVED
            if (r8 == r9) goto L_0x082f
            r6.startAnimation(r7)
            r2.a()
            goto L_0x0860
        L_0x082f:
            r10.startViewTransition(r6)
            androidx.fragment.app.s$b r8 = new androidx.fragment.app.s$b
            r8.<init>(r7, r10, r6)
            androidx.fragment.app.g r7 = new androidx.fragment.app.g
            r7.<init>(r5, r10, r6, r2)
            r8.setAnimationListener(r7)
            r6.startAnimation(r8)
            r7 = 2
            boolean r7 = androidx.fragment.app.a0.K(r7)
            if (r7 == 0) goto L_0x0860
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Animation from operation "
            r7.append(r8)
            r7.append(r5)
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r0, r7)
        L_0x0860:
            j0.b r7 = r2.f1867b
            androidx.fragment.app.h r8 = new androidx.fragment.app.h
            r8.<init>(r6, r10, r2, r5)
            r7.b(r8)
            goto L_0x07ba
        L_0x086c:
            java.util.Iterator r1 = r16.iterator()
        L_0x0870:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0886
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.r0$e r2 = (androidx.fragment.app.r0.e) r2
            androidx.fragment.app.Fragment r3 = r2.f1995c
            android.view.View r3 = r3.mView
            androidx.fragment.app.r0$e$c r2 = r2.f1993a
            r2.applyState(r3)
            goto L_0x0870
        L_0x0886:
            r16.clear()
            r1 = 2
            boolean r1 = androidx.fragment.app.a0.K(r1)
            if (r1 == 0) goto L_0x08b0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Completed executing operations from "
            r1.append(r2)
            r5 = r26
            r1.append(r5)
            r2 = r22
            r1.append(r2)
            r6 = r24
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x08b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.b(java.util.List, boolean):void");
    }

    public final void j(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        j(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public final void k(Map<String, View> map, View view) {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        String k10 = x.i.k(view);
        if (k10 != null) {
            map.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public final void l(s.a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((f.b) aVar.entrySet()).iterator();
        while (true) {
            f.d dVar = (f.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                if (!collection.contains(x.i.k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }
}
