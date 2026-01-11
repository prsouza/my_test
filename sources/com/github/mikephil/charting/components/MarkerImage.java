package com.github.mikephil.charting.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointF;
import java.lang.ref.WeakReference;

public class MarkerImage implements IMarker {
    private Context mContext;
    private Drawable mDrawable;
    private Rect mDrawableBoundsCache = new Rect();
    private MPPointF mOffset = new MPPointF();
    private MPPointF mOffset2 = new MPPointF();
    private FSize mSize = new FSize();
    private WeakReference<Chart> mWeakChart;

    public MarkerImage(Context context, int i) {
        this.mContext = context;
        this.mDrawable = context.getResources().getDrawable(i, (Resources.Theme) null);
    }

    public void draw(Canvas canvas, float f10, float f11) {
        if (this.mDrawable != null) {
            MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f10, f11);
            FSize fSize = this.mSize;
            float f12 = fSize.width;
            float f13 = fSize.height;
            if (f12 == 0.0f) {
                f12 = (float) this.mDrawable.getIntrinsicWidth();
            }
            if (f13 == 0.0f) {
                f13 = (float) this.mDrawable.getIntrinsicHeight();
            }
            this.mDrawable.copyBounds(this.mDrawableBoundsCache);
            Drawable drawable = this.mDrawable;
            Rect rect = this.mDrawableBoundsCache;
            int i = rect.left;
            int i10 = rect.top;
            drawable.setBounds(i, i10, ((int) f12) + i, ((int) f13) + i10);
            int save = canvas.save();
            canvas.translate(f10 + offsetForDrawingAtPoint.f3610x, f11 + offsetForDrawingAtPoint.f3611y);
            this.mDrawable.draw(canvas);
            canvas.restoreToCount(save);
            this.mDrawable.setBounds(this.mDrawableBoundsCache);
        }
    }

    public Chart getChartView() {
        WeakReference<Chart> weakReference = this.mWeakChart;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public MPPointF getOffset() {
        return this.mOffset;
    }

    public MPPointF getOffsetForDrawingAtPoint(float f10, float f11) {
        Drawable drawable;
        Drawable drawable2;
        MPPointF offset = getOffset();
        MPPointF mPPointF = this.mOffset2;
        mPPointF.f3610x = offset.f3610x;
        mPPointF.f3611y = offset.f3611y;
        Chart chartView = getChartView();
        FSize fSize = this.mSize;
        float f12 = fSize.width;
        float f13 = fSize.height;
        if (f12 == 0.0f && (drawable2 = this.mDrawable) != null) {
            f12 = (float) drawable2.getIntrinsicWidth();
        }
        if (f13 == 0.0f && (drawable = this.mDrawable) != null) {
            f13 = (float) drawable.getIntrinsicHeight();
        }
        MPPointF mPPointF2 = this.mOffset2;
        float f14 = mPPointF2.f3610x;
        if (f10 + f14 < 0.0f) {
            mPPointF2.f3610x = -f10;
        } else if (chartView != null && f10 + f12 + f14 > ((float) chartView.getWidth())) {
            this.mOffset2.f3610x = (((float) chartView.getWidth()) - f10) - f12;
        }
        MPPointF mPPointF3 = this.mOffset2;
        float f15 = mPPointF3.f3611y;
        if (f11 + f15 < 0.0f) {
            mPPointF3.f3611y = -f11;
        } else if (chartView != null && f11 + f13 + f15 > ((float) chartView.getHeight())) {
            this.mOffset2.f3611y = (((float) chartView.getHeight()) - f11) - f13;
        }
        return this.mOffset2;
    }

    public FSize getSize() {
        return this.mSize;
    }

    public void refreshContent(Entry entry, Highlight highlight) {
    }

    public void setChartView(Chart chart) {
        this.mWeakChart = new WeakReference<>(chart);
    }

    public void setOffset(MPPointF mPPointF) {
        this.mOffset = mPPointF;
        if (mPPointF == null) {
            this.mOffset = new MPPointF();
        }
    }

    public void setSize(FSize fSize) {
        this.mSize = fSize;
        if (fSize == null) {
            this.mSize = new FSize();
        }
    }

    public void setOffset(float f10, float f11) {
        MPPointF mPPointF = this.mOffset;
        mPPointF.f3610x = f10;
        mPPointF.f3611y = f11;
    }
}
