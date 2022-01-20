/**
* Java 1 HomeWork 3
*
* @author Irina Khromova
* @version 20.01.2021
*/

	
import java.util.Arrays;

class HomeWork3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invertArray()));
        System.out.println(Arrays.toString(fillArray(100)));
        System.out.println(Arrays.toString(changeArray()));
        fillDiagonal(5);
        System.out.println(Arrays.toString(fillArrayValue(5, 45)));
        elementMinMax();
        System.out.println(sumLeftRight(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
        // task 8 (in work)
    }
    
    /* Задание 1
    Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0
    */
    
    static int[] invertArray() {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] > 0) ? 0 : 1;
        }
        return arr;
    }
    
    /* Задание 2
    Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
    */
    
    static int[] fillArray(int arrayLength) {
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
    
    /* Задание 3
    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2
    */
    
    static int[] changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? arr[i] * 2 : arr[i];
        }
        return arr;
    }
    
    /* Задание 4
    Создать квадратный двумерный целочисленный массив
    (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    заполнить его диагональные элементы единицами
    */
    
    static void fillDiagonal(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (j == n - 1 - i)) {
                    arr [i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    /* Задание 5
    Написать метод, принимающий на вход два аргумента:
    len и initialValue, и возвращающий одномерный массив
    типа int длиной len, каждая ячейка которого равна initialValue
    */
    
    static int[] fillArrayValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    
    /* Задание 6
    Задать одномерный массив и найти в нем
    минимальный и максимальный элементы
    */
    
    static void elementMinMax() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 0};
        int arrMax = arr[0], arrMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arrMax = (arrMax < arr[i]) ? arr[i] : arrMax;
            arrMin = (arrMin > arr[i]) ? arr[i] : arrMin;
        }
        System.out.println("Max = " + arrMax + "; Min = " + arrMin);
    }
    
    /* Задание 7
    Написать метод, в который передается не пустой одномерный
    целочисленный массив, метод должен вернуть true,
    если в массиве есть место, в котором сумма левой
    и правой части массива равны
    */
    
    static boolean sumLeftRight(int[] arr) {
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int n = 0; n < i; n++) {
                leftSum += arr[n];
            }
            for (int n = i; n < arr.length; n++) {
                rightSum += arr[n];
            }
        }
        return (leftSum == rightSum);
    }
    
    /* Задание 8
    Нужно время подумать, не успеваю
    */
    
}


