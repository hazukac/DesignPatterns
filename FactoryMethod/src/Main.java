import framework.*;
import idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory<IDCard> factory = new IDCardFactory();

        IDCard card1 = factory.create("田井中律");
        IDCard card2 = factory.create("秋山澪");
        IDCard card3 = factory.create("平沢唯");
        IDCard card4 = factory.create("琴吹紬");

        card1.use();
        card2.use();
        card3.use();
        card4.use();
    }
}