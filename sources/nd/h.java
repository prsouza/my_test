package nd;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class h extends g {
    public static final <T> void T0(List<T> list, Comparator<? super T> comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
