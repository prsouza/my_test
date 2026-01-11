package b3;

import l1.c;
import l1.d;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public Object f2856a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2857b;

    public /* synthetic */ b() {
    }

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f2856a = obj;
        this.f2857b = obj2;
    }

    public String a() {
        return (String) this.f2856a;
    }

    public void c(c cVar) {
        Object[] objArr = (Object[]) this.f2857b;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    cVar.D(i);
                } else if (obj instanceof byte[]) {
                    cVar.g0(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    cVar.G(i, (double) ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    cVar.G(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    cVar.X(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    cVar.X(i, (long) ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    cVar.X(i, (long) ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    cVar.X(i, (long) ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    cVar.r(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    cVar.X(i, ((Boolean) obj).booleanValue() ? 1 : 0);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
            }
        }
    }
}
