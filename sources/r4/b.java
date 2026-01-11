package r4;

import a8.c;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;
import k8.d;
import z7.a0;
import z7.n;

public final /* synthetic */ class b implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f10570a = new b();

    public final Object a(JsonReader jsonReader) {
        d dVar = c.f169a;
        n.a aVar = new n.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null name");
                    aVar.f14097c = nextString;
                    break;
                case 1:
                    aVar.f14096b = Long.valueOf(jsonReader.nextLong());
                    break;
                case 2:
                    aVar.f14098d = new String(Base64.decode(jsonReader.nextString(), 2), a0.f13991a);
                    break;
                case 3:
                    aVar.f14095a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }
}
