package x2;

import a.a;
import com.github.mikephil.charting.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import o2.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final d f12758a;

    public e(d dVar) {
        this.f12758a = dVar;
    }

    public static String a(String str, c cVar, boolean z) {
        StringBuilder d10 = a.d("lottie_cache_");
        d10.append(str.replaceAll("\\W+", BuildConfig.FLAVOR));
        d10.append(z ? cVar.tempExtension() : cVar.extension);
        return d10.toString();
    }

    public final File b() {
        c cVar = (c) this.f12758a;
        Objects.requireNonNull(cVar);
        File file = new File(cVar.f9192a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File c(String str, InputStream inputStream, c cVar) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(b(), a(str, cVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }
}
