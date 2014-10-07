package pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {}
    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties properteis = new Properties();
        try {
            properteis.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("WARNING: " + filename + " is not found.");
        }
        return properteis;
    }
}