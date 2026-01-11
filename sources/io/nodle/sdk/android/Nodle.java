package io.nodle.sdk.android;

import a9.c;
import ac.a;
import android.content.Context;
import android.util.Log;
import e6.e;
import io.nodle.sdk.INodle;
import io.nodle.sdk.NodleContext;
import io.nodle.sdk.NodleNotFound;
import io.nodle.sdk.core.SdkFactory;
import io.nodle.sdk.runner.coroutine.NodleCoroutine;
import java.util.concurrent.locks.ReentrantLock;

public final class Nodle {
    public static final Nodle INSTANCE = new Nodle();
    private static final ReentrantLock lock = new ReentrantLock();
    public static a nodleAndroidContext;
    private static INodle runner;

    private Nodle() {
    }

    public static final INodle Nodle() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            INodle iNodle = runner;
            if (iNodle == null) {
                iNodle = INSTANCE.bind();
            }
            return iNodle;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final INodle bind() {
        Class<NodleCoroutine> cls = NodleCoroutine.class;
        try {
            System.out.println("nodle runner coroutine found! ");
            NodleCoroutine newInstance = cls.getConstructor(new Class[]{NodleContext.class, SdkFactory.class}).newInstance(new Object[]{getNodleAndroidContext(), new h9.a()});
            if (newInstance != null) {
                INodle iNodle = newInstance;
                runner = iNodle;
                return iNodle;
            }
            throw new NullPointerException("null cannot be cast to non-null type io.nodle.sdk.INodle");
        } catch (Exception e10) {
            h9.a aVar = h9.a.f5900a;
            Log.e(h9.a.f5901b, "bind()", e10);
            System.out.println("no nodle runner found");
            NodleNotFound nodleNotFound = new NodleNotFound();
            runner = nodleNotFound;
            return nodleNotFound;
        }
    }

    public static final void init(Context context) {
        e.D(context, "context");
        INSTANCE.setNodleAndroidContext(new a(context, new c(context)));
    }

    public final a getNodleAndroidContext() {
        a aVar = nodleAndroidContext;
        if (aVar != null) {
            return aVar;
        }
        e.c0("nodleAndroidContext");
        throw null;
    }

    public final void setNodleAndroidContext(a aVar) {
        e.D(aVar, "<set-?>");
        nodleAndroidContext = aVar;
    }
}
