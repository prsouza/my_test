package n0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import net.jpountz.lz4.LZ4FrameOutputStream;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f8826a;

    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Window f8827a;

        public a(Window window) {
            this.f8827a = window;
        }
    }

    public static class b extends a {
        public b(Window window, View view) {
            super(window);
        }

        public final void b(boolean z) {
            if (z) {
                this.f8827a.clearFlags(67108864);
                this.f8827a.addFlags(LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
                View decorView = this.f8827a.getDecorView();
                decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
                return;
            }
            View decorView2 = this.f8827a.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
    }

    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        public final void a(boolean z) {
            if (z) {
                this.f8827a.clearFlags(134217728);
                this.f8827a.addFlags(LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
                View decorView = this.f8827a.getDecorView();
                decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
                return;
            }
            View decorView2 = this.f8827a.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
    }

    public static class e {
        public void a(boolean z) {
        }

        public void b(boolean z) {
        }
    }

    public f0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f8826a = new d(windowInsetsController);
        } else {
            this.f8826a = new e();
        }
    }

    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsController f8828a;

        /* renamed from: b  reason: collision with root package name */
        public Window f8829b;

        public d(Window window) {
            this.f8828a = window.getInsetsController();
            this.f8829b = window;
        }

        public final void a(boolean z) {
            if (z) {
                this.f8828a.setSystemBarsAppearance(16, 16);
            } else {
                this.f8828a.setSystemBarsAppearance(0, 16);
            }
        }

        public final void b(boolean z) {
            if (z) {
                Window window = this.f8829b;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -8193);
                }
                this.f8828a.setSystemBarsAppearance(8, 8);
                return;
            }
            this.f8828a.setSystemBarsAppearance(0, 8);
        }

        public d(WindowInsetsController windowInsetsController) {
            this.f8828a = windowInsetsController;
        }
    }

    public f0(Window window, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f8826a = new d(window);
        } else if (i >= 26) {
            this.f8826a = new c(window, view);
        } else {
            this.f8826a = new b(window, view);
        }
    }
}
