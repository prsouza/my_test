package l6;

import java.io.File;
import java.io.IOException;
import m3.u;

public final class r1 {

    /* renamed from: b  reason: collision with root package name */
    public static final u f8008b = new u("MergeSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    public final a0 f8009a;

    public r1(a0 a0Var) {
        this.f8009a = a0Var;
    }

    public static void b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                throw new t0("Unable to delete directory: ".concat(String.valueOf(file)));
            }
        } else if (file2.exists()) {
            throw new t0("File clashing with existing file from other slice: ".concat(file2.toString()));
        } else if (!file.renameTo(file2)) {
            throw new t0("Unable to move file: ".concat(String.valueOf(file)));
        }
    }

    public final void a(q1 q1Var) {
        File t10 = this.f8009a.t(q1Var.f2905b, q1Var.f7996c, q1Var.f7997d, q1Var.f7998e);
        if (t10.exists()) {
            File p10 = this.f8009a.p(q1Var.f2905b, q1Var.f7996c, q1Var.f7997d);
            if (!p10.exists()) {
                p10.mkdirs();
            }
            b(t10, p10);
            try {
                this.f8009a.a(q1Var.f2905b, q1Var.f7996c, q1Var.f7997d, this.f8009a.k(q1Var.f2905b, q1Var.f7996c, q1Var.f7997d) + 1);
            } catch (IOException e10) {
                f8008b.c("Writing merge checkpoint failed with %s.", e10.getMessage());
                throw new t0("Writing merge checkpoint failed.", e10, q1Var.f2904a);
            }
        } else {
            throw new t0(String.format("Cannot find verified files for slice %s.", new Object[]{q1Var.f7998e}), q1Var.f2904a);
        }
    }
}
