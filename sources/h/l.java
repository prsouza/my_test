package h;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import n0.e;
import s.c;

public class l extends Dialog implements e {

    /* renamed from: a  reason: collision with root package name */
    public g f5582a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5583b = new a();

    public class a implements e.a {
        public a() {
        }

        public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return l.this.f(keyEvent);
        }
    }

    public l(Context context, int i) {
        super(context, c(context, i));
        f a10 = a();
        ((g) a10).f5532c0 = c(context, i);
        a10.n((Bundle) null);
    }

    public static int c(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final f a() {
        if (this.f5582a == null) {
            c<WeakReference<f>> cVar = f.f5524a;
            this.f5582a = new g(getContext(), getWindow(), this, this);
        }
        return this.f5582a;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    public final void b() {
    }

    public final void d() {
    }

    public final void dismiss() {
        super.dismiss();
        a().o();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.b(this.f5583b, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final <T extends View> T findViewById(int i) {
        return a().g(i);
    }

    public final boolean g() {
        return a().w(1);
    }

    public final void invalidateOptionsMenu() {
        a().l();
    }

    public void onCreate(Bundle bundle) {
        a().k();
        super.onCreate(bundle);
        a().n(bundle);
    }

    public final void onStop() {
        super.onStop();
        a().t();
    }

    public void setContentView(int i) {
        a().x(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().B(charSequence);
    }

    public void setContentView(View view) {
        a().y(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().z(view, layoutParams);
    }

    public final void setTitle(int i) {
        super.setTitle(i);
        a().B(getContext().getString(i));
    }
}
