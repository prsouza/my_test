package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f8306a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f8307b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f8308c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f8309d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f8310e;

    public c() {
        super((Context) null);
    }

    public final void a(Configuration configuration) {
        if (this.f8310e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f8309d == null) {
            this.f8309d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f8307b == null) {
            this.f8307b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f8307b.setTo(theme);
            }
        }
        this.f8307b.applyStyle(this.f8306a, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.f8310e == null) {
            Configuration configuration = this.f8309d;
            if (configuration == null) {
                this.f8310e = super.getResources();
            } else {
                this.f8310e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f8310e;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8308c == null) {
            this.f8308c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f8308c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f8307b;
        if (theme != null) {
            return theme;
        }
        if (this.f8306a == 0) {
            this.f8306a = 2131821120;
        }
        b();
        return this.f8307b;
    }

    public final void setTheme(int i) {
        if (this.f8306a != i) {
            this.f8306a = i;
            b();
        }
    }

    public c(Context context, int i) {
        super(context);
        this.f8306a = i;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f8307b = theme;
    }
}
