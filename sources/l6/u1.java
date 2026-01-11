package l6;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public final /* synthetic */ class u1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f8044a;

    public /* synthetic */ u1(a0 a0Var) {
        this.f8044a = a0Var;
    }

    public final void run() {
        a0 a0Var = this.f8044a;
        Iterator it = ((ArrayList) a0Var.h()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.listFiles() != null) {
                a0.i(file);
                long d10 = a0.d(file, false);
                if (((long) a0Var.f7783b.a()) != d10) {
                    try {
                        new File(new File(file, String.valueOf(d10)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        a0.f7781c.c("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File i : file.listFiles()) {
                    a0.i(i);
                }
            }
        }
    }
}
