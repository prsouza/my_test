package pb;

import ab.k;
import ah.v;
import android.content.Context;
import android.view.View;
import ge.d0;
import ge.g;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import java.util.Objects;
import jc.b;
import l6.b1;
import md.m;
import pb.c;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

public final class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f9831a;

    @e(c = "io.nodle.cash.ui.view.fragment.home.FlashFragment$managePendingDeviceFlash$1$1$1$1$1", f = "FlashFragment.kt", l = {183}, m = "invokeSuspend")
    public static final class a extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f9832a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f9833b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, d<? super a> dVar) {
            super(2, dVar);
            this.f9833b = cVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f9833b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f9832a;
            if (i == 0) {
                b1.w(obj);
                Context context = this.f9833b.getContext();
                if (context != null) {
                    c cVar = this.f9833b;
                    k kVar = k.f279a;
                    long parseLong = Long.parseLong(v.J(context, qa.e.REWARDS_PENDING_DEVICE_COUNT));
                    c.a aVar2 = c.f9820c;
                    Objects.requireNonNull(cVar);
                    ab.i iVar = new ab.i();
                    if (parseLong == 0) {
                        str = null;
                    } else if (parseLong == 1) {
                        str = cVar.getString(R.string.pendingRewardPopupHeaderSingular);
                    } else {
                        if (2 <= parseLong && parseLong <= 10) {
                            str = cVar.getString(R.string.pendingRewardPopupHeaderPlural, String.valueOf(parseLong));
                        } else {
                            str = cVar.getString(R.string.pendingRewardPopupHeaderPlural, "10+");
                        }
                    }
                    iVar.f272a = str;
                    iVar.f273b = cVar.getString(R.string.pendingRewardPopupText);
                    iVar.i = Integer.valueOf(R.layout.notice_info);
                    this.f9832a = 1;
                    if (kVar.a(iVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8555a;
        }
    }

    public f(c cVar) {
        this.f9831a = cVar;
    }

    public final void onClick(View view) {
        HomeViewModelV2 homeViewModelV2 = this.f9831a.f9822a;
        if (homeViewModelV2 != null) {
            g.b(b.y(homeViewModelV2), (pd.f) null, new a(this.f9831a, (d<? super a>) null), 3);
        }
    }
}
