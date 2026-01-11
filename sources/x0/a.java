package x0;

import android.widget.EditText;
import c3.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0249a f12731a;

    /* renamed from: x0.a$a  reason: collision with other inner class name */
    public static class C0249a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f12732a;

        /* renamed from: b  reason: collision with root package name */
        public final g f12733b;

        public C0249a(EditText editText) {
            this.f12732a = editText;
            g gVar = new g(editText);
            this.f12733b = gVar;
            editText.addTextChangedListener(gVar);
            if (b.f12735b == null) {
                synchronized (b.f12734a) {
                    if (b.f12735b == null) {
                        b.f12735b = new b();
                    }
                }
            }
            editText.setEditableFactory(b.f12735b);
        }
    }

    public static class b {
    }

    public a(EditText editText) {
        k.S(editText, "editText cannot be null");
        this.f12731a = new C0249a(editText);
    }
}
