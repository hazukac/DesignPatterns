package game;

import java.util.Vector;
import java.util.Iterator;
import java.util.Random;

public class Gamer {
    private int money;
    private Vector<String> fruits = new Vector<String>();
    private Random random = new Random();
    private static String[] fruitsname = {
        "りんご", "みかん", "バナナ", "なし", "かき",
    };
    public Gamer(int money) {
        this.money = money;
    }
    public int getMoney() {
        return this.money;
    }
    public void bet() {
        int dice = this.random.nextInt(6) + 1;
        switch (dice){
            case 1:
                this.money += 100;
                System.out.println("所持金+100");
                break;
            case 2:
                this.money /= 2;
                System.out.println("所持金/2");
                break;
            case 6:
                String fruit = this.getFruit();
                System.out.println(fruit + "をゲット");
                break;
            default:
                System.out.println("何も起きない");
        }
    }
    public Memento createMemento() {
        Memento memento = new Memento(this.money);
        Iterator itr = this.fruits.iterator();
        while (itr.hasNext()) {
            String fruit = (String)itr.next();
            if (fruit.startsWith("おいしい")) {
                memento.addFruit(fruit);
            }
        }
        return memento;
    }
    public void restoreFromMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }
    public String toString() {
        return "[money:" + this.money + " fruits:" + this.fruits + "]";
    }
    private String getFruit() {
        String prefix = "";
        if (this.random.nextBoolean()) {
            prefix = "おいしい";
        }
        return prefix + fruitsname[this.random.nextInt(fruitsname.length)];
    }
}
