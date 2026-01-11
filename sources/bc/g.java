package bc;

import java.util.concurrent.locks.ReentrantLock;
import ld.a;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static b f2963a;

    /* renamed from: b  reason: collision with root package name */
    public static final ReentrantLock f2964b = new ReentrantLock();

    public static final b a() {
        Class<a> cls = a.class;
        try {
            System.out.println("location provider found ! using google play location");
            a newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance != null) {
                b bVar = newInstance;
                f2963a = bVar;
                return bVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type io.nodle.sdk.location.LocationEngineSpi");
        } catch (Exception unused) {
            Class<?> cls2 = Class.forName("io.nodle.sdk.location.gps.LocationProviderGPS");
            System.out.println("location provider found ! using gps");
            Object newInstance2 = cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance2 != null) {
                b bVar2 = (b) newInstance2;
                f2963a = bVar2;
                return bVar2;
            }
            throw new NullPointerException("null cannot be cast to non-null type io.nodle.sdk.location.LocationEngineSpi");
        } catch (Exception unused2) {
            try {
                Class<?> cls3 = Class.forName("io.nodle.nodlesdk.linux.location.LocationProviderGeoip2");
                System.out.println("location provider found ! using ip");
                Object newInstance3 = cls3.getConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance3 != null) {
                    b bVar3 = (b) newInstance3;
                    f2963a = bVar3;
                    return bVar3;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.nodle.sdk.location.LocationEngineSpi");
            } catch (Exception unused3) {
                System.out.println("no location provider found");
                h hVar = new h();
                f2963a = hVar;
                return hVar;
            }
        }
    }

    public static final b b() {
        ReentrantLock reentrantLock = f2964b;
        reentrantLock.lock();
        try {
            b bVar = f2963a;
            if (bVar == null) {
                bVar = a();
            }
            return bVar;
        } finally {
            reentrantLock.unlock();
        }
    }
}
