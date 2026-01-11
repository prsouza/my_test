package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p3.w;

public final class c {

    public interface a {
    }

    public interface b {
    }

    public static int a(List<ImageHeaderParser> list, InputStream inputStream, j3.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                int b10 = list.get(i).b(inputStream, bVar);
                if (b10 != -1) {
                    return b10;
                }
                i++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static int b(List<ImageHeaderParser> list, a aVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a10 = ((b) aVar).a(list.get(i));
            if (a10 != -1) {
                return a10;
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser.ImageType c(List<ImageHeaderParser> list, InputStream inputStream, j3.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ImageHeaderParser.ImageType c10 = list.get(i).c(inputStream);
                inputStream.reset();
                if (c10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c10;
                }
                i++;
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ImageHeaderParser.ImageType d(List<ImageHeaderParser> list, b bVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a10 = ((a) bVar).a(list.get(i));
            if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a10;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
