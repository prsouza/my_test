package s4;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class k {

    public enum a {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        private a(int i) {
            this.value = i;
        }
    }

    public abstract a a();

    public abstract a b();
}
