package x0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.d;
import androidx.emoji2.text.h;
import java.util.Objects;

public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f12743a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12744b;

    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f12743a = keyListener;
        this.f12744b = aVar;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f12743a.clearMetaKeyState(view, editable, i);
    }

    public final int getInputType() {
        return this.f12743a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        boolean z10;
        Objects.requireNonNull(this.f12744b);
        Object obj = d.i;
        if (i == 67) {
            z = h.a(editable, keyEvent, false);
        } else if (i != 112) {
            z = false;
        } else {
            z = h.a(editable, keyEvent, true);
        }
        if (z) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f12743a.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f12743a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f12743a.onKeyUp(view, editable, i, keyEvent);
    }
}
