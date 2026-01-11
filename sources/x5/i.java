package x5;

import android.widget.Checkable;
import x5.i;

public interface i<T extends i<T>> extends Checkable {

    public interface a<C> {
    }

    int getId();

    void setInternalOnCheckedChangeListener(a<T> aVar);
}
