package t3;

import f3.a;
import j3.c;

public final class b implements a.C0077a {

    /* renamed from: a  reason: collision with root package name */
    public final c f11290a;

    /* renamed from: b  reason: collision with root package name */
    public final j3.b f11291b;

    public b(c cVar, j3.b bVar) {
        this.f11290a = cVar;
        this.f11291b = bVar;
    }

    public final byte[] a(int i) {
        j3.b bVar = this.f11291b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.d(i, byte[].class);
    }
}
