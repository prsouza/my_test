package j1;

import a8.a;
import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.o;
import com.github.mikephil.charting.BuildConfig;
import java.util.Arrays;

public final class b {
    public static int a(Cursor cursor, String str) {
        String str2;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + "`");
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    String c10 = a.c(".", str);
                    String c11 = o.c(".", str, "`");
                    int i = 0;
                    while (true) {
                        if (i >= columnNames.length) {
                            break;
                        }
                        String str3 = columnNames[i];
                        if (str3.length() < str.length() + 2 || (!str3.endsWith(c10) && (str3.charAt(0) != '`' || !str3.endsWith(c11)))) {
                            i++;
                        }
                    }
                    columnIndex = i;
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str2 = BuildConfig.FLAVOR;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
