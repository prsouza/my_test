package com.github.mikephil.charting.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.github.mikephil.charting.formatter.DefaultValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import java.util.List;

public abstract class Utils {
    public static final double DEG2RAD = 0.017453292519943295d;
    public static final double DOUBLE_EPSILON = Double.longBitsToDouble(1);
    public static final float FDEG2RAD = 0.017453292f;
    public static final float FLOAT_EPSILON = Float.intBitsToFloat(1);
    private static final int[] POW_10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    private static Rect mCalcTextHeightRect = new Rect();
    private static Rect mCalcTextSizeRect = new Rect();
    private static ValueFormatter mDefaultValueFormatter = generateDefaultValueFormatter();
    private static Rect mDrawTextRectBuffer = new Rect();
    private static Rect mDrawableBoundsCache = new Rect();
    private static Paint.FontMetrics mFontMetrics = new Paint.FontMetrics();
    private static Paint.FontMetrics mFontMetricsBuffer = new Paint.FontMetrics();
    private static int mMaximumFlingVelocity = 8000;
    private static DisplayMetrics mMetrics = null;
    private static int mMinimumFlingVelocity = 50;

    public static int calcTextHeight(Paint paint, String str) {
        Rect rect = mCalcTextHeightRect;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static FSize calcTextSize(Paint paint, String str) {
        FSize instance = FSize.getInstance(0.0f, 0.0f);
        calcTextSize(paint, str, instance);
        return instance;
    }

    public static int calcTextWidth(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static float convertDpToPixel(float f10) {
        DisplayMetrics displayMetrics = mMetrics;
        if (displayMetrics != null) {
            return f10 * displayMetrics.density;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return f10;
    }

    public static int[] convertIntegers(List<Integer> list) {
        int[] iArr = new int[list.size()];
        copyIntegers(list, iArr);
        return iArr;
    }

    public static float convertPixelsToDp(float f10) {
        DisplayMetrics displayMetrics = mMetrics;
        if (displayMetrics != null) {
            return f10 / displayMetrics.density;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertPixelsToDp(...). Otherwise conversion does not take place.");
        return f10;
    }

    public static String[] convertStrings(List<String> list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i);
        }
        return strArr;
    }

    public static void copyIntegers(List<Integer> list, int[] iArr) {
        int length = iArr.length < list.size() ? iArr.length : list.size();
        for (int i = 0; i < length; i++) {
            iArr[i] = list.get(i).intValue();
        }
    }

    public static void copyStrings(List<String> list, String[] strArr) {
        int length = strArr.length < list.size() ? strArr.length : list.size();
        for (int i = 0; i < length; i++) {
            strArr[i] = list.get(i);
        }
    }

    public static void drawImage(Canvas canvas, Drawable drawable, int i, int i10, int i11, int i12) {
        MPPointF instance = MPPointF.getInstance();
        instance.f3610x = (float) (i - (i11 / 2));
        instance.f3611y = (float) (i10 - (i12 / 2));
        drawable.copyBounds(mDrawableBoundsCache);
        Rect rect = mDrawableBoundsCache;
        int i13 = rect.left;
        int i14 = rect.top;
        drawable.setBounds(i13, i14, i13 + i11, i11 + i14);
        int save = canvas.save();
        canvas.translate(instance.f3610x, instance.f3611y);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public static void drawMultilineText(Canvas canvas, StaticLayout staticLayout, float f10, float f11, TextPaint textPaint, MPPointF mPPointF, float f12) {
        float fontMetrics = textPaint.getFontMetrics(mFontMetricsBuffer);
        float width = (float) staticLayout.getWidth();
        float lineCount = ((float) staticLayout.getLineCount()) * fontMetrics;
        float f13 = 0.0f - ((float) mDrawTextRectBuffer.left);
        float f14 = lineCount + 0.0f;
        Paint.Align textAlign = textPaint.getTextAlign();
        textPaint.setTextAlign(Paint.Align.LEFT);
        if (f12 != 0.0f) {
            float f15 = f13 - (width * 0.5f);
            float f16 = f14 - (lineCount * 0.5f);
            if (!(mPPointF.f3610x == 0.5f && mPPointF.f3611y == 0.5f)) {
                FSize sizeOfRotatedRectangleByDegrees = getSizeOfRotatedRectangleByDegrees(width, lineCount, f12);
                f10 -= (mPPointF.f3610x - 0.5f) * sizeOfRotatedRectangleByDegrees.width;
                f11 -= (mPPointF.f3611y - 0.5f) * sizeOfRotatedRectangleByDegrees.height;
                FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
            }
            canvas.save();
            canvas.translate(f10, f11);
            canvas.rotate(f12);
            canvas.translate(f15, f16);
            staticLayout.draw(canvas);
            canvas.restore();
        } else {
            float f17 = mPPointF.f3610x;
            if (!(f17 == 0.0f && mPPointF.f3611y == 0.0f)) {
                f13 -= width * f17;
                f14 -= lineCount * mPPointF.f3611y;
            }
            canvas.save();
            canvas.translate(f13 + f10, f14 + f11);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        textPaint.setTextAlign(textAlign);
    }

    public static void drawXAxisValue(Canvas canvas, String str, float f10, float f11, Paint paint, MPPointF mPPointF, float f12) {
        float fontMetrics = paint.getFontMetrics(mFontMetricsBuffer);
        paint.getTextBounds(str, 0, str.length(), mDrawTextRectBuffer);
        float f13 = 0.0f - ((float) mDrawTextRectBuffer.left);
        float f14 = (-mFontMetricsBuffer.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f12 != 0.0f) {
            float width = f13 - (((float) mDrawTextRectBuffer.width()) * 0.5f);
            float f15 = f14 - (fontMetrics * 0.5f);
            if (!(mPPointF.f3610x == 0.5f && mPPointF.f3611y == 0.5f)) {
                FSize sizeOfRotatedRectangleByDegrees = getSizeOfRotatedRectangleByDegrees((float) mDrawTextRectBuffer.width(), fontMetrics, f12);
                f10 -= (mPPointF.f3610x - 0.5f) * sizeOfRotatedRectangleByDegrees.width;
                f11 -= (mPPointF.f3611y - 0.5f) * sizeOfRotatedRectangleByDegrees.height;
                FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
            }
            canvas.save();
            canvas.translate(f10, f11);
            canvas.rotate(f12);
            canvas.drawText(str, width, f15, paint);
            canvas.restore();
        } else {
            if (!(mPPointF.f3610x == 0.0f && mPPointF.f3611y == 0.0f)) {
                f13 -= ((float) mDrawTextRectBuffer.width()) * mPPointF.f3610x;
                f14 -= fontMetrics * mPPointF.f3611y;
            }
            canvas.drawText(str, f13 + f10, f14 + f11, paint);
        }
        paint.setTextAlign(textAlign);
    }

    public static String formatNumber(float f10, int i, boolean z) {
        return formatNumber(f10, i, z, '.');
    }

    private static ValueFormatter generateDefaultValueFormatter() {
        return new DefaultValueFormatter(1);
    }

    public static int getDecimals(float f10) {
        float roundToNextSignificant = roundToNextSignificant((double) f10);
        if (Float.isInfinite(roundToNextSignificant)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10((double) roundToNextSignificant))) + 2;
    }

    public static ValueFormatter getDefaultValueFormatter() {
        return mDefaultValueFormatter;
    }

    public static float getLineHeight(Paint paint) {
        return getLineHeight(paint, mFontMetrics);
    }

    public static float getLineSpacing(Paint paint) {
        return getLineSpacing(paint, mFontMetrics);
    }

    public static int getMaximumFlingVelocity() {
        return mMaximumFlingVelocity;
    }

    public static int getMinimumFlingVelocity() {
        return mMinimumFlingVelocity;
    }

    public static float getNormalizedAngle(float f10) {
        while (f10 < 0.0f) {
            f10 += 360.0f;
        }
        return f10 % 360.0f;
    }

    public static MPPointF getPosition(MPPointF mPPointF, float f10, float f11) {
        MPPointF instance = MPPointF.getInstance(0.0f, 0.0f);
        getPosition(mPPointF, f10, f11, instance);
        return instance;
    }

    public static int getSDKInt() {
        return Build.VERSION.SDK_INT;
    }

    public static FSize getSizeOfRotatedRectangleByDegrees(FSize fSize, float f10) {
        return getSizeOfRotatedRectangleByRadians(fSize.width, fSize.height, f10 * 0.017453292f);
    }

    public static FSize getSizeOfRotatedRectangleByRadians(FSize fSize, float f10) {
        return getSizeOfRotatedRectangleByRadians(fSize.width, fSize.height, f10);
    }

    public static void init(Context context) {
        if (context == null) {
            mMinimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
            mMaximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        mMetrics = context.getResources().getDisplayMetrics();
    }

    public static double nextUp(double d10) {
        if (d10 == Double.POSITIVE_INFINITY) {
            return d10;
        }
        double d11 = d10 + DOUBLE_EPSILON;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d11) + (d11 >= DOUBLE_EPSILON ? 1 : -1));
    }

    public static void postInvalidateOnAnimation(View view) {
        view.postInvalidateOnAnimation();
    }

    public static float roundToNextSignificant(double d10) {
        if (Double.isInfinite(d10) || Double.isNaN(d10) || d10 == DOUBLE_EPSILON) {
            return 0.0f;
        }
        float pow = (float) Math.pow(10.0d, (double) (1 - ((int) ((float) Math.ceil((double) ((float) Math.log10(d10 < DOUBLE_EPSILON ? -d10 : d10)))))));
        return ((float) Math.round(d10 * ((double) pow))) / pow;
    }

    public static void velocityTrackerPointerUpCleanUpIfNecessary(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, (float) mMaximumFlingVelocity);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            if (i != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i);
                if ((velocityTracker.getYVelocity(pointerId2) * yVelocity) + (velocityTracker.getXVelocity(pointerId2) * xVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }

    public static String formatNumber(float f10, int i, boolean z, char c10) {
        boolean z10;
        float f11 = f10;
        char[] cArr = new char[35];
        if (f11 == 0.0f) {
            return "0";
        }
        int i10 = 0;
        boolean z11 = f11 < 1.0f && f11 > -1.0f;
        if (f11 < 0.0f) {
            f11 = -f11;
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = POW_10;
        int i11 = i;
        int length = i11 > iArr.length ? iArr.length - 1 : i11;
        long round = (long) Math.round(f11 * ((float) iArr[length]));
        int i12 = 34;
        boolean z12 = false;
        while (true) {
            if (round == 0 && i10 >= length + 1) {
                break;
            }
            boolean z13 = z12;
            round /= 10;
            int i13 = i12 - 1;
            cArr[i12] = (char) (((int) (round % 10)) + 48);
            i10++;
            if (i10 == length) {
                i12 = i13 - 1;
                cArr[i13] = ',';
                i10++;
                z12 = true;
            } else {
                if (z && round != 0 && i10 > length) {
                    if (z13) {
                        if ((i10 - length) % 4 == 0) {
                            i12 = i13 - 1;
                            cArr[i13] = c10;
                        }
                    } else if ((i10 - length) % 4 == 3) {
                        i12 = i13 - 1;
                        cArr[i13] = c10;
                    }
                    i10++;
                    z12 = z13;
                }
                i12 = i13;
                z12 = z13;
            }
        }
        if (z11) {
            cArr[i12] = '0';
            i10++;
            i12--;
        }
        if (z10) {
            cArr[i12] = '-';
            i10++;
        }
        int i14 = 35 - i10;
        return String.valueOf(cArr, i14, 35 - i14);
    }

    public static float getLineHeight(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float getLineSpacing(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static FSize getSizeOfRotatedRectangleByDegrees(float f10, float f11, float f12) {
        return getSizeOfRotatedRectangleByRadians(f10, f11, f12 * 0.017453292f);
    }

    public static FSize getSizeOfRotatedRectangleByRadians(float f10, float f11, float f12) {
        double d10 = (double) f12;
        return FSize.getInstance(Math.abs(((float) Math.sin(d10)) * f11) + Math.abs(((float) Math.cos(d10)) * f10), Math.abs(f11 * ((float) Math.cos(d10))) + Math.abs(f10 * ((float) Math.sin(d10))));
    }

    public static void calcTextSize(Paint paint, String str, FSize fSize) {
        Rect rect = mCalcTextSizeRect;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        fSize.width = (float) rect.width();
        fSize.height = (float) rect.height();
    }

    public static void getPosition(MPPointF mPPointF, float f10, float f11, MPPointF mPPointF2) {
        double d10 = (double) f10;
        double d11 = (double) f11;
        mPPointF2.f3610x = (float) ((Math.cos(Math.toRadians(d11)) * d10) + ((double) mPPointF.f3610x));
        mPPointF2.f3611y = (float) ((Math.sin(Math.toRadians(d11)) * d10) + ((double) mPPointF.f3611y));
    }

    @Deprecated
    public static void init(Resources resources) {
        mMetrics = resources.getDisplayMetrics();
        mMinimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
        mMaximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
    }

    public static void drawMultilineText(Canvas canvas, String str, float f10, float f11, TextPaint textPaint, FSize fSize, MPPointF mPPointF, float f12) {
        TextPaint textPaint2 = textPaint;
        drawMultilineText(canvas, new StaticLayout(str, 0, str.length(), textPaint2, (int) Math.max(Math.ceil((double) fSize.width), 1.0d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false), f10, f11, textPaint2, mPPointF, f12);
    }
}
