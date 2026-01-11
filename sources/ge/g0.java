package ge;

import aa.b;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.c;
import androidx.databinding.j;
import androidx.databinding.k;
import ca.d;
import com.google.android.gms.common.api.Api;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import de.i;
import g9.h;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import je.l;
import l6.b1;
import le.r;
import md.g;
import ne.a;
import pf.t;
import s7.e;

public final class g0 implements h, d, c, f8.c, v3.h, e, t {
    public static final long[] A = new long[0];
    public static final Object[] B = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f5390a = new g0();

    /* renamed from: b  reason: collision with root package name */
    public static final r f5391b = new r("NO_VALUE");

    /* renamed from: c  reason: collision with root package name */
    public static final b f5392c = new b();

    /* renamed from: s  reason: collision with root package name */
    public static final r f5393s = new r("UNLOCK_FAIL");

    /* renamed from: t  reason: collision with root package name */
    public static final r f5394t;

    /* renamed from: u  reason: collision with root package name */
    public static final r f5395u;

    /* renamed from: v  reason: collision with root package name */
    public static final a f5396v;

    /* renamed from: w  reason: collision with root package name */
    public static final a f5397w;

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ g0 f5398x = new g0();

    /* renamed from: y  reason: collision with root package name */
    public static final pe.e[] f5399y = new pe.e[0];
    public static final int[] z = new int[0];

    static {
        r rVar = new r("LOCKED");
        f5394t = rVar;
        r rVar2 = new r("UNLOCKED");
        f5395u = rVar2;
        f5396v = new a(rVar);
        f5397w = new a(rVar2);
    }

    public /* synthetic */ g0() {
    }

    public /* synthetic */ g0(g9.b bVar) {
    }

    public static je.h h(int i, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        ie.d dVar = (i10 & 4) != 0 ? ie.d.SUSPEND : null;
        boolean z10 = true;
        if (i >= 0) {
            if (i <= 0 && dVar != ie.d.SUSPEND) {
                z10 = false;
            }
            if (z10) {
                int i11 = i + 0;
                if (i11 < 0) {
                    i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                return new l(0, i11, dVar);
            }
            throw new IllegalArgumentException(e6.e.a0("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", dVar).toString());
        }
        throw new IllegalArgumentException(e6.e.a0("extraBufferCapacity cannot be negative, but was ", Integer.valueOf(i)).toString());
    }

    public static ne.b i() {
        return new ne.c(false);
    }

    public static int j(int[] iArr, int i, int i10) {
        int i11 = i - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 <= i10) {
                return i13;
            } else {
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static int k(long[] jArr, int i, long j10) {
        int i10 = i - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = (jArr[i12] > j10 ? 1 : (jArr[i12] == j10 ? 0 : -1));
            if (i13 < 0) {
                i11 = i12 + 1;
            } else if (i13 <= 0) {
                return i12;
            } else {
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final pe.e[] l(List list) {
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return f5399y;
        }
        Object[] array = list.toArray(new pe.e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (pe.e[]) array;
    }

    public static boolean m(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static final String n(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String o(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static int p(int i) {
        int i10 = i * 4;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        return i10 / 4;
    }

    public static int q(int i) {
        int i10 = i * 8;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        return i10 / 8;
    }

    public static final de.b r(i iVar) {
        de.c c10 = iVar.c();
        if (c10 instanceof de.b) {
            return (de.b) c10;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + c10).toString());
    }

    public static final String t(pd.d dVar) {
        String str;
        if (dVar instanceof le.e) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + o(dVar);
        } catch (Throwable th2) {
            str = b1.k(th2);
        }
        Throwable a10 = g.a(str);
        String str2 = str;
        if (a10 != null) {
            str2 = dVar.getClass().getName() + '@' + o(dVar);
        }
        return (String) str2;
    }

    public Object a() {
        return new ArrayList();
    }

    public void b(v3.i iVar) {
    }

    public k c(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
        e6.e.C(referenceQueue, "referenceQueue");
        return new j(viewDataBinding, i, referenceQueue).f1686c;
    }

    public void d(v3.i iVar) {
        iVar.onStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement[] e(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r4
            r6 = r3
        L_0x000d:
            int r7 = r15.length
            if (r4 >= r7) goto L_0x0066
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L_0x0054
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L_0x0026
            goto L_0x0037
        L_0x0026:
            r11 = r2
        L_0x0027:
            if (r11 >= r10) goto L_0x003c
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0039
        L_0x0037:
            r9 = r2
            goto L_0x003d
        L_0x0039:
            int r11 = r11 + 1
            goto L_0x0027
        L_0x003c:
            r9 = r3
        L_0x003d:
            if (r9 != 0) goto L_0x0040
            goto L_0x0054
        L_0x0040:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L_0x0050
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L_0x0050:
            int r8 = r8 + -1
            int r8 = r8 + r4
            goto L_0x005c
        L_0x0054:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r3
            r8 = r4
        L_0x005c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto L_0x000d
        L_0x0066:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L_0x006f
            return r0
        L_0x006f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.g0.e(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    public Object f(s7.c cVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(cVar);
    }

    public Integer s(ca.b bVar) {
        int d10 = bVar.d();
        ca.a byValue = ca.a.byValue((byte) (d10 & 3));
        if (byValue == ca.a.SINGLE) {
            return Integer.valueOf(d10 >> 2);
        }
        if (byValue == ca.a.TWO) {
            return Integer.valueOf((d10 >> 2) + (bVar.d() << 6));
        }
        if (byValue == ca.a.FOUR) {
            return Integer.valueOf((d10 >> 2) + (bVar.d() << 6) + (bVar.d() << 14) + (bVar.d() << 22));
        }
        throw new UnsupportedOperationException("Mode " + byValue + " is not implemented");
    }
}
