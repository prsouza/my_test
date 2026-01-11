package l0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

public final class c implements Spannable {
    public final char charAt(int i) {
        throw null;
    }

    public final int getSpanEnd(Object obj) {
        throw null;
    }

    public final int getSpanFlags(Object obj) {
        throw null;
    }

    public final int getSpanStart(Object obj) {
        throw null;
    }

    public final <T> T[] getSpans(int i, int i10, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    public final int length() {
        throw null;
    }

    public final int nextSpanTransition(int i, int i10, Class cls) {
        throw null;
    }

    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    public final void setSpan(Object obj, int i, int i10, int i11) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    public final CharSequence subSequence(int i, int i10) {
        throw null;
    }

    public final String toString() {
        throw null;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f7748a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f7749b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7750c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7751d;

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i10) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build();
            }
            this.f7748a = textPaint;
            this.f7749b = textDirectionHeuristic;
            this.f7750c = i;
            this.f7751d = i10;
        }

        public final boolean a(a aVar) {
            int i = Build.VERSION.SDK_INT;
            if (this.f7750c != aVar.f7750c || this.f7751d != aVar.f7751d || this.f7748a.getTextSize() != aVar.f7748a.getTextSize() || this.f7748a.getTextScaleX() != aVar.f7748a.getTextScaleX() || this.f7748a.getTextSkewX() != aVar.f7748a.getTextSkewX() || this.f7748a.getLetterSpacing() != aVar.f7748a.getLetterSpacing() || !TextUtils.equals(this.f7748a.getFontFeatureSettings(), aVar.f7748a.getFontFeatureSettings()) || this.f7748a.getFlags() != aVar.f7748a.getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f7748a.getTextLocales().equals(aVar.f7748a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f7748a.getTextLocale().equals(aVar.f7748a.getTextLocale())) {
                return false;
            }
            if (this.f7748a.getTypeface() == null) {
                if (aVar.f7748a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f7748a.getTypeface().equals(aVar.f7748a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f7749b == aVar.f7749b;
        }

        public final int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return Objects.hash(new Object[]{Float.valueOf(this.f7748a.getTextSize()), Float.valueOf(this.f7748a.getTextScaleX()), Float.valueOf(this.f7748a.getTextSkewX()), Float.valueOf(this.f7748a.getLetterSpacing()), Integer.valueOf(this.f7748a.getFlags()), this.f7748a.getTextLocales(), this.f7748a.getTypeface(), Boolean.valueOf(this.f7748a.isElegantTextHeight()), this.f7749b, Integer.valueOf(this.f7750c), Integer.valueOf(this.f7751d)});
            }
            return Objects.hash(new Object[]{Float.valueOf(this.f7748a.getTextSize()), Float.valueOf(this.f7748a.getTextScaleX()), Float.valueOf(this.f7748a.getTextSkewX()), Float.valueOf(this.f7748a.getLetterSpacing()), Integer.valueOf(this.f7748a.getFlags()), this.f7748a.getTextLocale(), this.f7748a.getTypeface(), Boolean.valueOf(this.f7748a.isElegantTextHeight()), this.f7749b, Integer.valueOf(this.f7750c), Integer.valueOf(this.f7751d)});
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder d10 = a.a.d("textSize=");
            d10.append(this.f7748a.getTextSize());
            sb2.append(d10.toString());
            sb2.append(", textScaleX=" + this.f7748a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f7748a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            StringBuilder d11 = a.a.d(", letterSpacing=");
            d11.append(this.f7748a.getLetterSpacing());
            sb2.append(d11.toString());
            sb2.append(", elegantTextHeight=" + this.f7748a.isElegantTextHeight());
            if (i >= 24) {
                StringBuilder d12 = a.a.d(", textLocale=");
                d12.append(this.f7748a.getTextLocales());
                sb2.append(d12.toString());
            } else {
                StringBuilder d13 = a.a.d(", textLocale=");
                d13.append(this.f7748a.getTextLocale());
                sb2.append(d13.toString());
            }
            StringBuilder d14 = a.a.d(", typeface=");
            d14.append(this.f7748a.getTypeface());
            sb2.append(d14.toString());
            if (i >= 26) {
                StringBuilder d15 = a.a.d(", variationSettings=");
                d15.append(this.f7748a.getFontVariationSettings());
                sb2.append(d15.toString());
            }
            StringBuilder d16 = a.a.d(", textDir=");
            d16.append(this.f7749b);
            sb2.append(d16.toString());
            sb2.append(", breakStrategy=" + this.f7750c);
            sb2.append(", hyphenationFrequency=" + this.f7751d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f7748a = params.getTextPaint();
            this.f7749b = params.getTextDirection();
            this.f7750c = params.getBreakStrategy();
            this.f7751d = params.getHyphenationFrequency();
        }
    }
}
