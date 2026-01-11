package ki;

import java.io.IOException;
import p002if.a0;
import p002if.b0;
import p002if.d;
import p002if.e;
import p002if.t;
import p002if.x;
import uf.h;
import uf.k;
import uf.v;

public final class r<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final y f7624a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f7625b;

    /* renamed from: c  reason: collision with root package name */
    public final d.a f7626c;

    /* renamed from: s  reason: collision with root package name */
    public final f<b0, T> f7627s;

    /* renamed from: t  reason: collision with root package name */
    public volatile boolean f7628t;

    /* renamed from: u  reason: collision with root package name */
    public d f7629u;

    /* renamed from: v  reason: collision with root package name */
    public Throwable f7630v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7631w;

    public class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f7632a;

        public a(d dVar) {
            this.f7632a = dVar;
        }

        public final void a(IOException iOException) {
            try {
                this.f7632a.a(r.this, iOException);
            } catch (Throwable th2) {
                e0.n(th2);
                th2.printStackTrace();
            }
        }

        public final void b(a0 a0Var) {
            try {
                try {
                    this.f7632a.b(r.this, r.this.c(a0Var));
                } catch (Throwable th2) {
                    e0.n(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                e0.n(th3);
                th3.printStackTrace();
            }
        }
    }

    public static final class b extends b0 {

        /* renamed from: b  reason: collision with root package name */
        public final b0 f7634b;

        /* renamed from: c  reason: collision with root package name */
        public final v f7635c;

        /* renamed from: s  reason: collision with root package name */
        public IOException f7636s;

        public class a extends k {
            public a(uf.b0 b0Var) {
                super(b0Var);
            }

            public final long I(uf.e eVar, long j10) throws IOException {
                try {
                    e6.e.D(eVar, "sink");
                    return this.f11961a.I(eVar, j10);
                } catch (IOException e10) {
                    b.this.f7636s = e10;
                    throw e10;
                }
            }
        }

        public b(b0 b0Var) {
            this.f7634b = b0Var;
            this.f7635c = new v(new a(b0Var.e()));
        }

        public final long a() {
            return this.f7634b.a();
        }

        public final t c() {
            return this.f7634b.c();
        }

        public final void close() {
            this.f7634b.close();
        }

        public final h e() {
            return this.f7635c;
        }
    }

    public static final class c extends b0 {

        /* renamed from: b  reason: collision with root package name */
        public final t f7638b;

        /* renamed from: c  reason: collision with root package name */
        public final long f7639c;

        public c(t tVar, long j10) {
            this.f7638b = tVar;
            this.f7639c = j10;
        }

        public final long a() {
            return this.f7639c;
        }

        public final t c() {
            return this.f7638b;
        }

        public final h e() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public r(y yVar, Object[] objArr, d.a aVar, f<b0, T> fVar) {
        this.f7624a = yVar;
        this.f7625b = objArr;
        this.f7626c = aVar;
        this.f7627s = fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: ki.x$a} */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.List<if.u$b>, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p002if.d a() throws java.io.IOException {
        /*
            r15 = this;
            if.d$a r0 = r15.f7626c
            ki.y r1 = r15.f7624a
            java.lang.Object[] r2 = r15.f7625b
            ki.v<?>[] r3 = r1.f7707j
            int r4 = r2.length
            int r5 = r3.length
            if (r4 != r5) goto L_0x0114
            ki.x r5 = new ki.x
            java.lang.String r7 = r1.f7702c
            if.r r8 = r1.f7701b
            java.lang.String r9 = r1.f7703d
            if.q r10 = r1.f7704e
            if.t r11 = r1.f7705f
            boolean r12 = r1.g
            boolean r13 = r1.f7706h
            boolean r14 = r1.i
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r6 = r1.f7708k
            if (r6 == 0) goto L_0x0028
            int r4 = r4 + -1
        L_0x0028:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            r7 = 0
            r8 = r7
        L_0x002f:
            if (r8 >= r4) goto L_0x0040
            r9 = r2[r8]
            r6.add(r9)
            r9 = r3[r8]
            r10 = r2[r8]
            r9.a(r5, r10)
            int r8 = r8 + 1
            goto L_0x002f
        L_0x0040:
            if.r$a r2 = r5.f7692d
            r3 = 0
            if (r2 == 0) goto L_0x004a
            if.r r2 = r2.a()
            goto L_0x0064
        L_0x004a:
            if.r r2 = r5.f7690b
            java.lang.String r4 = r5.f7691c
            java.util.Objects.requireNonNull(r2)
            java.lang.String r8 = "link"
            e6.e.D(r4, r8)
            if.r$a r2 = r2.f(r4)
            if (r2 == 0) goto L_0x0061
            if.r r2 = r2.a()
            goto L_0x0062
        L_0x0061:
            r2 = r3
        L_0x0062:
            if (r2 == 0) goto L_0x00f5
        L_0x0064:
            if.z r4 = r5.f7697k
            if (r4 != 0) goto L_0x00ad
            if.o$a r8 = r5.f7696j
            if (r8 == 0) goto L_0x0071
            if.o r4 = r8.b()
            goto L_0x00ad
        L_0x0071:
            if.u$a r8 = r5.i
            if (r8 == 0) goto L_0x009b
            java.util.List<if.u$b> r3 = r8.f6594c
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x008f
            if.u r4 = new if.u
            uf.i r3 = r8.f6592a
            if.t r7 = r8.f6593b
            java.util.List<if.u$b> r8 = r8.f6594c
            java.util.List r8 = jf.c.x(r8)
            r4.<init>(r3, r7, r8)
            goto L_0x00ad
        L_0x008f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Multipart body must have at least one part."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009b:
            boolean r8 = r5.f7695h
            if (r8 == 0) goto L_0x00ad
            byte[] r4 = new byte[r7]
            long r12 = (long) r7
            r8 = r12
            r10 = r12
            jf.c.c(r8, r10, r12)
            if.z$a$a r8 = new if.z$a$a
            r8.<init>(r4, r3, r7, r7)
            r4 = r8
        L_0x00ad:
            if.t r3 = r5.g
            if (r3 == 0) goto L_0x00c3
            if (r4 == 0) goto L_0x00ba
            ki.x$a r7 = new ki.x$a
            r7.<init>(r4, r3)
            r4 = r7
            goto L_0x00c3
        L_0x00ba:
            if.q$a r7 = r5.f7694f
            java.lang.String r3 = r3.f6582a
            java.lang.String r8 = "Content-Type"
            r7.a(r8, r3)
        L_0x00c3:
            if.x$a r3 = r5.f7693e
            java.util.Objects.requireNonNull(r3)
            r3.f6632a = r2
            if.q$a r2 = r5.f7694f
            if.q r2 = r2.c()
            if.q$a r2 = r2.g()
            r3.f6634c = r2
            java.lang.String r2 = r5.f7689a
            r3.c(r2, r4)
            java.lang.Class<ki.l> r2 = ki.l.class
            ki.l r4 = new ki.l
            java.lang.reflect.Method r1 = r1.f7700a
            r4.<init>(r1, r6)
            r3.d(r2, r4)
            if.x r1 = r3.a()
            if.d r0 = r0.a(r1)
            java.lang.String r1 = "Call.Factory returned null."
            java.util.Objects.requireNonNull(r0, r1)
            return r0
        L_0x00f5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Malformed URL. Base: "
            java.lang.StringBuilder r1 = a.a.d(r1)
            if.r r2 = r5.f7690b
            r1.append(r2)
            java.lang.String r2 = ", Relative: "
            r1.append(r2)
            java.lang.String r2 = r5.f7691c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0114:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Argument count ("
            java.lang.String r2 = ") doesn't match expected count ("
            java.lang.StringBuilder r1 = a8.a.d(r1, r4, r2)
            int r2 = r3.length
            java.lang.String r3 = ")"
            java.lang.String r1 = androidx.activity.result.d.c(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.r.a():if.d");
    }

    public final d b() throws IOException {
        d dVar = this.f7629u;
        if (dVar != null) {
            return dVar;
        }
        Throwable th2 = this.f7630v;
        if (th2 == null) {
            try {
                d a10 = a();
                this.f7629u = a10;
                return a10;
            } catch (IOException | Error | RuntimeException e10) {
                e0.n(e10);
                this.f7630v = e10;
                throw e10;
            }
        } else if (th2 instanceof IOException) {
            throw ((IOException) th2);
        } else if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        } else {
            throw ((Error) th2);
        }
    }

    public final z<T> c(a0 a0Var) throws IOException {
        b0 b0Var = a0Var.f6458v;
        a0.a aVar = new a0.a(a0Var);
        aVar.g = new c(b0Var.c(), b0Var.a());
        a0 a10 = aVar.a();
        int i = a10.f6455s;
        if (i < 200 || i >= 300) {
            try {
                b0 a11 = e0.a(b0Var);
                if (!a10.c()) {
                    return new z<>(a10, null, a11);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                b0Var.close();
            }
        } else if (i == 204 || i == 205) {
            b0Var.close();
            return z.b(null, a10);
        } else {
            b bVar = new b(b0Var);
            try {
                return z.b(this.f7627s.a(bVar), a10);
            } catch (RuntimeException e10) {
                IOException iOException = bVar.f7636s;
                if (iOException == null) {
                    throw e10;
                }
                throw iOException;
            }
        }
    }

    public final void cancel() {
        d dVar;
        this.f7628t = true;
        synchronized (this) {
            dVar = this.f7629u;
        }
        if (dVar != null) {
            dVar.cancel();
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new r(this.f7624a, this.f7625b, this.f7626c, this.f7627s);
    }

    public final synchronized x e() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return b().e();
    }

    public final boolean f() {
        boolean z = true;
        if (this.f7628t) {
            return true;
        }
        synchronized (this) {
            d dVar = this.f7629u;
            if (dVar == null || !dVar.f()) {
                z = false;
            }
        }
        return z;
    }

    public final void t(d<T> dVar) {
        d dVar2;
        Throwable th2;
        synchronized (this) {
            if (!this.f7631w) {
                this.f7631w = true;
                dVar2 = this.f7629u;
                th2 = this.f7630v;
                if (dVar2 == null && th2 == null) {
                    try {
                        d a10 = a();
                        this.f7629u = a10;
                        dVar2 = a10;
                    } catch (Throwable th3) {
                        th2 = th3;
                        e0.n(th2);
                        this.f7630v = th2;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th2 != null) {
            dVar.a(this, th2);
            return;
        }
        if (this.f7628t) {
            dVar2.cancel();
        }
        dVar2.s(new a(dVar));
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final b m13clone() {
        return new r(this.f7624a, this.f7625b, this.f7626c, this.f7627s);
    }
}
