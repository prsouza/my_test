package a5;

import androidx.activity.result.d;

public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public final long f58b;

    /* renamed from: c  reason: collision with root package name */
    public final int f59c;

    /* renamed from: d  reason: collision with root package name */
    public final int f60d;

    /* renamed from: e  reason: collision with root package name */
    public final long f61e;

    /* renamed from: f  reason: collision with root package name */
    public final int f62f;

    public a(long j10, int i, int i10, long j11, int i11) {
        this.f58b = j10;
        this.f59c = i;
        this.f60d = i10;
        this.f61e = j11;
        this.f62f = i11;
    }

    public final int a() {
        return this.f60d;
    }

    public final long b() {
        return this.f61e;
    }

    public final int c() {
        return this.f59c;
    }

    public final int d() {
        return this.f62f;
    }

    public final long e() {
        return this.f58b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f58b == eVar.e() && this.f59c == eVar.c() && this.f60d == eVar.a() && this.f61e == eVar.b() && this.f62f == eVar.d()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f58b;
        long j11 = this.f61e;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f59c) * 1000003) ^ this.f60d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f62f;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("EventStoreConfig{maxStorageSizeInBytes=");
        d10.append(this.f58b);
        d10.append(", loadBatchSize=");
        d10.append(this.f59c);
        d10.append(", criticalSectionEnterTimeoutMs=");
        d10.append(this.f60d);
        d10.append(", eventCleanUpAge=");
        d10.append(this.f61e);
        d10.append(", maxBlobByteSizePerRow=");
        return d.c(d10, this.f62f, "}");
    }
}
