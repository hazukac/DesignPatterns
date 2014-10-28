import java.util.Hashtable;

public class BigCharFactory {
    private Hashtable pool = new Hashtable();
    private static BigCharFactory instance = new BigCharFactory();
    private BigCharFactory() {};
    public static BigCharFactory getInstance() {
        return BigCharFactory.instance;
    }
    public synchronized BigChar getBigChar(char charname) {
        BigChar bigChar = (BigChar)pool.get("" + charname);
        if (bigChar == null) {
            bigChar = new BigChar(charname);
            pool.put("" + charname, bigChar);
        }
        return bigChar;
    }
}