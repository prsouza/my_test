package uf;

import e6.e;
import java.util.concurrent.atomic.AtomicReference;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final w f11999a = new w(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f12000b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference<w>[] f12001c;

    /* renamed from: d  reason: collision with root package name */
    public static final x f12002d = new x();

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f12000b = highestOneBit;
        AtomicReference<w>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f12001c = atomicReferenceArr;
    }

    public static final void b(w wVar) {
        AtomicReference<w> a10;
        w wVar2;
        if (!(wVar.f11998f == null && wVar.g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!wVar.f11996d && (wVar2 = a10.get()) != f11999a) {
            int i = wVar2 != null ? wVar2.f11995c : 0;
            if (i < 65536) {
                wVar.f11998f = wVar2;
                wVar.f11994b = 0;
                wVar.f11995c = i + LZ4Constants.HASH_TABLE_SIZE_64K;
                if (!(a10 = f12002d.a()).compareAndSet(wVar2, wVar)) {
                    wVar.f11998f = null;
                }
            }
        }
    }

    public static final w c() {
        AtomicReference<w> a10 = f12002d.a();
        w wVar = f11999a;
        w andSet = a10.getAndSet(wVar);
        if (andSet == wVar) {
            return new w();
        }
        if (andSet == null) {
            a10.set((Object) null);
            return new w();
        }
        a10.set(andSet.f11998f);
        andSet.f11998f = null;
        andSet.f11995c = 0;
        return andSet;
    }

    public final AtomicReference<w> a() {
        Thread currentThread = Thread.currentThread();
        e.C(currentThread, "Thread.currentThread()");
        return f12001c[(int) (currentThread.getId() & (((long) f12000b) - 1))];
    }
}
