package androidx.work;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import u1.p;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f2649b = p.e("Data");

    /* renamed from: c  reason: collision with root package name */
    public static final b f2650c;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f2651a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Object> f2652a = new HashMap();

        public final b a() {
            b bVar = new b((Map<String, ?>) this.f2652a);
            b.b(bVar);
            return bVar;
        }

        /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r2v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r2v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r2v5, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r2v6, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r2v7, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r0v13, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        public final a b(Map<String, Object> map) {
            for (Map.Entry next : map.entrySet()) {
                Object obj = (String) next.getKey();
                Object value = next.getValue();
                if (value == null) {
                    this.f2652a.put(obj, (Object) null);
                } else {
                    Object obj2 = value.getClass();
                    if (obj2 == Boolean.class || obj2 == Byte.class || obj2 == Integer.class || obj2 == Long.class || obj2 == Float.class || obj2 == Double.class || obj2 == String.class || obj2 == Boolean[].class || obj2 == Byte[].class || obj2 == Integer[].class || obj2 == Long[].class || obj2 == Float[].class || obj2 == Double[].class || obj2 == String[].class) {
                        this.f2652a.put(obj, value);
                    } else {
                        int i = 0;
                        if (obj2 == boolean[].class) {
                            ? r22 = this.f2652a;
                            boolean[] zArr = (boolean[]) value;
                            String str = b.f2649b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i < zArr.length) {
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                                i++;
                            }
                            r22.put(obj, boolArr);
                        } else if (obj2 == byte[].class) {
                            ? r23 = this.f2652a;
                            byte[] bArr = (byte[]) value;
                            String str2 = b.f2649b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i < bArr.length) {
                                bArr2[i] = Byte.valueOf(bArr[i]);
                                i++;
                            }
                            r23.put(obj, bArr2);
                        } else if (obj2 == int[].class) {
                            ? r24 = this.f2652a;
                            int[] iArr = (int[]) value;
                            String str3 = b.f2649b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i < iArr.length) {
                                numArr[i] = Integer.valueOf(iArr[i]);
                                i++;
                            }
                            r24.put(obj, numArr);
                        } else if (obj2 == long[].class) {
                            ? r25 = this.f2652a;
                            long[] jArr = (long[]) value;
                            String str4 = b.f2649b;
                            Long[] lArr = new Long[jArr.length];
                            while (i < jArr.length) {
                                lArr[i] = Long.valueOf(jArr[i]);
                                i++;
                            }
                            r25.put(obj, lArr);
                        } else if (obj2 == float[].class) {
                            ? r26 = this.f2652a;
                            float[] fArr = (float[]) value;
                            String str5 = b.f2649b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i < fArr.length) {
                                fArr2[i] = Float.valueOf(fArr[i]);
                                i++;
                            }
                            r26.put(obj, fArr2);
                        } else if (obj2 == double[].class) {
                            ? r27 = this.f2652a;
                            double[] dArr = (double[]) value;
                            String str6 = b.f2649b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i < dArr.length) {
                                dArr2[i] = Double.valueOf(dArr[i]);
                                i++;
                            }
                            r27.put(obj, dArr2);
                        } else {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{obj, obj2}));
                        }
                    }
                }
            }
            return this;
        }
    }

    static {
        b bVar = new b((Map<String, ?>) new HashMap());
        b(bVar);
        f2650c = bVar;
    }

    public b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[SYNTHETIC, Splitter:B:24:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b A[SYNTHETIC, Splitter:B:36:0x006b] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0035=Splitter:B:14:0x0035, B:28:0x0058=Splitter:B:28:0x0058} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.b a(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L_0x0080
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0041, all -> 0x003d }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0041, all -> 0x003d }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
        L_0x001b:
            if (r7 <= 0) goto L_0x002b
            java.lang.String r4 = r3.readUTF()     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
            java.lang.Object r5 = r3.readObject()     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
            r1.put(r4, r5)     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
            int r7 = r7 + -1
            goto L_0x001b
        L_0x002b:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0035
        L_0x002f:
            r7 = move-exception
            java.lang.String r3 = f2649b
            android.util.Log.e(r3, r0, r7)
        L_0x0035:
            r2.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0062
        L_0x0039:
            r7 = move-exception
            goto L_0x0047
        L_0x003b:
            r7 = move-exception
            goto L_0x0047
        L_0x003d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L_0x0069
        L_0x0041:
            r3 = move-exception
            goto L_0x0044
        L_0x0043:
            r3 = move-exception
        L_0x0044:
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x0047:
            java.lang.String r4 = f2649b     // Catch:{ all -> 0x0068 }
            android.util.Log.e(r4, r0, r7)     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x0058
            r3.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r7 = move-exception
            java.lang.String r3 = f2649b
            android.util.Log.e(r3, r0, r7)
        L_0x0058:
            r2.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0062
        L_0x005c:
            r7 = move-exception
            java.lang.String r2 = f2649b
            android.util.Log.e(r2, r0, r7)
        L_0x0062:
            androidx.work.b r7 = new androidx.work.b
            r7.<init>((java.util.Map<java.lang.String, ?>) r1)
            return r7
        L_0x0068:
            r7 = move-exception
        L_0x0069:
            if (r3 == 0) goto L_0x0075
            r3.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x0075
        L_0x006f:
            r1 = move-exception
            java.lang.String r3 = f2649b
            android.util.Log.e(r3, r0, r1)
        L_0x0075:
            r2.close()     // Catch:{ IOException -> 0x0079 }
            goto L_0x007f
        L_0x0079:
            r1 = move-exception
            java.lang.String r2 = f2649b
            android.util.Log.e(r2, r0, r1)
        L_0x007f:
            throw r7
        L_0x0080:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.a(byte[]):androidx.work.b");
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v8, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[SYNTHETIC, Splitter:B:30:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091 A[SYNTHETIC, Splitter:B:41:0x0091] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] b(androidx.work.b r5) {
        /*
            java.lang.String r0 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x006d }
            r3.<init>(r1)     // Catch:{ IOException -> 0x006d }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.f2651a     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            int r2 = r2.size()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeInt(r2)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f2651a     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
        L_0x0020:
            boolean r2 = r5.hasNext()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r5.next()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeUTF(r4)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeObject(r2)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            goto L_0x0020
        L_0x003d:
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r5 = move-exception
            java.lang.String r2 = f2649b
            android.util.Log.e(r2, r0, r5)
        L_0x0047:
            r1.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x0051
        L_0x004b:
            r5 = move-exception
            java.lang.String r2 = f2649b
            android.util.Log.e(r2, r0, r5)
        L_0x0051:
            int r5 = r1.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r5 > r0) goto L_0x005e
            byte[] r5 = r1.toByteArray()
            return r5
        L_0x005e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        L_0x0066:
            r5 = move-exception
            goto L_0x008f
        L_0x0068:
            r5 = move-exception
            r2 = r3
            goto L_0x006e
        L_0x006b:
            r5 = move-exception
            goto L_0x008e
        L_0x006d:
            r5 = move-exception
        L_0x006e:
            java.lang.String r3 = f2649b     // Catch:{ all -> 0x006b }
            android.util.Log.e(r3, r0, r5)     // Catch:{ all -> 0x006b }
            byte[] r5 = r1.toByteArray()     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0083
            r2.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x0083
        L_0x007d:
            r2 = move-exception
            java.lang.String r3 = f2649b
            android.util.Log.e(r3, r0, r2)
        L_0x0083:
            r1.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x008d
        L_0x0087:
            r1 = move-exception
            java.lang.String r2 = f2649b
            android.util.Log.e(r2, r0, r1)
        L_0x008d:
            return r5
        L_0x008e:
            r3 = r2
        L_0x008f:
            if (r3 == 0) goto L_0x009b
            r3.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x009b
        L_0x0095:
            r2 = move-exception
            java.lang.String r3 = f2649b
            android.util.Log.e(r3, r0, r2)
        L_0x009b:
            r1.close()     // Catch:{ IOException -> 0x009f }
            goto L_0x00a5
        L_0x009f:
            r1 = move-exception
            java.lang.String r2 = f2649b
            android.util.Log.e(r2, r0, r1)
        L_0x00a5:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.b(androidx.work.b):byte[]");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> keySet = this.f2651a.keySet();
        if (!keySet.equals(bVar.f2651a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f2651a.get(str);
            Object obj3 = bVar.f2651a.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f2651a.hashCode() * 31;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f2651a.isEmpty()) {
            for (String str : this.f2651a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f2651a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public b(b bVar) {
        this.f2651a = new HashMap(bVar.f2651a);
    }

    public b(Map<String, ?> map) {
        this.f2651a = new HashMap(map);
    }
}
