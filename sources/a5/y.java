package a5;

import a5.a0;
import android.database.Cursor;
import b5.a;
import q4.b;

public final /* synthetic */ class y implements a0.a {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ y f130b = new y(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f131a;

    public /* synthetic */ y(int i) {
        this.f131a = i;
    }

    public final Object apply(Object obj) {
        switch (this.f131a) {
            case 0:
                b bVar = a0.f63u;
                throw new a("Timed out while trying to open db.", (Throwable) obj);
            default:
                b bVar2 = a0.f63u;
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
        }
    }
}
