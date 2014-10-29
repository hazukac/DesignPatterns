// new Type[length]
public class BigString {
    private BigChar[] bigChars;
    public BigString(String string) {
        this.bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < this.bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }
    public void print() {
        for (int i = 0; i < this.bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
