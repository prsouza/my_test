package androidx.media;

import a.a;
import android.media.AudioAttributes;

class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f2210a;

    /* renamed from: b  reason: collision with root package name */
    public int f2211b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f2210a.equals(((AudioAttributesImplApi21) obj).f2210a);
    }

    public final int hashCode() {
        return this.f2210a.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.d("AudioAttributesCompat: audioattributes=");
        d10.append(this.f2210a);
        return d10.toString();
    }
}
