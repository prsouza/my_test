package l1;

import android.database.Cursor;
import android.database.SQLException;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

public interface a extends Closeable {
    boolean M();

    boolean U();

    void Y();

    void Z(String str, Object[] objArr) throws SQLException;

    void c0();

    String getPath();

    void h();

    void i();

    boolean isOpen();

    Cursor k(d dVar);

    List<Pair<String, String>> o();

    Cursor o0(String str);

    void q(String str) throws SQLException;

    e z(String str);
}
