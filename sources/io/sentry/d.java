package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f6883a = new d();

    public final Object call() {
        return InetAddress.getLocalHost();
    }
}
