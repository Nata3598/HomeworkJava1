public class Task3 {
    // Дан массив nums = [3,2,2,3] и число val = 3.
    // Если в массиве есть числа, равные заданному,
    // нужно перенести эти элементы в конец массива.
    // Таким образом, первые несколько (или все) элементов массива
    // должны быть отличны от заданного, а остальные - равны ему.

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        int[] res = sort(nums, val);
        for (int i : res) {
            System.out.print(i + " ");

        }

    }

    static int[] sort(int[] nums, int val) {

        for (int x = 0; x < nums.length; x++) {
            for (int i = 0; i < (nums.length - 1); i++) {
                if (nums[i] == val) {
                    int a = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = a;
                }
            }
        }

        return nums;
    }
}
