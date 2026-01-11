package ah;

import a7.q;
import ae.c;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import c0.f;
import c3.k;
import ca.d;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.stats.CodePackage;
import d7.c;
import e6.e;
import e7.a;
import fc.b;
import g9.h;
import ge.g0;
import java.io.DataOutputStream;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;
import javax.crypto.KeyGenerator;
import jp.co.soramitsu.fearless_utils.encrypt.Sr25519;
import k1.a;
import l6.b1;
import l6.o2;
import le.r;
import n9.a;
import nd.m;
import nd.o;
import o6.d0;
import o6.f0;
import o6.l;
import pe.j;
import re.e0;
import re.f1;
import re.m0;
import re.p0;
import re.r0;
import re.w;
import re.x0;
import re.y;
import re.y0;
import t7.g;
import xe.i;
import xe.j;
import xe.p;

public final class v implements d, h, b, t6.b, l, p8.h, vb.b {
    public static final r A = new r("ENQUEUE_FAILED");
    public static final r B = new r("ON_CLOSE_HANDLER_INVOKED");
    public static final pd.d[] C = new pd.d[0];
    public static final /* synthetic */ v D = new v();
    public static final /* synthetic */ v E = new v();
    public static final r F = new r("NO_DECISION");
    public static final v G = new v();
    public static final /* synthetic */ int H = 0;
    public static final int[] I = {16842755, 16842960, 16842961};
    public static final int[] J = {16842755, 16842961};

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f613a = {-1, -1, -2, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f614b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f615c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f616s = {-1, -1, -1, 0, 0, 0, 1, -1};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f617t = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    /* renamed from: u  reason: collision with root package name */
    public static final long[] f618u = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    /* renamed from: v  reason: collision with root package name */
    public static final v f619v = new v();

    /* renamed from: w  reason: collision with root package name */
    public static final r f620w = new r("EMPTY");

    /* renamed from: x  reason: collision with root package name */
    public static final r f621x = new r("OFFER_SUCCESS");

    /* renamed from: y  reason: collision with root package name */
    public static final r f622y = new r("OFFER_FAILED");
    public static final r z = new r("POLL_FAILED");

    public /* synthetic */ v() {
    }

    public /* synthetic */ v(g9.b bVar) {
    }

    public static void A0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.X1(iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j12;
                j11 = j12 >> 32;
            }
            long j13 = ((4294967295L & ((long) iArr3[2])) - 1) + j11;
            iArr3[2] = (int) j13;
            if ((j13 >> 32) != 0) {
                android.support.v4.media.b.Y(6, iArr3, 3);
            }
        }
    }

    public static final void B(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static void B0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.Z1(iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j12;
                long j13 = (j12 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j13;
                j11 = j13 >> 32;
            }
            long j14 = (((long) iArr3[3]) & 4294967295L) + 1 + j11;
            iArr3[3] = (int) j14;
            long j15 = j14 >> 32;
            if (j15 != 0) {
                long j16 = j15 + (((long) iArr3[4]) & 4294967295L);
                iArr3[4] = (int) j16;
                long j17 = (j16 >> 32) + (((long) iArr3[5]) & 4294967295L);
                iArr3[5] = (int) j17;
                j15 = j17 >> 32;
            }
            long j18 = (((long) iArr3[6]) & 4294967295L) + 1 + j15;
            iArr3[6] = (int) j18;
            iArr3[7] = (int) (((4294967295L & ((long) iArr3[7])) - 1) + (j18 >> 32));
        }
    }

    public static int C(Context context, String str) {
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (!(Process.myUid() == myUid && Objects.equals(context.getPackageName(), packageName))) {
                i = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c10 = f.c(context);
                i = f.a(c10, permissionToOp, Binder.getCallingUid(), packageName);
                if (i == 0) {
                    i = f.a(c10, permissionToOp, myUid, f.b(context));
                }
            } else {
                i = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            }
            if (i != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static String C0(File file) {
        if (file.getName().endsWith(".apk")) {
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", BuildConfig.FLAVOR);
            if (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) {
                return BuildConfig.FLAVOR;
            }
            if (replaceFirst.startsWith("base-")) {
                return replaceFirst.replace("base-", "config.");
            }
            return replaceFirst.replace("-", ".config.").replace(".config.master", BuildConfig.FLAVOR).replace(".config.main", BuildConfig.FLAVOR);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    public static int E(int i) {
        int i10 = -1;
        while (i != 0) {
            i10++;
            i >>>= 1;
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        ad.c.z(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void F(java.io.Reader r4, xd.l r5) {
        /*
            java.io.BufferedReader r4 = (java.io.BufferedReader) r4
            r0 = 0
            vd.a r1 = new vd.a     // Catch:{ all -> 0x0028 }
            r1.<init>(r4)     // Catch:{ all -> 0x0028 }
            boolean r2 = r1 instanceof ee.a     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            ee.a r2 = new ee.a     // Catch:{ all -> 0x0028 }
            r2.<init>(r1)     // Catch:{ all -> 0x0028 }
            r1 = r2
        L_0x0013:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0028 }
        L_0x0017:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0028 }
            r3 = r5
            ye.a$a r3 = (ye.a.C0262a) r3     // Catch:{ all -> 0x0028 }
            r3.k(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x0017
        L_0x0028:
            r5 = move-exception
            goto L_0x002e
        L_0x002a:
            ad.c.z(r4, r0)
            return
        L_0x002e:
            throw r5     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            ad.c.z(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.v.F(java.io.Reader, xd.l):void");
    }

    public static final String G(long j10) {
        String str;
        if (j10 <= ((long) -999500000)) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= ((long) -999500)) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < ((long) 999500)) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < ((long) 999500000)) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        e.C(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static Object I(Object obj, Class cls) {
        if (obj instanceof a) {
            return cls.cast(obj);
        }
        if (obj instanceof n9.b) {
            return I(((n9.b) obj).a(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), a.class, n9.b.class}));
    }

    public static final String J(Context context, qa.e eVar) {
        e.D(context, "context");
        e.D(eVar, "prefKey");
        try {
            String string = ((k1.a) Q(context)).getString(String.valueOf(eVar.getKey()), (String) null);
            if (string == null) {
                return eVar.m16default().toString();
            }
            byte[] decode = Base64.decode(string, 0);
            e.C(decode, "decode(input, Base64.DEFAULT)");
            return new String(decode, fe.a.f5086b);
        } catch (Exception e10) {
            g.a().f11438a.d("prefKey", Integer.toString(eVar.getKey()));
            g.a().b(e10);
            return eVar.m16default().toString();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.util.BiConsumer<java.lang.String, c9.f>>] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String K(java.lang.String r9) {
        /*
            b9.c r0 = b9.c.a()
            c9.j r0 = r0.f2918h
            c9.e r1 = r0.f3304c
            c9.f r1 = c9.j.a(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0010
            goto L_0x0017
        L_0x0010:
            org.json.JSONObject r1 = r1.f3288b     // Catch:{ JSONException -> 0x0017 }
            java.lang.String r1 = r1.getString(r9)     // Catch:{ JSONException -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            r3 = 0
            if (r1 == 0) goto L_0x0049
            c9.e r2 = r0.f3304c
            c9.f r2 = c9.j.a(r2)
            if (r2 != 0) goto L_0x0024
            goto L_0x0073
        L_0x0024:
            java.util.Set<com.google.android.gms.common.util.BiConsumer<java.lang.String, c9.f>> r4 = r0.f3302a
            monitor-enter(r4)
            java.util.Set<com.google.android.gms.common.util.BiConsumer<java.lang.String, c9.f>> r5 = r0.f3302a     // Catch:{ all -> 0x0046 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0046 }
        L_0x002d:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0046 }
            if (r6 == 0) goto L_0x0044
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0046 }
            com.google.android.gms.common.util.BiConsumer r6 = (com.google.android.gms.common.util.BiConsumer) r6     // Catch:{ all -> 0x0046 }
            java.util.concurrent.Executor r7 = r0.f3303b     // Catch:{ all -> 0x0046 }
            c9.i r8 = new c9.i     // Catch:{ all -> 0x0046 }
            r8.<init>(r6, r9, r2, r3)     // Catch:{ all -> 0x0046 }
            r7.execute(r8)     // Catch:{ all -> 0x0046 }
            goto L_0x002d
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            goto L_0x0073
        L_0x0046:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r9
        L_0x0049:
            c9.e r0 = r0.f3305d
            c9.f r0 = c9.j.a(r0)
            if (r0 != 0) goto L_0x0052
            goto L_0x0058
        L_0x0052:
            org.json.JSONObject r0 = r0.f3288b     // Catch:{ JSONException -> 0x0058 }
            java.lang.String r2 = r0.getString(r9)     // Catch:{ JSONException -> 0x0058 }
        L_0x0058:
            if (r2 == 0) goto L_0x005c
            r1 = r2
            goto L_0x0073
        L_0x005c:
            java.lang.String r0 = "String"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r0
            r0 = 1
            r1[r0] = r9
            java.lang.String r9 = "No value of type '%s' exists for parameter key '%s'."
            java.lang.String r9 = java.lang.String.format(r9, r1)
            java.lang.String r0 = "FirebaseRemoteConfig"
            android.util.Log.w(r0, r9)
            java.lang.String r1 = ""
        L_0x0073:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.v.K(java.lang.String):java.lang.String");
    }

    public static void L(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        jArr2[0] = j10 & 576460752303423487L;
        jArr2[1] = ((j10 >>> 59) ^ (j11 << 5)) & 576460752303423487L;
        jArr2[2] = ((j11 >>> 54) ^ (j12 << 10)) & 576460752303423487L;
        jArr2[3] = ((j12 >>> 49) ^ (j13 << 15)) & 576460752303423487L;
        jArr2[4] = ((j13 >>> 44) ^ (j14 << 20)) & 576460752303423487L;
        jArr2[5] = ((j14 >>> 39) ^ (j15 << 25)) & 576460752303423487L;
        jArr2[6] = (j15 >>> 34) ^ (j16 << 30);
    }

    public static void M(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        L(jArr, jArr4);
        L(jArr2, jArr5);
        for (int i = 0; i < 7; i++) {
            long j10 = jArr5[i];
            long[] jArr6 = new long[8];
            jArr6[1] = j10;
            jArr6[2] = jArr6[1] << 1;
            jArr6[3] = jArr6[2] ^ j10;
            jArr6[4] = jArr6[2] << 1;
            jArr6[5] = jArr6[4] ^ j10;
            jArr6[6] = jArr6[3] << 1;
            jArr6[7] = jArr6[6] ^ j10;
            for (int i10 = 0; i10 < 7; i10++) {
                long j11 = jArr4[i10];
                int i11 = (int) j11;
                long j12 = jArr6[i11 & 7] ^ (jArr6[(i11 >>> 3) & 7] << 3);
                int i12 = 54;
                long j13 = 0;
                do {
                    int i13 = (int) (j11 >>> i12);
                    long j14 = jArr6[i13 & 7] ^ (jArr6[(i13 >>> 3) & 7] << 3);
                    j12 ^= j14 << i12;
                    j13 ^= j14 >>> (-i12);
                    i12 -= 6;
                } while (i12 > 0);
                int i14 = i + i10;
                jArr3[i14] = jArr3[i14] ^ (j12 & 576460752303423487L);
                int i15 = i14 + 1;
                jArr3[i15] = jArr3[i15] ^ ((j13 << 5) ^ (j12 >>> 59));
            }
        }
        long j15 = jArr3[0];
        long j16 = jArr3[1];
        long j17 = jArr3[2];
        long j18 = jArr3[3];
        long j19 = jArr3[4];
        long j20 = jArr3[5];
        long j21 = jArr3[6];
        long j22 = jArr3[7];
        long j23 = jArr3[8];
        long j24 = jArr3[9];
        long j25 = jArr3[10];
        long j26 = jArr3[11];
        long j27 = jArr3[12];
        long j28 = jArr3[13];
        jArr3[0] = j15 ^ (j16 << 59);
        jArr3[1] = (j16 >>> 5) ^ (j17 << 54);
        jArr3[2] = (j17 >>> 10) ^ (j18 << 49);
        jArr3[3] = (j18 >>> 15) ^ (j19 << 44);
        jArr3[4] = (j19 >>> 20) ^ (j20 << 39);
        jArr3[5] = (j20 >>> 25) ^ (j21 << 34);
        jArr3[6] = (j21 >>> 30) ^ (j22 << 29);
        jArr3[7] = (j22 >>> 35) ^ (j23 << 24);
        jArr3[8] = (j23 >>> 40) ^ (j24 << 19);
        jArr3[9] = (j24 >>> 45) ^ (j25 << 14);
        jArr3[10] = (j25 >>> 50) ^ (j26 << 9);
        jArr3[11] = ((j26 >>> 55) ^ (j27 << 4)) ^ (j28 << 63);
        jArr3[12] = (j27 >>> 60) ^ (j28 >>> 1);
        jArr3[13] = 0;
    }

    public static void N(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 56; i >= 0; i -= 8) {
            for (int i10 = 1; i10 < 9; i10 += 2) {
                int i11 = (int) (jArr[i10] >>> i);
                r(jArr2, (i11 & 15) * 9, jArr2, (((i11 >>> 4) & 15) + 16) * 9, jArr3, i10 - 1);
            }
            android.support.v4.media.b.I1(16, jArr3);
        }
        for (int i12 = 56; i12 >= 0; i12 -= 8) {
            for (int i13 = 0; i13 < 9; i13 += 2) {
                int i14 = (int) (jArr[i13] >>> i12);
                int i15 = (((i14 >>> 4) & 15) + 16) * 9;
                r(jArr2, (i14 & 15) * 9, jArr2, i15, jArr3, i13);
            }
            if (i12 > 0) {
                android.support.v4.media.b.I1(18, jArr3);
            }
        }
    }

    public static void O(long[] jArr, long[] jArr2) {
        e.L(jArr[0], jArr2, 0);
        e.L(jArr[1], jArr2, 2);
        e.L(jArr[2], jArr2, 4);
        e.L(jArr[3], jArr2, 6);
        e.L(jArr[4], jArr2, 8);
        e.L(jArr[5], jArr2, 10);
        e.L(jArr[6], jArr2, 12);
        e.L(jArr[7], jArr2, 14);
        e.L(jArr[8], jArr2, 16);
    }

    public static void P(long[] jArr, long[] jArr2) {
        e.L(jArr[0], jArr2, 0);
        e.L(jArr[1], jArr2, 2);
        e.L(jArr[2], jArr2, 4);
        e.L(jArr[3], jArr2, 6);
        e.L(jArr[4], jArr2, 8);
        e.L(jArr[5], jArr2, 10);
        jArr2[12] = e.K((int) jArr[6]);
    }

    public static final SharedPreferences Q(Context context) {
        a7.h b10;
        a7.h b11;
        KeyGenParameterSpec keyGenParameterSpec = k1.b.f7400a;
        if (keyGenParameterSpec.getKeySize() != 256) {
            StringBuilder d10 = a.a.d("invalid key size, want 256 bits got ");
            d10.append(keyGenParameterSpec.getKeySize());
            d10.append(" bits");
            throw new IllegalArgumentException(d10.toString());
        } else if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{CodePackage.GCM})) {
            StringBuilder d11 = a.a.d("invalid block mode, want GCM got ");
            d11.append(Arrays.toString(keyGenParameterSpec.getBlockModes()));
            throw new IllegalArgumentException(d11.toString());
        } else if (keyGenParameterSpec.getPurposes() != 3) {
            StringBuilder d12 = a.a.d("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            d12.append(keyGenParameterSpec.getPurposes());
            throw new IllegalArgumentException(d12.toString());
        } else if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            StringBuilder d13 = a.a.d("invalid padding mode, want NoPadding got ");
            d13.append(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
            throw new IllegalArgumentException(d13.toString());
        } else if (!keyGenParameterSpec.isUserAuthenticationRequired() || keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() >= 1) {
            String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            if (!instance.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    instance2.init(keyGenParameterSpec);
                    instance2.generateKey();
                } catch (ProviderException e10) {
                    throw new GeneralSecurityException(e10.getMessage(), e10);
                }
            }
            String keystoreAlias2 = keyGenParameterSpec.getKeystoreAlias();
            e.C(keystoreAlias2, "getOrCreate(MasterKeys.AES256_GCM_SPEC)");
            a.d dVar = a.d.AES256_SIV;
            a.e eVar = a.e.AES256_GCM;
            int i = d7.b.f4351a;
            q.f(new d7.a(), true);
            q.g(new c());
            b7.a.a();
            Context applicationContext = context.getApplicationContext();
            a.C0070a aVar = new a.C0070a();
            aVar.f4745e = dVar.getKeyTemplate();
            aVar.d(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__");
            String str = "android-keystore://" + keystoreAlias2;
            if (str.startsWith("android-keystore://")) {
                aVar.f4743c = str;
                e7.a a10 = aVar.a();
                synchronized (a10) {
                    b10 = a10.f4740b.b();
                }
                a.C0070a aVar2 = new a.C0070a();
                aVar2.f4745e = eVar.getKeyTemplate();
                aVar2.d(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__");
                String str2 = "android-keystore://" + keystoreAlias2;
                if (str2.startsWith("android-keystore://")) {
                    aVar2.f4743c = str2;
                    e7.a a11 = aVar2.a();
                    synchronized (a11) {
                        b11 = a11.f4740b.b();
                    }
                    return new k1.a(applicationContext.getSharedPreferences("APP_PREFS", 0), (a7.a) b11.b(a7.a.class), (a7.c) b10.b(a7.c.class));
                }
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        } else {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
    }

    public static boolean R() {
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int S(int i, int i10, int i11) {
        int n02 = n0(i, i11);
        int n03 = n0(i10, i11);
        int i12 = 0;
        if (n03 != 0) {
            int E2 = 1 << E(i11);
            while (n02 != 0) {
                if (((byte) (n02 & 1)) == 1) {
                    i12 ^= n03;
                }
                n02 >>>= 1;
                n03 <<= 1;
                if (n03 >= E2) {
                    n03 ^= i11;
                }
            }
        }
        return i12;
    }

    public static void T(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        android.support.v4.media.b.n1(iArr, iArr2, iArr4);
        g0(iArr4, iArr3);
    }

    public static void U(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        N(jArr, e0(jArr2), jArr4);
        h0(jArr4, jArr3);
    }

    public static void V(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        android.support.v4.media.b.p1(iArr, iArr2, iArr4);
        j0(iArr4, iArr3);
    }

    public static void W(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        M(jArr, jArr2, jArr4);
        k0(jArr4, jArr3);
    }

    public static void X(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        N(jArr, e0(jArr2), jArr4);
        t(jArr3, jArr4, jArr3);
    }

    public static void Y(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        M(jArr, jArr2, jArr4);
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
    }

    public static void Z(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        N(jArr, jArr2, jArr4);
        h0(jArr4, jArr3);
    }

    public static void a0(int[] iArr, int[] iArr2) {
        if (android.support.v4.media.b.Y0(iArr)) {
            iArr2[0] = 0;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 0;
            iArr2[4] = 0;
            iArr2[5] = 0;
            return;
        }
        android.support.v4.media.b.X1(f613a, iArr, iArr2);
    }

    public static final int b0(ce.c cVar) {
        c.a aVar = ae.c.f342a;
        if (!cVar.isEmpty()) {
            int i = cVar.f3431b;
            if (i < Integer.MAX_VALUE) {
                return aVar.c(cVar.f3430a, i + 1);
            }
            int i10 = cVar.f3430a;
            if (i10 > Integer.MIN_VALUE) {
                return aVar.c(i10 - 1, i) + 1;
            }
            return aVar.b();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + cVar);
    }

    public static final oe.b c0(oe.b bVar, boolean z10) {
        return (!z10 || bVar.a().f()) ? bVar : new p0(bVar);
    }

    public static final Object d0(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static long e(yi.a aVar, byte[] bArr, yi.a aVar2, String str, yi.a aVar3) {
        e.D(aVar, "vm");
        e.D(bArr, "<anonymous parameter 1>");
        e.D(aVar2, str);
        return k.k(aVar3);
    }

    public static long[] e0(long[] jArr) {
        long j10;
        long[] jArr2 = new long[288];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i = 7;
        int i10 = 0;
        while (true) {
            j10 = 0;
            if (i <= 0) {
                break;
            }
            i10 += 18;
            int i11 = i10 >>> 1;
            int i12 = 0;
            while (i12 < 9) {
                long j11 = jArr2[i11 + i12];
                jArr2[i10 + i12] = (j10 >>> 63) | (j11 << 1);
                i12++;
                j10 = j11;
            }
            int i13 = i10 + 8;
            long j12 = jArr2[i13];
            long j13 = j12 >>> 59;
            jArr2[i10] = ((j13 << 10) ^ (((j13 << 2) ^ j13) ^ (j13 << 5))) ^ jArr2[i10];
            jArr2[i13] = j12 & 576460752303423487L;
            int i14 = i10 + 9;
            for (int i15 = 0; i15 < 9; i15++) {
                jArr2[i14 + i15] = jArr2[9 + i15] ^ jArr2[i10 + i15];
            }
            i--;
        }
        int i16 = 0;
        while (i16 < 144) {
            long j14 = jArr2[0 + i16];
            jArr2[144 + i16] = (j10 >>> -4) | (j14 << 4);
            i16++;
            j10 = j14;
        }
        return jArr2;
    }

    public static final void f0(Context context, qa.e eVar, Object obj) {
        String str;
        e.D(context, "context");
        e.D(eVar, "prefKey");
        if (obj == null) {
            try {
                int key = eVar.getKey();
                Log.w("v", "PUT " + key + " : " + obj + " Ignored as value is null.");
            } catch (Exception e10) {
                g.a().f11438a.d("prefKey", Integer.toString(eVar.getKey()));
                if (eVar != qa.e.MNEMONIC) {
                    g a10 = g.a();
                    a10.f11438a.d("prefValue", String.valueOf(obj));
                }
                g.a().b(e10);
            }
        } else {
            String obj2 = obj.toString();
            if (obj2 != null) {
                byte[] bytes = obj2.getBytes(fe.a.f5086b);
                e.C(bytes, "this as java.lang.String).getBytes(charset)");
                str = Base64.encodeToString(bytes, 0);
            } else {
                str = null;
            }
            ((k1.a) Q(context)).edit().putString(String.valueOf(eVar.getKey()), str).apply();
        }
    }

    public static void g0(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j10 = ((long) iArr[6]) & 4294967295L;
        long j11 = ((long) iArr[7]) & 4294967295L;
        long j12 = (((long) iArr[10]) & 4294967295L) + j10;
        long j13 = (((long) iArr[11]) & 4294967295L) + j11;
        long j14 = j11;
        long j15 = (((long) iArr[0]) & 4294967295L) + j12 + 0;
        int i = (int) j15;
        long j16 = (((long) iArr[1]) & 4294967295L) + j13 + (j15 >> 32);
        iArr3[1] = (int) j16;
        long j17 = j12 + (((long) iArr[8]) & 4294967295L);
        long j18 = j13 + (((long) iArr[9]) & 4294967295L);
        long j19 = (((long) iArr[2]) & 4294967295L) + j17 + (j16 >> 32);
        long j20 = j19 & 4294967295L;
        long j21 = (((long) iArr[3]) & 4294967295L) + j18 + (j19 >> 32);
        iArr3[3] = (int) j21;
        long j22 = (((long) iArr[4]) & 4294967295L) + (j17 - j10) + (j21 >> 32);
        iArr3[4] = (int) j22;
        long j23 = (((long) iArr[5]) & 4294967295L) + (j18 - j14) + (j22 >> 32);
        iArr3[5] = (int) j23;
        long j24 = j23 >> 32;
        long j25 = j20 + j24;
        long j26 = j24 + (((long) i) & 4294967295L);
        iArr3[0] = (int) j26;
        long j27 = j26 >> 32;
        if (j27 != 0) {
            long j28 = j27 + (4294967295L & ((long) iArr3[1]));
            iArr3[1] = (int) j28;
            j25 += j28 >> 32;
        }
        iArr3[2] = (int) j25;
        if (((j25 >> 32) != 0 && android.support.v4.media.b.G0(6, iArr3, 3) != 0) || (iArr3[5] == -1 && android.support.v4.media.b.B0(iArr3, f613a))) {
            v(iArr2);
        }
    }

    public static /* synthetic */ String h(int i) {
        return i == 1 ? "BEGIN_ARRAY" : i == 2 ? "END_ARRAY" : i == 3 ? "BEGIN_OBJECT" : i == 4 ? "END_OBJECT" : i == 5 ? "NAME" : i == 6 ? "STRING" : i == 7 ? "NUMBER" : i == 8 ? "BOOLEAN" : i == 9 ? "NULL" : i == 10 ? "END_DOCUMENT" : "null";
    }

    public static void h0(long[] jArr, long[] jArr2) {
        long j10 = jArr[9];
        long j11 = jArr[17];
        long j12 = (((j10 ^ (j11 >>> 59)) ^ (j11 >>> 57)) ^ (j11 >>> 54)) ^ (j11 >>> 49);
        long j13 = (j11 << 15) ^ (((jArr[8] ^ (j11 << 5)) ^ (j11 << 7)) ^ (j11 << 10));
        for (int i = 16; i >= 10; i--) {
            long j14 = jArr[i];
            jArr2[i - 8] = (((j13 ^ (j14 >>> 59)) ^ (j14 >>> 57)) ^ (j14 >>> 54)) ^ (j14 >>> 49);
            j13 = (((jArr[i - 9] ^ (j14 << 5)) ^ (j14 << 7)) ^ (j14 << 10)) ^ (j14 << 15);
        }
        jArr2[1] = (((j13 ^ (j12 >>> 59)) ^ (j12 >>> 57)) ^ (j12 >>> 54)) ^ (j12 >>> 49);
        long j15 = (j12 << 15) ^ (((jArr[0] ^ (j12 << 5)) ^ (j12 << 7)) ^ (j12 << 10));
        long j16 = jArr2[8];
        long j17 = j16 >>> 59;
        jArr2[0] = (((j15 ^ j17) ^ (j17 << 2)) ^ (j17 << 5)) ^ (j17 << 10);
        jArr2[8] = 576460752303423487L & j16;
    }

    public static final URI j(c.c cVar) {
        e.D(cVar, "<this>");
        try {
            URI create = URI.create((String) ((a9.c) cVar.f3046a.getSdkConfig()).a("dtn.default-pull-url", "https://dtn.nodle.io/inbox"));
            e.C(create, "{\n        URI.create(ctx…ull-url\", default))\n    }");
            return create;
        } catch (IllegalArgumentException unused) {
            URI create2 = URI.create("https://dtn.nodle.io/inbox");
            e.C(create2, "{\n        URI.create(default)\n    }");
            return create2;
        }
    }

    public static void j0(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j10 = ((long) iArr[9]) & 4294967295L;
        long j11 = ((long) iArr[10]) & 4294967295L;
        long j12 = ((long) iArr[11]) & 4294967295L;
        long j13 = ((long) iArr[12]) & 4294967295L;
        long j14 = ((long) iArr[13]) & 4294967295L;
        long j15 = ((long) iArr[14]) & 4294967295L;
        long j16 = ((long) iArr[15]) & 4294967295L;
        long j17 = (((long) iArr[8]) & 4294967295L) - 6;
        long j18 = j17 + j10;
        long j19 = j10 + j11;
        long j20 = (j11 + j12) - j16;
        long j21 = j12 + j13;
        long j22 = j13 + j14;
        long j23 = j14 + j15;
        long j24 = j15 + j16;
        long j25 = j23 - j18;
        long j26 = j17;
        long j27 = (((((long) iArr[0]) & 4294967295L) - j21) - j25) + 0;
        iArr3[0] = (int) j27;
        long j28 = j16;
        long j29 = ((((((long) iArr[1]) & 4294967295L) + j19) - j22) - j24) + (j27 >> 32);
        iArr3[1] = (int) j29;
        long j30 = (((((long) iArr[2]) & 4294967295L) + j20) - j23) + (j29 >> 32);
        iArr3[2] = (int) j30;
        long j31 = ((((((long) iArr[3]) & 4294967295L) + (j21 << 1)) + j25) - j24) + (j30 >> 32);
        iArr3[3] = (int) j31;
        long j32 = ((((((long) iArr[4]) & 4294967295L) + (j22 << 1)) + j15) - j19) + (j31 >> 32);
        iArr3[4] = (int) j32;
        long j33 = (((((long) iArr[5]) & 4294967295L) + (j23 << 1)) - j20) + (j32 >> 32);
        iArr3[5] = (int) j33;
        long j34 = (((long) iArr[6]) & 4294967295L) + (j24 << 1) + j25 + (j33 >> 32);
        iArr3[6] = (int) j34;
        long j35 = (((((((long) iArr[7]) & 4294967295L) + (j28 << 1)) + j26) - j20) - j22) + (j34 >> 32);
        iArr3[7] = (int) j35;
        m0((int) ((j35 >> 32) + 6), iArr3);
    }

    public static void k0(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = jArr[12];
        long j19 = j16 ^ ((j18 >>> 25) ^ (j18 << 62));
        long j20 = j17 ^ (j18 >>> 2);
        long j21 = jArr[11];
        long j22 = j14 ^ (j21 << 39);
        long j23 = (j15 ^ (j18 << 39)) ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[10];
        long j26 = j13 ^ (j25 << 39);
        long j27 = j22 ^ ((j25 >>> 25) ^ (j25 << 62));
        long j28 = j23 ^ (j25 >>> 2);
        long j29 = jArr[9];
        long j30 = j12 ^ (j29 << 39);
        long j31 = j26 ^ ((j29 >>> 25) ^ (j29 << 62));
        long j32 = j27 ^ (j29 >>> 2);
        long j33 = jArr[8];
        long j34 = j10 ^ (j20 << 39);
        long j35 = (j30 ^ ((j33 >>> 25) ^ (j33 << 62))) ^ (j20 >>> 2);
        long j36 = j24 >>> 25;
        jArr2[0] = j34 ^ j36;
        long j37 = j36 << 23;
        jArr2[1] = j37 ^ ((j11 ^ (j33 << 39)) ^ ((j20 >>> 25) ^ (j20 << 62)));
        jArr2[2] = j35;
        jArr2[3] = j31 ^ (j33 >>> 2);
        jArr2[4] = j32;
        jArr2[5] = j28;
        jArr2[6] = j24 & 33554431;
    }

    public static final void l(xe.f fVar) {
        boolean z10;
        boolean z11;
        e.D(fVar, "$this$checkValid");
        xe.q qVar = fVar.f13195a;
        e.D(qVar, "$this$checkValidPrimaryBlock");
        if (!ad.c.p(qVar, xe.h.IsFragment) || !ad.c.p(qVar, xe.h.MustNotFragment)) {
            e.l(qVar.f13221d);
            e.l(qVar.f13222e);
            e.l(qVar.f13223f);
            if (jc.b.m(qVar.f13222e) && (!ad.c.p(qVar, xe.h.MustNotFragment) || ad.c.p(qVar, xe.h.StatusRequestReception) || ad.c.p(qVar, xe.h.StatusRequestForward) || ad.c.p(qVar, xe.h.StatusRequestDelivery) || ad.c.p(qVar, xe.h.StatusRequestDeletion))) {
                StringBuilder q10 = a.b.q("bundle:");
                q10.append(k.p(qVar));
                q10.append(" - primary: anonymous bundle shall not be fragmented and status report not delivered");
                throw new xe.r(q10.toString());
            } else if (qVar.g != 0 || a.b.z(fVar, xe.d.BundleAgeBlock)) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = qVar.g;
                if (j10 == 0) {
                    j G2 = a.b.G(fVar, 7);
                    p pVar = G2 != null ? G2.f13212e : null;
                    Objects.requireNonNull(pVar, "null cannot be cast to non-null type io.nodle.dtn.bpv7.extensions.BundleAgeBlockData");
                    if (((gi.a) pVar).f5514a > qVar.i) {
                        StringBuilder q11 = a.b.q("bundle:");
                        q11.append(k.p(qVar));
                        q11.append(" - primary: bundle has expired");
                        throw new xe.r(q11.toString());
                    }
                } else if (currentTimeMillis > j10 + qVar.i) {
                    StringBuilder q12 = a.b.q("bundle:");
                    q12.append(k.p(qVar));
                    q12.append(" - primary: bundle has expired");
                    throw new xe.r(q12.toString());
                }
                Iterator<j> it = fVar.f13196b.iterator();
                while (true) {
                    int i = 0;
                    if (it.hasNext()) {
                        j next = it.next();
                        e.D(next, "$this$checkValidCanonicalBlock");
                        if (next.f13209b == 0) {
                            StringBuilder q13 = a.b.q("bundle:");
                            q13.append(a.b.p(fVar));
                            q13.append(" - canonical: block number 0 forbidden for non-primary block");
                            throw new xe.r(q13.toString());
                        } else if (next.f13208a == 40) {
                            p pVar2 = next.f13212e;
                            if (pVar2 instanceof gf.a) {
                                Objects.requireNonNull(pVar2, "null cannot be cast to non-null type io.nodle.dtn.bpv7.bpsec.AbstractSecurityBlockData");
                                gf.a aVar = (gf.a) pVar2;
                                if (aVar.f5478a.size() == 0) {
                                    throw new xe.r("asb: should have at least 1 target");
                                } else if (aVar.f5478a.contains(Integer.valueOf(next.f13209b))) {
                                    throw new xe.r("asb: security block cannot target itself");
                                } else if (m.W0(aVar.f5478a).size() < aVar.f5478a.size()) {
                                    throw new xe.r("asb: duplicate entries");
                                } else if (aVar.f5478a.size() == aVar.f5483f.size()) {
                                    for (Integer intValue : aVar.f5478a) {
                                        int intValue2 = intValue.intValue();
                                        if (intValue2 != 0) {
                                            List<j> list = fVar.f13196b;
                                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                                Iterator<T> it2 = list.iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    }
                                                    if (((j) it2.next()).f13209b == intValue2) {
                                                        z11 = true;
                                                        continue;
                                                    } else {
                                                        z11 = false;
                                                        continue;
                                                    }
                                                    if (z11) {
                                                        z10 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            z10 = false;
                                            if (!z10) {
                                                throw new xe.r("asb: target block doesn't exist");
                                            }
                                        }
                                    }
                                    if (aVar.f5479b == 1) {
                                        aa.b bVar = aVar.f5482e;
                                        Objects.requireNonNull(bVar, "null cannot be cast to non-null type io.nodle.dtn.bpv7.bpsec.Ed25519SecurityParameter");
                                        gf.e eVar = (gf.e) bVar;
                                        for (Number intValue3 : aVar.f5478a) {
                                            int intValue4 = intValue3.intValue();
                                            gf.b bVar2 = aVar.f5483f.get(i);
                                            Objects.requireNonNull(bVar2, "null cannot be cast to non-null type io.nodle.dtn.bpv7.bpsec.Ed25519SecurityResult");
                                            gf.f fVar2 = (gf.f) bVar2;
                                            pi.d dVar = new pi.d(eVar.I);
                                            DataOutputStream dataOutputStream = new DataOutputStream(dVar);
                                            if (intValue4 == 0) {
                                                b1.i(fVar.f13195a, dataOutputStream);
                                            } else {
                                                j v10 = a.b.v(fVar, intValue4);
                                                if (v10 != null) {
                                                    b1.h(v10, dataOutputStream);
                                                } else {
                                                    throw new xe.r(jc.b.c("asb-ed25519: bundle has no block number ", intValue4));
                                                }
                                            }
                                            dataOutputStream.writeLong(eVar.J);
                                            dataOutputStream.flush();
                                            if (dVar.f10069a.d(ui.c.c(fVar2.f5486a))) {
                                                System.out.println(jc.b.c("valid signature on block ", intValue4));
                                                i++;
                                            } else {
                                                throw new xe.r(jc.b.c("asb-ed25519: signature verification failed on block target ", intValue4));
                                            }
                                        }
                                        continue;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    throw new xe.r("asb: mismatch between number of target and number of results");
                                }
                            } else {
                                throw new xe.r("asb: security block expected ");
                            }
                        }
                    } else {
                        xe.q qVar2 = fVar.f13195a;
                        e.D(qVar2, "$this$hasCRC");
                        if ((qVar2.f13220c != i.NoCRC) || ad.c.v(fVar, 0)) {
                            List<j> list2 = fVar.f13196b;
                            ArrayList arrayList = new ArrayList(nd.g.S0(list2));
                            for (j jVar : list2) {
                                arrayList.add(Integer.valueOf(jVar.f13209b));
                            }
                            if (!arrayList.contains(1)) {
                                StringBuilder q14 = a.b.q("bundle:");
                                q14.append(a.b.p(fVar));
                                q14.append(" - the bundle must have a payload block");
                                throw new xe.r(q14.toString());
                            } else if (((j) m.c1(fVar.f13196b)).f13208a == 1) {
                                List<j> list3 = fVar.f13196b;
                                ArrayList arrayList2 = new ArrayList(nd.g.S0(list3));
                                for (j jVar2 : list3) {
                                    arrayList2.add(Integer.valueOf(jVar2.f13209b));
                                }
                                if (m.W0(arrayList2).size() < fVar.f13196b.size()) {
                                    StringBuilder q15 = a.b.q("bundle:");
                                    q15.append(a.b.p(fVar));
                                    q15.append(" - multiple blocks with same blockNumber");
                                    throw new xe.r(q15.toString());
                                }
                                return;
                            } else {
                                StringBuilder q16 = a.b.q("bundle:");
                                q16.append(a.b.p(fVar));
                                q16.append(" - the last block must be a payload block");
                                throw new xe.r(q16.toString());
                            }
                        } else {
                            StringBuilder q17 = a.b.q("bundle:");
                            q17.append(a.b.p(fVar));
                            q17.append(" - primary block must have a CRC or being the target of a BIB");
                            throw new xe.r(q17.toString());
                        }
                    }
                }
            } else {
                StringBuilder q18 = a.b.q("bundle:");
                q18.append(k.p(qVar));
                q18.append(" - primary: creatimeTimestamp is zero but bundle has no age block");
                throw new xe.r(q18.toString());
            }
        } else {
            StringBuilder q19 = a.b.q("bundle:");
            q19.append(k.p(qVar));
            q19.append(" - primary: bundle is a fragment but must_no_fragment flag is set");
            throw new xe.r(q19.toString());
        }
    }

    public static void l0(int i, int[] iArr) {
        long j10;
        if (i != 0) {
            long j11 = ((long) i) & 4294967295L;
            long j12 = (((long) iArr[0]) & 4294967295L) + j11 + 0;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j14;
                j13 = j14 >> 32;
            }
            long j15 = (4294967295L & ((long) iArr[2])) + j11 + j13;
            iArr[2] = (int) j15;
            j10 = j15 >> 32;
        } else {
            j10 = 0;
        }
        if ((j10 != 0 && android.support.v4.media.b.G0(6, iArr, 3) != 0) || (iArr[5] == -1 && android.support.v4.media.b.B0(iArr, f613a))) {
            v(iArr);
        }
    }

    public static final boolean m(gf.a aVar) {
        e.D(aVar, "$this$hasSecurityParam");
        return ui.c.b(aVar.f5480c, 0);
    }

    public static void m0(int i, int[] iArr) {
        long j10;
        if (i != 0) {
            long j11 = ((long) i) & 4294967295L;
            long j12 = (((long) iArr[0]) & 4294967295L) + j11 + 0;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j14;
                long j15 = (j14 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j15;
                j13 = j15 >> 32;
            }
            long j16 = ((((long) iArr[3]) & 4294967295L) - j11) + j13;
            iArr[3] = (int) j16;
            long j17 = j16 >> 32;
            if (j17 != 0) {
                long j18 = j17 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j18;
                long j19 = (j18 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j19;
                j17 = j19 >> 32;
            }
            long j20 = ((((long) iArr[6]) & 4294967295L) - j11) + j17;
            iArr[6] = (int) j20;
            long j21 = (4294967295L & ((long) iArr[7])) + j11 + (j20 >> 32);
            iArr[7] = (int) j21;
            j10 = j21 >> 32;
        } else {
            j10 = 0;
        }
        if (j10 != 0 || (iArr[7] == -1 && android.support.v4.media.b.D0(iArr, f616s))) {
            w(iArr);
        }
    }

    public static final void n(lf.a aVar, lf.c cVar, String str) {
        Objects.requireNonNull(lf.d.f8288j);
        Logger logger = lf.d.i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f8286f);
        sb2.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        e.C(format, "java.lang.String.format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.f8278c);
        logger.fine(sb2.toString());
    }

    public static int n0(int i, int i10) {
        if (i10 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (E(i) >= E(i10)) {
            i ^= i10 << (E(i) - E(i10));
        }
        return i;
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.l(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && android.support.v4.media.b.B0(iArr3, f613a))) {
            v(iArr3);
        }
    }

    public static final oe.b o0(android.support.v4.media.b bVar, de.i iVar) {
        oe.b bVar2;
        oe.b bVar3;
        oe.b y0Var;
        oe.b bVar4;
        de.b r10 = g0.r(iVar);
        List<de.j> a10 = iVar.a();
        ArrayList arrayList = new ArrayList(nd.g.S0(a10));
        for (de.j jVar : a10) {
            de.i iVar2 = jVar.f4457b;
            if (iVar2 != null) {
                arrayList.add(iVar2);
            } else {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + iVar).toString());
            }
        }
        if (arrayList.isEmpty()) {
            e.D(r10, "$this$serializerOrNull");
            bVar2 = k.W(r10, new oe.b[0]);
            if (bVar2 == null) {
                Map<de.b<? extends Object>, oe.b<? extends Object>> map = x0.f10760a;
                bVar2 = x0.f10760a.get(r10);
            }
            if (bVar2 == null) {
                bVar2 = bVar.s0(r10);
            }
        } else {
            ArrayList arrayList2 = new ArrayList(nd.g.S0(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                de.i iVar3 = (de.i) it.next();
                e.D(bVar, "$this$serializer");
                e.D(iVar3, "type");
                de.b r11 = g0.r(iVar3);
                boolean b10 = iVar3.b();
                oe.b o02 = o0(bVar, iVar3);
                if (o02 != null) {
                    bVar4 = c0(o02, b10);
                } else {
                    oe.b s02 = bVar.s0(r11);
                    if (s02 != null) {
                        bVar4 = c0(s02, b10);
                    } else {
                        k.F0(g0.r(iVar3));
                        throw null;
                    }
                }
                arrayList2.add(bVar4);
            }
            if (e.r(r10, yd.v.a(List.class)) || e.r(r10, yd.v.a(List.class)) || e.r(r10, yd.v.a(ArrayList.class))) {
                bVar3 = new re.e((oe.b) arrayList2.get(0));
            } else if (e.r(r10, yd.v.a(HashSet.class))) {
                bVar3 = new y((oe.b) arrayList2.get(0));
            } else if (e.r(r10, yd.v.a(Set.class)) || e.r(r10, yd.v.a(Set.class)) || e.r(r10, yd.v.a(LinkedHashSet.class))) {
                bVar3 = new re.g0((oe.b) arrayList2.get(0));
            } else if (e.r(r10, yd.v.a(HashMap.class))) {
                bVar3 = new w((oe.b) arrayList2.get(0), (oe.b) arrayList2.get(1));
            } else if (!e.r(r10, yd.v.a(Map.class)) && !e.r(r10, yd.v.a(Map.class)) && !e.r(r10, yd.v.a(LinkedHashMap.class))) {
                if (e.r(r10, yd.v.a(Map.Entry.class))) {
                    oe.b bVar5 = (oe.b) arrayList2.get(0);
                    oe.b bVar6 = (oe.b) arrayList2.get(1);
                    e.D(bVar5, "keySerializer");
                    e.D(bVar6, "valueSerializer");
                    y0Var = new m0(bVar5, bVar6);
                } else if (e.r(r10, yd.v.a(md.f.class))) {
                    oe.b bVar7 = (oe.b) arrayList2.get(0);
                    oe.b bVar8 = (oe.b) arrayList2.get(1);
                    e.D(bVar7, "keySerializer");
                    e.D(bVar8, "valueSerializer");
                    y0Var = new r0(bVar7, bVar8);
                } else if (e.r(r10, yd.v.a(md.i.class))) {
                    oe.b bVar9 = (oe.b) arrayList2.get(0);
                    oe.b bVar10 = (oe.b) arrayList2.get(1);
                    oe.b bVar11 = (oe.b) arrayList2.get(2);
                    e.D(bVar9, "aSerializer");
                    e.D(bVar10, "bSerializer");
                    e.D(bVar11, "cSerializer");
                    bVar2 = new f1(bVar9, bVar10, bVar11);
                } else {
                    e.D(r10, "rootClass");
                    if (aa.b.G(r10).isArray()) {
                        de.c c10 = ((de.i) arrayList.get(0)).c();
                        Objects.requireNonNull(c10, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                        oe.b bVar12 = (oe.b) arrayList2.get(0);
                        e.D(bVar12, "elementSerializer");
                        y0Var = new y0((de.b) c10, bVar12);
                    } else {
                        Object[] array = arrayList2.toArray(new oe.b[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                        oe.b[] bVarArr = (oe.b[]) array;
                        bVar3 = k.W(r10, (oe.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                        if (bVar3 == null) {
                            StringBuilder d10 = a.a.d("Can't find a method to construct serializer for type ");
                            d10.append(r10.a());
                            d10.append(". ");
                            d10.append("Make sure this class is marked as @Serializable or provide serializer explicitly.");
                            throw new IllegalArgumentException(d10.toString().toString());
                        }
                    }
                }
                bVar2 = y0Var;
            } else {
                bVar3 = new e0((oe.b) arrayList2.get(0), (oe.b) arrayList2.get(1));
            }
            bVar2 = bVar3;
        }
        if (bVar2 != null) {
            return bVar2;
        }
        return null;
    }

    public static void p(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static final qc.d p0(qc.d dVar) {
        qc.d[] dVarArr = {dVar};
        LinkedHashSet linkedHashSet = new LinkedHashSet(aa.b.P(1));
        for (int i = 0; i < 1; i++) {
            linkedHashSet.add(dVarArr[i]);
        }
        while (true) {
            qc.a<?, ?> aVar = dVar.f10406b;
            if (!(aVar instanceof rc.a)) {
                return dVar;
            }
            dVar = ((rc.a) aVar).f10656b;
            if (!linkedHashSet.contains(dVar)) {
                linkedHashSet.add(dVar);
            } else {
                throw new d9.d();
            }
        }
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.n(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && android.support.v4.media.b.D0(iArr3, f616s))) {
            w(iArr3);
        }
    }

    public static int q0(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    public static void r(long[] jArr, int i, long[] jArr2, int i10, long[] jArr3, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = i11 + i12;
            jArr3[i13] = jArr3[i13] ^ (jArr[i + i12] ^ jArr2[i10 + i12]);
        }
    }

    public static void r0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        android.support.v4.media.b.N1(iArr, iArr3);
        g0(iArr3, iArr2);
    }

    public static void s(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    public static void s0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        O(jArr, jArr3);
        h0(jArr3, jArr2);
    }

    public static void t(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void t0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        android.support.v4.media.b.P1(iArr, iArr3);
        j0(iArr3, iArr2);
    }

    public static void u(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr2[i] = jArr[i];
        }
    }

    public static void u0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        O(jArr, jArr3);
        t(jArr2, jArr3, jArr2);
    }

    public static void v(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j12;
            j11 = j12 >> 32;
        }
        long j13 = (4294967295L & ((long) iArr[2])) + 1 + j11;
        iArr[2] = (int) j13;
        if ((j13 >> 32) != 0) {
            android.support.v4.media.b.G0(6, iArr, 3);
        }
    }

    public static void v0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[12];
        android.support.v4.media.b.N1(iArr, iArr3);
        while (true) {
            g0(iArr3, iArr2);
            i--;
            if (i > 0) {
                android.support.v4.media.b.N1(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void w(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j12;
            long j13 = (j12 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        long j14 = ((((long) iArr[3]) & 4294967295L) - 1) + j11;
        iArr[3] = (int) j14;
        long j15 = j14 >> 32;
        if (j15 != 0) {
            long j16 = j15 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j16;
            long j17 = (j16 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j17;
            j15 = j17 >> 32;
        }
        long j18 = ((((long) iArr[6]) & 4294967295L) - 1) + j15;
        iArr[6] = (int) j18;
        iArr[7] = (int) ((4294967295L & ((long) iArr[7])) + 1 + (j18 >> 32));
    }

    public static void w0(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[18];
        O(jArr, jArr3);
        while (true) {
            h0(jArr3, jArr2);
            i--;
            if (i > 0) {
                O(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    public static final boolean x(byte[] bArr, int i, byte[] bArr2, int i10, int i11) {
        e.D(bArr, "a");
        e.D(bArr2, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12 + i] != bArr2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static void x0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        android.support.v4.media.b.P1(iArr, iArr3);
        while (true) {
            j0(iArr3, iArr2);
            i--;
            if (i > 0) {
                android.support.v4.media.b.P1(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public static final pe.e y(String str, pe.e[] eVarArr, xd.l lVar) {
        if (!fe.k.Z0(str)) {
            pe.a aVar = new pe.a(str);
            lVar.k(aVar);
            return new pe.f(str, j.a.f9918a, aVar.f9883b.size(), nd.f.S(eVarArr), aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static void y0(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[13];
        P(jArr, jArr3);
        while (true) {
            k0(jArr3, jArr2);
            i--;
            if (i > 0) {
                P(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public static final pe.e z(String str, pe.i iVar, pe.e[] eVarArr, xd.l lVar) {
        e.D(str, "serialName");
        e.D(lVar, "builder");
        if (!(!fe.k.Z0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        } else if (!e.r(iVar, j.a.f9918a)) {
            pe.a aVar = new pe.a(str);
            lVar.k(aVar);
            return new pe.f(str, iVar, aVar.f9883b.size(), nd.f.S(eVarArr), aVar);
        } else {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
    }

    public static void z0(xd.p pVar, Object obj, pd.d dVar) {
        try {
            aa.b.e0(ad.c.Y(ad.c.C(pVar, obj, dVar)), md.m.f8555a, (xd.l) null);
        } catch (Throwable th2) {
            dVar.resumeWith(b1.k(th2));
            throw th2;
        }
    }

    public gc.e D(byte[] bArr) {
        return new gc.e(nd.d.H(bArr, 0, 32), nd.d.H(bArr, 64, bArr.length), nd.d.H(bArr, 32, 64));
    }

    public String H(BigInteger bigInteger, int i) {
        e.D(bigInteger, "rawNodle");
        DecimalFormat decimalFormat = new DecimalFormat("0");
        decimalFormat.setMaximumFractionDigits(11);
        decimalFormat.setMinimumFractionDigits(i);
        BigDecimal divide = new BigDecimal(bigInteger).divide(BigDecimal.TEN.pow(11));
        e.C(divide, "rawNodle.toBigDecimal().…pow(AMOUNT_MAX_DECIMALS))");
        String format = decimalFormat.format(divide);
        return format == null ? "0.00" : format;
    }

    public Object a() {
        return new TreeSet();
    }

    public fc.a b(fc.a aVar, ec.a aVar2) {
        e.D((gc.e) aVar, "parent");
        e.D(aVar2, "junction");
        int[] iArr = gc.f.f5356a;
        throw null;
    }

    public String c(BigInteger bigInteger) {
        e.D(bigInteger, "rawNodle");
        return H(bigInteger, 2);
    }

    public fc.a d(byte[] bArr) {
        byte[] keypairFromSeed = Sr25519.keypairFromSeed(bArr);
        e.C(keypairFromSeed, "keypairBytes");
        return D(keypairFromSeed);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0100, code lost:
        if (r11 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0130, code lost:
        if (r11 == null) goto L_0x013e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(io.nodle.sdk.NodleContext r11, ji.a r12) {
        /*
            r10 = this;
            org.slf4j.Logger r0 = s9.b.f11022a
            java.lang.String r1 = "context"
            e6.e.D(r11, r1)
            m2.a r1 = r11.getSdkConfig()
            a9.c r1 = (a9.c) r1
            java.util.Objects.requireNonNull(r1)
            a5.n r2 = new a5.n
            java.lang.String r3 = "BleAdvertising"
            r2.<init>(r3, r1)
            io.sentry.Sentry.configureScope(r2)
            boolean r1 = a.b.x()
            r2 = 0
            if (r1 != 0) goto L_0x002a
            org.slf4j.Logger r11 = s9.b.f11022a
            java.lang.String r12 = "ble-adv: ble interface is down"
            r11.debug(r12)
            goto L_0x014e
        L_0x002a:
            int r1 = r12.f7262u
            r3 = 2
            if (r1 > r3) goto L_0x0146
            if (r1 >= 0) goto L_0x0033
            goto L_0x0146
        L_0x0033:
            int r1 = r12.f7261t
            r3 = 3
            if (r1 > r3) goto L_0x0140
            if (r1 >= 0) goto L_0x003c
            goto L_0x0140
        L_0x003c:
            long r3 = r12.f7260s
            r5 = 180000(0x2bf20, double:8.8932E-319)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0058
            org.slf4j.Logger r11 = s9.b.f11022a
            long r0 = r12.f7260s
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ble-adv: invalid duration "
            java.lang.String r12 = e6.e.a0(r0, r12)
            r11.debug(r12)
            goto L_0x014e
        L_0x0058:
            android.bluetooth.le.AdvertiseSettings$Builder r1 = new android.bluetooth.le.AdvertiseSettings$Builder
            r1.<init>()
            int r3 = r12.f7261t
            android.bluetooth.le.AdvertiseSettings$Builder r1 = r1.setTxPowerLevel(r3)
            int r3 = r12.f7262u
            android.bluetooth.le.AdvertiseSettings$Builder r1 = r1.setAdvertiseMode(r3)
            android.bluetooth.le.AdvertiseSettings$Builder r1 = r1.setConnectable(r2)
            long r3 = r12.f7260s
            int r3 = (int) r3
            android.bluetooth.le.AdvertiseSettings$Builder r1 = r1.setTimeout(r3)
            android.bluetooth.le.AdvertiseSettings r1 = r1.build()
            android.bluetooth.le.AdvertiseData$Builder r3 = new android.bluetooth.le.AdvertiseData$Builder
            r3.<init>()
            android.bluetooth.le.AdvertiseData$Builder r3 = r3.setIncludeDeviceName(r2)
            android.bluetooth.le.AdvertiseData$Builder r3 = r3.setIncludeTxPowerLevel(r2)
            boolean r4 = r12.f7263v
            if (r4 == 0) goto L_0x00a0
            int r4 = r12.f7264w
            if (r4 >= 0) goto L_0x0097
            s9.e r11 = new s9.e
            r11.<init>(r12, r2)
            r11.c()
            goto L_0x014e
        L_0x0097:
            zb.h r5 = r12.f7265x
            byte[] r5 = r5.i()
            r3.addManufacturerData(r4, r5)
        L_0x00a0:
            boolean r4 = r12.f7266y
            if (r4 == 0) goto L_0x00b7
            java.lang.String r4 = r12.z     // Catch:{ IllegalArgumentException -> 0x00ae }
            android.os.ParcelUuid r4 = android.os.ParcelUuid.fromString(r4)     // Catch:{ IllegalArgumentException -> 0x00ae }
            r3.addServiceUuid(r4)     // Catch:{ IllegalArgumentException -> 0x00ae }
            goto L_0x00b7
        L_0x00ae:
            org.slf4j.Logger r11 = s9.b.f11022a
            java.lang.String r12 = "ble-adv: wrong service uuid"
            r11.debug(r12)
            goto L_0x014e
        L_0x00b7:
            android.bluetooth.le.AdvertiseData r3 = r3.build()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            java.lang.String r6 = "bluetooth"
            java.lang.String r7 = " seconds"
            r8 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r9 = "ble-adv: start advertising for "
            if (r4 < r5) goto L_0x0103
            ac.a r11 = (ac.a) r11
            android.content.Context r4 = r11.f289a
            java.lang.String r5 = "android.permission.BLUETOOTH_ADVERTISE"
            int r4 = C(r4, r5)
            if (r4 != 0) goto L_0x014e
            java.lang.StringBuilder r2 = a.b.q(r9)
            long r4 = r12.f7260s
            long r8 = (long) r8
            long r4 = r4 / r8
            r2.append(r4)
            r2.append(r7)
            java.lang.String r12 = r2.toString()
            r0.debug(r12)
            android.content.Context r11 = r11.f289a
            java.lang.Object r11 = r11.getSystemService(r6)
            android.bluetooth.BluetoothManager r11 = (android.bluetooth.BluetoothManager) r11
            if (r11 != 0) goto L_0x00f5
            goto L_0x013e
        L_0x00f5:
            android.bluetooth.BluetoothAdapter r11 = r11.getAdapter()
            if (r11 != 0) goto L_0x00fc
            goto L_0x013e
        L_0x00fc:
            android.bluetooth.le.BluetoothLeAdvertiser r11 = r11.getBluetoothLeAdvertiser()
            if (r11 != 0) goto L_0x0133
            goto L_0x013e
        L_0x0103:
            java.lang.StringBuilder r2 = a.b.q(r9)
            long r4 = r12.f7260s
            long r8 = (long) r8
            long r4 = r4 / r8
            r2.append(r4)
            r2.append(r7)
            java.lang.String r12 = r2.toString()
            r0.debug(r12)
            ac.a r11 = (ac.a) r11
            android.content.Context r11 = r11.f289a
            java.lang.Object r11 = r11.getSystemService(r6)
            android.bluetooth.BluetoothManager r11 = (android.bluetooth.BluetoothManager) r11
            if (r11 != 0) goto L_0x0125
            goto L_0x013e
        L_0x0125:
            android.bluetooth.BluetoothAdapter r11 = r11.getAdapter()
            if (r11 != 0) goto L_0x012c
            goto L_0x013e
        L_0x012c:
            android.bluetooth.le.BluetoothLeAdvertiser r11 = r11.getBluetoothLeAdvertiser()
            if (r11 != 0) goto L_0x0133
            goto L_0x013e
        L_0x0133:
            md.h r12 = s9.b.f11023b
            java.lang.Object r12 = r12.a()
            android.bluetooth.le.AdvertiseCallback r12 = (android.bluetooth.le.AdvertiseCallback) r12
            r11.startAdvertising(r1, r3, r12)
        L_0x013e:
            r2 = 1
            goto L_0x014e
        L_0x0140:
            s9.d r11 = new s9.d
            r11.<init>(r12, r2)
            goto L_0x014b
        L_0x0146:
            s9.c r11 = new s9.c
            r11.<init>(r12, r2)
        L_0x014b:
            r11.c()
        L_0x014e:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.v.f(io.nodle.sdk.NodleContext, ji.a):java.lang.Object");
    }

    public String i(List list) {
        e.D(list, "set");
        return m.b1(list, ",", (CharSequence) null, (CharSequence) null, (xd.l) null, 62);
    }

    public byte[] i0(byte[] bArr) {
        byte[] bArr2 = bArr;
        long b10 = (long) ((ef.b.b(bArr2, 18) >> 3) & 2097151);
        long b11 = (long) (ef.b.b(bArr2, 0) & 2097151);
        long b12 = (long) ((ef.b.b(bArr2, 34) >> 1) & 2097151);
        long c10 = (ef.b.c(bArr2, 2) >> 5) & 2097151;
        long b13 = (long) ((ef.b.b(bArr2, 39) >> 3) & 2097151);
        long b14 = (long) ((ef.b.b(bArr2, 47) >> 2) & 2097151);
        long c11 = (ef.b.c(bArr2, 49) >> 7) & 2097151;
        long c12 = (ef.b.c(bArr2, 52) >> 4) & 2097151;
        long b15 = (long) ((ef.b.b(bArr2, 55) >> 1) & 2097151);
        long c13 = (ef.b.c(bArr2, 57) >> 6) & 2097151;
        long c14 = ef.b.c(bArr2, 60) >> 3;
        long j10 = c14 * 666643;
        long j11 = c14 * 470296;
        long b16 = ((long) (ef.b.b(bArr2, 42) & 2097151)) - (c14 * 683901);
        long j12 = c13 * 666643;
        long c15 = (c13 * 470296) + j10 + ((ef.b.c(bArr2, 28) >> 7) & 2097151);
        long c16 = (c13 * 654183) + j11 + ((ef.b.c(bArr2, 31) >> 4) & 2097151);
        long j13 = ((c14 * 654183) + b12) - (c13 * 997805);
        long c17 = (c13 * 136657) + (((ef.b.c(bArr2, 36) >> 6) & 2097151) - (c14 * 997805));
        long j14 = ((c14 * 136657) + b13) - (c13 * 683901);
        long c18 = (b15 * 666643) + ((ef.b.c(bArr2, 23) >> 5) & 2097151);
        long j15 = b15 * 470296;
        long j16 = (b15 * 654183) + c15;
        long j17 = c16 - (b15 * 997805);
        long j18 = c17 - (b15 * 683901);
        long b17 = (c12 * 666643) + ((long) (ef.b.b(bArr2, 21) & 2097151));
        long j19 = (c12 * 470296) + c18;
        long b18 = (c12 * 654183) + j15 + j12 + ((long) ((ef.b.b(bArr2, 26) >> 2) & 2097151));
        long j20 = j16 - (c12 * 997805);
        long j21 = ((b15 * 136657) + j13) - (c12 * 683901);
        long j22 = (c11 * 470296) + b17;
        long j23 = (c11 * 654183) + j19;
        long j24 = b18 - (c11 * 997805);
        long j25 = (c11 * 136657) + j20;
        long j26 = ((c12 * 136657) + j17) - (c11 * 683901);
        long c19 = (b14 * 666643) + ((ef.b.c(bArr2, 15) >> 6) & 2097151);
        long j27 = (b14 * 654183) + j22;
        long j28 = (b14 * 136657) + j24;
        long j29 = (c19 + 1048576) >> 21;
        long j30 = (b14 * 470296) + (c11 * 666643) + b10 + j29;
        long j31 = c19 - (j29 << 21);
        long j32 = (j27 + 1048576) >> 21;
        long j33 = (j23 - (b14 * 997805)) + j32;
        long j34 = j27 - (j32 << 21);
        long j35 = (j28 + 1048576) >> 21;
        long j36 = (j25 - (b14 * 683901)) + j35;
        long j37 = j28 - (j35 << 21);
        long j38 = (j26 + 1048576) >> 21;
        long j39 = j21 + j38;
        long j40 = j26 - (j38 << 21);
        long j41 = (j18 + 1048576) >> 21;
        long j42 = j14 + j41;
        long j43 = j18 - (j41 << 21);
        long j44 = (b16 + 1048576) >> 21;
        long c20 = ((ef.b.c(bArr2, 44) >> 5) & 2097151) + j44;
        long j45 = b16 - (j44 << 21);
        long j46 = (j30 + 1048576) >> 21;
        long j47 = j34 + j46;
        long j48 = j30 - (j46 << 21);
        long j49 = (j33 + 1048576) >> 21;
        long j50 = j37 + j49;
        long j51 = j33 - (j49 << 21);
        long j52 = (j36 + 1048576) >> 21;
        long j53 = j40 + j52;
        long j54 = j36 - (j52 << 21);
        long j55 = (j39 + 1048576) >> 21;
        long j56 = j43 + j55;
        long j57 = j39 - (j55 << 21);
        long j58 = (j42 + 1048576) >> 21;
        long j59 = j45 + j58;
        long j60 = j42 - (j58 << 21);
        long j61 = (c20 * 470296) + j31;
        long j62 = (c20 * 654183) + j48;
        long j63 = (c20 * 136657) + j51;
        long j64 = j50 - (c20 * 683901);
        long j65 = j59 * 666643;
        long j66 = j59 * 470296;
        long b19 = j66 + (c20 * 666643) + ((long) ((ef.b.b(bArr2, 13) >> 1) & 2097151));
        long j67 = j62 - (j59 * 997805);
        long j68 = j63 - (j59 * 683901);
        long c21 = (j60 * 666643) + ((ef.b.c(bArr2, 7) >> 7) & 2097151);
        long c22 = (j60 * 470296) + j65 + ((ef.b.c(bArr2, 10) >> 4) & 2097151);
        long j69 = (j60 * 654183) + b19;
        long j70 = ((j59 * 654183) + j61) - (j60 * 997805);
        long j71 = (j60 * 136657) + j67;
        long j72 = ((j59 * 136657) + (j47 - (c20 * 997805))) - (j60 * 683901);
        long j73 = (j56 * 470296) + c21;
        long j74 = (j56 * 654183) + c22;
        long j75 = (j56 * 136657) + j70;
        long j76 = (j57 * 666643) + c10;
        long b20 = (j57 * 470296) + (j56 * 666643) + ((long) ((ef.b.b(bArr2, 5) >> 2) & 2097151));
        long j77 = (j57 * 654183) + j73;
        long j78 = j74 - (j57 * 997805);
        long j79 = (j57 * 136657) + (j69 - (j56 * 997805));
        long j80 = j75 - (j57 * 683901);
        long j81 = (j53 * 666643) + b11;
        long j82 = (j53 * 470296) + j76;
        long j83 = (j53 * 654183) + b20;
        long j84 = (j53 * 136657) + j78;
        long j85 = (j81 + 1048576) >> 21;
        long j86 = j82 + j85;
        long j87 = j81 - (j85 << 21);
        long j88 = (j83 + 1048576) >> 21;
        long j89 = (j77 - (j53 * 997805)) + j88;
        long j90 = j83 - (j88 << 21);
        long j91 = (j84 + 1048576) >> 21;
        long j92 = (j79 - (j53 * 683901)) + j91;
        long j93 = j84 - (j91 << 21);
        long j94 = (j80 + 1048576) >> 21;
        long j95 = (j71 - (j56 * 683901)) + j94;
        long j96 = j80 - (j94 << 21);
        long j97 = (j72 + 1048576) >> 21;
        long j98 = j68 + j97;
        long j99 = j72 - (j97 << 21);
        long j100 = (j64 + 1048576) >> 21;
        long j101 = j54 + j100;
        long j102 = j64 - (j100 << 21);
        long j103 = (j86 + 1048576) >> 21;
        long j104 = j90 + j103;
        long j105 = j86 - (j103 << 21);
        long j106 = (j89 + 1048576) >> 21;
        long j107 = j93 + j106;
        long j108 = j89 - (j106 << 21);
        long j109 = (j92 + 1048576) >> 21;
        long j110 = j96 + j109;
        long j111 = j92 - (j109 << 21);
        long j112 = (j95 + 1048576) >> 21;
        long j113 = j99 + j112;
        long j114 = j95 - (j112 << 21);
        long j115 = (j98 + 1048576) >> 21;
        long j116 = j102 + j115;
        long j117 = j98 - (j115 << 21);
        long j118 = (j101 + 1048576) >> 21;
        long j119 = j101 - (j118 << 21);
        long j120 = (j118 * 666643) + j87;
        long j121 = (j118 * 470296) + j105;
        long j122 = (j118 * 654183) + j104;
        long j123 = j108 - (j118 * 997805);
        long j124 = j111 - (j118 * 683901);
        long j125 = j120 >> 21;
        long j126 = j121 + j125;
        long j127 = j120 - (j125 << 21);
        long j128 = j126 >> 21;
        long j129 = j122 + j128;
        long j130 = j126 - (j128 << 21);
        long j131 = j129 >> 21;
        long j132 = j123 + j131;
        long j133 = j129 - (j131 << 21);
        long j134 = j132 >> 21;
        long j135 = (j118 * 136657) + j107 + j134;
        long j136 = j132 - (j134 << 21);
        long j137 = j135 >> 21;
        long j138 = j124 + j137;
        long j139 = j135 - (j137 << 21);
        long j140 = j138 >> 21;
        long j141 = j110 + j140;
        long j142 = j138 - (j140 << 21);
        long j143 = j141 >> 21;
        long j144 = j114 + j143;
        long j145 = j141 - (j143 << 21);
        long j146 = j144 >> 21;
        long j147 = j113 + j146;
        long j148 = j144 - (j146 << 21);
        long j149 = j147 >> 21;
        long j150 = j117 + j149;
        long j151 = j147 - (j149 << 21);
        long j152 = j150 >> 21;
        long j153 = j116 + j152;
        long j154 = j150 - (j152 << 21);
        long j155 = j153 >> 21;
        long j156 = j119 + j155;
        long j157 = j153 - (j155 << 21);
        long j158 = j156 >> 21;
        long j159 = (666643 * j158) + j127;
        long j160 = j159 >> 21;
        long j161 = (470296 * j158) + j130 + j160;
        long j162 = j159 - (j160 << 21);
        long j163 = j161 >> 21;
        long j164 = (654183 * j158) + j133 + j163;
        long j165 = j161 - (j163 << 21);
        long j166 = j164 >> 21;
        long j167 = (j136 - (997805 * j158)) + j166;
        long j168 = j164 - (j166 << 21);
        long j169 = j167 >> 21;
        long j170 = (136657 * j158) + j139 + j169;
        long j171 = j167 - (j169 << 21);
        long j172 = j170 >> 21;
        long j173 = (j142 - (j158 * 683901)) + j172;
        long j174 = j170 - (j172 << 21);
        long j175 = j173 >> 21;
        long j176 = j145 + j175;
        long j177 = j173 - (j175 << 21);
        long j178 = j176 >> 21;
        long j179 = j148 + j178;
        long j180 = j176 - (j178 << 21);
        long j181 = j179 >> 21;
        long j182 = j151 + j181;
        long j183 = j179 - (j181 << 21);
        long j184 = j182 >> 21;
        long j185 = j154 + j184;
        long j186 = j182 - (j184 << 21);
        long j187 = j185 >> 21;
        long j188 = j157 + j187;
        long j189 = j185 - (j187 << 21);
        long j190 = j188 >> 21;
        long j191 = (j156 - (j158 << 21)) + j190;
        long j192 = j188 - (j190 << 21);
        return new byte[]{(byte) ((int) j162), (byte) ((int) (j162 >> 8)), (byte) ((int) ((j162 >> 16) | (j165 << 5))), (byte) ((int) (j165 >> 3)), (byte) ((int) (j165 >> 11)), (byte) ((int) ((j165 >> 19) | (j168 << 2))), (byte) ((int) (j168 >> 6)), (byte) ((int) ((j168 >> 14) | (j171 << 7))), (byte) ((int) (j171 >> 1)), (byte) ((int) (j171 >> 9)), (byte) ((int) ((j171 >> 17) | (j174 << 4))), (byte) ((int) (j174 >> 4)), (byte) ((int) (j174 >> 12)), (byte) ((int) ((j174 >> 20) | (j177 << 1))), (byte) ((int) (j177 >> 7)), (byte) ((int) ((j177 >> 15) | (j180 << 6))), (byte) ((int) (j180 >> 2)), (byte) ((int) (j180 >> 10)), (byte) ((int) ((j180 >> 18) | (j183 << 3))), (byte) ((int) (j183 >> 5)), (byte) ((int) (j183 >> 13)), (byte) ((int) j186), (byte) ((int) (j186 >> 8)), (byte) ((int) ((j186 >> 16) | (j189 << 5))), (byte) ((int) (j189 >> 3)), (byte) ((int) (j189 >> 11)), (byte) ((int) ((j189 >> 19) | (j192 << 2))), (byte) ((int) (j192 >> 6)), (byte) ((int) ((j192 >> 14) | (j191 << 7))), (byte) ((int) (j191 >> 1)), (byte) ((int) (j191 >> 9)), (byte) ((int) (j191 >> 17))};
    }

    public List k(String str) {
        e.D(str, "str");
        if (e.r(str, BuildConfig.FLAVOR)) {
            return o.f8966a;
        }
        List<String> y12 = fe.o.y1(str, new String[]{","});
        ArrayList arrayList = new ArrayList(nd.g.S0(y12));
        for (String add : y12) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public void onFailure(Exception exc) {
        o2.f7959e.g(String.format("Could not sync active asset packs. %s", new Object[]{exc}), new Object[0]);
    }

    public Object zza(IBinder iBinder) {
        int i = o6.e0.f9320a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof f0 ? (f0) queryLocalInterface : new d0(iBinder);
    }
}
