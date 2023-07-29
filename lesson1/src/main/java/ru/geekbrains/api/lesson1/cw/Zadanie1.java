package ru.geekbrains.api.lesson1.cw;

    class Answer {
        public void printPrimeNums(){
            boolean prime = true;
            //System.out.println(1);
            //System.out.println(2);
            for (int i=1; i<1000;i++){
                prime = true;
                for (int j =2; j<i; j++){
                    if (i%j == 0){
                        prime = false;
                        break;
                    }

                }
                if (prime == true){
                    System.out.print(" " + i);
                    //continue;
                }

            }
        }
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
     class Printer{
        public static void main(String[] args) {

            Answer ans = new Answer();
            ans.printPrimeNums();
        }
    }

