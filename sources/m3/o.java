package m3;

import com.bumptech.glide.load.data.d;
import g3.f;
import g3.h;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public interface o<Model, Data> {

    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final f f8426a;

        /* renamed from: b  reason: collision with root package name */
        public final List<f> f8427b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f8428c;

        public a(f fVar, d<Data> dVar) {
            List<f> emptyList = Collections.emptyList();
            Objects.requireNonNull(fVar, "Argument must not be null");
            this.f8426a = fVar;
            Objects.requireNonNull(emptyList, "Argument must not be null");
            this.f8427b = emptyList;
            Objects.requireNonNull(dVar, "Argument must not be null");
            this.f8428c = dVar;
        }
    }

    a<Data> a(Model model, int i, int i10, h hVar);

    boolean b(Model model);
}
