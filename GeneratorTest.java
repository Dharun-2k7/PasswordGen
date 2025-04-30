class GeneratorTest {
    
    private final Password password = new Password("Secret");
    private final Alphabet firstAlphabet = new Alphabet(true, false, false, false);
    private final Alphabet secondAlphabet = new Alphabet(false, true, true, true);
    private final Generator generator = new Generator(true, false, false, false);
    
    public void test1() {
        assert "Secret".equals(password.toString()) : "Password string mismatch";
    }

    public void test2() {
        assert firstAlphabet.getAlphabet().equals(Alphabet.UPPERCASE_LETTERS) : "First alphabet mismatch";
    }

    public void test3() {
        String expectedAlphabet = Alphabet.LOWERCASE_LETTERS + Alphabet.NUMBERS + Alphabet.SYMBOLS;
        assert secondAlphabet.getAlphabet().equals(expectedAlphabet) : "Second alphabet mismatch";
    }
    
    public void test4() {
        assert generator.getAlphabet().equals(Alphabet.UPPERCASE_LETTERS) : "Generator alphabet mismatch";
    }
    
    public void test5() {
        assert generator.getAlphabet().length() == 26 : "Generator alphabet length mismatch";
    }

    public static void main(String[] args) {
        GeneratorTest test = new GeneratorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        System.out.println("All tests passed!");
    }
}