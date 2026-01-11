package h;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import s.c;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final c<WeakReference<f>> f5524a = new c<>(0);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f5525b = new Object();

    public static void c(f fVar) {
        synchronized (f5525b) {
            v(fVar);
            f5524a.add(new WeakReference(fVar));
        }
    }

    public static void u(f fVar) {
        synchronized (f5525b) {
            v(fVar);
        }
    }

    public static void v(f fVar) {
        synchronized (f5525b) {
            Iterator<WeakReference<f>> it = f5524a.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public void A(int i) {
    }

    public abstract void B(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public Context e(Context context) {
        return context;
    }

    public abstract View f(View view, String str, Context context, AttributeSet attributeSet);

    public abstract <T extends View> T g(int i);

    public int h() {
        return -100;
    }

    public abstract MenuInflater i();

    public abstract a j();

    public abstract void k();

    public abstract void l();

    public abstract void m(Configuration configuration);

    public abstract void n(Bundle bundle);

    public abstract void o();

    public abstract void p(Bundle bundle);

    public abstract void q();

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t();

    public abstract boolean w(int i);

    public abstract void x(int i);

    public abstract void y(View view);

    public abstract void z(View view, ViewGroup.LayoutParams layoutParams);
}
