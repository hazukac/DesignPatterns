public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main seed1 seed2");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player p1 = new Player("Tainaka", new WinningStrategy(seed1));
        Player p2 = new Player("Akiyama", new ProbStrategy(seed2));

        int totalGameCount = 100;

        for (int i = 0; i < totalGameCount; i++) {
            Hand hand1 = p1.nextHand();
            Hand hand2 = p2.nextHand();
            System.out.println(hand1.toString());  
            System.out.println(hand2.toString());  
            if (hand1.isStrongerThan(hand2)) {
                p1.win();
                p2.lose();
            } else if (hand2.isStrongerThan(hand1)) {
                p1.lose();
                p2.win();
            } else {
                p1.even();
                p2.even();
            }
        }
        System.out.println("Game set");
        System.out.println(p1.toResultString());
        System.out.println(p2.toResultString());
    }
}
