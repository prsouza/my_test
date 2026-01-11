package androidx.appcompat.view.menu;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.d1;
import io.nodle.cash.R;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {
    public Context A;
    public boolean B;
    public Drawable C;
    public boolean D;
    public LayoutInflater E;
    public boolean F;

    /* renamed from: a  reason: collision with root package name */
    public g f871a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f872b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f873c;

    /* renamed from: s  reason: collision with root package name */
    public TextView f874s;

    /* renamed from: t  reason: collision with root package name */
    public CheckBox f875t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f876u;

    /* renamed from: v  reason: collision with root package name */
    public ImageView f877v;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f878w;

    /* renamed from: x  reason: collision with root package name */
    public LinearLayout f879x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f880y;
    public int z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d1 q10 = d1.q(getContext(), attributeSet, c.L, R.attr.listMenuViewStyle);
        this.f880y = q10.g(5);
        this.z = q10.l(1, -1);
        this.B = q10.a(7, false);
        this.A = context;
        this.C = q10.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.D = obtainStyledAttributes.hasValue(0);
        q10.r();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.E == null) {
            this.E = LayoutInflater.from(getContext());
        }
        return this.E;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f877v;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.f875t = checkBox;
        LinearLayout linearLayout = this.f879x;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f878w;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f878w.getLayoutParams();
            rect.top = this.f878w.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.f873c = radioButton;
        LinearLayout linearLayout = this.f879x;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if ((r0.f959n.p() && r0.e() != 0) != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(androidx.appcompat.view.menu.g r11) {
        /*
            r10 = this;
            r10.f871a = r11
            boolean r0 = r11.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f952e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            androidx.appcompat.view.menu.e r0 = r11.f959n
            boolean r0 = r0.p()
            r3 = 1
            if (r0 == 0) goto L_0x002e
            char r0 = r11.e()
            if (r0 == 0) goto L_0x002e
            r0 = r3
            goto L_0x002f
        L_0x002e:
            r0 = r2
        L_0x002f:
            r11.e()
            if (r0 == 0) goto L_0x004a
            androidx.appcompat.view.menu.g r0 = r10.f871a
            androidx.appcompat.view.menu.e r4 = r0.f959n
            boolean r4 = r4.p()
            if (r4 == 0) goto L_0x0046
            char r0 = r0.e()
            if (r0 == 0) goto L_0x0046
            r0 = r3
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r2 = r1
        L_0x004b:
            if (r2 != 0) goto L_0x0104
            android.widget.TextView r0 = r10.f876u
            androidx.appcompat.view.menu.g r4 = r10.f871a
            char r5 = r4.e()
            if (r5 != 0) goto L_0x005b
            java.lang.String r1 = ""
            goto L_0x0101
        L_0x005b:
            androidx.appcompat.view.menu.e r6 = r4.f959n
            android.content.Context r6 = r6.f923a
            android.content.res.Resources r6 = r6.getResources()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            androidx.appcompat.view.menu.e r8 = r4.f959n
            android.content.Context r8 = r8.f923a
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
            boolean r8 = r8.hasPermanentMenuKey()
            if (r8 == 0) goto L_0x0080
            r8 = 2131755025(0x7f100011, float:1.9140918E38)
            java.lang.String r8 = r6.getString(r8)
            r7.append(r8)
        L_0x0080:
            androidx.appcompat.view.menu.e r8 = r4.f959n
            boolean r8 = r8.o()
            if (r8 == 0) goto L_0x008b
            int r4 = r4.f956k
            goto L_0x008d
        L_0x008b:
            int r4 = r4.i
        L_0x008d:
            r8 = 65536(0x10000, float:9.18355E-41)
            r9 = 2131755021(0x7f10000d, float:1.914091E38)
            java.lang.String r9 = r6.getString(r9)
            androidx.appcompat.view.menu.g.c(r7, r4, r8, r9)
            r8 = 4096(0x1000, float:5.74E-42)
            r9 = 2131755017(0x7f100009, float:1.9140901E38)
            java.lang.String r9 = r6.getString(r9)
            androidx.appcompat.view.menu.g.c(r7, r4, r8, r9)
            r8 = 2
            r9 = 2131755016(0x7f100008, float:1.91409E38)
            java.lang.String r9 = r6.getString(r9)
            androidx.appcompat.view.menu.g.c(r7, r4, r8, r9)
            r8 = 2131755022(0x7f10000e, float:1.9140912E38)
            java.lang.String r8 = r6.getString(r8)
            androidx.appcompat.view.menu.g.c(r7, r4, r3, r8)
            r3 = 4
            r8 = 2131755024(0x7f100010, float:1.9140916E38)
            java.lang.String r8 = r6.getString(r8)
            androidx.appcompat.view.menu.g.c(r7, r4, r3, r8)
            r3 = 2131755020(0x7f10000c, float:1.9140907E38)
            java.lang.String r3 = r6.getString(r3)
            androidx.appcompat.view.menu.g.c(r7, r4, r1, r3)
            if (r5 == r1) goto L_0x00f3
            r1 = 10
            if (r5 == r1) goto L_0x00e8
            r1 = 32
            if (r5 == r1) goto L_0x00dd
            r7.append(r5)
            goto L_0x00fd
        L_0x00dd:
            r1 = 2131755023(0x7f10000f, float:1.9140914E38)
            java.lang.String r1 = r6.getString(r1)
            r7.append(r1)
            goto L_0x00fd
        L_0x00e8:
            r1 = 2131755019(0x7f10000b, float:1.9140905E38)
            java.lang.String r1 = r6.getString(r1)
            r7.append(r1)
            goto L_0x00fd
        L_0x00f3:
            r1 = 2131755018(0x7f10000a, float:1.9140903E38)
            java.lang.String r1 = r6.getString(r1)
            r7.append(r1)
        L_0x00fd:
            java.lang.String r1 = r7.toString()
        L_0x0101:
            r0.setText(r1)
        L_0x0104:
            android.widget.TextView r0 = r10.f876u
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x0111
            android.widget.TextView r0 = r10.f876u
            r0.setVisibility(r2)
        L_0x0111:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f962q
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.d(androidx.appcompat.view.menu.g):void");
    }

    public g getItemData() {
        return this.f871a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f880y;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.q(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f874s = textView;
        int i = this.z;
        if (i != -1) {
            textView.setTextAppearance(this.A, i);
        }
        this.f876u = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f877v = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.C);
        }
        this.f878w = (ImageView) findViewById(R.id.group_divider);
        this.f879x = (LinearLayout) findViewById(R.id.content);
    }

    public final void onMeasure(int i, int i10) {
        if (this.f872b != null && this.B) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f872b.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i, i10);
    }

    public void setCheckable(boolean z10) {
        View view;
        CompoundButton compoundButton;
        if (z10 || this.f873c != null || this.f875t != null) {
            if (this.f871a.h()) {
                if (this.f873c == null) {
                    b();
                }
                compoundButton = this.f873c;
                view = this.f875t;
            } else {
                if (this.f875t == null) {
                    a();
                }
                compoundButton = this.f875t;
                view = this.f873c;
            }
            if (z10) {
                compoundButton.setChecked(this.f871a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f875t;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f873c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f871a.h()) {
            if (this.f873c == null) {
                b();
            }
            compoundButton = this.f873c;
        } else {
            if (this.f875t == null) {
                a();
            }
            compoundButton = this.f875t;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.F = z10;
        this.B = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f878w;
        if (imageView != null) {
            imageView.setVisibility((this.D || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f871a.f959n);
        boolean z10 = this.F;
        if (z10 || this.B) {
            ImageView imageView = this.f872b;
            if (imageView != null || drawable != null || this.B) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f872b = imageView2;
                    LinearLayout linearLayout = this.f879x;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.B) {
                    ImageView imageView3 = this.f872b;
                    if (!z10) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f872b.getVisibility() != 0) {
                        this.f872b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f872b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f874s.setText(charSequence);
            if (this.f874s.getVisibility() != 0) {
                this.f874s.setVisibility(0);
            }
        } else if (this.f874s.getVisibility() != 8) {
            this.f874s.setVisibility(8);
        }
    }
}
