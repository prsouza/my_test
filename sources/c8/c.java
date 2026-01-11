package c8;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

public final /* synthetic */ class c implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c f3259a = new c();

    public final int compare(Object obj, Object obj2) {
        Charset charset = e.f3261d;
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
