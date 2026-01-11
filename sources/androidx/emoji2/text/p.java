package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import c3.k;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class p extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f1760a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f1761b = new ArrayList();

    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final Object f1762a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicInteger f1763b = new AtomicInteger(0);

        public a(Object obj) {
            this.f1762a = obj;
        }

        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f1762a).afterTextChanged(editable);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
            ((TextWatcher) this.f1762a).beforeTextChanged(charSequence, i, i10, i11);
        }

        public final void onSpanAdded(Spannable spannable, Object obj, int i, int i10) {
            if (this.f1763b.get() <= 0 || !(obj instanceof i)) {
                ((SpanWatcher) this.f1762a).onSpanAdded(spannable, obj, i, i10);
            }
        }

        public final void onSpanChanged(Spannable spannable, Object obj, int i, int i10, int i11, int i12) {
            if (this.f1763b.get() <= 0 || !(obj instanceof i)) {
                ((SpanWatcher) this.f1762a).onSpanChanged(spannable, obj, i, i10, i11, i12);
            }
        }

        public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i10) {
            if (this.f1763b.get() <= 0 || !(obj instanceof i)) {
                ((SpanWatcher) this.f1762a).onSpanRemoved(spannable, obj, i, i10);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
            ((TextWatcher) this.f1762a).onTextChanged(charSequence, i, i10, i11);
        }
    }

    public p(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        k.S(cls, "watcherClass cannot be null");
        this.f1760a = cls;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<androidx.emoji2.text.p$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<androidx.emoji2.text.p$a>, java.util.ArrayList] */
    public final void a() {
        for (int i = 0; i < this.f1761b.size(); i++) {
            ((a) this.f1761b.get(i)).f1763b.incrementAndGet();
        }
    }

    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<androidx.emoji2.text.p$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<androidx.emoji2.text.p$a>, java.util.ArrayList] */
    public final void b() {
        f();
        for (int i = 0; i < this.f1761b.size(); i++) {
            ((a) this.f1761b.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<androidx.emoji2.text.p$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<androidx.emoji2.text.p$a>, java.util.ArrayList] */
    public final a c(Object obj) {
        for (int i = 0; i < this.f1761b.size(); i++) {
            a aVar = (a) this.f1761b.get(i);
            if (aVar.f1762a == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean d(Class<?> cls) {
        return this.f1760a == cls;
    }

    public final Editable delete(int i, int i10) {
        super.delete(i, i10);
        return this;
    }

    public final boolean e(Object obj) {
        return obj != null && d(obj.getClass());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<androidx.emoji2.text.p$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<androidx.emoji2.text.p$a>, java.util.ArrayList] */
    public final void f() {
        for (int i = 0; i < this.f1761b.size(); i++) {
            ((a) this.f1761b.get(i)).f1763b.decrementAndGet();
        }
    }

    public final int getSpanEnd(Object obj) {
        a c10;
        if (e(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        a c10;
        if (e(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        a c10;
        if (e(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanStart(obj);
    }

    public final <T> T[] getSpans(int i, int i10, Class<T> cls) {
        if (!d(cls)) {
            return super.getSpans(i, i10, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i, i10, a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            tArr[i11] = aVarArr[i11].f1762a;
        }
        return tArr;
    }

    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final int nextSpanTransition(int i, int i10, Class<a> cls) {
        if (cls == null || d(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i, i10, cls);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<androidx.emoji2.text.p$a>, java.util.ArrayList] */
    public final void removeSpan(Object obj) {
        Object obj2;
        if (e(obj)) {
            obj2 = c(obj);
            if (obj2 != null) {
                obj = obj2;
            }
        } else {
            obj2 = null;
        }
        super.removeSpan(obj);
        if (obj2 != null) {
            this.f1761b.remove(obj2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<androidx.emoji2.text.p$a>, java.util.ArrayList] */
    public final void setSpan(Object obj, int i, int i10, int i11) {
        if (e(obj)) {
            Object aVar = new a(obj);
            this.f1761b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i10, i11);
    }

    public final CharSequence subSequence(int i, int i10) {
        return new p(this.f1760a, this, i, i10);
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m1append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder m6delete(int i, int i10) {
        super.delete(i, i10);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m7insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m4append(CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return this;
    }

    public final Editable insert(int i, CharSequence charSequence, int i10, int i11) {
        super.insert(i, charSequence, i10, i11);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i10, CharSequence charSequence) {
        a();
        super.replace(i, i10, charSequence);
        f();
        return this;
    }

    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m8insert(int i, CharSequence charSequence, int i10, int i11) {
        super.insert(i, charSequence, i10, i11);
        return this;
    }

    public p(Class<?> cls, CharSequence charSequence, int i, int i10) {
        super(charSequence, i, i10);
        k.S(cls, "watcherClass cannot be null");
        this.f1760a = cls;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m0append(char c10) {
        super.append(c10);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m3append(char c10) throws IOException {
        super.append(c10);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i, i10, charSequence, i11, i12);
        f();
        return this;
    }

    public final Editable append(CharSequence charSequence, int i, int i10) {
        super.append(charSequence, i, i10);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m2append(CharSequence charSequence, int i, int i10) {
        super.append(charSequence, i, i10);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m5append(CharSequence charSequence, int i, int i10) throws IOException {
        super.append(charSequence, i, i10);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
