package q6;

import aa.b;
import android.content.Context;
import android.content.Intent;
import m3.u;
import o6.p;
import o6.s;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final u f10321c = new u("ReviewService");

    /* renamed from: a  reason: collision with root package name */
    public p f10322a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10323b;

    public g(Context context) {
        this.f10323b = context.getPackageName();
        if (s.b(context)) {
            Context context2 = context;
            this.f10322a = new p(context2, f10321c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), b.G);
        }
    }
}
