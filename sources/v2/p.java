package v2;

import android.graphics.Paint;
import java.util.List;
import o2.l;
import q2.q;
import u2.d;

public final class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f12243a;

    /* renamed from: b  reason: collision with root package name */
    public final u2.b f12244b;

    /* renamed from: c  reason: collision with root package name */
    public final List<u2.b> f12245c;

    /* renamed from: d  reason: collision with root package name */
    public final u2.a f12246d;

    /* renamed from: e  reason: collision with root package name */
    public final d f12247e;

    /* renamed from: f  reason: collision with root package name */
    public final u2.b f12248f;
    public final b g;

    /* renamed from: h  reason: collision with root package name */
    public final c f12249h;
    public final float i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f12250j;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12251a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f12252b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                v2.p$c[] r0 = v2.p.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12252b = r0
                r1 = 1
                v2.p$c r2 = v2.p.c.BEVEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f12252b     // Catch:{ NoSuchFieldError -> 0x001d }
                v2.p$c r3 = v2.p.c.MITER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f12252b     // Catch:{ NoSuchFieldError -> 0x0028 }
                v2.p$c r4 = v2.p.c.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                v2.p$b[] r3 = v2.p.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f12251a = r3
                v2.p$b r4 = v2.p.b.BUTT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f12251a     // Catch:{ NoSuchFieldError -> 0x0043 }
                v2.p$b r3 = v2.p.b.ROUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f12251a     // Catch:{ NoSuchFieldError -> 0x004d }
                v2.p$b r1 = v2.p.b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v2.p.a.<clinit>():void");
        }
    }

    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = a.f12251a[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = a.f12252b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public p(String str, u2.b bVar, List<u2.b> list, u2.a aVar, d dVar, u2.b bVar2, b bVar3, c cVar, float f10, boolean z) {
        this.f12243a = str;
        this.f12244b = bVar;
        this.f12245c = list;
        this.f12246d = aVar;
        this.f12247e = dVar;
        this.f12248f = bVar2;
        this.g = bVar3;
        this.f12249h = cVar;
        this.i = f10;
        this.f12250j = z;
    }

    public final q2.b a(l lVar, w2.b bVar) {
        return new q(lVar, bVar, this);
    }
}
