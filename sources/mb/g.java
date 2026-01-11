package mb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import e6.e;
import io.nodle.cash.R;
import s8.b;

public final class g extends AnimatorListenerAdapter {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f8529s = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f8530a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8531b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f8532c = false;

    public g(c cVar, String str) {
        this.f8530a = cVar;
        this.f8531b = str;
    }

    public final void onAnimationEnd(Animator animator) {
        e.D(animator, "animation");
        super.onAnimationEnd(animator);
        ProgressBar progressBar = (ProgressBar) this.f8530a.b(R.id.transactionProgressBar);
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = (TextView) this.f8530a.b(R.id.progressTextView);
        if (textView != null) {
            textView.setText(this.f8531b);
        }
        if (this.f8532c) {
            Handler handler = new Handler(Looper.getMainLooper());
            c cVar = this.f8530a;
            handler.postDelayed(new b(cVar, 1), cVar.f8517a);
            return;
        }
        Button button = (Button) this.f8530a.b(R.id.doneButton);
        if (button != null) {
            button.setText(this.f8530a.getString(R.string.done));
        }
        Button button2 = (Button) this.f8530a.b(R.id.doneButton);
        if (button2 != null) {
            button2.setOnClickListener(new f(this.f8530a, 0));
        }
        Button button3 = (Button) this.f8530a.b(R.id.doneButton);
        if (button3 != null) {
            button3.setVisibility(0);
        }
    }
}
