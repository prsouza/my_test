package uf;

import e6.e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class c0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f11945d = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f11946a;

    /* renamed from: b  reason: collision with root package name */
    public long f11947b;

    /* renamed from: c  reason: collision with root package name */
    public long f11948c;

    public static final class a extends c0 {
        public final c0 d(long j10) {
            return this;
        }

        public final void f() {
        }

        public final c0 g(long j10) {
            e.D(TimeUnit.MILLISECONDS, "unit");
            return this;
        }
    }

    public c0 a() {
        this.f11946a = false;
        return this;
    }

    public c0 b() {
        this.f11948c = 0;
        return this;
    }

    public long c() {
        if (this.f11946a) {
            return this.f11947b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public c0 d(long j10) {
        this.f11946a = true;
        this.f11947b = j10;
        return this;
    }

    public boolean e() {
        return this.f11946a;
    }

    public void f() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f11946a && this.f11947b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public c0 g(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e.D(timeUnit, "unit");
        if (j10 >= 0) {
            this.f11948c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.d("timeout < 0: ", j10).toString());
    }
}
