package l6;

import java.util.Objects;
import n6.a;

public final /* synthetic */ class l1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m1 f7920a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7921b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7922c;

    public /* synthetic */ l1(m1 m1Var, int i, String str) {
        this.f7920a = m1Var;
        this.f7921b = i;
        this.f7922c = str;
    }

    public final void run() {
        m1 m1Var = this.f7920a;
        int i = this.f7921b;
        String str = this.f7922c;
        Objects.requireNonNull(m1Var);
        try {
            m1Var.g(i, str);
        } catch (a e10) {
            m1.g.g("notifyModuleCompleted failed", e10);
        }
    }
}
