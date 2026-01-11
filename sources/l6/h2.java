package l6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.Properties;
import m3.u;

public final class h2 {

    /* renamed from: h  reason: collision with root package name */
    public static final u f7886h = new u("SliceMetadataManager");

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7887a = new byte[LZ4Constants.HASH_TABLE_SIZE_64K];

    /* renamed from: b  reason: collision with root package name */
    public final a0 f7888b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7889c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7890d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7891e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7892f;
    public int g;

    public h2(a0 a0Var, String str, int i, long j10, String str2) {
        this.f7888b = a0Var;
        this.f7889c = str;
        this.f7890d = i;
        this.f7891e = j10;
        this.f7892f = str2;
        this.g = -1;
    }

    public final int a() throws IOException {
        File q10 = this.f7888b.q(this.f7889c, this.f7890d, this.f7891e, this.f7892f);
        if (!q10.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(q10);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new t0("Slice checkpoint file corrupt.");
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final g2 b() throws IOException {
        File q10 = this.f7888b.q(this.f7889c, this.f7890d, this.f7891e, this.f7892f);
        if (q10.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(q10);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new t0("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new g0(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e10) {
                    throw new t0("Slice checkpoint file corrupt.", (Exception) e10);
                }
            } catch (Throwable unused) {
            }
        } else {
            throw new t0("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    public final File c() {
        return new File(l(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.g)}));
    }

    public final void d(long j10, byte[] bArr, int i, int i10) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j10);
            randomAccessFile.write(bArr, i, i10);
            randomAccessFile.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final void e(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final void f(String str, long j10, long j11, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j10));
        properties.put("remainingBytes", String.valueOf(j11));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final void g(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            a0 a0Var = this.f7888b;
            String str = this.f7889c;
            int i10 = this.f7890d;
            long j10 = this.f7891e;
            String str2 = this.f7892f;
            Objects.requireNonNull(a0Var);
            File file = new File(a0Var.r(str, i10, j10, str2), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable unused) {
            }
            throw th;
            throw th;
        } catch (Throwable unused2) {
        }
    }

    public final void h(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(byte[] r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.g
            r1 = 1
            int r0 = r0 + r1
            r5.g = r0
            java.io.File r0 = new java.io.File
            java.io.File r2 = r5.l()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r3 = r5.g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = "%s-LFH.dat"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r0.<init>(r2, r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0031 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0031 }
            r1.write(r6)     // Catch:{ all -> 0x002c }
            r1.close()     // Catch:{ IOException -> 0x0031 }
            return
        L_0x002c:
            r6 = move-exception
            r1.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r6     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            r6 = move-exception
            l6.t0 r0 = new l6.t0
            java.lang.String r1 = "Could not write metadata file."
            r0.<init>((java.lang.String) r1, (java.lang.Exception) r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.h2.i(byte[]):void");
    }

    public final void j(byte[] bArr, InputStream inputStream) throws IOException {
        this.g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f7887a);
            while (read > 0) {
                fileOutputStream.write(this.f7887a, 0, read);
                read = inputStream.read(this.f7887a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final void k(byte[] bArr, int i) throws IOException {
        this.g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final File l() {
        File r10 = this.f7888b.r(this.f7889c, this.f7890d, this.f7891e, this.f7892f);
        if (!r10.exists()) {
            r10.mkdirs();
        }
        return r10;
    }

    public final File m() throws IOException {
        File q10 = this.f7888b.q(this.f7889c, this.f7890d, this.f7891e, this.f7892f);
        q10.getParentFile().mkdirs();
        q10.createNewFile();
        return q10;
    }
}
