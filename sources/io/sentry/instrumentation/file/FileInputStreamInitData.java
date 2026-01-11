package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import java.io.File;
import java.io.FileInputStream;

final class FileInputStreamInitData {
    public final FileInputStream delegate;
    public final File file;
    public final boolean isSendDefaultPii;
    public final ISpan span;

    public FileInputStreamInitData(File file2, ISpan iSpan, FileInputStream fileInputStream, boolean z) {
        this.file = file2;
        this.span = iSpan;
        this.delegate = fileInputStream;
        this.isSendDefaultPii = z;
    }
}
