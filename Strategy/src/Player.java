public class Player {
    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }
    public Hand nextHand() {
        return this.strategy.next();
    }
    public void win() {
        this.strategy.study(true);
        this.winCount++;
        this.gameCount++;
    }
    public void lose() {
        this.strategy.study(false);
        this.loseCount++;
        this.gameCount++;
    }
    public void even() {
        this.gameCount++;
    }
    public String toResultString() {
        String result = "[" + this.name + ": ";
        result += this.winCount + " wins, ";
        result += this.loseCount + " losses]";
        return result;
    }
}
