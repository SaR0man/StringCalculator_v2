import java.util.Scanner;

//enum Actions {  // MULTIPLY, DIVIDE, ADD, SUBTRACT
//    MULTIPLY("*"),
//    DIVIDE("/"),
//    ADD("+"),
//    SUBTRACT("-");
//
//    private String sign;
//    Actions(String sign) {
//        this.sign = sign;
//    }
//
//    public String getSign() {
//        return sign;
//    }
//}

public class Main {


    public static String signs = "+-*/";  // {"+", "-", "*", "/"}
    public static String string;  // вводимая строка
    public static int signIndexCurr = 0;  // индекс текущего знака действия
    public static int signIndexNext = 0;  // индекс следующего знака действия
//    public static String workString; // рабочая функциональная строка



    public static void input() {  //// ввод строки
        System.out.print("Введите выражение:_");
        Scanner scanner = new Scanner(System.in);
        boolean breaker = true;  // выключатель для while
        while (breaker) {        // пока не введем непустую строку
        string = scanner.nextLine();
            if (string.isBlank()) {  // если введена пустая строка
                System.out.print("Некорректный ввод. Введите выражение:_");
            } else breaker = false;
        }
    }

    public static double output() {  //// решение выражения и вывод результата
        double result = 0;
//        for (int i = 1; i < string.length() - 1; i++) {  // начинаем поиск знака действия с индекса 1 и заканчиваем предпоследним
//            System.out.print("берем символ " + string.charAt(i) + " и сравниваем с символом ");
//            for (int j = 0; j < 4; j++) {
//                System.out.println(signs.charAt(j));
//                if (string.charAt(i) == signs.charAt(0)) {
//                    System.out.println("Знак '+' найден на позиции " + i);
//                    signIndexCurr = i;
//                    break;
//                }
//                else if (string.charAt(i) == signs.charAt(1)) {
//                    System.out.println("Знак '-' найден на позиции " + i);
//                    signIndexCurr = i;
//                    break;
//                }
//                else if (string.charAt(i) == signs.charAt(2)) {
//                    System.out.println("Знак '*' найден на позиции " + i);
//                    signIndexCurr = i;
//                    break;
//                }
//                else if (string.charAt(i) == signs.charAt(3)) {
//                    System.out.println("Знак '/' найден на позиции " + i);
//                    signIndexCurr = i;
//                    break;
//                }
//            }
//        }
        if (string.contains("+")) {
            String[] array = string.split("[+]");  // TODO знак "+" без скобок не принимается в качестве разделителя (?)
            result = Double.parseDouble(array[0]) + Double.parseDouble(array[1]);
        }
        else if (string.contains("-")) {
            String[] array = string.split("-");
            result = Double.parseDouble(array[0]) - Double.parseDouble(array[1]);
        }
        else if (string.contains("*")) {
            String[] array = string.split("[*]");  // TODO знак "*" без скобок не принимается в качестве разделителя (?)
            result = Double.parseDouble(array[0]) * Double.parseDouble(array[1]);
        }
        else if (string.contains("/")) {
            String[] array = string.split("/");
            result = Double.parseDouble(array[0]) / Double.parseDouble(array[1]);
        }
        else System.out.println("Неверный ввод");
        return result;
    }

//    public static String workString() {  //// приводим строку к рабочему состоянию
//        for (int i = 0; i < string.length(); i++) {
//
//        }
//
//    }

//    public static boolean isExpression() {  //// введенная строка - выражение? ищем знаки действия , считаем их количество
//        for (int i = 0; i < string.length(); i++) {
//            if (string[i] == Actions[0])
//        }
//        return true;
//    }

    public static void main(String[] args) {
        input();
        System.out.println("Результат: " + output());
    }
}