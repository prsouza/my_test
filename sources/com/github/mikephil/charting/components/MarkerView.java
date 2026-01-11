package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import java.lang.ref.WeakReference;

public class MarkerView extends RelativeLayout implements IMarker {
    private MPPointF mOffset = new MPPointF();
    private MPPointF mOffset2 = new MPPointF();
    private WeakReference<Chart> mWeakChart;

    public MarkerView(Context context, int i) {
        super(context);
        setupLayoutResource(i);
    }

    private void setupLayoutResource(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, this);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
    }

    public void draw(Canvas canvas, float f10, float f11) {
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f10, f11);
        int save = canvas.save();
        canvas.translate(f10 + offsetForDrawingAtPoint.f3610x, f11 + offsetForDrawingAtPoint.f3611y);
        draw(canvas);
        canvas.restoreToCount(save);
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
        MPPointF offset = getOffset();
        MPPointF mPPointF = this.mOffset2;
        mPPointF.f3610x = offset.f3610x;
        mPPointF.f3611y = offset.f3611y;
        Chart chartView = getChartView();
        float width = (float) getWidth();
        float height = (float) getHeight();
        MPPointF mPPointF2 = this.mOffset2;
        float f12 = mPPointF2.f3610x;
        if (f10 + f12 < 0.0f) {
            mPPointF2.f3610x = -f10;
        } else if (chartView != null && f10 + width + f12 > ((float) chartView.getWidth())) {
            this.mOffset2.f3610x = (((float) chartView.getWidth()) - f10) - width;
        }
        MPPointF mPPointF3 = this.mOffset2;
        float f13 = mPPointF3.f3611y;
        if (f11 + f13 < 0.0f) {
            mPPointF3.f3611y = -f11;
        } else if (chartView != null && f11 + height + f13 > ((float) chartView.getHeight())) {
            this.mOffset2.f3611y = (((float) chartView.getHeight()) - f11) - height;
        }
        return this.mOffset2;
    }

    public void refreshContent(Entry entry, Highlight highlight) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
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

    public void setOffset(float f10, float f11) {
        MPPointF mPPointF = this.mOffset;
        mPPointF.f3610x = f10;
        mPPointF.f3611y = f11;
    }
}
