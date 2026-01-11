package aj;

import h1.e0;
import h1.o;
import l1.e;

public final class q implements p {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f706a;

    /* renamed from: b  reason: collision with root package name */
    public final o f707b;

    public class a extends o {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `UserKeyPair` (`private_key`,`public_key`,`timestamp_in_sec`,`expiry_after_sec`,`row_id`) VALUES (?,?,?,?,nullif(?, 0))";
        }

        public final void e(e eVar, Object obj) {
            r rVar = (r) obj;
            String str = rVar.f708a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            String str2 = rVar.f709b;
            if (str2 == null) {
                eVar.D(2);
            } else {
                eVar.r(2, str2);
            }
            eVar.X(3, rVar.f710c);
            eVar.X(4, (long) rVar.f711d);
            eVar.X(5, rVar.f712e);
        }
    }

    public q(e0 e0Var) {
        this.f706a = e0Var;
        this.f707b = new a(e0Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: aj.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: aj.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: aj.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: aj.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: aj.r} */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final aj.r a() {
        /*
            r15 = this;
            java.lang.String r0 = "SELECT * FROM userkeypair ORDER BY timestamp_in_sec DESC LIMIT 1;"
            r1 = 0
            h1.g0 r0 = h1.g0.e(r0, r1)
            h1.e0 r1 = r15.f706a
            r1.b()
            h1.e0 r1 = r15.f706a
            android.database.Cursor r1 = r1.o(r0)
            java.lang.String r2 = "private_key"
            int r2 = j1.b.a(r1, r2)     // Catch:{ all -> 0x006c }
            java.lang.String r3 = "public_key"
            int r3 = j1.b.a(r1, r3)     // Catch:{ all -> 0x006c }
            java.lang.String r4 = "timestamp_in_sec"
            int r4 = j1.b.a(r1, r4)     // Catch:{ all -> 0x006c }
            java.lang.String r5 = "expiry_after_sec"
            int r5 = j1.b.a(r1, r5)     // Catch:{ all -> 0x006c }
            java.lang.String r6 = "row_id"
            int r6 = j1.b.a(r1, r6)     // Catch:{ all -> 0x006c }
            boolean r7 = r1.moveToFirst()     // Catch:{ all -> 0x006c }
            r8 = 0
            if (r7 == 0) goto L_0x0065
            boolean r7 = r1.isNull(r2)     // Catch:{ all -> 0x006c }
            if (r7 == 0) goto L_0x003f
            r10 = r8
            goto L_0x0044
        L_0x003f:
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x006c }
            r10 = r2
        L_0x0044:
            boolean r2 = r1.isNull(r3)     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x004c
        L_0x004a:
            r11 = r8
            goto L_0x0051
        L_0x004c:
            java.lang.String r8 = r1.getString(r3)     // Catch:{ all -> 0x006c }
            goto L_0x004a
        L_0x0051:
            long r12 = r1.getLong(r4)     // Catch:{ all -> 0x006c }
            int r14 = r1.getInt(r5)     // Catch:{ all -> 0x006c }
            aj.r r8 = new aj.r     // Catch:{ all -> 0x006c }
            r9 = r8
            r9.<init>(r10, r11, r12, r14)     // Catch:{ all -> 0x006c }
            long r2 = r1.getLong(r6)     // Catch:{ all -> 0x006c }
            r8.f712e = r2     // Catch:{ all -> 0x006c }
        L_0x0065:
            r1.close()
            r0.release()
            return r8
        L_0x006c:
            r2 = move-exception
            r1.close()
            r0.release()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.q.a():aj.r");
    }

    public final long b(r rVar) {
        this.f706a.b();
        this.f706a.c();
        try {
            long g = this.f707b.g(rVar);
            this.f706a.p();
            return g;
        } finally {
            this.f706a.l();
        }
    }
}
