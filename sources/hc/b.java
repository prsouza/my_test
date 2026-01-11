package hc;

import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f5927a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5928b;

    public enum a {
        TWELVE(16),
        FIFTEEN(20),
        EIGHTEEN(24),
        TWENTY_ONE(28),
        TWENTY_FOUR(32);
        
        private final int byteLength;

        private a(int i) {
            this.byteLength = i;
        }

        public final int getByteLength() {
            return this.byteLength;
        }
    }

    public b(String str, List<String> list, byte[] bArr) {
        this.f5927a = list;
        this.f5928b = bArr;
    }
}
