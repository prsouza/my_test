package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.i;

public final class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* renamed from: a  reason: collision with root package name */
    public e f945a;

    /* renamed from: b  reason: collision with root package name */
    public b f946b;

    /* renamed from: c  reason: collision with root package name */
    public c f947c;

    public f(e eVar) {
        this.f945a = eVar;
    }

    public final void a(e eVar, boolean z) {
        b bVar;
        if ((z || eVar == this.f945a) && (bVar = this.f946b) != null) {
            bVar.dismiss();
        }
    }

    public final boolean b(e eVar) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f945a.s(((c.a) this.f947c.b()).getItem(i), 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        c cVar = this.f947c;
        e eVar = this.f945a;
        i.a aVar = cVar.f912t;
        if (aVar != null) {
            aVar.a(eVar, true);
        }
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f946b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f946b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f945a.d(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f945a.performShortcut(i, keyEvent, 0);
    }
}
