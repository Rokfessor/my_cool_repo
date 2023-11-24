import java.util.ArrayList;
import java.util.Set;

public class ChechnyaMap<K, V> implements IMap<K, V> {

    int size;

    ArrayList<K> keyArray = new ArrayList<>();
    ArrayList<V> valueArray = new ArrayList<>();

    @Override
    public void add(K key, V value) {
        keyArray.add(key);
        valueArray.add(value);
        ++size;
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
        return size;
    }
}
