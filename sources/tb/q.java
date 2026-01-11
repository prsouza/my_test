package tb;

import android.app.Application;
import android.app.NotificationManager;
import ge.d0;
import ge.g;
import java.util.Objects;
import jc.b;
import je.f;
import je.j;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import ua.c;
import ua.e;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.NotificationViewModel$setAsSeen$1", f = "NotificationViewModel.kt", l = {72, 72}, m = "invokeSuspend")
public final class q extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11510a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f11511b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f11512c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f11513s;

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f11514a;

        public a(r rVar) {
            this.f11514a = rVar;
        }

        public final Object a(Object obj, d dVar) {
            if (((ua.e) obj) instanceof e.b) {
                r rVar = this.f11514a;
                g.b(b.y(rVar), (pd.f) null, new p(rVar, (d<? super p>) null), 3);
            }
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(boolean z, r rVar, int i, d<? super q> dVar) {
        super(2, dVar);
        this.f11511b = z;
        this.f11512c = rVar;
        this.f11513s = i;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new q(this.f11511b, this.f11512c, this.f11513s, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f11510a;
        if (i == 0) {
            b1.w(obj);
            if (this.f11511b) {
                return m.f8555a;
            }
            Application application = this.f11512c.f11515s;
            int i10 = this.f11513s;
            e6.e.D(application, "cxt");
            Object systemService = application.getSystemService("notification");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(i10);
            ua.d dVar = new ua.d(this.f11512c.f11515s);
            int i11 = this.f11513s;
            this.f11510a = 1;
            obj = new j(new c(true, dVar, i11, (d<? super c>) null));
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else if (i == 2) {
            b1.w(obj);
            return m.f8555a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a aVar2 = new a(this.f11512c);
        this.f11510a = 2;
        if (((je.e) obj).b(aVar2, this) == aVar) {
            return aVar;
        }
        return m.f8555a;
    }
}
