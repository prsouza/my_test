package androidx.media;

import b9.m;
import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f2212a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2213b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2214c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2215d = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2213b != audioAttributesImplBase.f2213b) {
            return false;
        }
        int i = this.f2214c;
        int i10 = audioAttributesImplBase.f2214c;
        int i11 = audioAttributesImplBase.f2215d;
        int i12 = 4;
        if (i11 == -1) {
            int i13 = audioAttributesImplBase.f2212a;
            int i14 = AudioAttributesCompat.f2208b;
            if ((i10 & 1) != 1) {
                if ((i10 & 4) != 4) {
                    switch (i13) {
                        case 2:
                            i12 = 0;
                            break;
                        case 3:
                            i12 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i12 = 5;
                            break;
                        case 6:
                            i12 = 2;
                            break;
                        case 11:
                            i12 = 10;
                            break;
                        case 13:
                            i12 = 1;
                            break;
                        default:
                            i12 = 3;
                            break;
                    }
                } else {
                    i12 = 6;
                }
            } else {
                i12 = 7;
            }
        } else {
            i12 = i11;
        }
        if (i12 == 6) {
            i10 |= 4;
        } else if (i12 == 7) {
            i10 |= 1;
        }
        if (i == (i10 & 273) && this.f2212a == audioAttributesImplBase.f2212a && this.f2215d == i11) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2213b), Integer.valueOf(this.f2214c), Integer.valueOf(this.f2212a), Integer.valueOf(this.f2215d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f2215d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f2215d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i = this.f2212a;
        int i10 = AudioAttributesCompat.f2208b;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = m.b("unknown usage ", i);
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.f2213b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f2214c).toUpperCase());
        return sb2.toString();
    }
}
