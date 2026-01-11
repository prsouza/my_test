package n0;

import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import n0.a;
import n0.c;
import n0.e0;
import o0.b;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, a0> f8842a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f8843b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f8844c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f8845d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e  reason: collision with root package name */
    public static final s f8846e = s.f8841a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f8847f = new a();

    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f8848a = new WeakHashMap<>();

        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f8848a.entrySet()) {
                    View view = (View) next.getKey();
                    boolean booleanValue = ((Boolean) next.getValue()).booleanValue();
                    boolean z = view.getVisibility() == 0;
                    if (booleanValue != z) {
                        x.j(view, z ? 16 : 32);
                        this.f8848a.put(view, Boolean.valueOf(z));
                    }
                }
            }
        }

        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f8849a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f8850b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8851c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8852d;

        public b(int i, Class<T> cls, int i10, int i11) {
            this.f8849a = i;
            this.f8850b = cls;
            this.f8852d = i10;
            this.f8851c = i11;
        }

        public final boolean a(Boolean bool, Boolean bool2) {
            if ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue())) {
                return true;
            }
            return false;
        }

        public abstract T b(View view);

        public abstract void c(View view, T t10);

        public final T d(View view) {
            if (Build.VERSION.SDK_INT >= this.f8851c) {
                return b(view);
            }
            T tag = view.getTag(this.f8849a);
            if (this.f8850b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public final void e(View view, T t10) {
            if (Build.VERSION.SDK_INT >= this.f8851c) {
                c(view, t10);
            } else if (f(d(view), t10)) {
                a e10 = x.e(view);
                if (e10 == null) {
                    e10 = new a();
                }
                x.p(view, e10);
                view.setTag(this.f8849a, t10);
                x.j(view, this.f8852d);
            }
        }

        public abstract boolean f(T t10, T t11);
    }

    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i, int i10, int i11, int i12) {
            view.postInvalidateOnAnimation(i, i10, i11, i12);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        public static void s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i) {
            view.setLabelFor(i);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i) {
            view.setLayoutDirection(i);
        }

        public static void k(View view, int i, int i10, int i11, int i12) {
            view.setPaddingRelative(i, i10, i11, i12);
        }
    }

    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        public static void f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class i {

        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public e0 f8853a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f8854b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ n f8855c;

            public a(View view, n nVar) {
                this.f8854b = view;
                this.f8855c = nVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                e0 k10 = e0.k(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    i.a(windowInsets, this.f8854b);
                    if (k10.equals(this.f8853a)) {
                        return this.f8855c.a(view, k10).j();
                    }
                }
                this.f8853a = k10;
                e0 a10 = this.f8855c.a(view, k10);
                if (i >= 30) {
                    return a10.j();
                }
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                h.c(view);
                return a10.j();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static e0 b(View view, e0 e0Var, Rect rect) {
            WindowInsets j10 = e0Var.j();
            if (j10 != null) {
                return e0.k(view.computeSystemWindowInsets(j10, rect), view);
            }
            rect.setEmpty();
            return e0Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z) {
            return view.dispatchNestedFling(f10, f11, z);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i, int i10, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i10, iArr, iArr2);
        }

        public static boolean f(View view, int i, int i10, int i11, int i12, int[] iArr) {
            return view.dispatchNestedScroll(i, i10, i11, i12, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static e0 j(View view) {
            e0.e eVar;
            if (!e0.a.f8802d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = e0.a.f8799a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) e0.a.f8800b.get(obj);
                Rect rect2 = (Rect) e0.a.f8801c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    eVar = new e0.d();
                } else if (i >= 29) {
                    eVar = new e0.c();
                } else {
                    eVar = new e0.b();
                }
                eVar.c(g0.b.c(rect));
                eVar.d(g0.b.c(rect2));
                e0 b10 = eVar.b();
                b10.i(b10);
                b10.a(view.getRootView());
                return b10;
            } catch (IllegalAccessException e10) {
                StringBuilder d10 = a.a.d("Failed to get insets from AttachInfo. ");
                d10.append(e10.getMessage());
                Log.w("WindowInsetsCompat", d10.toString(), e10);
                return null;
            }
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(View view, n nVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, nVar);
            }
            if (nVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, nVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class j {
        public static e0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            e0 k10 = e0.k(rootWindowInsets, (View) null);
            k10.i(k10);
            k10.a(view.getRootView());
            return k10;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void d(View view, int i, int i10) {
            view.setScrollIndicators(i, i10);
        }
    }

    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    public static class l {
        public static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class m {
        public static void a(View view, r rVar) {
            s.g gVar = (s.g) view.getTag(R.id.tag_unhandled_key_listeners);
            if (gVar == null) {
                gVar = new s.g();
                view.setTag(R.id.tag_unhandled_key_listeners, gVar);
            }
            Objects.requireNonNull(rVar);
            y yVar = new y(rVar);
            gVar.put(rVar, yVar);
            view.addOnUnhandledKeyEventListener(yVar);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            s.g gVar = (s.g) view.getTag(R.id.tag_unhandled_key_listeners);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.getOrDefault(rVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i) {
            return view.requireViewById(i);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i10) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i10);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class o {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class p {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static c b(View view, c cVar) {
            ContentInfo c10 = cVar.f8779a.c();
            ContentInfo performReceiveContent = view.performReceiveContent(c10);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == c10) {
                return cVar;
            }
            return new c(new c.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, o oVar) {
            if (oVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new q(oVar));
            }
        }
    }

    public static final class q implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final o f8856a;

        public q(o oVar) {
            this.f8856a = oVar;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            c cVar = new c(new c.d(contentInfo));
            c a10 = this.f8856a.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (a10 == cVar) {
                return contentInfo;
            }
            return a10.f8779a.c();
        }
    }

    public interface r {
        boolean a();
    }

    public static class s {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f8857d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f8858a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f8859b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f8860c = null;

        public final View a(View view, KeyEvent keyEvent) {
            View a10;
            WeakHashMap<View, Boolean> weakHashMap = this.f8858a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (a10 == null);
                return a10;
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((r) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
    }

    public static void a(View view, b.a aVar) {
        a e10 = e(view);
        if (e10 == null) {
            e10 = new a();
        }
        p(view, e10);
        m(aVar.a(), view);
        h(view).add(aVar);
        j(view, 0);
    }

    public static a0 b(View view) {
        if (f8842a == null) {
            f8842a = new WeakHashMap<>();
        }
        a0 a0Var = f8842a.get(view);
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(view);
        f8842a.put(view, a0Var2);
        return a0Var2;
    }

    public static e0 c(View view, e0 e0Var) {
        WindowInsets j10 = e0Var.j();
        if (j10 != null) {
            WindowInsets a10 = h.a(view, j10);
            if (!a10.equals(j10)) {
                return e0.k(a10, view);
            }
        }
        return e0Var;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.f8857d;
        s sVar = (s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f8858a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.f8857d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f8858a == null) {
                        sVar.f8858a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.f8857d;
                        View view2 = (View) arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f8858a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f8858a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f8859b == null) {
                    sVar.f8859b = new SparseArray<>();
                }
                sVar.f8859b.put(keyCode, new WeakReference(a10));
            }
        }
        if (a10 != null) {
            return true;
        }
        return false;
    }

    public static a e(View view) {
        View.AccessibilityDelegate f10 = f(view);
        if (f10 == null) {
            return null;
        }
        if (f10 instanceof a.C0161a) {
            return ((a.C0161a) f10).f8773a;
        }
        return new a(f10);
    }

    public static View.AccessibilityDelegate f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (f8844c) {
            return null;
        }
        if (f8843b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f8843b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f8844c = true;
                return null;
            }
        }
        try {
            Object obj = f8843b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f8844c = true;
            return null;
        }
    }

    public static CharSequence g(View view) {
        Object obj;
        Class<CharSequence> cls = CharSequence.class;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = m.b(view);
        } else {
            obj = view.getTag(R.id.tag_accessibility_pane_title);
            if (!cls.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    public static List<b.a> h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] i(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void j(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = g(view) != null && view.getVisibility() == 0;
            int i11 = 32;
            if (g.a(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i11 = 2048;
                }
                obtain.setEventType(i11);
                g.g(obtain, i10);
                if (z) {
                    obtain.getText().add(g(view));
                    if (d.c(view) == 0) {
                        d.s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (d.c((View) parent) == 4) {
                            d.s(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                g.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(g(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static e0 k(View view, e0 e0Var) {
        WindowInsets j10 = e0Var.j();
        if (j10 != null) {
            WindowInsets b10 = h.b(view, j10);
            if (!b10.equals(j10)) {
                return e0.k(b10, view);
            }
        }
        return e0Var;
    }

    public static c l(View view, c cVar) {
        p pVar;
        p pVar2;
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, cVar);
        }
        o oVar = (o) view.getTag(R.id.tag_on_receive_content_listener);
        if (oVar != null) {
            c a10 = oVar.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof p) {
                pVar2 = (p) view;
            } else {
                pVar2 = f8846e;
            }
            return pVar2.a(a10);
        }
        if (view instanceof p) {
            pVar = (p) view;
        } else {
            pVar = f8846e;
        }
        return pVar.a(cVar);
    }

    public static void m(int i10, View view) {
        List<b.a> h10 = h(view);
        for (int i11 = 0; i11 < h10.size(); i11++) {
            if (h10.get(i11).a() == i10) {
                h10.remove(i11);
                return;
            }
        }
    }

    public static void n(View view, b.a aVar, o0.d dVar) {
        if (dVar == null) {
            m(aVar.a(), view);
            j(view, 0);
            return;
        }
        a(view, new b.a((Object) null, aVar.f9183b, (CharSequence) null, dVar, aVar.f9184c));
    }

    public static void o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void p(View view, a aVar) {
        a.C0161a aVar2;
        if (aVar == null && (f(view) instanceof a.C0161a)) {
            aVar = new a();
        }
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = aVar.f8772b;
        }
        view.setAccessibilityDelegate(aVar2);
    }

    public static void q(View view, CharSequence charSequence) {
        new u(CharSequence.class).e(view, charSequence);
        if (charSequence != null) {
            a aVar = f8847f;
            aVar.f8848a.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        a aVar2 = f8847f;
        aVar2.f8848a.remove(view);
        view.removeOnAttachStateChangeListener(aVar2);
        d.o(view.getViewTreeObserver(), aVar2);
    }

    public static void r(View view, r rVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.d(view, (PointerIcon) (rVar != null ? rVar.f8840a : null));
        }
    }
}
