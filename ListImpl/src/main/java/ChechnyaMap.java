import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ChechnyaMap<K, V> implements IMap<K, V> {

    private int size;

    private ArrayList<Map> elem = new ArrayList<>();



    @Override
    public void add(K key, V value) {
        elem.add(new Map<K, V>(key, value));
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
