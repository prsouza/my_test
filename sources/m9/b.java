package m9;

import android.content.Context;
import cc.a;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import e6.e;
import java.util.Objects;

public final class b implements a {
    public static Gson a() {
        Gson create = new GsonBuilder().setFieldNamingStrategy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        e.C(create, "GsonBuilder()\n          …                .create()");
        return create;
    }

    public static Context b(a aVar) {
        Context context = aVar.f8510a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
