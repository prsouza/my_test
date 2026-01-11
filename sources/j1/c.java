package j1;

import android.database.Cursor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import l1.a;

public final class c {
    /* JADX INFO: finally extract failed */
    public static void a(a aVar) {
        ArrayList arrayList = new ArrayList();
        m1.a aVar2 = (m1.a) aVar;
        Cursor o02 = aVar2.o0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (o02.moveToNext()) {
            try {
                arrayList.add(o02.getString(0));
            } catch (Throwable th2) {
                o02.close();
                throw th2;
            }
        }
        o02.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("room_fts_content_sync_")) {
                aVar2.q("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static int b(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                fileChannel.close();
                return i;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th2) {
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th2;
        }
    }
}
