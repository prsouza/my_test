package ra;

import android.database.Cursor;
import android.os.CancellationSignal;
import h1.e0;
import h1.g0;
import h1.i0;
import h1.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import md.m;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f10587a;

    /* renamed from: b  reason: collision with root package name */
    public final o f10588b;

    /* renamed from: c  reason: collision with root package name */
    public final C0208b f10589c;

    public class a extends o {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR REPLACE INTO `TBL_NOTIFICATION` (`ID`,`DATA`,`TIMESTAMP`,`EXPIRE_TIMESTAMP`,`IS_SEEN`) VALUES (?,?,?,?,?)";
        }

        public final void e(l1.e eVar, Object obj) {
            sa.a aVar = (sa.a) obj;
            eVar.X(1, (long) aVar.f11031a);
            String str = aVar.f11032b;
            if (str == null) {
                eVar.D(2);
            } else {
                eVar.r(2, str);
            }
            eVar.X(3, aVar.f11033c);
            eVar.X(4, aVar.f11034d);
            eVar.X(5, aVar.f11035e ? 1 : 0);
        }
    }

    /* renamed from: ra.b$b  reason: collision with other inner class name */
    public class C0208b extends i0 {
        public C0208b(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "UPDATE TBL_NOTIFICATION SET IS_SEEN = ? WHERE ID = ?";
        }
    }

    public class c implements Callable<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sa.a f10590a;

        public c(sa.a aVar) {
            this.f10590a = aVar;
        }

        public final Object call() throws Exception {
            b.this.f10587a.c();
            try {
                b.this.f10588b.f(this.f10590a);
                b.this.f10587a.p();
                return m.f8555a;
            } finally {
                b.this.f10587a.l();
            }
        }
    }

    public class d implements Callable<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f10592a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f10593b;

        public d(int i, int i10) {
            this.f10592a = i;
            this.f10593b = i10;
        }

        public final Object call() throws Exception {
            l1.e a10 = b.this.f10589c.a();
            a10.X(1, (long) this.f10592a);
            a10.X(2, (long) this.f10593b);
            b.this.f10587a.c();
            try {
                a10.x();
                b.this.f10587a.p();
                return m.f8555a;
            } finally {
                b.this.f10587a.l();
                b.this.f10589c.d(a10);
            }
        }
    }

    public class e implements Callable<List<sa.a>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0 f10595a;

        public e(g0 g0Var) {
            this.f10595a = g0Var;
        }

        public final Object call() throws Exception {
            String string;
            Cursor o4 = b.this.f10587a.o(this.f10595a);
            try {
                int a10 = j1.b.a(o4, "ID");
                int a11 = j1.b.a(o4, "DATA");
                int a12 = j1.b.a(o4, "TIMESTAMP");
                int a13 = j1.b.a(o4, "EXPIRE_TIMESTAMP");
                int a14 = j1.b.a(o4, "IS_SEEN");
                ArrayList arrayList = new ArrayList(o4.getCount());
                while (o4.moveToNext()) {
                    int i = o4.getInt(a10);
                    if (o4.isNull(a11)) {
                        string = null;
                    } else {
                        string = o4.getString(a11);
                    }
                    arrayList.add(new sa.a(i, string, o4.getLong(a12), o4.getLong(a13), o4.getInt(a14) != 0));
                }
                return arrayList;
            } finally {
                o4.close();
                this.f10595a.release();
            }
        }
    }

    public b(e0 e0Var) {
        this.f10587a = e0Var;
        this.f10588b = new a(e0Var);
        this.f10589c = new C0208b(e0Var);
        new AtomicBoolean(false);
    }

    public final Object a(int i, int i10, pd.d<? super m> dVar) {
        return ad.c.I(this.f10587a, new d(i10, i), dVar);
    }

    public final Object b(sa.a aVar, pd.d<? super m> dVar) {
        return ad.c.I(this.f10587a, new c(aVar), dVar);
    }

    public final Object c(pd.d<? super List<sa.a>> dVar) {
        g0 e10 = g0.e("SELECT * FROM TBL_NOTIFICATION ORDER BY TIMESTAMP DESC", 0);
        return ad.c.H(this.f10587a, new CancellationSignal(), new e(e10), dVar);
    }
}
