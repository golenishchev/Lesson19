package com.example.lesson19;

import java.util.HashMap;
import java.util.Hashtable; // Импортирую Hashtable

public class HashTableDemo { // Создаю класс HashTableDemo
    private static Hashtable<String, String> hashTableObj; // объявляю переменную hashTableObj
    private static String value;

    public static void main(String[] args) {
        hashTableObj = new Hashtable<>(); // ссылаюсь на созданный объект Hashtable. А может (такое пишут) и вызываем конструктор, а затем ссылку на него кладём в hashTableObj
        hashTableObj.put("A", "A"); // 0 добавляю элемент используя метод put(K key, V value)
        hashTableObj.put("B", "B"); // 6
        hashTableObj.put("Alive is ", "awesome"); // 5
        hashTableObj.put("Love ", "yoursels"); // 4
        hashTableObj.put("1", "1"); // 2
        hashTableObj.put("1", "2"); // 2 перезаписалось предыдущее значение, т.к. ключ не уникален
        hashTableObj.put("0", "1"); // 3
        hashTableObj.put("2", "1"); // 1
        System.out.println(hashTableObj); // выводится содержимое. Сначала ключ, затем значение
        // далее меня переклинило и начал писать комментарии на инглише =)
        System.out.println(hashTableObj.get("0")); // returns value "1"
        System.out.println(hashTableObj.get(0)); //null because "0" is a String and not an Integer
        System.out.println(hashTableObj.get(1)); //null because "0" is a String and not an Integer
        value = hashTableObj.get("0"); // инициализирую переменную value
        hashTableObj.put("0", value + " 2 3"); // канкатенирую два String-овых значения
        System.out.println(hashTableObj.get("0")); // возвращает значение "1 2 3" после канкатенации

    }
}
