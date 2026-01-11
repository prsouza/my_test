package h1;

import a5.a0;
import a8.c;
import a9.f;
import android.content.Context;
import android.database.Cursor;
import android.util.Base64;
import android.util.JsonReader;
import com.github.mikephil.charting.BuildConfig;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.Objects;
import k8.d;
import q.a;
import q4.b;
import r8.a;
import t4.i;
import t4.q;
import z7.f;

public final /* synthetic */ class c implements a, a0.a, f.a, a.C0207a, c.a {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ c f5659b = new c(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ c f5660c = new c(1);

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ c f5661s = new c(2);

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ c f5662t = new c(3);

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ c f5663u = new c(4);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5664a;

    public /* synthetic */ c(int i) {
        this.f5664a = i;
    }

    public final Object a(JsonReader jsonReader) {
        d dVar = a8.c.f169a;
        f.a aVar = new f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            if (nextName.equals("filename")) {
                aVar.c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                aVar.b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public final Object apply(Object obj) {
        byte[] bArr;
        switch (this.f5664a) {
            case 0:
                return ((l1.a) obj).o();
            default:
                Cursor cursor = (Cursor) obj;
                b bVar = a0.f63u;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    q.a a10 = q.a();
                    a10.a(cursor.getString(1));
                    i.a aVar = (i.a) a10;
                    aVar.f11368c = d5.a.b(cursor.getInt(2));
                    String string = cursor.getString(3);
                    if (string == null) {
                        bArr = null;
                    } else {
                        bArr = Base64.decode(string, 0);
                    }
                    aVar.f11367b = bArr;
                    arrayList.add(aVar.b());
                }
                return arrayList;
        }
    }

    public final void b(r8.b bVar) {
    }

    public final String c(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.b(installerPackageName) : BuildConfig.FLAVOR;
    }
}
