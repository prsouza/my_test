package te;

import androidx.fragment.app.o;
import fe.p;
import pe.c;
import pe.e;
import pe.i;
import pe.j;
import re.e1;
import se.b;
import se.d;
import se.m;
import se.q;
import se.s;
import yd.v;

public abstract class a extends e1 implements d {

    /* renamed from: c  reason: collision with root package name */
    public final c f11566c;

    /* renamed from: d  reason: collision with root package name */
    public final se.a f11567d;

    public a(se.a aVar) {
        this.f11567d = aVar;
        this.f11566c = aVar.f11102a;
    }

    public qe.a B(e eVar) {
        qe.a aVar;
        e6.e.D(eVar, "descriptor");
        se.e P = P();
        i c10 = eVar.c();
        if (e6.e.r(c10, j.b.f9919a) || (c10 instanceof c)) {
            se.a aVar2 = this.f11567d;
            if (P instanceof b) {
                aVar = new k(aVar2, (b) P);
            } else {
                StringBuilder d10 = a.a.d("Expected ");
                d10.append(v.a(b.class));
                d10.append(" as the serialized body of ");
                d10.append(eVar.b());
                d10.append(", but had ");
                d10.append(v.a(P.getClass()));
                throw a.b.i(-1, d10.toString());
            }
        } else if (e6.e.r(c10, j.c.f9920a)) {
            se.a aVar3 = this.f11567d;
            e g = eVar.g(0);
            i c11 = g.c();
            if ((c11 instanceof pe.d) || e6.e.r(c11, i.b.f9917a)) {
                se.a aVar4 = this.f11567d;
                if (P instanceof q) {
                    aVar = new l(aVar4, (q) P);
                } else {
                    StringBuilder d11 = a.a.d("Expected ");
                    d11.append(v.a(q.class));
                    d11.append(" as the serialized body of ");
                    d11.append(eVar.b());
                    d11.append(", but had ");
                    d11.append(v.a(P.getClass()));
                    throw a.b.i(-1, d11.toString());
                }
            } else if (aVar3.f11102a.f11572d) {
                se.a aVar5 = this.f11567d;
                if (P instanceof b) {
                    aVar = new k(aVar5, (b) P);
                } else {
                    StringBuilder d12 = a.a.d("Expected ");
                    d12.append(v.a(b.class));
                    d12.append(" as the serialized body of ");
                    d12.append(eVar.b());
                    d12.append(", but had ");
                    d12.append(v.a(P.getClass()));
                    throw a.b.i(-1, d12.toString());
                }
            } else {
                throw a.b.h(g);
            }
        } else {
            se.a aVar6 = this.f11567d;
            if (P instanceof q) {
                aVar = new j(aVar6, (q) P, (String) null, (e) null);
            } else {
                StringBuilder d13 = a.a.d("Expected ");
                d13.append(v.a(q.class));
                d13.append(" as the serialized body of ");
                d13.append(eVar.b());
                d13.append(", but had ");
                d13.append(v.a(P.getClass()));
                throw a.b.i(-1, d13.toString());
            }
        }
        return aVar;
    }

    public final boolean E(Object obj) {
        String str = (String) obj;
        e6.e.D(str, "tag");
        s T = T(str);
        if (this.f11567d.f11102a.f11571c || !((m) T).f11120b) {
            return o.a(T.d());
        }
        throw a.b.j(-1, o.c("Boolean literal for key '", str, "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), P().toString());
    }

    public final byte F(Object obj) {
        String str = (String) obj;
        e6.e.D(str, "tag");
        try {
            return (byte) a.b.b0(T(str));
        } catch (Throwable unused) {
            throw a.b.j(-1, "Failed to parse 'byte'", P().toString());
        }
    }

    public final char G(Object obj) {
        String str = (String) obj;
        e6.e.D(str, "tag");
        try {
            return p.E1(T(str).d());
        } catch (Throwable unused) {
            throw a.b.j(-1, "Failed to parse 'char'", P().toString());
        }
    }

    public final double H(Object obj) {
        String str = (String) obj;
        e6.e.D(str, "tag");
        try {
            double parseDouble = Double.parseDouble(T(str).d());
            if (!this.f11567d.f11102a.f11576j) {
                if (!(!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                    throw a.b.f(Double.valueOf(parseDouble), str, P().toString());
                }
            }
            return parseDouble;
        } catch (Throwable unused) {
            throw a.b.j(-1, "Failed to parse 'double'", P().toString());
        }
    }

    public final float I(Object obj) {
        String str = (String) obj;
        e6.e.D(str, "tag");
        try {
            float parseFloat = Float.parseFloat(T(str).d());
            if (!this.f11567d.f11102a.f11576j) {
                if (!(!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                    throw a.b.f(Float.valueOf(parseFloat), str, P().toString());
                }
            }
            return parseFloat;
        } catch (Throwable unused) {
            throw a.b.j(-1, "Failed to parse 'float'", P().toString());
        }
    }

    public final int J(Object obj) {
        String str = (String) obj;
        e6.e.D(str, "tag");
        try {
            return a.b.b0(T(str));
        } catch (Throwable unused) {
            throw a.b.j(-1, "Failed to parse 'int'", P().toString());
        }
    }

    public final long K(Object obj) {
        String str = (String) obj;
        e6.e.D(str, "tag");
        try {
            return Long.parseLong(T(str).d());
        } catch (Throwable unused) {
            throw a.b.j(-1, "Failed to parse 'long'", P().toString());
        }
    }

    public final short L(Object obj) {
        String str = (String) obj;
        e6.e.D(str, "tag");
        try {
            return (short) a.b.b0(T(str));
        } catch (Throwable unused) {
            throw a.b.j(-1, "Failed to parse 'short'", P().toString());
        }
    }

    public final String M(Object obj) {
        String str = (String) obj;
        e6.e.D(str, "tag");
        s T = T(str);
        if (this.f11567d.f11102a.f11571c || ((m) T).f11120b) {
            return T.d();
        }
        throw a.b.j(-1, o.c("String literal for key '", str, "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), P().toString());
    }

    public abstract se.e O(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = O(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final se.e P() {
        /*
            r1 = this;
            java.util.ArrayList<Tag> r0 = r1.f10689a
            java.lang.Object r0 = nd.m.d1(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0011
            se.e r0 = r1.O(r0)
            if (r0 == 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            se.e r0 = r1.S()
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: te.a.P():se.e");
    }

    public String Q(e eVar, int i) {
        e6.e.D(eVar, "desc");
        return eVar.e(i);
    }

    public final String R(e eVar, int i) {
        e6.e.D(eVar, "$this$getTag");
        String Q = Q(eVar, i);
        e6.e.D(Q, "nestedName");
        String str = (String) nd.m.d1(this.f10689a);
        return Q;
    }

    public abstract se.e S();

    public final s T(String str) {
        e6.e.D(str, "tag");
        se.e O = O(str);
        s sVar = (s) (!(O instanceof s) ? null : O);
        if (sVar != null) {
            return sVar;
        }
        throw a.b.j(-1, "Expected JsonPrimitive at " + str + ", found " + O, P().toString());
    }

    public final boolean c() {
        return !(P() instanceof se.o);
    }

    public final <T> T e(oe.a<T> aVar) {
        e6.e.D(aVar, "deserializer");
        return aa.b.D(this, aVar);
    }

    public void j(e eVar) {
        e6.e.D(eVar, "descriptor");
    }

    public final se.a m() {
        return this.f11567d;
    }

    public final se.e n() {
        return P();
    }

    public final android.support.v4.media.b p() {
        return this.f11567d.f11102a.f11577k;
    }
}
