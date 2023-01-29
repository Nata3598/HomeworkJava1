
public class Task1 {
    // Задать одномерный массив и найти в нем
    // минимальный и максимальный элементы

    public static void main(String[] args) {

        int[] arr = { 5, 9, 3, 1, 8, 6 };
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        int[] res = minMax(arr);
        System.out.print("min = " + res[0] + "  max = " + res[1]);

    }

    static int[] minMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int item : array) {
            if (item < min)
                min = item;
            if (item > max)
                max = item;
        }
        return new int[] { min, max };
    }

}
