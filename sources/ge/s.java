package ge;

import a.a;
import e6.e;
import java.util.Objects;
import md.m;
import xd.l;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5439a;

    /* renamed from: b  reason: collision with root package name */
    public final i f5440b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Throwable, m> f5441c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5442d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f5443e;

    public s(Object obj, i iVar, l<? super Throwable, m> lVar, Object obj2, Throwable th2) {
        this.f5439a = obj;
        this.f5440b = iVar;
        this.f5441c = lVar;
        this.f5442d = obj2;
        this.f5443e = th2;
    }

    public static s a(s sVar, i iVar, Throwable th2, int i) {
        Object obj = null;
        Object obj2 = (i & 1) != 0 ? sVar.f5439a : null;
        if ((i & 2) != 0) {
            iVar = sVar.f5440b;
        }
        i iVar2 = iVar;
        l<Throwable, m> lVar = (i & 4) != 0 ? sVar.f5441c : null;
        if ((i & 8) != 0) {
            obj = sVar.f5442d;
        }
        Object obj3 = obj;
        if ((i & 16) != 0) {
            th2 = sVar.f5443e;
        }
        Objects.requireNonNull(sVar);
        return new s(obj2, iVar2, (l<? super Throwable, m>) lVar, obj3, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return e.r(this.f5439a, sVar.f5439a) && e.r(this.f5440b, sVar.f5440b) && e.r(this.f5441c, sVar.f5441c) && e.r(this.f5442d, sVar.f5442d) && e.r(this.f5443e, sVar.f5443e);
    }

    public final int hashCode() {
        Object obj = this.f5439a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f5440b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        l<Throwable, m> lVar = this.f5441c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f5442d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f5443e;
        if (th2 != null) {
            i = th2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder d10 = a.d("CompletedContinuation(result=");
        d10.append(this.f5439a);
        d10.append(", cancelHandler=");
        d10.append(this.f5440b);
        d10.append(", onCancellation=");
        d10.append(this.f5441c);
        d10.append(", idempotentResume=");
        d10.append(this.f5442d);
        d10.append(", cancelCause=");
        d10.append(this.f5443e);
        d10.append(')');
        return d10.toString();
    }

    public s(Object obj, i iVar, l<Throwable, m> lVar, Throwable th2, int i) {
        iVar = (i & 2) != 0 ? null : iVar;
        lVar = (i & 4) != 0 ? null : lVar;
        th2 = (i & 16) != 0 ? null : th2;
        this.f5439a = obj;
        this.f5440b = iVar;
        this.f5441c = lVar;
        this.f5442d = null;
        this.f5443e = th2;
    }
}
