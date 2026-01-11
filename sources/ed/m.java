package ed;

import a.a;
import android.support.v4.media.b;
import ca.c;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import java.util.Objects;
import xd.l;

public final class m extends b {

    /* renamed from: v  reason: collision with root package name */
    public final b[] f4814v;

    public m(b[] bVarArr) {
        this.f4814v = bVarArr;
    }

    public final boolean J(Object obj) {
        for (b J : this.f4814v) {
            if (J.J(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void b(c cVar, Object obj) {
        e.D(cVar, "writer");
        b[] bVarArr = this.f4814v;
        int length = bVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (bVarArr[i].J(obj)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            StringBuilder d10 = a.d("Unknown type ");
            d10.append(obj != null ? obj.getClass() : null);
            d10.append(" for this enum. Supported: ");
            b[] bVarArr2 = this.f4814v;
            e.D(bVarArr2, "<this>");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(BuildConfig.FLAVOR);
            int i10 = 0;
            for (b bVar : bVarArr2) {
                i10++;
                if (i10 > 1) {
                    sb2.append(", ");
                }
                a.b.E(sb2, bVar, (l) null);
            }
            sb2.append(BuildConfig.FLAVOR);
            String sb3 = sb2.toString();
            e.C(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
            d10.append(sb3);
            throw new IllegalArgumentException(d10.toString());
        }
        b bVar2 = this.f4814v[i];
        Objects.requireNonNull(bVar2, "null cannot be cast to non-null type jp.co.soramitsu.fearless_utils.scale.dataType.DataType<kotlin.Any?>");
        cVar.a(((byte) i) & 255);
        bVar2.b(cVar, obj);
    }

    public final Object g(ca.b bVar) {
        e.D(bVar, "reader");
        return this.f4814v[bVar.b()].g(bVar);
    }
}
