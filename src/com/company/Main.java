package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here


        double [] mas1 = new double[7];
        double[] mas2 = new double[8];

        for (int i = 0; i < 5; i++) {
            mas1[i] = (double) (Math.random()*6);
            mas2[i] = (double) (Math.random()*6);
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));

        double average1 = 0;
        double average2 = 0;

        for (double i = 0; i < 5; i++) {
            average1 += mas1[(int) i];
            average2 += mas2[(int) i];
        }
        average1/=5;
        average2/=5;

        if(average1 > average1){
            System.out.println("Среднее арифметическое первого массива ("+average1+") больше среднего арифметического "+
                    "второго массива ("+average2+")");
        } else if(average1 < average2){
            System.out.println("Среднее арифметическое первого массива ("+average1+") меньше среднего арифметического "+
                    "второго массива ("+average2+")");
        } else {
            System.out.println("Средние арифметические массивов равны ("+average1+")");
        }






    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }
    }





        }


