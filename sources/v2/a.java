package v2;

import android.graphics.PointF;
import o2.l;
import q2.b;
import q2.e;
import u2.f;
import u2.m;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f12177a;

    /* renamed from: b  reason: collision with root package name */
    public final m<PointF, PointF> f12178b;

    /* renamed from: c  reason: collision with root package name */
    public final f f12179c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12180d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12181e;

    public a(String str, m<PointF, PointF> mVar, f fVar, boolean z, boolean z10) {
        this.f12177a = str;
        this.f12178b = mVar;
        this.f12179c = fVar;
        this.f12180d = z;
        this.f12181e = z10;
    }

    public final b a(l lVar, w2.b bVar) {
        return new e(lVar, bVar, this);
    }
}
