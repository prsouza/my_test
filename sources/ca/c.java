package ca;

import ea.a;
import ea.b;
import ea.d;
import ea.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Optional;

public final class c implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    public static final d f3312b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final f f3313c = new f();

    /* renamed from: s  reason: collision with root package name */
    public static final b f3314s = new b();

    /* renamed from: t  reason: collision with root package name */
    public static final a f3315t = new a();

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f3316a;

    public c(OutputStream outputStream) {
        this.f3316a = outputStream;
    }

    public final void a(int i) throws IOException {
        this.f3316a.write(i);
    }

    public final void c(byte[] bArr, int i) throws IOException {
        this.f3316a.write(bArr, 0, i);
    }

    public final void close() throws IOException {
        this.f3316a.close();
    }

    public final <T> void e(e<T> eVar, T t10) throws IOException {
        if ((eVar instanceof a) || (eVar instanceof b)) {
            f3315t.b(this, Optional.ofNullable(t10));
        } else if (t10 == null) {
            f3314s.b(this, Boolean.FALSE);
        } else {
            f3314s.b(this, Boolean.TRUE);
            eVar.b(this, t10);
        }
    }
}
