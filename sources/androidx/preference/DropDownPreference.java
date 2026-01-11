package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import io.nodle.cash.R;

public class DropDownPreference extends ListPreference {
    public final ArrayAdapter E;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.E = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.B;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.E.add(charSequence.toString());
            }
        }
    }

    public final void h() {
        ArrayAdapter arrayAdapter = this.E;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
