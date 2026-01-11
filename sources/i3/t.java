package i3;

import android.os.Bundle;
import android.util.Log;
import c3.k;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import l6.b1;
import l6.d1;
import l6.f1;
import l6.g1;

public final class t implements f1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6149a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6150b;

    public /* synthetic */ t(Object obj, Object obj2) {
        this.f6149a = obj;
        this.f6150b = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[SYNTHETIC, Splitter:B:15:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[SYNTHETIC, Splitter:B:19:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i3.t a(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.nio.channels.FileLock r0 = r5.lock()     // Catch:{ IOException -> 0x002b, Error -> 0x0029, OverlappingFileLockException -> 0x0027 }
            i3.t r2 = new i3.t     // Catch:{ IOException -> 0x0025, Error -> 0x0023, OverlappingFileLockException -> 0x0021 }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x0025, Error -> 0x0023, OverlappingFileLockException -> 0x0021 }
            return r2
        L_0x0021:
            r2 = move-exception
            goto L_0x0037
        L_0x0023:
            r2 = move-exception
            goto L_0x0037
        L_0x0025:
            r2 = move-exception
            goto L_0x0037
        L_0x0027:
            r0 = move-exception
            goto L_0x002c
        L_0x0029:
            r0 = move-exception
            goto L_0x002c
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            r2 = r0
            r0 = r1
            goto L_0x0037
        L_0x002f:
            r5 = move-exception
            goto L_0x0034
        L_0x0031:
            r5 = move-exception
            goto L_0x0034
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            r2 = r5
            r5 = r1
            r0 = r5
        L_0x0037:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L_0x0043
            r0.release()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            if (r5 == 0) goto L_0x0048
            r5.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.t.a(android.content.Context):i3.t");
    }

    public final Map b(boolean z) {
        return (Map) (z ? this.f6150b : this.f6149a);
    }

    public final void c() {
        try {
            ((FileLock) this.f6150b).release();
            ((FileChannel) this.f6149a).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public final Object zza() {
        g1 g1Var = (g1) this.f6149a;
        Bundle bundle = (Bundle) this.f6150b;
        Objects.requireNonNull(g1Var);
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        HashMap hashMap = g1Var.f7868e;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        d1 d1Var = (d1) g1Var.f7868e.get(valueOf);
        if (d1Var.f7816c.f7804d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!k.g1(d1Var.f7816c.f7804d, bundle.getInt(b1.x("status", g1.d(bundle)))));
    }

    public /* synthetic */ t() {
        this.f6149a = new HashMap();
        this.f6150b = new HashMap();
    }
}
