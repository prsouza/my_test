package h4;

public enum k {
    NOT_AVAILABLE((String) null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME((String) null, 5),
    VALUE_EMBEDDED_OBJECT((String) null, 12),
    VALUE_STRING((String) null, 6),
    VALUE_NUMBER_INT((String) null, 7),
    VALUE_NUMBER_FLOAT((String) null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);
    
    public final int _id;
    public final boolean _isBoolean;
    public final boolean _isNumber;
    public final boolean _isScalar;
    public final boolean _isStructEnd;
    public final boolean _isStructStart;
    public final String _serialized;
    public final byte[] _serializedBytes;
    public final char[] _serializedChars;

    private k(String str, int i) {
        boolean z = false;
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
        } else {
            this._serialized = str;
            char[] charArray = str.toCharArray();
            this._serializedChars = charArray;
            int length = charArray.length;
            this._serializedBytes = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                this._serializedBytes[i10] = (byte) this._serializedChars[i10];
            }
        }
        this._id = i;
        this._isBoolean = i == 10 || i == 9;
        this._isNumber = i == 7 || i == 8;
        boolean z10 = i == 1 || i == 3;
        this._isStructStart = z10;
        boolean z11 = i == 2 || i == 4;
        this._isStructEnd = z11;
        if (!z10 && !z11 && i != 5 && i != -1) {
            z = true;
        }
        this._isScalar = z;
    }

    public final byte[] asByteArray() {
        return this._serializedBytes;
    }

    public final char[] asCharArray() {
        return this._serializedChars;
    }

    public final String asString() {
        return this._serialized;
    }

    public final int id() {
        return this._id;
    }

    public final boolean isBoolean() {
        return this._isBoolean;
    }

    public final boolean isNumeric() {
        return this._isNumber;
    }

    public final boolean isScalarValue() {
        return this._isScalar;
    }

    public final boolean isStructEnd() {
        return this._isStructEnd;
    }

    public final boolean isStructStart() {
        return this._isStructStart;
    }
}
