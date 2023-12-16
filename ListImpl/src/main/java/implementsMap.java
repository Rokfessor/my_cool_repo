package my_cool_repo.ListImpl.src.main.java;
import java.util.HashSet;
import java.util.Set;
class basePair<K,V>{
    K key;
    V value;
    basePair(K key, V value){
        this.key=key;
        this.value=value;
    }
    public String toString(){
        return "key: "+key+"value: "+value;
    }

}

public class implementsMap<K, V> implements IMap<K, V> {
    Set<basePair> map = new HashSet<>();
    public implementsMap(){



    }


    @Override
    public void add(K key, V value) {
        basePair element = new basePair (key, value);
        map.add(element);

    }

    @Override
    public V get(K key) {

        return null;
    }

    @Override
    public Set<K> getAll() {
        return null;
    }

    @Override
    public boolean remove(K key) {
        return false;
    }

    @Override
    public boolean removeAll(V value) {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
