package idcard;

import framework.Product;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println(owner + "のカードをつくります!");
        this.owner = owner;
    }
    public void use() {
        System.out.println(this.owner + "のカードを使ってターンエンド");
    }
    public String getOwner() {
        return this.owner;
    }
}
