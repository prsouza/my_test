package k5;

import android.view.View;
import z5.e;

public final class b extends e {

    @Deprecated
    public interface a extends e.a {
    }

    @Deprecated
    /* renamed from: k5.b$b  reason: collision with other inner class name */
    public interface C0131b extends e.b {
    }

    public int getMaxItemCount() {
        return 5;
    }

    public final void onMeasure(int i, int i10) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i10) != 1073741824 && suggestedMinimumHeight > 0) {
            int paddingTop = getPaddingTop();
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), getPaddingBottom() + paddingTop + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i10);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        a aVar = (a) getMenuView();
        if (aVar.G != z) {
            aVar.setItemHorizontalTranslationEnabled(z);
            getPresenter();
            throw null;
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(C0131b bVar) {
        setOnItemSelectedListener(bVar);
    }
}
