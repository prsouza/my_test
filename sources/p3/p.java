package p3;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class p implements ImageHeaderParser {
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(java.io.InputStream r1, j3.b r2) throws java.io.IOException {
        /*
            r0 = this;
            y0.a r2 = new y0.a
            r2.<init>(r1)
            java.lang.String r1 = "Orientation"
            y0.a$c r1 = r2.e(r1)
            if (r1 != 0) goto L_0x000e
            goto L_0x0015
        L_0x000e:
            java.nio.ByteOrder r2 = r2.f13345f     // Catch:{ NumberFormatException -> 0x0015 }
            int r1 = r1.f(r2)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            if (r1 != 0) goto L_0x0019
            r1 = -1
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.p.b(java.io.InputStream, j3.b):int");
    }

    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
