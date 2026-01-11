package k3;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f7403a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final b f7404b = new b();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ReentrantLock f7405a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f7406b;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<a> f7407a = new ArrayDeque();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.String, k3.c$a>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.Map<java.lang.String, k3.c$a>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.Queue<k3.c$a>, java.util.ArrayDeque] */
    /* JADX WARNING: type inference failed for: r6v9, types: [java.util.Queue<k3.c$a>, java.util.ArrayDeque] */
    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f7403a.get(str);
            Objects.requireNonNull(obj, "Argument must not be null");
            aVar = (a) obj;
            int i = aVar.f7406b;
            if (i >= 1) {
                int i10 = i - 1;
                aVar.f7406b = i10;
                if (i10 == 0) {
                    a aVar2 = (a) this.f7403a.remove(str);
                    if (aVar2.equals(aVar)) {
                        b bVar = this.f7404b;
                        synchronized (bVar.f7407a) {
                            if (bVar.f7407a.size() < 10) {
                                bVar.f7407a.offer(aVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f7406b);
            }
        }
        aVar.f7405a.unlock();
    }
}
