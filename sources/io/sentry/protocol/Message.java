package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.List;
import java.util.Map;

public final class Message implements IUnknownPropertiesConsumer {
    private String formatted;
    private String message;
    private List<String> params;
    private Map<String, Object> unknown;

    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }

    public String getFormatted() {
        return this.formatted;
    }

    public String getMessage() {
        return this.message;
    }

    public List<String> getParams() {
        return this.params;
    }

    public void setFormatted(String str) {
        this.formatted = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setParams(List<String> list) {
        this.params = CollectionUtils.newArrayList(list);
    }
}
