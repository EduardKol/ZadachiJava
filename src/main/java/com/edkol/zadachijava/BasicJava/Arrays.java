/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edkol.zadachijava.BasicJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Eduard
 * Массивы
 */
public class Arrays {
    
/*Кубы
    Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
    Затем вводятся 2 числа из этого диапазона. 
    Используя данные из массива найдите их кубы.
*/
    public static void getCubes() {
        int n = 1000;
        int[] cubes = new int[n+1];
        for (int i = 0; i <= n; i++) cubes[i] = i * i * i;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(cubes[a] + " " + cubes[b]);
    }

/*Простая обработка массива
Вводится число n, затем n чисел целых, по одному на каждой строке.
Затем вводится число, на которое нужно умножить все введённые выше числа.
Выведите на экран результат умножения построчно.
*/
    public static void getSimpleArrayProcessing() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i] * b);
        }
    }
    
 /*Сумма
Вводится список (сначала количество элементов, потом сами элементы). 
Найдите сумму всех элементов и выведите её. 
А потом выведите введённые числа в обратном порядке.
*/
    public static void getSum() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
        for(int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
    
/*Сумма 2
Вводится массив (сначала количество элементов, потом сами элементы). 
Найдите сумму его элементов с чётными индексами и выведите её. 
А потом выведите числа, которые суммировались.
*/
    public static void getSum2() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        int sum = 0;       
        for(int i = 0; i< array.length; i++) {
            array[i] = sc.nextInt();            
        }
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
            i++;
        }
        System.out.println(sum);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            i++;
        }
    }
    
/*Поменяться местами
Дан список (сначала количество элементов, потом сами элементы). 
Потом водятся два числа: a и b. 
Поменяйте местами значения a-ого и b-ого элементов массива и выведите его на экран построчно. 
Гарантируется, что а и b не выходят за границы размеров массива. 
*/
    public static void getSwap() throws Exception {
        Scanner sc = new Scanner(System.in);
        try {        
            List<Integer> array = new ArrayList<>();
            int arraySize = sc.nextInt();
            for(int i = 0; i < arraySize; i++) {
            array.add(sc.nextInt());
            }
            Collections.swap(array, sc.nextInt(), sc.nextInt());
            for(int num : array) {
                System.out.println(num);
            }          
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("\nException thrown : " + e);
        }
    }
    
 /*Шеренга
Петя перешёл в другую школу. 
На уроке физкультуры ему понадобилось определить своё место в строю. 
Помогите ему это сделать.
Входные данные
Программа получает на вход невозрастающую последовательность натуральных чисел (сначала вводится количество, затем сами числа),
означающих рост каждого человека в строю.
После этого вводится число X – рост Пети. Все числа во входных данных натуральные и не превышают 200.
Выходные данные
Выведите номер, под которым Петя должен встать в строй. 
Если в строю есть люди с одинаковым ростом, таким же, как у Пети, то он должен встать после них.
*/
    public static void getRank() throws Exception {
        Scanner sc = new Scanner(System.in);
        try{
            List<Integer> rank = new ArrayList<>();
            int rankSize = sc.nextInt();
            for(int i = 0; i < rankSize; i++) {
                rank.add(sc.nextInt());
            }
            Integer x = sc.nextInt();
            int result = 1;
            for(int i = 0; i < rankSize; i++) {               
                if(rank.get(i)>= x) {
                    result++;
                }
            }
            System.out.println(result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nException thrown : " + e);
        }       
    }
    
    /*Уникальные элементы
Дан список. 
Выведите те его элементы, которые встречаются в списке только один раз.
Элементы нужно выводить в том порядке, в котором они встречаются в списке.
Входные данные:
Вводится список чисел. 
Все числа списка находятся на одной строке.
Выходные данные:
Выведите ответ на задачу.
*/
    public static void getUniqueElements() throws Exception {
        try {
        Scanner sc = new Scanner(System.in);
        int list_size = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> listDubl = new ArrayList<>();
        int x;
        for(int i = 0; i < list_size; i++) {
            x = sc.nextInt();
            if(list.contains(x)) {
                list.add(x);
                listDubl.add(x);
            }
            else {
                list.add(x);
            }
              }
        for(int a : list) {
            if(!listDubl.contains(a)) {
                System.out.println(a);
            }
        }      
            }   catch (IndexOutOfBoundsException e) {
            System.out.println("\nException thrown : " + e);
        }
    }
    
    /*Переставить соседние
Переставьте соседние элементы списка (A[0] c A[1], A[2] c A[3] и т.д.). 
Если элементов нечетное число, то последний элемент остается на своем месте.
Входные данные:
Вводится список чисел. 
    Все числа списка находятся на одной строке.
Выходные данные:
Выведите ответ на задачу.
*/
    public static void getSwapNearby() throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i =0; i < count; i++) {
                list.add(sc.nextInt());
            }           
            for(int i = 0; i < list.size()-1; i+=2) {
                Collections.swap(list, i, i+1);
            }
            for(Integer i : list) {
                System.out.println(i);
            }
        } catch(IndexOutOfBoundsException e) {
            System.out.println("\nException thrown : " + e);
        }
    }
    
    /*Кубы 2
Вводятся числа a и b. Создайте массив, в котором будут храниться кубы чисел от a до b. 
Затем вводится число n и n чисел после него. 
Используя данные из массива найдите кубы этих. 
Если вводится число, не принадлежащее заданному диапазону, выведите на экран слово "Error".
*/
    public static void getCub2() throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            Map<Integer, Integer> cub = new HashMap<>();
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int i = a; i <= b; i++) {
                int c = i*i*i;
                cub.put(i, c);
            }
            int n = sc.nextInt();
            for(int i = 0; i < n; i++) {
                int m = sc.nextInt();
                if(!cub.containsKey(m)){
                    System.out.println("Error");
                } else {
                    System.out.println(cub.get(m));
                }
            }
        } catch(IndexOutOfBoundsException e) {
            System.out.println("\nException thrown : " + e);
        }
    }
    
}