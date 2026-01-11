package x8;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f13047a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f13048b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13049c;

    public /* synthetic */ h(j jVar, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f13047a = jVar;
        this.f13048b = intent;
        this.f13049c = taskCompletionSource;
    }

    public final void run() {
        j jVar = this.f13047a;
        Intent intent = this.f13048b;
        TaskCompletionSource taskCompletionSource = this.f13049c;
        Objects.requireNonNull(jVar);
        try {
            jVar.c(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }
}
