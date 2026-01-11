package qb;

import e6.e;
import java.util.List;
import java.util.Objects;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final int f10393a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10394b;

    /* renamed from: c  reason: collision with root package name */
    public final List<r> f10395c;

    public u(int i, boolean z, List<r> list) {
        this.f10393a = i;
        this.f10394b = z;
        this.f10395c = list;
    }

    public static u a(u uVar, int i, List<r> list, int i10) {
        if ((i10 & 1) != 0) {
            i = uVar.f10393a;
        }
        boolean z = (i10 & 2) != 0 ? uVar.f10394b : false;
        if ((i10 & 4) != 0) {
            list = uVar.f10395c;
        }
        Objects.requireNonNull(uVar);
        e.D(list, "statsPeriods");
        return new u(i, z, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f10393a == uVar.f10393a && this.f10394b == uVar.f10394b && e.r(this.f10395c, uVar.f10395c);
    }

    public final int hashCode() {
        int i = this.f10393a * 31;
        boolean z = this.f10394b;
        if (z) {
            z = true;
        }
        return this.f10395c.hashCode() + ((i + (z ? 1 : 0)) * 31);
    }

    public final String toString() {
        int i = this.f10393a;
        boolean z = this.f10394b;
        List<r> list = this.f10395c;
        return "StatsStatsViewState(currentPeriodIndex=" + i + ", isLoading=" + z + ", statsPeriods=" + list + ")";
    }
}
