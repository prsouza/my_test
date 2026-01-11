package mb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import h1.z;
import io.nodle.cash.R;

public final class e extends AnimatorListenerAdapter {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f8523s = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f8524a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8525b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f8526c = false;

    public e(c cVar, String str) {
        this.f8524a = cVar;
        this.f8525b = str;
    }

    public final void onAnimationEnd(Animator animator) {
        e6.e.D(animator, "animation");
        super.onAnimationEnd(animator);
        ProgressBar progressBar = (ProgressBar) this.f8524a.b(R.id.transactionProgressBar);
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = (TextView) this.f8524a.b(R.id.progressTextView);
        if (textView != null) {
            textView.setText(this.f8525b);
        }
        if (this.f8526c) {
            Handler handler = new Handler(Looper.getMainLooper());
            c cVar = this.f8524a;
            handler.postDelayed(new z(cVar, 1), cVar.f8517a);
            return;
        }
        Button button = (Button) this.f8524a.b(R.id.doneButton);
        if (button != null) {
            button.setText(this.f8524a.getString(R.string.okay));
        }
        Button button2 = (Button) this.f8524a.b(R.id.doneButton);
        if (button2 != null) {
            button2.setOnClickListener(new d(this.f8524a));
        }
        Button button3 = (Button) this.f8524a.b(R.id.doneButton);
        if (button3 != null) {
            button3.setVisibility(0);
        }
    }
}
