package androidx.recyclerview.widget;

import androidx.recyclerview.widget.p;
import java.util.ArrayList;
import java.util.List;
import m0.c;
import m0.d;

public final class a implements p.a {

    /* renamed from: a  reason: collision with root package name */
    public c<b> f2445a = new d(30);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f2446b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f2447c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final C0020a f2448d;

    /* renamed from: e  reason: collision with root package name */
    public final p f2449e;

    /* renamed from: f  reason: collision with root package name */
    public int f2450f = 0;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    public interface C0020a {
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2451a;

        /* renamed from: b  reason: collision with root package name */
        public int f2452b;

        /* renamed from: c  reason: collision with root package name */
        public Object f2453c;

        /* renamed from: d  reason: collision with root package name */
        public int f2454d;

        public b(int i, int i10, int i11, Object obj) {
            this.f2451a = i;
            this.f2452b = i10;
            this.f2454d = i11;
            this.f2453c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f2451a;
            if (i != bVar.f2451a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2454d - this.f2452b) == 1 && this.f2454d == bVar.f2452b && this.f2452b == bVar.f2454d) {
                return true;
            }
            if (this.f2454d != bVar.f2454d || this.f2452b != bVar.f2452b) {
                return false;
            }
            Object obj2 = this.f2453c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f2453c)) {
                    return false;
                }
            } else if (bVar.f2453c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f2451a * 31) + this.f2452b) * 31) + this.f2454d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i = this.f2451a;
            sb2.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb2.append(",s:");
            sb2.append(this.f2452b);
            sb2.append("c:");
            sb2.append(this.f2454d);
            sb2.append(",p:");
            sb2.append(this.f2453c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public a(C0020a aVar) {
        this.f2448d = aVar;
        this.f2449e = new p(this);
    }

    public final boolean a(int i) {
        int size = this.f2447c.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f2447c.get(i10);
            int i11 = bVar.f2451a;
            if (i11 == 8) {
                if (f(bVar.f2454d, i10 + 1) == i) {
                    return true;
                }
            } else if (i11 == 1) {
                int i12 = bVar.f2452b;
                int i13 = bVar.f2454d + i12;
                while (i12 < i13) {
                    if (f(i12, i10 + 1) == i) {
                        return true;
                    }
                    i12++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        int size = this.f2447c.size();
        for (int i = 0; i < size; i++) {
            ((w) this.f2448d).a(this.f2447c.get(i));
        }
        l(this.f2447c);
        this.f2450f = 0;
    }

    public final void c() {
        b();
        int size = this.f2446b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f2446b.get(i);
            int i10 = bVar.f2451a;
            if (i10 == 1) {
                ((w) this.f2448d).a(bVar);
                ((w) this.f2448d).d(bVar.f2452b, bVar.f2454d);
            } else if (i10 == 2) {
                ((w) this.f2448d).a(bVar);
                C0020a aVar = this.f2448d;
                int i11 = bVar.f2452b;
                int i12 = bVar.f2454d;
                w wVar = (w) aVar;
                wVar.f2592a.R(i11, i12, true);
                RecyclerView recyclerView = wVar.f2592a;
                recyclerView.f2300y0 = true;
                recyclerView.f2294v0.f2397c += i12;
            } else if (i10 == 4) {
                ((w) this.f2448d).a(bVar);
                ((w) this.f2448d).c(bVar.f2452b, bVar.f2454d, bVar.f2453c);
            } else if (i10 == 8) {
                ((w) this.f2448d).a(bVar);
                ((w) this.f2448d).e(bVar.f2452b, bVar.f2454d);
            }
        }
        l(this.f2446b);
        this.f2450f = 0;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [m0.c<androidx.recyclerview.widget.a$b>, m0.d] */
    /* JADX WARNING: type inference failed for: r0v4, types: [m0.c<androidx.recyclerview.widget.a$b>, m0.d] */
    /* JADX WARNING: type inference failed for: r10v1, types: [m0.c<androidx.recyclerview.widget.a$b>, m0.d] */
    public final void d(b bVar) {
        int i;
        int i10 = bVar.f2451a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m10 = m(bVar.f2452b, i10);
        int i11 = bVar.f2452b;
        int i12 = bVar.f2451a;
        if (i12 == 2) {
            i = 0;
        } else if (i12 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i13 = 1;
        for (int i14 = 1; i14 < bVar.f2454d; i14++) {
            int m11 = m((i * i14) + bVar.f2452b, bVar.f2451a);
            int i15 = bVar.f2451a;
            if (i15 == 2 ? m11 == m10 : i15 == 4 && m11 == m10 + 1) {
                i13++;
            } else {
                b h10 = h(i15, m10, i13, bVar.f2453c);
                e(h10, i11);
                h10.f2453c = null;
                this.f2445a.a(h10);
                if (bVar.f2451a == 4) {
                    i11 += i13;
                }
                i13 = 1;
                m10 = m11;
            }
        }
        Object obj = bVar.f2453c;
        bVar.f2453c = null;
        this.f2445a.a(bVar);
        if (i13 > 0) {
            b h11 = h(bVar.f2451a, m10, i13, obj);
            e(h11, i11);
            h11.f2453c = null;
            this.f2445a.a(h11);
        }
    }

    public final void e(b bVar, int i) {
        ((w) this.f2448d).a(bVar);
        int i10 = bVar.f2451a;
        if (i10 == 2) {
            C0020a aVar = this.f2448d;
            int i11 = bVar.f2454d;
            w wVar = (w) aVar;
            wVar.f2592a.R(i, i11, true);
            RecyclerView recyclerView = wVar.f2592a;
            recyclerView.f2300y0 = true;
            recyclerView.f2294v0.f2397c += i11;
        } else if (i10 == 4) {
            ((w) this.f2448d).c(i, bVar.f2454d, bVar.f2453c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final int f(int i, int i10) {
        int size = this.f2447c.size();
        while (i10 < size) {
            b bVar = this.f2447c.get(i10);
            int i11 = bVar.f2451a;
            if (i11 == 8) {
                int i12 = bVar.f2452b;
                if (i12 == i) {
                    i = bVar.f2454d;
                } else {
                    if (i12 < i) {
                        i--;
                    }
                    if (bVar.f2454d <= i) {
                        i++;
                    }
                }
            } else {
                int i13 = bVar.f2452b;
                if (i13 > i) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = bVar.f2454d;
                    if (i < i13 + i14) {
                        return -1;
                    }
                    i -= i14;
                } else if (i11 == 1) {
                    i += bVar.f2454d;
                }
            }
            i10++;
        }
        return i;
    }

    public final boolean g() {
        return this.f2446b.size() > 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [m0.c<androidx.recyclerview.widget.a$b>, m0.d] */
    public final b h(int i, int i10, int i11, Object obj) {
        b bVar = (b) this.f2445a.b();
        if (bVar == null) {
            return new b(i, i10, i11, obj);
        }
        bVar.f2451a = i;
        bVar.f2452b = i10;
        bVar.f2454d = i11;
        bVar.f2453c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f2447c.add(bVar);
        int i = bVar.f2451a;
        if (i == 1) {
            ((w) this.f2448d).d(bVar.f2452b, bVar.f2454d);
        } else if (i == 2) {
            C0020a aVar = this.f2448d;
            w wVar = (w) aVar;
            wVar.f2592a.R(bVar.f2452b, bVar.f2454d, false);
            wVar.f2592a.f2300y0 = true;
        } else if (i == 4) {
            ((w) this.f2448d).c(bVar.f2452b, bVar.f2454d, bVar.f2453c);
        } else if (i == 8) {
            ((w) this.f2448d).e(bVar.f2452b, bVar.f2454d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: type inference failed for: r11v5, types: [m0.c<androidx.recyclerview.widget.a$b>, m0.d] */
    /* JADX WARNING: type inference failed for: r11v10, types: [m0.c<androidx.recyclerview.widget.a$b>, m0.d] */
    /* JADX WARNING: type inference failed for: r3v14, types: [m0.c<androidx.recyclerview.widget.a$b>, m0.d] */
    /* JADX WARNING: type inference failed for: r3v18, types: [m0.c<androidx.recyclerview.widget.a$b>, m0.d] */
    /* JADX WARNING: type inference failed for: r6v34, types: [m0.c<androidx.recyclerview.widget.a$b>, m0.d] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.p r1 = r0.f2449e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f2446b
            java.util.Objects.requireNonNull(r1)
        L_0x0009:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r2.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.a.b) r9
            int r9 = r9.f2451a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = r4
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = r8
        L_0x0027:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r8) goto L_0x01df
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.a.b) r11
            java.lang.Object r12 = r2.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.a.b) r12
            int r13 = r12.f2451a
            if (r13 == r4) goto L_0x01b5
            if (r13 == r9) goto L_0x00b1
            if (r13 == r6) goto L_0x0043
            goto L_0x0009
        L_0x0043:
            int r5 = r11.f2454d
            int r8 = r12.f2452b
            if (r5 >= r8) goto L_0x004e
            int r8 = r8 + -1
            r12.f2452b = r8
            goto L_0x0064
        L_0x004e:
            int r9 = r12.f2454d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0064
            int r9 = r9 + -1
            r12.f2454d = r9
            androidx.recyclerview.widget.p$a r5 = r1.f2584a
            int r8 = r11.f2452b
            java.lang.Object r9 = r12.f2453c
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.a) r5
            androidx.recyclerview.widget.a$b r4 = r5.h(r6, r8, r4, r9)
            goto L_0x0065
        L_0x0064:
            r4 = r10
        L_0x0065:
            int r5 = r11.f2452b
            int r8 = r12.f2452b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.f2452b = r8
            goto L_0x0088
        L_0x0070:
            int r9 = r12.f2454d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0088
            int r8 = r8 - r5
            androidx.recyclerview.widget.p$a r9 = r1.f2584a
            int r5 = r5 + 1
            java.lang.Object r13 = r12.f2453c
            androidx.recyclerview.widget.a r9 = (androidx.recyclerview.widget.a) r9
            androidx.recyclerview.widget.a$b r5 = r9.h(r6, r5, r8, r13)
            int r6 = r12.f2454d
            int r6 = r6 - r8
            r12.f2454d = r6
            goto L_0x0089
        L_0x0088:
            r5 = r10
        L_0x0089:
            r2.set(r7, r11)
            int r6 = r12.f2454d
            if (r6 <= 0) goto L_0x0094
            r2.set(r3, r12)
            goto L_0x00a5
        L_0x0094:
            r2.remove(r3)
            androidx.recyclerview.widget.p$a r6 = r1.f2584a
            androidx.recyclerview.widget.a r6 = (androidx.recyclerview.widget.a) r6
            java.util.Objects.requireNonNull(r6)
            r12.f2453c = r10
            m0.c<androidx.recyclerview.widget.a$b> r6 = r6.f2445a
            r6.a(r12)
        L_0x00a5:
            if (r4 == 0) goto L_0x00aa
            r2.add(r3, r4)
        L_0x00aa:
            if (r5 == 0) goto L_0x0009
            r2.add(r3, r5)
            goto L_0x0009
        L_0x00b1:
            int r6 = r11.f2452b
            int r8 = r11.f2454d
            if (r6 >= r8) goto L_0x00c6
            int r13 = r12.f2452b
            if (r13 != r6) goto L_0x00c4
            int r13 = r12.f2454d
            int r6 = r8 - r6
            if (r13 != r6) goto L_0x00c4
            r5 = r4
            r6 = 0
            goto L_0x00d6
        L_0x00c4:
            r5 = 0
            goto L_0x00d2
        L_0x00c6:
            int r13 = r12.f2452b
            int r14 = r8 + 1
            if (r13 != r14) goto L_0x00d4
            int r13 = r12.f2454d
            int r6 = r6 - r8
            if (r13 != r6) goto L_0x00d4
            r5 = r4
        L_0x00d2:
            r6 = r5
            goto L_0x00d6
        L_0x00d4:
            r6 = r4
            r5 = 0
        L_0x00d6:
            int r13 = r12.f2452b
            if (r8 >= r13) goto L_0x00df
            int r13 = r13 + -1
            r12.f2452b = r13
            goto L_0x0103
        L_0x00df:
            int r14 = r12.f2454d
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x0103
            int r14 = r14 + -1
            r12.f2454d = r14
            r11.f2451a = r9
            r11.f2454d = r4
            int r3 = r12.f2454d
            if (r3 != 0) goto L_0x0009
            r2.remove(r7)
            androidx.recyclerview.widget.p$a r3 = r1.f2584a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.a) r3
            java.util.Objects.requireNonNull(r3)
            r12.f2453c = r10
            m0.c<androidx.recyclerview.widget.a$b> r3 = r3.f2445a
            r3.a(r12)
            goto L_0x0009
        L_0x0103:
            int r4 = r11.f2452b
            int r8 = r12.f2452b
            if (r4 > r8) goto L_0x010e
            int r8 = r8 + 1
            r12.f2452b = r8
            goto L_0x0126
        L_0x010e:
            int r13 = r12.f2454d
            int r8 = r8 + r13
            if (r4 >= r8) goto L_0x0126
            int r8 = r8 - r4
            androidx.recyclerview.widget.p$a r13 = r1.f2584a
            int r4 = r4 + 1
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            androidx.recyclerview.widget.a$b r4 = r13.h(r9, r4, r8, r10)
            int r8 = r11.f2452b
            int r9 = r12.f2452b
            int r8 = r8 - r9
            r12.f2454d = r8
            goto L_0x0127
        L_0x0126:
            r4 = r10
        L_0x0127:
            if (r5 == 0) goto L_0x013f
            r2.set(r3, r12)
            r2.remove(r7)
            androidx.recyclerview.widget.p$a r3 = r1.f2584a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.a) r3
            java.util.Objects.requireNonNull(r3)
            r11.f2453c = r10
            m0.c<androidx.recyclerview.widget.a$b> r3 = r3.f2445a
            r3.a(r11)
            goto L_0x0009
        L_0x013f:
            if (r6 == 0) goto L_0x0170
            if (r4 == 0) goto L_0x0159
            int r5 = r11.f2452b
            int r6 = r4.f2452b
            if (r5 <= r6) goto L_0x014e
            int r6 = r4.f2454d
            int r5 = r5 - r6
            r11.f2452b = r5
        L_0x014e:
            int r5 = r11.f2454d
            int r6 = r4.f2452b
            if (r5 <= r6) goto L_0x0159
            int r6 = r4.f2454d
            int r5 = r5 - r6
            r11.f2454d = r5
        L_0x0159:
            int r5 = r11.f2452b
            int r6 = r12.f2452b
            if (r5 <= r6) goto L_0x0164
            int r6 = r12.f2454d
            int r5 = r5 - r6
            r11.f2452b = r5
        L_0x0164:
            int r5 = r11.f2454d
            int r6 = r12.f2452b
            if (r5 <= r6) goto L_0x019e
            int r6 = r12.f2454d
            int r5 = r5 - r6
            r11.f2454d = r5
            goto L_0x019e
        L_0x0170:
            if (r4 == 0) goto L_0x0188
            int r5 = r11.f2452b
            int r6 = r4.f2452b
            if (r5 < r6) goto L_0x017d
            int r6 = r4.f2454d
            int r5 = r5 - r6
            r11.f2452b = r5
        L_0x017d:
            int r5 = r11.f2454d
            int r6 = r4.f2452b
            if (r5 < r6) goto L_0x0188
            int r6 = r4.f2454d
            int r5 = r5 - r6
            r11.f2454d = r5
        L_0x0188:
            int r5 = r11.f2452b
            int r6 = r12.f2452b
            if (r5 < r6) goto L_0x0193
            int r6 = r12.f2454d
            int r5 = r5 - r6
            r11.f2452b = r5
        L_0x0193:
            int r5 = r11.f2454d
            int r6 = r12.f2452b
            if (r5 < r6) goto L_0x019e
            int r6 = r12.f2454d
            int r5 = r5 - r6
            r11.f2454d = r5
        L_0x019e:
            r2.set(r3, r12)
            int r5 = r11.f2452b
            int r6 = r11.f2454d
            if (r5 == r6) goto L_0x01ab
            r2.set(r7, r11)
            goto L_0x01ae
        L_0x01ab:
            r2.remove(r7)
        L_0x01ae:
            if (r4 == 0) goto L_0x0009
            r2.add(r3, r4)
            goto L_0x0009
        L_0x01b5:
            int r4 = r11.f2454d
            int r6 = r12.f2452b
            if (r4 >= r6) goto L_0x01bd
            r5 = r8
            goto L_0x01be
        L_0x01bd:
            r5 = 0
        L_0x01be:
            int r8 = r11.f2452b
            if (r8 >= r6) goto L_0x01c4
            int r5 = r5 + 1
        L_0x01c4:
            if (r6 > r8) goto L_0x01cb
            int r6 = r12.f2454d
            int r8 = r8 + r6
            r11.f2452b = r8
        L_0x01cb:
            int r6 = r12.f2452b
            if (r6 > r4) goto L_0x01d4
            int r8 = r12.f2454d
            int r4 = r4 + r8
            r11.f2454d = r4
        L_0x01d4:
            int r6 = r6 + r5
            r12.f2452b = r6
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0009
        L_0x01df:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2446b
            int r1 = r1.size()
            r2 = 0
        L_0x01e6:
            if (r2 >= r1) goto L_0x02bb
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f2446b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.a.b) r3
            int r11 = r3.f2451a
            if (r11 == r4) goto L_0x02b4
            if (r11 == r9) goto L_0x025a
            if (r11 == r6) goto L_0x0201
            if (r11 == r7) goto L_0x01fc
            goto L_0x02b7
        L_0x01fc:
            r0.i(r3)
            goto L_0x02b7
        L_0x0201:
            int r11 = r3.f2452b
            int r12 = r3.f2454d
            int r12 = r12 + r11
            r15 = r8
            r13 = r11
            r14 = 0
        L_0x0209:
            if (r11 >= r12) goto L_0x023d
            androidx.recyclerview.widget.a$a r5 = r0.f2448d
            androidx.recyclerview.widget.w r5 = (androidx.recyclerview.widget.w) r5
            androidx.recyclerview.widget.RecyclerView$b0 r5 = r5.b(r11)
            if (r5 != 0) goto L_0x022b
            boolean r5 = r0.a(r11)
            if (r5 == 0) goto L_0x021c
            goto L_0x022b
        L_0x021c:
            if (r15 != r4) goto L_0x0229
            java.lang.Object r5 = r3.f2453c
            androidx.recyclerview.widget.a$b r5 = r0.h(r6, r13, r14, r5)
            r0.i(r5)
            r13 = r11
            r14 = 0
        L_0x0229:
            r15 = 0
            goto L_0x0239
        L_0x022b:
            if (r15 != 0) goto L_0x0238
            java.lang.Object r5 = r3.f2453c
            androidx.recyclerview.widget.a$b r5 = r0.h(r6, r13, r14, r5)
            r0.d(r5)
            r13 = r11
            r14 = 0
        L_0x0238:
            r15 = r4
        L_0x0239:
            int r14 = r14 + r4
            int r11 = r11 + 1
            goto L_0x0209
        L_0x023d:
            int r5 = r3.f2454d
            if (r14 == r5) goto L_0x024e
            java.lang.Object r5 = r3.f2453c
            r3.f2453c = r10
            m0.c<androidx.recyclerview.widget.a$b> r11 = r0.f2445a
            r11.a(r3)
            androidx.recyclerview.widget.a$b r3 = r0.h(r6, r13, r14, r5)
        L_0x024e:
            if (r15 != 0) goto L_0x0255
            r0.d(r3)
            goto L_0x02b7
        L_0x0255:
            r0.i(r3)
            goto L_0x02b7
        L_0x025a:
            int r5 = r3.f2452b
            int r11 = r3.f2454d
            int r11 = r11 + r5
            r12 = r5
            r14 = r8
            r13 = 0
        L_0x0262:
            if (r12 >= r11) goto L_0x029b
            androidx.recyclerview.widget.a$a r15 = r0.f2448d
            androidx.recyclerview.widget.w r15 = (androidx.recyclerview.widget.w) r15
            androidx.recyclerview.widget.RecyclerView$b0 r15 = r15.b(r12)
            if (r15 != 0) goto L_0x0283
            boolean r15 = r0.a(r12)
            if (r15 == 0) goto L_0x0275
            goto L_0x0283
        L_0x0275:
            if (r14 != r4) goto L_0x0280
            androidx.recyclerview.widget.a$b r14 = r0.h(r9, r5, r13, r10)
            r0.i(r14)
            r14 = r4
            goto L_0x0281
        L_0x0280:
            r14 = 0
        L_0x0281:
            r15 = 0
            goto L_0x0290
        L_0x0283:
            if (r14 != 0) goto L_0x028e
            androidx.recyclerview.widget.a$b r14 = r0.h(r9, r5, r13, r10)
            r0.d(r14)
            r14 = r4
            goto L_0x028f
        L_0x028e:
            r14 = 0
        L_0x028f:
            r15 = r4
        L_0x0290:
            if (r14 == 0) goto L_0x0296
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = r4
            goto L_0x0298
        L_0x0296:
            int r13 = r13 + 1
        L_0x0298:
            int r12 = r12 + r4
            r14 = r15
            goto L_0x0262
        L_0x029b:
            int r11 = r3.f2454d
            if (r13 == r11) goto L_0x02aa
            r3.f2453c = r10
            m0.c<androidx.recyclerview.widget.a$b> r11 = r0.f2445a
            r11.a(r3)
            androidx.recyclerview.widget.a$b r3 = r0.h(r9, r5, r13, r10)
        L_0x02aa:
            if (r14 != 0) goto L_0x02b0
            r0.d(r3)
            goto L_0x02b7
        L_0x02b0:
            r0.i(r3)
            goto L_0x02b7
        L_0x02b4:
            r0.i(r3)
        L_0x02b7:
            int r2 = r2 + 1
            goto L_0x01e6
        L_0x02bb:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2446b
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [m0.c<androidx.recyclerview.widget.a$b>, m0.d] */
    public final void k(b bVar) {
        bVar.f2453c = null;
        this.f2445a.a(bVar);
    }

    public final void l(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            k(list.get(i));
        }
        list.clear();
    }

    public final int m(int i, int i10) {
        int i11;
        int i12;
        for (int size = this.f2447c.size() - 1; size >= 0; size--) {
            b bVar = this.f2447c.get(size);
            int i13 = bVar.f2451a;
            if (i13 == 8) {
                int i14 = bVar.f2452b;
                int i15 = bVar.f2454d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i < i12 || i > i11) {
                    if (i < i14) {
                        if (i10 == 1) {
                            bVar.f2452b = i14 + 1;
                            bVar.f2454d = i15 + 1;
                        } else if (i10 == 2) {
                            bVar.f2452b = i14 - 1;
                            bVar.f2454d = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        bVar.f2454d = i15 + 1;
                    } else if (i10 == 2) {
                        bVar.f2454d = i15 - 1;
                    }
                    i++;
                } else {
                    if (i10 == 1) {
                        bVar.f2452b = i14 + 1;
                    } else if (i10 == 2) {
                        bVar.f2452b = i14 - 1;
                    }
                    i--;
                }
            } else {
                int i16 = bVar.f2452b;
                if (i16 <= i) {
                    if (i13 == 1) {
                        i -= bVar.f2454d;
                    } else if (i13 == 2) {
                        i += bVar.f2454d;
                    }
                } else if (i10 == 1) {
                    bVar.f2452b = i16 + 1;
                } else if (i10 == 2) {
                    bVar.f2452b = i16 - 1;
                }
            }
        }
        for (int size2 = this.f2447c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2447c.get(size2);
            if (bVar2.f2451a == 8) {
                int i17 = bVar2.f2454d;
                if (i17 == bVar2.f2452b || i17 < 0) {
                    this.f2447c.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f2454d <= 0) {
                this.f2447c.remove(size2);
                k(bVar2);
            }
        }
        return i;
    }
}
