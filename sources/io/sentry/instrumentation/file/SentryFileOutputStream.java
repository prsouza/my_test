package io.sentry.instrumentation.file;

import io.sentry.HubAdapter;
import io.sentry.IHub;
import io.sentry.ISpan;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

public final class SentryFileOutputStream extends FileOutputStream {
    private final FileOutputStream delegate;
    private final FileIOSpanManager spanManager;

    public static final class Factory {
        public static FileOutputStream create(FileOutputStream fileOutputStream, File file) {
            return new SentryFileOutputStream(SentryFileOutputStream.init(file, false, fileOutputStream, HubAdapter.getInstance()));
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, File file, boolean z) {
            return new SentryFileOutputStream(SentryFileOutputStream.init(file, z, fileOutputStream, HubAdapter.getInstance()));
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, FileDescriptor fileDescriptor) {
            return new SentryFileOutputStream(SentryFileOutputStream.init(fileDescriptor, fileOutputStream, HubAdapter.getInstance()), fileDescriptor);
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, String str) {
            return new SentryFileOutputStream(SentryFileOutputStream.init(str != null ? new File(str) : null, false, fileOutputStream, HubAdapter.getInstance()));
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, String str, boolean z) {
            return new SentryFileOutputStream(SentryFileOutputStream.init(str != null ? new File(str) : null, z, fileOutputStream, HubAdapter.getInstance()));
        }
    }

    private SentryFileOutputStream(FileOutputStreamInitData fileOutputStreamInitData) {
        super(fileOutputStreamInitData.file, fileOutputStreamInitData.append);
        this.spanManager = new FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.isSendDefaultPii);
        this.delegate = fileOutputStreamInitData.delegate;
    }

    private SentryFileOutputStream(FileOutputStreamInitData fileOutputStreamInitData, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.spanManager = new FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.isSendDefaultPii);
        this.delegate = fileOutputStreamInitData.delegate;
    }

    public SentryFileOutputStream(File file) {
        this(file, (IHub) HubAdapter.getInstance());
    }

    public SentryFileOutputStream(File file, IHub iHub) {
        this(init(file, false, (FileOutputStream) null, iHub));
    }

    public SentryFileOutputStream(File file, boolean z) {
        this(init(file, z, (FileOutputStream) null, HubAdapter.getInstance()));
    }

    public SentryFileOutputStream(FileDescriptor fileDescriptor) {
        this(init(fileDescriptor, (FileOutputStream) null, HubAdapter.getInstance()), fileDescriptor);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SentryFileOutputStream(String str) {
        this(str != null ? new File(str) : null, (IHub) HubAdapter.getInstance());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SentryFileOutputStream(String str, boolean z) {
        this(init(str != null ? new File(str) : null, z, (FileOutputStream) null, HubAdapter.getInstance()));
    }

    /* access modifiers changed from: private */
    public static FileOutputStreamInitData init(File file, boolean z, FileOutputStream fileOutputStream, IHub iHub) {
        ISpan startSpan = FileIOSpanManager.startSpan(iHub, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file);
        }
        return new FileOutputStreamInitData(file, z, startSpan, fileOutputStream, iHub.getOptions().isSendDefaultPii());
    }

    /* access modifiers changed from: private */
    public static FileOutputStreamInitData init(FileDescriptor fileDescriptor, FileOutputStream fileOutputStream, IHub iHub) {
        ISpan startSpan = FileIOSpanManager.startSpan(iHub, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(fileDescriptor);
        }
        return new FileOutputStreamInitData((File) null, false, startSpan, fileOutputStream, iHub.getOptions().isSendDefaultPii());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$write$0(int i) {
        this.delegate.write(i);
        return 1;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$write$1(byte[] bArr) {
        this.delegate.write(bArr);
        return Integer.valueOf(bArr.length);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$write$2(byte[] bArr, int i, int i10) {
        this.delegate.write(bArr, i, i10);
        return Integer.valueOf(i10);
    }

    public void close() {
        this.spanManager.finish(this.delegate);
    }

    public void write(int i) {
        this.spanManager.performIO(new e(this, i));
    }

    public void write(byte[] bArr) {
        this.spanManager.performIO(new f(this, bArr));
    }

    public void write(byte[] bArr, int i, int i10) {
        this.spanManager.performIO(new g(this, bArr, i, i10));
    }
}
