package v2;

import android.graphics.Path;
import o2.l;
import q2.b;
import q2.g;
import u2.c;
import u2.f;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final f f12184a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f12185b;

    /* renamed from: c  reason: collision with root package name */
    public final c f12186c;

    /* renamed from: d  reason: collision with root package name */
    public final u2.d f12187d;

    /* renamed from: e  reason: collision with root package name */
    public final f f12188e;

    /* renamed from: f  reason: collision with root package name */
    public final f f12189f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12190h;

    public d(String str, f fVar, Path.FillType fillType, c cVar, u2.d dVar, f fVar2, f fVar3, boolean z) {
        this.f12184a = fVar;
        this.f12185b = fillType;
        this.f12186c = cVar;
        this.f12187d = dVar;
        this.f12188e = fVar2;
        this.f12189f = fVar3;
        this.g = str;
        this.f12190h = z;
    }

    public final b a(l lVar, w2.b bVar) {
        return new g(lVar, bVar, this);
    }
}
