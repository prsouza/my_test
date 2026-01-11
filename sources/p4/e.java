package p4;

import h4.c;
import h4.g;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import k4.b;
import m4.a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final b f9676a;

    /* renamed from: b  reason: collision with root package name */
    public final InputStream f9677b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f9678c;

    /* renamed from: d  reason: collision with root package name */
    public int f9679d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f9680e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9681f = true;

    public e(b bVar, InputStream inputStream) {
        this.f9676a = bVar;
        this.f9677b = inputStream;
        bVar.a(bVar.f7440d);
        byte[] a10 = bVar.f7439c.a(0, 0);
        bVar.f7440d = a10;
        this.f9678c = a10;
    }

    public final d a(int i, int i10, int i11, android.support.v4.media.b bVar, a aVar) throws IOException, g {
        Objects.requireNonNull(aVar);
        a aVar2 = new a(aVar, c.a.INTERN_FIELD_NAMES.enabledIn(i), aVar.f8471c, c.a.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), aVar.f8470b.get());
        if (this.f9677b != null) {
            int i12 = this.f9680e - this.f9679d;
            while (i12 < 1) {
                InputStream inputStream = this.f9677b;
                byte[] bArr = this.f9678c;
                int i13 = this.f9680e;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                if (read < 1) {
                    break;
                }
                this.f9680e += read;
                i12 += read;
            }
        }
        return new d(this.f9676a, i10, aVar2, this.f9677b, this.f9678c, this.f9679d, this.f9680e, this.f9681f);
    }
}
