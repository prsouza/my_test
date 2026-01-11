package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import androidx.emoji2.text.j;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer.b f1717a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.h f1718b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1719c;

    public /* synthetic */ e(EmojiCompatInitializer.b bVar, d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1717a = bVar;
        this.f1718b = hVar;
        this.f1719c = threadPoolExecutor;
    }

    public final void run() {
        EmojiCompatInitializer.b bVar = this.f1717a;
        d.h hVar = this.f1718b;
        ThreadPoolExecutor threadPoolExecutor = this.f1719c;
        Objects.requireNonNull(bVar);
        try {
            j a10 = c.a(bVar.f1697a);
            if (a10 != null) {
                j.b bVar2 = (j.b) a10.f1711a;
                synchronized (bVar2.f1744d) {
                    bVar2.f1746f = threadPoolExecutor;
                }
                a10.f1711a.a(new f(hVar, threadPoolExecutor));
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th2) {
            hVar.a(th2);
            threadPoolExecutor.shutdown();
        }
    }
}
