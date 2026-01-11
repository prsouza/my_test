package net.jpountz.lz4;

import b9.m;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

final class LZ4JavaUnsafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaUnsafeFastDecompressor();

    public int decompress(byte[] bArr, int i, byte[] bArr2, int i10, int i11) {
        int i12;
        byte readByte;
        int i13;
        byte readByte2;
        UnsafeUtils.checkRange(bArr, i);
        UnsafeUtils.checkRange(bArr2, i10, i11);
        if (i11 != 0) {
            int i14 = i11 + i10;
            int i15 = i;
            int i16 = i10;
            while (true) {
                byte readByte3 = UnsafeUtils.readByte(bArr, i15) & 255;
                int i17 = i15 + 1;
                int i18 = readByte3 >>> 4;
                if (i18 == 15) {
                    while (true) {
                        i13 = i17 + 1;
                        readByte2 = UnsafeUtils.readByte(bArr, i17);
                        if (readByte2 != -1) {
                            break;
                        }
                        i18 += 255;
                        i17 = i13;
                    }
                    i18 += readByte2 & 255;
                    i17 = i13;
                }
                int i19 = i16 + i18;
                int i20 = i14 - 8;
                if (i19 <= i20) {
                    LZ4UnsafeUtils.wildArraycopy(bArr, i17, bArr2, i16, i18);
                    int i21 = i17 + i18;
                    int readShortLE = UnsafeUtils.readShortLE(bArr, i21);
                    i15 = i21 + 2;
                    int i22 = i19 - readShortLE;
                    if (i22 >= i10) {
                        int i23 = readByte3 & 15;
                        if (i23 == 15) {
                            while (true) {
                                i12 = i15 + 1;
                                readByte = UnsafeUtils.readByte(bArr, i15);
                                if (readByte != -1) {
                                    break;
                                }
                                i23 += 255;
                                i15 = i12;
                            }
                            i23 += readByte & 255;
                            i15 = i12;
                        }
                        int i24 = i23 + 4;
                        int i25 = i19 + i24;
                        if (i25 <= i20) {
                            LZ4UnsafeUtils.wildIncrementalCopy(bArr2, i22, i19, i25);
                        } else if (i25 <= i14) {
                            LZ4UnsafeUtils.safeIncrementalCopy(bArr2, i22, i19, i24);
                        } else {
                            throw new LZ4Exception(m.b("Malformed input at ", i15));
                        }
                        i16 = i25;
                    } else {
                        throw new LZ4Exception(m.b("Malformed input at ", i15));
                    }
                } else if (i19 == i14) {
                    LZ4UnsafeUtils.safeArraycopy(bArr, i17, bArr2, i16, i18);
                    return (i17 + i18) - i;
                } else {
                    throw new LZ4Exception(m.b("Malformed input at ", i17));
                }
            }
        } else if (UnsafeUtils.readByte(bArr, i) == 0) {
            return 1;
        } else {
            throw new LZ4Exception(m.b("Malformed input at ", i));
        }
    }

    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i10, int i11) {
        int i12;
        byte readByte;
        int i13;
        byte readByte2;
        if (!byteBuffer.hasArray() || !byteBuffer2.hasArray()) {
            ByteBuffer inNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
            ByteBuffer inNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
            ByteBufferUtils.checkRange(inNativeByteOrder, i);
            ByteBufferUtils.checkRange(inNativeByteOrder2, i10, i11);
            if (i11 != 0) {
                int i14 = i11 + i10;
                int i15 = i;
                int i16 = i10;
                while (true) {
                    byte readByte3 = ByteBufferUtils.readByte(inNativeByteOrder, i15) & 255;
                    int i17 = i15 + 1;
                    int i18 = readByte3 >>> 4;
                    if (i18 == 15) {
                        while (true) {
                            i13 = i17 + 1;
                            readByte2 = ByteBufferUtils.readByte(inNativeByteOrder, i17);
                            if (readByte2 != -1) {
                                break;
                            }
                            i18 += 255;
                            i17 = i13;
                        }
                        i18 += readByte2 & 255;
                        i17 = i13;
                    }
                    int i19 = i16 + i18;
                    int i20 = i14 - 8;
                    if (i19 <= i20) {
                        LZ4ByteBufferUtils.wildArraycopy(inNativeByteOrder, i17, inNativeByteOrder2, i16, i18);
                        int i21 = i17 + i18;
                        int readShortLE = ByteBufferUtils.readShortLE(inNativeByteOrder, i21);
                        i15 = i21 + 2;
                        int i22 = i19 - readShortLE;
                        if (i22 >= i10) {
                            int i23 = readByte3 & 15;
                            if (i23 == 15) {
                                while (true) {
                                    i12 = i15 + 1;
                                    readByte = ByteBufferUtils.readByte(inNativeByteOrder, i15);
                                    if (readByte != -1) {
                                        break;
                                    }
                                    i23 += 255;
                                    i15 = i12;
                                }
                                i23 += readByte & 255;
                                i15 = i12;
                            }
                            int i24 = i23 + 4;
                            int i25 = i19 + i24;
                            if (i25 <= i20) {
                                LZ4ByteBufferUtils.wildIncrementalCopy(inNativeByteOrder2, i22, i19, i25);
                            } else if (i25 <= i14) {
                                LZ4ByteBufferUtils.safeIncrementalCopy(inNativeByteOrder2, i22, i19, i24);
                            } else {
                                throw new LZ4Exception(m.b("Malformed input at ", i15));
                            }
                            i16 = i25;
                        } else {
                            throw new LZ4Exception(m.b("Malformed input at ", i15));
                        }
                    } else if (i19 == i14) {
                        LZ4ByteBufferUtils.safeArraycopy(inNativeByteOrder, i17, inNativeByteOrder2, i16, i18);
                        return (i17 + i18) - i;
                    } else {
                        throw new LZ4Exception(m.b("Malformed input at ", i17));
                    }
                }
            } else if (ByteBufferUtils.readByte(inNativeByteOrder, i) == 0) {
                return 1;
            } else {
                throw new LZ4Exception(m.b("Malformed input at ", i));
            }
        } else {
            return decompress(byteBuffer.array(), byteBuffer.arrayOffset() + i, byteBuffer2.array(), byteBuffer2.arrayOffset() + i10, i11);
        }
    }
}
