package h4;

import com.google.android.gms.common.api.Api;
import org.slf4j.Marker;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5814a;

    static {
        a aVar = new a("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f5814a = new a(aVar, true, '=');
        byte[] bArr = aVar.f5809c;
        System.arraycopy(bArr, 0, new byte[64], 0, bArr.length);
        char[] cArr = aVar.f5808b;
        System.arraycopy(cArr, 0, new char[64], 0, cArr.length);
        int[] iArr = aVar.f5807a;
        System.arraycopy(iArr, 0, new int[128], 0, iArr.length);
        StringBuilder sb2 = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb2.setCharAt(sb2.indexOf(Marker.ANY_NON_NULL_MARKER), '-');
        sb2.setCharAt(sb2.indexOf("/"), '_');
        new a("MODIFIED-FOR-URL", sb2.toString(), false, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }
}
