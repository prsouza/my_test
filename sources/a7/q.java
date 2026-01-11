package a7;

import h7.a0;
import h7.y;
import i7.i;
import i7.q0;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f161a = Logger.getLogger(q.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentMap<String, a> f162b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentMap<String, Object> f163c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentMap<String, Boolean> f164d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentMap<Class<?>, n<?, ?>> f165e = new ConcurrentHashMap();

    public interface a {
        <P> d<P> a(Class<P> cls) throws GeneralSecurityException;

        d<?> b();

        Class<?> c();

        Set<Class<?>> d();
    }

    static {
        new ConcurrentHashMap();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentMap<java.lang.String, a7.q$a>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(java.lang.String r5, java.lang.Class<?> r6, boolean r7) throws java.security.GeneralSecurityException {
        /*
            java.lang.Class<a7.q> r0 = a7.q.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, a7.q$a> r1 = f162b     // Catch:{ all -> 0x0081 }
            boolean r2 = r1.containsKey(r5)     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0081 }
            a7.q$a r1 = (a7.q.a) r1     // Catch:{ all -> 0x0081 }
            java.lang.Class r2 = r1.c()     // Catch:{ all -> 0x0081 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x0047
            if (r7 == 0) goto L_0x0045
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r6 = f164d     // Catch:{ all -> 0x0081 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0081 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0081 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0081 }
            if (r6 == 0) goto L_0x002e
            goto L_0x0045
        L_0x002e:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r7.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "New keys are already disallowed for key type "
            r7.append(r1)     // Catch:{ all -> 0x0081 }
            r7.append(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0081 }
            r6.<init>(r5)     // Catch:{ all -> 0x0081 }
            throw r6     // Catch:{ all -> 0x0081 }
        L_0x0045:
            monitor-exit(r0)
            return
        L_0x0047:
            java.util.logging.Logger r7 = f161a     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            r2.append(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0081 }
            r7.warning(r2)     // Catch:{ all -> 0x0081 }
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0081 }
            r4 = 0
            r3[r4] = r5     // Catch:{ all -> 0x0081 }
            r5 = 1
            java.lang.Class r1 = r1.c()     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0081 }
            r3[r5] = r1     // Catch:{ all -> 0x0081 }
            r5 = 2
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0081 }
            r3[r5] = r6     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0081 }
            r7.<init>(r5)     // Catch:{ all -> 0x0081 }
            throw r7     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.q.a(java.lang.String, java.lang.Class, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentMap<java.lang.String, a7.q$a>, java.util.concurrent.ConcurrentHashMap] */
    public static synchronized a b(String str) throws GeneralSecurityException {
        a aVar;
        synchronized (q.class) {
            ? r12 = f162b;
            if (r12.containsKey(str)) {
                aVar = (a) r12.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
        }
        return aVar;
    }

    public static <P> Object c(String str, byte[] bArr) throws GeneralSecurityException {
        i.f fVar = i.f6271b;
        return d(str, i.e(bArr, 0, bArr.length), a.class);
    }

    public static <P> P d(String str, i iVar, Class<P> cls) throws GeneralSecurityException {
        a b10 = b(str);
        if (b10.d().contains(cls)) {
            return ((e) b10.a(cls)).a(iVar);
        }
        StringBuilder d10 = a.a.d("Primitive type ");
        d10.append(cls.getName());
        d10.append(" not supported by key manager of type ");
        d10.append(b10.c());
        d10.append(", supported primitives: ");
        Set<Class<?>> d11 = b10.d();
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        for (Class next : d11) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(next.getCanonicalName());
            z = false;
        }
        d10.append(sb2.toString());
        throw new GeneralSecurityException(d10.toString());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    public static synchronized y e(a0 a0Var) throws GeneralSecurityException {
        y c10;
        synchronized (q.class) {
            d<?> b10 = b(a0Var.C()).b();
            if (((Boolean) f164d.get(a0Var.C())).booleanValue()) {
                c10 = ((e) b10).c(a0Var.D());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.C());
            }
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.concurrent.ConcurrentMap<java.lang.String, a7.q$a>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object>] */
    public static synchronized <KeyProtoT extends q0> void f(g<KeyProtoT> gVar, boolean z) throws GeneralSecurityException {
        synchronized (q.class) {
            String a10 = gVar.a();
            a(a10, gVar.getClass(), z);
            ? r22 = f162b;
            if (!r22.containsKey(a10)) {
                r22.put(a10, new o(gVar));
                f163c.put(a10, new p());
            }
            f164d.put(a10, Boolean.valueOf(z));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.concurrent.ConcurrentMap<java.lang.Class<?>, a7.n<?, ?>>, java.util.concurrent.ConcurrentHashMap] */
    public static synchronized <B, P> void g(n<B, P> nVar) throws GeneralSecurityException {
        synchronized (q.class) {
            Class<P> c10 = nVar.c();
            ? r22 = f165e;
            if (r22.containsKey(c10)) {
                n nVar2 = (n) r22.get(c10);
                if (!nVar.getClass().equals(nVar2.getClass())) {
                    Logger logger = f161a;
                    logger.warning("Attempted overwrite of a registered SetWrapper for type " + c10);
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{c10.getName(), nVar2.getClass().getName(), nVar.getClass().getName()}));
                }
            }
            r22.put(c10, nVar);
        }
    }
}
