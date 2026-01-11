package me;

import java.util.concurrent.TimeUnit;
import l6.y0;
import le.s;
import y.c;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final long f8583a = c.m0("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final int f8584b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f8585c = c.p0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);

    /* renamed from: d  reason: collision with root package name */
    public static final long f8586d = TimeUnit.SECONDS.toNanos(c.m0("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: e  reason: collision with root package name */
    public static e f8587e = e.f8578v;

    /* renamed from: f  reason: collision with root package name */
    public static final y0 f8588f = new y0(0);
    public static final y0 g = new y0(1);

    static {
        int i = s.f8266a;
        if (i < 2) {
            i = 2;
        }
        f8584b = c.p0("kotlinx.coroutines.scheduler.core.pool.size", i, 1, 0, 8);
    }
}
