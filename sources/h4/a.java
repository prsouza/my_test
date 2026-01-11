package h4;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.Arrays;

public final class a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final transient int[] f5807a;

    /* renamed from: b  reason: collision with root package name */
    public final transient char[] f5808b;

    /* renamed from: c  reason: collision with root package name */
    public final transient byte[] f5809c;

    /* renamed from: s  reason: collision with root package name */
    public final String f5810s;

    /* renamed from: t  reason: collision with root package name */
    public final transient boolean f5811t;

    /* renamed from: u  reason: collision with root package name */
    public final transient char f5812u;

    /* renamed from: v  reason: collision with root package name */
    public final transient int f5813v;

    public a(String str, String str2, boolean z, char c10, int i) {
        int[] iArr = new int[128];
        this.f5807a = iArr;
        char[] cArr = new char[64];
        this.f5808b = cArr;
        this.f5809c = new byte[64];
        this.f5810s = str;
        this.f5811t = z;
        this.f5812u = c10;
        this.f5813v = i;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, cArr, 0);
            Arrays.fill(iArr, -1);
            for (int i10 = 0; i10 < length; i10++) {
                char c11 = this.f5808b[i10];
                this.f5809c[i10] = (byte) c11;
                this.f5807a[c11] = i10;
            }
            if (z) {
                this.f5807a[c10] = -2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(a8.a.b("Base64Alphabet length must be exactly 64 (was ", length, ")"));
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.f5810s.hashCode();
    }

    public final String toString() {
        return this.f5810s;
    }

    public a(a aVar, boolean z, char c10) {
        int[] iArr = new int[128];
        this.f5807a = iArr;
        char[] cArr = new char[64];
        this.f5808b = cArr;
        byte[] bArr = new byte[64];
        this.f5809c = bArr;
        this.f5810s = "MIME-NO-LINEFEEDS";
        byte[] bArr2 = aVar.f5809c;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = aVar.f5808b;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = aVar.f5807a;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f5811t = z;
        this.f5812u = c10;
        this.f5813v = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
