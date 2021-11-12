public class SecondProgram {
    public static void main(String[] args) {
        System.out.println("Привет второй Урок Java - Задание 2 Выпонение арифметических операций !");

        // сложение
        System.out.println("Результат сложения функции calculate = " + calculate(1, 2));

        long summa = summa(4, 7);
        System.out.println("Результат сложения функции summa через переменную result = " + (summa));

        long autoSumma = autoSumma(3, 30);
        System.out.println("Результат сложения функции autoSumma без переменной result = "
                + (autoSumma));

        // вычитание
        long minus = minus (10, 3);
        System.out.println("Результат вычитания функции minus без переменной result = "
                + (minus));

        // умножение с константой
        long multiply = multiply (3);
        System.out.println("Результат умножения функции multiply на константу без переменной result = "
                + (multiply));

        // умножение с константой
        long multiplyResult = multiplyResult (3);
        System.out.println("Результат умножения функции multiply на константу" +
                " с прибавлением переопределенной переменной result = " + (multiplyResult));

        /* Автоычисление уравнения 3 + x = 7 */
        long urav = urav (3, 7);
        System.out.println("Результат вычисления уравнения - X = " + (urav));



    }
    // функции сложения
    public static long calculate(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    public static long summa(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }
    public static long autoSumma(int arg1, int arg2) {
        return arg1 + arg2;
    }
    // функция минус
    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    // умножение с константой
    public static long multiply (int arg1) {
        int constant = 7;
        return arg1 * constant;
    }
    // умножение с константой и переопределенной переменной
    public static long multiplyResult (int arg1) {
        int constant = 7;
        int result = arg1 * constant;
        result = result + 12;
        return result;
    }
    // Автовычисление уравнение 3 + x = 7
    public static long urav (int arg4, int arg6) {
        return arg6 - arg4;
    }

}