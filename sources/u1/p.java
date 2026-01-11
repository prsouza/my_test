package u1;

import android.util.Log;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static p f11651a;

    public static class a extends p {

        /* renamed from: b  reason: collision with root package name */
        public int f11652b;

        public a(int i) {
            this.f11652b = i;
        }

        public final void a(String str, String str2, Throwable... thArr) {
            if (this.f11652b > 3) {
                return;
            }
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }

        public final void b(String str, String str2, Throwable... thArr) {
            if (this.f11652b > 6) {
                return;
            }
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }

        public final void d(String str, String str2, Throwable... thArr) {
            if (this.f11652b > 4) {
                return;
            }
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }

        public final void f(String str, String str2, Throwable... thArr) {
            if (this.f11652b > 5) {
                return;
            }
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    public static synchronized p c() {
        p pVar;
        synchronized (p.class) {
            if (f11651a == null) {
                f11651a = new a(3);
            }
            pVar = f11651a;
        }
        return pVar;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);
}
