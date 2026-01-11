package f7;

import a7.g;
import a7.l;
import h7.u;
import h7.v;
import h7.w;
import h7.x;
import h7.y;
import i7.a0;
import i7.i;
import i7.q0;
import j7.p;
import j7.q;
import j7.r;
import j7.s;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.spec.SecretKeySpec;

public final class b extends g<v> {

    public class a extends g.b<l, v> {
        public a() {
            super(l.class);
        }

        public final Object a(Object obj) throws GeneralSecurityException {
            v vVar = (v) obj;
            u y10 = vVar.C().y();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.B().m(), "HMAC");
            int z = vVar.C().z();
            int i = c.f5008a[y10.ordinal()];
            if (i == 1) {
                return new q(new p("HMACSHA1", secretKeySpec), z);
            }
            if (i == 2) {
                return new q(new p("HMACSHA256", secretKeySpec), z);
            }
            if (i == 3) {
                return new q(new p("HMACSHA512", secretKeySpec), z);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: f7.b$b  reason: collision with other inner class name */
    public class C0081b extends g.a<w, v> {
        public C0081b() {
            super(w.class);
        }

        public final Object a(q0 q0Var) throws GeneralSecurityException {
            w wVar = (w) q0Var;
            v.b E = v.E();
            Objects.requireNonNull(b.this);
            E.m();
            v.x((v) E.f6389b);
            x z = wVar.z();
            E.m();
            v.y((v) E.f6389b, z);
            byte[] a10 = r.a(wVar.y());
            i e10 = i.e(a10, 0, a10.length);
            E.m();
            v.z((v) E.f6389b, e10);
            return (v) E.k();
        }

        public final q0 b(i iVar) throws a0 {
            return w.A(iVar, i7.p.a());
        }

        public final void c(q0 q0Var) throws GeneralSecurityException {
            w wVar = (w) q0Var;
            if (wVar.y() >= 16) {
                b.h(wVar.z());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5008a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                h7.u[] r0 = h7.u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5008a = r0
                h7.u r1 = h7.u.SHA1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5008a     // Catch:{ NoSuchFieldError -> 0x001d }
                h7.u r1 = h7.u.SHA256     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5008a     // Catch:{ NoSuchFieldError -> 0x0028 }
                h7.u r1 = h7.u.SHA512     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f7.b.c.<clinit>():void");
        }
    }

    public b() {
        super(v.class, new a());
    }

    public static void h(x xVar) throws GeneralSecurityException {
        if (xVar.z() >= 10) {
            int i = c.f5008a[xVar.y().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (xVar.z() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (xVar.z() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (xVar.z() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final g.a<w, v> c() {
        return new C0081b();
    }

    public final y.c d() {
        return y.c.SYMMETRIC;
    }

    public final q0 e(i iVar) throws a0 {
        return v.F(iVar, i7.p.a());
    }

    /* renamed from: g */
    public final void f(v vVar) throws GeneralSecurityException {
        s.c(vVar.D());
        if (vVar.B().size() >= 16) {
            h(vVar.C());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
