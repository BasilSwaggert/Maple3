package com.javabundleExercises2;

import java.util.Arrays;
import java.util.HashSet;

public class Main{

    public static void main(String[] args) {
        //1
        int[] my_array1 = {
                1789, 2035, 1899,
                1456, 2013, 1458,
                2458, 1254, 1472,
                2365, 1456, 2165,
                1457, 2456
        };

        Arrays.sort(my_array1);
        System.out.println(Arrays.toString(my_array1));

        String[] my_array2 = {
                "Java", "Python", "PHP", "C#", "C Programming", "C++"
        };

        Arrays.sort(my_array2);
        System.out.println(Arrays.toString(my_array2));

        //2
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int i = 0; i < my_array.length; i++) {
            sum += my_array[i];
        }
        System.out.println(sum);

        //3
        for (int i=0; i<10; i++) {
            System.out.println("----------");
        }

        //4
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int total = 0;

        for(int i=0; i<numbers.length; i++) {
            total = total + numbers[i];
        }

        int average = total / numbers.length;
        System.out.println("Average = " + average);

        //5
        int valueToCheck = 1254;
        for (int element : my_array1) {
            if (element == valueToCheck) {
                System.out.println("True");
                break;
            } else {
                System.out.println("False");
                break;
            }
        }

        //6
        int[] my_Array3 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int index = -1;
        for(int i = 0; (i < my_Array3.length) && (index == -1); i++) {
            if(my_Array3[i] == 14) {
                index = i;
            }
        }
        System.out.println(index);

        //7
        System.out.println("Original Array : " + Arrays.toString(my_Array3));
        int removeIndex = 4;
        for(int i = removeIndex; i < my_Array3.length -1; i++) {
            my_Array3[i] = my_Array3[i + 1];
            System.out.println("Array with element removed: " + Arrays.toString(my_Array3));
            break;
        }

        //8
        int[] new_Array = new int[10];
        System.out.println("Original Array: " + Arrays.toString(my_Array3));
        for(int i=0; i < my_Array3.length; i++) {
            new_Array[i] = my_Array3[i];
        }
        System.out.println("New Array: " + Arrays.toString(new_Array));

        //9
        int index_position = 2;
        int newValue = 5;
        System.out.println("Original Array: " + Arrays.toString(my_Array3));
        for(int i=my_Array3.length-1; i > index_position; i--) {
            my_Array3[i] = my_Array3[i-1];
        }
        my_Array3[index_position] = newValue;
        System.out.println("New Array: " + Arrays.toString(my_Array3));

        //10
//        int max;
//        int min;
//        max = my_Array3[0];
//        min = my_Array3[0];
//        int length = my_Array3.length;
//        for(int i = 1; i < length - 1; i = i + 2) {
//            if (my_Array3[i] > max) max = my_Array3[i];
//            if (my_Array3[i] < min) min = my_Array3[i];
//        }
//        if(my_Array3[i] > my_Array3[i + 1]) {
//            if (my_array[i] > max) max = my_array[i];
//            if (my_array[i + 1] < min) min = my_array[i + 1]
//        }
//        if (my_array[i] < my_array[i + 1]) {
//            if (my_array[i] < min) min = my_array[i];
//            if (my_array[i + 1] > max) max = my_array[i + 1];
//        }
//        max_min(my_array);
//        System.out.println(" Original Array: "+Arrays.toString(my_array));
//        System.out.println(" Maximum value for the above array = " + max);
//        System.out.println(" Minimum value for the above array = " + min);

        //11
        System.out.println("First Array: " + Arrays.toString(my_array1));
        for(int i = 0; i < my_array1.length / 2; i++) {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - 1 - 1] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(my_array1));

        //12
        int[] my_array4 = {1, 2, 5, 5, 6, 6, 7, 2};
        for(int i = 0; i < my_array4.length - 1; i++) {
            for(int j = 0; j < my_array4.length; j++) {
                if ((my_array4[i] == my_array4[j]) && (i != j)) {
                    System.out.println("Duplicate elements: " + my_array4[j]);
                }
            }
        }

        //13
        String[] st_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        for (int i = 0; i < st_array.length - 1; i++) {
            for (int j = 0; j < st_array.length; j++) {
                if ((st_array[i].equals(st_array[j])) && (i != j)) {
                    System.out.println("Duplicate elements: " + st_array[j]);
                }
            }
        }

        //14
        String[] code_array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] code_array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        System.out.println("Array1: " + Arrays.toString(code_array1));
        System.out.println("Array2: " + Arrays.toString(code_array2));

        HashSet<String> set = new HashSet<String>();
            for (int i = 0; i < code_array1.length; i++) {
                for (int j = 0; j < code_array2.length; j++) {
                    if (code_array1[i].equals(code_array2[j])) {
                        set.add(code_array1[i]);
                    }
                }
            }
        System.out.println("Common Element(s): " + (set));

        //15



    }
}
