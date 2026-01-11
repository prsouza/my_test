package io.sentry;

import aa.a;
import aa.c;
import i2.z;
import io.sentry.util.StringUtils;
import java.util.Locale;
import java.util.Objects;

public final class SentryEnvelopeItemHeaderAdapter extends z<SentryEnvelopeItemHeader> {
    public SentryEnvelopeItemHeader read(a aVar) {
        SentryItemType valueOf;
        if (aVar.A0() == 9) {
            aVar.x0();
            return null;
        }
        SentryItemType sentryItemType = SentryItemType.Unknown;
        aVar.w();
        SentryItemType sentryItemType2 = sentryItemType;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (aVar.a0()) {
            String w02 = aVar.w0();
            Objects.requireNonNull(w02);
            char c10 = 65535;
            switch (w02.hashCode()) {
                case -1106363674:
                    if (w02.equals("length")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -734768633:
                    if (w02.equals("filename")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -672977706:
                    if (w02.equals("attachment_type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (w02.equals("type")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 831846208:
                    if (w02.equals("content_type")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    i = aVar.p0();
                    break;
                case 1:
                    str2 = aVar.y0();
                    break;
                case 2:
                    str3 = aVar.y0();
                    break;
                case 3:
                    try {
                        String y02 = aVar.y0();
                        if (y02 != null) {
                            if (!y02.equalsIgnoreCase("user_report")) {
                                String capitalize = StringUtils.capitalize(y02);
                                if (capitalize == null) {
                                    break;
                                } else {
                                    valueOf = SentryItemType.valueOf(capitalize);
                                }
                            } else {
                                valueOf = SentryItemType.UserFeedback;
                            }
                            sentryItemType2 = valueOf;
                            break;
                        } else {
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        break;
                    }
                case 4:
                    str = aVar.y0();
                    break;
                default:
                    aVar.D0();
                    break;
            }
        }
        aVar.S();
        return new SentryEnvelopeItemHeader(sentryItemType2, i, str, str2, str3);
    }

    public void write(c cVar, SentryEnvelopeItemHeader sentryEnvelopeItemHeader) {
        if (sentryEnvelopeItemHeader == null) {
            cVar.f0();
            return;
        }
        cVar.R();
        if (sentryEnvelopeItemHeader.getContentType() != null) {
            cVar.s("content_type");
            cVar.S(sentryEnvelopeItemHeader.getContentType());
        }
        if (sentryEnvelopeItemHeader.getFileName() != null) {
            cVar.s("filename");
            cVar.S(sentryEnvelopeItemHeader.getFileName());
        }
        if (!SentryItemType.Unknown.equals(sentryEnvelopeItemHeader.getType())) {
            cVar.s("type");
            cVar.S(sentryEnvelopeItemHeader.getType().getItemType().toLowerCase(Locale.ROOT));
        }
        if (sentryEnvelopeItemHeader.getAttachmentType() != null) {
            cVar.s("attachment_type");
            cVar.S(sentryEnvelopeItemHeader.getAttachmentType());
        }
        cVar.s("length");
        cVar.c((long) sentryEnvelopeItemHeader.getLength());
        cVar.a0();
    }
}
