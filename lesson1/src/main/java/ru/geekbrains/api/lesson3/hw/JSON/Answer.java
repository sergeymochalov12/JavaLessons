package ru.geekbrains.api.lesson3.hw.JSON;

class Answer {
    public static void answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
        StringBuilder sb = new StringBuilder();
        /**
         *  "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
         *                     "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
         *                     "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
         */
        String newJSON = JSON.replaceAll("\\{", "").replaceAll("\\}", "")
                .replaceAll("\"", "").replace('[', ' ').replace(']', ' ');

        String[] parts = newJSON.split(",");

        for (String part : parts){
            String[] params = part.split(":");
            if("фамилия".equals(params[0].trim())) {
                sb = new StringBuilder(ELEMENT1).append(params[1]);
            }
            else if("оценка".equals(params[0].trim())) sb.append(ELEMENT2).append(params[1]);
            else if("предмет".equals(params[0].trim())) {
                sb.append(ELEMENT3).append(params[1]);
                System.out.println(sb);
            }
        }
    }
}


