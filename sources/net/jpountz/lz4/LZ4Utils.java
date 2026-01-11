package net.jpountz.lz4;

import b9.m;

enum LZ4Utils {
    ;
    
    private static final int MAX_INPUT_SIZE = 2113929216;

    public static class Match {
        public int len;
        public int ref;
        public int start;

        public int end() {
            return this.start + this.len;
        }

        public void fix(int i) {
            this.start += i;
            this.ref += i;
            this.len -= i;
        }
    }

    public static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    public static int hash(int i) {
        return (i * XXHashConstants.PRIME1) >>> 20;
    }

    public static int hash64k(int i) {
        return (i * XXHashConstants.PRIME1) >>> 19;
    }

    public static int hashHC(int i) {
        return (i * XXHashConstants.PRIME1) >>> 17;
    }

    public static int maxCompressedLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(m.b("length must be >= 0, got ", i));
        } else if (i < MAX_INPUT_SIZE) {
            return (i / 255) + i + 16;
        } else {
            throw new IllegalArgumentException("length must be < 2113929216");
        }
    }
}
