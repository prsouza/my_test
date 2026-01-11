package androidx.preference.internal;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.common.api.Api;
import net.jpountz.lz4.LZ4FrameOutputStream;

public class PreferenceImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public int f2231a = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: b  reason: collision with root package name */
    public int f2232b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f330q, 0, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        obtainStyledAttributes.recycle();
    }

    public int getMaxHeight() {
        return this.f2232b;
    }

    public int getMaxWidth() {
        return this.f2231a;
    }

    public final void onMeasure(int i, int i10) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i = View.MeasureSpec.makeMeasureSpec(maxWidth, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i10 = View.MeasureSpec.makeMeasureSpec(maxHeight, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
            }
        }
        super.onMeasure(i, i10);
    }

    public void setMaxHeight(int i) {
        this.f2232b = i;
        super.setMaxHeight(i);
    }

    public void setMaxWidth(int i) {
        this.f2231a = i;
        super.setMaxWidth(i);
    }
}
