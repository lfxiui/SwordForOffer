import problem3.RepeatNumber;

/**
 * @author Lil si
 */
public class Main {

    public static void main(String[] args) {
        RepeatNumber repeatNumber = new RepeatNumber();
        int[] array = {1, 3, 2, 5, 4, 3, 2, 0};
        System.out.println(repeatNumber.getRepeat(array));
    }
}
