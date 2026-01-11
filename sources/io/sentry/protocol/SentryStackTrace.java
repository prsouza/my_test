package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import java.util.List;
import java.util.Map;

public final class SentryStackTrace implements IUnknownPropertiesConsumer {
    private List<SentryStackFrame> frames;
    private Map<String, String> registers;
    private Boolean snapshot;
    private Map<String, Object> unknown;

    public SentryStackTrace() {
    }

    public SentryStackTrace(List<SentryStackFrame> list) {
        this.frames = list;
    }

    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }

    public List<SentryStackFrame> getFrames() {
        return this.frames;
    }

    public Map<String, String> getRegisters() {
        return this.registers;
    }

    public Boolean getSnapshot() {
        return this.snapshot;
    }

    public void setFrames(List<SentryStackFrame> list) {
        this.frames = list;
    }

    public void setRegisters(Map<String, String> map) {
        this.registers = map;
    }

    public void setSnapshot(Boolean bool) {
        this.snapshot = bool;
    }
}
