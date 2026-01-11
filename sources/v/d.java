package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import net.jpountz.lz4.LZ4FrameOutputStream;
import t.g;
import w.i;
import w.o;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<d> f12042a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f12043b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12044c;

    /* renamed from: d  reason: collision with root package name */
    public final e f12045d;

    /* renamed from: e  reason: collision with root package name */
    public final b f12046e;

    /* renamed from: f  reason: collision with root package name */
    public d f12047f;
    public int g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f12048h = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
    public g i;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12049a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v.d$b[] r0 = v.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12049a = r0
                v.d$b r1 = v.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12049a     // Catch:{ NoSuchFieldError -> 0x001d }
                v.d$b r1 = v.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12049a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.d$b r1 = v.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12049a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.d$b r1 = v.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12049a     // Catch:{ NoSuchFieldError -> 0x003e }
                v.d$b r1 = v.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f12049a     // Catch:{ NoSuchFieldError -> 0x0049 }
                v.d$b r1 = v.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f12049a     // Catch:{ NoSuchFieldError -> 0x0054 }
                v.d$b r1 = v.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f12049a     // Catch:{ NoSuchFieldError -> 0x0060 }
                v.d$b r1 = v.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f12049a     // Catch:{ NoSuchFieldError -> 0x006c }
                v.d$b r1 = v.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v.d.a.<clinit>():void");
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f12045d = eVar;
        this.f12046e = bVar;
    }

    public final boolean a(d dVar, int i10, int i11) {
        if (dVar == null) {
            h();
            return true;
        }
        this.f12047f = dVar;
        if (dVar.f12042a == null) {
            dVar.f12042a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f12047f.f12042a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i10;
        this.f12048h = i11;
        return true;
    }

    public final void b(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f12042a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                i.a(it.next().f12045d, i10, arrayList, oVar);
            }
        }
    }

    public final int c() {
        if (!this.f12044c) {
            return 0;
        }
        return this.f12043b;
    }

    public final int d() {
        d dVar;
        if (this.f12045d.f12064i0 == 8) {
            return 0;
        }
        int i10 = this.f12048h;
        if (i10 == Integer.MIN_VALUE || (dVar = this.f12047f) == null || dVar.f12045d.f12064i0 != 8) {
            return this.g;
        }
        return i10;
    }

    public final boolean e() {
        d dVar;
        HashSet<d> hashSet = this.f12042a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            d next = it.next();
            Objects.requireNonNull(next);
            switch (a.f12049a[next.f12046e.ordinal()]) {
                case 1:
                case 6:
                case 7:
                case 8:
                case 9:
                    dVar = null;
                    break;
                case 2:
                    dVar = next.f12045d.L;
                    break;
                case 3:
                    dVar = next.f12045d.J;
                    break;
                case 4:
                    dVar = next.f12045d.M;
                    break;
                case 5:
                    dVar = next.f12045d.K;
                    break;
                default:
                    throw new AssertionError(next.f12046e.name());
            }
            if (dVar.g()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        HashSet<d> hashSet = this.f12042a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        return this.f12047f != null;
    }

    public final void h() {
        HashSet<d> hashSet;
        d dVar = this.f12047f;
        if (!(dVar == null || (hashSet = dVar.f12042a) == null)) {
            hashSet.remove(this);
            if (this.f12047f.f12042a.size() == 0) {
                this.f12047f.f12042a = null;
            }
        }
        this.f12042a = null;
        this.f12047f = null;
        this.g = 0;
        this.f12048h = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        this.f12044c = false;
        this.f12043b = 0;
    }

    public final void i() {
        g gVar = this.i;
        if (gVar == null) {
            this.i = new g(g.a.UNRESTRICTED);
        } else {
            gVar.h();
        }
    }

    public final void j(int i10) {
        this.f12043b = i10;
        this.f12044c = true;
    }

    public final String toString() {
        return this.f12045d.f12066j0 + ":" + this.f12046e.toString();
    }
}
