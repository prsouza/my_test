package v1;

import android.content.Context;
import android.text.TextUtils;
import l1.b;

public final class g implements b.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f12147a;

    public g(Context context) {
        this.f12147a = context;
    }

    public final b a(b.C0141b bVar) {
        Context context = this.f12147a;
        String str = bVar.f7762b;
        b.a aVar = bVar.f7763c;
        if (aVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        } else if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        } else if (!TextUtils.isEmpty(str)) {
            return new m1.b(context, str, aVar, true);
        } else {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
    }
}
