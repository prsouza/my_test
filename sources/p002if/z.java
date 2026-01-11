package p002if;

import e6.e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import jf.c;
import p002if.t;
import uf.g;

/* renamed from: if.z  reason: invalid package */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6639a = new a();

    /* renamed from: if.z$a */
    public static final class a {

        /* renamed from: if.z$a$a  reason: collision with other inner class name */
        public static final class C0112a extends z {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ byte[] f6640b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ t f6641c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ int f6642d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ int f6643e;

            public C0112a(byte[] bArr, t tVar, int i, int i10) {
                this.f6640b = bArr;
                this.f6641c = tVar;
                this.f6642d = i;
                this.f6643e = i10;
            }

            public final long a() {
                return (long) this.f6642d;
            }

            public final t b() {
                return this.f6641c;
            }

            public final void c(g gVar) {
                gVar.g(this.f6640b, this.f6643e, this.f6642d);
            }
        }

        public final z a(String str, t tVar) {
            e.D(str, "$this$toRequestBody");
            Charset charset = fe.a.f5086b;
            if (tVar != null) {
                Pattern pattern = t.f6579d;
                Charset a10 = tVar.a((Charset) null);
                if (a10 == null) {
                    t.a aVar = t.f6581f;
                    tVar = aVar.b(tVar + "; charset=utf-8");
                } else {
                    charset = a10;
                }
            }
            byte[] bytes = str.getBytes(charset);
            e.C(bytes, "(this as java.lang.String).getBytes(charset)");
            return b(bytes, tVar, 0, bytes.length);
        }

        public final z b(byte[] bArr, t tVar, int i, int i10) {
            c.c((long) bArr.length, (long) i, (long) i10);
            return new C0112a(bArr, tVar, i10, i);
        }
    }

    public long a() throws IOException {
        return -1;
    }

    public abstract t b();

    public abstract void c(g gVar) throws IOException;
}
