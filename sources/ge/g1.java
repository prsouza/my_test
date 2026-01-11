package ge;

import java.util.concurrent.CancellationException;
import md.m;
import pd.d;
import pd.f;
import xd.l;

public interface g1 extends f.a {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f5400e = 0;

    public static final class a {
        public static /* synthetic */ q0 b(g1 g1Var, boolean z, boolean z10, l lVar, int i, Object obj) {
            boolean z11 = false;
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z11 = true;
            }
            return g1Var.T(z, z11, lVar);
        }
    }

    public static final class b implements f.b<g1> {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f5401a = new b();
    }

    o B(q qVar);

    CancellationException S();

    q0 T(boolean z, boolean z10, l<? super Throwable, m> lVar);

    boolean a();

    void c(CancellationException cancellationException);

    boolean start();

    Object t(d<? super m> dVar);

    ee.d<g1> y();
}
