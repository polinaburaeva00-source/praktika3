package praktika1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Введите значение a: ");
        a = sc.nextInt();
        System.out.println("Введите значение б: ");
        b = sc.nextInt();
        System.out.println("a+b= " + (a + b));
         */


        /* //Задание 3
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        double average;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = (double) sum / numbers.length;
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);
         */


        /* //Задание 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Введите " + n + " целых чисел:"); // Ввод элементов массива
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        int index = 0;
        do {
            sum += numbers[index];
            if (numbers[index] > max) {
                max = numbers[index];
            }
            if (numbers[index] < min) {
                min = numbers[index];
            }
            index++;
        } while (index < n);
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        scanner.close();
         */

        /* //Задание 5
        System.out.println("Аргументы командной строки:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
         */


        /* //Задание 6
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.printf("H(%d) = %.4f%n", i, harmonicNumber);
        }
         */


        /* //Задание 7
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();
        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен: " + factorial);
        scanner.close();
    }
    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;

         */

    }
}

