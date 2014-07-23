// importするパッケージをさきにコンパイルするひつようがある
import mysingleton.*;
import java.util.Date;
public class Main {
    public static void main (String[] args) {
        Date now = new Date();
        System.out.println(now);

        // 単一のリソースだったり
        // リソース管理する単一の入り口だったり
        Singleton theInstance;
        theInstance = Singleton.getInstance();
        System.out.println(theInstance.initializedAt);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // e
        }

        Singleton anotherInstance = Singleton.getInstance();
        // anotherInstance = new Singleton("piyopiyo");
        System.out.println(anotherInstance.initializedAt);
    }
}
