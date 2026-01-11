package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import h.l;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;

public final class AlertController {
    public View A;
    public ListAdapter B;
    public int C = -1;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public c K;
    public final a L = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f817a;

    /* renamed from: b  reason: collision with root package name */
    public final l f818b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f819c;

    /* renamed from: d  reason: collision with root package name */
    public final int f820d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f821e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f822f;
    public RecycleListView g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f823h = false;
    public Button i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f824j;

    /* renamed from: k  reason: collision with root package name */
    public Message f825k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f826l;

    /* renamed from: m  reason: collision with root package name */
    public Button f827m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f828n;

    /* renamed from: o  reason: collision with root package name */
    public Message f829o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f830p;

    /* renamed from: q  reason: collision with root package name */
    public Button f831q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f832r;

    /* renamed from: s  reason: collision with root package name */
    public Message f833s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f834t;

    /* renamed from: u  reason: collision with root package name */
    public NestedScrollView f835u;

    /* renamed from: v  reason: collision with root package name */
    public int f836v = 0;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f837w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f838x;

    /* renamed from: y  reason: collision with root package name */
    public TextView f839y;
    public TextView z;

    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        public final int f840a;

        /* renamed from: b  reason: collision with root package name */
        public final int f841b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ad.c.N);
            this.f841b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f840a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f833s;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.i
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f825k
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f827m
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f829o
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f831q
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f833s
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                androidx.appcompat.app.AlertController$c r0 = r3.K
                r1 = 1
                h.l r3 = r3.f818b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f843a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f844b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f845c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f846d;

        /* renamed from: e  reason: collision with root package name */
        public View f847e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f848f;
        public CharSequence g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnClickListener f849h;
        public CharSequence i;

        /* renamed from: j  reason: collision with root package name */
        public DialogInterface.OnClickListener f850j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f851k;

        /* renamed from: l  reason: collision with root package name */
        public DialogInterface.OnKeyListener f852l;

        /* renamed from: m  reason: collision with root package name */
        public ListAdapter f853m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f854n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f855o;

        /* renamed from: p  reason: collision with root package name */
        public int f856p = -1;

        public b(Context context) {
            this.f843a = context;
            this.f851k = true;
            this.f844b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DialogInterface> f857a;

        public c(DialogInterface dialogInterface) {
            this.f857a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f857a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i) {
            super(context, i, 16908308, (Object[]) null);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, l lVar, Window window) {
        this.f817a = context;
        this.f818b = lVar;
        this.f819c = window;
        this.K = new c(lVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, ad.c.f340y, R.attr.alertDialogStyle, 0);
        this.D = obtainStyledAttributes.getResourceId(0, 0);
        this.E = obtainStyledAttributes.getResourceId(2, 0);
        this.F = obtainStyledAttributes.getResourceId(4, 0);
        this.G = obtainStyledAttributes.getResourceId(5, 0);
        this.H = obtainStyledAttributes.getResourceId(7, 0);
        this.I = obtainStyledAttributes.getResourceId(3, 0);
        this.J = obtainStyledAttributes.getBoolean(6, true);
        this.f820d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        lVar.g();
    }

    public static void b(View view, View view2, View view3) {
        int i10 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i10 = 4;
            }
            view3.setVisibility(i10);
        }
    }

    public final void a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.K.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f832r = charSequence;
            this.f833s = obtainMessage;
            this.f834t = null;
        } else if (i10 == -2) {
            this.f828n = charSequence;
            this.f829o = obtainMessage;
            this.f830p = null;
        } else if (i10 == -1) {
            this.f824j = charSequence;
            this.f825k = obtainMessage;
            this.f826l = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
