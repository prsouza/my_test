package se;

import c3.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import te.o;
import yd.v;

public final class m extends s {

    /* renamed from: a  reason: collision with root package name */
    public final String f11119a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11120b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Object obj, boolean z) {
        super((k) null);
        e.D(obj, "body");
        this.f11120b = z;
        this.f11119a = obj.toString();
    }

    public final String d() {
        return this.f11119a;
    }

    public final boolean e() {
        return this.f11120b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!e.r(v.a(m.class), v.a(obj.getClass())))) {
            return false;
        }
        m mVar = (m) obj;
        return this.f11120b == mVar.f11120b && !(e.r(this.f11119a, mVar.f11119a) ^ true);
    }

    public final int hashCode() {
        return this.f11119a.hashCode() + (Boolean.valueOf(this.f11120b).hashCode() * 31);
    }

    public final String toString() {
        String str;
        if (!this.f11120b) {
            return this.f11119a;
        }
        StringBuilder sb2 = new StringBuilder();
        String str2 = this.f11119a;
        String[] strArr = o.f11603a;
        e.D(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        sb2.append('\"');
        int length = str2.length();
        int i = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str2.charAt(i10);
            String[] strArr2 = o.f11603a;
            if (charAt < strArr2.length && (str = strArr2[charAt]) != null) {
                sb2.append(str2, i, i10);
                sb2.append(str);
                i = i10 + 1;
            }
        }
        sb2.append(str2, i, length);
        sb2.append('\"');
        String sb3 = sb2.toString();
        e.C(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
