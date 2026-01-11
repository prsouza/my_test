package l8;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i8.b;
import i8.c;
import i8.d;
import i8.e;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import l8.d;

public final class f implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f8129f = Charset.forName("UTF-8");
    public static final c g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f8130h;
    public static final d<Map.Entry<Object, Object>> i = e.f8128a;

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f8131a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f8132b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, i8.f<?>> f8133c;

    /* renamed from: d  reason: collision with root package name */
    public final d<Object> f8134d;

    /* renamed from: e  reason: collision with root package name */
    public final i f8135e = new i(this);

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8136a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                l8.d$a[] r0 = l8.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8136a = r0
                l8.d$a r1 = l8.d.a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8136a     // Catch:{ NoSuchFieldError -> 0x001d }
                l8.d$a r1 = l8.d.a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8136a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l8.d$a r1 = l8.d.a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l8.f.a.<clinit>():void");
        }
    }

    static {
        d.a aVar = d.a.DEFAULT;
        a aVar2 = new a(1, aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(d.class, aVar2);
        g = new c("key", a8.a.e(hashMap), (c.a) null);
        a aVar3 = new a(2, aVar);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(d.class, aVar3);
        f8130h = new c(AppMeasurementSdk.ConditionalUserProperty.VALUE, a8.a.e(hashMap2), (c.a) null);
    }

    public f(OutputStream outputStream, Map<Class<?>, i8.d<?>> map, Map<Class<?>, i8.f<?>> map2, i8.d<Object> dVar) {
        this.f8131a = outputStream;
        this.f8132b = map;
        this.f8133c = map2;
        this.f8134d = dVar;
    }

    public static ByteBuffer h(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static d j(c cVar) {
        d dVar = (d) ((Annotation) cVar.f6399b.get(d.class));
        if (dVar != null) {
            return dVar;
        }
        throw new b("Field has no @Protobuf config");
    }

    public static int k(c cVar) {
        d dVar = (d) ((Annotation) cVar.f6399b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f8125a;
        }
        throw new b("Field has no @Protobuf config");
    }

    public final e a(c cVar, Object obj) throws IOException {
        return b(cVar, obj, true);
    }

    public final e b(c cVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f8129f);
            l(bytes.length);
            this.f8131a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object b10 : (Collection) obj) {
                b(cVar, b10, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry i10 : ((Map) obj).entrySet()) {
                i(i, cVar, i10, false);
            }
            return this;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z || doubleValue != Utils.DOUBLE_EPSILON) {
                l((k(cVar) << 3) | 1);
                this.f8131a.write(h(8).putDouble(doubleValue).array());
            }
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z || floatValue != 0.0f) {
                l((k(cVar) << 3) | 5);
                this.f8131a.write(h(4).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            g(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            l(bArr.length);
            this.f8131a.write(bArr);
            return this;
        } else {
            i8.d dVar = this.f8132b.get(obj.getClass());
            if (dVar != null) {
                i(dVar, cVar, obj, z);
                return this;
            }
            i8.f fVar = this.f8133c.get(obj.getClass());
            if (fVar != null) {
                i iVar = this.f8135e;
                iVar.f8144a = false;
                iVar.f8146c = cVar;
                iVar.f8145b = z;
                fVar.a(obj, iVar);
                return this;
            } else if (obj instanceof c) {
                d(cVar, ((c) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                d(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                i(this.f8134d, cVar, obj, z);
                return this;
            }
        }
    }

    public final e c(c cVar, long j10) throws IOException {
        g(cVar, j10, true);
        return this;
    }

    public final f d(c cVar, int i10, boolean z) throws IOException {
        if (z && i10 == 0) {
            return this;
        }
        a aVar = (a) j(cVar);
        int i11 = a.f8136a[aVar.f8126b.ordinal()];
        if (i11 == 1) {
            l(aVar.f8125a << 3);
            l(i10);
        } else if (i11 == 2) {
            l(aVar.f8125a << 3);
            l((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            l((aVar.f8125a << 3) | 5);
            this.f8131a.write(h(4).putInt(i10).array());
        }
        return this;
    }

    public final e e(c cVar, int i10) throws IOException {
        d(cVar, i10, true);
        return this;
    }

    public final e f(c cVar, boolean z) throws IOException {
        d(cVar, z ? 1 : 0, true);
        return this;
    }

    public final f g(c cVar, long j10, boolean z) throws IOException {
        if (z && j10 == 0) {
            return this;
        }
        a aVar = (a) j(cVar);
        int i10 = a.f8136a[aVar.f8126b.ordinal()];
        if (i10 == 1) {
            l(aVar.f8125a << 3);
            m(j10);
        } else if (i10 == 2) {
            l(aVar.f8125a << 3);
            m((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            l((aVar.f8125a << 3) | 1);
            this.f8131a.write(h(8).putLong(j10).array());
        }
        return this;
    }

    public final <T> f i(i8.d<T> dVar, c cVar, T t10, boolean z) throws IOException {
        OutputStream outputStream;
        b bVar = new b();
        try {
            outputStream = this.f8131a;
            this.f8131a = bVar;
            dVar.a(t10, this);
            this.f8131a = outputStream;
            long j10 = bVar.f8127a;
            bVar.close();
            if (z && j10 == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            m(j10);
            dVar.a(t10, this);
            return this;
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i10) throws IOException {
        while (((long) (i10 & -128)) != 0) {
            this.f8131a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f8131a.write(i10 & 127);
    }

    public final void m(long j10) throws IOException {
        while ((-128 & j10) != 0) {
            this.f8131a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f8131a.write(((int) j10) & 127);
    }
}
