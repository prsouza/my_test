package io.sentry;

import aa.c;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i2.z;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryPackage;
import java.util.List;

public final class SentryEnvelopeHeaderAdapter extends z<SentryEnvelopeHeader> {
    private boolean hasValidSdkVersion(SdkVersion sdkVersion) {
        return sdkVersion.getName() != null && !sdkVersion.getName().isEmpty() && sdkVersion.getVersion() != null && !sdkVersion.getVersion().isEmpty();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.sentry.SentryEnvelopeHeader read(aa.a r19) {
        /*
            r18 = this;
            int r0 = r19.A0()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto L_0x000d
            r19.x0()
            return r1
        L_0x000d:
            r19.w()
            r0 = r1
            r2 = r0
            r3 = r2
        L_0x0013:
            boolean r4 = r19.a0()
            if (r4 == 0) goto L_0x01f8
            java.lang.String r4 = r19.w0()
            java.util.Objects.requireNonNull(r4)
            int r5 = r4.hashCode()
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = -1
            switch(r5) {
                case 113722: goto L_0x0043;
                case 110620997: goto L_0x0038;
                case 278118624: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r4 = r9
            goto L_0x004d
        L_0x002d:
            java.lang.String r5 = "event_id"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            r4 = r6
            goto L_0x004d
        L_0x0038:
            java.lang.String r5 = "trace"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r4 = r7
            goto L_0x004d
        L_0x0043:
            java.lang.String r5 = "sdk"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r4 = r8
        L_0x004d:
            switch(r4) {
                case 0: goto L_0x0137;
                case 1: goto L_0x005e;
                case 2: goto L_0x0054;
                default: goto L_0x0050;
            }
        L_0x0050:
            r19.D0()
            goto L_0x0013
        L_0x0054:
            io.sentry.protocol.SentryId r0 = new io.sentry.protocol.SentryId
            java.lang.String r4 = r19.y0()
            r0.<init>((java.lang.String) r4)
            goto L_0x0013
        L_0x005e:
            r19.w()
            r4 = r1
            r10 = r4
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0068:
            boolean r16 = r19.a0()
            if (r16 == 0) goto L_0x0118
            java.lang.String r1 = r19.w0()
            java.util.Objects.requireNonNull(r1)
            int r17 = r1.hashCode()
            switch(r17) {
                case -85904877: goto L_0x00b5;
                case 3599307: goto L_0x00aa;
                case 1090594823: goto L_0x009f;
                case 1270300245: goto L_0x0094;
                case 1904812937: goto L_0x0089;
                case 2141246174: goto L_0x007e;
                default: goto L_0x007c;
            }
        L_0x007c:
            r1 = r9
            goto L_0x00bf
        L_0x007e:
            java.lang.String r5 = "transaction"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0087
            goto L_0x007c
        L_0x0087:
            r1 = 5
            goto L_0x00bf
        L_0x0089:
            java.lang.String r5 = "public_key"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0092
            goto L_0x007c
        L_0x0092:
            r1 = 4
            goto L_0x00bf
        L_0x0094:
            java.lang.String r5 = "trace_id"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x009d
            goto L_0x007c
        L_0x009d:
            r1 = 3
            goto L_0x00bf
        L_0x009f:
            java.lang.String r5 = "release"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00a8
            goto L_0x007c
        L_0x00a8:
            r1 = r6
            goto L_0x00bf
        L_0x00aa:
            java.lang.String r5 = "user"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00b3
            goto L_0x007c
        L_0x00b3:
            r1 = r7
            goto L_0x00bf
        L_0x00b5:
            java.lang.String r5 = "environment"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00be
            goto L_0x007c
        L_0x00be:
            r1 = r8
        L_0x00bf:
            switch(r1) {
                case 0: goto L_0x0111;
                case 1: goto L_0x00df;
                case 2: goto L_0x00da;
                case 3: goto L_0x00d0;
                case 4: goto L_0x00cb;
                case 5: goto L_0x00c6;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            r19.D0()
            goto L_0x0115
        L_0x00c6:
            java.lang.String r13 = r19.y0()
            goto L_0x0115
        L_0x00cb:
            java.lang.String r10 = r19.y0()
            goto L_0x0115
        L_0x00d0:
            io.sentry.protocol.SentryId r4 = new io.sentry.protocol.SentryId
            java.lang.String r1 = r19.y0()
            r4.<init>((java.lang.String) r1)
            goto L_0x0115
        L_0x00da:
            java.lang.String r11 = r19.y0()
            goto L_0x0115
        L_0x00df:
            r19.w()
        L_0x00e2:
            boolean r1 = r19.a0()
            if (r1 == 0) goto L_0x010d
            java.lang.String r1 = r19.w0()
            java.util.Objects.requireNonNull(r1)
            java.lang.String r5 = "id"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0108
            java.lang.String r5 = "segment"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0103
            r19.D0()
            goto L_0x00e2
        L_0x0103:
            java.lang.String r15 = r19.y0()
            goto L_0x00e2
        L_0x0108:
            java.lang.String r14 = r19.y0()
            goto L_0x00e2
        L_0x010d:
            r19.S()
            goto L_0x0115
        L_0x0111:
            java.lang.String r12 = r19.y0()
        L_0x0115:
            r1 = 0
            goto L_0x0068
        L_0x0118:
            if (r4 == 0) goto L_0x01f2
            if (r10 == 0) goto L_0x01f2
            io.sentry.TraceState r1 = new io.sentry.TraceState
            if (r14 != 0) goto L_0x0125
            if (r15 == 0) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r3 = 0
            goto L_0x012a
        L_0x0125:
            io.sentry.TraceState$TraceStateUser r3 = new io.sentry.TraceState$TraceStateUser
            r3.<init>(r14, r15)
        L_0x012a:
            r5 = r1
            r6 = r4
            r7 = r10
            r8 = r11
            r9 = r12
            r10 = r3
            r11 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3 = r1
            goto L_0x01f2
        L_0x0137:
            r19.w()
            io.sentry.protocol.SdkVersion r1 = new io.sentry.protocol.SdkVersion
            r1.<init>()
        L_0x013f:
            boolean r2 = r19.a0()
            if (r2 == 0) goto L_0x01f1
            java.lang.String r2 = r19.w0()
            java.util.Objects.requireNonNull(r2)
            int r4 = r2.hashCode()
            java.lang.String r5 = "version"
            java.lang.String r10 = "name"
            switch(r4) {
                case 3373707: goto L_0x0178;
                case 351608024: goto L_0x016f;
                case 750867693: goto L_0x0164;
                case 1487029535: goto L_0x0159;
                default: goto L_0x0157;
            }
        L_0x0157:
            r2 = r9
            goto L_0x0180
        L_0x0159:
            java.lang.String r4 = "integrations"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0162
            goto L_0x0157
        L_0x0162:
            r2 = 3
            goto L_0x0180
        L_0x0164:
            java.lang.String r4 = "packages"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x016d
            goto L_0x0157
        L_0x016d:
            r2 = r6
            goto L_0x0180
        L_0x016f:
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0176
            goto L_0x0157
        L_0x0176:
            r2 = r7
            goto L_0x0180
        L_0x0178:
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x017f
            goto L_0x0157
        L_0x017f:
            r2 = r8
        L_0x0180:
            switch(r2) {
                case 0: goto L_0x01e8;
                case 1: goto L_0x01df;
                case 2: goto L_0x019a;
                case 3: goto L_0x0187;
                default: goto L_0x0183;
            }
        L_0x0183:
            r19.D0()
            goto L_0x013f
        L_0x0187:
            r19.e()
        L_0x018a:
            boolean r2 = r19.a0()
            if (r2 == 0) goto L_0x01da
            java.lang.String r2 = r19.y0()
            if (r2 == 0) goto L_0x018a
            r1.addIntegration(r2)
            goto L_0x018a
        L_0x019a:
            r19.e()
        L_0x019d:
            boolean r2 = r19.a0()
            if (r2 == 0) goto L_0x01da
            r19.w()
            r2 = 0
            r4 = 0
        L_0x01a8:
            boolean r11 = r19.a0()
            if (r11 == 0) goto L_0x01cf
            java.lang.String r11 = r19.w0()
            java.util.Objects.requireNonNull(r11)
            boolean r12 = r11.equals(r10)
            if (r12 != 0) goto L_0x01ca
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x01c5
            r19.D0()
            goto L_0x01a8
        L_0x01c5:
            java.lang.String r4 = r19.y0()
            goto L_0x01a8
        L_0x01ca:
            java.lang.String r2 = r19.y0()
            goto L_0x01a8
        L_0x01cf:
            if (r2 == 0) goto L_0x01d6
            if (r4 == 0) goto L_0x01d6
            r1.addPackage(r2, r4)
        L_0x01d6:
            r19.S()
            goto L_0x019d
        L_0x01da:
            r19.R()
            goto L_0x013f
        L_0x01df:
            java.lang.String r2 = r19.y0()
            r1.setVersion(r2)
            goto L_0x013f
        L_0x01e8:
            java.lang.String r2 = r19.y0()
            r1.setName(r2)
            goto L_0x013f
        L_0x01f1:
            r2 = r1
        L_0x01f2:
            r19.S()
            r1 = 0
            goto L_0x0013
        L_0x01f8:
            r19.S()
            io.sentry.SentryEnvelopeHeader r1 = new io.sentry.SentryEnvelopeHeader
            r1.<init>(r0, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.SentryEnvelopeHeaderAdapter.read(aa.a):io.sentry.SentryEnvelopeHeader");
    }

    public void write(c cVar, SentryEnvelopeHeader sentryEnvelopeHeader) {
        if (sentryEnvelopeHeader == null) {
            cVar.f0();
            return;
        }
        cVar.R();
        if (sentryEnvelopeHeader.getEventId() != null) {
            cVar.s("event_id");
            cVar.S(sentryEnvelopeHeader.getEventId().toString());
        }
        SdkVersion sdkVersion = sentryEnvelopeHeader.getSdkVersion();
        if (sdkVersion != null && hasValidSdkVersion(sdkVersion)) {
            cVar.s("sdk").R();
            cVar.s(AppMeasurementSdk.ConditionalUserProperty.NAME).S(sdkVersion.getName());
            cVar.s("version").S(sdkVersion.getVersion());
            List<String> integrations = sdkVersion.getIntegrations();
            if (integrations != null) {
                cVar.s("integrations").B();
                for (String S : integrations) {
                    cVar.S(S);
                }
                cVar.T();
            }
            List<SentryPackage> packages = sdkVersion.getPackages();
            if (packages != null) {
                cVar.s("packages").B();
                for (SentryPackage next : packages) {
                    cVar.R();
                    cVar.s(AppMeasurementSdk.ConditionalUserProperty.NAME).S(next.getName());
                    cVar.s("version").S(next.getVersion());
                    cVar.a0();
                }
                cVar.T();
            }
            cVar.a0();
        }
        TraceState trace = sentryEnvelopeHeader.getTrace();
        if (trace != null) {
            cVar.s(SpanContext.TYPE);
            cVar.R();
            cVar.s("trace_id").S(trace.getTraceId().toString());
            cVar.s("public_key").S(trace.getPublicKey());
            if (trace.getRelease() != null) {
                cVar.s(BuildConfig.BUILD_TYPE).S(trace.getRelease());
            }
            if (trace.getEnvironment() != null) {
                cVar.s("environment").S(trace.getEnvironment());
            }
            if (trace.getTransaction() != null) {
                cVar.s("transaction").S(trace.getTransaction());
            }
            if (!(trace.getUser() == null || (trace.getUser().getId() == null && trace.getUser().getSegment() == null))) {
                cVar.s("user");
                cVar.R();
                if (trace.getUser().getId() != null) {
                    cVar.s("id").S(trace.getUser().getId());
                }
                if (trace.getUser().getSegment() != null) {
                    cVar.s("segment").S(trace.getUser().getSegment());
                }
                cVar.a0();
            }
            cVar.a0();
        }
        cVar.a0();
    }
}
