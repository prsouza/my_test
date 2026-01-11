package io.nodle.sdk.android.common.config;

import a.b;
import io.nodle.sdk.NodleResourceId;

public final class AndroidNodleResourceId implements NodleResourceId {
    private final int resourceId;

    public AndroidNodleResourceId(int i) {
        this.resourceId = i;
    }

    public static /* synthetic */ AndroidNodleResourceId copy$default(AndroidNodleResourceId androidNodleResourceId, int i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = androidNodleResourceId.resourceId;
        }
        return androidNodleResourceId.copy(i);
    }

    public final int component1() {
        return this.resourceId;
    }

    public final AndroidNodleResourceId copy(int i) {
        return new AndroidNodleResourceId(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidNodleResourceId) && this.resourceId == ((AndroidNodleResourceId) obj).resourceId;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    public int hashCode() {
        return this.resourceId;
    }

    public String toString() {
        StringBuilder q10 = b.q("AndroidNodleResourceId(resourceId=");
        q10.append(this.resourceId);
        q10.append(')');
        return q10.toString();
    }
}
