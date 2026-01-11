package io.sentry;

import io.sentry.vendor.Base64;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import org.slf4j.helpers.MessageFormatter;

public final class TraceStateHeader {
    public static final String TRACE_STATE_HEADER = "tracestate";
    private static final Charset UTF8_CHARSET = Charset.forName("UTF-8");
    private final String value;

    public TraceStateHeader(String str) {
        this.value = str;
    }

    public static String base64decode(String str) {
        return new String(Base64.decode(str, 3), UTF8_CHARSET);
    }

    public static String base64encode(String str) {
        return Base64.encodeToString(str.getBytes(UTF8_CHARSET), 3);
    }

    public static TraceStateHeader fromTraceState(TraceState traceState, ISerializer iSerializer, ILogger iLogger) {
        return new TraceStateHeader(base64encode(toJson(traceState, iSerializer, iLogger)));
    }

    private static String toJson(TraceState traceState, ISerializer iSerializer, ILogger iLogger) {
        StringWriter stringWriter = new StringWriter();
        try {
            iSerializer.serialize(traceState, (Writer) stringWriter);
            return stringWriter.toString();
        } catch (IOException e10) {
            iLogger.log(SentryLevel.ERROR, "Failed to serialize trace state header", (Throwable) e10);
            return MessageFormatter.DELIM_STR;
        }
    }

    public String getName() {
        return TRACE_STATE_HEADER;
    }

    public String getValue() {
        return this.value;
    }
}
