package io.sentry.instrumentation.file;

import io.sentry.HubAdapter;
import io.sentry.IHub;
import io.sentry.ISpan;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.util.concurrent.atomic.AtomicInteger;

public final class SentryFileInputStream extends FileInputStream {
    private final FileInputStream delegate;
    private final FileIOSpanManager spanManager;

    public static final class Factory {
        public static FileInputStream create(FileInputStream fileInputStream, File file) {
            return new SentryFileInputStream(SentryFileInputStream.init(file, fileInputStream, (IHub) HubAdapter.getInstance()));
        }

        public static FileInputStream create(FileInputStream fileInputStream, File file, IHub iHub) {
            return new SentryFileInputStream(SentryFileInputStream.init(file, fileInputStream, iHub));
        }

        public static FileInputStream create(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
            return new SentryFileInputStream(SentryFileInputStream.init(fileDescriptor, fileInputStream, (IHub) HubAdapter.getInstance()), fileDescriptor);
        }

        public static FileInputStream create(FileInputStream fileInputStream, String str) {
            return new SentryFileInputStream(SentryFileInputStream.init(str != null ? new File(str) : null, fileInputStream, (IHub) HubAdapter.getInstance()));
        }
    }

    private SentryFileInputStream(FileInputStreamInitData fileInputStreamInitData) {
        super(fileInputStreamInitData.file);
        this.spanManager = new FileIOSpanManager(fileInputStreamInitData.span, fileInputStreamInitData.file, fileInputStreamInitData.isSendDefaultPii);
        this.delegate = fileInputStreamInitData.delegate;
    }

    private SentryFileInputStream(FileInputStreamInitData fileInputStreamInitData, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.spanManager = new FileIOSpanManager(fileInputStreamInitData.span, fileInputStreamInitData.file, fileInputStreamInitData.isSendDefaultPii);
        this.delegate = fileInputStreamInitData.delegate;
    }

    public SentryFileInputStream(File file) {
        this(file, (IHub) HubAdapter.getInstance());
    }

    public SentryFileInputStream(File file, IHub iHub) {
        this(init(file, (FileInputStream) null, iHub));
    }

    public SentryFileInputStream(FileDescriptor fileDescriptor) {
        this(fileDescriptor, (IHub) HubAdapter.getInstance());
    }

    public SentryFileInputStream(FileDescriptor fileDescriptor, IHub iHub) {
        this(init(fileDescriptor, (FileInputStream) null, iHub), fileDescriptor);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SentryFileInputStream(String str) {
        this(str != null ? new File(str) : null, (IHub) HubAdapter.getInstance());
    }

    /* access modifiers changed from: private */
    public static FileInputStreamInitData init(File file, FileInputStream fileInputStream, IHub iHub) {
        ISpan startSpan = FileIOSpanManager.startSpan(iHub, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new FileInputStreamInitData(file, startSpan, fileInputStream, iHub.getOptions().isSendDefaultPii());
    }

    /* access modifiers changed from: private */
    public static FileInputStreamInitData init(FileDescriptor fileDescriptor, FileInputStream fileInputStream, IHub iHub) {
        ISpan startSpan = FileIOSpanManager.startSpan(iHub, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(fileDescriptor);
        }
        return new FileInputStreamInitData((File) null, startSpan, fileInputStream, iHub.getOptions().isSendDefaultPii());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$read$0(AtomicInteger atomicInteger) {
        int read = this.delegate.read();
        atomicInteger.set(read);
        return Integer.valueOf(read != -1 ? 1 : 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$read$1(byte[] bArr) {
        return Integer.valueOf(this.delegate.read(bArr));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$read$2(byte[] bArr, int i, int i10) {
        return Integer.valueOf(this.delegate.read(bArr, i, i10));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Long lambda$skip$3(long j10) {
        return Long.valueOf(this.delegate.skip(j10));
    }

    public void close() {
        this.spanManager.finish(this.delegate);
    }

    public int read() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.spanManager.performIO(new b(this, atomicInteger));
        return atomicInteger.get();
    }

    public int read(byte[] bArr) {
        return ((Integer) this.spanManager.performIO(new c(this, bArr))).intValue();
    }

    public int read(byte[] bArr, int i, int i10) {
        return ((Integer) this.spanManager.performIO(new d(this, bArr, i, i10))).intValue();
    }

    public long skip(long j10) {
        return ((Long) this.spanManager.performIO(new a(this, j10))).longValue();
    }
}
