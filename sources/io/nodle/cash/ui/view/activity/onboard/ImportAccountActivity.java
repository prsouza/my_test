package io.nodle.cash.ui.view.activity.onboard;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c3.k;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import ge.g;
import ge.o0;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.ImportAccountViewModel;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import je.o;
import lb.h;
import nd.m;
import pd.d;
import ub.f;
import vb.c;
import ya.f;
import yd.v;

public final class ImportAccountActivity extends jb.b {
    public static final /* synthetic */ int C = 0;
    public h A;
    public Map<Integer, View> B = new LinkedHashMap();

    /* renamed from: y  reason: collision with root package name */
    public final String f6730y = "ImportAccountActivity";
    public final v0 z = new v0(v.a(ImportAccountViewModel.class), new b(this), new a(this));

    public static final class a extends yd.h implements xd.a<w0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6731b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f6731b = componentActivity;
        }

        public final Object c() {
            return this.f6731b.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends yd.h implements xd.a<x0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6732b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f6732b = componentActivity;
        }

        public final Object c() {
            x0 viewModelStore = this.f6732b.getViewModelStore();
            e.C(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View k(int i) {
        ? r02 = this.B;
        View view = (View) r02.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        r02.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String l(int r5) {
        /*
            r4 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "en"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0012
            r0 = r4
            goto L_0x0028
        L_0x0012:
            android.content.res.Configuration r0 = new android.content.res.Configuration
            android.content.res.Resources r1 = r4.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r0.<init>(r1)
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r0.setLocale(r1)
            android.content.Context r0 = r4.createConfigurationContext(r0)
        L_0x0028:
            vb.c r1 = vb.c.f12449a
            r1 = 0
            if (r5 <= 0) goto L_0x003c
            java.util.List<java.lang.Integer> r2 = vb.c.f12450b
            int r3 = r2.size()
            if (r5 >= r3) goto L_0x003c
            java.lang.Object r5 = r2.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L_0x003d
        L_0x003c:
            r5 = r1
        L_0x003d:
            if (r5 == 0) goto L_0x0047
            int r5 = r5.intValue()
            java.lang.String r1 = r0.getString(r5)
        L_0x0047:
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = ""
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity.l(int):java.lang.String");
    }

    public final ImportAccountViewModel m() {
        return (ImportAccountViewModel) this.z.a();
    }

    public final void n(String str) {
        boolean z10;
        Object value;
        e.D(str, "currentWord");
        Log.d(this.f6730y, "next position: " + m().f6786u);
        int i = m().f6786u;
        if (i == m().f6785t + 1) {
            HashMap<Integer, String> hashMap = m().f6787v;
            e.D(hashMap, "<this>");
            Collection values = new TreeMap(hashMap).values();
            e.C(values, "viewModel.phraseMap.toSortedMap().values");
            List j12 = m.j1(values);
            ImportAccountViewModel m10 = m();
            za.h hVar = za.h.f14215a;
            try {
                k.m0(f.b(j12));
                z10 = true;
            } catch (Exception e10) {
                e10.printStackTrace();
                z10 = false;
            }
            if (!z10) {
                o oVar = m10.f6788w;
                do {
                    value = oVar.getValue();
                    Objects.requireNonNull((gb.a) value);
                } while (!oVar.g(value, new gb.a(true)));
                g.b(jc.b.y(m10), o0.f5433a, new tb.m(m10, (d<? super tb.m>) null), 2);
            }
            if (z10) {
                Intent intent = new Intent();
                intent.putExtra("EXTRA_MNEMONICS", f.b(j12));
                setResult(-1, intent);
                finish();
            }
            m().f6783c.b(new f.a(ya.g.SEED_CONFIRMED, (Map<String, ? extends Object>) null));
            return;
        }
        if (i == m().f6785t) {
            m().i(str);
            o();
            m().f6783c.b(new f.a(ya.g.SEED_ENTERED, aa.b.Q(new md.f("word", l(m().f6786u)))));
        } else {
            m().i(str);
            if (m().f6786u > 0) {
                m().f6783c.b(new f.a(ya.g.SEED_ENTERED, aa.b.Q(new md.f("word", l(m().f6786u)))));
            }
        }
        m().f6786u++;
        Integer b10 = c.f12449a.b(m().f6786u);
        if (b10 != null) {
            ((EditText) k(R.id.wordEditText)).setHint(b10.intValue());
        }
        ((EditText) k(R.id.wordEditText)).setText(m().f6787v.get(Integer.valueOf(m().f6786u)));
    }

    public final void o() {
        HashMap<Integer, String> hashMap = m().f6787v;
        e.D(hashMap, "<this>");
        Collection values = new TreeMap(hashMap).values();
        e.C(values, "viewModel.phraseMap.toSortedMap().values");
        this.A = new h(m.j1(values));
        ((RecyclerView) k(R.id.mnemonicsGridView)).setAdapter(this.A);
        ((RecyclerView) k(R.id.mnemonicsGridView)).setLayoutManager(new GridLayoutManager(this, 2));
        ((Button) k(R.id.nextButton)).setText(getString(R.string.doImport));
        ((EditText) k(R.id.wordEditText)).setVisibility(8);
        ((RecyclerView) k(R.id.mnemonicsGridView)).setVisibility(0);
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ub.f.a(currentFocus);
        }
    }

    public final void onClickNext(View view) {
        e.D(view, "view");
        EditText editText = (EditText) k(R.id.wordEditText);
        n(fe.o.D1(String.valueOf(editText != null ? editText.getText() : null)).toString());
    }

    public final void onClickPrevious(View view) {
        e.D(view, "view");
        EditText editText = (EditText) k(R.id.wordEditText);
        String obj = fe.o.D1(String.valueOf(editText != null ? editText.getText() : null)).toString();
        e.D(obj, "currentWord");
        Log.d(this.f6730y, "previous position: " + m().f6786u);
        int i = m().f6786u;
        if (i != 1) {
            if (i == m().f6785t + 1) {
                ((Button) k(R.id.nextButton)).setText(getString(R.string.next));
                ((EditText) k(R.id.wordEditText)).setVisibility(0);
                ((RecyclerView) k(R.id.mnemonicsGridView)).setVisibility(8);
            } else {
                m().i(obj);
            }
            ImportAccountViewModel m10 = m();
            m10.f6786u--;
            Integer b10 = c.f12449a.b(m().f6786u);
            if (b10 != null) {
                ((EditText) k(R.id.wordEditText)).setHint(b10.intValue());
            }
            ((EditText) k(R.id.wordEditText)).setText(m().f6787v.get(Integer.valueOf(m().f6786u)));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_import_account);
        ImportAccountViewModel m10 = m();
        int i = m10.f6785t;
        int i10 = 1;
        if (1 <= i) {
            while (true) {
                m10.f6787v.put(Integer.valueOf(i10), BuildConfig.FLAVOR);
                if (i10 == i) {
                    break;
                }
                i10++;
            }
        }
        Log.d(m10.f6784s, m10.f6787v.toString());
        g.b(jc.b.u(this), (pd.f) null, new jb.g(this, (d<? super jb.g>) null), 3);
        EditText editText = (EditText) k(R.id.wordEditText);
        e.C(editText, "wordEditText");
        editText.addTextChangedListener(new jb.f(this));
        ((EditText) k(R.id.wordEditText)).setOnKeyListener(new jb.e(this));
        n(BuildConfig.FLAVOR);
    }
}
