package a8;

import a8.c;
import android.util.JsonReader;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k8.d;
import xg.e;
import z7.q;

public final /* synthetic */ class a implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f167a = new a();

    public static String b(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String c(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder d(String str, int i, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i);
        sb2.append(str2);
        return sb2;
    }

    public static Map e(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static e f(e eVar, e eVar2, e eVar3) {
        return eVar.m().a(eVar2).a(eVar3);
    }

    public Object a(JsonReader jsonReader) {
        d dVar = c.f169a;
        q.b bVar = new q.b();
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
                case 3373707:
                    if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    bVar.f14120c = c.c(jsonReader, h1.d.f5668b);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null name");
                    bVar.f14118a = nextString;
                    break;
                case 2:
                    bVar.f14119b = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }
}
