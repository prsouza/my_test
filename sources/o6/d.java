package o6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import q6.a;
import q6.f;

public abstract class d extends b0 implements e {
    public d() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    public final boolean m(int i, Parcel parcel) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) c0.a(parcel);
        f fVar = (f) this;
        p pVar = fVar.f10320c.f10322a;
        if (pVar != null) {
            pVar.c(fVar.f10319b);
        }
        fVar.f10318a.e("onGetLaunchReviewFlowInfo", new Object[0]);
        fVar.f10319b.b(new a((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
        return true;
    }
}
