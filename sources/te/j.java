package te;

import a.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import nd.x;
import pe.c;
import pe.e;
import re.s0;
import se.a;
import se.q;

public class j extends a {

    /* renamed from: e  reason: collision with root package name */
    public int f11587e;

    /* renamed from: f  reason: collision with root package name */
    public final q f11588f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final e f11589h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(a aVar, q qVar, String str, e eVar) {
        super(aVar);
        e6.e.D(aVar, "json");
        e6.e.D(qVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f11588f = qVar;
        this.g = str;
        this.f11589h = eVar;
    }

    public final qe.a B(e eVar) {
        e6.e.D(eVar, "descriptor");
        if (eVar == this.f11589h) {
            return this;
        }
        return super.B(eVar);
    }

    public se.e O(String str) {
        e6.e.D(str, "tag");
        return (se.e) x.t0(S(), str);
    }

    /* renamed from: U */
    public q S() {
        return this.f11588f;
    }

    public void j(e eVar) {
        e6.e.D(eVar, "descriptor");
        if (!this.f11566c.f11570b && !(eVar.c() instanceof c)) {
            if (!(eVar instanceof s0)) {
                HashSet hashSet = new HashSet(eVar.d());
                int d10 = eVar.d();
                for (int i = 0; i < d10; i++) {
                    hashSet.add(eVar.e(i));
                }
                for (String next : S().keySet()) {
                    if (!hashSet.contains(next) && (!e6.e.r(next, this.g))) {
                        String qVar = S().toString();
                        e6.e.D(next, "key");
                        throw b.i(-1, "Encountered unknown key '" + next + "'.\n" + "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\n" + "Current input: " + b.s0(qVar, -1));
                    }
                }
                return;
            }
            s0 s0Var = (s0) eVar;
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r1.a(r5) == -3) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0005 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int k(pe.e r7) {
        /*
            r6 = this;
            java.lang.String r0 = "descriptor"
            e6.e.D(r7, r0)
        L_0x0005:
            int r0 = r6.f11587e
            int r1 = r7.d()
            if (r0 >= r1) goto L_0x0073
            int r0 = r6.f11587e
            int r1 = r0 + 1
            r6.f11587e = r1
            java.lang.String r0 = r6.R(r7, r0)
            se.q r1 = r6.S()
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L_0x0005
            te.c r1 = r6.f11566c
            boolean r1 = r1.g
            r2 = 1
            if (r1 == 0) goto L_0x006f
            int r1 = r6.f11587e
            int r1 = r1 - r2
            pe.e r1 = r7.g(r1)
            se.e r3 = r6.O(r0)
            boolean r3 = r3 instanceof se.o
            if (r3 == 0) goto L_0x003f
            boolean r3 = r1.f()
            if (r3 != 0) goto L_0x003f
        L_0x003d:
            r4 = r2
            goto L_0x006d
        L_0x003f:
            pe.i r3 = r1.c()
            pe.i$b r4 = pe.i.b.f9917a
            boolean r3 = e6.e.r(r3, r4)
            r4 = 0
            if (r3 == 0) goto L_0x006d
            se.e r0 = r6.O(r0)
            boolean r3 = r0 instanceof se.s
            r5 = 0
            if (r3 != 0) goto L_0x0056
            r0 = r5
        L_0x0056:
            se.s r0 = (se.s) r0
            if (r0 == 0) goto L_0x006d
            boolean r3 = r0 instanceof se.o
            if (r3 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            java.lang.String r5 = r0.d()
        L_0x0063:
            if (r5 == 0) goto L_0x006d
            int r0 = r1.a(r5)
            r1 = -3
            if (r0 != r1) goto L_0x006d
            goto L_0x003d
        L_0x006d:
            if (r4 != 0) goto L_0x0005
        L_0x006f:
            int r7 = r6.f11587e
            int r7 = r7 - r2
            return r7
        L_0x0073:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: te.j.k(pe.e):int");
    }
}
