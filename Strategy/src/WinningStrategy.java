import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean wonInPreviousMatch = false;
    private Hand previousHand;
    public WinningStrategy(int seed) {
        random = new Random(seed);
    }
    public Hand next() {
        if (this.wonInPreviousMatch) {
            return this.previousHand;
        }
        return Hand.getHand(this.random.nextInt(3));
    }
    public void study(boolean win) {
        this.wonInPreviousMatch = win;
    }
}
