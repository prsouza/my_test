package l6;

import java.math.BigInteger;
import java.util.Map;
import n6.c;
import o6.z;

public final class s implements z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8011a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8012b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8013c;

    /* renamed from: s  reason: collision with root package name */
    public final Object f8014s;

    public /* synthetic */ s(z zVar, z zVar2, z zVar3, int i) {
        this.f8011a = i;
        this.f8012b = zVar;
        this.f8013c = zVar2;
        this.f8014s = zVar3;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        switch (this.f8011a) {
            case 0:
                return new r(((u2) ((z) this.f8012b)).a(), (x0) ((z) this.f8013c).zza(), (y1) ((z) this.f8014s).zza());
            default:
                Object zza = ((z) this.f8012b).zza();
                return new y1((a0) zza, (z1) ((z) this.f8013c).zza(), (c) ((z) this.f8014s).zza());
        }
    }

    public s(BigInteger bigInteger, Map map, h1.s sVar) {
        this.f8011a = 2;
        this.f8012b = bigInteger;
        this.f8013c = map;
        this.f8014s = sVar;
    }
}
