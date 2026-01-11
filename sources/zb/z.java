package zb;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import zb.t;

public final class z<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    public static final z f14390b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f14391a = true;

    static {
        z zVar = new z(Collections.emptyMap());
        f14390b = zVar;
        zVar.f14391a = false;
    }

    public z() {
    }

    public z(Map<K, V> map) {
        super(map);
    }

    public static int a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = t.f14377a;
            int length = bArr.length;
            int i = length;
            for (int i10 = 0; i10 < 0 + length; i10++) {
                i = (i * 31) + bArr[i10];
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof t.a)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(z<K, V> zVar) {
        d();
        if (!zVar.isEmpty()) {
            d();
            super.putAll(zVar);
        }
    }

    public final void clear() {
        d();
        clear();
    }

    public final void d() {
        if (!this.f14391a) {
            throw new UnsupportedOperationException();
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005e
            java.util.Map r7 = (java.util.Map) r7
            if (r6 != r7) goto L_0x000b
            goto L_0x005a
        L_0x000b:
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x005a
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0058
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
        L_0x0058:
            r7 = r2
            goto L_0x005b
        L_0x005a:
            r7 = r1
        L_0x005b:
            if (r7 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = r2
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.z.equals(java.lang.Object):boolean");
    }

    public final z<K, V> g() {
        return isEmpty() ? new z<>() : new z<>(this);
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i;
    }

    public final V put(K k10, V v10) {
        d();
        return super.put(k10, v10);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        d();
        super.putAll(map);
    }

    public final V remove(Object obj) {
        d();
        return super.remove(obj);
    }
}
