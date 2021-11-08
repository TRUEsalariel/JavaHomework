package JavaHW.Lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeworkApp3 {
  public static void main(String[] args) {
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//С помощью цикла и условия заменить 0 на 1, 1 на 0;;
    changeZero();
    System.out.println("__________");
//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    fillArray();
    System.out.println("__________");
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    doubleArray();
    System.out.println("__________");
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    table();
    System.out.println("__________");
//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
// int длиной len, каждая ячейка которого равна initialValue;
    int[] temp = numberFromArray(10 , 99);
    System.out.println(Arrays.toString(temp));
    System.out.println("__________");
//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    findMinMax();
    System.out.println("__________");

  }

  //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//С помощью цикла и условия заменить 0 на 1, 1 на 0;;
  public static void changeZero() {
    System.out.print("Задание 1: ");
    int[] array = {0, 0, 1, 0, 1, 1, 0, 1};
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 1) {
        array[i] = 0;
      } else {
        array[i] = 1;
      }
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
  public static void fillArray() {
    System.out.print("Задание 2: ");
    int[] array1 = new int[100];
    for (int j = 0; j < array1.length; j++) {
      array1[j] = j + 1;
      System.out.print(array1[j] + " ");
    }
    System.out.println();
  }

  //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
  public static void doubleArray() {
    System.out.print("Задание 3: ");
    int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int k = 0; k < array2.length; k++) {
      if (array2[k] < 6) {
        array2[k] *= 2;
      }
      System.out.print(array2[k] + " ");
    }
    System.out.println("");
  }

  //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
  public static void table() {
    System.out.println("Задание 4: ");
    int[][] table = new int[10][10];
      for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < table.length; j++) {
        table[i][i] = 1;
        table[i][table.length - 1 - i] = 1;
        System.out.print(table[i][j] + "  ");
      }
      System.out.println();
    }
  }

  //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
  // массив типа int длиной len, каждая ячейка которого равна initialValue;
  public static int[] numberFromArray(int len, int initialValue){
    System.out.print("Задание 5: ");
    int[] tempA = new int[len];
    for (int i = 0; i < tempA.length; i++) {
      tempA[i] = initialValue;
    }
    return tempA;
  }
//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
// *Взял случайный массив.
private static void findMinMax() {
  System.out.println("Задание 6: ");
  int[] array = {6, 2, 15, 7, 11, 8, 9, 1};
    int min = array[0];
    int max = array[0];
    for ( int i = 0; i < array.length; i++) {
      if ( array[i] < min) {
        min = array[i];
      }
      }
      System.out.println( "Минимальное число - " + min);
    for ( int k = 0; k < array.length; k++) {
      if (array[k] >= max) {
        max = array[k];
      }
  }
  System.out.println( "Максимальное число - " + max);
  }


}




