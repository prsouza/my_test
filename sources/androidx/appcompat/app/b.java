package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import h.l;
import io.nodle.cash.R;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class b extends l {

    /* renamed from: c  reason: collision with root package name */
    public final AlertController f860c = new AlertController(getContext(), this, getWindow());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f861a;

        /* renamed from: b  reason: collision with root package name */
        public final int f862b;

        public a(Context context) {
            this(context, b.h(context, 0));
        }

        public final b a() {
            int i;
            b bVar = new b(this.f861a.f843a, this.f862b);
            AlertController.b bVar2 = this.f861a;
            AlertController alertController = bVar.f860c;
            View view = bVar2.f847e;
            if (view != null) {
                alertController.A = view;
            } else {
                CharSequence charSequence = bVar2.f846d;
                if (charSequence != null) {
                    alertController.f821e = charSequence;
                    TextView textView = alertController.f839y;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar2.f845c;
                if (drawable != null) {
                    alertController.f837w = drawable;
                    alertController.f836v = 0;
                    ImageView imageView = alertController.f838x;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f838x.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar2.f848f;
            if (charSequence2 != null) {
                alertController.f822f = charSequence2;
                TextView textView2 = alertController.z;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar2.g;
            if (charSequence3 != null) {
                alertController.d(-1, charSequence3, bVar2.f849h);
            }
            CharSequence charSequence4 = bVar2.i;
            if (charSequence4 != null) {
                alertController.d(-2, charSequence4, bVar2.f850j);
            }
            if (bVar2.f853m != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar2.f844b.inflate(alertController.F, (ViewGroup) null);
                if (bVar2.f855o) {
                    i = alertController.H;
                } else {
                    i = alertController.I;
                }
                ListAdapter listAdapter = bVar2.f853m;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar2.f843a, i);
                }
                alertController.B = listAdapter;
                alertController.C = bVar2.f856p;
                if (bVar2.f854n != null) {
                    recycleListView.setOnItemClickListener(new a(bVar2, alertController));
                }
                if (bVar2.f855o) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.g = recycleListView;
            }
            bVar.setCancelable(this.f861a.f851k);
            if (this.f861a.f851k) {
                bVar.setCanceledOnTouchOutside(true);
            }
            Objects.requireNonNull(this.f861a);
            bVar.setOnCancelListener((DialogInterface.OnCancelListener) null);
            Objects.requireNonNull(this.f861a);
            bVar.setOnDismissListener((DialogInterface.OnDismissListener) null);
            DialogInterface.OnKeyListener onKeyListener = this.f861a.f852l;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public a(Context context, int i) {
            this.f861a = new AlertController.b(new ContextThemeWrapper(context, b.h(context, i)));
            this.f862b = i;
        }
    }

    public b(Context context, int i) {
        super(context, h(context, i));
    }

    public static int h(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        boolean z;
        ListAdapter listAdapter;
        View view;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f860c;
        if (alertController.E == 0) {
            i = alertController.D;
        } else {
            i = alertController.D;
        }
        alertController.f818b.setContentView(i);
        View findViewById2 = alertController.f819c.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        int i10 = 0;
        alertController.f819c.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c10 = alertController.c(findViewById6, findViewById3);
        ViewGroup c11 = alertController.c(findViewById7, findViewById4);
        ViewGroup c12 = alertController.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f819c.findViewById(R.id.scrollView);
        alertController.f835u = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f835u.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c11.findViewById(16908299);
        alertController.z = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f822f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f835u.removeView(alertController.z);
                if (alertController.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f835u.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.f835u);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c11.setVisibility(8);
                }
            }
        }
        Button button = (Button) c12.findViewById(16908313);
        alertController.i = button;
        button.setOnClickListener(alertController.L);
        if (!TextUtils.isEmpty(alertController.f824j) || alertController.f826l != null) {
            alertController.i.setText(alertController.f824j);
            Drawable drawable = alertController.f826l;
            if (drawable != null) {
                int i11 = alertController.f820d;
                drawable.setBounds(0, 0, i11, i11);
                alertController.i.setCompoundDrawables(alertController.f826l, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.i.setVisibility(0);
            z = true;
        } else {
            alertController.i.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) c12.findViewById(16908314);
        alertController.f827m = button2;
        button2.setOnClickListener(alertController.L);
        if (!TextUtils.isEmpty(alertController.f828n) || alertController.f830p != null) {
            alertController.f827m.setText(alertController.f828n);
            Drawable drawable2 = alertController.f830p;
            if (drawable2 != null) {
                int i12 = alertController.f820d;
                drawable2.setBounds(0, 0, i12, i12);
                alertController.f827m.setCompoundDrawables(alertController.f830p, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f827m.setVisibility(0);
            z |= true;
        } else {
            alertController.f827m.setVisibility(8);
        }
        Button button3 = (Button) c12.findViewById(16908315);
        alertController.f831q = button3;
        button3.setOnClickListener(alertController.L);
        if (!TextUtils.isEmpty(alertController.f832r) || alertController.f834t != null) {
            alertController.f831q.setText(alertController.f832r);
            Drawable drawable3 = alertController.f834t;
            if (drawable3 != null) {
                int i13 = alertController.f820d;
                drawable3.setBounds(0, 0, i13, i13);
                alertController.f831q.setCompoundDrawables(alertController.f834t, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f831q.setVisibility(0);
            z |= true;
        } else {
            alertController.f831q.setVisibility(8);
        }
        Context context = alertController.f817a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                alertController.a(alertController.i);
            } else if (z) {
                alertController.a(alertController.f827m);
            } else if (z) {
                alertController.a(alertController.f831q);
            }
        }
        if (!(z)) {
            c12.setVisibility(8);
        }
        if (alertController.A != null) {
            c10.addView(alertController.A, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f819c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.f838x = (ImageView) alertController.f819c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.f821e)) || !alertController.J) {
                alertController.f819c.findViewById(R.id.title_template).setVisibility(8);
                alertController.f838x.setVisibility(8);
                c10.setVisibility(8);
            } else {
                TextView textView2 = (TextView) alertController.f819c.findViewById(R.id.alertTitle);
                alertController.f839y = textView2;
                textView2.setText(alertController.f821e);
                int i14 = alertController.f836v;
                if (i14 != 0) {
                    alertController.f838x.setImageResource(i14);
                } else {
                    Drawable drawable4 = alertController.f837w;
                    if (drawable4 != null) {
                        alertController.f838x.setImageDrawable(drawable4);
                    } else {
                        alertController.f839y.setPadding(alertController.f838x.getPaddingLeft(), alertController.f838x.getPaddingTop(), alertController.f838x.getPaddingRight(), alertController.f838x.getPaddingBottom());
                        alertController.f838x.setVisibility(8);
                    }
                }
            }
        }
        boolean z10 = viewGroup.getVisibility() != 8;
        int i15 = (c10 == null || c10.getVisibility() == 8) ? 0 : 1;
        boolean z11 = c12.getVisibility() != 8;
        if (!z11 && (findViewById = c11.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i15 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f835u;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (alertController.f822f == null && alertController.g == null) {
                view = null;
            } else {
                view = c10.findViewById(R.id.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = c11.findViewById(R.id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.g;
        if (recycleListView instanceof AlertController.RecycleListView) {
            Objects.requireNonNull(recycleListView);
            if (!z11 || i15 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i15 != 0 ? recycleListView.getPaddingTop() : recycleListView.f840a, recycleListView.getPaddingRight(), z11 ? recycleListView.getPaddingBottom() : recycleListView.f841b);
            }
        }
        if (!z10) {
            View view2 = alertController.g;
            if (view2 == null) {
                view2 = alertController.f835u;
            }
            if (view2 != null) {
                if (z11) {
                    i10 = 2;
                }
                int i16 = i15 | i10;
                View findViewById10 = alertController.f819c.findViewById(R.id.scrollIndicatorUp);
                View findViewById11 = alertController.f819c.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.j.d(view2, i16, 3);
                if (findViewById10 != null) {
                    c11.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    c11.removeView(findViewById11);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.g;
        if (recycleListView2 != null && (listAdapter = alertController.B) != null) {
            recycleListView2.setAdapter(listAdapter);
            int i17 = alertController.C;
            if (i17 > -1) {
                recycleListView2.setItemChecked(i17, true);
                recycleListView2.setSelection(i17);
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f860c.f835u;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f860c.f835u;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f860c;
        alertController.f821e = charSequence;
        TextView textView = alertController.f839y;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
