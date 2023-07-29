package ru.geekbrains.api.lesson3.hw.calculator;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * Возьмите код от калькулятора с прошлого урока.
 * К этому калькулятору нужно добавить логирование.
  * Логи запишите в файл log.txtв формате:

 * "гггг-мм-дд чч:мм User entered the first operand = {первое число}"
 * "гггг-мм-дд чч:мм User entered the operation = {оператор}"
 * "гггг-мм-дд чч:мм User entered the second operand = {второе число}"
 * "гггг-мм-дд чч:мм Result is {результат}"
 */

class Calculator {
    public int calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd kk:mm");
        String data1 = data.format(calendar.getTime());
        StringBuilder str = new StringBuilder();
        int result = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("ERROR");
                    result = -1;
                    break;
                }
                result = a / b;
                break;
            default:
                System.out.println("Некорректный оператор: " + op);
                result = -1;
        }
        str.append(data1).append(" User entered the first operand = ").append(a).append("\n")
                .append(data1).append(" User entered the operation = ").append(op).append("\n")
                .append(data1).append(" User entered the second operand = ").append(b).append("\n")
                .append(data1).append(" Result is ").append(result).append("\n");
        str.append (data1).append("---------------КОНЕЦ ЛОГА ----------------");
        System.out.println(str);

        try(FileWriter writer = new FileWriter("log.txt", true)) {
            //writer.write(str.toString());
            writer.write(str.toString());
           writer.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
   class Printer{

    public static void main (String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}


