package framework;
import java.util.HashMap;

public class Manager {
    private static Manager mng = null;
    private HashMap showcase = new HashMap();
    private Manager() {
        // なんもかかなくていい
        // Manager manager = Manager.getMng();
        /*
        UnderlinePen ulpen = new UnderlinePen('~');
        MessageBox mb = new MessageBox('#');
        MessageBox simpleBox = new MessageBox('*');
        this.register("strong message", ulpen);
        this.register("congrats message", mb);
        this.register("simple box", simpleBox);
        */
        // }}}
    }
    public void register(String productName, Product productInstance) {
        showcase.put(productName, productInstance);
    }
    public Product create(String productName) {
        Product p = (Product)showcase.get(productName);
        return p.createClone();
    }

    public static Manager getMng() {
        if (Manager.mng == null) {
            Manager.mng = new Manager();
        }
        return Manager.mng;
    }
}