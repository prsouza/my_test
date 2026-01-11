package h1;

import ab.f;
import android.animation.ObjectAnimator;
import android.widget.ImageView;
import e6.e;
import h1.e0;
import io.nodle.cash.R;
import java.util.Collections;
import ne.c;
import pb.j;
import pb.l;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5786a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5787b;

    public /* synthetic */ w(Object obj, int i) {
        this.f5786a = i;
        this.f5787b = obj;
    }

    public final void run() {
        switch (this.f5786a) {
            case 0:
                e0.e eVar = ((y) this.f5787b).f5790a;
                Collections.emptyList();
                eVar.a();
                return;
            default:
                j jVar = (j) this.f5787b;
                e.D(jVar, "this$0");
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) jVar.b(R.id.curtainView), "alpha", new float[]{1.0f, 0.0f});
                ofFloat.setDuration(500);
                ofFloat.addListener(new l(jVar));
                ofFloat.start();
                f fVar = f.f215a;
                c cVar = f.f217c;
                if (cVar.c()) {
                    cVar.a((Object) null);
                }
                fVar.o((String) null, true);
                return;
        }
    }
}
