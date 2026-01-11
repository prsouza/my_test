package n4;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f8899c = {8000, 8000, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f8900d = {4000, 4000, 200, 200};

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<byte[]> f8901a = new AtomicReferenceArray<>(4);

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReferenceArray<char[]> f8902b = new AtomicReferenceArray<>(4);

    public final byte[] a(int i, int i10) {
        int i11 = f8899c[i];
        if (i10 < i11) {
            i10 = i11;
        }
        byte[] andSet = this.f8901a.getAndSet(i, (Object) null);
        return (andSet == null || andSet.length < i10) ? new byte[i10] : andSet;
    }

    public final char[] b(int i) {
        int i10 = f8900d[i];
        if (i10 <= 0) {
            i10 = 0;
        }
        char[] andSet = this.f8902b.getAndSet(i, (Object) null);
        return (andSet == null || andSet.length < i10) ? new char[i10] : andSet;
    }

    public final void c(int i, char[] cArr) {
        this.f8902b.set(i, cArr);
    }
}
