package idcard;
import framework.Factory;
import java.util.*;

public class IDCardFactory extends Factory<IDCard> {
    private Vector<String> owners = new Vector<String>();
    protected IDCard createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(IDCard product) {
        this.owners.add(product.getOwner());
    }
    public Vector<String> getOwners() {
        return this.owners;
    }
}