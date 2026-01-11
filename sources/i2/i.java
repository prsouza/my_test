package i2;

import aa.a;
import aa.c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

public final class i extends z<AtomicLongArray> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f5982a;

    public i(z zVar) {
        this.f5982a = zVar;
    }

    public final Object read(a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.e();
        while (aVar.a0()) {
            arrayList.add(Long.valueOf(((Number) this.f5982a.read(aVar)).longValue()));
        }
        aVar.R();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    public final void write(c cVar, Object obj) {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        cVar.B();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.f5982a.write(cVar, Long.valueOf(atomicLongArray.get(i)));
        }
        cVar.T();
    }
}
