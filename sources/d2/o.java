package d2;

import androidx.fragment.app.m;
import androidx.work.b;
import u1.c;
import u1.p;
import u1.t;
import u1.v;

public final class o {

    /* renamed from: s  reason: collision with root package name */
    public static final String f4292s = p.e("WorkSpec");

    /* renamed from: a  reason: collision with root package name */
    public String f4293a;

    /* renamed from: b  reason: collision with root package name */
    public v f4294b = v.ENQUEUED;

    /* renamed from: c  reason: collision with root package name */
    public String f4295c;

    /* renamed from: d  reason: collision with root package name */
    public String f4296d;

    /* renamed from: e  reason: collision with root package name */
    public b f4297e;

    /* renamed from: f  reason: collision with root package name */
    public b f4298f;
    public long g;

    /* renamed from: h  reason: collision with root package name */
    public long f4299h;
    public long i;

    /* renamed from: j  reason: collision with root package name */
    public c f4300j;

    /* renamed from: k  reason: collision with root package name */
    public int f4301k;

    /* renamed from: l  reason: collision with root package name */
    public u1.a f4302l;

    /* renamed from: m  reason: collision with root package name */
    public long f4303m;

    /* renamed from: n  reason: collision with root package name */
    public long f4304n;

    /* renamed from: o  reason: collision with root package name */
    public long f4305o;

    /* renamed from: p  reason: collision with root package name */
    public long f4306p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4307q;

    /* renamed from: r  reason: collision with root package name */
    public t f4308r;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f4309a;

        /* renamed from: b  reason: collision with root package name */
        public v f4310b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f4310b != aVar.f4310b) {
                return false;
            }
            return this.f4309a.equals(aVar.f4309a);
        }

        public final int hashCode() {
            return this.f4310b.hashCode() + (this.f4309a.hashCode() * 31);
        }
    }

    public o(String str, String str2) {
        b bVar = b.f2650c;
        this.f4297e = bVar;
        this.f4298f = bVar;
        this.f4300j = c.i;
        this.f4302l = u1.a.EXPONENTIAL;
        this.f4303m = 30000;
        this.f4306p = -1;
        this.f4308r = t.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f4293a = str;
        this.f4295c = str2;
    }

    public final long a() {
        long j10;
        boolean z = false;
        if (this.f4294b == v.ENQUEUED && this.f4301k > 0) {
            if (this.f4302l == u1.a.LINEAR) {
                z = true;
            }
            if (z) {
                j10 = this.f4303m * ((long) this.f4301k);
            } else {
                j10 = (long) Math.scalb((float) this.f4303m, this.f4301k - 1);
            }
            return Math.min(18000000, j10) + this.f4304n;
        }
        long j11 = 0;
        if (c()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j12 = this.f4304n;
            long j13 = j12 == 0 ? currentTimeMillis + this.g : j12;
            long j14 = this.i;
            long j15 = this.f4299h;
            if (j14 != j15) {
                z = true;
            }
            if (z) {
                if (j12 == 0) {
                    j11 = j14 * -1;
                }
                return j13 + j15 + j11;
            }
            if (j12 != 0) {
                j11 = j15;
            }
            return j13 + j11;
        }
        long j16 = this.f4304n;
        if (j16 == 0) {
            j16 = System.currentTimeMillis();
        }
        return j16 + this.g;
    }

    public final boolean b() {
        return !c.i.equals(this.f4300j);
    }

    public final boolean c() {
        return this.f4299h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.g != oVar.g || this.f4299h != oVar.f4299h || this.i != oVar.i || this.f4301k != oVar.f4301k || this.f4303m != oVar.f4303m || this.f4304n != oVar.f4304n || this.f4305o != oVar.f4305o || this.f4306p != oVar.f4306p || this.f4307q != oVar.f4307q || !this.f4293a.equals(oVar.f4293a) || this.f4294b != oVar.f4294b || !this.f4295c.equals(oVar.f4295c)) {
            return false;
        }
        String str = this.f4296d;
        if (str == null ? oVar.f4296d != null : !str.equals(oVar.f4296d)) {
            return false;
        }
        if (!this.f4297e.equals(oVar.f4297e) || !this.f4298f.equals(oVar.f4298f) || !this.f4300j.equals(oVar.f4300j) || this.f4302l != oVar.f4302l) {
            return false;
        }
        if (this.f4308r == oVar.f4308r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int a10 = m.a(this.f4295c, (this.f4294b.hashCode() + (this.f4293a.hashCode() * 31)) * 31, 31);
        String str = this.f4296d;
        int hashCode = str != null ? str.hashCode() : 0;
        int hashCode2 = this.f4297e.hashCode();
        int hashCode3 = this.f4298f.hashCode();
        long j10 = this.g;
        long j11 = this.f4299h;
        long j12 = this.i;
        int hashCode4 = this.f4300j.hashCode();
        int hashCode5 = this.f4302l.hashCode();
        long j13 = this.f4303m;
        long j14 = this.f4304n;
        long j15 = this.f4305o;
        long j16 = this.f4306p;
        return this.f4308r.hashCode() + ((((((((((((hashCode5 + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((a10 + hashCode) * 31)) * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f4301k) * 31)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f4307q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return android.support.v4.media.a.e(a.a.d("{WorkSpec: "), this.f4293a, "}");
    }

    public o(o oVar) {
        b bVar = b.f2650c;
        this.f4297e = bVar;
        this.f4298f = bVar;
        this.f4300j = c.i;
        this.f4302l = u1.a.EXPONENTIAL;
        this.f4303m = 30000;
        this.f4306p = -1;
        this.f4308r = t.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f4293a = oVar.f4293a;
        this.f4295c = oVar.f4295c;
        this.f4294b = oVar.f4294b;
        this.f4296d = oVar.f4296d;
        this.f4297e = new b(oVar.f4297e);
        this.f4298f = new b(oVar.f4298f);
        this.g = oVar.g;
        this.f4299h = oVar.f4299h;
        this.i = oVar.i;
        this.f4300j = new c(oVar.f4300j);
        this.f4301k = oVar.f4301k;
        this.f4302l = oVar.f4302l;
        this.f4303m = oVar.f4303m;
        this.f4304n = oVar.f4304n;
        this.f4305o = oVar.f4305o;
        this.f4306p = oVar.f4306p;
        this.f4307q = oVar.f4307q;
        this.f4308r = oVar.f4308r;
    }
}
