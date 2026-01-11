package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Objects;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public TextView f1189a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f1190b;

    public c0(TextView textView) {
        Objects.requireNonNull(textView);
        this.f1189a = textView;
    }

    public final TextClassifier a() {
        TextClassifier textClassifier = this.f1190b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1189a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
