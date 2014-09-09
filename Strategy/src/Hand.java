public class Hand {
    public static final int HANDVALUE_GU = 0;
    public static final int HANDVALUE_CH = 1;
    public static final int HANDVALUE_PA = 2;
    public static final Hand[] hands = {
        new Hand(HANDVALUE_GU),
        new Hand(HANDVALUE_CH),
        new Hand(HANDVALUE_PA),
    };
    private static final String[] names = {
        "グー",
        "チョキ",
        "パー",
    };
    private int value;
    private Hand(int value) {
        this.value = value;
    }
    public static Hand getHand(int value) {
        System.out.println("???? value" + value);
        return Hand.hands[value];
    }
    public boolean isStrongerThan(Hand h) {
        return this.getResult(h) == 1;
    }
    public boolean isWeakerThan(Hand h) {
        return this.getResult(h) == -1;
    }
    private int getResult(Hand opponent) {
        if (this.value == opponent.value) {
            return 0;
        }
        if ((this.value + 1) % 3 == opponent.value) {
            return 1;
        }
        return -1;
    }
    public String toString() {
        return this.names[this.value];
    }
}
