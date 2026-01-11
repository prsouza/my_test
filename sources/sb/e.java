package sb;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.r;
import de.h;
import ge.d0;
import ge.g;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.transact.TransactActivity;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import io.nodle.cash.utils.AutoClearedProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import je.f;
import je.n;
import l6.b1;
import md.m;
import pd.d;
import rd.i;
import va.o;
import va.p1;
import xd.p;
import yd.j;
import yd.v;
import z4.q;

public final class e extends g {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ h<Object>[] f11050w;

    /* renamed from: t  reason: collision with root package name */
    public TransactViewModel f11051t;

    /* renamed from: u  reason: collision with root package name */
    public final AutoClearedProperty f11052u = y.c.l(this);

    /* renamed from: v  reason: collision with root package name */
    public Map<Integer, View> f11053v = new LinkedHashMap();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11054a;

        static {
            int[] iArr = new int[TransactViewModel.a.values().length];
            iArr[TransactViewModel.a.SHOW_PK4_ALERT.ordinal()] = 1;
            f11054a = iArr;
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f11055a;

        public b(e eVar) {
            this.f11055a = eVar;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        }

        /* JADX WARNING: type inference failed for: r7v9, types: [java.lang.CharSequence, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onTextChanged(java.lang.CharSequence r20, int r21, int r22, int r23) {
            /*
                r19 = this;
                r0 = r20
                r1 = r19
                if (r0 == 0) goto L_0x015d
                sb.e r2 = r1.f11055a
                io.nodle.cash.ui.viewmodel.TransactViewModel r2 = r2.f11051t
                if (r2 == 0) goto L_0x0156
                java.lang.String r3 = "[a-zA-Z0-9]+"
                java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
                java.lang.String r4 = "compile(pattern)"
                e6.e.C(r3, r4)
                int r4 = r20.length()
                r5 = 0
                r6 = 1
                if (r4 <= 0) goto L_0x0021
                r4 = r6
                goto L_0x0022
            L_0x0021:
                r4 = r5
            L_0x0022:
                if (r4 == 0) goto L_0x015d
                java.util.regex.Matcher r4 = r3.matcher(r0)
                boolean r4 = r4.matches()
                if (r4 != 0) goto L_0x015d
                int r4 = r20.length()
                int r4 = r4 - r6
                java.lang.CharSequence r0 = r0.subSequence(r5, r4)
                r4 = r0
                android.text.Editable r4 = (android.text.Editable) r4
                int r0 = r4.length()
                if (r0 <= 0) goto L_0x0042
                r0 = r6
                goto L_0x0043
            L_0x0042:
                r0 = r5
            L_0x0043:
                if (r0 == 0) goto L_0x012f
                java.util.regex.Matcher r0 = r3.matcher(r4)
                boolean r0 = r0.matches()
                if (r0 != 0) goto L_0x012f
                int r0 = r4.length()
                int r3 = r2.f6818x
                if (r0 <= r3) goto L_0x012f
                ri.a$a r0 = ri.a.f10801a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r7 = "gleanPK: "
                r3.append(r7)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.Object[] r7 = new java.lang.Object[r5]
                r0.a(r3, r7)
                r0 = 2
                char[] r3 = new char[r0]
                r3 = {52, 53} // fill-array
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                r8 = r5
                r9 = r8
            L_0x007c:
                int r10 = r4.length()
                if (r8 >= r10) goto L_0x00a6
                char r10 = r4.charAt(r8)
                int r11 = r9 + 1
                r12 = r5
            L_0x0089:
                if (r12 >= r0) goto L_0x0093
                char r13 = r3[r12]
                if (r10 != r13) goto L_0x0090
                goto L_0x0094
            L_0x0090:
                int r12 = r12 + 1
                goto L_0x0089
            L_0x0093:
                r12 = -1
            L_0x0094:
                if (r12 < 0) goto L_0x0098
                r10 = r6
                goto L_0x0099
            L_0x0098:
                r10 = r5
            L_0x0099:
                if (r10 == 0) goto L_0x00a2
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r7.add(r9)
            L_0x00a2:
                int r8 = r8 + 1
                r9 = r11
                goto L_0x007c
            L_0x00a6:
                ri.a$a r0 = ri.a.f10801a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r8 = "indexes: "
                r3.append(r8)
                r3.append(r7)
                java.lang.String r3 = r3.toString()
                java.lang.Object[] r8 = new java.lang.Object[r5]
                r0.a(r3, r8)
                java.util.Iterator r3 = r7.iterator()
            L_0x00c2:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x012f
                java.lang.Object r0 = r3.next()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                ri.a$a r7 = ri.a.f10801a
                int r8 = r2.f6818x
                int r9 = r4.length()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "i="
                r10.append(r11)
                r10.append(r0)
                java.lang.String r11 = ", i+PK_LENGTH="
                r10.append(r11)
                r10.append(r0)
                r10.append(r8)
                java.lang.String r8 = ", text.length="
                r10.append(r8)
                r10.append(r9)
                java.lang.String r8 = r10.toString()
                java.lang.Object[] r9 = new java.lang.Object[r5]
                r7.a(r8, r9)
                int r7 = r2.f6818x
                int r7 = r7 + r0
                int r8 = r4.length()
                if (r7 > r8) goto L_0x00c2
                int r7 = r2.f6818x
                int r7 = r7 + r0
                java.lang.CharSequence r7 = r4.subSequence(r0, r7)
                za.h r0 = za.h.f14215a
                java.lang.String r0 = r7.toString()
                java.lang.String r8 = "pk"
                e6.e.D(r0, r8)
                gd.a r8 = gd.a.f5360c     // Catch:{ Exception -> 0x0125 }
                gd.a.a(r0)     // Catch:{ Exception -> 0x0125 }
                r0 = r6
                goto L_0x012a
            L_0x0125:
                r0 = move-exception
                r0.printStackTrace()
                r0 = r5
            L_0x012a:
                if (r0 == 0) goto L_0x00c2
                r4 = r7
                android.text.Editable r4 = (android.text.Editable) r4
            L_0x012f:
                je.o r0 = r2.f6819y
            L_0x0131:
                java.lang.Object r2 = r0.getValue()
                r5 = r2
                gb.i r5 = (gb.i) r5
                r6 = 0
                r7 = 0
                java.lang.String r8 = r4.toString()
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 4091(0xffb, float:5.733E-42)
                gb.i r3 = gb.i.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                boolean r2 = r0.g(r2, r3)
                if (r2 == 0) goto L_0x0131
                goto L_0x015d
            L_0x0156:
                java.lang.String r0 = "viewModel"
                e6.e.c0(r0)
                r0 = 0
                throw r0
            L_0x015d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sb.e.b.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    @rd.e(c = "io.nodle.cash.ui.view.fragment.transact.AccountFinderFragment$onViewCreated$1", f = "AccountFinderFragment.kt", l = {42}, m = "invokeSuspend")
    public static final class c extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f11056a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f11057b;

        public static final class a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ e f11058a;

            public a(e eVar) {
                this.f11058a = eVar;
            }

            public final Object a(Object obj, d dVar) {
                m mVar;
                gb.i iVar = (gb.i) obj;
                e eVar = this.f11058a;
                h<Object>[] hVarArr = e.f11050w;
                eVar.c().f12422b.setText(iVar.f5332c);
                this.f11058a.c().f12422b.setSelection(this.f11058a.c().f12422b.length());
                Integer num = iVar.f5337j;
                if (num != null) {
                    this.f11058a.c().f12424s.setText(num.intValue());
                    mVar = m.f8555a;
                } else {
                    mVar = null;
                }
                return mVar == qd.a.COROUTINE_SUSPENDED ? mVar : m.f8555a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e eVar, d<? super c> dVar) {
            super(2, dVar);
            this.f11057b = eVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new c(this.f11057b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f11056a;
            if (i == 0) {
                b1.w(obj);
                e eVar = this.f11057b;
                TransactViewModel transactViewModel = eVar.f11051t;
                if (transactViewModel != null) {
                    n<gb.i> nVar = transactViewModel.z;
                    r lifecycle = eVar.getLifecycle();
                    e6.e.C(lifecycle, "lifecycle");
                    je.e<gb.i> a10 = androidx.lifecycle.m.a(nVar, lifecycle, r.c.STARTED);
                    a aVar2 = new a(this.f11057b);
                    this.f11056a = 1;
                    if (((ke.e) a10).b(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    e6.e.c0("viewModel");
                    throw null;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8555a;
        }
    }

    static {
        j jVar = new j(e.class, "binding", "getBinding()Lio/nodle/cash/databinding/FragmentAccountFinderBinding;");
        Objects.requireNonNull(v.f13623a);
        f11050w = new h[]{jVar};
    }

    public final o c() {
        return (o) this.f11052u.f(this, f11050w[0]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        e6.e.D(layoutInflater, "inflater");
        androidx.fragment.app.r activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type io.nodle.cash.ui.view.activity.transact.TransactActivity");
        this.f11051t = ((TransactActivity) activity).k();
        View inflate = layoutInflater.inflate(R.layout.fragment_account_finder, viewGroup, false);
        int i = R.id.accountEditText;
        EditText editText = (EditText) jc.b.q(inflate, R.id.accountEditText);
        if (editText != null) {
            i = R.id.addressDoneButton;
            Button button = (Button) jc.b.q(inflate, R.id.addressDoneButton);
            if (button != null) {
                i = R.id.errorTextView;
                TextView textView = (TextView) jc.b.q(inflate, R.id.errorTextView);
                if (textView != null) {
                    i = R.id.textView;
                    if (((TextView) jc.b.q(inflate, R.id.textView)) != null) {
                        i = R.id.toolbar;
                        View q10 = jc.b.q(inflate, R.id.toolbar);
                        if (q10 != null) {
                            this.f11052u.h(this, f11050w[0], new o((ConstraintLayout) inflate, editText, button, textView, p1.a(q10)));
                            ConstraintLayout constraintLayout = c().f12421a;
                            e6.e.C(constraintLayout, "binding.root");
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11053v.clear();
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onViewCreated(View view, Bundle bundle) {
        e6.e.D(view, "view");
        super.onViewCreated(view, bundle);
        g.b(jc.b.u(this), (pd.f) null, new c(this, (d<? super c>) null), 3);
        ? r42 = this.f11053v;
        Integer valueOf = Integer.valueOf(R.id.accountEditText);
        View view2 = (View) r42.get(valueOf);
        if (view2 == null) {
            View view3 = getView();
            if (view3 == null || (view2 = view3.findViewById(R.id.accountEditText)) == null) {
                view2 = null;
            } else {
                r42.put(valueOf, view2);
            }
        }
        EditText editText = (EditText) view2;
        e6.e.C(editText, "accountEditText");
        editText.addTextChangedListener(new b(this));
        c().f12423c.setOnClickListener(new d(this));
        c().f12425t.f12427a.setOnClickListener(new c(this));
        TransactViewModel transactViewModel = this.f11051t;
        if (transactViewModel != null) {
            transactViewModel.E.e(getViewLifecycleOwner(), new q(this));
        } else {
            e6.e.c0("viewModel");
            throw null;
        }
    }
}
