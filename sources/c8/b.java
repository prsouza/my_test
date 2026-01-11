package c8;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

public final /* synthetic */ class b implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f3258a = new b();

    public final boolean accept(File file, String str) {
        Charset charset = e.f3261d;
        return str.startsWith("event") && !str.endsWith("_");
    }
}
