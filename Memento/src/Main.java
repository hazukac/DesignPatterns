import game.Memento;
import game.Gamer;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(120);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 30; i++) {
            System.out.println("----- " + i + "回目 -----");
            System.out.println("現状:\t" + gamer.toString());
            gamer.bet();
            System.out.println("試行後:\t" + gamer.toString());

            if (gamer.getMoney() > memento.getMoney()) {
                memento = gamer.createMemento();
                System.out.println("## SAVE ##");
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                gamer.restoreFromMemento(memento);
                System.out.println("$$ RECOVER $$");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("+++++++++++++ ゲームセット ++++++++++++++");
            }
            System.out.println("");
        }
    }
}