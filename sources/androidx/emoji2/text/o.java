package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import c3.k;
import w0.b;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final b f1754a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f1755b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1756c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f1757d;

    public o(Typeface typeface, b bVar) {
        this.f1757d = typeface;
        this.f1754a = bVar;
        this.f1755b = new char[(bVar.c() * 2)];
        int c10 = bVar.c();
        for (int i = 0; i < c10; i++) {
            g gVar = new g(this, i);
            Character.toChars(gVar.d(), this.f1755b, i * 2);
            k.O(gVar.b() > 0, "invalid metadata codepoint length");
            this.f1756c.a(gVar, 0, gVar.b() - 1);
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f1758a = new SparseArray<>(1);

        /* renamed from: b  reason: collision with root package name */
        public g f1759b;

        public a() {
        }

        public final void a(g gVar, int i, int i10) {
            int a10 = gVar.a(i);
            SparseArray<a> sparseArray = this.f1758a;
            a aVar = sparseArray == null ? null : sparseArray.get(a10);
            if (aVar == null) {
                aVar = new a();
                this.f1758a.put(gVar.a(i), aVar);
            }
            if (i10 > i) {
                aVar.a(gVar, i + 1, i10);
            } else {
                aVar.f1759b = gVar;
            }
        }

        public a(int i) {
        }
    }
}
