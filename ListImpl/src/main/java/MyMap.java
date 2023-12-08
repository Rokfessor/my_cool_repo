package javaapplication4;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class Node<K, V> {                            //класс, который хранит пару ключ-значение
   public K key;
   public V value;
   Node (K k, V v) {
       key = k; value = v;
   }

   public String toString() {
       return "{"+key+" "+value+"]";
   }
}

public class MyMap<K, V> implements IMap<K, V> {
    Set<Node> map = new HashSet<>();          //а тут у нас множество (Set) классов ключ-значение
    public void add(K key, V value)
    {
        Node newNode = new Node(key, value);  
        map.add(newNode);
    }

    public V get(K key){
        if (map.isEmpty()) {
            return null;           
        }
        for (Node i : map) {              
            if (i.key == key) {
                return (V) i.value;        //явное приведение типов чтобы Object привести к V
            }
        }
        return null;
    }

    public Set<K> getAll() {
        Set<K> returnable = new HashSet<>();
        if (map.isEmpty()) {
            return null;
        }
        for (Node i : map) {
            returnable.add((K) i.key);
        }
        return returnable;
    }

    public boolean remove(K key) {
        if (map.isEmpty()) {
            return false;
        }
        for (Iterator<Node> iterator = map.iterator(); iterator.hasNext();) {         //Тут приходится использовать итератор, потому что если в foreach удалять элемент, то он может кинуть исключение ConcurrentModificationException 
            Node i = iterator.next();
            if (i.key == key) {
                iterator.remove();
                return true;       
            }
        }
        return false;
    }

    public boolean removeAll(V value) {
        if (map.isEmpty()) {
            return false;
        }
        int countRemoves = 0;
        for (Iterator<Node> iterator = map.iterator(); iterator.hasNext();) {   
            Node i = iterator.next();
            if (i.value == value) {
                iterator.remove();
                countRemoves++;       
            }
        }
        if (countRemoves == 0) {
            return false;
        } else return true;
    }

    public int getSize() {
        return map.size();
    }

    public void print() {
        System.out.println(map);
    }
}
