package ru.geekbrains.api.lesson3.cw;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * Логирование
 */
public class Ex5 {
    public static void main(String[] args) {
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer [] date = { day, month, year, 777 };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
        System.out.println("date = " + date);
        System.out.println("d = " + d);
        // код для логирования
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd kk:mm");
        String data1 = data.format(calendar.getTime());
        StringBuilder str = new StringBuilder();
        str.append(data1).append ("\n").append(" Первая цифра даты date[0] = ").append(date[0]).append("\n").
                append(" Вторая цифра даты date [1] = ").append(date[1]).append("\n").
                append(" Третья цифра даты date[2] = ").append(date[2]).append("\n");

        System.out.println(str);
        System.out.println("date[3] = " + date[3]);
        // код для записи лога в файл
        try(FileWriter writer = new FileWriter("log2.txt", true)) {
            //writer.write(str.toString());
            writer.write(str.toString());
            writer.flush();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
