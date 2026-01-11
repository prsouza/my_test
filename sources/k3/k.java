package k3;

import c4.g;
import c4.j;
import d4.a;
import d4.d;
import g3.f;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import m0.c;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final g<f, String> f7428a = new g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final c<b> f7429b = ((a.c) d4.a.a(10, new a()));

    public class a implements a.b<b> {
        public final Object a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static final class b implements a.d {

        /* renamed from: a  reason: collision with root package name */
        public final MessageDigest f7430a;

        /* renamed from: b  reason: collision with root package name */
        public final d.a f7431b = new d.a();

        public b(MessageDigest messageDigest) {
            this.f7430a = messageDigest;
        }

        public final d h() {
            return this.f7431b;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [d4.a$c, m0.c<k3.k$b>] */
    /* JADX WARNING: type inference failed for: r1v5, types: [d4.a$c, m0.c<k3.k$b>] */
    /* JADX WARNING: type inference failed for: r2v2, types: [d4.a$c, m0.c<k3.k$b>] */
    public final String a(f fVar) {
        String a10;
        synchronized (this.f7428a) {
            a10 = this.f7428a.a(fVar);
        }
        if (a10 == null) {
            Object b10 = this.f7429b.b();
            Objects.requireNonNull(b10, "Argument must not be null");
            b bVar = (b) b10;
            try {
                fVar.b(bVar.f7430a);
                byte[] digest = bVar.f7430a.digest();
                char[] cArr = j.f3245b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b11 = digest[i] & 255;
                        int i10 = i * 2;
                        char[] cArr2 = j.f3244a;
                        cArr[i10] = cArr2[b11 >>> 4];
                        cArr[i10 + 1] = cArr2[b11 & 15];
                    }
                    a10 = new String(cArr);
                }
                this.f7429b.a(bVar);
            } catch (Throwable th2) {
                this.f7429b.a(bVar);
                throw th2;
            }
        }
        synchronized (this.f7428a) {
            this.f7428a.d(fVar, a10);
        }
        return a10;
    }
}
