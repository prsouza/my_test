package m0;

import java.io.PrintWriter;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f8367a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static char[] f8368b = new char[24];

    public static void a(long j10, PrintWriter printWriter) {
        synchronized (f8367a) {
            printWriter.print(new String(f8368b, 0, b(j10)));
        }
    }

    public static int b(long j10) {
        char c10;
        int i;
        int i10;
        int i11;
        int i12;
        if (f8368b.length < 0) {
            f8368b = new char[0];
        }
        char[] cArr = f8368b;
        int i13 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i13 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (i13 > 0) {
            c10 = '+';
        } else {
            c10 = '-';
            j10 = -j10;
        }
        int i14 = (int) (j10 % 1000);
        int floor = (int) Math.floor((double) (j10 / 1000));
        if (floor > 86400) {
            i = floor / 86400;
            floor -= 86400 * i;
        } else {
            i = 0;
        }
        if (floor > 3600) {
            i10 = floor / 3600;
            floor -= i10 * 3600;
        } else {
            i10 = 0;
        }
        if (floor > 60) {
            int i15 = floor / 60;
            i12 = floor - (i15 * 60);
            i11 = i15;
        } else {
            i12 = floor;
            i11 = 0;
        }
        cArr[0] = c10;
        int c11 = c(cArr, i, 'd', 1, false, 0);
        int c12 = c(cArr, i10, 'h', c11, c11 != 1, 0);
        int c13 = c(cArr, i11, 'm', c12, c12 != 1, 0);
        int c14 = c(cArr, i14, 'm', c(cArr, i12, 's', c13, c13 != 1, 0), true, 0);
        cArr[c14] = 's';
        return c14 + 1;
    }

    public static int c(char[] cArr, int i, char c10, int i10, boolean z, int i11) {
        int i12;
        if (!z && i <= 0) {
            return i10;
        }
        if ((!z || i11 < 3) && i <= 99) {
            i12 = i10;
        } else {
            int i13 = i / 100;
            cArr[i10] = (char) (i13 + 48);
            i12 = i10 + 1;
            i -= i13 * 100;
        }
        if ((z && i11 >= 2) || i > 9 || i10 != i12) {
            int i14 = i / 10;
            cArr[i12] = (char) (i14 + 48);
            i12++;
            i -= i14 * 10;
        }
        cArr[i12] = (char) (i + 48);
        int i15 = i12 + 1;
        cArr[i15] = c10;
        return i15 + 1;
    }
}
