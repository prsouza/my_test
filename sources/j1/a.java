package j1;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, Lock> f6986e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final File f6987a;

    /* renamed from: b  reason: collision with root package name */
    public final Lock f6988b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6989c;

    /* renamed from: d  reason: collision with root package name */
    public FileChannel f6990d;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.concurrent.locks.Lock>] */
    public a(String str, File file, boolean z) {
        Lock lock;
        File file2 = new File(file, a8.a.c(str, ".lck"));
        this.f6987a = file2;
        String absolutePath = file2.getAbsolutePath();
        ? r42 = f6986e;
        synchronized (r42) {
            lock = (Lock) r42.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                r42.put(absolutePath, lock);
            }
        }
        this.f6988b = lock;
        this.f6989c = z;
    }

    public final void a() {
        FileChannel fileChannel = this.f6990d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f6988b.unlock();
    }
}
