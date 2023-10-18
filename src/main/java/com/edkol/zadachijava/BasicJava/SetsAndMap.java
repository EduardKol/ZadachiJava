/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edkol.zadachijava.BasicJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Eduard
 * Множества и словари
 */
public class SetsAndMap {
    /*Словарь синонимов
Вам дан словарь, состоящий из пар слов. 
Каждое слово является синонимом к парному ему слову. Все слова в словаре различны.
Для слова из словаря, записанного в последней строке, определите его синоним.
Вводится число n. Затем 2*n строк. И Ещё одна строка - синоним для которой нужно вывести.
*/
    public static void DictionaryOfSynonyms() throws Exception {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Map<String, String> synonyms = new HashMap<>();
                
            for(int i = 0; i < n; i++) {
                String s1 = sc.next();
                String s2 = sc.next();
                synonyms.put(s1, s2);               
            }
            String s = sc.next();
            if(synonyms.containsKey(s)) {
                System.out.println(synonyms.get(s));
            } else if(synonyms.containsValue(s)){
                for(Map.Entry<String, String> item : synonyms.entrySet()) {
                    if(item.getValue().equals(s)) {
                        System.out.println(item.getKey());
                    }
                }
            }
            
        } catch(IndexOutOfBoundsException e) {
            System.out.println("\nException thrown : " + e);
        }
        
    }
    /*Что ты сказал?
Вводится натуральное число n, затем n слов на разных строках. 
Определите, какое слово встречается чаще всего. 
Гарантируется, что такое слово одно. 
Все слова вводятся в нижнем регистре на русском языке.
*/
    public static void WhaDidYouSay() {
        
    }
    
}
