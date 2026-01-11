package com.github.mikephil.charting.listener;

import a.a;
import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class BarLineChartTouchListener extends ChartTouchListener<BarLineChartBase<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>>> {
    private IDataSet mClosestDataSetToTouch;
    private MPPointF mDecelerationCurrentPoint = MPPointF.getInstance(0.0f, 0.0f);
    private long mDecelerationLastTime = 0;
    private MPPointF mDecelerationVelocity = MPPointF.getInstance(0.0f, 0.0f);
    private float mDragTriggerDist;
    private Matrix mMatrix = new Matrix();
    private float mMinScalePointerDistance;
    private float mSavedDist = 1.0f;
    private Matrix mSavedMatrix = new Matrix();
    private float mSavedXDist = 1.0f;
    private float mSavedYDist = 1.0f;
    private MPPointF mTouchPointCenter = MPPointF.getInstance(0.0f, 0.0f);
    private MPPointF mTouchStartPoint = MPPointF.getInstance(0.0f, 0.0f);
    private VelocityTracker mVelocityTracker;

    public BarLineChartTouchListener(BarLineChartBase<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> barLineChartBase, Matrix matrix, float f10) {
        super(barLineChartBase);
        this.mMatrix = matrix;
        this.mDragTriggerDist = Utils.convertDpToPixel(f10);
        this.mMinScalePointerDistance = Utils.convertDpToPixel(3.5f);
    }

    private static float getXDist(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    private static float getYDist(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r2.mClosestDataSetToTouch;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean inverted() {
        /*
            r2 = this;
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = r2.mClosestDataSetToTouch
            if (r0 != 0) goto L_0x000e
            T r0 = r2.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r0 = (com.github.mikephil.charting.charts.BarLineChartBase) r0
            boolean r0 = r0.isAnyAxisInverted()
            if (r0 != 0) goto L_0x0020
        L_0x000e:
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = r2.mClosestDataSetToTouch
            if (r0 == 0) goto L_0x0022
            T r1 = r2.mChart
            com.github.mikephil.charting.charts.BarLineChartBase r1 = (com.github.mikephil.charting.charts.BarLineChartBase) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = r0.getAxisDependency()
            boolean r0 = r1.isInverted(r0)
            if (r0 == 0) goto L_0x0022
        L_0x0020:
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.listener.BarLineChartTouchListener.inverted():boolean");
    }

    private static void midPoint(MPPointF mPPointF, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(0);
        float y10 = motionEvent.getY(0);
        mPPointF.f3610x = (motionEvent.getX(1) + x10) / 2.0f;
        mPPointF.f3611y = (motionEvent.getY(1) + y10) / 2.0f;
    }

    private void performDrag(MotionEvent motionEvent, float f10, float f11) {
        this.mLastGesture = ChartTouchListener.ChartGesture.DRAG;
        this.mMatrix.set(this.mSavedMatrix);
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (inverted()) {
            if (this.mChart instanceof HorizontalBarChart) {
                f10 = -f10;
            } else {
                f11 = -f11;
            }
        }
        this.mMatrix.postTranslate(f10, f11);
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartTranslate(motionEvent, f10, f11);
        }
    }

    private void performHighlightDrag(MotionEvent motionEvent) {
        Highlight highlightByTouchPoint = ((BarLineChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
        if (highlightByTouchPoint != null && !highlightByTouchPoint.equalTo(this.mLastHighlighted)) {
            this.mLastHighlighted = highlightByTouchPoint;
            ((BarLineChartBase) this.mChart).highlightValue(highlightByTouchPoint, true);
        }
    }

    private void performZoom(MotionEvent motionEvent) {
        boolean z;
        boolean z10;
        boolean z11;
        boolean z12;
        if (motionEvent.getPointerCount() >= 2) {
            OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
            float spacing = spacing(motionEvent);
            if (spacing > this.mMinScalePointerDistance) {
                MPPointF mPPointF = this.mTouchPointCenter;
                MPPointF trans = getTrans(mPPointF.f3610x, mPPointF.f3611y);
                ViewPortHandler viewPortHandler = ((BarLineChartBase) this.mChart).getViewPortHandler();
                int i = this.mTouchMode;
                boolean z13 = true;
                float f10 = 1.0f;
                if (i == 4) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.PINCH_ZOOM;
                    float f11 = spacing / this.mSavedDist;
                    if (f11 >= 1.0f) {
                        z13 = false;
                    }
                    if (z13) {
                        z11 = viewPortHandler.canZoomOutMoreX();
                    } else {
                        z11 = viewPortHandler.canZoomInMoreX();
                    }
                    if (z13) {
                        z12 = viewPortHandler.canZoomOutMoreY();
                    } else {
                        z12 = viewPortHandler.canZoomInMoreY();
                    }
                    float f12 = ((BarLineChartBase) this.mChart).isScaleXEnabled() ? f11 : 1.0f;
                    if (((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                        f10 = f11;
                    }
                    if (z12 || z11) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(f12, f10, trans.f3610x, trans.f3611y);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.onChartScale(motionEvent, f12, f10);
                        }
                    }
                } else if (i == 2 && ((BarLineChartBase) this.mChart).isScaleXEnabled()) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.X_ZOOM;
                    float xDist = getXDist(motionEvent) / this.mSavedXDist;
                    if (xDist >= 1.0f) {
                        z13 = false;
                    }
                    if (z13) {
                        z10 = viewPortHandler.canZoomOutMoreX();
                    } else {
                        z10 = viewPortHandler.canZoomInMoreX();
                    }
                    if (z10) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(xDist, 1.0f, trans.f3610x, trans.f3611y);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.onChartScale(motionEvent, xDist, 1.0f);
                        }
                    }
                } else if (this.mTouchMode == 3 && ((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                    this.mLastGesture = ChartTouchListener.ChartGesture.Y_ZOOM;
                    float yDist = getYDist(motionEvent) / this.mSavedYDist;
                    if (yDist >= 1.0f) {
                        z13 = false;
                    }
                    if (z13) {
                        z = viewPortHandler.canZoomOutMoreY();
                    } else {
                        z = viewPortHandler.canZoomInMoreY();
                    }
                    if (z) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(1.0f, yDist, trans.f3610x, trans.f3611y);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.onChartScale(motionEvent, 1.0f, yDist);
                        }
                    }
                }
                MPPointF.recycleInstance(trans);
            }
        }
    }

    private void saveTouchStart(MotionEvent motionEvent) {
        this.mSavedMatrix.set(this.mMatrix);
        this.mTouchStartPoint.f3610x = motionEvent.getX();
        this.mTouchStartPoint.f3611y = motionEvent.getY();
        this.mClosestDataSetToTouch = ((BarLineChartBase) this.mChart).getDataSetByTouchPoint(motionEvent.getX(), motionEvent.getY());
    }

    private static float spacing(MotionEvent motionEvent) {
        float x10 = motionEvent.getX(0) - motionEvent.getX(1);
        float y10 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((y10 * y10) + (x10 * x10)));
    }

    public void computeScroll() {
        MPPointF mPPointF = this.mDecelerationVelocity;
        float f10 = 0.0f;
        if (mPPointF.f3610x != 0.0f || mPPointF.f3611y != 0.0f) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            MPPointF mPPointF2 = this.mDecelerationVelocity;
            mPPointF2.f3610x = ((BarLineChartBase) this.mChart).getDragDecelerationFrictionCoef() * mPPointF2.f3610x;
            MPPointF mPPointF3 = this.mDecelerationVelocity;
            mPPointF3.f3611y = ((BarLineChartBase) this.mChart).getDragDecelerationFrictionCoef() * mPPointF3.f3611y;
            float f11 = ((float) (currentAnimationTimeMillis - this.mDecelerationLastTime)) / 1000.0f;
            MPPointF mPPointF4 = this.mDecelerationVelocity;
            float f12 = mPPointF4.f3610x * f11;
            float f13 = mPPointF4.f3611y * f11;
            MPPointF mPPointF5 = this.mDecelerationCurrentPoint;
            float f14 = mPPointF5.f3610x + f12;
            mPPointF5.f3610x = f14;
            float f15 = mPPointF5.f3611y + f13;
            mPPointF5.f3611y = f15;
            MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f14, f15, 0);
            float f16 = ((BarLineChartBase) this.mChart).isDragXEnabled() ? this.mDecelerationCurrentPoint.f3610x - this.mTouchStartPoint.f3610x : 0.0f;
            if (((BarLineChartBase) this.mChart).isDragYEnabled()) {
                f10 = this.mDecelerationCurrentPoint.f3611y - this.mTouchStartPoint.f3611y;
            }
            performDrag(obtain, f16, f10);
            obtain.recycle();
            this.mMatrix = ((BarLineChartBase) this.mChart).getViewPortHandler().refresh(this.mMatrix, this.mChart, false);
            this.mDecelerationLastTime = currentAnimationTimeMillis;
            if (((double) Math.abs(this.mDecelerationVelocity.f3610x)) >= 0.01d || ((double) Math.abs(this.mDecelerationVelocity.f3611y)) >= 0.01d) {
                Utils.postInvalidateOnAnimation(this.mChart);
                return;
            }
            ((BarLineChartBase) this.mChart).calculateOffsets();
            ((BarLineChartBase) this.mChart).postInvalidate();
            stopDeceleration();
        }
    }

    public Matrix getMatrix() {
        return this.mMatrix;
    }

    public MPPointF getTrans(float f10, float f11) {
        float f12;
        ViewPortHandler viewPortHandler = ((BarLineChartBase) this.mChart).getViewPortHandler();
        float offsetLeft = f10 - viewPortHandler.offsetLeft();
        if (inverted()) {
            f12 = -(f11 - viewPortHandler.offsetTop());
        } else {
            f12 = -((((float) ((BarLineChartBase) this.mChart).getMeasuredHeight()) - f11) - viewPortHandler.offsetBottom());
        }
        return MPPointF.getInstance(offsetLeft, f12);
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.DOUBLE_TAP;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartDoubleTapped(motionEvent);
        }
        if (((BarLineChartBase) this.mChart).isDoubleTapToZoomEnabled() && ((BarLineScatterCandleBubbleData) ((BarLineChartBase) this.mChart).getData()).getEntryCount() > 0) {
            MPPointF trans = getTrans(motionEvent.getX(), motionEvent.getY());
            T t10 = this.mChart;
            BarLineChartBase barLineChartBase = (BarLineChartBase) t10;
            float f10 = 1.4f;
            float f11 = ((BarLineChartBase) t10).isScaleXEnabled() ? 1.4f : 1.0f;
            if (!((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                f10 = 1.0f;
            }
            barLineChartBase.zoom(f11, f10, trans.f3610x, trans.f3611y);
            if (((BarLineChartBase) this.mChart).isLogEnabled()) {
                StringBuilder d10 = a.d("Double-Tap, Zooming In, x: ");
                d10.append(trans.f3610x);
                d10.append(", y: ");
                d10.append(trans.f3611y);
                Log.i("BarlineChartTouch", d10.toString());
            }
            MPPointF.recycleInstance(trans);
        }
        return super.onDoubleTap(motionEvent);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.mLastGesture = ChartTouchListener.ChartGesture.FLING;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartFling(motionEvent, motionEvent2, f10, f11);
        }
        return super.onFling(motionEvent, motionEvent2, f10, f11);
    }

    public void onLongPress(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.LONG_PRESS;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.SINGLE_TAP;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!((BarLineChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((BarLineChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int i = 3;
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.mVelocityTracker) != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        if (this.mTouchMode == 0) {
            this.mGestureDetector.onTouchEvent(motionEvent);
        }
        if (!((BarLineChartBase) this.mChart).isDragEnabled() && !((BarLineChartBase) this.mChart).isScaleXEnabled() && !((BarLineChartBase) this.mChart).isScaleYEnabled()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            boolean z = false;
            if (action == 1) {
                VelocityTracker velocityTracker2 = this.mVelocityTracker;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, (float) Utils.getMaximumFlingVelocity());
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((Math.abs(xVelocity) > ((float) Utils.getMinimumFlingVelocity()) || Math.abs(yVelocity) > ((float) Utils.getMinimumFlingVelocity())) && this.mTouchMode == 1 && ((BarLineChartBase) this.mChart).isDragDecelerationEnabled()) {
                    stopDeceleration();
                    this.mDecelerationLastTime = AnimationUtils.currentAnimationTimeMillis();
                    this.mDecelerationCurrentPoint.f3610x = motionEvent.getX();
                    this.mDecelerationCurrentPoint.f3611y = motionEvent.getY();
                    MPPointF mPPointF = this.mDecelerationVelocity;
                    mPPointF.f3610x = xVelocity;
                    mPPointF.f3611y = yVelocity;
                    Utils.postInvalidateOnAnimation(this.mChart);
                }
                int i10 = this.mTouchMode;
                if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                    ((BarLineChartBase) this.mChart).calculateOffsets();
                    ((BarLineChartBase) this.mChart).postInvalidate();
                }
                this.mTouchMode = 0;
                ((BarLineChartBase) this.mChart).enableScroll();
                VelocityTracker velocityTracker3 = this.mVelocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.mVelocityTracker = null;
                }
                endAction(motionEvent);
            } else if (action == 2) {
                int i11 = this.mTouchMode;
                if (i11 == 1) {
                    ((BarLineChartBase) this.mChart).disableScroll();
                    float f10 = 0.0f;
                    float x10 = ((BarLineChartBase) this.mChart).isDragXEnabled() ? motionEvent.getX() - this.mTouchStartPoint.f3610x : 0.0f;
                    if (((BarLineChartBase) this.mChart).isDragYEnabled()) {
                        f10 = motionEvent.getY() - this.mTouchStartPoint.f3611y;
                    }
                    performDrag(motionEvent, x10, f10);
                } else if (i11 == 2 || i11 == 3 || i11 == 4) {
                    ((BarLineChartBase) this.mChart).disableScroll();
                    if (((BarLineChartBase) this.mChart).isScaleXEnabled() || ((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                        performZoom(motionEvent);
                    }
                } else if (i11 == 0 && Math.abs(ChartTouchListener.distance(motionEvent.getX(), this.mTouchStartPoint.f3610x, motionEvent.getY(), this.mTouchStartPoint.f3611y)) > this.mDragTriggerDist && ((BarLineChartBase) this.mChart).isDragEnabled()) {
                    if (!((BarLineChartBase) this.mChart).isFullyZoomedOut() || !((BarLineChartBase) this.mChart).hasNoDragOffset()) {
                        z = true;
                    }
                    if (z) {
                        float abs = Math.abs(motionEvent.getX() - this.mTouchStartPoint.f3610x);
                        float abs2 = Math.abs(motionEvent.getY() - this.mTouchStartPoint.f3611y);
                        if ((((BarLineChartBase) this.mChart).isDragXEnabled() || abs2 >= abs) && (((BarLineChartBase) this.mChart).isDragYEnabled() || abs2 <= abs)) {
                            this.mLastGesture = ChartTouchListener.ChartGesture.DRAG;
                            this.mTouchMode = 1;
                        }
                    } else if (((BarLineChartBase) this.mChart).isHighlightPerDragEnabled()) {
                        this.mLastGesture = ChartTouchListener.ChartGesture.DRAG;
                        if (((BarLineChartBase) this.mChart).isHighlightPerDragEnabled()) {
                            performHighlightDrag(motionEvent);
                        }
                    }
                }
            } else if (action == 3) {
                this.mTouchMode = 0;
                endAction(motionEvent);
            } else if (action != 5) {
                if (action == 6) {
                    Utils.velocityTrackerPointerUpCleanUpIfNecessary(motionEvent, this.mVelocityTracker);
                    this.mTouchMode = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ((BarLineChartBase) this.mChart).disableScroll();
                saveTouchStart(motionEvent);
                this.mSavedXDist = getXDist(motionEvent);
                this.mSavedYDist = getYDist(motionEvent);
                float spacing = spacing(motionEvent);
                this.mSavedDist = spacing;
                if (spacing > 10.0f) {
                    if (((BarLineChartBase) this.mChart).isPinchZoomEnabled()) {
                        this.mTouchMode = 4;
                    } else if (((BarLineChartBase) this.mChart).isScaleXEnabled() != ((BarLineChartBase) this.mChart).isScaleYEnabled()) {
                        if (((BarLineChartBase) this.mChart).isScaleXEnabled()) {
                            i = 2;
                        }
                        this.mTouchMode = i;
                    } else {
                        if (this.mSavedXDist > this.mSavedYDist) {
                            i = 2;
                        }
                        this.mTouchMode = i;
                    }
                }
                midPoint(this.mTouchPointCenter, motionEvent);
            }
        } else {
            startAction(motionEvent);
            stopDeceleration();
            saveTouchStart(motionEvent);
        }
        this.mMatrix = ((BarLineChartBase) this.mChart).getViewPortHandler().refresh(this.mMatrix, this.mChart, true);
        return true;
    }

    public void setDragTriggerDist(float f10) {
        this.mDragTriggerDist = Utils.convertDpToPixel(f10);
    }

    public void stopDeceleration() {
        MPPointF mPPointF = this.mDecelerationVelocity;
        mPPointF.f3610x = 0.0f;
        mPPointF.f3611y = 0.0f;
    }
}
