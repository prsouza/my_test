package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.emoji2.text.d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.a0;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import j0.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements n1.b<Boolean> {

    public static class a extends d.c {
        public a(Context context) {
            super(new b(context));
            this.f1712b = 1;
        }
    }

    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1697a;

        public b(Context context) {
            this.f1697a = context.getApplicationContext();
        }

        public final void a(d.h hVar) {
            ThreadPoolExecutor a10 = b.a("EmojiCompatInitializer");
            a10.execute(new e(this, hVar, a10));
        }
    }

    public static class c implements Runnable {
        public final void run() {
            try {
                int i = i.f6985a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (d.c()) {
                    d.a().e();
                }
                Trace.endSection();
            } catch (Throwable th2) {
                int i10 = i.f6985a;
                Trace.endSection();
                throw th2;
            }
        }
    }

    public final List<Class<? extends n1.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        a aVar = new a(context);
        if (d.f1699j == null) {
            synchronized (d.i) {
                if (d.f1699j == null) {
                    d.f1699j = new d(aVar);
                }
            }
        }
        n1.a b10 = n1.a.b(context);
        Objects.requireNonNull(b10);
        final r lifecycle = ((a0) b10.a(ProcessLifecycleInitializer.class, new HashSet())).getLifecycle();
        lifecycle.a(new o() {
            public final /* synthetic */ void a(a0 a0Var) {
            }

            public final /* synthetic */ void b() {
            }

            public final /* synthetic */ void d() {
            }

            public final void e() {
                Objects.requireNonNull(EmojiCompatInitializer.this);
                b.b().postDelayed(new c(), 500);
                lifecycle.c(this);
            }

            public final /* synthetic */ void g() {
            }

            public final /* synthetic */ void onStop() {
            }
        });
    }
}
