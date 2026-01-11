package i7;

public enum s1 {
    DOUBLE(t1.DOUBLE, 1),
    FLOAT(t1.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(t1.BOOLEAN, 0),
    STRING(t1.STRING, 2) {
        public boolean isPackable() {
            return false;
        }
    },
    GROUP(r13, 3) {
        public boolean isPackable() {
            return false;
        }
    },
    MESSAGE(r13, 2) {
        public boolean isPackable() {
            return false;
        }
    },
    BYTES(t1.BYTE_STRING, 2) {
        public boolean isPackable() {
            return false;
        }
    },
    UINT32(r11, 0),
    ENUM(t1.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final t1 javaType;
    private final int wireType;

    public t1 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private s1(t1 t1Var, int i) {
        this.javaType = t1Var;
        this.wireType = i;
    }
}
