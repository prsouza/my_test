package io.sentry;

import aa.c;
import com.github.mikephil.charting.BuildConfig;
import i2.z;
import io.sentry.Session;
import io.sentry.util.Objects;
import java.util.Date;
import java.util.Locale;

public final class SessionAdapter extends z<Session> {
    private final SentryOptions options;

    public SessionAdapter(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions is required.");
    }

    private Date converTimeStamp(String str, String str2) {
        try {
            return DateUtils.getDateTime(str);
        } catch (IllegalArgumentException e10) {
            this.options.getLogger().log(SentryLevel.ERROR, e10, "Error converting session (%s) field.", str2);
            return null;
        }
    }

    private boolean initAttrs(c cVar, boolean z) {
        if (z) {
            return true;
        }
        cVar.s("attrs").R();
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.sentry.Session read(aa.a r23) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r23.A0()
            r2 = 9
            r3 = 0
            if (r1 != r2) goto L_0x000f
            r23.x0()
            return r3
        L_0x000f:
            r23.w()
            r5 = r3
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r8 = 0
        L_0x0021:
            boolean r4 = r23.a0()
            if (r4 == 0) goto L_0x01a1
            java.lang.String r4 = r23.w0()
            java.util.Objects.requireNonNull(r4)
            int r18 = r4.hashCode()
            java.lang.String r2 = "timestamp"
            r19 = 3
            r20 = 2
            java.lang.String r3 = "started"
            r21 = -1
            switch(r18) {
                case -1992012396: goto L_0x00a8;
                case -1897185151: goto L_0x009f;
                case -1294635157: goto L_0x0093;
                case -892481550: goto L_0x0087;
                case 99455: goto L_0x007c;
                case 113759: goto L_0x0071;
                case 113870: goto L_0x0066;
                case 3237136: goto L_0x005b;
                case 55126294: goto L_0x0050;
                case 93152418: goto L_0x0043;
                default: goto L_0x003f;
            }
        L_0x003f:
            r1 = r21
            goto L_0x00b2
        L_0x0043:
            java.lang.String r1 = "attrs"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x004c
            goto L_0x003f
        L_0x004c:
            r1 = 9
            goto L_0x00b2
        L_0x0050:
            boolean r1 = r4.equals(r2)
            if (r1 != 0) goto L_0x0057
            goto L_0x003f
        L_0x0057:
            r1 = 8
            goto L_0x00b2
        L_0x005b:
            java.lang.String r1 = "init"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0064
            goto L_0x003f
        L_0x0064:
            r1 = 7
            goto L_0x00b2
        L_0x0066:
            java.lang.String r1 = "sid"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x006f
            goto L_0x003f
        L_0x006f:
            r1 = 6
            goto L_0x00b2
        L_0x0071:
            java.lang.String r1 = "seq"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x007a
            goto L_0x003f
        L_0x007a:
            r1 = 5
            goto L_0x00b2
        L_0x007c:
            java.lang.String r1 = "did"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0085
            goto L_0x003f
        L_0x0085:
            r1 = 4
            goto L_0x00b2
        L_0x0087:
            java.lang.String r1 = "status"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0090
            goto L_0x003f
        L_0x0090:
            r1 = r19
            goto L_0x00b2
        L_0x0093:
            java.lang.String r1 = "errors"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x009c
            goto L_0x003f
        L_0x009c:
            r1 = r20
            goto L_0x00b2
        L_0x009f:
            boolean r1 = r4.equals(r3)
            if (r1 != 0) goto L_0x00a6
            goto L_0x003f
        L_0x00a6:
            r1 = 1
            goto L_0x00b2
        L_0x00a8:
            java.lang.String r1 = "duration"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x00b1
            goto L_0x003f
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            switch(r1) {
                case 0: goto L_0x0194;
                case 1: goto L_0x018b;
                case 2: goto L_0x0186;
                case 3: goto L_0x0161;
                case 4: goto L_0x015c;
                case 5: goto L_0x0153;
                case 6: goto L_0x0134;
                case 7: goto L_0x012b;
                case 8: goto L_0x0121;
                case 9: goto L_0x00ba;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            r23.D0()
            goto L_0x019c
        L_0x00ba:
            r23.w()
        L_0x00bd:
            boolean r1 = r23.a0()
            if (r1 == 0) goto L_0x011c
            java.lang.String r1 = r23.w0()
            java.util.Objects.requireNonNull(r1)
            int r2 = r1.hashCode()
            switch(r2) {
                case -85904877: goto L_0x00f7;
                case 1090594823: goto L_0x00ec;
                case 1480014044: goto L_0x00e0;
                case 1917799825: goto L_0x00d4;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            r1 = r21
            goto L_0x0101
        L_0x00d4:
            java.lang.String r2 = "user_agent"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00dd
            goto L_0x00d1
        L_0x00dd:
            r1 = r19
            goto L_0x0101
        L_0x00e0:
            java.lang.String r2 = "ip_address"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00e9
            goto L_0x00d1
        L_0x00e9:
            r1 = r20
            goto L_0x0101
        L_0x00ec:
            java.lang.String r2 = "release"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f5
            goto L_0x00d1
        L_0x00f5:
            r1 = 1
            goto L_0x0101
        L_0x00f7:
            java.lang.String r2 = "environment"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0100
            goto L_0x00d1
        L_0x0100:
            r1 = 0
        L_0x0101:
            switch(r1) {
                case 0: goto L_0x0117;
                case 1: goto L_0x0112;
                case 2: goto L_0x010d;
                case 3: goto L_0x0108;
                default: goto L_0x0104;
            }
        L_0x0104:
            r23.D0()
            goto L_0x00bd
        L_0x0108:
            java.lang.String r15 = r23.y0()
            goto L_0x00bd
        L_0x010d:
            java.lang.String r14 = r23.y0()
            goto L_0x00bd
        L_0x0112:
            java.lang.String r17 = r23.y0()
            goto L_0x00bd
        L_0x0117:
            java.lang.String r16 = r23.y0()
            goto L_0x00bd
        L_0x011c:
            r23.S()
            goto L_0x019c
        L_0x0121:
            java.lang.String r1 = r23.y0()
            java.util.Date r7 = r0.converTimeStamp(r1, r2)
            goto L_0x019c
        L_0x012b:
            boolean r1 = r23.b0()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            goto L_0x019c
        L_0x0134:
            java.lang.String r1 = r23.y0()     // Catch:{ IllegalArgumentException -> 0x013d }
            java.util.UUID r10 = java.util.UUID.fromString(r1)     // Catch:{ IllegalArgumentException -> 0x013e }
            goto L_0x019c
        L_0x013d:
            r1 = 0
        L_0x013e:
            io.sentry.SentryOptions r2 = r0.options
            io.sentry.ILogger r2 = r2.getLogger()
            io.sentry.SentryLevel r3 = io.sentry.SentryLevel.ERROR
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r18 = 0
            r4[r18] = r1
            java.lang.String r1 = "%s sid is not valid."
            r2.log((io.sentry.SentryLevel) r3, (java.lang.String) r1, (java.lang.Object[]) r4)
            goto L_0x019c
        L_0x0153:
            long r1 = r23.v0()
            java.lang.Long r12 = java.lang.Long.valueOf(r1)
            goto L_0x019c
        L_0x015c:
            java.lang.String r9 = r23.y0()
            goto L_0x019c
        L_0x0161:
            java.lang.String r1 = r23.y0()     // Catch:{ IllegalArgumentException -> 0x0170 }
            java.lang.String r1 = io.sentry.util.StringUtils.capitalize(r1)     // Catch:{ IllegalArgumentException -> 0x0170 }
            if (r1 == 0) goto L_0x019c
            io.sentry.Session$State r5 = io.sentry.Session.State.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0171 }
            goto L_0x019c
        L_0x0170:
            r1 = 0
        L_0x0171:
            io.sentry.SentryOptions r2 = r0.options
            io.sentry.ILogger r2 = r2.getLogger()
            io.sentry.SentryLevel r3 = io.sentry.SentryLevel.ERROR
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r18 = 0
            r4[r18] = r1
            java.lang.String r1 = "%s status is not valid."
            r2.log((io.sentry.SentryLevel) r3, (java.lang.String) r1, (java.lang.Object[]) r4)
            goto L_0x019c
        L_0x0186:
            int r8 = r23.p0()
            goto L_0x019c
        L_0x018b:
            java.lang.String r1 = r23.y0()
            java.util.Date r6 = r0.converTimeStamp(r1, r3)
            goto L_0x019c
        L_0x0194:
            double r1 = r23.f0()
            java.lang.Double r13 = java.lang.Double.valueOf(r1)
        L_0x019c:
            r2 = 9
            r3 = 0
            goto L_0x0021
        L_0x01a1:
            r23.S()
            if (r5 == 0) goto L_0x01b8
            if (r6 == 0) goto L_0x01b8
            if (r17 == 0) goto L_0x01b8
            boolean r1 = r17.isEmpty()
            if (r1 == 0) goto L_0x01b1
            goto L_0x01b8
        L_0x01b1:
            io.sentry.Session r1 = new io.sentry.Session
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x01b8:
            io.sentry.SentryOptions r1 = r0.options
            io.sentry.ILogger r1 = r1.getLogger()
            io.sentry.SentryLevel r2 = io.sentry.SentryLevel.ERROR
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Session is gonna be dropped due to invalid fields."
            r1.log((io.sentry.SentryLevel) r2, (java.lang.String) r4, (java.lang.Object[]) r3)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.SessionAdapter.read(aa.a):io.sentry.Session");
    }

    public void write(c cVar, Session session) {
        if (session == null) {
            cVar.f0();
            return;
        }
        cVar.R();
        if (session.getSessionId() != null) {
            cVar.s("sid").S(session.getSessionId().toString());
        }
        if (session.getDistinctId() != null) {
            cVar.s("did").S(session.getDistinctId());
        }
        if (session.getInit() != null) {
            cVar.s("init").e(session.getInit());
        }
        Date started = session.getStarted();
        if (started != null) {
            cVar.s("started").S(DateUtils.getTimestamp(started));
        }
        Session.State status = session.getStatus();
        if (status != null) {
            cVar.s("status").S(status.name().toLowerCase(Locale.ROOT));
        }
        if (session.getSequence() != null) {
            cVar.s("seq").f(session.getSequence());
        }
        int errorCount = session.errorCount();
        if (errorCount > 0) {
            cVar.s("errors").c((long) errorCount);
        }
        if (session.getDuration() != null) {
            cVar.s("duration").f(session.getDuration());
        }
        if (session.getTimestamp() != null) {
            cVar.s("timestamp").S(DateUtils.getTimestamp(session.getTimestamp()));
        }
        boolean initAttrs = initAttrs(cVar, false);
        cVar.s(BuildConfig.BUILD_TYPE).S(session.getRelease());
        if (session.getEnvironment() != null) {
            initAttrs = initAttrs(cVar, initAttrs);
            cVar.s("environment").S(session.getEnvironment());
        }
        if (session.getIpAddress() != null) {
            initAttrs = initAttrs(cVar, initAttrs);
            cVar.s("ip_address").S(session.getIpAddress());
        }
        if (session.getUserAgent() != null) {
            initAttrs = initAttrs(cVar, initAttrs);
            cVar.s("user_agent").S(session.getUserAgent());
        }
        if (initAttrs) {
            cVar.a0();
        }
        cVar.a0();
    }
}
