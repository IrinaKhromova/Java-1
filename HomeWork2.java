/**
* Java 1 HomeWork 2
*
* @author Irina Khromova
* @version 17.01.2021
*/

class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(within10and20(16, 8));
        isPositiveOrNegative(18);
        System.out.println(isNegative(-10));
        printWordNTimes("Have a nice day!", 5);
        System.out.println(isLeapYear(2000));
    }
    
    /* Задание 1
    Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false
    */
    
    static boolean within10and20(int x1, int x2) {
        return(x1 + x2 >= 10 && x1 + x2 <= 20);
    }
    /* Задание 2
    Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали
    или отрицательное. Замечание: ноль считаем положительным числом
    */
    
    static void isPositiveOrNegative(int x) {
        System.out.println(x < 0 ? "Negative -" : "Positive +");
    }
    
    /* Задание 3
    Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное,
    и вернуть false если положительное
    */
    
    static boolean isNegative(int x) {
        return (x < 0);
    }
    
    /* Задание 4
    Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку,
    указанное количество раз
    */
    
    static void printWordNTimes(String txtToPrint, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(txtToPrint);
        }
        System.out.println();
    }
    
    /* Задание 5
    Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го,
    при этом каждый 400-й – високосный
    */
    
    static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}






