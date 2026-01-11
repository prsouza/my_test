package a8;

import android.util.JsonReader;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Objects;
import k8.d;
import k8.e;
import z7.a0;
import z7.b0;
import z7.o;
import z7.r;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final d f169a;

    public interface a<T> {
        T a(JsonReader jsonReader) throws IOException;
    }

    static {
        e eVar = new e();
        z7.a.f13882a.a(eVar);
        eVar.f7479d = true;
        f169a = new d(eVar);
    }

    public static a0.e.d.a.b.C0277d.C0279b a(JsonReader jsonReader) {
        r.a aVar = new r.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    aVar.f14129d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null symbol");
                    aVar.f14127b = nextString;
                    break;
                case 2:
                    aVar.f14126a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    aVar.f14128c = jsonReader.nextString();
                    break;
                case 4:
                    aVar.f14130e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static a0.c b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                Objects.requireNonNull(str, "Null key");
            } else if (!nextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                jsonReader.skipValue();
            } else {
                str2 = jsonReader.nextString();
                Objects.requireNonNull(str2, "Null value");
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " key" : BuildConfig.FLAVOR;
        if (str2 == null) {
            str3 = a.c(str3, " value");
        }
        if (str3.isEmpty()) {
            return new z7.d(str, str2);
        }
        throw new IllegalStateException(a.c("Missing required properties:", str3));
    }

    public static <T> b0<T> c(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return new b0<>(arrayList);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static z7.a0.e.d d(android.util.JsonReader r22) throws java.io.IOException {
        /*
            r0 = r22
            z7.k$a r1 = new z7.k$a
            r1.<init>()
            r22.beginObject()
        L_0x000a:
            boolean r2 = r22.hasNext()
            if (r2 == 0) goto L_0x0431
            java.lang.String r2 = r22.nextName()
            java.util.Objects.requireNonNull(r2)
            int r3 = r2.hashCode()
            java.lang.String r4 = "timestamp"
            r5 = 0
            r6 = 3
            r7 = 4
            r8 = 1
            r9 = 2
            switch(r3) {
                case -1335157162: goto L_0x0050;
                case 96801: goto L_0x0045;
                case 107332: goto L_0x003a;
                case 3575610: goto L_0x002f;
                case 55126294: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x005b
        L_0x0026:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x002d
            goto L_0x005b
        L_0x002d:
            r2 = r7
            goto L_0x005c
        L_0x002f:
            java.lang.String r3 = "type"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0038
            goto L_0x005b
        L_0x0038:
            r2 = r6
            goto L_0x005c
        L_0x003a:
            java.lang.String r3 = "log"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0043
            goto L_0x005b
        L_0x0043:
            r2 = r9
            goto L_0x005c
        L_0x0045:
            java.lang.String r3 = "app"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004e
            goto L_0x005b
        L_0x004e:
            r2 = r8
            goto L_0x005c
        L_0x0050:
            java.lang.String r3 = "device"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r2 = r5
            goto L_0x005c
        L_0x005b:
            r2 = -1
        L_0x005c:
            java.lang.String r3 = "Missing required properties:"
            java.lang.String r10 = ""
            r11 = 0
            r12 = 5
            if (r2 == 0) goto L_0x037a
            if (r2 == r8) goto L_0x00c6
            if (r2 == r9) goto L_0x0080
            if (r2 == r6) goto L_0x0078
            if (r2 == r7) goto L_0x0070
            r22.skipValue()
            goto L_0x000a
        L_0x0070:
            long r2 = r22.nextLong()
            r1.b(r2)
            goto L_0x000a
        L_0x0078:
            java.lang.String r2 = r22.nextString()
            r1.c(r2)
            goto L_0x000a
        L_0x0080:
            r22.beginObject()
        L_0x0083:
            boolean r2 = r22.hasNext()
            if (r2 == 0) goto L_0x00a6
            java.lang.String r2 = r22.nextName()
            java.util.Objects.requireNonNull(r2)
            java.lang.String r4 = "content"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x009c
            r22.skipValue()
            goto L_0x0083
        L_0x009c:
            java.lang.String r11 = r22.nextString()
            java.lang.String r2 = "Null content"
            java.util.Objects.requireNonNull(r11, r2)
            goto L_0x0083
        L_0x00a6:
            r22.endObject()
            if (r11 != 0) goto L_0x00ad
            java.lang.String r10 = " content"
        L_0x00ad:
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x00bc
            z7.t r2 = new z7.t
            r2.<init>(r11)
            r1.f14075e = r2
            goto L_0x000a
        L_0x00bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = a8.a.c(r3, r10)
            r0.<init>(r1)
            throw r0
        L_0x00c6:
            z7.l$b r2 = new z7.l$b
            r2.<init>()
            r22.beginObject()
        L_0x00ce:
            boolean r13 = r22.hasNext()
            if (r13 == 0) goto L_0x036f
            java.lang.String r13 = r22.nextName()
            java.util.Objects.requireNonNull(r13)
            int r14 = r13.hashCode()
            switch(r14) {
                case -1332194002: goto L_0x010f;
                case -1090974952: goto L_0x0104;
                case -80231855: goto L_0x00f9;
                case 555169704: goto L_0x00ee;
                case 928737948: goto L_0x00e3;
                default: goto L_0x00e2;
            }
        L_0x00e2:
            goto L_0x011a
        L_0x00e3:
            java.lang.String r14 = "uiOrientation"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x00ec
            goto L_0x011a
        L_0x00ec:
            r13 = r7
            goto L_0x011b
        L_0x00ee:
            java.lang.String r14 = "customAttributes"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x00f7
            goto L_0x011a
        L_0x00f7:
            r13 = r6
            goto L_0x011b
        L_0x00f9:
            java.lang.String r14 = "internalKeys"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0102
            goto L_0x011a
        L_0x0102:
            r13 = r9
            goto L_0x011b
        L_0x0104:
            java.lang.String r14 = "execution"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x010d
            goto L_0x011a
        L_0x010d:
            r13 = r8
            goto L_0x011b
        L_0x010f:
            java.lang.String r14 = "background"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r13 = r5
            goto L_0x011b
        L_0x011a:
            r13 = -1
        L_0x011b:
            switch(r13) {
                case 0: goto L_0x0363;
                case 1: goto L_0x016d;
                case 2: goto L_0x014b;
                case 3: goto L_0x012a;
                case 4: goto L_0x0122;
                default: goto L_0x011e;
            }
        L_0x011e:
            r22.skipValue()
            goto L_0x00ce
        L_0x0122:
            int r13 = r22.nextInt()
            r2.b(r13)
            goto L_0x00ce
        L_0x012a:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r22.beginArray()
        L_0x0132:
            boolean r14 = r22.hasNext()
            if (r14 == 0) goto L_0x0140
            z7.a0$c r14 = b(r22)
            r13.add(r14)
            goto L_0x0132
        L_0x0140:
            r22.endArray()
            z7.b0 r14 = new z7.b0
            r14.<init>(r13)
            r2.f14082b = r14
            goto L_0x00ce
        L_0x014b:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r22.beginArray()
        L_0x0153:
            boolean r14 = r22.hasNext()
            if (r14 == 0) goto L_0x0161
            z7.a0$c r14 = b(r22)
            r13.add(r14)
            goto L_0x0153
        L_0x0161:
            r22.endArray()
            z7.b0 r14 = new z7.b0
            r14.<init>(r13)
            r2.f14083c = r14
            goto L_0x00ce
        L_0x016d:
            r22.beginObject()
            r16 = r11
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
        L_0x017a:
            boolean r13 = r22.hasNext()
            if (r13 == 0) goto L_0x0336
            java.lang.String r13 = r22.nextName()
            java.util.Objects.requireNonNull(r13)
            int r14 = r13.hashCode()
            switch(r14) {
                case -1375141843: goto L_0x01bb;
                case -1337936983: goto L_0x01b0;
                case -902467928: goto L_0x01a5;
                case 937615455: goto L_0x019a;
                case 1481625679: goto L_0x018f;
                default: goto L_0x018e;
            }
        L_0x018e:
            goto L_0x01c6
        L_0x018f:
            java.lang.String r14 = "exception"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0198
            goto L_0x01c6
        L_0x0198:
            r13 = r7
            goto L_0x01c7
        L_0x019a:
            java.lang.String r14 = "binaries"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x01a3
            goto L_0x01c6
        L_0x01a3:
            r13 = r6
            goto L_0x01c7
        L_0x01a5:
            java.lang.String r14 = "signal"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x01ae
            goto L_0x01c6
        L_0x01ae:
            r13 = r9
            goto L_0x01c7
        L_0x01b0:
            java.lang.String r14 = "threads"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x01b9
            goto L_0x01c6
        L_0x01b9:
            r13 = r8
            goto L_0x01c7
        L_0x01bb:
            java.lang.String r14 = "appExitInfo"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x01c4
            goto L_0x01c6
        L_0x01c4:
            r13 = r5
            goto L_0x01c7
        L_0x01c6:
            r13 = -1
        L_0x01c7:
            switch(r13) {
                case 0: goto L_0x0254;
                case 1: goto L_0x024c;
                case 2: goto L_0x01da;
                case 3: goto L_0x01d3;
                case 4: goto L_0x01ce;
                default: goto L_0x01ca;
            }
        L_0x01ca:
            r22.skipValue()
            goto L_0x017a
        L_0x01ce:
            z7.a0$e$d$a$b$b r17 = e(r22)
            goto L_0x017a
        L_0x01d3:
            r4.b r13 = r4.b.f10570a
            z7.b0 r20 = c(r0, r13)
            goto L_0x017a
        L_0x01da:
            z7.p$a r13 = new z7.p$a
            r13.<init>()
            r22.beginObject()
        L_0x01e2:
            boolean r14 = r22.hasNext()
            if (r14 == 0) goto L_0x0243
            java.lang.String r14 = r22.nextName()
            java.util.Objects.requireNonNull(r14)
            int r15 = r14.hashCode()
            switch(r15) {
                case -1147692044: goto L_0x020d;
                case 3059181: goto L_0x0202;
                case 3373707: goto L_0x01f7;
                default: goto L_0x01f6;
            }
        L_0x01f6:
            goto L_0x0218
        L_0x01f7:
            java.lang.String r15 = "name"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0200
            goto L_0x0218
        L_0x0200:
            r14 = r9
            goto L_0x0219
        L_0x0202:
            java.lang.String r15 = "code"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x020b
            goto L_0x0218
        L_0x020b:
            r14 = r8
            goto L_0x0219
        L_0x020d:
            java.lang.String r15 = "address"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0216
            goto L_0x0218
        L_0x0216:
            r14 = r5
            goto L_0x0219
        L_0x0218:
            r14 = -1
        L_0x0219:
            switch(r14) {
                case 0: goto L_0x0238;
                case 1: goto L_0x022c;
                case 2: goto L_0x0220;
                default: goto L_0x021c;
            }
        L_0x021c:
            r22.skipValue()
            goto L_0x01e2
        L_0x0220:
            java.lang.String r14 = r22.nextString()
            java.lang.String r15 = "Null name"
            java.util.Objects.requireNonNull(r14, r15)
            r13.f14112a = r14
            goto L_0x01e2
        L_0x022c:
            java.lang.String r14 = r22.nextString()
            java.lang.String r15 = "Null code"
            java.util.Objects.requireNonNull(r14, r15)
            r13.f14113b = r14
            goto L_0x01e2
        L_0x0238:
            long r14 = r22.nextLong()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13.f14114c = r14
            goto L_0x01e2
        L_0x0243:
            r22.endObject()
            z7.a0$e$d$a$b$c r19 = r13.a()
            goto L_0x017a
        L_0x024c:
            a8.a r13 = a8.a.f167a
            z7.b0 r16 = c(r0, r13)
            goto L_0x017a
        L_0x0254:
            z7.c$a r13 = new z7.c$a
            r13.<init>()
            r22.beginObject()
        L_0x025c:
            boolean r14 = r22.hasNext()
            if (r14 == 0) goto L_0x032d
            java.lang.String r14 = r22.nextName()
            java.util.Objects.requireNonNull(r14)
            int r15 = r14.hashCode()
            switch(r15) {
                case 110987: goto L_0x02be;
                case 111312: goto L_0x02b3;
                case 113234: goto L_0x02a8;
                case 55126294: goto L_0x029f;
                case 202325402: goto L_0x0294;
                case 722137681: goto L_0x0289;
                case 723857505: goto L_0x027e;
                case 2125650548: goto L_0x0272;
                default: goto L_0x0270;
            }
        L_0x0270:
            goto L_0x02c9
        L_0x0272:
            java.lang.String r15 = "importance"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x027c
            goto L_0x02c9
        L_0x027c:
            r14 = 7
            goto L_0x02ca
        L_0x027e:
            java.lang.String r15 = "traceFile"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0287
            goto L_0x02c9
        L_0x0287:
            r14 = 6
            goto L_0x02ca
        L_0x0289:
            java.lang.String r15 = "reasonCode"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0292
            goto L_0x02c9
        L_0x0292:
            r14 = r12
            goto L_0x02ca
        L_0x0294:
            java.lang.String r15 = "processName"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x029d
            goto L_0x02c9
        L_0x029d:
            r14 = r7
            goto L_0x02ca
        L_0x029f:
            boolean r14 = r14.equals(r4)
            if (r14 != 0) goto L_0x02a6
            goto L_0x02c9
        L_0x02a6:
            r14 = r6
            goto L_0x02ca
        L_0x02a8:
            java.lang.String r15 = "rss"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x02b1
            goto L_0x02c9
        L_0x02b1:
            r14 = r9
            goto L_0x02ca
        L_0x02b3:
            java.lang.String r15 = "pss"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x02bc
            goto L_0x02c9
        L_0x02bc:
            r14 = r8
            goto L_0x02ca
        L_0x02be:
            java.lang.String r15 = "pid"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x02c7
            goto L_0x02c9
        L_0x02c7:
            r14 = r5
            goto L_0x02ca
        L_0x02c9:
            r14 = -1
        L_0x02ca:
            switch(r14) {
                case 0: goto L_0x0321;
                case 1: goto L_0x0315;
                case 2: goto L_0x0309;
                case 3: goto L_0x02fd;
                case 4: goto L_0x02f0;
                case 5: goto L_0x02e4;
                case 6: goto L_0x02dc;
                case 7: goto L_0x02d1;
                default: goto L_0x02cd;
            }
        L_0x02cd:
            r22.skipValue()
            goto L_0x025c
        L_0x02d1:
            int r14 = r22.nextInt()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.f14016d = r14
            goto L_0x025c
        L_0x02dc:
            java.lang.String r14 = r22.nextString()
            r13.f14019h = r14
            goto L_0x025c
        L_0x02e4:
            int r14 = r22.nextInt()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.f14015c = r14
            goto L_0x025c
        L_0x02f0:
            java.lang.String r14 = r22.nextString()
            java.lang.String r15 = "Null processName"
            java.util.Objects.requireNonNull(r14, r15)
            r13.f14014b = r14
            goto L_0x025c
        L_0x02fd:
            long r14 = r22.nextLong()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13.g = r14
            goto L_0x025c
        L_0x0309:
            long r14 = r22.nextLong()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13.f14018f = r14
            goto L_0x025c
        L_0x0315:
            long r14 = r22.nextLong()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13.f14017e = r14
            goto L_0x025c
        L_0x0321:
            int r14 = r22.nextInt()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.f14013a = r14
            goto L_0x025c
        L_0x032d:
            r22.endObject()
            z7.a0$a r18 = r13.a()
            goto L_0x017a
        L_0x0336:
            r22.endObject()
            if (r19 != 0) goto L_0x033e
            java.lang.String r13 = " signal"
            goto L_0x033f
        L_0x033e:
            r13 = r10
        L_0x033f:
            if (r20 != 0) goto L_0x0347
            java.lang.String r14 = " binaries"
            java.lang.String r13 = a8.a.c(r13, r14)
        L_0x0347:
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x0359
            z7.m r13 = new z7.m
            r21 = 0
            r15 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r2.f14081a = r13
            goto L_0x00ce
        L_0x0359:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = a8.a.c(r3, r13)
            r0.<init>(r1)
            throw r0
        L_0x0363:
            boolean r13 = r22.nextBoolean()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r2.f14084d = r13
            goto L_0x00ce
        L_0x036f:
            r22.endObject()
            z7.a0$e$d$a r2 = r2.a()
            r1.f14073c = r2
            goto L_0x000a
        L_0x037a:
            z7.s$a r2 = new z7.s$a
            r2.<init>()
            r22.beginObject()
        L_0x0382:
            boolean r3 = r22.hasNext()
            if (r3 == 0) goto L_0x0426
            java.lang.String r3 = r22.nextName()
            java.util.Objects.requireNonNull(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1708606089: goto L_0x03ce;
                case -1455558134: goto L_0x03c3;
                case -1439500848: goto L_0x03b8;
                case 279795450: goto L_0x03ad;
                case 976541947: goto L_0x03a2;
                case 1516795582: goto L_0x0397;
                default: goto L_0x0396;
            }
        L_0x0396:
            goto L_0x03d9
        L_0x0397:
            java.lang.String r4 = "proximityOn"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x03a0
            goto L_0x03d9
        L_0x03a0:
            r3 = r12
            goto L_0x03da
        L_0x03a2:
            java.lang.String r4 = "ramUsed"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x03ab
            goto L_0x03d9
        L_0x03ab:
            r3 = r7
            goto L_0x03da
        L_0x03ad:
            java.lang.String r4 = "diskUsed"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x03b6
            goto L_0x03d9
        L_0x03b6:
            r3 = r6
            goto L_0x03da
        L_0x03b8:
            java.lang.String r4 = "orientation"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x03c1
            goto L_0x03d9
        L_0x03c1:
            r3 = r9
            goto L_0x03da
        L_0x03c3:
            java.lang.String r4 = "batteryVelocity"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x03cc
            goto L_0x03d9
        L_0x03cc:
            r3 = r8
            goto L_0x03da
        L_0x03ce:
            java.lang.String r4 = "batteryLevel"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x03d7
            goto L_0x03d9
        L_0x03d7:
            r3 = r5
            goto L_0x03da
        L_0x03d9:
            r3 = -1
        L_0x03da:
            switch(r3) {
                case 0: goto L_0x041a;
                case 1: goto L_0x040e;
                case 2: goto L_0x0402;
                case 3: goto L_0x03f7;
                case 4: goto L_0x03ec;
                case 5: goto L_0x03e1;
                default: goto L_0x03dd;
            }
        L_0x03dd:
            r22.skipValue()
            goto L_0x0382
        L_0x03e1:
            boolean r3 = r22.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.f14139c = r3
            goto L_0x0382
        L_0x03ec:
            long r3 = r22.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.f14141e = r3
            goto L_0x0382
        L_0x03f7:
            long r3 = r22.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.f14142f = r3
            goto L_0x0382
        L_0x0402:
            int r3 = r22.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f14140d = r3
            goto L_0x0382
        L_0x040e:
            int r3 = r22.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f14138b = r3
            goto L_0x0382
        L_0x041a:
            double r3 = r22.nextDouble()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r2.f14137a = r3
            goto L_0x0382
        L_0x0426:
            r22.endObject()
            z7.a0$e$d$c r2 = r2.a()
            r1.f14074d = r2
            goto L_0x000a
        L_0x0431:
            r22.endObject()
            z7.a0$e$d r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.c.d(android.util.JsonReader):z7.a0$e$d");
    }

    public static a0.e.d.a.b.C0274b e(JsonReader jsonReader) throws IOException {
        o.b bVar = new o.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(a(jsonReader));
                    }
                    jsonReader.endArray();
                    bVar.f14106c = new b0<>(arrayList);
                    break;
                case 1:
                    bVar.f14105b = jsonReader.nextString();
                    break;
                case 2:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null type");
                    bVar.f14104a = nextString;
                    break;
                case 3:
                    bVar.f14107d = e(jsonReader);
                    break;
                case 4:
                    bVar.f14108e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static z7.a0 f(android.util.JsonReader r28) throws java.io.IOException {
        /*
            java.nio.charset.Charset r0 = z7.a0.f13991a
            z7.b$a r0 = new z7.b$a
            r0.<init>()
            r28.beginObject()
        L_0x000a:
            boolean r1 = r28.hasNext()
            if (r1 == 0) goto L_0x0509
            java.lang.String r1 = r28.nextName()
            java.util.Objects.requireNonNull(r1)
            int r2 = r1.hashCode()
            java.lang.String r3 = "displayVersion"
            java.lang.String r4 = "platform"
            java.lang.String r5 = "installationUuid"
            java.lang.String r6 = "buildVersion"
            r7 = 0
            switch(r2) {
                case -2118372775: goto L_0x006d;
                case -1962630338: goto L_0x0062;
                case -911706486: goto L_0x0059;
                case 344431858: goto L_0x004e;
                case 719853845: goto L_0x0045;
                case 1874684019: goto L_0x003c;
                case 1975623094: goto L_0x0033;
                case 1984987798: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x0078
        L_0x0028:
            java.lang.String r2 = "session"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0031
            goto L_0x0078
        L_0x0031:
            r1 = 7
            goto L_0x0079
        L_0x0033:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x003a
            goto L_0x0078
        L_0x003a:
            r1 = 6
            goto L_0x0079
        L_0x003c:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0043
            goto L_0x0078
        L_0x0043:
            r1 = 5
            goto L_0x0079
        L_0x0045:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x004c
            goto L_0x0078
        L_0x004c:
            r1 = 4
            goto L_0x0079
        L_0x004e:
            java.lang.String r2 = "gmpAppId"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0057
            goto L_0x0078
        L_0x0057:
            r1 = 3
            goto L_0x0079
        L_0x0059:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0060
            goto L_0x0078
        L_0x0060:
            r1 = 2
            goto L_0x0079
        L_0x0062:
            java.lang.String r2 = "sdkVersion"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x006b
            goto L_0x0078
        L_0x006b:
            r1 = 1
            goto L_0x0079
        L_0x006d:
            java.lang.String r2 = "ndkPayload"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r1 = r7
            goto L_0x0079
        L_0x0078:
            r1 = -1
        L_0x0079:
            java.lang.String r2 = ""
            java.lang.String r9 = "Missing required properties:"
            java.lang.String r10 = "Null buildVersion"
            switch(r1) {
                case 0: goto L_0x04b2;
                case 1: goto L_0x04a5;
                case 2: goto L_0x049a;
                case 3: goto L_0x048d;
                case 4: goto L_0x0480;
                case 5: goto L_0x0474;
                case 6: goto L_0x0467;
                case 7: goto L_0x0088;
                default: goto L_0x0082;
            }
        L_0x0082:
            r4 = r28
            r28.skipValue()
            goto L_0x000a
        L_0x0088:
            z7.g$b r1 = new z7.g$b
            r1.<init>()
            r1.b(r7)
            r28.beginObject()
        L_0x0093:
            boolean r7 = r28.hasNext()
            if (r7 == 0) goto L_0x045c
            java.lang.String r7 = r28.nextName()
            java.util.Objects.requireNonNull(r7)
            int r11 = r7.hashCode()
            java.lang.String r13 = "identifier"
            switch(r11) {
                case -2128794476: goto L_0x0120;
                case -1618432855: goto L_0x0117;
                case -1606742899: goto L_0x010c;
                case -1335157162: goto L_0x0101;
                case -1291329255: goto L_0x00f6;
                case 3556: goto L_0x00eb;
                case 96801: goto L_0x00e0;
                case 3599307: goto L_0x00d5;
                case 286956243: goto L_0x00c7;
                case 1025385094: goto L_0x00b9;
                case 2047016109: goto L_0x00ab;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x012b
        L_0x00ab:
            java.lang.String r11 = "generatorType"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x00b5
            goto L_0x012b
        L_0x00b5:
            r7 = 10
            goto L_0x012c
        L_0x00b9:
            java.lang.String r11 = "crashed"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x00c3
            goto L_0x012b
        L_0x00c3:
            r7 = 9
            goto L_0x012c
        L_0x00c7:
            java.lang.String r11 = "generator"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x00d1
            goto L_0x012b
        L_0x00d1:
            r7 = 8
            goto L_0x012c
        L_0x00d5:
            java.lang.String r11 = "user"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x00de
            goto L_0x012b
        L_0x00de:
            r7 = 7
            goto L_0x012c
        L_0x00e0:
            java.lang.String r11 = "app"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x00e9
            goto L_0x012b
        L_0x00e9:
            r7 = 6
            goto L_0x012c
        L_0x00eb:
            java.lang.String r11 = "os"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x00f4
            goto L_0x012b
        L_0x00f4:
            r7 = 5
            goto L_0x012c
        L_0x00f6:
            java.lang.String r11 = "events"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x00ff
            goto L_0x012b
        L_0x00ff:
            r7 = 4
            goto L_0x012c
        L_0x0101:
            java.lang.String r11 = "device"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x010a
            goto L_0x012b
        L_0x010a:
            r7 = 3
            goto L_0x012c
        L_0x010c:
            java.lang.String r11 = "endedAt"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x0115
            goto L_0x012b
        L_0x0115:
            r7 = 2
            goto L_0x012c
        L_0x0117:
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x011e
            goto L_0x012b
        L_0x011e:
            r7 = 1
            goto L_0x012c
        L_0x0120:
            java.lang.String r11 = "startedAt"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r7 = 0
            goto L_0x012c
        L_0x012b:
            r7 = -1
        L_0x012c:
            java.lang.String r11 = "Null version"
            java.lang.String r14 = "Null identifier"
            java.lang.String r15 = " identifier"
            java.lang.String r12 = "version"
            switch(r7) {
                case 0: goto L_0x044f;
                case 1: goto L_0x043a;
                case 2: goto L_0x042d;
                case 3: goto L_0x0323;
                case 4: goto L_0x0300;
                case 5: goto L_0x0276;
                case 6: goto L_0x01a2;
                case 7: goto L_0x015f;
                case 8: goto L_0x0152;
                case 9: goto L_0x0149;
                case 10: goto L_0x013d;
                default: goto L_0x0137;
            }
        L_0x0137:
            r13 = 1
            r28.skipValue()
            goto L_0x0093
        L_0x013d:
            int r7 = r28.nextInt()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1.f14045k = r7
            goto L_0x0269
        L_0x0149:
            boolean r7 = r28.nextBoolean()
            r1.b(r7)
            goto L_0x0269
        L_0x0152:
            java.lang.String r7 = r28.nextString()
            java.lang.String r11 = "Null generator"
            java.util.Objects.requireNonNull(r7, r11)
            r1.f14037a = r7
            goto L_0x0269
        L_0x015f:
            r28.beginObject()
            r7 = 0
        L_0x0163:
            boolean r11 = r28.hasNext()
            if (r11 == 0) goto L_0x0182
            java.lang.String r11 = r28.nextName()
            java.util.Objects.requireNonNull(r11)
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x017a
            r28.skipValue()
            goto L_0x0163
        L_0x017a:
            java.lang.String r7 = r28.nextString()
            java.util.Objects.requireNonNull(r7, r14)
            goto L_0x0163
        L_0x0182:
            r28.endObject()
            if (r7 != 0) goto L_0x0188
            goto L_0x0189
        L_0x0188:
            r15 = r2
        L_0x0189:
            boolean r11 = r15.isEmpty()
            if (r11 == 0) goto L_0x0198
            z7.v r11 = new z7.v
            r11.<init>(r7)
            r1.g = r11
            goto L_0x0269
        L_0x0198:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = a8.a.c(r9, r15)
            r0.<init>(r1)
            throw r0
        L_0x01a2:
            r28.beginObject()
            r7 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = r7
            r23 = r16
            r24 = r17
            r25 = r18
            r26 = r19
            r27 = r20
        L_0x01bc:
            boolean r7 = r28.hasNext()
            if (r7 == 0) goto L_0x024b
            java.lang.String r7 = r28.nextName()
            java.util.Objects.requireNonNull(r7)
            int r16 = r7.hashCode()
            switch(r16) {
                case -1618432855: goto L_0x0202;
                case -519438642: goto L_0x01f7;
                case 213652010: goto L_0x01ec;
                case 351608024: goto L_0x01e3;
                case 719853845: goto L_0x01da;
                case 1975623094: goto L_0x01d1;
                default: goto L_0x01d0;
            }
        L_0x01d0:
            goto L_0x020b
        L_0x01d1:
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x01d8
            goto L_0x020b
        L_0x01d8:
            r7 = 5
            goto L_0x020c
        L_0x01da:
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x01e1
            goto L_0x020b
        L_0x01e1:
            r7 = 4
            goto L_0x020c
        L_0x01e3:
            boolean r7 = r7.equals(r12)
            if (r7 != 0) goto L_0x01ea
            goto L_0x020b
        L_0x01ea:
            r7 = 3
            goto L_0x020c
        L_0x01ec:
            java.lang.String r8 = "developmentPlatformVersion"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x01f5
            goto L_0x020b
        L_0x01f5:
            r7 = 2
            goto L_0x020c
        L_0x01f7:
            java.lang.String r8 = "developmentPlatform"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0200
            goto L_0x020b
        L_0x0200:
            r7 = 1
            goto L_0x020c
        L_0x0202:
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x0209
            goto L_0x020b
        L_0x0209:
            r7 = 0
            goto L_0x020c
        L_0x020b:
            r7 = -1
        L_0x020c:
            if (r7 == 0) goto L_0x0240
            r8 = 1
            if (r7 == r8) goto L_0x023a
            r8 = 2
            if (r7 == r8) goto L_0x0235
            r8 = 3
            if (r7 == r8) goto L_0x022b
            r8 = 4
            if (r7 == r8) goto L_0x0226
            r8 = 5
            if (r7 == r8) goto L_0x0221
            r28.skipValue()
            goto L_0x01bc
        L_0x0221:
            java.lang.String r24 = r28.nextString()
            goto L_0x01bc
        L_0x0226:
            java.lang.String r25 = r28.nextString()
            goto L_0x01bc
        L_0x022b:
            java.lang.String r7 = r28.nextString()
            java.util.Objects.requireNonNull(r7, r11)
            r23 = r7
            goto L_0x01bc
        L_0x0235:
            java.lang.String r27 = r28.nextString()
            goto L_0x01bc
        L_0x023a:
            java.lang.String r26 = r28.nextString()
            goto L_0x01bc
        L_0x0240:
            java.lang.String r7 = r28.nextString()
            java.util.Objects.requireNonNull(r7, r14)
            r22 = r7
            goto L_0x01bc
        L_0x024b:
            r28.endObject()
            if (r22 != 0) goto L_0x0251
            goto L_0x0252
        L_0x0251:
            r15 = r2
        L_0x0252:
            if (r23 != 0) goto L_0x025a
            java.lang.String r7 = " version"
            java.lang.String r15 = a8.a.c(r15, r7)
        L_0x025a:
            boolean r7 = r15.isEmpty()
            if (r7 == 0) goto L_0x026c
            z7.h r7 = new z7.h
            r21 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r1.f14042f = r7
        L_0x0269:
            r13 = 1
            goto L_0x0093
        L_0x026c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = a8.a.c(r9, r15)
            r0.<init>(r1)
            throw r0
        L_0x0276:
            z7.u$a r7 = new z7.u$a
            r7.<init>()
            r28.beginObject()
        L_0x027e:
            boolean r8 = r28.hasNext()
            if (r8 == 0) goto L_0x02f4
            java.lang.String r8 = r28.nextName()
            java.util.Objects.requireNonNull(r8)
            int r13 = r8.hashCode()
            switch(r13) {
                case -911706486: goto L_0x02b0;
                case -293026577: goto L_0x02a5;
                case 351608024: goto L_0x029c;
                case 1874684019: goto L_0x0293;
                default: goto L_0x0292;
            }
        L_0x0292:
            goto L_0x02b9
        L_0x0293:
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x029a
            goto L_0x02b9
        L_0x029a:
            r8 = 3
            goto L_0x02ba
        L_0x029c:
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x02a3
            goto L_0x02b9
        L_0x02a3:
            r8 = 2
            goto L_0x02ba
        L_0x02a5:
            java.lang.String r13 = "jailbroken"
            boolean r8 = r8.equals(r13)
            if (r8 != 0) goto L_0x02ae
            goto L_0x02b9
        L_0x02ae:
            r8 = 1
            goto L_0x02ba
        L_0x02b0:
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x02b7
            goto L_0x02b9
        L_0x02b7:
            r8 = 0
            goto L_0x02ba
        L_0x02b9:
            r8 = -1
        L_0x02ba:
            if (r8 == 0) goto L_0x02e9
            r13 = 1
            if (r8 == r13) goto L_0x02de
            r14 = 2
            if (r8 == r14) goto L_0x02d4
            r14 = 3
            if (r8 == r14) goto L_0x02c9
            r28.skipValue()
            goto L_0x027e
        L_0x02c9:
            int r8 = r28.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.f14148a = r8
            goto L_0x027e
        L_0x02d4:
            java.lang.String r8 = r28.nextString()
            java.util.Objects.requireNonNull(r8, r11)
            r7.f14149b = r8
            goto L_0x027e
        L_0x02de:
            boolean r8 = r28.nextBoolean()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7.f14151d = r8
            goto L_0x027e
        L_0x02e9:
            r13 = 1
            java.lang.String r8 = r28.nextString()
            java.util.Objects.requireNonNull(r8, r10)
            r7.f14150c = r8
            goto L_0x027e
        L_0x02f4:
            r13 = 1
            r28.endObject()
            z7.a0$e$e r7 = r7.a()
            r1.f14043h = r7
            goto L_0x0093
        L_0x0300:
            r13 = 1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r28.beginArray()
        L_0x0309:
            boolean r8 = r28.hasNext()
            if (r8 == 0) goto L_0x0317
            z7.a0$e$d r8 = d(r28)
            r7.add(r8)
            goto L_0x0309
        L_0x0317:
            r28.endArray()
            z7.b0 r8 = new z7.b0
            r8.<init>(r7)
            r1.f14044j = r8
            goto L_0x0093
        L_0x0323:
            r13 = 1
            r8 = 5
            r7 = 3
            z7.j$a r11 = new z7.j$a
            r11.<init>()
            r28.beginObject()
        L_0x032e:
            boolean r12 = r28.hasNext()
            if (r12 == 0) goto L_0x0422
            java.lang.String r12 = r28.nextName()
            java.util.Objects.requireNonNull(r12)
            int r14 = r12.hashCode()
            switch(r14) {
                case -1981332476: goto L_0x039f;
                case -1969347631: goto L_0x0394;
                case 112670: goto L_0x0389;
                case 3002454: goto L_0x037e;
                case 81784169: goto L_0x0373;
                case 94848180: goto L_0x0368;
                case 104069929: goto L_0x035d;
                case 109757585: goto L_0x0352;
                case 2078953423: goto L_0x0344;
                default: goto L_0x0342;
            }
        L_0x0342:
            goto L_0x03aa
        L_0x0344:
            java.lang.String r14 = "modelClass"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x034e
            goto L_0x03aa
        L_0x034e:
            r12 = 8
            goto L_0x03ab
        L_0x0352:
            java.lang.String r14 = "state"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x035b
            goto L_0x03aa
        L_0x035b:
            r12 = 7
            goto L_0x03ab
        L_0x035d:
            java.lang.String r14 = "model"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x0366
            goto L_0x03aa
        L_0x0366:
            r12 = 6
            goto L_0x03ab
        L_0x0368:
            java.lang.String r14 = "cores"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x0371
            goto L_0x03aa
        L_0x0371:
            r12 = r8
            goto L_0x03ab
        L_0x0373:
            java.lang.String r14 = "diskSpace"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x037c
            goto L_0x03aa
        L_0x037c:
            r12 = 4
            goto L_0x03ab
        L_0x037e:
            java.lang.String r14 = "arch"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x0387
            goto L_0x03aa
        L_0x0387:
            r12 = r7
            goto L_0x03ab
        L_0x0389:
            java.lang.String r14 = "ram"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x0392
            goto L_0x03aa
        L_0x0392:
            r12 = 2
            goto L_0x03ab
        L_0x0394:
            java.lang.String r14 = "manufacturer"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x039d
            goto L_0x03aa
        L_0x039d:
            r12 = r13
            goto L_0x03ab
        L_0x039f:
            java.lang.String r14 = "simulator"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x03a8
            goto L_0x03aa
        L_0x03a8:
            r12 = 0
            goto L_0x03ab
        L_0x03aa:
            r12 = -1
        L_0x03ab:
            switch(r12) {
                case 0: goto L_0x0416;
                case 1: goto L_0x0409;
                case 2: goto L_0x03fd;
                case 3: goto L_0x03f1;
                case 4: goto L_0x03e5;
                case 5: goto L_0x03d9;
                case 6: goto L_0x03cc;
                case 7: goto L_0x03c0;
                case 8: goto L_0x03b3;
                default: goto L_0x03ae;
            }
        L_0x03ae:
            r28.skipValue()
            goto L_0x032e
        L_0x03b3:
            java.lang.String r12 = r28.nextString()
            java.lang.String r14 = "Null modelClass"
            java.util.Objects.requireNonNull(r12, r14)
            r11.i = r12
            goto L_0x032e
        L_0x03c0:
            int r12 = r28.nextInt()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.g = r12
            goto L_0x032e
        L_0x03cc:
            java.lang.String r12 = r28.nextString()
            java.lang.String r14 = "Null model"
            java.util.Objects.requireNonNull(r12, r14)
            r11.f14060b = r12
            goto L_0x032e
        L_0x03d9:
            int r12 = r28.nextInt()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.f14061c = r12
            goto L_0x032e
        L_0x03e5:
            long r14 = r28.nextLong()
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r11.f14063e = r12
            goto L_0x032e
        L_0x03f1:
            int r12 = r28.nextInt()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.f14059a = r12
            goto L_0x032e
        L_0x03fd:
            long r14 = r28.nextLong()
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r11.f14062d = r12
            goto L_0x032e
        L_0x0409:
            java.lang.String r12 = r28.nextString()
            java.lang.String r14 = "Null manufacturer"
            java.util.Objects.requireNonNull(r12, r14)
            r11.f14065h = r12
            goto L_0x032e
        L_0x0416:
            boolean r12 = r28.nextBoolean()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r11.f14064f = r12
            goto L_0x032e
        L_0x0422:
            r28.endObject()
            z7.a0$e$c r7 = r11.a()
            r1.i = r7
            goto L_0x0093
        L_0x042d:
            r13 = 1
            long r7 = r28.nextLong()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r1.f14040d = r7
            goto L_0x0093
        L_0x043a:
            r13 = 1
            java.lang.String r7 = r28.nextString()
            r8 = 2
            byte[] r7 = android.util.Base64.decode(r7, r8)
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r11 = z7.a0.f13991a
            r8.<init>(r7, r11)
            r1.f14038b = r8
            goto L_0x0093
        L_0x044f:
            r13 = 1
            long r7 = r28.nextLong()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r1.f14039c = r7
            goto L_0x0093
        L_0x045c:
            r28.endObject()
            z7.a0$e r1 = r1.a()
            r0.g = r1
            goto L_0x000a
        L_0x0467:
            java.lang.String r1 = r28.nextString()
            java.lang.String r2 = "Null displayVersion"
            java.util.Objects.requireNonNull(r1, r2)
            r0.f14003f = r1
            goto L_0x000a
        L_0x0474:
            int r1 = r28.nextInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f14000c = r1
            goto L_0x000a
        L_0x0480:
            java.lang.String r1 = r28.nextString()
            java.lang.String r2 = "Null installationUuid"
            java.util.Objects.requireNonNull(r1, r2)
            r0.f14001d = r1
            goto L_0x000a
        L_0x048d:
            java.lang.String r1 = r28.nextString()
            java.lang.String r2 = "Null gmpAppId"
            java.util.Objects.requireNonNull(r1, r2)
            r0.f13999b = r1
            goto L_0x000a
        L_0x049a:
            java.lang.String r1 = r28.nextString()
            java.util.Objects.requireNonNull(r1, r10)
            r0.f14002e = r1
            goto L_0x000a
        L_0x04a5:
            java.lang.String r1 = r28.nextString()
            java.lang.String r2 = "Null sdkVersion"
            java.util.Objects.requireNonNull(r1, r2)
            r0.f13998a = r1
            goto L_0x000a
        L_0x04b2:
            r28.beginObject()
            r1 = 0
            r3 = 0
        L_0x04b7:
            boolean r4 = r28.hasNext()
            if (r4 == 0) goto L_0x04e6
            java.lang.String r4 = r28.nextName()
            java.util.Objects.requireNonNull(r4)
            java.lang.String r5 = "files"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x04dd
            java.lang.String r5 = "orgId"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x04d8
            r28.skipValue()
            goto L_0x04b7
        L_0x04d8:
            java.lang.String r3 = r28.nextString()
            goto L_0x04b7
        L_0x04dd:
            h1.c r1 = h1.c.f5663u
            r4 = r28
            z7.b0 r1 = c(r4, r1)
            goto L_0x04b7
        L_0x04e6:
            r4 = r28
            r28.endObject()
            if (r1 != 0) goto L_0x04ef
            java.lang.String r2 = " files"
        L_0x04ef:
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x04ff
            z7.e r2 = new z7.e
            r5 = 0
            r2.<init>(r1, r3, r5)
            r0.f14004h = r2
            goto L_0x000a
        L_0x04ff:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = a8.a.c(r9, r2)
            r0.<init>(r1)
            throw r0
        L_0x0509:
            r4 = r28
            r28.endObject()
            z7.a0 r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.c.f(android.util.JsonReader):z7.a0");
    }

    public final a0 g(String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            a0 f10 = f(jsonReader);
            jsonReader.close();
            return f10;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public final String h(a0 a0Var) {
        d dVar = f169a;
        Objects.requireNonNull(dVar);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar.a(a0Var, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}
