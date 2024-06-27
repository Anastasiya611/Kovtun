// 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
// - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
// - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = scanner.nextInt();
        System.out.print("enter b: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a > b");
            System.out.println("a+b=" + (a + b) + " a-b=" + (a - b) + " a*b=" + (a * b) + " a/b=" + (a / b));
            return;
        }
        if (a < b) {
            System.out.println("a < b");
            System.out.println("a+b=" + (a + b) + " b-a=" + (b - a) + " a*b=" + (a * b) + " b/a=" + (b / a));
            return;
        }
        if (a == b) {
            System.out.println("a = b");
            System.out.println("a+b=" + (a + b) + " a-b=" + (a - b) + " a*b=" + (a * b) + " a/b=" + (a / b));
            return;

        }
    }
}