package problem2;

/**
 * 单例模式：实现按需创建实例
 *
 * @author Lil si
 * @date 2018/1/30 0030 16:23
 */
public class Singleton2 {
    private Singleton2() {
    }

    private static class SingletonHolder {
        final static Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.instance;
    }

    public void showMessage() {
        System.out.println("Singleton");
    }
}
