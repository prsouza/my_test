package h;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;

public final class p implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f5597a;

    public p(q qVar) {
        this.f5597a = qVar;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(context, "context");
        e.D(attributeSet, "attrs");
        return this.f5597a.f(view, str, context, attributeSet);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(context, "context");
        e.D(attributeSet, "attrs");
        return this.f5597a.f((View) null, str, context, attributeSet);
    }
}
