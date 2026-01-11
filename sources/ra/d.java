package ra;

import android.database.Cursor;
import android.os.CancellationSignal;
import h1.e0;
import h1.g0;
import h1.i0;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f10597a;

    /* renamed from: b  reason: collision with root package name */
    public final h1.o f10598b;

    /* renamed from: c  reason: collision with root package name */
    public final m3.c f10599c = new m3.c();

    /* renamed from: d  reason: collision with root package name */
    public final h1.o f10600d;

    /* renamed from: e  reason: collision with root package name */
    public final h1.o f10601e;

    /* renamed from: f  reason: collision with root package name */
    public final k f10602f;
    public final l g;

    /* renamed from: h  reason: collision with root package name */
    public final m f10603h;

    public class a implements Callable<md.m> {
        public a() {
        }

        public final Object call() throws Exception {
            l1.e a10 = d.this.f10602f.a();
            d.this.f10597a.c();
            try {
                a10.x();
                d.this.f10597a.p();
                return md.m.f8555a;
            } finally {
                d.this.f10597a.l();
                d.this.f10602f.d(a10);
            }
        }
    }

    public class b implements Callable<md.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10605a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f10606b;

        public b(long j10, long j11) {
            this.f10605a = j10;
            this.f10606b = j11;
        }

        public final Object call() throws Exception {
            l1.e a10 = d.this.g.a();
            a10.X(1, this.f10605a);
            a10.X(2, this.f10606b);
            d.this.f10597a.c();
            try {
                a10.x();
                d.this.f10597a.p();
                return md.m.f8555a;
            } finally {
                d.this.f10597a.l();
                d.this.g.d(a10);
            }
        }
    }

    public class c implements Callable<md.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10608a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f10609b;

        public c(long j10, long j11) {
            this.f10608a = j10;
            this.f10609b = j11;
        }

        public final Object call() throws Exception {
            l1.e a10 = d.this.f10603h.a();
            a10.X(1, this.f10608a);
            a10.X(2, this.f10609b);
            d.this.f10597a.c();
            try {
                a10.x();
                d.this.f10597a.p();
                return md.m.f8555a;
            } finally {
                d.this.f10597a.l();
                d.this.f10603h.d(a10);
            }
        }
    }

    /* renamed from: ra.d$d  reason: collision with other inner class name */
    public class C0209d implements Callable<List<sa.b>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0 f10611a;

        public C0209d(g0 g0Var) {
            this.f10611a = g0Var;
        }

        public final Object call() throws Exception {
            String str;
            String str2;
            int i;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            Cursor o4 = d.this.f10597a.o(this.f10611a);
            try {
                int a10 = j1.b.a(o4, "FROM");
                int a11 = j1.b.a(o4, "TO");
                int a12 = j1.b.a(o4, "AMOUNT");
                int a13 = j1.b.a(o4, "FEES");
                int a14 = j1.b.a(o4, "PURPOSE");
                int a15 = j1.b.a(o4, "BLOCK_HASH");
                int a16 = j1.b.a(o4, "BLOCK_NUMBER");
                int a17 = j1.b.a(o4, "EXTRINSIC_INDEX");
                int a18 = j1.b.a(o4, "EXTRINSIC_HASH");
                int a19 = j1.b.a(o4, "TIMESTAMP");
                int a20 = j1.b.a(o4, "TRANSACTION_TYPE");
                int a21 = j1.b.a(o4, "IS_PENDING");
                ArrayList arrayList = new ArrayList(o4.getCount());
                while (o4.moveToNext()) {
                    String str8 = null;
                    if (o4.isNull(a10)) {
                        str = null;
                    } else {
                        str = o4.getString(a10);
                    }
                    if (o4.isNull(a11)) {
                        str2 = null;
                    } else {
                        str2 = o4.getString(a11);
                    }
                    if (o4.isNull(a12)) {
                        i = a10;
                        str3 = null;
                    } else {
                        str3 = o4.getString(a12);
                        i = a10;
                    }
                    BigInteger c10 = d.this.f10599c.c(str3);
                    if (o4.isNull(a13)) {
                        str4 = null;
                    } else {
                        str4 = o4.getString(a13);
                    }
                    BigInteger c11 = d.this.f10599c.c(str4);
                    if (o4.isNull(a14)) {
                        str5 = null;
                    } else {
                        str5 = o4.getString(a14);
                    }
                    if (o4.isNull(a15)) {
                        str6 = null;
                    } else {
                        str6 = o4.getString(a15);
                    }
                    long j10 = o4.getLong(a16);
                    if (o4.isNull(a17)) {
                        str7 = null;
                    } else {
                        str7 = o4.getString(a17);
                    }
                    if (!o4.isNull(a18)) {
                        str8 = o4.getString(a18);
                    }
                    arrayList.add(new sa.b(str, str2, c10, c11, str5, str6, j10, str7, str8, o4.getLong(a19), d.j(d.this, o4.getString(a20)), o4.getInt(a21) != 0));
                    a10 = i;
                }
                return arrayList;
            } finally {
                o4.close();
                this.f10611a.release();
            }
        }
    }

    public class e implements Callable<List<sa.b>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0 f10613a;

        public e(g0 g0Var) {
            this.f10613a = g0Var;
        }

        public final Object call() throws Exception {
            String str;
            String str2;
            int i;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            Cursor o4 = d.this.f10597a.o(this.f10613a);
            try {
                int a10 = j1.b.a(o4, "FROM");
                int a11 = j1.b.a(o4, "TO");
                int a12 = j1.b.a(o4, "AMOUNT");
                int a13 = j1.b.a(o4, "FEES");
                int a14 = j1.b.a(o4, "PURPOSE");
                int a15 = j1.b.a(o4, "BLOCK_HASH");
                int a16 = j1.b.a(o4, "BLOCK_NUMBER");
                int a17 = j1.b.a(o4, "EXTRINSIC_INDEX");
                int a18 = j1.b.a(o4, "EXTRINSIC_HASH");
                int a19 = j1.b.a(o4, "TIMESTAMP");
                int a20 = j1.b.a(o4, "TRANSACTION_TYPE");
                int a21 = j1.b.a(o4, "IS_PENDING");
                ArrayList arrayList = new ArrayList(o4.getCount());
                while (o4.moveToNext()) {
                    String str8 = null;
                    if (o4.isNull(a10)) {
                        str = null;
                    } else {
                        str = o4.getString(a10);
                    }
                    if (o4.isNull(a11)) {
                        str2 = null;
                    } else {
                        str2 = o4.getString(a11);
                    }
                    if (o4.isNull(a12)) {
                        i = a10;
                        str3 = null;
                    } else {
                        str3 = o4.getString(a12);
                        i = a10;
                    }
                    BigInteger c10 = d.this.f10599c.c(str3);
                    if (o4.isNull(a13)) {
                        str4 = null;
                    } else {
                        str4 = o4.getString(a13);
                    }
                    BigInteger c11 = d.this.f10599c.c(str4);
                    if (o4.isNull(a14)) {
                        str5 = null;
                    } else {
                        str5 = o4.getString(a14);
                    }
                    if (o4.isNull(a15)) {
                        str6 = null;
                    } else {
                        str6 = o4.getString(a15);
                    }
                    long j10 = o4.getLong(a16);
                    if (o4.isNull(a17)) {
                        str7 = null;
                    } else {
                        str7 = o4.getString(a17);
                    }
                    if (!o4.isNull(a18)) {
                        str8 = o4.getString(a18);
                    }
                    arrayList.add(new sa.b(str, str2, c10, c11, str5, str6, j10, str7, str8, o4.getLong(a19), d.j(d.this, o4.getString(a20)), o4.getInt(a21) != 0));
                    a10 = i;
                }
                return arrayList;
            } finally {
                o4.close();
                this.f10613a.release();
            }
        }
    }

    public class f implements Callable<List<sa.b>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0 f10615a;

        public f(g0 g0Var) {
            this.f10615a = g0Var;
        }

        public final Object call() throws Exception {
            String str;
            String str2;
            int i;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            Cursor o4 = d.this.f10597a.o(this.f10615a);
            try {
                int a10 = j1.b.a(o4, "FROM");
                int a11 = j1.b.a(o4, "TO");
                int a12 = j1.b.a(o4, "AMOUNT");
                int a13 = j1.b.a(o4, "FEES");
                int a14 = j1.b.a(o4, "PURPOSE");
                int a15 = j1.b.a(o4, "BLOCK_HASH");
                int a16 = j1.b.a(o4, "BLOCK_NUMBER");
                int a17 = j1.b.a(o4, "EXTRINSIC_INDEX");
                int a18 = j1.b.a(o4, "EXTRINSIC_HASH");
                int a19 = j1.b.a(o4, "TIMESTAMP");
                int a20 = j1.b.a(o4, "TRANSACTION_TYPE");
                int a21 = j1.b.a(o4, "IS_PENDING");
                ArrayList arrayList = new ArrayList(o4.getCount());
                while (o4.moveToNext()) {
                    String str8 = null;
                    if (o4.isNull(a10)) {
                        str = null;
                    } else {
                        str = o4.getString(a10);
                    }
                    if (o4.isNull(a11)) {
                        str2 = null;
                    } else {
                        str2 = o4.getString(a11);
                    }
                    if (o4.isNull(a12)) {
                        i = a10;
                        str3 = null;
                    } else {
                        str3 = o4.getString(a12);
                        i = a10;
                    }
                    BigInteger c10 = d.this.f10599c.c(str3);
                    if (o4.isNull(a13)) {
                        str4 = null;
                    } else {
                        str4 = o4.getString(a13);
                    }
                    BigInteger c11 = d.this.f10599c.c(str4);
                    if (o4.isNull(a14)) {
                        str5 = null;
                    } else {
                        str5 = o4.getString(a14);
                    }
                    if (o4.isNull(a15)) {
                        str6 = null;
                    } else {
                        str6 = o4.getString(a15);
                    }
                    long j10 = o4.getLong(a16);
                    if (o4.isNull(a17)) {
                        str7 = null;
                    } else {
                        str7 = o4.getString(a17);
                    }
                    if (!o4.isNull(a18)) {
                        str8 = o4.getString(a18);
                    }
                    arrayList.add(new sa.b(str, str2, c10, c11, str5, str6, j10, str7, str8, o4.getLong(a19), d.j(d.this, o4.getString(a20)), o4.getInt(a21) != 0));
                    a10 = i;
                }
                return arrayList;
            } finally {
                o4.close();
                this.f10615a.release();
            }
        }
    }

    public static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10617a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                bb.g[] r0 = bb.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10617a = r0
                bb.g r1 = bb.g.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10617a     // Catch:{ NoSuchFieldError -> 0x001d }
                bb.g r1 = bb.g.TRANSFER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10617a     // Catch:{ NoSuchFieldError -> 0x0028 }
                bb.g r1 = bb.g.REWARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ra.d.g.<clinit>():void");
        }
    }

    public class h extends h1.o {
        public h(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR REPLACE INTO `TBL_TRANSACTION` (`FROM`,`TO`,`AMOUNT`,`FEES`,`PURPOSE`,`BLOCK_HASH`,`BLOCK_NUMBER`,`EXTRINSIC_INDEX`,`EXTRINSIC_HASH`,`TIMESTAMP`,`TRANSACTION_TYPE`,`IS_PENDING`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        public final void e(l1.e eVar, Object obj) {
            sa.b bVar = (sa.b) obj;
            String str = bVar.f11036a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            String str2 = bVar.f11037b;
            if (str2 == null) {
                eVar.D(2);
            } else {
                eVar.r(2, str2);
            }
            String b10 = d.this.f10599c.b(bVar.f11038c);
            if (b10 == null) {
                eVar.D(3);
            } else {
                eVar.r(3, b10);
            }
            String b11 = d.this.f10599c.b(bVar.f11039s);
            if (b11 == null) {
                eVar.D(4);
            } else {
                eVar.r(4, b11);
            }
            String str3 = bVar.f11040t;
            if (str3 == null) {
                eVar.D(5);
            } else {
                eVar.r(5, str3);
            }
            String str4 = bVar.f11041u;
            if (str4 == null) {
                eVar.D(6);
            } else {
                eVar.r(6, str4);
            }
            eVar.X(7, bVar.f11042v);
            String str5 = bVar.f11043w;
            if (str5 == null) {
                eVar.D(8);
            } else {
                eVar.r(8, str5);
            }
            String str6 = bVar.f11044x;
            if (str6 == null) {
                eVar.D(9);
            } else {
                eVar.r(9, str6);
            }
            eVar.X(10, bVar.f11045y);
            bb.g gVar = bVar.z;
            if (gVar == null) {
                eVar.D(11);
            } else {
                eVar.r(11, d.this.k(gVar));
            }
            eVar.X(12, bVar.A ? 1 : 0);
        }
    }

    public class i extends h1.o {
        public i(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `TBL_TRANSACTION` (`FROM`,`TO`,`AMOUNT`,`FEES`,`PURPOSE`,`BLOCK_HASH`,`BLOCK_NUMBER`,`EXTRINSIC_INDEX`,`EXTRINSIC_HASH`,`TIMESTAMP`,`TRANSACTION_TYPE`,`IS_PENDING`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        public final void e(l1.e eVar, Object obj) {
            sa.b bVar = (sa.b) obj;
            String str = bVar.f11036a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            String str2 = bVar.f11037b;
            if (str2 == null) {
                eVar.D(2);
            } else {
                eVar.r(2, str2);
            }
            String b10 = d.this.f10599c.b(bVar.f11038c);
            if (b10 == null) {
                eVar.D(3);
            } else {
                eVar.r(3, b10);
            }
            String b11 = d.this.f10599c.b(bVar.f11039s);
            if (b11 == null) {
                eVar.D(4);
            } else {
                eVar.r(4, b11);
            }
            String str3 = bVar.f11040t;
            if (str3 == null) {
                eVar.D(5);
            } else {
                eVar.r(5, str3);
            }
            String str4 = bVar.f11041u;
            if (str4 == null) {
                eVar.D(6);
            } else {
                eVar.r(6, str4);
            }
            eVar.X(7, bVar.f11042v);
            String str5 = bVar.f11043w;
            if (str5 == null) {
                eVar.D(8);
            } else {
                eVar.r(8, str5);
            }
            String str6 = bVar.f11044x;
            if (str6 == null) {
                eVar.D(9);
            } else {
                eVar.r(9, str6);
            }
            eVar.X(10, bVar.f11045y);
            bb.g gVar = bVar.z;
            if (gVar == null) {
                eVar.D(11);
            } else {
                eVar.r(11, d.this.k(gVar));
            }
            eVar.X(12, bVar.A ? 1 : 0);
        }
    }

    public class j extends h1.o {
        public j(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "UPDATE OR ABORT `TBL_TRANSACTION` SET `FROM` = ?,`TO` = ?,`AMOUNT` = ?,`FEES` = ?,`PURPOSE` = ?,`BLOCK_HASH` = ?,`BLOCK_NUMBER` = ?,`EXTRINSIC_INDEX` = ?,`EXTRINSIC_HASH` = ?,`TIMESTAMP` = ?,`TRANSACTION_TYPE` = ?,`IS_PENDING` = ? WHERE `EXTRINSIC_HASH` = ?";
        }

        public final void e(l1.e eVar, Object obj) {
            sa.b bVar = (sa.b) obj;
            String str = bVar.f11036a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            String str2 = bVar.f11037b;
            if (str2 == null) {
                eVar.D(2);
            } else {
                eVar.r(2, str2);
            }
            String b10 = d.this.f10599c.b(bVar.f11038c);
            if (b10 == null) {
                eVar.D(3);
            } else {
                eVar.r(3, b10);
            }
            String b11 = d.this.f10599c.b(bVar.f11039s);
            if (b11 == null) {
                eVar.D(4);
            } else {
                eVar.r(4, b11);
            }
            String str3 = bVar.f11040t;
            if (str3 == null) {
                eVar.D(5);
            } else {
                eVar.r(5, str3);
            }
            String str4 = bVar.f11041u;
            if (str4 == null) {
                eVar.D(6);
            } else {
                eVar.r(6, str4);
            }
            eVar.X(7, bVar.f11042v);
            String str5 = bVar.f11043w;
            if (str5 == null) {
                eVar.D(8);
            } else {
                eVar.r(8, str5);
            }
            String str6 = bVar.f11044x;
            if (str6 == null) {
                eVar.D(9);
            } else {
                eVar.r(9, str6);
            }
            eVar.X(10, bVar.f11045y);
            bb.g gVar = bVar.z;
            if (gVar == null) {
                eVar.D(11);
            } else {
                eVar.r(11, d.this.k(gVar));
            }
            eVar.X(12, bVar.A ? 1 : 0);
            String str7 = bVar.f11044x;
            if (str7 == null) {
                eVar.D(13);
            } else {
                eVar.r(13, str7);
            }
        }
    }

    public class k extends i0 {
        public k(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "DELETE FROM TBL_TRANSACTION WHERE IS_PENDING = 0";
        }
    }

    public class l extends i0 {
        public l(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "DELETE FROM TBL_TRANSACTION WHERE ? - TIMESTAMP > ?";
        }
    }

    public class m extends i0 {
        public m(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "DELETE FROM TBL_TRANSACTION WHERE IS_PENDING = 1 AND ? - TIMESTAMP > ?";
        }
    }

    public class n implements Callable<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sa.b f10621a;

        public n(sa.b bVar) {
            this.f10621a = bVar;
        }

        public final Object call() throws Exception {
            d.this.f10597a.c();
            try {
                long g = d.this.f10598b.g(this.f10621a);
                d.this.f10597a.p();
                return Long.valueOf(g);
            } finally {
                d.this.f10597a.l();
            }
        }
    }

    public class o implements Callable<List<Long>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f10623a;

        public o(List list) {
            this.f10623a = list;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [h1.o, h1.i0, ra.d$i] */
        public final Object call() throws Exception {
            ? r02;
            l1.e a10;
            d.this.f10597a.c();
            try {
                r02 = d.this.f10600d;
                List<Object> list = this.f10623a;
                a10 = r02.a();
                ArrayList arrayList = new ArrayList(list.size());
                int i = 0;
                for (Object e10 : list) {
                    r02.e(a10, e10);
                    arrayList.add(i, Long.valueOf(a10.n0()));
                    i++;
                }
                r02.d(a10);
                d.this.f10597a.p();
                d.this.f10597a.l();
                return arrayList;
            } catch (Throwable th2) {
                d.this.f10597a.l();
                throw th2;
            }
        }
    }

    public class p implements Callable<md.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f10625a;

        public p(List list) {
            this.f10625a = list;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [h1.o, h1.i0, ra.d$j] */
        public final Object call() throws Exception {
            ? r02;
            l1.e a10;
            d.this.f10597a.c();
            try {
                r02 = d.this.f10601e;
                List<Object> list = this.f10625a;
                a10 = r02.a();
                for (Object e10 : list) {
                    r02.e(a10, e10);
                    a10.x();
                }
                r02.d(a10);
                d.this.f10597a.p();
                md.m mVar = md.m.f8555a;
                d.this.f10597a.l();
                return mVar;
            } catch (Throwable th2) {
                d.this.f10597a.l();
                throw th2;
            }
        }
    }

    public d(e0 e0Var) {
        this.f10597a = e0Var;
        this.f10598b = new h(e0Var);
        this.f10600d = new i(e0Var);
        this.f10601e = new j(e0Var);
        this.f10602f = new k(e0Var);
        this.g = new l(e0Var);
        this.f10603h = new m(e0Var);
    }

    public static bb.g j(d dVar, String str) {
        Objects.requireNonNull(dVar);
        if (str == null) {
            return null;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1880997073:
                if (str.equals("REWARD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2402104:
                if (str.equals("NONE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2063509483:
                if (str.equals("TRANSFER")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return bb.g.REWARD;
            case 1:
                return bb.g.NONE;
            case 2:
                return bb.g.TRANSFER;
            default:
                throw new IllegalArgumentException(a8.a.c("Can't convert value to enum, unknown value: ", str));
        }
    }

    public final Object a(pd.d<? super md.m> dVar) {
        return ad.c.I(this.f10597a, new a(), dVar);
    }

    public final Object b(pd.d<? super List<sa.b>> dVar) {
        g0 e10 = g0.e("SELECT * FROM TBL_TRANSACTION WHERE IS_PENDING = 1 ORDER BY TIMESTAMP DESC", 0);
        return ad.c.H(this.f10597a, new CancellationSignal(), new f(e10), dVar);
    }

    public final Object c(long j10, long j11, pd.d<? super List<sa.b>> dVar) {
        g0 e10 = g0.e("SELECT * FROM TBL_TRANSACTION WHERE TIMESTAMP > ? AND TIMESTAMP <= ?", 2);
        e10.X(1, j10);
        e10.X(2, j11);
        return ad.c.H(this.f10597a, new CancellationSignal(), new C0209d(e10), dVar);
    }

    public final Object d(long j10, long j11, pd.d<? super md.m> dVar) {
        return ad.c.I(this.f10597a, new c(j10, j11), dVar);
    }

    public final Object e(sa.b bVar, pd.d<? super Long> dVar) {
        return ad.c.I(this.f10597a, new n(bVar), dVar);
    }

    public final Object f(List<sa.b> list, pd.d<? super md.m> dVar) {
        return ad.c.I(this.f10597a, new p(list), dVar);
    }

    public final Object g(List<sa.b> list, pd.d<? super List<Long>> dVar) {
        return ad.c.I(this.f10597a, new o(list), dVar);
    }

    public final Object h(long j10, long j11, pd.d<? super md.m> dVar) {
        return ad.c.I(this.f10597a, new b(j10, j11), dVar);
    }

    public final Object i(bb.g gVar, int i10, pd.d<? super List<sa.b>> dVar) {
        g0 e10 = g0.e("SELECT * FROM TBL_TRANSACTION WHERE TRANSACTION_TYPE = ? ORDER BY TIMESTAMP DESC LIMIT ?", 2);
        if (gVar == null) {
            e10.D(1);
        } else {
            e10.r(1, k(gVar));
        }
        e10.X(2, (long) i10);
        return ad.c.H(this.f10597a, new CancellationSignal(), new e(e10), dVar);
    }

    public final String k(bb.g gVar) {
        if (gVar == null) {
            return null;
        }
        int i10 = g.f10617a[gVar.ordinal()];
        if (i10 == 1) {
            return "NONE";
        }
        if (i10 == 2) {
            return "TRANSFER";
        }
        if (i10 == 3) {
            return "REWARD";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + gVar);
    }
}
