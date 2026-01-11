package x0;

import android.text.Editable;
import androidx.emoji2.text.p;

public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f12734a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f12735b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f12736c;

    public b() {
        try {
            f12736c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f12736c;
        if (cls != null) {
            return new p(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
