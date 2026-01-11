package fe;

import ce.c;
import e6.e;
import ee.d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import md.f;
import xd.p;

public final class b implements d<c> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f5090a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5091b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5092c;

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, f<Integer, Integer>> f5093d;

    public static final class a implements Iterator<c>, zd.a {

        /* renamed from: a  reason: collision with root package name */
        public int f5094a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f5095b;

        /* renamed from: c  reason: collision with root package name */
        public int f5096c;

        /* renamed from: s  reason: collision with root package name */
        public c f5097s;

        /* renamed from: t  reason: collision with root package name */
        public int f5098t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ b f5099u;

        public a(b bVar) {
            this.f5099u = bVar;
            int A = ad.c.A(bVar.f5091b, 0, bVar.f5090a.length());
            this.f5095b = A;
            this.f5096c = A;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f5096c
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.f5094a = r1
                r0 = 0
                r7.f5097s = r0
                goto L_0x0082
            L_0x000c:
                fe.b r2 = r7.f5099u
                int r3 = r2.f5092c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001b
                int r6 = r7.f5098t
                int r6 = r6 + r5
                r7.f5098t = r6
                if (r6 >= r3) goto L_0x0023
            L_0x001b:
                java.lang.CharSequence r2 = r2.f5090a
                int r2 = r2.length()
                if (r0 <= r2) goto L_0x0037
            L_0x0023:
                ce.c r0 = new ce.c
                int r1 = r7.f5095b
                fe.b r2 = r7.f5099u
                java.lang.CharSequence r2 = r2.f5090a
                int r2 = fe.o.i1(r2)
                r0.<init>(r1, r2)
                r7.f5097s = r0
                r7.f5096c = r4
                goto L_0x0080
            L_0x0037:
                fe.b r0 = r7.f5099u
                xd.p<java.lang.CharSequence, java.lang.Integer, md.f<java.lang.Integer, java.lang.Integer>> r2 = r0.f5093d
                java.lang.CharSequence r0 = r0.f5090a
                int r3 = r7.f5096c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.invoke(r0, r3)
                md.f r0 = (md.f) r0
                if (r0 != 0) goto L_0x005f
                ce.c r0 = new ce.c
                int r1 = r7.f5095b
                fe.b r2 = r7.f5099u
                java.lang.CharSequence r2 = r2.f5090a
                int r2 = fe.o.i1(r2)
                r0.<init>(r1, r2)
                r7.f5097s = r0
                r7.f5096c = r4
                goto L_0x0080
            L_0x005f:
                A r2 = r0.f8541a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f8542b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f5095b
                ce.c r3 = ad.c.C0(r3, r2)
                r7.f5097s = r3
                int r2 = r2 + r0
                r7.f5095b = r2
                if (r0 != 0) goto L_0x007d
                r1 = r5
            L_0x007d:
                int r2 = r2 + r1
                r7.f5096c = r2
            L_0x0080:
                r7.f5094a = r5
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fe.b.a.a():void");
        }

        public final boolean hasNext() {
            if (this.f5094a == -1) {
                a();
            }
            return this.f5094a == 1;
        }

        public final Object next() {
            if (this.f5094a == -1) {
                a();
            }
            if (this.f5094a != 0) {
                c cVar = this.f5097s;
                Objects.requireNonNull(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f5097s = null;
                this.f5094a = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence charSequence, int i, int i10, p<? super CharSequence, ? super Integer, f<Integer, Integer>> pVar) {
        e.D(charSequence, "input");
        this.f5090a = charSequence;
        this.f5091b = i;
        this.f5092c = i10;
        this.f5093d = pVar;
    }

    public final Iterator<c> iterator() {
        return new a(this);
    }
}
