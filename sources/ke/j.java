package ke;

import ge.g1;
import ge.o;
import le.q;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.f;
import xd.p;
import yd.h;

public final class j extends h implements p<Integer, f.a, Integer> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h<?> f7526b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(h<?> hVar) {
        super(2);
        this.f7526b = hVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        f.a aVar = (f.a) obj2;
        f.b key = aVar.getKey();
        f.a aVar2 = this.f7526b.f7519b.get(key);
        int i = g1.f5400e;
        if (key != g1.b.f5401a) {
            return Integer.valueOf(aVar != aVar2 ? LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK : intValue + 1);
        }
        g1 g1Var = (g1) aVar2;
        g1 g1Var2 = (g1) aVar;
        while (true) {
            if (g1Var2 != null) {
                if (g1Var2 == g1Var || !(g1Var2 instanceof q)) {
                    break;
                }
                o K = ((q) g1Var2).K();
                g1Var2 = K == null ? null : K.getParent();
            } else {
                g1Var2 = null;
                break;
            }
        }
        if (g1Var2 == g1Var) {
            if (g1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + g1Var2 + ", expected child of " + g1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
