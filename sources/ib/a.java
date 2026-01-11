package ib;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import gb.g;
import ge.d0;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.comm.NotificationsActivity;
import java.util.List;
import java.util.Objects;
import je.f;
import l6.b1;
import lb.k;
import mb.a;
import md.b;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import tb.r;
import xd.p;

@e(c = "io.nodle.cash.ui.view.activity.comm.NotificationsActivity$initViews$1", f = "NotificationsActivity.kt", l = {44}, m = "invokeSuspend")
public final class a extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f6406a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NotificationsActivity f6407b;

    /* renamed from: ib.a$a  reason: collision with other inner class name */
    public static final class C0108a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NotificationsActivity f6408a;

        public C0108a(NotificationsActivity notificationsActivity) {
            this.f6408a = notificationsActivity;
        }

        public final Object a(Object obj, d dVar) {
            g gVar = (g) obj;
            RecyclerView.f adapter = ((RecyclerView) this.f6408a.k(R.id.notificationRecyclerView)).getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type io.nodle.cash.ui.view.adapter.NotificationAdapter");
            k kVar = (k) adapter;
            List<gb.f> list = gVar.f5327a;
            e6.e.D(list, "newList");
            Log.d(kVar.f8194d, "updateNotificationsList");
            kVar.f8195e = list;
            kVar.d();
            if (gVar.f5329c != null) {
                Log.d(this.f6408a.f6727v, "onSelect");
                if (gVar.f5329c.f5324e.length() > 0) {
                    e6.e.S(this.f6408a, gVar.f5329c.f5324e);
                } else {
                    NotificationsActivity notificationsActivity = this.f6408a;
                    Log.d(notificationsActivity.f6727v, "load notification details");
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(notificationsActivity.getSupportFragmentManager());
                    a.C0157a aVar2 = mb.a.f8513b;
                    aVar.f(R.id.fragmentContainerLayout, new mb.a());
                    aVar.c("NOTIF_DETAIL");
                    aVar.d();
                }
            }
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(NotificationsActivity notificationsActivity, d<? super a> dVar) {
        super(2, dVar);
        this.f6407b = notificationsActivity;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new a(this.f6407b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [je.n<gb.g>, je.i] */
    public final Object invokeSuspend(Object obj) {
        ? r12;
        Object obj2 = qd.a.COROUTINE_SUSPENDED;
        int i = this.f6406a;
        if (i == 0) {
            b1.w(obj);
            NotificationsActivity notificationsActivity = this.f6407b;
            r rVar = notificationsActivity.f6728w;
            if (rVar == null || (r12 = rVar.f11518v) == 0) {
                return m.f8555a;
            }
            C0108a aVar = new C0108a(notificationsActivity);
            this.f6406a = 1;
            if (r12.b(aVar, this) == obj2) {
                return obj2;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            b1.w(obj);
        }
        throw new b();
    }
}
