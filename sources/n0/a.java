package n0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;
import o0.b;
import o0.c;
import o0.d;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f8770c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f8771a;

    /* renamed from: b  reason: collision with root package name */
    public final C0161a f8772b;

    /* renamed from: n0.a$a  reason: collision with other inner class name */
    public static final class C0161a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f8773a;

        public C0161a(a aVar) {
            this.f8773a = aVar;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f8773a.a(view, accessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            c b10 = this.f8773a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f9188a;
            }
            return null;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f8773a.c(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object obj;
            Object obj2;
            int i;
            View view2 = view;
            Class<Boolean> cls = Boolean.class;
            b bVar = new b(accessibilityNodeInfo);
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            int i10 = Build.VERSION.SDK_INT;
            boolean z = true;
            Object obj3 = null;
            if (i10 >= 28) {
                obj = Boolean.valueOf(x.m.d(view));
            } else {
                obj = view2.getTag(R.id.tag_screen_reader_focusable);
                if (!cls.isInstance(obj)) {
                    obj = null;
                }
            }
            Boolean bool = (Boolean) obj;
            bVar.v(bool != null && bool.booleanValue());
            if (i10 >= 28) {
                obj2 = Boolean.valueOf(x.m.c(view));
            } else {
                Object tag = view2.getTag(R.id.tag_accessibility_heading);
                obj2 = cls.isInstance(tag) ? tag : null;
            }
            Boolean bool2 = (Boolean) obj2;
            bVar.s(bool2 != null && bool2.booleanValue());
            bVar.u(x.g(view));
            Class<CharSequence> cls2 = CharSequence.class;
            if (i10 < 30) {
                z = false;
            }
            if (z) {
                obj3 = x.o.a(view);
            } else {
                Object tag2 = view2.getTag(R.id.tag_state_description);
                if (cls2.isInstance(tag2)) {
                    obj3 = tag2;
                }
            }
            bVar.y((CharSequence) obj3);
            this.f8773a.d(view2, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i10 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                        if (((WeakReference) sparseArray.valueAt(i11)).get() == null) {
                            arrayList.add(Integer.valueOf(i11));
                        }
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        sparseArray.remove(((Integer) arrayList.get(i12)).intValue());
                    }
                }
                ClickableSpan[] f10 = b.f(text);
                if (f10 != null && f10.length > 0) {
                    bVar.h().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view2.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i13 = 0; i13 < f10.length; i13++) {
                        ClickableSpan clickableSpan = f10[i13];
                        int i14 = 0;
                        while (true) {
                            if (i14 >= sparseArray2.size()) {
                                i = b.f9172d;
                                b.f9172d = i + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i14)).get())) {
                                i = sparseArray2.keyAt(i14);
                                break;
                            } else {
                                i14++;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(f10[i13]));
                        ClickableSpan clickableSpan2 = f10[i13];
                        Spanned spanned = (Spanned) text;
                        bVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    }
                }
            }
            List list = (List) view2.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i15 = 0; i15 < list.size(); i15++) {
                bVar.b((b.a) list.get(i15));
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f8773a.e(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f8773a.f(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f8773a.g(view, i, bundle);
        }

        public final void sendAccessibilityEvent(View view, int i) {
            this.f8773a.h(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f8773a.i(view, accessibilityEvent);
        }
    }

    public a() {
        this.f8771a = f8770c;
        this.f8772b = new C0161a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f8771a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f8771a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new c(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f8771a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, b bVar) {
        this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f8771a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f8771a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        boolean z10;
        String str;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                break;
            }
            b.a aVar = (b.a) list.get(i10);
            if (aVar.a() != i) {
                i10++;
            } else if (aVar.f9185d != null) {
                Class<? extends d.a> cls = aVar.f9184c;
                if (cls != null) {
                    try {
                        Objects.requireNonNull((d.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Class<? extends d.a> cls2 = aVar.f9184c;
                        if (cls2 == null) {
                            str = "null";
                        } else {
                            str = cls2.getName();
                        }
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + str, e10);
                    }
                }
                z = aVar.f9185d.a(view);
            }
        }
        z = false;
        if (!z) {
            z = this.f8771a.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span) {
            return z;
        }
        int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (!(sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i11)) == null)) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                ClickableSpan[] f10 = b.f(view.createAccessibilityNodeInfo().getText());
                int i12 = 0;
                while (true) {
                    if (f10 == null || i12 >= f10.length) {
                        break;
                    } else if (clickableSpan.equals(f10[i12])) {
                        z10 = true;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            z10 = false;
            if (z10) {
                clickableSpan.onClick(view);
                z11 = true;
            }
        }
        return z11;
    }

    public void h(View view, int i) {
        this.f8771a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f8771a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f8771a = accessibilityDelegate;
        this.f8772b = new C0161a(this);
    }
}
