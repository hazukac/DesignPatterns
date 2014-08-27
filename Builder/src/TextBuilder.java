
// public class TextBuilder extends Builder {
public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();
    private StringBuffer titleBuffer = new StringBuffer();
    private StringBuffer result = new StringBuffer();

    public void makeTitle(String title) {
        titleBuffer = new StringBuffer();
        titleBuffer.append("=======================\n");
        titleBuffer.append(" [" + title + "]\n");
        titleBuffer.append("\n");
    }
    public void makeString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("  ・" + items[i] + "\n");
        }
        buffer.append("\n");
    }
    public void close() {
        // StringBuffer result = new StringBuffer();
        result.append(titleBuffer.toString());
        result.append(buffer.toString());
        result.append("==========================\n");
    }
    public String getResult() {
        return result.toString();
    }
}