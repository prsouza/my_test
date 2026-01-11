package v2;

import b9.m;
import o2.l;
import q2.r;
import u2.b;

public final class q implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f12253a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12254b;

    /* renamed from: c  reason: collision with root package name */
    public final b f12255c;

    /* renamed from: d  reason: collision with root package name */
    public final b f12256d;

    /* renamed from: e  reason: collision with root package name */
    public final b f12257e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12258f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException(m.b("Unknown trim path type ", i));
        }
    }

    public q(String str, a aVar, b bVar, b bVar2, b bVar3, boolean z) {
        this.f12253a = str;
        this.f12254b = aVar;
        this.f12255c = bVar;
        this.f12256d = bVar2;
        this.f12257e = bVar3;
        this.f12258f = z;
    }

    public final q2.b a(l lVar, w2.b bVar) {
        return new r(bVar, this);
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Trim Path: {start: ");
        d10.append(this.f12255c);
        d10.append(", end: ");
        d10.append(this.f12256d);
        d10.append(", offset: ");
        d10.append(this.f12257e);
        d10.append("}");
        return d10.toString();
    }
}
