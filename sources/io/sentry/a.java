package io.sentry;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class a implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DirectoryProcessor f6878a;

    public /* synthetic */ a(DirectoryProcessor directoryProcessor) {
        this.f6878a = directoryProcessor;
    }

    public final boolean accept(File file, String str) {
        return this.f6878a.lambda$processDirectory$0(file, str);
    }
}
