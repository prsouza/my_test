package io.sentry.protocol;

public final class MeasurementValue {
    private final float value;

    public MeasurementValue(float f10) {
        this.value = f10;
    }

    public float getValue() {
        return this.value;
    }
}
