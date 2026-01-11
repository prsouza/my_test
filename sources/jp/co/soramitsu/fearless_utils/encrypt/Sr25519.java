package jp.co.soramitsu.fearless_utils.encrypt;

public final class Sr25519 {
    static {
        System.loadLibrary("sr25519java");
    }

    public static native byte[] keypairFromSeed(byte[] bArr);

    public static native byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
