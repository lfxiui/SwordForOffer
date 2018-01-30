import problem2.Singleton;
import problem2.Singleton2;

/**
 * @author Lil si
 */
public class Main {

    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.showMessage();
    }
}
