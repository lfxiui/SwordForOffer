package problem3;

/**
 * 找出任意一个重复数字
 * @author lfxiui
 * @date 2018/2/1 0001 14:56
 */
public class RepeatNumber {
    public int getRepeat(int[] array){
        if (array == null || array.length <= 0 ){
            return -1;
        }
        int length = array.length;
        for (int i = 0;i < length;i++){
            if (array[i] > length-1){
                return -1;
            }
        }
        for (int i = 0;i<length;i++){
            while (array[i] != i){
                if (array[array[i]] == array[i]){
                    return array[i];
                }
                int temp = array[i];
                array[i] = array[temp];
                array[temp] = temp;
            }
        }
        return -1;
    }
}
