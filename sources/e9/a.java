package e9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.lang.reflect.Field;
import java.util.Objects;
import md.h;

public final class a extends LayoutInflater {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final h f4782a = new h(C0071a.f4784b);

    /* renamed from: b  reason: collision with root package name */
    public static final b f4783b = new b();

    /* renamed from: e9.a$a  reason: collision with other inner class name */
    public static final class C0071a extends yd.h implements xd.a<Field> {

        /* renamed from: b  reason: collision with root package name */
        public static final C0071a f4784b = new C0071a();

        public C0071a() {
            super(0);
        }

        public final Object c() {
            Field declaredField = LayoutInflater.class.getDeclaredField("mConstructorArgs");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return declaredField;
            }
            throw new IllegalArgumentException("No constructor arguments field found in LayoutInflater!".toString());
        }
    }

    public static final class b {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        e.D(context, "newContext");
    }

    public final View a(Context context, String str, AttributeSet attributeSet) {
        e.D(context, "viewContext");
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(attributeSet, "attrs");
        h hVar = f4782a;
        Object obj = ((Field) hVar.a()).get(this);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
        Object[] objArr = (Object[]) obj;
        objArr[0] = context;
        ((Field) hVar.a()).set(this, objArr);
        return createView(str, (String) null, attributeSet);
    }

    public final LayoutInflater cloneInContext(Context context) {
        e.D(context, "newContext");
        return new a(context);
    }
}
