package g0;

import a.a;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import f0.d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k0.l;

public class h extends f {
    public final Class<?> g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor<?> f5221h;
    public final Method i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f5222j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f5223k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f5224l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f5225m;

    public h() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = o(cls2);
            method2 = p(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = q(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            StringBuilder d10 = a.d("Unable to collect necessary methods for class ");
            d10.append(e10.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", d10.toString(), e10);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.g = cls;
        this.f5221h = constructor;
        this.i = method3;
        this.f5222j = method2;
        this.f5223k = method;
        this.f5224l = method4;
        this.f5225m = method5;
    }

    private Object n() {
        try {
            return this.f5221h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Typeface a(Context context, d.b bVar, Resources resources, int i10) {
        if (!m()) {
            return super.a(context, bVar, resources, i10);
        }
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        for (d.c cVar : bVar.f4874a) {
            if (!j(context, n10, cVar.f4875a, cVar.f4879e, cVar.f4876b, cVar.f4877c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f4878d))) {
                i(n10);
                return null;
            }
        }
        if (!l(n10)) {
            return null;
        }
        return k(n10);
    }

    public final Typeface b(Context context, l[] lVarArr, int i10) {
        Typeface k10;
        boolean z;
        ParcelFileDescriptor openFileDescriptor;
        if (lVarArr.length < 1) {
            return null;
        }
        if (!m()) {
            l f10 = f(lVarArr, i10);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(f10.f7377a, "r", (CancellationSignal) null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f10.f7379c).setItalic(f10.f7380d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (l lVar : lVarArr) {
                if (lVar.f7381e == 0) {
                    Uri uri = lVar.f7377a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, l.e(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object n10 = n();
            if (n10 == null) {
                return null;
            }
            boolean z10 = false;
            for (l lVar2 : lVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar2.f7377a);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.f5222j.invoke(n10, new Object[]{byteBuffer, Integer.valueOf(lVar2.f7378b), null, Integer.valueOf(lVar2.f7379c), Integer.valueOf(lVar2.f7380d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        i(n10);
                        return null;
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                i(n10);
                return null;
            } else if (l(n10) && (k10 = k(n10)) != null) {
                return Typeface.create(k10, i10);
            } else {
                return null;
            }
        }
        throw th;
    }

    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        if (!m()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        if (!j(context, n10, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            i(n10);
            return null;
        } else if (!l(n10)) {
            return null;
        } else {
            return k(n10);
        }
    }

    public final void i(Object obj) {
        try {
            this.f5224l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean j(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface k(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f5225m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean l(Object obj) {
        try {
            return ((Boolean) this.f5223k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    public final Method o(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public final Method p(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public Method q(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
