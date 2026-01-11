package le;

import ah.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b<T> extends n {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8233a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = v.F;

    public final Object a(Object obj) {
        boolean z;
        Object obj2 = this._consensus;
        r rVar = v.F;
        if (obj2 == rVar) {
            Object c10 = c(obj);
            obj2 = this._consensus;
            if (obj2 == rVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8233a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    obj2 = c10;
                } else {
                    obj2 = this._consensus;
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t10, Object obj);

    public abstract Object c(T t10);
}
