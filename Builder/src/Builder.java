// (2)
// public interface Builder
// で、いいんじゃない？

// abstractは、実装を持てるけど、直でインスタンスをつくれない
// interfaceは、実装を持てないし、複数のinterfaceを実装したひとつの実装クラスが定義できる

// public abstract class Builder {
public interface Builder {
// public abstract class Builder implements GetResulter {
    public void makeTitle(String title);
    public void makeString(String str);
    public void makeItems(String[] items);
    public void close();

    // (1)
    // public abstract String getResult();
    // が、あってもいいんじゃない？
    // ------------------------
    // getResultの必要性や、その返り値に興味があるのは
    // Builderを参照するDirectorではなく、Mainなので、
    // あえて、ここでgetResultの実装を要求しなくてもいいんじゃないかと
    // わたしは、おもう。
    // ex) "markdown"だったら、getResultを呼ぶ必要がない、という要件があったりして
    // わかんねえけどな//////////

    // この場合、getResultは文中の「ファイルとか固有のメソッド」にあたるので、
    // Builderでかならず約束する必要はないのではないか.
    // ないし、getResultは「ビルダー固有で分けたいサムシング」っていう位置づけ
    // なので、返り値が違ったり、ユースケースが違ったりする想定のものですので、
    // Builderで約束されてない、という一例でした
}

/*
public interface GetResulter<T> {
    public T getResult();
}
*/