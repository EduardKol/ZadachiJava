/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edkol.zadachijava.BasicJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Eduard
 * Списки
 */
public class Lists {
    /*Создание списка
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
в котором первый и последний элементы будут равны строчке 1, а между ними будет n 0. 
Выведите список на экран через пробел. 
*/
    public static void createList() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 0; i < n; i++) {
            list.add(0);
        }
        list.add(1);
        for(int x : list) {
            System.out.print(x + " ");
        }
    }
    
    /*Добавление элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
в котором будут хранится строковые представления чисел от 0 до n-1. 
Затем программа считывает число m (m <= n) и строку s. 
Вставьте строку s на позицию m. Выведите список на экран через пробел.
*/
    public static void addElement() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Integer s = i;
            list.add(s.toString());
        }
        Integer m = sc.nextInt();
        String s = sc.next();
        list.add(m, s);
        for(String i : list) {
            System.out.print(i + " ");
        }
    }
    
/*Замена элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
в котором будут хранится строковые представления чисел от 0 до n-1. 
Затем программа считывает число m (m < n) и строку s. 
Замените строкой s элемент на позиции m. Выведите список на экран через пробел.
*/
   public static void replacingElement() {
       Scanner sc = new Scanner(System.in);
       Integer n = sc.nextInt();
       ArrayList<String> list = new ArrayList<>();
       for(Integer i = 0; i < n; i++) {
           list.add(i.toString());
       }
       Integer m = sc.nextInt();
       String s = sc.next();
       list.set(m, s);
       for(String i : list) {
           System.out.print(i + " ");
       }
   }
   
   /*Удаление элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
в котором будут хранится строковые представления чисел от 0 до n-1.
Затем программа считывает число m (m < n).
Удалите  элемент на позиции m. Выведите список на экран через пробел.
*/
    public static void deleteElement() {
       Scanner sc = new Scanner(System.in);
       Integer n = sc.nextInt();
       ArrayList<String> list = new ArrayList<>();
       for(Integer i = 0; i < n; i++) {
           list.add(i.toString());
       }
       int m = sc.nextInt();       
       list.remove(m);
       for(String i : list) {
           System.out.print(i + " ");
       }
    }
    
    /*Очередь
Напишите программу, которая реализует структуру данных очередь, используя список.
Условие задачи таково: пользователь листает список музыки и добавляет в плейлист понравившиеся ему композиции. 
Когда песня доигрывает, включается следующая. Вам необходимо вывести на экран через пробел композиции, которые будут играть далее.
Сначала вводится число n - количество запросов к вашей программе. Каждый из запросов будет иметь один следующих видов:
push <Название трека> - добавляет трек в плейлист
pop - удаляет из плейлиста первый трек. При этом на экран выводится запись вида "воспроизводится <название трека>"
После выполнения всех запросов выведите оставшиеся в очереди треки. Гарантируется, что название трека состоит из одного слова.
*/
    public static void getQueue() {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Queue<String> playlist = new LinkedList<>();
        for(int i = 0; i < count; i++) {
            String request = sc.nextLine();
            if(request.startsWith("push")) {
                playlist.offer(request.substring(4).trim());
            } else 
                if(request.startsWith("pop")) {
                    System.out.println("воспроизводится " + playlist.poll());                    
                }
        }
        for(String s : playlist) {
            System.out.print(s.trim() + " ");
        }
    }
}
