package l6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import o6.u;

public final class d0 extends u {

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap f7813a = new TreeMap();

    public d0(File file, File file2) throws IOException {
        ArrayList arrayList = (ArrayList) j2.a(file, file2);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            long j10 = 0;
            while (it.hasNext()) {
                File file3 = (File) it.next();
                this.f7813a.put(Long.valueOf(j10), file3);
                j10 += file3.length();
            }
            return;
        }
        throw new t0(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    public final long a() {
        Map.Entry lastEntry = this.f7813a.lastEntry();
        return ((File) lastEntry.getValue()).length() + ((Long) lastEntry.getKey()).longValue();
    }

    public final InputStream c(long j10, long j11) throws IOException {
        if (j10 < 0 || j11 < 0) {
            throw new t0(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j10), Long.valueOf(j11)}));
        }
        long j12 = j10 + j11;
        if (j12 <= a()) {
            Long l10 = (Long) this.f7813a.floorKey(Long.valueOf(j10));
            Long l11 = (Long) this.f7813a.floorKey(Long.valueOf(j12));
            if (l10.equals(l11)) {
                return new c0(e(j10, l10), j11);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(e(j10, l10));
            Collection values = this.f7813a.subMap(l10, false, l11, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new o1(Collections.enumeration(values)));
            }
            arrayList.add(new c0(new FileInputStream((File) this.f7813a.get(l11)), j11 - (l11.longValue() - j10)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new t0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(a()), Long.valueOf(j12)}));
    }

    public final void close() {
    }

    public final InputStream e(long j10, Long l10) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f7813a.get(l10));
        if (fileInputStream.skip(j10 - l10.longValue()) == j10 - l10.longValue()) {
            return fileInputStream;
        }
        throw new t0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l10}));
    }
}
