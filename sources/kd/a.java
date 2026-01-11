package kd;

import aa.b;
import android.content.Context;
import android.content.SharedPreferences;
import e6.e;
import java.util.Objects;
import md.m;
import se.a;
import se.k;
import se.q;
import te.n;
import te.p;
import yd.h;

public final class a {

    /* renamed from: kd.a$a  reason: collision with other inner class name */
    public static final class C0134a extends h implements xd.a<m> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f7499b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Context f7500c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ String f7501s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0134a(String str, Context context, String str2) {
            super(0);
            this.f7499b = str;
            this.f7500c = context;
            this.f7501s = str2;
        }

        public final Object c() {
            a.C0218a aVar = se.a.f11101b;
            String str = this.f7499b;
            Objects.requireNonNull(aVar);
            e.D(str, "string");
            k kVar = k.f11115b;
            te.h hVar = new te.h(str);
            Object D = b.D(new n(aVar, p.OBJ, hVar), kVar);
            if (hVar.f11581b == 12) {
                SharedPreferences.Editor edit = this.f7500c.getSharedPreferences("nodle-prefs", 0).edit();
                e.C(edit, "editor");
                a.b(edit, this.f7501s, (q) ((se.e) D));
                edit.apply();
                return m.f8555a;
            }
            throw new IllegalStateException(("Reader has not consumed the whole input: " + hVar).toString());
        }
    }

    public static final void a(Context context, String str, String str2) {
        e.D(context, "ctx");
        bf.b.b(new C0134a(str, context, str2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(android.content.SharedPreferences.Editor r5, java.lang.String r6, se.e r7) {
        /*
            boolean r0 = r7 instanceof se.q
            if (r0 == 0) goto L_0x003e
            se.q r7 = (se.q) r7
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x000e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r2 = 46
            r1.append(r2)
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r0 = r0.getValue()
            se.e r0 = (se.e) r0
            b(r5, r1, r0)
            goto L_0x000e
        L_0x003e:
            boolean r0 = r7 instanceof se.b
            if (r0 == 0) goto L_0x007d
            se.b r7 = (se.b) r7
            java.lang.String r0 = ".#length"
            java.lang.String r0 = e6.e.a0(r6, r0)
            int r1 = r7.size()
            r5.putInt(r0, r1)
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
        L_0x0056:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00cf
            int r1 = r0 + 1
            java.lang.Object r2 = r7.next()
            se.e r2 = (se.e) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = ".#"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            b(r5, r0, r2)
            r0 = r1
            goto L_0x0056
        L_0x007d:
            boolean r0 = r7 instanceof se.s
            if (r0 == 0) goto L_0x00cf
            se.s r7 = (se.s) r7
            boolean r0 = r7.e()
            r1 = 0
            if (r0 == 0) goto L_0x009a
            boolean r0 = r7 instanceof se.o
            if (r0 == 0) goto L_0x008f
            goto L_0x0093
        L_0x008f:
            java.lang.String r1 = r7.d()
        L_0x0093:
            if (r1 != 0) goto L_0x0096
            goto L_0x00cf
        L_0x0096:
            r5.putString(r6, r1)
            goto L_0x00cf
        L_0x009a:
            java.lang.String r0 = r7.d()
            java.lang.Boolean r0 = te.o.b(r0)
            if (r0 != 0) goto L_0x00a5
            goto L_0x00ac
        L_0x00a5:
            boolean r0 = r0.booleanValue()
            r5.putBoolean(r6, r0)
        L_0x00ac:
            java.lang.String r7 = r7.d()
            java.lang.String r0 = "<this>"
            e6.e.D(r7, r0)
            fe.c r0 = fe.d.f5101a     // Catch:{ NumberFormatException -> 0x00c5 }
            boolean r0 = r0.a(r7)     // Catch:{ NumberFormatException -> 0x00c5 }
            if (r0 == 0) goto L_0x00c5
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x00c5 }
            java.lang.Float r1 = java.lang.Float.valueOf(r7)     // Catch:{ NumberFormatException -> 0x00c5 }
        L_0x00c5:
            if (r1 != 0) goto L_0x00c8
            goto L_0x00cf
        L_0x00c8:
            float r7 = r1.floatValue()
            r5.putFloat(r6, r7)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.a.b(android.content.SharedPreferences$Editor, java.lang.String, se.e):void");
    }
}
