package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

public interface ISerializer {
    <T> T deserialize(Reader reader, Class<T> cls);

    SentryEnvelope deserializeEnvelope(InputStream inputStream);

    String serialize(Map<String, Object> map);

    void serialize(SentryEnvelope sentryEnvelope, OutputStream outputStream);

    <T> void serialize(T t10, Writer writer);
}
