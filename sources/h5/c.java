package h5;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;

public final class c {
    public static void a(a aVar, View view) {
        c(aVar, view);
        if (aVar.d() != null) {
            aVar.d().setForeground(aVar);
        } else {
            view.getOverlay().add(aVar);
        }
    }

    public static void b(a aVar, View view) {
        if (aVar != null) {
            if (aVar.d() != null) {
                aVar.d().setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(aVar);
            }
        }
    }

    public static void c(a aVar, View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.g(view, (FrameLayout) null);
    }
}
