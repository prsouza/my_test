package io.sentry;

import com.github.mikephil.charting.BuildConfig;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

final class NoOpSerializer implements ISerializer {
    private static final NoOpSerializer instance = new NoOpSerializer();

    private NoOpSerializer() {
    }

    public static NoOpSerializer getInstance() {
        return instance;
    }

    public <T> T deserialize(Reader reader, Class<T> cls) {
        return null;
    }

    public SentryEnvelope deserializeEnvelope(InputStream inputStream) {
        return null;
    }

    public String serialize(Map<String, Object> map) {
        return BuildConfig.FLAVOR;
    }

    public void serialize(SentryEnvelope sentryEnvelope, OutputStream outputStream) {
    }

    public <T> void serialize(T t10, Writer writer) {
    }
}
