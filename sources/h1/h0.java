package h1;

import a.a;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import j1.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import l1.b;

public final class h0 implements b, n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5721a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5722b;

    /* renamed from: c  reason: collision with root package name */
    public final File f5723c;

    /* renamed from: s  reason: collision with root package name */
    public final Callable<InputStream> f5724s;

    /* renamed from: t  reason: collision with root package name */
    public final int f5725t;

    /* renamed from: u  reason: collision with root package name */
    public final b f5726u;

    /* renamed from: v  reason: collision with root package name */
    public m f5727v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5728w;

    public final b a() {
        return this.f5726u;
    }

    /* JADX INFO: finally extract failed */
    public final void c(File file) throws IOException {
        ReadableByteChannel readableByteChannel;
        if (this.f5722b != null) {
            readableByteChannel = Channels.newChannel(this.f5721a.getAssets().open(this.f5722b));
        } else if (this.f5723c != null) {
            readableByteChannel = new FileInputStream(this.f5723c).getChannel();
        } else {
            Callable<InputStream> callable = this.f5724s;
            if (callable != null) {
                try {
                    readableByteChannel = Channels.newChannel(callable.call());
                } catch (Exception e10) {
                    throw new IOException("inputStreamCallable exception on call", e10);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f5721a.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream newInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream newOutputStream = Channels.newOutputStream(channel);
                byte[] bArr = new byte[LZ4Constants.HASH_TABLE_SIZE];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            } else {
                channel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            }
            channel.force(false);
            readableByteChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder d10 = a.d("Failed to create directories for ");
                d10.append(file.getAbsolutePath());
                throw new IOException(d10.toString());
            } else if (!createTempFile.renameTo(file)) {
                StringBuilder d11 = a.d("Failed to move intermediate file (");
                d11.append(createTempFile.getAbsolutePath());
                d11.append(") to destination (");
                d11.append(file.getAbsolutePath());
                d11.append(").");
                throw new IOException(d11.toString());
            }
        } catch (Throwable th2) {
            readableByteChannel.close();
            channel.close();
            throw th2;
        }
    }

    public final synchronized void close() {
        this.f5726u.close();
        this.f5728w = false;
    }

    public final void e(boolean z) {
        String databaseName = getDatabaseName();
        File databasePath = this.f5721a.getDatabasePath(databaseName);
        m mVar = this.f5727v;
        j1.a aVar = new j1.a(databaseName, this.f5721a.getFilesDir(), mVar == null || mVar.f5756l);
        try {
            aVar.f6988b.lock();
            if (aVar.f6989c) {
                FileChannel channel = new FileOutputStream(aVar.f6987a).getChannel();
                aVar.f6990d = channel;
                channel.lock();
            }
            if (!databasePath.exists()) {
                c(databasePath);
                aVar.a();
            } else if (this.f5727v == null) {
                aVar.a();
            } else {
                try {
                    int b10 = c.b(databasePath);
                    int i = this.f5725t;
                    if (b10 == i) {
                        aVar.a();
                    } else if (this.f5727v.a(b10, i)) {
                        aVar.a();
                    } else {
                        if (this.f5721a.deleteDatabase(databaseName)) {
                            try {
                                c(databasePath);
                            } catch (IOException e10) {
                                Log.w("ROOM", "Unable to copy database file.", e10);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar.a();
                    }
                } catch (IOException e11) {
                    Log.w("ROOM", "Unable to read database version.", e11);
                    aVar.a();
                }
            }
        } catch (IOException e12) {
            throw new RuntimeException("Unable to copy database file.", e12);
        } catch (IOException e13) {
            throw new IllegalStateException("Unable to grab copy lock.", e13);
        } catch (Throwable th2) {
            aVar.a();
            throw th2;
        }
    }

    public final String getDatabaseName() {
        return this.f5726u.getDatabaseName();
    }

    public final synchronized l1.a m0() {
        if (!this.f5728w) {
            e(true);
            this.f5728w = true;
        }
        return this.f5726u.m0();
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.f5726u.setWriteAheadLoggingEnabled(z);
    }
}
