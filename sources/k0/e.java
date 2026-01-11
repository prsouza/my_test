package k0;

import a.a;
import android.util.Base64;
import java.util.List;
import java.util.Objects;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f7354a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7355b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7356c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f7357d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7358e;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        Objects.requireNonNull(str);
        this.f7354a = str;
        Objects.requireNonNull(str2);
        this.f7355b = str2;
        this.f7356c = str3;
        Objects.requireNonNull(list);
        this.f7357d = list;
        this.f7358e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder d10 = a.d("FontRequest {mProviderAuthority: ");
        d10.append(this.f7354a);
        d10.append(", mProviderPackage: ");
        d10.append(this.f7355b);
        d10.append(", mQuery: ");
        d10.append(this.f7356c);
        d10.append(", mCertificates:");
        sb2.append(d10.toString());
        for (int i = 0; i < this.f7357d.size(); i++) {
            sb2.append(" [");
            List list = this.f7357d.get(i);
            for (int i10 = 0; i10 < list.size(); i10++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i10), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        return android.support.v4.media.a.e(sb2, "}", "mCertificatesArray: 0");
    }
}
