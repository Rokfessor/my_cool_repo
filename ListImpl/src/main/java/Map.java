import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class Map<K,V> implements IMap<K,V>{
    public ArrayList<Obj<K, V>> list = new ArrayList<>();
    @Override
    public void add(K key, V value){
        Obj<K, V> obj = new Obj<>(key, value);
        list.add(obj);


    }

    @Override
    public V get(K key) {
        V value = null;
        for (int elem = 0; elem < list.size(); elem++){
            if (key == list.get(elem).get_key()) value =list.get(elem).get_value();

        }
        return value;
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
