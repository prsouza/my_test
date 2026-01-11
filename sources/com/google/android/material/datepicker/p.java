package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.n;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import e6.f;
import e6.i;
import io.nodle.cash.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n0.a0;
import n0.d0;
import n0.f0;
import n0.x;

public final class p<S> extends n {
    public static final /* synthetic */ int L = 0;
    public boolean A;
    public int B;
    public int C;
    public CharSequence D;
    public int E;
    public CharSequence F;
    public TextView G;
    public CheckableImageButton H;
    public f I;
    public Button J;
    public boolean K;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<s<? super S>> f3874a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f3875b = new LinkedHashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f3876c = new LinkedHashSet<>();

    /* renamed from: s  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f3877s = new LinkedHashSet<>();

    /* renamed from: t  reason: collision with root package name */
    public int f3878t;

    /* renamed from: u  reason: collision with root package name */
    public d<S> f3879u;

    /* renamed from: v  reason: collision with root package name */
    public z<S> f3880v;

    /* renamed from: w  reason: collision with root package name */
    public a f3881w;

    /* renamed from: x  reason: collision with root package name */
    public h<S> f3882x;

    /* renamed from: y  reason: collision with root package name */
    public int f3883y;
    public CharSequence z;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            Iterator<s<? super S>> it = p.this.f3874a.iterator();
            while (it.hasNext()) {
                p.this.b().S();
                it.next().a();
            }
            p.this.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public final void onClick(View view) {
            Iterator<View.OnClickListener> it = p.this.f3875b.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            p.this.dismiss();
        }
    }

    public class c extends y<S> {
        public c() {
        }

        public final void a(S s10) {
            p pVar = p.this;
            int i = p.L;
            pVar.g();
            p pVar2 = p.this;
            pVar2.J.setEnabled(pVar2.b().E());
        }
    }

    public static int c(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d10 = d0.d();
        d10.set(5, 1);
        Calendar b10 = d0.b(d10);
        b10.get(2);
        b10.get(1);
        int maximum = b10.getMaximum(7);
        b10.getActualMaximum(5);
        b10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean d(Context context) {
        return e(context, 16843277);
    }

    public static boolean e(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b6.b.b(context, R.attr.materialCalendarStyle, h.class.getCanonicalName()), new int[]{i});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public final d<S> b() {
        if (this.f3879u == null) {
            this.f3879u = (d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f3879u;
    }

    public final void f() {
        z<S> zVar;
        requireContext();
        int i = this.f3878t;
        if (i == 0) {
            i = b().t();
        }
        d b10 = b();
        a aVar = this.f3881w;
        h<S> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", b10);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f3815s);
        hVar.setArguments(bundle);
        this.f3882x = hVar;
        if (this.H.isChecked()) {
            d b11 = b();
            a aVar2 = this.f3881w;
            zVar = new t<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", b11);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            zVar.setArguments(bundle2);
        } else {
            zVar = this.f3882x;
        }
        this.f3880v = zVar;
        g();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(getChildFragmentManager());
        aVar3.f(R.id.mtrl_calendar_frame, this.f3880v);
        aVar3.j();
        this.f3880v.b(new c());
    }

    public final void g() {
        d b10 = b();
        getContext();
        String s10 = b10.s();
        this.G.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), new Object[]{s10}));
        this.G.setText(s10);
    }

    public final void h(CheckableImageButton checkableImageButton) {
        String str;
        if (this.H.isChecked()) {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.H.setContentDescription(str);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f3876c.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f3878t = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f3879u = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f3881w = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f3883y = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.z = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.B = bundle.getInt("INPUT_MODE_KEY");
        this.C = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.D = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.E = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.F = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i = this.f3878t;
        if (i == 0) {
            i = b().t();
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.A = d(context);
        int b10 = b6.b.b(context, R.attr.colorSurface, p.class.getCanonicalName());
        f fVar = new f(new i(i.b(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2131821585)));
        this.I = fVar;
        fVar.m(context);
        this.I.o(ColorStateList.valueOf(b10));
        f fVar2 = this.I;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        fVar2.n(x.i.i(decorView));
        return dialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.A ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.A) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(c(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(c(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.G = textView;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.g.f(textView, 1);
        this.H = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.z;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f3883y);
        }
        this.H.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.H;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, a.b.a0(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], a.b.a0(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.H.setChecked(this.B != 0);
        x.p(this.H, (n0.a) null);
        h(this.H);
        this.H.setOnClickListener(new r(this));
        this.J = (Button) inflate.findViewById(R.id.confirm_button);
        if (b().E()) {
            this.J.setEnabled(true);
        } else {
            this.J.setEnabled(false);
        }
        this.J.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence2 = this.D;
        if (charSequence2 != null) {
            this.J.setText(charSequence2);
        } else {
            int i = this.C;
            if (i != 0) {
                this.J.setText(i);
            }
        }
        this.J.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.F;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i10 = this.E;
            if (i10 != 0) {
                button.setText(i10);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f3877s.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f3878t);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f3879u);
        a.b bVar = new a.b(this.f3881w);
        u uVar = this.f3882x.f3853t;
        if (uVar != null) {
            bVar.f3822c = Long.valueOf(uVar.f3899u);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f3823d);
        u i = u.i(bVar.f3820a);
        u i10 = u.i(bVar.f3821b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = bVar.f3822c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new a(i, i10, cVar, l10 == null ? null : u.i(l10.longValue())));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f3883y);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.z);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.C);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.D);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.E);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.F);
    }

    public final void onStart() {
        f0 f0Var;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.A) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.I);
            if (!this.K) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z10 = false;
                boolean z11 = valueOf == null || valueOf.intValue() == 0;
                int A2 = y.c.A(window.getContext(), 16842801, -16777216);
                if (z11) {
                    valueOf = Integer.valueOf(A2);
                }
                Integer valueOf2 = Integer.valueOf(A2);
                if (i >= 30) {
                    d0.b(window, false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                window.getContext();
                int e10 = i < 27 ? g0.a.e(y.c.A(window.getContext(), 16843858, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(e10);
                boolean z12 = y.c.M(0) || y.c.M(valueOf.intValue());
                boolean M = y.c.M(valueOf2.intValue());
                if (y.c.M(e10) || (e10 == 0 && M)) {
                    z10 = true;
                }
                View decorView2 = window.getDecorView();
                if (i >= 30) {
                    f0Var = d0.a(window);
                } else {
                    f0Var = new f0(window, decorView2);
                }
                if (f0Var != null) {
                    f0Var.f8826a.b(z12);
                    f0Var.f8826a.a(z10);
                }
                q qVar = new q(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.i.u(findViewById, qVar);
                this.K = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.I, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new s5.a(requireDialog(), rect));
        }
        f();
    }

    public final void onStop() {
        this.f3880v.f3914a.clear();
        super.onStop();
    }
}
