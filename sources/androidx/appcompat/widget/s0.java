package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;

public final class s0 extends q0 implements r0 {
    public static Method S;
    public r0 R;

    public static class a extends l0 {
        public final int C;
        public final int D;
        public r0 E;
        public g F;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.C = 21;
                this.D = 22;
                return;
            }
            this.C = 22;
            this.D = 21;
        }

        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            d dVar;
            int pointToPosition;
            int i10;
            if (this.E != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    dVar = (d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    dVar = (d) adapter;
                }
                g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i10 = pointToPosition - i) >= 0 && i10 < dVar.getCount()) {
                    gVar = dVar.getItem(i10);
                }
                g gVar2 = this.F;
                if (gVar2 != gVar) {
                    e eVar = dVar.f916a;
                    if (gVar2 != null) {
                        this.E.e(eVar, gVar2);
                    }
                    this.F = gVar;
                    if (gVar != null) {
                        this.E.a(eVar, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            d dVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.C) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.D) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    dVar = (d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    dVar = (d) adapter;
                }
                dVar.f916a.d(false);
                return true;
            }
        }

        public void setHoverListener(r0 r0Var) {
            this.E = r0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                S = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public s0(Context context, int i, int i10) {
        super(context, (AttributeSet) null, i, i10);
    }

    public final void a(e eVar, MenuItem menuItem) {
        r0 r0Var = this.R;
        if (r0Var != null) {
            r0Var.a(eVar, menuItem);
        }
    }

    public final void e(e eVar, MenuItem menuItem) {
        r0 r0Var = this.R;
        if (r0Var != null) {
            r0Var.e(eVar, menuItem);
        }
    }

    public final l0 q(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    public final void v() {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = S;
            if (method != null) {
                try {
                    method.invoke(this.N, new Object[]{Boolean.FALSE});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.N.setTouchModal(false);
        }
    }
}
