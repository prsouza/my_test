package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import j0.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class m implements Runnable {

    /* renamed from: t  reason: collision with root package name */
    public static final ThreadLocal<m> f2555t = new ThreadLocal<>();

    /* renamed from: u  reason: collision with root package name */
    public static Comparator<c> f2556u = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<RecyclerView> f2557a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f2558b;

    /* renamed from: c  reason: collision with root package name */
    public long f2559c;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<c> f2560s = new ArrayList<>();

    public class a implements Comparator<c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r0 != false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.m$c r7 = (androidx.recyclerview.widget.m.c) r7
                androidx.recyclerview.widget.m$c r8 = (androidx.recyclerview.widget.m.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2568d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r3 = r2
                goto L_0x000d
            L_0x000c:
                r3 = r1
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2568d
                if (r4 != 0) goto L_0x0013
                r4 = r2
                goto L_0x0014
            L_0x0013:
                r4 = r1
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001d
                if (r0 != 0) goto L_0x001b
            L_0x0019:
                r1 = r2
                goto L_0x0037
            L_0x001b:
                r1 = r5
                goto L_0x0037
            L_0x001d:
                boolean r0 = r7.f2565a
                boolean r3 = r8.f2565a
                if (r0 == r3) goto L_0x0026
                if (r0 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0026:
                int r0 = r8.f2566b
                int r2 = r7.f2566b
                int r0 = r0 - r2
                if (r0 == 0) goto L_0x002f
                r1 = r0
                goto L_0x0037
            L_0x002f:
                int r7 = r7.f2567c
                int r8 = r8.f2567c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0037
                r1 = r7
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    public static class b implements RecyclerView.n.c {

        /* renamed from: a  reason: collision with root package name */
        public int f2561a;

        /* renamed from: b  reason: collision with root package name */
        public int f2562b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f2563c;

        /* renamed from: d  reason: collision with root package name */
        public int f2564d;

        public final void a(int i, int i10) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i10 >= 0) {
                int i11 = this.f2564d * 2;
                int[] iArr = this.f2563c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f2563c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i11 >= iArr.length) {
                    int[] iArr3 = new int[(i11 * 2)];
                    this.f2563c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f2563c;
                iArr4[i11] = i;
                iArr4[i11 + 1] = i10;
                this.f2564d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public final void b(RecyclerView recyclerView, boolean z) {
            this.f2564d = 0;
            int[] iArr = this.f2563c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.n nVar = recyclerView.B;
            if (recyclerView.A != null && nVar != null && nVar.f2350k) {
                if (z) {
                    if (!recyclerView.f2287s.g()) {
                        nVar.j(recyclerView.A.a(), this);
                    }
                } else if (!recyclerView.M()) {
                    nVar.i(this.f2561a, this.f2562b, recyclerView.f2294v0, this);
                }
                int i = this.f2564d;
                if (i > nVar.f2351l) {
                    nVar.f2351l = i;
                    nVar.f2352m = z;
                    recyclerView.f2269b.l();
                }
            }
        }

        public final boolean c(int i) {
            if (this.f2563c != null) {
                int i10 = this.f2564d * 2;
                for (int i11 = 0; i11 < i10; i11 += 2) {
                    if (this.f2563c[i11] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2565a;

        /* renamed from: b  reason: collision with root package name */
        public int f2566b;

        /* renamed from: c  reason: collision with root package name */
        public int f2567c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f2568d;

        /* renamed from: e  reason: collision with root package name */
        public int f2569e;
    }

    public final void a(RecyclerView recyclerView, int i, int i10) {
        if (recyclerView.isAttachedToWindow() && this.f2558b == 0) {
            this.f2558b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f2292u0;
        bVar.f2561a = i;
        bVar.f2562b = i10;
    }

    public final void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f2557a.size();
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = this.f2557a.get(i10);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f2292u0.b(recyclerView3, false);
                i += recyclerView3.f2292u0.f2564d;
            }
        }
        this.f2560s.ensureCapacity(i);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = this.f2557a.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.f2292u0;
                int abs = Math.abs(bVar.f2562b) + Math.abs(bVar.f2561a);
                for (int i13 = 0; i13 < bVar.f2564d * 2; i13 += 2) {
                    if (i11 >= this.f2560s.size()) {
                        cVar2 = new c();
                        this.f2560s.add(cVar2);
                    } else {
                        cVar2 = this.f2560s.get(i11);
                    }
                    int[] iArr = bVar.f2563c;
                    int i14 = iArr[i13 + 1];
                    cVar2.f2565a = i14 <= abs;
                    cVar2.f2566b = abs;
                    cVar2.f2567c = i14;
                    cVar2.f2568d = recyclerView4;
                    cVar2.f2569e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(this.f2560s, f2556u);
        for (int i15 = 0; i15 < this.f2560s.size() && (recyclerView = cVar.f2568d) != null; i15++) {
            RecyclerView.b0 c10 = c(recyclerView, (cVar = this.f2560s.get(i15)).f2569e, cVar.f2565a ? Long.MAX_VALUE : j10);
            if (!(c10 == null || c10.f2312b == null || !c10.i() || c10.j() || (recyclerView2 = c10.f2312b.get()) == null)) {
                if (recyclerView2.R && recyclerView2.f2289t.h() != 0) {
                    recyclerView2.Z();
                }
                b bVar2 = recyclerView2.f2292u0;
                bVar2.b(recyclerView2, true);
                if (bVar2.f2564d != 0) {
                    try {
                        int i16 = i.f6985a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.y yVar = recyclerView2.f2294v0;
                        RecyclerView.f fVar = recyclerView2.A;
                        yVar.f2398d = 1;
                        yVar.f2399e = fVar.a();
                        yVar.g = false;
                        yVar.f2401h = false;
                        yVar.i = false;
                        for (int i17 = 0; i17 < bVar2.f2564d * 2; i17 += 2) {
                            c(recyclerView2, bVar2.f2563c[i17], j10);
                        }
                        Trace.endSection();
                    } catch (Throwable th2) {
                        int i18 = i.f6985a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            cVar.f2565a = false;
            cVar.f2566b = 0;
            cVar.f2567c = 0;
            cVar.f2568d = null;
            cVar.f2569e = 0;
        }
    }

    public final RecyclerView.b0 c(RecyclerView recyclerView, int i, long j10) {
        boolean z;
        int h10 = recyclerView.f2289t.h();
        int i10 = 0;
        while (true) {
            if (i10 >= h10) {
                z = false;
                break;
            }
            RecyclerView.b0 K = RecyclerView.K(recyclerView.f2289t.g(i10));
            if (K.f2313c == i && !K.j()) {
                z = true;
                break;
            }
            i10++;
        }
        if (z) {
            return null;
        }
        RecyclerView.t tVar = recyclerView.f2269b;
        try {
            recyclerView.S();
            RecyclerView.b0 j11 = tVar.j(i, j10);
            if (j11 != null) {
                if (!j11.i() || j11.j()) {
                    tVar.a(j11, false);
                } else {
                    tVar.g(j11.f2311a);
                }
            }
            return j11;
        } finally {
            recyclerView.T(false);
        }
    }

    public final void run() {
        try {
            int i = i.f6985a;
            Trace.beginSection("RV Prefetch");
            if (this.f2557a.isEmpty()) {
                this.f2558b = 0;
                Trace.endSection();
                return;
            }
            int size = this.f2557a.size();
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView recyclerView = this.f2557a.get(i10);
                if (recyclerView.getWindowVisibility() == 0) {
                    j10 = Math.max(recyclerView.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.f2558b = 0;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f2559c);
            this.f2558b = 0;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f2558b = 0;
            int i11 = i.f6985a;
            Trace.endSection();
            throw th2;
        }
    }
}
