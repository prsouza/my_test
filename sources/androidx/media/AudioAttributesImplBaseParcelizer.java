package androidx.media;

import java.util.Objects;
import r1.a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2212a = aVar.k(audioAttributesImplBase.f2212a, 1);
        audioAttributesImplBase.f2213b = aVar.k(audioAttributesImplBase.f2213b, 2);
        audioAttributesImplBase.f2214c = aVar.k(audioAttributesImplBase.f2214c, 3);
        audioAttributesImplBase.f2215d = aVar.k(audioAttributesImplBase.f2215d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        Objects.requireNonNull(aVar);
        aVar.u(audioAttributesImplBase.f2212a, 1);
        aVar.u(audioAttributesImplBase.f2213b, 2);
        aVar.u(audioAttributesImplBase.f2214c, 3);
        aVar.u(audioAttributesImplBase.f2215d, 4);
    }
}
