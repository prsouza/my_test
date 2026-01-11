package io.sentry.cache;

import java.io.File;
import java.util.Comparator;

public final /* synthetic */ class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f6881a = new a();

    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }
}
