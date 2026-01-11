package zb;

import a.b;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.logging.Logger;
import zb.a;
import zb.a.C0285a;
import zb.a0;
import zb.n;

public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0285a<MessageType, BuilderType>> implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public int f14272a = 0;

    /* renamed from: zb.a$a  reason: collision with other inner class name */
    public static abstract class C0285a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0285a<MessageType, BuilderType>> implements a0.a {
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1 = a.b.q("Reading ");
            r1.append(getClass().getName());
            r1.append(" from a ");
            r1.append("byte array");
            r1.append(" threw an IOException (should never happen).");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
            throw new java.lang.RuntimeException(r1.toString(), r4);
         */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x001f A[ExcHandler: IOException (r4v2 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0001] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final BuilderType d(byte[] r4) {
            /*
                r3 = this;
                int r0 = r4.length
                zb.m r1 = new zb.m     // Catch:{ u -> 0x004a, IOException -> 0x001f }
                r2 = 0
                r1.<init>(r4, r0)     // Catch:{ u -> 0x004a, IOException -> 0x001f }
                r1.d(r0)     // Catch:{ u -> 0x0018, IOException -> 0x001f }
                zb.p r4 = zb.p.a()     // Catch:{ u -> 0x004a, IOException -> 0x001f }
                r0 = r3
                zb.r$a r0 = (zb.r.a) r0     // Catch:{ u -> 0x004a, IOException -> 0x001f }
                r0.g(r1, r4)     // Catch:{ u -> 0x004a, IOException -> 0x001f }
                r1.c(r2)     // Catch:{ u -> 0x004a, IOException -> 0x001f }
                return r3
            L_0x0018:
                r4 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ u -> 0x004a, IOException -> 0x001f }
                r0.<init>(r4)     // Catch:{ u -> 0x004a, IOException -> 0x001f }
                throw r0     // Catch:{ u -> 0x004a, IOException -> 0x001f }
            L_0x001f:
                r4 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Reading "
                java.lang.StringBuilder r1 = a.b.q(r1)
                java.lang.Class r2 = r3.getClass()
                java.lang.String r2 = r2.getName()
                r1.append(r2)
                java.lang.String r2 = " from a "
                r1.append(r2)
                java.lang.String r2 = "byte array"
                r1.append(r2)
                java.lang.String r2 = " threw an IOException (should never happen)."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1, r4)
                throw r0
            L_0x004a:
                r4 = move-exception
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: zb.a.C0285a.d(byte[]):zb.a$a");
        }
    }

    public static <T> void d(Iterable<T> iterable, Collection<? super T> collection) {
        if (iterable instanceof x) {
            Iterator<T> it = ((x) iterable).a().iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
        } else if (iterable instanceof Collection) {
            for (T requireNonNull : iterable) {
                Objects.requireNonNull(requireNonNull);
            }
        } else {
            for (T next : iterable) {
                Objects.requireNonNull(next);
                ((d) collection).add(next);
            }
            return;
        }
        collection.addAll((Collection) iterable);
    }

    public final byte[] e() {
        try {
            int a10 = a();
            byte[] bArr = new byte[a10];
            Logger logger = n.f14346v;
            n.b bVar = new n.b(bArr, a10);
            c(bVar);
            if (bVar.z - bVar.A == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            StringBuilder q10 = b.q("Serializing ");
            q10.append(getClass().getName());
            q10.append(" to a ");
            q10.append("byte array");
            q10.append(" threw an IOException (should never happen).");
            throw new RuntimeException(q10.toString(), e10);
        }
    }
}
