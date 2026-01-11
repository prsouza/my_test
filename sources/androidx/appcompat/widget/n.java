package androidx.appcompat.widget;

import ad.c;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.d;
import c3.k;
import java.util.Objects;
import x0.a;
import x0.e;
import x0.g;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f1337a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1338b;

    public n(EditText editText) {
        this.f1337a = editText;
        this.f1338b = new a(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        Objects.requireNonNull(this.f1338b.f12731a);
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return new e(keyListener);
    }

    /* JADX INFO: finally extract failed */
    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1337a.getContext().obtainStyledAttributes(attributeSet, c.C, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        a aVar = this.f1338b;
        Objects.requireNonNull(aVar);
        if (inputConnection == null) {
            return null;
        }
        a.C0249a aVar2 = aVar.f12731a;
        Objects.requireNonNull(aVar2);
        return inputConnection instanceof x0.c ? inputConnection : new x0.c(aVar2.f12732a, inputConnection, editorInfo);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.Set<androidx.emoji2.text.d$e>, s.c] */
    public final void d(boolean z) {
        g gVar = this.f1338b.f12731a.f12733b;
        if (gVar.f12753s != z) {
            if (gVar.f12752c != null) {
                d a10 = d.a();
                g.a aVar = gVar.f12752c;
                Objects.requireNonNull(a10);
                k.S(aVar, "initCallback cannot be null");
                a10.f1700a.writeLock().lock();
                try {
                    a10.f1701b.remove(aVar);
                } finally {
                    a10.f1700a.writeLock().unlock();
                }
            }
            gVar.f12753s = z;
            if (z) {
                g.a(gVar.f12750a, d.a().b());
            }
        }
    }
}
