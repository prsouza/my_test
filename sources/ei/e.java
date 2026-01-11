package ei;

import android.os.Bundle;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f4852a;

    /* renamed from: b  reason: collision with root package name */
    public String f4853b;

    /* renamed from: c  reason: collision with root package name */
    public int f4854c;

    /* renamed from: d  reason: collision with root package name */
    public int f4855d;

    /* renamed from: e  reason: collision with root package name */
    public String f4856e;

    /* renamed from: f  reason: collision with root package name */
    public String[] f4857f;

    public e(Bundle bundle) {
        this.f4852a = bundle.getString("positiveButton");
        this.f4853b = bundle.getString("negativeButton");
        this.f4856e = bundle.getString("rationaleMsg");
        this.f4854c = bundle.getInt("theme");
        this.f4855d = bundle.getInt("requestCode");
        this.f4857f = bundle.getStringArray("permissions");
    }
}
