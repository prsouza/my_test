package io.sentry.instrumentation.file;

import io.sentry.IHub;
import java.io.File;
import java.io.FileDescriptor;
import java.io.OutputStreamWriter;

public final class SentryFileWriter extends OutputStreamWriter {
    public SentryFileWriter(File file) {
        super(new SentryFileOutputStream(file));
    }

    public SentryFileWriter(File file, IHub iHub) {
        super(new SentryFileOutputStream(file, iHub));
    }

    public SentryFileWriter(File file, boolean z) {
        super(new SentryFileOutputStream(file, z));
    }

    public SentryFileWriter(FileDescriptor fileDescriptor) {
        super(new SentryFileOutputStream(fileDescriptor));
    }

    public SentryFileWriter(String str) {
        super(new SentryFileOutputStream(str));
    }

    public SentryFileWriter(String str, boolean z) {
        super(new SentryFileOutputStream(str, z));
    }
}
