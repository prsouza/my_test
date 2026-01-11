package fa;

public enum d {
    RESTRICT {
        public String toString(CharSequence charSequence) {
            throw new UnsupportedOperationException();
        }
    },
    ALLOW {
        public String toString(CharSequence charSequence) {
            int length = charSequence.length();
            char[] cArr = new char[length];
            for (int i = 0; i < length; i++) {
                cArr[i] = charSequence.charAt(i);
            }
            return new String(cArr);
        }
    };

    public abstract String toString(CharSequence charSequence);
}
