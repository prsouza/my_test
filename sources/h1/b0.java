package h1;

import android.content.Context;
import h1.e0;

public final class b0 {
    public static <T extends e0> e0.a<T> a(Context context, Class<T> cls, String str) {
        if (str.trim().length() != 0) {
            return new e0.a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
