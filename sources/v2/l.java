package v2;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.helpers.MessageFormatter;
import t2.a;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f12227a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f12228b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12229c;

    public l(PointF pointF, boolean z, List<a> list) {
        this.f12228b = pointF;
        this.f12229c = z;
        this.f12227a = new ArrayList(list);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<t2.a>, java.util.ArrayList] */
    public final String toString() {
        StringBuilder d10 = a.a.d("ShapeData{numCurves=");
        d10.append(this.f12227a.size());
        d10.append("closed=");
        d10.append(this.f12229c);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }

    public l() {
        this.f12227a = new ArrayList();
    }
}
