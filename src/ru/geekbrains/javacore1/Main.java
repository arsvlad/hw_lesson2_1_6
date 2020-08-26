package ru.geekbrains.javacore1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // ЗАДАНИЕ 1

        int[] arr1 = {0, 1, 1, 0, 0, 1, 1, 0};

        System.out.println();
        System.out.println("ЗАДАНИЕ 1");
        System.out.println();
        System.out.println("ИСХОДНЫЙ МАССИВ:");
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] == 0) arr1[i] = 1;

            else arr1[i] = 0;
        }

        System.out.println("ИНВЕРТИРОВАННЫЙ МАССИВ:");
        System.out.println(Arrays.toString(arr1));



        // ЗАДАНИЕ 2

        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ 2");

        int[] arr2 = new int[8];
        int b = 0;

        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = b;
            b+=3;

        }
        System.out.println();
        System.out.println("СФОРМИРОВАННЫЙ МАССИВ:");
        System.out.println(Arrays.toString(arr2));


        // ЗАДАНИЕ 3

        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ 3");

        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println();
        System.out.println("ИСХОДНЫЙ МАССИВ");
        System.out.println(Arrays.toString(arr3));

        for (int i = 0; i < arr3.length; i++) {

            if (arr3[i] < 6) arr3[i] *= 2;

        }

        System.out.println();
        System.out.println("ОБРАБОТАННЫЙ МАССИВ");
        System.out.println(Arrays.toString(arr3));


        // ЗАДАНИЕ 4

        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ 4");
        System.out.println();
        System.out.println("СФОРМИРОВАННЫЙ МАССИВ");

        int [] [] arr4 = new int [5] [5];

        for (int i = 0; i < arr4.length; i++) {

            for (int j = 0; j < arr4[i].length; j++) {

                if (i==j) {
                    arr4[i][j] = 1;
                }
            }
        }

        printArr2d (arr4);


        // ЗАДАНИЕ 5

        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ 5");
        System.out.println();

        int[] arr5 = { 1, 5, 3, 2, 11, 4, 5, 2, -4, 8, 9, 0 };

        System.out.println("ИСХОДНЫЙ МАССИВ:");
        System.out.println(Arrays.toString(arr5));

        int arrMax = arr5 [0];
        int arrMin = arr5 [0];

        for (int i = 0; i < (arr5.length); i++) {
            if (arr5 [i] > arrMax) arrMax = arr5 [i];
            if (arr5 [i] < arrMin) arrMin = arr5 [i];
        }


        System.out.println();
        System.out.println("МАКСИМАЛЬНЫЙ ЭЛЕМЕНТ МАССИВА: " + arrMax);
        System.out.println();
        System.out.println("МИНИМАЛЬНЫЙ ЭЛЕМЕНТ МАССИВА: " + arrMin);



        // ЗАДАНИЕ 6

        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ 6");
        System.out.println();

        int[] arr6 = { 3, 6, 5, 4, 3, 4, 3, 5, 9 };

        System.out.println("ИСХОДНЫЙ МАССИВ:");
        System.out.println(Arrays.toString(arr6));
        System.out.println();

        System.out.println("Результат массива: " + checkArr (arr6));


    }


    static boolean checkArr (int [] arr) {

        int sum = 0;
        int sum1 = arr [0];

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }


        System.out.println("Для информации. Сумма элементов массива: " + sum);
        System.out.println();

        for (int i = 0; i < arr.length-1; i++) {

            if (sum1 == (sum - sum1)) {

                System.out.println ("Есть баланс после элемента номер " + i + " (начиная с нулевого элемента). Дальше не проверялось.");
                System.out.println();
                System.out.println ("Сумма каждой равной стороны массива равна " + sum1 + ".");
                System.out.println();
                return true;
            }

            else sum1 = sum1 + arr[i+1];

        }

        System.out.println();
        return false;

    }



    static void printArr2d (int [] [] arr2d) {
        for (int i = 0; i < arr2d.length; i++) {
            for (int j=0; j < arr2d[i].length; j++) {
                System.out.printf("%3s", arr2d [i] [j]);
            }
            System.out.println();
        }
    }

}

