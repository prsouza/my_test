package o0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9188a;

    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final c f9189a;

        public a(c cVar) {
            this.f9189a = cVar;
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            b a10 = this.f9189a.a(i);
            if (a10 == null) {
                return null;
            }
            return a10.f9173a;
        }

        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            Objects.requireNonNull(this.f9189a);
            return null;
        }

        public final boolean performAction(int i, int i10, Bundle bundle) {
            return this.f9189a.c(i, i10, bundle);
        }
    }

    public static class b extends a {
        public b(c cVar) {
            super(cVar);
        }

        public final AccessibilityNodeInfo findFocus(int i) {
            b b10 = this.f9189a.b(i);
            if (b10 == null) {
                return null;
            }
            return b10.f9173a;
        }
    }

    /* renamed from: o0.c$c  reason: collision with other inner class name */
    public static class C0176c extends b {
        public C0176c(c cVar) {
            super(cVar);
        }

        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.f9189a);
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9188a = new C0176c(this);
        } else {
            this.f9188a = new b(this);
        }
    }

    public b a(int i) {
        return null;
    }

    public b b(int i) {
        return null;
    }

    public boolean c(int i, int i10, Bundle bundle) {
        return false;
    }

    public c(Object obj) {
        this.f9188a = obj;
    }
}
