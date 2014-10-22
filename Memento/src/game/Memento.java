package game;
import java.util.Vector;

public class Memento {
    int money;
    Vector<String> fruits;
    Memento(int money) {
        this.money = money;
        this.fruits = new Vector<String>();
    }
    public int getMoney() {
        return this.money;
    }
    void addFruit(String fruit) {
        this.fruits.add(fruit);
    }
    Vector<String> getFruits() {
        return (Vector<String>)this.fruits.clone();
    }
}
