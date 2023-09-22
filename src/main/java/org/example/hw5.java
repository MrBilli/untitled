package org.example;


import java.util.*;

public class hw5 {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        String name = "";
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.printf("Input a name or \"q\" to exit: "); // заполняем телефонную книгу
            name = in.nextLine();
            if (name.equals("q"))
                break;
            System.out.printf("Input a phone number or \"q\" to exit: ");
            String number = in.nextLine();
            if (phoneBook.get(name) != null)
                phoneBook.put(name, phoneBook.get(name) + " " + number);
            else phoneBook.put(name, number);
        }

        ArrayList<String[]> numbers = new ArrayList<>();

        phoneBook.forEach((k, v) -> numbers.add(phoneBook.get(k).split(" "))); // заполняем массив номерами телефонов

        boolean isSorted = false;
        String[] buf;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i).length < numbers.get(i + 1).length) {    // сортируем массив
                    isSorted = false;
                    buf = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, buf);
                }
            }
        }

//        for (int i = 0; i < numbers.size(); i++) {
//            for (int j = 0; j < numbers.get(i).length; j++) {
//                System.out.print(Arrays.toString(numbers.get(i)[j].toCharArray())); // вывожу отсортированный массив для проверки
//            }
//            System.out.println();
//        }

        System.out.println(phoneBook);

        // НИЖЕ ПЫТАЛСЯ ПРИ ПОМОЩИ ОТСОРТИРОВАННОГО МАССИВА ИЗ НОМЕРОВ ОТСОРТИРОВАТЬ ТЕЛЕФОННУЮ КНИГУ, НО ЧТО ПОШЛО НЕ ТАК

//        HashMap<String, String> sortedPhoneBook = new HashMap<>();
//
//while (sortedPhoneBook.size()<numbers.size()) {
//    for (int i = 0; i < numbers.size(); i++) {
//        if (phoneBook.containsValue(Arrays.toString(numbers.get(i))
//                .substring(1, Arrays.toString(numbers.get(i)).length() - 1)
//                .replaceAll(", ", ""))) {
//            String tempV = Arrays.toString(numbers.get(i))
//                    .substring(1, Arrays.toString(numbers.get(i)).length() - 1)
//                    .replaceAll(",", "");
//            String tempK = "";
//            for (String k : phoneBook.keySet()) {
//                if (phoneBook.get(k).equals(tempV)) {
//                    tempK = k;
//
//                }
//            }
//            sortedPhoneBook.put(tempK, tempV);
//        }
//
//    }
//}
//
//        System.out.println(sortedPhoneBook);
    }

}