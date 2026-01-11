package ie;

import ah.v;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import le.r;
import le.x;
import md.e;
import md.m;
import nd.d;
import xd.l;

public final class c<E> extends a<E> {

    /* renamed from: s  reason: collision with root package name */
    public final int f6424s;
    private volatile /* synthetic */ int size;

    /* renamed from: t  reason: collision with root package name */
    public final d f6425t;

    /* renamed from: u  reason: collision with root package name */
    public final ReentrantLock f6426u;

    /* renamed from: v  reason: collision with root package name */
    public Object[] f6427v;

    /* renamed from: w  reason: collision with root package name */
    public int f6428w;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6429a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.SUSPEND.ordinal()] = 1;
            iArr[d.DROP_LATEST.ordinal()] = 2;
            iArr[d.DROP_OLDEST.ordinal()] = 3;
            f6429a = iArr;
        }
    }

    public c(int i, d dVar, l<? super E, m> lVar) {
        super(lVar);
        this.f6424s = i;
        this.f6425t = dVar;
        if (i < 1 ? false : true) {
            this.f6426u = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            d.I(objArr, v.f620w);
            this.f6427v = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(a8.a.b("ArrayChannel capacity must be at least 1, but ", i, " was specified").toString());
    }

    public final Object d(s sVar) {
        ReentrantLock reentrantLock = this.f6426u;
        reentrantLock.lock();
        try {
            return super.d(sVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String e() {
        StringBuilder d10 = a.a.d("(buffer:capacity=");
        d10.append(this.f6424s);
        d10.append(",size=");
        d10.append(this.size);
        d10.append(')');
        return d10.toString();
    }

    public final boolean i() {
        return false;
    }

    public final boolean l() {
        return this.size == this.f6424s && this.f6425t == d.SUSPEND;
    }

    /* JADX INFO: finally extract failed */
    public final Object m(E e10) {
        q o4;
        ReentrantLock reentrantLock = this.f6426u;
        reentrantLock.lock();
        try {
            int i = this.size;
            h<?> f10 = f();
            if (f10 == null) {
                r rVar = null;
                if (i < this.f6424s) {
                    this.size = i + 1;
                } else {
                    int i10 = a.f6429a[this.f6425t.ordinal()];
                    if (i10 == 1) {
                        rVar = v.f622y;
                    } else if (i10 == 2) {
                        rVar = v.f621x;
                    } else if (i10 != 3) {
                        throw new e();
                    }
                }
                if (rVar == null) {
                    if (i == 0) {
                        do {
                            o4 = o();
                            if (o4 != null) {
                                if (o4 instanceof h) {
                                    this.size = i;
                                    reentrantLock.unlock();
                                    return o4;
                                }
                            }
                        } while (o4.b(e10) == null);
                        this.size = i;
                        reentrantLock.unlock();
                        o4.f();
                        return o4.d();
                    }
                    z(i, e10);
                    r rVar2 = v.f621x;
                    reentrantLock.unlock();
                    return rVar2;
                }
                reentrantLock.unlock();
                return rVar;
            }
            reentrantLock.unlock();
            return f10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean r(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f6426u;
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
        return this.size == 0;
    }

    public final boolean u() {
        ReentrantLock reentrantLock = this.f6426u;
        reentrantLock.lock();
        try {
            return super.u();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void v(boolean z) {
        l<E, m> lVar = this.f6420a;
        ReentrantLock reentrantLock = this.f6426u;
        reentrantLock.lock();
        try {
            int i = this.size;
            x xVar = null;
            int i10 = 0;
            while (i10 < i) {
                i10++;
                Object obj = this.f6427v[this.f6428w];
                if (!(lVar == null || obj == v.f620w)) {
                    xVar = y.c.p(lVar, obj, xVar);
                }
                Object[] objArr = this.f6427v;
                int i11 = this.f6428w;
                objArr[i11] = v.f620w;
                this.f6428w = (i11 + 1) % objArr.length;
            }
            this.size = 0;
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
        ReentrantLock reentrantLock = this.f6426u;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object f10 = f();
                if (f10 == null) {
                    f10 = v.z;
                }
                return f10;
            }
            Object[] objArr = this.f6427v;
            int i10 = this.f6428w;
            Object obj = objArr[i10];
            s sVar = null;
            objArr[i10] = null;
            this.size = i - 1;
            Object obj2 = v.z;
            boolean z = false;
            if (i == this.f6424s) {
                while (true) {
                    s q10 = q();
                    if (q10 == null) {
                        break;
                    } else if (q10.A() != null) {
                        obj2 = q10.y();
                        sVar = q10;
                        z = true;
                        break;
                    } else {
                        q10.B();
                        sVar = q10;
                    }
                }
            }
            if (obj2 != v.z && !(obj2 instanceof h)) {
                this.size = i;
                Object[] objArr2 = this.f6427v;
                objArr2[(this.f6428w + i) % objArr2.length] = obj2;
            }
            this.f6428w = (this.f6428w + 1) % this.f6427v.length;
            reentrantLock.unlock();
            if (z) {
                e6.e.B(sVar);
                sVar.x();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void z(int i, E e10) {
        int i10 = this.f6424s;
        if (i < i10) {
            Object[] objArr = this.f6427v;
            if (i >= objArr.length) {
                int min = Math.min(objArr.length * 2, i10);
                Object[] objArr2 = new Object[min];
                for (int i11 = 0; i11 < i; i11++) {
                    Object[] objArr3 = this.f6427v;
                    objArr2[i11] = objArr3[(this.f6428w + i11) % objArr3.length];
                }
                Arrays.fill(objArr2, i, min, v.f620w);
                this.f6427v = objArr2;
                this.f6428w = 0;
            }
            Object[] objArr4 = this.f6427v;
            objArr4[(this.f6428w + i) % objArr4.length] = e10;
            return;
        }
        Object[] objArr5 = this.f6427v;
        int i12 = this.f6428w;
        objArr5[i12 % objArr5.length] = null;
        objArr5[(i + i12) % objArr5.length] = e10;
        this.f6428w = (i12 + 1) % objArr5.length;
    }
}
