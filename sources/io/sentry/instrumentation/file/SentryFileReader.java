package io.sentry.instrumentation.file;

import io.sentry.IHub;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStreamReader;

public final class SentryFileReader extends InputStreamReader {
    public SentryFileReader(File file) {
        super(new SentryFileInputStream(file));
    }

    public SentryFileReader(File file, IHub iHub) {
        super(new SentryFileInputStream(file, iHub));
    }

    public SentryFileReader(FileDescriptor fileDescriptor) {
        super(new SentryFileInputStream(fileDescriptor));
    }

    public SentryFileReader(String str) {
        super(new SentryFileInputStream(str));
    }
}
