package ru.geekbrains.api.lesson3.cw;

/** Добавление элемента в массив
 *
 */
public class Ex1 {
    static int[] AddItemInArray(int[] array, int item) {// создаем метод AddItemInArray который принимает на вход массив целых чисел и переменную item
        int length = array.length;

        int[] temp = new int[length + 1]; // создается новый массив больше на 1
        System.arraycopy(array, 0, temp, 0, length); // копируестя массив с 0-го элемента до конца
        temp[length] = item; // последнему элементу присваевается значение
        return temp; // возвращается массив
    }

    public static void main(String[] args) {//точка входа
        int[] a = new int[] { 0, 9 };
        System.out.println("Элементы входного массива");

        for (int i : a) { System.out.printf(" i = %d ", i); }
        a = AddItemInArray(a, 1);
        a = AddItemInArray(a, 2);
        a = AddItemInArray(a, 3);
        System.out.println();
        System.out.println("Элементы  массива после добавления элеменов");
        for (int i : a) { System.out.printf("i = %d ", i); }
        System.out.println();
    }
}
