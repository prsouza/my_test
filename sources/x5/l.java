package x5;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.api.Api;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f12843a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f12844b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12845c;

    /* renamed from: d  reason: collision with root package name */
    public int f12846d;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f12847e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f12848f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public float g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f12849h = 1.0f;
    public int i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12850j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12851k;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f12852l = null;

    public static class a extends Exception {
    }

    public l(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f12843a = charSequence;
        this.f12844b = textPaint;
        this.f12845c = i10;
        this.f12846d = charSequence.length();
    }

    public final StaticLayout a() throws a {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f12843a == null) {
            this.f12843a = BuildConfig.FLAVOR;
        }
        int max = Math.max(0, this.f12845c);
        CharSequence charSequence = this.f12843a;
        if (this.f12848f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f12844b, (float) max, this.f12852l);
        }
        int min = Math.min(charSequence.length(), this.f12846d);
        this.f12846d = min;
        if (this.f12851k && this.f12848f == 1) {
            this.f12847e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f12844b, max);
        obtain.setAlignment(this.f12847e);
        obtain.setIncludePad(this.f12850j);
        if (this.f12851k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f12852l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f12848f);
        float f10 = this.g;
        if (!(f10 == 0.0f && this.f12849h == 1.0f)) {
            obtain.setLineSpacing(f10, this.f12849h);
        }
        if (this.f12848f > 1) {
            obtain.setHyphenationFrequency(this.i);
        }
        return obtain.build();
    }
}
