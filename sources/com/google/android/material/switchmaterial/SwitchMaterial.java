package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import io.nodle.cash.R;
import u5.a;
import x5.o;
import x5.t;
import y.c;

public class SwitchMaterial extends SwitchCompat {

    /* renamed from: o0  reason: collision with root package name */
    public static final int[][] f4001o0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: k0  reason: collision with root package name */
    public final a f4002k0;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f4003l0;

    /* renamed from: m0  reason: collision with root package name */
    public ColorStateList f4004m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f4005n0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(j6.a.a(context, attributeSet, R.attr.switchStyle, 2131821578), attributeSet, R.attr.switchStyle);
        Context context2 = getContext();
        this.f4002k0 = new a(context2);
        TypedArray d10 = o.d(context2, attributeSet, e5.a.C, R.attr.switchStyle, 2131821578, new int[0]);
        this.f4005n0 = d10.getBoolean(0, false);
        d10.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f4003l0 == null) {
            int B = c.B(this, R.attr.colorSurface);
            int B2 = c.B(this, R.attr.colorControlActivated);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            if (this.f4002k0.f11711a) {
                dimension += t.b(this);
            }
            int a10 = this.f4002k0.a(B, dimension);
            this.f4003l0 = new ColorStateList(f4001o0, new int[]{c.N(B, B2, 1.0f), a10, c.N(B, B2, 0.38f), a10});
        }
        return this.f4003l0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f4004m0 == null) {
            int[][] iArr = f4001o0;
            int B = c.B(this, R.attr.colorSurface);
            int B2 = c.B(this, R.attr.colorControlActivated);
            int B3 = c.B(this, R.attr.colorOnSurface);
            this.f4004m0 = new ColorStateList(iArr, new int[]{c.N(B, B2, 0.54f), c.N(B, B3, 0.32f), c.N(B, B2, 0.12f), c.N(B, B3, 0.12f)});
        }
        return this.f4004m0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4005n0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f4005n0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f4005n0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList((ColorStateList) null);
        setTrackTintList((ColorStateList) null);
    }
}
