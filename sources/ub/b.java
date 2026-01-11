package ub;

import com.github.mikephil.charting.BuildConfig;

public enum b {
    DEBUG("debug"),
    PRODUCTION(BuildConfig.BUILD_TYPE),
    QA("qa"),
    AMBASSADOR("ambassador"),
    NODLE_ORG("nodleorg");
    
    private final String value;

    private b(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
