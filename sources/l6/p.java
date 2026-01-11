package l6;

import android.os.Bundle;
import t6.m;

public final class p extends j {

    /* renamed from: c  reason: collision with root package name */
    public final int f7964c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7965d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7966e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r f7967f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(r rVar, m mVar, int i, String str, int i10) {
        super(rVar, mVar);
        this.f7967f = rVar;
        this.f7964c = i;
        this.f7965d = str;
        this.f7966e = i10;
    }

    public final void zzd(Bundle bundle) {
        this.f7967f.f8004d.c(this.f7902a);
        int i = bundle.getInt("error_code");
        r.g.c("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i10 = this.f7966e;
        if (i10 > 0) {
            this.f7967f.i(this.f7964c, this.f7965d, i10 - 1);
        }
    }
}
