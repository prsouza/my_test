package a7;

import a.a;
import a7.g;
import androidx.activity.result.d;
import h7.y;
import i7.a0;
import i7.i;
import i7.q0;
import java.security.GeneralSecurityException;

public final class e<PrimitiveT, KeyProtoT extends q0> implements d<PrimitiveT> {

    /* renamed from: a  reason: collision with root package name */
    public final g<KeyProtoT> f139a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<PrimitiveT> f140b;

    public e(g<KeyProtoT> gVar, Class<PrimitiveT> cls) {
        if (gVar.f145b.keySet().contains(cls) || Void.class.equals(cls)) {
            this.f139a = gVar;
            this.f140b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{gVar.toString(), cls.getName()}));
    }

    public final PrimitiveT a(i iVar) throws GeneralSecurityException {
        try {
            KeyProtoT e10 = this.f139a.e(iVar);
            if (!Void.class.equals(this.f140b)) {
                this.f139a.f(e10);
                return this.f139a.b(e10, this.f140b);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        } catch (a0 e11) {
            throw new GeneralSecurityException(d.a(this.f139a.f144a, a.d("Failures parsing proto of type ")), e11);
        }
    }

    public final q0 b(i iVar) throws GeneralSecurityException {
        try {
            g.a c10 = this.f139a.c();
            q0 b10 = c10.b(iVar);
            c10.c(b10);
            return (q0) c10.a(b10);
        } catch (a0 e10) {
            throw new GeneralSecurityException(d.a(this.f139a.c().f147a, a.d("Failures parsing proto of type ")), e10);
        }
    }

    public final y c(i iVar) throws GeneralSecurityException {
        try {
            g.a c10 = this.f139a.c();
            q0 b10 = c10.b(iVar);
            c10.c(b10);
            y.b E = y.E();
            String a10 = this.f139a.a();
            E.m();
            y.x((y) E.f6389b, a10);
            i i = ((q0) c10.a(b10)).i();
            E.m();
            y.y((y) E.f6389b, i);
            y.c d10 = this.f139a.d();
            E.m();
            y.z((y) E.f6389b, d10);
            return (y) E.k();
        } catch (a0 e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }
}
