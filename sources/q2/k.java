package q2;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import r2.o;
import v2.h;

public final class k implements l, i {

    /* renamed from: a  reason: collision with root package name */
    public final Path f10246a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f10247b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f10248c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final List<l> f10249d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final h f10250e;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10251a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v2.h$a[] r0 = v2.h.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10251a = r0
                v2.h$a r1 = v2.h.a.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10251a     // Catch:{ NoSuchFieldError -> 0x001d }
                v2.h$a r1 = v2.h.a.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10251a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v2.h$a r1 = v2.h.a.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10251a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v2.h$a r1 = v2.h.a.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10251a     // Catch:{ NoSuchFieldError -> 0x003e }
                v2.h$a r1 = v2.h.a.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q2.k.a.<clinit>():void");
        }
    }

    public k(h hVar) {
        Objects.requireNonNull(hVar);
        this.f10250e = hVar;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List<q2.l>, java.util.ArrayList] */
    public final void b(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.f10247b.reset();
        this.f10246a.reset();
        for (int size = this.f10249d.size() - 1; size >= 1; size--) {
            l lVar = (l) this.f10249d.get(size);
            if (lVar instanceof c) {
                c cVar = (c) lVar;
                ArrayList arrayList = (ArrayList) cVar.d();
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    Path path = ((l) arrayList.get(size2)).getPath();
                    o oVar = cVar.f10203k;
                    if (oVar != null) {
                        matrix2 = oVar.e();
                    } else {
                        cVar.f10197c.reset();
                        matrix2 = cVar.f10197c;
                    }
                    path.transform(matrix2);
                    this.f10247b.addPath(path);
                }
            } else {
                this.f10247b.addPath(lVar.getPath());
            }
        }
        int i = 0;
        l lVar2 = (l) this.f10249d.get(0);
        if (lVar2 instanceof c) {
            c cVar2 = (c) lVar2;
            List<l> d10 = cVar2.d();
            while (true) {
                ArrayList arrayList2 = (ArrayList) d10;
                if (i >= arrayList2.size()) {
                    break;
                }
                Path path2 = ((l) arrayList2.get(i)).getPath();
                o oVar2 = cVar2.f10203k;
                if (oVar2 != null) {
                    matrix = oVar2.e();
                } else {
                    cVar2.f10197c.reset();
                    matrix = cVar2.f10197c;
                }
                path2.transform(matrix);
                this.f10246a.addPath(path2);
                i++;
            }
        } else {
            this.f10246a.set(lVar2.getPath());
        }
        this.f10248c.op(this.f10246a, this.f10247b, op);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<q2.l>, java.util.ArrayList] */
    public final void c(List<b> list, List<b> list2) {
        for (int i = 0; i < this.f10249d.size(); i++) {
            ((l) this.f10249d.get(i)).c(list, list2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.util.ListIterator<q2.b> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            q2.b r0 = (q2.b) r0
            boolean r1 = r0 instanceof q2.l
            if (r1 == 0) goto L_0x000d
            java.util.List<q2.l> r1 = r2.f10249d
            q2.l r0 = (q2.l) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.k.d(java.util.ListIterator):void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<q2.l>, java.util.ArrayList] */
    public final Path getPath() {
        this.f10248c.reset();
        h hVar = this.f10250e;
        if (hVar.f12208c) {
            return this.f10248c;
        }
        int i = a.f10251a[hVar.f12207b.ordinal()];
        if (i == 1) {
            for (int i10 = 0; i10 < this.f10249d.size(); i10++) {
                this.f10248c.addPath(((l) this.f10249d.get(i10)).getPath());
            }
        } else if (i == 2) {
            b(Path.Op.UNION);
        } else if (i == 3) {
            b(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            b(Path.Op.INTERSECT);
        } else if (i == 5) {
            b(Path.Op.XOR);
        }
        return this.f10248c;
    }
}
