package ag;

import com.google.android.gms.common.api.Api;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public final class v1 {

    /* renamed from: a  reason: collision with root package name */
    public static final long f457a = Runtime.getRuntime().maxMemory();

    public static int a(int i) {
        int i10 = 1;
        if (i > 127) {
            int i11 = 1;
            while (true) {
                i >>>= 8;
                if (i == 0) {
                    break;
                }
                i11++;
            }
            for (int i12 = (i11 - 1) * 8; i12 >= 0; i12 -= 8) {
                i10++;
            }
        }
        return i10;
    }

    public static int b(int i) throws IOException {
        if (i < 31) {
            return 1;
        }
        if (i < 128) {
            return 2;
        }
        byte[] bArr = new byte[5];
        int i10 = 4;
        do {
            i >>= 7;
            i10--;
            bArr[i10] = (byte) ((i & 127) | 128);
        } while (i > 127);
        return 1 + (5 - i10);
    }

    public static int c(InputStream inputStream) {
        if (inputStream instanceof u1) {
            return ((u1) inputStream).f453b;
        }
        if (inputStream instanceof j) {
            return ((j) inputStream).f409a;
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long j10 = f457a;
        return j10 > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) j10;
    }
}
