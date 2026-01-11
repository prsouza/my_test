package l6;

import o6.z;

public final class s1 implements z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8020a;

    /* renamed from: b  reason: collision with root package name */
    public final z f8021b;

    public /* synthetic */ s1(z zVar, int i) {
        this.f8020a = i;
        this.f8021b = zVar;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        switch (this.f8020a) {
            case 0:
                return new r1((a0) this.f8021b.zza());
            default:
                return s2.a(((u2) this.f8021b).a());
        }
    }
}
