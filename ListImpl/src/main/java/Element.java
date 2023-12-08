public class Element<K, V> {
    K key;
    V value;
    Element(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }

    public void setValue(V value){
        this.value = value;
    }
}
