import java.lang.*;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        String line = PARAMS.replace("{", " ").replace("}", " ");
        StringBuilder result = new StringBuilder(QUERY);
        String[] arrayData = line.split(",");
        for (int i = 0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].replace('"', ' ').split(":");
            if (!"null".equals(arrData[1].trim())) {
                result.append(arrData[0].trim()).append("=").append("'").append(arrData[1].trim()).append("'");
                if (i < arrayData.length - 2)
                    result.append(" and ");
            }
        }
        return result;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}
