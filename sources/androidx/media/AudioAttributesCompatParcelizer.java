package androidx.media;

import java.util.Objects;
import r1.a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f2209a;
        if (aVar.i(1)) {
            obj = aVar.o();
        }
        audioAttributesCompat.f2209a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        Objects.requireNonNull(aVar);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2209a;
        aVar.p(1);
        aVar.y(audioAttributesImpl);
    }
}
