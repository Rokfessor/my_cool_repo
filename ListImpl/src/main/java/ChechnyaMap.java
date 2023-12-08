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
        for (myMap map : elem) {
            if (map.getKey() == key) {
                return (V) map.getValue();
            }
        }
        return null;
    }

    @Override
    public Set<K> getAll() {
        Set<K> keys = new HashSet<>();
        for (myMap map : elem) {
            keys.add((K) map.getKey());
        }
        return keys;
    }

    @Override
    public boolean remove(K key) {
        if (elem.size() > 0) {
            for (myMap map : elem) {
                if (map.getKey() == key) {
                    elem.remove(elem.indexOf(map));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(V value) {
        if (!elem.isEmpty()) {
            ArrayList<Integer> indexes = new ArrayList<>();
            for (myMap map : elem) {
                if (map.getValue() == value) {
                    indexes.add(elem.indexOf(map));
                }
            }
            for (int index = indexes.size() - 1; index > -1; index--) {
                elem.remove((int) indexes.get(index));
            }
            return true;
        }
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }
}
