import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Map<K,V> implements IMap<K,V>{
    public ArrayList<Obj<K, V>> list = new ArrayList<>();
    @Override
    public void add(K key, V value){
        K t_key = null;
        for (Obj<K, V> kvObj : list) {
            if (key == kvObj.get_key()) t_key = kvObj.get_key();
        }

        if (t_key == null) {
            Obj<K, V> obj = new Obj<>(key, value);
            list.add(obj);
        }
    }

    @Override
    public V get(K key) {
        V value = null;
        for (Obj<K, V> kvObj : list) {
            if (key == kvObj.get_key()) value = kvObj.get_value();

        }
        return value;
    }

    @Override
    public Set<K> getAll() {
        Set<K> keys = new HashSet<>();

        for (Obj<K, V> kvObj : list) {
            keys.add(kvObj.get_key());
        }
        return keys;
    }

    @Override
    public boolean remove(K key) {
        for (int elem = 0; elem < list.size(); elem++){
            if (key == list.get(elem).get_key()){
                list.remove(elem);
                return true;}
        }
        return false;
    }

    @Override
    public boolean removeAll(V value) {
        boolean remove_bool = false;
        for (int elem = 0; elem < list.size(); elem++){
            if (value == list.get(elem).get_value()){
                list.remove(elem);
                remove_bool = true;
            }
        }
        return remove_bool;
    }

    @Override
    public int getSize() {
        return list.size();
    }
}
