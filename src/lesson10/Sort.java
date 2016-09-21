package lesson10;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Admin on 16.08.2016.
 */
public class Sort {
    public static void main (String [] args){
        Integer [] array = {9,8,7,6,5,4,3,2,1};
        String [] strArray = {"Hello", "World", " "};
        Arrays.sort(array, new CompareDESC());
        System.out.println(Arrays.toString(array));
    }
}
class CompareDESC implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2){
        return 1;
    }
    return 0;
}
}
