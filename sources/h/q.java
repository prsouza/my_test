package h;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.textfield.TextInputLayout;
import e6.e;
import e9.a;
import e9.d;
import java.util.Objects;
import k5.b;
import l6.b1;
import md.g;
import xd.l;
import z5.f;

public final class q extends r {

    /* renamed from: s  reason: collision with root package name */
    public final e f5598s = new e();

    /* renamed from: t  reason: collision with root package name */
    public final p f5599t = new p(this);

    /* renamed from: u  reason: collision with root package name */
    public final f f5600u;

    /* renamed from: v  reason: collision with root package name */
    public final Context f5601v;

    /* renamed from: w  reason: collision with root package name */
    public final l<Context, Context> f5602w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(f fVar, Context context) {
        super(fVar);
        d9.e eVar = d9.e.f4376b;
        e.D(context, "baseContext");
        this.f5600u = fVar;
        this.f5601v = context;
        this.f5602w = eVar;
    }

    public final Context e(Context context) {
        e.D(context, "context");
        return this.f5602w.k(super.e(context));
    }

    public final View f(View view, String str, Context context, AttributeSet attributeSet) {
        Object obj;
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(context, "context");
        e.D(attributeSet, "attrs");
        if (e.r(str, "WebView")) {
            return new WebView(this.f5600u.e(context), attributeSet);
        }
        View f10 = super.f(view, str, context, attributeSet);
        if (f10 == null) {
            Object obj2 = null;
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    obj = LayoutInflater.from(context).createView(context, str, (String) null, attributeSet);
                } else if (e.r(str, "ViewStub")) {
                    obj = null;
                } else {
                    obj = new a(context).a(context, str, attributeSet);
                }
            } catch (Throwable th2) {
                obj = b1.k(th2);
            }
            if (!(obj instanceof g.a)) {
                obj2 = obj;
            }
            f10 = (View) obj2;
        }
        if (f10 != null) {
            e eVar = this.f5598s;
            Objects.requireNonNull(eVar);
            int i = 0;
            if (f10 instanceof TextView) {
                TextView textView = (TextView) f10;
                Context context2 = textView.getContext();
                e.C(context2, "view.context");
                CharSequence[] q10 = eVar.q(context2, attributeSet, c.g);
                int length = q10.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    CharSequence charSequence = q10[i10];
                    int i12 = i11 + 1;
                    if (charSequence != null) {
                        if (i11 == 2) {
                            textView.setText(charSequence);
                        } else if (i11 == 3) {
                            textView.setHint(charSequence);
                        } else if (i11 == 0) {
                            if (f10 instanceof Switch) {
                                ((Switch) f10).setTextOn(charSequence);
                            } else if (f10 instanceof SwitchCompat) {
                                ((SwitchCompat) f10).setTextOn(charSequence);
                            } else if (f10 instanceof ToggleButton) {
                                ((ToggleButton) f10).setTextOn(charSequence);
                            }
                        } else if (i11 == 1) {
                            if (f10 instanceof Switch) {
                                ((Switch) f10).setTextOff(charSequence);
                            } else if (f10 instanceof SwitchCompat) {
                                ((SwitchCompat) f10).setTextOff(charSequence);
                            } else if (f10 instanceof ToggleButton) {
                                ((ToggleButton) f10).setTextOff(charSequence);
                            }
                        }
                    }
                    i10++;
                    i11 = i12;
                }
                if (f10 instanceof ToggleButton) {
                    ToggleButton toggleButton = (ToggleButton) f10;
                    toggleButton.setChecked(toggleButton.isChecked());
                }
            } else if (f10 instanceof TextInputLayout) {
                TextInputLayout textInputLayout = (TextInputLayout) f10;
                Context context3 = textInputLayout.getContext();
                e.C(context3, "view.context");
                CharSequence[] q11 = eVar.q(context3, attributeSet, c.f310f);
                int length2 = q11.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2) {
                    CharSequence charSequence2 = q11[i13];
                    int i15 = i14 + 1;
                    if (charSequence2 != null && i14 == 0) {
                        textInputLayout.setHint(charSequence2);
                    }
                    i13++;
                    i14 = i15;
                }
            } else {
                boolean z = f10 instanceof Toolbar;
                if (z || (f10 instanceof ActionBarContextView) || (f10 instanceof android.widget.Toolbar)) {
                    Context context4 = f10.getContext();
                    e.C(context4, "view.context");
                    CharSequence[] q12 = eVar.q(context4, attributeSet, c.f313h);
                    int length3 = q12.length;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length3) {
                        CharSequence charSequence3 = q12[i16];
                        int i18 = i17 + 1;
                        if (charSequence3 != null) {
                            if (i17 == 0 || i17 == 3) {
                                if (z) {
                                    ((Toolbar) f10).setTitle(charSequence3);
                                } else if (f10 instanceof ActionBarContextView) {
                                    ((ActionBarContextView) f10).setTitle(charSequence3);
                                } else if (f10 instanceof android.widget.Toolbar) {
                                    ((android.widget.Toolbar) f10).setTitle(charSequence3);
                                }
                            } else if (i17 == 1 || i17 == 2) {
                                if (z) {
                                    ((Toolbar) f10).setSubtitle(charSequence3);
                                } else if (f10 instanceof ActionBarContextView) {
                                    ((ActionBarContextView) f10).setSubtitle(charSequence3);
                                } else if (f10 instanceof android.widget.Toolbar) {
                                    ((android.widget.Toolbar) f10).setSubtitle(charSequence3);
                                }
                            }
                        }
                        i16++;
                        i17 = i18;
                    }
                } else if (f10 instanceof f) {
                    f fVar = (f) f10;
                    TypedArray obtainStyledAttributes = fVar.getContext().obtainStyledAttributes(attributeSet, e5.a.f4638x);
                    e.C(obtainStyledAttributes, "view.context.obtainStyle…styleable.NavigationView)");
                    int resourceId = obtainStyledAttributes.getResourceId(27, -1);
                    if (resourceId != -1) {
                        Context context5 = fVar.getContext();
                        e.C(context5, "view.context");
                        d dVar = new d(context5);
                        Menu menu = fVar.getMenu();
                        e.C(menu, "view.menu");
                        dVar.a(resourceId, menu);
                    }
                    obtainStyledAttributes.recycle();
                } else if (f10 instanceof b) {
                    eVar.m((b) f10, attributeSet);
                }
            }
            if (f10.getContentDescription() != null) {
                Context context6 = f10.getContext();
                e.C(context6, "view.context");
                CharSequence[] q13 = eVar.q(context6, attributeSet, c.i);
                int length4 = q13.length;
                int i19 = 0;
                while (i < length4) {
                    CharSequence charSequence4 = q13[i];
                    int i20 = i19 + 1;
                    if (charSequence4 != null && i19 == 0) {
                        f10.setContentDescription(charSequence4);
                    }
                    i++;
                    i19 = i20;
                }
            }
        }
        return f10;
    }

    public final MenuInflater i() {
        return new e9.c(this.f5601v, super.i());
    }

    public final void k() {
        LayoutInflater from = LayoutInflater.from(this.f5601v);
        e.C(from, "layoutInflater");
        if (from.getFactory() == null) {
            from.setFactory2(this.f5599t);
        }
    }
}
