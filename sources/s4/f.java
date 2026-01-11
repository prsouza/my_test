package s4;

import java.util.Arrays;
import s4.l;

public final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f10908a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f10909b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10910c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f10911d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10912e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10913f;
    public final o g;

    public static final class a extends l.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f10914a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f10915b;

        /* renamed from: c  reason: collision with root package name */
        public Long f10916c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f10917d;

        /* renamed from: e  reason: collision with root package name */
        public String f10918e;

        /* renamed from: f  reason: collision with root package name */
        public Long f10919f;
        public o g;
    }

    public f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f10908a = j10;
        this.f10909b = num;
        this.f10910c = j11;
        this.f10911d = bArr;
        this.f10912e = str;
        this.f10913f = j12;
        this.g = oVar;
    }

    public final Integer a() {
        return this.f10909b;
    }

    public final long b() {
        return this.f10908a;
    }

    public final long c() {
        return this.f10910c;
    }

    public final o d() {
        return this.g;
    }

    public final byte[] e() {
        return this.f10911d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f10908a == lVar.b() && ((num = this.f10909b) != null ? num.equals(lVar.a()) : lVar.a() == null) && this.f10910c == lVar.c()) {
            if (Arrays.equals(this.f10911d, lVar instanceof f ? ((f) lVar).f10911d : lVar.e()) && ((str = this.f10912e) != null ? str.equals(lVar.f()) : lVar.f() == null) && this.f10913f == lVar.g()) {
                o oVar = this.g;
                if (oVar == null) {
                    if (lVar.d() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        return this.f10912e;
    }

    public final long g() {
        return this.f10913f;
    }

    public final int hashCode() {
        long j10 = this.f10908a;
        int i = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f10909b;
        int i10 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f10910c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f10911d)) * 1000003;
        String str = this.f10912e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f10913f;
        int i11 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.g;
        if (oVar != null) {
            i10 = oVar.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("LogEvent{eventTimeMs=");
        d10.append(this.f10908a);
        d10.append(", eventCode=");
        d10.append(this.f10909b);
        d10.append(", eventUptimeMs=");
        d10.append(this.f10910c);
        d10.append(", sourceExtension=");
        d10.append(Arrays.toString(this.f10911d));
        d10.append(", sourceExtensionJsonProto3=");
        d10.append(this.f10912e);
        d10.append(", timezoneOffsetSeconds=");
        d10.append(this.f10913f);
        d10.append(", networkConnectionInfo=");
        d10.append(this.g);
        d10.append("}");
        return d10.toString();
    }
}
