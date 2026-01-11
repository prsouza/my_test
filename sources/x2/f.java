package x2;

import a.a;
import a3.c;
import com.github.mikephil.charting.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.ZipInputStream;
import o2.g;
import o2.q;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final e f12759a;

    /* renamed from: b  reason: collision with root package name */
    public final b f12760b;

    public f(e eVar, b bVar) {
        this.f12759a = eVar;
        this.f12760b = bVar;
    }

    public final q<o2.f> a(String str, InputStream inputStream, String str2, String str3) throws IOException {
        c cVar;
        q<o2.f> qVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
            c.a();
            cVar = c.ZIP;
            if (str3 == null) {
                qVar = g.f(new ZipInputStream(inputStream), (String) null);
            } else {
                qVar = g.f(new ZipInputStream(new FileInputStream(this.f12759a.c(str, inputStream, cVar))), str);
            }
        } else {
            c.a();
            cVar = c.JSON;
            if (str3 == null) {
                qVar = g.c(inputStream, (String) null);
            } else {
                qVar = g.c(new FileInputStream(new File(this.f12759a.c(str, inputStream, cVar).getAbsolutePath())), str);
            }
        }
        if (!(str3 == null || qVar.f9292a == null)) {
            e eVar = this.f12759a;
            Objects.requireNonNull(eVar);
            File file = new File(eVar.b(), e.a(str, cVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", BuildConfig.FLAVOR));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            c.a();
            if (!renameTo) {
                StringBuilder d10 = a.d("Unable to rename cache file ");
                d10.append(file.getAbsolutePath());
                d10.append(" to ");
                d10.append(file2.getAbsolutePath());
                d10.append(".");
                c.b(d10.toString());
            }
        }
        return qVar;
    }
}
