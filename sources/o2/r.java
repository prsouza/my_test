package o2;

import a3.c;
import java.util.ArrayList;
import java.util.Iterator;

public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f9294a;

    public r(s sVar) {
        this.f9294a = sVar;
    }

    public final void run() {
        if (this.f9294a.f9299d != null) {
            q<T> qVar = this.f9294a.f9299d;
            V v10 = qVar.f9292a;
            if (v10 != null) {
                s sVar = this.f9294a;
                synchronized (sVar) {
                    Iterator it = new ArrayList(sVar.f9296a).iterator();
                    while (it.hasNext()) {
                        ((n) it.next()).a(v10);
                    }
                }
                return;
            }
            s sVar2 = this.f9294a;
            Throwable th2 = qVar.f9293b;
            synchronized (sVar2) {
                ArrayList arrayList = new ArrayList(sVar2.f9297b);
                if (arrayList.isEmpty()) {
                    c.c("Lottie encountered an error but no failure listener was added:", th2);
                    return;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((n) it2.next()).a(th2);
                }
            }
        }
    }
}
