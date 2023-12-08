import java.util.*;

public class ChechnyaMap<K, V> implements IMap<K, V> {

    private int size;

    private ArrayList<myMap> elem = new ArrayList<>();



    @Override
    public void add(K key, V value) {
        for (myMap map : elem) {
            if (map.getKey() == key) {
                elem.remove(elem.indexOf(map));
                break;
            }
        }
        elem.add(new myMap<K, V>(key, value));
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
