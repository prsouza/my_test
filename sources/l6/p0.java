package l6;

import java.io.File;
import m3.u;
import o6.w;

public final class p0 {
    public static final u g = new u("ExtractChunkTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7968a = new byte[LZ4Constants.HASH_TABLE_SIZE_64K];

    /* renamed from: b  reason: collision with root package name */
    public final a0 f7969b;

    /* renamed from: c  reason: collision with root package name */
    public final w f7970c;

    /* renamed from: d  reason: collision with root package name */
    public final w f7971d;

    /* renamed from: e  reason: collision with root package name */
    public final x0 f7972e;

    /* renamed from: f  reason: collision with root package name */
    public final y1 f7973f;

    public p0(a0 a0Var, w wVar, w wVar2, x0 x0Var, y1 y1Var) {
        this.f7969b = a0Var;
        this.f7970c = wVar;
        this.f7971d = wVar2;
        this.f7972e = x0Var;
        this.f7973f = y1Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:106|136|137|138|139) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:138:0x0393 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c8 A[SYNTHETIC, Splitter:B:111:0x02c8] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x038d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b6 A[Catch:{ all -> 0x02bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01da A[Catch:{ all -> 0x02bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0210 A[Catch:{ all -> 0x02bc }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:138:0x0393=Splitter:B:138:0x0393, B:107:0x02bf=Splitter:B:107:0x02bf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(l6.o0 r26) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            l6.h2 r0 = new l6.h2
            l6.a0 r10 = r1.f7969b
            java.lang.String r11 = r2.f2905b
            int r12 = r2.f7949c
            long r13 = r2.f7950d
            java.lang.String r15 = r2.f7952f
            r3 = r0
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r9)
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r8 = r15
            java.io.File r3 = r3.r(r4, r5, r6, r8)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x002b
            r3.mkdirs()
        L_0x002b:
            r10 = 2
            r11 = 1
            r12 = 0
            r14 = 3
            java.io.InputStream r3 = r2.f7956l     // Catch:{ IOException -> 0x0394 }
            int r4 = r2.g     // Catch:{ IOException -> 0x0394 }
            r15 = 8192(0x2000, float:1.14794E-41)
            if (r4 == r11) goto L_0x0039
            r9 = r3
            goto L_0x003f
        L_0x0039:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0394 }
            r4.<init>(r3, r15)     // Catch:{ IOException -> 0x0394 }
            r9 = r4
        L_0x003f:
            int r3 = r2.f7953h     // Catch:{ all -> 0x038e }
            r16 = 0
            if (r3 <= 0) goto L_0x01b2
            l6.g2 r3 = r0.b()     // Catch:{ all -> 0x038e }
            r4 = r3
            l6.g0 r4 = (l6.g0) r4     // Catch:{ all -> 0x038e }
            int r4 = r4.f7863e     // Catch:{ all -> 0x038e }
            int r5 = r2.f7953h     // Catch:{ all -> 0x038e }
            int r6 = r5 + -1
            if (r4 != r6) goto L_0x0191
            r4 = r3
            l6.g0 r4 = (l6.g0) r4     // Catch:{ all -> 0x038e }
            int r4 = r4.f7859a     // Catch:{ all -> 0x038e }
            if (r4 == r11) goto L_0x0107
            if (r4 == r10) goto L_0x00be
            if (r4 != r14) goto L_0x00a4
            m3.u r4 = g     // Catch:{ all -> 0x038e }
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x038e }
            r4.a(r5, r6)     // Catch:{ all -> 0x038e }
            l6.g0 r3 = (l6.g0) r3     // Catch:{ all -> 0x038e }
            long r3 = r3.f7861c     // Catch:{ all -> 0x038e }
            java.io.File r5 = r0.c()     // Catch:{ all -> 0x038e }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ all -> 0x038e }
            java.lang.String r7 = "rw"
            r6.<init>(r5, r7)     // Catch:{ all -> 0x038e }
            r6.seek(r3)     // Catch:{ all -> 0x009f }
        L_0x007a:
            byte[] r3 = r0.f7887a     // Catch:{ all -> 0x009f }
            int r3 = r9.read(r3)     // Catch:{ all -> 0x009f }
            if (r3 <= 0) goto L_0x0087
            byte[] r4 = r0.f7887a     // Catch:{ all -> 0x009f }
            r6.write(r4, r12, r3)     // Catch:{ all -> 0x009f }
        L_0x0087:
            if (r3 == r15) goto L_0x007a
            r6.close()     // Catch:{ all -> 0x038e }
            boolean r3 = r26.a()     // Catch:{ all -> 0x038e }
            if (r3 == 0) goto L_0x0095
            r13 = r9
            goto L_0x0183
        L_0x0095:
            l6.t0 r0 = new l6.t0     // Catch:{ all -> 0x038e }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.f2904a     // Catch:{ all -> 0x038e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x038e }
            throw r0     // Catch:{ all -> 0x038e }
        L_0x009f:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            throw r0     // Catch:{ all -> 0x038e }
        L_0x00a4:
            l6.t0 r0 = new l6.t0     // Catch:{ all -> 0x038e }
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ all -> 0x038e }
            l6.g0 r3 = (l6.g0) r3     // Catch:{ all -> 0x038e }
            int r3 = r3.f7859a     // Catch:{ all -> 0x038e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x038e }
            r4[r12] = r3     // Catch:{ all -> 0x038e }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x038e }
            int r4 = r2.f2904a     // Catch:{ all -> 0x038e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x038e }
            throw r0     // Catch:{ all -> 0x038e }
        L_0x00be:
            m3.u r3 = g     // Catch:{ all -> 0x038e }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x038e }
            r3.a(r4, r5)     // Catch:{ all -> 0x038e }
            l6.a0 r3 = r1.f7969b     // Catch:{ all -> 0x038e }
            java.lang.String r4 = r2.f2905b     // Catch:{ all -> 0x038e }
            int r5 = r2.f7949c     // Catch:{ all -> 0x038e }
            long r6 = r2.f7950d     // Catch:{ all -> 0x038e }
            java.lang.String r8 = r2.f7952f     // Catch:{ all -> 0x038e }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x038e }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x038e }
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            java.io.File r3 = r16.r(r17, r18, r19, r21)     // Catch:{ all -> 0x038e }
            java.lang.String r4 = "checkpoint_ext.dat"
            r14.<init>(r3, r4)     // Catch:{ all -> 0x038e }
            boolean r3 = r14.exists()     // Catch:{ all -> 0x038e }
            if (r3 == 0) goto L_0x00fd
            java.io.SequenceInputStream r3 = new java.io.SequenceInputStream     // Catch:{ all -> 0x038e }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x038e }
            r4.<init>(r14)     // Catch:{ all -> 0x038e }
            r3.<init>(r4, r9)     // Catch:{ all -> 0x038e }
            r13 = r9
            r9 = r3
            goto L_0x01b4
        L_0x00fd:
            l6.t0 r0 = new l6.t0     // Catch:{ all -> 0x038e }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.f2904a     // Catch:{ all -> 0x038e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x038e }
            throw r0     // Catch:{ all -> 0x038e }
        L_0x0107:
            m3.u r4 = g     // Catch:{ all -> 0x038e }
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ all -> 0x038e }
            r6 = r3
            l6.g0 r6 = (l6.g0) r6     // Catch:{ all -> 0x038e }
            java.lang.String r6 = r6.f7860b     // Catch:{ all -> 0x038e }
            r5[r12] = r6     // Catch:{ all -> 0x038e }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.a(r6, r5)     // Catch:{ all -> 0x038e }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x038e }
            r5 = r3
            l6.g0 r5 = (l6.g0) r5     // Catch:{ all -> 0x038e }
            java.lang.String r5 = r5.f7860b     // Catch:{ all -> 0x038e }
            r4.<init>(r5)     // Catch:{ all -> 0x038e }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x038e }
            if (r5 == 0) goto L_0x0186
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x038e }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x038e }
            r6 = r3
            l6.g0 r6 = (l6.g0) r6     // Catch:{ all -> 0x038e }
            long r6 = r6.f7861c     // Catch:{ all -> 0x038e }
            r5.seek(r6)     // Catch:{ all -> 0x038e }
            l6.g0 r3 = (l6.g0) r3     // Catch:{ all -> 0x038e }
            long r6 = r3.f7862d     // Catch:{ all -> 0x038e }
        L_0x013a:
            r13 = 8192(0x2000, double:4.0474E-320)
            long r13 = java.lang.Math.min(r6, r13)     // Catch:{ all -> 0x038e }
            int r3 = (int) r13     // Catch:{ all -> 0x038e }
            byte[] r8 = r1.f7968a     // Catch:{ all -> 0x038e }
            int r8 = r9.read(r8, r12, r3)     // Catch:{ all -> 0x038e }
            int r8 = java.lang.Math.max(r8, r12)     // Catch:{ all -> 0x038e }
            if (r8 <= 0) goto L_0x0152
            byte[] r13 = r1.f7968a     // Catch:{ all -> 0x038e }
            r5.write(r13, r12, r8)     // Catch:{ all -> 0x038e }
        L_0x0152:
            long r13 = (long) r8     // Catch:{ all -> 0x038e }
            long r13 = r6 - r13
            r6 = 0
            int r6 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0160
            if (r8 > 0) goto L_0x015e
            goto L_0x0160
        L_0x015e:
            r6 = r13
            goto L_0x013a
        L_0x0160:
            long r6 = r5.length()     // Catch:{ all -> 0x038e }
            r5.close()     // Catch:{ all -> 0x038e }
            if (r8 == r3) goto L_0x01b2
            m3.u r3 = g     // Catch:{ all -> 0x038e }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ all -> 0x038e }
            r3.a(r5, r8)     // Catch:{ all -> 0x038e }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x038e }
            int r8 = r2.f7953h     // Catch:{ all -> 0x038e }
            r3 = r0
            r5 = r6
            r18 = r8
            r7 = r13
            r13 = r9
            r9 = r18
            r3.f(r4, r5, r7, r9)     // Catch:{ all -> 0x02bc }
        L_0x0183:
            r9 = r16
            goto L_0x01b4
        L_0x0186:
            r13 = r9
            l6.t0 r0 = new l6.t0     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.f2904a     // Catch:{ all -> 0x02bc }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x02bc }
            throw r0     // Catch:{ all -> 0x02bc }
        L_0x0191:
            r13 = r9
            l6.t0 r0 = new l6.t0     // Catch:{ all -> 0x02bc }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ all -> 0x02bc }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x02bc }
            r6[r12] = r5     // Catch:{ all -> 0x02bc }
            l6.g0 r3 = (l6.g0) r3     // Catch:{ all -> 0x02bc }
            int r3 = r3.f7863e     // Catch:{ all -> 0x02bc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02bc }
            r6[r11] = r3     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = java.lang.String.format(r4, r6)     // Catch:{ all -> 0x02bc }
            int r4 = r2.f2904a     // Catch:{ all -> 0x02bc }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x02bc }
            throw r0     // Catch:{ all -> 0x02bc }
        L_0x01b2:
            r13 = r9
            r9 = r13
        L_0x01b4:
            if (r9 == 0) goto L_0x02bf
            l6.k0 r3 = new l6.k0     // Catch:{ all -> 0x02bc }
            r3.<init>(r9)     // Catch:{ all -> 0x02bc }
            java.io.File r4 = r25.b(r26)     // Catch:{ all -> 0x02bc }
        L_0x01bf:
            l6.m2 r5 = r3.a()     // Catch:{ all -> 0x02bc }
            r6 = r5
            l6.h0 r6 = (l6.h0) r6     // Catch:{ all -> 0x02bc }
            boolean r6 = r6.f7879d     // Catch:{ all -> 0x02bc }
            if (r6 != 0) goto L_0x0218
            boolean r6 = r3.f7914t     // Catch:{ all -> 0x02bc }
            if (r6 != 0) goto L_0x0218
            boolean r6 = r5.h()     // Catch:{ all -> 0x02bc }
            if (r6 == 0) goto L_0x0210
            boolean r6 = r5.g()     // Catch:{ all -> 0x02bc }
            if (r6 != 0) goto L_0x0210
            r6 = r5
            l6.h0 r6 = (l6.h0) r6     // Catch:{ all -> 0x02bc }
            byte[] r6 = r6.f7881f     // Catch:{ all -> 0x02bc }
            r0.i(r6)     // Catch:{ all -> 0x02bc }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x02bc }
            r7 = r5
            l6.h0 r7 = (l6.h0) r7     // Catch:{ all -> 0x02bc }
            java.lang.String r7 = r7.f7876a     // Catch:{ all -> 0x02bc }
            r6.<init>(r4, r7)     // Catch:{ all -> 0x02bc }
            java.io.File r7 = r6.getParentFile()     // Catch:{ all -> 0x02bc }
            r7.mkdirs()     // Catch:{ all -> 0x02bc }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x02bc }
            r7.<init>(r6)     // Catch:{ all -> 0x02bc }
            byte[] r6 = r1.f7968a     // Catch:{ all -> 0x02bc }
            int r6 = r3.read(r6, r12, r15)     // Catch:{ all -> 0x02bc }
        L_0x01fe:
            if (r6 <= 0) goto L_0x020c
            byte[] r8 = r1.f7968a     // Catch:{ all -> 0x02bc }
            r7.write(r8, r12, r6)     // Catch:{ all -> 0x02bc }
            byte[] r6 = r1.f7968a     // Catch:{ all -> 0x02bc }
            int r6 = r3.read(r6, r12, r15)     // Catch:{ all -> 0x02bc }
            goto L_0x01fe
        L_0x020c:
            r7.close()     // Catch:{ all -> 0x02bc }
            goto L_0x0218
        L_0x0210:
            r6 = r5
            l6.h0 r6 = (l6.h0) r6     // Catch:{ all -> 0x02bc }
            byte[] r6 = r6.f7881f     // Catch:{ all -> 0x02bc }
            r0.j(r6, r3)     // Catch:{ all -> 0x02bc }
        L_0x0218:
            boolean r6 = r3.f7913s     // Catch:{ all -> 0x02bc }
            if (r6 != 0) goto L_0x0220
            boolean r6 = r3.f7914t     // Catch:{ all -> 0x02bc }
            if (r6 == 0) goto L_0x01bf
        L_0x0220:
            boolean r4 = r3.f7914t     // Catch:{ all -> 0x02bc }
            if (r4 == 0) goto L_0x0235
            m3.u r4 = g     // Catch:{ all -> 0x02bc }
            java.lang.String r6 = "Writing central directory metadata."
            java.lang.Object[] r7 = new java.lang.Object[r12]     // Catch:{ all -> 0x02bc }
            r4.a(r6, r7)     // Catch:{ all -> 0x02bc }
            r4 = r5
            l6.h0 r4 = (l6.h0) r4     // Catch:{ all -> 0x02bc }
            byte[] r4 = r4.f7881f     // Catch:{ all -> 0x02bc }
            r0.j(r4, r9)     // Catch:{ all -> 0x02bc }
        L_0x0235:
            boolean r4 = r26.a()     // Catch:{ all -> 0x02bc }
            if (r4 != 0) goto L_0x02bf
            r4 = r5
            l6.h0 r4 = (l6.h0) r4     // Catch:{ all -> 0x02bc }
            boolean r4 = r4.f7879d     // Catch:{ all -> 0x02bc }
            if (r4 == 0) goto L_0x0255
            m3.u r3 = g     // Catch:{ all -> 0x02bc }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x02bc }
            r3.a(r4, r6)     // Catch:{ all -> 0x02bc }
            l6.h0 r5 = (l6.h0) r5     // Catch:{ all -> 0x02bc }
            byte[] r3 = r5.f7881f     // Catch:{ all -> 0x02bc }
            int r4 = r2.f7953h     // Catch:{ all -> 0x02bc }
            r0.g(r3, r4)     // Catch:{ all -> 0x02bc }
            goto L_0x02bf
        L_0x0255:
            boolean r4 = r3.f7914t     // Catch:{ all -> 0x02bc }
            if (r4 == 0) goto L_0x0268
            m3.u r3 = g     // Catch:{ all -> 0x02bc }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x02bc }
            r3.a(r4, r5)     // Catch:{ all -> 0x02bc }
            int r3 = r2.f7953h     // Catch:{ all -> 0x02bc }
            r0.e(r3)     // Catch:{ all -> 0x02bc }
            goto L_0x02bf
        L_0x0268:
            r4 = r5
            l6.h0 r4 = (l6.h0) r4     // Catch:{ all -> 0x02bc }
            int r4 = r4.f7878c     // Catch:{ all -> 0x02bc }
            if (r4 != 0) goto L_0x029e
            m3.u r4 = g     // Catch:{ all -> 0x02bc }
            java.lang.String r6 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r12]     // Catch:{ all -> 0x02bc }
            r4.a(r6, r7)     // Catch:{ all -> 0x02bc }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x02bc }
            java.io.File r6 = r25.b(r26)     // Catch:{ all -> 0x02bc }
            r7 = r5
            l6.h0 r7 = (l6.h0) r7     // Catch:{ all -> 0x02bc }
            java.lang.String r7 = r7.f7876a     // Catch:{ all -> 0x02bc }
            r4.<init>(r6, r7)     // Catch:{ all -> 0x02bc }
            l6.h0 r5 = (l6.h0) r5     // Catch:{ all -> 0x02bc }
            long r5 = r5.f7877b     // Catch:{ all -> 0x02bc }
            long r7 = r3.f7912c     // Catch:{ all -> 0x02bc }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x02bc }
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0296
            goto L_0x02af
        L_0x0296:
            l6.t0 r0 = new l6.t0     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x02bc }
            throw r0     // Catch:{ all -> 0x02bc }
        L_0x029e:
            m3.u r4 = g     // Catch:{ all -> 0x02bc }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x02bc }
            r4.a(r5, r6)     // Catch:{ all -> 0x02bc }
            java.io.File r4 = r0.c()     // Catch:{ all -> 0x02bc }
            long r5 = r4.length()     // Catch:{ all -> 0x02bc }
        L_0x02af:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x02bc }
            long r7 = r3.f7912c     // Catch:{ all -> 0x02bc }
            int r9 = r2.f7953h     // Catch:{ all -> 0x02bc }
            r3 = r0
            r3.f(r4, r5, r7, r9)     // Catch:{ all -> 0x02bc }
            goto L_0x02bf
        L_0x02bc:
            r0 = move-exception
            goto L_0x0390
        L_0x02bf:
            r13.close()     // Catch:{ IOException -> 0x0394 }
            boolean r3 = r26.a()
            if (r3 == 0) goto L_0x02e8
            int r3 = r2.f7953h     // Catch:{ IOException -> 0x02ce }
            r0.h(r3)     // Catch:{ IOException -> 0x02ce }
            goto L_0x02e8
        L_0x02ce:
            r0 = move-exception
            m3.u r3 = g
            java.lang.Object[] r4 = new java.lang.Object[r11]
            java.lang.String r5 = r0.getMessage()
            r4[r12] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r3.c(r5, r4)
            l6.t0 r3 = new l6.t0
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            int r2 = r2.f2904a
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x02e8:
            m3.u r0 = g
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r2.f7953h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r12] = r4
            java.lang.String r4 = r2.f7952f
            r3[r11] = r4
            java.lang.String r4 = r2.f2905b
            r3[r10] = r4
            int r4 = r2.f2904a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.e(r4, r3)
            o6.w r0 = r1.f7970c
            java.lang.Object r0 = r0.zza()
            l6.v2 r0 = (l6.v2) r0
            int r3 = r2.f2904a
            java.lang.String r4 = r2.f2905b
            java.lang.String r5 = r2.f7952f
            int r6 = r2.f7953h
            r0.a(r3, r4, r5, r6)
            java.io.InputStream r0 = r2.f7956l     // Catch:{ IOException -> 0x0324 }
            r0.close()     // Catch:{ IOException -> 0x0324 }
            goto L_0x033e
        L_0x0324:
            m3.u r0 = g
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.f7953h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r12] = r3
            java.lang.String r3 = r2.f7952f
            r4[r11] = r3
            java.lang.String r3 = r2.f2905b
            r4[r10] = r3
            java.lang.String r3 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.g(r3, r4)
        L_0x033e:
            int r0 = r2.f7955k
            r3 = 3
            if (r0 != r3) goto L_0x038d
            o6.w r0 = r1.f7971d
            java.lang.Object r0 = r0.zza()
            l6.x r0 = (l6.x) r0
            java.lang.String r13 = r2.f2905b
            long r3 = r2.f7954j
            r14 = 3
            r15 = 0
            l6.x0 r5 = r1.f7972e
            monitor-enter(r5)
            int r6 = r2.f7953h     // Catch:{ all -> 0x038a }
            double r6 = (double) r6     // Catch:{ all -> 0x038a }
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 + r8
            int r8 = r2.i     // Catch:{ all -> 0x038a }
            double r8 = (double) r8     // Catch:{ all -> 0x038a }
            double r20 = r6 / r8
            java.util.HashMap r6 = r5.f8086a     // Catch:{ all -> 0x038a }
            java.lang.Double r7 = java.lang.Double.valueOf(r20)     // Catch:{ all -> 0x038a }
            r6.put(r13, r7)     // Catch:{ all -> 0x038a }
            monitor-exit(r5)
            r22 = 1
            java.lang.String r5 = r2.f7951e
            l6.y1 r6 = r1.f7973f
            java.lang.String r2 = r2.f2905b
            java.lang.String r24 = r6.a(r2)
            r16 = r3
            r18 = r3
            r23 = r5
            com.google.android.play.core.assetpacks.AssetPackState r2 = com.google.android.play.core.assetpacks.AssetPackState.h(r13, r14, r15, r16, r18, r20, r22, r23, r24)
            android.os.Handler r3 = r0.f8085o
            l6.w r4 = new l6.w
            r4.<init>(r0, r2, r12)
            r3.post(r4)
            return
        L_0x038a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x038d:
            return
        L_0x038e:
            r0 = move-exception
            r13 = r9
        L_0x0390:
            r13.close()     // Catch:{ all -> 0x0393 }
        L_0x0393:
            throw r0     // Catch:{ IOException -> 0x0394 }
        L_0x0394:
            r0 = move-exception
            m3.u r3 = g
            java.lang.Object[] r4 = new java.lang.Object[r11]
            java.lang.String r5 = r0.getMessage()
            r4[r12] = r5
            java.lang.String r5 = "IOException during extraction %s."
            r3.c(r5, r4)
            l6.t0 r3 = new l6.t0
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r2.f7953h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r12] = r5
            java.lang.String r5 = r2.f7952f
            r4[r11] = r5
            java.lang.String r5 = r2.f2905b
            r4[r10] = r5
            int r5 = r2.f2904a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.f2904a
            r3.<init>(r4, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.p0.a(l6.o0):void");
    }

    public final File b(o0 o0Var) {
        File s10 = this.f7969b.s(o0Var.f2905b, o0Var.f7949c, o0Var.f7950d, o0Var.f7952f);
        if (!s10.exists()) {
            s10.mkdirs();
        }
        return s10;
    }
}
