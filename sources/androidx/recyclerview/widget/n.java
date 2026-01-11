package androidx.recyclerview.widget;

import a.a;
import org.slf4j.helpers.MessageFormatter;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2570a = true;

    /* renamed from: b  reason: collision with root package name */
    public int f2571b;

    /* renamed from: c  reason: collision with root package name */
    public int f2572c;

    /* renamed from: d  reason: collision with root package name */
    public int f2573d;

    /* renamed from: e  reason: collision with root package name */
    public int f2574e;

    /* renamed from: f  reason: collision with root package name */
    public int f2575f = 0;
    public int g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2576h;
    public boolean i;

    public final String toString() {
        StringBuilder d10 = a.d("LayoutState{mAvailable=");
        d10.append(this.f2571b);
        d10.append(", mCurrentPosition=");
        d10.append(this.f2572c);
        d10.append(", mItemDirection=");
        d10.append(this.f2573d);
        d10.append(", mLayoutDirection=");
        d10.append(this.f2574e);
        d10.append(", mStartLine=");
        d10.append(this.f2575f);
        d10.append(", mEndLine=");
        d10.append(this.g);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
