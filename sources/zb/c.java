package zb;

import java.util.Arrays;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final c f14273d = new c(0, new int[0], new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    public int f14274a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f14275b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f14276c;

    public c() {
        this(0, new int[8], new Object[8]);
    }

    public c(int i, int[] iArr, Object[] objArr) {
        this.f14274a = i;
        this.f14275b = iArr;
        this.f14276c = objArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14274a == cVar.f14274a && Arrays.equals(this.f14275b, cVar.f14275b) && Arrays.deepEquals(this.f14276c, cVar.f14276c);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f14275b);
        return Arrays.deepHashCode(this.f14276c) + ((hashCode + ((this.f14274a + 527) * 31)) * 31);
    }
}
