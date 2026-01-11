package l6;

import android.content.Context;
import java.io.File;
import o6.w;
import o6.y;
import o6.z;

public final class n1 implements z {

    /* renamed from: a  reason: collision with root package name */
    public final z f7941a;

    /* renamed from: b  reason: collision with root package name */
    public final z f7942b;

    /* renamed from: c  reason: collision with root package name */
    public final z f7943c;

    /* renamed from: s  reason: collision with root package name */
    public final z f7944s;

    /* renamed from: t  reason: collision with root package name */
    public final z f7945t;

    /* renamed from: u  reason: collision with root package name */
    public final z f7946u;

    /* renamed from: v  reason: collision with root package name */
    public final z f7947v;

    public n1(z zVar, z zVar2, z zVar3, z zVar4, z zVar5, z zVar6, z zVar7) {
        this.f7941a = zVar;
        this.f7942b = zVar2;
        this.f7943c = zVar3;
        this.f7944s = zVar4;
        this.f7945t = zVar5;
        this.f7946u = zVar6;
        this.f7947v = zVar7;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        File file;
        String str = (String) this.f7941a.zza();
        Object zza = this.f7942b.zza();
        Object zza2 = this.f7943c.zza();
        Context a10 = ((u2) this.f7944s).a();
        Object zza3 = this.f7945t.zza();
        w a11 = y.a(this.f7946u);
        x xVar = (x) zza;
        x0 x0Var = (x0) zza2;
        z1 z1Var = (z1) zza3;
        y1 y1Var = (y1) this.f7947v.zza();
        if (str != null) {
            file = new File(a10.getExternalFilesDir((String) null), str);
        } else {
            file = a10.getExternalFilesDir((String) null);
        }
        return new m1(file, xVar, a10, z1Var, a11);
    }
}
