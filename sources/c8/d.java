package c8;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

public final /* synthetic */ class d implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f3260a = new d();

    public final int compare(Object obj, Object obj2) {
        Charset charset = e.f3261d;
        String name = ((File) obj).getName();
        int i = e.f3262e;
        return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
    }
}
