package y7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import x7.f;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final e f13525a;

    /* renamed from: b  reason: collision with root package name */
    public final f f13526b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13527c;

    /* renamed from: d  reason: collision with root package name */
    public final a f13528d = new a(false);

    /* renamed from: e  reason: collision with root package name */
    public final a f13529e = new a(true);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicMarkableReference<String> f13530f = new AtomicMarkableReference<>((Object) null, false);

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicMarkableReference<b> f13531a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReference<Callable<Void>> f13532b = new AtomicReference<>((Object) null);

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13533c;

        public a(boolean z) {
            this.f13533c = z;
            this.f13531a = new AtomicMarkableReference<>(new b(z ? LZ4Constants.HASH_TABLE_SIZE_64K : 1024), false);
        }

        public final Map<String, String> a() {
            Map<String, String> unmodifiableMap;
            b reference = this.f13531a.getReference();
            synchronized (reference) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f13494a));
            }
            return unmodifiableMap;
        }
    }

    public k(String str, c8.f fVar, f fVar2) {
        this.f13527c = str;
        this.f13525a = new e(fVar);
        this.f13526b = fVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r4 = new y7.j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r0.f13532b.compareAndSet((java.lang.Object) null, r4) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r0.f13534d.f13526b.b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            y7.k$a r0 = r3.f13528d
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicMarkableReference<y7.b> r1 = r0.f13531a     // Catch:{ all -> 0x0038 }
            java.lang.Object r1 = r1.getReference()     // Catch:{ all -> 0x0038 }
            y7.b r1 = (y7.b) r1     // Catch:{ all -> 0x0038 }
            boolean r4 = r1.b(r4, r5)     // Catch:{ all -> 0x0038 }
            if (r4 != 0) goto L_0x0014
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            goto L_0x0037
        L_0x0014:
            java.util.concurrent.atomic.AtomicMarkableReference<y7.b> r4 = r0.f13531a     // Catch:{ all -> 0x0038 }
            java.lang.Object r5 = r4.getReference()     // Catch:{ all -> 0x0038 }
            y7.b r5 = (y7.b) r5     // Catch:{ all -> 0x0038 }
            r1 = 1
            r4.set(r5, r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            y7.j r4 = new y7.j
            r4.<init>(r0)
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Callable<java.lang.Void>> r5 = r0.f13532b
            r2 = 0
            boolean r5 = r5.compareAndSet(r2, r4)
            if (r5 == 0) goto L_0x0036
            y7.k r5 = y7.k.this
            x7.f r5 = r5.f13526b
            r5.b(r4)
        L_0x0036:
            r4 = r1
        L_0x0037:
            return r4
        L_0x0038:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.k.a(java.lang.String, java.lang.String):boolean");
    }
}
