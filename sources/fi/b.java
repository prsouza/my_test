package fi;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.c;
import androidx.fragment.app.a0;

public final class b extends c<c> {
    public b(c cVar) {
        super(cVar);
    }

    public final void a(int i, String... strArr) {
        c0.b.b((Activity) this.f5200a, strArr, i);
    }

    public final Context b() {
        return (Context) this.f5200a;
    }

    public final boolean c(String str) {
        int i = c0.b.f3053c;
        return ((Activity) this.f5200a).shouldShowRequestPermissionRationale(str);
    }

    public final a0 e() {
        return ((c) this.f5200a).getSupportFragmentManager();
    }
}
