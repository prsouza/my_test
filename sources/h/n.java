package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.v;
import com.github.mikephil.charting.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s.g;

public class n {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f5585b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f5586c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f5587d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f5588e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f5589f = {16844148};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final g<String, Constructor<? extends View>> f5590h = new g<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f5591a = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final View f5592a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5593b;

        /* renamed from: c  reason: collision with root package name */
        public Method f5594c;

        /* renamed from: s  reason: collision with root package name */
        public Context f5595s;

        public a(View view, String str) {
            this.f5592a = view;
            this.f5593b = str;
        }

        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f5594c == null) {
                for (Context context = this.f5592a.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f5593b, new Class[]{View.class})) != null) {
                            this.f5594c = method;
                            this.f5595s = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                int id2 = this.f5592a.getId();
                if (id2 == -1) {
                    str = BuildConfig.FLAVOR;
                } else {
                    StringBuilder d10 = a.a.d(" with id '");
                    d10.append(this.f5592a.getContext().getResources().getResourceEntryName(id2));
                    d10.append("'");
                    str = d10.toString();
                }
                StringBuilder d11 = a.a.d("Could not find method ");
                d11.append(this.f5593b);
                d11.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                d11.append(this.f5592a.getClass());
                d11.append(str);
                throw new IllegalStateException(d11.toString());
            }
            try {
                this.f5594c.invoke(this.f5595s, new Object[]{view});
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public e a(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    public androidx.appcompat.widget.g b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    public h c(Context context, AttributeSet attributeSet) {
        return new h(context, attributeSet);
    }

    public v d(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    public f0 e(Context context, AttributeSet attributeSet) {
        return new f0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        g<String, Constructor<? extends View>> gVar = f5590h;
        Constructor<? extends U> orDefault = gVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f5585b);
            gVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.f5591a);
    }

    public final void g(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
