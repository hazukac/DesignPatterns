import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int previousHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
        {1, 1, 1,},
        {1, 1, 1,},
        {1, 1, 1,},
    };
    public ProbStrategy(int seed) {
        this.random = new Random(seed);
    }
    public Hand next() {
        int sum = this.getSum(this.currentHandValue);
        int bet = this.random.nextInt(sum);
        int val = 0;
        if (bet < this.history[currentHandValue][0]) {
            val = 0;
        } else if (bet < history[currentHandValue][0] + this.history[currentHandValue][1]) {
            val = 1;
        } else {
            val = 2;
        }
        this.previousHandValue = this.currentHandValue;
        this.currentHandValue = val;
        return Hand.getHand(val);
    }
    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += this.history[hv][i];
        }
        return sum;
    }
    public void study(boolean win) {
        if (win) {
            this.history[this.previousHandValue][this.currentHandValue]++;
        } else {
            this.history[this.previousHandValue][(this.currentHandValue + 1) % 3]++;
            this.history[this.previousHandValue][(this.currentHandValue - 1) % 3]++;
        }
    }
}
