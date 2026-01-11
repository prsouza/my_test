package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.lz4.LZ4Utils;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

final class LZ4HCJavaUnsafeCompressor extends LZ4Compressor {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4HCJavaUnsafeCompressor();
    public final int compressionLevel;
    /* access modifiers changed from: private */
    public final int maxAttempts;

    public LZ4HCJavaUnsafeCompressor() {
        this(9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b6, code lost:
        r24 = r11;
        r11 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c0, code lost:
        if (r0.start >= r9.end()) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c2, code lost:
        r9.len = r0.start - r9.start;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c9, code lost:
        r2 = r22;
        r7 = r25;
        r23 = r9;
        r9 = r10;
        r6 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r2, r23.end(), r0.start, r0.ref, r0.len, r7, net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r2, r16, r9.start, r9.ref, r9.len, r7, r17, r9), r9);
        r3 = r0.end();
        r9 = r23;
        r8 = r0;
        r2 = r3;
        r7 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compress(byte[] r22, int r23, int r24, byte[] r25, int r26, int r27) {
        /*
            r21 = this;
            r0 = r23
            net.jpountz.util.UnsafeUtils.checkRange(r22, r23, r24)
            net.jpountz.util.UnsafeUtils.checkRange(r25, r26, r27)
            int r1 = r0 + r24
            int r10 = r26 + r27
            int r11 = r1 + -12
            int r12 = r1 + -5
            int r2 = r0 + 1
            net.jpountz.lz4.LZ4HCJavaUnsafeCompressor$HashTable r13 = new net.jpountz.lz4.LZ4HCJavaUnsafeCompressor$HashTable
            r14 = r21
            r13.<init>(r0)
            net.jpountz.lz4.LZ4Utils$Match r15 = new net.jpountz.lz4.LZ4Utils$Match
            r15.<init>()
            net.jpountz.lz4.LZ4Utils$Match r9 = new net.jpountz.lz4.LZ4Utils$Match
            r9.<init>()
            net.jpountz.lz4.LZ4Utils$Match r8 = new net.jpountz.lz4.LZ4Utils$Match
            r8.<init>()
            net.jpountz.lz4.LZ4Utils$Match r7 = new net.jpountz.lz4.LZ4Utils$Match
            r7.<init>()
            r6 = r26
            r3 = r0
        L_0x0030:
            if (r2 >= r11) goto L_0x021c
            r0 = r22
            boolean r4 = r13.insertAndFindBestMatch((byte[]) r0, (int) r2, (int) r12, (net.jpountz.lz4.LZ4Utils.Match) r9)
            if (r4 != 0) goto L_0x003d
            int r2 = r2 + 1
            goto L_0x0030
        L_0x003d:
            net.jpountz.lz4.LZ4Utils.copyTo(r9, r15)
            r16 = r3
            r17 = r6
        L_0x0044:
            int r2 = r9.end()
            if (r2 >= r11) goto L_0x01f6
            int r2 = r9.end()
            int r4 = r2 + -2
            int r2 = r9.start
            int r5 = r2 + 1
            int r6 = r9.len
            r2 = r13
            r3 = r22
            r18 = r6
            r6 = r12
            r23 = r7
            r7 = r18
            r24 = r8
            boolean r2 = r2.insertAndFindWiderMatch((byte[]) r3, (int) r4, (int) r5, (int) r6, (int) r7, (net.jpountz.lz4.LZ4Utils.Match) r8)
            if (r2 != 0) goto L_0x0070
            r0 = r24
            r24 = r11
            r11 = r23
            goto L_0x01fa
        L_0x0070:
            int r2 = r15.start
            int r3 = r9.start
            r8 = r24
            if (r2 >= r3) goto L_0x0082
            int r2 = r8.start
            int r4 = r15.len
            int r3 = r3 + r4
            if (r2 >= r3) goto L_0x0082
            net.jpountz.lz4.LZ4Utils.copyTo(r15, r9)
        L_0x0082:
            int r2 = r8.start
            int r3 = r9.start
            int r2 = r2 - r3
            r7 = 3
            if (r2 >= r7) goto L_0x0090
            net.jpountz.lz4.LZ4Utils.copyTo(r8, r9)
            r7 = r23
            goto L_0x0044
        L_0x0090:
            int r2 = r8.start
            int r3 = r9.start
            int r2 = r2 - r3
            r6 = 4
            r5 = 18
            if (r2 >= r5) goto L_0x00bb
            int r2 = r9.len
            if (r2 <= r5) goto L_0x009f
            r2 = r5
        L_0x009f:
            int r3 = r3 + r2
            int r4 = r8.end()
            int r4 = r4 - r6
            if (r3 <= r4) goto L_0x00b0
            int r2 = r8.start
            int r3 = r9.start
            int r2 = r2 - r3
            int r3 = r8.len
            int r2 = r2 + r3
            int r2 = r2 - r6
        L_0x00b0:
            int r3 = r8.start
            int r4 = r9.start
            int r3 = r3 - r4
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x00bb
            r8.fix(r2)
        L_0x00bb:
            int r2 = r8.start
            int r3 = r8.len
            int r2 = r2 + r3
            if (r2 >= r11) goto L_0x01b5
            int r2 = r8.end()
            int r4 = r2 + -3
            int r3 = r8.start
            int r2 = r8.len
            r18 = r2
            r2 = r13
            r19 = r3
            r3 = r22
            r0 = r5
            r5 = r19
            r0 = r6
            r6 = r12
            r20 = r7
            r7 = r18
            r0 = r8
            r8 = r23
            boolean r2 = r2.insertAndFindWiderMatch((byte[]) r3, (int) r4, (int) r5, (int) r6, (int) r7, (net.jpountz.lz4.LZ4Utils.Match) r8)
            if (r2 != 0) goto L_0x00e7
            goto L_0x01b6
        L_0x00e7:
            r8 = r23
            int r2 = r8.start
            int r3 = r9.end()
            int r3 = r3 + 3
            if (r2 >= r3) goto L_0x0148
            int r2 = r8.start
            int r3 = r9.end()
            if (r2 < r3) goto L_0x0141
            int r2 = r0.start
            int r3 = r9.end()
            if (r2 >= r3) goto L_0x0115
            int r2 = r9.end()
            int r3 = r0.start
            int r2 = r2 - r3
            r0.fix(r2)
            int r2 = r0.len
            r3 = 4
            if (r2 >= r3) goto L_0x0115
            net.jpountz.lz4.LZ4Utils.copyTo(r8, r0)
        L_0x0115:
            int r4 = r9.start
            int r5 = r9.ref
            int r6 = r9.len
            r2 = r22
            r3 = r16
            r7 = r25
            r24 = r11
            r11 = r8
            r8 = r17
            r23 = r9
            r9 = r10
            int r17 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r16 = r23.end()
            r9 = r23
            net.jpountz.lz4.LZ4Utils.copyTo(r11, r9)
            net.jpountz.lz4.LZ4Utils.copyTo(r0, r15)
            r8 = r0
            r7 = r11
            r0 = r22
            r11 = r24
            goto L_0x0044
        L_0x0141:
            r24 = r11
            r11 = r8
            net.jpountz.lz4.LZ4Utils.copyTo(r11, r0)
            goto L_0x01aa
        L_0x0148:
            r24 = r11
            r11 = r8
            int r2 = r0.start
            int r3 = r9.end()
            if (r2 >= r3) goto L_0x0189
            int r2 = r0.start
            int r3 = r9.start
            int r4 = r2 - r3
            r5 = 15
            if (r4 >= r5) goto L_0x0186
            int r2 = r9.len
            r3 = 18
            if (r2 <= r3) goto L_0x0165
            r9.len = r3
        L_0x0165:
            int r2 = r9.end()
            int r3 = r0.end()
            r4 = 4
            int r3 = r3 - r4
            if (r2 <= r3) goto L_0x017b
            int r2 = r0.end()
            int r3 = r9.start
            int r2 = r2 - r3
            int r2 = r2 - r4
            r9.len = r2
        L_0x017b:
            int r2 = r9.end()
            int r3 = r0.start
            int r2 = r2 - r3
            r0.fix(r2)
            goto L_0x0189
        L_0x0186:
            int r2 = r2 - r3
            r9.len = r2
        L_0x0189:
            int r4 = r9.start
            int r5 = r9.ref
            int r6 = r9.len
            r2 = r22
            r3 = r16
            r7 = r25
            r8 = r17
            r23 = r9
            r9 = r10
            int r17 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r16 = r23.end()
            r9 = r23
            net.jpountz.lz4.LZ4Utils.copyTo(r0, r9)
            net.jpountz.lz4.LZ4Utils.copyTo(r11, r0)
        L_0x01aa:
            r8 = r0
            r23 = r11
            r7 = r20
            r0 = r22
            r11 = r24
            goto L_0x0090
        L_0x01b5:
            r0 = r8
        L_0x01b6:
            r24 = r11
            r11 = r23
            int r2 = r0.start
            int r3 = r9.end()
            if (r2 >= r3) goto L_0x01c9
            int r2 = r0.start
            int r3 = r9.start
            int r2 = r2 - r3
            r9.len = r2
        L_0x01c9:
            int r4 = r9.start
            int r5 = r9.ref
            int r6 = r9.len
            r2 = r22
            r3 = r16
            r7 = r25
            r8 = r17
            r23 = r9
            r9 = r10
            int r8 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r23.end()
            int r4 = r0.start
            int r5 = r0.ref
            int r6 = r0.len
            int r6 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r0.end()
            r9 = r23
            r8 = r0
            r2 = r3
            r7 = r11
            goto L_0x0218
        L_0x01f6:
            r0 = r8
            r24 = r11
            r11 = r7
        L_0x01fa:
            int r4 = r9.start
            int r5 = r9.ref
            int r6 = r9.len
            r2 = r22
            r3 = r16
            r7 = r25
            r8 = r17
            r16 = r9
            r9 = r10
            int r6 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r16.end()
            r8 = r0
            r2 = r3
            r7 = r11
            r9 = r16
        L_0x0218:
            r11 = r24
            goto L_0x0030
        L_0x021c:
            int r4 = r1 - r3
            r2 = r22
            r5 = r25
            r7 = r10
            int r0 = net.jpountz.lz4.LZ4UnsafeUtils.lastLiterals(r2, r3, r4, r5, r6, r7)
            int r0 = r0 - r26
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaUnsafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }

    public class HashTable {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public static final int MASK = 65535;
        private final int base;
        private final short[] chainTable = new short[LZ4Constants.MAX_DISTANCE];
        private final int[] hashTable;
        public int nextToUpdate;

        public HashTable(int i) {
            this.base = i;
            this.nextToUpdate = i;
            int[] iArr = new int[LZ4Constants.HASH_TABLE_SIZE_HC];
            this.hashTable = iArr;
            Arrays.fill(iArr, -1);
        }

        private void addHash(byte[] bArr, int i) {
            addHash(UnsafeUtils.readInt(bArr, i), i);
        }

        private int hashPointer(byte[] bArr, int i) {
            return hashPointer(UnsafeUtils.readInt(bArr, i));
        }

        private int next(int i) {
            return i - (this.chainTable[i & 65535] & 65535);
        }

        public void insert(int i, byte[] bArr) {
            while (true) {
                int i10 = this.nextToUpdate;
                if (i10 < i) {
                    addHash(bArr, i10);
                    this.nextToUpdate++;
                } else {
                    return;
                }
            }
        }

        public boolean insertAndFindBestMatch(byte[] bArr, int i, int i10, LZ4Utils.Match match) {
            int i11;
            int i12;
            int commonBytes;
            match.start = i;
            match.len = 0;
            insert(i, bArr);
            int hashPointer = hashPointer(bArr, i);
            if (hashPointer < i - 4 || hashPointer > i || hashPointer < this.base) {
                i12 = 0;
                i11 = 0;
            } else {
                if (LZ4UnsafeUtils.readIntEquals(bArr, hashPointer, i)) {
                    i12 = i - hashPointer;
                    i11 = LZ4UnsafeUtils.commonBytes(bArr, hashPointer + 4, i + 4, i10) + 4;
                    match.len = i11;
                    match.ref = hashPointer;
                } else {
                    i12 = 0;
                    i11 = 0;
                }
                hashPointer = next(hashPointer);
            }
            for (int i13 = 0; i13 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i - LZ4Constants.MAX_DISTANCE) + 1) && hashPointer <= i; i13++) {
                if (LZ4UnsafeUtils.readIntEquals(bArr, hashPointer, i) && (commonBytes = LZ4UnsafeUtils.commonBytes(bArr, hashPointer + 4, i + 4, i10) + 4) > match.len) {
                    match.ref = hashPointer;
                    match.len = commonBytes;
                }
                hashPointer = next(hashPointer);
            }
            if (i11 != 0) {
                int i14 = (i11 + i) - 3;
                while (i < i14 - i12) {
                    this.chainTable[65535 & i] = (short) i12;
                    i++;
                }
                do {
                    this.chainTable[i & 65535] = (short) i12;
                    this.hashTable[LZ4Utils.hashHC(UnsafeUtils.readInt(bArr, i))] = i;
                    i++;
                } while (i < i14);
                this.nextToUpdate = i14;
            }
            if (match.len != 0) {
                return true;
            }
            return false;
        }

        public boolean insertAndFindWiderMatch(byte[] bArr, int i, int i10, int i11, int i12, LZ4Utils.Match match) {
            int commonBytesBackward;
            int commonBytes;
            match.len = i12;
            insert(i, bArr);
            int hashPointer = hashPointer(bArr, i);
            for (int i13 = 0; i13 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i - LZ4Constants.MAX_DISTANCE) + 1) && hashPointer <= i; i13++) {
                if (LZ4UnsafeUtils.readIntEquals(bArr, hashPointer, i) && (commonBytes = LZ4UnsafeUtils.commonBytes(bArr, hashPointer + 4, i + 4, i11) + 4 + commonBytesBackward) > match.len) {
                    match.len = commonBytes;
                    match.ref = hashPointer - (commonBytesBackward = LZ4UnsafeUtils.commonBytesBackward(bArr, hashPointer, i, this.base, i10));
                    match.start = i - commonBytesBackward;
                }
                hashPointer = next(hashPointer);
            }
            if (match.len > i12) {
                return true;
            }
            return false;
        }

        private void addHash(ByteBuffer byteBuffer, int i) {
            addHash(ByteBufferUtils.readInt(byteBuffer, i), i);
        }

        private int hashPointer(ByteBuffer byteBuffer, int i) {
            return hashPointer(ByteBufferUtils.readInt(byteBuffer, i));
        }

        public void insert(int i, ByteBuffer byteBuffer) {
            while (true) {
                int i10 = this.nextToUpdate;
                if (i10 < i) {
                    addHash(byteBuffer, i10);
                    this.nextToUpdate++;
                } else {
                    return;
                }
            }
        }

        private void addHash(int i, int i10) {
            int hashHC = LZ4Utils.hashHC(i);
            int[] iArr = this.hashTable;
            int i11 = i10 - iArr[hashHC];
            if (i11 >= 65536) {
                i11 = 65535;
            }
            this.chainTable[65535 & i10] = (short) i11;
            iArr[hashHC] = i10;
        }

        private int hashPointer(int i) {
            return this.hashTable[LZ4Utils.hashHC(i)];
        }

        public boolean insertAndFindWiderMatch(ByteBuffer byteBuffer, int i, int i10, int i11, int i12, LZ4Utils.Match match) {
            int commonBytesBackward;
            int commonBytes;
            match.len = i12;
            insert(i, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i);
            for (int i13 = 0; i13 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i - LZ4Constants.MAX_DISTANCE) + 1) && hashPointer <= i; i13++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i) && (commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i + 4, i11) + 4 + commonBytesBackward) > match.len) {
                    match.len = commonBytes;
                    match.ref = hashPointer - (commonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, hashPointer, i, this.base, i10));
                    match.start = i - commonBytesBackward;
                }
                hashPointer = next(hashPointer);
            }
            if (match.len > i12) {
                return true;
            }
            return false;
        }

        public boolean insertAndFindBestMatch(ByteBuffer byteBuffer, int i, int i10, LZ4Utils.Match match) {
            int i11;
            int i12;
            int commonBytes;
            match.start = i;
            match.len = 0;
            insert(i, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i);
            if (hashPointer < i - 4 || hashPointer > i || hashPointer < this.base) {
                i12 = 0;
                i11 = 0;
            } else {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i)) {
                    i12 = i - hashPointer;
                    i11 = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i + 4, i10) + 4;
                    match.len = i11;
                    match.ref = hashPointer;
                } else {
                    i12 = 0;
                    i11 = 0;
                }
                hashPointer = next(hashPointer);
            }
            for (int i13 = 0; i13 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i - LZ4Constants.MAX_DISTANCE) + 1) && hashPointer <= i; i13++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i) && (commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i + 4, i10) + 4) > match.len) {
                    match.ref = hashPointer;
                    match.len = commonBytes;
                }
                hashPointer = next(hashPointer);
            }
            if (i11 != 0) {
                int i14 = (i11 + i) - 3;
                while (i < i14 - i12) {
                    this.chainTable[65535 & i] = (short) i12;
                    i++;
                }
                do {
                    this.chainTable[i & 65535] = (short) i12;
                    this.hashTable[LZ4Utils.hashHC(ByteBufferUtils.readInt(byteBuffer, i))] = i;
                    i++;
                } while (i < i14);
                this.nextToUpdate = i14;
            }
            if (match.len != 0) {
                return true;
            }
            return false;
        }
    }

    public LZ4HCJavaUnsafeCompressor(int i) {
        this.maxAttempts = 1 << (i - 1);
        this.compressionLevel = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0259, code lost:
        r0 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r10, r0, r1.start, r1.ref, r1.len, r11, r16, r13);
        r3 = r1.end();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compress(java.nio.ByteBuffer r22, int r23, int r24, java.nio.ByteBuffer r25, int r26, int r27) {
        /*
            r21 = this;
            r0 = r23
            r3 = r24
            r1 = r26
            r6 = r27
            boolean r2 = r22.hasArray()
            if (r2 == 0) goto L_0x0036
            boolean r2 = r25.hasArray()
            if (r2 == 0) goto L_0x0036
            byte[] r2 = r22.array()
            int r4 = r22.arrayOffset()
            int r4 = r4 + r0
            byte[] r5 = r25.array()
            int r0 = r25.arrayOffset()
            int r7 = r0 + r1
            r0 = r21
            r1 = r2
            r2 = r4
            r3 = r24
            r4 = r5
            r5 = r7
            r6 = r27
            int r0 = r0.compress((byte[]) r1, (int) r2, (int) r3, (byte[]) r4, (int) r5, (int) r6)
            return r0
        L_0x0036:
            java.nio.ByteBuffer r10 = net.jpountz.util.ByteBufferUtils.inNativeByteOrder(r22)
            java.nio.ByteBuffer r11 = net.jpountz.util.ByteBufferUtils.inNativeByteOrder(r25)
            net.jpountz.util.ByteBufferUtils.checkRange(r10, r0, r3)
            net.jpountz.util.ByteBufferUtils.checkRange(r11, r1, r6)
            int r12 = r0 + r3
            int r13 = r1 + r6
            int r14 = r12 + -12
            int r15 = r12 + -5
            int r2 = r0 + 1
            net.jpountz.lz4.LZ4HCJavaUnsafeCompressor$HashTable r9 = new net.jpountz.lz4.LZ4HCJavaUnsafeCompressor$HashTable
            r8 = r21
            r9.<init>(r0)
            net.jpountz.lz4.LZ4Utils$Match r7 = new net.jpountz.lz4.LZ4Utils$Match
            r7.<init>()
            net.jpountz.lz4.LZ4Utils$Match r6 = new net.jpountz.lz4.LZ4Utils$Match
            r6.<init>()
            net.jpountz.lz4.LZ4Utils$Match r5 = new net.jpountz.lz4.LZ4Utils$Match
            r5.<init>()
            net.jpountz.lz4.LZ4Utils$Match r4 = new net.jpountz.lz4.LZ4Utils$Match
            r4.<init>()
            r3 = r0
            r0 = r1
        L_0x006b:
            if (r2 >= r14) goto L_0x027f
            boolean r16 = r9.insertAndFindBestMatch((java.nio.ByteBuffer) r10, (int) r2, (int) r15, (net.jpountz.lz4.LZ4Utils.Match) r6)
            if (r16 != 0) goto L_0x0076
            int r2 = r2 + 1
            goto L_0x006b
        L_0x0076:
            net.jpountz.lz4.LZ4Utils.copyTo(r6, r7)
            r16 = r0
            r0 = r3
        L_0x007c:
            int r2 = r6.end()
            if (r2 >= r14) goto L_0x024e
            int r2 = r6.end()
            int r17 = r2 + -2
            int r2 = r6.start
            int r18 = r2 + 1
            int r3 = r6.len
            r2 = r9
            r19 = r3
            r3 = r10
            r22 = r4
            r4 = r17
            r23 = r5
            r5 = r18
            r1 = r6
            r6 = r15
            r24 = r12
            r12 = r7
            r7 = r19
            r8 = r23
            boolean r2 = r2.insertAndFindWiderMatch((java.nio.ByteBuffer) r3, (int) r4, (int) r5, (int) r6, (int) r7, (net.jpountz.lz4.LZ4Utils.Match) r8)
            if (r2 != 0) goto L_0x00b3
            r17 = r22
            r20 = r9
            r22 = r14
            r14 = r23
            goto L_0x0259
        L_0x00b3:
            int r2 = r12.start
            int r3 = r1.start
            r8 = r23
            if (r2 >= r3) goto L_0x00c5
            int r2 = r8.start
            int r4 = r12.len
            int r3 = r3 + r4
            if (r2 >= r3) goto L_0x00c5
            net.jpountz.lz4.LZ4Utils.copyTo(r12, r1)
        L_0x00c5:
            int r2 = r8.start
            int r3 = r1.start
            int r2 = r2 - r3
            r7 = 3
            if (r2 >= r7) goto L_0x00dc
            net.jpountz.lz4.LZ4Utils.copyTo(r8, r1)
            r4 = r22
            r6 = r1
            r5 = r8
            r7 = r12
            r8 = r21
        L_0x00d7:
            r12 = r24
            r1 = r26
            goto L_0x007c
        L_0x00dc:
            int r2 = r8.start
            int r3 = r1.start
            int r2 = r2 - r3
            r6 = 4
            r5 = 18
            if (r2 >= r5) goto L_0x0107
            int r2 = r1.len
            if (r2 <= r5) goto L_0x00eb
            r2 = r5
        L_0x00eb:
            int r3 = r3 + r2
            int r4 = r8.end()
            int r4 = r4 - r6
            if (r3 <= r4) goto L_0x00fc
            int r2 = r8.start
            int r3 = r1.start
            int r2 = r2 - r3
            int r3 = r8.len
            int r2 = r2 + r3
            int r2 = r2 - r6
        L_0x00fc:
            int r3 = r8.start
            int r4 = r1.start
            int r3 = r3 - r4
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x0107
            r8.fix(r2)
        L_0x0107:
            int r2 = r8.start
            int r3 = r8.len
            int r2 = r2 + r3
            if (r2 >= r14) goto L_0x0215
            int r2 = r8.end()
            int r4 = r2 + -3
            int r3 = r8.start
            int r2 = r8.len
            r17 = r2
            r2 = r9
            r18 = r3
            r3 = r10
            r25 = r9
            r9 = r5
            r5 = r18
            r9 = r6
            r6 = r15
            r19 = r7
            r7 = r17
            r9 = r8
            r8 = r22
            boolean r2 = r2.insertAndFindWiderMatch((java.nio.ByteBuffer) r3, (int) r4, (int) r5, (int) r6, (int) r7, (net.jpountz.lz4.LZ4Utils.Match) r8)
            if (r2 != 0) goto L_0x013b
            r17 = r22
            r20 = r25
            r22 = r14
            r14 = r9
            goto L_0x021c
        L_0x013b:
            r8 = r22
            int r2 = r8.start
            int r3 = r1.end()
            int r3 = r3 + 3
            if (r2 >= r3) goto L_0x01aa
            int r2 = r8.start
            int r3 = r1.end()
            if (r2 < r3) goto L_0x0196
            int r2 = r9.start
            int r3 = r1.end()
            if (r2 >= r3) goto L_0x0169
            int r2 = r1.end()
            int r3 = r9.start
            int r2 = r2 - r3
            r9.fix(r2)
            int r2 = r9.len
            r3 = 4
            if (r2 >= r3) goto L_0x0169
            net.jpountz.lz4.LZ4Utils.copyTo(r8, r9)
        L_0x0169:
            int r4 = r1.start
            int r5 = r1.ref
            int r6 = r1.len
            r2 = r10
            r3 = r0
            r7 = r11
            r0 = r8
            r8 = r16
            r20 = r25
            r22 = r14
            r14 = r9
            r9 = r13
            int r16 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r2 = r1.end()
            net.jpountz.lz4.LZ4Utils.copyTo(r0, r1)
            net.jpountz.lz4.LZ4Utils.copyTo(r14, r12)
            r8 = r21
            r4 = r0
            r6 = r1
            r0 = r2
            r7 = r12
            r5 = r14
            r9 = r20
            r14 = r22
            goto L_0x00d7
        L_0x0196:
            r20 = r25
            r22 = r14
            r14 = r9
            r9 = r8
            net.jpountz.lz4.LZ4Utils.copyTo(r9, r14)
            r8 = r14
            r7 = r19
            r14 = r22
            r22 = r9
            r9 = r20
            goto L_0x00dc
        L_0x01aa:
            r20 = r25
            r22 = r14
            r14 = r9
            r9 = r8
            int r2 = r14.start
            int r3 = r1.end()
            if (r2 >= r3) goto L_0x01ee
            int r2 = r14.start
            int r3 = r1.start
            int r4 = r2 - r3
            r5 = 15
            if (r4 >= r5) goto L_0x01eb
            int r2 = r1.len
            r3 = 18
            if (r2 <= r3) goto L_0x01ca
            r1.len = r3
        L_0x01ca:
            int r2 = r1.end()
            int r3 = r14.end()
            r4 = 4
            int r3 = r3 - r4
            if (r2 <= r3) goto L_0x01e0
            int r2 = r14.end()
            int r3 = r1.start
            int r2 = r2 - r3
            int r2 = r2 - r4
            r1.len = r2
        L_0x01e0:
            int r2 = r1.end()
            int r3 = r14.start
            int r2 = r2 - r3
            r14.fix(r2)
            goto L_0x01ee
        L_0x01eb:
            int r2 = r2 - r3
            r1.len = r2
        L_0x01ee:
            int r4 = r1.start
            int r5 = r1.ref
            int r6 = r1.len
            r2 = r10
            r3 = r0
            r7 = r11
            r8 = r16
            r0 = r9
            r9 = r13
            int r16 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r2 = r1.end()
            net.jpountz.lz4.LZ4Utils.copyTo(r14, r1)
            net.jpountz.lz4.LZ4Utils.copyTo(r0, r14)
            r8 = r14
            r7 = r19
            r9 = r20
            r14 = r22
            r22 = r0
            r0 = r2
            goto L_0x00dc
        L_0x0215:
            r17 = r22
            r20 = r9
            r22 = r14
            r14 = r8
        L_0x021c:
            int r2 = r14.start
            int r3 = r1.end()
            if (r2 >= r3) goto L_0x022b
            int r2 = r14.start
            int r3 = r1.start
            int r2 = r2 - r3
            r1.len = r2
        L_0x022b:
            int r4 = r1.start
            int r5 = r1.ref
            int r6 = r1.len
            r2 = r10
            r3 = r0
            r7 = r11
            r8 = r16
            r9 = r13
            int r8 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r1.end()
            int r4 = r14.start
            int r5 = r14.ref
            int r6 = r14.len
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r14.end()
            goto L_0x026d
        L_0x024e:
            r17 = r4
            r1 = r6
            r20 = r9
            r24 = r12
            r22 = r14
            r14 = r5
            r12 = r7
        L_0x0259:
            int r4 = r1.start
            int r5 = r1.ref
            int r6 = r1.len
            r2 = r10
            r3 = r0
            r7 = r11
            r8 = r16
            r9 = r13
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r1.end()
        L_0x026d:
            r8 = r21
            r6 = r1
            r2 = r3
            r7 = r12
            r5 = r14
            r4 = r17
            r9 = r20
            r14 = r22
            r12 = r24
            r1 = r26
            goto L_0x006b
        L_0x027f:
            r24 = r12
            int r4 = r24 - r3
            r2 = r10
            r5 = r11
            r6 = r0
            r7 = r13
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.lastLiterals(r2, r3, r4, r5, r6, r7)
            int r0 = r0 - r26
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaUnsafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
