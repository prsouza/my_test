package de;

import e6.e;
import org.slf4j.Marker;

public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f4455c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final k f4456a;

    /* renamed from: b  reason: collision with root package name */
    public final i f4457b;

    public static final class a {
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4458a;

        static {
            int[] iArr = new int[k.values().length];
            iArr[k.INVARIANT.ordinal()] = 1;
            iArr[k.IN.ordinal()] = 2;
            iArr[k.OUT.ordinal()] = 3;
            f4458a = iArr;
        }
    }

    static {
        new j((k) null, (i) null);
    }

    public j(k kVar, i iVar) {
        String str;
        this.f4456a = kVar;
        this.f4457b = iVar;
        if (!((kVar == null) != (iVar == null) ? false : true)) {
            if (kVar == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + kVar + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f4456a == jVar.f4456a && e.r(this.f4457b, jVar.f4457b);
    }

    public final int hashCode() {
        k kVar = this.f4456a;
        int i = 0;
        int hashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        i iVar = this.f4457b;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        k kVar = this.f4456a;
        int i = kVar == null ? -1 : b.f4458a[kVar.ordinal()];
        if (i == -1) {
            return Marker.ANY_MARKER;
        }
        if (i == 1) {
            return String.valueOf(this.f4457b);
        }
        if (i == 2) {
            StringBuilder d10 = a.a.d("in ");
            d10.append(this.f4457b);
            return d10.toString();
        } else if (i == 3) {
            StringBuilder d11 = a.a.d("out ");
            d11.append(this.f4457b);
            return d11.toString();
        } else {
            throw new md.e();
        }
    }
}
