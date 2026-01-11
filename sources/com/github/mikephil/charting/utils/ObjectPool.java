package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool.Poolable;
import java.util.List;

public class ObjectPool<T extends Poolable> {
    private static int ids;
    private int desiredCapacity;
    private T modelObject;
    private Object[] objects;
    private int objectsPointer;
    private int poolId;
    private float replenishPercentage;

    public static abstract class Poolable {
        public static int NO_OWNER = -1;
        public int currentOwnerId = NO_OWNER;

        public abstract Poolable instantiate();
    }

    private ObjectPool(int i, T t10) {
        if (i > 0) {
            this.desiredCapacity = i;
            this.objects = new Object[i];
            this.objectsPointer = 0;
            this.modelObject = t10;
            this.replenishPercentage = 1.0f;
            refillPool();
            return;
        }
        throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
    }

    public static synchronized ObjectPool create(int i, Poolable poolable) {
        ObjectPool objectPool;
        synchronized (ObjectPool.class) {
            objectPool = new ObjectPool(i, poolable);
            int i10 = ids;
            objectPool.poolId = i10;
            ids = i10 + 1;
        }
        return objectPool;
    }

    private void refillPool() {
        refillPool(this.replenishPercentage);
    }

    private void resizePool() {
        int i = this.desiredCapacity;
        int i10 = i * 2;
        this.desiredCapacity = i10;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i; i11++) {
            objArr[i11] = this.objects[i11];
        }
        this.objects = objArr;
    }

    public synchronized T get() {
        T t10;
        if (this.objectsPointer == -1 && this.replenishPercentage > 0.0f) {
            refillPool();
        }
        T[] tArr = this.objects;
        int i = this.objectsPointer;
        t10 = (Poolable) tArr[i];
        t10.currentOwnerId = Poolable.NO_OWNER;
        this.objectsPointer = i - 1;
        return t10;
    }

    public int getPoolCapacity() {
        return this.objects.length;
    }

    public int getPoolCount() {
        return this.objectsPointer + 1;
    }

    public int getPoolId() {
        return this.poolId;
    }

    public float getReplenishPercentage() {
        return this.replenishPercentage;
    }

    public synchronized void recycle(T t10) {
        int i = t10.currentOwnerId;
        if (i == Poolable.NO_OWNER) {
            int i10 = this.objectsPointer + 1;
            this.objectsPointer = i10;
            if (i10 >= this.objects.length) {
                resizePool();
            }
            t10.currentOwnerId = this.poolId;
            this.objects[this.objectsPointer] = t10;
        } else if (i == this.poolId) {
            throw new IllegalArgumentException("The object passed is already stored in this pool!");
        } else {
            throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t10.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");
        }
    }

    public void setReplenishPercentage(float f10) {
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.replenishPercentage = f10;
    }

    private void refillPool(float f10) {
        int i = this.desiredCapacity;
        int i10 = (int) (((float) i) * f10);
        if (i10 < 1) {
            i = 1;
        } else if (i10 <= i) {
            i = i10;
        }
        for (int i11 = 0; i11 < i; i11++) {
            this.objects[i11] = this.modelObject.instantiate();
        }
        this.objectsPointer = i - 1;
    }

    public synchronized void recycle(List<T> list) {
        while (list.size() + this.objectsPointer + 1 > this.desiredCapacity) {
            resizePool();
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            Poolable poolable = (Poolable) list.get(i);
            int i10 = poolable.currentOwnerId;
            if (i10 == Poolable.NO_OWNER) {
                poolable.currentOwnerId = this.poolId;
                this.objects[this.objectsPointer + 1 + i] = poolable;
                i++;
            } else if (i10 == this.poolId) {
                throw new IllegalArgumentException("The object passed is already stored in this pool!");
            } else {
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + poolable.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");
            }
        }
        this.objectsPointer += size;
    }
}
