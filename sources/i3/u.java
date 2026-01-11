package i3;

import a.a;
import com.bumptech.glide.load.data.e;
import g3.h;
import i3.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import m0.c;
import org.slf4j.helpers.MessageFormatter;

public final class u<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final c<List<Throwable>> f6151a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends k<Data, ResourceType, Transcode>> f6152b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6153c;

    public u(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<k<Data, ResourceType, Transcode>> list, c<List<Throwable>> cVar) {
        this.f6151a = cVar;
        if (!list.isEmpty()) {
            this.f6152b = list;
            StringBuilder d10 = a.d("Failed LoadPath{");
            d10.append(cls.getSimpleName());
            d10.append("->");
            d10.append(cls2.getSimpleName());
            d10.append("->");
            d10.append(cls3.getSimpleName());
            d10.append("}");
            this.f6153c = d10.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final w<Transcode> a(e<Data> eVar, h hVar, int i, int i10, k.a<ResourceType> aVar) throws r {
        w<Transcode> wVar;
        List<Throwable> b10 = this.f6151a.b();
        Objects.requireNonNull(b10, "Argument must not be null");
        List list = b10;
        try {
            int size = this.f6152b.size();
            wVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                wVar = ((k) this.f6152b.get(i11)).a(eVar, i, i10, hVar, aVar);
                if (wVar != null) {
                    break;
                }
            }
        } catch (r e10) {
            list.add(e10);
        } catch (Throwable th2) {
            this.f6151a.a(list);
            throw th2;
        }
        if (wVar != null) {
            this.f6151a.a(list);
            return wVar;
        }
        throw new r(this.f6153c, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder d10 = a.d("LoadPath{decodePaths=");
        d10.append(Arrays.toString(this.f6152b.toArray()));
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
