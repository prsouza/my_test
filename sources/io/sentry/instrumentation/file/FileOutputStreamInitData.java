package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import java.io.File;
import java.io.FileOutputStream;

final class FileOutputStreamInitData {
    public final boolean append;
    public final FileOutputStream delegate;
    public final File file;
    public final boolean isSendDefaultPii;
    public final ISpan span;

    public FileOutputStreamInitData(File file2, boolean z, ISpan iSpan, FileOutputStream fileOutputStream, boolean z10) {
        this.file = file2;
        this.append = z;
        this.span = iSpan;
        this.delegate = fileOutputStream;
        this.isSendDefaultPii = z10;
    }
}
