package aj;

import android.database.Cursor;
import h1.e0;
import h1.g0;
import h1.o;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f671a;

    /* renamed from: b  reason: collision with root package name */
    public final o f672b;

    /* renamed from: c  reason: collision with root package name */
    public final o f673c;

    public class a extends o {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR REPLACE INTO `LOI` (`l_key`,`la`,`lo`,`al`,`ac`,`gt`) VALUES (?,?,?,?,?,?)";
        }

        public final void e(l1.e eVar, Object obj) {
            f fVar = (f) obj;
            String str = fVar.f674a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            eVar.G(2, fVar.f675b);
            eVar.G(3, fVar.f676c);
            eVar.G(4, fVar.f677d);
            eVar.G(5, (double) fVar.f678e);
            eVar.X(6, fVar.f679f);
        }
    }

    public class b extends o {
        public b(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "UPDATE OR REPLACE `LOI` SET `l_key` = ?,`la` = ?,`lo` = ?,`al` = ?,`ac` = ?,`gt` = ? WHERE `l_key` = ?";
        }

        public final void e(l1.e eVar, Object obj) {
            f fVar = (f) obj;
            String str = fVar.f674a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            eVar.G(2, fVar.f675b);
            eVar.G(3, fVar.f676c);
            eVar.G(4, fVar.f677d);
            eVar.G(5, (double) fVar.f678e);
            eVar.X(6, fVar.f679f);
            String str2 = fVar.f674a;
            if (str2 == null) {
                eVar.D(7);
            } else {
                eVar.r(7, str2);
            }
        }
    }

    public e(e0 e0Var) {
        this.f671a = e0Var;
        this.f672b = new a(e0Var);
        this.f673c = new b(e0Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: aj.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: aj.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: aj.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: aj.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: aj.f} */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final aj.f a() {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "SELECT * FROM loi WHERE l_key = 'last_l'"
            r2 = 0
            h1.g0 r2 = h1.g0.e(r0, r2)
            h1.e0 r0 = r1.f671a
            r0.b()
            h1.e0 r0 = r1.f671a
            android.database.Cursor r3 = r0.o(r2)
            java.lang.String r0 = "l_key"
            int r0 = j1.b.a(r3, r0)     // Catch:{ all -> 0x006d }
            java.lang.String r4 = "la"
            int r4 = j1.b.a(r3, r4)     // Catch:{ all -> 0x006d }
            java.lang.String r5 = "lo"
            int r5 = j1.b.a(r3, r5)     // Catch:{ all -> 0x006d }
            java.lang.String r6 = "al"
            int r6 = j1.b.a(r3, r6)     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "ac"
            int r7 = j1.b.a(r3, r7)     // Catch:{ all -> 0x006d }
            java.lang.String r8 = "gt"
            int r8 = j1.b.a(r3, r8)     // Catch:{ all -> 0x006d }
            boolean r9 = r3.moveToFirst()     // Catch:{ all -> 0x006d }
            r10 = 0
            if (r9 == 0) goto L_0x0066
            boolean r9 = r3.isNull(r0)     // Catch:{ all -> 0x006d }
            if (r9 == 0) goto L_0x0047
        L_0x0045:
            r12 = r10
            goto L_0x004c
        L_0x0047:
            java.lang.String r10 = r3.getString(r0)     // Catch:{ all -> 0x006d }
            goto L_0x0045
        L_0x004c:
            double r13 = r3.getDouble(r4)     // Catch:{ all -> 0x006d }
            double r15 = r3.getDouble(r5)     // Catch:{ all -> 0x006d }
            double r17 = r3.getDouble(r6)     // Catch:{ all -> 0x006d }
            float r19 = r3.getFloat(r7)     // Catch:{ all -> 0x006d }
            long r20 = r3.getLong(r8)     // Catch:{ all -> 0x006d }
            aj.f r10 = new aj.f     // Catch:{ all -> 0x006d }
            r11 = r10
            r11.<init>(r12, r13, r15, r17, r19, r20)     // Catch:{ all -> 0x006d }
        L_0x0066:
            r3.close()
            r2.release()
            return r10
        L_0x006d:
            r0 = move-exception
            r3.close()
            r2.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.e.a():aj.f");
    }

    public final boolean b() {
        boolean z = false;
        g0 e10 = g0.e("SELECT EXISTS(SELECT l_key FROM loi WHERE l_key = 'last_l')", 0);
        this.f671a.b();
        Cursor o4 = this.f671a.o(e10);
        try {
            if (o4.moveToFirst() && o4.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            o4.close();
            e10.release();
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [h1.o, h1.i0, aj.e$b] */
    public final void c(f fVar) {
        ? r02;
        l1.e a10;
        this.f671a.b();
        this.f671a.c();
        try {
            r02 = this.f673c;
            a10 = r02.a();
            r02.e(a10, fVar);
            a10.x();
            r02.d(a10);
            this.f671a.p();
            this.f671a.l();
        } catch (Throwable th2) {
            this.f671a.l();
            throw th2;
        }
    }

    public final void d(f fVar) {
        this.f671a.b();
        this.f671a.c();
        try {
            this.f672b.f(fVar);
            this.f671a.p();
        } finally {
            this.f671a.l();
        }
    }
}
