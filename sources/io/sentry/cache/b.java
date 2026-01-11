package io.sentry.cache;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class b implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f6882a = new b();

    public final boolean accept(File file, String str) {
        return str.endsWith(EnvelopeCache.SUFFIX_ENVELOPE_FILE);
    }
}
