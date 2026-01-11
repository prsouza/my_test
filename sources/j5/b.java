package j5;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Objects;

public final class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7051a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f7052b;

    public class a extends FloatingActionButton.a {
        public a() {
        }

        public final void b() {
            BottomAppBar bottomAppBar = b.this.f7052b;
            int i = BottomAppBar.f3672q0;
            Objects.requireNonNull(bottomAppBar);
        }
    }

    public b(BottomAppBar bottomAppBar, int i) {
        this.f7052b = bottomAppBar;
        this.f7051a = i;
    }

    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f7052b.z(this.f7051a));
        floatingActionButton.m(new a(), true);
    }
}
