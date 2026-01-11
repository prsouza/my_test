package c0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r;
import n0.e;

public class g extends Activity implements a0, e.a {
    private s.g<Class<? extends a>, a> mExtraDataMap = new s.g<>();
    private b0 mLifecycleRegistry = new b0(this);

    @Deprecated
    public static class a {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.a(decorView, keyEvent)) {
            return e.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends a> T getExtraData(Class<T> cls) {
        return (a) this.mExtraDataMap.getOrDefault(cls, null);
    }

    public r getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q0.c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        b0 b0Var = this.mLifecycleRegistry;
        r.c cVar = r.c.CREATED;
        b0Var.e("markState");
        b0Var.k(cVar);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
