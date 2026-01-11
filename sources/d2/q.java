package d2;

import android.database.Cursor;
import d2.o;
import h1.e0;
import h1.g0;
import h1.i0;
import h1.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import u1.v;

public final class q implements p {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f4311a;

    /* renamed from: b  reason: collision with root package name */
    public final o f4312b;

    /* renamed from: c  reason: collision with root package name */
    public final b f4313c;

    /* renamed from: d  reason: collision with root package name */
    public final c f4314d;

    /* renamed from: e  reason: collision with root package name */
    public final d f4315e;

    /* renamed from: f  reason: collision with root package name */
    public final e f4316f;
    public final f g;

    /* renamed from: h  reason: collision with root package name */
    public final g f4317h;
    public final h i;

    public class a extends o {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.ObjectOutputStream} */
        /* JADX WARNING: type inference failed for: r3v2 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: type inference failed for: r0v15, types: [java.util.HashSet, java.util.Set<u1.d$a>] */
        /* JADX WARNING: type inference failed for: r3v21 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01ca A[SYNTHETIC, Splitter:B:79:0x01ca] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01dd  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01ed A[SYNTHETIC, Splitter:B:90:0x01ed] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(l1.e r19, java.lang.Object r20) {
            /*
                r18 = this;
                r1 = r19
                r0 = r20
                d2.o r0 = (d2.o) r0
                java.lang.String r2 = r0.f4293a
                r3 = 1
                if (r2 != 0) goto L_0x000f
                r1.D(r3)
                goto L_0x0012
            L_0x000f:
                r1.r(r3, r2)
            L_0x0012:
                u1.v r2 = r0.f4294b
                int r2 = d2.u.f(r2)
                long r4 = (long) r2
                r2 = 2
                r1.X(r2, r4)
                java.lang.String r4 = r0.f4295c
                r5 = 3
                if (r4 != 0) goto L_0x0026
                r1.D(r5)
                goto L_0x0029
            L_0x0026:
                r1.r(r5, r4)
            L_0x0029:
                java.lang.String r4 = r0.f4296d
                r6 = 4
                if (r4 != 0) goto L_0x0032
                r1.D(r6)
                goto L_0x0035
            L_0x0032:
                r1.r(r6, r4)
            L_0x0035:
                androidx.work.b r4 = r0.f4297e
                byte[] r4 = androidx.work.b.b(r4)
                r7 = 5
                if (r4 != 0) goto L_0x0042
                r1.D(r7)
                goto L_0x0045
            L_0x0042:
                r1.g0(r7, r4)
            L_0x0045:
                androidx.work.b r4 = r0.f4298f
                byte[] r4 = androidx.work.b.b(r4)
                r8 = 6
                if (r4 != 0) goto L_0x0052
                r1.D(r8)
                goto L_0x0055
            L_0x0052:
                r1.g0(r8, r4)
            L_0x0055:
                r4 = 7
                long r8 = r0.g
                r1.X(r4, r8)
                r4 = 8
                long r8 = r0.f4299h
                r1.X(r4, r8)
                r4 = 9
                long r8 = r0.i
                r1.X(r4, r8)
                r4 = 10
                int r8 = r0.f4301k
                long r8 = (long) r8
                r1.X(r4, r8)
                u1.a r4 = r0.f4302l
                int[] r8 = d2.u.a.f4323b
                int r9 = r4.ordinal()
                r8 = r8[r9]
                java.lang.String r9 = " to int"
                java.lang.String r10 = "Could not convert "
                if (r8 == r3) goto L_0x009d
                if (r8 != r2) goto L_0x0085
                r4 = r3
                goto L_0x009e
            L_0x0085:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r4)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x009d:
                r4 = 0
            L_0x009e:
                r8 = 11
                long r12 = (long) r4
                r1.X(r8, r12)
                r4 = 12
                long r12 = r0.f4303m
                r1.X(r4, r12)
                r4 = 13
                long r12 = r0.f4304n
                r1.X(r4, r12)
                r4 = 14
                long r12 = r0.f4305o
                r1.X(r4, r12)
                r4 = 15
                long r12 = r0.f4306p
                r1.X(r4, r12)
                boolean r4 = r0.f4307q
                r8 = 16
                long r12 = (long) r4
                r1.X(r8, r12)
                u1.t r4 = r0.f4308r
                int[] r8 = d2.u.a.f4325d
                int r12 = r4.ordinal()
                r8 = r8[r12]
                if (r8 == r3) goto L_0x00f0
                if (r8 != r2) goto L_0x00d8
                r4 = r3
                goto L_0x00f1
            L_0x00d8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r4)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00f0:
                r4 = 0
            L_0x00f1:
                r8 = 17
                long r12 = (long) r4
                r1.X(r8, r12)
                u1.c r0 = r0.f4300j
                r4 = 22
                r8 = 21
                r12 = 20
                r13 = 19
                r14 = 18
                if (r0 == 0) goto L_0x0200
                u1.q r15 = r0.f11626a
                int[] r16 = d2.u.a.f4324c
                int r17 = r15.ordinal()
                r11 = r16[r17]
                if (r11 == r3) goto L_0x0143
                if (r11 == r2) goto L_0x0144
                if (r11 == r5) goto L_0x0141
                if (r11 == r6) goto L_0x013f
                if (r11 == r7) goto L_0x013d
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r2 < r3) goto L_0x0125
                u1.q r2 = u1.q.TEMPORARILY_UNMETERED
                if (r15 != r2) goto L_0x0125
                r3 = r7
                goto L_0x0144
            L_0x0125:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r15)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x013d:
                r3 = r6
                goto L_0x0144
            L_0x013f:
                r3 = r5
                goto L_0x0144
            L_0x0141:
                r3 = r2
                goto L_0x0144
            L_0x0143:
                r3 = 0
            L_0x0144:
                long r2 = (long) r3
                r1.X(r14, r2)
                boolean r2 = r0.f11627b
                long r2 = (long) r2
                r1.X(r13, r2)
                boolean r2 = r0.f11628c
                long r2 = (long) r2
                r1.X(r12, r2)
                boolean r2 = r0.f11629d
                long r2 = (long) r2
                r1.X(r8, r2)
                boolean r2 = r0.f11630e
                long r2 = (long) r2
                r1.X(r4, r2)
                long r2 = r0.f11631f
                r4 = 23
                r1.X(r4, r2)
                long r2 = r0.g
                r4 = 24
                r1.X(r4, r2)
                u1.d r0 = r0.f11632h
                int r2 = r0.a()
                r3 = 0
                if (r2 != 0) goto L_0x0179
                goto L_0x01db
            L_0x0179:
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
                r2.<init>()
                java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x01c4 }
                r4.<init>(r2)     // Catch:{ IOException -> 0x01c4 }
                int r3 = r0.a()     // Catch:{ IOException -> 0x01ad, all -> 0x01ab }
                r4.writeInt(r3)     // Catch:{ IOException -> 0x01ad, all -> 0x01ab }
                java.util.Set<u1.d$a> r0 = r0.f11637a     // Catch:{ IOException -> 0x01ad, all -> 0x01ab }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01ad, all -> 0x01ab }
            L_0x0190:
                boolean r3 = r0.hasNext()     // Catch:{ IOException -> 0x01ad, all -> 0x01ab }
                if (r3 == 0) goto L_0x01af
                java.lang.Object r3 = r0.next()     // Catch:{ IOException -> 0x01ad, all -> 0x01ab }
                u1.d$a r3 = (u1.d.a) r3     // Catch:{ IOException -> 0x01ad, all -> 0x01ab }
                android.net.Uri r5 = r3.f11638a     // Catch:{ IOException -> 0x01ad, all -> 0x01ab }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x01ad, all -> 0x01ab }
                r4.writeUTF(r5)     // Catch:{ IOException -> 0x01ad, all -> 0x01ab }
                boolean r3 = r3.f11639b     // Catch:{ IOException -> 0x01ad, all -> 0x01ab }
                r4.writeBoolean(r3)     // Catch:{ IOException -> 0x01ad, all -> 0x01ab }
                goto L_0x0190
            L_0x01ab:
                r0 = move-exception
                goto L_0x01be
            L_0x01ad:
                r0 = move-exception
                goto L_0x01c0
            L_0x01af:
                r4.close()     // Catch:{ IOException -> 0x01b3 }
                goto L_0x01b8
            L_0x01b3:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01b8:
                r2.close()     // Catch:{ IOException -> 0x01bc }
                goto L_0x01d7
            L_0x01bc:
                r0 = move-exception
                goto L_0x01d4
            L_0x01be:
                r1 = r0
                goto L_0x01eb
            L_0x01c0:
                r3 = r4
                goto L_0x01c5
            L_0x01c2:
                r0 = move-exception
                goto L_0x01e9
            L_0x01c4:
                r0 = move-exception
            L_0x01c5:
                r0.printStackTrace()     // Catch:{ all -> 0x01c2 }
                if (r3 == 0) goto L_0x01b8
                r3.close()     // Catch:{ IOException -> 0x01ce }
                goto L_0x01b8
            L_0x01ce:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
                goto L_0x01b8
            L_0x01d4:
                r0.printStackTrace()
            L_0x01d7:
                byte[] r3 = r2.toByteArray()
            L_0x01db:
                if (r3 != 0) goto L_0x01e3
                r2 = 25
                r1.D(r2)
                goto L_0x021e
            L_0x01e3:
                r2 = 25
                r1.g0(r2, r3)
                goto L_0x021e
            L_0x01e9:
                r1 = r0
                r4 = r3
            L_0x01eb:
                if (r4 == 0) goto L_0x01f6
                r4.close()     // Catch:{ IOException -> 0x01f1 }
                goto L_0x01f6
            L_0x01f1:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01f6:
                r2.close()     // Catch:{ IOException -> 0x01fa }
                goto L_0x01ff
            L_0x01fa:
                r0 = move-exception
                r2 = r0
                r2.printStackTrace()
            L_0x01ff:
                throw r1
            L_0x0200:
                r1.D(r14)
                r1.D(r13)
                r1.D(r12)
                r1.D(r8)
                r1.D(r4)
                r0 = 23
                r1.D(r0)
                r0 = 24
                r1.D(r0)
                r2 = 25
                r1.D(r2)
            L_0x021e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d2.q.a.e(l1.e, java.lang.Object):void");
        }
    }

    public class b extends i0 {
        public b(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class c extends i0 {
        public c(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class d extends i0 {
        public d(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    public class e extends i0 {
        public e(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class f extends i0 {
        public f(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class g extends i0 {
        public g(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class h extends i0 {
        public h(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public q(e0 e0Var) {
        this.f4311a = e0Var;
        this.f4312b = new a(e0Var);
        this.f4313c = new b(e0Var);
        this.f4314d = new c(e0Var);
        this.f4315e = new d(e0Var);
        this.f4316f = new e(e0Var);
        this.g = new f(e0Var);
        this.f4317h = new g(e0Var);
        this.i = new h(e0Var);
        new AtomicBoolean(false);
    }

    public final void a(String str) {
        this.f4311a.b();
        l1.e a10 = this.f4313c.a();
        if (str == null) {
            a10.D(1);
        } else {
            a10.r(1, str);
        }
        this.f4311a.c();
        try {
            a10.x();
            this.f4311a.p();
        } finally {
            this.f4311a.l();
            this.f4313c.d(a10);
        }
    }

    public final List b() {
        g0 g0Var;
        g0 e10 = g0.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        e10.X(1, (long) 200);
        this.f4311a.b();
        Cursor o4 = this.f4311a.o(e10);
        try {
            int a10 = j1.b.a(o4, "required_network_type");
            int a11 = j1.b.a(o4, "requires_charging");
            int a12 = j1.b.a(o4, "requires_device_idle");
            int a13 = j1.b.a(o4, "requires_battery_not_low");
            int a14 = j1.b.a(o4, "requires_storage_not_low");
            int a15 = j1.b.a(o4, "trigger_content_update_delay");
            int a16 = j1.b.a(o4, "trigger_max_content_delay");
            int a17 = j1.b.a(o4, "content_uri_triggers");
            int a18 = j1.b.a(o4, "id");
            int a19 = j1.b.a(o4, "state");
            int a20 = j1.b.a(o4, "worker_class_name");
            int a21 = j1.b.a(o4, "input_merger_class_name");
            int a22 = j1.b.a(o4, "input");
            int a23 = j1.b.a(o4, "output");
            g0Var = e10;
            try {
                int a24 = j1.b.a(o4, "initial_delay");
                int a25 = j1.b.a(o4, "interval_duration");
                int a26 = j1.b.a(o4, "flex_duration");
                int a27 = j1.b.a(o4, "run_attempt_count");
                int a28 = j1.b.a(o4, "backoff_policy");
                int a29 = j1.b.a(o4, "backoff_delay_duration");
                int a30 = j1.b.a(o4, "period_start_time");
                int a31 = j1.b.a(o4, "minimum_retention_duration");
                int a32 = j1.b.a(o4, "schedule_requested_at");
                int a33 = j1.b.a(o4, "run_in_foreground");
                int a34 = j1.b.a(o4, "out_of_quota_policy");
                int i10 = a23;
                ArrayList arrayList = new ArrayList(o4.getCount());
                while (o4.moveToNext()) {
                    String string = o4.getString(a18);
                    int i11 = a18;
                    String string2 = o4.getString(a20);
                    int i12 = a20;
                    u1.c cVar = new u1.c();
                    int i13 = a10;
                    cVar.f11626a = u.c(o4.getInt(a10));
                    cVar.f11627b = o4.getInt(a11) != 0;
                    cVar.f11628c = o4.getInt(a12) != 0;
                    cVar.f11629d = o4.getInt(a13) != 0;
                    cVar.f11630e = o4.getInt(a14) != 0;
                    int i14 = a11;
                    int i15 = a12;
                    cVar.f11631f = o4.getLong(a15);
                    cVar.g = o4.getLong(a16);
                    cVar.f11632h = u.a(o4.getBlob(a17));
                    o oVar = new o(string, string2);
                    oVar.f4294b = u.e(o4.getInt(a19));
                    oVar.f4296d = o4.getString(a21);
                    oVar.f4297e = androidx.work.b.a(o4.getBlob(a22));
                    int i16 = i10;
                    oVar.f4298f = androidx.work.b.a(o4.getBlob(i16));
                    int i17 = i14;
                    i10 = i16;
                    int i18 = a24;
                    oVar.g = o4.getLong(i18);
                    int i19 = a22;
                    int i20 = a25;
                    oVar.f4299h = o4.getLong(i20);
                    int i21 = i18;
                    int i22 = a13;
                    int i23 = a26;
                    oVar.i = o4.getLong(i23);
                    int i24 = a27;
                    oVar.f4301k = o4.getInt(i24);
                    int i25 = a28;
                    int i26 = i20;
                    oVar.f4302l = u.b(o4.getInt(i25));
                    a26 = i23;
                    int i27 = i22;
                    int i28 = a29;
                    oVar.f4303m = o4.getLong(i28);
                    int i29 = i24;
                    int i30 = i25;
                    int i31 = a30;
                    oVar.f4304n = o4.getLong(i31);
                    int i32 = i28;
                    a30 = i31;
                    int i33 = a31;
                    oVar.f4305o = o4.getLong(i33);
                    int i34 = i29;
                    int i35 = a32;
                    oVar.f4306p = o4.getLong(i35);
                    int i36 = a33;
                    oVar.f4307q = o4.getInt(i36) != 0;
                    int i37 = a34;
                    int i38 = i35;
                    oVar.f4308r = u.d(o4.getInt(i37));
                    oVar.f4300j = cVar;
                    arrayList.add(oVar);
                    a34 = i37;
                    a11 = i17;
                    a22 = i19;
                    a24 = i21;
                    a25 = i26;
                    a27 = i34;
                    a32 = i38;
                    a18 = i11;
                    a20 = i12;
                    a10 = i13;
                    a33 = i36;
                    a31 = i33;
                    a12 = i15;
                    int i39 = i30;
                    a29 = i32;
                    a13 = i27;
                    a28 = i39;
                }
                o4.close();
                g0Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                o4.close();
                g0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            g0Var = e10;
            o4.close();
            g0Var.release();
            throw th;
        }
    }

    public final List<o> c(int i10) {
        g0 g0Var;
        g0 e10 = g0.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        e10.X(1, (long) i10);
        this.f4311a.b();
        Cursor o4 = this.f4311a.o(e10);
        try {
            int a10 = j1.b.a(o4, "required_network_type");
            int a11 = j1.b.a(o4, "requires_charging");
            int a12 = j1.b.a(o4, "requires_device_idle");
            int a13 = j1.b.a(o4, "requires_battery_not_low");
            int a14 = j1.b.a(o4, "requires_storage_not_low");
            int a15 = j1.b.a(o4, "trigger_content_update_delay");
            int a16 = j1.b.a(o4, "trigger_max_content_delay");
            int a17 = j1.b.a(o4, "content_uri_triggers");
            int a18 = j1.b.a(o4, "id");
            int a19 = j1.b.a(o4, "state");
            int a20 = j1.b.a(o4, "worker_class_name");
            int a21 = j1.b.a(o4, "input_merger_class_name");
            int a22 = j1.b.a(o4, "input");
            int a23 = j1.b.a(o4, "output");
            g0Var = e10;
            try {
                int a24 = j1.b.a(o4, "initial_delay");
                int a25 = j1.b.a(o4, "interval_duration");
                int a26 = j1.b.a(o4, "flex_duration");
                int a27 = j1.b.a(o4, "run_attempt_count");
                int a28 = j1.b.a(o4, "backoff_policy");
                int a29 = j1.b.a(o4, "backoff_delay_duration");
                int a30 = j1.b.a(o4, "period_start_time");
                int a31 = j1.b.a(o4, "minimum_retention_duration");
                int a32 = j1.b.a(o4, "schedule_requested_at");
                int a33 = j1.b.a(o4, "run_in_foreground");
                int a34 = j1.b.a(o4, "out_of_quota_policy");
                int i11 = a23;
                ArrayList arrayList = new ArrayList(o4.getCount());
                while (o4.moveToNext()) {
                    String string = o4.getString(a18);
                    int i12 = a18;
                    String string2 = o4.getString(a20);
                    int i13 = a20;
                    u1.c cVar = new u1.c();
                    int i14 = a10;
                    cVar.f11626a = u.c(o4.getInt(a10));
                    cVar.f11627b = o4.getInt(a11) != 0;
                    cVar.f11628c = o4.getInt(a12) != 0;
                    cVar.f11629d = o4.getInt(a13) != 0;
                    cVar.f11630e = o4.getInt(a14) != 0;
                    int i15 = a11;
                    int i16 = a12;
                    cVar.f11631f = o4.getLong(a15);
                    cVar.g = o4.getLong(a16);
                    cVar.f11632h = u.a(o4.getBlob(a17));
                    o oVar = new o(string, string2);
                    oVar.f4294b = u.e(o4.getInt(a19));
                    oVar.f4296d = o4.getString(a21);
                    oVar.f4297e = androidx.work.b.a(o4.getBlob(a22));
                    int i17 = i11;
                    oVar.f4298f = androidx.work.b.a(o4.getBlob(i17));
                    int i18 = a24;
                    int i19 = i15;
                    i11 = i17;
                    oVar.g = o4.getLong(i18);
                    int i20 = a22;
                    int i21 = a25;
                    oVar.f4299h = o4.getLong(i21);
                    int i22 = i18;
                    int i23 = a13;
                    int i24 = a26;
                    oVar.i = o4.getLong(i24);
                    int i25 = a27;
                    oVar.f4301k = o4.getInt(i25);
                    int i26 = a28;
                    int i27 = i21;
                    oVar.f4302l = u.b(o4.getInt(i26));
                    a26 = i24;
                    int i28 = i23;
                    int i29 = a29;
                    oVar.f4303m = o4.getLong(i29);
                    int i30 = i25;
                    int i31 = i26;
                    int i32 = a30;
                    oVar.f4304n = o4.getLong(i32);
                    int i33 = i29;
                    a30 = i32;
                    int i34 = a31;
                    oVar.f4305o = o4.getLong(i34);
                    int i35 = i30;
                    int i36 = a32;
                    oVar.f4306p = o4.getLong(i36);
                    int i37 = a33;
                    oVar.f4307q = o4.getInt(i37) != 0;
                    int i38 = a34;
                    int i39 = i36;
                    oVar.f4308r = u.d(o4.getInt(i38));
                    oVar.f4300j = cVar;
                    arrayList.add(oVar);
                    a11 = i19;
                    a34 = i38;
                    a22 = i20;
                    a24 = i22;
                    a25 = i27;
                    a27 = i35;
                    a32 = i39;
                    a18 = i12;
                    a20 = i13;
                    a10 = i14;
                    a33 = i37;
                    a31 = i34;
                    a12 = i16;
                    int i40 = i31;
                    a29 = i33;
                    a13 = i28;
                    a28 = i40;
                }
                o4.close();
                g0Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                o4.close();
                g0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            g0Var = e10;
            o4.close();
            g0Var.release();
            throw th;
        }
    }

    public final List<o> d() {
        g0 g0Var;
        g0 e10 = g0.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f4311a.b();
        Cursor o4 = this.f4311a.o(e10);
        try {
            int a10 = j1.b.a(o4, "required_network_type");
            int a11 = j1.b.a(o4, "requires_charging");
            int a12 = j1.b.a(o4, "requires_device_idle");
            int a13 = j1.b.a(o4, "requires_battery_not_low");
            int a14 = j1.b.a(o4, "requires_storage_not_low");
            int a15 = j1.b.a(o4, "trigger_content_update_delay");
            int a16 = j1.b.a(o4, "trigger_max_content_delay");
            int a17 = j1.b.a(o4, "content_uri_triggers");
            int a18 = j1.b.a(o4, "id");
            int a19 = j1.b.a(o4, "state");
            int a20 = j1.b.a(o4, "worker_class_name");
            int a21 = j1.b.a(o4, "input_merger_class_name");
            int a22 = j1.b.a(o4, "input");
            int a23 = j1.b.a(o4, "output");
            g0Var = e10;
            try {
                int a24 = j1.b.a(o4, "initial_delay");
                int a25 = j1.b.a(o4, "interval_duration");
                int a26 = j1.b.a(o4, "flex_duration");
                int a27 = j1.b.a(o4, "run_attempt_count");
                int a28 = j1.b.a(o4, "backoff_policy");
                int a29 = j1.b.a(o4, "backoff_delay_duration");
                int a30 = j1.b.a(o4, "period_start_time");
                int a31 = j1.b.a(o4, "minimum_retention_duration");
                int a32 = j1.b.a(o4, "schedule_requested_at");
                int a33 = j1.b.a(o4, "run_in_foreground");
                int a34 = j1.b.a(o4, "out_of_quota_policy");
                int i10 = a23;
                ArrayList arrayList = new ArrayList(o4.getCount());
                while (o4.moveToNext()) {
                    String string = o4.getString(a18);
                    int i11 = a18;
                    String string2 = o4.getString(a20);
                    int i12 = a20;
                    u1.c cVar = new u1.c();
                    int i13 = a10;
                    cVar.f11626a = u.c(o4.getInt(a10));
                    cVar.f11627b = o4.getInt(a11) != 0;
                    cVar.f11628c = o4.getInt(a12) != 0;
                    cVar.f11629d = o4.getInt(a13) != 0;
                    cVar.f11630e = o4.getInt(a14) != 0;
                    int i14 = a11;
                    int i15 = a12;
                    cVar.f11631f = o4.getLong(a15);
                    cVar.g = o4.getLong(a16);
                    cVar.f11632h = u.a(o4.getBlob(a17));
                    o oVar = new o(string, string2);
                    oVar.f4294b = u.e(o4.getInt(a19));
                    oVar.f4296d = o4.getString(a21);
                    oVar.f4297e = androidx.work.b.a(o4.getBlob(a22));
                    int i16 = i10;
                    oVar.f4298f = androidx.work.b.a(o4.getBlob(i16));
                    int i17 = i14;
                    i10 = i16;
                    int i18 = a24;
                    oVar.g = o4.getLong(i18);
                    int i19 = a22;
                    int i20 = a25;
                    oVar.f4299h = o4.getLong(i20);
                    int i21 = i18;
                    int i22 = a13;
                    int i23 = a26;
                    oVar.i = o4.getLong(i23);
                    int i24 = a27;
                    oVar.f4301k = o4.getInt(i24);
                    int i25 = a28;
                    int i26 = i20;
                    oVar.f4302l = u.b(o4.getInt(i25));
                    a26 = i23;
                    int i27 = i22;
                    int i28 = a29;
                    oVar.f4303m = o4.getLong(i28);
                    int i29 = i24;
                    int i30 = i25;
                    int i31 = a30;
                    oVar.f4304n = o4.getLong(i31);
                    int i32 = i28;
                    a30 = i31;
                    int i33 = a31;
                    oVar.f4305o = o4.getLong(i33);
                    int i34 = i29;
                    int i35 = a32;
                    oVar.f4306p = o4.getLong(i35);
                    int i36 = a33;
                    oVar.f4307q = o4.getInt(i36) != 0;
                    int i37 = a34;
                    int i38 = i35;
                    oVar.f4308r = u.d(o4.getInt(i37));
                    oVar.f4300j = cVar;
                    arrayList.add(oVar);
                    a34 = i37;
                    a11 = i17;
                    a22 = i19;
                    a24 = i21;
                    a25 = i26;
                    a27 = i34;
                    a32 = i38;
                    a18 = i11;
                    a20 = i12;
                    a10 = i13;
                    a33 = i36;
                    a31 = i33;
                    a12 = i15;
                    int i39 = i30;
                    a29 = i32;
                    a13 = i27;
                    a28 = i39;
                }
                o4.close();
                g0Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                o4.close();
                g0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            g0Var = e10;
            o4.close();
            g0Var.release();
            throw th;
        }
    }

    public final List<o> e() {
        g0 g0Var;
        g0 e10 = g0.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f4311a.b();
        Cursor o4 = this.f4311a.o(e10);
        try {
            int a10 = j1.b.a(o4, "required_network_type");
            int a11 = j1.b.a(o4, "requires_charging");
            int a12 = j1.b.a(o4, "requires_device_idle");
            int a13 = j1.b.a(o4, "requires_battery_not_low");
            int a14 = j1.b.a(o4, "requires_storage_not_low");
            int a15 = j1.b.a(o4, "trigger_content_update_delay");
            int a16 = j1.b.a(o4, "trigger_max_content_delay");
            int a17 = j1.b.a(o4, "content_uri_triggers");
            int a18 = j1.b.a(o4, "id");
            int a19 = j1.b.a(o4, "state");
            int a20 = j1.b.a(o4, "worker_class_name");
            int a21 = j1.b.a(o4, "input_merger_class_name");
            int a22 = j1.b.a(o4, "input");
            int a23 = j1.b.a(o4, "output");
            g0Var = e10;
            try {
                int a24 = j1.b.a(o4, "initial_delay");
                int a25 = j1.b.a(o4, "interval_duration");
                int a26 = j1.b.a(o4, "flex_duration");
                int a27 = j1.b.a(o4, "run_attempt_count");
                int a28 = j1.b.a(o4, "backoff_policy");
                int a29 = j1.b.a(o4, "backoff_delay_duration");
                int a30 = j1.b.a(o4, "period_start_time");
                int a31 = j1.b.a(o4, "minimum_retention_duration");
                int a32 = j1.b.a(o4, "schedule_requested_at");
                int a33 = j1.b.a(o4, "run_in_foreground");
                int a34 = j1.b.a(o4, "out_of_quota_policy");
                int i10 = a23;
                ArrayList arrayList = new ArrayList(o4.getCount());
                while (o4.moveToNext()) {
                    String string = o4.getString(a18);
                    int i11 = a18;
                    String string2 = o4.getString(a20);
                    int i12 = a20;
                    u1.c cVar = new u1.c();
                    int i13 = a10;
                    cVar.f11626a = u.c(o4.getInt(a10));
                    cVar.f11627b = o4.getInt(a11) != 0;
                    cVar.f11628c = o4.getInt(a12) != 0;
                    cVar.f11629d = o4.getInt(a13) != 0;
                    cVar.f11630e = o4.getInt(a14) != 0;
                    int i14 = a11;
                    int i15 = a12;
                    cVar.f11631f = o4.getLong(a15);
                    cVar.g = o4.getLong(a16);
                    cVar.f11632h = u.a(o4.getBlob(a17));
                    o oVar = new o(string, string2);
                    oVar.f4294b = u.e(o4.getInt(a19));
                    oVar.f4296d = o4.getString(a21);
                    oVar.f4297e = androidx.work.b.a(o4.getBlob(a22));
                    int i16 = i10;
                    oVar.f4298f = androidx.work.b.a(o4.getBlob(i16));
                    int i17 = i14;
                    i10 = i16;
                    int i18 = a24;
                    oVar.g = o4.getLong(i18);
                    int i19 = a22;
                    int i20 = a25;
                    oVar.f4299h = o4.getLong(i20);
                    int i21 = i18;
                    int i22 = a13;
                    int i23 = a26;
                    oVar.i = o4.getLong(i23);
                    int i24 = a27;
                    oVar.f4301k = o4.getInt(i24);
                    int i25 = a28;
                    int i26 = i20;
                    oVar.f4302l = u.b(o4.getInt(i25));
                    a26 = i23;
                    int i27 = i22;
                    int i28 = a29;
                    oVar.f4303m = o4.getLong(i28);
                    int i29 = i24;
                    int i30 = i25;
                    int i31 = a30;
                    oVar.f4304n = o4.getLong(i31);
                    int i32 = i28;
                    a30 = i31;
                    int i33 = a31;
                    oVar.f4305o = o4.getLong(i33);
                    int i34 = i29;
                    int i35 = a32;
                    oVar.f4306p = o4.getLong(i35);
                    int i36 = a33;
                    oVar.f4307q = o4.getInt(i36) != 0;
                    int i37 = a34;
                    int i38 = i35;
                    oVar.f4308r = u.d(o4.getInt(i37));
                    oVar.f4300j = cVar;
                    arrayList.add(oVar);
                    a34 = i37;
                    a11 = i17;
                    a22 = i19;
                    a24 = i21;
                    a25 = i26;
                    a27 = i34;
                    a32 = i38;
                    a18 = i11;
                    a20 = i12;
                    a10 = i13;
                    a33 = i36;
                    a31 = i33;
                    a12 = i15;
                    int i39 = i30;
                    a29 = i32;
                    a13 = i27;
                    a28 = i39;
                }
                o4.close();
                g0Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                o4.close();
                g0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            g0Var = e10;
            o4.close();
            g0Var.release();
            throw th;
        }
    }

    public final v f(String str) {
        g0 e10 = g0.e("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            e10.D(1);
        } else {
            e10.r(1, str);
        }
        this.f4311a.b();
        v vVar = null;
        Cursor o4 = this.f4311a.o(e10);
        try {
            if (o4.moveToFirst()) {
                vVar = u.e(o4.getInt(0));
            }
            return vVar;
        } finally {
            o4.close();
            e10.release();
        }
    }

    public final List<String> g(String str) {
        g0 e10 = g0.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e10.D(1);
        } else {
            e10.r(1, str);
        }
        this.f4311a.b();
        Cursor o4 = this.f4311a.o(e10);
        try {
            ArrayList arrayList = new ArrayList(o4.getCount());
            while (o4.moveToNext()) {
                arrayList.add(o4.getString(0));
            }
            return arrayList;
        } finally {
            o4.close();
            e10.release();
        }
    }

    public final o h(String str) {
        g0 g0Var;
        o oVar;
        String str2 = str;
        g0 e10 = g0.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            e10.D(1);
        } else {
            e10.r(1, str2);
        }
        this.f4311a.b();
        Cursor o4 = this.f4311a.o(e10);
        try {
            int a10 = j1.b.a(o4, "required_network_type");
            int a11 = j1.b.a(o4, "requires_charging");
            int a12 = j1.b.a(o4, "requires_device_idle");
            int a13 = j1.b.a(o4, "requires_battery_not_low");
            int a14 = j1.b.a(o4, "requires_storage_not_low");
            int a15 = j1.b.a(o4, "trigger_content_update_delay");
            int a16 = j1.b.a(o4, "trigger_max_content_delay");
            int a17 = j1.b.a(o4, "content_uri_triggers");
            int a18 = j1.b.a(o4, "id");
            int a19 = j1.b.a(o4, "state");
            int a20 = j1.b.a(o4, "worker_class_name");
            int a21 = j1.b.a(o4, "input_merger_class_name");
            int a22 = j1.b.a(o4, "input");
            int a23 = j1.b.a(o4, "output");
            g0Var = e10;
            try {
                int a24 = j1.b.a(o4, "initial_delay");
                int a25 = j1.b.a(o4, "interval_duration");
                int a26 = j1.b.a(o4, "flex_duration");
                int a27 = j1.b.a(o4, "run_attempt_count");
                int a28 = j1.b.a(o4, "backoff_policy");
                int a29 = j1.b.a(o4, "backoff_delay_duration");
                int a30 = j1.b.a(o4, "period_start_time");
                int a31 = j1.b.a(o4, "minimum_retention_duration");
                int a32 = j1.b.a(o4, "schedule_requested_at");
                int a33 = j1.b.a(o4, "run_in_foreground");
                int a34 = j1.b.a(o4, "out_of_quota_policy");
                if (o4.moveToFirst()) {
                    String string = o4.getString(a18);
                    String string2 = o4.getString(a20);
                    int i10 = a34;
                    u1.c cVar = new u1.c();
                    cVar.f11626a = u.c(o4.getInt(a10));
                    cVar.f11627b = o4.getInt(a11) != 0;
                    cVar.f11628c = o4.getInt(a12) != 0;
                    cVar.f11629d = o4.getInt(a13) != 0;
                    cVar.f11630e = o4.getInt(a14) != 0;
                    cVar.f11631f = o4.getLong(a15);
                    cVar.g = o4.getLong(a16);
                    cVar.f11632h = u.a(o4.getBlob(a17));
                    oVar = new o(string, string2);
                    oVar.f4294b = u.e(o4.getInt(a19));
                    oVar.f4296d = o4.getString(a21);
                    oVar.f4297e = androidx.work.b.a(o4.getBlob(a22));
                    oVar.f4298f = androidx.work.b.a(o4.getBlob(a23));
                    oVar.g = o4.getLong(a24);
                    oVar.f4299h = o4.getLong(a25);
                    oVar.i = o4.getLong(a26);
                    oVar.f4301k = o4.getInt(a27);
                    oVar.f4302l = u.b(o4.getInt(a28));
                    oVar.f4303m = o4.getLong(a29);
                    oVar.f4304n = o4.getLong(a30);
                    oVar.f4305o = o4.getLong(a31);
                    oVar.f4306p = o4.getLong(a32);
                    oVar.f4307q = o4.getInt(a33) != 0;
                    oVar.f4308r = u.d(o4.getInt(i10));
                    oVar.f4300j = cVar;
                } else {
                    oVar = null;
                }
                o4.close();
                g0Var.release();
                return oVar;
            } catch (Throwable th2) {
                th = th2;
                o4.close();
                g0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            g0Var = e10;
            o4.close();
            g0Var.release();
            throw th;
        }
    }

    public final List<o.a> i(String str) {
        g0 e10 = g0.e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e10.D(1);
        } else {
            e10.r(1, str);
        }
        this.f4311a.b();
        Cursor o4 = this.f4311a.o(e10);
        try {
            int a10 = j1.b.a(o4, "id");
            int a11 = j1.b.a(o4, "state");
            ArrayList arrayList = new ArrayList(o4.getCount());
            while (o4.moveToNext()) {
                o.a aVar = new o.a();
                aVar.f4309a = o4.getString(a10);
                aVar.f4310b = u.e(o4.getInt(a11));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            o4.close();
            e10.release();
        }
    }

    public final int j(String str) {
        this.f4311a.b();
        l1.e a10 = this.f4316f.a();
        if (str == null) {
            a10.D(1);
        } else {
            a10.r(1, str);
        }
        this.f4311a.c();
        try {
            int x10 = a10.x();
            this.f4311a.p();
            return x10;
        } finally {
            this.f4311a.l();
            this.f4316f.d(a10);
        }
    }

    public final int k(String str, long j10) {
        this.f4311a.b();
        l1.e a10 = this.f4317h.a();
        a10.X(1, j10);
        if (str == null) {
            a10.D(2);
        } else {
            a10.r(2, str);
        }
        this.f4311a.c();
        try {
            int x10 = a10.x();
            this.f4311a.p();
            return x10;
        } finally {
            this.f4311a.l();
            this.f4317h.d(a10);
        }
    }

    public final int l(String str) {
        this.f4311a.b();
        l1.e a10 = this.g.a();
        if (str == null) {
            a10.D(1);
        } else {
            a10.r(1, str);
        }
        this.f4311a.c();
        try {
            int x10 = a10.x();
            this.f4311a.p();
            return x10;
        } finally {
            this.f4311a.l();
            this.g.d(a10);
        }
    }

    public final void m(String str, androidx.work.b bVar) {
        this.f4311a.b();
        l1.e a10 = this.f4314d.a();
        byte[] b10 = androidx.work.b.b(bVar);
        if (b10 == null) {
            a10.D(1);
        } else {
            a10.g0(1, b10);
        }
        if (str == null) {
            a10.D(2);
        } else {
            a10.r(2, str);
        }
        this.f4311a.c();
        try {
            a10.x();
            this.f4311a.p();
        } finally {
            this.f4311a.l();
            this.f4314d.d(a10);
        }
    }

    public final void n(String str, long j10) {
        this.f4311a.b();
        l1.e a10 = this.f4315e.a();
        a10.X(1, j10);
        if (str == null) {
            a10.D(2);
        } else {
            a10.r(2, str);
        }
        this.f4311a.c();
        try {
            a10.x();
            this.f4311a.p();
        } finally {
            this.f4311a.l();
            this.f4315e.d(a10);
        }
    }

    public final int o(v vVar, String... strArr) {
        this.f4311a.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE workspec SET state=");
        sb2.append("?");
        sb2.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append("?");
            if (i10 < length - 1) {
                sb2.append(",");
            }
        }
        sb2.append(")");
        String sb3 = sb2.toString();
        e0 e0Var = this.f4311a;
        e0Var.a();
        e0Var.b();
        l1.e z = e0Var.f5678d.m0().z(sb3);
        z.X(1, (long) u.f(vVar));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                z.D(i11);
            } else {
                z.r(i11, str);
            }
            i11++;
        }
        this.f4311a.c();
        try {
            int x10 = z.x();
            this.f4311a.p();
            return x10;
        } finally {
            this.f4311a.l();
        }
    }
}
