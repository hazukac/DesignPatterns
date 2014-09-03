package listfactory;

import factory.*;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}

/**
 * 「サブクラスに具体的な実装をまかせる」という点についてはいっしょ。
 * but
 * TemplateMethodは「手続き」「呼び出し順」をsuperが定義して、具体処理は子供
 * AbstractFactoryは「データ構造」「関係性」をsuperが定義して、インスタンス化する具体的な処理は子供
 * 関係性ってなに？
 *     今回の例における、LinkとTray,Tray/Link（つまりItem)とPage関係
 *     文中では「部品と製品」と表現されていたやつ
 */

/*
public class Composer {
    HashMap<String, String> pool = new HashMap<String, String>();
    public String createLinkHTML(String key, String caption, String url) {
        pool.put(key, "<a href=\"" + url + "\">" + caption + "</a>");
    }
    public String createTrayHTML(String key, String caption, Vector<String> list) {
        StringBuffer buf = new StringBuffer();
        buf.append("<ul>");
        for (int i = 0; i < list.length; i++) {
            buf.append("<li>" + caption + "</li>");
        }
        buf.append("</ul>");
        pool.put(key, buf.toString());
    }
    public String careatePageHTML(String title, String author) {
        for (Map.Entry<String, String> e: this.pool.entrySet()) {
            if (e.getKey().match(/child[0-9]+/)) {

            }
        }
    }
}
*/

// ↑ 関係性の解決をここでやるな！と言われるかもね