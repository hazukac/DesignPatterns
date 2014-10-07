package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {}
    public static void makeWelcomePage(String addr, String filename) {
        try {
            Properties mailprop =  Database.getProperties("maildata");
            String username = mailprop.getProperty(addr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!!");
            writer.paragraph(username + "のページへようこそ");
            writer.paragraph("メール待ってます");
            writer.mailto(addr, username);
            writer.close();

            System.out.println(filename + " is created for " + addr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}