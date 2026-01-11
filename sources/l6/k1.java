package l6;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class k1 implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f7915a;

    public /* synthetic */ k1(String str) {
        this.f7915a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f7915a).concat("-")) && str.endsWith(".apk");
    }
}
