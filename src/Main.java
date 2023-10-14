import java.util.Scanner;

public class Main {

    public static String string;  // вводимая строка
    public static String[] array;  // массив для хранения обоих аргументов выражения

    public static void input() {  //// ввод строки
        System.out.println("Калькулятор для простых арифметических действий с двумя аргументами");
        System.out.println("===================================================================");
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

    public static void sum(String arg1, String arg2) {  //// производим сложение
        double result = Double.parseDouble(arg1) + Double.parseDouble(arg2);
        if (result % 1 == 0)
            System.out.println("Результат:" + (int) result);
        else System.out.println("Результат:" + result);
    }
    public static void difference(String arg1, String arg2) {  //// производим вычитание
        double result = Double.parseDouble(arg1) - Double.parseDouble(arg2);
        if (result % 1 == 0)
            System.out.println("Результат:" + (int) result);
        else System.out.println("Результат:" + result);
    }
    public static void multiplication(String arg1, String arg2) {  //// производим умножение
        double result = Double.parseDouble(arg1) * Double.parseDouble(arg2);
        if (result % 1 == 0)
            System.out.println("Результат:" + (int) result);
        else System.out.println("Результат:" + result);
    }
    public static void dividing(String arg1, String arg2) {  //// производим деление
        double result = Double.parseDouble(arg1) / Double.parseDouble(arg2);
        if (result % 1 == 0)
            System.out.println("Результат:" + (int) result);
        else System.out.println("Результат:" + result);
    }

    public static void solution() {  //// решение выражения и вывод результата
        if (string.contains("+")) {
            array = string.split("[+]");  // TODO знак "+" без скобок не принимается в качестве разделителя (?)
            sum(array[0], array[1]);
        }
        else if (string.contains("-")) {
            array = string.split("-");
            difference(array[0], array[1]);
        }
        else if (string.contains("*")) {
            array = string.split("[*]");  // TODO знак "*" без скобок не принимается в качестве разделителя (?)
            multiplication(array[0], array[1]);
        }
        else if (string.contains("/")) {
            array = string.split("/");
            dividing(array[0], array[1]);
        }
        else System.out.println("Неверный ввод");
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}