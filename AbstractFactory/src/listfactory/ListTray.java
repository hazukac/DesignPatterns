package listfactory;

import factory.*;
import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }
    public String makeHTML() {
        StringBuffer buf = new StringBuffer();
        buf.append("<li>\n");
        buf.append(this.caption);
        buf.append("<ul>\n");
        Iterator itr = tray.iterator();
        while (itr.hasNext()) {
            Item item = (Item)itr.next();
            buf.append(item.makeHTML());
        }
        buf.append("</ul>\n");
        buf.append("</li>\n");
        return buf.toString();
    }
}