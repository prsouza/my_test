package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class g0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f1247l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f1248m = new ConcurrentHashMap<>();

    /* renamed from: n  reason: collision with root package name */
    public static ConcurrentHashMap<String, Field> f1249n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f1250a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1251b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f1252c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f1253d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f1254e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1255f = new int[0];
    public boolean g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f1256h;
    public final TextView i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f1257j;

    /* renamed from: k  reason: collision with root package name */
    public final a f1258k;

    public static class a extends c {
        public void b(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) g0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class b extends a {
        public boolean a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        public void b(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    public static class c {
        public boolean a(TextView textView) {
            return ((Boolean) g0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public g0(TextView textView) {
        this.i = textView;
        this.f1257j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1258k = new b();
        } else {
            this.f1258k = new a();
        }
    }

    public static Method d(String str) {
        try {
            Method method = f1248m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1248m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t10) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    public final void a() {
        int i10;
        if (i() && this.f1250a != 0) {
            if (this.f1251b) {
                if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                    if (this.f1258k.a(this.i)) {
                        i10 = 1048576;
                    } else {
                        i10 = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                    }
                    int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                    if (i10 > 0 && height > 0) {
                        RectF rectF = f1247l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i10;
                            rectF.bottom = (float) height;
                            float c10 = (float) c(rectF);
                            if (c10 != this.i.getTextSize()) {
                                f(0, c10);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1251b = true;
        }
    }

    public final int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f1255f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f1255f[i13];
                CharSequence text = this.i.getText();
                TransformationMethod transformationMethod = this.i.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.i)) == null)) {
                    text = transformation;
                }
                int maxLines = this.i.getMaxLines();
                TextPaint textPaint = this.f1256h;
                if (textPaint == null) {
                    this.f1256h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f1256h.set(this.i.getPaint());
                this.f1256h.setTextSize((float) i14);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f1256h, Math.round(rectF.right));
                obtain.setAlignment((Layout.Alignment) e(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : maxLines);
                try {
                    this.f1258k.b(obtain, this.i);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && ((float) build.getHeight()) <= rectF.bottom) {
                    int i15 = i13 + 1;
                    i12 = i11;
                    i11 = i15;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f1255f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(int i10, float f10) {
        Resources resources;
        Context context = this.f1257j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        if (applyDimension != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.i.isInLayout();
            if (this.i.getLayout() != null) {
                this.f1251b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!isInLayout) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (!i() || this.f1250a != 1) {
            this.f1251b = false;
        } else {
            if (!this.g || this.f1255f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1254e - this.f1253d) / this.f1252c))) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((((float) i10) * this.f1252c) + this.f1253d);
                }
                this.f1255f = b(iArr);
            }
            this.f1251b = true;
        }
        return this.f1251b;
    }

    public final boolean h() {
        int[] iArr = this.f1255f;
        int length = iArr.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.f1250a = 1;
            this.f1253d = (float) iArr[0];
            this.f1254e = (float) iArr[length - 1];
            this.f1252c = -1.0f;
        }
        return z;
    }

    public final boolean i() {
        return !(this.i instanceof m);
    }

    public final void j(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f1250a = 1;
            this.f1253d = f10;
            this.f1254e = f11;
            this.f1252c = f12;
            this.g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }
}
