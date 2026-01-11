package e7;

import a7.f;
import a7.h;
import a7.i;
import a7.r;
import android.content.Context;
import android.util.Log;
import h7.c0;
import h7.d0;
import h7.t;
import h7.z;
import i7.a0;
import i7.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import jc.b;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f4738c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a7.a f4739a;

    /* renamed from: b  reason: collision with root package name */
    public i f4740b;

    /* renamed from: e7.a$a  reason: collision with other inner class name */
    public static final class C0070a {

        /* renamed from: a  reason: collision with root package name */
        public d f4741a = null;

        /* renamed from: b  reason: collision with root package name */
        public e f4742b = null;

        /* renamed from: c  reason: collision with root package name */
        public String f4743c = null;

        /* renamed from: d  reason: collision with root package name */
        public b f4744d = null;

        /* renamed from: e  reason: collision with root package name */
        public f f4745e = null;

        /* renamed from: f  reason: collision with root package name */
        public i f4746f;

        public final synchronized a a() throws GeneralSecurityException, IOException {
            if (this.f4743c != null) {
                this.f4744d = (b) c();
            }
            this.f4746f = b();
            return new a(this);
        }

        public final i b() throws GeneralSecurityException, IOException {
            try {
                b bVar = this.f4744d;
                if (bVar != null) {
                    try {
                        return i.f(h.c(this.f4741a, bVar));
                    } catch (a0 | GeneralSecurityException e10) {
                        int i = a.f4738c;
                        Log.w("a", "cannot decrypt keyset: ", e10);
                    }
                }
                return i.f(h.a(c0.E(this.f4741a.a(), p.a())));
            } catch (FileNotFoundException e11) {
                int i10 = a.f4738c;
                Log.w("a", "keyset not found, will generate a new one", e11);
                if (this.f4745e != null) {
                    i iVar = new i(c0.D());
                    f fVar = this.f4745e;
                    synchronized (iVar) {
                        iVar.a(fVar.f141a);
                        int B = r.a(iVar.b().f149a).z().B();
                        synchronized (iVar) {
                            int i11 = 0;
                            while (i11 < ((c0) iVar.f150a.f6389b).A()) {
                                c0.c z = ((c0) iVar.f150a.f6389b).z(i11);
                                if (z.C() != B) {
                                    i11++;
                                } else if (z.E().equals(z.ENABLED)) {
                                    c0.b bVar2 = iVar.f150a;
                                    bVar2.m();
                                    c0.x((c0) bVar2.f6389b, B);
                                    if (this.f4744d != null) {
                                        h b10 = iVar.b();
                                        e eVar = this.f4742b;
                                        b bVar3 = this.f4744d;
                                        c0 c0Var = b10.f149a;
                                        byte[] a10 = bVar3.a(c0Var.g(), new byte[0]);
                                        if (c0.E(bVar3.b(a10, new byte[0]), p.a()).equals(c0Var)) {
                                            t.b A = t.A();
                                            i7.i e12 = i7.i.e(a10, 0, a10.length);
                                            A.m();
                                            t.x((t) A.f6389b, e12);
                                            d0 a11 = r.a(c0Var);
                                            A.m();
                                            t.y((t) A.f6389b, a11);
                                            if (!eVar.f4753a.putString(eVar.f4754b, b.p(((t) A.k()).g())).commit()) {
                                                throw new IOException("Failed to write to SharedPreferences");
                                            }
                                        } else {
                                            throw new GeneralSecurityException("cannot encrypt keyset");
                                        }
                                    } else {
                                        h b11 = iVar.b();
                                        e eVar2 = this.f4742b;
                                        if (!eVar2.f4753a.putString(eVar2.f4754b, b.p(b11.f149a.g())).commit()) {
                                            throw new IOException("Failed to write to SharedPreferences");
                                        }
                                    }
                                    return iVar;
                                } else {
                                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + B);
                                }
                            }
                            throw new GeneralSecurityException("key not found: " + B);
                        }
                    }
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            } catch (a0 unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        }

        public final a7.a c() throws GeneralSecurityException {
            int i = a.f4738c;
            c cVar = new c();
            boolean d10 = cVar.d(this.f4743c);
            if (!d10) {
                try {
                    c.c(this.f4743c);
                } catch (GeneralSecurityException | ProviderException e10) {
                    int i10 = a.f4738c;
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            }
            try {
                return cVar.a(this.f4743c);
            } catch (GeneralSecurityException | ProviderException e11) {
                if (!d10) {
                    int i11 = a.f4738c;
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e11);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f4743c}), e11);
            }
        }

        public final C0070a d(Context context, String str) throws IOException {
            if (context != null) {
                this.f4741a = new d(context, str);
                this.f4742b = new e(context, str);
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }
    }

    public a(C0070a aVar) throws GeneralSecurityException, IOException {
        e eVar = aVar.f4742b;
        this.f4739a = aVar.f4744d;
        this.f4740b = aVar.f4746f;
    }
}
