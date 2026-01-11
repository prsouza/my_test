package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.actions.SearchIntents;
import io.nodle.cash.R;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;
import net.jpountz.lz4.LZ4BlockOutputStream;

public class SearchView extends o0 implements m.b {
    public static final n F0 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    public g A0;
    public final h B0;
    public final i C0;
    public final j D0;
    public final SearchAutoComplete E;
    public a E0;
    public final View F;
    public final View G;
    public final View H;
    public final ImageView I;
    public final ImageView J;
    public final ImageView K;
    public final ImageView L;
    public final View M;
    public p N;
    public Rect O;
    public Rect P;
    public int[] Q;
    public int[] R;
    public final ImageView S;
    public final Drawable T;
    public final int U;
    public final int V;
    public final Intent W;

    /* renamed from: a0  reason: collision with root package name */
    public final Intent f1041a0;
    public final CharSequence b0;

    /* renamed from: c0  reason: collision with root package name */
    public l f1042c0;

    /* renamed from: d0  reason: collision with root package name */
    public k f1043d0;

    /* renamed from: e0  reason: collision with root package name */
    public View.OnFocusChangeListener f1044e0;

    /* renamed from: f0  reason: collision with root package name */
    public m f1045f0;

    /* renamed from: g0  reason: collision with root package name */
    public View.OnClickListener f1046g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1047h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1048i0;

    /* renamed from: j0  reason: collision with root package name */
    public r0.a f1049j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f1050k0;

    /* renamed from: l0  reason: collision with root package name */
    public CharSequence f1051l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f1052m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f1053n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f1054o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f1055p0;

    /* renamed from: q0  reason: collision with root package name */
    public String f1056q0;

    /* renamed from: r0  reason: collision with root package name */
    public CharSequence f1057r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f1058s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f1059t0;

    /* renamed from: u0  reason: collision with root package name */
    public SearchableInfo f1060u0;

    /* renamed from: v0  reason: collision with root package name */
    public Bundle f1061v0;

    /* renamed from: w0  reason: collision with root package name */
    public final b f1062w0;

    /* renamed from: x0  reason: collision with root package name */
    public c f1063x0;

    /* renamed from: y0  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1064y0;
    public final f z0;

    public static class SearchAutoComplete extends e {

        /* renamed from: t  reason: collision with root package name */
        public int f1065t = getThreshold();

        /* renamed from: u  reason: collision with root package name */
        public SearchView f1066u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f1067v;

