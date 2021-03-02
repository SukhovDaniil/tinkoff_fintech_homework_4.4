import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // переменная для получения согласия на прдолжение работы с калькулятором
        String consent;
        Scanner input = new Scanner(System.in);

        System.out.println("Данный калькулятор принимает на вход числа\n" +
                "и знаки математических операций: + - / *.\n" +
                "Ввод происходит в следующем порядке:\n" +
                "Строка 1: <опреанд 1>\n" +
                "Строка 2: <знак математическаой операции>\n" +
                "Строка 3: <операнд 2>");
        System.out.print("Приступить к работе?(Y/N): ");
        consent = input.next();

        while (consent.equals("y") || consent.equals("Y")){
            double result;

            // ввод с консоли первого операнда
            double v1 = input.nextDouble();
            // ввод с консоли математического оператора
            String operation = input.next();
            // ввод с консоли второго операнда
            double v2 = input.nextDouble();

            switch (operation){
                case "+":
                    Adder add = new Adder();
                    result = add.execute(v1, v2);
                    System.out.println(v1 + " + " + v2 + " = " + result);
                    System.out.print("Продолжить работу с калькулятором?(Y/N): ");
                    consent = input.next();
                    break;
                case "-":
                    Subtractor sub = new Subtractor();
                    result = sub.execute(v1, v2);
                    System.out.println(v1 + " - " + v2 + " = " + result);
                    System.out.print("Продолжить работу с калькулятором?(Y/N): ");
                    consent = input.next();
                    break;
                case "/":
                    if (v2 == 0){
                        System.out.print("Точное вычисление результата запрошенной операции\n" +
                                "при заданных значениях невозможно. Примерное значение - банан.\n" +
                                "Желаете продолжить работу с калькулятором?(Y/N): ");
                        consent = input.next();
                    } else {
                        Divider div = new Divider();
                        result = div.execute(v1, v2);
                        System.out.println(v1 + " / " + v2 + " = " + result);
                        System.out.print("Продолжить работу с калькулятором?(Y/N): ");
                        consent = input.next();
                    }
                    break;
                case "*":
                    Multiplier multi = new Multiplier();
                    result = multi.execute(v1, v2);
                    System.out.println(v1 + " * " + v2 + " = " + result);
                    System.out.print("Продолжить работу с калькулятором?(Y/N): ");
                    consent = input.next();
                    break;
                default:
                    System.out.println("Зарегестрирован некорректный ввод: возможно, запрашиваемая\n" +
                            "операция не поддерживается данным калькулятором.\n" +
                            "Список поддерживаемых математических опреаций:\n" +
                            "• сложение +\n" +
                            "• вычистание -\n" +
                            "• деление /\n" +
                            "• умножение *");
                    System.out.print("Продолжить работу с калькулятором?(Y/N): ");
                    consent = input.next();
                    break;
            }
        }

        System.out.println("Good luck");
    }
}
