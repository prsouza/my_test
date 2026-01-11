package net.jpountz.lz4;

final class LZ4JavaUnsafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaUnsafeCompressor();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r5) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        if (r11 < 15) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, 240);
        r12 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r11 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r11 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0071, code lost:
        net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r9, r3, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0075, code lost:
        net.jpountz.util.UnsafeUtils.writeShortLE(r3, r12, (short) (r8 - r15));
        r12 = r12 + 2;
        r8 = r8 + 4;
        r9 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r0, r15 + 4, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        if (((r12 + 6) + (r9 >>> 8)) > r5) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        r8 = r8 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        if (r9 < 15) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, (int) net.jpountz.util.UnsafeUtils.readByte(r3, r10) | 15);
        r10 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r9 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, (int) r9 | net.jpountz.util.UnsafeUtils.readByte(r3, r10));
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00aa, code lost:
        if (r8 <= r7) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ac, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ae, code lost:
        r9 = r8 - 2;
        net.jpountz.util.UnsafeUtils.writeShort(r2, net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.UnsafeUtils.readInt(r0, r9)), r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.UnsafeUtils.readInt(r0, r8));
        r15 = net.jpountz.util.UnsafeUtils.readShort(r2, r9) + r1;
        net.jpountz.util.UnsafeUtils.writeShort(r2, r9, r8 - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d3, code lost:
        if (net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r8, r15) != false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00de, code lost:
        r12 = r10 + 1;
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ea, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f0, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        r11 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r0, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int compress64k(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            int r4 = r1 + r2
            int r6 = r4 + -5
            int r7 = r4 + -12
            r8 = 13
            if (r2 < r8) goto L_0x00f7
            r2 = 8192(0x2000, float:1.14794E-41)
            short[] r2 = new short[r2]
            int r8 = r1 + 1
            r10 = r21
            r9 = r1
        L_0x001d:
            int r11 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            r12 = 1
            int r11 = r12 << r11
        L_0x0022:
            int r12 = r12 + r8
            int r13 = r11 + 1
            int r14 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r11 = r11 >>> r14
            if (r12 <= r7) goto L_0x002d
            r1 = r9
            goto L_0x00f9
        L_0x002d:
            int r14 = net.jpountz.util.UnsafeUtils.readInt((byte[]) r0, (int) r8)
            int r14 = net.jpountz.lz4.LZ4Utils.hash64k(r14)
            int r15 = net.jpountz.util.UnsafeUtils.readShort((short[]) r2, (int) r14)
            int r15 = r15 + r1
            r19 = r11
            int r11 = r8 - r1
            net.jpountz.util.UnsafeUtils.writeShort((short[]) r2, (int) r14, (int) r11)
            boolean r11 = net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r15, r8)
            if (r11 == 0) goto L_0x00f1
            int r11 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r0, r15, r8, r1, r9)
            int r8 = r8 - r11
            int r15 = r15 - r11
            int r11 = r8 - r9
            int r12 = r10 + 1
            int r13 = r12 + r11
            int r13 = r13 + 8
            int r14 = r11 >>> 8
            int r13 = r13 + r14
            java.lang.String r14 = "maxDestLen is too small"
            if (r13 > r5) goto L_0x00eb
            r13 = 15
            if (r11 < r13) goto L_0x006c
            r13 = 240(0xf0, float:3.36E-43)
            net.jpountz.util.UnsafeUtils.writeByte((byte[]) r3, (int) r10, (int) r13)
            int r13 = r11 + -15
            int r12 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r13, r3, r12)
            goto L_0x0071
        L_0x006c:
            int r13 = r11 << 4
            net.jpountz.util.UnsafeUtils.writeByte((byte[]) r3, (int) r10, (int) r13)
        L_0x0071:
            net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r9, r3, r12, r11)
            int r12 = r12 + r11
        L_0x0075:
            int r9 = r8 - r15
            short r9 = (short) r9
            net.jpountz.util.UnsafeUtils.writeShortLE(r3, r12, r9)
            int r12 = r12 + 2
            int r8 = r8 + 4
            int r15 = r15 + 4
            int r9 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r0, r15, r8, r6)
            int r11 = r12 + 6
            int r13 = r9 >>> 8
            int r11 = r11 + r13
            if (r11 > r5) goto L_0x00e5
            int r8 = r8 + r9
            r11 = 15
            if (r9 < r11) goto L_0x00a1
            byte r13 = net.jpountz.util.UnsafeUtils.readByte(r3, r10)
            r13 = r13 | r11
            net.jpountz.util.UnsafeUtils.writeByte((byte[]) r3, (int) r10, (int) r13)
            int r9 = r9 + -15
            int r9 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r9, r3, r12)
            r10 = r9
            goto L_0x00aa
        L_0x00a1:
            byte r13 = net.jpountz.util.UnsafeUtils.readByte(r3, r10)
            r9 = r9 | r13
            net.jpountz.util.UnsafeUtils.writeByte((byte[]) r3, (int) r10, (int) r9)
            r10 = r12
        L_0x00aa:
            if (r8 <= r7) goto L_0x00ae
            r1 = r8
            goto L_0x00f9
        L_0x00ae:
            int r9 = r8 + -2
            int r12 = net.jpountz.util.UnsafeUtils.readInt((byte[]) r0, (int) r9)
            int r12 = net.jpountz.lz4.LZ4Utils.hash64k(r12)
            int r9 = r9 - r1
            net.jpountz.util.UnsafeUtils.writeShort((short[]) r2, (int) r12, (int) r9)
            int r9 = net.jpountz.util.UnsafeUtils.readInt((byte[]) r0, (int) r8)
            int r9 = net.jpountz.lz4.LZ4Utils.hash64k(r9)
            int r12 = net.jpountz.util.UnsafeUtils.readShort((short[]) r2, (int) r9)
            int r15 = r12 + r1
            int r12 = r8 - r1
            net.jpountz.util.UnsafeUtils.writeShort((short[]) r2, (int) r9, (int) r12)
            boolean r9 = net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r8, r15)
            if (r9 != 0) goto L_0x00de
            int r9 = r8 + 1
            r16 = r9
            r9 = r8
            r8 = r16
            goto L_0x001d
        L_0x00de:
            int r12 = r10 + 1
            r9 = 0
            net.jpountz.util.UnsafeUtils.writeByte((byte[]) r3, (int) r10, (int) r9)
            goto L_0x0075
        L_0x00e5:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r14)
            throw r0
        L_0x00eb:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r14)
            throw r0
        L_0x00f1:
            r8 = r12
            r11 = r13
            r12 = r19
            goto L_0x0022
        L_0x00f7:
            r10 = r21
        L_0x00f9:
            int r2 = r4 - r1
            r0 = r17
            r3 = r20
            r4 = r10
            r5 = r22
            int r0 = net.jpountz.lz4.LZ4UnsafeUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r21
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress64k(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        r12 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r0, r15, r7, r1, r9);
        r7 = r7 - r12;
        r15 = r15 - r12;
        r12 = r7 - r9;
        r13 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if ((((r13 + r12) + 8) + (r12 >>> 8)) > r5) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007b, code lost:
        if (r12 < 15) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, 240);
        r13 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r12 - 15, r3, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0089, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r12 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008e, code lost:
        net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r9, r3, r13, r12);
        r13 = r13 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0092, code lost:
        net.jpountz.util.UnsafeUtils.writeShortLE(r3, r13, r11);
        r13 = r13 + 2;
        r7 = r7 + 4;
        r9 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r0, r15 + 4, r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a4, code lost:
        if (((r13 + 6) + (r9 >>> 8)) > r5) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a6, code lost:
        r7 = r7 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a9, code lost:
        if (r9 < 15) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ab, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, (int) net.jpountz.util.UnsafeUtils.readByte(r3, r10) | 15);
        r10 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r9 - 15, r3, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, (int) r9 | net.jpountz.util.UnsafeUtils.readByte(r3, r10));
        r10 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
        if (r7 <= r6) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c6, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d5, code lost:
        r9 = r7 - 2;
        net.jpountz.util.UnsafeUtils.writeInt(r8, net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.UnsafeUtils.readInt(r0, r9)), r9);
        r9 = net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.UnsafeUtils.readInt(r0, r7));
        r15 = net.jpountz.util.UnsafeUtils.readInt(r8, r9);
        net.jpountz.util.UnsafeUtils.writeInt(r8, r9, r7);
        r9 = r7 - r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f5, code lost:
        if (r9 >= 65536) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fb, code lost:
        if (net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r15, r7) != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        r13 = r10 + 1;
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, 0);
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0113, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0119, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compress(byte[] r19, int r20, int r21, byte[] r22, int r23, int r24) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            net.jpountz.util.UnsafeUtils.checkRange(r19, r20, r21)
            net.jpountz.util.UnsafeUtils.checkRange(r22, r23, r24)
            int r5 = r23 + r24
            r4 = 65547(0x1000b, float:9.1851E-41)
            if (r2 >= r4) goto L_0x0024
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            int r0 = compress64k((byte[]) r0, (int) r1, (int) r2, (byte[]) r3, (int) r4, (int) r5)
            return r0
        L_0x0024:
            int r2 = r2 + r1
            int r4 = r2 + -5
            int r6 = r2 + -12
            int r7 = r1 + 1
            r8 = 4096(0x1000, float:5.74E-42)
            int[] r8 = new int[r8]
            java.util.Arrays.fill(r8, r1)
            r10 = r23
            r9 = r1
        L_0x0035:
            int r11 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            r12 = 1
            int r11 = r12 << r11
        L_0x003a:
            int r12 = r12 + r7
            int r13 = r11 + 1
            int r14 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r11 = r11 >>> r14
            if (r12 <= r6) goto L_0x0046
            r1 = r9
        L_0x0043:
            r4 = r10
            goto L_0x00c9
        L_0x0046:
            int r14 = net.jpountz.util.UnsafeUtils.readInt((byte[]) r0, (int) r7)
            int r14 = net.jpountz.lz4.LZ4Utils.hash(r14)
            int r15 = net.jpountz.util.UnsafeUtils.readInt((int[]) r8, (int) r14)
            r21 = r11
            int r11 = r7 - r15
            net.jpountz.util.UnsafeUtils.writeInt((int[]) r8, (int) r14, (int) r7)
            r14 = 65536(0x10000, float:9.18355E-41)
            if (r11 >= r14) goto L_0x011a
            boolean r16 = net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r15, r7)
            if (r16 == 0) goto L_0x011a
            int r12 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r0, r15, r7, r1, r9)
            int r7 = r7 - r12
            int r15 = r15 - r12
            int r12 = r7 - r9
            int r13 = r10 + 1
            int r16 = r13 + r12
            int r16 = r16 + 8
            int r17 = r12 >>> 8
            int r14 = r16 + r17
            java.lang.String r1 = "maxDestLen is too small"
            if (r14 > r5) goto L_0x0114
            r14 = 15
            if (r12 < r14) goto L_0x0089
            r14 = 240(0xf0, float:3.36E-43)
            net.jpountz.util.UnsafeUtils.writeByte((byte[]) r3, (int) r10, (int) r14)
            int r14 = r12 + -15
            int r13 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r14, r3, r13)
            goto L_0x008e
        L_0x0089:
            int r14 = r12 << 4
            net.jpountz.util.UnsafeUtils.writeByte((byte[]) r3, (int) r10, (int) r14)
        L_0x008e:
            net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r9, r3, r13, r12)
            int r13 = r13 + r12
        L_0x0092:
            net.jpountz.util.UnsafeUtils.writeShortLE(r3, r13, r11)
            int r13 = r13 + 2
            int r7 = r7 + 4
            int r15 = r15 + 4
            int r9 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r0, r15, r7, r4)
            int r11 = r13 + 6
            int r12 = r9 >>> 8
            int r11 = r11 + r12
            if (r11 > r5) goto L_0x010e
            int r7 = r7 + r9
            r11 = 15
            if (r9 < r11) goto L_0x00bb
            byte r12 = net.jpountz.util.UnsafeUtils.readByte(r3, r10)
            r12 = r12 | r11
            net.jpountz.util.UnsafeUtils.writeByte((byte[]) r3, (int) r10, (int) r12)
            int r9 = r9 + -15
            int r9 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r9, r3, r13)
            r10 = r9
            goto L_0x00c4
        L_0x00bb:
            byte r12 = net.jpountz.util.UnsafeUtils.readByte(r3, r10)
            r9 = r9 | r12
            net.jpountz.util.UnsafeUtils.writeByte((byte[]) r3, (int) r10, (int) r9)
            r10 = r13
        L_0x00c4:
            if (r7 <= r6) goto L_0x00d5
            r1 = r7
            goto L_0x0043
        L_0x00c9:
            int r2 = r2 - r1
            r0 = r19
            r3 = r22
            int r0 = net.jpountz.lz4.LZ4UnsafeUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r23
            return r0
        L_0x00d5:
            int r9 = r7 + -2
            int r12 = net.jpountz.util.UnsafeUtils.readInt((byte[]) r0, (int) r9)
            int r12 = net.jpountz.lz4.LZ4Utils.hash(r12)
            net.jpountz.util.UnsafeUtils.writeInt((int[]) r8, (int) r12, (int) r9)
            int r9 = net.jpountz.util.UnsafeUtils.readInt((byte[]) r0, (int) r7)
            int r9 = net.jpountz.lz4.LZ4Utils.hash(r9)
            int r15 = net.jpountz.util.UnsafeUtils.readInt((int[]) r8, (int) r9)
            net.jpountz.util.UnsafeUtils.writeInt((int[]) r8, (int) r9, (int) r7)
            int r9 = r7 - r15
            r12 = 65536(0x10000, float:9.18355E-41)
            if (r9 >= r12) goto L_0x0106
            boolean r13 = net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r15, r7)
            if (r13 != 0) goto L_0x00fe
            goto L_0x0106
        L_0x00fe:
            int r13 = r10 + 1
            r14 = 0
            net.jpountz.util.UnsafeUtils.writeByte((byte[]) r3, (int) r10, (int) r14)
            r11 = r9
            goto L_0x0092
        L_0x0106:
            int r1 = r7 + 1
            r9 = r7
            r7 = r1
            r1 = r20
            goto L_0x0035
        L_0x010e:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r1)
            throw r0
        L_0x0114:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r1)
            throw r0
        L_0x011a:
            r1 = r20
            r7 = r12
            r11 = r13
            r12 = r21
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r5) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        if (r11 < 15) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, 240);
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r11 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0071, code lost:
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r0, r9, r3, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0075, code lost:
        net.jpountz.util.ByteBufferUtils.writeShortLE(r3, r12, (short) (r8 - r15));
        r12 = r12 + 2;
        r8 = r8 + 4;
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r0, r15 + 4, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        if (((r12 + 6) + (r9 >>> 8)) > r5) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        r8 = r8 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        if (r9 < 15) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, net.jpountz.util.ByteBufferUtils.readByte(r3, r10) | 15);
        r10 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r9 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r9 | net.jpountz.util.ByteBufferUtils.readByte(r3, r10));
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00aa, code lost:
        if (r8 <= r7) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ac, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ae, code lost:
        r9 = r8 - 2;
        net.jpountz.util.UnsafeUtils.writeShort(r2, net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.ByteBufferUtils.readInt(r0, r9)), r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.ByteBufferUtils.readInt(r0, r8));
        r15 = net.jpountz.util.UnsafeUtils.readShort(r2, r9) + r1;
        net.jpountz.util.UnsafeUtils.writeShort(r2, r9, r8 - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d3, code lost:
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r0, r8, r15) != false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00de, code lost:
        r12 = r10 + 1;
        net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ea, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f0, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r0, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int compress64k(java.nio.ByteBuffer r17, int r18, int r19, java.nio.ByteBuffer r20, int r21, int r22) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            int r4 = r1 + r2
            int r6 = r4 + -5
            int r7 = r4 + -12
            r8 = 13
            if (r2 < r8) goto L_0x00f7
            r2 = 8192(0x2000, float:1.14794E-41)
            short[] r2 = new short[r2]
            int r8 = r1 + 1
            r10 = r21
            r9 = r1
        L_0x001d:
            int r11 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            r12 = 1
            int r11 = r12 << r11
        L_0x0022:
            int r12 = r12 + r8
            int r13 = r11 + 1
            int r14 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r11 = r11 >>> r14
            if (r12 <= r7) goto L_0x002d
            r1 = r9
            goto L_0x00f9
        L_0x002d:
            int r14 = net.jpountz.util.ByteBufferUtils.readInt(r0, r8)
            int r14 = net.jpountz.lz4.LZ4Utils.hash64k(r14)
            int r15 = net.jpountz.util.UnsafeUtils.readShort((short[]) r2, (int) r14)
            int r15 = r15 + r1
            r19 = r11
            int r11 = r8 - r1
            net.jpountz.util.UnsafeUtils.writeShort((short[]) r2, (int) r14, (int) r11)
            boolean r11 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r0, r15, r8)
            if (r11 == 0) goto L_0x00f1
            int r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r0, r15, r8, r1, r9)
            int r8 = r8 - r11
            int r15 = r15 - r11
            int r11 = r8 - r9
            int r12 = r10 + 1
            int r13 = r12 + r11
            int r13 = r13 + 8
            int r14 = r11 >>> 8
            int r13 = r13 + r14
            java.lang.String r14 = "maxDestLen is too small"
            if (r13 > r5) goto L_0x00eb
            r13 = 15
            if (r11 < r13) goto L_0x006c
            r13 = 240(0xf0, float:3.36E-43)
            net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r13)
            int r13 = r11 + -15
            int r12 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r13, r3, r12)
            goto L_0x0071
        L_0x006c:
            int r13 = r11 << 4
            net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r13)
        L_0x0071:
            net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r0, r9, r3, r12, r11)
            int r12 = r12 + r11
        L_0x0075:
            int r9 = r8 - r15
            short r9 = (short) r9
            net.jpountz.util.ByteBufferUtils.writeShortLE(r3, r12, r9)
            int r12 = r12 + 2
            int r8 = r8 + 4
            int r15 = r15 + 4
            int r9 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r0, r15, r8, r6)
            int r11 = r12 + 6
            int r13 = r9 >>> 8
            int r11 = r11 + r13
            if (r11 > r5) goto L_0x00e5
            int r8 = r8 + r9
            r11 = 15
            if (r9 < r11) goto L_0x00a1
            byte r13 = net.jpountz.util.ByteBufferUtils.readByte(r3, r10)
            r13 = r13 | r11
            net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r13)
            int r9 = r9 + -15
            int r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r9, r3, r12)
            r10 = r9
            goto L_0x00aa
        L_0x00a1:
            byte r13 = net.jpountz.util.ByteBufferUtils.readByte(r3, r10)
            r9 = r9 | r13
            net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r9)
            r10 = r12
        L_0x00aa:
            if (r8 <= r7) goto L_0x00ae
            r1 = r8
            goto L_0x00f9
        L_0x00ae:
            int r9 = r8 + -2
            int r12 = net.jpountz.util.ByteBufferUtils.readInt(r0, r9)
            int r12 = net.jpountz.lz4.LZ4Utils.hash64k(r12)
            int r9 = r9 - r1
            net.jpountz.util.UnsafeUtils.writeShort((short[]) r2, (int) r12, (int) r9)
            int r9 = net.jpountz.util.ByteBufferUtils.readInt(r0, r8)
            int r9 = net.jpountz.lz4.LZ4Utils.hash64k(r9)
            int r12 = net.jpountz.util.UnsafeUtils.readShort((short[]) r2, (int) r9)
            int r15 = r12 + r1
            int r12 = r8 - r1
            net.jpountz.util.UnsafeUtils.writeShort((short[]) r2, (int) r9, (int) r12)
            boolean r9 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r0, r8, r15)
            if (r9 != 0) goto L_0x00de
            int r9 = r8 + 1
            r16 = r9
            r9 = r8
            r8 = r16
            goto L_0x001d
        L_0x00de:
            int r12 = r10 + 1
            r9 = 0
            net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r9)
            goto L_0x0075
        L_0x00e5:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r14)
            throw r0
        L_0x00eb:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r14)
            throw r0
        L_0x00f1:
            r8 = r12
            r11 = r13
            r12 = r19
            goto L_0x0022
        L_0x00f7:
            r10 = r21
        L_0x00f9:
            int r2 = r4 - r1
            r0 = r17
            r3 = r20
            r4 = r10
            r5 = r22
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r21
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress64k(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009b, code lost:
        r14 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r5, r12, r6, r1, r9);
        r6 = r6 - r14;
        r12 = r12 - r14;
        r14 = r6 - r9;
        r15 = r11 + 1;
        r19 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b1, code lost:
        if ((((r15 + r14) + 8) + (r14 >>> 8)) > r10) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b5, code lost:
        if (r14 < 15) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b7, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, 240);
        r15 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r14 - 15, r8, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c3, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r14 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c8, code lost:
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r5, r9, r8, r15, r14);
        r15 = r15 + r14;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ce, code lost:
        net.jpountz.util.ByteBufferUtils.writeShortLE(r8, r15, r13);
        r15 = r15 + 2;
        r1 = r1 + 4;
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r5, r12 + 4, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e0, code lost:
        if (((r15 + 6) + (r9 >>> 8)) > r10) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e2, code lost:
        r1 = r1 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e5, code lost:
        if (r9 < 15) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e7, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, net.jpountz.util.ByteBufferUtils.readByte(r8, r11) | 15);
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r9 - 15, r8, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f7, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r9 | net.jpountz.util.ByteBufferUtils.readByte(r8, r11));
        r11 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0100, code lost:
        if (r1 <= r3) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0102, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010d, code lost:
        r9 = r1 - 2;
        net.jpountz.util.UnsafeUtils.writeInt(r7, net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.ByteBufferUtils.readInt(r5, r9)), r9);
        r9 = net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.ByteBufferUtils.readInt(r5, r1));
        r13 = net.jpountz.util.UnsafeUtils.readInt(r7, r9);
        net.jpountz.util.UnsafeUtils.writeInt(r7, r9, r1);
        r9 = r1 - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x012d, code lost:
        if (r9 >= 65536) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0133, code lost:
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r13, r1) != false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0136, code lost:
        r15 = r11 + 1;
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, 0);
        r12 = r13;
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014b, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0151, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compress(java.nio.ByteBuffer r19, int r20, int r21, java.nio.ByteBuffer r22, int r23, int r24) {
        /*
            r18 = this;
            r1 = r20
            r3 = r21
            r4 = r23
            r6 = r24
            boolean r0 = r19.hasArray()
            if (r0 == 0) goto L_0x0037
            boolean r0 = r22.hasArray()
            if (r0 == 0) goto L_0x0037
            byte[] r2 = r19.array()
            int r0 = r19.arrayOffset()
            int r5 = r0 + r1
            byte[] r7 = r22.array()
            int r0 = r22.arrayOffset()
            int r8 = r0 + r4
            r0 = r18
            r1 = r2
            r2 = r5
            r3 = r21
            r4 = r7
            r5 = r8
            r6 = r24
            int r0 = r0.compress((byte[]) r1, (int) r2, (int) r3, (byte[]) r4, (int) r5, (int) r6)
            return r0
        L_0x0037:
            java.nio.ByteBuffer r5 = net.jpountz.util.ByteBufferUtils.inNativeByteOrder(r19)
            java.nio.ByteBuffer r8 = net.jpountz.util.ByteBufferUtils.inNativeByteOrder(r22)
            net.jpountz.util.ByteBufferUtils.checkRange(r5, r1, r3)
            net.jpountz.util.ByteBufferUtils.checkRange(r8, r4, r6)
            int r10 = r4 + r6
            r0 = 65547(0x1000b, float:9.1851E-41)
            if (r3 >= r0) goto L_0x005a
            r0 = r5
            r1 = r20
            r2 = r21
            r3 = r8
            r4 = r23
            r5 = r10
            int r0 = compress64k((java.nio.ByteBuffer) r0, (int) r1, (int) r2, (java.nio.ByteBuffer) r3, (int) r4, (int) r5)
            return r0
        L_0x005a:
            int r0 = r1 + r3
            int r2 = r0 + -5
            int r3 = r0 + -12
            int r6 = r1 + 1
            r7 = 4096(0x1000, float:5.74E-42)
            int[] r7 = new int[r7]
            java.util.Arrays.fill(r7, r1)
            r9 = r1
            r11 = r4
        L_0x006b:
            int r12 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            r13 = 1
            int r12 = r13 << r12
        L_0x0070:
            int r13 = r13 + r6
            int r14 = r12 + 1
            int r15 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r12 = r12 >>> r15
            if (r13 <= r3) goto L_0x007c
            r6 = r9
        L_0x0079:
            r9 = r11
            goto L_0x0105
        L_0x007c:
            int r15 = net.jpountz.util.ByteBufferUtils.readInt(r5, r6)
            int r15 = net.jpountz.lz4.LZ4Utils.hash(r15)
            r19 = r12
            int r12 = net.jpountz.util.UnsafeUtils.readInt((int[]) r7, (int) r15)
            r21 = r13
            int r13 = r6 - r12
            net.jpountz.util.UnsafeUtils.writeInt((int[]) r7, (int) r15, (int) r6)
            r15 = 65536(0x10000, float:9.18355E-41)
            if (r13 >= r15) goto L_0x0152
            boolean r16 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r6)
            if (r16 == 0) goto L_0x0152
            int r14 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r5, r12, r6, r1, r9)
            int r6 = r6 - r14
            int r12 = r12 - r14
            int r14 = r6 - r9
            int r15 = r11 + 1
            int r16 = r15 + r14
            int r16 = r16 + 8
            int r17 = r14 >>> 8
            int r1 = r16 + r17
            r19 = r6
            java.lang.String r6 = "maxDestLen is too small"
            if (r1 > r10) goto L_0x014c
            r1 = 15
            if (r14 < r1) goto L_0x00c3
            r1 = 240(0xf0, float:3.36E-43)
            net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r1)
            int r1 = r14 + -15
            int r15 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r1, r8, r15)
            goto L_0x00c8
        L_0x00c3:
            int r1 = r14 << 4
            net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r1)
        L_0x00c8:
            net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r5, r9, r8, r15, r14)
            int r15 = r15 + r14
            r1 = r19
        L_0x00ce:
            net.jpountz.util.ByteBufferUtils.writeShortLE(r8, r15, r13)
            int r15 = r15 + 2
            int r1 = r1 + 4
            int r12 = r12 + 4
            int r9 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r5, r12, r1, r2)
            int r12 = r15 + 6
            int r13 = r9 >>> 8
            int r12 = r12 + r13
            if (r12 > r10) goto L_0x0146
            int r1 = r1 + r9
            r12 = 15
            if (r9 < r12) goto L_0x00f7
            byte r13 = net.jpountz.util.ByteBufferUtils.readByte(r8, r11)
            r13 = r13 | r12
            net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r13)
            int r9 = r9 + -15
            int r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r9, r8, r15)
            r11 = r9
            goto L_0x0100
        L_0x00f7:
            byte r13 = net.jpountz.util.ByteBufferUtils.readByte(r8, r11)
            r9 = r9 | r13
            net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r9)
            r11 = r15
        L_0x0100:
            if (r1 <= r3) goto L_0x010d
            r6 = r1
            goto L_0x0079
        L_0x0105:
            int r7 = r0 - r6
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.lastLiterals(r5, r6, r7, r8, r9, r10)
            int r0 = r0 - r4
            return r0
        L_0x010d:
            int r9 = r1 + -2
            int r13 = net.jpountz.util.ByteBufferUtils.readInt(r5, r9)
            int r13 = net.jpountz.lz4.LZ4Utils.hash(r13)
            net.jpountz.util.UnsafeUtils.writeInt((int[]) r7, (int) r13, (int) r9)
            int r9 = net.jpountz.util.ByteBufferUtils.readInt(r5, r1)
            int r9 = net.jpountz.lz4.LZ4Utils.hash(r9)
            int r13 = net.jpountz.util.UnsafeUtils.readInt((int[]) r7, (int) r9)
            net.jpountz.util.UnsafeUtils.writeInt((int[]) r7, (int) r9, (int) r1)
            int r9 = r1 - r13
            r14 = 65536(0x10000, float:9.18355E-41)
            if (r9 >= r14) goto L_0x013f
            boolean r15 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r13, r1)
            if (r15 != 0) goto L_0x0136
            goto L_0x013f
        L_0x0136:
            int r15 = r11 + 1
            r12 = 0
            net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r12)
            r12 = r13
            r13 = r9
            goto L_0x00ce
        L_0x013f:
            int r6 = r1 + 1
            r9 = r1
            r1 = r20
            goto L_0x006b
        L_0x0146:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r6)
            throw r0
        L_0x014c:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r6)
            throw r0
        L_0x0152:
            r13 = r19
            r1 = r20
            r6 = r21
            r12 = r14
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
