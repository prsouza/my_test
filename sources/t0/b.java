package t0;

import android.graphics.Rect;
import java.util.Comparator;
import t0.a;

public final class b {

    public interface a<T> {
    }

    /* renamed from: t0.b$b  reason: collision with other inner class name */
    public static class C0220b<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f11212a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f11213b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final boolean f11214c;

        /* renamed from: s  reason: collision with root package name */
        public final a<T> f11215s;

        public C0220b(boolean z, a<T> aVar) {
            this.f11214c = z;
            this.f11215s = aVar;
        }

        public final int compare(T t10, T t11) {
            Rect rect = this.f11212a;
            Rect rect2 = this.f11213b;
            ((a.C0219a) this.f11215s).a(t10, rect);
            ((a.C0219a) this.f11215s).a(t11, rect2);
            int i = rect.top;
            int i10 = rect2.top;
            if (i < i10) {
                return -1;
            }
            if (i > i10) {
                return 1;
            }
            int i11 = rect.left;
            int i12 = rect2.left;
            if (i11 < i12) {
                if (this.f11214c) {
                    return 1;
                }
                return -1;
            } else if (i11 <= i12) {
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 < i14) {
                    return -1;
                }
                if (i13 > i14) {
                    return 1;
                }
                int i15 = rect.right;
                int i16 = rect2.right;
                if (i15 < i16) {
                    if (this.f11214c) {
                        return 1;
                    }
                    return -1;
                } else if (i15 <= i16) {
                    return 0;
                } else {
                    if (this.f11214c) {
                        return -1;
                    }
                    return 1;
                }
            } else if (this.f11214c) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = b(r9, r10, r11)
            boolean r1 = b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x007d
            if (r0 != 0) goto L_0x000f
            goto L_0x007d
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0045
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0045
        L_0x0043:
            r7 = r6
            goto L_0x0046
        L_0x0045:
            r7 = r2
        L_0x0046:
            if (r7 != 0) goto L_0x0049
            return r6
        L_0x0049:
            if (r9 == r5) goto L_0x007c
            if (r9 != r4) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            int r11 = d(r9, r10, r11)
            if (r9 == r5) goto L_0x006f
            if (r9 == r3) goto L_0x006a
            if (r9 == r4) goto L_0x0065
            if (r9 != r1) goto L_0x005f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L_0x0073
        L_0x005f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0065:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0073
        L_0x006a:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0073
        L_0x006f:
            int r9 = r10.left
            int r10 = r12.left
        L_0x0073:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x007b
            r2 = r6
        L_0x007b:
            return r2
        L_0x007c:
            return r6
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.b.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static boolean c(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            if ((i10 > i11 || rect.left >= i11) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if ((i12 > i13 || rect.top >= i13) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            if ((i14 < i15 || rect.right <= i15) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i == 130) {
            int i16 = rect.top;
            int i17 = rect2.top;
            return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int d(int i, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i == 17) {
            i11 = rect.left;
            i10 = rect2.right;
        } else if (i == 33) {
            i11 = rect.top;
            i10 = rect2.bottom;
        } else if (i == 66) {
            i11 = rect2.left;
            i10 = rect.right;
        } else if (i == 130) {
            i11 = rect2.top;
            i10 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i11 - i10);
    }

    public static int e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
