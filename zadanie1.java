import java.util.ArrayList;
import java.util.List;

public class zadanie1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] result = filterEvenIndexOddValue(array);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] filterEvenIndexOddValue(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                resultList.add(array[i]);
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }


}
