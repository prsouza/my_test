package x0;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.util.Objects;
import w0.b;

public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f12737a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12738b;

    public static class a {
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0080, code lost:
            if (r12 != false) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0090;
         */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x007c A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.view.inputmethod.InputConnection r8, android.text.Editable r9, int r10, int r11, boolean r12) {
            /*
                r7 = this;
                java.lang.Object r0 = androidx.emoji2.text.d.i
                r0 = 0
                r1 = 1
                if (r9 == 0) goto L_0x00fb
                if (r8 != 0) goto L_0x000a
                goto L_0x00fb
            L_0x000a:
                if (r10 < 0) goto L_0x00fb
                if (r11 >= 0) goto L_0x0010
                goto L_0x00fb
            L_0x0010:
                int r2 = android.text.Selection.getSelectionStart(r9)
                int r3 = android.text.Selection.getSelectionEnd(r9)
                r4 = -1
                if (r2 == r4) goto L_0x0022
                if (r3 == r4) goto L_0x0022
                if (r2 == r3) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r5 = r0
                goto L_0x0023
            L_0x0022:
                r5 = r1
            L_0x0023:
                if (r5 == 0) goto L_0x0027
                goto L_0x00fb
            L_0x0027:
                if (r12 == 0) goto L_0x00b1
                int r10 = java.lang.Math.max(r10, r0)
                int r12 = r9.length()
                if (r2 < 0) goto L_0x0068
                if (r12 >= r2) goto L_0x0036
                goto L_0x0068
            L_0x0036:
                if (r10 >= 0) goto L_0x0039
                goto L_0x0068
            L_0x0039:
                r12 = r0
            L_0x003a:
                if (r10 != 0) goto L_0x003d
                goto L_0x0069
            L_0x003d:
                int r2 = r2 + -1
                if (r2 >= 0) goto L_0x0046
                if (r12 == 0) goto L_0x0044
                goto L_0x0068
            L_0x0044:
                r2 = r0
                goto L_0x0069
            L_0x0046:
                char r5 = r9.charAt(r2)
                if (r12 == 0) goto L_0x0056
                boolean r12 = java.lang.Character.isHighSurrogate(r5)
                if (r12 != 0) goto L_0x0053
                goto L_0x0068
            L_0x0053:
                int r10 = r10 + -1
                goto L_0x0039
            L_0x0056:
                boolean r6 = java.lang.Character.isSurrogate(r5)
                if (r6 != 0) goto L_0x005f
                int r10 = r10 + -1
                goto L_0x003a
            L_0x005f:
                boolean r12 = java.lang.Character.isHighSurrogate(r5)
                if (r12 == 0) goto L_0x0066
                goto L_0x0068
            L_0x0066:
                r12 = r1
                goto L_0x003a
            L_0x0068:
                r2 = r4
            L_0x0069:
                int r10 = java.lang.Math.max(r11, r0)
                int r11 = r9.length()
                if (r3 < 0) goto L_0x00ab
                if (r11 >= r3) goto L_0x0076
                goto L_0x00ab
            L_0x0076:
                if (r10 >= 0) goto L_0x0079
                goto L_0x00ab
            L_0x0079:
                r12 = r0
            L_0x007a:
                if (r10 != 0) goto L_0x007e
                r11 = r3
                goto L_0x00ac
            L_0x007e:
                if (r3 < r11) goto L_0x0083
                if (r12 == 0) goto L_0x00ac
                goto L_0x00ab
            L_0x0083:
                char r5 = r9.charAt(r3)
                if (r12 == 0) goto L_0x0095
                boolean r12 = java.lang.Character.isLowSurrogate(r5)
                if (r12 != 0) goto L_0x0090
                goto L_0x00ab
            L_0x0090:
                int r10 = r10 + -1
                int r3 = r3 + 1
                goto L_0x0079
            L_0x0095:
                boolean r6 = java.lang.Character.isSurrogate(r5)
                if (r6 != 0) goto L_0x00a0
                int r10 = r10 + -1
                int r3 = r3 + 1
                goto L_0x007a
            L_0x00a0:
                boolean r12 = java.lang.Character.isLowSurrogate(r5)
                if (r12 == 0) goto L_0x00a7
                goto L_0x00ab
            L_0x00a7:
                int r3 = r3 + 1
                r12 = r1
                goto L_0x007a
            L_0x00ab:
                r11 = r4
            L_0x00ac:
                if (r2 == r4) goto L_0x00fb
                if (r11 != r4) goto L_0x00bf
                goto L_0x00fb
            L_0x00b1:
                int r2 = r2 - r10
                int r2 = java.lang.Math.max(r2, r0)
                int r3 = r3 + r11
                int r10 = r9.length()
                int r11 = java.lang.Math.min(r3, r10)
            L_0x00bf:
                java.lang.Class<androidx.emoji2.text.i> r10 = androidx.emoji2.text.i.class
                java.lang.Object[] r10 = r9.getSpans(r2, r11, r10)
                androidx.emoji2.text.i[] r10 = (androidx.emoji2.text.i[]) r10
                if (r10 == 0) goto L_0x00fb
                int r12 = r10.length
                if (r12 <= 0) goto L_0x00fb
                int r12 = r10.length
                r3 = r0
            L_0x00ce:
                if (r3 >= r12) goto L_0x00e5
                r4 = r10[r3]
                int r5 = r9.getSpanStart(r4)
                int r4 = r9.getSpanEnd(r4)
                int r2 = java.lang.Math.min(r5, r2)
                int r11 = java.lang.Math.max(r4, r11)
                int r3 = r3 + 1
                goto L_0x00ce
            L_0x00e5:
                int r10 = java.lang.Math.max(r2, r0)
                int r12 = r9.length()
                int r11 = java.lang.Math.min(r11, r12)
                r8.beginBatchEdit()
                r9.delete(r10, r11)
                r8.endBatchEdit()
                r0 = r1
            L_0x00fb:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.c.a.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        a aVar = new a();
        this.f12737a = textView;
        this.f12738b = aVar;
        if (d.c()) {
            d a10 = d.a();
            if (a10.d() && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                d.a aVar2 = a10.f1704e;
                Objects.requireNonNull(aVar2);
                Bundle bundle = editorInfo.extras;
                b bVar = aVar2.f1708c.f1754a;
                int a11 = bVar.a(4);
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a11 != 0 ? bVar.f12539b.getInt(a11 + bVar.f12538a) : 0);
                Bundle bundle2 = editorInfo.extras;
                Objects.requireNonNull(aVar2.f1710a);
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    public final boolean deleteSurroundingText(int i, int i10) {
        return this.f12738b.a(this, this.f12737a.getEditableText(), i, i10, false) || super.deleteSurroundingText(i, i10);
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i10) {
        return this.f12738b.a(this, this.f12737a.getEditableText(), i, i10, true) || super.deleteSurroundingTextInCodePoints(i, i10);
    }
}
