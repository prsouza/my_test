package te;

import org.slf4j.helpers.MessageFormatter;

public enum p {
    OBJ(MessageFormatter.DELIM_START, MessageFormatter.DELIM_STOP),
    LIST('[', ']'),
    MAP(MessageFormatter.DELIM_START, MessageFormatter.DELIM_STOP),
    POLY_OBJ('[', ']');
    
    public final char begin;
    public final byte beginTc;
    public final char end;
    public final byte endTc;

    private p(char c10, char c11) {
        this.begin = c10;
        this.end = c11;
        this.beginTc = i.a(c10);
        this.endTc = i.a(c11);
    }
}
