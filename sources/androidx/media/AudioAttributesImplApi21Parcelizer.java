package androidx.media;

import android.media.AudioAttributes;
import java.util.Objects;
import r1.a;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2210a = (AudioAttributes) aVar.m(audioAttributesImplApi21.f2210a, 1);
        audioAttributesImplApi21.f2211b = aVar.k(audioAttributesImplApi21.f2211b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        Objects.requireNonNull(aVar);
        aVar.w(audioAttributesImplApi21.f2210a, 1);
        aVar.u(audioAttributesImplApi21.f2211b, 2);
    }
}
