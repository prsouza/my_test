package qb;

import androidx.fragment.app.m;
import e6.e;
import java.math.BigInteger;
import java.util.Objects;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final long f10384a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10385b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10386c;

    /* renamed from: d  reason: collision with root package name */
    public final BigInteger f10387d;

    public q(long j10, long j11, String str, BigInteger bigInteger) {
        e.D(str, "label");
        this.f10384a = j10;
        this.f10385b = j11;
        this.f10386c = str;
        this.f10387d = bigInteger;
    }

    public static q a(q qVar, BigInteger bigInteger) {
        long j10 = qVar.f10384a;
        long j11 = qVar.f10385b;
        String str = qVar.f10386c;
        Objects.requireNonNull(qVar);
        e.D(str, "label");
        return new q(j10, j11, str, bigInteger);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f10384a == qVar.f10384a && this.f10385b == qVar.f10385b && e.r(this.f10386c, qVar.f10386c) && e.r(this.f10387d, qVar.f10387d);
    }

    public final int hashCode() {
        long j10 = this.f10384a;
        long j11 = this.f10385b;
        return this.f10387d.hashCode() + m.a(this.f10386c, ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31, 31);
    }

    public final String toString() {
        long j10 = this.f10384a;
        long j11 = this.f10385b;
        String str = this.f10386c;
        BigInteger bigInteger = this.f10387d;
        return "StatsInterval(start=" + j10 + ", end=" + j11 + ", label=" + str + ", amount=" + bigInteger + ")";
    }
}
