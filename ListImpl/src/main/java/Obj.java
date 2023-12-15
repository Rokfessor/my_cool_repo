public class Obj<K, V> {
    public K key;
    public V value;
    Obj(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K get_key(){
        return key;
    }
    public V get_value(){
        return value;
    }

}
