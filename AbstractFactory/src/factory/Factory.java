package factory;

public abstract class Factory {
    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            // clazz ? or klass
            Class clazz = Class.forName(className);
            Object instance = clazz.newInstance();
            factory = (Factory)instance;
        } catch (ClassNotFoundException e) {
            System.err.println("クラス名 " + className + " が見つかりませーん");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}