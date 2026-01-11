package d1;

import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.y0;
import e1.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {

    /* renamed from: d1.a$a  reason: collision with other inner class name */
    public interface C0058a<D> {
        b<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(b<D> bVar, D d10);

        void onLoaderReset(b<D> bVar);
    }

    public static <T extends a0 & y0> a b(T t10) {
        return new b(t10, ((y0) t10).getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
