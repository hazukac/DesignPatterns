public class Main {
    public static void main(String[] args) {
        AbstractDisplay d0 = new CharDisplay('B');
        AbstractDisplay d1 = new CharDisplay("A");
        AbstractDisplay d2 = new StringDisplay("Hello, World!!");
        AbstractDisplay d3 = new StringDisplay("Hoge Fuga Piyo");

        d0.display();
        d1.display();
        d2.display();
        d3.display();
    }
}
/*
open - process - close
 */
/*
イベントサイトのレスポンスが違う
class Crawler {
    abstract url: sring;
    crawl() {
       c := this.getContent();
       r := this.parse(c);
       s := this.close();
    }
    getContet() {
        return http.Get(this.url);
    }
}
class AsahiBeerCrawler extends Crawler {
    constructor() {
        this.url = "http://asahi.com/campaign";
    }
    parse(c http.Response) {
        // アサヒビールのページのHTMLをパースする具体的な処理
    }
    close() {
        // アサヒビールのページのリクエストをクロースずる処理
    }
}
class KirinBeerCrawler extends Crawler {
    constructor() {
        this.url = "http://kirin.com/?view=campaign";
    }
}
 */