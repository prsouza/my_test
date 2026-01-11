package io.sentry.vendor;

import androidx.fragment.app.o;
import java.io.UnsupportedEncodingException;

public class Base64 {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    public static abstract class Coder {
        public int op;
        public byte[] output;

        public abstract int maxOutputSize(int i);

        public abstract boolean process(byte[] bArr, int i, int i10, boolean z);
    }

    public static class Decoder extends Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, EQUALS, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, EQUALS, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        public Decoder(int i, byte[] bArr) {
            this.output = bArr;
            this.alphabet = (i & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        public int maxOutputSize(int i) {
            return o.a(i, 3, 4, 10);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
            r0.state = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c5, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f7, code lost:
            if (r21 != false) goto L_0x0100;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f9, code lost:
            r0.state = r5;
            r0.value = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
            r0.op = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ff, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0100, code lost:
            if (r5 == 1) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0102, code lost:
            if (r5 == 2) goto L_0x0118;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0104, code lost:
            if (r5 == 3) goto L_0x0109;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0106, code lost:
            if (r5 == 4) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0109, code lost:
            r1 = r11 + 1;
            r6[r11] = (byte) (r10 >> 10);
            r11 = r1 + 1;
            r6[r1] = (byte) (r10 >> 2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0118, code lost:
            r6[r11] = (byte) (r10 >> 4);
            r11 = r11 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0120, code lost:
            r0.state = r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            /*
                r17 = this;
                r0 = r17
                int r1 = r0.state
                r2 = 0
                r3 = 6
                if (r1 != r3) goto L_0x0009
                return r2
            L_0x0009:
                int r4 = r20 + r19
                int r5 = r0.value
                byte[] r6 = r0.output
                int[] r7 = r0.alphabet
                r8 = 5
                r9 = 4
                r11 = r2
                r10 = r5
                r5 = r1
                r1 = r19
            L_0x0018:
                r12 = 3
                r13 = 2
                r14 = 1
                if (r1 >= r4) goto L_0x00f7
                if (r5 != 0) goto L_0x0065
            L_0x001f:
                int r15 = r1 + 4
                if (r15 > r4) goto L_0x0061
                byte r10 = r18[r1]
                r10 = r10 & 255(0xff, float:3.57E-43)
                r10 = r7[r10]
                int r10 = r10 << 18
                int r16 = r1 + 1
                byte r2 = r18[r16]
                r2 = r2 & 255(0xff, float:3.57E-43)
                r2 = r7[r2]
                int r2 = r2 << 12
                r2 = r2 | r10
                int r10 = r1 + 2
                byte r10 = r18[r10]
                r10 = r10 & 255(0xff, float:3.57E-43)
                r10 = r7[r10]
                int r10 = r10 << r3
                r2 = r2 | r10
                int r10 = r1 + 3
                byte r10 = r18[r10]
                r10 = r10 & 255(0xff, float:3.57E-43)
                r10 = r7[r10]
                r10 = r10 | r2
                if (r10 < 0) goto L_0x0061
                int r1 = r11 + 2
                byte r2 = (byte) r10
                r6[r1] = r2
                int r1 = r11 + 1
                int r2 = r10 >> 8
                byte r2 = (byte) r2
                r6[r1] = r2
                int r1 = r10 >> 16
                byte r1 = (byte) r1
                r6[r11] = r1
                int r11 = r11 + 3
                r1 = r15
                r2 = 0
                goto L_0x001f
            L_0x0061:
                if (r1 < r4) goto L_0x0065
                goto L_0x00f7
            L_0x0065:
                int r2 = r1 + 1
                byte r1 = r18[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                r1 = r7[r1]
                r15 = -1
                if (r5 == 0) goto L_0x00e4
                if (r5 == r14) goto L_0x00d9
                r14 = -2
                if (r5 == r13) goto L_0x00c6
                if (r5 == r12) goto L_0x008f
                if (r5 == r9) goto L_0x0083
                if (r5 == r8) goto L_0x007d
                goto L_0x00f3
            L_0x007d:
                if (r1 == r15) goto L_0x00f3
            L_0x007f:
                r0.state = r3
                r12 = 0
                return r12
            L_0x0083:
                r12 = 0
                if (r1 != r14) goto L_0x008a
                int r5 = r5 + 1
                goto L_0x00ea
            L_0x008a:
                if (r1 == r15) goto L_0x00f3
                r0.state = r3
                return r12
            L_0x008f:
                if (r1 < 0) goto L_0x00ad
                int r5 = r10 << 6
                r10 = r5 | r1
                int r1 = r11 + 2
                byte r5 = (byte) r10
                r6[r1] = r5
                int r1 = r11 + 1
                int r5 = r10 >> 8
                byte r5 = (byte) r5
                r6[r1] = r5
                int r1 = r10 >> 16
                byte r1 = (byte) r1
                r6[r11] = r1
                int r11 = r11 + 3
                r1 = r2
                r2 = 0
                r5 = 0
                goto L_0x0018
            L_0x00ad:
                if (r1 != r14) goto L_0x00c0
                int r1 = r11 + 1
                int r5 = r10 >> 2
                byte r5 = (byte) r5
                r6[r1] = r5
                int r1 = r10 >> 10
                byte r1 = (byte) r1
                r6[r11] = r1
                int r11 = r11 + 2
                r1 = r2
                r5 = r8
                goto L_0x00f4
            L_0x00c0:
                if (r1 == r15) goto L_0x00f3
            L_0x00c2:
                r0.state = r3
                r1 = 0
                return r1
            L_0x00c6:
                if (r1 < 0) goto L_0x00c9
                goto L_0x00db
            L_0x00c9:
                if (r1 != r14) goto L_0x00d6
                int r1 = r11 + 1
                int r5 = r10 >> 4
                byte r5 = (byte) r5
                r6[r11] = r5
                r11 = r1
                r1 = r2
                r5 = r9
                goto L_0x00f4
            L_0x00d6:
                if (r1 == r15) goto L_0x00f3
                goto L_0x00c2
            L_0x00d9:
                if (r1 < 0) goto L_0x00e1
            L_0x00db:
                int r10 = r10 << 6
                r10 = r10 | r1
                int r5 = r5 + 1
                goto L_0x00f3
            L_0x00e1:
                if (r1 == r15) goto L_0x00f3
                goto L_0x007f
            L_0x00e4:
                r12 = 0
                if (r1 < 0) goto L_0x00ee
                int r5 = r5 + 1
                r10 = r1
            L_0x00ea:
                r1 = r2
                r2 = r12
                goto L_0x0018
            L_0x00ee:
                if (r1 == r15) goto L_0x00f3
                r0.state = r3
                return r12
            L_0x00f3:
                r1 = r2
            L_0x00f4:
                r2 = 0
                goto L_0x0018
            L_0x00f7:
                if (r21 != 0) goto L_0x0100
                r0.state = r5
                r0.value = r10
            L_0x00fd:
                r0.op = r11
                return r14
            L_0x0100:
                if (r5 == r14) goto L_0x00c2
                if (r5 == r13) goto L_0x0118
                if (r5 == r12) goto L_0x0109
                if (r5 == r9) goto L_0x00c2
                goto L_0x0120
            L_0x0109:
                int r1 = r11 + 1
                int r2 = r10 >> 10
                byte r2 = (byte) r2
                r6[r11] = r2
                int r11 = r1 + 1
                int r2 = r10 >> 2
                byte r2 = (byte) r2
                r6[r1] = r2
                goto L_0x0120
            L_0x0118:
                int r1 = r11 + 1
                int r2 = r10 >> 4
                byte r2 = (byte) r2
                r6[r11] = r2
                r11 = r1
            L_0x0120:
                r0.state = r5
                goto L_0x00fd
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.Base64.Decoder.process(byte[], int, int, boolean):boolean");
        }
    }

    public static class Encoder extends Coder {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte[] tail;
        public int tailLen;

        public Encoder(int i, byte[] bArr) {
            this.output = bArr;
            boolean z = true;
            this.do_padding = (i & 1) == 0;
            boolean z10 = (i & 2) == 0;
            this.do_newline = z10;
            this.do_cr = (i & 4) == 0 ? false : z;
            this.alphabet = (i & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = z10 ? 19 : -1;
        }

        public int maxOutputSize(int i) {
            return o.a(i, 8, 5, 10);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01ad  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00e6 A[SYNTHETIC] */
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            /*
                r17 = this;
                r0 = r17
                byte[] r1 = r0.alphabet
                byte[] r2 = r0.output
                int r3 = r0.count
                int r4 = r20 + r19
                int r5 = r0.tailLen
                r6 = -1
                r7 = 0
                r8 = 2
                r9 = 1
                if (r5 == r9) goto L_0x0031
                if (r5 == r8) goto L_0x0015
                goto L_0x0050
            L_0x0015:
                int r5 = r19 + 1
                if (r5 > r4) goto L_0x0050
                byte[] r10 = r0.tail
                byte r11 = r10[r7]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 16
                byte r10 = r10[r9]
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r10 = r10 << 8
                r10 = r10 | r11
                byte r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r10 = r10 | r11
                r0.tailLen = r7
                r11 = r5
                goto L_0x0053
            L_0x0031:
                int r5 = r19 + 2
                if (r5 > r4) goto L_0x0050
                byte[] r5 = r0.tail
                byte r5 = r5[r7]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 16
                int r10 = r19 + 1
                byte r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 8
                r5 = r5 | r11
                int r11 = r10 + 1
                byte r10 = r18[r10]
                r10 = r10 & 255(0xff, float:3.57E-43)
                r10 = r10 | r5
                r0.tailLen = r7
                goto L_0x0053
            L_0x0050:
                r11 = r19
                r10 = r6
            L_0x0053:
                r12 = 4
                r13 = 13
                r14 = 10
                if (r10 == r6) goto L_0x008f
                int r6 = r10 >> 18
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r7] = r6
                int r6 = r10 >> 12
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r9] = r6
                int r6 = r10 >> 6
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r8] = r6
                r6 = r10 & 63
                byte r6 = r1[r6]
                r10 = 3
                r2[r10] = r6
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x008d
                boolean r3 = r0.do_cr
                if (r3 == 0) goto L_0x0085
                r3 = 5
                r2[r12] = r13
                goto L_0x0086
            L_0x0085:
                r3 = r12
            L_0x0086:
                int r6 = r3 + 1
                r2[r3] = r14
            L_0x008a:
                r3 = 19
                goto L_0x0090
            L_0x008d:
                r6 = r12
                goto L_0x0090
            L_0x008f:
                r6 = r7
            L_0x0090:
                int r10 = r11 + 3
                if (r10 > r4) goto L_0x00e6
                byte r15 = r18[r11]
                r15 = r15 & 255(0xff, float:3.57E-43)
                int r15 = r15 << 16
                int r16 = r11 + 1
                byte r5 = r18[r16]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 8
                r5 = r5 | r15
                int r11 = r11 + 2
                byte r11 = r18[r11]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r5 = r5 | r11
                int r11 = r5 >> 18
                r11 = r11 & 63
                byte r11 = r1[r11]
                r2[r6] = r11
                int r11 = r6 + 1
                int r15 = r5 >> 12
                r15 = r15 & 63
                byte r15 = r1[r15]
                r2[r11] = r15
                int r11 = r6 + 2
                int r15 = r5 >> 6
                r15 = r15 & 63
                byte r15 = r1[r15]
                r2[r11] = r15
                int r11 = r6 + 3
                r5 = r5 & 63
                byte r5 = r1[r5]
                r2[r11] = r5
                int r6 = r6 + 4
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x00e4
                boolean r3 = r0.do_cr
                if (r3 == 0) goto L_0x00dd
                int r3 = r6 + 1
                r2[r6] = r13
                r6 = r3
            L_0x00dd:
                int r3 = r6 + 1
                r2[r6] = r14
                r6 = r3
                r11 = r10
                goto L_0x008a
            L_0x00e4:
                r11 = r10
                goto L_0x0090
            L_0x00e6:
                if (r21 == 0) goto L_0x01ad
                int r5 = r0.tailLen
                int r10 = r11 - r5
                int r15 = r4 + -1
                r16 = 61
                if (r10 != r15) goto L_0x0134
                if (r5 <= 0) goto L_0x00fa
                byte[] r4 = r0.tail
                byte r4 = r4[r7]
                r7 = r9
                goto L_0x00fc
            L_0x00fa:
                byte r4 = r18[r11]
            L_0x00fc:
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r4 = r4 << r12
                int r5 = r5 - r7
                r0.tailLen = r5
                int r5 = r6 + 1
                int r7 = r4 >> 6
                r7 = r7 & 63
                byte r7 = r1[r7]
                r2[r6] = r7
                int r6 = r5 + 1
                r4 = r4 & 63
                byte r1 = r1[r4]
                r2[r5] = r1
                boolean r1 = r0.do_padding
                if (r1 == 0) goto L_0x0120
                int r1 = r6 + 1
                r2[r6] = r16
                int r6 = r1 + 1
                r2[r1] = r16
            L_0x0120:
                boolean r1 = r0.do_newline
                if (r1 == 0) goto L_0x01d6
                boolean r1 = r0.do_cr
                if (r1 == 0) goto L_0x012d
                int r1 = r6 + 1
                r2[r6] = r13
                r6 = r1
            L_0x012d:
                int r1 = r6 + 1
                r2[r6] = r14
            L_0x0131:
                r6 = r1
                goto L_0x01d6
            L_0x0134:
                int r4 = r4 - r8
                if (r10 != r4) goto L_0x0195
                if (r5 <= r9) goto L_0x013f
                byte[] r4 = r0.tail
                byte r4 = r4[r7]
                r7 = r9
                goto L_0x0145
            L_0x013f:
                int r4 = r11 + 1
                byte r10 = r18[r11]
                r11 = r4
                r4 = r10
            L_0x0145:
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r4 = r4 << r14
                if (r5 <= 0) goto L_0x0151
                byte[] r10 = r0.tail
                int r11 = r7 + 1
                byte r7 = r10[r7]
                goto L_0x0155
            L_0x0151:
                byte r10 = r18[r11]
                r11 = r7
                r7 = r10
            L_0x0155:
                r7 = r7 & 255(0xff, float:3.57E-43)
                int r7 = r7 << r8
                r4 = r4 | r7
                int r5 = r5 - r11
                r0.tailLen = r5
                int r5 = r6 + 1
                int r7 = r4 >> 12
                r7 = r7 & 63
                byte r7 = r1[r7]
                r2[r6] = r7
                int r6 = r5 + 1
                int r7 = r4 >> 6
                r7 = r7 & 63
                byte r7 = r1[r7]
                r2[r5] = r7
                int r5 = r6 + 1
                r4 = r4 & 63
                byte r1 = r1[r4]
                r2[r6] = r1
                boolean r1 = r0.do_padding
                if (r1 == 0) goto L_0x0181
                int r1 = r5 + 1
                r2[r5] = r16
                r5 = r1
            L_0x0181:
                boolean r1 = r0.do_newline
                if (r1 == 0) goto L_0x0193
                boolean r1 = r0.do_cr
                if (r1 == 0) goto L_0x018e
                int r1 = r5 + 1
                r2[r5] = r13
                r5 = r1
            L_0x018e:
                int r1 = r5 + 1
                r2[r5] = r14
                r5 = r1
            L_0x0193:
                r6 = r5
                goto L_0x01d6
            L_0x0195:
                boolean r1 = r0.do_newline
                if (r1 == 0) goto L_0x01d6
                if (r6 <= 0) goto L_0x01d6
                r1 = 19
                if (r3 == r1) goto L_0x01d6
                boolean r1 = r0.do_cr
                if (r1 == 0) goto L_0x01a8
                int r1 = r6 + 1
                r2[r6] = r13
                r6 = r1
            L_0x01a8:
                int r1 = r6 + 1
                r2[r6] = r14
                goto L_0x0131
            L_0x01ad:
                int r1 = r4 + -1
                if (r11 != r1) goto L_0x01be
                byte[] r1 = r0.tail
                int r2 = r0.tailLen
                int r4 = r2 + 1
                r0.tailLen = r4
                byte r4 = r18[r11]
                r1[r2] = r4
                goto L_0x01d6
            L_0x01be:
                int r4 = r4 - r8
                if (r11 != r4) goto L_0x01d6
                byte[] r1 = r0.tail
                int r2 = r0.tailLen
                int r4 = r2 + 1
                r0.tailLen = r4
                byte r5 = r18[r11]
                r1[r2] = r5
                int r2 = r4 + 1
                r0.tailLen = r2
                int r11 = r11 + r9
                byte r2 = r18[r11]
                r1[r4] = r2
            L_0x01d6:
                r0.op = r6
                r0.count = r3
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.Base64.Encoder.process(byte[], int, int, boolean):boolean");
        }
    }

    private Base64() {
    }

    public static byte[] decode(String str, int i) {
        return decode(str.getBytes(), i);
    }

    public static byte[] decode(byte[] bArr, int i) {
        return decode(bArr, 0, bArr.length, i);
    }

    public static byte[] decode(byte[] bArr, int i, int i10, int i11) {
        Decoder decoder = new Decoder(i11, new byte[((i10 * 3) / 4)]);
        if (decoder.process(bArr, i, i10, true)) {
            int i12 = decoder.op;
            byte[] bArr2 = decoder.output;
            if (i12 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i12];
            System.arraycopy(bArr2, 0, bArr3, 0, i12);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] encode(byte[] bArr, int i) {
        return encode(bArr, 0, bArr.length, i);
    }

    public static byte[] encode(byte[] bArr, int i, int i10, int i11) {
        Encoder encoder = new Encoder(i11, (byte[]) null);
        int i12 = (i10 / 3) * 4;
        int i13 = 2;
        if (!encoder.do_padding) {
            int i14 = i10 % 3;
            if (i14 == 1) {
                i12 += 2;
            } else if (i14 == 2) {
                i12 += 3;
            }
        } else if (i10 % 3 > 0) {
            i12 += 4;
        }
        if (encoder.do_newline && i10 > 0) {
            int i15 = ((i10 - 1) / 57) + 1;
            if (!encoder.do_cr) {
                i13 = 1;
            }
            i12 += i15 * i13;
        }
        encoder.output = new byte[i12];
        encoder.process(bArr, i, i10, true);
        return encoder.output;
    }

    public static String encodeToString(byte[] bArr, int i) {
        try {
            return new String(encode(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public static String encodeToString(byte[] bArr, int i, int i10, int i11) {
        try {
            return new String(encode(bArr, i, i10, i11), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
