package androidx.lifecycle;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import l6.a0;
import l6.s0;
import l6.u2;
import o6.z;
import t6.c;

public final class i0 implements z, c {

    /* renamed from: a  reason: collision with root package name */
    public Object f2124a;

    public /* synthetic */ i0(Object obj) {
        this.f2124a = obj;
    }

    public void onSuccess(Object obj) {
        a0 a0Var = (a0) this.f2124a;
        List list = (List) obj;
        int a10 = a0Var.f7783b.a();
        Iterator it = ((ArrayList) a0Var.h()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!list.contains(file.getName()) && a0.d(file, true) != ((long) a10)) {
                a0.j(file);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object zza() {
        return new s0(((u2) ((z) this.f2124a)).a());
    }

    public /* synthetic */ i0(int i) {
        if (i != 1) {
            this.f2124a = new HashMap();
        } else {
            this.f2124a = new LinkedHashSet();
        }
    }
}
