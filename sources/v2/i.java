package v2;

import android.graphics.PointF;
import o2.l;
import u2.b;
import u2.m;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f12209a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12210b;

    /* renamed from: c  reason: collision with root package name */
    public final b f12211c;

    /* renamed from: d  reason: collision with root package name */
    public final m<PointF, PointF> f12212d;

    /* renamed from: e  reason: collision with root package name */
    public final b f12213e;

    /* renamed from: f  reason: collision with root package name */
    public final b f12214f;
    public final b g;

    /* renamed from: h  reason: collision with root package name */
    public final b f12215h;
    public final b i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f12216j;

    public enum a {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        private a(int i) {
            this.value = i;
        }

        public static a forValue(int i) {
            for (a aVar : values()) {
                if (aVar.value == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public i(String str, a aVar, b bVar, m<PointF, PointF> mVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, boolean z) {
        this.f12209a = str;
        this.f12210b = aVar;
        this.f12211c = bVar;
        this.f12212d = mVar;
        this.f12213e = bVar2;
        this.f12214f = bVar3;
        this.g = bVar4;
        this.f12215h = bVar5;
        this.i = bVar6;
        this.f12216j = z;
    }

    public final q2.b a(l lVar, w2.b bVar) {
        return new q2.m(lVar, bVar, this);
    }
}
