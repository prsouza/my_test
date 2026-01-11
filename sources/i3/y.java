package i3;

import a.a;
import c4.g;
import c4.j;
import g3.f;
import g3.h;
import g3.l;
import j3.b;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import org.slf4j.helpers.MessageFormatter;

public final class y implements f {

    /* renamed from: j  reason: collision with root package name */
    public static final g<Class<?>, byte[]> f6169j = new g<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final b f6170b;

    /* renamed from: c  reason: collision with root package name */
    public final f f6171c;

    /* renamed from: d  reason: collision with root package name */
    public final f f6172d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6173e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6174f;
    public final Class<?> g;

    /* renamed from: h  reason: collision with root package name */
    public final h f6175h;
    public final l<?> i;

    public y(b bVar, f fVar, f fVar2, int i10, int i11, l<?> lVar, Class<?> cls, h hVar) {
        this.f6170b = bVar;
        this.f6171c = fVar;
        this.f6172d = fVar2;
        this.f6173e = i10;
        this.f6174f = i11;
        this.i = lVar;
        this.g = cls;
        this.f6175h = hVar;
    }

    public final void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f6170b.e();
        ByteBuffer.wrap(bArr).putInt(this.f6173e).putInt(this.f6174f).array();
        this.f6172d.b(messageDigest);
        this.f6171c.b(messageDigest);
        messageDigest.update(bArr);
        l<?> lVar = this.i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f6175h.b(messageDigest);
        g<Class<?>, byte[]> gVar = f6169j;
        byte[] a10 = gVar.a(this.g);
        if (a10 == null) {
            a10 = this.g.getName().getBytes(f.f5231a);
            gVar.d(this.g, a10);
        }
        messageDigest.update(a10);
        this.f6170b.c(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f6174f != yVar.f6174f || this.f6173e != yVar.f6173e || !j.b(this.i, yVar.i) || !this.g.equals(yVar.g) || !this.f6171c.equals(yVar.f6171c) || !this.f6172d.equals(yVar.f6172d) || !this.f6175h.equals(yVar.f6175h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.f6172d.hashCode() + (this.f6171c.hashCode() * 31)) * 31) + this.f6173e) * 31) + this.f6174f;
        l<?> lVar = this.i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        int hashCode2 = this.g.hashCode();
        return this.f6175h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder d10 = a.d("ResourceCacheKey{sourceKey=");
        d10.append(this.f6171c);
        d10.append(", signature=");
        d10.append(this.f6172d);
        d10.append(", width=");
        d10.append(this.f6173e);
        d10.append(", height=");
        d10.append(this.f6174f);
        d10.append(", decodedResourceClass=");
        d10.append(this.g);
        d10.append(", transformation='");
        d10.append(this.i);
        d10.append('\'');
        d10.append(", options=");
        d10.append(this.f6175h);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
