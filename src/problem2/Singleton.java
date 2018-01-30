package problem2;

/**
 * 单例模式：利用静态构造函数
 *
 * @author Lil si
 * @date 2018/1/30 0030 14:32
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}
