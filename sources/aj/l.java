package aj;

import android.database.Cursor;
import android.util.Base64;
import b.n;
import ge.g0;
import h1.e0;
import h1.i0;
import h1.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import zb.r;

public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f685a;

    /* renamed from: b  reason: collision with root package name */
    public final o f686b;

    /* renamed from: c  reason: collision with root package name */
    public final o f687c;

    /* renamed from: d  reason: collision with root package name */
    public final jc.b f688d = new jc.b();

    /* renamed from: e  reason: collision with root package name */
    public final o f689e;

    /* renamed from: f  reason: collision with root package name */
    public final g0 f690f = new g0();
    public final d g;

    /* renamed from: h  reason: collision with root package name */
    public final e f691h;
    public final f i;

    /* renamed from: j  reason: collision with root package name */
    public final g f692j;

    public class a extends o {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `TxInDb` (`txhash`,`txLastRun`,`txExpire`,`txGasLeft`,`tx`,`tx_id`) VALUES (?,?,?,?,?,nullif(?, 0))";
        }

        public final void e(l1.e eVar, Object obj) {
            n nVar = (n) obj;
            String str = nVar.f697a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            eVar.X(2, nVar.f698b);
            eVar.X(3, nVar.f699c);
            eVar.X(4, nVar.f700d);
            String str2 = nVar.f701e;
            if (str2 == null) {
                eVar.D(5);
            } else {
                eVar.r(5, str2);
            }
            eVar.X(6, nVar.f702f);
        }
    }

    public class b extends o {
        public b(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `TxTargets` (`txhash`,`targets`,`target_id`) VALUES (?,?,nullif(?, 0))";
        }

        public final void e(l1.e eVar, Object obj) {
            o oVar = (o) obj;
            String str = oVar.f703a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            jc.b bVar = l.this.f688d;
            n nVar = oVar.f704b;
            Objects.requireNonNull(bVar);
            e6.e.D(nVar, "target");
            String encodeToString = Base64.encodeToString(nVar.e(), 2);
            e6.e.C(encodeToString, "encodeToString(target.toByteArray(), NO_WRAP)");
            eVar.r(2, encodeToString);
            eVar.X(3, oVar.f705c);
        }
    }

    public class c extends o {
        public c(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `TxEvents` (`txhash`,`events`,`event_id`) VALUES (?,?,nullif(?, 0))";
        }

        public final void e(l1.e eVar, Object obj) {
            m mVar = (m) obj;
            String str = mVar.f695a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            g0 g0Var = l.this.f690f;
            b.g gVar = mVar.f696b;
            Objects.requireNonNull(g0Var);
            e6.e.D(gVar, "events");
            String encodeToString = Base64.encodeToString(gVar.e(), 2);
            e6.e.C(encodeToString, "encodeToString(events.toByteArray(), NO_WRAP)");
            eVar.r(2, encodeToString);
            eVar.X(3, 0);
        }
    }

    public class d extends i0 {
        public d(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "DELETE FROM txindb WHERE txhash = ?";
        }
    }

    public class e extends i0 {
        public e(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "UPDATE txindb SET txGasLeft = ? WHERE txhash = ?";
        }
    }

    public class f extends i0 {
        public f(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "UPDATE txindb SET txLastRun = ? WHERE txhash = ?";
        }
    }

    public class g extends i0 {
        public g(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "DELETE FROM txindb WHERE txExpire < ?";
        }
    }

    public l(e0 e0Var) {
        this.f685a = e0Var;
        this.f686b = new a(e0Var);
        this.f687c = new b(e0Var);
        this.f689e = new c(e0Var);
        this.g = new d(e0Var);
        this.f691h = new e(e0Var);
        this.i = new f(e0Var);
        this.f692j = new g(e0Var);
        new AtomicBoolean(false);
    }

    public final List<o> a() {
        h1.g0 e10 = h1.g0.e("SELECT * FROM txtargets", 0);
        this.f685a.b();
        Cursor o4 = this.f685a.o(e10);
        try {
            int a10 = j1.b.a(o4, "txhash");
            int a11 = j1.b.a(o4, "targets");
            int a12 = j1.b.a(o4, "target_id");
            ArrayList arrayList = new ArrayList(o4.getCount());
            while (o4.moveToNext()) {
                String str = null;
                String string = o4.isNull(a10) ? null : o4.getString(a10);
                if (!o4.isNull(a11)) {
                    str = o4.getString(a11);
                }
                Objects.requireNonNull(this.f688d);
                e6.e.D(str, "target");
                o oVar = new o(string, (n) r.i(n.C, Base64.decode(str, 2)));
                oVar.f705c = o4.getLong(a12);
                arrayList.add(oVar);
            }
            return arrayList;
        } finally {
            o4.close();
            e10.release();
        }
    }

    public final void b(String str) {
        this.f685a.b();
        l1.e a10 = this.g.a();
        a10.r(1, str);
        this.f685a.c();
        try {
            a10.x();
            this.f685a.p();
        } finally {
            this.f685a.l();
            this.g.d(a10);
        }
    }

    public final Long c(String str) {
        h1.g0 e10 = h1.g0.e("SELECT txGasLeft FROM txindb WHERE txhash = ?", 1);
        e10.r(1, str);
        this.f685a.b();
        Long l10 = null;
        Cursor o4 = this.f685a.o(e10);
        try {
            if (o4.moveToFirst()) {
                if (!o4.isNull(0)) {
                    l10 = Long.valueOf(o4.getLong(0));
                }
            }
            return l10;
        } finally {
            o4.close();
            e10.release();
        }
    }

    public final void d(long j10) {
        this.f685a.b();
        l1.e a10 = this.f692j.a();
        a10.X(1, j10);
        this.f685a.c();
        try {
            a10.x();
            this.f685a.p();
        } finally {
            this.f685a.l();
            this.f692j.d(a10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: aj.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: aj.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: aj.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: aj.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: aj.n} */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final aj.n e(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            java.lang.String r2 = "SELECT * FROM txindb WHERE txhash = ?"
            r3 = 1
            h1.g0 r2 = h1.g0.e(r2, r3)
            if (r0 != 0) goto L_0x0011
            r2.D(r3)
            goto L_0x0014
        L_0x0011:
            r2.r(r3, r0)
        L_0x0014:
            h1.e0 r0 = r1.f685a
            r0.b()
            h1.e0 r0 = r1.f685a
            r3 = 0
            android.database.Cursor r4 = r0.o(r2)
            java.lang.String r0 = "txhash"
            int r0 = j1.b.a(r4, r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = "txLastRun"
            int r5 = j1.b.a(r4, r5)     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = "txExpire"
            int r6 = j1.b.a(r4, r6)     // Catch:{ all -> 0x0084 }
            java.lang.String r7 = "txGasLeft"
            int r7 = j1.b.a(r4, r7)     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = "tx"
            int r8 = j1.b.a(r4, r8)     // Catch:{ all -> 0x0084 }
            java.lang.String r9 = "tx_id"
            int r9 = j1.b.a(r4, r9)     // Catch:{ all -> 0x0084 }
            boolean r10 = r4.moveToFirst()     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x007d
            boolean r10 = r4.isNull(r0)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0052
            r11 = r3
            goto L_0x0057
        L_0x0052:
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0084 }
            r11 = r0
        L_0x0057:
            long r12 = r4.getLong(r5)     // Catch:{ all -> 0x0084 }
            long r14 = r4.getLong(r6)     // Catch:{ all -> 0x0084 }
            long r16 = r4.getLong(r7)     // Catch:{ all -> 0x0084 }
            boolean r0 = r4.isNull(r8)     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x006c
        L_0x0069:
            r18 = r3
            goto L_0x0071
        L_0x006c:
            java.lang.String r3 = r4.getString(r8)     // Catch:{ all -> 0x0084 }
            goto L_0x0069
        L_0x0071:
            aj.n r3 = new aj.n     // Catch:{ all -> 0x0084 }
            r10 = r3
            r10.<init>(r11, r12, r14, r16, r18)     // Catch:{ all -> 0x0084 }
            long r5 = r4.getLong(r9)     // Catch:{ all -> 0x0084 }
            r3.f702f = r5     // Catch:{ all -> 0x0084 }
        L_0x007d:
            r4.close()
            r2.release()
            return r3
        L_0x0084:
            r0 = move-exception
            r4.close()
            r2.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.l.e(java.lang.String):aj.n");
    }

    public final void f(String str, long j10) {
        this.f685a.b();
        l1.e a10 = this.f691h.a();
        a10.X(1, j10);
        a10.r(2, str);
        this.f685a.c();
        try {
            a10.x();
            this.f685a.p();
        } finally {
            this.f685a.l();
            this.f691h.d(a10);
        }
    }

    public final void g(String str, long j10) {
        this.f685a.b();
        l1.e a10 = this.i.a();
        a10.X(1, j10);
        a10.r(2, str);
        this.f685a.c();
        try {
            a10.x();
            this.f685a.p();
        } finally {
            this.f685a.l();
            this.i.d(a10);
        }
    }

    public final long h(m mVar) {
        this.f685a.b();
        this.f685a.c();
        try {
            long g8 = this.f689e.g(mVar);
            this.f685a.p();
            return g8;
        } finally {
            this.f685a.l();
        }
    }

    public final long i(o oVar) {
        this.f685a.b();
        this.f685a.c();
        try {
            long g8 = this.f687c.g(oVar);
            this.f685a.p();
            return g8;
        } finally {
            this.f685a.l();
        }
    }

    public final long j(n nVar) {
        this.f685a.b();
        this.f685a.c();
        try {
            long g8 = this.f686b.g(nVar);
            this.f685a.p();
            return g8;
        } finally {
            this.f685a.l();
        }
    }
}
