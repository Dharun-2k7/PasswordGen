public class Alphabet {
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "0123456789";
    public static final String SYMBOLS = "!@#$%^&*()";

    private final String alphabet;

    public Alphabet(boolean includeUppercase, boolean includeLowercase, boolean includeNumbers, boolean includeSymbols) {
        StringBuilder sb = new StringBuilder();
        if (includeUppercase) sb.append(UPPERCASE_LETTERS);
        if (includeLowercase) sb.append(LOWERCASE_LETTERS);
        if (includeNumbers) sb.append(NUMBERS);
        if (includeSymbols) sb.append(SYMBOLS);
        this.alphabet = sb.toString();
    }

    public String getAlphabet() {
        return this.alphabet;
    }
}