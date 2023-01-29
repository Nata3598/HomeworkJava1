public class Task2 {
    // Написать метод, который определяет,
    // является ли введенный пользователем год високосным,
    // и возвращает в консоль boolean
    // (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го,
    // при этом каждый 400-й – високосный.
    public static void main(String[] args) {
        doSeven(2200);
    }

    static void doSeven(int year) {
        System.out.println();

        if (year % 4 == 0 && !(year % 100 == 0 && !(year % 400 == 0)))
            System.out.println(year + " г. високосный");
        else
            System.out.println(year + " г.  не високосный");
        // if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
    }

}
