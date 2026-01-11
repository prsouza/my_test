package com.github.mikephil.charting.utils;

import a.a;
import com.github.mikephil.charting.utils.ObjectPool;
import java.util.List;

public class MPPointD extends ObjectPool.Poolable {
    private static ObjectPool<MPPointD> pool;

    /* renamed from: x  reason: collision with root package name */
    public double f3608x;

    /* renamed from: y  reason: collision with root package name */
    public double f3609y;

    static {
        ObjectPool<MPPointD> create = ObjectPool.create(64, new MPPointD(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON));
        pool = create;
        create.setReplenishPercentage(0.5f);
    }

    private MPPointD(double d10, double d11) {
        this.f3608x = d10;
        this.f3609y = d11;
    }

    public static MPPointD getInstance(double d10, double d11) {
        MPPointD mPPointD = pool.get();
        mPPointD.f3608x = d10;
        mPPointD.f3609y = d11;
        return mPPointD;
    }

    public static void recycleInstance(MPPointD mPPointD) {
        pool.recycle(mPPointD);
    }

    public static void recycleInstances(List<MPPointD> list) {
        pool.recycle(list);
    }

    public ObjectPool.Poolable instantiate() {
        return new MPPointD(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON);
    }

    public String toString() {
        StringBuilder d10 = a.d("MPPointD, x: ");
        d10.append(this.f3608x);
        d10.append(", y: ");
        d10.append(this.f3609y);
        return d10.toString();
    }
}
