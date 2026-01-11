package m3;

import android.util.Log;
import c4.a;
import g3.d;
import g9.b;
import g9.h;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import l6.l0;
import o6.z;

public final class c implements d, z, h {
    public /* synthetic */ c() {
    }

    public /* synthetic */ c(b bVar) {
    }

    public final Object a() {
        return new LinkedHashMap();
    }

    public final String b(BigInteger bigInteger) {
        if (bigInteger != null) {
            return bigInteger.toString();
        }
        return null;
    }

    public final BigInteger c(String str) {
        if (str != null) {
            return new BigInteger(str);
        }
        return null;
    }

    public final boolean f(Object obj, File file, g3.h hVar) {
        try {
            a.b((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }

    public final /* synthetic */ Object zza() {
        return new l0();
    }
}
