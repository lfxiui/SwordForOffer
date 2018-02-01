package problem2;

/**
 * 单例模式：加同步锁前后两次判断实例是否已存在
 *
 * @author Lil si
 * @date 2018/1/30 0030 16:59
 */
public class Singleton3 {
    private Singleton3(){}
    private static volatile Singleton3 instance;
    public static Singleton3 getInstance(){
        if (instance == null){
            synchronized (Singleton3.class){
                if (instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("单例模式：加同步锁前后两次判断实例是否已存在");
    }
}
