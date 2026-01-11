package androidx.emoji2.text;

import androidx.emoji2.text.d;
import java.util.concurrent.ThreadPoolExecutor;

public final class f extends d.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.h f1720a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1721b;

    public f(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1720a = hVar;
        this.f1721b = threadPoolExecutor;
    }

    public final void a(Throwable th2) {
        try {
            this.f1720a.a(th2);
        } finally {
            this.f1721b.shutdown();
        }
    }

    public final void b(o oVar) {
        try {
            this.f1720a.b(oVar);
        } finally {
            this.f1721b.shutdown();
        }
    }
}
