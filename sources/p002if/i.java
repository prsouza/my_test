package p002if;

import e6.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import jf.c;
import nd.m;
import p002if.g;

/* renamed from: if.i  reason: invalid package */
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final i f6518e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f6519f = new i(false, false, (String[]) null, (String[]) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6520a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6521b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f6522c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f6523d;

    /* renamed from: if.i$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6524a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f6525b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f6526c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6527d;

        public a() {
            this.f6524a = true;
        }

        public final i a() {
            return new i(this.f6524a, this.f6527d, this.f6525b, this.f6526c);
        }

        public final a b(g... gVarArr) {
            e.D(gVarArr, "cipherSuites");
            if (this.f6524a) {
                ArrayList arrayList = new ArrayList(gVarArr.length);
                for (g gVar : gVarArr) {
                    arrayList.add(gVar.f6517a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                c((String[]) Arrays.copyOf(strArr, strArr.length));
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a c(String... strArr) {
            e.D(strArr, "cipherSuites");
            if (this.f6524a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f6525b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a d() {
            if (this.f6524a) {
                this.f6527d = true;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final a e(e0... e0VarArr) {
            if (this.f6524a) {
                ArrayList arrayList = new ArrayList(e0VarArr.length);
                for (e0 javaName : e0VarArr) {
                    arrayList.add(javaName.javaName());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                f((String[]) Arrays.copyOf(strArr, strArr.length));
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final a f(String... strArr) {
            e.D(strArr, "tlsVersions");
            if (this.f6524a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f6526c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(i iVar) {
            this.f6524a = iVar.f6520a;
            this.f6525b = iVar.f6522c;
            this.f6526c = iVar.f6523d;
            this.f6527d = iVar.f6521b;
        }
    }

    static {
        g gVar = g.f6513q;
        g gVar2 = g.f6514r;
        g gVar3 = g.f6515s;
        g gVar4 = g.f6507k;
        g gVar5 = g.f6509m;
        g gVar6 = g.f6508l;
        g gVar7 = g.f6510n;
        g gVar8 = g.f6512p;
        g gVar9 = g.f6511o;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.i, g.f6506j, g.g, g.f6505h, g.f6503e, g.f6504f, g.f6502d};
        a aVar = new a();
        aVar.b((g[]) Arrays.copyOf(gVarArr, 9));
        e0 e0Var = e0.TLS_1_3;
        e0 e0Var2 = e0.TLS_1_2;
        aVar.e(e0Var, e0Var2);
        aVar.d();
        aVar.a();
        a aVar2 = new a();
        aVar2.b((g[]) Arrays.copyOf(gVarArr2, 16));
        aVar2.e(e0Var, e0Var2);
        aVar2.d();
        f6518e = aVar2.a();
        a aVar3 = new a();
        aVar3.b((g[]) Arrays.copyOf(gVarArr2, 16));
        aVar3.e(e0Var, e0Var2, e0.TLS_1_1, e0.TLS_1_0);
        aVar3.d();
        aVar3.a();
    }

    public i(boolean z, boolean z10, String[] strArr, String[] strArr2) {
        this.f6520a = z;
        this.f6521b = z10;
        this.f6522c = strArr;
        this.f6523d = strArr2;
    }

    public final List<g> a() {
        String[] strArr = this.f6522c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b10 : strArr) {
            arrayList.add(g.f6516t.b(b10));
        }
        return m.j1(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f6520a) {
            return false;
        }
        String[] strArr = this.f6523d;
        if (strArr != null && !c.j(strArr, sSLSocket.getEnabledProtocols(), od.a.f9417a)) {
            return false;
        }
        String[] strArr2 = this.f6522c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        g.b bVar = g.f6516t;
        Comparator<String> comparator = g.f6500b;
        if (!c.j(strArr2, enabledCipherSuites, g.f6500b)) {
            return false;
        }
        return true;
    }

    public final List<e0> c() {
        String[] strArr = this.f6523d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a10 : strArr) {
            arrayList.add(e0.Companion.a(a10));
        }
        return m.j1(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f6520a;
        i iVar = (i) obj;
        if (z != iVar.f6520a) {
            return false;
        }
        return !z || (Arrays.equals(this.f6522c, iVar.f6522c) && Arrays.equals(this.f6523d, iVar.f6523d) && this.f6521b == iVar.f6521b);
    }

    public final int hashCode() {
        if (!this.f6520a) {
            return 17;
        }
        String[] strArr = this.f6522c;
        int i = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f6523d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (this.f6521b ^ true ? 1 : 0);
    }

    public final String toString() {
        if (!this.f6520a) {
            return "ConnectionSpec()";
        }
        StringBuilder c10 = b9.m.c("ConnectionSpec(", "cipherSuites=");
        c10.append(Objects.toString(a(), "[all enabled]"));
        c10.append(", ");
        c10.append("tlsVersions=");
        c10.append(Objects.toString(c(), "[all enabled]"));
        c10.append(", ");
        c10.append("supportsTlsExtensions=");
        c10.append(this.f6521b);
        c10.append(')');
        return c10.toString();
    }
}
