package q2;

import a3.f;
import a9.c;
import android.graphics.Path;
import android.graphics.PointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import o2.l;
import o2.p;
import r2.a;
import t2.e;
import v2.i;
import v2.q;
import w2.b;

public final class m implements l, a.C0206a, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f10252a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f10253b;

    /* renamed from: c  reason: collision with root package name */
    public final l f10254c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a f10255d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10256e;

    /* renamed from: f  reason: collision with root package name */
    public final r2.a<?, Float> f10257f;
    public final r2.a<?, PointF> g;

    /* renamed from: h  reason: collision with root package name */
    public final r2.a<?, Float> f10258h;
    public final r2.a<?, Float> i;

    /* renamed from: j  reason: collision with root package name */
    public final r2.a<?, Float> f10259j;

    /* renamed from: k  reason: collision with root package name */
    public final r2.a<?, Float> f10260k;

    /* renamed from: l  reason: collision with root package name */
    public final r2.a<?, Float> f10261l;

    /* renamed from: m  reason: collision with root package name */
    public c f10262m = new c(1);

    /* renamed from: n  reason: collision with root package name */
    public boolean f10263n;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10264a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                v2.i$a[] r0 = v2.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10264a = r0
                v2.i$a r1 = v2.i.a.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10264a     // Catch:{ NoSuchFieldError -> 0x001d }
                v2.i$a r1 = v2.i.a.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q2.m.a.<clinit>():void");
        }
    }

    public m(l lVar, b bVar, i iVar) {
        this.f10254c = lVar;
        this.f10253b = iVar.f12209a;
        i.a aVar = iVar.f12210b;
        this.f10255d = aVar;
        this.f10256e = iVar.f12216j;
        r2.a<Float, Float> a10 = iVar.f12211c.a();
        this.f10257f = (r2.c) a10;
        r2.a<PointF, PointF> a11 = iVar.f12212d.a();
        this.g = a11;
        r2.a<Float, Float> a12 = iVar.f12213e.a();
        this.f10258h = (r2.c) a12;
        r2.a<Float, Float> a13 = iVar.g.a();
        this.f10259j = (r2.c) a13;
        r2.a<Float, Float> a14 = iVar.i.a();
        this.f10261l = (r2.c) a14;
        i.a aVar2 = i.a.STAR;
        if (aVar == aVar2) {
            this.i = (r2.c) iVar.f12214f.a();
            this.f10260k = (r2.c) iVar.f12215h.a();
        } else {
            this.i = null;
            this.f10260k = null;
        }
        bVar.d(a10);
        bVar.d(a11);
        bVar.d(a12);
        bVar.d(a13);
        bVar.d(a14);
        if (aVar == aVar2) {
            bVar.d(this.i);
            bVar.d(this.f10260k);
        }
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        a14.a(this);
        if (aVar == aVar2) {
            this.i.a(this);
            this.f10260k.a(this);
        }
    }

    public final void b() {
        this.f10263n = false;
        this.f10254c.invalidateSelf();
    }

    public final void c(List<b> list, List<b> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                b bVar = (b) arrayList.get(i10);
                if (bVar instanceof r) {
                    r rVar = (r) bVar;
                    if (rVar.f10294c == q.a.SIMULTANEOUSLY) {
                        this.f10262m.d(rVar);
                        rVar.d(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final <T> void f(T t10, b3.c cVar) {
        r2.a<?, Float> aVar;
        r2.a<?, Float> aVar2;
        if (t10 == p.f9285s) {
            this.f10257f.j(cVar);
        } else if (t10 == p.f9286t) {
            this.f10258h.j(cVar);
        } else if (t10 == p.f9276j) {
            this.g.j(cVar);
        } else if (t10 == p.f9287u && (aVar2 = this.i) != null) {
            aVar2.j(cVar);
        } else if (t10 == p.f9288v) {
            this.f10259j.j(cVar);
        } else if (t10 == p.f9289w && (aVar = this.f10260k) != null) {
            aVar.j(cVar);
        } else if (t10 == p.f9290x) {
            this.f10261l.j(cVar);
        }
    }

    public final void g(e eVar, int i10, List<e> list, e eVar2) {
        f.e(eVar, i10, list, eVar2, this);
    }

    public final String getName() {
        return this.f10253b;
    }

    public final Path getPath() {
        float f10;
        float f11;
        float f12;
        float f13;
        double d10;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        double d11;
        float f19;
        float f20;
        double d12;
        double d13;
        double d14;
        if (this.f10263n) {
            return this.f10252a;
        }
        this.f10252a.reset();
        if (this.f10256e) {
            this.f10263n = true;
            return this.f10252a;
        }
        int i10 = a.f10264a[this.f10255d.ordinal()];
        double d15 = Utils.DOUBLE_EPSILON;
        if (i10 == 1) {
            float floatValue = this.f10257f.f().floatValue();
            r2.a<?, Float> aVar = this.f10258h;
            if (aVar != null) {
                d15 = (double) aVar.f().floatValue();
            }
            double radians = Math.toRadians(d15 - 90.0d);
            double d16 = (double) floatValue;
            float f21 = (float) (6.283185307179586d / d16);
            float f22 = f21 / 2.0f;
            float f23 = floatValue - ((float) ((int) floatValue));
            int i11 = (f23 > 0.0f ? 1 : (f23 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                radians += (double) ((1.0f - f23) * f22);
            }
            float floatValue2 = this.f10259j.f().floatValue();
            float floatValue3 = this.i.f().floatValue();
            r2.a<?, Float> aVar2 = this.f10260k;
            float floatValue4 = aVar2 != null ? aVar2.f().floatValue() / 100.0f : 0.0f;
            r2.a<?, Float> aVar3 = this.f10261l;
            float floatValue5 = aVar3 != null ? aVar3.f().floatValue() / 100.0f : 0.0f;
            if (i11 != 0) {
                f14 = a.a.a(floatValue2, floatValue3, f23, floatValue3);
                double d17 = (double) f14;
                f11 = floatValue3;
                f10 = floatValue4;
                f13 = (float) (Math.cos(radians) * d17);
                f12 = (float) (d17 * Math.sin(radians));
                this.f10252a.moveTo(f13, f12);
                d10 = radians + ((double) ((f21 * f23) / 2.0f));
            } else {
                f11 = floatValue3;
                f10 = floatValue4;
                double d18 = (double) floatValue2;
                float cos = (float) (Math.cos(radians) * d18);
                f12 = (float) (Math.sin(radians) * d18);
                this.f10252a.moveTo(cos, f12);
                d10 = radians + ((double) f22);
                f13 = cos;
                f14 = 0.0f;
            }
            double ceil = Math.ceil(d16) * 2.0d;
            float f24 = f22;
            int i12 = i11;
            int i13 = 0;
            boolean z = false;
            while (true) {
                double d19 = (double) i13;
                if (d19 >= ceil) {
                    break;
                }
                float f25 = z ? floatValue2 : f11;
                int i14 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
                if (i14 == 0 || d19 != ceil - 2.0d) {
                    f15 = f21;
                    f16 = f24;
                } else {
                    f15 = f21;
                    f16 = (f21 * f23) / 2.0f;
                }
                if (i14 == 0 || d19 != ceil - 1.0d) {
                    f17 = f14;
                    f14 = f25;
                    f18 = f16;
                } else {
                    f18 = f16;
                    f17 = f14;
                }
                double d20 = (double) f14;
                double d21 = d19;
                float cos2 = (float) (Math.cos(d10) * d20);
                float sin = (float) (d20 * Math.sin(d10));
                if (f10 == 0.0f && floatValue5 == 0.0f) {
                    this.f10252a.lineTo(cos2, sin);
                    f19 = sin;
                    d11 = d10;
                    f20 = floatValue5;
                } else {
                    d11 = d10;
                    float f26 = f12;
                    float f27 = floatValue5;
                    double atan2 = (double) ((float) (Math.atan2((double) f12, (double) f13) - 1.5707963267948966d));
                    float cos3 = (float) Math.cos(atan2);
                    float sin2 = (float) Math.sin(atan2);
                    float f28 = f26;
                    f19 = sin;
                    f20 = f27;
                    double atan22 = (double) ((float) (Math.atan2((double) sin, (double) cos2) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan22);
                    float sin3 = (float) Math.sin(atan22);
                    float f29 = z ? f10 : f20;
                    float f30 = z ? f20 : f10;
                    float f31 = (z ? f11 : floatValue2) * f29 * 0.47829f;
                    float f32 = cos3 * f31;
                    float f33 = f31 * sin2;
                    float f34 = (z ? floatValue2 : f11) * f30 * 0.47829f;
                    float f35 = cos4 * f34;
                    float f36 = f34 * sin3;
                    if (i12 != 0) {
                        if (i13 == 0) {
                            f32 *= f23;
                            f33 *= f23;
                        } else if (d21 == ceil - 1.0d) {
                            f35 *= f23;
                            f36 *= f23;
                        }
                    }
                    this.f10252a.cubicTo(f13 - f32, f28 - f33, cos2 + f35, f19 + f36, cos2, f19);
                }
                d10 = d11 + ((double) f18);
                z = !z;
                i13++;
                f13 = cos2;
                f14 = f17;
                f21 = f15;
                f12 = f19;
                floatValue5 = f20;
            }
            PointF f37 = this.g.f();
            this.f10252a.offset(f37.x, f37.y);
            this.f10252a.close();
        } else if (i10 == 2) {
            int floor = (int) Math.floor((double) this.f10257f.f().floatValue());
            r2.a<?, Float> aVar4 = this.f10258h;
            if (aVar4 != null) {
                d15 = (double) aVar4.f().floatValue();
            }
            double radians2 = Math.toRadians(d15 - 90.0d);
            double d22 = (double) floor;
            float floatValue6 = this.f10261l.f().floatValue() / 100.0f;
            float floatValue7 = this.f10259j.f().floatValue();
            double d23 = (double) floatValue7;
            float cos5 = (float) (Math.cos(radians2) * d23);
            float sin4 = (float) (Math.sin(radians2) * d23);
            this.f10252a.moveTo(cos5, sin4);
            double d24 = (double) ((float) (6.283185307179586d / d22));
            double d25 = radians2 + d24;
            double ceil2 = Math.ceil(d22);
            int i15 = 0;
            while (((double) i15) < ceil2) {
                float cos6 = (float) (Math.cos(d25) * d23);
                double d26 = ceil2;
                float sin5 = (float) (Math.sin(d25) * d23);
                if (floatValue6 != 0.0f) {
                    d14 = d23;
                    d13 = d25;
                    double atan23 = (double) ((float) (Math.atan2((double) sin4, (double) cos5) - 1.5707963267948966d));
                    float cos7 = (float) Math.cos(atan23);
                    d12 = d24;
                    double atan24 = (double) ((float) (Math.atan2((double) sin5, (double) cos6) - 1.5707963267948966d));
                    float f38 = floatValue7 * floatValue6 * 0.25f;
                    this.f10252a.cubicTo(cos5 - (cos7 * f38), sin4 - (((float) Math.sin(atan23)) * f38), cos6 + (((float) Math.cos(atan24)) * f38), sin5 + (f38 * ((float) Math.sin(atan24))), cos6, sin5);
                } else {
                    d13 = d25;
                    d14 = d23;
                    d12 = d24;
                    this.f10252a.lineTo(cos6, sin5);
                }
                d25 = d13 + d12;
                i15++;
                sin4 = sin5;
                cos5 = cos6;
                ceil2 = d26;
                d23 = d14;
                d24 = d12;
            }
            PointF f39 = this.g.f();
            this.f10252a.offset(f39.x, f39.y);
            this.f10252a.close();
        }
        this.f10252a.close();
        this.f10262m.e(this.f10252a);
        this.f10263n = true;
        return this.f10252a;
    }
}
