package y7;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import x7.e;

public final class h implements a {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f13517d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final File f13518a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13519b = LZ4Constants.MAX_DISTANCE;

    /* renamed from: c  reason: collision with root package name */
    public f f13520c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f13521a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13522b;

        public a(byte[] bArr, int i) {
            this.f13521a = bArr;
            this.f13522b = i;
        }
    }

    public h(File file) {
        this.f13518a = file;
    }

    public final void a() {
        e.a(this.f13520c, "There was a problem closing the Crashlytics log file.");
        this.f13520c = null;
    }

    public final String b() {
        byte[] d10 = d();
        if (d10 != null) {
            return new String(d10, f13517d);
        }
        return null;
    }

    public final void c(long j10, String str) {
        e();
        if (this.f13520c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f13519b / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.f13520c.a(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f13517d));
                while (!this.f13520c.s() && this.f13520c.O() > this.f13519b) {
                    this.f13520c.y();
                }
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] d() {
        /*
            r7 = this;
            java.io.File r0 = r7.f13518a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000b
            goto L_0x0012
        L_0x000b:
            r7.e()
            y7.f r0 = r7.f13520c
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            r4 = r1
            goto L_0x0039
        L_0x0014:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r0 = r0.O()
            byte[] r0 = new byte[r0]
            y7.f r4 = r7.f13520c     // Catch:{ IOException -> 0x002a }
            y7.g r5 = new y7.g     // Catch:{ IOException -> 0x002a }
            r5.<init>(r0, r3)     // Catch:{ IOException -> 0x002a }
            r4.f(r5)     // Catch:{ IOException -> 0x002a }
            goto L_0x0032
        L_0x002a:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L_0x0032:
            y7.h$a r4 = new y7.h$a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L_0x0039:
            if (r4 != 0) goto L_0x003c
            return r1
        L_0x003c:
            int r0 = r4.f13522b
            byte[] r1 = new byte[r0]
            byte[] r3 = r4.f13521a
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.h.d():byte[]");
    }

    public final void e() {
        if (this.f13520c == null) {
            try {
                this.f13520c = new f(this.f13518a);
            } catch (IOException e10) {
                StringBuilder d10 = a.a.d("Could not open log file: ");
                d10.append(this.f13518a);
                Log.e("FirebaseCrashlytics", d10.toString(), e10);
            }
        }
    }
}
