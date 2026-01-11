package a7;

import a.a;
import a7.b;
import a7.m;
import e7.d;
import h7.c0;
import h7.i0;
import h7.t;
import h7.y;
import h7.z;
import i7.a0;
import i7.p;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f149a;

    public h(c0 c0Var) {
        this.f149a = c0Var;
    }

    public static final h a(c0 c0Var) throws GeneralSecurityException {
        if (c0Var != null && c0Var.A() > 0) {
            return new h(c0Var);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public static final h c(d dVar, a aVar) throws GeneralSecurityException, IOException {
        t B = t.B(dVar.a(), p.a());
        if (B.z().size() != 0) {
            try {
                c0 E = c0.E(aVar.b(B.z().m(), new byte[0]), p.a());
                if (E.A() > 0) {
                    return new h(E);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (a0 unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentMap<java.lang.Class<?>, a7.n<?, ?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.concurrent.ConcurrentMap<java.lang.Class<?>, a7.n<?, ?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARNING: type inference failed for: r11v5, types: [java.util.concurrent.ConcurrentMap<a7.m$b, java.util.List<a7.m$a<P>>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARNING: type inference failed for: r7v12, types: [java.util.concurrent.ConcurrentMap<a7.m$b, java.util.List<a7.m$a<P>>>, java.util.concurrent.ConcurrentHashMap] */
    public final <P> P b(Class<P> cls) throws GeneralSecurityException {
        Class cls2;
        byte[] bArr;
        n nVar = (n) q.f165e.get(cls);
        if (nVar == null) {
            cls2 = null;
        } else {
            cls2 = nVar.a();
        }
        if (cls2 != null) {
            Logger logger = q.f161a;
            c0 c0Var = this.f149a;
            int i = r.f166a;
            int C = c0Var.C();
            int i10 = 0;
            boolean z = false;
            boolean z10 = true;
            for (c0.c next : c0Var.B()) {
                if (next.E() == z.ENABLED) {
                    if (!next.F()) {
                        throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.C())}));
                    } else if (next.D() == i0.UNKNOWN_PREFIX) {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.C())}));
                    } else if (next.E() != z.UNKNOWN_STATUS) {
                        if (next.C() == C) {
                            if (!z) {
                                z = true;
                            } else {
                                throw new GeneralSecurityException("keyset contains multiple primary keys");
                            }
                        }
                        if (next.B().B() != y.c.ASYMMETRIC_PUBLIC) {
                            z10 = false;
                        }
                        i10++;
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.C())}));
                    }
                }
            }
            if (i10 == 0) {
                throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
            } else if (z || z10) {
                m mVar = new m(cls2);
                for (c0.c next2 : this.f149a.B()) {
                    z E = next2.E();
                    z zVar = z.ENABLED;
                    if (E == zVar) {
                        Object d10 = q.d(next2.B().C(), next2.B().D(), cls2);
                        if (next2.E() == zVar) {
                            int i11 = b.a.f138a[next2.D().ordinal()];
                            if (i11 == 1 || i11 == 2) {
                                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(next2.C()).array();
                            } else if (i11 == 3) {
                                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(next2.C()).array();
                            } else if (i11 == 4) {
                                bArr = b.f137a;
                            } else {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                            m.a<P> aVar = new m.a<>(d10, bArr, next2.E(), next2.D());
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(aVar);
                            m.b bVar = new m.b(aVar.a());
                            List list = (List) mVar.f152a.put(bVar, Collections.unmodifiableList(arrayList));
                            if (list != null) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.addAll(list);
                                arrayList2.add(aVar);
                                mVar.f152a.put(bVar, Collections.unmodifiableList(arrayList2));
                            }
                            if (next2.C() != this.f149a.C()) {
                                continue;
                            } else if (aVar.f157c != zVar) {
                                throw new IllegalArgumentException("the primary entry has to be ENABLED");
                            } else if (!mVar.a(aVar.a()).isEmpty()) {
                                mVar.f153b = aVar;
                            } else {
                                throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                            }
                        } else {
                            throw new GeneralSecurityException("only ENABLED key is allowed");
                        }
                    }
                }
                n nVar2 = (n) q.f165e.get(cls);
                if (nVar2 == null) {
                    throw new GeneralSecurityException(androidx.activity.result.d.a(mVar.f154c, a.d("No wrapper found for ")));
                } else if (nVar2.a().equals(mVar.f154c)) {
                    return nVar2.b(mVar);
                } else {
                    StringBuilder d11 = a.d("Wrong input primitive class, expected ");
                    d11.append(nVar2.a());
                    d11.append(", got ");
                    d11.append(mVar.f154c);
                    throw new GeneralSecurityException(d11.toString());
                }
            } else {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
        } else {
            throw new GeneralSecurityException(androidx.activity.result.d.a(cls, a.d("No wrapper found for ")));
        }
    }

    public final String toString() {
        return r.a(this.f149a).toString();
    }
}
