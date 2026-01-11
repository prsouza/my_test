package io.sentry;

import a.b;
import aa.a;
import i2.c;
import i2.j;
import i2.k;
import io.sentry.adapters.CollectionAdapter;
import io.sentry.adapters.ContextsDeserializerAdapter;
import io.sentry.adapters.ContextsSerializerAdapter;
import io.sentry.adapters.DateDeserializerAdapter;
import io.sentry.adapters.DateSerializerAdapter;
import io.sentry.adapters.MapAdapter;
import io.sentry.adapters.OrientationDeserializerAdapter;
import io.sentry.adapters.OrientationSerializerAdapter;
import io.sentry.adapters.SentryIdDeserializerAdapter;
import io.sentry.adapters.SentryIdSerializerAdapter;
import io.sentry.adapters.SentryLevelDeserializerAdapter;
import io.sentry.adapters.SentryLevelSerializerAdapter;
import io.sentry.adapters.SpanIdDeserializerAdapter;
import io.sentry.adapters.SpanIdSerializerAdapter;
import io.sentry.adapters.SpanStatusDeserializerAdapter;
import io.sentry.adapters.SpanStatusSerializerAdapter;
import io.sentry.adapters.TimeZoneDeserializerAdapter;
import io.sentry.adapters.TimeZoneSerializerAdapter;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Device;
import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

public final class GsonSerializer implements ISerializer {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final j gson = provideGson();
    private final SentryOptions options;

    public GsonSerializer(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions object is required.");
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List<i2.a0>, java.util.ArrayList] */
    private j provideGson() {
        Class<SpanStatus> cls = SpanStatus.class;
        Class<SpanId> cls2 = SpanId.class;
        Class<SentryLevel> cls3 = SentryLevel.class;
        Class<Device.DeviceOrientation> cls4 = Device.DeviceOrientation.class;
        Class<SentryId> cls5 = SentryId.class;
        k kVar = new k();
        kVar.f5998c = c.LOWER_CASE_WITH_UNDERSCORES;
        kVar.c(cls5, new SentryIdSerializerAdapter(this.options));
        kVar.c(cls5, new SentryIdDeserializerAdapter(this.options));
        kVar.c(Date.class, new DateSerializerAdapter(this.options));
        kVar.c(Date.class, new DateDeserializerAdapter(this.options));
        kVar.c(TimeZone.class, new TimeZoneSerializerAdapter(this.options));
        kVar.c(TimeZone.class, new TimeZoneDeserializerAdapter(this.options));
        kVar.c(cls4, new OrientationSerializerAdapter(this.options));
        kVar.c(cls4, new OrientationDeserializerAdapter(this.options));
        kVar.c(cls3, new SentryLevelSerializerAdapter(this.options));
        kVar.c(cls3, new SentryLevelDeserializerAdapter(this.options));
        kVar.c(Contexts.class, new ContextsDeserializerAdapter(this.options));
        kVar.c(Contexts.class, new ContextsSerializerAdapter(this.options));
        kVar.f6000e.add(UnknownPropertiesTypeAdapterFactory.get());
        kVar.c(SentryEnvelopeHeader.class, new SentryEnvelopeHeaderAdapter());
        kVar.c(SentryEnvelopeItemHeader.class, new SentryEnvelopeItemHeaderAdapter());
        kVar.c(Session.class, new SessionAdapter(this.options));
        kVar.c(cls2, new SpanIdDeserializerAdapter(this.options));
        kVar.c(cls2, new SpanIdSerializerAdapter(this.options));
        kVar.c(cls, new SpanStatusDeserializerAdapter(this.options));
        kVar.c(cls, new SpanStatusSerializerAdapter(this.options));
        kVar.b(Collection.class, new CollectionAdapter());
        kVar.b(Map.class, new MapAdapter());
        kVar.i = false;
        return kVar.a();
    }

    public <T> T deserialize(Reader reader, Class<T> cls) {
        Objects.requireNonNull(reader, "The Reader object is required.");
        Objects.requireNonNull(cls, "The Class type is required.");
        j jVar = this.gson;
        java.util.Objects.requireNonNull(jVar);
        a aVar = new a(reader);
        aVar.f180b = jVar.f5992l;
        T d10 = jVar.d(aVar, cls);
        j.i(d10, aVar);
        return b.n(cls).cast(d10);
    }

    public SentryEnvelope deserializeEnvelope(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "The InputStream object is required.");
        try {
            return this.options.getEnvelopeReader().read(inputStream);
        } catch (IOException e10) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error deserializing envelope.", (Throwable) e10);
            return null;
        }
    }

    public String serialize(Map<String, Object> map) {
        Objects.requireNonNull(map, "The SentryEnvelope object is required.");
        return this.gson.f(map);
    }

    public void serialize(SentryEnvelope sentryEnvelope, OutputStream outputStream) {
        Objects.requireNonNull(sentryEnvelope, "The SentryEnvelope object is required.");
        Objects.requireNonNull(outputStream, "The Stream object is required.");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, UTF_8));
            try {
                this.gson.k(sentryEnvelope.getHeader(), SentryEnvelopeHeader.class, bufferedWriter);
                bufferedWriter.write("\n");
                for (SentryEnvelopeItem next : sentryEnvelope.getItems()) {
                    byte[] data = next.getData();
                    this.gson.k(next.getHeader(), SentryEnvelopeItemHeader.class, bufferedWriter);
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(data);
                    bufferedWriter.write("\n");
                }
                bufferedWriter.flush();
                bufferedWriter.close();
                bufferedOutputStream.close();
            } catch (Throwable th2) {
                bufferedWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bufferedOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public <T> void serialize(T t10, Writer writer) {
        Objects.requireNonNull(t10, "The entity is required.");
        Objects.requireNonNull(writer, "The Writer object is required.");
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        if (logger.isEnabled(sentryLevel)) {
            this.options.getLogger().log(sentryLevel, "Serializing object: %s", this.gson.f(t10));
        }
        this.gson.k(t10, t10.getClass(), writer);
        writer.flush();
    }
}
