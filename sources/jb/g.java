package jb;

import android.widget.TextView;
import ge.d0;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity;
import je.f;
import l6.b1;
import md.b;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity$initViews$1", f = "ImportAccountActivity.kt", l = {47}, m = "invokeSuspend")
public final class g extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7135a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImportAccountActivity f7136b;

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImportAccountActivity f7137a;

        public a(ImportAccountActivity importAccountActivity) {
            this.f7137a = importAccountActivity;
        }

        public final Object a(Object obj, d dVar) {
            ((TextView) this.f7137a.k(R.id.failTextView)).setVisibility(((gb.a) obj).f5316a ? 0 : 8);
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(ImportAccountActivity importAccountActivity, d<? super g> dVar) {
        super(2, dVar);
        this.f7136b = importAccountActivity;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new g(this.f7136b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [je.n<gb.a>, je.i] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = qd.a.COROUTINE_SUSPENDED;
        int i = this.f7135a;
        if (i == 0) {
            b1.w(obj);
            ImportAccountActivity importAccountActivity = this.f7136b;
            int i10 = ImportAccountActivity.C;
            ? r52 = importAccountActivity.m().f6789x;
            a aVar = new a(this.f7136b);
            this.f7135a = 1;
            if (r52.b(aVar, this) == obj2) {
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
