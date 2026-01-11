package s3;

import i3.w;
import java.io.File;
import java.util.Objects;

public final class b implements w<File> {

    /* renamed from: a  reason: collision with root package name */
    public final File f10860a;

    public b(File file) {
        Objects.requireNonNull(file, "Argument must not be null");
        this.f10860a = file;
    }

    public final /* bridge */ /* synthetic */ int b() {
        return 1;
    }

    public final Class c() {
        return this.f10860a.getClass();
    }

    public final /* bridge */ /* synthetic */ void d() {
    }

    public final Object get() {
        return this.f10860a;
    }
}
