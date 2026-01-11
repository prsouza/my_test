package dagger.hilt.android.internal.managers;

import ah.v;
import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import fb.g;
import java.util.Objects;
import n9.b;

public final class a implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile g.b f4405a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4406b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Activity f4407c;

    /* renamed from: s  reason: collision with root package name */
    public final b<j9.a> f4408s;

    /* renamed from: dagger.hilt.android.internal.managers.a$a  reason: collision with other inner class name */
    public interface C0062a {
        k9.a a();
    }

    public a(Activity activity) {
        this.f4407c = activity;
        this.f4408s = new c((ComponentActivity) activity);
    }

    public final Object a() {
        if (this.f4405a == null) {
            synchronized (this.f4406b) {
                if (this.f4405a == null) {
                    this.f4405a = (g.b) b();
                }
            }
        }
        return this.f4405a;
    }

    public final Object b() {
        if (this.f4407c.getApplication() instanceof b) {
            k9.a a10 = ((C0062a) v.I(this.f4408s, C0062a.class)).a();
            Activity activity = this.f4407c;
            g.a aVar = (g.a) a10;
            Objects.requireNonNull(aVar);
            Objects.requireNonNull(activity);
            aVar.f5055c = activity;
            return new g.b(aVar.f5053a, aVar.f5054b);
        } else if (Application.class.equals(this.f4407c.getApplication().getClass())) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
        } else {
            StringBuilder d10 = a.a.d("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: ");
            d10.append(this.f4407c.getApplication().getClass());
            throw new IllegalStateException(d10.toString());
        }
    }
}
