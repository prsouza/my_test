package zh;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class a {
    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[LZ4Constants.HASH_TABLE_SIZE];
        while (true) {
            int read = inputStream.read(bArr, 0, LZ4Constants.HASH_TABLE_SIZE);
            if (read < 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static int b(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int i10 = 0;
        while (i10 < i) {
            int read = inputStream.read(bArr, 0 + i10, i - i10);
            if (read < 0) {
                break;
            }
            i10 += read;
        }
        return i10;
    }
}
