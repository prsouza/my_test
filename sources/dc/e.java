package dc;

import nd.d;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public final b f4435a;

    public static final class a extends e {

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f4436b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f4437c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f4438d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f4439e;

        public a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            super(b.ECDSA);
            this.f4437c = bArr;
            this.f4438d = bArr2;
            this.f4439e = bArr3;
            this.f4436b = d.J(d.J(bArr2, bArr3), bArr);
        }

        public final byte[] a() {
            return this.f4436b;
        }
    }

    public static final class b extends e {

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f4440b;

        public b(byte[] bArr) {
            super(b.ED25519);
            this.f4440b = bArr;
        }

        public final byte[] a() {
            return this.f4440b;
        }
    }

    public static final class c extends e {

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f4441b;

        public c(byte[] bArr) {
            super(b.SR25519);
            this.f4441b = bArr;
        }

        public final byte[] a() {
            return this.f4441b;
        }
    }

    public e(b bVar) {
        this.f4435a = bVar;
    }

    public abstract byte[] a();
}
