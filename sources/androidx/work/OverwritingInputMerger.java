package androidx.work;

import androidx.work.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import u1.j;

public final class OverwritingInputMerger extends j {
    public final b a(List<b> list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((b) it.next()).f2651a));
        }
        aVar.b(hashMap);
        return aVar.a();
    }
}
