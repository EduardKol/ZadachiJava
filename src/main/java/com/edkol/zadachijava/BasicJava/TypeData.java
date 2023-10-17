/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edkol.zadachijava.BasicJava;

import java.util.Scanner;

/**
 *
 * @author Eduard
 Основные типы данных. Ввод данных с клавиатуры
 */
public class TypeData {
    
/* Следующее четное
    Дано целое число n. Выведите следующее за ним четное число. При решении этой задачи нельзя использовать условную инструкцию if и циклы. 
    Подсказка: Подумайте, что будет оставаться в остатке при делении на 2 у чётных и у нечётных чисел.
*/
    public static void getNextEven(){              
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n-(n%2))+2);
    }
    
/*Площадь и периметр
    На одной строчке через пробел записаны два целых числа: длина и ширина прямоугольника.
    Вычислите его площадь и периметр (именно в таком порядке). Результат выведите на разных строках.
*/
    public static void getAreaPerimeter() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int l2 = sc.nextInt();
        System.out.println(l * l2);
        System.out.println((l + l2)*2);
    }
    
/*Стоимость покупки
    Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
    Программа получает на вход три числа: a, b, n.
    Программа должна вывести два числа: стоимость покупки в рублях и копейках.
*/ 
    public static void getPurchasePrice() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int rub = (((a * 100) + b)*n)/100;
        int kop = (((a * 100) + b)*n)%100;
        System.out.println(rub + " " + kop);
    }
    
/*Последняя цифра
    Дано произвольное положительное натуральное число. Найдите его последнюю цифру.
*/
    public static void getLastDigit() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a%10);
    }
    
/*Сумма цифр
    Дано терхзначное число. Найдите сумму его цифр.
*/
    public static void SumFigure() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n % 10) + (n / 10) % 10 + (n / 100));
    }
    
/*МКАД
Длина Московской кольцевой автомобильной дороги —109 километров. 
Байкер Вася стартует с нулевого километра МКАД и едет со скоростью v километров в час. 
На какой отметке он остановится через t часов?
Программа получает на вход значения v и t. Если v>0, то Вася движется в положительном направлении по МКАД, если же значение v<0, то в отрицательном.
Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.
*/
    public static void getPointMKAD() {
        int mkad = 109;
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int t = sc.nextInt();
        int s = v*t;
        System.out.println((mkad + s % mkad) % mkad);        
    }

/*Улитка
Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров.
На какой день улитка доползёт до вершины шеста?
Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
Программа должна вывести одно натуральное число.
*/
    public static void getSnailsWay() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = h-b; 
        int p = a-b; 
        System.out.print((q+p-1)/p);
    }
    
/*Следующее и предыдущее
Напишите программу, которая считывает целое число и выводит текст, аналогичный приведенному в примере. 
Пробелы, знаки препинания, заглавные и строчные буквы важны!
Вводится целое число, по модулю не превосходящее 10000.
Выведите сначала фразу "The next number for the number ", 
затем введенное число, затем слово " is ", окруженное пробелами, 
затем формулу для следующего за введенным числа, наконец, знак точки без пробела. 
Аналогично в следующей строке для предыдущего числа.
*/
    public static void getNextPrevious() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The next number for the number " + a + " is " + (a + 1) + ".");
        System.out.println("The previous number for the number " + a + " is " + (a - 1) + ".");
    }
}
