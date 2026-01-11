package me;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8590b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8591c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8592d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8593e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<g> f8594a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<l> cls = l.class;
        f8590b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f8591c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f8592d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f8593e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final g a(g gVar, boolean z) {
        if (z) {
            return b(gVar);
        }
        g gVar2 = (g) f8590b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final g b(g gVar) {
        boolean z = true;
        if (gVar.f8581b.b() != 1) {
            z = false;
        }
        if (z) {
            f8593e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return gVar;
        }
        int i = this.producerIndex & 127;
        while (this.f8594a.get(i) != null) {
            Thread.yield();
        }
        this.f8594a.lazySet(i, gVar);
        f8591c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final g d() {
        g gVar = (g) f8590b.getAndSet(this, (Object) null);
        return gVar == null ? e() : gVar;
    }

    public final g e() {
        g andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i10 = i & 127;
            if (f8592d.compareAndSet(this, i, i + 1) && (andSet = this.f8594a.getAndSet(i10, (Object) null)) != null) {
                boolean z = true;
                if (andSet.f8581b.b() != 1) {
                    z = false;
                }
                if (z) {
                    f8593e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long f(l lVar) {
        int i = lVar.consumerIndex;
        int i10 = lVar.producerIndex;
        AtomicReferenceArray<g> atomicReferenceArray = lVar.f8594a;
        while (true) {
            boolean z = true;
            if (i == i10) {
                break;
            }
            int i11 = i & 127;
            if (lVar.blockingTasksInBuffer == 0) {
                break;
            }
            g gVar = atomicReferenceArray.get(i11);
            if (gVar != null) {
                if (gVar.f8581b.b() != 1) {
                    z = false;
                }
                if (z && atomicReferenceArray.compareAndSet(i11, gVar, (Object) null)) {
                    f8593e.decrementAndGet(lVar);
                    a(gVar, false);
                    return -1;
                }
            }
            i++;
        }
        return g(lVar, true);
    }

    public final long g(l lVar, boolean z) {
        g gVar;
        boolean z10;
        do {
            gVar = (g) lVar.lastScheduledTask;
            if (gVar != null) {
                z10 = true;
                if (z) {
                    if (!(gVar.f8581b.b() == 1)) {
                        return -2;
                    }
                }
                Objects.requireNonNull(j.f8587e);
                long nanoTime = System.nanoTime() - gVar.f8580a;
                long j10 = j.f8583a;
                if (nanoTime >= j10) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8590b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(lVar, gVar, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(lVar) != gVar) {
                                z10 = false;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    return j10 - nanoTime;
                }
            } else {
                return -2;
            }
        } while (!z10);
        a(gVar, false);
        return -1;
    }
}
