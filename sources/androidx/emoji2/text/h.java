package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.d;
import androidx.emoji2.text.o;
import g0.c;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final d.i f1726a;

    /* renamed from: b  reason: collision with root package name */
    public final o f1727b;

    /* renamed from: c  reason: collision with root package name */
    public d.C0014d f1728c;

    public static class a implements d.C0014d {

        /* renamed from: b  reason: collision with root package name */
        public static final ThreadLocal<StringBuilder> f1729b = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f1730a;

        public a() {
            TextPaint textPaint = new TextPaint();
            this.f1730a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        public final boolean a(CharSequence charSequence, int i, int i10) {
            ThreadLocal<StringBuilder> threadLocal = f1729b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = threadLocal.get();
            sb2.setLength(0);
            while (i < i10) {
                sb2.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = this.f1730a;
            String sb3 = sb2.toString();
            int i11 = c.f5207a;
            return textPaint.hasGlyph(sb3);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1731a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final o.a f1732b;

        /* renamed from: c  reason: collision with root package name */
        public o.a f1733c;

        /* renamed from: d  reason: collision with root package name */
        public o.a f1734d;

        /* renamed from: e  reason: collision with root package name */
        public int f1735e;

        /* renamed from: f  reason: collision with root package name */
        public int f1736f;

        public b(o.a aVar) {
            this.f1732b = aVar;
            this.f1733c = aVar;
        }

        public final int a(int i) {
            SparseArray<o.a> sparseArray = this.f1733c.f1758a;
            o.a aVar = sparseArray == null ? null : sparseArray.get(i);
            int i10 = 3;
            if (this.f1731a != 2) {
                if (aVar == null) {
                    b();
                    i10 = 1;
                    this.f1735e = i;
                    return i10;
                }
                this.f1731a = 2;
                this.f1733c = aVar;
                this.f1736f = 1;
            } else if (aVar != null) {
                this.f1733c = aVar;
                this.f1736f++;
            } else {
                boolean z = false;
                if (i == 65038) {
                    b();
                } else {
                    if (i == 65039) {
                        z = true;
                    }
                    if (!z) {
                        o.a aVar2 = this.f1733c;
                        if (aVar2.f1759b != null) {
                            if (this.f1736f != 1) {
                                this.f1734d = aVar2;
                                b();
                            } else if (c()) {
                                this.f1734d = this.f1733c;
                                b();
                            } else {
                                b();
                            }
                            this.f1735e = i;
                            return i10;
                        }
                        b();
                    }
                }
                i10 = 1;
                this.f1735e = i;
                return i10;
            }
            i10 = 2;
            this.f1735e = i;
            return i10;
        }

        public final void b() {
            this.f1731a = 1;
            this.f1733c = this.f1732b;
            this.f1736f = 0;
        }

        public final boolean c() {
            w0.a e10 = this.f1733c.f1759b.e();
            int a10 = e10.a(6);
            if ((a10 == 0 || e10.f12539b.get(a10 + e10.f12538a) == 0) ? false : true) {
                return true;
            }
            return this.f1735e == 65039;
        }
    }

    public h(o oVar, d.i iVar, d.C0014d dVar) {
        this.f1726a = iVar;
        this.f1727b = oVar;
        this.f1728c = dVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        i[] iVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            int length = iVarArr.length;
            int i = 0;
            while (i < length) {
                i iVar = iVarArr[i];
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i, int i10, g gVar) {
        if (gVar.f1725c == 0) {
            d.C0014d dVar = this.f1728c;
            w0.a e10 = gVar.e();
            int a10 = e10.a(8);
            if (a10 != 0) {
                e10.f12539b.getShort(a10 + e10.f12538a);
            }
            gVar.f1725c = ((a) dVar).a(charSequence, i, i10) ? 2 : 1;
        }
        if (gVar.f1725c == 2) {
            return true;
        }
        return false;
    }
}
