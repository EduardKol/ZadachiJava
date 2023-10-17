/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edkol.zadachijava.BasicJava;

import static java.lang.Character.isDigit;
import java.util.Scanner;

/**
 *
 * @author Eduard
 * Основные функции строк
 */
public class BasicFunctionStrings {
    
/*Это цифра?
    Напишите программу, определяющую, является ли данный символ цифрой или нет.
    Входные данные:
    Задан единственный символ c.
    Выходные данные:
    Необходимо вывести строку "yes", если символ является цифрой, и строку "no" в противном случае. 
*/
    public static void thisIsDigit() {
        System.out.print(Character
                .isDigit(new Scanner(System.in)
                        .nextLine()
                        .charAt(0)) ? "yes" : "no");
        } 
    
    /*Строки
Дана строка.
Сначала выведите третий символ этой строки.
Во второй строке выведите предпоследний символ этой строки.
В третьей строке выведите первые пять символов этой строки.
В четвертой строке выведите всю строку, кроме последних двух символов.
На пятой строке выведите всю строку, кроме первых 3 символов.
На шестой строке выведите длину данной строки.
Гарантируется, что вводится строчке, состоящая не менее, чем из 5 символов.
*/
    public static void getPartOfString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] line = s.toCharArray();
        //третий символ строки
        System.out.println(line[2]);
        //предпоследний символ строки
        System.out.println(line[line.length-2]);       
        //первые пять символов строки
        for(int i = 0; i < 5; i++) {
            System.out.print(line[i]);
        }
        System.out.println("");
        //вся строка, кроме последних 2 символов
        for(int i = 0; i < line.length-2; i++) {
            System.out.print(line[i]);           
        }
        System.out.println("");
        //вся строка, кроме первых 3 символов
        for(int i = 3; i < line.length; i++) {
            System.out.print(line[i]);           
        }
        System.out.println();
        //длина строки
        int length = line.length;
        System.out.println(length);
    }
    }
    

