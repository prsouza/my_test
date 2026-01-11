package e2;

import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import d2.o;
import java.util.HashSet;
import java.util.Objects;
import u1.c;
import u1.p;
import u1.s;
import v1.b;
import v1.e;
import v1.f;
import v1.j;

public final class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public static final String f4537c = p.e("EnqueueRunnable");

    /* renamed from: a  reason: collision with root package name */
    public final f f4538a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4539b = new b();

    public d(f fVar) {
        this.f4538a = fVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x01ab A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(v1.f r21) {
        /*
            r0 = r21
            java.util.List<v1.f> r1 = r0.B
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0041
            java.util.Iterator r1 = r1.iterator()
            r4 = r2
        L_0x000d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0042
            java.lang.Object r5 = r1.next()
            v1.f r5 = (v1.f) r5
            boolean r6 = r5.C
            if (r6 != 0) goto L_0x0023
            boolean r5 = a(r5)
            r4 = r4 | r5
            goto L_0x000d
        L_0x0023:
            u1.p r6 = u1.p.c()
            java.lang.String r7 = f4537c
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.util.List<java.lang.String> r5 = r5.z
            java.lang.String r9 = ", "
            java.lang.String r5 = android.text.TextUtils.join(r9, r5)
            r8[r2] = r5
            java.lang.String r5 = "Already enqueued work ids (%s)."
            java.lang.String r5 = java.lang.String.format(r5, r8)
            java.lang.Throwable[] r8 = new java.lang.Throwable[r2]
            r6.f(r7, r5, r8)
            goto L_0x000d
        L_0x0041:
            r4 = r2
        L_0x0042:
            java.util.Set r1 = v1.f.t2(r21)
            v1.j r5 = r0.f12143v
            java.util.List<? extends u1.w> r6 = r0.f12146y
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r7)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r7 = r0.f12144w
            u1.g r8 = r0.f12145x
            long r9 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r11 = r5.f12152x
            if (r1 == 0) goto L_0x0063
            int r12 = r1.length
            if (r12 <= 0) goto L_0x0063
            r12 = r3
            goto L_0x0064
        L_0x0063:
            r12 = r2
        L_0x0064:
            if (r12 == 0) goto L_0x00b4
            int r13 = r1.length
            r14 = r2
            r16 = r14
            r17 = r16
            r15 = r3
        L_0x006d:
            if (r14 >= r13) goto L_0x00b9
            r2 = r1[r14]
            d2.p r18 = r11.w()
            r3 = r18
            d2.q r3 = (d2.q) r3
            d2.o r3 = r3.h(r2)
            if (r3 != 0) goto L_0x0098
            u1.p r1 = u1.p.c()
            java.lang.String r3 = f4537c
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r2
            java.lang.String r2 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r2, r6)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r5]
            r1.b(r3, r2, r6)
            goto L_0x0101
        L_0x0098:
            u1.v r2 = r3.f4294b
            u1.v r3 = u1.v.SUCCEEDED
            if (r2 != r3) goto L_0x00a0
            r3 = 1
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            r15 = r15 & r3
            u1.v r3 = u1.v.FAILED
            if (r2 != r3) goto L_0x00a9
            r16 = 1
            goto L_0x00af
        L_0x00a9:
            u1.v r3 = u1.v.CANCELLED
            if (r2 != r3) goto L_0x00af
            r17 = 1
        L_0x00af:
            int r14 = r14 + 1
            r2 = 0
            r3 = 1
            goto L_0x006d
        L_0x00b4:
            r15 = 1
            r16 = 0
            r17 = 0
        L_0x00b9:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00c5
            if (r12 != 0) goto L_0x00c5
            r3 = 1
            goto L_0x00c6
        L_0x00c5:
            r3 = 0
        L_0x00c6:
            if (r3 == 0) goto L_0x0202
            d2.p r3 = r11.w()
            d2.q r3 = (d2.q) r3
            java.util.List r3 = r3.i(r7)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r13 = r3.isEmpty()
            if (r13 != 0) goto L_0x0202
            u1.g r13 = u1.g.APPEND
            if (r8 == r13) goto L_0x0133
            u1.g r13 = u1.g.APPEND_OR_REPLACE
            if (r8 != r13) goto L_0x00e3
            goto L_0x0133
        L_0x00e3:
            u1.g r13 = u1.g.KEEP
            if (r8 != r13) goto L_0x0107
            java.util.Iterator r8 = r3.iterator()
        L_0x00eb:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x0107
            java.lang.Object r13 = r8.next()
            d2.o$a r13 = (d2.o.a) r13
            u1.v r13 = r13.f4310b
            u1.v r14 = u1.v.ENQUEUED
            if (r13 == r14) goto L_0x0101
            u1.v r14 = u1.v.RUNNING
            if (r13 != r14) goto L_0x00eb
        L_0x0101:
            r20 = r4
            r1 = 1
            r2 = 0
            goto L_0x032e
        L_0x0107:
            e2.b r8 = new e2.b
            r13 = 0
            r8.<init>(r5, r7, r13)
            r8.run()
            d2.p r5 = r11.w()
            java.util.Iterator r3 = r3.iterator()
        L_0x0118:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x012d
            java.lang.Object r8 = r3.next()
            d2.o$a r8 = (d2.o.a) r8
            java.lang.String r8 = r8.f4309a
            r13 = r5
            d2.q r13 = (d2.q) r13
            r13.a(r8)
            goto L_0x0118
        L_0x012d:
            r20 = r4
            r4 = 0
            r5 = 1
            goto L_0x0206
        L_0x0133:
            d2.b r5 = r11.r()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0140:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x01ba
            java.lang.Object r13 = r3.next()
            d2.o$a r13 = (d2.o.a) r13
            java.lang.String r14 = r13.f4309a
            r18 = r3
            r3 = r5
            d2.c r3 = (d2.c) r3
            java.util.Objects.requireNonNull(r3)
            r19 = r5
            java.lang.String r5 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r20 = r4
            r4 = 1
            h1.g0 r5 = h1.g0.e(r5, r4)
            if (r14 != 0) goto L_0x0167
            r5.D(r4)
            goto L_0x016a
        L_0x0167:
            r5.r(r4, r14)
        L_0x016a:
            h1.e0 r4 = r3.f4274a
            r4.b()
            h1.e0 r3 = r3.f4274a
            android.database.Cursor r3 = r3.o(r5)
            boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x01b2 }
            if (r4 == 0) goto L_0x0184
            r4 = 0
            int r14 = r3.getInt(r4)     // Catch:{ all -> 0x01b2 }
            if (r14 == 0) goto L_0x0185
            r14 = 1
            goto L_0x0186
        L_0x0184:
            r4 = 0
        L_0x0185:
            r14 = r4
        L_0x0186:
            r3.close()
            r5.release()
            if (r14 != 0) goto L_0x01ab
            u1.v r3 = r13.f4310b
            u1.v r5 = u1.v.SUCCEEDED
            if (r3 != r5) goto L_0x0196
            r5 = 1
            goto L_0x0197
        L_0x0196:
            r5 = r4
        L_0x0197:
            r5 = r5 & r15
            u1.v r14 = u1.v.FAILED
            if (r3 != r14) goto L_0x019f
            r16 = 1
            goto L_0x01a5
        L_0x019f:
            u1.v r14 = u1.v.CANCELLED
            if (r3 != r14) goto L_0x01a5
            r17 = 1
        L_0x01a5:
            java.lang.String r3 = r13.f4309a
            r12.add(r3)
            r15 = r5
        L_0x01ab:
            r3 = r18
            r5 = r19
            r4 = r20
            goto L_0x0140
        L_0x01b2:
            r0 = move-exception
            r3.close()
            r5.release()
            throw r0
        L_0x01ba:
            r20 = r4
            r4 = 0
            u1.g r3 = u1.g.APPEND_OR_REPLACE
            if (r8 != r3) goto L_0x01ef
            if (r17 != 0) goto L_0x01c5
            if (r16 == 0) goto L_0x01ef
        L_0x01c5:
            d2.p r3 = r11.w()
            d2.q r3 = (d2.q) r3
            java.util.List r5 = r3.i(r7)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x01d5:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01e7
            java.lang.Object r8 = r5.next()
            d2.o$a r8 = (d2.o.a) r8
            java.lang.String r8 = r8.f4309a
            r3.a(r8)
            goto L_0x01d5
        L_0x01e7:
            java.util.List r12 = java.util.Collections.emptyList()
            r5 = r4
            r17 = r5
            goto L_0x01f1
        L_0x01ef:
            r5 = r16
        L_0x01f1:
            java.lang.Object[] r1 = r12.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x01fe
            r16 = r5
            r12 = 1
            goto L_0x0205
        L_0x01fe:
            r12 = r4
            r16 = r5
            goto L_0x0205
        L_0x0202:
            r20 = r4
            r4 = 0
        L_0x0205:
            r5 = r4
        L_0x0206:
            java.util.Iterator r3 = r6.iterator()
        L_0x020a:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x032c
            java.lang.Object r6 = r3.next()
            u1.w r6 = (u1.w) r6
            d2.o r8 = r6.f11657b
            if (r12 == 0) goto L_0x022f
            if (r15 != 0) goto L_0x022f
            if (r16 == 0) goto L_0x0223
            u1.v r13 = u1.v.FAILED
            r8.f4294b = r13
            goto L_0x023c
        L_0x0223:
            if (r17 == 0) goto L_0x022a
            u1.v r13 = u1.v.CANCELLED
            r8.f4294b = r13
            goto L_0x023c
        L_0x022a:
            u1.v r13 = u1.v.BLOCKED
            r8.f4294b = r13
            goto L_0x023c
        L_0x022f:
            boolean r13 = r8.c()
            if (r13 != 0) goto L_0x0238
            r8.f4304n = r9
            goto L_0x023c
        L_0x0238:
            r13 = 0
            r8.f4304n = r13
        L_0x023c:
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 25
            if (r13 > r14) goto L_0x0245
            b(r8)
        L_0x0245:
            u1.v r13 = r8.f4294b
            u1.v r14 = u1.v.ENQUEUED
            if (r13 != r14) goto L_0x024c
            r5 = 1
        L_0x024c:
            d2.p r13 = r11.w()
            d2.q r13 = (d2.q) r13
            h1.e0 r14 = r13.f4311a
            r14.b()
            h1.e0 r14 = r13.f4311a
            r14.c()
            h1.o r14 = r13.f4312b     // Catch:{ all -> 0x0325 }
            r14.f(r8)     // Catch:{ all -> 0x0325 }
            h1.e0 r8 = r13.f4311a     // Catch:{ all -> 0x0325 }
            r8.p()     // Catch:{ all -> 0x0325 }
            h1.e0 r8 = r13.f4311a
            r8.l()
            if (r12 == 0) goto L_0x02aa
            int r8 = r1.length
            r13 = r4
        L_0x026f:
            if (r13 >= r8) goto L_0x02aa
            r14 = r1[r13]
            d2.a r4 = new d2.a
            r18 = r1
            java.lang.String r1 = r6.a()
            r4.<init>(r1, r14)
            d2.b r1 = r11.r()
            d2.c r1 = (d2.c) r1
            h1.e0 r14 = r1.f4274a
            r14.b()
            h1.e0 r14 = r1.f4274a
            r14.c()
            h1.o r14 = r1.f4275b     // Catch:{ all -> 0x02a3 }
            r14.f(r4)     // Catch:{ all -> 0x02a3 }
            h1.e0 r4 = r1.f4274a     // Catch:{ all -> 0x02a3 }
            r4.p()     // Catch:{ all -> 0x02a3 }
            h1.e0 r1 = r1.f4274a
            r1.l()
            int r13 = r13 + 1
            r1 = r18
            r4 = 0
            goto L_0x026f
        L_0x02a3:
            r0 = move-exception
            h1.e0 r1 = r1.f4274a
            r1.l()
            throw r0
        L_0x02aa:
            r18 = r1
            java.util.Set<java.lang.String> r1 = r6.f11658c
            java.util.Iterator r1 = r1.iterator()
        L_0x02b2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02ee
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            d2.s r8 = r11.x()
            d2.r r13 = new d2.r
            java.lang.String r14 = r6.a()
            r13.<init>(r4, r14)
            d2.t r8 = (d2.t) r8
            h1.e0 r4 = r8.f4320a
            r4.b()
            h1.e0 r4 = r8.f4320a
            r4.c()
            h1.o r4 = r8.f4321b     // Catch:{ all -> 0x02e7 }
            r4.f(r13)     // Catch:{ all -> 0x02e7 }
            h1.e0 r4 = r8.f4320a     // Catch:{ all -> 0x02e7 }
            r4.p()     // Catch:{ all -> 0x02e7 }
            h1.e0 r4 = r8.f4320a
            r4.l()
            goto L_0x02b2
        L_0x02e7:
            r0 = move-exception
            h1.e0 r1 = r8.f4320a
            r1.l()
            throw r0
        L_0x02ee:
            if (r2 == 0) goto L_0x0320
            d2.k r1 = r11.u()
            d2.j r4 = new d2.j
            java.lang.String r6 = r6.a()
            r4.<init>(r7, r6)
            d2.l r1 = (d2.l) r1
            h1.e0 r6 = r1.f4287a
            r6.b()
            h1.e0 r6 = r1.f4287a
            r6.c()
            h1.o r6 = r1.f4288b     // Catch:{ all -> 0x0319 }
            r6.f(r4)     // Catch:{ all -> 0x0319 }
            h1.e0 r4 = r1.f4287a     // Catch:{ all -> 0x0319 }
            r4.p()     // Catch:{ all -> 0x0319 }
            h1.e0 r1 = r1.f4287a
            r1.l()
            goto L_0x0320
        L_0x0319:
            r0 = move-exception
            h1.e0 r1 = r1.f4287a
            r1.l()
            throw r0
        L_0x0320:
            r1 = r18
            r4 = 0
            goto L_0x020a
        L_0x0325:
            r0 = move-exception
            h1.e0 r1 = r13.f4311a
            r1.l()
            throw r0
        L_0x032c:
            r2 = r5
            r1 = 1
        L_0x032e:
            r0.C = r1
            r0 = r20 | r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.d.a(v1.f):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public static void b(o oVar) {
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        c cVar = oVar.f4300j;
        String str = oVar.f4295c;
        if (str.equals(cls.getName())) {
            return;
        }
        if (cVar.f11629d || cVar.f11630e) {
            b.a aVar = new b.a();
            aVar.b(oVar.f4297e.f2651a);
            aVar.f2652a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            oVar.f4295c = cls.getName();
            oVar.f4297e = aVar.a();
        }
    }

    public final void run() {
        WorkDatabase workDatabase;
        try {
            f fVar = this.f4538a;
            Objects.requireNonNull(fVar);
            if (!f.s2(fVar, new HashSet())) {
                workDatabase = this.f4538a.f12143v.f12152x;
                workDatabase.c();
                boolean a10 = a(this.f4538a);
                workDatabase.p();
                workDatabase.l();
                if (a10) {
                    f.a(this.f4538a.f12143v.f12150v, RescheduleReceiver.class, true);
                    j jVar = this.f4538a.f12143v;
                    e.a(jVar.f12151w, jVar.f12152x, jVar.z);
                }
                this.f4539b.a(s.f11653a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f4538a}));
        } catch (Throwable th2) {
            this.f4539b.a(new s.b.a(th2));
        }
    }
}
