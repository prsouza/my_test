package o2;

import java.io.InputStream;
import java.util.concurrent.Callable;

public final class k implements Callable<q<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InputStream f9225a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9226b = null;

    public k(InputStream inputStream) {
        this.f9225a = inputStream;
    }

    public final Object call() throws Exception {
        return g.c(this.f9225a, this.f9226b);
    }
}
