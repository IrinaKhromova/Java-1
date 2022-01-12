    // задание 1: создать класс HomeWorkApp, и прописать в нем метод main()

class HomeWork1 {
    public static void main(String[] args) {
        helloword();
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void helloword() {
        System.out.println("Hello, world!");
    } 

    // задание 2: Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // задание 3: Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”

    static void checkSumSign() {
        int a = 10;
        int b = -5;
        int c = a + b;
        System.out.println(c >= 0? "Сумма положительная" : "Сумма отрицательная");    
    }

    // задание 4: Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”
    
    static void printColor() {
        int value = 100;
        
        if (value <= 0) {
         System.out.println("Красный");
      } else if (value > 0 && value <= 100) {
         System.out.println("Желтый");
      } else {
         System.out.println("Зеленый");
      }
    }

    // задание 5: Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”

    static void compareNumbers() {
        int a = 3;
        int b = 335;
        System.out.println(a >= b? "a >= b" : "a < b");
    }
}