package ki;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import ki.a;
import p002if.q;
import p002if.u;
import p002if.z;

public abstract class v<T> {

    public static final class a<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f7644a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7645b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, z> f7646c;

        public a(Method method, int i, f<T, z> fVar) {
            this.f7644a = method;
            this.f7645b = i;
            this.f7646c = fVar;
        }

        public final void a(x xVar, T t10) {
            if (t10 != null) {
                try {
                    xVar.f7697k = this.f7646c.a(t10);
                } catch (IOException e10) {
                    Method method = this.f7644a;
                    int i = this.f7645b;
                    throw e0.l(method, e10, i, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
                }
            } else {
                throw e0.k(this.f7644a, this.f7645b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    public static final class b<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f7647a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f7648b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f7649c;

        public b(String str, boolean z) {
            a.d dVar = a.d.f7564a;
            Objects.requireNonNull(str, "name == null");
            this.f7647a = str;
            this.f7648b = dVar;
            this.f7649c = z;
        }

        public final void a(x xVar, T t10) throws IOException {
            String a10;
            if (t10 != null && (a10 = this.f7648b.a(t10)) != null) {
                xVar.a(this.f7647a, a10, this.f7649c);
            }
        }
    }

    public static final class c<T> extends v<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f7650a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7651b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f7652c;

        public c(Method method, int i, boolean z) {
            this.f7650a = method;
            this.f7651b = i;
            this.f7652c = z;
        }

        public final void a(x xVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                xVar.a(str, obj2, this.f7652c);
                            } else {
                                Method method = this.f7650a;
                                int i = this.f7651b;
                                throw e0.k(method, i, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw e0.k(this.f7650a, this.f7651b, androidx.fragment.app.o.c("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw e0.k(this.f7650a, this.f7651b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw e0.k(this.f7650a, this.f7651b, "Field map was null.", new Object[0]);
        }
    }

    public static final class d<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f7653a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f7654b;

        public d(String str) {
            a.d dVar = a.d.f7564a;
            Objects.requireNonNull(str, "name == null");
            this.f7653a = str;
            this.f7654b = dVar;
        }

        public final void a(x xVar, T t10) throws IOException {
            String a10;
            if (t10 != null && (a10 = this.f7654b.a(t10)) != null) {
                xVar.b(this.f7653a, a10);
            }
        }
    }

    public static final class e<T> extends v<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f7655a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7656b;

        public e(Method method, int i) {
            this.f7655a = method;
            this.f7656b = i;
        }

        public final void a(x xVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            xVar.b(str, value.toString());
                        } else {
                            throw e0.k(this.f7655a, this.f7656b, androidx.fragment.app.o.c("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw e0.k(this.f7655a, this.f7656b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw e0.k(this.f7655a, this.f7656b, "Header map was null.", new Object[0]);
        }
    }

    public static final class f extends v<q> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f7657a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7658b;

        public f(Method method, int i) {
            this.f7657a = method;
            this.f7658b = i;
        }

        public final void a(x xVar, Object obj) throws IOException {
            q qVar = (q) obj;
            if (qVar != null) {
                q.a aVar = xVar.f7694f;
                Objects.requireNonNull(aVar);
                int length = qVar.f6560a.length / 2;
                for (int i = 0; i < length; i++) {
                    aVar.b(qVar.e(i), qVar.h(i));
                }
                return;
            }
            throw e0.k(this.f7657a, this.f7658b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    public static final class g<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f7659a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7660b;

        /* renamed from: c  reason: collision with root package name */
        public final q f7661c;

        /* renamed from: d  reason: collision with root package name */
        public final f<T, z> f7662d;

        public g(Method method, int i, q qVar, f<T, z> fVar) {
            this.f7659a = method;
            this.f7660b = i;
            this.f7661c = qVar;
            this.f7662d = fVar;
        }

        public final void a(x xVar, T t10) {
            if (t10 != null) {
                try {
                    xVar.c(this.f7661c, this.f7662d.a(t10));
                } catch (IOException e10) {
                    Method method = this.f7659a;
                    int i = this.f7660b;
                    throw e0.k(method, i, "Unable to convert " + t10 + " to RequestBody", e10);
                }
            }
        }
    }

    public static final class h<T> extends v<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f7663a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7664b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, z> f7665c;

        /* renamed from: d  reason: collision with root package name */
        public final String f7666d;

        public h(Method method, int i, f<T, z> fVar, String str) {
            this.f7663a = method;
            this.f7664b = i;
            this.f7665c = fVar;
            this.f7666d = str;
        }

        public final void a(x xVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            xVar.c(q.f6559b.c("Content-Disposition", androidx.fragment.app.o.c("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f7666d), this.f7665c.a(value));
                        } else {
                            throw e0.k(this.f7663a, this.f7664b, androidx.fragment.app.o.c("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw e0.k(this.f7663a, this.f7664b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw e0.k(this.f7663a, this.f7664b, "Part map was null.", new Object[0]);
        }
    }

    public static final class i<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f7667a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7668b;

        /* renamed from: c  reason: collision with root package name */
        public final String f7669c;

        /* renamed from: d  reason: collision with root package name */
        public final f<T, String> f7670d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f7671e;

        public i(Method method, int i, String str, boolean z) {
            a.d dVar = a.d.f7564a;
            this.f7667a = method;
            this.f7668b = i;
            Objects.requireNonNull(str, "name == null");
            this.f7669c = str;
            this.f7670d = dVar;
            this.f7671e = z;
        }

        public final void a(x xVar, T t10) throws IOException {
            String str;
            int i;
            int i10;
            x xVar2 = xVar;
            T t11 = t10;
            if (t11 != null) {
                String str2 = this.f7669c;
                String a10 = this.f7670d.a(t11);
                boolean z = this.f7671e;
                if (xVar2.f7691c != null) {
                    int length = a10.length();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            str = a10;
                            break;
                        }
                        int codePointAt = a10.codePointAt(i11);
                        i = -1;
                        i10 = 127;
                        if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                            uf.e eVar = new uf.e();
                            eVar.E0(a10, 0, i11);
                            uf.e eVar2 = null;
                        } else {
                            i11 += Character.charCount(codePointAt);
                        }
                    }
                    uf.e eVar3 = new uf.e();
                    eVar3.E0(a10, 0, i11);
                    uf.e eVar22 = null;
                    while (i11 < length) {
                        int codePointAt2 = a10.codePointAt(i11);
                        if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < 32 || codePointAt2 >= i10 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                                if (eVar22 == null) {
                                    eVar22 = new uf.e();
                                }
                                eVar22.F0(codePointAt2);
                                while (!eVar22.J()) {
                                    byte readByte = eVar22.readByte() & 255;
                                    eVar3.y0(37);
                                    char[] cArr = x.f7687l;
                                    eVar3.y0(cArr[(readByte >> 4) & 15]);
                                    eVar3.y0(cArr[readByte & 15]);
                                }
                            } else {
                                eVar3.F0(codePointAt2);
                            }
                        }
                        i11 += Character.charCount(codePointAt2);
                        i = -1;
                        i10 = 127;
                    }
                    str = eVar3.T();
                    String replace = xVar2.f7691c.replace("{" + str2 + "}", str);
                    if (!x.f7688m.matcher(replace).matches()) {
                        xVar2.f7691c = replace;
                        return;
                    }
                    throw new IllegalArgumentException(a8.a.c("@Path parameters shouldn't perform path traversal ('.' or '..'): ", a10));
                }
                throw new AssertionError();
            }
            throw e0.k(this.f7667a, this.f7668b, android.support.v4.media.a.e(a.a.d("Path parameter \""), this.f7669c, "\" value must not be null."), new Object[0]);
        }
    }

    public static final class j<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f7672a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f7673b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f7674c;

        public j(String str, boolean z) {
            a.d dVar = a.d.f7564a;
            Objects.requireNonNull(str, "name == null");
            this.f7672a = str;
            this.f7673b = dVar;
            this.f7674c = z;
        }

        public final void a(x xVar, T t10) throws IOException {
            String a10;
            if (t10 != null && (a10 = this.f7673b.a(t10)) != null) {
                xVar.d(this.f7672a, a10, this.f7674c);
            }
        }
    }

    public static final class k<T> extends v<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f7675a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7676b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f7677c;

        public k(Method method, int i, boolean z) {
            this.f7675a = method;
            this.f7676b = i;
            this.f7677c = z;
        }

        public final void a(x xVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                xVar.d(str, obj2, this.f7677c);
                            } else {
                                Method method = this.f7675a;
                                int i = this.f7676b;
                                throw e0.k(method, i, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw e0.k(this.f7675a, this.f7676b, androidx.fragment.app.o.c("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw e0.k(this.f7675a, this.f7676b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw e0.k(this.f7675a, this.f7676b, "Query map was null", new Object[0]);
        }
    }

    public static final class l<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f7678a;

        public l(boolean z) {
            this.f7678a = z;
        }

        public final void a(x xVar, T t10) throws IOException {
            if (t10 != null) {
                xVar.d(t10.toString(), (String) null, this.f7678a);
            }
        }
    }

    public static final class m extends v<u.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f7679a = new m();

        /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<if.u$b>, java.util.ArrayList] */
        public final void a(x xVar, Object obj) throws IOException {
            u.b bVar = (u.b) obj;
            if (bVar != null) {
                u.a aVar = xVar.i;
                Objects.requireNonNull(aVar);
                aVar.f6594c.add(bVar);
            }
        }
    }

    public static final class n extends v<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f7680a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7681b;

        public n(Method method, int i) {
            this.f7680a = method;
            this.f7681b = i;
        }

        public final void a(x xVar, Object obj) {
            if (obj != null) {
                xVar.f7691c = obj.toString();
                return;
            }
            throw e0.k(this.f7680a, this.f7681b, "@Url parameter is null.", new Object[0]);
        }
    }

    public static final class o<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f7682a;

        public o(Class<T> cls) {
            this.f7682a = cls;
        }

        public final void a(x xVar, T t10) {
            xVar.f7693e.d(this.f7682a, t10);
        }
    }

    public abstract void a(x xVar, T t10) throws IOException;
}
