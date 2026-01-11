package hb;

import android.content.Intent;
import gb.b;
import gb.c;
import ge.d0;
import io.nodle.cash.ui.view.activity.HomeActivityV2;
import io.nodle.cash.ui.view.activity.LauncherActivity;
import io.nodle.cash.ui.view.activity.onboard.OnboardActivity;
import je.f;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.view.activity.LauncherActivity$initViews$1", f = "LauncherActivity.kt", l = {41}, m = "invokeSuspend")
public final class l extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f5923a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LauncherActivity f5924b;

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LauncherActivity f5925a;

        /* renamed from: hb.l$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0098a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f5926a;

            static {
                int[] iArr = new int[b.values().length];
                iArr[b.GOTO_ONBOARDING.ordinal()] = 1;
                iArr[b.GOTO_HOME.ordinal()] = 2;
                f5926a = iArr;
            }
        }

        public a(LauncherActivity launcherActivity) {
            this.f5925a = launcherActivity;
        }

        public final Object a(Object obj, d dVar) {
            int i = C0098a.f5926a[((c) obj).f5317a.ordinal()];
            if (i == 1) {
                this.f5925a.startActivity(new Intent(this.f5925a, OnboardActivity.class));
                this.f5925a.finish();
            } else if (i == 2) {
                this.f5925a.startActivity(new Intent(this.f5925a, HomeActivityV2.class));
                this.f5925a.finish();
            }
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(LauncherActivity launcherActivity, d<? super l> dVar) {
        super(2, dVar);
        this.f5924b = launcherActivity;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new l(this.f5924b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [je.n<gb.c>, je.i] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = qd.a.COROUTINE_SUSPENDED;
        int i = this.f5923a;
        if (i == 0) {
            b1.w(obj);
            LauncherActivity launcherActivity = this.f5924b;
            int i10 = LauncherActivity.A;
            ? r52 = launcherActivity.k().f6796x;
            a aVar = new a(this.f5924b);
            this.f5923a = 1;
            if (r52.b(aVar, this) == obj2) {
                return obj2;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            b1.w(obj);
        }
        throw new md.b();
    }
}