        /* renamed from: w  reason: collision with root package name */
        public final a f1068w = new a();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f1067v) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f1067v = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i10 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            n nVar = SearchView.F0;
            Objects.requireNonNull(nVar);
            n.a();
            Method method = nVar.f1082c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public final boolean enoughToFilter() {
            return this.f1065t <= 0 || super.enoughToFilter();
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1067v) {
                removeCallbacks(this.f1068w);
                post(this.f1068w);
            }
            return onCreateInputConnection;
        }

        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f1066u;
            searchView.z(searchView.f1048i0);
            searchView.post(searchView.f1062w0);
            if (searchView.E.hasFocus()) {
                searchView.n();
            }
        }

        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1066u.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1066u.hasFocus() && getVisibility() == 0) {
                boolean z10 = true;
                this.f1067v = true;
                Context context = getContext();
                n nVar = SearchView.F0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z10 = false;
                }
                if (z10) {
                    a();
                }
            }
        }

        public final void performCompletion() {
        }

        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1067v = false;
                removeCallbacks(this.f1068w);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1067v = false;
                removeCallbacks(this.f1068w);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1067v = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1066u = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1065t = i;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.E.getText();
            searchView.f1057r0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.y(z);
            searchView.A(!z);
            searchView.u();
            searchView.x();
            if (searchView.f1042c0 != null && !TextUtils.equals(charSequence, searchView.f1056q0)) {
                l lVar = searchView.f1042c0;
                charSequence.toString();
                lVar.a();
            }
            searchView.f1056q0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            SearchView.this.v();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            r0.a aVar = SearchView.this.f1049j0;
            if (aVar instanceof x0) {
                aVar.c((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public final void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1044e0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            int i17;
            int i18;
            SearchView searchView = SearchView.this;
            if (searchView.M.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.G.getPaddingLeft();
                Rect rect = new Rect();
                boolean b10 = k1.b(searchView);
                if (searchView.f1047h0) {
                    i17 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    i17 = 0;
                }
                searchView.E.getDropDownBackground().getPadding(rect);
                if (b10) {
                    i18 = -rect.left;
                } else {
                    i18 = paddingLeft - (rect.left + i17);
                }
                searchView.E.setDropDownHorizontalOffset(i18);
                searchView.E.setDropDownWidth((((searchView.M.getWidth() + rect.left) + rect.right) + i17) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public final void onClick(View view) {
            String str;
            SearchView searchView = SearchView.this;
            if (view == searchView.I) {
                searchView.s();
            } else if (view == searchView.K) {
                searchView.o();
            } else if (view == searchView.J) {
                searchView.t();
            } else if (view == searchView.L) {
                SearchableInfo searchableInfo = searchView.f1060u0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.W);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                str = null;
                            } else {
                                str = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", str);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.m(searchView.f1041a0, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.E) {
                searchView.n();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            int i10;
            SearchView searchView = SearchView.this;
            if (searchView.f1060u0 == null) {
                return false;
            }
            if (!searchView.E.isPopupShowing() || SearchView.this.E.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.E.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.getContext().startActivity(searchView2.l("android.intent.action.SEARCH", (Uri) null, (String) null, searchView2.E.getText().toString()));
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.f1060u0 == null || searchView3.f1049j0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                return searchView3.p(searchView3.E.getListSelection());
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i10 = 0;
                } else {
                    i10 = searchView3.E.length();
                }
                searchView3.E.setSelection(i10);
                searchView3.E.setListSelection(0);
                searchView3.E.clearListSelection();
                searchView3.E.a();
                return true;
            } else if (i != 19) {
                return false;
            } else {
                searchView3.E.getListSelection();
                return false;
            }
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.t();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j10) {
            SearchView.this.p(i);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j10) {
            SearchView.this.q(i);
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a();

        boolean b();
    }

    public interface m {
        boolean a();

        boolean b();
    }

    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public Method f1080a = null;

        /* renamed from: b  reason: collision with root package name */
        public Method f1081b = null;

        /* renamed from: c  reason: collision with root package name */
        public Method f1082c = null;

        public n() {
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1080a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1081b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1082c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class o extends s0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f1083c;

        public class a implements Parcelable.ClassLoaderCreator<o> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new o[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new o(parcel, (ClassLoader) null);
            }
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("SearchView.SavedState{");
            d10.append(Integer.toHexString(System.identityHashCode(this)));
            d10.append(" isIconified=");
            d10.append(this.f1083c);
            d10.append("}");
            return d10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            parcel.writeValue(Boolean.valueOf(this.f1083c));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1083c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f1084a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1085b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final Rect f1086c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        public final Rect f1087d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        public final int f1088e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1089f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1088e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f1084a = view;
        }

        public final void a(Rect rect, Rect rect2) {
            this.f1085b.set(rect);
            this.f1087d.set(rect);
            Rect rect3 = this.f1087d;
            int i = this.f1088e;
            rect3.inset(-i, -i);
            this.f1086c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0033
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f1089f
                r8.f1089f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f1089f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f1087d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = r5
                goto L_0x0041
            L_0x002f:
                r7 = r4
                r4 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f1085b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f1089f = r4
                r2 = r4
                goto L_0x0041
            L_0x003f:
                r2 = r4
                r4 = r5
            L_0x0041:
                if (r4 == 0) goto L_0x0074
                if (r2 == 0) goto L_0x0061
                android.graphics.Rect r2 = r8.f1086c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0061
                android.view.View r0 = r8.f1084a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f1084a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006e
            L_0x0061:
                android.graphics.Rect r2 = r8.f1086c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L_0x006e:
                android.view.View r0 = r8.f1084a
                boolean r5 = r0.dispatchTouchEvent(r9)
            L_0x0074:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.E.setText(charSequence);
        this.E.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void A(boolean z) {
        int i10 = 8;
        if (this.f1055p0 && !this.f1048i0 && z) {
            this.J.setVisibility(8);
            i10 = 0;
        }
        this.L.setVisibility(i10);
    }

    public final void c() {
        if (!this.f1058s0) {
            this.f1058s0 = true;
            int imeOptions = this.E.getImeOptions();
            this.f1059t0 = imeOptions;
            this.E.setImeOptions(imeOptions | LZ4BlockOutputStream.MAX_BLOCK_SIZE);
            this.E.setText(BuildConfig.FLAVOR);
            setIconified(false);
        }
    }

    public final void clearFocus() {
        this.f1053n0 = true;
        super.clearFocus();
        this.E.clearFocus();
        this.E.setImeVisibility(false);
        this.f1053n0 = false;
    }

    public final void e() {
        this.E.setText(BuildConfig.FLAVOR);
        SearchAutoComplete searchAutoComplete = this.E;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1057r0 = BuildConfig.FLAVOR;
        clearFocus();
        z(true);
        this.E.setImeOptions(this.f1059t0);
        this.f1058s0 = false;
    }

    public int getImeOptions() {
        return this.E.getImeOptions();
    }

    public int getInputType() {
        return this.E.getInputType();
    }

    public int getMaxWidth() {
        return this.f1054o0;
    }

    public CharSequence getQuery() {
        return this.E.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1051l0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1060u0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.b0;
        }
        return getContext().getText(this.f1060u0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.V;
    }

    public int getSuggestionRowLayout() {
        return this.U;
    }

    public r0.a getSuggestionsAdapter() {
        return this.f1049j0;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1057r0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1061v0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1060u0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1061v0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i10 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.E.refreshAutoCompleteResults();
            return;
        }
        n nVar = F0;
        SearchAutoComplete searchAutoComplete = this.E;
        Objects.requireNonNull(nVar);
        n.a();
        Method method = nVar.f1080a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        n nVar2 = F0;
        SearchAutoComplete searchAutoComplete2 = this.E;
        Objects.requireNonNull(nVar2);
        n.a();
        Method method2 = nVar2.f1081b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        if (!TextUtils.isEmpty(this.E.getText())) {
            this.E.setText(BuildConfig.FLAVOR);
            this.E.requestFocus();
            this.E.setImeVisibility(true);
        } else if (this.f1047h0) {
            k kVar = this.f1043d0;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                z(true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1062w0);
        post(this.f1063x0);
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z, int i10, int i11, int i12, int i13) {
        super.onLayout(z, i10, i11, i12, i13);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.E;
            Rect rect = this.O;
            searchAutoComplete.getLocationInWindow(this.Q);
            getLocationInWindow(this.R);
            int[] iArr = this.Q;
            int i14 = iArr[1];
            int[] iArr2 = this.R;
            int i15 = i14 - iArr2[1];
            int i16 = iArr[0] - iArr2[0];
            rect.set(i16, i15, searchAutoComplete.getWidth() + i16, searchAutoComplete.getHeight() + i15);
            Rect rect2 = this.P;
            Rect rect3 = this.O;
            rect2.set(rect3.left, 0, rect3.right, i13 - i11);
            p pVar = this.N;
            if (pVar == null) {
                p pVar2 = new p(this.P, this.O, this.E);
                this.N = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.P, this.O);
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f1048i0) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f1054o0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1054o0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f1054o0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.f10849a);
        z(oVar.f1083c);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f1083c = this.f1048i0;
        return oVar;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f1062w0);
    }

    public final boolean p(int i10) {
        int i11;
        Uri uri;
        String i12;
        m mVar = this.f1045f0;
        if (mVar != null && mVar.a()) {
            return false;
        }
        Cursor cursor = this.f1049j0.f10506c;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i13 = x0.N;
                String i14 = x0.i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (i14 == null) {
                    i14 = this.f1060u0.getSuggestIntentAction();
                }
                if (i14 == null) {
                    i14 = "android.intent.action.SEARCH";
                }
                String i15 = x0.i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (i15 == null) {
                    i15 = this.f1060u0.getSuggestIntentData();
                }
                if (!(i15 == null || (i12 = x0.i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    i15 = i15 + "/" + Uri.encode(i12);
                }
                if (i15 == null) {
                    uri = null;
                } else {
                    uri = Uri.parse(i15);
                }
                intent = l(i14, uri, x0.i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), x0.i(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        this.E.setImeVisibility(false);
        this.E.dismissDropDown();
        return true;
    }

    public final boolean q(int i10) {
        m mVar = this.f1045f0;
        if (mVar != null && mVar.b()) {
            return false;
        }
        Editable text = this.E.getText();
        Cursor cursor = this.f1049j0.f10506c;
        if (cursor == null) {
            return true;
        }
        if (cursor.moveToPosition(i10)) {
            CharSequence d10 = this.f1049j0.d(cursor);
            if (d10 != null) {
                setQuery(d10);
                return true;
            }
            setQuery(text);
            return true;
        }
        setQuery(text);
        return true;
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f1053n0 || !isFocusable()) {
            return false;
        }
        if (this.f1048i0) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.E.requestFocus(i10, rect);
        if (requestFocus) {
            z(false);
        }
        return requestFocus;
    }

    public final void s() {
        z(false);
        this.E.requestFocus();
        this.E.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1046g0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1061v0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            o();
        } else {
            s();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1047h0 != z) {
            this.f1047h0 = z;
            z(z);
            w();
        }
    }

    public void setImeOptions(int i10) {
        this.E.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.E.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1054o0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.f1043d0 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1044e0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.f1042c0 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1046g0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.f1045f0 = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1051l0 = charSequence;
        w();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1052m0 = z;
        r0.a aVar = this.f1049j0;
        if (aVar instanceof x0) {
            ((x0) aVar).F = z ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, net.jpountz.lz4.LZ4Constants.MAX_DISTANCE) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f1060u0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.E
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.E
            android.app.SearchableInfo r3 = r6.f1060u0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f1060u0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f1060u0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.E
            r3.setInputType(r7)
            r0.a r7 = r6.f1049j0
            if (r7 == 0) goto L_0x0042
            r7.c(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.f1060u0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            androidx.appcompat.widget.x0 r7 = new androidx.appcompat.widget.x0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f1060u0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f1064y0
            r7.<init>(r3, r6, r4, r5)
            r6.f1049j0 = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.E
            r3.setAdapter(r7)
            r0.a r7 = r6.f1049j0
            androidx.appcompat.widget.x0 r7 = (androidx.appcompat.widget.x0) r7
            boolean r3 = r6.f1052m0
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = r0
        L_0x0069:
            r7.F = r3
        L_0x006b:
            r6.w()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.f1060u0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.f1060u0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.W
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.f1060u0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.f1041a0
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = r3
        L_0x00a0:
            r6.f1055p0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.E
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.f1048i0
            r6.z(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1050k0 = z;
        z(this.f1048i0);
    }

    public void setSuggestionsAdapter(r0.a aVar) {
        this.f1049j0 = aVar;
        this.E.setAdapter(aVar);
    }

    public final void t() {
        Editable text = this.E.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            l lVar = this.f1042c0;
            if (lVar != null) {
                text.toString();
                if (lVar.b()) {
                    return;
                }
            }
            if (this.f1060u0 != null) {
                getContext().startActivity(l("android.intent.action.SEARCH", (Uri) null, (String) null, text.toString()));
            }
            this.E.setImeVisibility(false);
            this.E.dismissDropDown();
        }
    }

    public final void u() {
        boolean z = true;
        boolean z10 = !TextUtils.isEmpty(this.E.getText());
        int i10 = 0;
        if (!z10 && (!this.f1047h0 || this.f1058s0)) {
            z = false;
        }
        ImageView imageView = this.K;
        if (!z) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.K.getDrawable();
        if (drawable != null) {
            drawable.setState(z10 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void v() {
        int[] iArr = this.E.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.G.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.H.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void w() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.E;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        if (this.f1047h0 && this.T != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.T.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.T), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void x() {
        int i10 = 0;
        if (!((this.f1050k0 || this.f1055p0) && !this.f1048i0) || !(this.J.getVisibility() == 0 || this.L.getVisibility() == 0)) {
            i10 = 8;
        }
        this.H.setVisibility(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.f1055p0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f1050k0
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f1055p0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.f1048i0
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f1055p0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.J
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.y(boolean):void");
    }

    public final void z(boolean z) {
        this.f1048i0 = z;
        int i10 = 0;
        int i11 = z ? 0 : 8;
        boolean z10 = !TextUtils.isEmpty(this.E.getText());
        this.I.setVisibility(i11);
        y(z10);
        this.F.setVisibility(z ? 8 : 0);
        if (this.S.getDrawable() == null || this.f1047h0) {
            i10 = 8;
        }
        this.S.setVisibility(i10);
        u();
        A(!z10);
        x();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Context context2 = context;
        this.O = new Rect();
        this.P = new Rect();
        this.Q = new int[2];
        this.R = new int[2];
        this.f1062w0 = new b();
        this.f1063x0 = new c();
        this.f1064y0 = new WeakHashMap<>();
        f fVar = new f();
        this.z0 = fVar;
        this.A0 = new g();
        h hVar = new h();
        this.B0 = hVar;
        i iVar = new i();
        this.C0 = iVar;
        j jVar = new j();
        this.D0 = jVar;
        this.E0 = new a();
        int[] iArr = ad.c.O;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i11, 0);
        d1 d1Var = new d1(context2, obtainStyledAttributes);
        x.o(this, context, iArr, attributeSet2, obtainStyledAttributes, i11);
        LayoutInflater.from(context).inflate(d1Var.l(9, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.E = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.F = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.G = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.H = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.I = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.J = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.K = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.L = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.S = imageView5;
        x.d.q(findViewById, d1Var.g(10));
        x.d.q(findViewById2, d1Var.g(14));
        imageView.setImageDrawable(d1Var.g(13));
        imageView2.setImageDrawable(d1Var.g(7));
        imageView3.setImageDrawable(d1Var.g(4));
        imageView4.setImageDrawable(d1Var.g(16));
        imageView5.setImageDrawable(d1Var.g(13));
        this.T = d1Var.g(12);
        g1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.U = d1Var.l(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.V = d1Var.l(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.E0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.A0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(d1Var.a(8, true));
        int f10 = d1Var.f(1, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.b0 = d1Var.n(6);
        this.f1051l0 = d1Var.n(11);
        int j10 = d1Var.j(3, -1);
        if (j10 != -1) {
            setImeOptions(j10);
        }
        int j11 = d1Var.j(2, -1);
        if (j11 != -1) {
            setInputType(j11);
        }
        setFocusable(d1Var.a(0, true));
        d1Var.r();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.W = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1041a0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.M = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        z(this.f1047h0);
        w();
    }
}
