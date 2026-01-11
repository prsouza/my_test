package net.jpountz.lz4;

final class LZ4JavaUnsafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaUnsafeSafeDecompressor();

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int decompress(byte[] r18, int r19, int r20, byte[] r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r22
            net.jpountz.util.UnsafeUtils.checkRange(r18, r19, r20)
            net.jpountz.util.UnsafeUtils.checkRange(r21, r22, r23)
            r4 = 1
            if (r23 != 0) goto L_0x0023
            if (r1 != r4) goto L_0x001b
            byte r0 = net.jpountz.util.UnsafeUtils.readByte(r18, r19)
            if (r0 != 0) goto L_0x001b
            r0 = 0
            return r0
        L_0x001b:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "Output buffer too small"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            int r1 = r19 + r1
            int r5 = r3 + r23
            r7 = r3
            r6 = r4
            r4 = r19
        L_0x002b:
            byte r8 = net.jpountz.util.UnsafeUtils.readByte(r0, r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r6
            int r6 = r8 >>> 4
            r9 = 15
            r10 = -1
            if (r6 != r9) goto L_0x0054
            r11 = r10
        L_0x003a:
            if (r4 >= r1) goto L_0x0051
            int r11 = r4 + 1
            byte r4 = net.jpountz.util.UnsafeUtils.readByte(r0, r4)
            if (r4 != r10) goto L_0x004c
            int r6 = r6 + 255
            r16 = r11
            r11 = r4
            r4 = r16
            goto L_0x003a
        L_0x004c:
            r16 = r11
            r11 = r4
            r4 = r16
        L_0x0051:
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r11
        L_0x0054:
            int r11 = r7 + r6
            int r12 = r5 + -8
            java.lang.String r13 = "Malformed input at "
            if (r11 > r12) goto L_0x00af
            int r14 = r4 + r6
            int r15 = r1 + -8
            if (r14 <= r15) goto L_0x0063
            goto L_0x00af
        L_0x0063:
            net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r4, r2, r7, r6)
            int r4 = net.jpountz.util.UnsafeUtils.readShortLE(r0, r14)
            int r14 = r14 + 2
            int r4 = r11 - r4
            if (r4 < r3) goto L_0x00a5
            r6 = r8 & 15
            if (r6 != r9) goto L_0x0089
            r7 = r10
        L_0x0075:
            if (r14 >= r1) goto L_0x0086
            int r7 = r14 + 1
            byte r8 = net.jpountz.util.UnsafeUtils.readByte(r0, r14)
            if (r8 != r10) goto L_0x0084
            int r6 = r6 + 255
            r14 = r7
            r7 = r8
            goto L_0x0075
        L_0x0084:
            r14 = r7
            r7 = r8
        L_0x0086:
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r7
        L_0x0089:
            int r6 = r6 + 4
            int r7 = r11 + r6
            if (r7 <= r12) goto L_0x009f
            if (r7 > r5) goto L_0x0095
            net.jpountz.lz4.LZ4UnsafeUtils.safeIncrementalCopy(r2, r4, r11, r6)
            goto L_0x00a2
        L_0x0095:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = b9.m.b(r13, r14)
            r0.<init>(r1)
            throw r0
        L_0x009f:
            net.jpountz.lz4.LZ4UnsafeUtils.wildIncrementalCopy(r2, r4, r11, r7)
        L_0x00a2:
            r6 = 1
            r4 = r14
            goto L_0x002b
        L_0x00a5:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = b9.m.b(r13, r14)
            r0.<init>(r1)
            throw r0
        L_0x00af:
            if (r11 > r5) goto L_0x00c4
            int r5 = r4 + r6
            if (r5 != r1) goto L_0x00ba
            net.jpountz.lz4.LZ4UnsafeUtils.safeArraycopy(r0, r4, r2, r7, r6)
            int r11 = r11 - r3
            return r11
        L_0x00ba:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = b9.m.b(r13, r4)
            r0.<init>(r1)
            throw r0
        L_0x00c4:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeSafeDecompressor.decompress(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int decompress(java.nio.ByteBuffer r18, int r19, int r20, java.nio.ByteBuffer r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r19
            r3 = r20
            r1 = r22
            r6 = r23
            boolean r2 = r18.hasArray()
            if (r2 == 0) goto L_0x0036
            boolean r2 = r21.hasArray()
            if (r2 == 0) goto L_0x0036
            byte[] r2 = r18.array()
            int r4 = r18.arrayOffset()
            int r4 = r4 + r0
            byte[] r5 = r21.array()
            int r0 = r21.arrayOffset()
            int r7 = r0 + r1
            r0 = r17
            r1 = r2
            r2 = r4
            r3 = r20
            r4 = r5
            r5 = r7
            r6 = r23
            int r0 = r0.decompress((byte[]) r1, (int) r2, (int) r3, (byte[]) r4, (int) r5, (int) r6)
            return r0
        L_0x0036:
            java.nio.ByteBuffer r2 = net.jpountz.util.ByteBufferUtils.inNativeByteOrder(r18)
            java.nio.ByteBuffer r4 = net.jpountz.util.ByteBufferUtils.inNativeByteOrder(r21)
            net.jpountz.util.ByteBufferUtils.checkRange(r2, r0, r3)
            net.jpountz.util.ByteBufferUtils.checkRange(r4, r1, r6)
            r5 = 1
            if (r6 != 0) goto L_0x0059
            if (r3 != r5) goto L_0x0051
            byte r0 = net.jpountz.util.ByteBufferUtils.readByte(r2, r0)
            if (r0 != 0) goto L_0x0051
            r0 = 0
            return r0
        L_0x0051:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "Output buffer too small"
            r0.<init>(r1)
            throw r0
        L_0x0059:
            int r3 = r3 + r0
            int r6 = r6 + r1
            r7 = r1
        L_0x005c:
            byte r8 = net.jpountz.util.ByteBufferUtils.readByte(r2, r0)
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r5
            int r5 = r8 >>> 4
            r9 = 15
            r10 = -1
            if (r5 != r9) goto L_0x0085
            r11 = r10
        L_0x006b:
            if (r0 >= r3) goto L_0x0082
            int r11 = r0 + 1
            byte r0 = net.jpountz.util.ByteBufferUtils.readByte(r2, r0)
            if (r0 != r10) goto L_0x007d
            int r5 = r5 + 255
            r16 = r11
            r11 = r0
            r0 = r16
            goto L_0x006b
        L_0x007d:
            r16 = r11
            r11 = r0
            r0 = r16
        L_0x0082:
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r11
        L_0x0085:
            int r11 = r7 + r5
            int r12 = r6 + -8
            java.lang.String r13 = "Malformed input at "
            if (r11 > r12) goto L_0x00e0
            int r14 = r0 + r5
            int r15 = r3 + -8
            if (r14 <= r15) goto L_0x0094
            goto L_0x00e0
        L_0x0094:
            net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r2, r0, r4, r7, r5)
            int r0 = net.jpountz.util.ByteBufferUtils.readShortLE(r2, r14)
            int r14 = r14 + 2
            int r0 = r11 - r0
            if (r0 < r1) goto L_0x00d6
            r5 = r8 & 15
            if (r5 != r9) goto L_0x00ba
            r7 = r10
        L_0x00a6:
            if (r14 >= r3) goto L_0x00b7
            int r7 = r14 + 1
            byte r8 = net.jpountz.util.ByteBufferUtils.readByte(r2, r14)
            if (r8 != r10) goto L_0x00b5
            int r5 = r5 + 255
            r14 = r7
            r7 = r8
            goto L_0x00a6
        L_0x00b5:
            r14 = r7
            r7 = r8
        L_0x00b7:
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r7
        L_0x00ba:
            int r5 = r5 + 4
            int r7 = r11 + r5
            if (r7 <= r12) goto L_0x00d0
            if (r7 > r6) goto L_0x00c6
            net.jpountz.lz4.LZ4ByteBufferUtils.safeIncrementalCopy(r4, r0, r11, r5)
            goto L_0x00d3
        L_0x00c6:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = b9.m.b(r13, r14)
            r0.<init>(r1)
            throw r0
        L_0x00d0:
            net.jpountz.lz4.LZ4ByteBufferUtils.wildIncrementalCopy(r4, r0, r11, r7)
        L_0x00d3:
            r5 = 1
            r0 = r14
            goto L_0x005c
        L_0x00d6:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = b9.m.b(r13, r14)
            r0.<init>(r1)
            throw r0
        L_0x00e0:
            if (r11 > r6) goto L_0x00f5
            int r6 = r0 + r5
            if (r6 != r3) goto L_0x00eb
            net.jpountz.lz4.LZ4ByteBufferUtils.safeArraycopy(r2, r0, r4, r7, r5)
            int r11 = r11 - r1
            return r11
        L_0x00eb:
            net.jpountz.lz4.LZ4Exception r1 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r0 = b9.m.b(r13, r0)
            r1.<init>(r0)
            throw r1
        L_0x00f5:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeSafeDecompressor.decompress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
