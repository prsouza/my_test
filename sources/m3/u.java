package m3;

import android.content.res.Resources;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import g3.d;
import g3.h;
import i3.w;
import j3.b;
import java.util.IllegalFormatException;
import java.util.Locale;
import u3.c;

public final class u implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8457a;

    public /* synthetic */ u(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("UID: [");
        sb2.append(myUid);
        sb2.append("]  PID: [");
        sb2.append(myPid);
        sb2.append("] ");
        String sb3 = sb2.toString();
        this.f8457a = str.length() != 0 ? sb3.concat(str) : new String(sb3);
    }

    public static String i(String str, String str2, Object... objArr) {
        String str3;
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str3 = "Unable to format ".concat(valueOf);
                } else {
                    str3 = new String("Unable to format ");
                }
                Log.e("PlayCore", str3, e10);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb2.append(str2);
                sb2.append(" [");
                sb2.append(join);
                sb2.append("]");
                str2 = sb2.toString();
            }
        }
        return androidx.appcompat.widget.d.b(new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    public final int a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", i((String) this.f8457a, str, objArr));
        }
        return 0;
    }

    public final w b(w wVar, h hVar) {
        return p3.u.e((Resources) this.f8457a, wVar);
    }

    public final int c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", i((String) this.f8457a, str, objArr));
        }
        return 0;
    }

    public final int d(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", i((String) this.f8457a, str, objArr), th2);
        }
        return 0;
    }

    public final int e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", i((String) this.f8457a, str, objArr));
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[SYNTHETIC, Splitter:B:22:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0050 A[SYNTHETIC, Splitter:B:29:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(java.lang.Object r5, java.io.File r6, g3.h r7) {
        /*
            r4 = this;
            java.io.InputStream r5 = (java.io.InputStream) r5
            java.lang.String r7 = "StreamEncoder"
            java.lang.Object r0 = r4.f8457a
            j3.b r0 = (j3.b) r0
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r0 = r0.d(r2, r1)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0033 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0033 }
        L_0x0019:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            r2 = -1
            if (r6 == r2) goto L_0x0024
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            goto L_0x0019
        L_0x0024:
            r3.close()     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            r1 = 1
            r3.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0045
        L_0x002c:
            r5 = move-exception
            goto L_0x004e
        L_0x002e:
            r5 = move-exception
            r2 = r3
            goto L_0x0034
        L_0x0031:
            r5 = move-exception
            goto L_0x004d
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x0031 }
            if (r6 == 0) goto L_0x0040
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch:{ all -> 0x0031 }
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r2.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            java.lang.Object r5 = r4.f8457a
            j3.b r5 = (j3.b) r5
            r5.c(r0)
            return r1
        L_0x004d:
            r3 = r2
        L_0x004e:
            if (r3 == 0) goto L_0x0053
            r3.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            java.lang.Object r6 = r4.f8457a
            j3.b r6 = (j3.b) r6
            r6.c(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.u.f(java.lang.Object, java.io.File, g3.h):boolean");
    }

    public final int g(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", i((String) this.f8457a, str, objArr));
        }
        return 0;
    }

    public /* synthetic */ u(b bVar) {
        this.f8457a = bVar;
    }

    public u(Resources resources) {
        this.f8457a = resources;
    }
}
