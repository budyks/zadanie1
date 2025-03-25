public class zadanie3 {
    public static int[] rotateArray(int[] array, int positions) {
        if (array == null || array.length == 0) return array;
        int n = array.length;
        positions = positions % n;

        int start = 0, end = n - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        start = 0;
        end = positions - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        start = positions;
        end = n - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int positions = 3;
        int[] result = rotateArray(array, positions);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }}


