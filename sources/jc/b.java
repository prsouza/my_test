package jc;

import a8.a;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.a0;
import androidx.lifecycle.r;
import androidx.lifecycle.u0;
import androidx.lifecycle.w;
import ca.d;
import cd.i;
import cd.s;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import fe.o;
import g9.h;
import gb.f;
import ge.d0;
import ge.g1;
import ge.n1;
import ge.o0;
import ge.w1;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentSkipListMap;
import l6.y0;
import le.l;
import org.json.JSONObject;
import p002if.m;
import pd.f;
import v3.g;
import xe.j;
import xe.p;
import xe.q;
import yd.v;
import yh.c;

public class b implements g, h, d, m {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f7138a = {16843036, 16843156, 16843157, 16843158, 16843532, 16843533};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f7139b = {16842960, 16843161};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f7140c = {16843161, 16843849, 16843850, 16843851};

    /* renamed from: s  reason: collision with root package name */
    public static final y0 f7141s = new y0(1);

    /* renamed from: t  reason: collision with root package name */
    public static final Object[] f7142t = new Object[0];

    public /* synthetic */ b() {
    }

    public /* synthetic */ b(g9.b bVar) {
    }

    public static final Object[] A(Collection collection, Object[] objArr) {
        Object[] objArr2;
        e.D(collection, "collection");
        Objects.requireNonNull(objArr);
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i10 = i + 1;
                    objArr2[i] = it.next();
                    if (i10 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i11 = ((i10 * 3) + 1) >>> 1;
                        if (i11 <= i10) {
                            if (i10 < 2147483645) {
                                i11 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i11);
                        e.C(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i10] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i10);
                        e.C(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i10;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }

    public static final String B(byte[] bArr, boolean z) {
        yh.d dVar = c.f13663a;
        String a10 = xh.h.a(c.b(bArr, bArr.length));
        return z ? a.c("0x", a10) : a10;
    }

    public static final f C(bb.b bVar, xd.a aVar, xd.a aVar2) {
        e.D(bVar, "<this>");
        e.D(aVar, "onSelect");
        e.D(aVar2, "onSeen");
        JSONObject jSONObject = new JSONObject(bVar.f2939b);
        int i = bVar.f2938a;
        String optString = jSONObject.optString("nodle.v1.title");
        e.C(optString, "joData.optString(NotifDataHandler.KEY_TITLE)");
        String optString2 = jSONObject.optString("nodle.v1.body");
        e.C(optString2, "joData.optString(NotifDataHandler.KEY_BODY)");
        long j10 = bVar.f2940c;
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), "MMM d yyyy, jj:mm");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(bestDateTimePattern, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        simpleDateFormat.applyLocalizedPattern(bestDateTimePattern);
        String format = simpleDateFormat.format(Long.valueOf(j10));
        e.C(format, "formatter.format(timeStampMillis)");
        String optString3 = jSONObject.optString("nodle.v1.url");
        e.C(optString3, "joData.optString(NotifDataHandler.KEY_URL)");
        return new f(i, optString, optString2, format, optString3, bVar.f2941d, aVar, aVar2);
    }

    public static String c(String str, int i) {
        return b9.m.b(str, i);
    }

    public static final String e(si.a aVar) {
        e.D(aVar, "$this$ID");
        return a.b.p(aVar.f11148a);
    }

    public static final Field f(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("mResources");
            e.C(declaredField, "clazz.getDeclaredField(fieldName)");
            return declaredField;
        } catch (NoSuchFieldException e10) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                return f(superclass);
            }
            throw e10;
        }
    }

    public static final URI h() {
        URI create = URI.create("dtn:none");
        e.C(create, "URI.create(\"dtn:none\")");
        return create;
    }

    public static final void i(URI uri) {
        e.D(uri, "$this$checkValidDtnEid");
        if (uri.getScheme() == null) {
            throw new ci.a();
        } else if (uri.getSchemeSpecificPart() == null) {
            throw new ci.a();
        } else if (!e.r(uri.getScheme(), "dtn")) {
            throw new ci.a();
        } else if (!e.r(uri.getSchemeSpecificPart(), "none")) {
            if (uri.getAuthority() == null) {
                throw new ci.a();
            } else if (uri.getPath() == null) {
                throw new ci.a();
            } else if (e.r(uri.getPath(), BuildConfig.FLAVOR)) {
                throw new ci.a();
            }
        }
    }

    public static final qc.a j(qc.a aVar, bd.f fVar, bd.c cVar) {
        if (aVar != null) {
            return aVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Not resolved type in event ");
        e.D(fVar, "$this$fullNameOf");
        e.D(cVar, "withName");
        sb2.append(fVar.f2979a + '.' + cVar.f2969a);
        throw new sc.a(sb2.toString());
    }

    public static final se.d k(qe.b bVar) {
        e.D(bVar, "$this$asJsonDecoder");
        se.d dVar = (se.d) (!(bVar instanceof se.d) ? null : bVar);
        if (dVar != null) {
            return dVar;
        }
        StringBuilder c10 = b9.m.c("This serializer can be used only with Json format.", "Expected Decoder to be JsonDecoder, got ");
        c10.append(v.a(bVar.getClass()));
        throw new IllegalStateException(c10.toString());
    }

    public static final long l(si.a aVar) {
        long j10;
        p pVar;
        e.D(aVar, "$this$expireAt");
        xe.f fVar = aVar.f11148a;
        q qVar = fVar.f13195a;
        long j11 = qVar.g;
        if (j11 == 0) {
            j G = a.b.G(fVar, 7);
            if (G == null || (pVar = G.f13212e) == null) {
                return 0;
            }
            j11 = aVar.f11148a.f13195a.i - ((gi.a) pVar).f5514a;
            j10 = aVar.f11149b;
        } else {
            j10 = qVar.i;
        }
        return j11 + j10;
    }

    public static final boolean m(URI uri) {
        e.D(uri, "$this$isNullEid");
        return e.r(uri.toString(), "dtn:none");
    }

    public static final int n(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static byte[] o(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i10 = i * 2;
                int digit = Character.digit(str.charAt(i10), 16);
                int digit2 = Character.digit(str.charAt(i10 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[i] = (byte) ((digit * 16) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static String p(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            byte b11 = b10 & 255;
            sb2.append("0123456789abcdef".charAt(b11 / 16));
            sb2.append("0123456789abcdef".charAt(b11 % 16));
        }
        return sb2.toString();
    }

    public static View q(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View findViewById = viewGroup.getChildAt(i10).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final byte[] r(String str) {
        e.D(str, "$this$fromHex");
        String t12 = o.t1(str, "0x");
        yh.d dVar = c.f13663a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c.f13663a.a(t12, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            e.C(byteArray, "Hex.decode(removePrefix(HEX_PREFIX))");
            return byteArray;
        } catch (Exception e10) {
            StringBuilder d10 = a.a.d("exception decoding Hex string: ");
            d10.append(e10.getMessage());
            throw new yh.a(d10.toString(), e10);
        }
    }

    public static final Object s(dd.a aVar) {
        e.D(aVar, "$this$def");
        cd.j jVar = cd.j.f3377u;
        Objects.requireNonNull(jVar);
        return aVar.a(cd.j.f3376t.a(jVar, cd.j.f3373b[2]));
    }

    public static final int t(pe.e eVar, String str) {
        e.D(eVar, "$this$getElementIndexOrThrow");
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        pe.f fVar = (pe.f) eVar;
        int a10 = fVar.a(str);
        if (a10 != -3) {
            return a10;
        }
        throw new oe.f(fVar.f9908h + " does not contain element with name '" + str + '\'');
    }

    public static final androidx.lifecycle.v u(a0 a0Var) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        e.D(a0Var, "<this>");
        r lifecycle = a0Var.getLifecycle();
        e.C(lifecycle, "lifecycle");
        while (true) {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.f2163a.get();
            if (lifecycleCoroutineScopeImpl == null) {
                w1 w1Var = new w1((g1) null);
                me.c cVar = o0.f5433a;
                n1 n1Var = l.f8259a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, f.a.C0191a.c(w1Var, n1Var.w0()));
                if (lifecycle.f2163a.compareAndSet((Object) null, lifecycleCoroutineScopeImpl)) {
                    ge.g.b(lifecycleCoroutineScopeImpl, n1Var.w0(), new w(lifecycleCoroutineScopeImpl, (pd.d<? super w>) null), 2);
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    public static final List v(dd.a aVar) {
        e.D(aVar, "$this$path");
        cd.j jVar = cd.j.f3377u;
        Objects.requireNonNull(jVar);
        return (List) aVar.a(cd.j.f3374c.a(jVar, cd.j.f3373b[0]));
    }

    public static final dd.a w(dd.a aVar) {
        return (dd.a) aVar.a(i.f3372t.e());
    }

    public static final BigInteger x(dd.a aVar) {
        e.D(aVar, "$this$type");
        s sVar = s.f3413t;
        Objects.requireNonNull(sVar);
        return (BigInteger) aVar.a(s.f3412s.a(sVar, s.f3410b[1]));
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public static final d0 y(u0 u0Var) {
        Object obj;
        e.D(u0Var, "<this>");
        Map<String, Object> map = u0Var.f2193a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = u0Var.f2193a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
        }
        d0 d0Var = (d0) obj;
        if (d0Var != null) {
            return d0Var;
        }
        w1 w1Var = new w1((g1) null);
        me.c cVar = o0.f5433a;
        return (d0) u0Var.h("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new androidx.lifecycle.g(f.a.C0191a.c(w1Var, l.f8259a.w0())));
    }

    public static final Object[] z(Collection collection) {
        e.D(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i10 = i + 1;
                    objArr[i] = it.next();
                    if (i10 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i11 = ((i10 * 3) + 1) >>> 1;
                        if (i11 <= i10) {
                            if (i10 < 2147483645) {
                                i11 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i11);
                        e.C(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i10);
                        e.C(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i10;
                }
            }
        }
        return f7142t;
    }

    public Object a() {
        return new ConcurrentSkipListMap();
    }

    public List b(String str) {
        e.D(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            e.C(allByName, "InetAddress.getAllByName(hostname)");
            return nd.f.S(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException(a.c("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }

    public void d() {
    }
}
