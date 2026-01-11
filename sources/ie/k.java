package ie;

import a.a;
import ah.v;
import java.util.concurrent.locks.ReentrantLock;
import le.r;
import le.x;
import md.m;
import xd.l;
import y.c;

public final class k<E> extends a<E> {

    /* renamed from: s  reason: collision with root package name */
    public final ReentrantLock f6438s = new ReentrantLock();

    /* renamed from: t  reason: collision with root package name */
    public Object f6439t = v.f620w;

    public k(l<? super E, m> lVar) {
        super(lVar);
    }

    public final String e() {
        StringBuilder d10 = a.d("(value=");
        d10.append(this.f6439t);
        d10.append(')');
        return d10.toString();
    }

    public final boolean i() {
        return false;
    }

    public final boolean l() {
        return false;
    }

    /* JADX INFO: finally extract failed */
    public final Object m(E e10) {
        q o4;
        ReentrantLock reentrantLock = this.f6438s;
        reentrantLock.lock();
        try {
            h<?> f10 = f();
            if (f10 == null) {
                x xVar = null;
                if (this.f6439t == v.f620w) {
                    do {
                        o4 = o();
                        if (o4 != null) {
                            if (o4 instanceof h) {
                                reentrantLock.unlock();
                                return o4;
                            }
                        }
                    } while (o4.b(e10) == null);
                    reentrantLock.unlock();
                    o4.f();
                    return o4.d();
                }
                Object obj = this.f6439t;
                if (obj != v.f620w) {
                    l<E, m> lVar = this.f6420a;
                    if (lVar != null) {
                        xVar = c.p(lVar, obj, (x) null);
                    }
                }
                this.f6439t = e10;
                if (xVar == null) {
                    r rVar = v.f621x;
                    reentrantLock.unlock();
                    return rVar;
                }
                throw xVar;
            }
            reentrantLock.unlock();
            return f10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean r(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f6438s;
        reentrantLock.lock();
        try {
            return super.r(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean s() {
        return false;
    }

    public final boolean t() {
        return this.f6439t == v.f620w;
    }

    /* JADX INFO: finally extract failed */
    public final void v(boolean z) {
        ReentrantLock reentrantLock = this.f6438s;
        reentrantLock.lock();
        try {
            r rVar = v.f620w;
            Object obj = this.f6439t;
            x xVar = null;
            if (obj != rVar) {
                l<E, m> lVar = this.f6420a;
                if (lVar != null) {
                    xVar = c.p(lVar, obj, (x) null);
                }
            }
            this.f6439t = rVar;
            reentrantLock.unlock();
            super.v(z);
            if (xVar != null) {
                throw xVar;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Object x() {
        ReentrantLock reentrantLock = this.f6438s;
        reentrantLock.lock();
        try {
            Object obj = this.f6439t;
            r rVar = v.f620w;
            if (obj == rVar) {
                Object f10 = f();
                if (f10 == null) {
                    f10 = v.z;
                }
                return f10;
            }
            this.f6439t = rVar;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
