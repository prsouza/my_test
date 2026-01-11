package androidx.emoji2.text;

import android.util.Log;
import android.view.View;
import androidx.emoji2.text.j;
import e6.e;
import h1.e0;
import h1.y;
import java.util.Collections;
import java.util.Objects;
import x8.r0;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1749a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1750b;

    public /* synthetic */ k(Object obj, int i) {
        this.f1749a = i;
        this.f1750b = obj;
    }

    public final void run() {
        switch (this.f1749a) {
            case 0:
                ((j.b) this.f1750b).c();
                return;
            case 1:
                e0.e eVar = ((y) this.f1750b).f5790a;
                Collections.emptyList();
                eVar.a();
                return;
            case 2:
                r0.a aVar = (r0.a) this.f1750b;
                Objects.requireNonNull(aVar);
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f13125a.getAction() + " App may get closed.");
                aVar.a();
                return;
            default:
                View view = (View) this.f1750b;
                e.D(view, "$parent");
                view.scrollTo(0, 0);
                return;
        }
    }
}
