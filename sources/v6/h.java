package v6;

import ah.v;
import java.util.AbstractMap;
import java.util.Map;

public final class h<K, V> extends d<K, V> {

    /* renamed from: v  reason: collision with root package name */
    public static final d<Object, Object> f12312v = new h((Object) null, new Object[0], 0);

    /* renamed from: s  reason: collision with root package name */
    public final transient Object f12313s;

    /* renamed from: t  reason: collision with root package name */
    public final transient Object[] f12314t;

    /* renamed from: u  reason: collision with root package name */
    public final transient int f12315u;

    public static class a<K, V> extends e<Map.Entry<K, V>> {

        /* renamed from: s  reason: collision with root package name */
        public final transient d<K, V> f12316s;

        /* renamed from: t  reason: collision with root package name */
        public final transient Object[] f12317t;

        /* renamed from: u  reason: collision with root package name */
        public final transient int f12318u = 0;

        /* renamed from: v  reason: collision with root package name */
        public final transient int f12319v;

        /* renamed from: v6.h$a$a  reason: collision with other inner class name */
        public class C0237a extends c<Map.Entry<K, V>> {
            public C0237a() {
            }

            public final Object get(int i) {
                aa.b.t(i, a.this.f12319v);
                a aVar = a.this;
                Object[] objArr = aVar.f12317t;
                int i10 = i * 2;
                int i11 = aVar.f12318u;
                return new AbstractMap.SimpleImmutableEntry(objArr[i10 + i11], objArr[i10 + (i11 ^ 1)]);
            }

            public final int size() {
                return a.this.f12319v;
            }
        }

        public a(d dVar, Object[] objArr, int i) {
            this.f12316s = dVar;
            this.f12317t = objArr;
            this.f12319v = i;
        }

        public final int b(Object[] objArr) {
            return i().b(objArr);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f12316s.get(key))) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        public final k<Map.Entry<K, V>> iterator() {
            return i().listIterator(0);
        }

        public final c<Map.Entry<K, V>> l() {
            return new C0237a();
        }

        public final int size() {
            return this.f12319v;
        }
    }

    public static final class b<K> extends e<K> {

        /* renamed from: s  reason: collision with root package name */
        public final transient d<K, ?> f12321s;

        /* renamed from: t  reason: collision with root package name */
        public final transient c<K> f12322t;

        public b(d<K, ?> dVar, c<K> cVar) {
            this.f12321s = dVar;
            this.f12322t = cVar;
        }

        public final int b(Object[] objArr) {
            return this.f12322t.b(objArr);
        }

        public final boolean contains(Object obj) {
            return this.f12321s.get(obj) != null;
        }

        /* renamed from: h */
        public final k<K> iterator() {
            return this.f12322t.listIterator(0);
        }

        public final c<K> i() {
            return this.f12322t;
        }

        public final int size() {
            return ((h) this.f12321s).f12315u;
        }
    }

    public static final class c extends c<Object> {

        /* renamed from: c  reason: collision with root package name */
        public final transient Object[] f12323c;

        /* renamed from: s  reason: collision with root package name */
        public final transient int f12324s;

        /* renamed from: t  reason: collision with root package name */
        public final transient int f12325t;

        public c(Object[] objArr, int i, int i10) {
            this.f12323c = objArr;
            this.f12324s = i;
            this.f12325t = i10;
        }

        public final Object get(int i) {
            aa.b.t(i, this.f12325t);
            return this.f12323c[(i * 2) + this.f12324s];
        }

        public final int size() {
            return this.f12325t;
        }
    }

    public h(Object obj, Object[] objArr, int i) {
        this.f12313s = obj;
        this.f12314t = objArr;
        this.f12315u = i;
    }

    public static IllegalArgumentException d(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb2 = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb2.append("Multiple entries with same key: ");
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        sb2.append(" and ");
        sb2.append(valueOf3);
        sb2.append("=");
        sb2.append(valueOf4);
        return new IllegalArgumentException(sb2.toString());
    }

    public final V get(Object obj) {
        Object obj2 = this.f12313s;
        V[] vArr = this.f12314t;
        int i = this.f12315u;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (vArr[0].equals(obj)) {
                return vArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int q02 = v.q0(obj.hashCode());
                while (true) {
                    int i10 = q02 & length;
                    byte b10 = bArr[i10] & 255;
                    if (b10 == 255) {
                        return null;
                    }
                    if (vArr[b10].equals(obj)) {
                        return vArr[b10 ^ 1];
                    }
                    q02 = i10 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int q03 = v.q0(obj.hashCode());
                while (true) {
                    int i11 = q03 & length2;
                    short s10 = sArr[i11] & 65535;
                    if (s10 == 65535) {
                        return null;
                    }
                    if (vArr[s10].equals(obj)) {
                        return vArr[s10 ^ 1];
                    }
                    q03 = i11 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int q04 = v.q0(obj.hashCode());
                while (true) {
                    int i12 = q04 & length3;
                    int i13 = iArr[i12];
                    if (i13 == -1) {
                        return null;
                    }
                    if (vArr[i13].equals(obj)) {
                        return vArr[i13 ^ 1];
                    }
                    q04 = i12 + 1;
                }
            }
        }
    }

    public final int size() {
        return this.f12315u;
    }
}
