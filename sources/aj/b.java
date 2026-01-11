package aj;

import ah.v;
import android.database.Cursor;
import h1.e0;
import h1.g0;
import h1.i0;
import h1.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.e;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f654a;

    /* renamed from: b  reason: collision with root package name */
    public final o f655b;

    /* renamed from: c  reason: collision with root package name */
    public final v f656c = new v();

    /* renamed from: d  reason: collision with root package name */
    public final aa.b f657d = new aa.b();

    /* renamed from: e  reason: collision with root package name */
    public final C0003b f658e;

    /* renamed from: f  reason: collision with root package name */
    public final c f659f;

    public class a extends o {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `BundleEntry` (`bid`,`fid`,`destination`,`source`,`offset`,`appdata`,`constraints`,`tags`,`created`,`expire`,`bundle`,`row_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a4, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a5, code lost:
            ad.c.z(r0, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
            throw r6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(l1.e r5, java.lang.Object r6) {
            /*
                r4 = this;
                aj.c r6 = (aj.c) r6
                java.lang.String r0 = r6.f661a
                r1 = 1
                if (r0 != 0) goto L_0x000b
                r5.D(r1)
                goto L_0x000e
            L_0x000b:
                r5.r(r1, r0)
            L_0x000e:
                java.lang.String r0 = r6.f662b
                r1 = 2
                if (r0 != 0) goto L_0x0017
                r5.D(r1)
                goto L_0x001a
            L_0x0017:
                r5.r(r1, r0)
            L_0x001a:
                java.lang.String r0 = r6.f663c
                r2 = 3
                if (r0 != 0) goto L_0x0023
                r5.D(r2)
                goto L_0x0026
            L_0x0023:
                r5.r(r2, r0)
            L_0x0026:
                java.lang.String r0 = r6.f664d
                r2 = 4
                if (r0 != 0) goto L_0x002f
                r5.D(r2)
                goto L_0x0032
            L_0x002f:
                r5.r(r2, r0)
            L_0x0032:
                long r2 = r6.f665e
                r0 = 5
                r5.X(r0, r2)
                long r2 = r6.f666f
                r0 = 6
                r5.X(r0, r2)
                aj.b r0 = aj.b.this
                ah.v r0 = r0.f656c
                java.util.List<java.lang.String> r2 = r6.g
                java.lang.String r0 = r0.i(r2)
                r2 = 7
                r5.r(r2, r0)
                aj.b r0 = aj.b.this
                ah.v r0 = r0.f656c
                java.util.List<java.lang.String> r2 = r6.f667h
                java.lang.String r0 = r0.i(r2)
                r2 = 8
                r5.r(r2, r0)
                long r2 = r6.i
                r0 = 9
                r5.X(r0, r2)
                long r2 = r6.f668j
                r0 = 10
                r5.X(r0, r2)
                aj.b r0 = aj.b.this
                aa.b r0 = r0.f657d
                xe.f r2 = r6.f669k
                java.util.Objects.requireNonNull(r0)
                java.lang.String r0 = "bundle"
                e6.e.D(r2, r0)
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
                r0.<init>()
                r3 = 0
                l6.b1.g(r2, r0)     // Catch:{ all -> 0x00a2 }
                byte[] r2 = r0.toByteArray()     // Catch:{ all -> 0x00a2 }
                ad.c.z(r0, r3)
                java.lang.String r0 = "ByteArrayOutputStream().…   it.toByteArray()\n    }"
                e6.e.C(r2, r0)
                java.lang.String r0 = android.util.Base64.encodeToString(r2, r1)
                java.lang.String r1 = "encodeToString(bundle.cborMarshal(), NO_WRAP)"
                e6.e.C(r0, r1)
                r1 = 11
                r5.r(r1, r0)
                long r0 = r6.f670l
                r6 = 12
                r5.X(r6, r0)
                return
            L_0x00a2:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x00a4 }
            L_0x00a4:
                r6 = move-exception
                ad.c.z(r0, r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: aj.b.a.e(l1.e, java.lang.Object):void");
        }
    }

    /* renamed from: aj.b$b  reason: collision with other inner class name */
    public class C0003b extends i0 {
        public C0003b(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "DELETE FROM bundleEntry WHERE expire < ?";
        }
    }

    public class c extends i0 {
        public c(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "DELETE FROM bundleEntry WHERE bid = ?";
        }
    }

    public b(e0 e0Var) {
        this.f654a = e0Var;
        this.f655b = new a(e0Var);
        this.f658e = new C0003b(e0Var);
        this.f659f = new c(e0Var);
        new AtomicBoolean(false);
    }

    public final List<String> a() {
        g0 e10 = g0.e("SELECT bid FROM bundleEntry ORDER BY expire DESC ", 0);
        this.f654a.b();
        Cursor o4 = this.f654a.o(e10);
        try {
            ArrayList arrayList = new ArrayList(o4.getCount());
            while (o4.moveToNext()) {
                arrayList.add(o4.isNull(0) ? null : o4.getString(0));
            }
            return arrayList;
        } finally {
            o4.close();
            e10.release();
        }
    }

    public final void b(String str) {
        this.f654a.b();
        e a10 = this.f659f.a();
        a10.r(1, str);
        this.f654a.c();
        try {
            a10.x();
            this.f654a.p();
        } finally {
            this.f654a.l();
            this.f659f.d(a10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: aj.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: aj.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: aj.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: aj.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: aj.c} */
    /* JADX WARNING: type inference failed for: r17v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final aj.c c(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r34
            r0 = r35
            java.lang.String r2 = "bundle"
            java.lang.String r3 = "SELECT * FROM bundleEntry WHERE bid = ?"
            r4 = 1
            h1.g0 r3 = h1.g0.e(r3, r4)
            if (r0 != 0) goto L_0x0013
            r3.D(r4)
            goto L_0x0016
        L_0x0013:
            r3.r(r4, r0)
        L_0x0016:
            h1.e0 r0 = r1.f654a
            r0.b()
            h1.e0 r0 = r1.f654a
            android.database.Cursor r4 = r0.o(r3)
            java.lang.String r0 = "bid"
            int r0 = j1.b.a(r4, r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r5 = "fid"
            int r5 = j1.b.a(r4, r5)     // Catch:{ all -> 0x0128 }
            java.lang.String r6 = "destination"
            int r6 = j1.b.a(r4, r6)     // Catch:{ all -> 0x0128 }
            java.lang.String r7 = "source"
            int r7 = j1.b.a(r4, r7)     // Catch:{ all -> 0x0128 }
            java.lang.String r8 = "offset"
            int r8 = j1.b.a(r4, r8)     // Catch:{ all -> 0x0128 }
            java.lang.String r9 = "appdata"
            int r9 = j1.b.a(r4, r9)     // Catch:{ all -> 0x0128 }
            java.lang.String r10 = "constraints"
            int r10 = j1.b.a(r4, r10)     // Catch:{ all -> 0x0128 }
            java.lang.String r11 = "tags"
            int r11 = j1.b.a(r4, r11)     // Catch:{ all -> 0x0128 }
            java.lang.String r12 = "created"
            int r12 = j1.b.a(r4, r12)     // Catch:{ all -> 0x0128 }
            java.lang.String r13 = "expire"
            int r13 = j1.b.a(r4, r13)     // Catch:{ all -> 0x0128 }
            int r14 = j1.b.a(r4, r2)     // Catch:{ all -> 0x0128 }
            java.lang.String r15 = "row_id"
            int r15 = j1.b.a(r4, r15)     // Catch:{ all -> 0x0128 }
            boolean r16 = r4.moveToFirst()     // Catch:{ all -> 0x0128 }
            r17 = 0
            if (r16 == 0) goto L_0x0121
            boolean r16 = r4.isNull(r0)     // Catch:{ all -> 0x0128 }
            if (r16 == 0) goto L_0x0078
            r19 = r17
            goto L_0x007e
        L_0x0078:
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0128 }
            r19 = r0
        L_0x007e:
            boolean r0 = r4.isNull(r5)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0087
            r20 = r17
            goto L_0x008d
        L_0x0087:
            java.lang.String r0 = r4.getString(r5)     // Catch:{ all -> 0x0128 }
            r20 = r0
        L_0x008d:
            boolean r0 = r4.isNull(r6)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0096
            r21 = r17
            goto L_0x009c
        L_0x0096:
            java.lang.String r0 = r4.getString(r6)     // Catch:{ all -> 0x0128 }
            r21 = r0
        L_0x009c:
            boolean r0 = r4.isNull(r7)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x00a5
            r22 = r17
            goto L_0x00ab
        L_0x00a5:
            java.lang.String r0 = r4.getString(r7)     // Catch:{ all -> 0x0128 }
            r22 = r0
        L_0x00ab:
            long r23 = r4.getLong(r8)     // Catch:{ all -> 0x0128 }
            long r25 = r4.getLong(r9)     // Catch:{ all -> 0x0128 }
            boolean r0 = r4.isNull(r10)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x00bc
            r0 = r17
            goto L_0x00c0
        L_0x00bc:
            java.lang.String r0 = r4.getString(r10)     // Catch:{ all -> 0x0128 }
        L_0x00c0:
            ah.v r5 = r1.f656c     // Catch:{ all -> 0x0128 }
            java.util.List r27 = r5.k(r0)     // Catch:{ all -> 0x0128 }
            boolean r0 = r4.isNull(r11)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x00cf
            r0 = r17
            goto L_0x00d3
        L_0x00cf:
            java.lang.String r0 = r4.getString(r11)     // Catch:{ all -> 0x0128 }
        L_0x00d3:
            ah.v r5 = r1.f656c     // Catch:{ all -> 0x0128 }
            java.util.List r28 = r5.k(r0)     // Catch:{ all -> 0x0128 }
            long r29 = r4.getLong(r12)     // Catch:{ all -> 0x0128 }
            long r31 = r4.getLong(r13)     // Catch:{ all -> 0x0128 }
            boolean r0 = r4.isNull(r14)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x00e8
            goto L_0x00ec
        L_0x00e8:
            java.lang.String r17 = r4.getString(r14)     // Catch:{ all -> 0x0128 }
        L_0x00ec:
            r0 = r17
            aa.b r5 = r1.f657d     // Catch:{ all -> 0x0128 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0128 }
            e6.e.D(r0, r2)     // Catch:{ all -> 0x0128 }
            r2 = 2
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = "decode(bundle, NO_WRAP)"
            e6.e.C(r0, r2)     // Catch:{ all -> 0x0128 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0128 }
            r2.<init>(r0)     // Catch:{ all -> 0x0128 }
            p4.b r0 = new p4.b     // Catch:{ all -> 0x0128 }
            r0.<init>()     // Catch:{ all -> 0x0128 }
            p4.d r0 = r0.c(r2)     // Catch:{ all -> 0x0128 }
            xe.f r33 = xe.n.a(r0)     // Catch:{ all -> 0x0128 }
            aj.c r0 = new aj.c     // Catch:{ all -> 0x0128 }
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r25, r27, r28, r29, r31, r33)     // Catch:{ all -> 0x0128 }
            long r5 = r4.getLong(r15)     // Catch:{ all -> 0x0128 }
            r0.f670l = r5     // Catch:{ all -> 0x0128 }
            r17 = r0
        L_0x0121:
            r4.close()
            r3.release()
            return r17
        L_0x0128:
            r0 = move-exception
            r4.close()
            r3.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.b.c(java.lang.String):aj.c");
    }

    public final void d(long j10) {
        this.f654a.b();
        e a10 = this.f658e.a();
        a10.X(1, j10);
        this.f654a.c();
        try {
            a10.x();
            this.f654a.p();
        } finally {
            this.f654a.l();
            this.f658e.d(a10);
        }
    }

    public final boolean e(String str) {
        boolean z = true;
        g0 e10 = g0.e("SELECT EXISTS(SELECT bid FROM bundleEntry WHERE bid = ?)", 1);
        e10.r(1, str);
        this.f654a.b();
        Cursor o4 = this.f654a.o(e10);
        try {
            if (!o4.moveToFirst() || o4.getInt(0) == 0) {
                z = false;
            }
            return z;
        } finally {
            o4.close();
            e10.release();
        }
    }

    public final long f(c cVar) {
        this.f654a.b();
        this.f654a.c();
        try {
            long g = this.f655b.g(cVar);
            this.f654a.p();
            return g;
        } finally {
            this.f654a.l();
        }
    }

    public final int size() {
        int i = 0;
        g0 e10 = g0.e("SELECT COUNT(bid) FROM bundleEntry", 0);
        this.f654a.b();
        Cursor o4 = this.f654a.o(e10);
        try {
            if (o4.moveToFirst()) {
                i = o4.getInt(0);
            }
            return i;
        } finally {
            o4.close();
            e10.release();
        }
    }
}
