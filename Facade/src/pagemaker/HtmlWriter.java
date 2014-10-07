package pagemaker;

import java.io.Writer;
import java.io.IOException;

public class HtmlWriter {
    private Writer writer;
    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }
    public void title(String title) throws IOException {
        this.writer.write("<html>\n");
        this.writer.write("<head>\n");
        this.writer.write("<title>" + title + "</title>\n");
        this.writer.write("</head>\n");
        this.writer.write("<body>\n");
        this.writer.write("<h1>" + title + "</h1>\n");
    }
    public void paragraph(String message) throws IOException {
        this.writer.write("<p>" + message + "</p>\n");
    }
    public void link(String href, String caption) throws IOException {
        this.writer.write("<a href='" + href + "'>" + caption + "</a>\n");
    }
    public void mailto(String addr, String name) throws IOException {
        this.writer.write("<span>" + name + "</span><b>" + addr + "</b>\n");
    }
    public void close() throws IOException {
        this.writer.write("</body>\n</html>");
        this.writer.close();
    }
}