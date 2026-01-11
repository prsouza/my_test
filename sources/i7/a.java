package i7;

import i7.a;
import i7.a.C0105a;
import i7.i;
import i7.l;
import i7.q0;
import java.io.IOException;
import java.util.logging.Logger;

public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0105a<MessageType, BuilderType>> implements q0 {
    public int memoizedHashCode = 0;

    /* renamed from: i7.a$a  reason: collision with other inner class name */
    public static abstract class C0105a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0105a<MessageType, BuilderType>> implements q0.a {
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public final int f(f1 f1Var) {
        int e10 = e();
        if (e10 != -1) {
            return e10;
        }
        int h10 = f1Var.h(this);
        l(h10);
        return h10;
    }

    public final byte[] g() {
        try {
            x xVar = (x) this;
            int b10 = xVar.b();
            byte[] bArr = new byte[b10];
            Logger logger = l.f6317b;
            l.b bVar = new l.b(bArr, b10);
            xVar.a(bVar);
            if (bVar.f6321e - bVar.f6322f == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(k("byte array"), e10);
        }
    }

    public final i i() {
        try {
            x xVar = (x) this;
            int b10 = xVar.b();
            i.f fVar = i.f6271b;
            byte[] bArr = new byte[b10];
            Logger logger = l.f6317b;
            l.b bVar = new l.b(bArr, b10);
            xVar.a(bVar);
            if (bVar.f6321e - bVar.f6322f == 0) {
                return new i.f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(k("ByteString"), e10);
        }
    }

    public final String k(String str) {
        StringBuilder d10 = a.a.d("Serializing ");
        d10.append(getClass().getName());
        d10.append(" to a ");
        d10.append(str);
        d10.append(" threw an IOException (should never happen).");
        return d10.toString();
    }

    public void l(int i) {
        throw new UnsupportedOperationException();
    }
}
