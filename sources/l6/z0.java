package l6;

import c3.k;
import h1.s;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public final /* synthetic */ class z0 implements f1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g1 f8108a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8109b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8110c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f8111d;

    public /* synthetic */ z0(g1 g1Var, String str, int i, long j10) {
        this.f8108a = g1Var;
        this.f8109b = str;
        this.f8110c = i;
        this.f8111d = j10;
    }

    public final Object zza() {
        g1 g1Var = this.f8108a;
        String str = this.f8109b;
        int i = this.f8110c;
        long j10 = this.f8111d;
        Objects.requireNonNull(g1Var);
        d1 d1Var = (d1) ((Map) g1Var.c(new s(g1Var, Arrays.asList(new String[]{str})))).get(str);
        if (d1Var == null || k.h1(d1Var.f7816c.f7804d)) {
            g1.g.c(String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        g1Var.f7864a.c(str, i, j10);
        d1Var.f7816c.f7804d = 4;
        return null;
    }
}
