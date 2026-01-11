package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import io.nodle.cash.R;
import n0.c;
import n0.p;
import n0.x;
import p0.a;
import p0.b;
import p0.d;
import q0.g;
import q0.h;

public class m extends EditText implements p {

    /* renamed from: a  reason: collision with root package name */
    public final f f1332a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f1333b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f1334c;

    /* renamed from: s  reason: collision with root package name */
    public final h f1335s;

    /* renamed from: t  reason: collision with root package name */
    public final n f1336t;

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public final c a(c cVar) {
        return this.f1335s.a(this, cVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1332a;
        if (fVar != null) {
            fVar.a();
        }
        d0 d0Var = this.f1333b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1332a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1332a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public TextClassifier getTextClassifier() {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f1334c) == null) {
            return super.getTextClassifier();
        }
        return c0Var.a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        String[] i10;
        InputConnection cVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1333b.h(this, onCreateInputConnection, editorInfo);
        y.c.X(onCreateInputConnection, editorInfo, this);
        if (!(onCreateInputConnection == null || (i = Build.VERSION.SDK_INT) > 30 || (i10 = x.i(this)) == null)) {
            a.c(editorInfo, i10);
            d dVar = new d(this);
            if (i >= 25) {
                cVar = new b(onCreateInputConnection, dVar);
            } else if (a.a(editorInfo).length != 0) {
                cVar = new p0.c(onCreateInputConnection, dVar);
            }
            onCreateInputConnection = cVar;
        }
        return this.f1336t.c(onCreateInputConnection, editorInfo);
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && x.i(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = x.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i) {
        ClipData clipData;
        c.b bVar;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        if (i10 < 31 && x.i(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                clipData = null;
            } else {
                clipData = clipboardManager.getPrimaryClip();
            }
            if (clipData != null && clipData.getItemCount() > 0) {
                if (i10 >= 31) {
                    bVar = new c.a(clipData, 1);
                } else {
                    bVar = new c.C0162c(clipData, 1);
                }
                if (i != 16908322) {
                    i11 = 1;
                }
                bVar.c(i11);
                x.l(this, bVar.a());
            }
            i11 = 1;
        }
        if (i11 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1332a;
        if (fVar != null) {
            fVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f1332a;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.g(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1336t.d(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1336t.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f1332a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1332a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.f1333b;
        if (d0Var != null) {
            d0Var.g(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f1334c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0Var.f1190b = textClassifier;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.editTextStyle);
        a1.a(context);
        y0.a(this, getContext());
        f fVar = new f(this);
        this.f1332a = fVar;
        fVar.d(attributeSet, R.attr.editTextStyle);
        d0 d0Var = new d0(this);
        this.f1333b = d0Var;
        d0Var.f(attributeSet, R.attr.editTextStyle);
        d0Var.b();
        this.f1334c = new c0(this);
        this.f1335s = new h();
        n nVar = new n(this);
        this.f1336t = nVar;
        nVar.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener a10 = nVar.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
            }
        }
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
