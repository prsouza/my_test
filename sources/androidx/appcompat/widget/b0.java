package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class b0 extends Spinner {

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f1154x = {16843505};

    /* renamed from: a  reason: collision with root package name */
    public final f f1155a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1156b;

    /* renamed from: c  reason: collision with root package name */
    public a0 f1157c;

    /* renamed from: s  reason: collision with root package name */
    public SpinnerAdapter f1158s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f1159t;

    /* renamed from: u  reason: collision with root package name */
    public f f1160u;

    /* renamed from: v  reason: collision with root package name */
    public int f1161v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f1162w = new Rect();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            if (!b0.this.getInternalPopup().b()) {
                b0.this.b();
            }
            ViewTreeObserver viewTreeObserver = b0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public class b implements f, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.app.b f1164a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f1165b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f1166c;

        public b() {
        }

        public final boolean b() {
            androidx.appcompat.app.b bVar = this.f1164a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        public final int c() {
            return 0;
        }

        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.f1164a;
            if (bVar != null) {
                bVar.dismiss();
                this.f1164a = null;
            }
        }

        public final Drawable f() {
            return null;
        }

        public final void h(CharSequence charSequence) {
            this.f1166c = charSequence;
        }

        public final void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public final void j(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public final void k(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public final void l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public final void m(int i, int i10) {
            if (this.f1165b != null) {
                b.a aVar = new b.a(b0.this.getPopupContext());
                CharSequence charSequence = this.f1166c;
                if (charSequence != null) {
                    aVar.f861a.f846d = charSequence;
                }
                ListAdapter listAdapter = this.f1165b;
                int selectedItemPosition = b0.this.getSelectedItemPosition();
                AlertController.b bVar = aVar.f861a;
                bVar.f853m = listAdapter;
                bVar.f854n = this;
                bVar.f856p = selectedItemPosition;
                bVar.f855o = true;
                androidx.appcompat.app.b a10 = aVar.a();
                this.f1164a = a10;
                AlertController.RecycleListView recycleListView = a10.f860c.g;
                recycleListView.setTextDirection(i);
                recycleListView.setTextAlignment(i10);
                this.f1164a.show();
            }
        }

        public final int n() {
            return 0;
        }

        public final CharSequence o() {
            return this.f1166c;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            b0.this.setSelection(i);
            if (b0.this.getOnItemClickListener() != null) {
                b0.this.performItemClick((View) null, i, this.f1165b.getItemId(i));
            }
            androidx.appcompat.app.b bVar = this.f1164a;
            if (bVar != null) {
                bVar.dismiss();
                this.f1164a = null;
            }
        }

        public final void p(ListAdapter listAdapter) {
            this.f1165b = listAdapter;
        }
    }

    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public SpinnerAdapter f1168a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f1169b;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1168a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1169b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof z0) {
                z0 z0Var = (z0) spinnerAdapter;
                if (z0Var.getDropDownViewTheme() == null) {
                    z0Var.a();
                }
            }
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1169b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1168a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1168a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1168a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1168a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public final int getItemViewType(int i) {
            return 0;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1168a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public final boolean isEmpty() {
            return getCount() == 0;
        }

        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1169b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1168a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1168a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class d extends q0 implements f {
        public CharSequence R;
        public ListAdapter S;
        public final Rect T = new Rect();
        public int U;

        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j10) {
                b0.this.setSelection(i);
                if (b0.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    b0.this.performItemClick(view, i, dVar.S.getItemId(i));
                }
                d.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public final void onGlobalLayout() {
                d dVar = d.this;
                b0 b0Var = b0.this;
                Objects.requireNonNull(dVar);
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                if (!(x.g.b(b0Var) && b0Var.getGlobalVisibleRect(dVar.T))) {
                    d.this.dismiss();
                    return;
                }
                d.this.v();
                d.this.d();
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1172a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1172a = onGlobalLayoutListener;
            }

            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = b0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1172a);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.D = b0.this;
            t();
            this.E = new a();
        }

        public final void h(CharSequence charSequence) {
            this.R = charSequence;
        }

        public final void k(int i) {
            this.U = i;
        }

        public final void m(int i, int i10) {
            ViewTreeObserver viewTreeObserver;
            boolean b10 = b();
            v();
            s();
            d();
            l0 l0Var = this.f1371c;
            l0Var.setChoiceMode(1);
            l0Var.setTextDirection(i);
            l0Var.setTextAlignment(i10);
            int selectedItemPosition = b0.this.getSelectedItemPosition();
            l0 l0Var2 = this.f1371c;
            if (b() && l0Var2 != null) {
                l0Var2.setListSelectionHidden(false);
                l0Var2.setSelection(selectedItemPosition);
                if (l0Var2.getChoiceMode() != 0) {
                    l0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!b10 && (viewTreeObserver = b0.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                u(new c(bVar));
            }
        }

        public final CharSequence o() {
            return this.R;
        }

        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.S = listAdapter;
        }

        public final void v() {
            int i;
            int i10;
            Drawable f10 = f();
            int i11 = 0;
            if (f10 != null) {
                f10.getPadding(b0.this.f1162w);
                if (k1.b(b0.this)) {
                    i10 = b0.this.f1162w.right;
                } else {
                    i10 = -b0.this.f1162w.left;
                }
                i11 = i10;
            } else {
                Rect rect = b0.this.f1162w;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = b0.this.getPaddingLeft();
            int paddingRight = b0.this.getPaddingRight();
            int width = b0.this.getWidth();
            b0 b0Var = b0.this;
            int i12 = b0Var.f1161v;
            if (i12 == -2) {
                int a10 = b0Var.a((SpinnerAdapter) this.S, f());
                int i13 = b0.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = b0.this.f1162w;
                int i14 = (i13 - rect2.left) - rect2.right;
                if (a10 > i14) {
                    a10 = i14;
                }
                r(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i12 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i12);
            }
            if (k1.b(b0.this)) {
                i = (((width - paddingRight) - this.f1373t) - this.U) + i11;
            } else {
                i = paddingLeft + this.U + i11;
            }
            this.f1374u = i;
        }
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public boolean f1174a;

        public class a implements Parcelable.Creator<e> {
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public final Object[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1174a ? (byte) 1 : 0);
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f1174a = parcel.readByte() != 0;
        }
    }

    public interface f {
        boolean b();

        int c();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i);

        void k(int i);

        void l(int i);

        void m(int i, int i10);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r4 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b0(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f1162w = r0
            android.content.Context r0 = r9.getContext()
            androidx.appcompat.widget.y0.a(r9, r0)
            int[] r0 = ad.c.P
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            androidx.appcompat.widget.f r2 = new androidx.appcompat.widget.f
            r2.<init>(r9)
            r9.f1155a = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L_0x002e
            m.c r3 = new m.c
            r3.<init>((android.content.Context) r10, (int) r2)
            r9.f1156b = r3
            goto L_0x0030
        L_0x002e:
            r9.f1156b = r10
        L_0x0030:
            r2 = 0
            r3 = -1
            int[] r4 = f1154x     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            boolean r5 = r4.hasValue(r1)     // Catch:{ Exception -> 0x0047 }
            if (r5 == 0) goto L_0x0058
            int r3 = r4.getInt(r1, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0058
        L_0x0043:
            r10 = move-exception
            r2 = r4
            goto L_0x00cd
        L_0x0047:
            r5 = move-exception
            goto L_0x004f
        L_0x0049:
            r10 = move-exception
            goto L_0x00cd
        L_0x004c:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L_0x004f:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x005b
        L_0x0058:
            r4.recycle()
        L_0x005b:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0095
            if (r3 == r5) goto L_0x0062
            goto L_0x00a2
        L_0x0062:
            androidx.appcompat.widget.b0$d r3 = new androidx.appcompat.widget.b0$d
            android.content.Context r6 = r9.f1156b
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.f1156b
            int[] r7 = ad.c.P
            androidx.appcompat.widget.d1 r6 = androidx.appcompat.widget.d1.q(r6, r11, r7, r12)
            r7 = 3
            r8 = -2
            int r7 = r6.k(r7, r8)
            r9.f1161v = r7
            android.graphics.drawable.Drawable r7 = r6.g(r5)
            androidx.appcompat.widget.t r8 = r3.N
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.R = r4
            r6.r()
            r9.f1160u = r3
            androidx.appcompat.widget.a0 r4 = new androidx.appcompat.widget.a0
            r4.<init>(r9, r9, r3)
            r9.f1157c = r4
            goto L_0x00a2
        L_0x0095:
            androidx.appcompat.widget.b0$b r3 = new androidx.appcompat.widget.b0$b
            r3.<init>()
            r9.f1160u = r3
            java.lang.String r4 = r0.getString(r4)
            r3.f1166c = r4
        L_0x00a2:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto L_0x00b9
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131427508(0x7f0b00b4, float:1.8476634E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00b9:
            r0.recycle()
            r9.f1159t = r5
            android.widget.SpinnerAdapter r10 = r9.f1158s
            if (r10 == 0) goto L_0x00c7
            r9.setAdapter((android.widget.SpinnerAdapter) r10)
            r9.f1158s = r2
        L_0x00c7:
            androidx.appcompat.widget.f r10 = r9.f1155a
            r10.d(r11, r12)
            return
        L_0x00cd:
            if (r2 == 0) goto L_0x00d2
            r2.recycle()
        L_0x00d2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i10 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i10;
        }
        drawable.getPadding(this.f1162w);
        Rect rect = this.f1162w;
        return i10 + rect.left + rect.right;
    }

    public final void b() {
        this.f1160u.m(getTextDirection(), getTextAlignment());
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1155a;
        if (fVar != null) {
            fVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        f fVar = this.f1160u;
        if (fVar != null) {
            return fVar.c();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        f fVar = this.f1160u;
        if (fVar != null) {
            return fVar.n();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f1160u != null) {
            return this.f1161v;
        }
        return super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f1160u;
    }

    public Drawable getPopupBackground() {
        f fVar = this.f1160u;
        if (fVar != null) {
            return fVar.f();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f1156b;
    }

    public CharSequence getPrompt() {
        f fVar = this.f1160u;
        return fVar != null ? fVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1155a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1155a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f1160u;
        if (fVar != null && fVar.b()) {
            this.f1160u.dismiss();
        }
    }

    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        if (this.f1160u != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (eVar.f1174a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public final Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.f1160u;
        eVar.f1174a = fVar != null && fVar.b();
        return eVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a0 a0Var = this.f1157c;
        if (a0Var == null || !a0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        f fVar = this.f1160u;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.b()) {
            return true;
        }
        b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1155a;
        if (fVar != null) {
            fVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f1155a;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        f fVar = this.f1160u;
        if (fVar != null) {
            fVar.k(i);
            this.f1160u.l(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        f fVar = this.f1160u;
        if (fVar != null) {
            fVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1160u != null) {
            this.f1161v = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f1160u;
        if (fVar != null) {
            fVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(a.b.a0(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f1160u;
        if (fVar != null) {
            fVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f1155a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1155a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1159t) {
            this.f1158s = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1160u != null) {
            Context context = this.f1156b;
            if (context == null) {
                context = getContext();
            }
            this.f1160u.p(new c(spinnerAdapter, context.getTheme()));
        }
    }
}
