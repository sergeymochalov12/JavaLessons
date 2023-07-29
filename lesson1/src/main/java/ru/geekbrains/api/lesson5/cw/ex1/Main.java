package ru.geekbrains.api.lesson5.cw.ex1;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Item staff1 = new Item("ложка", "Китай", 10000);
        Item staff2 = new Item("вилка", "Россия", 100);
        Item staff3 = new Item("нож", "Китай", 50000);
        Item staff4 = new Item("чашка", "Россия", 60000);

        ArrayList<Item> itemList = new ArrayList<>();

        itemList.add(staff1);
        itemList.add(staff2);
        itemList.add(staff3);
        itemList.add(staff4);

        System.out.println("itemList = " + itemList);

        Scanner scanner = new Scanner(System.in);
        String searchParam = scanner.nextLine();
        ArrayList<String> countryList = getCountryList(itemList, searchParam);
        int sumVolume = getSumVolume(itemList, searchParam, countryList);

        System.out.println("countryList = " + countryList);
        System.out.println("sumVolume = " + sumVolume);
    }

    /**
     * @param itemList
     * @param searchParam
     * @return
     * @apiNote Найти страны, которые экспортируют данный(введенный с кл-ы) товар
     */
    private static ArrayList<String> getCountryList(ArrayList<Item> itemList, String searchParam) {
        ArrayList<String> result = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getName().equals(searchParam)) {
                result.add(item.getCountry());
            }
        }
        return result;
    }

    /**
     * @param itemList
     * @param searchParam
     * @param countryList
     * @return
     * @apiNote бщий объем его экспорта товара
     */
    private static int getSumVolume(ArrayList<Item> itemList, String searchParam, ArrayList<String> countryList) {
        int sumVolume = 0;
        for (Item item : itemList) {
            if (item.getName().equals(searchParam)) {
                sumVolume += item.getVolume();
            }
        }
        return sumVolume;
    }
}
