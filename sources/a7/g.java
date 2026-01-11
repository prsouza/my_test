package a7;

import h7.y;
import i7.a0;
import i7.i;
import i7.q0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class g<KeyProtoT extends q0> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<KeyProtoT> f144a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, b<?, KeyProtoT>> f145b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f146c;

    public static abstract class a<KeyFormatProtoT extends q0, KeyT> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<KeyFormatProtoT> f147a;

        public a(Class<KeyFormatProtoT> cls) {
            this.f147a = cls;
        }

        public abstract KeyT a(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        public abstract KeyFormatProtoT b(i iVar) throws a0;

        public abstract void c(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
    }

    public static abstract class b<PrimitiveT, KeyT> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<PrimitiveT> f148a;

        public b(Class<PrimitiveT> cls) {
            this.f148a = cls;
        }

        public abstract PrimitiveT a(KeyT keyt) throws GeneralSecurityException;
    }

    @SafeVarargs
    public g(Class<KeyProtoT> cls, b<?, KeyProtoT>... bVarArr) {
        this.f144a = cls;
        HashMap hashMap = new HashMap();
        int length = bVarArr.length;
        int i = 0;
        while (i < length) {
            b<?, KeyProtoT> bVar = bVarArr[i];
            if (!hashMap.containsKey(bVar.f148a)) {
                hashMap.put(bVar.f148a, bVar);
                i++;
            } else {
                StringBuilder d10 = a.a.d("KeyTypeManager constructed with duplicate factories for primitive ");
                d10.append(bVar.f148a.getCanonicalName());
                throw new IllegalArgumentException(d10.toString());
            }
        }
        if (bVarArr.length > 0) {
            this.f146c = bVarArr[0].f148a;
        } else {
            this.f146c = Void.class;
        }
        this.f145b = Collections.unmodifiableMap(hashMap);
    }

    public abstract String a();

    public final <P> P b(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        b bVar = this.f145b.get(cls);
        if (bVar != null) {
            return bVar.a(keyprotot);
        }
        StringBuilder d10 = a.a.d("Requested primitive class ");
        d10.append(cls.getCanonicalName());
        d10.append(" not supported.");
        throw new IllegalArgumentException(d10.toString());
    }

    public abstract a<?, KeyProtoT> c();

    public abstract y.c d();

    public abstract KeyProtoT e(i iVar) throws a0;

    public abstract void f(KeyProtoT keyprotot) throws GeneralSecurityException;
}
