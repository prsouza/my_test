package io.sentry;

import io.sentry.util.Objects;
import java.security.SecureRandom;

final class TracesSampler {
    private final SentryOptions options;
    private final SecureRandom random;

    public TracesSampler(SentryOptions sentryOptions) {
        this((SentryOptions) Objects.requireNonNull(sentryOptions, "options are required"), new SecureRandom());
    }

    public TracesSampler(SentryOptions sentryOptions, SecureRandom secureRandom) {
        this.options = sentryOptions;
        this.random = secureRandom;
    }

    private boolean sample(Double d10) {
        return d10.doubleValue() >= this.random.nextDouble();
    }

    public boolean sample(SamplingContext samplingContext) {
        Double sample;
        if (samplingContext.getTransactionContext().getSampled() != null) {
            return samplingContext.getTransactionContext().getSampled().booleanValue();
        }
        if (this.options.getTracesSampler() != null && (sample = this.options.getTracesSampler().sample(samplingContext)) != null) {
            return sample(sample);
        }
        if (samplingContext.getTransactionContext().getParentSampled() != null) {
            return samplingContext.getTransactionContext().getParentSampled().booleanValue();
        }
        if (this.options.getTracesSampleRate() != null) {
            return sample(this.options.getTracesSampleRate());
        }
        return false;
    }
}
