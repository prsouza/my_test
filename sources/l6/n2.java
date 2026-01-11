package l6;

import ah.v;
import androidx.lifecycle.i0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import t6.h;
import t6.j;
import t6.q;

public final /* synthetic */ class n2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o2 f7948a;

    public /* synthetic */ n2(o2 o2Var) {
        this.f7948a = o2Var;
    }

    public final void run() {
        o2 o2Var = this.f7948a;
        v2 v2Var = (v2) o2Var.f7961b.zza();
        a0 a0Var = o2Var.f7960a;
        Objects.requireNonNull(a0Var);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            Iterator it = ((ArrayList) a0Var.h()).iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                String u10 = a0Var.u(file.getName());
                e0 e0Var = null;
                if (u10 != null) {
                    File file2 = new File(u10, "assets");
                    if (!file2.isDirectory()) {
                        a0.f7781c.c("Failed to find assets directory: %s", file2);
                    } else {
                        e0Var = new e0(u10, file2.getCanonicalPath());
                    }
                }
                if (e0Var != null) {
                    hashMap2.put(file.getName(), e0Var);
                }
            }
        } catch (IOException e10) {
            a0.f7781c.c("Could not process directory while scanning installed packs: %s", e10);
        }
        for (String str : hashMap2.keySet()) {
            hashMap.put(str, Long.valueOf(a0Var.l(str)));
        }
        q d10 = v2Var.d(hashMap);
        a0 a0Var2 = o2Var.f7960a;
        Objects.requireNonNull(a0Var2);
        d10.f11423b.a(new j((Executor) o2Var.f7963d.zza(), new i0((Object) a0Var2)));
        d10.g();
        d10.f11423b.a(new h((Executor) o2Var.f7963d.zza(), v.D));
        d10.g();
    }
}
