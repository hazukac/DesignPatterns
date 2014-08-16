package listfactory;

import factory.*;
import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html>\n");
        buffer.append("<head><title>" + this.title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + this.title + "</h1>");
        buffer.append("<ul>\n");
        Iterator itr = this.content.iterator();
        while (itr.hasNext()) {
            Item item = (Item)itr.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</body>\n");
        buffer.append("</html>\n");
        return buffer.toString();
    }
}