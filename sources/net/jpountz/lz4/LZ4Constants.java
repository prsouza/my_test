package net.jpountz.lz4;

enum LZ4Constants {
    ;
    
    public static final int COPY_LENGTH = 8;
    public static final int DEFAULT_COMPRESSION_LEVEL = 9;
    public static final int HASH_LOG = 12;
    public static final int HASH_LOG_64K = 13;
    public static final int HASH_LOG_HC = 15;
    public static final int HASH_TABLE_SIZE = 4096;
    public static final int HASH_TABLE_SIZE_64K = 8192;
    public static final int HASH_TABLE_SIZE_HC = 32768;
    public static final int LAST_LITERALS = 5;
    public static final int LZ4_64K_LIMIT = 65547;
    public static final int MAX_COMPRESSION_LEVEL = 17;
    public static final int MAX_DISTANCE = 65536;
    public static final int MEMORY_USAGE = 14;
    public static final int MF_LIMIT = 12;
    public static final int MIN_LENGTH = 13;
    public static final int MIN_MATCH = 4;
    public static final int ML_BITS = 4;
    public static final int ML_MASK = 15;
    public static final int NOT_COMPRESSIBLE_DETECTION_LEVEL = 6;
    public static final int OPTIMAL_ML = 18;
    public static final int RUN_BITS = 4;
    public static final int RUN_MASK = 15;
    public static final int SKIP_STRENGTH = 0;

    /* access modifiers changed from: public */
    static {
        SKIP_STRENGTH = Math.max(6, 2);
    }
}
