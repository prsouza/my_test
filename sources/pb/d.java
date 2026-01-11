package pb;

import ab.b;
import ab.h;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.mikephil.charting.BuildConfig;
import ge.d0;
import io.nodle.cash.R;
import java.util.Objects;
import je.f;
import je.o;
import l6.b1;
import md.m;
import pb.c;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.view.fragment.home.FlashFragment$manageFlash$1", f = "FlashFragment.kt", l = {48}, m = "invokeSuspend")
public final class d extends i implements p<d0, pd.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9825a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f9826b;

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f9827a;

        /* renamed from: pb.d$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0190a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f9828a;

            static {
                int[] iArr = new int[h.values().length];
                iArr[h.MAIN_TEXT.ordinal()] = 1;
                iArr[h.SUB_TEXT.ordinal()] = 2;
                iArr[h.ALERT_TEXT.ordinal()] = 3;
                iArr[h.NONE.ordinal()] = 4;
                f9828a = iArr;
            }
        }

        public a(c cVar) {
            this.f9827a = cVar;
        }

        public final Object a(Object obj, pd.d dVar) {
            md.f fVar = (md.f) obj;
            int i = C0190a.f9828a[((h) fVar.f8541a).ordinal()];
            boolean z = true;
            if (i == 1) {
                c cVar = this.f9827a;
                String str = (String) fVar.f8542b;
                c.a aVar = c.f9820c;
                Objects.requireNonNull(cVar);
                String str2 = c.f9821s;
                androidx.fragment.app.m.g("Main: ", str, str2);
                if (str != null) {
                    z = e6.e.r(str, BuildConfig.FLAVOR);
                }
                if (z) {
                    TextView textView = (TextView) cVar.b(R.id.mainTextView);
                    if (textView != null) {
                        textView.setText(BuildConfig.FLAVOR);
                    }
                    TextView textView2 = (TextView) cVar.b(R.id.mainTextView);
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                } else {
                    TextView textView3 = (TextView) cVar.b(R.id.mainTextView);
                    if (textView3 != null) {
                        textView3.setText(str);
                    }
                    TextView textView4 = (TextView) cVar.b(R.id.mainTextView);
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                }
                ab.f fVar2 = ab.f.f215a;
                if (ab.f.f228p != b.NONE) {
                    b bVar = ab.f.f228p;
                    Log.d(str2, "FlashInfoAction " + bVar);
                    a aVar2 = new a(cVar, 0);
                    ImageView imageView = (ImageView) cVar.b(R.id.infoImageView);
                    if (imageView != null) {
                        imageView.setOnClickListener(aVar2);
                    }
                    ImageView imageView2 = (ImageView) cVar.b(R.id.infoImageView);
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                } else {
                    ImageView imageView3 = (ImageView) cVar.b(R.id.infoImageView);
                    if (imageView3 != null) {
                        imageView3.setOnClickListener((View.OnClickListener) null);
                    }
                    ImageView imageView4 = (ImageView) cVar.b(R.id.infoImageView);
                    if (imageView4 != null) {
                        imageView4.setVisibility(8);
                    }
                }
            } else if (i == 2) {
                c cVar2 = this.f9827a;
                String str3 = (String) fVar.f8542b;
                c.a aVar3 = c.f9820c;
                Objects.requireNonNull(cVar2);
                androidx.fragment.app.m.g("Sub: ", str3, c.f9821s);
                if (str3 != null) {
                    z = e6.e.r(str3, BuildConfig.FLAVOR);
                }
                if (z) {
                    TextView textView5 = (TextView) cVar2.b(R.id.subTextView);
                    if (textView5 != null) {
                        textView5.setText(BuildConfig.FLAVOR);
                    }
                    TextView textView6 = (TextView) cVar2.b(R.id.subTextView);
                    if (textView6 != null) {
                        textView6.setVisibility(8);
                    }
                } else {
                    TextView textView7 = (TextView) cVar2.b(R.id.subTextView);
                    if (textView7 != null) {
                        textView7.setText(str3);
                    }
                    TextView textView8 = (TextView) cVar2.b(R.id.subTextView);
                    if (textView8 != null) {
                        textView8.setVisibility(0);
                    }
                }
            } else if (i == 3) {
                c cVar3 = this.f9827a;
                String str4 = (String) fVar.f8542b;
                c.a aVar4 = c.f9820c;
                Objects.requireNonNull(cVar3);
                String str5 = c.f9821s;
                androidx.fragment.app.m.g("Alert: ", str4, str5);
                if (str4 != null) {
                    z = e6.e.r(str4, BuildConfig.FLAVOR);
                }
                if (z) {
                    TextView textView9 = (TextView) cVar3.b(R.id.alertTextView);
                    if (textView9 != null) {
                        textView9.setText(BuildConfig.FLAVOR);
                    }
                    TextView textView10 = (TextView) cVar3.b(R.id.alertTextView);
                    if (textView10 != null) {
                        textView10.setVisibility(8);
                    }
                } else {
                    TextView textView11 = (TextView) cVar3.b(R.id.alertTextView);
                    if (textView11 != null) {
                        textView11.setText(str4);
                    }
                    TextView textView12 = (TextView) cVar3.b(R.id.alertTextView);
                    if (textView12 != null) {
                        textView12.setVisibility(0);
                    }
                }
                ab.f fVar3 = ab.f.f215a;
                if (ab.f.f232t != ab.a.NONE) {
                    ab.a aVar5 = ab.f.f232t;
                    Log.d(str5, "FlashButtonAction " + aVar5);
                    Button button = (Button) cVar3.b(R.id.alertButton);
                    if (button != null) {
                        button.setText(ab.f.f231s);
                    }
                    Button button2 = (Button) cVar3.b(R.id.alertButton);
                    if (button2 != null) {
                        button2.setVisibility(0);
                    }
                    Button button3 = (Button) cVar3.b(R.id.alertButton);
                    if (button3 != null) {
                        button3.setOnClickListener(new b(cVar3, 0));
                    }
                } else {
                    Button button4 = (Button) cVar3.b(R.id.alertButton);
                    if (button4 != null) {
                        button4.setText(BuildConfig.FLAVOR);
                    }
                    Button button5 = (Button) cVar3.b(R.id.alertButton);
                    if (button5 != null) {
                        button5.setVisibility(8);
                    }
                    Button button6 = (Button) cVar3.b(R.id.alertButton);
                    if (button6 != null) {
                        button6.setOnClickListener((View.OnClickListener) null);
                    }
                }
            }
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar, pd.d<? super d> dVar) {
        super(2, dVar);
        this.f9826b = cVar;
    }

    public final pd.d<m> create(Object obj, pd.d<?> dVar) {
        return new d(this.f9826b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f9825a;
        if (i == 0) {
            b1.w(obj);
            ab.f fVar = ab.f.f215a;
            o oVar = ab.f.f225m;
            a aVar2 = new a(this.f9826b);
            this.f9825a = 1;
            if (oVar.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            b1.w(obj);
        }
        throw new md.b();
    }
}
