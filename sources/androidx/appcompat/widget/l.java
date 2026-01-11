package androidx.appcompat.widget;

import a.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.t0;
import io.nodle.cash.R;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f1311b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static l f1312c;

    /* renamed from: a  reason: collision with root package name */
    public t0 f1313a;

    public class a implements t0.f {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f1314a = {2131165316, 2131165314, 2131165240};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f1315b = {2131165264, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f1316c = {2131165313, 2131165315, 2131165257, R.drawable.abc_text_cursor_material, 2131165310, 2131165311, 2131165312};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f1317d = {2131165289, R.drawable.abc_cab_background_internal_bg, 2131165288};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f1318e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f1319f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i) {
            for (int i10 : iArr) {
                if (i10 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i) {
            int c10 = y0.c(context, R.attr.colorControlHighlight);
            int b10 = y0.b(context, R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{y0.f1423b, y0.f1425d, y0.f1424c, y0.f1427f}, new int[]{b10, g0.a.b(c10, i), g0.a.b(c10, i), i});
        }

        public final LayerDrawable c(t0 t0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable f10 = t0Var.f(context, R.drawable.abc_star_black_48dp);
            Drawable f11 = t0Var.f(context, R.drawable.abc_star_half_black_48dp);
            if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) f10;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f10.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((f11 instanceof BitmapDrawable) && f11.getIntrinsicWidth() == dimensionPixelSize && f11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public final ColorStateList d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return b.Z(context, R.color.abc_tint_edittext);
            }
            if (i == 2131165306) {
                return b.Z(context, R.color.abc_tint_switch_track);
            }
            if (i == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d10 = y0.d(context, R.attr.colorSwitchThumbNormal);
                if (d10 == null || !d10.isStateful()) {
                    iArr[0] = y0.f1423b;
                    iArr2[0] = y0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = y0.f1426e;
                    iArr2[1] = y0.c(context, R.attr.colorControlActivated);
                    iArr[2] = y0.f1427f;
                    iArr2[2] = y0.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = y0.f1423b;
                    iArr2[0] = d10.getColorForState(iArr[0], 0);
                    iArr[1] = y0.f1426e;
                    iArr2[1] = y0.c(context, R.attr.colorControlActivated);
                    iArr[2] = y0.f1427f;
                    iArr2[2] = d10.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, y0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(context, y0.c(context, R.attr.colorAccent));
                }
                if (i == 2131165301 || i == R.drawable.abc_spinner_textfield_background_material) {
                    return b.Z(context, R.color.abc_tint_spinner);
                }
                if (a(this.f1315b, i)) {
                    return y0.d(context, R.attr.colorControlNormal);
                }
                if (a(this.f1318e, i)) {
                    return b.Z(context, R.color.abc_tint_default);
                }
                if (a(this.f1319f, i)) {
                    return b.Z(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return b.Z(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
        }

        public final void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (k0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = l.f1311b;
            }
            drawable.setColorFilter(l.c(i, mode));
        }
    }

    public static synchronized l a() {
        l lVar;
        synchronized (l.class) {
            if (f1312c == null) {
                e();
            }
            lVar = f1312c;
        }
        return lVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (l.class) {
            h10 = t0.h(i, mode);
        }
        return h10;
    }

    public static synchronized void e() {
        synchronized (l.class) {
            if (f1312c == null) {
                l lVar = new l();
                f1312c = lVar;
                lVar.f1313a = t0.d();
                t0 t0Var = f1312c.f1313a;
                a aVar = new a();
                synchronized (t0Var) {
                    t0Var.g = aVar;
                }
            }
        }
    }

    public static void f(Drawable drawable, b1 b1Var, int[] iArr) {
        PorterDuff.Mode mode = t0.f1391h;
        if (!k0.a(drawable) || drawable.mutate() == drawable) {
            boolean z = b1Var.f1178d;
            if (z || b1Var.f1177c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? b1Var.f1175a : null;
                PorterDuff.Mode mode2 = b1Var.f1177c ? b1Var.f1176b : t0.f1391h;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = t0.h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f1313a.f(context, i);
    }

    public final synchronized ColorStateList d(Context context, int i) {
        return this.f1313a.i(context, i);
    }
}
