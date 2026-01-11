package x8;

import com.google.android.gms.common.api.Api;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import net.jpountz.lz4.LZ4FrameOutputStream;

public final class d {
    public static byte[] a(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i) {
            return remove;
        }
        int length = i - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(LZ4Constants.HASH_TABLE_SIZE_64K, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < min2) {
                int read = inputStream.read(bArr, i10, min2 - i10);
                if (read == -1) {
                    return a(arrayDeque, i);
                }
                i10 += read;
                i += read;
            }
            long j10 = ((long) min) * ((long) (min < 4096 ? 4 : 2));
            min = j10 > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : j10 < -2147483648L ? LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK : (int) j10;
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final class a extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        public long f13029a = 1048577;

        /* renamed from: b  reason: collision with root package name */
        public long f13030b = -1;

        public a(InputStream inputStream) {
            super(inputStream);
        }

        public final int available() throws IOException {
            return (int) Math.min((long) this.in.available(), this.f13029a);
        }

        public final synchronized void mark(int i) {
            this.in.mark(i);
            this.f13030b = this.f13029a;
        }

        public final int read() throws IOException {
            if (this.f13029a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f13029a--;
            }
            return read;
        }

        public final synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f13030b != -1) {
                this.in.reset();
                this.f13029a = this.f13030b;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public final long skip(long j10) throws IOException {
            long skip = this.in.skip(Math.min(j10, this.f13029a));
            this.f13029a -= skip;
            return skip;
        }

        public final int read(byte[] bArr, int i, int i10) throws IOException {
            long j10 = this.f13029a;
            if (j10 == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i10, j10));
            if (read != -1) {
                this.f13029a -= (long) read;
            }
            return read;
        }
    }
}
