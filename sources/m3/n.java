package m3;

import c4.g;
import c4.j;
import java.util.ArrayDeque;
import java.util.Queue;

public final class n<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final g<a<A>, B> f8421a = new m();

    public static final class a<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final Queue<a<?>> f8422d = new ArrayDeque(0);

        /* renamed from: a  reason: collision with root package name */
        public int f8423a;

        /* renamed from: b  reason: collision with root package name */
        public int f8424b;

        /* renamed from: c  reason: collision with root package name */
        public A f8425c;

        static {
            char[] cArr = j.f3244a;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Queue<m3.n$a<?>>, java.util.ArrayDeque] */
        public static <A> a a(Object obj) {
            a aVar;
            ? r02 = f8422d;
            synchronized (r02) {
                aVar = (a) r02.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f8425c = obj;
            aVar.f8424b = 0;
            aVar.f8423a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f8424b == aVar.f8424b && this.f8423a == aVar.f8423a && this.f8425c.equals(aVar.f8425c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f8425c.hashCode() + (((this.f8423a * 31) + this.f8424b) * 31);
        }
    }
}
