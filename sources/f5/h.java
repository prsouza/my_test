package f5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.activity.result.d;
import org.slf4j.helpers.MessageFormatter;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public long f4998a;

    /* renamed from: b  reason: collision with root package name */
    public long f4999b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f5000c;

    /* renamed from: d  reason: collision with root package name */
    public int f5001d;

    /* renamed from: e  reason: collision with root package name */
    public int f5002e;

    public h(long j10) {
        this.f5000c = null;
        this.f5001d = 0;
        this.f5002e = 1;
        this.f4998a = j10;
        this.f4999b = 150;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f4998a);
        animator.setDuration(this.f4999b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f5001d);
            valueAnimator.setRepeatMode(this.f5002e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f5000c;
        return timeInterpolator != null ? timeInterpolator : a.f4985b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f4998a == hVar.f4998a && this.f4999b == hVar.f4999b && this.f5001d == hVar.f5001d && this.f5002e == hVar.f5002e) {
            return b().getClass().equals(hVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f4998a;
        long j11 = this.f4999b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f5001d) * 31) + this.f5002e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(10);
        sb2.append(h.class.getName());
        sb2.append(MessageFormatter.DELIM_START);
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f4998a);
        sb2.append(" duration: ");
        sb2.append(this.f4999b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f5001d);
        sb2.append(" repeatMode: ");
        return d.c(sb2, this.f5002e, "}\n");
    }

    public h(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f5001d = 0;
        this.f5002e = 1;
        this.f4998a = j10;
        this.f4999b = j11;
        this.f5000c = timeInterpolator;
    }
}
