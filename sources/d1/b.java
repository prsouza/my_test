package d1;

import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import c3.k;
import d1.a;
import e1.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import s.h;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f4258a;

    /* renamed from: b  reason: collision with root package name */
    public final c f4259b;

    public static class a<D> extends j0<D> implements b.C0067b<D> {

        /* renamed from: l  reason: collision with root package name */
        public final int f4260l = 0;

        /* renamed from: m  reason: collision with root package name */
        public final Bundle f4261m = null;

        /* renamed from: n  reason: collision with root package name */
        public final e1.b<D> f4262n;

        /* renamed from: o  reason: collision with root package name */
        public a0 f4263o;

        /* renamed from: p  reason: collision with root package name */
        public C0059b<D> f4264p;

        /* renamed from: q  reason: collision with root package name */
        public e1.b<D> f4265q;

        public a(e1.b bVar) {
            this.f4262n = bVar;
            this.f4265q = null;
            bVar.registerListener(0, this);
        }

        public final void g() {
            this.f4262n.startLoading();
        }

        public final void h() {
            this.f4262n.stopLoading();
        }

        public final void i(k0<? super D> k0Var) {
            super.i(k0Var);
            this.f4263o = null;
            this.f4264p = null;
        }

        public final void j(D d10) {
            super.j(d10);
            e1.b<D> bVar = this.f4265q;
            if (bVar != null) {
                bVar.reset();
                this.f4265q = null;
            }
        }

        public final void l() {
            a0 a0Var = this.f4263o;
            C0059b<D> bVar = this.f4264p;
            if (a0Var != null && bVar != null) {
                super.i(bVar);
                e(a0Var, bVar);
            }
        }

        public final e1.b<D> m(a0 a0Var, a.C0058a<D> aVar) {
            C0059b<D> bVar = new C0059b<>(this.f4262n, aVar);
            e(a0Var, bVar);
            C0059b<D> bVar2 = this.f4264p;
            if (bVar2 != null) {
                i(bVar2);
            }
            this.f4263o = a0Var;
            this.f4264p = bVar;
            return this.f4262n;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f4260l);
            sb2.append(" : ");
            k.L(this.f4262n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: d1.b$b  reason: collision with other inner class name */
    public static class C0059b<D> implements k0<D> {

        /* renamed from: a  reason: collision with root package name */
        public final e1.b<D> f4266a;

        /* renamed from: b  reason: collision with root package name */
        public final a.C0058a<D> f4267b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4268c = false;

        public C0059b(e1.b<D> bVar, a.C0058a<D> aVar) {
            this.f4266a = bVar;
            this.f4267b = aVar;
        }

        public final void d(D d10) {
            this.f4267b.onLoadFinished(this.f4266a, d10);
            this.f4268c = true;
        }

        public final String toString() {
            return this.f4267b.toString();
        }
    }

    public static class c extends u0 {

        /* renamed from: t  reason: collision with root package name */
        public static final a f4269t = new a();

        /* renamed from: c  reason: collision with root package name */
        public h<a> f4270c = new h<>();

        /* renamed from: s  reason: collision with root package name */
        public boolean f4271s = false;

        public static class a implements w0.b {
            public final <T extends u0> T a(Class<T> cls) {
                return new c();
            }
        }

        public final void f() {
            int i = this.f4270c.f10847c;
            for (int i10 = 0; i10 < i; i10++) {
                a aVar = (a) this.f4270c.f10846b[i10];
                aVar.f4262n.cancelLoad();
                aVar.f4262n.abandon();
                C0059b<D> bVar = aVar.f4264p;
                if (bVar != null) {
                    aVar.i(bVar);
                    if (bVar.f4268c) {
                        bVar.f4267b.onLoaderReset(bVar.f4266a);
                    }
                }
                aVar.f4262n.unregisterListener(aVar);
                aVar.f4262n.reset();
            }
            h<a> hVar = this.f4270c;
            int i11 = hVar.f10847c;
            Object[] objArr = hVar.f10846b;
            for (int i12 = 0; i12 < i11; i12++) {
                objArr[i12] = null;
            }
            hVar.f10847c = 0;
        }
    }

    public b(a0 a0Var, x0 x0Var) {
        this.f4258a = a0Var;
        this.f4259b = (c) new w0(x0Var, c.f4269t).a(c.class);
    }

    @Deprecated
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        c cVar = this.f4259b;
        if (cVar.f4270c.h() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < cVar.f4270c.h(); i++) {
                a i10 = cVar.f4270c.i(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.f4270c.d(i));
                printWriter.print(": ");
                printWriter.println(i10.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(i10.f4260l);
                printWriter.print(" mArgs=");
                printWriter.println(i10.f4261m);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(i10.f4262n);
                i10.f4262n.dump(a8.a.c(str2, "  "), fileDescriptor, printWriter, strArr);
                if (i10.f4264p != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(i10.f4264p);
                    C0059b<D> bVar = i10.f4264p;
                    Objects.requireNonNull(bVar);
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.f4268c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(i10.f4262n.dataToString(i10.d()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(i10.f2028c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        k.L(this.f4258a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
