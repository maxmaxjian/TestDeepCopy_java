import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(list);
        List<Integer> copy = new ArrayList<>(list);
//        list.clear();
        System.out.println(copy);
        copy.clear();
        System.out.println(copy);
        System.out.println(list);
    }
}
