package o0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.jpountz.lz4.LZ4BlockOutputStream;
import o0.d;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static int f9172d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f9173a;

    /* renamed from: b  reason: collision with root package name */
    public int f9174b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f9175c = -1;

    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f9176e = new a(16);

        /* renamed from: f  reason: collision with root package name */
        public static final a f9177f = new a(LZ4Constants.HASH_TABLE_SIZE);
        public static final a g = new a(LZ4Constants.HASH_TABLE_SIZE_64K);

        /* renamed from: h  reason: collision with root package name */
        public static final a f9178h = new a(262144);
        public static final a i = new a(524288);

        /* renamed from: j  reason: collision with root package name */
        public static final a f9179j = new a(1048576);

        /* renamed from: k  reason: collision with root package name */
        public static final a f9180k = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (d) null, (Class<? extends d.a>) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f9181l = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (d) null, (Class<? extends d.a>) null);

        /* renamed from: a  reason: collision with root package name */
        public final Object f9182a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9183b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends d.a> f9184c;

        /* renamed from: d  reason: collision with root package name */
        public final d f9185d;

        static {
            Class<d.c> cls = d.c.class;
            Class<d.b> cls2 = d.b.class;
            new a(1);
            new a(2);
            new a(4);
            new a(8);
            new a(32);
            new a(64);
            new a(128);
            new a(256, cls2);
            new a(512, cls2);
            new a(1024, cls);
            new a(2048, cls);
            new a(16384);
            new a(LZ4Constants.HASH_TABLE_SIZE_HC);
            new a(LZ4Constants.MAX_DISTANCE);
            new a(131072, d.g.class);
            new a(2097152, d.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (d) null, d.e.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (d) null, d.f.class);
            new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (d) null, d.C0177d.class);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            if (i10 >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            new a(accessibilityAction, 16908372, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
        }

        public a(int i10) {
            this((Object) null, i10, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f9182a).getId();
        }

        public final CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f9182a).getLabel();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f9182a;
            if (obj2 == null) {
                if (aVar.f9182a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f9182a)) {
                return false;
            } else {
                return true;
            }
        }

        public final int hashCode() {
            Object obj = this.f9182a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i10, Class cls) {
            this((Object) null, i10, (CharSequence) null, (d) null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, d dVar, Class<? extends d.a> cls) {
            this.f9183b = i10;
            this.f9185d = dVar;
            if (obj == null) {
                this.f9182a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f9182a = obj;
            }
            this.f9184c = cls;
        }
    }

    /* renamed from: o0.b$b  reason: collision with other inner class name */
    public static class C0175b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f9186a;

        public C0175b(Object obj) {
            this.f9186a = obj;
        }

        public static C0175b a(int i, int i10, int i11) {
            return new C0175b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i10, false, i11));
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f9187a;

        public c(Object obj) {
            this.f9187a = obj;
        }

        public static c a(int i, int i10, int i11, int i12, boolean z) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i10, i11, i12, false, z));
        }
    }

    public b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f9173a = accessibilityNodeInfo;
    }

    public static String d(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case LZ4BlockOutputStream.COMPRESSION_METHOD_LZ4:
                return "ACTION_LONG_CLICK";
            case LZ4BlockOutputStream.MIN_BLOCK_SIZE:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case HASH_TABLE_SIZE:
                return "ACTION_SCROLL_FORWARD";
            case HASH_TABLE_SIZE_64K:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case HASH_TABLE_SIZE_HC:
                return "ACTION_PASTE";
            case MAX_DISTANCE:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static ClickableSpan[] f(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public final void A(View view) {
        this.f9173a.setTraversalAfter(view);
    }

    public final void a(int i) {
        this.f9173a.addAction(i);
    }

    public final void b(a aVar) {
        this.f9173a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f9182a);
    }

    public final List<Integer> c(String str) {
        ArrayList<Integer> integerArrayList = this.f9173a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f9173a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    public final void e(Rect rect) {
        this.f9173a.getBoundsInParent(rect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9173a;
        if (accessibilityNodeInfo == null) {
            if (bVar.f9173a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.f9173a)) {
            return false;
        }
        return this.f9175c == bVar.f9175c && this.f9174b == bVar.f9174b;
    }

    public final CharSequence g() {
        return this.f9173a.getContentDescription();
    }

    public final Bundle h() {
        return this.f9173a.getExtras();
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9173a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final CharSequence i() {
        if (!(!c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f9173a.getText();
        }
        List<Integer> c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> c13 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f9173a.getText(), 0, this.f9173a.getText().length()));
        for (int i = 0; i < c10.size(); i++) {
            spannableString.setSpan(new a(c13.get(i).intValue(), this, h().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), c10.get(i).intValue(), c11.get(i).intValue(), c12.get(i).intValue());
        }
        return spannableString;
    }

    public final boolean j() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f9173a.isShowingHintText();
        }
        Bundle h10 = h();
        if (h10 != null && (h10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4) {
            return true;
        }
        return false;
    }

    public final void k(int i, boolean z) {
        Bundle h10 = h();
        if (h10 != null) {
            int i10 = h10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            h10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i10);
        }
    }

    @Deprecated
    public final void l(Rect rect) {
        this.f9173a.setBoundsInParent(rect);
    }

    public final void m(boolean z) {
        this.f9173a.setCheckable(z);
    }

    public final void n(CharSequence charSequence) {
        this.f9173a.setClassName(charSequence);
    }

    public final void o(boolean z) {
        this.f9173a.setClickable(z);
    }

    public final void p(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9173a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C0175b) obj).f9186a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public final void q(Object obj) {
        this.f9173a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f9187a);
    }

    public final void r(CharSequence charSequence) {
        this.f9173a.setContentDescription(charSequence);
    }

    public final void s(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9173a.setHeading(z);
        } else {
            k(2, z);
        }
    }

    public final void t(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9173a.setHintText(charSequence);
        } else {
            this.f9173a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public final String toString() {
        ArrayList arrayList;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        e(rect);
        sb2.append("; boundsInParent: " + rect);
        this.f9173a.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(this.f9173a.getPackageName());
        sb2.append("; className: ");
        sb2.append(this.f9173a.getClassName());
        sb2.append("; text: ");
        sb2.append(i());
        sb2.append("; contentDescription: ");
        sb2.append(g());
        sb2.append("; viewId: ");
        sb2.append(this.f9173a.getViewIdResourceName());
        sb2.append("; checkable: ");
        sb2.append(this.f9173a.isCheckable());
        sb2.append("; checked: ");
        sb2.append(this.f9173a.isChecked());
        sb2.append("; focusable: ");
        sb2.append(this.f9173a.isFocusable());
        sb2.append("; focused: ");
        sb2.append(this.f9173a.isFocused());
        sb2.append("; selected: ");
        sb2.append(this.f9173a.isSelected());
        sb2.append("; clickable: ");
        sb2.append(this.f9173a.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(this.f9173a.isLongClickable());
        sb2.append("; enabled: ");
        sb2.append(this.f9173a.isEnabled());
        sb2.append("; password: ");
        sb2.append(this.f9173a.isPassword());
        sb2.append("; scrollable: " + this.f9173a.isScrollable());
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f9173a.getActionList();
        if (actionList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(new a(actionList.get(i), 0, (CharSequence) null, (d) null, (Class<? extends d.a>) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a aVar = (a) arrayList.get(i10);
            String d10 = d(aVar.a());
            if (d10.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                d10 = aVar.b().toString();
            }
            sb2.append(d10);
            if (i10 != arrayList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final void u(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9173a.setPaneTitle(charSequence);
        } else {
            this.f9173a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public final void v(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9173a.setScreenReaderFocusable(z);
        } else {
            k(1, z);
        }
    }

    public final void w() {
        this.f9173a.setScrollable(true);
    }

    public final void x(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9173a.setShowingHintText(z);
        } else {
            k(4, z);
        }
    }

    public final void y(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9173a.setStateDescription(charSequence);
        } else {
            this.f9173a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void z(CharSequence charSequence) {
        this.f9173a.setText(charSequence);
    }
}
