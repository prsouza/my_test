package p9;

import g9.g;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class o {
    public static final s A = new s(Calendar.class, GregorianCalendar.class, new z());
    public static final p B = new p(Locale.class, new a0());
    public static final i2.z<i2.p> C;
    public static final t D;
    public static final d0 E = new d0();

    /* renamed from: a  reason: collision with root package name */
    public static final p f9776a = new p(Class.class, new r().nullSafe());

    /* renamed from: b  reason: collision with root package name */
    public static final p f9777b = new p(BitSet.class, new c0().nullSafe());

    /* renamed from: c  reason: collision with root package name */
    public static final i2.z<Boolean> f9778c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final q f9779d;

    /* renamed from: e  reason: collision with root package name */
    public static final q f9780e = new q(Byte.TYPE, Byte.class, new c());

    /* renamed from: f  reason: collision with root package name */
    public static final q f9781f = new q(Short.TYPE, Short.class, new e());
    public static final q g = new q(Integer.TYPE, Integer.class, new g());

    /* renamed from: h  reason: collision with root package name */
    public static final p f9782h = new p(AtomicInteger.class, new i().nullSafe());
    public static final p i = new p(AtomicBoolean.class, new k().nullSafe());

    /* renamed from: j  reason: collision with root package name */
    public static final p f9783j = new p(AtomicIntegerArray.class, new b().nullSafe());

    /* renamed from: k  reason: collision with root package name */
    public static final i2.z<Number> f9784k = new d();

    /* renamed from: l  reason: collision with root package name */
    public static final i2.z<Number> f9785l = new f();

    /* renamed from: m  reason: collision with root package name */
    public static final i2.z<Number> f9786m = new h();

    /* renamed from: n  reason: collision with root package name */
    public static final p f9787n = new p(Number.class, new j());

    /* renamed from: o  reason: collision with root package name */
    public static final q f9788o = new q(Character.TYPE, Character.class, new l());

    /* renamed from: p  reason: collision with root package name */
    public static final i2.z<BigDecimal> f9789p = new C0189o();

    /* renamed from: q  reason: collision with root package name */
    public static final i2.z<BigInteger> f9790q = new p();

    /* renamed from: r  reason: collision with root package name */
    public static final p f9791r;

    /* renamed from: s  reason: collision with root package name */
    public static final p f9792s = new p(StringBuilder.class, new q());

    /* renamed from: t  reason: collision with root package name */
    public static final p f9793t = new p(StringBuffer.class, new s());

    /* renamed from: u  reason: collision with root package name */
    public static final p f9794u = new p(URL.class, new t());

    /* renamed from: v  reason: collision with root package name */
    public static final p f9795v = new p(URI.class, new u());

    /* renamed from: w  reason: collision with root package name */
    public static final t f9796w = new t(InetAddress.class, new v());

    /* renamed from: x  reason: collision with root package name */
    public static final p f9797x = new p(UUID.class, new w());

    /* renamed from: y  reason: collision with root package name */
    public static final p f9798y = new p(Currency.class, new x().nullSafe());
    public static final y z = new y();

    public class a extends i2.z<Boolean> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() != 9) {
                return Boolean.valueOf(aVar.y0());
            }
            aVar.x0();
            return null;
        }

        public final void write(aa.c cVar, Object obj) {
            Boolean bool = (Boolean) obj;
            cVar.S(bool == null ? "null" : bool.toString());
        }
    }

    public class a0 extends i2.z<Locale> {
        public final Object read(aa.a aVar) {
            String str = null;
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.y0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
        }

        public final void write(aa.c cVar, Object obj) {
            Locale locale = (Locale) obj;
            cVar.S(locale == null ? null : locale.toString());
        }
    }

    public class b extends i2.z<AtomicIntegerArray> {
        public final Object read(aa.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.e();
            while (aVar.a0()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.p0()));
                } catch (NumberFormatException e10) {
                    throw new i2.x((Throwable) e10);
                }
            }
            aVar.R();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        public final void write(aa.c cVar, Object obj) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            cVar.B();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                cVar.c((long) atomicIntegerArray.get(i));
            }
            cVar.T();
        }
    }

    public class b0 extends i2.z<i2.p> {
        /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<i2.p>, java.util.ArrayList] */
        /* renamed from: a */
        public final i2.p read(aa.a aVar) {
            int d10 = aa.b.d(aVar.A0());
            if (d10 == 0) {
                i2.m mVar = new i2.m();
                aVar.e();
                while (aVar.a0()) {
                    mVar.f6003a.add(read(aVar));
                }
                aVar.R();
                return mVar;
            } else if (d10 == 2) {
                i2.s sVar = new i2.s();
                aVar.w();
                while (aVar.a0()) {
                    sVar.g(aVar.w0(), read(aVar));
                }
                aVar.S();
                return sVar;
            } else if (d10 == 5) {
                return new i2.u(aVar.y0());
            } else {
                if (d10 == 6) {
                    return new i2.u((Number) new g9.f(aVar.y0()));
                }
                if (d10 == 7) {
                    return new i2.u(Boolean.valueOf(aVar.b0()));
                }
                if (d10 == 8) {
                    aVar.x0();
                    return i2.r.f6004a;
                }
                throw new IllegalArgumentException();
            }
        }

        /* JADX WARNING: type inference failed for: r6v10, types: [java.util.List<i2.p>, java.util.ArrayList] */
        /* renamed from: b */
        public final void write(aa.c cVar, i2.p pVar) {
            if (pVar == null || (pVar instanceof i2.r)) {
                cVar.f0();
            } else if (pVar instanceof i2.u) {
                i2.u d10 = pVar.d();
                Serializable serializable = d10.f6006a;
                if (serializable instanceof Number) {
                    cVar.f(d10.i());
                } else if (serializable instanceof Boolean) {
                    cVar.t(d10.h());
                } else {
                    cVar.S(d10.e());
                }
            } else {
                boolean z = pVar instanceof i2.m;
                if (z) {
                    cVar.B();
                    if (z) {
                        Iterator it = ((i2.m) pVar).f6003a.iterator();
                        while (it.hasNext()) {
                            write(cVar, (i2.p) it.next());
                        }
                        cVar.T();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + pVar);
                } else if (pVar instanceof i2.s) {
                    cVar.R();
                    g9.g gVar = g9.g.this;
                    g.e<K, V> eVar = gVar.f5290t.f5302s;
                    int i = gVar.f5289s;
                    while (true) {
                        g.e<K, V> eVar2 = gVar.f5290t;
                        if (!(eVar != eVar2)) {
                            cVar.a0();
                            return;
                        } else if (eVar == eVar2) {
                            throw new NoSuchElementException();
                        } else if (gVar.f5289s == i) {
                            g.e<K, V> eVar3 = eVar.f5302s;
                            cVar.s(eVar.f5304u);
                            write(cVar, eVar.f5305v);
                            eVar = eVar3;
                        } else {
                            throw new ConcurrentModificationException();
                        }
                    }
                } else {
                    StringBuilder q10 = a.b.q("Couldn't write ");
                    q10.append(pVar.getClass());
                    throw new IllegalArgumentException(q10.toString());
                }
            }
        }
    }

    public class c extends i2.z<Number> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.p0());
            } catch (NumberFormatException e10) {
                throw new i2.x((Throwable) e10);
            }
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.f((Number) obj);
        }
    }

    public class c0 extends i2.z<BitSet> {
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r7.p0() != 0) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
            r1 = false;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0053 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object read(aa.a r7) {
            /*
                r6 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r7.e()
                int r1 = r7.A0()
                r2 = 0
                r3 = r2
            L_0x000e:
                r4 = 2
                if (r1 == r4) goto L_0x0066
                int r4 = aa.b.d(r1)
                r5 = 5
                if (r4 == r5) goto L_0x0041
                r5 = 6
                if (r4 == r5) goto L_0x003a
                r5 = 7
                if (r4 != r5) goto L_0x0023
                boolean r1 = r7.b0()
                goto L_0x004e
            L_0x0023:
                i2.x r7 = new i2.x
                java.lang.String r0 = "Invalid bitset value type: "
                java.lang.StringBuilder r0 = a.a.d(r0)
                java.lang.String r1 = ah.v.h(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>((java.lang.String) r0)
                throw r7
            L_0x003a:
                int r1 = r7.p0()
                if (r1 == 0) goto L_0x004d
                goto L_0x004b
            L_0x0041:
                java.lang.String r1 = r7.y0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x005a }
                if (r1 == 0) goto L_0x004d
            L_0x004b:
                r1 = 1
                goto L_0x004e
            L_0x004d:
                r1 = r2
            L_0x004e:
                if (r1 == 0) goto L_0x0053
                r0.set(r3)
            L_0x0053:
                int r3 = r3 + 1
                int r1 = r7.A0()
                goto L_0x000e
            L_0x005a:
                i2.x r7 = new i2.x
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = a8.a.c(r0, r1)
                r7.<init>((java.lang.String) r0)
                throw r7
            L_0x0066:
                r7.R()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.o.c0.read(aa.a):java.lang.Object");
        }

        public final void write(aa.c cVar, Object obj) {
            BitSet bitSet = (BitSet) obj;
            cVar.B();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                cVar.c(bitSet.get(i) ? 1 : 0);
            }
            cVar.T();
        }
    }

    public class d extends i2.z<Number> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            try {
                return Long.valueOf(aVar.v0());
            } catch (NumberFormatException e10) {
                throw new i2.x((Throwable) e10);
            }
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.f((Number) obj);
        }
    }

    public class d0 implements i2.a0 {
        public final <T> i2.z<T> create(i2.j jVar, x9.a<T> aVar) {
            Class<Enum> cls = Enum.class;
            Class cls2 = aVar.f13148a;
            if (!cls.isAssignableFrom(cls2) || cls2 == cls) {
                return null;
            }
            if (!cls2.isEnum()) {
                cls2 = cls2.getSuperclass();
            }
            return new m(cls2);
        }
    }

    public class e extends i2.z<Number> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.p0());
            } catch (NumberFormatException e10) {
                throw new i2.x((Throwable) e10);
            }
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.f((Number) obj);
        }
    }

    public class e0 extends i2.z<Boolean> {
        public final Object read(aa.a aVar) {
            int A0 = aVar.A0();
            if (A0 == 9) {
                aVar.x0();
                return null;
            }
            return Boolean.valueOf(A0 == 6 ? Boolean.parseBoolean(aVar.y0()) : aVar.b0());
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.e((Boolean) obj);
        }
    }

    public class f extends i2.z<Number> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() != 9) {
                return Float.valueOf((float) aVar.f0());
            }
            aVar.x0();
            return null;
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.f((Number) obj);
        }
    }

    public class g extends i2.z<Number> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.p0());
            } catch (NumberFormatException e10) {
                throw new i2.x((Throwable) e10);
            }
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.f((Number) obj);
        }
    }

    public class h extends i2.z<Number> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() != 9) {
                return Double.valueOf(aVar.f0());
            }
            aVar.x0();
            return null;
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.f((Number) obj);
        }
    }

    public class i extends i2.z<AtomicInteger> {
        public final Object read(aa.a aVar) {
            try {
                return new AtomicInteger(aVar.p0());
            } catch (NumberFormatException e10) {
                throw new i2.x((Throwable) e10);
            }
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.c((long) ((AtomicInteger) obj).get());
        }
    }

    public class j extends i2.z<Number> {
        public final Object read(aa.a aVar) {
            int A0 = aVar.A0();
            int d10 = aa.b.d(A0);
            if (d10 == 5 || d10 == 6) {
                return new g9.f(aVar.y0());
            }
            if (d10 == 8) {
                aVar.x0();
                return null;
            }
            StringBuilder d11 = a.a.d("Expecting number, got: ");
            d11.append(ah.v.h(A0));
            throw new i2.x(d11.toString());
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.f((Number) obj);
        }
    }

    public class k extends i2.z<AtomicBoolean> {
        public final Object read(aa.a aVar) {
            return new AtomicBoolean(aVar.b0());
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.t(((AtomicBoolean) obj).get());
        }
    }

    public class l extends i2.z<Character> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            String y02 = aVar.y0();
            if (y02.length() == 1) {
                return Character.valueOf(y02.charAt(0));
            }
            throw new i2.x(a8.a.c("Expecting character, got: ", y02));
        }

        public final void write(aa.c cVar, Object obj) {
            Character ch2 = (Character) obj;
            cVar.S(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    public static final class m<T extends Enum<T>> extends i2.z<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, T> f9799a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<T, String> f9800b = new HashMap();

        /* JADX WARNING: type inference failed for: r6v3, types: [java.util.Map<java.lang.String, T>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r6v4, types: [java.util.HashMap, java.util.Map<T, java.lang.String>] */
        /* JADX WARNING: type inference failed for: r10v0, types: [java.util.Map<java.lang.String, T>, java.util.HashMap] */
        public m(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    l2.b bVar = (l2.b) cls.getField(name).getAnnotation(l2.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String put : bVar.alternate()) {
                            this.f9799a.put(put, enumR);
                        }
                    }
                    this.f9799a.put(name, enumR);
                    this.f9800b.put(enumR, name);
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map<java.lang.String, T>, java.util.HashMap] */
        public final Object read(aa.a aVar) {
            if (aVar.A0() != 9) {
                return (Enum) this.f9799a.get(aVar.y0());
            }
            aVar.x0();
            return null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<T, java.lang.String>] */
        public final void write(aa.c cVar, Object obj) {
            Enum enumR = (Enum) obj;
            cVar.S(enumR == null ? null : (String) this.f9800b.get(enumR));
        }
    }

    public class n extends i2.z<String> {
        public final Object read(aa.a aVar) {
            int A0 = aVar.A0();
            if (A0 != 9) {
                return A0 == 8 ? Boolean.toString(aVar.b0()) : aVar.y0();
            }
            aVar.x0();
            return null;
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.S((String) obj);
        }
    }

    /* renamed from: p9.o$o  reason: collision with other inner class name */
    public class C0189o extends i2.z<BigDecimal> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            try {
                return new BigDecimal(aVar.y0());
            } catch (NumberFormatException e10) {
                throw new i2.x((Throwable) e10);
            }
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.f((BigDecimal) obj);
        }
    }

    public class p extends i2.z<BigInteger> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            try {
                return new BigInteger(aVar.y0());
            } catch (NumberFormatException e10) {
                throw new i2.x((Throwable) e10);
            }
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.f((BigInteger) obj);
        }
    }

    public class q extends i2.z<StringBuilder> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() != 9) {
                return new StringBuilder(aVar.y0());
            }
            aVar.x0();
            return null;
        }

        public final void write(aa.c cVar, Object obj) {
            StringBuilder sb2 = (StringBuilder) obj;
            cVar.S(sb2 == null ? null : sb2.toString());
        }
    }

    public class r extends i2.z<Class> {
        public final Object read(aa.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public final void write(aa.c cVar, Object obj) {
            StringBuilder q10 = a.b.q("Attempted to serialize java.lang.Class: ");
            q10.append(((Class) obj).getName());
            q10.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(q10.toString());
        }
    }

    public class s extends i2.z<StringBuffer> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() != 9) {
                return new StringBuffer(aVar.y0());
            }
            aVar.x0();
            return null;
        }

        public final void write(aa.c cVar, Object obj) {
            StringBuffer stringBuffer = (StringBuffer) obj;
            cVar.S(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public class t extends i2.z<URL> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            String y02 = aVar.y0();
            if ("null".equals(y02)) {
                return null;
            }
            return new URL(y02);
        }

        public final void write(aa.c cVar, Object obj) {
            URL url = (URL) obj;
            cVar.S(url == null ? null : url.toExternalForm());
        }
    }

    public class u extends i2.z<URI> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            try {
                String y02 = aVar.y0();
                if ("null".equals(y02)) {
                    return null;
                }
                return new URI(y02);
            } catch (URISyntaxException e10) {
                throw new i2.q((Throwable) e10);
            }
        }

        public final void write(aa.c cVar, Object obj) {
            URI uri = (URI) obj;
            cVar.S(uri == null ? null : uri.toASCIIString());
        }
    }

    public class v extends i2.z<InetAddress> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() != 9) {
                return InetAddress.getByName(aVar.y0());
            }
            aVar.x0();
            return null;
        }

        public final void write(aa.c cVar, Object obj) {
            InetAddress inetAddress = (InetAddress) obj;
            cVar.S(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    public class w extends i2.z<UUID> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() != 9) {
                return UUID.fromString(aVar.y0());
            }
            aVar.x0();
            return null;
        }

        public final void write(aa.c cVar, Object obj) {
            UUID uuid = (UUID) obj;
            cVar.S(uuid == null ? null : uuid.toString());
        }
    }

    public class x extends i2.z<Currency> {
        public final Object read(aa.a aVar) {
            return Currency.getInstance(aVar.y0());
        }

        public final void write(aa.c cVar, Object obj) {
            cVar.S(((Currency) obj).getCurrencyCode());
        }
    }

    public class y implements i2.a0 {

        public class a extends i2.z<Timestamp> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ i2.z f9801a;

            public a(i2.z zVar) {
                this.f9801a = zVar;
            }

            public final Object read(aa.a aVar) {
                Date date = (Date) this.f9801a.read(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            public final void write(aa.c cVar, Object obj) {
                this.f9801a.write(cVar, (Timestamp) obj);
            }
        }

        public final <T> i2.z<T> create(i2.j jVar, x9.a<T> aVar) {
            if (aVar.f13148a != Timestamp.class) {
                return null;
            }
            Objects.requireNonNull(jVar);
            return new a(jVar.c(new x9.a(Date.class)));
        }
    }

    public class z extends i2.z<Calendar> {
        public final Object read(aa.a aVar) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            aVar.w();
            int i = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (aVar.A0() != 4) {
                String w02 = aVar.w0();
                int p02 = aVar.p0();
                if ("year".equals(w02)) {
                    i = p02;
                } else if ("month".equals(w02)) {
                    i10 = p02;
                } else if ("dayOfMonth".equals(w02)) {
                    i11 = p02;
                } else if ("hourOfDay".equals(w02)) {
                    i12 = p02;
                } else if ("minute".equals(w02)) {
                    i13 = p02;
                } else if ("second".equals(w02)) {
                    i14 = p02;
                }
            }
            aVar.S();
            return new GregorianCalendar(i, i10, i11, i12, i13, i14);
        }

        public final void write(aa.c cVar, Object obj) {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                cVar.f0();
                return;
            }
            cVar.R();
            cVar.s("year");
            cVar.c((long) calendar.get(1));
            cVar.s("month");
            cVar.c((long) calendar.get(2));
            cVar.s("dayOfMonth");
            cVar.c((long) calendar.get(5));
            cVar.s("hourOfDay");
            cVar.c((long) calendar.get(11));
            cVar.s("minute");
            cVar.c((long) calendar.get(12));
            cVar.s("second");
            cVar.c((long) calendar.get(13));
            cVar.a0();
        }
    }

    static {
        e0 e0Var = new e0();
        f9779d = new q(Boolean.TYPE, Boolean.class, e0Var);
        n nVar = new n();
        f9791r = new p(String.class, nVar);
        b0 b0Var = new b0();
        C = b0Var;
        D = new t(i2.p.class, b0Var);
    }
}
