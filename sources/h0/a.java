package h0;

import android.graphics.drawable.Drawable;

public final class a {
    public static <T extends Drawable> T a(Drawable drawable) {
        return drawable instanceof b ? ((b) drawable).b() : drawable;
    }
}
