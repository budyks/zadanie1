public class cwiczenia2{
    public static int findDominant(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int candidate = array[0];
        int count = 1;


        for (int i = 1; i < array.length; i++) {
            if (array[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = array[i];
                    count = 1;
                }
            }
        }


        count = 0;
        for (int num : array) {
            if (num == candidate) {
                count++;
            }
        }

        return count > array.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 3, 4, 2, 3, 3, 3, 5};
        int[] array2 = {1, 2, 3, 4, 5, 6};
        int[] array3 = {5,5,5,5,1};
        System.out.println(findDominant(array1));
        System.out.println(findDominant(array2));
        System.out.println(findDominant(array3));
    }
}


