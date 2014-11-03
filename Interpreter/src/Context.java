import java.util.*;

public class Context {
    private StringTokenizer tokenizer;
    private String currentToken;
    public Context(String text) {
        this.tokenizer = new StringTokenizer(text);
        this.nextToken();
    }
    public String nextToken() {
        if (this.tokenizer.hasMoreTokens()) {
            this.currentToken = this.tokenizer.nextToken();
        } else {
            this.currentToken = null;
        }
        return this.currentToken;
    }
    public String currentToken() {
        return this.currentToken;
    }
    public void skipToken(String token) throws ParseException {
        if (! token.equals(this.currentToken)) {
            throw new ParseException("Warning: try to skip `" + token + "` but found `" + this.currentToken);
        }
        this.nextToken();
    }
    public int currentNumber() throws ParseException {
        int number = 0;
        try {
            number = Integer.parseInt(this.currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning: " + e.toString());
        }
        return number;
    }
}