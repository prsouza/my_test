package androidx.recyclerview.widget;

import android.view.View;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f2464a;

    /* renamed from: b  reason: collision with root package name */
    public a f2465b = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2466a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f2467b;

        /* renamed from: c  reason: collision with root package name */
        public int f2468c;

        /* renamed from: d  reason: collision with root package name */
        public int f2469d;

        /* renamed from: e  reason: collision with root package name */
        public int f2470e;

        public final void a(int i) {
            this.f2466a = i | this.f2466a;
        }

        public final boolean b() {
            int i = this.f2466a;
            if ((i & 7) != 0 && (i & (c(this.f2469d, this.f2467b) << 0)) == 0) {
                return false;
            }
            int i10 = this.f2466a;
            if ((i10 & 112) != 0 && (i10 & (c(this.f2469d, this.f2468c) << 4)) == 0) {
                return false;
            }
            int i11 = this.f2466a;
            if ((i11 & 1792) != 0 && (i11 & (c(this.f2470e, this.f2467b) << 8)) == 0) {
                return false;
            }
            int i12 = this.f2466a;
            if ((i12 & 28672) == 0 || (i12 & (c(this.f2470e, this.f2468c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        public final int c(int i, int i10) {
            if (i > i10) {
                return 1;
            }
            return i == i10 ? 2 : 4;
        }
    }

    public interface b {
        int a();

        int b(View view);

        View c(int i);

        int d();

        int e(View view);
    }

    public b0(b bVar) {
        this.f2464a = bVar;
    }

    public final View a(int i, int i10, int i11, int i12) {
        int d10 = this.f2464a.d();
        int a10 = this.f2464a.a();
        int i13 = i10 > i ? 1 : -1;
        View view = null;
        while (i != i10) {
            View c10 = this.f2464a.c(i);
            int b10 = this.f2464a.b(c10);
            int e10 = this.f2464a.e(c10);
            a aVar = this.f2465b;
            aVar.f2467b = d10;
            aVar.f2468c = a10;
            aVar.f2469d = b10;
            aVar.f2470e = e10;
            if (i11 != 0) {
                aVar.f2466a = 0;
                aVar.a(i11);
                if (this.f2465b.b()) {
                    return c10;
                }
            }
            if (i12 != 0) {
                a aVar2 = this.f2465b;
                aVar2.f2466a = 0;
                aVar2.a(i12);
                if (this.f2465b.b()) {
                    view = c10;
                }
            }
            i += i13;
        }
        return view;
    }

    public final boolean b(View view) {
        a aVar = this.f2465b;
        int d10 = this.f2464a.d();
        int a10 = this.f2464a.a();
        int b10 = this.f2464a.b(view);
        int e10 = this.f2464a.e(view);
        aVar.f2467b = d10;
        aVar.f2468c = a10;
        aVar.f2469d = b10;
        aVar.f2470e = e10;
        a aVar2 = this.f2465b;
        aVar2.f2466a = 0;
        aVar2.a(24579);
        return this.f2465b.b();
    }
}
